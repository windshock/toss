package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class y6a {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static final r8lambdaeOaVtgql0MWPnFumztkNWmywOY IAuthTabCallback(long j) {
        int i = 2 % 2;
        r8lambdaeOaVtgql0MWPnFumztkNWmywOY r8lambdaeoavtgql0mwpnfumztknwmywoy = new r8lambdaeOaVtgql0MWPnFumztkNWmywOY(j, null);
        int i2 = onExtraCallback + 3;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 86 / 0;
        }
        return r8lambdaeoavtgql0mwpnfumztknwmywoy;
    }

    public static /* synthetic */ r8lambdaeOaVtgql0MWPnFumztkNWmywOY onWarmupCompleted(long j, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 125;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            j = isBannerOrLeaderAd.IAuthTabCallback.IAuthTabCallback();
            int i4 = onExtraCallback + 69;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        return IAuthTabCallback(j);
    }

    public static final r8lambdaeOaVtgql0MWPnFumztkNWmywOY onExtraCallbackWithResult(long j) {
        int i = 2 % 2;
        r8lambdaeOaVtgql0MWPnFumztkNWmywOY r8lambdaeoavtgql0mwpnfumztknwmywoy = new r8lambdaeOaVtgql0MWPnFumztkNWmywOY(j, null);
        int i2 = onExtraCallback + 25;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return r8lambdaeoavtgql0mwpnfumztknwmywoy;
        }
        throw null;
    }

    public static /* synthetic */ r8lambdaeOaVtgql0MWPnFumztkNWmywOY onNavigationEvent(long j, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 1;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            j = getAdaptiveSize.onExtraCallback.onWarmupCompleted();
            int i4 = onExtraCallbackWithResult + 1;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        return onExtraCallbackWithResult(j);
    }
}
