package im.toss.ads_sdk.ui.v2.activity;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullBannerV2Activity$$ExternalSyntheticLambda10 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ NativeAdsDto f$0;
    public final /* synthetic */ NativeAdsFullBannerV2Activity f$1;

    public /* synthetic */ NativeAdsFullBannerV2Activity$$ExternalSyntheticLambda10(NativeAdsDto nativeAdsDto, NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity) {
        this.f$0 = nativeAdsDto;
        this.f$1 = nativeAdsFullBannerV2Activity;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto nativeAdsDto = this.f$0;
        if (i3 == 0) {
            return NativeAdsFullBannerV2Activity.onNavigationEvent(nativeAdsDto, this.f$1);
        }
        int i4 = 54 / 0;
        return NativeAdsFullBannerV2Activity.onNavigationEvent(nativeAdsDto, this.f$1);
    }
}
