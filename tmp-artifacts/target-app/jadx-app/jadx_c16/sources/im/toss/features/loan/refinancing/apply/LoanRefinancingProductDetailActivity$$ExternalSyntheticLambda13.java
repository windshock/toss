package im.toss.features.loan.refinancing.apply;

import im.toss.uikit.widget.Toolbar;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanRefinancingProductDetailActivity$$ExternalSyntheticLambda13 implements Runnable {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Toolbar f$0;
    public final /* synthetic */ LoanRefinancingProductDetailActivity f$1;

    public /* synthetic */ LoanRefinancingProductDetailActivity$$ExternalSyntheticLambda13(Toolbar toolbar, LoanRefinancingProductDetailActivity loanRefinancingProductDetailActivity) {
        this.f$0 = toolbar;
        this.f$1 = loanRefinancingProductDetailActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        LoanRefinancingProductDetailActivity.onExtraCallback(this.f$0, this.f$1);
        int i4 = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
