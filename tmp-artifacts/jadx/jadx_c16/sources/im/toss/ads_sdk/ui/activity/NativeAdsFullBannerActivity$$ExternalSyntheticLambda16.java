package im.toss.ads_sdk.ui.activity;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullBannerActivity$$ExternalSyntheticLambda16 implements Function0 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ NativeAdsDto f$0;
    public final /* synthetic */ NativeAdsFullBannerActivity f$1;

    public /* synthetic */ NativeAdsFullBannerActivity$$ExternalSyntheticLambda16(NativeAdsDto nativeAdsDto, NativeAdsFullBannerActivity nativeAdsFullBannerActivity) {
        this.f$0 = nativeAdsDto;
        this.f$1 = nativeAdsFullBannerActivity;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = NativeAdsFullBannerActivity.onWarmupCompleted(this.f$0, this.f$1);
        int i4 = onWarmupCompleted + 45;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
