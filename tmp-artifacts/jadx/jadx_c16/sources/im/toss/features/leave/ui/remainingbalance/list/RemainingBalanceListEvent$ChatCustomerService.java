package im.toss.features.leave.ui.remainingbalance.list;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RemainingBalanceListEvent$ChatCustomerService implements RemainingBalanceListEvent {
    private static int IAuthTabCallback = 1;
    public static final RemainingBalanceListEvent$ChatCustomerService onExtraCallback = new RemainingBalanceListEvent$ChatCustomerService();
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    static {
        int i = onNavigationEvent + 21;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 5 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 123;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 113;
            IAuthTabCallback = i4 % 128;
            return i4 % 2 != 0;
        }
        if (obj instanceof RemainingBalanceListEvent$ChatCustomerService) {
            return true;
        }
        int i5 = i2 + 99;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            int i4 = 60 / 0;
        }
        int i5 = i3 + 43;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return -2076095676;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 3;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 81;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return "ChatCustomerService";
    }

    private RemainingBalanceListEvent$ChatCustomerService() {
    }
}
