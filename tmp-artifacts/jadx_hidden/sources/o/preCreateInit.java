package o;

import android.content.Context;
import im.toss.devtool.noop.di.SingletonDevToolModule;

/* loaded from: classes.dex */
public final class preCreateInit implements captureStartValues<destroy> {
    static int onExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(preCreateInit.class);
    private final createAnimators<Context> onNavigationEvent;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3887);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        if (((((i4 & i3) | (i3 ^ i4)) >> 17) & 1) == 0) {
            return onExtraCallbackWithResult();
        }
        onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public destroy onExtraCallbackWithResult() {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1851);
        destroy destroyVarOnWarmupCompleted = onWarmupCompleted((Context) this.onNavigationEvent.get());
        int i2 = onExtraCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2434);
        if (((((i2 | iOnWarmupCompleted) & (~(i2 & iOnWarmupCompleted))) >> 21) & 1) != 0) {
            return destroyVarOnWarmupCompleted;
        }
        throw null;
    }

    public static destroy onWarmupCompleted(Context context) {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5109);
        destroy destroyVar = (destroy) createAnimator.onNavigationEvent((destroy) SingletonDevToolModule.onExtraCallback.onWarmupCompleted$5f77436(context));
        int i2 = onExtraCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3068);
        int i3 = i2 & iOnWarmupCompleted;
        if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 3) & 1) != 0) {
            int i4 = 81 / 0;
        }
        return destroyVar;
    }
}
