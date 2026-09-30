package im.toss.features.credit.ui.legacy.detail;

import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditStatusItemDetailActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ CreditStatusItemDetailActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (Throwable) obj};
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        if (i3 != 0) {
            return (Unit) CreditStatusItemDetailActivity.onNavigationEvent(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), objArr, -534397763, iOnExtraCallbackWithResult, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 534397766, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
        }
        throw null;
    }
}
