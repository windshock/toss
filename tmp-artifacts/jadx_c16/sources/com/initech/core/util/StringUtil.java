package com.initech.core.util;

import java.io.UnsupportedEncodingException;
import java.text.BreakIterator;
import java.util.Enumeration;
import java.util.StringTokenizer;
import java.util.Vector;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class StringUtil {
    public static final String INDENT = "    ";

    private static String a(String str, int i) {
        String str2 = "";
        for (int i2 = 0; i2 < i - toByteLength(str); i2++) {
            str2 = str2 + " ";
        }
        return str2;
    }

    private static String b(String str, int i) {
        String str2 = "";
        for (int i2 = 0; i2 < i - toByteEucKrLength(str); i2++) {
            str2 = str2 + " ";
        }
        return str2;
    }

    public static String convertRN(String str, int i) {
        String str2 = "";
        if (str == null) {
            return "";
        }
        if (i > 0) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, "\r\n");
            while (stringTokenizer.hasMoreTokens()) {
                str2 = str2 + stringTokenizer.nextToken() + "``";
            }
            return str2;
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str, "``");
        while (stringTokenizer2.hasMoreTokens()) {
            str2 = str2 + stringTokenizer2.nextToken() + "\r\n";
        }
        return str2;
    }

    public static String emptyToNull(String str) {
        if (str == null || str.trim().length() <= 0) {
            return null;
        }
        return str;
    }

    public static String encodeHtml(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length << 1);
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '<') {
                str2 = "&lt;";
            } else if (cCharAt == '>') {
                str2 = "&gt;";
            } else if (cCharAt == '&') {
                str2 = "&amp;";
            } else if (cCharAt == '\"') {
                str2 = "&quot;";
            } else if (cCharAt == ' ') {
                str2 = "&nbsp;";
            } else if (cCharAt == '\n' || cCharAt == '\r') {
                str2 = "<br>";
            } else {
                stringBuffer.append(cCharAt);
            }
            stringBuffer.append(str2);
        }
        return stringBuffer.toString();
    }

    public static Vector getParsedText(String str) {
        Vector vector = new Vector();
        BreakIterator sentenceInstance = BreakIterator.getSentenceInstance();
        sentenceInstance.setText(str);
        int iCurrent = 0;
        while (sentenceInstance.next() != -1) {
            vector.addElement(str.substring(iCurrent, sentenceInstance.current()));
            iCurrent = sentenceInstance.current();
        }
        return vector;
    }

    public static Vector getTokens(String str) {
        Vector vector = new Vector();
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        while (stringTokenizer.hasMoreTokens()) {
            vector.addElement(stringTokenizer.nextToken());
        }
        return vector;
    }

    public static Vector getTokens(String str, String str2) {
        Vector vector = new Vector();
        StringTokenizer stringTokenizer = new StringTokenizer(str, str2);
        while (stringTokenizer.hasMoreTokens()) {
            vector.addElement(stringTokenizer.nextToken());
        }
        return vector;
    }

    public static void indent(StringBuffer stringBuffer, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append("    ");
        }
    }

    public static String isNull(String str, String str2) {
        return isNull(str) ? str2 : str;
    }

    public static boolean isNull(String str) {
        return str == null;
    }

    public static String isNullEmpty(String str, String str2) {
        return isNullEmpty(str) ? str2 : str;
    }

    public static boolean isNullEmpty(String str) {
        return str == null || str.trim().length() <= 0;
    }

    public static void main(String[] strArr) {
        try {
            System.out.println("quote(String str) => " + quote(strArr[1]));
            System.out.println("convertRN(String str, 음수) => " + convertRN(strArr[1], -1));
            System.out.println("convertRN(String str, 양수) => " + convertRN(strArr[1], 1));
            System.out.println("stringCheck(String strData) => " + stringCheck(strArr[1]));
            System.out.println("validRsString(String str) => " + validRsString(strArr[1]));
            System.out.println("replace(String body, String from, String to) => " + replace(strArr[1], strArr[2], strArr[3]));
            System.out.println("encodeHtml(String str) => " + encodeHtml(strArr[1]));
            Enumeration enumerationElements = getParsedText("John Smith stopped by earlier to say 'Happy birthday!' Aren't you and he the same age? He and his wife have 2.5 children.").elements();
            while (enumerationElements.hasMoreElements()) {
                System.out.println("getParsedText() => " + enumerationElements.nextElement());
            }
        } catch (Exception unused) {
        }
    }

    public static String quote(String str) {
        if (str == null) {
            return "''";
        }
        return "'" + str + "'";
    }

    public static String replace(String str, String str2, String str3) {
        if (str != null && !str.trim().equals("") && str2 != null && str3 != null) {
            int length = str2.length();
            while (true) {
                int iIndexOf = str.indexOf(str2);
                if (iIndexOf == -1) {
                    break;
                }
                str = str.substring(0, iIndexOf) + str3 + str.substring(iIndexOf + length);
            }
        }
        return str;
    }

    public static String[] split(String str, char c) {
        Vector vector = new Vector();
        if (str == null || str.equals("")) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < charArray.length; i3++) {
            if (charArray[i3] == c) {
                vector.addElement(new String(charArray, i, i2));
                i = i3 + 1;
                i2 = 0;
            } else {
                i2++;
            }
        }
        if (i < charArray.length) {
            vector.addElement(str.substring(i));
        }
        int size = vector.size();
        String[] strArr = new String[size];
        for (int i4 = 0; i4 < size; i4++) {
            strArr[i4] = (String) vector.elementAt(i4);
        }
        return strArr;
    }

    public static String stringCheck(String str) {
        return str == null ? "" : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0041 A[Catch: UnsupportedEncodingException -> 0x0059, TRY_LEAVE, TryCatch #1 {UnsupportedEncodingException -> 0x0059, blocks: (B:26:0x003a, B:28:0x0041), top: B:36:0x003a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String subStringUTF8(String str, int i, int i2) throws UnsupportedEncodingException {
        int i3;
        int i4;
        int i5 = 0;
        try {
            byte[] bytes = str.getBytes("EUC-KR");
            int length = bytes.length;
            int i6 = 0;
            i4 = 0;
            while (i6 < length && i > i6) {
                try {
                    byte b = bytes[i6];
                    if (b > Byte.MAX_VALUE || b < 0) {
                        i6++;
                    }
                    i4++;
                    i6++;
                } catch (Exception unused) {
                    i3 = i5;
                    i5 = i4;
                    i4 = i5;
                    if (str.substring(i4, i3).getBytes("EUC-KR").length > i2) {
                    }
                    return str.substring(i4, i3);
                }
            }
            i3 = i4;
            int i7 = i3;
            while (i7 < i4 + i2) {
                try {
                    byte b2 = bytes[i7];
                    if (b2 > Byte.MAX_VALUE || b2 < 0) {
                        i7++;
                    }
                    i3++;
                    i7++;
                } catch (Exception unused2) {
                    i5 = i3;
                    i3 = i5;
                    i5 = i4;
                    i4 = i5;
                    if (str.substring(i4, i3).getBytes("EUC-KR").length > i2) {
                    }
                    return str.substring(i4, i3);
                }
            }
        } catch (Exception unused3) {
            i3 = 0;
        }
        try {
            if (str.substring(i4, i3).getBytes("EUC-KR").length > i2) {
                return str.substring(i4, i3 - 1) + " ";
            }
        } catch (UnsupportedEncodingException unused4) {
        }
        return str.substring(i4, i3);
    }

    public static int toByteEucKrLength(String str) {
        if (isNull(str)) {
            return -1;
        }
        try {
            return str.getBytes("EUC-KR").length;
        } catch (UnsupportedEncodingException unused) {
            return -1;
        }
    }

    public static int toByteLength(String str) {
        if (isNull(str)) {
            return -1;
        }
        return str.getBytes().length;
    }

    public static String toEucKrLeftPad(String str, int i) {
        return b(str, i) + str;
    }

    public static String toEucKrRightPad(String str, int i) {
        return str + b(str, i);
    }

    public static String toLeftPad(String str, int i) {
        return a(str, i) + str;
    }

    public static String toRightPad(String str, int i) {
        return str + a(str, i);
    }

    public static String trim(String str) {
        return trimRight(trimLeft(str));
    }

    public static String trimLeft(String str) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        int length = str.length();
        int i = 0;
        while (i < length && ' ' == str.charAt(i)) {
            i++;
        }
        return str.substring(i);
    }

    public static String trimRight(String str) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        int length = str.length() - 1;
        while (length >= 0 && ' ' == str.charAt(length)) {
            length--;
        }
        return str.substring(0, length + 1);
    }

    public static String validRsString(String str) {
        if (str == null) {
            return "";
        }
        if (str.indexOf(10) == -1 && str.indexOf(13) == -1) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n') {
                stringBuffer.append("<br>");
            } else {
                stringBuffer.append(cCharAt);
            }
        }
        return stringBuffer.toString();
    }
}
