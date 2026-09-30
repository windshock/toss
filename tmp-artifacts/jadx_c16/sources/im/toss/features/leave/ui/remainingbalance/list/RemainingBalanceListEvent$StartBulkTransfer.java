package im.toss.features.leave.ui.remainingbalance.list;

import kotlin.jvm.internal.Intrinsics;
import o.KeyBoardVisiblePoint;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RemainingBalanceListEvent$StartBulkTransfer implements RemainingBalanceListEvent {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final KeyBoardVisiblePoint onExtraCallbackWithResult;
    private final Boolean onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemainingBalanceListEvent$StartBulkTransfer)) {
            int i2 = onExtraCallback + 31;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 != 0;
        }
        RemainingBalanceListEvent$StartBulkTransfer remainingBalanceListEvent$StartBulkTransfer = (RemainingBalanceListEvent$StartBulkTransfer) obj;
        if (!Intrinsics.areEqual(this.onNavigationEvent, remainingBalanceListEvent$StartBulkTransfer.onNavigationEvent)) {
            int i3 = onExtraCallback + 109;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, remainingBalanceListEvent$StartBulkTransfer.onExtraCallbackWithResult)) {
            return true;
        }
        int i5 = onWarmupCompleted + 53;
        onExtraCallback = i5 % 128;
        return i5 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        Boolean bool = this.onNavigationEvent;
        int iHashCode2 = 0;
        if (bool == null) {
            int i2 = onExtraCallback + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = bool.hashCode();
        }
        KeyBoardVisiblePoint keyBoardVisiblePoint = this.onExtraCallbackWithResult;
        if (keyBoardVisiblePoint != null) {
            int i4 = onWarmupCompleted + 43;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = keyBoardVisiblePoint.hashCode();
            int i6 = onExtraCallback + 35;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StartBulkTransfer(settingMyAccount=" + this.onNavigationEvent + ", lastUpdatedAccount=" + this.onExtraCallbackWithResult + ")";
        int i2 = onWarmupCompleted + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public RemainingBalanceListEvent$StartBulkTransfer(@Nullable Boolean bool, @Nullable KeyBoardVisiblePoint keyBoardVisiblePoint) {
        this.onNavigationEvent = bool;
        this.onExtraCallbackWithResult = keyBoardVisiblePoint;
    }

    public final Boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Boolean bool = this.onNavigationEvent;
        int i5 = i3 + 105;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final KeyBoardVisiblePoint onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        KeyBoardVisiblePoint keyBoardVisiblePoint = this.onExtraCallbackWithResult;
        int i5 = i3 + 51;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return keyBoardVisiblePoint;
    }
}
