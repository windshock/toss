package im.toss.core.tracker;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LogFlushScheduler$$ExternalSyntheticLambda5 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = LogFlushScheduler.onWarmupCompleted((Throwable) obj);
        int i4 = onWarmupCompleted + 9;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
