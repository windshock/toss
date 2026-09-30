package o;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class getToolkit {
    private final logicIssueCertMakePOPOSigningInputMsg<?> onNavigationEvent;
    private final Set<generateAesIV> onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getToolkit)) {
            return false;
        }
        getToolkit gettoolkit = (getToolkit) obj;
        return Intrinsics.areEqual(this.onWarmupCompleted, gettoolkit.onWarmupCompleted) && Intrinsics.areEqual(this.onNavigationEvent, gettoolkit.onNavigationEvent);
    }

    public int hashCode() {
        return (this.onWarmupCompleted.hashCode() * 31) + this.onNavigationEvent.hashCode();
    }

    public String toString() {
        return "StateAndEvent(targetStates=" + this.onWarmupCompleted + ", eventAndArgument=" + this.onNavigationEvent + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getToolkit(@NotNull Set<? extends generateAesIV> set, @NotNull logicIssueCertMakePOPOSigningInputMsg<?> logicissuecertmakepoposigninginputmsg) {
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(logicissuecertmakepoposigninginputmsg, "");
        this.onWarmupCompleted = set;
        this.onNavigationEvent = logicissuecertmakepoposigninginputmsg;
    }

    public final logicIssueCertMakePOPOSigningInputMsg<?> IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    public final Set<generateAesIV> onNavigationEvent() {
        return this.onWarmupCompleted;
    }
}
