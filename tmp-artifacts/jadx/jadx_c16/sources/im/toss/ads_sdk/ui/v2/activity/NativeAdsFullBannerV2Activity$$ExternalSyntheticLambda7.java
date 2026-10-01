package im.toss.ads_sdk.ui.v2.activity;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullBannerV2Activity$$ExternalSyntheticLambda7 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ NativeAdsFullBannerV2Activity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity = this.f$0;
        if (i3 != 0) {
            return NativeAdsFullBannerV2Activity.onExtraCallback(nativeAdsFullBannerV2Activity);
        }
        NativeAdsFullBannerV2Activity.onExtraCallback(nativeAdsFullBannerV2Activity);
        throw null;
    }
}
