package im.toss.feature.credit.ui.kcbsurvey;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KcbSurveyConfirmExitActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ KcbSurveyConfirmExitActivity f$0;

    public final Object invoke(Object obj) {
        Unit unitOnExtraCallback;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnExtraCallback = KcbSurveyConfirmExitActivity.onExtraCallback(this.f$0, (View) obj);
            int i3 = 44 / 0;
        } else {
            unitOnExtraCallback = KcbSurveyConfirmExitActivity.onExtraCallback(this.f$0, (View) obj);
        }
        int i4 = onExtraCallback + 75;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 47 / 0;
        }
        return unitOnExtraCallback;
    }
}
