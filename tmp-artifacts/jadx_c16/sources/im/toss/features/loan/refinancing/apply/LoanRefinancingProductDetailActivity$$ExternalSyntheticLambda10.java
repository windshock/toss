package im.toss.features.loan.refinancing.apply;

import android.content.DialogInterface;
import o.getSystemVersion;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanRefinancingProductDetailActivity$$ExternalSyntheticLambda10 implements DialogInterface.OnShowListener {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ getSystemVersion f$0;
    public final /* synthetic */ LoanRefinancingProductDetailActivity f$1;

    public /* synthetic */ LoanRefinancingProductDetailActivity$$ExternalSyntheticLambda10(getSystemVersion getsystemversion, LoanRefinancingProductDetailActivity loanRefinancingProductDetailActivity) {
        this.f$0 = getsystemversion;
        this.f$1 = loanRefinancingProductDetailActivity;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        LoanRefinancingProductDetailActivity.onExtraCallback(this.f$0, this.f$1, dialogInterface);
        int i4 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
