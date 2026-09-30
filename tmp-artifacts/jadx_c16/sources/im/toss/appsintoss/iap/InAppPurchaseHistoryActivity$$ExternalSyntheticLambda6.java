package im.toss.appsintoss.iap;

import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class InAppPurchaseHistoryActivity$$ExternalSyntheticLambda6 implements getBacktraceNote {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ InAppPurchaseHistoryActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity = this.f$0;
        String str = (String) obj;
        String str2 = (String) obj2;
        String str3 = (String) obj3;
        if (i3 == 0) {
            return InAppPurchaseHistoryActivity.onExtraCallbackWithResult(inAppPurchaseHistoryActivity, str, str2, str3);
        }
        InAppPurchaseHistoryActivity.onExtraCallbackWithResult(inAppPurchaseHistoryActivity, str, str2, str3);
        Object obj4 = null;
        obj4.hashCode();
        throw null;
    }
}
