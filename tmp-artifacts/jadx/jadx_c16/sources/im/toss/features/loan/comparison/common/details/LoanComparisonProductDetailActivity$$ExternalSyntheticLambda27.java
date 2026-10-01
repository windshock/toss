package im.toss.features.loan.comparison.common.details;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonProductDetailActivity$$ExternalSyntheticLambda27 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ LoanComparisonProductDetailActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            LoanComparisonProductDetailActivity.extraCallbackWithResult(this.f$0, (SetDetectableSize) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitExtraCallbackWithResult = LoanComparisonProductDetailActivity.extraCallbackWithResult(this.f$0, (SetDetectableSize) obj);
        int i3 = onNavigationEvent + 107;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitExtraCallbackWithResult;
    }
}
