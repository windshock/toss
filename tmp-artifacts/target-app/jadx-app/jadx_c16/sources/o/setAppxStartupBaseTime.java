package o;

import im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingInterruptFragment;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class setAppxStartupBaseTime implements setSize<LoanRefinancingInterruptFragment> {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    public static void onExtraCallback(LoanRefinancingInterruptFragment loanRefinancingInterruptFragment, trackCheckout trackcheckout) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        loanRefinancingInterruptFragment.notificationHelper = trackcheckout;
        int i4 = IAuthTabCallback + 45;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 93 / 0;
        }
    }
}
