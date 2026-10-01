package o;

import im.toss.features.loan.home.LoanHomeActivity;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class checkRuntimeMatched implements setSize<LoanHomeActivity> {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public static void onExtraCallbackWithResult(LoanHomeActivity loanHomeActivity, enableOrientationOpt enableorientationopt) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        loanHomeActivity.scoreDataSource = enableorientationopt;
        int i4 = IAuthTabCallback + 103;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void onNavigationEvent(LoanHomeActivity loanHomeActivity, mediationData mediationdata) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        loanHomeActivity.loanGatewayApis = mediationdata;
        int i4 = IAuthTabCallback + 73;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void IAuthTabCallback(LoanHomeActivity loanHomeActivity, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        loanHomeActivity.tossRouter = sessionTrackerb;
        if (i3 != 0) {
            int i4 = 39 / 0;
        }
        int i5 = onWarmupCompleted + 93;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void onWarmupCompleted(LoanHomeActivity loanHomeActivity, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        loanHomeActivity.injectedEnvironments = zzadVar;
        int i4 = IAuthTabCallback + 121;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
