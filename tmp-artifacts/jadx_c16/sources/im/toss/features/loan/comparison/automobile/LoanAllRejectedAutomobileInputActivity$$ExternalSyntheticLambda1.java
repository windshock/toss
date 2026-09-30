package im.toss.features.loan.comparison.automobile;

import im.toss.tds.compose.foundation.anim.rally.Rally;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanAllRejectedAutomobileInputActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onExtraCallback = i2 % 128;
        Rally rally = (Rally) obj;
        if (i2 % 2 == 0) {
            return LoanAllRejectedAutomobileInputActivity.onWarmupCompleted(rally);
        }
        LoanAllRejectedAutomobileInputActivity.onWarmupCompleted(rally);
        throw null;
    }
}
