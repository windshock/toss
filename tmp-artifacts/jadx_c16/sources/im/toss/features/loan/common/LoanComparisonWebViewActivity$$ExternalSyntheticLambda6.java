package im.toss.features.loan.common;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonWebViewActivity$$ExternalSyntheticLambda6 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ LoanComparisonWebViewActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = LoanComparisonWebViewActivity.IAuthTabCallback(this.f$0);
        int i4 = onWarmupCompleted + 97;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
