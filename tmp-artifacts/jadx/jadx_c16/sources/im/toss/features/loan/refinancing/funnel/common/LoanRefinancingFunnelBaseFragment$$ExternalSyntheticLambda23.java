package im.toss.features.loan.refinancing.funnel.common;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanRefinancingFunnelBaseFragment$$ExternalSyntheticLambda23 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ LoanRefinancingFunnelBaseFragment f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ boolean f$2;

    public /* synthetic */ LoanRefinancingFunnelBaseFragment$$ExternalSyntheticLambda23(LoanRefinancingFunnelBaseFragment loanRefinancingFunnelBaseFragment, String str, boolean z) {
        this.f$0 = loanRefinancingFunnelBaseFragment;
        this.f$1 = str;
        this.f$2 = z;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            LoanRefinancingFunnelBaseFragment.onNavigationEvent(this.f$0, this.f$1, this.f$2, (Throwable) obj);
            obj2.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = LoanRefinancingFunnelBaseFragment.onNavigationEvent(this.f$0, this.f$1, this.f$2, (Throwable) obj);
        int i3 = onNavigationEvent + 121;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        obj2.hashCode();
        throw null;
    }
}
