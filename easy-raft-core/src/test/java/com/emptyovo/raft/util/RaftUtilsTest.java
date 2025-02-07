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

package com.emptyovo.raft.util;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class RaftUtilsTest {

    @Test
    public void testGetSortedFilesInDirectory() throws IOException {
        File queue0 = new File("./data/message/example-topic/0");
        queue0.mkdirs();
        File segmentLog00 = new File("./data/message/example-topic/0/segment0");
        segmentLog00.createNewFile();
        File segmentLog01 = new File("./data/message/example-topic/0/segment1");
        segmentLog01.createNewFile();

        File queue1 = new File("./data/message/example-topic/1");
        queue1.mkdirs();
        File segmentLog12 = new File("./data/message/example-topic/1/segment2");
        segmentLog12.createNewFile();
        File segmentLog13 = new File("./data/message/example-topic/1/segment3");
        segmentLog13.createNewFile();

        List<String> files = RaftFileUtils.getSortedFilesInDirectory(
                "./data/message", "./data/message");
        System.out.println(files);
        Assert.assertTrue(files.size() == 4);
        Assert.assertTrue(files.contains("example-topic/0/segment0"));

        File dataDir = new File("./data");
        FileUtils.deleteDirectory(dataDir);
    }
}
