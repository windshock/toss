package com.google.android.exoplayer2.extractor.wav;

import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekMap$SeekPoints;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Util;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class WavSeekMap implements SeekMap {
    private final long blockCount;
    private final long durationUs;
    private final long firstBlockPosition;
    private final int framesPerBlock;
    private final WavFormat wavFormat;

    public boolean isSeekable() {
        return true;
    }

    public WavSeekMap(WavFormat wavFormat, int i2, long j, long j2) {
        this.wavFormat = wavFormat;
        this.framesPerBlock = i2;
        this.firstBlockPosition = j;
        long j3 = (j2 - j) / wavFormat.blockSize;
        this.blockCount = j3;
        this.durationUs = blockIndexToTimeUs(j3);
    }

    public long getDurationUs() {
        return this.durationUs;
    }

    public SeekMap$SeekPoints getSeekPoints(long j) {
        long jConstrainValue = Util.constrainValue((this.wavFormat.frameRateHz * j) / (this.framesPerBlock * 1000000), 0L, this.blockCount - 1);
        long j2 = this.firstBlockPosition;
        long j3 = this.wavFormat.blockSize;
        long jBlockIndexToTimeUs = blockIndexToTimeUs(jConstrainValue);
        SeekPoint seekPoint = new SeekPoint(jBlockIndexToTimeUs, j2 + (j3 * jConstrainValue));
        if (jBlockIndexToTimeUs >= j || jConstrainValue == this.blockCount - 1) {
            return new SeekMap$SeekPoints(seekPoint);
        }
        long j4 = jConstrainValue + 1;
        return new SeekMap$SeekPoints(seekPoint, new SeekPoint(blockIndexToTimeUs(j4), this.firstBlockPosition + (this.wavFormat.blockSize * j4)));
    }

    private long blockIndexToTimeUs(long j) {
        return Util.scaleLargeTimestamp(j * this.framesPerBlock, 1000000L, this.wavFormat.frameRateHz);
    }
}
