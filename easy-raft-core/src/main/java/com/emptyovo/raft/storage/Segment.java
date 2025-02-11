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

import com.emptyovo.raft.proto.RaftProto;
import lombok.Getter;

import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Segment {

    public static class Record {

        public long offset;
        public RaftProto.LogEntry entry;
        public Record(long offset, RaftProto.LogEntry entry) {
            this.offset = offset;
            this.entry = entry;
        }
    }

    private boolean canWrite;
    private long startIndex;
    private long endIndex;
    private long fileSize;
    private String fileName;
    private RandomAccessFile randomAccessFile;
    private List<Record> entries = new ArrayList<>();

    public RaftProto.LogEntry getEntry(long index) {
        if (startIndex == 0 || endIndex == 0) {
            return null;
        }
        if (index < startIndex || index > endIndex) {
            return null;
        }
        int indexInList = (int) (index - startIndex);
        return entries.get(indexInList).entry;
    }

    public void setCanWrite(boolean canWrite) {
        this.canWrite = canWrite;
    }

    public void setStartIndex(long startIndex) {
        this.startIndex = startIndex;
    }

    public void setEndIndex(long endIndex) {
        this.endIndex = endIndex;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setRandomAccessFile(RandomAccessFile randomAccessFile) {
        this.randomAccessFile = randomAccessFile;
    }

    public void setEntries(List<Record> entries) {
        this.entries = entries;
    }
}
