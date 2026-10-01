package im.toss.appsintoss.iap;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailActivity$$ExternalSyntheticLambda20 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ InAppPurchaseHistoryDetailActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        Unit unitOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnWarmupCompleted = InAppPurchaseHistoryDetailActivity.onWarmupCompleted(this.f$0, (String) obj, (String) obj2);
            int i3 = 83 / 0;
        } else {
            unitOnWarmupCompleted = InAppPurchaseHistoryDetailActivity.onWarmupCompleted(this.f$0, (String) obj, (String) obj2);
        }
        int i4 = onNavigationEvent + 63;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
        return unitOnWarmupCompleted;
    }
}
