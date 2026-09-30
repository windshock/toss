package o;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getDescriptionTextColor {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("balanceExposure")
    private final boolean balanceExposure;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 79;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        if (this != obj) {
            if (obj instanceof getDescriptionTextColor) {
                return this.balanceExposure == ((getDescriptionTextColor) obj).balanceExposure;
            }
            int i6 = i2 + 21;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = i4 + 11;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        int i10 = i4 + 83;
        onWarmupCompleted = i10 % 128;
        int i11 = i10 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.balanceExposure);
        int i4 = onWarmupCompleted + 33;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OnlineBalanceExposureReq(balanceExposure=" + this.balanceExposure + ")";
        int i2 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
