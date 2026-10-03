package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class jniExtendNativeModules {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    @SerializedName("name")
    private final String name;

    @SerializedName("phoneNumber")
    private final String phoneNumber;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jniExtendNativeModules)) {
            return false;
        }
        jniExtendNativeModules jniextendnativemodules = (jniExtendNativeModules) obj;
        if (!Intrinsics.areEqual(this.name, jniextendnativemodules.name)) {
            int i3 = IAuthTabCallback + 11;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.phoneNumber, jniextendnativemodules.phoneNumber)) {
            return true;
        }
        int i5 = IAuthTabCallback + 45;
        onWarmupCompleted = i5 % 128;
        return i5 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.name.hashCode() * 31) + this.phoneNumber.hashCode();
        int i4 = onWarmupCompleted + 117;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GuestRequestGuardianInfoResponse(name=" + this.name + ", phoneNumber=" + this.phoneNumber + ")";
        int i2 = onWarmupCompleted + 93;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
