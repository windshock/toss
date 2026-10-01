package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RoundPostprocessor {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    @SerializedName("address")
    private final String address;

    @SerializedName("addressDetail")
    private final String addressDetail;

    @SerializedName("officeAddress")
    private final String officeAddress;

    @SerializedName("officeAddressDetail")
    private final String officeAddressDetail;

    @SerializedName("officeZipCode")
    private final String officeZipCode;

    @SerializedName("zipCode")
    private final String zipCode;

    public RoundPostprocessor() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundPostprocessor)) {
            int i2 = onNavigationEvent + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        RoundPostprocessor roundPostprocessor = (RoundPostprocessor) obj;
        if (!Intrinsics.areEqual(this.zipCode, roundPostprocessor.zipCode)) {
            int i4 = IAuthTabCallback + 9;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.address, roundPostprocessor.address)) {
            int i6 = onNavigationEvent + 97;
            int i7 = i6 % 128;
            IAuthTabCallback = i7;
            boolean z = i6 % 2 == 0;
            int i8 = i7 + 5;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 43 / 0;
            }
            return z;
        }
        if (!Intrinsics.areEqual(this.addressDetail, roundPostprocessor.addressDetail)) {
            int i10 = onNavigationEvent + 111;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.officeZipCode, roundPostprocessor.officeZipCode) || !Intrinsics.areEqual(this.officeAddress, roundPostprocessor.officeAddress)) {
            return false;
        }
        if (Intrinsics.areEqual(this.officeAddressDetail, roundPostprocessor.officeAddressDetail)) {
            return true;
        }
        int i12 = onNavigationEvent + 25;
        IAuthTabCallback = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int i;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 99;
        IAuthTabCallback = i3 % 128;
        int iHashCode5 = 1;
        if (i3 % 2 == 0) {
            str = this.zipCode;
            if (str == null) {
                i = 1;
                iHashCode = i;
                iHashCode2 = 0;
            } else {
                iHashCode = 1;
                iHashCode2 = str.hashCode();
            }
        } else {
            str = this.zipCode;
            if (str == null) {
                i = 0;
                iHashCode = i;
                iHashCode2 = 0;
            } else {
                iHashCode = 0;
                iHashCode2 = str.hashCode();
            }
        }
        String str2 = this.address;
        if (str2 == null) {
            int i4 = IAuthTabCallback + 93;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str2.hashCode();
        }
        String str3 = this.addressDetail;
        if (str3 == null) {
            int i6 = IAuthTabCallback + 13;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                iHashCode5 = 0;
            }
        } else {
            iHashCode5 = str3.hashCode();
            int i7 = onNavigationEvent + 115;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        String str4 = this.officeZipCode;
        if (str4 == null) {
            int i9 = IAuthTabCallback + 105;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str4.hashCode();
        }
        String str5 = this.officeAddress;
        int iHashCode6 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.officeAddressDetail;
        if (str6 != null) {
            iHashCode = str6.hashCode();
        }
        int i11 = (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode5) * 31) + iHashCode4) * 31) + iHashCode6) * 31) + iHashCode;
        int i12 = onNavigationEvent + 87;
        IAuthTabCallback = i12 % 128;
        int i13 = i12 % 2;
        return i11;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PlccKcbAddressInfo(zipCode=" + this.zipCode + ", address=" + this.address + ", addressDetail=" + this.addressDetail + ", officeZipCode=" + this.officeZipCode + ", officeAddress=" + this.officeAddress + ", officeAddressDetail=" + this.officeAddressDetail + ")";
        int i2 = onNavigationEvent + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public RoundPostprocessor(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.zipCode = str;
        this.address = str2;
        this.addressDetail = str3;
        this.officeZipCode = str4;
        this.officeAddress = str5;
        this.officeAddressDetail = str6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RoundPostprocessor(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str7;
        String str8;
        String str9;
        String str10;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i3 = onNavigationEvent + 41;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = 2 % 2;
            str7 = null;
        } else {
            str7 = str2;
        }
        if ((i & 4) != 0) {
            int i5 = 2 % 2;
            str8 = null;
        } else {
            str8 = str3;
        }
        if ((i & 8) != 0) {
            int i6 = IAuthTabCallback + 117;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 5 / 2;
            } else {
                int i8 = 2 % 2;
            }
            str9 = null;
        } else {
            str9 = str4;
        }
        if ((i & 16) != 0) {
            int i9 = onNavigationEvent + 85;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 33 / 0;
            }
            int i11 = 2 % 2;
            str10 = null;
        } else {
            str10 = str5;
        }
        this(str, str7, str8, str9, str10, (i & 32) == 0 ? str6 : null);
    }
}
