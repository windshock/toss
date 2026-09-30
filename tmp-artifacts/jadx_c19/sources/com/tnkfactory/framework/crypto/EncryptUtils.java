package com.tnkfactory.framework.crypto;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class EncryptUtils {
    public static final byte[] a = "adfjklq904rfgkl;anf".getBytes();
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final long[] c = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0, 0, 0, 0, 10, 11, 12, 13, 14, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 11, 12, 13, 14, 15};

    public static String decryptRC4(String str) {
        byte[] hexBytes = toHexBytes(str);
        if (hexBytes == null) {
            return null;
        }
        new RC4Cryptor(a).init().decrypt(hexBytes, 0, hexBytes.length);
        return new String(hexBytes);
    }

    public static String md5Hex(String str) {
        MD5Hash mD5Hash = new MD5Hash();
        mD5Hash.update(str.getBytes());
        return toHexString(mD5Hash.getHash());
    }

    public static byte[] toHexBytes(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            long[] jArr = c;
            bArr[i3] = (byte) ((jArr[str.charAt(i2 + 1) - '0'] & 15) | ((int) ((jArr[str.charAt(i2) - '0'] << 4) & 240)));
            i3++;
            i2 += 2;
        }
        return bArr;
    }

    public static String toHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            char[] cArr = b;
            sb.append(cArr[(b2 >> 4) & 15]);
            sb.append(cArr[b2 & 15]);
        }
        return sb.toString();
    }
}
