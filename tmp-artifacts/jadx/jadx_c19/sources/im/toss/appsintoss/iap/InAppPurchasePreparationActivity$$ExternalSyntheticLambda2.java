package im.toss.appsintoss.iap;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchasePreparationActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ InAppPurchasePreparationActivity f$0;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 95;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        InAppPurchasePreparationActivity inAppPurchasePreparationActivity = this.f$0;
        String str = (String) obj;
        if (i4 != 0) {
            return InAppPurchasePreparationActivity.IAuthTabCallback(inAppPurchasePreparationActivity, str);
        }
        Unit unitIAuthTabCallback = InAppPurchasePreparationActivity.IAuthTabCallback(inAppPurchasePreparationActivity, str);
        int i5 = 93 / 0;
        return unitIAuthTabCallback;
    }
}
