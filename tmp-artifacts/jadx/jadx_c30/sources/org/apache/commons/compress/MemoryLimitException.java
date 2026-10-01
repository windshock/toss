package org.apache.commons.compress;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class MemoryLimitException extends IOException {
    private static final long serialVersionUID = 1;
    private final int memoryLimitInKb;
    private final long memoryNeededInKb;

    private static String onWarmupCompleted(long j, int i) {
        return j + " kb of memory would be needed; limit was " + i + " kb. If the file is not corrupt, consider increasing the memory limit.";
    }

    public MemoryLimitException(long j, int i) {
        super(onWarmupCompleted(j, i));
        this.memoryNeededInKb = j;
        this.memoryLimitInKb = i;
    }
}
