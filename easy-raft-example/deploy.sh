#!/usr/bin/env bash

cd ../raft-java-core && mvn clean install -DskipTests
cd -
mvn clean package

EXAMPLE_TAR=raft-java-example-1.0-SNAPSHOT-deploy.tar.gz
ROOT_DIR=./env
mkdir -p $ROOT_DIR
cd $ROOT_DIR

mkdir raft-node-1
cd raft-node-1
cp -f ../../target/$EXAMPLE_TAR .
tar -zxvf $EXAMPLE_TAR
chmod +x ./bin/*.sh
nohup ./bin/run_server.sh ./data "127.0.0.1:8081:1,127.0.0.1:8082:2,127.0.0.1:8083:3" "127.0.0.1:8081:1" &
cd -

mkdir raft-node-2
cd raft-node-2
cp -f ../../target/$EXAMPLE_TAR .
tar -zxvf $EXAMPLE_TAR
chmod +x ./bin/*.sh
nohup ./bin/run_server.sh ./data "127.0.0.1:8081:1,127.0.0.1:8082:2,127.0.0.1:8083:3" "127.0.0.1:8082:2" &
cd -

mkdir raft-node-3
cd raft-node-3
cp -f ../../target/$EXAMPLE_TAR .
tar -zxvf $EXAMPLE_TAR
chmod +x ./bin/*.sh
nohup ./bin/run_server.sh ./data "127.0.0.1:8081:1,127.0.0.1:8082:2,127.0.0.1:8083:3" "127.0.0.1:8083:3" &
cd -

mkdir client
cd client
cp -f ../../target/$EXAMPLE_TAR .
tar -zxvf $EXAMPLE_TAR
chmod +x ./bin/*.sh
cd -
