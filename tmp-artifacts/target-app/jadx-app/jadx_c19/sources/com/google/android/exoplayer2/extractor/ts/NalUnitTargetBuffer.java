package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.util.Assertions;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class NalUnitTargetBuffer {
    private boolean isCompleted;
    private boolean isFilling;
    public byte[] nalData;
    public int nalLength;
    private final int targetType;

    public NalUnitTargetBuffer(int i2, int i3) {
        this.targetType = i2;
        byte[] bArr = new byte[i3 + 3];
        this.nalData = bArr;
        bArr[2] = 1;
    }

    public void reset() {
        this.isFilling = false;
        this.isCompleted = false;
    }

    public boolean isCompleted() {
        return this.isCompleted;
    }

    public void startNalUnit(int i2) {
        Assertions.checkState(!this.isFilling);
        boolean z = i2 == this.targetType;
        this.isFilling = z;
        if (z) {
            this.nalLength = 3;
            this.isCompleted = false;
        }
    }

    public void appendToNalUnit(byte[] bArr, int i2, int i3) {
        if (this.isFilling) {
            int i4 = i3 - i2;
            byte[] bArr2 = this.nalData;
            int length = bArr2.length;
            int i5 = this.nalLength + i4;
            if (length < i5) {
                this.nalData = Arrays.copyOf(bArr2, i5 << 1);
            }
            System.arraycopy(bArr, i2, this.nalData, this.nalLength, i4);
            this.nalLength += i4;
        }
    }

    public boolean endNalUnit(int i2) {
        if (!this.isFilling) {
            return false;
        }
        this.nalLength -= i2;
        this.isFilling = false;
        this.isCompleted = true;
        return true;
    }
}
