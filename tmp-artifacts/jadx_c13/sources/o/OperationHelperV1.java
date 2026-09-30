package o;

import im.toss.inventory_sdk.InventoryAdManager;
import viva.republica.toss.account.detail.TossAccountHistoryActivity;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class OperationHelperV1 implements setSize<TossAccountHistoryActivity> {
    public static void onNavigationEvent(TossAccountHistoryActivity tossAccountHistoryActivity, InventoryAdManager inventoryAdManager) {
        tossAccountHistoryActivity.inventoryAdManager = inventoryAdManager;
    }

    public static void onExtraCallback(TossAccountHistoryActivity tossAccountHistoryActivity, SessionTrackerb sessionTrackerb) {
        tossAccountHistoryActivity.tossRouter = sessionTrackerb;
    }

    public static void IAuthTabCallback(TossAccountHistoryActivity tossAccountHistoryActivity, AppLovinAdServiceImplc appLovinAdServiceImplc) {
        tossAccountHistoryActivity.analyticsHelper = appLovinAdServiceImplc;
    }

    public static void onExtraCallback(TossAccountHistoryActivity tossAccountHistoryActivity, zzag zzagVar) {
        tossAccountHistoryActivity.tossClock = zzagVar;
    }

    public static void onExtraCallbackWithResult(TossAccountHistoryActivity tossAccountHistoryActivity, zzad zzadVar) {
        tossAccountHistoryActivity.environments = zzadVar;
    }
}
