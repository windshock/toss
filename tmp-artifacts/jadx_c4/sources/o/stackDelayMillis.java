package o;

import im.toss.feature.credit.ui.kcbsurvey.KcbSurveyLabActivity;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class stackDelayMillis implements setSize<KcbSurveyLabActivity> {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public static void onNavigationEvent(KcbSurveyLabActivity kcbSurveyLabActivity, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        kcbSurveyLabActivity.environments = zzadVar;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void onExtraCallbackWithResult(KcbSurveyLabActivity kcbSurveyLabActivity, getDevicePerformance getdeviceperformance) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        kcbSurveyLabActivity.kcbSurveyApi = getdeviceperformance;
        int i4 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
