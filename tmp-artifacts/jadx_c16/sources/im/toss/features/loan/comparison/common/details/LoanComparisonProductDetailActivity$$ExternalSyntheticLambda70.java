package im.toss.features.loan.comparison.common.details;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonProductDetailActivity$$ExternalSyntheticLambda70 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ LoanComparisonProductDetailActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = LoanComparisonProductDetailActivity.onExtraCallbackWithResult(this.f$0, (Throwable) obj);
        int i4 = IAuthTabCallback + 57;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 45 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }
}
