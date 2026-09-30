package o;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class lt17 {
    private static Map<String, String> onExtraCallbackWithResult;

    static {
        try {
            onWarmupCompleted();
        } catch (SecurityException unused) {
        }
    }

    public static void onWarmupCompleted() {
        String property = System.getProperty("dnsjava.options");
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ",");
            while (stringTokenizer.hasMoreTokens()) {
                String strNextToken = stringTokenizer.nextToken();
                int iIndexOf = strNextToken.indexOf(61);
                if (iIndexOf == -1) {
                    onNavigationEvent(strNextToken);
                } else {
                    onExtraCallbackWithResult(strNextToken.substring(0, iIndexOf), strNextToken.substring(iIndexOf + 1));
                }
            }
        }
    }

    public static void onNavigationEvent(String str) {
        if (onExtraCallbackWithResult == null) {
            onExtraCallbackWithResult = new HashMap();
        }
        onExtraCallbackWithResult.put(str.toLowerCase(), "true");
    }

    public static void onExtraCallbackWithResult(String str, String str2) {
        if (onExtraCallbackWithResult == null) {
            onExtraCallbackWithResult = new HashMap();
        }
        onExtraCallbackWithResult.put(str.toLowerCase(), str2.toLowerCase());
    }

    public static boolean IAuthTabCallback(String str) {
        Map<String, String> map = onExtraCallbackWithResult;
        return (map == null || map.get(str.toLowerCase()) == null) ? false : true;
    }

    public static String onWarmupCompleted(String str) {
        Map<String, String> map = onExtraCallbackWithResult;
        if (map == null) {
            return null;
        }
        return map.get(str.toLowerCase());
    }

    public static int onExtraCallback(String str) throws NumberFormatException {
        String strOnWarmupCompleted = onWarmupCompleted(str);
        if (strOnWarmupCompleted == null) {
            return -1;
        }
        try {
            int i = Integer.parseInt(strOnWarmupCompleted);
            if (i > 0) {
                return i;
            }
            return -1;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    static boolean IAuthTabCallback() {
        Map<String, String> map = onExtraCallbackWithResult;
        return (map == null || map.get("multiline") == null) ? false : true;
    }
}
