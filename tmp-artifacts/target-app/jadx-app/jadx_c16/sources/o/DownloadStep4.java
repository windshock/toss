package o;

import im.toss.features.loan.comparison.funnel.LoanComparisonFunnelIntroFragment;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class DownloadStep4 implements setSize<LoanComparisonFunnelIntroFragment> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public static void IAuthTabCallback(LoanComparisonFunnelIntroFragment loanComparisonFunnelIntroFragment, getDummyAd getdummyad) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        loanComparisonFunnelIntroFragment.termsIntent = getdummyad;
        int i4 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
