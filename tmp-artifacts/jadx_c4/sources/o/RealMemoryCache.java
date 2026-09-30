package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RealMemoryCache extends RealInterceptorChainproceed1 {
    private final int estimated;
    private final String prefs;
    private final int requested;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealMemoryCache(@NotNull String str, int i, int i2) {
        super("Invalid cipher generation requested : '" + str + "' (estimated=" + i + ", requested=" + i2 + ")");
        Intrinsics.checkNotNullParameter(str, "");
        this.prefs = str;
        this.estimated = i;
        this.requested = i2;
    }
}
