package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class uf extends lt9<fby4> {
    private final xz IAuthTabCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf(@NotNull xz xzVar) {
        super(fby7.onNavigationEvent.onNavigationEvent(), xzVar == xz.ZERO ? 2 : 1, xzVar == xz.SPACE ? 2 : null);
        Intrinsics.checkNotNullParameter(xzVar, "");
        this.IAuthTabCallback = xzVar;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof uf) && this.IAuthTabCallback == ((uf) obj).IAuthTabCallback;
    }

    public int hashCode() {
        return this.IAuthTabCallback.hashCode();
    }
}
