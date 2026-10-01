package im.toss.appsintoss.iap;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailActivity$$ExternalSyntheticLambda7 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ InAppPurchaseHistoryDetailActivity f$2;

    public /* synthetic */ InAppPurchaseHistoryDetailActivity$$ExternalSyntheticLambda7(String str, String str2, InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = inAppPurchaseHistoryDetailActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            InAppPurchaseHistoryDetailActivity.onExtraCallback(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = InAppPurchaseHistoryDetailActivity.onExtraCallback(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
        int i3 = onWarmupCompleted + 45;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 97 / 0;
        }
        return unitOnExtraCallback;
    }
}
