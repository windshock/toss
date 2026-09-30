package o;

import im.toss.devtool.noop.di.SingletonDevToolModule;

/* loaded from: classes.dex */
public final class pushPage implements captureStartValues<getRenderContext> {
    static int onWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(pushPage.class);

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5931);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        if (((((i4 & i3) | (i3 ^ i4)) >> 11) & 1) == 0) {
            onExtraCallback();
            throw null;
        }
        getRenderContext getrendercontextOnExtraCallback = onExtraCallback();
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4169);
        return getrendercontextOnExtraCallback;
    }

    public getRenderContext onExtraCallback() {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1959);
        getRenderContext getrendercontextOnNavigationEvent = onNavigationEvent();
        if ((((onWarmupCompleted ^ BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1846)) >> 30) & 1) == 0) {
            int i2 = 78 / 0;
        }
        return getrendercontextOnNavigationEvent;
    }

    public static getRenderContext onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(13);
        if (((((i2 | iOnWarmupCompleted) & (~(i2 & iOnWarmupCompleted))) >> 12) & 1) != 0) {
            return (getRenderContext) createAnimator.onNavigationEvent((getRenderContext) SingletonDevToolModule.onExtraCallback.IAuthTabCallback$6f4e022d());
        }
        throw null;
    }
}
