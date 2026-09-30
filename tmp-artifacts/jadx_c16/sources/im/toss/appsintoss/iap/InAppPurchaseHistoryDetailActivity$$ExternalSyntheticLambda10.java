package im.toss.appsintoss.iap;

import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailActivity$$ExternalSyntheticLambda10 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ InAppPurchaseHistoryDetailActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity = this.f$0;
        String str = (String) obj;
        if (i3 != 0) {
            return InAppPurchaseHistoryDetailActivity.onWarmupCompleted(inAppPurchaseHistoryDetailActivity, str);
        }
        InAppPurchaseHistoryDetailActivity.onWarmupCompleted(inAppPurchaseHistoryDetailActivity, str);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
