package im.toss.ads_sdk.ui.activity;

import android.content.Context;
import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullBannerActivity$$ExternalSyntheticLambda8 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ NativeAdsFullBannerActivity f$0;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ NativeAdsDto f$3;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$4;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$5;
    public final /* synthetic */ NativeAdsDto.Creative.FullBanner f$6;
    public final /* synthetic */ float f$7;
    public final /* synthetic */ Context f$8;

    public /* synthetic */ NativeAdsFullBannerActivity$$ExternalSyntheticLambda8(NativeAdsFullBannerActivity nativeAdsFullBannerActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, NativeAdsDto.Creative.FullBanner fullBanner, float f, Context context) {
        this.f$0 = nativeAdsFullBannerActivity;
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
        int i2 = onExtraCallbackWithResult + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = NativeAdsFullBannerActivity.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onExtraCallback + 109;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }
}
