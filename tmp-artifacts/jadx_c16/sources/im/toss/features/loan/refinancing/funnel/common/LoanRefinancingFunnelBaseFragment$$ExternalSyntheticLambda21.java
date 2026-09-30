package im.toss.features.loan.refinancing.funnel.common;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.PriorityThreadFactoryExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanRefinancingFunnelBaseFragment$$ExternalSyntheticLambda21 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ LoanRefinancingFunnelBaseFragment f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ boolean f$2;

    public /* synthetic */ LoanRefinancingFunnelBaseFragment$$ExternalSyntheticLambda21(LoanRefinancingFunnelBaseFragment loanRefinancingFunnelBaseFragment, String str, boolean z) {
        this.f$0 = loanRefinancingFunnelBaseFragment;
        this.f$1 = str;
        this.f$2 = z;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = LoanRefinancingFunnelBaseFragment.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, (PriorityThreadFactoryExternalSyntheticLambda0) obj);
        int i4 = onExtraCallback + 85;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
