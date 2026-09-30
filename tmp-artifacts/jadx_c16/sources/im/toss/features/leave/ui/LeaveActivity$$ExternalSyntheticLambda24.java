package im.toss.features.leave.ui;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.TwoLineExternalSyntheticLambda0;
import o.setDividerDrawable;
import o.setParentLayoutDirection;
import o.setTaggedAddrCtrl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LeaveActivity$$ExternalSyntheticLambda24 implements setTaggedAddrCtrl {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ LeaveActivity f$0;
    public final /* synthetic */ setParentLayoutDirection f$1;

    public /* synthetic */ LeaveActivity$$ExternalSyntheticLambda24(LeaveActivity leaveActivity, setParentLayoutDirection setparentlayoutdirection) {
        this.f$0 = leaveActivity;
        this.f$1 = setparentlayoutdirection;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj5 = null;
        LeaveActivity leaveActivity = this.f$0;
        setParentLayoutDirection setparentlayoutdirection = this.f$1;
        if (i3 != 0) {
            LeaveActivity.IAuthTabCallback(leaveActivity, setparentlayoutdirection, (setDividerDrawable) obj, (TwoLineExternalSyntheticLambda0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
            obj5.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = LeaveActivity.IAuthTabCallback(leaveActivity, setparentlayoutdirection, (setDividerDrawable) obj, (TwoLineExternalSyntheticLambda0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
        int i4 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }
}
