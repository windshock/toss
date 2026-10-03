package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import o.toCircle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ResizeAndRotateProducer {
    public static final int $stable = 0;
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    @SerializedName("accountNumber")
    private final String accountNumber;

    @SerializedName("address")
    private final String address;

    @SerializedName("addressDetail")
    private final String addressDetail;

    @SerializedName("annualIncome")
    private final String annualIncome;

    @SerializedName("bankCode")
    private final int bankCode;

    @SerializedName("creditScore")
    private final String creditScore;

    @SerializedName("designCode")
    private final toCircle.IAuthTabCallback designCode;

    @SerializedName("englishFirstName")
    private final String englishFirstName;

    @SerializedName("englishLastName")
    private final String englishLastName;

    @SerializedName("englishName")
    private final String englishName;

    @SerializedName("homeAddress")
    private final boolean homeAddress;

    @SerializedName("name")
    private final String name;

    @SerializedName("rrn")
    private final String rrn;

    @SerializedName("traffic")
    private final boolean traffic;

    @SerializedName("zipCode")
    private final String zipCode;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResizeAndRotateProducer)) {
            int i2 = onExtraCallback + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        ResizeAndRotateProducer resizeAndRotateProducer = (ResizeAndRotateProducer) obj;
        if (!Intrinsics.areEqual(this.accountNumber, resizeAndRotateProducer.accountNumber)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.address, resizeAndRotateProducer.address)) {
            int i4 = onExtraCallback + 13;
            onWarmupCompleted = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.addressDetail, resizeAndRotateProducer.addressDetail) || this.bankCode != resizeAndRotateProducer.bankCode || !Intrinsics.areEqual(this.englishFirstName, resizeAndRotateProducer.englishFirstName) || !Intrinsics.areEqual(this.englishLastName, resizeAndRotateProducer.englishLastName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.englishName, resizeAndRotateProducer.englishName)) {
            int i5 = onExtraCallback + 105;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.homeAddress != resizeAndRotateProducer.homeAddress) {
            return false;
        }
        if (!Intrinsics.areEqual(this.name, resizeAndRotateProducer.name)) {
            int i7 = onWarmupCompleted + 81;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.rrn, resizeAndRotateProducer.rrn)) {
            int i9 = onExtraCallback + 113;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.zipCode, resizeAndRotateProducer.zipCode)) {
            return false;
        }
        if (this.designCode != resizeAndRotateProducer.designCode) {
            int i11 = onWarmupCompleted + 103;
            onExtraCallback = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 36 / 0;
            }
            return false;
        }
        if (this.traffic != resizeAndRotateProducer.traffic) {
            return false;
        }
        if (Intrinsics.areEqual(this.annualIncome, resizeAndRotateProducer.annualIncome)) {
            return Intrinsics.areEqual(this.creditScore, resizeAndRotateProducer.creditScore);
        }
        int i13 = onExtraCallback + 51;
        onWarmupCompleted = i13 % 128;
        return i13 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((((((((((((this.accountNumber.hashCode() * 31) + this.address.hashCode()) * 31) + this.addressDetail.hashCode()) * 31) + Integer.hashCode(this.bankCode)) * 31) + this.englishFirstName.hashCode()) * 31) + this.englishLastName.hashCode()) * 31) + this.englishName.hashCode()) * 31) + Boolean.hashCode(this.homeAddress)) * 31) + this.name.hashCode()) * 31) + this.rrn.hashCode()) * 31) + this.zipCode.hashCode()) * 31) + this.designCode.hashCode()) * 31) + Boolean.hashCode(this.traffic)) * 31) + this.annualIncome.hashCode()) * 31) + this.creditScore.hashCode();
        int i4 = onExtraCallback + 23;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PlccSimpleApplyReq(accountNumber=" + this.accountNumber + ", address=" + this.address + ", addressDetail=" + this.addressDetail + ", bankCode=" + this.bankCode + ", englishFirstName=" + this.englishFirstName + ", englishLastName=" + this.englishLastName + ", englishName=" + this.englishName + ", homeAddress=" + this.homeAddress + ", name=" + this.name + ", rrn=" + this.rrn + ", zipCode=" + this.zipCode + ", designCode=" + this.designCode + ", traffic=" + this.traffic + ", annualIncome=" + this.annualIncome + ", creditScore=" + this.creditScore + ")";
        int i2 = onExtraCallback + 95;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ResizeAndRotateProducer(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull toCircle.IAuthTabCallback iAuthTabCallback, boolean z2, @NotNull String str10, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.accountNumber = str;
        this.address = str2;
        this.addressDetail = str3;
        this.bankCode = i;
        this.englishFirstName = str4;
        this.englishLastName = str5;
        this.englishName = str6;
        this.homeAddress = z;
        this.name = str7;
        this.rrn = str8;
        this.zipCode = str9;
        this.designCode = iAuthTabCallback;
        this.traffic = z2;
        this.annualIncome = str10;
        this.creditScore = str11;
    }
}
