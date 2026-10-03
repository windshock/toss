package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class onHostPause {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    @SerializedName("receiverMaskedName")
    private final String receiverMaskedName;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof onHostPause) {
                return Intrinsics.areEqual(this.receiverMaskedName, ((onHostPause) obj).receiverMaskedName);
            }
            int i2 = onExtraCallbackWithResult + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = onWarmupCompleted + 17;
        int i5 = i4 % 128;
        onExtraCallbackWithResult = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 1;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.receiverMaskedName.hashCode();
        if (i3 == 0) {
            int i4 = 28 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PhoneTransferAvailableResponse(receiverMaskedName=" + this.receiverMaskedName + ")";
        int i2 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.receiverMaskedName;
        int i4 = i3 + 37;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }
}
