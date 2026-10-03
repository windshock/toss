package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class isBridgeless {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    @SerializedName("0")
    private final String accountNumber6;

    @SerializedName("1")
    private final String bankName;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 99;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof isBridgeless)) {
            return false;
        }
        isBridgeless isbridgeless = (isBridgeless) obj;
        if (!Intrinsics.areEqual(this.accountNumber6, isbridgeless.accountNumber6)) {
            return false;
        }
        if (Intrinsics.areEqual(this.bankName, isbridgeless.bankName)) {
            return true;
        }
        int i4 = onNavigationEvent + 89;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.accountNumber6.hashCode() * 31) + this.bankName.hashCode();
        int i4 = IAuthTabCallback + 91;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PrepareArsBankAccountRequest(accountNumber6=" + this.accountNumber6 + ", bankName=" + this.bankName + ")";
        int i2 = onNavigationEvent + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public isBridgeless(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.accountNumber6 = str;
        this.bankName = str2;
    }
}
