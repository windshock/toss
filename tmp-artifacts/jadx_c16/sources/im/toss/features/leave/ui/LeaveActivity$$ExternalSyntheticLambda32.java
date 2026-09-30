package im.toss.features.leave.ui;

import kotlin.jvm.functions.Function1;
import o.setParentLayoutDirection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LeaveActivity$$ExternalSyntheticLambda32 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ setParentLayoutDirection f$0;
    public final /* synthetic */ LeaveActivity f$1;

    public /* synthetic */ LeaveActivity$$ExternalSyntheticLambda32(setParentLayoutDirection setparentlayoutdirection, LeaveActivity leaveActivity) {
        this.f$0 = setparentlayoutdirection;
        this.f$1 = leaveActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        setParentLayoutDirection setparentlayoutdirection = this.f$0;
        if (i3 == 0) {
            return LeaveActivity.onWarmupCompleted(setparentlayoutdirection, this.f$1, (String) obj);
        }
        LeaveActivity.onWarmupCompleted(setparentlayoutdirection, this.f$1, (String) obj);
        throw null;
    }
}
