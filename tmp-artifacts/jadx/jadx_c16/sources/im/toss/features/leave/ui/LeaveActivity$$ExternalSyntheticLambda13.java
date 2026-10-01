package im.toss.features.leave.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LeaveActivity$$ExternalSyntheticLambda13 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ LeaveActivity f$0;

    public final Object invoke() {
        Unit unitOnTransact;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnTransact = LeaveActivity.onTransact(this.f$0);
            int i3 = 50 / 0;
        } else {
            unitOnTransact = LeaveActivity.onTransact(this.f$0);
        }
        int i4 = IAuthTabCallback + 17;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
