package com.tmoney.e.a;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class a {
    private static char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String bytesToHexString(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer(length << 1);
        for (int i = 0; i < length; i++) {
            stringBuffer.append(a[(bArr[i] & 240) >> 4]);
            stringBuffer.append(a[bArr[i] & 15]);
        }
        return stringBuffer.toString();
    }

    public static byte[] hexStringToByteArray(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }
}
