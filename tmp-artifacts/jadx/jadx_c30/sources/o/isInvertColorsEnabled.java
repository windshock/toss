package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class isInvertColorsEnabled {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    @SerializedName("cardRegistrationDate")
    private final String cardRegistrationDate;

    @SerializedName("certificationMethod")
    private final isReduceMotionEnabled certificationMethod;

    @SerializedName("driverLicenseNumber")
    private final String driverLicenseNumber;

    @SerializedName("driverLicenseRegionCode")
    private final String driverLicenseRegionCode;

    @SerializedName("occupation")
    private final String occupation;

    @SerializedName("purposeOfTransaction")
    private final String purposeOfTransaction;

    @SerializedName("registrationNumber")
    private final String registrationNumber;

    @SerializedName("sourceOfFunds")
    private final String sourceOfFunds;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 77;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof isInvertColorsEnabled)) {
            return false;
        }
        isInvertColorsEnabled isinvertcolorsenabled = (isInvertColorsEnabled) obj;
        if (this.certificationMethod != isinvertcolorsenabled.certificationMethod || !Intrinsics.areEqual(this.registrationNumber, isinvertcolorsenabled.registrationNumber)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.cardRegistrationDate, isinvertcolorsenabled.cardRegistrationDate)) {
            int i4 = onExtraCallbackWithResult + 27;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.driverLicenseRegionCode, isinvertcolorsenabled.driverLicenseRegionCode)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.driverLicenseNumber, isinvertcolorsenabled.driverLicenseNumber)) {
            int i6 = onExtraCallbackWithResult + 1;
            IAuthTabCallback = i6 % 128;
            return i6 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.occupation, isinvertcolorsenabled.occupation)) {
            return Intrinsics.areEqual(this.purposeOfTransaction, isinvertcolorsenabled.purposeOfTransaction) && Intrinsics.areEqual(this.sourceOfFunds, isinvertcolorsenabled.sourceOfFunds);
        }
        int i7 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((this.certificationMethod.hashCode() * 31) + this.registrationNumber.hashCode()) * 31) + this.cardRegistrationDate.hashCode()) * 31) + this.driverLicenseRegionCode.hashCode()) * 31) + this.driverLicenseNumber.hashCode()) * 31) + this.occupation.hashCode()) * 31) + this.purposeOfTransaction.hashCode()) * 31) + this.sourceOfFunds.hashCode();
        int i4 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EddDoneRequest(certificationMethod=" + this.certificationMethod + ", registrationNumber=" + this.registrationNumber + ", cardRegistrationDate=" + this.cardRegistrationDate + ", driverLicenseRegionCode=" + this.driverLicenseRegionCode + ", driverLicenseNumber=" + this.driverLicenseNumber + ", occupation=" + this.occupation + ", purposeOfTransaction=" + this.purposeOfTransaction + ", sourceOfFunds=" + this.sourceOfFunds + ")";
        int i2 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
