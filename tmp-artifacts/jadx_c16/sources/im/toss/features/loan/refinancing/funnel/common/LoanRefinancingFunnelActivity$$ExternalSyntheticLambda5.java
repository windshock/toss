package im.toss.features.loan.refinancing.funnel.common;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanRefinancingFunnelActivity$$ExternalSyntheticLambda5 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ LoanRefinancingFunnelActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = LoanRefinancingFunnelActivity.onNavigationEvent(this.f$0, (Unit) obj);
        if (i3 == 0) {
            int i4 = 65 / 0;
        }
        return unitOnNavigationEvent;
    }
}
