package com.google.zxing.datamatrix;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Dimension;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.datamatrix.encoder.DefaultPlacement;
import com.google.zxing.datamatrix.encoder.ErrorCorrection;
import com.google.zxing.datamatrix.encoder.HighLevelEncoder;
import com.google.zxing.datamatrix.encoder.MinimalEncoder;
import com.google.zxing.datamatrix.encoder.SymbolInfo;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import java.nio.charset.Charset;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DataMatrixWriter implements Writer {
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i2, int i3) {
        return encode(str, barcodeFormat, i2, i3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i2, int i3, Map<EncodeHintType, ?> map) {
        Dimension dimension;
        Dimension dimension2;
        String strEncodeHighLevel;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeFormat != BarcodeFormat.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got " + barcodeFormat);
        }
        if (i2 < 0 || i3 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i2 + 'x' + i3);
        }
        SymbolShapeHint symbolShapeHint = SymbolShapeHint.FORCE_NONE;
        if (map != null) {
            SymbolShapeHint symbolShapeHint2 = (SymbolShapeHint) map.get(EncodeHintType.DATA_MATRIX_SHAPE);
            if (symbolShapeHint2 != null) {
                symbolShapeHint = symbolShapeHint2;
            }
            dimension = (Dimension) map.get(EncodeHintType.MIN_SIZE);
            if (dimension == null) {
                dimension = null;
            }
            dimension2 = (Dimension) map.get(EncodeHintType.MAX_SIZE);
            if (dimension2 == null) {
                dimension2 = null;
            }
        } else {
            dimension = null;
            dimension2 = null;
        }
        boolean z = false;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.DATA_MATRIX_COMPACT;
            if (map.containsKey(encodeHintType) && Boolean.parseBoolean(map.get(encodeHintType).toString())) {
                EncodeHintType encodeHintType2 = EncodeHintType.GS1_FORMAT;
                if (map.containsKey(encodeHintType2) && Boolean.parseBoolean(map.get(encodeHintType2).toString())) {
                    z = true;
                }
                EncodeHintType encodeHintType3 = EncodeHintType.CHARACTER_SET;
                strEncodeHighLevel = MinimalEncoder.encodeHighLevel(str, map.containsKey(encodeHintType3) ? Charset.forName(map.get(encodeHintType3).toString()) : null, z ? 29 : -1, symbolShapeHint);
            } else {
                if (map != null) {
                    EncodeHintType encodeHintType4 = EncodeHintType.FORCE_C40;
                    if (map.containsKey(encodeHintType4) && Boolean.parseBoolean(map.get(encodeHintType4).toString())) {
                        z = true;
                    }
                }
                strEncodeHighLevel = HighLevelEncoder.encodeHighLevel(str, symbolShapeHint, dimension, dimension2, z);
            }
        }
        SymbolInfo symbolInfoLookup = SymbolInfo.lookup(strEncodeHighLevel.length(), symbolShapeHint, dimension, dimension2, true);
        DefaultPlacement defaultPlacement = new DefaultPlacement(ErrorCorrection.encodeECC200(strEncodeHighLevel, symbolInfoLookup), symbolInfoLookup.getSymbolDataWidth(), symbolInfoLookup.getSymbolDataHeight());
        defaultPlacement.place();
        return encodeLowLevel(defaultPlacement, symbolInfoLookup, i2, i3);
    }

    private static BitMatrix encodeLowLevel(DefaultPlacement defaultPlacement, SymbolInfo symbolInfo, int i2, int i3) {
        int symbolDataWidth = symbolInfo.getSymbolDataWidth();
        int symbolDataHeight = symbolInfo.getSymbolDataHeight();
        ByteMatrix byteMatrix = new ByteMatrix(symbolInfo.getSymbolWidth(), symbolInfo.getSymbolHeight());
        int i4 = 0;
        for (int i5 = 0; i5 < symbolDataHeight; i5++) {
            if (i5 % symbolInfo.matrixHeight == 0) {
                int i6 = 0;
                for (int i7 = 0; i7 < symbolInfo.getSymbolWidth(); i7++) {
                    byteMatrix.set(i6, i4, i7 % 2 == 0);
                    i6++;
                }
                i4++;
            }
            int i8 = 0;
            for (int i9 = 0; i9 < symbolDataWidth; i9++) {
                if (i9 % symbolInfo.matrixWidth == 0) {
                    byteMatrix.set(i8, i4, true);
                    i8++;
                }
                byteMatrix.set(i8, i4, defaultPlacement.getBit(i9, i5));
                int i10 = i8 + 1;
                int i11 = symbolInfo.matrixWidth;
                if (i9 % i11 == i11 - 1) {
                    byteMatrix.set(i10, i4, i5 % 2 == 0);
                    i8 += 2;
                } else {
                    i8 = i10;
                }
            }
            int i12 = i4 + 1;
            int i13 = symbolInfo.matrixHeight;
            if (i5 % i13 == i13 - 1) {
                int i14 = 0;
                for (int i15 = 0; i15 < symbolInfo.getSymbolWidth(); i15++) {
                    byteMatrix.set(i14, i12, true);
                    i14++;
                }
                i4 += 2;
            } else {
                i4 = i12;
            }
        }
        return convertByteMatrixToBitMatrix(byteMatrix, i2, i3);
    }

    private static BitMatrix convertByteMatrixToBitMatrix(ByteMatrix byteMatrix, int i2, int i3) {
        BitMatrix bitMatrix;
        int width = byteMatrix.getWidth();
        int height = byteMatrix.getHeight();
        int iMax = Math.max(i2, width);
        int iMax2 = Math.max(i3, height);
        int iMin = Math.min(iMax / width, iMax2 / height);
        int i4 = (iMax - (width * iMin)) / 2;
        int i5 = (iMax2 - (height * iMin)) / 2;
        if (i3 < height || i2 < width) {
            bitMatrix = new BitMatrix(width, height);
            i4 = 0;
            i5 = 0;
        } else {
            bitMatrix = new BitMatrix(i2, i3);
        }
        bitMatrix.clear();
        int i6 = 0;
        while (i6 < height) {
            int i7 = i4;
            int i8 = 0;
            while (i8 < width) {
                if (byteMatrix.get(i8, i6) == 1) {
                    bitMatrix.setRegion(i7, i5, iMin, iMin);
                }
                i8++;
                i7 += iMin;
            }
            i6++;
            i5 += iMin;
        }
        return bitMatrix;
    }
}
