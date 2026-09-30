package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class BinaryShiftToken extends Token {
    private final int binaryShiftByteCount;
    private final int binaryShiftStart;

    BinaryShiftToken(Token token, int i2, int i3) {
        super(token);
        this.binaryShiftStart = i2;
        this.binaryShiftByteCount = i3;
    }

    @Override // com.google.zxing.aztec.encoder.Token
    public void appendTo(BitArray bitArray, byte[] bArr) {
        int i2 = this.binaryShiftByteCount;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 == 0 || (i3 == 31 && i2 <= 62)) {
                bitArray.appendBits(31, 5);
                if (i2 > 62) {
                    bitArray.appendBits(i2 - 31, 16);
                } else if (i3 == 0) {
                    bitArray.appendBits(Math.min(i2, 31), 5);
                } else {
                    bitArray.appendBits(i2 - 31, 5);
                }
            }
            bitArray.appendBits(bArr[this.binaryShiftStart + i3], 8);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(this.binaryShiftStart);
        sb.append("::");
        sb.append((this.binaryShiftStart + this.binaryShiftByteCount) - 1);
        sb.append('>');
        return sb.toString();
    }
}
