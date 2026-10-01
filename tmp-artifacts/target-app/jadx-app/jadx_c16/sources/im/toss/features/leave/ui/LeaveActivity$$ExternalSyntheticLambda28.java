package im.toss.features.leave.ui;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LeaveActivity$$ExternalSyntheticLambda28 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ LeaveActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        LeaveActivity leaveActivity = this.f$0;
        if (i3 == 0) {
            return LeaveActivity.IAuthTabCallbackStub(leaveActivity);
        }
        LeaveActivity.IAuthTabCallbackStub(leaveActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
