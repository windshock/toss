package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class zr extends lt9<yi> {
    private final xz onExtraCallbackWithResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr(@NotNull xz xzVar) {
        super(yzp.onExtraCallback.onExtraCallbackWithResult(), xzVar == xz.ZERO ? 2 : 1, xzVar == xz.SPACE ? 2 : null);
        Intrinsics.checkNotNullParameter(xzVar, "");
        this.onExtraCallbackWithResult = xzVar;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof zr) && this.onExtraCallbackWithResult == ((zr) obj).onExtraCallbackWithResult;
    }

    public int hashCode() {
        return this.onExtraCallbackWithResult.hashCode();
    }
}
