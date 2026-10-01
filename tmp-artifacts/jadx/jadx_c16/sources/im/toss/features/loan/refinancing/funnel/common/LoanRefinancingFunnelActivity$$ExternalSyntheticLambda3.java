package im.toss.features.loan.refinancing.funnel.common;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanRefinancingFunnelActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ LoanRefinancingFunnelActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        LoanRefinancingFunnelActivity loanRefinancingFunnelActivity = this.f$0;
        Boolean bool = (Boolean) obj;
        if (i3 == 0) {
            return LoanRefinancingFunnelActivity.onExtraCallback(loanRefinancingFunnelActivity, bool);
        }
        Unit unitOnExtraCallback = LoanRefinancingFunnelActivity.onExtraCallback(loanRefinancingFunnelActivity, bool);
        int i4 = 49 / 0;
        return unitOnExtraCallback;
    }
}
