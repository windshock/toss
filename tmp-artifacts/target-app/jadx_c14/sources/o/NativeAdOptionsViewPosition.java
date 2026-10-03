package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeAdOptionsViewPosition {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    @SerializedName("bankAccountNo")
    private final String bankAccountNo;

    @SerializedName("bankCode")
    private final String bankCode;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeAdOptionsViewPosition)) {
            int i2 = onExtraCallbackWithResult + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        NativeAdOptionsViewPosition nativeAdOptionsViewPosition = (NativeAdOptionsViewPosition) obj;
        if (!Intrinsics.areEqual(this.bankCode, nativeAdOptionsViewPosition.bankCode)) {
            int i4 = onExtraCallbackWithResult + 85;
            IAuthTabCallback = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.bankAccountNo, nativeAdOptionsViewPosition.bankAccountNo)) {
            return false;
        }
        int i5 = IAuthTabCallback + 69;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 26 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.bankCode.hashCode();
        return i3 != 0 ? (iHashCode << 112) % this.bankAccountNo.hashCode() : (iHashCode * 31) + this.bankAccountNo.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CheckAvailableCancelWithdrawAgreementAccount(bankCode=" + this.bankCode + ", bankAccountNo=" + this.bankAccountNo + ")";
        int i2 = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public NativeAdOptionsViewPosition(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.bankCode = str;
        this.bankAccountNo = str2;
    }
}
