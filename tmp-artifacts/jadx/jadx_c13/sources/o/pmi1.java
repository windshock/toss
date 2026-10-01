package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class pmi1 extends lt9<sya5> {
    private final xz onNavigationEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pmi1(@NotNull xz xzVar) {
        super(oby.onExtraCallback.onNavigationEvent(), xzVar == xz.ZERO ? 2 : 1, xzVar == xz.SPACE ? 2 : null);
        Intrinsics.checkNotNullParameter(xzVar, "");
        this.onNavigationEvent = xzVar;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof pmi1) && this.onNavigationEvent == ((pmi1) obj).onNavigationEvent;
    }

    public int hashCode() {
        return this.onNavigationEvent.hashCode();
    }
}
