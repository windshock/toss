package o;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getFabricUIManager {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    @SerializedName("verifyId")
    private final long verifyId;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof getFabricUIManager) {
            return this.verifyId == ((getFabricUIManager) obj).verifyId;
        }
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 71;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 89;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.verifyId);
        int i4 = IAuthTabCallback + 37;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BankDepositSendResponse(verifyId=" + this.verifyId + ")";
        int i2 = onExtraCallbackWithResult + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        long j = this.verifyId;
        int i5 = i3 + 65;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }
}
