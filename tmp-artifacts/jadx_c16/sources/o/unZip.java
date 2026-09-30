package o;

import im.toss.features.credit.ui.plus.setting.CreditPlusUnsubscribeCompletedActivity;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class unZip implements setSize<CreditPlusUnsubscribeCompletedActivity> {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public static void onExtraCallbackWithResult(CreditPlusUnsubscribeCompletedActivity creditPlusUnsubscribeCompletedActivity, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        creditPlusUnsubscribeCompletedActivity.tossRouter = sessionTrackerb;
        int i4 = onExtraCallback + 99;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
