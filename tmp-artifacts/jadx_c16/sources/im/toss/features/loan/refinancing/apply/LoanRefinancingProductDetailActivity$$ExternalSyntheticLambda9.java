package im.toss.features.loan.refinancing.apply;

import android.content.DialogInterface;
import o.getSystemVersion;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanRefinancingProductDetailActivity$$ExternalSyntheticLambda9 implements DialogInterface.OnClickListener {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ getSystemVersion f$0;
    public final /* synthetic */ LoanRefinancingProductDetailActivity f$1;

    public /* synthetic */ LoanRefinancingProductDetailActivity$$ExternalSyntheticLambda9(getSystemVersion getsystemversion, LoanRefinancingProductDetailActivity loanRefinancingProductDetailActivity) {
        this.f$0 = getsystemversion;
        this.f$1 = loanRefinancingProductDetailActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 71;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            LoanRefinancingProductDetailActivity.onNavigationEvent(this.f$0, this.f$1, dialogInterface, i);
            int i4 = 22 / 0;
        } else {
            LoanRefinancingProductDetailActivity.onNavigationEvent(this.f$0, this.f$1, dialogInterface, i);
        }
        int i5 = IAuthTabCallback + 13;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }
}
