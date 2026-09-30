package o;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class WebpUtil {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("signId")
    private final long signId;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 31;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(!(obj instanceof WebpUtil))) {
            return this.signId == ((WebpUtil) obj).signId;
        }
        int i4 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.signId);
        int i4 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossOneUserCompleteRequest(signId=" + this.signId + ")";
        int i2 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
