package im.toss.appsintoss.iap;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.ACPayResult;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class InAppPurchaseHistoryActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ InAppPurchaseHistoryActivity f$3;

    public /* synthetic */ InAppPurchaseHistoryActivity$$ExternalSyntheticLambda1(String str, String str2, String str3, InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = str3;
        this.f$3 = inAppPurchaseHistoryActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f$0;
        if (i3 == 0) {
            return (Unit) InAppPurchaseHistoryActivity.onExtraCallbackWithResult(new Object[]{str, this.f$1, this.f$2, this.f$3, (SetDetectableSize) obj}, -21890321, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 21890326, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted());
        }
        Object[] objArr = {str, this.f$1, this.f$2, this.f$3, (SetDetectableSize) obj};
        int i4 = 1 / 0;
        return (Unit) InAppPurchaseHistoryActivity.onExtraCallbackWithResult(objArr, -21890321, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 21890326, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted());
    }
}
