package im.toss.appsintoss.iap;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ InAppPurchaseHistoryDetailActivity f$2;

    public /* synthetic */ InAppPurchaseHistoryDetailActivity$$ExternalSyntheticLambda2(String str, String str2, InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = inAppPurchaseHistoryDetailActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f$0;
        if (i3 != 0) {
            return InAppPurchaseHistoryDetailActivity.IAuthTabCallback(str, this.f$1, this.f$2, (SetDetectableSize) obj);
        }
        Unit unitIAuthTabCallback = InAppPurchaseHistoryDetailActivity.IAuthTabCallback(str, this.f$1, this.f$2, (SetDetectableSize) obj);
        int i4 = 68 / 0;
        return unitIAuthTabCallback;
    }
}
