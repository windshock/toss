package o;

import im.toss.feature.credit.ui.quiz.qna.CreditQuizActivity;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AppLeaveHintPoint implements setSize<CreditQuizActivity> {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public static void onNavigationEvent(CreditQuizActivity creditQuizActivity, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        creditQuizActivity.tossRouter = sessionTrackerb;
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
