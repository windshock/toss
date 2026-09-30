package im.toss.ads_sdk.ui.activity;

import android.content.Context;
import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.getBacktraceNote;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullBannerActivity$$ExternalSyntheticLambda14 implements getBacktraceNote {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ NativeAdsDto.Creative.FullBanner f$0;
    public final /* synthetic */ NativeAdsDto f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ NativeAdsFullBannerActivity f$3;
    public final /* synthetic */ Context f$4;
    public final /* synthetic */ int f$5;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$6;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$7;

    public /* synthetic */ NativeAdsFullBannerActivity$$ExternalSyntheticLambda14(NativeAdsDto.Creative.FullBanner fullBanner, NativeAdsDto nativeAdsDto, float f, NativeAdsFullBannerActivity nativeAdsFullBannerActivity, Context context, int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2) {
        this.f$0 = fullBanner;
        this.f$1 = nativeAdsDto;
        this.f$2 = f;
        this.f$3 = nativeAdsFullBannerActivity;
        this.f$4 = context;
        this.f$5 = i;
        this.f$6 = getsupportedhighspeedresolutionsfor;
        this.f$7 = getsupportedhighspeedresolutionsfor2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = NativeAdsFullBannerActivity.onWarmupCompleted(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i4 = IAuthTabCallback + 103;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }
}
