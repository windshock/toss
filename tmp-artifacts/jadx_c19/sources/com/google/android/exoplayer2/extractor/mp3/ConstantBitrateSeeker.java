package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.audio.MpegAudioUtil$Header;
import com.google.android.exoplayer2.extractor.ConstantBitrateSeekMap;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ConstantBitrateSeeker extends ConstantBitrateSeekMap implements Seeker {
    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return -1L;
    }

    public ConstantBitrateSeeker(long j, long j2, MpegAudioUtil$Header mpegAudioUtil$Header, boolean z) {
        super(j, j2, mpegAudioUtil$Header.bitrate, mpegAudioUtil$Header.frameSize, z);
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getTimeUs(long j) {
        return getTimeUsAtPosition(j);
    }
}
