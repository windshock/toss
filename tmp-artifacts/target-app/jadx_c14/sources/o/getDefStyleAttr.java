package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getDefStyleAttr {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("accounts")
    private final List<onExtraCallbackWithResult> accounts;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 != 0;
        }
        if (obj instanceof getDefStyleAttr) {
            if (Intrinsics.areEqual(this.accounts, ((getDefStyleAttr) obj).accounts)) {
                return true;
            }
            int i3 = onWarmupCompleted + 19;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 28 / 0;
            }
            return false;
        }
        int i5 = onWarmupCompleted;
        int i6 = i5 + 27;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 + 91;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.accounts.hashCode();
        int i4 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossBankOpenBankingCheckRequest(accounts=" + this.accounts + ")";
        int i2 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getDefStyleAttr(@NotNull List<onExtraCallbackWithResult> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.accounts = list;
    }

    public static final class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        @SerializedName("accountNumber")
        private final String accountNumber;

        @SerializedName("bankCode")
        private final int bankCode;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onNavigationEvent + 41;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            if (this.bankCode != ((onExtraCallbackWithResult) obj).bankCode) {
                int i4 = onNavigationEvent + 43;
                int i5 = i4 % 128;
                IAuthTabCallback = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 41;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (!(!Intrinsics.areEqual(this.accountNumber, r6.accountNumber))) {
                return true;
            }
            int i9 = IAuthTabCallback + 39;
            int i10 = i9 % 128;
            onNavigationEvent = i10;
            int i11 = i9 % 2;
            int i12 = i10 + 43;
            IAuthTabCallback = i12 % 128;
            if (i12 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Integer.hashCode(this.bankCode);
            return i3 != 0 ? (iHashCode % 127) / this.accountNumber.hashCode() : (iHashCode * 31) + this.accountNumber.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Account(bankCode=" + this.bankCode + ", accountNumber=" + this.accountNumber + ")";
            int i2 = IAuthTabCallback + 13;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public onExtraCallbackWithResult(int i, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.bankCode = i;
            this.accountNumber = str;
        }
    }
}
