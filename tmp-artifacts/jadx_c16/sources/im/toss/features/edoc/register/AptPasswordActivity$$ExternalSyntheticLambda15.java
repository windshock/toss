package im.toss.features.edoc.register;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AptPasswordActivity$$ExternalSyntheticLambda15 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ AptPasswordActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = AptPasswordActivity.onNavigationEvent(this.f$0, (Throwable) obj);
        if (i3 != 0) {
            int i4 = 92 / 0;
        }
        return unitOnNavigationEvent;
    }
}
