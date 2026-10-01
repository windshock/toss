package im.toss.feature.credit.ui.kcbsurvey;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KcbSurveyConfirmExitActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ KcbSurveyConfirmExitActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = KcbSurveyConfirmExitActivity.onNavigationEvent(this.f$0, (View) obj);
        int i4 = onExtraCallback + 7;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
        return unitOnNavigationEvent;
    }
}
