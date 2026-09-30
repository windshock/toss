package im.toss.features.loan.refinancing;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanRefinancingWebActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ LoanRefinancingWebActivity f$0;

    public final Object invoke(Object obj) {
        Unit unitOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnNavigationEvent = LoanRefinancingWebActivity.onNavigationEvent(this.f$0, (Throwable) obj);
            int i3 = 32 / 0;
        } else {
            unitOnNavigationEvent = LoanRefinancingWebActivity.onNavigationEvent(this.f$0, (Throwable) obj);
        }
        int i4 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
