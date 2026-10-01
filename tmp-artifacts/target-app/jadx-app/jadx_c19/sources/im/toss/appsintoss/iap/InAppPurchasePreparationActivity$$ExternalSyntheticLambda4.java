package im.toss.appsintoss.iap;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchasePreparationActivity$$ExternalSyntheticLambda4 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ InAppPurchasePreparationActivity f$0;

    public final Object invoke() {
        Unit unitOnWarmupCompleted;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            unitOnWarmupCompleted = InAppPurchasePreparationActivity.onWarmupCompleted(this.f$0);
            int i4 = 40 / 0;
        } else {
            unitOnWarmupCompleted = InAppPurchasePreparationActivity.onWarmupCompleted(this.f$0);
        }
        int i5 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 73 / 0;
        }
        return unitOnWarmupCompleted;
    }
}
