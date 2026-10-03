package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class allowRTL {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("endDate")
    private final String endDate;

    @SerializedName("isTroll")
    private final boolean isTroll;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 55;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof allowRTL)) {
            return false;
        }
        allowRTL allowrtl = (allowRTL) obj;
        if (this.isTroll != allowrtl.isTroll) {
            return false;
        }
        if (Intrinsics.areEqual(this.endDate, allowrtl.endDate)) {
            int i6 = onWarmupCompleted + 31;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        int i8 = onWarmupCompleted + 81;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Boolean.hashCode(this.isTroll);
        String str = this.endDate;
        if (str == null) {
            int i2 = onNavigationEvent;
            int i3 = i2 + 89;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 23;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FangirlSavingBoxTrollUserResponse(isTroll=" + this.isTroll + ", endDate=" + this.endDate + ")";
        int i2 = onWarmupCompleted + 1;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.isTroll;
        }
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.endDate;
        int i4 = i3 + 119;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }
}
