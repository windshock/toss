package im.toss.ads_sdk.ui.activity;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsShortVideoActivity$$ExternalSyntheticLambda20 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ NativeAdsShortVideoActivity f$0;
    public final /* synthetic */ NativeAdsDto f$1;
    public final /* synthetic */ NativeAdsDto.AdAsset f$2;

    public /* synthetic */ NativeAdsShortVideoActivity$$ExternalSyntheticLambda20(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, NativeAdsDto nativeAdsDto, NativeAdsDto.AdAsset adAsset) {
        this.f$0 = nativeAdsShortVideoActivity;
        this.f$1 = nativeAdsDto;
        this.f$2 = adAsset;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsShortVideoActivity nativeAdsShortVideoActivity = this.f$0;
        if (i3 != 0) {
            return NativeAdsShortVideoActivity.onWarmupCompleted(nativeAdsShortVideoActivity, this.f$1, this.f$2);
        }
        NativeAdsShortVideoActivity.onWarmupCompleted(nativeAdsShortVideoActivity, this.f$1, this.f$2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
