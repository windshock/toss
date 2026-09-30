package im.toss.features.leave.ui;

import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.PreviewOrientationIncorrectQuirk;
import o.setParentLayoutDirection;
import o.v1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LeaveActivity$$ExternalSyntheticLambda7 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ PreviewOrientationIncorrectQuirk f$0;
    public final /* synthetic */ v1 f$1;
    public final /* synthetic */ LeaveActivity f$2;
    public final /* synthetic */ setParentLayoutDirection f$3;
    public final /* synthetic */ v1 f$4;
    public final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6 f$5;

    public /* synthetic */ LeaveActivity$$ExternalSyntheticLambda7(PreviewOrientationIncorrectQuirk previewOrientationIncorrectQuirk, v1 v1Var, LeaveActivity leaveActivity, setParentLayoutDirection setparentlayoutdirection, v1 v1Var2, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        this.f$0 = previewOrientationIncorrectQuirk;
        this.f$1 = v1Var;
        this.f$2 = leaveActivity;
        this.f$3 = setparentlayoutdirection;
        this.f$4 = v1Var2;
        this.f$5 = cameraPresenceProviderExternalSyntheticLambda6;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return LeaveActivity.onWarmupCompleted(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        LeaveActivity.onWarmupCompleted(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        throw null;
    }
}
