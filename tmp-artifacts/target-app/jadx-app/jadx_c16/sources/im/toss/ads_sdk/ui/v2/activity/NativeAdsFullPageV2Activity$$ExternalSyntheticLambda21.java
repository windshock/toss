package im.toss.ads_sdk.ui.v2.activity;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullPageV2Activity$$ExternalSyntheticLambda21 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ NativeAdsFullPageV2Activity f$0;
    public final /* synthetic */ NativeAdsDto.AdAsset f$1;

    public /* synthetic */ NativeAdsFullPageV2Activity$$ExternalSyntheticLambda21(NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity, NativeAdsDto.AdAsset adAsset) {
        this.f$0 = nativeAdsFullPageV2Activity;
        this.f$1 = adAsset;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity = this.f$0;
        if (i3 != 0) {
            return NativeAdsFullPageV2Activity.IAuthTabCallback(nativeAdsFullPageV2Activity, this.f$1);
        }
        int i4 = 74 / 0;
        return NativeAdsFullPageV2Activity.IAuthTabCallback(nativeAdsFullPageV2Activity, this.f$1);
    }
}
