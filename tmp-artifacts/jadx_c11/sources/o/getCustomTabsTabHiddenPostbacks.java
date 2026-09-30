package o;

import im.toss.splittarget.impl.fsm.AppStateImpl$$ExternalSyntheticLambda11;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getCustomTabsTabHiddenPostbacks {
    private static int IAuthTabCallback = 0;
    private static int asInterface = 1;
    private static int onExtraCallback = 0;
    public static final getCustomTabsTabHiddenPostbacks onExtraCallbackWithResult = new getCustomTabsTabHiddenPostbacks();
    private static int onNavigationEvent = 1;
    private static final int onWarmupCompleted;

    private getCustomTabsTabHiddenPostbacks() {
    }

    static {
        Object[] objArr = {charset.onExtraCallbackWithResult};
        onWarmupCompleted = ((CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 869218236, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -869218230, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr)).onExtraCallbackWithResult();
        int i = onNavigationEvent + 11;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 7;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = onWarmupCompleted;
        int i6 = i2 + 31;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }
}
