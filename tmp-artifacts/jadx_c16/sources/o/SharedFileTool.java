package o;

import im.toss.features.credit.ui.plus.intro.CreditPlusSuccessPayActivity;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SharedFileTool implements setSize<CreditPlusSuccessPayActivity> {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static void onExtraCallbackWithResult(CreditPlusSuccessPayActivity creditPlusSuccessPayActivity, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        creditPlusSuccessPayActivity.tossRouter = sessionTrackerb;
        int i4 = onNavigationEvent + 97;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
