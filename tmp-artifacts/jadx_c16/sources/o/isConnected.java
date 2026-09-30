package o;

import im.toss.features.loan.refinancing.funnel.schedule.LoanRefinancingSchedulePreScreenFragment;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class isConnected implements setSize<LoanRefinancingSchedulePreScreenFragment> {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public static void IAuthTabCallback(LoanRefinancingSchedulePreScreenFragment loanRefinancingSchedulePreScreenFragment, trackCheckout trackcheckout) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        loanRefinancingSchedulePreScreenFragment.notificationHelper = trackcheckout;
        int i4 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 66 / 0;
        }
    }
}
