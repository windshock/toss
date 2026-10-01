package im.toss.features.loan.refinancing;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.PriorityThreadFactoryExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanRefinancingWebActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ LoanRefinancingWebActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            LoanRefinancingWebActivity.onNavigationEvent(this.f$0, (PriorityThreadFactoryExternalSyntheticLambda0) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = LoanRefinancingWebActivity.onNavigationEvent(this.f$0, (PriorityThreadFactoryExternalSyntheticLambda0) obj);
        int i3 = onExtraCallbackWithResult + 1;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }
}
