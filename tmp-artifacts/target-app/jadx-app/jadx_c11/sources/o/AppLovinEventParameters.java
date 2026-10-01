package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinEventParameters implements accessinit {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    public static final AppLovinEventParameters onNavigationEvent = new AppLovinEventParameters();
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private AppLovinEventParameters() {
    }

    @Override // o.accessinit
    public getORDER_BY_NAMEokhttp onNavigationEvent(float f) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            CrashWhenOnDisableTooSoon crashWhenOnDisableTooSoonOnWarmupCompleted = CaptureOutputSurfaceOccupiedQuirk.onNavigationEvent.onWarmupCompleted(f);
            if (crashWhenOnDisableTooSoonOnWarmupCompleted == null) {
                return getORDER_BY_NAMEokhttp.Companion.onWarmupCompleted(f);
            }
            AppLovinCmpServiceOnCompletedListener appLovinCmpServiceOnCompletedListener = new AppLovinCmpServiceOnCompletedListener(crashWhenOnDisableTooSoonOnWarmupCompleted);
            int i3 = onWarmupCompleted + 17;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return appLovinCmpServiceOnCompletedListener;
            }
            throw null;
        }
        CaptureOutputSurfaceOccupiedQuirk.onNavigationEvent.onWarmupCompleted(f);
        throw null;
    }
}
