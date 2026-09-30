package im.toss.ads_sdk.ui.activity;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullBannerActivity$$ExternalSyntheticLambda2 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ NativeAdsFullBannerActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsFullBannerActivity nativeAdsFullBannerActivity = this.f$0;
        if (i3 == 0) {
            return NativeAdsFullBannerActivity.IAuthTabCallback(nativeAdsFullBannerActivity);
        }
        NativeAdsFullBannerActivity.IAuthTabCallback(nativeAdsFullBannerActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
