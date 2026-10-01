package o;

import im.toss.di.SessionStorageModule;
import im.toss.splittarget.spec.fsm.AppState;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getPageContext implements captureStartValues<getCurrentApplicationStateDurationMillis> {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final createAnimators<AppState> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback();
        }
        IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getCurrentApplicationStateDurationMillis IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getCurrentApplicationStateDurationMillis getcurrentapplicationstatedurationmillisIAuthTabCallback = IAuthTabCallback((AppState) this.onWarmupCompleted.get());
        int i4 = onExtraCallback + 89;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return getcurrentapplicationstatedurationmillisIAuthTabCallback;
    }

    public static getCurrentApplicationStateDurationMillis IAuthTabCallback(AppState appState) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getCurrentApplicationStateDurationMillis getcurrentapplicationstatedurationmillis = (getCurrentApplicationStateDurationMillis) createAnimator.onNavigationEvent(SessionStorageModule.onNavigationEvent.IAuthTabCallback(appState));
        int i4 = onNavigationEvent + 61;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return getcurrentapplicationstatedurationmillis;
    }
}
