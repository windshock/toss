package o;

import im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class removeOnAdapterChangeListener implements setSize<NativeAdsPlayableAdActivity> {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public static void onExtraCallbackWithResult(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, FragmentStateAdapter4 fragmentStateAdapter4) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsPlayableAdActivity.appInfoProvider = fragmentStateAdapter4;
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
        int i5 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 37 / 0;
        }
    }

    public static void onNavigationEvent(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, pageRight pageright) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsPlayableAdActivity.httpClientFactory = pageright;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void IAuthTabCallback(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsPlayableAdActivity.adsSdkPrefs = textRoundCornerProgressBarSavedState1;
        int i4 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static void IAuthTabCallback(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsPlayableAdActivity.injectedEnvironments = zzadVar;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
