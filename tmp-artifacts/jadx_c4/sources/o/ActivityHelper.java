package o;

import im.toss.di.TossApiServiceModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ActivityHelper implements captureStartValues<onSeekEngaged> {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private final createAnimators<g1> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onSeekEngaged onseekengagedIAuthTabCallback = IAuthTabCallback();
        int i4 = IAuthTabCallback + 9;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return onseekengagedIAuthTabCallback;
        }
        throw null;
    }

    public onSeekEngaged IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onSeekEngaged onseekengagedOnWarmupCompleted = onWarmupCompleted((g1) this.onWarmupCompleted.get());
        int i4 = onNavigationEvent + 103;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return onseekengagedOnWarmupCompleted;
    }

    public static onSeekEngaged onWarmupCompleted(g1 g1Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onSeekEngaged onseekengaged = (onSeekEngaged) createAnimator.onNavigationEvent(TossApiServiceModule.IAuthTabCallback.onUnminimized(g1Var));
        int i4 = onNavigationEvent + 39;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
        return onseekengaged;
    }
}
