package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class Ac3Util$SyncFrameInfo {
    public static final int STREAM_TYPE_TYPE0 = 0;
    public static final int STREAM_TYPE_TYPE1 = 1;
    public static final int STREAM_TYPE_TYPE2 = 2;
    public static final int STREAM_TYPE_UNDEFINED = -1;
    public final int channelCount;
    public final int frameSize;
    public final String mimeType;
    public final int sampleCount;
    public final int sampleRate;
    public final int streamType;

    private Ac3Util$SyncFrameInfo(@Nullable String str, int i2, int i3, int i4, int i5, int i6) {
        this.mimeType = str;
        this.streamType = i2;
        this.channelCount = i3;
        this.sampleRate = i4;
        this.frameSize = i5;
        this.sampleCount = i6;
    }
}
