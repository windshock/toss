package com.tmoney.utils;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class NumberUtil {
    public static int parseInt(Object obj) {
        if (obj instanceof String) {
            return parseInt((String) obj);
        }
        if (obj instanceof Byte) {
            return ((Byte) obj).byteValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Short) {
            return ((Short) obj).shortValue();
        }
        if (obj instanceof byte[]) {
            return parseInt((byte[]) obj);
        }
        throw new NumberFormatException("해당하는 Type이 없습니다.");
    }

    public static int parseInt(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return Integer.parseInt(str.trim());
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int parseInt(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i = (i << 8) + (bArr[i2] & 255);
        }
        return i;
    }

    public static int parseInt(byte[] bArr, int i) {
        if (i != 0) {
            return parseInt(bArr);
        }
        byte[] bArr2 = new byte[4];
        ByteOrder.swap(bArr, bArr2);
        return parseInt(bArr2);
    }

    public static short parseShort(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            i = (i << 8) + (bArr[i2] & 255);
        }
        return (short) i;
    }
}
