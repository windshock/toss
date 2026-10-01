package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class zbzb extends lt9<sya5> {
    private final xz onExtraCallbackWithResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbzb(@NotNull xz xzVar) {
        super(oby.onExtraCallback.onWarmupCompleted(), xzVar == xz.ZERO ? 2 : 1, xzVar == xz.SPACE ? 2 : null);
        Intrinsics.checkNotNullParameter(xzVar, "");
        this.onExtraCallbackWithResult = xzVar;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof zbzb) && this.onExtraCallbackWithResult == ((zbzb) obj).onExtraCallbackWithResult;
    }

    public int hashCode() {
        return this.onExtraCallbackWithResult.hashCode();
    }
}
