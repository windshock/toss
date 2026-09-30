package im.toss.features.loan.comparison.funnel;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.CommonModule_setLeftEdgeTouchEnabled;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonFunnelActivity$$ExternalSyntheticLambda8 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ LoanComparisonFunnelActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = LoanComparisonFunnelActivity.onNavigationEvent(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj);
        int i4 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return unitOnNavigationEvent;
    }
}
