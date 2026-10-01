package im.toss.features.loan.refinancing.apply;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.getSystemVersion;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanRefinancingProductDetailActivity$$ExternalSyntheticLambda36 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ getSystemVersion f$0;
    public final /* synthetic */ LoanRefinancingProductDetailActivity f$1;

    public /* synthetic */ LoanRefinancingProductDetailActivity$$ExternalSyntheticLambda36(getSystemVersion getsystemversion, LoanRefinancingProductDetailActivity loanRefinancingProductDetailActivity) {
        this.f$0 = getsystemversion;
        this.f$1 = loanRefinancingProductDetailActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = LoanRefinancingProductDetailActivity.IAuthTabCallback(this.f$0, this.f$1, (SetDetectableSize) obj);
        int i4 = onWarmupCompleted + 11;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }
}
