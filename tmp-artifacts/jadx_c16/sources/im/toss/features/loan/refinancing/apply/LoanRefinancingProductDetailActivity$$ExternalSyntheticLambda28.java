package im.toss.features.loan.refinancing.apply;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanRefinancingProductDetailActivity$$ExternalSyntheticLambda28 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ LoanRefinancingProductDetailActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = LoanRefinancingProductDetailActivity.onExtraCallbackWithResult(this.f$0, (Boolean) obj);
        int i4 = onNavigationEvent + 1;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
