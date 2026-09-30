package im.toss.features.edoc.register;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AptPasswordActivity$$ExternalSyntheticLambda13 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ AptPasswordActivity f$0;

    public final Object invoke(Object obj) {
        Unit unitOnNavigationEvent;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnNavigationEvent = AptPasswordActivity.onNavigationEvent(this.f$0, (Boolean) obj);
            int i3 = 81 / 0;
        } else {
            unitOnNavigationEvent = AptPasswordActivity.onNavigationEvent(this.f$0, (Boolean) obj);
        }
        int i4 = onWarmupCompleted + 3;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
