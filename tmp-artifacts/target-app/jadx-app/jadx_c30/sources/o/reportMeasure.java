package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class reportMeasure extends reportTimeStamp {
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof reportMeasure) && Intrinsics.areEqual(this.onWarmupCompleted, ((reportMeasure) obj).onWarmupCompleted);
    }

    public int hashCode() {
        return this.onWarmupCompleted.hashCode();
    }

    public String toString() {
        return "TermGroupTitle(title=" + this.onWarmupCompleted + ")";
    }

    public final String onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }
}
