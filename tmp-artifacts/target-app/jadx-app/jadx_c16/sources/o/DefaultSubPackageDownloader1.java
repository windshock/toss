package o;

import im.toss.features.loan.home.LoanRefinancingListFragment;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class DefaultSubPackageDownloader1 implements setSize<LoanRefinancingListFragment> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    public static void onNavigationEvent(LoanRefinancingListFragment loanRefinancingListFragment, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        loanRefinancingListFragment.tossRouter = sessionTrackerb;
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 95;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
