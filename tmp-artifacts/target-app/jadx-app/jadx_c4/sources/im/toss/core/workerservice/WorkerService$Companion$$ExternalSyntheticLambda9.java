package im.toss.core.workerservice;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.AbstractServiceC0065onCallback;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class WorkerService$Companion$$ExternalSyntheticLambda9 implements Function1 {
    public static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public static int onWarmupCompleted;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = AbstractServiceC0065onCallback.onExtraCallback.onNavigationEvent((Throwable) obj);
        int i4 = onExtraCallback + 15;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static int IAuthTabCallback() {
        int i = IAuthTabCallback;
        int i2 = i % 6321150;
        IAuthTabCallback = i + 1;
        if (i2 != 0) {
            return onWarmupCompleted;
        }
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        onWarmupCompleted = iFreeMemory;
        return iFreeMemory;
    }
}
