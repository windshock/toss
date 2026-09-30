package o;

import im.toss.feature.credit.ui.main.report.CreditScoreReportActivity;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class PowerGradeJudgement implements setSize<CreditScoreReportActivity> {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    public static void onExtraCallbackWithResult(CreditScoreReportActivity creditScoreReportActivity, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        creditScoreReportActivity.tossRouter = sessionTrackerb;
        int i4 = IAuthTabCallback + 9;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
