package im.toss.features.home.feature.cashflow;

import im.toss.features.home.feature.cashflow.CashflowSelectTransactionsViewModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CashflowSelectTransactionsViewModel$onWarmupCompleted$IAuthTabCallback implements CashflowSelectTransactionsViewModel.onWarmupCompleted {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private final long onExtraCallbackWithResult;
    private final List<CashflowSelectTransactionsViewModel.onWarmupCompleted.onExtraCallback> onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 13;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof CashflowSelectTransactionsViewModel$onWarmupCompleted$IAuthTabCallback)) {
            int i3 = IAuthTabCallback + 113;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        CashflowSelectTransactionsViewModel$onWarmupCompleted$IAuthTabCallback cashflowSelectTransactionsViewModel$onWarmupCompleted$IAuthTabCallback = (CashflowSelectTransactionsViewModel$onWarmupCompleted$IAuthTabCallback) obj;
        if (this.onExtraCallbackWithResult == cashflowSelectTransactionsViewModel$onWarmupCompleted$IAuthTabCallback.onExtraCallbackWithResult) {
            return Intrinsics.areEqual(this.onNavigationEvent, cashflowSelectTransactionsViewModel$onWarmupCompleted$IAuthTabCallback.onNavigationEvent);
        }
        int i5 = IAuthTabCallback + 81;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Long.hashCode(this.onExtraCallbackWithResult) * 31) + this.onNavigationEvent.hashCode();
        int i4 = IAuthTabCallback + 61;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DutchPayRequested(amount=" + this.onExtraCallbackWithResult + ", payments=" + this.onNavigationEvent + ")";
        int i2 = IAuthTabCallback + 79;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public CashflowSelectTransactionsViewModel$onWarmupCompleted$IAuthTabCallback(long j, @NotNull List<CashflowSelectTransactionsViewModel.onWarmupCompleted.onExtraCallback> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.onExtraCallbackWithResult = j;
        this.onNavigationEvent = list;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }

    public final List<CashflowSelectTransactionsViewModel.onWarmupCompleted.onExtraCallback> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        List<CashflowSelectTransactionsViewModel.onWarmupCompleted.onExtraCallback> list = this.onNavigationEvent;
        int i5 = i3 + 103;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
