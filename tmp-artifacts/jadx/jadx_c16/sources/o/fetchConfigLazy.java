package o;

import im.toss.di.TossApiServiceModule;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class fetchConfigLazy implements captureStartValues<disengageSeek> {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final createAnimators<g1> onExtraCallback;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        disengageSeek disengageseekOnNavigationEvent = onNavigationEvent();
        if (i3 != 0) {
            int i4 = 42 / 0;
        }
        return disengageseekOnNavigationEvent;
    }

    public disengageSeek onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        g1 g1Var = (g1) this.onExtraCallback.get();
        if (i3 == 0) {
            return onWarmupCompleted(g1Var);
        }
        onWarmupCompleted(g1Var);
        throw null;
    }

    public static disengageSeek onWarmupCompleted(g1 g1Var) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        disengageSeek disengageseek = (disengageSeek) createAnimator.onNavigationEvent(TossApiServiceModule.IAuthTabCallback.ICustomTabsCallbackDefault(g1Var));
        int i3 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return disengageseek;
    }
}
