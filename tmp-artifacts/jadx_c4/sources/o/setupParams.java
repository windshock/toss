package o;

import im.toss.di.TossJniModule;
import viva.republica.toss.tossjni.RequiredBridge;
import viva.republica.toss.tossjni.TossJNI;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setupParams implements captureStartValues<TossJNI> {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final createAnimators<PausedInDebuggerOverlayDialogManagerExternalSyntheticLambda2> IAuthTabCallback;
    private final createAnimators<RequiredBridge> onExtraCallback;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TossJNI tossJNIOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i3 = onWarmupCompleted + 125;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return tossJNIOnExtraCallbackWithResult;
    }

    public TossJNI onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TossJNI tossJNIIAuthTabCallback = IAuthTabCallback((RequiredBridge) this.onExtraCallback.get(), (PausedInDebuggerOverlayDialogManagerExternalSyntheticLambda2) this.IAuthTabCallback.get());
        int i4 = onWarmupCompleted + 113;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
        return tossJNIIAuthTabCallback;
    }

    public static TossJNI IAuthTabCallback(RequiredBridge requiredBridge, PausedInDebuggerOverlayDialogManagerExternalSyntheticLambda2 pausedInDebuggerOverlayDialogManagerExternalSyntheticLambda2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TossJNI tossJNI = (TossJNI) createAnimator.onNavigationEvent(TossJniModule.onExtraCallbackWithResult.onExtraCallback(requiredBridge, pausedInDebuggerOverlayDialogManagerExternalSyntheticLambda2));
        int i4 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return tossJNI;
        }
        throw null;
    }
}
