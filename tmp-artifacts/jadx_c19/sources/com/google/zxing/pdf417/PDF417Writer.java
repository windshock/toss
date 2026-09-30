package com.google.zxing.pdf417;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.pdf417.encoder.Compaction;
import com.google.zxing.pdf417.encoder.Dimensions;
import com.google.zxing.pdf417.encoder.PDF417;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class PDF417Writer implements Writer {
    private static final int DEFAULT_ERROR_CORRECTION_LEVEL = 2;
    private static final int WHITE_SPACE = 30;

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8 A[PHI: r0 r10
      0x00b8: PHI (r0v2 int) = (r0v1 int), (r0v3 int), (r0v3 int) binds: [B:5:0x000d, B:25:0x00a3, B:27:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x00b8: PHI (r10v3 int) = (r10v2 int), (r10v4 int), (r10v4 int) binds: [B:5:0x000d, B:25:0x00a3, B:27:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i2, int i3, Map<EncodeHintType, ?> map) throws NumberFormatException, WriterException {
        int i4;
        int i5;
        boolean z;
        if (barcodeFormat != BarcodeFormat.PDF_417) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got " + barcodeFormat);
        }
        PDF417 pdf417 = new PDF417();
        int i6 = WHITE_SPACE;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.PDF417_COMPACT;
            if (map.containsKey(encodeHintType)) {
                pdf417.setCompact(Boolean.parseBoolean(map.get(encodeHintType).toString()));
            }
            EncodeHintType encodeHintType2 = EncodeHintType.PDF417_COMPACTION;
            if (map.containsKey(encodeHintType2)) {
                pdf417.setCompaction(Compaction.valueOf(map.get(encodeHintType2).toString()));
            }
            EncodeHintType encodeHintType3 = EncodeHintType.PDF417_DIMENSIONS;
            if (map.containsKey(encodeHintType3)) {
                Dimensions dimensions = (Dimensions) map.get(encodeHintType3);
                pdf417.setDimensions(dimensions.getMaxCols(), dimensions.getMinCols(), dimensions.getMaxRows(), dimensions.getMinRows());
            }
            EncodeHintType encodeHintType4 = EncodeHintType.MARGIN;
            if (map.containsKey(encodeHintType4)) {
                i6 = Integer.parseInt(map.get(encodeHintType4).toString());
            }
            EncodeHintType encodeHintType5 = EncodeHintType.ERROR_CORRECTION;
            i = map.containsKey(encodeHintType5) ? Integer.parseInt(map.get(encodeHintType5).toString()) : 2;
            EncodeHintType encodeHintType6 = EncodeHintType.CHARACTER_SET;
            if (map.containsKey(encodeHintType6)) {
                pdf417.setEncoding(Charset.forName(map.get(encodeHintType6).toString()));
            }
            EncodeHintType encodeHintType7 = EncodeHintType.PDF417_AUTO_ECI;
            if (map.containsKey(encodeHintType7) && Boolean.parseBoolean(map.get(encodeHintType7).toString())) {
                i4 = i;
                z = true;
                i5 = i6;
            } else {
                i4 = i;
                i5 = i6;
                z = false;
            }
        }
        return bitMatrixFromEncoder(pdf417, str, i4, i2, i3, i5, z);
    }

    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i2, int i3) throws WriterException {
        return encode(str, barcodeFormat, i2, i3, null);
    }

    private static BitMatrix bitMatrixFromEncoder(PDF417 pdf417, String str, int i2, int i3, int i4, int i5, boolean z) throws Throwable {
        boolean z2;
        pdf417.generateBarcodeLogic(str, i2, z);
        byte[][] scaledMatrix = pdf417.getBarcodeMatrix().getScaledMatrix(1, 4);
        if ((i4 > i3) != (scaledMatrix[0].length < scaledMatrix.length)) {
            scaledMatrix = rotateArray(scaledMatrix);
            z2 = true;
        } else {
            z2 = false;
        }
        int iMin = Math.min(i3 / scaledMatrix[0].length, i4 / scaledMatrix.length);
        if (iMin > 1) {
            byte[][] scaledMatrix2 = pdf417.getBarcodeMatrix().getScaledMatrix(iMin, iMin << 2);
            if (z2) {
                scaledMatrix2 = rotateArray(scaledMatrix2);
            }
            return bitMatrixFromBitArray(scaledMatrix2, i5);
        }
        return bitMatrixFromBitArray(scaledMatrix, i5);
    }

    private static BitMatrix bitMatrixFromBitArray(byte[][] bArr, int i2) {
        int i3 = i2 << 1;
        BitMatrix bitMatrix = new BitMatrix(bArr[0].length + i3, bArr.length + i3);
        bitMatrix.clear();
        int height = (bitMatrix.getHeight() - i2) - 1;
        int i4 = 0;
        while (i4 < bArr.length) {
            byte[] bArr2 = bArr[i4];
            for (int i5 = 0; i5 < bArr[0].length; i5++) {
                if (bArr2[i5] == 1) {
                    bitMatrix.set(i5 + i2, height);
                }
            }
            i4++;
            height--;
        }
        return bitMatrix;
    }

    private static byte[][] rotateArray(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int length = bArr.length;
            for (int i3 = 0; i3 < bArr[0].length; i3++) {
                bArr2[i3][(length - i2) - 1] = bArr[i2][i3];
            }
        }
        return bArr2;
    }
}
