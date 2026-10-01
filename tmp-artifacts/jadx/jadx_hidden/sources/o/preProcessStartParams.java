package o;

import android.content.Context;
import im.toss.devtool.noop.di.SingletonDevToolModule;

/* loaded from: classes.dex */
public final class preProcessStartParams implements captureStartValues<getStartParams> {
    static int onWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(preProcessStartParams.class);
    private final createAnimators<Context> onExtraCallback;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        if ((((onWarmupCompleted ^ BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1560)) >> 3) & 1) != 0) {
            return onWarmupCompleted();
        }
        int i2 = 93 / 0;
        return onWarmupCompleted();
    }

    public getStartParams onWarmupCompleted() {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5772);
        getStartParams getstartparamsOnNavigationEvent = onNavigationEvent((Context) this.onExtraCallback.get());
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1114);
        return getstartparamsOnNavigationEvent;
    }

    public static getStartParams onNavigationEvent(Context context) {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5837);
        getStartParams getstartparams = (getStartParams) createAnimator.onNavigationEvent((getStartParams) SingletonDevToolModule.onExtraCallback.onExtraCallback$7b276ac0(context));
        int i2 = onWarmupCompleted;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2717);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        if (((((i4 & i3) | (i3 ^ i4)) >> 7) & 1) == 0) {
            return getstartparams;
        }
        throw null;
    }
}
