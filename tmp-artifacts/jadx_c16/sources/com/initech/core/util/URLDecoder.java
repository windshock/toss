package com.initech.core.util;

import com.initech.core.INISAFECore;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class URLDecoder {
    public static boolean isInitech = true;

    public static String decode(String str) throws Exception {
        return isInitech ? java.net.URLDecoder.decode(str) : decode(str, "EUC-KR");
    }

    public static String decode(String str, String str2) throws UnsupportedEncodingException {
        return new String(decode2Byte(str), str2);
    }

    public static byte[] decode2Byte(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '%') {
                if (cCharAt == '+') {
                    cCharAt = ' ';
                }
                byteArrayOutputStream.write(cCharAt);
            } else {
                try {
                    byteArrayOutputStream.write(Integer.parseInt(str.substring(i + 1, i + 3), 16));
                    i += 2;
                } catch (NumberFormatException e) {
                    LogUtil.writeStackTrace(INISAFECore.CoreLogger, e);
                    throw new IllegalArgumentException();
                }
            }
            i++;
        }
        return byteArrayOutputStream.toByteArray();
    }
}
