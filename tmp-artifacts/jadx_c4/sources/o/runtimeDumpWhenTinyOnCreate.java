package o;

import im.toss.feature.credit.ui.main.home.raise_edge_case.CreditScoreRaiseCoolTimeActivity;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class runtimeDumpWhenTinyOnCreate implements setSize<CreditScoreRaiseCoolTimeActivity> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static void IAuthTabCallback(CreditScoreRaiseCoolTimeActivity creditScoreRaiseCoolTimeActivity, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        creditScoreRaiseCoolTimeActivity.tossRouter = sessionTrackerb;
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
