package im.toss.features.leave.ui.remainingbalance.list;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RemainingBalanceLoggingEvent$DismissTossPointBottomSheet implements RemainingBalanceLoggingEvent {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof RemainingBalanceLoggingEvent$DismissTossPointBottomSheet) {
            return Intrinsics.areEqual(this.onWarmupCompleted, ((RemainingBalanceLoggingEvent$DismissTossPointBottomSheet) obj).onWarmupCompleted);
        }
        int i4 = i3 + 113;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            this.onWarmupCompleted.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.onWarmupCompleted.hashCode();
        int i3 = onNavigationEvent + 101;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 85 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DismissTossPointBottomSheet(buttonTitle=" + this.onWarmupCompleted + ")";
        int i2 = onNavigationEvent + 5;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 32 / 0;
        }
        return str;
    }

    public RemainingBalanceLoggingEvent$DismissTossPointBottomSheet(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onWarmupCompleted = str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
