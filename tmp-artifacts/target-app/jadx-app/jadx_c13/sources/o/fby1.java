package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class fby1 extends lt9<sya5> {
    private final xz onExtraCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fby1(@NotNull xz xzVar) {
        super(oby.onExtraCallback.onExtraCallbackWithResult(), xzVar == xz.ZERO ? 2 : 1, xzVar == xz.SPACE ? 2 : null);
        Intrinsics.checkNotNullParameter(xzVar, "");
        this.onExtraCallback = xzVar;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof fby1) && this.onExtraCallback == ((fby1) obj).onExtraCallback;
    }

    public int hashCode() {
        return this.onExtraCallback.hashCode();
    }
}
