package o;

import dagger.Lazy;
import im.toss.tracker.api.CoreLogStoreModule;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class J_ implements captureStartValues<ComputeDistances> {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final createAnimators<AFj1nSDK1> onExtraCallbackWithResult;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent();
        }
        onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ComputeDistances onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(clearValues.onExtraCallback(this.onExtraCallbackWithResult));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ComputeDistances computeDistancesOnExtraCallbackWithResult = onExtraCallbackWithResult(clearValues.onExtraCallback(this.onExtraCallbackWithResult));
        int i3 = onExtraCallback + 9;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 77 / 0;
        }
        return computeDistancesOnExtraCallbackWithResult;
    }

    public static ComputeDistances onExtraCallbackWithResult(Lazy<AFj1nSDK1> lazy) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ComputeDistances computeDistances = (ComputeDistances) createAnimator.onNavigationEvent(CoreLogStoreModule.IAuthTabCallback.onExtraCallback(lazy));
        int i4 = onExtraCallback + 7;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return computeDistances;
    }
}
