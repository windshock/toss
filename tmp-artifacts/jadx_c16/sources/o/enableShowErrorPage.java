package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class enableShowErrorPage {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    @SerializedName("amount")
    private final long amount;

    @SerializedName("date")
    private final String date;

    @SerializedName("depositSummary")
    private final String depositSummary;

    @SerializedName("doc")
    private final String doc;

    @SerializedName("fromAccountNo")
    private final String fromAccountNo;

    @SerializedName("fromAccountType")
    private final String fromAccountType;

    @SerializedName("signature")
    private final String signature;

    @SerializedName("toAccountNo")
    private final String toAccountNo;

    @SerializedName("lv0Cert")
    private final boolean useLv0Cert;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enableShowErrorPage)) {
            return false;
        }
        enableShowErrorPage enableshowerrorpage = (enableShowErrorPage) obj;
        if (this.amount != enableshowerrorpage.amount || !Intrinsics.areEqual(this.depositSummary, enableshowerrorpage.depositSummary) || !Intrinsics.areEqual(this.fromAccountNo, enableshowerrorpage.fromAccountNo)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.fromAccountType, enableshowerrorpage.fromAccountType)) {
            int i4 = onExtraCallbackWithResult + 109;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        Object obj2 = null;
        if (!Intrinsics.areEqual(this.toAccountNo, enableshowerrorpage.toAccountNo)) {
            int i6 = onExtraCallbackWithResult + 95;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.doc, enableshowerrorpage.doc) || !Intrinsics.areEqual(this.signature, enableshowerrorpage.signature) || !Intrinsics.areEqual(this.date, enableshowerrorpage.date) || this.useLv0Cert != enableshowerrorpage.useLv0Cert) {
            return false;
        }
        int i7 = onExtraCallbackWithResult + 47;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((Long.hashCode(this.amount) * 31) + this.depositSummary.hashCode()) * 31) + this.fromAccountNo.hashCode()) * 31) + this.fromAccountType.hashCode()) * 31) + this.toAccountNo.hashCode()) * 31) + this.doc.hashCode()) * 31) + this.signature.hashCode()) * 31) + this.date.hashCode()) * 31) + Boolean.hashCode(this.useLv0Cert);
        int i4 = onExtraCallback + 43;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "JointDepositReqDto(amount=" + this.amount + ", depositSummary=" + this.depositSummary + ", fromAccountNo=" + this.fromAccountNo + ", fromAccountType=" + this.fromAccountType + ", toAccountNo=" + this.toAccountNo + ", doc=" + this.doc + ", signature=" + this.signature + ", date=" + this.date + ", useLv0Cert=" + this.useLv0Cert + ")";
        int i2 = onExtraCallback + 73;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public enableShowErrorPage(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.amount = j;
        this.depositSummary = str;
        this.fromAccountNo = str2;
        this.fromAccountType = str3;
        this.toAccountNo = str4;
        this.doc = str5;
        this.signature = str6;
        this.date = str7;
        this.useLv0Cert = z;
    }
}
