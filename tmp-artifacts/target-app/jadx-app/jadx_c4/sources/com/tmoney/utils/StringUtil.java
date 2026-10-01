package com.tmoney.utils;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class StringUtil {
    public static String dump(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Len:" + i2);
        stringBuffer.append('\n');
        int i3 = i2 / 16;
        for (int i4 = 0; i4 < i3 + 1; i4++) {
            int i5 = i4 << 4;
            stringBuffer.append(format(Integer.toHexString(i5), 8, '0', false));
            stringBuffer.append(' ');
            for (int i6 = 0; i6 < 8; i6++) {
                int i7 = (i6 << 1) + i5;
                if (i7 < i2) {
                    stringBuffer.append(format(Integer.toHexString(bArr[i + i7] & 255), 2, '0', false));
                }
                if (i7 + 1 < i2) {
                    stringBuffer.append(format(Integer.toHexString(bArr[i7 + i + 1] & 255), 2, '0', false));
                }
                stringBuffer.append(' ');
            }
            stringBuffer.append(' ');
            StringBuffer stringBuffer2 = new StringBuffer();
            for (int i8 = 0; i8 < 16; i8++) {
                int i9 = i5 + i8;
                if (i9 < i2) {
                    char c = (char) (bArr[i9 + i] & 255);
                    if (c < ' ') {
                        c = '.';
                    }
                    stringBuffer2.append(c);
                }
            }
            stringBuffer.append(stringBuffer2.toString());
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }

    public static String format(double d, int i) {
        return format(d, i, '0', false);
    }

    public static String format(double d, int i, char c, boolean z) {
        return format(Double.toString(d).getBytes(), i, c, z);
    }

    public static String format(float f, int i) {
        return format(f, i, '0', false);
    }

    public static String format(float f, int i, char c, boolean z) {
        return format(Float.toString(f).getBytes(), i, c, z);
    }

    public static String format(int i, int i2) {
        return format(i, i2, '0', false);
    }

    public static String format(int i, int i2, char c, boolean z) {
        return format(Integer.toString(i).getBytes(), i2, c, z);
    }

    public static String format(String str, int i) {
        return format(str, i, ' ', true);
    }

    public static String format(String str, int i, char c, boolean z) {
        return format(str != null ? str.getBytes() : null, i, c, z);
    }

    public static String format(String str, int i, char c, boolean z, String str2) {
        return format(str != null ? str.getBytes(str2) : null, i, c, z, str2);
    }

    public static String format(String str, int i, String str2) {
        return format(str, i, ' ', true, str2);
    }

    public static String format(short s, int i) {
        return format(s, i, '0', false);
    }

    public static String format(short s, int i, char c, boolean z) {
        return format(Short.toString(s).getBytes(), i, c, z);
    }

    public static String format(byte[] bArr, int i, char c, boolean z) {
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        if (bArr == null) {
            while (i2 < i) {
                bArr2[i2] = (byte) c;
                i2++;
            }
        } else if (z) {
            int i3 = 0;
            while (i2 < i) {
                if (i2 < bArr.length) {
                    bArr2[i2] = bArr[i3];
                    i3++;
                } else {
                    bArr2[i2] = (byte) c;
                }
                i2++;
            }
        } else {
            int i4 = 0;
            while (i2 < i) {
                if (i2 < i - bArr.length) {
                    bArr2[i2] = (byte) c;
                } else {
                    bArr2[i2] = bArr[i4];
                    i4++;
                }
                i2++;
            }
        }
        return new String(bArr2);
    }

    public static String format(byte[] bArr, int i, char c, boolean z, String str) {
        byte[] bArr2 = new byte[i];
        if (bArr == null) {
            for (int i2 = 0; i2 < i; i2++) {
                bArr2[i2] = (byte) c;
            }
        } else if (z) {
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                if (i4 < bArr.length) {
                    bArr2[i4] = bArr[i3];
                    i3++;
                } else {
                    bArr2[i4] = (byte) c;
                }
            }
        } else {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                if (i6 < i - bArr.length) {
                    bArr2[i6] = (byte) c;
                } else {
                    bArr2[i6] = bArr[i5];
                    i5++;
                }
            }
        }
        return new String(bArr2, 0, i, str);
    }

    public static int parseInt(String str) {
        int i;
        if (str == null) {
            return 0;
        }
        if (str.startsWith("0x") || str.startsWith("0X")) {
            str = str.substring(2);
            i = 16;
        } else {
            i = 10;
        }
        return Integer.parseInt(str, i);
    }
}
