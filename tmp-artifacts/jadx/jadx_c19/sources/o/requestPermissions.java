package o;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.regex.Pattern;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class requestPermissions {
    static final String onExtraCallback = "9223372036854775807";
    static final String onExtraCallbackWithResult = "9223372036854775808";
    private static final Pattern IAuthTabCallback = Pattern.compile("[+-]?[0-9]*[\\.]?[0-9]+([eE][+-]?[0-9]+)?");
    private static final Pattern onWarmupCompleted = Pattern.compile("[+-]?[0-9]+[\\.]");

    public static int onWarmupCompleted(char[] cArr, int i2, int i3) {
        if (i3 > 0 && cArr[i2] == '+') {
            i2++;
            i3--;
        }
        int i4 = cArr[(i2 + i3) - 1] - '0';
        switch (i3) {
            case 9:
                i4 += (cArr[i2] - '0') * 100000000;
                i2++;
            case 8:
                i4 += (cArr[i2] - '0') * 10000000;
                i2++;
            case 7:
                i4 += (cArr[i2] - '0') * 1000000;
                i2++;
            case 6:
                i4 += (cArr[i2] - '0') * 100000;
                i2++;
            case 5:
                i4 += (cArr[i2] - '0') * 10000;
                i2++;
            case 4:
                i4 += (cArr[i2] - '0') * 1000;
                i2++;
            case 3:
                i4 += (cArr[i2] - '0') * 100;
                i2++;
            case 2:
                return i4 + ((cArr[i2] - '0') * 10);
            default:
                return i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x006c, code lost:
    
        return java.lang.Integer.parseInt(r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int onWarmupCompleted(String str) {
        char cCharAt = str.charAt(0);
        int length = str.length();
        int i2 = 1;
        boolean z = cCharAt == '-';
        if (z) {
            if (length == 1 || length > 10) {
                return Integer.parseInt(str);
            }
            cCharAt = str.charAt(1);
            i2 = 2;
        } else if (length > 9) {
            return Integer.parseInt(str);
        }
        if (cCharAt > '9' || cCharAt < '0') {
            return Integer.parseInt(str);
        }
        int i3 = cCharAt - '0';
        if (i2 < length) {
            int i4 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 > '9' || cCharAt2 < '0') {
                return Integer.parseInt(str);
            }
            i3 = (i3 * 10) + (cCharAt2 - '0');
            if (i4 < length) {
                int i5 = i2 + 2;
                char cCharAt3 = str.charAt(i4);
                if (cCharAt3 > '9' || cCharAt3 < '0') {
                    return Integer.parseInt(str);
                }
                i3 = (i3 * 10) + (cCharAt3 - '0');
                if (i5 < length) {
                    while (true) {
                        int i6 = i5 + 1;
                        char cCharAt4 = str.charAt(i5);
                        if (cCharAt4 <= '9' && cCharAt4 >= '0') {
                            i3 = (i3 * 10) + (cCharAt4 - '0');
                            if (i6 >= length) {
                                break;
                            }
                            i5 = i6;
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        return z ? -i3 : i3;
    }

    public static long onNavigationEvent(char[] cArr, int i2, int i3) {
        int i4 = i3 - 9;
        return (onWarmupCompleted(cArr, i2, i4) * 1000000000) + onWarmupCompleted(cArr, i2 + i4, 9);
    }

    public static long onExtraCallback(char[] cArr, int i2, boolean z) {
        long j = 0;
        for (int i3 = 0; i3 < 19; i3++) {
            j = (j * 10) + (cArr[i2 + i3] - '0');
        }
        return z ? -j : j;
    }

    public static long onExtraCallback(String str) {
        if (str.length() <= 9) {
            return onWarmupCompleted(str);
        }
        return Long.parseLong(str);
    }

    public static boolean onExtraCallback(char[] cArr, int i2, int i3, boolean z) {
        String str = z ? onExtraCallbackWithResult : onExtraCallback;
        int length = str.length();
        if (i3 < length) {
            return true;
        }
        if (i3 > length) {
            return false;
        }
        for (int i4 = 0; i4 < length; i4++) {
            int iCharAt = cArr[i2 + i4] - str.charAt(i4);
            if (iCharAt != 0) {
                return iCharAt < 0;
            }
        }
        return true;
    }

    public static boolean onNavigationEvent(String str, boolean z) {
        String str2 = z ? onExtraCallbackWithResult : onExtraCallback;
        int length = str2.length();
        int length2 = str.length();
        if (length2 < length) {
            return true;
        }
        if (length2 > length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            int iCharAt = str.charAt(i2) - str2.charAt(i2);
            if (iCharAt != 0) {
                return iCharAt < 0;
            }
        }
        return true;
    }

    public static int onExtraCallback(String str, int i2) {
        String strTrim;
        int length;
        if (str != null && (length = (strTrim = str.trim()).length()) != 0) {
            int i3 = 0;
            char cCharAt = strTrim.charAt(0);
            if (cCharAt == '+') {
                strTrim = strTrim.substring(1);
                length = strTrim.length();
            } else if (cCharAt == '-') {
                i3 = 1;
            }
            while (i3 < length) {
                char cCharAt2 = strTrim.charAt(i3);
                if (cCharAt2 > '9' || cCharAt2 < '0') {
                    try {
                        return (int) onExtraCallback(strTrim, true);
                    } catch (NumberFormatException unused) {
                        return i2;
                    }
                }
                i3++;
            }
            try {
                return Integer.parseInt(strTrim);
            } catch (NumberFormatException unused2) {
            }
        }
        return i2;
    }

    public static long onExtraCallback(String str, long j) {
        String strTrim;
        int length;
        if (str != null && (length = (strTrim = str.trim()).length()) != 0) {
            int i2 = 0;
            char cCharAt = strTrim.charAt(0);
            if (cCharAt == '+') {
                strTrim = strTrim.substring(1);
                length = strTrim.length();
            } else if (cCharAt == '-') {
                i2 = 1;
            }
            while (i2 < length) {
                char cCharAt2 = strTrim.charAt(i2);
                if (cCharAt2 > '9' || cCharAt2 < '0') {
                    try {
                        return (long) onExtraCallback(strTrim, true);
                    } catch (NumberFormatException unused) {
                        return j;
                    }
                }
                i2++;
            }
            try {
                return Long.parseLong(strTrim);
            } catch (NumberFormatException unused2) {
            }
        }
        return j;
    }

    public static double onExtraCallback(String str, boolean z) throws NumberFormatException {
        return z ? performOptionsMenuClosed.onNavigationEvent(str) : Double.parseDouble(str);
    }

    public static double IAuthTabCallback(char[] cArr, boolean z) throws NumberFormatException {
        return onWarmupCompleted(cArr, 0, cArr.length, z);
    }

    public static double onWarmupCompleted(char[] cArr, int i2, int i3, boolean z) throws NumberFormatException {
        if (z) {
            return performOptionsMenuClosed.onExtraCallbackWithResult(cArr, i2, i3);
        }
        return Double.parseDouble(new String(cArr, i2, i3));
    }

    public static float onExtraCallbackWithResult(String str, boolean z) throws NumberFormatException {
        if (z) {
            return performPictureInPictureModeChanged.onExtraCallbackWithResult(str);
        }
        return Float.parseFloat(str);
    }

    public static float onWarmupCompleted(char[] cArr, boolean z) throws NumberFormatException {
        return IAuthTabCallback(cArr, 0, cArr.length, z);
    }

    public static float IAuthTabCallback(char[] cArr, int i2, int i3, boolean z) throws NumberFormatException {
        if (z) {
            return performPictureInPictureModeChanged.onExtraCallback(cArr, i2, i3);
        }
        return Float.parseFloat(new String(cArr, i2, i3));
    }

    public static BigDecimal onWarmupCompleted(String str, boolean z) throws NumberFormatException {
        if (z) {
            return performPrimaryNavigationFragmentChanged.onExtraCallbackWithResult(str);
        }
        return performPrimaryNavigationFragmentChanged.IAuthTabCallback(str);
    }

    public static BigDecimal onNavigationEvent(char[] cArr, int i2, int i3, boolean z) throws NumberFormatException {
        if (z) {
            return performPrimaryNavigationFragmentChanged.onWarmupCompleted(cArr, i2, i3);
        }
        return performPrimaryNavigationFragmentChanged.IAuthTabCallback(cArr, i2, i3);
    }

    public static BigDecimal onExtraCallback(char[] cArr, boolean z) throws NumberFormatException {
        if (z) {
            return performPrimaryNavigationFragmentChanged.onWarmupCompleted(cArr, 0, cArr.length);
        }
        return performPrimaryNavigationFragmentChanged.onWarmupCompleted(cArr);
    }

    public static BigInteger IAuthTabCallback(String str, boolean z) throws NumberFormatException {
        if (z) {
            return performStop.onExtraCallback(str);
        }
        return new BigInteger(str);
    }

    public static BigInteger onWarmupCompleted(String str, int i2, boolean z) throws NumberFormatException {
        if (z) {
            return performStop.onNavigationEvent(str, i2);
        }
        return new BigInteger(str, i2);
    }

    public static boolean IAuthTabCallback(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        if (str.length() != 1) {
            return IAuthTabCallback.matcher(str).matches() || onWarmupCompleted.matcher(str).matches();
        }
        char cCharAt = str.charAt(0);
        return cCharAt <= '9' && cCharAt >= '0';
    }
}
