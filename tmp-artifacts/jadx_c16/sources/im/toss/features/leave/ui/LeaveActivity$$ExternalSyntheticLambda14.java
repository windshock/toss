package im.toss.features.leave.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.setParentLayoutDirection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LeaveActivity$$ExternalSyntheticLambda14 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ setParentLayoutDirection f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            LeaveActivity.onWarmupCompleted(this.f$0, ((Boolean) obj).booleanValue());
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = LeaveActivity.onWarmupCompleted(this.f$0, ((Boolean) obj).booleanValue());
        int i3 = IAuthTabCallback + 15;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }
}
