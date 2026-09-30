package im.toss.features.loan.refinancing.apply;

import o.deserializeDecimalCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanRefinancingProductDetailActivity$$ExternalSyntheticLambda26 implements deserializeDecimalCollection {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ LoanRefinancingProductDetailActivity f$0;

    public final void run() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            LoanRefinancingProductDetailActivity.onExtraCallback(this.f$0);
            throw null;
        }
        LoanRefinancingProductDetailActivity.onExtraCallback(this.f$0);
        int i3 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }
}
