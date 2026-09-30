package im.toss.features.leave.ui.remainingbalance.list;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RemainingBalanceLoggingEvent$ClickSkipButton implements RemainingBalanceLoggingEvent {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final RemainingBalanceLoggingEvent$ClickSkipButton onWarmupCompleted = new RemainingBalanceLoggingEvent$ClickSkipButton();

    static {
        int i = IAuthTabCallback + 125;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 79 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if ((r7 instanceof im.toss.features.leave.ui.remainingbalance.list.RemainingBalanceLoggingEvent$ClickSkipButton) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        r3 = r3 + 115;
        im.toss.features.leave.ui.remainingbalance.list.RemainingBalanceLoggingEvent$ClickSkipButton.onNavigationEvent = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r7 = r1 + 29;
        im.toss.features.leave.ui.remainingbalance.list.RemainingBalanceLoggingEvent$ClickSkipButton.onExtraCallbackWithResult = r7 % 128;
        r7 = r7 % 2;
        r1 = r1 + 79;
        im.toss.features.leave.ui.remainingbalance.list.RemainingBalanceLoggingEvent$ClickSkipButton.onExtraCallbackWithResult = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if ((r1 % 2) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 75;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        if (i3 % 2 == 0) {
            int i5 = 68 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 97;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 13;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return -133218417;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 5;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 57;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return "ClickSkipButton";
        }
        throw null;
    }

    private RemainingBalanceLoggingEvent$ClickSkipButton() {
    }
}
