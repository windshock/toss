package im.toss.features.loan;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComposeBaseActivity$$ExternalSyntheticLambda7 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LoanComposeBaseActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = LoanComposeBaseActivity.onWarmupCompleted(this.f$0);
        int i4 = onWarmupCompleted + 33;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
        return unitOnWarmupCompleted;
    }
}
