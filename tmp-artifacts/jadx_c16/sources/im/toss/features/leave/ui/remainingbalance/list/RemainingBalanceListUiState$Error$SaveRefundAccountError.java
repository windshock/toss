package im.toss.features.leave.ui.remainingbalance.list;

import im.toss.features.leave.ui.remainingbalance.list.RemainingBalanceListUiState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RemainingBalanceListUiState$Error$SaveRefundAccountError extends RemainingBalanceListUiState.Error {
    private static int IAuthTabCallback = 0;
    public static final RemainingBalanceListUiState$Error$SaveRefundAccountError onExtraCallback = new RemainingBalanceListUiState$Error$SaveRefundAccountError();
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    static {
        int i = IAuthTabCallback + 65;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof RemainingBalanceListUiState$Error$SaveRefundAccountError) {
            int i2 = onNavigationEvent + 39;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return -799694642;
        }
        int i3 = 39 / 0;
        return -799694642;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 1;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return "SaveRefundAccountError";
    }

    private RemainingBalanceListUiState$Error$SaveRefundAccountError() {
        super((DefaultConstructorMarker) null);
    }
}
