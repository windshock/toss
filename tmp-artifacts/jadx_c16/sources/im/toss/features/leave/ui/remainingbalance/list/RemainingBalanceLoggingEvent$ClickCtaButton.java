package im.toss.features.leave.ui.remainingbalance.list;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RemainingBalanceLoggingEvent$ClickCtaButton implements RemainingBalanceLoggingEvent {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    private final String onExtraCallback;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemainingBalanceLoggingEvent$ClickCtaButton)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallback, ((RemainingBalanceLoggingEvent$ClickCtaButton) obj).onExtraCallback)) {
            return true;
        }
        int i3 = onWarmupCompleted + 105;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onExtraCallback.hashCode();
        int i4 = onWarmupCompleted + 103;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ClickCtaButton(buttonTitle=" + this.onExtraCallback + ")";
        int i2 = onWarmupCompleted + 39;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RemainingBalanceLoggingEvent$ClickCtaButton(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallback = str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.onExtraCallback;
        int i4 = i3 + 61;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }
}
