package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class runJSBundle {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    @SerializedName("firstHalfPassword")
    private final String firstHalfPassword;

    @SerializedName("guestSessionId")
    private final long guestSessionId;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof runJSBundle)) {
            return false;
        }
        runJSBundle runjsbundle = (runJSBundle) obj;
        if (this.guestSessionId != runjsbundle.guestSessionId) {
            return false;
        }
        if (Intrinsics.areEqual(this.firstHalfPassword, runjsbundle.firstHalfPassword)) {
            return true;
        }
        int i3 = onExtraCallback;
        int i4 = i3 + 63;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 13;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            iHashCode = Long.hashCode(this.guestSessionId) >> 36;
            str = this.firstHalfPassword;
        } else {
            iHashCode = Long.hashCode(this.guestSessionId) * 31;
            str = this.firstHalfPassword;
        }
        int iHashCode2 = iHashCode + str.hashCode();
        int i3 = onExtraCallback + 75;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode2;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UssCardFirstHalfPasswordVerifyRequest(guestSessionId=" + this.guestSessionId + ", firstHalfPassword=" + this.firstHalfPassword + ")";
        int i2 = onExtraCallbackWithResult + 39;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 22 / 0;
        }
        return str;
    }

    public runJSBundle(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.guestSessionId = j;
        this.firstHalfPassword = str;
    }
}
