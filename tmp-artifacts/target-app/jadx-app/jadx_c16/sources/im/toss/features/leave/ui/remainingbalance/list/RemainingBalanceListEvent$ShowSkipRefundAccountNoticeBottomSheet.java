package im.toss.features.leave.ui.remainingbalance.list;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RemainingBalanceListEvent$ShowSkipRefundAccountNoticeBottomSheet implements RemainingBalanceListEvent {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    public static final RemainingBalanceListEvent$ShowSkipRefundAccountNoticeBottomSheet onExtraCallbackWithResult = new RemainingBalanceListEvent$ShowSkipRefundAccountNoticeBottomSheet();
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    static {
        int i = onNavigationEvent + 7;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 23;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof RemainingBalanceListEvent$ShowSkipRefundAccountNoticeBottomSheet) {
            return true;
        }
        int i4 = onWarmupCompleted + 3;
        int i5 = i4 % 128;
        onExtraCallback = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 61;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return 228532542;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 125;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return "ShowSkipRefundAccountNoticeBottomSheet";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private RemainingBalanceListEvent$ShowSkipRefundAccountNoticeBottomSheet() {
    }
}
