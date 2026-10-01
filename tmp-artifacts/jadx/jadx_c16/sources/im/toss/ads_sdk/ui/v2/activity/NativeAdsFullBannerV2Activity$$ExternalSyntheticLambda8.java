package im.toss.ads_sdk.ui.v2.activity;

import android.content.Context;
import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.jvm.functions.Function1;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullBannerV2Activity$$ExternalSyntheticLambda8 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ NativeAdsFullBannerV2Activity f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$2;
    public final /* synthetic */ NativeAdsDto f$3;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$4;

    public /* synthetic */ NativeAdsFullBannerV2Activity$$ExternalSyntheticLambda8(NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity, int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2) {
        this.f$0 = nativeAdsFullBannerV2Activity;
        this.f$1 = i;
        this.f$2 = getsupportedhighspeedresolutionsfor;
        this.f$3 = nativeAdsDto;
        this.f$4 = getsupportedhighspeedresolutionsfor2;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return NativeAdsFullBannerV2Activity.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Context) obj);
        }
        int i3 = 29 / 0;
        return NativeAdsFullBannerV2Activity.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Context) obj);
    }
}
