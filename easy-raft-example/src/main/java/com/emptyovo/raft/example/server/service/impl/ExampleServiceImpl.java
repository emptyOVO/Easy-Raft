/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.emptyovo.raft.example.server.service.impl;

import com.baidu.brpc.client.BrpcProxy;
import com.baidu.brpc.client.RpcClient;
import com.baidu.brpc.client.RpcClientOptions;
import com.baidu.brpc.client.instance.Endpoint;
import com.emptyovo.raft.Peer;
import com.emptyovo.raft.RaftNode;
import com.emptyovo.raft.example.server.ExampleStateMachine;
import com.emptyovo.raft.example.server.service.ExampleProto;
import com.emptyovo.raft.example.server.service.ExampleService;
import com.emptyovo.raft.proto.RaftProto;
import com.googlecode.protobuf.format.JsonFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExampleServiceImpl implements ExampleService {

    private static final Logger LOG = LoggerFactory.getLogger(ExampleServiceImpl.class);
    private static JsonFormat jsonFormat = new JsonFormat();

    private RaftNode raftNode;
    private ExampleStateMachine stateMachine;
    private int leaderId = -1;
    private RpcClient leaderRpcClient = null;
    private Lock leaderLock = new ReentrantLock();

    public ExampleServiceImpl(RaftNode raftNode, ExampleStateMachine stateMachine) {
        this.raftNode = raftNode;
        this.stateMachine = stateMachine;
    }

    private void onLeaderChangeEvent() {
        if (raftNode.getLeaderId() != -1
                && raftNode.getLeaderId() != raftNode.getLocalServer().getServerId()
                && leaderId != raftNode.getLeaderId()) {
            leaderLock.lock();
            if (leaderId != -1 && leaderRpcClient != null) {
                leaderRpcClient.stop();
                leaderRpcClient = null;
                leaderId = -1;
            }
            leaderId = raftNode.getLeaderId();
            Peer peer = raftNode.getPeerMap().get(leaderId);
            Endpoint endpoint = new Endpoint(peer.getServer().getEndpoint().getHost(),
                    peer.getServer().getEndpoint().getPort());
            RpcClientOptions rpcClientOptions = new RpcClientOptions();
            rpcClientOptions.setGlobalThreadPoolSharing(true);
            leaderRpcClient = new RpcClient(endpoint, rpcClientOptions);
            leaderLock.unlock();
        }
    }

    @Override
    public ExampleProto.SetResponse set(ExampleProto.SetRequest request) {
        ExampleProto.SetResponse.Builder responseBuilder = ExampleProto.SetResponse.newBuilder();
        // If not the leader, forward the write request to the leader
        if (raftNode.getLeaderId() <= 0) {
            responseBuilder.setSuccess(false);
        } else if (raftNode.getLeaderId() != raftNode.getLocalServer().getServerId()) {
            onLeaderChangeEvent();
            ExampleService exampleService = BrpcProxy.getProxy(leaderRpcClient, ExampleService.class);
            ExampleProto.SetResponse responseFromLeader = exampleService.set(request);
            responseBuilder.mergeFrom(responseFromLeader);
        } else {
            // Data is synchronized to the raft cluster
            byte[] data = request.toByteArray();
            boolean success = raftNode.replicate(data, RaftProto.EntryType.ENTRY_TYPE_DATA);
            responseBuilder.setSuccess(success);
        }

        ExampleProto.SetResponse response = responseBuilder.build();
        LOG.info("set request, request={}, response={}", jsonFormat.printToString(request),
                jsonFormat.printToString(response));
        return response;
    }

    @Override
    public ExampleProto.GetResponse get(ExampleProto.GetRequest request) {
        ExampleProto.GetResponse response = stateMachine.get(request);
        LOG.info("get request, request={}, response={}", jsonFormat.printToString(request),
                jsonFormat.printToString(response));
        return response;
    }

}
