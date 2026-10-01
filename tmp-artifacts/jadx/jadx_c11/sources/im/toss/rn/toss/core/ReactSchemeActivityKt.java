package im.toss.rn.toss.core;

import kotlin.text.StringsKt;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ReactSchemeActivityKt {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static final /* synthetic */ String onExtraCallback(Throwable th, String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(th, str);
        if (i3 != 0) {
            int i4 = 95 / 0;
        }
        int i5 = onNavigationEvent + 123;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 22 / 0;
        }
        return strOnExtraCallbackWithResult;
    }

    private static final String onExtraCallbackWithResult(Throwable th, String str) {
        String simpleName;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 17;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (th == null) {
            int i5 = i2 + 83;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 58 / 0;
            }
            return str;
        }
        String message = th.getMessage();
        if (message == null || StringsKt.isBlank(message)) {
            simpleName = th.getClass().getSimpleName();
        } else {
            simpleName = th.getClass().getSimpleName() + ": " + message;
        }
        return str + ": " + simpleName;
    }
}
