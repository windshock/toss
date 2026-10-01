package im.toss.features.leave.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LeaveActivity$$ExternalSyntheticLambda16 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ LeaveActivity f$0;

    public final Object invoke(Object obj) {
        Unit unitOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnWarmupCompleted = LeaveActivity.onWarmupCompleted(this.f$0, (String) obj);
            int i3 = 96 / 0;
        } else {
            unitOnWarmupCompleted = LeaveActivity.onWarmupCompleted(this.f$0, (String) obj);
        }
        int i4 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
