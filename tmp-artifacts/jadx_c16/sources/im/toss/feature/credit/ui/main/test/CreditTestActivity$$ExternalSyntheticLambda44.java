package im.toss.feature.credit.ui.main.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda44 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CreditTestActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = CreditTestActivity.IAuthTabCallbackDefault(this.f$0);
        int i4 = onExtraCallbackWithResult + 51;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }
}
