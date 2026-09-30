package o;

import im.toss.feature.credit.ui.kcbsurvey.KcbSurveyConfirmExitActivity;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class qosLevelOpt implements setSize<KcbSurveyConfirmExitActivity> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    public static void onNavigationEvent(KcbSurveyConfirmExitActivity kcbSurveyConfirmExitActivity, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        kcbSurveyConfirmExitActivity.tossRouter = sessionTrackerb;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
