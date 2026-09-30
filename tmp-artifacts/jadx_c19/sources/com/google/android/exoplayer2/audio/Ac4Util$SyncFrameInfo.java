package com.google.android.exoplayer2.audio;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class Ac4Util$SyncFrameInfo {
    public final int bitstreamVersion;
    public final int channelCount;
    public final int frameSize;
    public final int sampleCount;
    public final int sampleRate;

    private Ac4Util$SyncFrameInfo(int i2, int i3, int i4, int i5, int i6) {
        this.bitstreamVersion = i2;
        this.channelCount = i3;
        this.sampleRate = i4;
        this.frameSize = i5;
        this.sampleCount = i6;
    }
}
