package im.toss.ads_sdk.ui.activity;

import androidx.compose.foundation.layout.RowScope;
import im.toss.ads_sdk.model.NativeAdsDto;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullBannerActivity$$ExternalSyntheticLambda1 implements getBacktraceNote {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ NativeAdsFullBannerActivity f$0;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ NativeAdsDto f$3;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$4;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$5;

    public /* synthetic */ NativeAdsFullBannerActivity$$ExternalSyntheticLambda1(NativeAdsFullBannerActivity nativeAdsFullBannerActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3) {
        this.f$0 = nativeAdsFullBannerActivity;
        this.f$1 = getsupportedhighspeedresolutionsfor;
        this.f$2 = i;
        this.f$3 = nativeAdsDto;
        this.f$4 = getsupportedhighspeedresolutionsfor2;
        this.f$5 = getsupportedhighspeedresolutionsfor3;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return NativeAdsFullBannerActivity.IAuthTabCallback(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        NativeAdsFullBannerActivity.IAuthTabCallback(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        throw null;
    }
}
