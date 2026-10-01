package o;

import im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setPresentationView implements setSize<NativeAdsShortVideoV2Activity> {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static void onExtraCallback(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsShortVideoV2Activity.environments = zzadVar;
        int i4 = onNavigationEvent + 75;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
