package im.toss.ads_sdk.ui.activity;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullBannerActivity$$ExternalSyntheticLambda15 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ NativeAdsDto f$0;
    public final /* synthetic */ NativeAdsFullBannerActivity f$1;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$2;

    public /* synthetic */ NativeAdsFullBannerActivity$$ExternalSyntheticLambda15(NativeAdsDto nativeAdsDto, NativeAdsFullBannerActivity nativeAdsFullBannerActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        this.f$0 = nativeAdsDto;
        this.f$1 = nativeAdsFullBannerActivity;
        this.f$2 = getsupportedhighspeedresolutionsfor;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = NativeAdsFullBannerActivity.onWarmupCompleted(this.f$0, this.f$1, this.f$2, ((Boolean) obj).booleanValue());
        int i4 = onNavigationEvent + 27;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }
}
