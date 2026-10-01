package com.google.android.exoplayer2.extractor;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ConstantBitrateSeekMap implements SeekMap {
    private final boolean allowSeeksIfLengthUnknown;
    private final int bitrate;
    private final long dataSize;
    private final long durationUs;
    private final long firstFrameBytePosition;
    private final int frameSize;
    private final long inputLength;

    public ConstantBitrateSeekMap(long j, long j2, int i2, int i3) {
        this(j, j2, i2, i3, false);
    }

    public ConstantBitrateSeekMap(long j, long j2, int i2, int i3, boolean z) {
        this.inputLength = j;
        this.firstFrameBytePosition = j2;
        this.frameSize = i3 == -1 ? 1 : i3;
        this.bitrate = i2;
        this.allowSeeksIfLengthUnknown = z;
        if (j == -1) {
            this.dataSize = -1L;
            this.durationUs = -9223372036854775807L;
        } else {
            this.dataSize = j - j2;
            this.durationUs = getTimeUsAtPosition(j, j2, i2);
        }
    }

    public boolean isSeekable() {
        return this.dataSize != -1 || this.allowSeeksIfLengthUnknown;
    }

    public SeekMap$SeekPoints getSeekPoints(long j) {
        if (this.dataSize == -1 && !this.allowSeeksIfLengthUnknown) {
            return new SeekMap$SeekPoints(new SeekPoint(0L, this.firstFrameBytePosition));
        }
        long framePositionForTimeUs = getFramePositionForTimeUs(j);
        long timeUsAtPosition = getTimeUsAtPosition(framePositionForTimeUs);
        SeekPoint seekPoint = new SeekPoint(timeUsAtPosition, framePositionForTimeUs);
        if (this.dataSize != -1 && timeUsAtPosition < j) {
            long j2 = this.frameSize + framePositionForTimeUs;
            if (j2 < this.inputLength) {
                return new SeekMap$SeekPoints(seekPoint, new SeekPoint(getTimeUsAtPosition(j2), j2));
            }
        }
        return new SeekMap$SeekPoints(seekPoint);
    }

    public long getDurationUs() {
        return this.durationUs;
    }

    public long getTimeUsAtPosition(long j) {
        return getTimeUsAtPosition(j, this.firstFrameBytePosition, this.bitrate);
    }

    private static long getTimeUsAtPosition(long j, long j2, int i2) {
        return (Math.max(0L, j - j2) * 8000000) / i2;
    }

    private long getFramePositionForTimeUs(long j) {
        long j2 = this.frameSize;
        long jMin = (((j * this.bitrate) / 8000000) / j2) * j2;
        long j3 = this.dataSize;
        if (j3 != -1) {
            jMin = Math.min(jMin, j3 - j2);
        }
        return this.firstFrameBytePosition + Math.max(jMin, 0L);
    }
}
