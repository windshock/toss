package im.toss.tds.component.token;

import o.charset;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RedDotLightColorTokens {
    private static int IAuthTabCallback = 0;
    private static int asBinder = 1;
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public static final RedDotLightColorTokens onNavigationEvent = new RedDotLightColorTokens();
    private static final int onExtraCallbackWithResult = charset.onExtraCallbackWithResult.areNotificationsEnabled().IAuthTabCallback();

    private RedDotLightColorTokens() {
    }

    static {
        int i = onWarmupCompleted + 117;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult;
        int i5 = i3 + 85;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }
}
