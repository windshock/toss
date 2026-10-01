package o;

import im.toss.features.loan.refinancing.funnel.input.LoanRefinancingJobDetailFragment;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class collectMemory implements setSize<LoanRefinancingJobDetailFragment> {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public static void onNavigationEvent(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, GriverLoadingDialog griverLoadingDialog) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        loanRefinancingJobDetailFragment.companySearchIntentProvider = griverLoadingDialog;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
