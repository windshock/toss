package com.google.android.exoplayer2.metadata.scte35;

import com.google.android.exoplayer2.metadata.Metadata;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class SpliceCommand implements Metadata.Entry {
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "SCTE-35 splice command: type=" + getClass().getSimpleName();
    }
}
