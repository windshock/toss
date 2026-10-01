package o;

import im.toss.feature.credit.ui.kcbsurvey.result.KcbSurveyResultActivity;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class insideBizHandlerOpt implements setSize<KcbSurveyResultActivity> {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    public static void onNavigationEvent(KcbSurveyResultActivity kcbSurveyResultActivity, getAppAlias getappalias) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        kcbSurveyResultActivity.creditGatewayApi = getappalias;
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback + 37;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
