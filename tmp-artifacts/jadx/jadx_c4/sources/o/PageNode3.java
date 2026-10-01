package o;

import im.toss.di.TossApiServiceModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class PageNode3 implements captureStartValues<onResourceRequest> {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final createAnimators<g1> onExtraCallback;

    public /* synthetic */ Object get() {
        onResourceRequest onresourcerequestOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onresourcerequestOnWarmupCompleted = onWarmupCompleted();
            int i3 = 84 / 0;
        } else {
            onresourcerequestOnWarmupCompleted = onWarmupCompleted();
        }
        int i4 = onNavigationEvent + 43;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return onresourcerequestOnWarmupCompleted;
    }

    public onResourceRequest onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onResourceRequest onresourcerequestOnExtraCallback = onExtraCallback((g1) this.onExtraCallback.get());
        int i4 = onNavigationEvent + 65;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return onresourcerequestOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static onResourceRequest onExtraCallback(g1 g1Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onResourceRequest onresourcerequest = (onResourceRequest) createAnimator.onNavigationEvent(TossApiServiceModule.IAuthTabCallback.access000(g1Var));
        int i4 = onNavigationEvent + 49;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return onresourcerequest;
    }
}
