package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class onHostDestroy {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    @SerializedName("account")
    private String account;

    @SerializedName("amount")
    private String amount;

    @SerializedName("bank")
    private String bankCode;

    @SerializedName("reserveTransfer")
    private boolean reserveTransfer;

    public onHostDestroy() {
        this(null, null, null, false, 15, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 31;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof onHostDestroy) {
            onHostDestroy onhostdestroy = (onHostDestroy) obj;
            return !(Intrinsics.areEqual(this.bankCode, onhostdestroy.bankCode) ^ true) && !(Intrinsics.areEqual(this.account, onhostdestroy.account) ^ true) && Intrinsics.areEqual(this.amount, onhostdestroy.amount) && this.reserveTransfer == onhostdestroy.reserveTransfer;
        }
        int i5 = i2 + 103;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.bankCode;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.account;
        if (str2 == null) {
            int i2 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.amount;
        if (str3 != null) {
            int i4 = onExtraCallbackWithResult + 43;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = str3.hashCode();
        }
        return (((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2) * 31) + Boolean.hashCode(this.reserveTransfer);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "InquiryAccountHolderReq(bankCode=" + this.bankCode + ", account=" + this.account + ", amount=" + this.amount + ", reserveTransfer=" + this.reserveTransfer + ")";
        int i2 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public onHostDestroy(@Nullable String str, @Nullable String str2, @Nullable String str3, boolean z) {
        this.bankCode = str;
        this.account = str2;
        this.amount = str3;
        this.reserveTransfer = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ onHostDestroy(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 35;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i5 = 2 % 2;
            str2 = null;
        }
        if ((i & 4) != 0) {
            int i6 = onNavigationEvent + 67;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            str3 = null;
        }
        if ((i & 8) != 0) {
            int i7 = onNavigationEvent + 15;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            z = false;
        }
        this(str, str2, str3, z);
    }

    public final void IAuthTabCallback(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 33;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.amount = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 29;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
