package com.iap.ac.android.loglite.c;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class a {
    public static final byte[] a = new byte[128];
    public static final char[] b = new char[64];

    static {
        int i = 0;
        for (int i2 = 0; i2 < 128; i2++) {
            a[i2] = -1;
        }
        for (int i3 = 90; i3 >= 65; i3--) {
            a[i3] = (byte) (i3 - 65);
        }
        for (int i4 = 122; i4 >= 97; i4--) {
            a[i4] = (byte) (i4 - 71);
        }
        for (int i5 = 57; i5 >= 48; i5--) {
            a[i5] = (byte) (i5 + 4);
        }
        byte[] bArr = a;
        bArr[43] = 62;
        bArr[47] = 63;
        for (int i6 = 0; i6 <= 25; i6++) {
            b[i6] = (char) (i6 + 65);
        }
        int i7 = 26;
        int i8 = 0;
        while (i7 <= 51) {
            b[i7] = (char) (i8 + 97);
            i7++;
            i8++;
        }
        int i9 = 52;
        while (i9 <= 61) {
            b[i9] = (char) (i + 48);
            i9++;
            i++;
        }
        char[] cArr = b;
        cArr[62] = '+';
        cArr[63] = '/';
    }

    public static boolean a(char c) {
        return c < 128 && a[c] != -1;
    }

    public static boolean b(char c) {
        return c == '=';
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length << 3;
        if (length == 0) {
            return "";
        }
        int i = length % 24;
        int i2 = length / 24;
        char[] cArr = new char[(i != 0 ? i2 + 1 : i2) << 2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < i2) {
            byte b2 = bArr[i4];
            byte b3 = bArr[i4 + 1];
            int i6 = i4 + 3;
            byte b4 = bArr[i4 + 2];
            byte b5 = (byte) (b3 & 15);
            byte b6 = (byte) (b2 & 3);
            int i7 = b2 >> 2;
            if ((b2 & Byte.MIN_VALUE) != 0) {
                i7 ^= 192;
            }
            byte b7 = (byte) i7;
            int i8 = b3 >> 4;
            if ((b3 & Byte.MIN_VALUE) != 0) {
                i8 ^= 240;
            }
            byte b8 = (byte) i8;
            int i9 = (b4 & Byte.MIN_VALUE) == 0 ? b4 >> 6 : (b4 >> 6) ^ 252;
            char[] cArr2 = b;
            cArr[i5] = cArr2[b7];
            cArr[i5 + 1] = cArr2[b8 | (b6 << 4)];
            cArr[i5 + 2] = cArr2[(b5 << 2) | ((byte) i9)];
            cArr[i5 + 3] = cArr2[b4 & 63];
            i3++;
            i5 += 4;
            i4 = i6;
        }
        if (i == 8) {
            byte b9 = bArr[i4];
            byte b10 = (byte) (b9 & 3);
            int i10 = b9 >> 2;
            if ((b9 & Byte.MIN_VALUE) != 0) {
                i10 ^= 192;
            }
            byte b11 = (byte) i10;
            char[] cArr3 = b;
            cArr[i5] = cArr3[b11];
            cArr[i5 + 1] = cArr3[b10 << 4];
            cArr[i5 + 2] = '=';
            cArr[i5 + 3] = '=';
        } else if (i == 16) {
            byte b12 = bArr[i4];
            byte b13 = bArr[i4 + 1];
            byte b14 = (byte) (b13 & 15);
            byte b15 = (byte) (b12 & 3);
            int i11 = b12 >> 2;
            if ((b12 & Byte.MIN_VALUE) != 0) {
                i11 ^= 192;
            }
            byte b16 = (byte) i11;
            int i12 = b13 >> 4;
            if ((b13 & Byte.MIN_VALUE) != 0) {
                i12 ^= 240;
            }
            byte b17 = (byte) i12;
            char[] cArr4 = b;
            cArr[i5] = cArr4[b16];
            cArr[i5 + 1] = cArr4[b17 | (b15 << 4)];
            cArr[i5 + 2] = cArr4[b14 << 2];
            cArr[i5 + 3] = '=';
        }
        return new String(cArr);
    }

    public static byte[] a(String str) {
        int i;
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        if (charArray == null) {
            i = 0;
        } else {
            i = 0;
            for (char c : charArray) {
                if (c != ' ' && c != '\r' && c != '\n' && c != '\t') {
                    charArray[i] = c;
                    i++;
                }
            }
        }
        if (i % 4 != 0) {
            return null;
        }
        int i2 = i / 4;
        if (i2 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i2 * 3];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2 - 1) {
            char c2 = charArray[i3];
            if (a(c2)) {
                char c3 = charArray[i3 + 1];
                if (a(c3)) {
                    char c4 = charArray[i3 + 2];
                    if (a(c4)) {
                        int i6 = i3 + 4;
                        char c5 = charArray[i3 + 3];
                        if (a(c5)) {
                            byte[] bArr2 = a;
                            byte b2 = bArr2[c2];
                            byte b3 = bArr2[c3];
                            byte b4 = bArr2[c4];
                            byte b5 = bArr2[c5];
                            bArr[i5] = (byte) ((b2 << 2) | (b3 >> 4));
                            bArr[i5 + 1] = (byte) (((b3 & 15) << 4) | ((b4 >> 2) & 15));
                            bArr[i5 + 2] = (byte) (b5 | (b4 << 6));
                            i4++;
                            i5 += 3;
                            i3 = i6;
                        }
                    }
                }
            }
            return null;
        }
        char c6 = charArray[i3];
        if (!a(c6)) {
            return null;
        }
        char c7 = charArray[i3 + 1];
        if (!a(c7)) {
            return null;
        }
        byte[] bArr3 = a;
        byte b6 = bArr3[c6];
        byte b7 = bArr3[c7];
        char c8 = charArray[i3 + 2];
        char c9 = charArray[i3 + 3];
        if (a(c8) && a(c9)) {
            byte b8 = bArr3[c8];
            byte b9 = bArr3[c9];
            bArr[i5] = (byte) ((b6 << 2) | (b7 >> 4));
            bArr[i5 + 1] = (byte) (((b7 & 15) << 4) | ((b8 >> 2) & 15));
            bArr[i5 + 2] = (byte) (b9 | (b8 << 6));
            return bArr;
        }
        if (b(c8) && b(c9)) {
            if ((b7 & 15) != 0) {
                return null;
            }
            int i7 = i4 * 3;
            byte[] bArr4 = new byte[i7 + 1];
            System.arraycopy(bArr, 0, bArr4, 0, i7);
            bArr4[i5] = (byte) ((b6 << 2) | (b7 >> 4));
            return bArr4;
        }
        if (b(c8) || !b(c9)) {
            return null;
        }
        byte b10 = bArr3[c8];
        if ((b10 & 3) != 0) {
            return null;
        }
        int i8 = i4 * 3;
        byte[] bArr5 = new byte[i8 + 2];
        System.arraycopy(bArr, 0, bArr5, 0, i8);
        bArr5[i5] = (byte) ((b6 << 2) | (b7 >> 4));
        bArr5[i5 + 1] = (byte) (((b10 >> 2) & 15) | ((b7 & 15) << 4));
        return bArr5;
    }
}
