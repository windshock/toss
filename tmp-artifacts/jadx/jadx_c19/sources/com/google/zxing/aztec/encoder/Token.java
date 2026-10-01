package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;

/* loaded from: /tmp/toss_alldex/classes19.dex */
abstract class Token {
    static final Token EMPTY = new SimpleToken(null, 0, 0);
    private final Token previous;

    abstract void appendTo(BitArray bitArray, byte[] bArr);

    Token(Token token) {
        this.previous = token;
    }

    final Token getPrevious() {
        return this.previous;
    }

    final Token add(int i2, int i3) {
        return new SimpleToken(this, i2, i3);
    }

    final Token addBinaryShift(int i2, int i3) {
        return new BinaryShiftToken(this, i2, i3);
    }
}
