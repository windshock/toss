package o;

import im.toss.ads_sdk.NativeAdsManager;
import im.toss.features.benefit.ui.KoreaBenefitTabFragment;
import im.toss.inventory_sdk.InventoryAdManager;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ContactUtils1 implements setSize<KoreaBenefitTabFragment> {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public static void onNavigationEvent(KoreaBenefitTabFragment koreaBenefitTabFragment, InventoryAdManager inventoryAdManager) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        koreaBenefitTabFragment.inventoryAdManager = inventoryAdManager;
        int i4 = onExtraCallback + 71;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void onExtraCallback(KoreaBenefitTabFragment koreaBenefitTabFragment, NativeAdsManager nativeAdsManager) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        koreaBenefitTabFragment.nativeAdsManager = nativeAdsManager;
        int i4 = onNavigationEvent + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void onWarmupCompleted(KoreaBenefitTabFragment koreaBenefitTabFragment, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        koreaBenefitTabFragment.router = sessionTrackerb;
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
    }

    public static void onExtraCallbackWithResult(KoreaBenefitTabFragment koreaBenefitTabFragment, zzag zzagVar) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        koreaBenefitTabFragment.tossClock = zzagVar;
        int i4 = onNavigationEvent + 55;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void onExtraCallback(KoreaBenefitTabFragment koreaBenefitTabFragment, getDummyAd getdummyad) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        koreaBenefitTabFragment.standardTermsV2Intent = getdummyad;
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 27;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
