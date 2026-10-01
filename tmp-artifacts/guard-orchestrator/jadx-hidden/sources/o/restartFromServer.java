package o;

import android.content.Context;
import dagger.Lazy;
import im.toss.devtool.noop.di.SingletonDevToolTubaModule;

/* loaded from: classes.dex */
public final class restartFromServer implements captureStartValues<ALCFaceSDK4ExternalSyntheticLambda1> {
    static int onExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(restartFromServer.class);
    private final createAnimators<Context> onExtraCallbackWithResult;
    private final createAnimators<ConstraintsSizeResolverExternalSyntheticLambda0> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1348);
        ALCFaceSDK4ExternalSyntheticLambda1 aLCFaceSDK4ExternalSyntheticLambda1OnExtraCallbackWithResult = onExtraCallbackWithResult();
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(273);
        return aLCFaceSDK4ExternalSyntheticLambda1OnExtraCallbackWithResult;
    }

    public ALCFaceSDK4ExternalSyntheticLambda1 onExtraCallbackWithResult() {
        Context context;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1959);
        if (((((i2 | iOnWarmupCompleted) & (~(i2 & iOnWarmupCompleted))) >> 18) & 1) != 0) {
            context = (Context) this.onExtraCallbackWithResult.get();
            int i3 = 21 / 0;
        } else {
            context = (Context) this.onExtraCallbackWithResult.get();
        }
        ALCFaceSDK4ExternalSyntheticLambda1 aLCFaceSDK4ExternalSyntheticLambda1OnNavigationEvent = onNavigationEvent(context, clearValues.onExtraCallback(this.onWarmupCompleted));
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5782);
        return aLCFaceSDK4ExternalSyntheticLambda1OnNavigationEvent;
    }

    public static ALCFaceSDK4ExternalSyntheticLambda1 onNavigationEvent(Context context, Lazy<ConstraintsSizeResolverExternalSyntheticLambda0> lazy) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3684);
        if (((((i2 | iOnWarmupCompleted) & (~(i2 & iOnWarmupCompleted))) >> 11) & 1) == 0) {
            throw null;
        }
        ALCFaceSDK4ExternalSyntheticLambda1 aLCFaceSDK4ExternalSyntheticLambda1 = (ALCFaceSDK4ExternalSyntheticLambda1) createAnimator.onNavigationEvent(SingletonDevToolTubaModule.onNavigationEvent.onWarmupCompleted(context, lazy));
        int i3 = onExtraCallback;
        int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2570);
        if ((((((~i3) & iOnWarmupCompleted2) | ((~iOnWarmupCompleted2) & i3)) >> 16) & 1) != 0) {
            return aLCFaceSDK4ExternalSyntheticLambda1;
        }
        throw null;
    }
}
