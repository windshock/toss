package im.toss.ads_sdk.ui.activity;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullBannerActivity$$ExternalSyntheticLambda9 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ NativeAdsDto f$2;
    public final /* synthetic */ NativeAdsFullBannerActivity f$3;

    public /* synthetic */ NativeAdsFullBannerActivity$$ExternalSyntheticLambda9(boolean z, boolean z2, NativeAdsDto nativeAdsDto, NativeAdsFullBannerActivity nativeAdsFullBannerActivity) {
        this.f$0 = z;
        this.f$1 = z2;
        this.f$2 = nativeAdsDto;
        this.f$3 = nativeAdsFullBannerActivity;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = NativeAdsFullBannerActivity.onWarmupCompleted(this.f$0, this.f$1, this.f$2, this.f$3);
        int i4 = onExtraCallback + 119;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }
}
