package im.toss.features.credit.ui.plus.lab;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusLabActivity$$ExternalSyntheticLambda2 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CreditPlusLabActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = CreditPlusLabActivity.onWarmupCompleted(this.f$0);
        int i4 = IAuthTabCallback + 7;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
        return unitOnWarmupCompleted;
    }
}
