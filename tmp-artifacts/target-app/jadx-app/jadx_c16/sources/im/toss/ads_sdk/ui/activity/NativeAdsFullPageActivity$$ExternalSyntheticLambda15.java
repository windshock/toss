package im.toss.ads_sdk.ui.activity;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullPageActivity$$ExternalSyntheticLambda15 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ NativeAdsFullPageActivity f$0;
    public final /* synthetic */ NativeAdsDto.AdAsset f$1;

    public /* synthetic */ NativeAdsFullPageActivity$$ExternalSyntheticLambda15(NativeAdsFullPageActivity nativeAdsFullPageActivity, NativeAdsDto.AdAsset adAsset) {
        this.f$0 = nativeAdsFullPageActivity;
        this.f$1 = adAsset;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsFullPageActivity nativeAdsFullPageActivity = this.f$0;
        if (i3 == 0) {
            return NativeAdsFullPageActivity.onWarmupCompleted(nativeAdsFullPageActivity, this.f$1);
        }
        int i4 = 56 / 0;
        return NativeAdsFullPageActivity.onWarmupCompleted(nativeAdsFullPageActivity, this.f$1);
    }
}
