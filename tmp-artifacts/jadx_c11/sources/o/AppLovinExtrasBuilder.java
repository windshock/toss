package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinExtrasBuilder {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public static final AppLovinBannerAdListener IAuthTabCallback(long j, long j2) {
        int i = 2 % 2;
        AppLovinBannerAdListener appLovinBannerAdListener = new AppLovinBannerAdListener(j, j2, null);
        int i2 = onNavigationEvent + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return appLovinBannerAdListener;
    }

    public static /* synthetic */ AppLovinBannerAdListener onExtraCallback(long j, long j2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            j = MaxNetworkResponseInfo.onWarmupCompleted.IAuthTabCallback();
        }
        if ((i & 2) != 0) {
            int i3 = onNavigationEvent + 17;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            j2 = MaxNetworkResponseInfo.onWarmupCompleted.onWarmupCompleted();
        }
        AppLovinBannerAdListener appLovinBannerAdListenerIAuthTabCallback = IAuthTabCallback(j, j2);
        int i5 = IAuthTabCallback + 23;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 73 / 0;
        }
        return appLovinBannerAdListenerIAuthTabCallback;
    }

    public static final AppLovinBannerAdListener onWarmupCompleted(long j, long j2) {
        int i = 2 % 2;
        AppLovinBannerAdListener appLovinBannerAdListener = new AppLovinBannerAdListener(j, j2, null);
        int i2 = IAuthTabCallback + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return appLovinBannerAdListener;
    }

    public static /* synthetic */ AppLovinBannerAdListener onWarmupCompleted(long j, long j2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = onNavigationEvent + 95;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                fromCode.onNavigationEvent.onNavigationEvent();
                throw null;
            }
            j = fromCode.onNavigationEvent.onNavigationEvent();
        }
        if ((i & 2) != 0) {
            j2 = fromCode.onNavigationEvent.onExtraCallbackWithResult();
        }
        AppLovinBannerAdListener appLovinBannerAdListenerOnWarmupCompleted = onWarmupCompleted(j, j2);
        int i4 = onNavigationEvent + 37;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return appLovinBannerAdListenerOnWarmupCompleted;
        }
        throw null;
    }
}
