package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class IndexSeekMap implements SeekMap {
    private final long durationUs;
    private final boolean isSeekable;
    private final long[] positions;
    private final long[] timesUs;

    public IndexSeekMap(long[] jArr, long[] jArr2, long j) {
        Assertions.checkArgument(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.isSeekable = z;
        if (z && jArr2[0] > 0) {
            int i2 = length + 1;
            long[] jArr3 = new long[i2];
            this.positions = jArr3;
            long[] jArr4 = new long[i2];
            this.timesUs = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.positions = jArr;
            this.timesUs = jArr2;
        }
        this.durationUs = j;
    }

    public boolean isSeekable() {
        return this.isSeekable;
    }

    public long getDurationUs() {
        return this.durationUs;
    }

    public SeekMap$SeekPoints getSeekPoints(long j) {
        if (!this.isSeekable) {
            return new SeekMap$SeekPoints(SeekPoint.START);
        }
        int iBinarySearchFloor = Util.binarySearchFloor(this.timesUs, j, true, true);
        SeekPoint seekPoint = new SeekPoint(this.timesUs[iBinarySearchFloor], this.positions[iBinarySearchFloor]);
        if (seekPoint.timeUs != j) {
            long[] jArr = this.timesUs;
            if (iBinarySearchFloor != jArr.length - 1) {
                int i2 = iBinarySearchFloor + 1;
                return new SeekMap$SeekPoints(seekPoint, new SeekPoint(jArr[i2], this.positions[i2]));
            }
        }
        return new SeekMap$SeekPoints(seekPoint);
    }
}
