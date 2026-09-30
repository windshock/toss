package im.toss.features.loan.refinancing.funnel.common;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanRefinancingFunnelActivity$$ExternalSyntheticLambda8 implements View.OnClickListener {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ LoanRefinancingFunnelActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            LoanRefinancingFunnelActivity.onExtraCallbackWithResult(this.f$0, view);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LoanRefinancingFunnelActivity.onExtraCallbackWithResult(this.f$0, view);
        int i3 = onExtraCallback + 41;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }
}
