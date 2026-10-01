package im.toss.features.leave.ui.remainingbalance.list;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RemainingBalanceListEvent$CallCustomerService implements RemainingBalanceListEvent {
    private static int IAuthTabCallback = 0;
    public static final RemainingBalanceListEvent$CallCustomerService onExtraCallback = new RemainingBalanceListEvent$CallCustomerService();
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallbackWithResult + 37;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 103;
        onNavigationEvent = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj || (obj instanceof RemainingBalanceListEvent$CallCustomerService)) {
            return true;
        }
        int i4 = i2 + 5;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return -1895712898;
        }
        int i3 = 99 / 0;
        return -1895712898;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 31;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 83;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return "CallCustomerService";
    }

    private RemainingBalanceListEvent$CallCustomerService() {
    }
}
