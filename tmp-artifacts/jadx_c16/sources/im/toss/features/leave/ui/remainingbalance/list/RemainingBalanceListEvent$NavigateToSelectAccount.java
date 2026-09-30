package im.toss.features.leave.ui.remainingbalance.list;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RemainingBalanceListEvent$NavigateToSelectAccount implements RemainingBalanceListEvent {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final String onExtraCallback;

    /* JADX WARN: Illegal instructions before constructor call */
    public RemainingBalanceListEvent$NavigateToSelectAccount() {
        String str = null;
        this(str, 1, str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        Object obj2 = null;
        if (!(obj instanceof RemainingBalanceListEvent$NavigateToSelectAccount)) {
            int i2 = onWarmupCompleted + 55;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (Intrinsics.areEqual(this.onExtraCallback, ((RemainingBalanceListEvent$NavigateToSelectAccount) obj).onExtraCallback)) {
            return true;
        }
        int i3 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        String str = this.onExtraCallback;
        if (str == null) {
            int i2 = onWarmupCompleted;
            int i3 = i2 + 95;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2 == 0 ? 1 : 0;
            int i5 = i2 + 35;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return i4;
        }
        int iHashCode = str.hashCode();
        int i7 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "NavigateToSelectAccount(bankNumber=" + this.onExtraCallback + ")";
        int i2 = onExtraCallbackWithResult + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public RemainingBalanceListEvent$NavigateToSelectAccount(@Nullable String str) {
        this.onExtraCallback = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RemainingBalanceListEvent$NavigateToSelectAccount(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted;
            int i3 = i2 + 27;
            onExtraCallbackWithResult = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 69;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
            str = null;
        }
        this(str);
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.onExtraCallback;
        int i5 = i3 + 89;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 22 / 0;
        }
        return str;
    }
}
