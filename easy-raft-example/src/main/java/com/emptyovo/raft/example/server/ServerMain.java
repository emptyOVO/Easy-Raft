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

package com.emptyovo.raft.example.server;

import com.baidu.brpc.server.RpcServer;
import com.emptyovo.raft.RaftNode;
import com.emptyovo.raft.RaftOptions;
import com.emptyovo.raft.example.server.service.ExampleService;
import com.emptyovo.raft.example.server.service.impl.ExampleServiceImpl;
import com.emptyovo.raft.proto.RaftProto;
import com.emptyovo.raft.service.RaftClientService;
import com.emptyovo.raft.service.RaftConsensusService;
import com.emptyovo.raft.service.impl.RaftClientServiceImpl;
import com.emptyovo.raft.service.impl.RaftConsensusServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class ServerMain {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.printf("Usage: ./run_server.sh DATA_PATH CLUSTER CURRENT_NODE\n");
            System.exit(-1);
        }
        // parse args
        // raft data dir
        String dataPath = args[0];
        // peers, format is "host:port:serverId,host2:port2:serverId2"
        String servers = args[1];
        String[] splitArray = servers.split(",");
        List<RaftProto.Server> serverList = new ArrayList<>();
        for (String serverString : splitArray) {
            RaftProto.Server server = parseServer(serverString);
            serverList.add(server);
        }
        // local server
        RaftProto.Server localServer = parseServer(args[2]);

        // example initialize the RPCServer
        RpcServer server = new RpcServer(localServer.getEndpoint().getPort());
        // set Raft options
        // just for test snapshot
        RaftOptions raftOptions = new RaftOptions();
        raftOptions.setDataDir(dataPath);
        raftOptions.setSnapshotMinLogSize(10 * 1024);
        raftOptions.setSnapshotPeriodSeconds(30);
        raftOptions.setMaxSegmentFileSize(1024 * 1024);
        // state machine
        ExampleStateMachine stateMachine = new ExampleStateMachine(raftOptions.getDataDir());
        // initialize RaftNode
        RaftNode raftNode = new RaftNode(raftOptions, serverList, localServer, stateMachine);
        // register services that Raft nodes call to each other
        RaftConsensusService raftConsensusService = new RaftConsensusServiceImpl(raftNode);
        server.registerService(raftConsensusService);
        // register the Raft service called by the Client
        RaftClientService raftClientService = new RaftClientServiceImpl(raftNode);
        server.registerService(raftClientService);
        // sign up for the app's own services
        ExampleService exampleService = new ExampleServiceImpl(raftNode, stateMachine);
        server.registerService(exampleService);
        // start the RPCServer and initialize the Raft node
        server.start();
        raftNode.init();
    }

    private static RaftProto.Server parseServer(String serverString) {
        String[] splitServer = serverString.split(":");
        String host = splitServer[0];
        Integer port = Integer.parseInt(splitServer[1]);
        Integer serverId = Integer.parseInt(splitServer[2]);
        RaftProto.Endpoint endPoint = RaftProto.Endpoint.newBuilder()
                .setHost(host).setPort(port).build();
        RaftProto.Server.Builder serverBuilder = RaftProto.Server.newBuilder();
        RaftProto.Server server = serverBuilder.setServerId(serverId).setEndpoint(endPoint).build();
        return server;
    }
}
