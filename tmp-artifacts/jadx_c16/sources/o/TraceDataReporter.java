package o;

import im.toss.features.loan.refinancing.funnel.input.LoanRefinancingRrnFragment;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class TraceDataReporter implements setSize<LoanRefinancingRrnFragment> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    public static void IAuthTabCallback(LoanRefinancingRrnFragment loanRefinancingRrnFragment, mediationData mediationdata) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        loanRefinancingRrnFragment.api = mediationdata;
        int i4 = onExtraCallback + 41;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void onNavigationEvent(LoanRefinancingRrnFragment loanRefinancingRrnFragment, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        loanRefinancingRrnFragment.injectedEnvironments = zzadVar;
        if (i3 != 0) {
            int i4 = 17 / 0;
        }
    }
}
