package com.google.zxing.aztec.encoder;

import com.google.android.exoplayer2.source.rtsp.RtpPacket;
import com.google.zxing.common.BitArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class State {
    static final State INITIAL_STATE = new State(Token.EMPTY, 0, 0, 0);
    private final int binaryShiftByteCount;
    private final int binaryShiftCost;
    private final int bitCount;
    private final int mode;
    private final Token token;

    private static int calculateBinaryShiftCost(int i2) {
        if (i2 > 62) {
            return 21;
        }
        if (i2 > 31) {
            return 20;
        }
        return i2 > 0 ? 10 : 0;
    }

    private State(Token token, int i2, int i3, int i4) {
        this.token = token;
        this.mode = i2;
        this.binaryShiftByteCount = i3;
        this.bitCount = i4;
        this.binaryShiftCost = calculateBinaryShiftCost(i3);
    }

    int getMode() {
        return this.mode;
    }

    Token getToken() {
        return this.token;
    }

    int getBinaryShiftByteCount() {
        return this.binaryShiftByteCount;
    }

    int getBitCount() {
        return this.bitCount;
    }

    State appendFLGn(int i2) {
        Token tokenAdd;
        Token token = shiftAndAppend(4, 0).token;
        int length = 3;
        if (i2 < 0) {
            tokenAdd = token.add(0, 3);
        } else {
            if (i2 > 999999) {
                throw new IllegalArgumentException("ECI code must be between 0 and 999999");
            }
            byte[] bytes = Integer.toString(i2).getBytes(StandardCharsets.ISO_8859_1);
            Token tokenAdd2 = token.add(bytes.length, 3);
            for (byte b : bytes) {
                tokenAdd2 = tokenAdd2.add(b - 46, 4);
            }
            length = 3 + (bytes.length << 2);
            tokenAdd = tokenAdd2;
        }
        return new State(tokenAdd, this.mode, 0, this.bitCount + length);
    }

    State latchAndAppend(int i2, int i3) {
        int i4 = this.bitCount;
        Token tokenAdd = this.token;
        int i5 = this.mode;
        if (i2 != i5) {
            int i6 = HighLevelEncoder.LATCH_TABLE[i5][i2];
            int i7 = i6 >> 16;
            tokenAdd = tokenAdd.add(i6 & RtpPacket.MAX_SEQUENCE_NUMBER, i7);
            i4 += i7;
        }
        int i8 = i2 == 2 ? 4 : 5;
        return new State(tokenAdd.add(i3, i8), i2, 0, i4 + i8);
    }

    State shiftAndAppend(int i2, int i3) {
        Token token = this.token;
        int i4 = this.mode;
        int i5 = i4 == 2 ? 4 : 5;
        return new State(token.add(HighLevelEncoder.SHIFT_TABLE[i4][i2], i5).add(i3, 5), this.mode, 0, this.bitCount + i5 + 5);
    }

    State addBinaryShiftChar(int i2) {
        Token tokenAdd = this.token;
        int i3 = this.mode;
        int i4 = this.bitCount;
        if (i3 == 4 || i3 == 2) {
            int i5 = HighLevelEncoder.LATCH_TABLE[i3][0];
            int i6 = i5 >> 16;
            tokenAdd = tokenAdd.add(i5 & RtpPacket.MAX_SEQUENCE_NUMBER, i6);
            i4 += i6;
            i3 = 0;
        }
        int i7 = this.binaryShiftByteCount;
        State state = new State(tokenAdd, i3, i7 + 1, i4 + ((i7 == 0 || i7 == 31) ? 18 : i7 == 62 ? 9 : 8));
        return state.binaryShiftByteCount == 2078 ? state.endBinaryShift(i2 + 1) : state;
    }

    State endBinaryShift(int i2) {
        int i3 = this.binaryShiftByteCount;
        return i3 == 0 ? this : new State(this.token.addBinaryShift(i2 - i3, i3), this.mode, 0, this.bitCount);
    }

    boolean isBetterThanOrEqualTo(State state) {
        int i2 = this.bitCount + (HighLevelEncoder.LATCH_TABLE[this.mode][state.mode] >> 16);
        int i3 = this.binaryShiftByteCount;
        int i4 = state.binaryShiftByteCount;
        if (i3 < i4) {
            i2 += state.binaryShiftCost - this.binaryShiftCost;
        } else if (i3 > i4 && i4 > 0) {
            i2 += 10;
        }
        return i2 <= state.bitCount;
    }

    BitArray toBitArray(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        for (Token previous = endBinaryShift(bArr.length).token; previous != null; previous = previous.getPrevious()) {
            arrayList.add(previous);
        }
        BitArray bitArray = new BitArray();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Token) arrayList.get(size)).appendTo(bitArray, bArr);
        }
        return bitArray;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", HighLevelEncoder.MODE_NAMES[this.mode], Integer.valueOf(this.bitCount), Integer.valueOf(this.binaryShiftByteCount));
    }
}
