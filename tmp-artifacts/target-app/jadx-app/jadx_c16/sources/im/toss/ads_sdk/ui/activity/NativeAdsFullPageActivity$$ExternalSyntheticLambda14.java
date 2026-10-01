package im.toss.ads_sdk.ui.activity;

import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullPageActivity$$ExternalSyntheticLambda14 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ NativeAdsDto f$0;
    public final /* synthetic */ NativeAdsFullPageActivity f$1;

    public /* synthetic */ NativeAdsFullPageActivity$$ExternalSyntheticLambda14(NativeAdsDto nativeAdsDto, NativeAdsFullPageActivity nativeAdsFullPageActivity) {
        this.f$0 = nativeAdsDto;
        this.f$1 = nativeAdsFullPageActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, this.f$1, (String) obj};
        Unit unit = (Unit) NativeAdsFullPageActivity.onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -2142454425, 2142454426, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), objArr, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
        int i4 = onNavigationEvent + 29;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
