package im.toss.ads_sdk.ui.v2.activity;

import android.content.Context;
import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullBannerV2Activity$$ExternalSyntheticLambda6 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ NativeAdsFullBannerV2Activity f$0;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ NativeAdsDto f$3;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$4;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$5;
    public final /* synthetic */ NativeAdsDto.Creative.FullBanner f$6;
    public final /* synthetic */ float f$7;
    public final /* synthetic */ Context f$8;

    public /* synthetic */ NativeAdsFullBannerV2Activity$$ExternalSyntheticLambda6(NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, NativeAdsDto.Creative.FullBanner fullBanner, float f, Context context) {
        this.f$0 = nativeAdsFullBannerV2Activity;
        this.f$1 = getsupportedhighspeedresolutionsfor;
        this.f$2 = i;
        this.f$3 = nativeAdsDto;
        this.f$4 = getsupportedhighspeedresolutionsfor2;
        this.f$5 = getsupportedhighspeedresolutionsfor3;
        this.f$6 = fullBanner;
        this.f$7 = f;
        this.f$8 = context;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = NativeAdsFullBannerV2Activity.IAuthTabCallback(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onNavigationEvent + 111;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
