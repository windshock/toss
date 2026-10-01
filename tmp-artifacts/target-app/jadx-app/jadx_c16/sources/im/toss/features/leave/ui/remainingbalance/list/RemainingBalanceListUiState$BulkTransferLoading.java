package im.toss.features.leave.ui.remainingbalance.list;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RemainingBalanceListUiState$BulkTransferLoading implements RemainingBalanceListUiState {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final int IAuthTabCallback;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof im.toss.features.leave.ui.remainingbalance.list.RemainingBalanceListUiState$BulkTransferLoading) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        if (r5.IAuthTabCallback == ((im.toss.features.leave.ui.remainingbalance.list.RemainingBalanceListUiState$BulkTransferLoading) r6).IAuthTabCallback) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        r2 = r2 + 125;
        im.toss.features.leave.ui.remainingbalance.list.RemainingBalanceListUiState$BulkTransferLoading.onExtraCallbackWithResult = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if ((r2 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
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
        int i2 = onExtraCallbackWithResult + 7;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            int i4 = 18 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.IAuthTabCallback;
        if (i3 != 0) {
            return Integer.hashCode(i4);
        }
        Integer.hashCode(i4);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BulkTransferLoading(amount=" + this.IAuthTabCallback + ")";
        int i2 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public RemainingBalanceListUiState$BulkTransferLoading(int i) {
        this.IAuthTabCallback = i;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
