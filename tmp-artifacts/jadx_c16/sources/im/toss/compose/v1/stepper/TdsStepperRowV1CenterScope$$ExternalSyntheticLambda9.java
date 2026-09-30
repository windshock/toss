package im.toss.compose.v1.stepper;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.resolveKeyPath;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TdsStepperRowV1CenterScope$$ExternalSyntheticLambda9 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ Function2 f$0;

    public final Object invoke(Object obj, Object obj2) {
        Unit unitOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnNavigationEvent = resolveKeyPath.onNavigationEvent(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            int i3 = 26 / 0;
        } else {
            unitOnNavigationEvent = resolveKeyPath.onNavigationEvent(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        int i4 = IAuthTabCallback + 87;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return unitOnNavigationEvent;
    }
}
