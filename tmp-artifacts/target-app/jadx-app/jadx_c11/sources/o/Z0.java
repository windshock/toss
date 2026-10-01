package o;

import im.toss.splittarget.impl.fsm.AppStateImpl$$ExternalSyntheticLambda11;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class Z0 {
    public static final Z0 IAuthTabCallback = new Z0();
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 0;
    private static final int onExtraCallbackWithResult;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    private Z0() {
    }

    static {
        Object[] objArr = {charset.onExtraCallbackWithResult};
        onExtraCallbackWithResult = ((CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 869218236, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -869218230, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr)).IAuthTabCallback();
        int i = onWarmupCompleted + 45;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 77;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = onExtraCallbackWithResult;
        int i6 = i2 + 87;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }
}
