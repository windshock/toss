package im.toss.features.credit.ui.plus.intro;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusIntroActivity$$ExternalSyntheticLambda1 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Object f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            CreditPlusIntroActivity.onWarmupCompleted(this.f$0);
            throw null;
        }
        Unit unitOnWarmupCompleted = CreditPlusIntroActivity.onWarmupCompleted(this.f$0);
        int i3 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }
}
