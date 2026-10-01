package o;

import im.toss.di.TossApiServiceModule;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class afterProcess implements captureStartValues<onFullscreenBackground> {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final createAnimators<g1> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onFullscreenBackground onfullscreenbackgroundIAuthTabCallback = IAuthTabCallback();
        int i4 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return onfullscreenbackgroundIAuthTabCallback;
        }
        throw null;
    }

    public onFullscreenBackground IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onFullscreenBackground onfullscreenbackgroundOnNavigationEvent = onNavigationEvent((g1) this.onWarmupCompleted.get());
        int i4 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return onfullscreenbackgroundOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static onFullscreenBackground onNavigationEvent(g1 g1Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onFullscreenBackground onfullscreenbackground = (onFullscreenBackground) createAnimator.onNavigationEvent(TossApiServiceModule.IAuthTabCallback.ICustomTabsCallback(g1Var));
        if (i3 != 0) {
            return onfullscreenbackground;
        }
        throw null;
    }
}
