package im.toss.appsintoss.iap;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class InAppPurchaseHistoryActivity$$ExternalSyntheticLambda10 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ InAppPurchaseHistoryActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity = this.f$0;
        if (i3 == 0) {
            return InAppPurchaseHistoryActivity.onWarmupCompleted(inAppPurchaseHistoryActivity);
        }
        InAppPurchaseHistoryActivity.onWarmupCompleted(inAppPurchaseHistoryActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
