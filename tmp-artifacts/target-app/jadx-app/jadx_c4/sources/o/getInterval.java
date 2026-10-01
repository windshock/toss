package o;

import im.toss.feature.credit.ui.main.home.CreditHomeActivity;
import im.toss.inventory_sdk.InventoryAdManager;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getInterval implements setSize<CreditHomeActivity> {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static void onWarmupCompleted(CreditHomeActivity creditHomeActivity, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        creditHomeActivity.tossRouter = sessionTrackerb;
        int i4 = onWarmupCompleted + 23;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void IAuthTabCallback(CreditHomeActivity creditHomeActivity, InventoryAdManager inventoryAdManager) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        creditHomeActivity.inventoryAdManager = inventoryAdManager;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void onExtraCallbackWithResult(CreditHomeActivity creditHomeActivity, setFinalY setfinaly) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        creditHomeActivity.tossploreManager = setfinaly;
        int i4 = onWarmupCompleted + 79;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void onExtraCallback(CreditHomeActivity creditHomeActivity, getDummyAd getdummyad) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        creditHomeActivity.standardTermsV2Intent = getdummyad;
        int i4 = onWarmupCompleted + 57;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
    }

    public static void IAuthTabCallback(CreditHomeActivity creditHomeActivity, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        creditHomeActivity.injectedEnvironments = zzadVar;
        int i4 = onWarmupCompleted + 77;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
