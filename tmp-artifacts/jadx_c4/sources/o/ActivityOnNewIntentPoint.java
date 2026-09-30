package o;

import im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageActivity;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ActivityOnNewIntentPoint implements setSize<CreditQuizMyPageActivity> {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static void onWarmupCompleted(CreditQuizMyPageActivity creditQuizMyPageActivity, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        creditQuizMyPageActivity.tossRouter = sessionTrackerb;
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
    }

    public static void onExtraCallback(CreditQuizMyPageActivity creditQuizMyPageActivity, getAppAlias getappalias) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        creditQuizMyPageActivity.creditGatewayApi = getappalias;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void onWarmupCompleted(CreditQuizMyPageActivity creditQuizMyPageActivity, getDummyAd getdummyad) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        creditQuizMyPageActivity.termsIntent = getdummyad;
        int i4 = onWarmupCompleted + 9;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
        }
    }
}
