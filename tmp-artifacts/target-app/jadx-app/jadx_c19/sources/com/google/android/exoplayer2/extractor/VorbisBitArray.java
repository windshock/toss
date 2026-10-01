package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.google.android.exoplayer2.util.Assertions;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class VorbisBitArray {
    private int bitOffset;
    private final int byteLimit;
    private int byteOffset;
    private final byte[] data;

    public VorbisBitArray(byte[] bArr) {
        this.data = bArr;
        this.byteLimit = bArr.length;
    }

    public void reset() {
        this.byteOffset = 0;
        this.bitOffset = 0;
    }

    public boolean readBit() {
        boolean z = (((this.data[this.byteOffset] & 255) >> this.bitOffset) & 1) == 1;
        skipBits(1);
        return z;
    }

    public int readBits(int i2) {
        int i3 = this.byteOffset;
        int iMin = Math.min(i2, 8 - this.bitOffset);
        int i4 = i3 + 1;
        int i5 = ((this.data[i3] & 255) >> this.bitOffset) & (OggPageHeader.MAX_SEGMENT_COUNT >> (8 - iMin));
        while (iMin < i2) {
            i5 |= (this.data[i4] & 255) << iMin;
            iMin += 8;
            i4++;
        }
        skipBits(i2);
        return ((-1) >>> (32 - i2)) & i5;
    }

    public void skipBits(int i2) {
        int i3 = i2 / 8;
        int i4 = this.byteOffset + i3;
        this.byteOffset = i4;
        int i5 = this.bitOffset + (i2 - (i3 << 3));
        this.bitOffset = i5;
        if (i5 > 7) {
            this.byteOffset = i4 + 1;
            this.bitOffset = i5 - 8;
        }
        assertValidOffset();
    }

    public int getPosition() {
        return (this.byteOffset << 3) + this.bitOffset;
    }

    public void setPosition(int i2) {
        int i3 = i2 / 8;
        this.byteOffset = i3;
        this.bitOffset = i2 - (i3 << 3);
        assertValidOffset();
    }

    public int bitsLeft() {
        return ((this.byteLimit - this.byteOffset) << 3) - this.bitOffset;
    }

    private void assertValidOffset() {
        int i2;
        int i3 = this.byteOffset;
        Assertions.checkState(i3 >= 0 && (i3 < (i2 = this.byteLimit) || (i3 == i2 && this.bitOffset == 0)));
    }
}
