package im.toss.base;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseActivity$$ExternalSyntheticLambda35 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = BaseActivity.onWarmupCompleted((Throwable) obj);
        int i4 = onNavigationEvent + 55;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
