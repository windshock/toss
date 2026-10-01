package im.toss.core.webkit.bridge;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.startRunning;
import o.surfaceDestroyed;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AbsFetchContactsHandler$$ExternalSyntheticLambda5 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i2 % 128;
        Object obj2 = null;
        startRunning startrunning = (startRunning) obj;
        if (i2 % 2 == 0) {
            surfaceDestroyed.onWarmupCompleted(startrunning);
            throw null;
        }
        Unit unitOnWarmupCompleted = surfaceDestroyed.onWarmupCompleted(startrunning);
        int i3 = onExtraCallbackWithResult + 19;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        obj2.hashCode();
        throw null;
    }
}
