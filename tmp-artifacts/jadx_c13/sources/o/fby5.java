package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class fby5 extends lt6<fby4> {
    private final xz IAuthTabCallback;
    private final boolean onNavigationEvent;

    public /* synthetic */ fby5(xz xzVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(xzVar, (i & 2) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fby5(@NotNull xz xzVar, boolean z) {
        super(fby7.onNavigationEvent.onExtraCallback(), Integer.valueOf(xzVar != xz.ZERO ? 1 : 4), null, xzVar == xz.SPACE ? 4 : null, 4);
        Intrinsics.checkNotNullParameter(xzVar, "");
        this.IAuthTabCallback = xzVar;
        this.onNavigationEvent = z;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof fby5)) {
            return false;
        }
        fby5 fby5Var = (fby5) obj;
        return this.IAuthTabCallback == fby5Var.IAuthTabCallback && this.onNavigationEvent == fby5Var.onNavigationEvent;
    }

    public int hashCode() {
        return (this.IAuthTabCallback.hashCode() * 31) + Boolean.hashCode(this.onNavigationEvent);
    }
}
