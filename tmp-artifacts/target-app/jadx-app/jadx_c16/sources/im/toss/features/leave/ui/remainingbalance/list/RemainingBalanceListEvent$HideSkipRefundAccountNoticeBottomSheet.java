package im.toss.features.leave.ui.remainingbalance.list;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RemainingBalanceListEvent$HideSkipRefundAccountNoticeBottomSheet implements RemainingBalanceListEvent {
    private static int IAuthTabCallback = 0;
    public static final RemainingBalanceListEvent$HideSkipRefundAccountNoticeBottomSheet onExtraCallback = new RemainingBalanceListEvent$HideSkipRefundAccountNoticeBottomSheet();
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallbackWithResult + 29;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof im.toss.features.leave.ui.remainingbalance.list.RemainingBalanceListEvent$HideSkipRefundAccountNoticeBottomSheet) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r2 = r2 + 53;
        im.toss.features.leave.ui.remainingbalance.list.RemainingBalanceListEvent$HideSkipRefundAccountNoticeBottomSheet.IAuthTabCallback = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            int i4 = 75 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 49;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return -1195027901;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return "HideSkipRefundAccountNoticeBottomSheet";
        }
        int i3 = 22 / 0;
        return "HideSkipRefundAccountNoticeBottomSheet";
    }

    private RemainingBalanceListEvent$HideSkipRefundAccountNoticeBottomSheet() {
    }
}
