package o;

import im.toss.di.TossApiServiceModule;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class PageNode8 implements captureStartValues<onFullscreenForeground> {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final createAnimators<g1> IAuthTabCallback;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent();
        }
        onNavigationEvent();
        throw null;
    }

    public onFullscreenForeground onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        g1 g1Var = (g1) this.IAuthTabCallback.get();
        if (i3 == 0) {
            return onWarmupCompleted(g1Var);
        }
        onWarmupCompleted(g1Var);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static onFullscreenForeground onWarmupCompleted(g1 g1Var) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onFullscreenForeground onfullscreenforeground = (onFullscreenForeground) createAnimator.onNavigationEvent(TossApiServiceModule.IAuthTabCallback.onActivityResized(g1Var));
        int i4 = onNavigationEvent + 83;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return onfullscreenforeground;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
