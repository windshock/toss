package im.toss.features.leave.ui;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LeaveActivity$$ExternalSyntheticLambda41 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LeaveActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        LeaveActivity leaveActivity = this.f$0;
        if (i3 == 0) {
            return LeaveActivity.onExtraCallbackWithResult(leaveActivity);
        }
        LeaveActivity.onExtraCallbackWithResult(leaveActivity);
        throw null;
    }
}
