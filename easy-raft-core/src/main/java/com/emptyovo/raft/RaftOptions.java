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

package com.emptyovo.raft;

import lombok.Getter;
import lombok.Setter;

/**
 * raft config options
 */
@Setter
@Getter
public class RaftOptions {

    // A follower would become a candidate if it doesn't receive any message
    // from the leader in electionTimeoutMs milliseconds
    private int electionTimeoutMilliseconds = 5000;

    // A leader sends RPCs at least this often, even if there is no data to send
    private int heartbeatPeriodMilliseconds = 500;

    // snapshot timer execution interval
    private int snapshotPeriodSeconds = 3600;
    // The snapshot is created only when the log entry size reaches the snapshotMinLogSize
    private int snapshotMinLogSize = 100 * 1024 * 1024;
    private int maxSnapshotBytesPerRequest = 500 * 1024; // 500k

    private int maxLogEntriesPerRequest = 5000;

    // The file size of a single segment is 100 MB by default
    private int maxSegmentFileSize = 100 * 1000 * 1000;

    // When the gap between followers and leaders reaches catchupMargin,
    // they can participate in elections and provide services
    private long catchupMargin = 500;

    // replicate the maximum waiting timeout period, in ms
    private long maxAwaitTimeout = 1000;

    // Size of the thread pool that performs operations such as synchronization
    // and master selection with other nodes
    private int raftConsensusThreadNum = 20;

    // Whether to write data asynchronously; true:
    // The primary node returns after saving and synchronizes data asynchronously to the secondary node.
    // false indicates that the primary node is synchronized to most secondary nodes before returning.
    private boolean asyncWrite = false;

    // log and snapshot parent directory of raft, absolute path
    private String dataDir = System.getProperty("com.emptyovo.raft.data.dir");
}
