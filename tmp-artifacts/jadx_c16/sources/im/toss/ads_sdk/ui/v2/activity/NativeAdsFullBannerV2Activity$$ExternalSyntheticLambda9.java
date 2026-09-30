package im.toss.ads_sdk.ui.v2.activity;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullBannerV2Activity$$ExternalSyntheticLambda9 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ NativeAdsDto f$0;
    public final /* synthetic */ NativeAdsFullBannerV2Activity f$1;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$2;

    public /* synthetic */ NativeAdsFullBannerV2Activity$$ExternalSyntheticLambda9(NativeAdsDto nativeAdsDto, NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        this.f$0 = nativeAdsDto;
        this.f$1 = nativeAdsFullBannerV2Activity;
        this.f$2 = getsupportedhighspeedresolutionsfor;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = NativeAdsFullBannerV2Activity.onWarmupCompleted(this.f$0, this.f$1, this.f$2, ((Boolean) obj).booleanValue());
        int i4 = onWarmupCompleted + 71;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
