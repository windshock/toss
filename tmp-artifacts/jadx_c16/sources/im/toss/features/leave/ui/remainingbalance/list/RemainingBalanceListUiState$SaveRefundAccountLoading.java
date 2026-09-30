package im.toss.features.leave.ui.remainingbalance.list;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RemainingBalanceListUiState$SaveRefundAccountLoading implements RemainingBalanceListUiState {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    public static final RemainingBalanceListUiState$SaveRefundAccountLoading onExtraCallbackWithResult = new RemainingBalanceListUiState$SaveRefundAccountLoading();
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onNavigationEvent + 1;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 31;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this != obj) {
            return !((obj instanceof RemainingBalanceListUiState$SaveRefundAccountLoading) ^ true);
        }
        int i5 = i2 + 67;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i2 + 87;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 87;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return -193945796;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 85;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return "SaveRefundAccountLoading";
    }

    private RemainingBalanceListUiState$SaveRefundAccountLoading() {
    }
}
