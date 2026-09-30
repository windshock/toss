package im.toss.features.loan.comparison.alarm;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanBenefitAlarmGuideActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ LoanBenefitAlarmGuideActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = LoanBenefitAlarmGuideActivity.onExtraCallbackWithResult(this.f$0, (SetDetectableSize) obj);
        int i4 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }
}
