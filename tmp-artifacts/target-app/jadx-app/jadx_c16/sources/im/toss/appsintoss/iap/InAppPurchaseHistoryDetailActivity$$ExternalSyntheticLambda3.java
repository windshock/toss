package im.toss.appsintoss.iap;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ InAppPurchaseHistoryDetailActivity f$2;

    public /* synthetic */ InAppPurchaseHistoryDetailActivity$$ExternalSyntheticLambda3(String str, String str2, InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = inAppPurchaseHistoryDetailActivity;
    }

    public final Object invoke(Object obj) {
        Unit unitOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnNavigationEvent = InAppPurchaseHistoryDetailActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
            int i3 = 2 / 0;
        } else {
            unitOnNavigationEvent = InAppPurchaseHistoryDetailActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
        }
        int i4 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
