package im.toss.features.leave.ui;

import kotlin.jvm.functions.Function0;
import o.setParentLayoutDirection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LeaveActivity$$ExternalSyntheticLambda26 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ setParentLayoutDirection f$0;
    public final /* synthetic */ LeaveActivity f$1;

    public /* synthetic */ LeaveActivity$$ExternalSyntheticLambda26(setParentLayoutDirection setparentlayoutdirection, LeaveActivity leaveActivity) {
        this.f$0 = setparentlayoutdirection;
        this.f$1 = leaveActivity;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        setParentLayoutDirection setparentlayoutdirection = this.f$0;
        if (i3 == 0) {
            return LeaveActivity.onWarmupCompleted(setparentlayoutdirection, this.f$1);
        }
        int i4 = 89 / 0;
        return LeaveActivity.onWarmupCompleted(setparentlayoutdirection, this.f$1);
    }
}
