package im.toss.features.loan.refinancing.funnel.common;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanRefinancingFunnelActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ LoanRefinancingFunnelActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = LoanRefinancingFunnelActivity.onNavigationEvent(this.f$0, (Throwable) obj);
        int i4 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
