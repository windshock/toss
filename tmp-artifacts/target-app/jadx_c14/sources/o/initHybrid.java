package o;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class initHybrid {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    @SerializedName("waitingTransferAmount")
    private final long waitingTransferAmount;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 3;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof initHybrid) {
            return this.waitingTransferAmount == ((initHybrid) obj).waitingTransferAmount;
        }
        int i4 = i2 + 109;
        onExtraCallback = i4 % 128;
        return i4 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.waitingTransferAmount);
        int i4 = onExtraCallbackWithResult + 111;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BalanceSummary(waitingTransferAmount=" + this.waitingTransferAmount + ")";
        int i2 = onExtraCallbackWithResult + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 101;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = this.waitingTransferAmount;
        int i5 = i2 + 93;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
