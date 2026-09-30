package o;

import im.toss.devtool.noop.di.DevToolWebModules;

/* loaded from: classes.dex */
public final class popPage implements captureStartValues<getStartToken> {
    static int IAuthTabCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(popPage.class);

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4498);
        getStartToken getstarttokenIAuthTabCallback = IAuthTabCallback();
        if ((((IAuthTabCallback ^ BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2434)) >> 14) & 1) == 0) {
            return getstarttokenIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getStartToken IAuthTabCallback() {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2665);
        getStartToken getstarttokenOnNavigationEvent = onNavigationEvent();
        int i2 = IAuthTabCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(126);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        if (((((i4 & i3) | (i3 ^ i4)) >> 6) & 1) == 0) {
            int i5 = 25 / 0;
        }
        return getstarttokenOnNavigationEvent;
    }

    public static getStartToken onNavigationEvent() {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4560);
        getStartToken getstarttoken = (getStartToken) createAnimator.onNavigationEvent((getStartToken) DevToolWebModules.onNavigationEvent.onExtraCallbackWithResult$49f84639());
        int i2 = IAuthTabCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5161);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        if (((((i4 & i3) | (i3 ^ i4)) >> 10) & 1) != 0) {
            return getstarttoken;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
