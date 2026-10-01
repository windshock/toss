package im.toss.appsintoss.iap;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.ACPayResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class InAppPurchaseHistoryActivity$$ExternalSyntheticLambda11 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ InAppPurchaseHistoryActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity = this.f$0;
        if (i3 != 0) {
            return (Unit) InAppPurchaseHistoryActivity.onExtraCallbackWithResult(new Object[]{inAppPurchaseHistoryActivity}, -1715699267, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 1715699269, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
