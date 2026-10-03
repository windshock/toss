package o;

import viva.republica.toss.main.more.SecuritySettingV2Activity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class sdkInitialize implements setSize<SecuritySettingV2Activity> {
    public static void onWarmupCompleted(SecuritySettingV2Activity securitySettingV2Activity, isWifiEnabled iswifienabled) {
        securitySettingV2Activity.securityLevelUseCase = iswifienabled;
    }

    public static void IAuthTabCallback(SecuritySettingV2Activity securitySettingV2Activity, r8lambdar_KD5J2KtjKq2TqCOKmlHfUqU6A r8lambdar_kd5j2ktjkq2tqcokmlhfuqu6a) {
        securitySettingV2Activity.affiliateTermsAgreedUseCase = r8lambdar_kd5j2ktjkq2tqcokmlhfuqu6a;
    }

    public static void IAuthTabCallback(SecuritySettingV2Activity securitySettingV2Activity, getDeviceVolume getdevicevolume) {
        securitySettingV2Activity.appLockIntent = getdevicevolume;
    }

    public static void onNavigationEvent(SecuritySettingV2Activity securitySettingV2Activity, SessionTrackerb sessionTrackerb) {
        securitySettingV2Activity.tossRouter = sessionTrackerb;
    }

    public static void IAuthTabCallback(SecuritySettingV2Activity securitySettingV2Activity, setCommonNetworkProxy setcommonnetworkproxy) {
        securitySettingV2Activity.loginTokenStore = setcommonnetworkproxy;
    }

    public static void onExtraCallbackWithResult(SecuritySettingV2Activity securitySettingV2Activity, IAPIntegrationHelper2 iAPIntegrationHelper2) {
        securitySettingV2Activity.isStoreLoginTokenUseCase = iAPIntegrationHelper2;
    }

    public static void onExtraCallback(SecuritySettingV2Activity securitySettingV2Activity, getTid gettid) {
        securitySettingV2Activity.showLoginTokenDisableBottomSheetUseCase = gettid;
    }

    public static void onExtraCallbackWithResult(SecuritySettingV2Activity securitySettingV2Activity, refreshUserIdFromWalletApi refreshuseridfromwalletapi) {
        securitySettingV2Activity.updateConsentAndManageLoginTokenUseCase = refreshuseridfromwalletapi;
    }

    public static void onExtraCallback(SecuritySettingV2Activity securitySettingV2Activity, IAPIntegrationHelper3 iAPIntegrationHelper3) {
        securitySettingV2Activity.showLoginTokenConsentDescriptionBottomSheet = iAPIntegrationHelper3;
    }

    public static void onWarmupCompleted(SecuritySettingV2Activity securitySettingV2Activity, setVideoWidth setvideowidth) {
        securitySettingV2Activity.passkeyManager = setvideowidth;
    }

    public static void onExtraCallbackWithResult(SecuritySettingV2Activity securitySettingV2Activity, getBillingPeriod getbillingperiod) {
        securitySettingV2Activity.regionManager = getbillingperiod;
    }

    public static void onExtraCallback(SecuritySettingV2Activity securitySettingV2Activity, isJacksonCreator isjacksoncreator) {
        securitySettingV2Activity.authUiConfig = isjacksoncreator;
    }
}
