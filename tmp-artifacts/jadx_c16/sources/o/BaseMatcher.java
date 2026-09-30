package o;

import im.toss.features.credit.ui.plus.freetrial.CreditPlusFreeTrialGuideActivity;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class BaseMatcher implements setSize<CreditPlusFreeTrialGuideActivity> {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public static void IAuthTabCallback(CreditPlusFreeTrialGuideActivity creditPlusFreeTrialGuideActivity, hasRootStatusPermission hasrootstatuspermission) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        creditPlusFreeTrialGuideActivity.creditPlusApi = hasrootstatuspermission;
        if (i3 == 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static void onWarmupCompleted(CreditPlusFreeTrialGuideActivity creditPlusFreeTrialGuideActivity, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        creditPlusFreeTrialGuideActivity.tossRouter = sessionTrackerb;
        int i4 = onWarmupCompleted + 85;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void onExtraCallback(CreditPlusFreeTrialGuideActivity creditPlusFreeTrialGuideActivity, getDummyAd getdummyad) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        creditPlusFreeTrialGuideActivity.standardTermsV2Intent = getdummyad;
        int i4 = onWarmupCompleted + 103;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
        }
    }
}
