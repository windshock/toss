package im.toss.devtool.noop.di;

import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.addLottieOnCompositionLoadedListener;

/* loaded from: classes.dex */
public final class SingletonDevToolTubaV2Module$onExtraCallbackWithResult implements addLottieOnCompositionLoadedListener {
    static int onWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(SingletonDevToolTubaV2Module$onExtraCallbackWithResult.class);

    public boolean onWarmupCompleted() {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3181);
        int i2 = onWarmupCompleted;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3045);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        if (((((i4 & i3) | (i3 ^ i4)) >> 28) & 1) == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
