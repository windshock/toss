package o;

import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import im.toss.ads_sdk.NativeAdsManager;
import im.toss.features.home.ui.dst.view.home.HomeFragment;
import im.toss.inventory_sdk.InventoryAdManager;
import im.toss.state.spec.SessionState;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getOnlineResourceFetcher implements setSize<HomeFragment> {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~(i5 | i6);
        int i8 = ~i5;
        int i9 = ~i6;
        int i10 = i8 | i9;
        int i11 = i7 | (~(i10 | i4));
        int i12 = i9 | i5;
        int i13 = (~i10) | i4;
        int i14 = i4 + i5 + i + ((-1587644119) * i3) + (1302866265 * i2);
        int i15 = i14 * i14;
        int i16 = (i4 * (-1579585154)) + 1163788288 + ((-1579585154) * i5) + ((-914001539) * i11) + (i12 * 914001539) + (914001539 * i13) + ((-665583616) * i) + (1500774400 * i3) + ((-1456209920) * i2) + ((-2144468992) * i15);
        int i17 = ((i4 * (-855313886)) - 1253577507) + (i5 * (-855313886)) + (i11 * (-13)) + (i12 * 13) + (i13 * 13) + (i * (-855313873)) + (i3 * (-1467678585)) + (i2 * 593082711) + (i15 * 74579968);
        return i16 + ((i17 * i17) * (-1668153344)) != 1 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
    }

    public static void onWarmupCompleted(HomeFragment homeFragment, InventoryAdManager inventoryAdManager) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        homeFragment.inventoryAdManager = inventoryAdManager;
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 1;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void onExtraCallback(HomeFragment homeFragment, NativeAdsManager nativeAdsManager) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        homeFragment.nativeAdsManager = nativeAdsManager;
        if (i3 != 0) {
            int i4 = 59 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        HomeFragment homeFragment = (HomeFragment) objArr[0];
        zzag zzagVar = (zzag) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        homeFragment.tossClock = zzagVar;
        int i4 = onExtraCallback + 79;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
        return null;
    }

    public static void onExtraCallback(HomeFragment homeFragment, AppLovinSdkInitializationConfigurationImpl appLovinSdkInitializationConfigurationImpl) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        homeFragment.inbox = appLovinSdkInitializationConfigurationImpl;
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallback + 5;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static void IAuthTabCallback(HomeFragment homeFragment, withOrigin withorigin) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        homeFragment.inAppUpdateManager = withorigin;
        if (i3 == 0) {
            int i4 = 31 / 0;
        }
        int i5 = onExtraCallback + 99;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void IAuthTabCallback(HomeFragment homeFragment, DomainConfigProxy domainConfigProxy) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        homeFragment.homeChangeHelper = domainConfigProxy;
        if (i3 == 0) {
            throw null;
        }
    }

    public static void onNavigationEvent(HomeFragment homeFragment, GriverDialogExtension griverDialogExtension) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        homeFragment.currencyNotificationManager = griverDialogExtension;
        int i4 = onExtraCallback + 113;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        HomeFragment homeFragment = (HomeFragment) objArr[0];
        getContentProvider getcontentprovider = (getContentProvider) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        homeFragment.homeFragmentUtil = getcontentprovider;
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 57;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static void IAuthTabCallback(HomeFragment homeFragment, SessionState sessionState) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        homeFragment.sessionState = sessionState;
        int i4 = onExtraCallback + 93;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void onExtraCallbackWithResult(HomeFragment homeFragment, getBillingPeriod getbillingperiod) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        homeFragment.regionManager = getbillingperiod;
        int i4 = onExtraCallbackWithResult + 91;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void onExtraCallbackWithResult(HomeFragment homeFragment, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        homeFragment.environments = zzadVar;
        if (i3 == 0) {
            throw null;
        }
    }

    public static void onExtraCallbackWithResult(HomeFragment homeFragment, getContentProvider getcontentprovider) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        onExtraCallback(iOnExtraCallbackWithResult2, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, 707239256, -707239256, new Object[]{homeFragment, getcontentprovider}, iOnExtraCallbackWithResult);
    }

    public static void IAuthTabCallback(HomeFragment homeFragment, zzag zzagVar) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        onExtraCallback(iOnExtraCallbackWithResult2, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, -1296254130, 1296254131, new Object[]{homeFragment, zzagVar}, iOnExtraCallbackWithResult);
    }
}
