package im.toss.features.loan.refinancing.apply;

import android.content.DialogInterface;
import o.getSystemVersion;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanRefinancingProductDetailActivity$$ExternalSyntheticLambda8 implements DialogInterface.OnClickListener {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ LoanRefinancingProductDetailActivity f$0;
    public final /* synthetic */ getSystemVersion f$1;

    public /* synthetic */ LoanRefinancingProductDetailActivity$$ExternalSyntheticLambda8(LoanRefinancingProductDetailActivity loanRefinancingProductDetailActivity, getSystemVersion getsystemversion) {
        this.f$0 = loanRefinancingProductDetailActivity;
        this.f$1 = getsystemversion;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        LoanRefinancingProductDetailActivity.onExtraCallback(this.f$0, this.f$1, dialogInterface, i);
        int i5 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }
}
