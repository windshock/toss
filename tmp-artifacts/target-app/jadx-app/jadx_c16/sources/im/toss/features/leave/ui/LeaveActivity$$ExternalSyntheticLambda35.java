package im.toss.features.leave.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LeaveActivity$$ExternalSyntheticLambda35 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LeaveActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            LeaveActivity.onNavigationEvent(this.f$0);
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = LeaveActivity.onNavigationEvent(this.f$0);
        int i3 = IAuthTabCallback + 7;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }
}
