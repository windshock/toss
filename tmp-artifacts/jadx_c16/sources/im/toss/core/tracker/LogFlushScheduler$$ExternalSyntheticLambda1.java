package im.toss.core.tracker;

import kotlin.jvm.functions.Function1;
import o.serializeRaw;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LogFlushScheduler$$ExternalSyntheticLambda1 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onWarmupCompleted = i2 % 128;
        Object obj2 = null;
        Throwable th = (Throwable) obj;
        if (i2 % 2 == 0) {
            LogFlushScheduler.onExtraCallback(th);
            obj2.hashCode();
            throw null;
        }
        serializeRaw serializerawOnExtraCallback = LogFlushScheduler.onExtraCallback(th);
        int i3 = onWarmupCompleted + 125;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return serializerawOnExtraCallback;
        }
        throw null;
    }
}
