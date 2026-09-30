package o;

import java.util.regex.Pattern;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class PAGAppOpenAd {
    private static final Pattern onExtraCallback = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");

    public static boolean onExtraCallback(CharSequence charSequence, CharSequence charSequence2) {
        return (charSequence == null || charSequence2 == null || PAGVideoMediaView.onExtraCallback(charSequence, charSequence2, 0) < 0) ? false : true;
    }

    public static boolean onWarmupCompleted(CharSequence charSequence, char... cArr) {
        if (!onExtraCallback(charSequence) && !getVideoProgress.IAuthTabCallback(cArr)) {
            int length = charSequence.length();
            int length2 = cArr.length;
            for (int i = 0; i < length; i++) {
                char cCharAt = charSequence.charAt(i);
                for (int i2 = 0; i2 < length2; i2++) {
                    if (cArr[i2] == cCharAt) {
                        if (!Character.isHighSurrogate(cCharAt) || i2 == length2 - 1) {
                            return true;
                        }
                        if (i < length - 1 && cArr[i2 + 1] == charSequence.charAt(i + 1)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean onNavigationEvent(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null && charSequence2 != null) {
            int length = charSequence2.length();
            int length2 = charSequence.length();
            for (int i = 0; i <= length2 - length; i++) {
                if (PAGVideoMediaView.onExtraCallbackWithResult(charSequence, true, i, charSequence2, 0, length)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean IAuthTabCallback(CharSequence charSequence, char... cArr) {
        if (charSequence == null || cArr == null) {
            return true;
        }
        int length = charSequence.length();
        int length2 = cArr.length;
        for (int i = 0; i < length; i++) {
            char cCharAt = charSequence.charAt(i);
            for (int i2 = 0; i2 < length2; i2++) {
                if (cArr[i2] == cCharAt) {
                    if (!Character.isHighSurrogate(cCharAt) || i2 == length2 - 1) {
                        return false;
                    }
                    if (i < length - 1 && cArr[i2 + 1] == charSequence.charAt(i + 1)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean onWarmupCompleted(CharSequence charSequence, CharSequence charSequence2) {
        return onExtraCallback(charSequence, charSequence2, false);
    }

    private static boolean onExtraCallback(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (charSequence == null || charSequence2 == null) {
            return charSequence == charSequence2;
        }
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        return PAGVideoMediaView.onExtraCallbackWithResult(charSequence, z, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length());
    }

    public static boolean IAuthTabCallback(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static int onExtraCallback(CharSequence charSequence, CharSequence charSequence2, int i) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return PAGVideoMediaView.onExtraCallback(charSequence, charSequence2, i);
    }

    public static int IAuthTabCallback(CharSequence charSequence, CharSequence charSequence2, int i) {
        if (charSequence != null && charSequence2 != null) {
            if (i < 0) {
                i = 0;
            }
            int length = (charSequence.length() - charSequence2.length()) + 1;
            if (i > length) {
                return -1;
            }
            if (charSequence2.length() == 0) {
                return i;
            }
            while (i < length) {
                if (PAGVideoMediaView.onExtraCallbackWithResult(charSequence, true, i, charSequence2, 0, charSequence2.length())) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public static boolean onExtraCallback(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static int onWarmupCompleted(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }

    public static String onWarmupCompleted(String str, String str2, String str3) {
        return onExtraCallback(str, str2, str3, -1);
    }

    public static String onExtraCallback(String str, String str2, String str3, int i) {
        return onNavigationEvent(str, str2, str3, i, false);
    }

    private static String onNavigationEvent(String str, String str2, String str3, int i, boolean z) {
        if (onExtraCallback(str) || onExtraCallback(str2) || str3 == null || i == 0) {
            return str;
        }
        if (z) {
            str2 = str2.toLowerCase();
        }
        int i2 = 0;
        int iIAuthTabCallback = z ? IAuthTabCallback(str, str2, 0) : onExtraCallback(str, str2, 0);
        if (iIAuthTabCallback == -1) {
            return str;
        }
        int length = str2.length();
        StringBuilder sb = new StringBuilder(str.length() + (Math.max(str3.length() - length, 0) * (i < 0 ? 16 : Math.min(i, 64))));
        while (iIAuthTabCallback != -1) {
            sb.append((CharSequence) str, i2, iIAuthTabCallback);
            sb.append(str3);
            i2 = iIAuthTabCallback + length;
            i--;
            if (i == 0) {
                break;
            }
            iIAuthTabCallback = z ? IAuthTabCallback(str, str2, i2) : onExtraCallback(str, str2, i2);
        }
        sb.append((CharSequence) str, i2, str.length());
        return sb.toString();
    }
}
