package im.toss.features.leave.ui.remainingbalance.list;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RemainingBalanceLoggingEvent$SaveRefundAccountError implements RemainingBalanceLoggingEvent {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final RemainingBalanceLoggingEvent$SaveRefundAccountError onWarmupCompleted = new RemainingBalanceLoggingEvent$SaveRefundAccountError();

    static {
        int i = onExtraCallback + 5;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj || (obj instanceof RemainingBalanceLoggingEvent$SaveRefundAccountError)) {
            return true;
        }
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 47;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 37;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 87 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 107;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return 938142906;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 45;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 89;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return "SaveRefundAccountError";
    }

    private RemainingBalanceLoggingEvent$SaveRefundAccountError() {
    }
}
