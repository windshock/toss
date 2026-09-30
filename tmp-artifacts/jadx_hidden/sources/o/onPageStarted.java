package o;

import android.content.Context;
import im.toss.devtool.noop.di.ActivityDevToolModule;

/* loaded from: classes.dex */
public final class onPageStarted implements captureStartValues<destroy> {
    static int onExtraCallbackWithResult = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onPageStarted.class);
    private final createAnimators<Context> onExtraCallback;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2265);
        int i3 = i2 & iOnWarmupCompleted;
        if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 11) & 1) == 0) {
            return onExtraCallback();
        }
        onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public destroy onExtraCallback() {
        Context context;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4290);
        if (((((i2 | iOnWarmupCompleted) & (~(i2 & iOnWarmupCompleted))) >> 4) & 1) != 0) {
            context = (Context) this.onExtraCallback.get();
            int i3 = 14 / 0;
        } else {
            context = (Context) this.onExtraCallback.get();
        }
        int i4 = onExtraCallbackWithResult;
        int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2570);
        int i5 = i4 & iOnWarmupCompleted2;
        int i6 = ((((i4 ^ iOnWarmupCompleted2) | i5) & (~i5)) >> 31) & 1;
        destroy destroyVarIAuthTabCallback = IAuthTabCallback(context);
        if (i6 != 0) {
            int i7 = 88 / 0;
        }
        return destroyVarIAuthTabCallback;
    }

    public static destroy IAuthTabCallback(Context context) {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(884);
        destroy destroyVar = (destroy) createAnimator.onNavigationEvent((destroy) ActivityDevToolModule.IAuthTabCallback.onExtraCallbackWithResult$5f77436(context));
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4550);
        return destroyVar;
    }
}
