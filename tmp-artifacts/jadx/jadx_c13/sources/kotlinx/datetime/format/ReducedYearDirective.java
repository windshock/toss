package kotlinx.datetime.format;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.datetime.internal.format.ReducedIntFieldDirective;
import o.fby4;
import o.fby7;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ReducedYearDirective extends ReducedIntFieldDirective<fby4> {
    private final int IAuthTabCallback;
    private final boolean onWarmupCompleted;

    public /* synthetic */ ReducedYearDirective(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? false : z);
    }

    public ReducedYearDirective(int i, boolean z) {
        super(fby7.onNavigationEvent.onExtraCallback(), 2, i);
        this.IAuthTabCallback = i;
        this.onWarmupCompleted = z;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ReducedYearDirective)) {
            return false;
        }
        ReducedYearDirective reducedYearDirective = (ReducedYearDirective) obj;
        return this.IAuthTabCallback == reducedYearDirective.IAuthTabCallback && this.onWarmupCompleted == reducedYearDirective.onWarmupCompleted;
    }

    public int hashCode() {
        return (Integer.hashCode(this.IAuthTabCallback) * 31) + Boolean.hashCode(this.onWarmupCompleted);
    }
}
