package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class access2100 {
    public static final int $stable = 0;
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    @SerializedName("approvalCode")
    private final String approvalCode;

    @SerializedName("referenceNumber")
    private final String referenceNumber;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 113;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof access2100)) {
            return false;
        }
        access2100 access2100Var = (access2100) obj;
        if (!Intrinsics.areEqual(this.approvalCode, access2100Var.approvalCode)) {
            int i4 = onExtraCallback + 123;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.referenceNumber, access2100Var.referenceNumber)) {
            return true;
        }
        int i6 = onWarmupCompleted + 103;
        onExtraCallback = i6 % 128;
        return i6 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.approvalCode.hashCode();
        return i3 == 0 ? iHashCode * 22 * this.referenceNumber.hashCode() : (iHashCode * 31) + this.referenceNumber.hashCode();
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = this.approvalCode;
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 7;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.referenceNumber;
        int i5 = i2 + 73;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "JointCertIssueResponseModel(approvalCode=" + this.approvalCode + ", referenceNumber=" + this.referenceNumber + ")";
        int i2 = onWarmupCompleted + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
