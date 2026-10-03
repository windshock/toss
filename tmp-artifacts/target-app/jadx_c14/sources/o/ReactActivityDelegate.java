package o;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ReactActivityDelegate {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    @SerializedName("balance")
    private final long balance;

    @SerializedName("savingBoxId")
    private final long savingBoxId;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 125;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReactActivityDelegate)) {
            return false;
        }
        ReactActivityDelegate reactActivityDelegate = (ReactActivityDelegate) obj;
        if (this.balance != reactActivityDelegate.balance) {
            int i6 = i2 + 55;
            onExtraCallback = i6 % 128;
            return i6 % 2 != 0;
        }
        if (this.savingBoxId == reactActivityDelegate.savingBoxId) {
            return true;
        }
        int i7 = i4 + 81;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Long.hashCode(this.balance) * 31) + Long.hashCode(this.savingBoxId);
        int i4 = onExtraCallbackWithResult + 5;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TeensSavingBoxInfo(balance=" + this.balance + ", savingBoxId=" + this.savingBoxId + ")";
        int i2 = onExtraCallbackWithResult + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 1;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        long j = this.balance;
        int i5 = i2 + 39;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallback() {
        long j;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 39;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            j = this.savingBoxId;
            int i4 = 73 / 0;
        } else {
            j = this.savingBoxId;
        }
        int i5 = i2 + 67;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }
}
