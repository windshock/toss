package o;

import im.toss.feature.credit.ui.kcbsurvey.notification.KcbSurveyNotificationTermActivity;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class h5DelegateNetworkOpt implements setSize<KcbSurveyNotificationTermActivity> {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public static void onExtraCallback(KcbSurveyNotificationTermActivity kcbSurveyNotificationTermActivity, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        kcbSurveyNotificationTermActivity.tossRouter = sessionTrackerb;
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallback + 101;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
    }

    public static void onExtraCallback(KcbSurveyNotificationTermActivity kcbSurveyNotificationTermActivity, getDummyAd getdummyad) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        kcbSurveyNotificationTermActivity.termsIntent = getdummyad;
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
        int i5 = onExtraCallback + 47;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }
}
