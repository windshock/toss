package o;

import im.toss.features.loan.refinancing.funnel.LoanRefinancingPollingFragment;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class setDevName implements setSize<LoanRefinancingPollingFragment> {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public static void onWarmupCompleted(LoanRefinancingPollingFragment loanRefinancingPollingFragment, trackCheckout trackcheckout) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        loanRefinancingPollingFragment.notificationHelper = trackcheckout;
        int i4 = IAuthTabCallback + 103;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
