package im.toss.features.loan.common;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.PriorityThreadFactoryExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonWebViewActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ LoanComparisonWebViewActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = LoanComparisonWebViewActivity.onWarmupCompleted(this.f$0, (PriorityThreadFactoryExternalSyntheticLambda0) obj);
        int i4 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
