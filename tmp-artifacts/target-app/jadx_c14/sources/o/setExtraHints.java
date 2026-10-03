package o;

import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setExtraHints implements setSize<NotificationMarketingSettingActivity> {
    public static void onWarmupCompleted(NotificationMarketingSettingActivity notificationMarketingSettingActivity, SessionTrackerb sessionTrackerb) {
        notificationMarketingSettingActivity.tossRouter = sessionTrackerb;
    }

    public static void onExtraCallbackWithResult(NotificationMarketingSettingActivity notificationMarketingSettingActivity, zzag zzagVar) {
        notificationMarketingSettingActivity.tossClock = zzagVar;
    }

    public static void onWarmupCompleted(NotificationMarketingSettingActivity notificationMarketingSettingActivity, InterstitialAdInterstitialLoadAdConfig interstitialAdInterstitialLoadAdConfig) {
        notificationMarketingSettingActivity.serviceManagementApi = interstitialAdInterstitialLoadAdConfig;
    }

    public static void onNavigationEvent(NotificationMarketingSettingActivity notificationMarketingSettingActivity, getDummyAd getdummyad) {
        notificationMarketingSettingActivity.standardTermsV2Intent = getdummyad;
    }

    public static void onExtraCallback(NotificationMarketingSettingActivity notificationMarketingSettingActivity, setSerializerFeatures setserializerfeatures) {
        notificationMarketingSettingActivity.marketingNotificationAvailability = setserializerfeatures;
    }

    public static void onNavigationEvent(NotificationMarketingSettingActivity notificationMarketingSettingActivity, getPricingPhaseList getpricingphaselist) {
        notificationMarketingSettingActivity.region = getpricingphaselist;
    }
}
