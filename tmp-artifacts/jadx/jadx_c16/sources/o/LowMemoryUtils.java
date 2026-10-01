package o;

import kotlin.text.StringsKt;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LowMemoryUtils {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public static final /* synthetic */ String onWarmupCompleted(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            IAuthTabCallback(str);
            throw null;
        }
        String strIAuthTabCallback = IAuthTabCallback(str);
        int i3 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return strIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    private static final String IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (str != null && !StringsKt.isBlank(str)) {
            return str;
        }
        int i4 = onNavigationEvent + 53;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }
}
