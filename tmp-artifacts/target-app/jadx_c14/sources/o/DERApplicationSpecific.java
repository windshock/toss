package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DERApplicationSpecific {
    private final boolean onExtraCallback;
    private final disableAutoRefresh onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DERApplicationSpecific)) {
            return false;
        }
        DERApplicationSpecific dERApplicationSpecific = (DERApplicationSpecific) obj;
        return Intrinsics.areEqual(this.onWarmupCompleted, dERApplicationSpecific.onWarmupCompleted) && this.onExtraCallback == dERApplicationSpecific.onExtraCallback;
    }

    public int hashCode() {
        return (this.onWarmupCompleted.hashCode() * 31) + Boolean.hashCode(this.onExtraCallback);
    }

    public String toString() {
        return "TransactionItem(transaction=" + this.onWarmupCompleted + ", hideDate=" + this.onExtraCallback + ")";
    }

    public DERApplicationSpecific(@NotNull disableAutoRefresh disableautorefresh, boolean z) {
        Intrinsics.checkNotNullParameter(disableautorefresh, "");
        this.onWarmupCompleted = disableautorefresh;
        this.onExtraCallback = z;
    }

    public final disableAutoRefresh onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    public final boolean onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }
}
