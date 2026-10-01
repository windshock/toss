package im.toss.features.loan.comparison.funnel;

import im.toss.features.mydata.ui.mydataPointGrowth.result.MydataPointGrowthResultScreenKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonFunnelActivity$$ExternalSyntheticLambda12 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ LoanComparisonFunnelActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        Unit unit = (Unit) LoanComparisonFunnelActivity.onExtraCallback(new Object[]{this.f$0, (Unit) obj}, -1146856639, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 1146856647, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback());
        int i3 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 15 / 0;
        }
        return unit;
    }
}
