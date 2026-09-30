package im.toss.features.loan.comparison.common;

import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonAppliedListActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ LoanComparisonAppliedListActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (Throwable) obj};
        Unit unit = (Unit) LoanComparisonAppliedListActivity.onExtraCallbackWithResult(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), objArr, 1122910678, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -1122910677);
        int i4 = onWarmupCompleted + 89;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
        return unit;
    }
}
