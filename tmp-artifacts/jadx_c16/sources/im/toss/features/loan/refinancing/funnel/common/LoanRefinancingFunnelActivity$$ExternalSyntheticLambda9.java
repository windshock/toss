package im.toss.features.loan.refinancing.funnel.common;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.CommonModule_setLeftEdgeTouchEnabled;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanRefinancingFunnelActivity$$ExternalSyntheticLambda9 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ LoanRefinancingFunnelActivity f$0;

    public final Object invoke(Object obj) {
        Unit unitOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnWarmupCompleted = LoanRefinancingFunnelActivity.onWarmupCompleted(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj);
            int i3 = 65 / 0;
        } else {
            unitOnWarmupCompleted = LoanRefinancingFunnelActivity.onWarmupCompleted(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj);
        }
        int i4 = onExtraCallback + 91;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }
}
