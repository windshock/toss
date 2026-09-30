package im.toss.ads_sdk.ui.activity;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsShortVideoActivity$$ExternalSyntheticLambda24 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ NativeAdsShortVideoActivity f$0;
    public final /* synthetic */ NativeAdsDto.Creative.ShortFormVideo f$1;

    public /* synthetic */ NativeAdsShortVideoActivity$$ExternalSyntheticLambda24(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsDto.Creative.ShortFormVideo shortFormVideo) {
        this.f$0 = nativeAdsShortVideoActivity;
        this.f$1 = shortFormVideo;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsShortVideoActivity nativeAdsShortVideoActivity = this.f$0;
        if (i3 != 0) {
            return NativeAdsShortVideoActivity.onWarmupCompleted(nativeAdsShortVideoActivity, this.f$1);
        }
        NativeAdsShortVideoActivity.onWarmupCompleted(nativeAdsShortVideoActivity, this.f$1);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
