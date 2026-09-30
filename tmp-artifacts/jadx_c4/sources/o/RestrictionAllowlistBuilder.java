package o;

import im.toss.ads_sdk.ui.activity.NativeAdsShortVideoActivity;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RestrictionAllowlistBuilder implements setSize<NativeAdsShortVideoActivity> {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static void onExtraCallbackWithResult(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsShortVideoActivity.environments = zzadVar;
        int i4 = onExtraCallbackWithResult + 17;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
    }
}
