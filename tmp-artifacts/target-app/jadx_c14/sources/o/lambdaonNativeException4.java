package o;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class lambdaonNativeException4 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("isExpired")
    private final boolean isExpired;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 39;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 + 81;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (obj instanceof lambdaonNativeException4) {
            return this.isExpired == ((lambdaonNativeException4) obj).isExpired;
        }
        int i8 = i4 + 43;
        onWarmupCompleted = i8 % 128;
        return i8 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.isExpired);
        int i4 = onWarmupCompleted + 13;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GuestUnderFourteenSessionExpiredResponse(isExpired=" + this.isExpired + ")";
        int i2 = onWarmupCompleted + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        boolean z = this.isExpired;
        int i5 = i3 + 121;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }
}
