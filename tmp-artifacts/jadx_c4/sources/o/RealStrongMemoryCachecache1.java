package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RealStrongMemoryCachecache1 extends RealInterceptorChainproceed1 {
    private final int original;
    private final String prefs;
    private final int requested;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealStrongMemoryCachecache1(@NotNull String str, int i, int i2) {
        super("Unacceptable change : '" + str + "' (original=" + i + ", requested=" + i2 + ")");
        Intrinsics.checkNotNullParameter(str, "");
        this.prefs = str;
        this.original = i;
        this.requested = i2;
    }
}
