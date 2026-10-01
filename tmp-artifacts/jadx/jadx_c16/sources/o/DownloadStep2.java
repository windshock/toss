package o;

import im.toss.features.loan.comparison.funnel.LoanComparisonFunnelJobDetailFragment;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class DownloadStep2 implements setSize<LoanComparisonFunnelJobDetailFragment> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public static void IAuthTabCallback(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, GriverLoadingDialog griverLoadingDialog) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        loanComparisonFunnelJobDetailFragment.companySearchIntentProvider = griverLoadingDialog;
        int i4 = IAuthTabCallback + 11;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
