package im.toss.appsintoss.iap;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailActivity$$ExternalSyntheticLambda12 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ InAppPurchaseHistoryDetailActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            InAppPurchaseHistoryDetailActivity.IAuthTabCallback(this.f$0, (String) obj, (String) obj2);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = InAppPurchaseHistoryDetailActivity.IAuthTabCallback(this.f$0, (String) obj, (String) obj2);
        int i3 = onExtraCallback + 21;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }
}
