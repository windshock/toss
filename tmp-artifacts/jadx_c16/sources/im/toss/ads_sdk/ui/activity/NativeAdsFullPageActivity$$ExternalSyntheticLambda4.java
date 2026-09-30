package im.toss.ads_sdk.ui.activity;

import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullPageActivity$$ExternalSyntheticLambda4 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ NativeAdsDto f$0;
    public final /* synthetic */ NativeAdsFullPageActivity f$1;

    public /* synthetic */ NativeAdsFullPageActivity$$ExternalSyntheticLambda4(NativeAdsDto nativeAdsDto, NativeAdsFullPageActivity nativeAdsFullPageActivity) {
        this.f$0 = nativeAdsDto;
        this.f$1 = nativeAdsFullPageActivity;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, this.f$1};
        Unit unit = (Unit) NativeAdsFullPageActivity.onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1418030783, 1418030785, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), objArr, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
        int i4 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
        return unit;
    }
}
