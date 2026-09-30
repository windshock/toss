package o;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class lambdainitialize3 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    @SerializedName("remainingSmsCount")
    private final int remainingSmsCount;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lambdainitialize3)) {
            int i5 = i3 + 79;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.remainingSmsCount == ((lambdainitialize3) obj).remainingSmsCount) {
            return true;
        }
        int i7 = i3 + 19;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 62 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Integer.hashCode(this.remainingSmsCount);
            obj.hashCode();
            throw null;
        }
        int iHashCode = Integer.hashCode(this.remainingSmsCount);
        int i3 = IAuthTabCallback + 47;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GuestUnderFourteenSmsRemainingCountResponse(remainingSmsCount=" + this.remainingSmsCount + ")";
        int i2 = IAuthTabCallback + 43;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
