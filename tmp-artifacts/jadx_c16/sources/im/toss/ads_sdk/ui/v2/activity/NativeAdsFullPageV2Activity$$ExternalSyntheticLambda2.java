package im.toss.ads_sdk.ui.v2.activity;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullPageV2Activity$$ExternalSyntheticLambda2 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ NativeAdsDto f$0;
    public final /* synthetic */ NativeAdsFullPageV2Activity f$1;
    public final /* synthetic */ NativeAdsDto.Creative.FullPage f$2;

    public /* synthetic */ NativeAdsFullPageV2Activity$$ExternalSyntheticLambda2(NativeAdsDto nativeAdsDto, NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity, NativeAdsDto.Creative.FullPage fullPage) {
        this.f$0 = nativeAdsDto;
        this.f$1 = nativeAdsFullPageV2Activity;
        this.f$2 = fullPage;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto nativeAdsDto = this.f$0;
        if (i3 != 0) {
            return NativeAdsFullPageV2Activity.onExtraCallback(nativeAdsDto, this.f$1, this.f$2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        NativeAdsFullPageV2Activity.onExtraCallback(nativeAdsDto, this.f$1, this.f$2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
