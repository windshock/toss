package im.toss.ads_sdk.ui.v2.activity;

import android.content.Context;
import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.getBacktraceNote;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullBannerV2Activity$$ExternalSyntheticLambda1 implements getBacktraceNote {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ NativeAdsDto.Creative.FullBanner f$0;
    public final /* synthetic */ NativeAdsDto f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ NativeAdsFullBannerV2Activity f$3;
    public final /* synthetic */ Context f$4;
    public final /* synthetic */ int f$5;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$6;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$7;

    public /* synthetic */ NativeAdsFullBannerV2Activity$$ExternalSyntheticLambda1(NativeAdsDto.Creative.FullBanner fullBanner, NativeAdsDto nativeAdsDto, float f, NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity, Context context, int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2) {
        this.f$0 = fullBanner;
        this.f$1 = nativeAdsDto;
        this.f$2 = f;
        this.f$3 = nativeAdsFullBannerV2Activity;
        this.f$4 = context;
        this.f$5 = i;
        this.f$6 = getsupportedhighspeedresolutionsfor;
        this.f$7 = getsupportedhighspeedresolutionsfor2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = NativeAdsFullBannerV2Activity.onWarmupCompleted(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i4 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
