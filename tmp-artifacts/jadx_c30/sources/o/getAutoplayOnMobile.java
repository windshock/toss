package o;

import com.google.gson.annotations.SerializedName;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getAutoplayOnMobile {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    @SerializedName("bankAccountId")
    private String bankAccountId;

    @SerializedName("inquiryResult")
    private onExtraCallback inquiryResult;

    @SerializedName("signedBankCodes")
    private Set<String> signedBankCodes;

    public static final class onExtraCallback {

        @SerializedName("key")
        private String key = "infotec";

        @SerializedName("data")
        private onNavigationEvent data = new onNavigationEvent();

        public static final class onNavigationEvent {
            private String bankCode;
            private String bankError;
            private String errorCode;
            private String message;
            private String status;
        }
    }

    public getAutoplayOnMobile() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getAutoplayOnMobile)) {
            int i2 = IAuthTabCallback + 53;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        getAutoplayOnMobile getautoplayonmobile = (getAutoplayOnMobile) obj;
        if (!Intrinsics.areEqual(this.bankAccountId, getautoplayonmobile.bankAccountId)) {
            int i4 = IAuthTabCallback + 93;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.inquiryResult, getautoplayonmobile.inquiryResult)) {
            int i6 = IAuthTabCallback + 23;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.signedBankCodes, getautoplayonmobile.signedBankCodes)) {
            return true;
        }
        int i8 = IAuthTabCallback + 29;
        onNavigationEvent = i8 % 128;
        return i8 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.bankAccountId;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.inquiryResult.hashCode();
        Set<String> set = this.signedBankCodes;
        if (set != null) {
            int i4 = onNavigationEvent + 61;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = set.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "InquireAccountHistoryReq(bankAccountId=" + this.bankAccountId + ", inquiryResult=" + this.inquiryResult + ", signedBankCodes=" + this.signedBankCodes + ")";
        int i2 = onNavigationEvent + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public getAutoplayOnMobile(@Nullable String str, @NotNull onExtraCallback onextracallback, @Nullable Set<String> set) {
        Intrinsics.checkNotNullParameter(onextracallback, BuildConfig.FLAVOR);
        this.bankAccountId = str;
        this.inquiryResult = onextracallback;
        this.signedBankCodes = set;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getAutoplayOnMobile(String str, onExtraCallback onextracallback, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 63;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            str = null;
        }
        onextracallback = (i & 2) != 0 ? new onExtraCallback() : onextracallback;
        if ((i & 4) != 0) {
            int i4 = IAuthTabCallback + 33;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            set = null;
        }
        this(str, onextracallback, set);
    }
}
