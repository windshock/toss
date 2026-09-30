package im.toss.ads_sdk.ui.activity;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullBannerActivity$$ExternalSyntheticLambda10 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ NativeAdsFullBannerActivity f$0;
    public final /* synthetic */ NativeAdsDto f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ NativeAdsFullBannerActivity$$ExternalSyntheticLambda10(NativeAdsFullBannerActivity nativeAdsFullBannerActivity, NativeAdsDto nativeAdsDto, boolean z, boolean z2, int i) {
        this.f$0 = nativeAdsFullBannerActivity;
        this.f$1 = nativeAdsDto;
        this.f$2 = z;
        this.f$3 = z2;
        this.f$4 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = NativeAdsFullBannerActivity.onWarmupCompleted(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onExtraCallback + 11;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
