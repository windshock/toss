package im.toss.feature.credit.ui.main.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda39 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CreditTestActivity f$0;

    public final Object invoke() {
        Unit unitExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            unitExtraCallbackWithResult = CreditTestActivity.extraCallbackWithResult(this.f$0);
            int i3 = 96 / 0;
        } else {
            unitExtraCallbackWithResult = CreditTestActivity.extraCallbackWithResult(this.f$0);
        }
        int i4 = onWarmupCompleted + 59;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitExtraCallbackWithResult;
        }
        throw null;
    }
}
