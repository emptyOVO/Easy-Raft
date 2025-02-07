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

package com.emptyovo.raft.storage;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeMap;

public class SnapshotTest {

    @Test
    public void testReadSnapshotDataFiles() throws IOException {
        String raftDataDir = "./data";
        File file = new File("./data/message");
        file.mkdirs();
        File file1 = new File("./data/message/queue1.txt");
        file1.createNewFile();
        File file2 = new File("./data/message/queue2.txt");
        file2.createNewFile();

        File snapshotFile = new File("./data/snapshot");
        snapshotFile.mkdirs();
        Path link = FileSystems.getDefault().getPath("./data/snapshot/data");
        Path target = FileSystems.getDefault().getPath("./data/message").toRealPath();
        Files.createSymbolicLink(link, target);

        Snapshot snapshot = new Snapshot(raftDataDir);
        TreeMap<String, Snapshot.SnapshotDataFile> snapshotFileMap = snapshot.openSnapshotDataFiles();
        System.out.println(snapshotFileMap.keySet());
        Assert.assertTrue(snapshotFileMap.size() == 2);
        Assert.assertTrue(snapshotFileMap.firstKey().equals("queue1.txt"));

        Files.delete(link);
        FileUtils.deleteDirectory(new File(raftDataDir));
    }
}
