package o;

import java.util.Map;

/* loaded from: classes.dex */
public final class setAppType implements getSplashView {
    static int onExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(setAppType.class);
    public static final setAppType onExtraCallbackWithResult = new setAppType();

    static {
        int i = onExtraCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4560);
        int i2 = i & iOnWarmupCompleted;
        if ((((((i ^ iOnWarmupCompleted) | i2) & (~i2)) >> 18) & 1) != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private setAppType() {
    }

    @Override // o.getSplashView
    public Map<String, String> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4780);
        int i3 = i2 & iOnWarmupCompleted;
        if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 22) & 1) == 0) {
            return access8100.onNavigationEvent();
        }
        access8100.onNavigationEvent();
        throw null;
    }
}
