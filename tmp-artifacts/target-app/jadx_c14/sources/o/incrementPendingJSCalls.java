package o;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class incrementPendingJSCalls {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    @SerializedName("guestId")
    private final long guestId;

    @SerializedName("verifyId")
    private final long verifyId;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof incrementPendingJSCalls)) {
            int i4 = i3 + 35;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        incrementPendingJSCalls incrementpendingjscalls = (incrementPendingJSCalls) obj;
        if (this.guestId != incrementpendingjscalls.guestId) {
            return false;
        }
        if (this.verifyId == incrementpendingjscalls.verifyId) {
            return true;
        }
        int i6 = i3 + 27;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (Long.hashCode(this.guestId) >>> 50) % Long.hashCode(this.verifyId) : (Long.hashCode(this.guestId) * 31) + Long.hashCode(this.verifyId);
        int i3 = onExtraCallbackWithResult + 37;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GuestAddBankDepositRequest(guestId=" + this.guestId + ", verifyId=" + this.verifyId + ")";
        int i2 = IAuthTabCallback + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public incrementPendingJSCalls(long j, long j2) {
        this.guestId = j;
        this.verifyId = j2;
    }
}
