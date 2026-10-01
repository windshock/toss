package com.google.android.exoplayer2.drm;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class DefaultDrmSession$RequestTask {
    public final boolean allowRetry;
    public int errorCount;
    public final Object request;
    public final long startTimeMs;
    public final long taskId;

    public DefaultDrmSession$RequestTask(long j, boolean z, long j2, Object obj) {
        this.taskId = j;
        this.allowRetry = z;
        this.startTimeMs = j2;
        this.request = obj;
    }
}
