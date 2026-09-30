package im.toss.ads_sdk.ui.v2.activity;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsShortVideoV2Activity$$ExternalSyntheticLambda22 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ NativeAdsShortVideoV2Activity f$0;
    public final /* synthetic */ NativeAdsDto.Creative.ShortFormVideo f$1;

    public /* synthetic */ NativeAdsShortVideoV2Activity$$ExternalSyntheticLambda22(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, NativeAdsDto.Creative.ShortFormVideo shortFormVideo) {
        this.f$0 = nativeAdsShortVideoV2Activity;
        this.f$1 = shortFormVideo;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = NativeAdsShortVideoV2Activity.onNavigationEvent(this.f$0, this.f$1);
        int i4 = onExtraCallback + 11;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
        return unitOnNavigationEvent;
    }
}
