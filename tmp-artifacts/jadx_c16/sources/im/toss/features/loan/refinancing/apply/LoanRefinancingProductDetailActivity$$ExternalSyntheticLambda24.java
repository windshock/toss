package im.toss.features.loan.refinancing.apply;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.deserializeUriNullableCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanRefinancingProductDetailActivity$$ExternalSyntheticLambda24 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LoanRefinancingProductDetailActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = LoanRefinancingProductDetailActivity.onWarmupCompleted(this.f$0, (deserializeUriNullableCollection) obj);
        int i4 = onWarmupCompleted + 21;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
