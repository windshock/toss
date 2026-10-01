package im.toss.features.leave.ui.remainingbalance.list;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RemainingBalanceListEvent$ShowTopToast implements RemainingBalanceListEvent {
    private static int IAuthTabCallback = 1;
    public static final RemainingBalanceListEvent$ShowTopToast onExtraCallback = new RemainingBalanceListEvent$ShowTopToast();
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallbackWithResult + 67;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj || (obj instanceof RemainingBalanceListEvent$ShowTopToast)) {
            return true;
        }
        int i4 = i3 + 1;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 9;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return 90320586;
        }
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 79;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 27;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return "ShowTopToast";
    }

    private RemainingBalanceListEvent$ShowTopToast() {
    }
}
