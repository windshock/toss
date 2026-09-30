package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class getYogaNode extends lt9<yi> {
    private final xz onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getYogaNode(@NotNull xz xzVar) {
        super(yzp.onExtraCallback.onExtraCallback(), xzVar == xz.ZERO ? 2 : 1, xzVar == xz.SPACE ? 2 : null);
        Intrinsics.checkNotNullParameter(xzVar, "");
        this.onWarmupCompleted = xzVar;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof getYogaNode) && this.onWarmupCompleted == ((getYogaNode) obj).onWarmupCompleted;
    }

    public int hashCode() {
        return this.onWarmupCompleted.hashCode();
    }
}
