package im.toss.features.leave.ui.remainingbalance.list;

import im.toss.features.leave.ui.remainingbalance.list.RemainingBalanceListUiState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RemainingBalanceListUiState$Error$BulkTransferError extends RemainingBalanceListUiState.Error {
    public static final RemainingBalanceListUiState$Error$BulkTransferError IAuthTabCallback = new RemainingBalanceListUiState$Error$BulkTransferError();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallback + 121;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 123;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemainingBalanceListUiState$Error$BulkTransferError)) {
            return false;
        }
        int i4 = i2 + 39;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return -1336267475;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 95;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 31;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return "BulkTransferError";
        }
        obj.hashCode();
        throw null;
    }

    private RemainingBalanceListUiState$Error$BulkTransferError() {
        super((DefaultConstructorMarker) null);
    }
}
