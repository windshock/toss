package o;

import java.util.Locale;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class oiz {
    public static String onExtraCallbackWithResult(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : _UrlKt.FRAGMENT_ENCODE_SET;
    }

    public static String onWarmupCompleted(String str) {
        return onExtraCallbackWithResult(str).trim();
    }

    public static String onNavigationEvent(String str, boolean z) {
        return z ? onExtraCallbackWithResult(str) : onWarmupCompleted(str);
    }
}
