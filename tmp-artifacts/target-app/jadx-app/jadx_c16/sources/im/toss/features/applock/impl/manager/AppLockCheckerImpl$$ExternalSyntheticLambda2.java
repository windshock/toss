package im.toss.features.applock.impl.manager;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getProxy;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AppLockCheckerImpl$$ExternalSyntheticLambda2 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = getProxy.onWarmupCompleted((Throwable) obj);
        int i4 = onNavigationEvent + 67;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
