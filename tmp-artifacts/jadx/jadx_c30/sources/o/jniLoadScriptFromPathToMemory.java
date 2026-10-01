package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class jniLoadScriptFromPathToMemory {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("birthday6")
    private final String birthday6;

    @SerializedName("carrier")
    private final String carrier;

    @SerializedName("phoneNumber")
    private final String phoneNumber;

    @SerializedName("juminNo7th")
    private final String rrnSeventh;

    @SerializedName("name")
    private final String userName;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 27;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof jniLoadScriptFromPathToMemory)) {
            return false;
        }
        jniLoadScriptFromPathToMemory jniloadscriptfrompathtomemory = (jniLoadScriptFromPathToMemory) obj;
        if (!Intrinsics.areEqual(this.userName, jniloadscriptfrompathtomemory.userName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.birthday6, jniloadscriptfrompathtomemory.birthday6)) {
            int i4 = IAuthTabCallback + 93;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.rrnSeventh, jniloadscriptfrompathtomemory.rrnSeventh)) {
            int i6 = onNavigationEvent + 117;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.phoneNumber, jniloadscriptfrompathtomemory.phoneNumber)) {
            return !(Intrinsics.areEqual(this.carrier, jniloadscriptfrompathtomemory.carrier) ^ true);
        }
        int i8 = onNavigationEvent + 81;
        int i9 = i8 % 128;
        IAuthTabCallback = i9;
        int i10 = i8 % 2;
        int i11 = i9 + 29;
        onNavigationEvent = i11 % 128;
        if (i11 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.userName.hashCode() * 31) + this.birthday6.hashCode()) * 31) + this.rrnSeventh.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.carrier.hashCode();
        int i4 = onNavigationEvent + 43;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GuestUnderFourteenInfoResponse(userName=" + this.userName + ", birthday6=" + this.birthday6 + ", rrnSeventh=" + this.rrnSeventh + ", phoneNumber=" + this.phoneNumber + ", carrier=" + this.carrier + ")";
        int i2 = onNavigationEvent + 111;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 88 / 0;
        }
        return str;
    }
}
