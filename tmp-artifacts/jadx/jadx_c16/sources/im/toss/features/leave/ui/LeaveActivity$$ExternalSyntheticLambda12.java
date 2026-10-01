package im.toss.features.leave.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.hitPageLevelWhiteList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LeaveActivity$$ExternalSyntheticLambda12 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ LeaveActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = LeaveActivity.onWarmupCompleted(this.f$0, (hitPageLevelWhiteList) obj);
        if (i3 != 0) {
            int i4 = 26 / 0;
        }
        return unitOnWarmupCompleted;
    }
}
