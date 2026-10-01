package im.toss.features.credit.ui.plus.lab;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusLabActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ CreditPlusLabActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = CreditPlusLabActivity.onWarmupCompleted(this.f$0, (Throwable) obj);
        int i4 = IAuthTabCallback + 101;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
        return unitOnWarmupCompleted;
    }
}
