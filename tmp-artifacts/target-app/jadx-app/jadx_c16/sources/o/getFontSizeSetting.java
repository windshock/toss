package o;

import com.google.gson.annotations.SerializedName;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeLogger;
import im.toss.features.account.impl.model.BankAccount;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.ApiServerError;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getFontSizeSetting extends BaseApiResponse<List<? extends IAuthTabCallback>> {

    public static final class IAuthTabCallback implements TitleBarOptionClickPoint {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        @SerializedName("bankAccountInfo")
        private BankAccount bankAccount;

        @SerializedName("bankAccount")
        private String bankAccountNo;

        @SerializedName("bankCode")
        private final long bankCode;

        @SerializedName(ApiDowngradeLogger.EXT_KEY_ERROR_CODE)
        private ApiServerError error;

        @SerializedName("resultType")
        private String resultType;

        public IAuthTabCallback() {
            this(null, 0L, null, null, null, 31, null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                int i4 = i3 + 71;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                return false;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            if (!Intrinsics.areEqual(this.bankAccountNo, iAuthTabCallback.bankAccountNo)) {
                return false;
            }
            if (this.bankCode != iAuthTabCallback.bankCode) {
                int i6 = onNavigationEvent + 119;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.bankAccount, iAuthTabCallback.bankAccount)) {
                int i8 = onExtraCallback + 65;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.resultType, iAuthTabCallback.resultType)) {
                return Intrinsics.areEqual(this.error, iAuthTabCallback.error);
            }
            int i10 = onNavigationEvent + 45;
            onExtraCallback = i10 % 128;
            return i10 % 2 != 0;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int iHashCode2 = this.bankAccountNo.hashCode();
            int iHashCode3 = Long.hashCode(this.bankCode);
            BankAccount bankAccount = this.bankAccount;
            int iHashCode4 = 0;
            if (bankAccount == null) {
                int i2 = onNavigationEvent + 25;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = bankAccount.hashCode();
            }
            int iHashCode5 = this.resultType.hashCode();
            ApiServerError apiServerError = this.error;
            if (apiServerError != null) {
                int i4 = onExtraCallback + 115;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                iHashCode4 = apiServerError.hashCode();
            }
            return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode4;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "UpdatedAccount(bankAccountNo=" + this.bankAccountNo + ", bankCode=" + this.bankCode + ", bankAccount=" + this.bankAccount + ", resultType=" + this.resultType + ", error=" + this.error + ")";
            int i2 = onNavigationEvent + 101;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public IAuthTabCallback(@NotNull String str, long j, @Nullable BankAccount bankAccount, @NotNull String str2, @Nullable ApiServerError apiServerError) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.bankAccountNo = str;
            this.bankCode = j;
            this.bankAccount = bankAccount;
            this.resultType = str2;
            this.error = apiServerError;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ IAuthTabCallback(String str, long j, BankAccount bankAccount, String str2, ApiServerError apiServerError, int i, DefaultConstructorMarker defaultConstructorMarker) {
            BankAccount bankAccount2;
            ApiServerError apiServerError2;
            String str3 = "";
            if ((i & 1) != 0) {
                int i2 = onNavigationEvent + 117;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
                str = "";
            }
            long j2 = (i & 2) != 0 ? 0L : j;
            if ((i & 4) != 0) {
                int i5 = onNavigationEvent + 59;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                bankAccount2 = null;
            } else {
                bankAccount2 = bankAccount;
            }
            if ((i & 8) != 0) {
                int i7 = onExtraCallback + 25;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            } else {
                str3 = str2;
            }
            if ((i & 16) != 0) {
                int i10 = onNavigationEvent + 53;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                int i12 = 2 % 2;
                apiServerError2 = null;
            } else {
                apiServerError2 = apiServerError;
            }
            this(str, j2, bankAccount2, str3, apiServerError2);
        }

        @Override // o.TitleBarOptionClickPoint
        public /* synthetic */ TabBarInfoQueryPointOnTabBarInfoQueryListener onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 117;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            BankAccount bankAccountOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i3 = onExtraCallback + 113;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 63 / 0;
            }
            return bankAccountOnExtraCallbackWithResult;
        }

        public BankAccount onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            BankAccount bankAccount = this.bankAccount;
            int i5 = i3 + 79;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return bankAccount;
            }
            throw null;
        }

        @Override // o.TitleBarOptionClickPoint
        public ApiServerError IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 111;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ApiServerError apiServerError = this.error;
            int i4 = i3 + 123;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 78 / 0;
            }
            return apiServerError;
        }
    }
}
