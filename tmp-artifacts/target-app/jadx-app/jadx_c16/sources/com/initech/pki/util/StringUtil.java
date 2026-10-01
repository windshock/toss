package com.initech.pki.util;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class StringUtil {
    public static final String INDENT = "    ";
    public static final Charset UTF8 = Charset.forName("UTF-8");

    public static void indent(StringBuffer stringBuffer, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append("    ");
        }
    }

    public static byte[] utf8bytes(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static String utf8str(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
