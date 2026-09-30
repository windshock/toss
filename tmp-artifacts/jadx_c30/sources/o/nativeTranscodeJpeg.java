package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class nativeTranscodeJpeg {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("driveLicenseNo")
    private final String driveLicenseNo;

    @SerializedName("identificationIssueName")
    private final String identificationIssueName;

    @SerializedName("identificationNo")
    private final String identificationNo;

    @SerializedName("identificationPathCode")
    private final String identificationPathCode;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nativeTranscodeJpeg)) {
            int i2 = onNavigationEvent + 39;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        nativeTranscodeJpeg nativetranscodejpeg = (nativeTranscodeJpeg) obj;
        if (Intrinsics.areEqual(this.identificationPathCode, nativetranscodejpeg.identificationPathCode)) {
            return Intrinsics.areEqual(this.driveLicenseNo, nativetranscodejpeg.driveLicenseNo) && !(Intrinsics.areEqual(this.identificationIssueName, nativetranscodejpeg.identificationIssueName) ^ true) && Intrinsics.areEqual(this.identificationNo, nativetranscodejpeg.identificationNo);
        }
        int i4 = IAuthTabCallback + 21;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 9;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.identificationPathCode.hashCode();
        String str = this.driveLicenseNo;
        int iHashCode3 = 0;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.identificationIssueName;
        if (str2 == null) {
            int i2 = IAuthTabCallback + 27;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.identificationNo;
        if (str3 != null) {
            iHashCode3 = str3.hashCode();
            int i4 = onNavigationEvent + 95;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        return (((((iHashCode2 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PlccAuditIdVerifyReq(identificationPathCode=" + this.identificationPathCode + ", driveLicenseNo=" + this.driveLicenseNo + ", identificationIssueName=" + this.identificationIssueName + ", identificationNo=" + this.identificationNo + ")";
        int i2 = onNavigationEvent + 51;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
