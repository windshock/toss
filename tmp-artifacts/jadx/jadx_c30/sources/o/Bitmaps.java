package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class Bitmaps {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("accountInfoList")
    private final List<onNavigationEvent> accountInfoList;

    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        @SerializedName("accountNumber")
        private final String accountNumber;

        @SerializedName("bankCode")
        private final int bankCode;

        @SerializedName("createDate")
        private final String createDate;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                int i2 = onNavigationEvent + 93;
                IAuthTabCallback = i2 % 128;
                return i2 % 2 != 0;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (!Intrinsics.areEqual(this.accountNumber, onnavigationevent.accountNumber)) {
                int i3 = IAuthTabCallback + 19;
                onNavigationEvent = i3 % 128;
                return i3 % 2 == 0;
            }
            if (this.bankCode != onnavigationevent.bankCode) {
                int i4 = onNavigationEvent + 41;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.createDate, onnavigationevent.createDate)) {
                return true;
            }
            int i6 = onNavigationEvent + 87;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            onNavigationEvent = i2 % 128;
            return i2 % 2 == 0 ? (((r0 - 57) >>> Integer.hashCode(this.bankCode)) - 66) % this.createDate.hashCode() : (((this.accountNumber.hashCode() * 31) + Integer.hashCode(this.bankCode)) * 31) + this.createDate.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "PlccAuditAccountInfo(accountNumber=" + this.accountNumber + ", bankCode=" + this.bankCode + ", createDate=" + this.createDate + ")";
            int i2 = onNavigationEvent + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 15;
            onExtraCallback = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof Bitmaps)) {
            return false;
        }
        if (Intrinsics.areEqual(this.accountInfoList, ((Bitmaps) obj).accountInfoList)) {
            return true;
        }
        int i3 = onExtraCallback + 85;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.accountInfoList.hashCode();
        int i4 = onExtraCallback + 13;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PlccAuditCreditReq(accountInfoList=" + this.accountInfoList + ")";
        int i2 = onExtraCallback + 17;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 85 / 0;
        }
        return str;
    }
}
