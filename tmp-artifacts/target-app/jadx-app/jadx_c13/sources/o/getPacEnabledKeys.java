package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getPacEnabledKeys {
    public static final double onWarmupCompleted(int i, int i2) {
        return ((i << 27) + i2) / 9.007199254740992E15d;
    }

    public static final Random onWarmupCompleted(@NotNull java.util.Random random) {
        Random randomOnWarmupCompleted;
        Intrinsics.checkNotNullParameter(random, "");
        getMemoryDumpList getmemorydumplist = random instanceof getMemoryDumpList ? (getMemoryDumpList) random : null;
        return (getmemorydumplist == null || (randomOnWarmupCompleted = getmemorydumplist.onWarmupCompleted()) == null) ? new getRegisters(random) : randomOnWarmupCompleted;
    }
}
