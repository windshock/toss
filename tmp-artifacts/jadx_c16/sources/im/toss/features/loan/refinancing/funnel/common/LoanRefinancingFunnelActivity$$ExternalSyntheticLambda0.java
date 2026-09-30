package im.toss.features.loan.refinancing.funnel.common;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanRefinancingFunnelActivity$$ExternalSyntheticLambda0 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ LoanRefinancingFunnelActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            LoanRefinancingFunnelActivity.IAuthTabCallback(this.f$0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = LoanRefinancingFunnelActivity.IAuthTabCallback(this.f$0);
        int i3 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }
}
