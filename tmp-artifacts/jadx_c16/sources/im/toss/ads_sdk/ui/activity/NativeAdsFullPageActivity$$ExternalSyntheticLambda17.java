package im.toss.ads_sdk.ui.activity;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullPageActivity$$ExternalSyntheticLambda17 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ NativeAdsFullPageActivity f$0;
    public final /* synthetic */ NativeAdsDto.AdAsset f$1;

    public /* synthetic */ NativeAdsFullPageActivity$$ExternalSyntheticLambda17(NativeAdsFullPageActivity nativeAdsFullPageActivity, NativeAdsDto.AdAsset adAsset) {
        this.f$0 = nativeAdsFullPageActivity;
        this.f$1 = adAsset;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = NativeAdsFullPageActivity.onExtraCallback(this.f$0, this.f$1);
        int i4 = IAuthTabCallback + 79;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
