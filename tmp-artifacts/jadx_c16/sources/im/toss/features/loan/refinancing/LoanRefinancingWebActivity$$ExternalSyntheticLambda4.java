package im.toss.features.loan.refinancing;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanRefinancingWebActivity$$ExternalSyntheticLambda4 implements View.OnClickListener {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ LoanRefinancingWebActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        LoanRefinancingWebActivity.onExtraCallbackWithResult(this.f$0, view);
        int i4 = IAuthTabCallback + 23;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
    }
}
