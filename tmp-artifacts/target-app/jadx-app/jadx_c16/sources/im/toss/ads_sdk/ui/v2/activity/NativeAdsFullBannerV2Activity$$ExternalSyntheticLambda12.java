package im.toss.ads_sdk.ui.v2.activity;

import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullBannerV2Activity$$ExternalSyntheticLambda12 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ NativeAdsDto f$0;
    public final /* synthetic */ NativeAdsFullBannerV2Activity f$1;
    public final /* synthetic */ NativeAdsDto.Creative.FullBanner f$2;

    public /* synthetic */ NativeAdsFullBannerV2Activity$$ExternalSyntheticLambda12(NativeAdsDto nativeAdsDto, NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity, NativeAdsDto.Creative.FullBanner fullBanner) {
        this.f$0 = nativeAdsDto;
        this.f$1 = nativeAdsFullBannerV2Activity;
        this.f$2 = fullBanner;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {this.f$0, this.f$1, this.f$2, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
            int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            throw null;
        }
        Object[] objArr2 = {this.f$0, this.f$1, this.f$2, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        Unit unit = (Unit) NativeAdsFullBannerV2Activity.onWarmupCompleted(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr2, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 456664496, iOnExtraCallbackWithResult2, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -456664494);
        int i3 = IAuthTabCallback + 103;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 85 / 0;
        }
        return unit;
    }
}
