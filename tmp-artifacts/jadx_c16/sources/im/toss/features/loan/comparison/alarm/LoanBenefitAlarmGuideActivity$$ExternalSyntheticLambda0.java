package im.toss.features.loan.comparison.alarm;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanBenefitAlarmGuideActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LoanBenefitAlarmGuideActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            LoanBenefitAlarmGuideActivity.onExtraCallbackWithResult(this.f$0, (View) obj);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = LoanBenefitAlarmGuideActivity.onExtraCallbackWithResult(this.f$0, (View) obj);
        int i3 = onWarmupCompleted + 95;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }
}
