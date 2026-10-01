package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SimpleToken extends Token {
    private final short bitCount;
    private final short value;

    SimpleToken(Token token, int i2, int i3) {
        super(token);
        this.value = (short) i2;
        this.bitCount = (short) i3;
    }

    @Override // com.google.zxing.aztec.encoder.Token
    void appendTo(BitArray bitArray, byte[] bArr) {
        bitArray.appendBits(this.value, this.bitCount);
    }

    public String toString() {
        short s = this.value;
        short s2 = this.bitCount;
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        int i2 = 1 << s2;
        sb.append(Integer.toBinaryString((s & (i2 - 1)) | i2 | (1 << this.bitCount)).substring(1));
        sb.append('>');
        return sb.toString();
    }
}
