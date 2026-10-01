package im.toss.features.benefit.ui;

import java.util.List;
import kotlin.Unit;
import o.AppMsgReceiver2;
import o.RotationVectorAbility1$onWarmupCompleted;
import o.getBacktraceNote;
import o.getNameByOperatorName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda34 implements getBacktraceNote {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ getNameByOperatorName f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = getNameByOperatorName.onWarmupCompleted(this.f$0, (AppMsgReceiver2) obj, (RotationVectorAbility1$onWarmupCompleted) obj2, (List) obj3);
        int i4 = onNavigationEvent + 91;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }
}
