package im.toss.features.loan.refinancing.funnel.dual;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanRefinancingResultActivity$$ExternalSyntheticLambda3 implements View.OnClickListener {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ LoanRefinancingResultActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            LoanRefinancingResultActivity.IAuthTabCallback(this.f$0, view);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LoanRefinancingResultActivity.IAuthTabCallback(this.f$0, view);
        int i3 = IAuthTabCallback + 5;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }
}
