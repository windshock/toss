package im.toss.appsintoss.iap;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchasePreparationActivity$$ExternalSyntheticLambda9 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ InAppPurchasePreparationActivity f$0;

    public final Object invoke() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        InAppPurchasePreparationActivity inAppPurchasePreparationActivity = this.f$0;
        if (i4 == 0) {
            return InAppPurchasePreparationActivity.onNavigationEvent(inAppPurchasePreparationActivity);
        }
        InAppPurchasePreparationActivity.onNavigationEvent(inAppPurchasePreparationActivity);
        throw null;
    }
}
