package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class nji extends lt9<yi> {
    private final xz onNavigationEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nji(@NotNull xz xzVar) {
        super(yzp.onExtraCallback.onWarmupCompleted(), xzVar == xz.ZERO ? 2 : 1, xzVar == xz.SPACE ? 2 : null);
        Intrinsics.checkNotNullParameter(xzVar, "");
        this.onNavigationEvent = xzVar;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof nji) && this.onNavigationEvent == ((nji) obj).onNavigationEvent;
    }

    public int hashCode() {
        return this.onNavigationEvent.hashCode();
    }
}
