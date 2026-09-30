package com.alibaba.griver.base.common.utils;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class HexStringUtil {
    public final Charset a;
    public static final String DEFAULT_CHARSET_NAME = "UTF-8";
    public static final Charset DEFAULT_CHARSET = Charset.forName(DEFAULT_CHARSET_NAME);
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public HexStringUtil() {
        this.a = DEFAULT_CHARSET;
    }

    public static String bytesToHexString(byte[] bArr) {
        return new String(encodeHex(bArr));
    }

    public static byte[] decodeHex(char[] cArr) throws Exception {
        int length = cArr.length;
        if ((length & 1) != 0) {
            throw new Exception("Odd number of characters.");
        }
        byte[] bArr = new byte[length >> 1];
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int digit = toDigit(cArr[i2], i2);
            int i4 = i2 + 1;
            i2 += 2;
            bArr[i3] = (byte) ((digit << 4) | toDigit(cArr[i4], i4));
            i3++;
        }
        return bArr;
    }

    public static char[] encodeHex(byte[] bArr) {
        return encodeHex(bArr, true);
    }

    public static int toDigit(char c2, int i2) throws Exception {
        int iDigit = Character.digit(c2, 16);
        if (iDigit != -1) {
            return iDigit;
        }
        throw new Exception("Illegal hexadecimal character " + c2 + " at index " + i2);
    }

    public byte[] decode(byte[] bArr) throws Exception {
        return decodeHex(new String(bArr, getCharsetName()).toCharArray());
    }

    public byte[] encode(byte[] bArr) throws UnsupportedEncodingException {
        return bytesToHexString(bArr).getBytes(getCharsetName());
    }

    public Charset getCharset() {
        return this.a;
    }

    public String getCharsetName() {
        return this.a.name();
    }

    public String toString() {
        return super.toString() + "[charsetName=" + this.a + "]";
    }

    public static char[] encodeHex(byte[] bArr, boolean z) {
        return encodeHex(bArr, z ? b : c);
    }

    public Object decode(Object obj) throws Exception {
        try {
            return decodeHex(obj instanceof String ? ((String) obj).toCharArray() : (char[]) obj);
        } catch (ClassCastException e) {
            throw new Exception(e.getMessage(), e);
        }
    }

    public Object encode(Object obj) throws Exception {
        try {
            return encodeHex(obj instanceof String ? ((String) obj).getBytes(getCharsetName()) : (byte[]) obj);
        } catch (ClassCastException e) {
            throw new Exception(e.getMessage(), e);
        }
    }

    public static char[] encodeHex(byte[] bArr, char[] cArr) {
        int length = bArr.length;
        char[] cArr2 = new char[length << 1];
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            byte b2 = bArr[i3];
            cArr2[i2] = cArr[(b2 & 240) >>> 4];
            cArr2[i2 + 1] = cArr[b2 & 15];
            i3++;
            i2 += 2;
        }
        return cArr2;
    }

    public HexStringUtil(Charset charset) {
        this.a = charset;
    }

    public HexStringUtil(String str) {
        this(Charset.forName(str));
    }
}
