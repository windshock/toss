package im.toss.tds.compose.component.token;

import o.ByteOrderedDataOutputStream;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RedDotDarkColorTokens {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final RedDotDarkColorTokens onNavigationEvent = new RedDotDarkColorTokens();
    private static final long onWarmupCompleted = ByteOrderedDataOutputStream.onExtraCallback(im.toss.tds.component.token.RedDotDarkColorTokens.onWarmupCompleted.onNavigationEvent());

    private RedDotDarkColorTokens() {
    }

    static {
        int i = onExtraCallbackWithResult + 83;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        long j = onWarmupCompleted;
        int i5 = i3 + 53;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
