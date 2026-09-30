package com.google.android.gms.common.moduleinstall;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ModuleInstallStatusUpdate$ProgressInfo {
    private final long zaa;
    private final long zab;

    ModuleInstallStatusUpdate$ProgressInfo(long j, long j2) {
        Preconditions.checkNotZero(j2);
        this.zaa = j;
        this.zab = j2;
    }

    public long getBytesDownloaded() {
        return this.zaa;
    }

    public long getTotalBytesToDownload() {
        return this.zab;
    }
}
