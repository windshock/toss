package o;

import im.toss.devtool.noop.di.DevToolNetworkModules;

/* loaded from: classes.dex */
public final class onRestart implements captureStartValues<getSplashView> {
    static int onExtraCallbackWithResult = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onRestart.class);

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2171);
        getSplashView getsplashviewOnNavigationEvent = onNavigationEvent();
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5489);
        return getsplashviewOnNavigationEvent;
    }

    public getSplashView onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2782);
        int i3 = i2 & iOnWarmupCompleted;
        if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 26) & 1) != 0) {
            return IAuthTabCallback();
        }
        IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static getSplashView IAuthTabCallback() {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2265);
        getSplashView getsplashview = (getSplashView) createAnimator.onNavigationEvent((getSplashView) DevToolNetworkModules.onNavigationEvent.onExtraCallback$2257361c());
        int i2 = onExtraCallbackWithResult;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(432);
        int i3 = i2 & iOnWarmupCompleted;
        if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 11) & 1) == 0) {
            return getsplashview;
        }
        throw null;
    }
}
