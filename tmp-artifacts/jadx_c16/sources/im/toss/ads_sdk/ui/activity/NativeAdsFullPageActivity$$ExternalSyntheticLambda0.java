package im.toss.ads_sdk.ui.activity;

import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullPageActivity$$ExternalSyntheticLambda0 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ NativeAdsFullPageActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = {this.f$0};
            throw null;
        }
        Object[] objArr2 = {this.f$0};
        Unit unit = (Unit) NativeAdsFullPageActivity.onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 707638726, -707638726, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), objArr2, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
        int i3 = onNavigationEvent + 53;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }
}
