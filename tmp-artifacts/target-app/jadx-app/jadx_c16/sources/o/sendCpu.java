package o;

import im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingGuideFragment;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class sendCpu implements setSize<LoanRefinancingGuideFragment> {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public static void onNavigationEvent(LoanRefinancingGuideFragment loanRefinancingGuideFragment, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        loanRefinancingGuideFragment.environments = zzadVar;
        if (i3 != 0) {
            throw null;
        }
    }
}
