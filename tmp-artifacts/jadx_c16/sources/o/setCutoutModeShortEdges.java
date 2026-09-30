package o;

import im.toss.di.TossApiServiceModule;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class setCutoutModeShortEdges implements captureStartValues<onPaused> {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final createAnimators<g1> onExtraCallback;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onPaused onpausedOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
        return onpausedOnExtraCallbackWithResult;
    }

    public onPaused onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onPaused onpausedOnExtraCallback = onExtraCallback((g1) this.onExtraCallback.get());
        int i4 = IAuthTabCallback + 1;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return onpausedOnExtraCallback;
    }

    public static onPaused onExtraCallback(g1 g1Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onPaused onpaused = (onPaused) createAnimator.onNavigationEvent(TossApiServiceModule.IAuthTabCallback.onRelationshipValidationResult(g1Var));
        if (i3 == 0) {
            return onpaused;
        }
        throw null;
    }
}
