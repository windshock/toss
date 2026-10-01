package o;

import im.toss.di.TossObservabilityModule;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ActivityHelper1 implements captureStartValues<Set<String>> {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Set<String> setOnExtraCallback = onExtraCallback();
        int i4 = onWarmupCompleted + 107;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return setOnExtraCallback;
    }

    public Set<String> onExtraCallback() {
        Set<String> setOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            setOnNavigationEvent = onNavigationEvent();
            int i3 = 93 / 0;
        } else {
            setOnNavigationEvent = onNavigationEvent();
        }
        int i4 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return setOnNavigationEvent;
        }
        throw null;
    }

    public static Set<String> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Set<String> setOnWarmupCompleted = TossObservabilityModule.onNavigationEvent.onWarmupCompleted();
        if (i3 == 0) {
            return (Set) createAnimator.onNavigationEvent(setOnWarmupCompleted);
        }
        int i4 = 1 / 0;
        return (Set) createAnimator.onNavigationEvent(setOnWarmupCompleted);
    }
}
