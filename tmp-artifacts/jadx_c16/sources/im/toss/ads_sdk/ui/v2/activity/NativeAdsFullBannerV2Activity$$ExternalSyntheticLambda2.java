package im.toss.ads_sdk.ui.v2.activity;

import androidx.compose.foundation.layout.RowScope;
import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullBannerV2Activity$$ExternalSyntheticLambda2 implements getBacktraceNote {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ NativeAdsFullBannerV2Activity f$0;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ NativeAdsDto f$3;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$4;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$5;

    public /* synthetic */ NativeAdsFullBannerV2Activity$$ExternalSyntheticLambda2(NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3) {
        this.f$0 = nativeAdsFullBannerV2Activity;
        this.f$1 = getsupportedhighspeedresolutionsfor;
        this.f$2 = i;
        this.f$3 = nativeAdsDto;
        this.f$4 = getsupportedhighspeedresolutionsfor2;
        this.f$5 = getsupportedhighspeedresolutionsfor3;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = NativeAdsFullBannerV2Activity.IAuthTabCallback(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i4 = onExtraCallback + 105;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
