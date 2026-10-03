package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class drop {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private boolean isSelected;

    @SerializedName("name")
    private final String name;

    @SerializedName("phoneNumber")
    private final String phoneNumber;

    @SerializedName("userNo")
    private final long userNo;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drop)) {
            return false;
        }
        drop dropVar = (drop) obj;
        if (!Intrinsics.areEqual(this.name, dropVar.name)) {
            int i3 = onWarmupCompleted + 91;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.phoneNumber, dropVar.phoneNumber)) {
            int i5 = onWarmupCompleted + 35;
            onExtraCallback = i5 % 128;
            return i5 % 2 == 0;
        }
        if (this.userNo != dropVar.userNo) {
            int i6 = onWarmupCompleted + 59;
            int i7 = i6 % 128;
            onExtraCallback = i7;
            z = i6 % 2 == 0;
            int i8 = i7 + 123;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
        }
        return z;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.name.hashCode();
        return (i3 != 0 ? ((iHashCode - 124) << this.phoneNumber.hashCode()) % 59 : ((iHashCode * 31) + this.phoneNumber.hashCode()) * 31) + Long.hashCode(this.userNo);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GuardianInfo(name=" + this.name + ", phoneNumber=" + this.phoneNumber + ", userNo=" + this.userNo + ")";
        int i2 = onWarmupCompleted + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 3;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.name;
        int i4 = i2 + 123;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.userNo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.isSelected;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        this.isSelected = z;
        int i5 = i3 + 51;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        if (this.userNo <= 0) {
            return false;
        }
        int i2 = onExtraCallback + 17;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 73;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }
}
