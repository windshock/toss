package im.toss.ads_sdk.ui.v2.activity;

import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullBannerV2Activity$$ExternalSyntheticLambda16 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ NativeAdsFullBannerV2Activity f$0;
    public final /* synthetic */ NativeAdsDto.AdAsset f$1;

    public /* synthetic */ NativeAdsFullBannerV2Activity$$ExternalSyntheticLambda16(NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity, NativeAdsDto.AdAsset adAsset) {
        this.f$0 = nativeAdsFullBannerV2Activity;
        this.f$1 = adAsset;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity = this.f$0;
        if (i3 != 0) {
            Object[] objArr = {nativeAdsFullBannerV2Activity, this.f$1};
            int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            return (Unit) NativeAdsFullBannerV2Activity.onWarmupCompleted(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 637213313, iOnExtraCallbackWithResult, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -637213306);
        }
        Object[] objArr2 = {nativeAdsFullBannerV2Activity, this.f$1};
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
