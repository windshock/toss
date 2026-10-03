package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.verify.VerifyBaseInfo;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getCatalystInstance extends VerifyBaseInfo {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    @SerializedName("bankAccountNo")
    private final String bankAccountNo;

    @SerializedName("bankCode")
    private final long bankCode;

    @SerializedName("userNo")
    private final Long userNo;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 25;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getCatalystInstance)) {
            return false;
        }
        getCatalystInstance getcatalystinstance = (getCatalystInstance) obj;
        if (this.bankCode == getcatalystinstance.bankCode) {
            return Intrinsics.areEqual(this.bankAccountNo, getcatalystinstance.bankAccountNo) && Intrinsics.areEqual(this.userNo, getcatalystinstance.userNo);
        }
        int i4 = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Long.hashCode(this.bankCode);
            this.bankAccountNo.hashCode();
            throw null;
        }
        int iHashCode2 = Long.hashCode(this.bankCode);
        int iHashCode3 = this.bankAccountNo.hashCode();
        Long l = this.userNo;
        if (l == null) {
            int i3 = onExtraCallbackWithResult + 47;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = l.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BankAccountHolderRequest(bankCode=" + this.bankCode + ", bankAccountNo=" + this.bankAccountNo + ", userNo=" + this.userNo + ")";
        int i2 = IAuthTabCallback + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public getCatalystInstance(long j, @NotNull String str, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bankCode = j;
        this.bankAccountNo = str;
        this.userNo = l;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getCatalystInstance(long j, String str, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = IAuthTabCallback + 21;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 43;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            l = null;
        }
        this(j, str, l);
    }
}
