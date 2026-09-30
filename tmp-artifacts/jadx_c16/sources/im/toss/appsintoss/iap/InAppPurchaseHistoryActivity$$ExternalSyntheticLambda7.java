package im.toss.appsintoss.iap;

import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class InAppPurchaseHistoryActivity$$ExternalSyntheticLambda7 implements getBacktraceNote {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ InAppPurchaseHistoryActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity = this.f$0;
        String str = (String) obj;
        if (i3 == 0) {
            return InAppPurchaseHistoryActivity.onExtraCallback(inAppPurchaseHistoryActivity, str, (String) obj2, (String) obj3);
        }
        InAppPurchaseHistoryActivity.onExtraCallback(inAppPurchaseHistoryActivity, str, (String) obj2, (String) obj3);
        Object obj4 = null;
        obj4.hashCode();
        throw null;
    }
}
