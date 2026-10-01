package im.toss.compose.v1.stepper;

import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getSwitchMinWidth;
import o.resolveKeyPath;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TdsStepperRowV1CenterScope$$ExternalSyntheticLambda10 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ getSwitchMinWidth f$0;
    public final /* synthetic */ Function2 f$1;

    public /* synthetic */ TdsStepperRowV1CenterScope$$ExternalSyntheticLambda10(getSwitchMinWidth getswitchminwidth, Function2 function2) {
        this.f$0 = getswitchminwidth;
        this.f$1 = function2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getSwitchMinWidth getswitchminwidth = this.f$0;
        if (i3 != 0) {
            return resolveKeyPath.onExtraCallbackWithResult(getswitchminwidth, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        resolveKeyPath.onExtraCallbackWithResult(getswitchminwidth, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        throw null;
    }
}
