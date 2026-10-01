package o;

import im.toss.appsintoss.iap.InAppPurchaseHistoryActivity;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda0 implements setSize<InAppPurchaseHistoryActivity> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    public static void onExtraCallback(InAppPurchaseHistoryActivity inAppPurchaseHistoryActivity, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        inAppPurchaseHistoryActivity.tossRouter = sessionTrackerb;
        if (i3 != 0) {
            int i4 = 1 / 0;
        }
        int i5 = onExtraCallback + 99;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }
}
