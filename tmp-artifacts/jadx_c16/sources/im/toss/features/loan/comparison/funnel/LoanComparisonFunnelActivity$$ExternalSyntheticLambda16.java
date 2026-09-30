package im.toss.features.loan.comparison.funnel;

import android.content.DialogInterface;
import im.toss.features.mydata.ui.mydataPointGrowth.result.MydataPointGrowthResultScreenKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonFunnelActivity$$ExternalSyntheticLambda16 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ LoanComparisonFunnelActivity f$0;

    public final Object invoke(Object obj) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            unit = (Unit) LoanComparisonFunnelActivity.onExtraCallback(new Object[]{this.f$0, (DialogInterface) obj}, -959185882, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 959185883, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback());
            int i3 = 0 / 0;
        } else {
            unit = (Unit) LoanComparisonFunnelActivity.onExtraCallback(new Object[]{this.f$0, (DialogInterface) obj}, -959185882, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 959185883, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback());
        }
        int i4 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }
}
