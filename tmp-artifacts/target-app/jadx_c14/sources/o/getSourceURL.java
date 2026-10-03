package o;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getSourceURL {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("status")
    private final PhotoBrowseView status;

    @SerializedName("verifyId")
    private final long verifyId;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 17;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getSourceURL)) {
            return false;
        }
        getSourceURL getsourceurl = (getSourceURL) obj;
        if (this.status != getsourceurl.status) {
            int i4 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.verifyId == getsourceurl.verifyId) {
            return true;
        }
        int i6 = onExtraCallbackWithResult + 83;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.status.hashCode();
        return i3 == 0 ? (iHashCode - 23) - Long.hashCode(this.verifyId) : (iHashCode * 31) + Long.hashCode(this.verifyId);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "IdCardVerificationStatusResponse(status=" + this.status + ", verifyId=" + this.verifyId + ")";
        int i2 = onExtraCallbackWithResult + 85;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 63 / 0;
        }
        return str;
    }
}
