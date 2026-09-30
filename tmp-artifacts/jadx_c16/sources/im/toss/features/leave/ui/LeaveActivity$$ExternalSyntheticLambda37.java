package im.toss.features.leave.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LeaveActivity$$ExternalSyntheticLambda37 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LeaveActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            LeaveActivity.IAuthTabCallback(this.f$0);
            throw null;
        }
        Unit unitIAuthTabCallback = LeaveActivity.IAuthTabCallback(this.f$0);
        int i3 = onWarmupCompleted + 69;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }
}
