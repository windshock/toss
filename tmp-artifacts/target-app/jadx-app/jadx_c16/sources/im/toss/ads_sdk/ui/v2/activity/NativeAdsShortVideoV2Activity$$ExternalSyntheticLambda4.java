package im.toss.ads_sdk.ui.v2.activity;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsShortVideoV2Activity$$ExternalSyntheticLambda4 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ NativeAdsShortVideoV2Activity f$0;
    public final /* synthetic */ NativeAdsDto.Creative.ShortFormVideo f$1;

    public /* synthetic */ NativeAdsShortVideoV2Activity$$ExternalSyntheticLambda4(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsDto.Creative.ShortFormVideo shortFormVideo) {
        this.f$0 = nativeAdsShortVideoV2Activity;
        this.f$1 = shortFormVideo;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity = this.f$0;
        if (i3 != 0) {
            return NativeAdsShortVideoV2Activity.onWarmupCompleted(nativeAdsShortVideoV2Activity, this.f$1);
        }
        int i4 = 82 / 0;
        return NativeAdsShortVideoV2Activity.onWarmupCompleted(nativeAdsShortVideoV2Activity, this.f$1);
    }
}
