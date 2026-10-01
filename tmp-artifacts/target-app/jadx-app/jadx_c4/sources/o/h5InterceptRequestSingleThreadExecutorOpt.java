package o;

import im.toss.feature.credit.ui.kcbsurvey.notification.KcbSurveyNotificationTermAlreadyAgreedActivity;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class h5InterceptRequestSingleThreadExecutorOpt implements setSize<KcbSurveyNotificationTermAlreadyAgreedActivity> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public static void onExtraCallbackWithResult(KcbSurveyNotificationTermAlreadyAgreedActivity kcbSurveyNotificationTermAlreadyAgreedActivity, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        kcbSurveyNotificationTermAlreadyAgreedActivity.tossRouter = sessionTrackerb;
        int i4 = onExtraCallbackWithResult + 43;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
