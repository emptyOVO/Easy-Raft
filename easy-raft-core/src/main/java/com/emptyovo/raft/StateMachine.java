package com.emptyovo.raft;

/**
 * Raft State machine interface class
 */
public interface StateMachine {

    /**
     * snapshot the data in the state machine and call it locally and periodically for each node
     * @param snapshotDir snapshot data output directory
     */
    void writeSnapshot(String snapshotDir);

    /**
     * Read snapshot to state machine, called when node starts
     * @param snapshotDir snapshot data directory
     */
    void readSnapshot(String snapshotDir);

    /**
     * Apply data to the state machine
     * @param dataBytes binary data
     */
    void apply(byte[] dataBytes);
}
