package im.toss.features.leave.ui.remainingbalance.list;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RemainingBalanceListEvent$RemainingBalanceCompleted implements RemainingBalanceListEvent {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public static final RemainingBalanceListEvent$RemainingBalanceCompleted onExtraCallbackWithResult = new RemainingBalanceListEvent$RemainingBalanceCompleted();
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onWarmupCompleted + 99;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 69 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 17;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        if (this != obj) {
            if (obj instanceof RemainingBalanceListEvent$RemainingBalanceCompleted) {
                return true;
            }
            int i6 = i4 + 57;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = i2 + 81;
        int i9 = i8 % 128;
        onExtraCallback = i9;
        int i10 = i8 % 2;
        int i11 = i9 + 87;
        onNavigationEvent = i11 % 128;
        int i12 = i11 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            int i4 = 9 / 0;
        }
        int i5 = i3 + 125;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return -906373654;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return "RemainingBalanceCompleted";
        }
        throw null;
    }

    private RemainingBalanceListEvent$RemainingBalanceCompleted() {
    }
}
