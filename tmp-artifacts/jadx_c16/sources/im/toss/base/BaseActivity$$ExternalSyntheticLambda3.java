package im.toss.base;

import im.toss.splittarget.spec.fsm.CriticalMalwareState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ BaseActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onNavigationEvent = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            BaseActivity.onExtraCallback(this.f$0, (CriticalMalwareState.State) obj);
            obj2.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = BaseActivity.onExtraCallback(this.f$0, (CriticalMalwareState.State) obj);
        int i3 = onWarmupCompleted + 91;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallback;
        }
        obj2.hashCode();
        throw null;
    }
}
