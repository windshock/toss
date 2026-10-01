package im.toss.components.compose.extensions;

import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.ImageLoaderBuilderExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ImpressionKt$$ExternalSyntheticLambda7 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6 f$1;

    public /* synthetic */ ImpressionKt$$ExternalSyntheticLambda7(Function0 function0, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        this.f$0 = function0;
        this.f$1 = cameraPresenceProviderExternalSyntheticLambda6;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, this.f$1};
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        Unit unit = (Unit) ImageLoaderBuilderExternalSyntheticLambda1.onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, -563251459, 563251462);
        int i4 = onWarmupCompleted + 33;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
        return unit;
    }
}
