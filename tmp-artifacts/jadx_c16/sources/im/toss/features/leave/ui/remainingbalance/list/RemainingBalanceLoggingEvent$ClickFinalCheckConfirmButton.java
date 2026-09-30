package im.toss.features.leave.ui.remainingbalance.list;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RemainingBalanceLoggingEvent$ClickFinalCheckConfirmButton implements RemainingBalanceLoggingEvent {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    public static final RemainingBalanceLoggingEvent$ClickFinalCheckConfirmButton onWarmupCompleted = new RemainingBalanceLoggingEvent$ClickFinalCheckConfirmButton();

    static {
        int i = onNavigationEvent + 39;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            if (obj instanceof RemainingBalanceLoggingEvent$ClickFinalCheckConfirmButton) {
                return true;
            }
            int i5 = i3 + 121;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = i3 + 59;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return 307493058;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return "ClickFinalCheckConfirmButton";
        }
        int i3 = 21 / 0;
        return "ClickFinalCheckConfirmButton";
    }

    private RemainingBalanceLoggingEvent$ClickFinalCheckConfirmButton() {
    }
}
