package im.toss.compose.v1.stepper;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.SpannedDataExternalSyntheticLambda0;
import o.resumeAnimation;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TdsStepperRowV1RightScope$$ExternalSyntheticLambda3 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ resumeAnimation f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ TdsStepperRowV1RightScope$$ExternalSyntheticLambda3(resumeAnimation resumeanimation, int i) {
        this.f$0 = resumeanimation;
        this.f$1 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            unit = (Unit) resumeAnimation.onExtraCallback(-1397945531, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this.f$0, Integer.valueOf(this.f$1), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1397945531, SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
            int i3 = 38 / 0;
        } else {
            unit = (Unit) resumeAnimation.onExtraCallback(-1397945531, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this.f$0, Integer.valueOf(this.f$1), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1397945531, SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
        }
        int i4 = IAuthTabCallback + 15;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
