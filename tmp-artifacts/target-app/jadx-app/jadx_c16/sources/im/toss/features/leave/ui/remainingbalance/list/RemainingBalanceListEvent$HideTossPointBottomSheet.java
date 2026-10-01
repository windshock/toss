package im.toss.features.leave.ui.remainingbalance.list;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RemainingBalanceListEvent$HideTossPointBottomSheet implements RemainingBalanceListEvent {
    private static int IAuthTabCallback = 0;
    public static final RemainingBalanceListEvent$HideTossPointBottomSheet onExtraCallback = new RemainingBalanceListEvent$HideTossPointBottomSheet();
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onNavigationEvent + 11;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 46 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof RemainingBalanceListEvent$HideTossPointBottomSheet) {
            int i2 = IAuthTabCallback + 115;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = onExtraCallbackWithResult + 115;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 65;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return -1990197956;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 53;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 55;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return "HideTossPointBottomSheet";
        }
        obj.hashCode();
        throw null;
    }

    private RemainingBalanceListEvent$HideTossPointBottomSheet() {
    }
}
