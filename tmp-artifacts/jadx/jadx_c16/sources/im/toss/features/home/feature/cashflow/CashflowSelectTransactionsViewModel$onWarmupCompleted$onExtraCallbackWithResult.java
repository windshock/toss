package im.toss.features.home.feature.cashflow;

import im.toss.features.home.feature.cashflow.CashflowSelectTransactionsViewModel;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CashflowSelectTransactionsViewModel$onWarmupCompleted$onExtraCallbackWithResult implements CashflowSelectTransactionsViewModel.onWarmupCompleted {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final int onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof CashflowSelectTransactionsViewModel$onWarmupCompleted$onExtraCallbackWithResult) {
            if (this.onExtraCallbackWithResult == ((CashflowSelectTransactionsViewModel$onWarmupCompleted$onExtraCallbackWithResult) obj).onExtraCallbackWithResult) {
                return true;
            }
            int i2 = onWarmupCompleted + 67;
            onExtraCallback = i2 % 128;
            return i2 % 2 != 0;
        }
        int i3 = onWarmupCompleted + 91;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.onExtraCallbackWithResult);
        int i4 = onExtraCallback + 51;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShowToast(stringResId=" + this.onExtraCallbackWithResult + ")";
        int i2 = onWarmupCompleted + 51;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public CashflowSelectTransactionsViewModel$onWarmupCompleted$onExtraCallbackWithResult(int i) {
        this.onExtraCallbackWithResult = i;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 55;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onExtraCallbackWithResult;
        int i6 = i2 + 99;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
