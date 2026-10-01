package o;

import dagger.Lazy;
import im.toss.tracker.api.CoreLogStoreModule;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class I_ implements captureStartValues<ComputeDistances> {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final createAnimators<AFj1mSDK2> IAuthTabCallback;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ComputeDistances computeDistancesIAuthTabCallback = IAuthTabCallback();
        int i4 = onExtraCallback + 47;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return computeDistancesIAuthTabCallback;
    }

    public ComputeDistances IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ComputeDistances computeDistancesOnExtraCallbackWithResult = onExtraCallbackWithResult(clearValues.onExtraCallback(this.IAuthTabCallback));
        if (i3 != 0) {
            int i4 = 6 / 0;
        }
        return computeDistancesOnExtraCallbackWithResult;
    }

    public static ComputeDistances onExtraCallbackWithResult(Lazy<AFj1mSDK2> lazy) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ComputeDistances computeDistances = (ComputeDistances) createAnimator.onNavigationEvent(CoreLogStoreModule.IAuthTabCallback.onNavigationEvent(lazy));
        int i4 = onWarmupCompleted + 101;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return computeDistances;
    }
}
