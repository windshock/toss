package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class rmy extends lt10<fby4> {
    private final rl onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rmy(@NotNull rl rlVar) {
        super(fby7.onNavigationEvent.onNavigationEvent(), rlVar.onWarmupCompleted(), "monthName");
        Intrinsics.checkNotNullParameter(rlVar, "");
        this.onWarmupCompleted = rlVar;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof rmy) && Intrinsics.areEqual(this.onWarmupCompleted.onWarmupCompleted(), ((rmy) obj).onWarmupCompleted.onWarmupCompleted());
    }

    public int hashCode() {
        return this.onWarmupCompleted.onWarmupCompleted().hashCode();
    }
}
