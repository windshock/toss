package im.toss.ads_sdk.ui.v2.activity;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullBannerV2Activity$$ExternalSyntheticLambda14 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ NativeAdsDto f$2;
    public final /* synthetic */ NativeAdsFullBannerV2Activity f$3;

    public /* synthetic */ NativeAdsFullBannerV2Activity$$ExternalSyntheticLambda14(boolean z, boolean z2, NativeAdsDto nativeAdsDto, NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity) {
        this.f$0 = z;
        this.f$1 = z2;
        this.f$2 = nativeAdsDto;
        this.f$3 = nativeAdsFullBannerV2Activity;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = NativeAdsFullBannerV2Activity.onExtraCallback(this.f$0, this.f$1, this.f$2, this.f$3);
        int i4 = onNavigationEvent + 55;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }
}
