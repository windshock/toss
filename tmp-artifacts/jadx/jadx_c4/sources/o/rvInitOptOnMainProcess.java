package o;

import im.toss.feature.credit.ui.kcbsurvey.KcbSurveyIntroActivity;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class rvInitOptOnMainProcess implements setSize<KcbSurveyIntroActivity> {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public static void onExtraCallback(KcbSurveyIntroActivity kcbSurveyIntroActivity, getDevicePerformance getdeviceperformance) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        kcbSurveyIntroActivity.kcbSurveyApi = getdeviceperformance;
        if (i3 == 0) {
            int i4 = 71 / 0;
        }
    }

    public static void onExtraCallbackWithResult(KcbSurveyIntroActivity kcbSurveyIntroActivity, getDummyAd getdummyad) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        kcbSurveyIntroActivity.termsIntent = getdummyad;
        int i4 = onNavigationEvent + 59;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
