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

package com.emptyovo.raft.example;

import com.emptyovo.raft.proto.RaftProto;
import com.googlecode.protobuf.format.JsonFormat;
import org.apache.commons.lang3.Validate;

import java.util.ArrayList;
import java.util.List;

/**
 * Example
 */
public class AdminMain {

    private static final JsonFormat jsonFormat = new JsonFormat();

    public static void main(String[] args) {
        // parse args
        if (args.length < 3) {
            System.out.println("java -jar AdminMain servers cmd subCmd [args]");
            System.exit(1);
        }
        // servers format is like "10.1.1.1:8010:1,10.2.2.2:8011:2,10.3.3.3.3:8012:3"
        String servers = args[0];
        String cmd = args[1];
        String subCmd = args[2];
        Validate.isTrue(cmd.equals("conf"));
        Validate.isTrue(subCmd.equals("get")
                || subCmd.equals("add")
                || subCmd.equals("del"));
        RaftClientServiceProxy client = new RaftClientServiceProxy(servers);
        if (subCmd.equals("get")) {
            RaftProto.GetConfigurationRequest request = RaftProto.GetConfigurationRequest.newBuilder().build();
            RaftProto.GetConfigurationResponse response = client.getConfiguration(request);
            if (response != null) {
                System.out.println(jsonFormat.printToString(response));
            } else {
                System.out.print("response == null");
            }

        } else if (subCmd.equals("add")) {
            List<RaftProto.Server> serverList = parseServers(args[3]);
            RaftProto.AddPeersRequest request = RaftProto.AddPeersRequest.newBuilder()
                    .addAllServers(serverList).build();
            RaftProto.AddPeersResponse response = client.addPeers(request);
            if (response != null) {
                System.out.println(response.getResCode());
            } else {
                System.out.print("response == null");
            }
        } else {
            List<RaftProto.Server> serverList = parseServers(args[3]);
            RaftProto.RemovePeersRequest request = RaftProto.RemovePeersRequest.newBuilder()
                    .addAllServers(serverList).build();
            RaftProto.RemovePeersResponse response = client.removePeers(request);
            if (response != null) {
                System.out.println(response.getResCode());
            } else {
                System.out.print("response == null");
            }
        }
        client.stop();
    }

    public static List<RaftProto.Server> parseServers(String serversString) {
        List<RaftProto.Server> serverList = new ArrayList<>();
        String[] splitArray1 = serversString.split(",");
        for (String addr : splitArray1) {
            String[] splitArray2 = addr.split(":");
            RaftProto.Endpoint endPoint = RaftProto.Endpoint.newBuilder()
                    .setHost(splitArray2[0])
                    .setPort(Integer.parseInt(splitArray2[1])).build();
            RaftProto.Server server = RaftProto.Server.newBuilder()
                    .setEndpoint(endPoint)
                    .setServerId(Integer.parseInt(splitArray2[2])).build();
            serverList.add(server);
        }
        return serverList;
    }
}
