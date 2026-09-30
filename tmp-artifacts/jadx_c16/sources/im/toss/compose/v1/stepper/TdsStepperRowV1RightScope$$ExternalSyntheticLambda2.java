package im.toss.compose.v1.stepper;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.getBacktraceNote;
import o.resumeAnimation;
import o.setCallToAction;
import o.setClickDestinationBackupUri;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TdsStepperRowV1RightScope$$ExternalSyntheticLambda2 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ resumeAnimation f$0;
    public final /* synthetic */ QuirksExternalSyntheticBackport0 f$1;
    public final /* synthetic */ int f$10;
    public final /* synthetic */ int f$11;
    public final /* synthetic */ Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 f$2;
    public final /* synthetic */ setCallToAction.IAuthTabCallback f$3;
    public final /* synthetic */ setClickDestinationBackupUri f$4;
    public final /* synthetic */ setCallToAction.onNavigationEvent f$5;
    public final /* synthetic */ boolean f$6;
    public final /* synthetic */ Function0 f$7;
    public final /* synthetic */ boolean f$8;
    public final /* synthetic */ getBacktraceNote f$9;

    public /* synthetic */ TdsStepperRowV1RightScope$$ExternalSyntheticLambda2(resumeAnimation resumeanimation, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, setCallToAction.IAuthTabCallback iAuthTabCallback, setClickDestinationBackupUri setclickdestinationbackupuri, setCallToAction.onNavigationEvent onnavigationevent, boolean z, Function0 function0, boolean z2, getBacktraceNote getbacktracenote, int i, int i2) {
        this.f$0 = resumeanimation;
        this.f$1 = quirksExternalSyntheticBackport0;
        this.f$2 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
        this.f$3 = iAuthTabCallback;
        this.f$4 = setclickdestinationbackupuri;
        this.f$5 = onnavigationevent;
        this.f$6 = z;
        this.f$7 = function0;
        this.f$8 = z2;
        this.f$9 = getbacktracenote;
        this.f$10 = i;
        this.f$11 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = resumeAnimation.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = IAuthTabCallback + 113;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
