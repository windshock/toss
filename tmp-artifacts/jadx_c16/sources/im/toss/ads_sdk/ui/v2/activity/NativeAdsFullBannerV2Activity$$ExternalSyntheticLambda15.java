package im.toss.ads_sdk.ui.v2.activity;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullBannerV2Activity$$ExternalSyntheticLambda15 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ NativeAdsFullBannerV2Activity f$0;
    public final /* synthetic */ NativeAdsDto f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ NativeAdsFullBannerV2Activity$$ExternalSyntheticLambda15(NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity, NativeAdsDto nativeAdsDto, boolean z, boolean z2, int i) {
        this.f$0 = nativeAdsFullBannerV2Activity;
        this.f$1 = nativeAdsDto;
        this.f$2 = z;
        this.f$3 = z2;
        this.f$4 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return NativeAdsFullBannerV2Activity.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        NativeAdsFullBannerV2Activity.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        throw null;
    }
}
