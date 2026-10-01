package o;

import im.toss.feature.credit.ui.main.home.loan_needs.ScoreRaiseLoanNeedsActivity;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class netLess implements setSize<ScoreRaiseLoanNeedsActivity> {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static void onNavigationEvent(ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        scoreRaiseLoanNeedsActivity.tossRouter = sessionTrackerb;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
