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

package com.emptyovo.raft.example.client;

import com.baidu.brpc.client.BrpcProxy;
import com.baidu.brpc.client.RpcClient;
import com.emptyovo.raft.example.server.service.ExampleProto;
import com.emptyovo.raft.example.server.service.ExampleService;
import com.googlecode.protobuf.format.JsonFormat;

public class ClientMain {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.printf("Usage: ./run_client.sh CLUSTER KEY [VALUE]\n");
            System.exit(-1);
        }

        // parse args
        String ipPorts = args[0];
        String key = args[1];
        String value = null;
        if (args.length > 2) {
            value = args[2];
        }

        // init rpc client
        RpcClient rpcClient = new RpcClient(ipPorts);
        ExampleService exampleService = BrpcProxy.getProxy(rpcClient, ExampleService.class);
        final JsonFormat jsonFormat = new JsonFormat();

        // set
        if (value != null) {
            ExampleProto.SetRequest setRequest = ExampleProto.SetRequest.newBuilder()
                    .setKey(key).setValue(value).build();
            ExampleProto.SetResponse setResponse = exampleService.set(setRequest);
            System.out.printf("set request, key=%s value=%s response=%s\n",
                    key, value, jsonFormat.printToString(setResponse));
        } else {
            // get
            ExampleProto.GetRequest getRequest = ExampleProto.GetRequest.newBuilder()
                    .setKey(key).build();
            ExampleProto.GetResponse getResponse = exampleService.get(getRequest);
            System.out.printf("get request, key=%s, response=%s\n",
                    key, jsonFormat.printToString(getResponse));
        }

        rpcClient.stop();
    }
}
