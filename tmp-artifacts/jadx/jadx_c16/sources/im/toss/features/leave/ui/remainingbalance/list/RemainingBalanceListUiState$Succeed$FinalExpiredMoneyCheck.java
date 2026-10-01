package im.toss.features.leave.ui.remainingbalance.list;

import im.toss.features.leave.ui.remainingbalance.RemainingBalanceUiItem;
import im.toss.features.leave.ui.remainingbalance.list.RemainingBalanceListUiState;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.setupInner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RemainingBalanceListUiState$Succeed$FinalExpiredMoneyCheck extends RemainingBalanceListUiState.Succeed {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final setupInner onExtraCallbackWithResult;
    private final List<RemainingBalanceUiItem> onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 17;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof RemainingBalanceListUiState$Succeed$FinalExpiredMoneyCheck)) {
            return false;
        }
        RemainingBalanceListUiState$Succeed$FinalExpiredMoneyCheck remainingBalanceListUiState$Succeed$FinalExpiredMoneyCheck = (RemainingBalanceListUiState$Succeed$FinalExpiredMoneyCheck) obj;
        if (this.onExtraCallbackWithResult != remainingBalanceListUiState$Succeed$FinalExpiredMoneyCheck.onExtraCallbackWithResult) {
            return false;
        }
        if (Intrinsics.areEqual(this.onWarmupCompleted, remainingBalanceListUiState$Succeed$FinalExpiredMoneyCheck.onWarmupCompleted)) {
            return true;
        }
        int i6 = onExtraCallback + 55;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onExtraCallback = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (this.onExtraCallbackWithResult.hashCode() + 75) % this.onWarmupCompleted.hashCode() : (this.onExtraCallbackWithResult.hashCode() * 31) + this.onWarmupCompleted.hashCode();
        int i3 = onExtraCallback + 97;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FinalExpiredMoneyCheck(enterType=" + this.onExtraCallbackWithResult + ", list=" + this.onWarmupCompleted + ")";
        int i2 = IAuthTabCallback + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemainingBalanceListUiState$Succeed$FinalExpiredMoneyCheck(@NotNull setupInner setupinner, @NotNull List<? extends RemainingBalanceUiItem> list) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(setupinner, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.onExtraCallbackWithResult = setupinner;
        this.onWarmupCompleted = list;
    }

    public final setupInner onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        setupInner setupinner = this.onExtraCallbackWithResult;
        if (i3 == 0) {
            int i4 = 9 / 0;
        }
        return setupinner;
    }

    public final List<RemainingBalanceUiItem> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 105;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        List<RemainingBalanceUiItem> list = this.onWarmupCompleted;
        int i4 = i2 + 93;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }
}
