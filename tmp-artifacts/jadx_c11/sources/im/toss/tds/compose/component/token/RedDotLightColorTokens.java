package im.toss.tds.compose.component.token;

import o.ByteOrderedDataOutputStream;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RedDotLightColorTokens {
    private static int IAuthTabCallback = 0;
    private static int asBinder = 1;
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public static final RedDotLightColorTokens onNavigationEvent = new RedDotLightColorTokens();
    private static final long onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(im.toss.tds.component.token.RedDotLightColorTokens.onNavigationEvent.onExtraCallback());

    private RedDotLightColorTokens() {
    }

    static {
        int i = onExtraCallback + 107;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult;
        }
        int i3 = 34 / 0;
        return onExtraCallbackWithResult;
    }
}
