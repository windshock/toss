package o;

import im.toss.feature.credit.ui.kcbsurvey.result.KcbSurveyResultScoreRaisedActivity;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ipcMsgServerOpt implements setSize<KcbSurveyResultScoreRaisedActivity> {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    public static void onExtraCallbackWithResult(KcbSurveyResultScoreRaisedActivity kcbSurveyResultScoreRaisedActivity, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        kcbSurveyResultScoreRaisedActivity.tossRouter = sessionTrackerb;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
