package im.toss.features.leave.ui;

import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.TwoLineExternalSyntheticLambda0;
import o.setDividerDrawable;
import o.setParentLayoutDirection;
import o.setTaggedAddrCtrl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LeaveActivity$$ExternalSyntheticLambda25 implements setTaggedAddrCtrl {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LeaveActivity f$0;
    public final /* synthetic */ setParentLayoutDirection f$1;
    public final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6 f$2;

    public /* synthetic */ LeaveActivity$$ExternalSyntheticLambda25(LeaveActivity leaveActivity, setParentLayoutDirection setparentlayoutdirection, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        this.f$0 = leaveActivity;
        this.f$1 = setparentlayoutdirection;
        this.f$2 = cameraPresenceProviderExternalSyntheticLambda6;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj5 = null;
            obj5.hashCode();
            throw null;
        }
        Unit unit = (Unit) LeaveActivity.onExtraCallback(new Object[]{this.f$0, this.f$1, this.f$2, (setDividerDrawable) obj, (TwoLineExternalSyntheticLambda0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())}, 584599087, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -584599087, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult());
        int i3 = IAuthTabCallback + 23;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }
}
