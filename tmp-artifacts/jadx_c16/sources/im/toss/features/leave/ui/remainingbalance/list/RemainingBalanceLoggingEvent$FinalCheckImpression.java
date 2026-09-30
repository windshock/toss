package im.toss.features.leave.ui.remainingbalance.list;

import im.toss.features.leave.common.log.RemainingListLogParam;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RemainingBalanceLoggingEvent$FinalCheckImpression implements RemainingBalanceLoggingEvent {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final List<RemainingListLogParam> onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof RemainingBalanceLoggingEvent$FinalCheckImpression)) {
            int i4 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onNavigationEvent, ((RemainingBalanceLoggingEvent$FinalCheckImpression) obj).onNavigationEvent)) {
            return true;
        }
        int i6 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            this.onNavigationEvent.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.onNavigationEvent.hashCode();
        int i3 = onWarmupCompleted + 57;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FinalCheckImpression(expiringList=" + this.onNavigationEvent + ")";
        int i2 = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public RemainingBalanceLoggingEvent$FinalCheckImpression(@NotNull List<RemainingListLogParam> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.onNavigationEvent = list;
    }

    public final List<RemainingListLogParam> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        List<RemainingListLogParam> list = this.onNavigationEvent;
        int i5 = i3 + 37;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }
}
