package o;

import im.toss.di.TossApiServiceModule;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class onEnter implements captureStartValues<getBidderToken> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final createAnimators<g1> onExtraCallbackWithResult;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getBidderToken getbiddertokenOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = IAuthTabCallback + 9;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 83 / 0;
        }
        return getbiddertokenOnExtraCallbackWithResult;
    }

    public getBidderToken onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = this.onExtraCallbackWithResult.get();
        if (i3 == 0) {
            return onExtraCallback((g1) obj);
        }
        onExtraCallback((g1) obj);
        throw null;
    }

    public static getBidderToken onExtraCallback(g1 g1Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getBidderToken getbiddertoken = (getBidderToken) createAnimator.onNavigationEvent(TossApiServiceModule.IAuthTabCallback.onWarmupCompleted(g1Var));
        int i4 = onExtraCallback + 65;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return getbiddertoken;
    }
}
