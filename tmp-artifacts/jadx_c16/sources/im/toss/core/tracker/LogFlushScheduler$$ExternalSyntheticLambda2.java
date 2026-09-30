package im.toss.core.tracker;

import kotlin.jvm.functions.Function1;
import o.deserializeIntNullableCollection;
import o.serializeRaw;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LogFlushScheduler$$ExternalSyntheticLambda2 implements deserializeIntNullableCollection {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Function1 f$0;

    public final Object apply(Object obj) {
        serializeRaw serializerawOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            serializerawOnWarmupCompleted = LogFlushScheduler.onWarmupCompleted(this.f$0, obj);
            int i3 = 50 / 0;
        } else {
            serializerawOnWarmupCompleted = LogFlushScheduler.onWarmupCompleted(this.f$0, obj);
        }
        int i4 = onWarmupCompleted + 77;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return serializerawOnWarmupCompleted;
    }
}
