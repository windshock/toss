package o;

import im.toss.di.TossApiServiceModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setEmbedPage implements captureStartValues<enablePreloadSwitchOpt> {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final createAnimators<g1> onExtraCallback;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        enablePreloadSwitchOpt enablepreloadswitchoptOnWarmupCompleted = onWarmupCompleted();
        int i4 = IAuthTabCallback + 75;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return enablepreloadswitchoptOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public enablePreloadSwitchOpt onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        enablePreloadSwitchOpt enablepreloadswitchoptOnNavigationEvent = onNavigationEvent((g1) this.onExtraCallback.get());
        int i4 = onNavigationEvent + 25;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return enablepreloadswitchoptOnNavigationEvent;
    }

    public static enablePreloadSwitchOpt onNavigationEvent(g1 g1Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        enablePreloadSwitchOpt enablepreloadswitchopt = (enablePreloadSwitchOpt) createAnimator.onNavigationEvent(TossApiServiceModule.IAuthTabCallback.onTransact(g1Var));
        int i4 = onNavigationEvent + 9;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
        return enablepreloadswitchopt;
    }
}
