package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinRtbRewardedRenderer {
    private static final toMetersPerSecond IAuthTabCallback = onExtraCallback(deprecated_mustRevalidate.onNavigationEvent(), deprecated_mustRevalidate.IAuthTabCallback());
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static final toMetersPerSecond onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        toMetersPerSecond tometerspersecond = IAuthTabCallback;
        int i5 = i3 + 81;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return tometerspersecond;
    }

    static {
        int i = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ toMetersPerSecond IAuthTabCallback(float f, float f2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 17;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            f = deprecated_mustRevalidate.onNavigationEvent();
        }
        if ((i & 2) != 0) {
            f2 = deprecated_mustRevalidate.IAuthTabCallback();
            int i4 = onNavigationEvent + 87;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        return onExtraCallback(f, f2);
    }

    public static final toMetersPerSecond onExtraCallback(float f, float f2) {
        int i = 2 % 2;
        AppLovinAd appLovinAd = new AppLovinAd(f, f2);
        int i2 = onNavigationEvent + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return appLovinAd;
    }
}
