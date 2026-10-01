package im.toss.appsintoss.iap;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailActivity$$ExternalSyntheticLambda9 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ InAppPurchaseHistoryDetailActivity f$2;

    public /* synthetic */ InAppPurchaseHistoryDetailActivity$$ExternalSyntheticLambda9(String str, String str2, InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = inAppPurchaseHistoryDetailActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f$0;
        if (i3 == 0) {
            return InAppPurchaseHistoryDetailActivity.onExtraCallbackWithResult(str, this.f$1, this.f$2, (SetDetectableSize) obj);
        }
        Unit unitOnExtraCallbackWithResult = InAppPurchaseHistoryDetailActivity.onExtraCallbackWithResult(str, this.f$1, this.f$2, (SetDetectableSize) obj);
        int i4 = 31 / 0;
        return unitOnExtraCallbackWithResult;
    }
}
