package viva.republica.toss.network.model.user;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RefundableTransactionInfo {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    @SerializedName("hasRefundBankAccount")
    private final boolean hasRefundBankAccount;

    @SerializedName("transactionCount")
    private final int transactionCount;

    /* JADX WARN: Multi-variable type inference failed */
    public RefundableTransactionInfo() {
        this(0, 0 == true ? 1 : 0, 3, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 55;
        onExtraCallbackWithResult = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RefundableTransactionInfo)) {
            return false;
        }
        RefundableTransactionInfo refundableTransactionInfo = (RefundableTransactionInfo) obj;
        if (this.transactionCount != refundableTransactionInfo.transactionCount) {
            int i4 = i2 + 77;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.hasRefundBankAccount == refundableTransactionInfo.hasRefundBankAccount) {
            return true;
        }
        int i6 = i2 + 45;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Integer.hashCode(this.transactionCount) * 31) + Boolean.hashCode(this.hasRefundBankAccount);
        int i4 = IAuthTabCallback + 27;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RefundableTransactionInfo(transactionCount=" + this.transactionCount + ", hasRefundBankAccount=" + this.hasRefundBankAccount + ")";
        int i2 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 58 / 0;
        }
        return str;
    }

    public RefundableTransactionInfo(int i, boolean z) {
        this.transactionCount = i;
        this.hasRefundBankAccount = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RefundableTransactionInfo(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        i = (i2 & 1) != 0 ? 0 : i;
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallback + 103;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 45;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 2;
            }
            z = false;
        }
        this(i, z);
    }
}
