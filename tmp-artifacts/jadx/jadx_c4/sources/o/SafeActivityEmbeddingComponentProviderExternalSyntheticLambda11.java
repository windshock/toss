package o;

import im.toss.appsintoss.iap.InAppPurchaseHistoryDetailActivity;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda11 implements setSize<InAppPurchaseHistoryDetailActivity> {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public static void onWarmupCompleted(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        inAppPurchaseHistoryDetailActivity.tossRouter = sessionTrackerb;
        int i4 = onWarmupCompleted + 115;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
