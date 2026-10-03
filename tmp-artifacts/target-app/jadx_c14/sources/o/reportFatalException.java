package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class reportFatalException {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("trxId")
    private final String trxId;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 63;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof reportFatalException)) {
            int i4 = i2 + 99;
            onExtraCallbackWithResult = i4 % 128;
            return i4 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.trxId, ((reportFatalException) obj).trxId)) {
            return true;
        }
        int i5 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 47;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.trxId;
        if (str == null) {
            int i5 = i2 + 3;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }
        int iHashCode = str.hashCode();
        int i7 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DocumentWalletTermReq(trxId=" + this.trxId + ")";
        int i2 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public reportFatalException(@Nullable String str) {
        this.trxId = str;
    }
}
