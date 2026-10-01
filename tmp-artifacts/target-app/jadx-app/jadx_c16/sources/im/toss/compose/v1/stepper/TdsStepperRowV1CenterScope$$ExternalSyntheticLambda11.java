package im.toss.compose.v1.stepper;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getSwitchMinWidth;
import o.resolveKeyPath;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TdsStepperRowV1CenterScope$$ExternalSyntheticLambda11 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ resolveKeyPath f$0;
    public final /* synthetic */ Function2 f$1;
    public final /* synthetic */ Function2 f$2;
    public final /* synthetic */ getSwitchMinWidth f$3;
    public final /* synthetic */ int f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ TdsStepperRowV1CenterScope$$ExternalSyntheticLambda11(resolveKeyPath resolvekeypath, Function2 function2, Function2 function22, getSwitchMinWidth getswitchminwidth, int i, int i2) {
        this.f$0 = resolvekeypath;
        this.f$1 = function2;
        this.f$2 = function22;
        this.f$3 = getswitchminwidth;
        this.f$4 = i;
        this.f$5 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = resolveKeyPath.onWarmupCompleted(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
