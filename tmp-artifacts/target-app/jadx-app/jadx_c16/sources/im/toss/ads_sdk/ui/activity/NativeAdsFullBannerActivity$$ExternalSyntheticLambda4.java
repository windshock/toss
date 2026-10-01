package im.toss.ads_sdk.ui.activity;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.GeckoHubImp;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullBannerActivity$$ExternalSyntheticLambda4 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ NativeAdsFullBannerActivity f$0;
    public final /* synthetic */ NativeAdsDto.AdAsset f$1;

    public /* synthetic */ NativeAdsFullBannerActivity$$ExternalSyntheticLambda4(NativeAdsFullBannerActivity nativeAdsFullBannerActivity, NativeAdsDto.AdAsset adAsset) {
        this.f$0 = nativeAdsFullBannerActivity;
        this.f$1 = adAsset;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) NativeAdsFullBannerActivity.onWarmupCompleted(-1545723837, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this.f$0, this.f$1}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1545723838);
        int i4 = onNavigationEvent + 87;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
