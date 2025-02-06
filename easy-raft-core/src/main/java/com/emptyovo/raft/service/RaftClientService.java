package com.emptyovo.raft.service;

import com.emptyovo.raft.proto.RaftProto;

/**
 * raft cluster management api
 * Created by wenweihu86 on 2017/5/14.
 */
public interface RaftClientService {

    /**
     * get leader info
     * @param request request
     * @return leader info
     */
    RaftProto.GetLeaderResponse getLeader(RaftProto.GetLeaderRequest request);

    /**
     * get raft cluster configuration
     * @param request 请求
     * @return raft集群各节点地址，以及主从关系。
     */
    RaftProto.GetConfigurationResponse getConfiguration(RaftProto.GetConfigurationRequest request);

    /**
     * add peers to raft cluster
     * @param request request
     * @return success or not
     */
    RaftProto.AddPeersResponse addPeers(RaftProto.AddPeersRequest request);

    /**
     * delete peers from raft cluster
     * @param request request
     * @return success or not
     */
    RaftProto.RemovePeersResponse removePeers(RaftProto.RemovePeersRequest request);
}
