package o;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ReactFragmentCompanion {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("balanceLimit")
    private final long balanceLimit;

    @SerializedName("isAccountVerified")
    private final boolean isAccountVerified;

    @SerializedName("isBalanceLimitIncreased")
    private final boolean isBalanceLimitIncreased;

    @SerializedName("isKycVerified")
    private final boolean isKycVerified;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 123;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 + 61;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof ReactFragmentCompanion)) {
            return false;
        }
        ReactFragmentCompanion reactFragmentCompanion = (ReactFragmentCompanion) obj;
        if (this.isAccountVerified != reactFragmentCompanion.isAccountVerified) {
            int i8 = i4 + 109;
            onWarmupCompleted = i8 % 128;
            return i8 % 2 == 0;
        }
        if (this.isKycVerified == reactFragmentCompanion.isKycVerified) {
            return this.isBalanceLimitIncreased == reactFragmentCompanion.isBalanceLimitIncreased && this.balanceLimit == reactFragmentCompanion.balanceLimit;
        }
        int i9 = i4 + 13;
        onWarmupCompleted = i9 % 128;
        return i9 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        IAuthTabCallback = i2 % 128;
        int iHashCode = (i2 % 2 != 0 ? (((Boolean.hashCode(this.isAccountVerified) % Boolean.hashCode(this.isKycVerified)) - 100) + Boolean.hashCode(this.isBalanceLimitIncreased)) << 63 : ((((Boolean.hashCode(this.isAccountVerified) * 31) + Boolean.hashCode(this.isKycVerified)) * 31) + Boolean.hashCode(this.isBalanceLimitIncreased)) * 31) + Long.hashCode(this.balanceLimit);
        int i3 = onWarmupCompleted + 7;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TeensTossMoneyLimitCheckResponse(isAccountVerified=" + this.isAccountVerified + ", isKycVerified=" + this.isKycVerified + ", isBalanceLimitIncreased=" + this.isBalanceLimitIncreased + ", balanceLimit=" + this.balanceLimit + ")";
        int i2 = onWarmupCompleted + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 37;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.isAccountVerified;
        int i4 = i2 + 5;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        boolean z = this.isKycVerified;
        int i5 = i3 + 71;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        boolean z = this.isBalanceLimitIncreased;
        int i5 = i3 + 15;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }
}
