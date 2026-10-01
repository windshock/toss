package o;

import im.toss.di.TossApiServiceModule;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class notifyRenderReady implements captureStartValues<CacheFlag> {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final createAnimators<g1> onNavigationEvent;

    public /* synthetic */ Object get() {
        CacheFlag cacheFlagOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            cacheFlagOnWarmupCompleted = onWarmupCompleted();
            int i3 = 24 / 0;
        } else {
            cacheFlagOnWarmupCompleted = onWarmupCompleted();
        }
        int i4 = onWarmupCompleted + 3;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return cacheFlagOnWarmupCompleted;
        }
        throw null;
    }

    public CacheFlag onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CacheFlag cacheFlagIAuthTabCallback = IAuthTabCallback((g1) this.onNavigationEvent.get());
        int i4 = onWarmupCompleted + 113;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return cacheFlagIAuthTabCallback;
    }

    public static CacheFlag IAuthTabCallback(g1 g1Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CacheFlag cacheFlagOnExtraCallbackWithResult = TossApiServiceModule.IAuthTabCallback.onExtraCallbackWithResult(g1Var);
        if (i3 == 0) {
            return (CacheFlag) createAnimator.onNavigationEvent(cacheFlagOnExtraCallbackWithResult);
        }
        int i4 = 90 / 0;
        return (CacheFlag) createAnimator.onNavigationEvent(cacheFlagOnExtraCallbackWithResult);
    }
}
