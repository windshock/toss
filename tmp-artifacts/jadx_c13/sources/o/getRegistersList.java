package o;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getRegistersList extends getMemoryDumpOrBuilder {
    @Override // o.getMemoryDumpOrBuilder
    public Random onWarmupCompleted() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        Intrinsics.checkNotNullExpressionValue(threadLocalRandomCurrent, "");
        return threadLocalRandomCurrent;
    }

    @Override // kotlin.random.Random
    public int onExtraCallback(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // kotlin.random.Random
    public long onExtraCallback(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }
}
