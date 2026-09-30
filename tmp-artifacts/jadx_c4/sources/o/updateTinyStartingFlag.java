package o;

import im.toss.feature.credit.ui.main.home.raise_edge_case.CreditPerfectScoreActivity;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class updateTinyStartingFlag implements setSize<CreditPerfectScoreActivity> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public static void onExtraCallback(CreditPerfectScoreActivity creditPerfectScoreActivity, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        creditPerfectScoreActivity.tossRouter = sessionTrackerb;
        if (i3 == 0) {
            throw null;
        }
    }
}
