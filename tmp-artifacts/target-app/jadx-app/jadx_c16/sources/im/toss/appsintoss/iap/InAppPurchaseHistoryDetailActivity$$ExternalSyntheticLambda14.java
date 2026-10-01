package im.toss.appsintoss.iap;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailActivity$$ExternalSyntheticLambda14 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ InAppPurchaseHistoryDetailActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        IAuthTabCallback = i2 % 128;
        Object obj3 = null;
        if (i2 % 2 != 0) {
            InAppPurchaseHistoryDetailActivity.onExtraCallbackWithResult(this.f$0, (String) obj, (String) obj2);
            obj3.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = InAppPurchaseHistoryDetailActivity.onExtraCallbackWithResult(this.f$0, (String) obj, (String) obj2);
        int i3 = onExtraCallback + 121;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }
}
