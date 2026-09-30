package o;

import im.toss.features.credit.ui.plus.setting.CreditPlusUnsubscribeBenefitActivity;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getLibCoreOsStat implements setSize<CreditPlusUnsubscribeBenefitActivity> {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static void onExtraCallback(CreditPlusUnsubscribeBenefitActivity creditPlusUnsubscribeBenefitActivity, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        creditPlusUnsubscribeBenefitActivity.tossRouter = sessionTrackerb;
        if (i3 != 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 13;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void IAuthTabCallback(CreditPlusUnsubscribeBenefitActivity creditPlusUnsubscribeBenefitActivity, hasRootStatusPermission hasrootstatuspermission) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        creditPlusUnsubscribeBenefitActivity.creditPlusApi = hasrootstatuspermission;
        if (i3 != 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 1;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
