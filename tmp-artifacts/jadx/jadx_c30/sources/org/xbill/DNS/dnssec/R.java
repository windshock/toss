package org.xbill.DNS.dnssec;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class R {
    private static boolean onExtraCallbackWithResult;
    private static ResourceBundle onNavigationEvent;

    private R() {
    }

    public static String onExtraCallbackWithResult(String str, Object... objArr) {
        if (onExtraCallbackWithResult) {
            return onWarmupCompleted(str, objArr);
        }
        try {
            if (onNavigationEvent == null) {
                onNavigationEvent = ResourceBundle.getBundle("messages");
            }
            return MessageFormat.format(onNavigationEvent.getString(str), objArr);
        } catch (MissingResourceException unused) {
            return onWarmupCompleted(str, objArr);
        }
    }

    private static String onWarmupCompleted(String str, Object[] objArr) {
        StringBuilder sb = new StringBuilder(str);
        for (Object obj : objArr) {
            sb.append(":");
            sb.append(obj);
        }
        return sb.toString();
    }
}
