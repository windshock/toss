package o;

import im.toss.features.foreigner.home.ui.ForeignerHomeFragment;
import im.toss.inventory_sdk.InventoryAdManager;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class sendSilentDenyPermission implements setSize<ForeignerHomeFragment> {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    public static void onExtraCallback(ForeignerHomeFragment foreignerHomeFragment, InventoryAdManager inventoryAdManager) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        foreignerHomeFragment.inventoryAdManager = inventoryAdManager;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void IAuthTabCallback(ForeignerHomeFragment foreignerHomeFragment, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        foreignerHomeFragment.tossRouter = sessionTrackerb;
        int i4 = onWarmupCompleted + 113;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static void IAuthTabCallback(ForeignerHomeFragment foreignerHomeFragment, AppLovinSdkInitializationConfigurationImpl appLovinSdkInitializationConfigurationImpl) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        foreignerHomeFragment.inbox = appLovinSdkInitializationConfigurationImpl;
        if (i3 != 0) {
            int i4 = 20 / 0;
        }
    }

    public static void onWarmupCompleted(ForeignerHomeFragment foreignerHomeFragment, getEnableJsT2 getenablejst2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        foreignerHomeFragment.kycHelper = getenablejst2;
        int i4 = onWarmupCompleted + 13;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void IAuthTabCallback(ForeignerHomeFragment foreignerHomeFragment, getDummyAd getdummyad) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        foreignerHomeFragment.standardTermsV2Intent = getdummyad;
        int i4 = IAuthTabCallback + 27;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
