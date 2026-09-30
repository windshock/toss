package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class Encoder {
    public static final int DEFAULT_AZTEC_LAYERS = 0;
    public static final int DEFAULT_EC_PERCENT = 33;
    private static final int MAX_NB_BITS = 32;
    private static final int MAX_NB_BITS_COMPACT = 4;
    private static final int[] WORD_SIZE = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private static int totalBitsInLayer(int i2, boolean z) {
        return ((z ? 88 : 112) + (i2 << 4)) * i2;
    }

    private Encoder() {
    }

    public static AztecCode encode(String str) {
        return encode(str.getBytes(StandardCharsets.ISO_8859_1));
    }

    public static AztecCode encode(String str, int i2, int i3) {
        return encode(str.getBytes(StandardCharsets.ISO_8859_1), i2, i3, (Charset) null);
    }

    public static AztecCode encode(String str, int i2, int i3, Charset charset) {
        return encode(str.getBytes(charset != null ? charset : StandardCharsets.ISO_8859_1), i2, i3, charset);
    }

    public static AztecCode encode(byte[] bArr) {
        return encode(bArr, 33, 0, (Charset) null);
    }

    public static AztecCode encode(byte[] bArr, int i2, int i3) {
        return encode(bArr, i2, i3, (Charset) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AztecCode encode(byte[] bArr, int i2, int i3, Charset charset) {
        BitArray bitArrayStuffBits;
        int i4;
        boolean z;
        int iAbs;
        int i5;
        int i6;
        BitArray bitArrayEncode = new HighLevelEncoder(bArr, charset).encode();
        int size = ((bitArrayEncode.getSize() * i2) / 100) + 11;
        int size2 = bitArrayEncode.getSize();
        int i7 = 1;
        if (i3 != 0) {
            z = i3 < 0;
            iAbs = Math.abs(i3);
            if (iAbs > (z ? 4 : 32)) {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i3)));
            }
            i5 = totalBitsInLayer(iAbs, z);
            i4 = WORD_SIZE[iAbs];
            bitArrayStuffBits = stuffBits(bitArrayEncode, i4);
            if (bitArrayStuffBits.getSize() + size > i5 - (i5 % i4)) {
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
            if (z) {
                if (bitArrayStuffBits.getSize() > (i4 << 6)) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                }
                z = true;
            }
        } else {
            BitArray bitArrayStuffBits2 = null;
            int i8 = 0;
            int i9 = 0;
            while (i8 <= 32) {
                boolean z2 = i8 <= 3 ? i7 : 0;
                int i10 = z2 != 0 ? i8 + 1 : i8;
                int i11 = totalBitsInLayer(i10, z2);
                if (size2 + size <= i11) {
                    if (bitArrayStuffBits2 == null || i9 != WORD_SIZE[i10]) {
                        int i12 = WORD_SIZE[i10];
                        i9 = i12;
                        bitArrayStuffBits2 = stuffBits(bitArrayEncode, i12);
                    }
                    if ((z2 == 0 || bitArrayStuffBits2.getSize() <= (i9 << 6)) && bitArrayStuffBits2.getSize() + size <= i11 - (i11 % i9)) {
                        bitArrayStuffBits = bitArrayStuffBits2;
                        i4 = i9;
                        z = z2;
                        iAbs = i10;
                        i5 = i11;
                    }
                }
                i8++;
                i7 = i7;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        BitArray bitArrayGenerateCheckWords = generateCheckWords(bitArrayStuffBits, i5, i4);
        int size3 = bitArrayStuffBits.getSize() / i4;
        BitArray bitArrayGenerateModeMessage = generateModeMessage(z, iAbs, size3);
        int i13 = (z ? 11 : 14) + (iAbs << 2);
        int[] iArr = new int[i13];
        if (z) {
            for (int i14 = 0; i14 < i13; i14++) {
                iArr[i14] = i14;
            }
            i6 = i13;
        } else {
            int i15 = i13 / 2;
            i6 = i13 + 1 + (((i15 - 1) / 15) << i7);
            int i16 = i6 / 2;
            for (int i17 = 0; i17 < i15; i17++) {
                int i18 = (i17 / 15) + i17;
                iArr[(i15 - i17) - i7] = (i16 - i18) - i7;
                iArr[i15 + i17] = i18 + i16 + i7;
            }
        }
        BitMatrix bitMatrix = new BitMatrix(i6);
        int i19 = 0;
        int i20 = 0;
        while (true) {
            int i21 = 2;
            if (i19 >= iAbs) {
                break;
            }
            int i22 = ((iAbs - i19) << 2) + (z ? 9 : 12);
            int i23 = 0;
            while (i23 < i22) {
                int i24 = i23 << 1;
                int i25 = 0;
                while (i25 < i21) {
                    if (bitArrayGenerateCheckWords.get(i20 + i24 + i25)) {
                        int i26 = i19 << 1;
                        bitMatrix.set(iArr[i26 + i25], iArr[i26 + i23]);
                    }
                    if (bitArrayGenerateCheckWords.get((i22 << 1) + i20 + i24 + i25)) {
                        int i27 = i19 << 1;
                        bitMatrix.set(iArr[i27 + i23], iArr[((i13 - 1) - i27) - i25]);
                    }
                    if (bitArrayGenerateCheckWords.get((i22 << 2) + i20 + i24 + i25)) {
                        int i28 = (i13 - 1) - (i19 << 1);
                        bitMatrix.set(iArr[i28 - i25], iArr[i28 - i23]);
                    }
                    if (bitArrayGenerateCheckWords.get((i22 * 6) + i20 + i24 + i25)) {
                        int i29 = i19 << 1;
                        bitMatrix.set(iArr[((i13 - 1) - i29) - i23], iArr[i29 + i25]);
                    }
                    i25++;
                    i21 = 2;
                }
                i23++;
                i21 = 2;
            }
            i20 += i22 << 3;
            i19++;
        }
        drawModeMessage(bitMatrix, z, i6, bitArrayGenerateModeMessage);
        if (z) {
            drawBullsEye(bitMatrix, i6 / 2, 5);
        } else {
            int i30 = i6 / 2;
            drawBullsEye(bitMatrix, i30, 7);
            int i31 = 0;
            int i32 = 0;
            while (i31 < (i13 / 2) - 1) {
                for (int i33 = i30 & 1; i33 < i6; i33 += 2) {
                    int i34 = i30 - i32;
                    bitMatrix.set(i34, i33);
                    int i35 = i30 + i32;
                    bitMatrix.set(i35, i33);
                    bitMatrix.set(i33, i34);
                    bitMatrix.set(i33, i35);
                }
                i31 += 15;
                i32 += 16;
            }
        }
        AztecCode aztecCode = new AztecCode();
        aztecCode.setCompact(z);
        aztecCode.setSize(i6);
        aztecCode.setLayers(iAbs);
        aztecCode.setCodeWords(size3);
        aztecCode.setMatrix(bitMatrix);
        return aztecCode;
    }

    private static void drawBullsEye(BitMatrix bitMatrix, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4 += 2) {
            int i5 = i2 - i4;
            int i6 = i5;
            while (true) {
                int i7 = i2 + i4;
                if (i6 <= i7) {
                    bitMatrix.set(i6, i5);
                    bitMatrix.set(i6, i7);
                    bitMatrix.set(i5, i6);
                    bitMatrix.set(i7, i6);
                    i6++;
                }
            }
        }
        int i8 = i2 - i3;
        bitMatrix.set(i8, i8);
        int i9 = i8 + 1;
        bitMatrix.set(i9, i8);
        bitMatrix.set(i8, i9);
        int i10 = i2 + i3;
        bitMatrix.set(i10, i8);
        bitMatrix.set(i10, i9);
        bitMatrix.set(i10, i10 - 1);
    }

    static BitArray generateModeMessage(boolean z, int i2, int i3) {
        BitArray bitArray = new BitArray();
        if (z) {
            bitArray.appendBits(i2 - 1, 2);
            bitArray.appendBits(i3 - 1, 6);
            return generateCheckWords(bitArray, 28, 4);
        }
        bitArray.appendBits(i2 - 1, 5);
        bitArray.appendBits(i3 - 1, 11);
        return generateCheckWords(bitArray, 40, 4);
    }

    private static void drawModeMessage(BitMatrix bitMatrix, boolean z, int i2, BitArray bitArray) {
        int i3 = i2 / 2;
        int i4 = 0;
        if (z) {
            while (i4 < 7) {
                int i5 = (i3 - 3) + i4;
                if (bitArray.get(i4)) {
                    bitMatrix.set(i5, i3 - 5);
                }
                if (bitArray.get(i4 + 7)) {
                    bitMatrix.set(i3 + 5, i5);
                }
                if (bitArray.get(20 - i4)) {
                    bitMatrix.set(i5, i3 + 5);
                }
                if (bitArray.get(27 - i4)) {
                    bitMatrix.set(i3 - 5, i5);
                }
                i4++;
            }
            return;
        }
        while (i4 < 10) {
            int i6 = (i3 - 5) + i4 + (i4 / 5);
            if (bitArray.get(i4)) {
                bitMatrix.set(i6, i3 - 7);
            }
            if (bitArray.get(i4 + 10)) {
                bitMatrix.set(i3 + 7, i6);
            }
            if (bitArray.get(29 - i4)) {
                bitMatrix.set(i6, i3 + 7);
            }
            if (bitArray.get(39 - i4)) {
                bitMatrix.set(i3 - 7, i6);
            }
            i4++;
        }
    }

    private static BitArray generateCheckWords(BitArray bitArray, int i2, int i3) {
        int size = bitArray.getSize() / i3;
        ReedSolomonEncoder reedSolomonEncoder = new ReedSolomonEncoder(getGF(i3));
        int i4 = i2 / i3;
        int[] iArrBitsToWords = bitsToWords(bitArray, i3, i4);
        reedSolomonEncoder.encode(iArrBitsToWords, i4 - size);
        BitArray bitArray2 = new BitArray();
        bitArray2.appendBits(0, i2 % i3);
        for (int i5 : iArrBitsToWords) {
            bitArray2.appendBits(i5, i3);
        }
        return bitArray2;
    }

    private static int[] bitsToWords(BitArray bitArray, int i2, int i3) {
        int[] iArr = new int[i3];
        int size = bitArray.getSize() / i2;
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 |= bitArray.get((i4 * i2) + i6) ? 1 << ((i2 - i6) - 1) : 0;
            }
            iArr[i4] = i5;
        }
        return iArr;
    }

    private static GenericGF getGF(int i2) {
        if (i2 == 4) {
            return GenericGF.AZTEC_PARAM;
        }
        if (i2 == 6) {
            return GenericGF.AZTEC_DATA_6;
        }
        if (i2 == 8) {
            return GenericGF.AZTEC_DATA_8;
        }
        if (i2 == 10) {
            return GenericGF.AZTEC_DATA_10;
        }
        if (i2 == 12) {
            return GenericGF.AZTEC_DATA_12;
        }
        throw new IllegalArgumentException("Unsupported word size " + i2);
    }

    static BitArray stuffBits(BitArray bitArray, int i2) {
        BitArray bitArray2 = new BitArray();
        int size = bitArray.getSize();
        int i3 = (1 << i2) - 2;
        int i4 = 0;
        while (i4 < size) {
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = i4 + i6;
                if (i7 >= size || bitArray.get(i7)) {
                    i5 |= 1 << ((i2 - 1) - i6);
                }
            }
            int i8 = i5 & i3;
            if (i8 == i3) {
                bitArray2.appendBits(i8, i2);
            } else if (i8 == 0) {
                bitArray2.appendBits(i5 | 1, i2);
            } else {
                bitArray2.appendBits(i5, i2);
                i4 += i2;
            }
            i4--;
            i4 += i2;
        }
        return bitArray2;
    }
}
