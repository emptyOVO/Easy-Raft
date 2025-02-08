# Easy-Raft
A Java library based on the Raft algorithm that simplifies the complexity of building Raft clusters for users, making it easy to integrate and use for distributed consistency management

## Features
- Leader election
- Log replication
- Snapshot
- Dynamic changes in cluster members

## Quick Start
Deploy a 3-instance raft cluster on a local single machine by executing the following script:
```shell
cd raft-java-example && sh deploy.sh
```
This script will deploy three instances raft-node-1, raft-node-2, and raft-node-3 in the raft-java-example/env directory
It will also create a client directory for testing raft cluster read and write functions
After successful deployment, test write operations by executing the following script:
```shell
cd env/client
./bin/run_client.sh "list://127.0.0.1:8051,127.0.0.1:8052,127.0.0.1:8053" hello world
```
Test read operations by executing the following script:
```shell
./bin/run_client.sh "list://127.0.0.1:8051,127.0.0.1:8052,127.0.0.1:8053" hello
```

## Usage
The following describes how to use the raft-java dependency library to implement a distributed storage system in the code.

### Configure Dependency (Not yet published to the Maven Central Repository, need to be manually installed locally)
```xml
<dependency>
    <groupId>com.emptyovo</groupId>
    <artifactId>easy-raft-core</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

### Define data write and read interfaces
```protobuf
message SetRequest {
    string key = 1;
    string value = 2;
}
message SetResponse {
    bool success = 1;
}
message GetRequest {
    string key = 1;
}
message GetResponse {
    string value = 1;
}
public interface ExampleService {
    Example.SetResponse set(Example.SetRequest request);
    Example.GetResponse get(Example.GetRequest request);
}
```

### Server-side usage
1. Implement the StateMachine interface implementation class
```java
// The three methods of this interface are mainly called by Raft internally
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
     * @param dataBytes data binary
     */
    void apply(byte[] dataBytes);
}
```

2. Implement data write and read interfaces
```java
// implementation class needs to contain the following members
private RaftNode raftNode;
private ExampleStateMachine stateMachine;
```

```java
// Main logic of data writing
byte[] data = request.toByteArray();
// Synchronize data to raft cluster
boolean success = raftNode.replicate(data, Raft.EntryType.ENTRY_TYPE_DATA);
Example.SetResponse response = Example.SetResponse.newBuilder().setSuccess(success).build();
```