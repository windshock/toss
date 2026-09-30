package o;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.function.IntFunction;
import o.PAGClientBidding;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class PAGClientBidding {
    private static ResourceBundle onNavigationEvent;

    static {
        try {
            onNavigationEvent = onExtraCallbackWithResult(Locale.getDefault(), "org.apache.commons.compress.harmony.archive.internal.nls.messages");
        } catch (Throwable unused) {
        }
    }

    public static String onExtraCallback(String str, final Object[] objArr) {
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 20));
        int length = objArr.length;
        String[] strArr = new String[length];
        Arrays.setAll(strArr, new IntFunction() { // from class: org.apache.commons.compress.harmony.archive.internal.nls.Messages$$ExternalSyntheticLambda1
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return Objects.toString(objArr[i], "<null>");
            }
        });
        int length2 = 0;
        while (true) {
            int iIndexOf = str.indexOf(123, length2);
            if (iIndexOf < 0) {
                break;
            }
            if (iIndexOf != 0) {
                int i = iIndexOf - 1;
                if (str.charAt(i) == '\\') {
                    if (iIndexOf != 1) {
                        sb.append(str.substring(length2, i));
                    }
                    sb.append('{');
                    length2 = iIndexOf + 1;
                }
            }
            if (iIndexOf > str.length() - 3) {
                sb.append(str.substring(length2));
                length2 = str.length();
            } else {
                int i2 = iIndexOf + 1;
                byte bDigit = (byte) Character.digit(str.charAt(i2), 10);
                if (bDigit < 0 || str.charAt(iIndexOf + 2) != '}') {
                    sb.append(str.substring(length2, i2));
                    length2 = i2;
                } else {
                    sb.append(str.substring(length2, iIndexOf));
                    if (bDigit >= length) {
                        sb.append("<missing argument>");
                    } else {
                        sb.append(strArr[bDigit]);
                    }
                    length2 = iIndexOf + 3;
                }
            }
        }
        if (length2 < str.length()) {
            sb.append(str.substring(length2));
        }
        return sb.toString();
    }

    public static String IAuthTabCallback(String str, Object obj) {
        return onNavigationEvent(str, new Object[]{obj});
    }

    public static String onNavigationEvent(String str, Object[] objArr) {
        ResourceBundle resourceBundle = onNavigationEvent;
        if (resourceBundle != null) {
            try {
                str = resourceBundle.getString(str);
            } catch (MissingResourceException unused) {
            }
        }
        return onExtraCallback(str, objArr);
    }

    public static ResourceBundle onExtraCallbackWithResult(final Locale locale, final String str) {
        final ClassLoader classLoader = null;
        try {
            return (ResourceBundle) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.compress.harmony.archive.internal.nls.Messages$$ExternalSyntheticLambda0
                @Override // java.security.PrivilegedAction
                public final Object run() {
                    return PAGClientBidding.onNavigationEvent(str, locale, classLoader);
                }
            });
        } catch (MissingResourceException unused) {
            return null;
        }
    }

    public static /* synthetic */ Object onNavigationEvent(String str, Locale locale, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        return ResourceBundle.getBundle(str, locale, classLoader);
    }
}
