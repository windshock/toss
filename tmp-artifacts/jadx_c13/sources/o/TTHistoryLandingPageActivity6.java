package o;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTHistoryLandingPageActivity6 {
    public static final int IAuthTabCallback(@NotNull AtomicInteger atomicInteger, int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(atomicInteger, "");
        do {
            i2 = atomicInteger.get();
            if ((i2 & i) != 0) {
                return 0;
            }
            i3 = i2 | i;
        } while (!atomicInteger.compareAndSet(i2, i3));
        return i3;
    }
}
