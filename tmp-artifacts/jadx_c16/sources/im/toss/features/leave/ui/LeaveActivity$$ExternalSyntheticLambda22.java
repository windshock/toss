package im.toss.features.leave.ui;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.TwoLineExternalSyntheticLambda0;
import o.setDividerDrawable;
import o.setParentLayoutDirection;
import o.setTaggedAddrCtrl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LeaveActivity$$ExternalSyntheticLambda22 implements setTaggedAddrCtrl {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ setParentLayoutDirection f$0;
    public final /* synthetic */ LeaveActivity f$1;

    public /* synthetic */ LeaveActivity$$ExternalSyntheticLambda22(setParentLayoutDirection setparentlayoutdirection, LeaveActivity leaveActivity) {
        this.f$0 = setparentlayoutdirection;
        this.f$1 = leaveActivity;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = LeaveActivity.onWarmupCompleted(this.f$0, this.f$1, (setDividerDrawable) obj, (TwoLineExternalSyntheticLambda0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
        int i4 = onExtraCallback + 73;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj5 = null;
        obj5.hashCode();
        throw null;
    }
}
