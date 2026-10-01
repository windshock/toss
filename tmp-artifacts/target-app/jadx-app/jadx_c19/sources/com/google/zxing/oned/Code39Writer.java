package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import java.util.Collection;
import java.util.Collections;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class Code39Writer extends OneDimensionalCodeWriter {
    protected Collection<BarcodeFormat> getSupportedWriteFormats() {
        return Collections.singleton(BarcodeFormat.CODE_39);
    }

    public boolean[] encode(String str) {
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i2)) < 0) {
                str = tryToConvertToExtendedMode(str);
                length = str.length();
                if (length > 80) {
                    throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
                }
            } else {
                i2++;
            }
        }
        int[] iArr = new int[9];
        boolean[] zArr = new boolean[(length * 13) + 25];
        toIntArray(148, iArr);
        int iAppendPattern = OneDimensionalCodeWriter.appendPattern(zArr, 0, iArr, true);
        int[] iArr2 = {1};
        int iAppendPattern2 = iAppendPattern + OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern, iArr2, false);
        for (int i3 = 0; i3 < length; i3++) {
            toIntArray(Code39Reader.CHARACTER_ENCODINGS["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i3))], iArr);
            int iAppendPattern3 = iAppendPattern2 + OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern2, iArr, true);
            iAppendPattern2 = iAppendPattern3 + OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern3, iArr2, false);
        }
        toIntArray(148, iArr);
        OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern2, iArr, true);
        return zArr;
    }

    private static void toIntArray(int i2, int[] iArr) {
        for (int i3 = 0; i3 < 9; i3++) {
            int i4 = 1;
            if (((1 << (8 - i3)) & i2) != 0) {
                i4 = 2;
            }
            iArr[i3] = i4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String tryToConvertToExtendedMode(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == 0) {
                sb.append("%U");
            } else if (cCharAt == ' ') {
                sb.append(cCharAt);
            } else if (cCharAt == '@') {
                sb.append("%V");
            } else if (cCharAt == '`') {
                sb.append("%W");
            } else if (cCharAt != '-' && cCharAt != '.') {
                if (cCharAt <= 26) {
                    sb.append('$');
                    sb.append((char) (cCharAt + '@'));
                } else if (cCharAt < ' ') {
                    sb.append('%');
                    sb.append((char) (cCharAt + '&'));
                } else if (cCharAt <= ',' || cCharAt == '/' || cCharAt == ':') {
                    sb.append('/');
                    sb.append((char) (cCharAt + ' '));
                } else if (cCharAt <= '9') {
                    sb.append(cCharAt);
                } else if (cCharAt <= '?') {
                    sb.append('%');
                    sb.append((char) (cCharAt + 11));
                } else if (cCharAt <= 'Z') {
                    sb.append(cCharAt);
                } else if (cCharAt <= '_') {
                    sb.append('%');
                    sb.append((char) (cCharAt - 16));
                } else if (cCharAt <= 'z') {
                    sb.append('+');
                    sb.append((char) (cCharAt - ' '));
                } else {
                    if (cCharAt > 127) {
                        throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i2) + "'");
                    }
                    sb.append('%');
                    sb.append((char) (cCharAt - '+'));
                }
            }
        }
        return sb.toString();
    }
}
