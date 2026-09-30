package com.google.android.exoplayer2.extractor.mp4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class FragmentedMp4Extractor$MetadataSampleInfo {
    public final boolean sampleTimeIsRelative;
    public final long sampleTimeUs;
    public final int size;

    public FragmentedMp4Extractor$MetadataSampleInfo(long j, boolean z, int i2) {
        this.sampleTimeUs = j;
        this.sampleTimeIsRelative = z;
        this.size = i2;
    }
}
