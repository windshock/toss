package o;

import im.toss.appsintoss.iap.InAppPurchasePreparationActivity;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda23 implements setSize<InAppPurchasePreparationActivity> {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static void onNavigationEvent(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        inAppPurchasePreparationActivity.tossRouter = sessionTrackerb;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void onWarmupCompleted(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        inAppPurchasePreparationActivity.environments = zzadVar;
        int i4 = onWarmupCompleted + 19;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
