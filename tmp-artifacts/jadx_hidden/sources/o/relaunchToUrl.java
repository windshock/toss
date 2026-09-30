package o;

import im.toss.devtool.noop.di.SingletonDevToolTubaModule;

/* loaded from: classes.dex */
public final class relaunchToUrl implements captureStartValues<ALCFaceSDK4ExternalSyntheticLambda1> {
    static int onWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(relaunchToUrl.class);

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3792);
        ALCFaceSDK4ExternalSyntheticLambda1 aLCFaceSDK4ExternalSyntheticLambda1IAuthTabCallback = IAuthTabCallback();
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5837);
        return aLCFaceSDK4ExternalSyntheticLambda1IAuthTabCallback;
    }

    public ALCFaceSDK4ExternalSyntheticLambda1 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2457);
        int i3 = i2 & iOnWarmupCompleted;
        if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 9) & 1) == 0) {
            return onWarmupCompleted();
        }
        onWarmupCompleted();
        throw null;
    }

    public static ALCFaceSDK4ExternalSyntheticLambda1 onWarmupCompleted() {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1505);
        ALCFaceSDK4ExternalSyntheticLambda1 aLCFaceSDK4ExternalSyntheticLambda1 = (ALCFaceSDK4ExternalSyntheticLambda1) createAnimator.onNavigationEvent(SingletonDevToolTubaModule.onNavigationEvent.IAuthTabCallback());
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1505);
        return aLCFaceSDK4ExternalSyntheticLambda1;
    }
}
