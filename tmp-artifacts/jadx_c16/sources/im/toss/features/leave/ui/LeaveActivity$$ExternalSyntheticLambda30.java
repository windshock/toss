package im.toss.features.leave.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.setParentLayoutDirection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LeaveActivity$$ExternalSyntheticLambda30 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ LeaveActivity f$0;
    public final /* synthetic */ setParentLayoutDirection f$1;

    public /* synthetic */ LeaveActivity$$ExternalSyntheticLambda30(LeaveActivity leaveActivity, setParentLayoutDirection setparentlayoutdirection) {
        this.f$0 = leaveActivity;
        this.f$1 = setparentlayoutdirection;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = LeaveActivity.onWarmupCompleted(this.f$0, this.f$1);
        int i4 = IAuthTabCallback + 115;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
