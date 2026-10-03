package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class handleCxxError {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    @SerializedName("accountNumber")
    private final String accountNumber;

    @SerializedName("bankCode")
    private final int bankCode;

    @SerializedName("bankName")
    private final String bankName;

    @SerializedName("depositAmount")
    private final long depositAmount;

    @SerializedName("depositLimit")
    private final long depositLimit;

    @SerializedName("isCloseToLimit")
    private final boolean isCloseToLimit;

    @SerializedName("requestChargingOneLink")
    private final String requestChargingOneLink;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback;
            int i3 = i2 + 125;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 27;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof handleCxxError)) {
            int i7 = onExtraCallback + 123;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        handleCxxError handlecxxerror = (handleCxxError) obj;
        if (!Intrinsics.areEqual(this.accountNumber, handlecxxerror.accountNumber)) {
            int i9 = onExtraCallback + 63;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (this.bankCode != handlecxxerror.bankCode || !Intrinsics.areEqual(this.bankName, handlecxxerror.bankName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.requestChargingOneLink, handlecxxerror.requestChargingOneLink)) {
            int i11 = IAuthTabCallback + 107;
            onExtraCallback = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 43 / 0;
            }
            return false;
        }
        if (this.depositAmount != handlecxxerror.depositAmount) {
            return false;
        }
        if (this.depositLimit == handlecxxerror.depositLimit) {
            return this.isCloseToLimit == handlecxxerror.isCloseToLimit;
        }
        int i13 = onExtraCallback + 75;
        IAuthTabCallback = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((this.accountNumber.hashCode() * 31) + Integer.hashCode(this.bankCode)) * 31) + this.bankName.hashCode()) * 31) + this.requestChargingOneLink.hashCode()) * 31) + Long.hashCode(this.depositAmount)) * 31) + Long.hashCode(this.depositLimit)) * 31) + Boolean.hashCode(this.isCloseToLimit);
        int i4 = onExtraCallback + 75;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TeensTossMoneyVirtualAccount(accountNumber=" + this.accountNumber + ", bankCode=" + this.bankCode + ", bankName=" + this.bankName + ", requestChargingOneLink=" + this.requestChargingOneLink + ", depositAmount=" + this.depositAmount + ", depositLimit=" + this.depositLimit + ", isCloseToLimit=" + this.isCloseToLimit + ")";
        int i2 = onExtraCallback + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            str = this.accountNumber;
            int i4 = 78 / 0;
        } else {
            str = this.accountNumber;
        }
        int i5 = i3 + 123;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.bankName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 37;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = this.depositAmount;
        int i5 = i2 + 113;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        long j = this.depositLimit;
        int i5 = i3 + 65;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.isCloseToLimit;
        }
        throw null;
    }
}
