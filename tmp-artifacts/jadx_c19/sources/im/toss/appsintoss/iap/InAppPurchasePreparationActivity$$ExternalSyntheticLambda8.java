package im.toss.appsintoss.iap;

import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchasePreparationActivity$$ExternalSyntheticLambda8 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ InAppPurchasePreparationActivity f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ InAppPurchasePreparationActivity$$ExternalSyntheticLambda8(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, String str) {
        this.f$0 = inAppPurchasePreparationActivity;
        this.f$1 = str;
    }

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 3;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        InAppPurchasePreparationActivity inAppPurchasePreparationActivity = this.f$0;
        if (i4 != 0) {
            return InAppPurchasePreparationActivity.onExtraCallback(inAppPurchasePreparationActivity, this.f$1, (SetDetectableSize) obj);
        }
        InAppPurchasePreparationActivity.onExtraCallback(inAppPurchasePreparationActivity, this.f$1, (SetDetectableSize) obj);
        throw null;
    }
}
