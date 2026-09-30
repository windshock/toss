package im.toss.ads_sdk.ui.activity;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullBannerActivity$$ExternalSyntheticLambda12 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ NativeAdsDto f$0;
    public final /* synthetic */ NativeAdsFullBannerActivity f$1;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$2;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$3;

    public /* synthetic */ NativeAdsFullBannerActivity$$ExternalSyntheticLambda12(NativeAdsDto nativeAdsDto, NativeAdsFullBannerActivity nativeAdsFullBannerActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2) {
        this.f$0 = nativeAdsDto;
        this.f$1 = nativeAdsFullBannerActivity;
        this.f$2 = getsupportedhighspeedresolutionsfor;
        this.f$3 = getsupportedhighspeedresolutionsfor2;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = NativeAdsFullBannerActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3);
        int i4 = onWarmupCompleted + 17;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
