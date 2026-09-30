package im.toss.features.loan.refinancing.apply;

import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.getSystemVersion;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanRefinancingProductDetailActivity$$ExternalSyntheticLambda7 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ getSystemVersion f$0;
    public final /* synthetic */ LoanRefinancingProductDetailActivity f$1;

    public /* synthetic */ LoanRefinancingProductDetailActivity$$ExternalSyntheticLambda7(getSystemVersion getsystemversion, LoanRefinancingProductDetailActivity loanRefinancingProductDetailActivity) {
        this.f$0 = getsystemversion;
        this.f$1 = loanRefinancingProductDetailActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getSystemVersion getsystemversion = this.f$0;
        if (i3 == 0) {
            return LoanRefinancingProductDetailActivity.onNavigationEvent(getsystemversion, this.f$1, (SetDetectableSize) obj);
        }
        LoanRefinancingProductDetailActivity.onNavigationEvent(getsystemversion, this.f$1, (SetDetectableSize) obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
