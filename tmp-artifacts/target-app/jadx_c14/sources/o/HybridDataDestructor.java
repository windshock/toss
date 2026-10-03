package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class HybridDataDestructor {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final Integer daysSinceInitialAgreement;
    private final int entireRestrictionDays;
    private final boolean isNotOpenBankingUser;
    private final Integer restrictionReleaseRemainingDays;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 31;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 21;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof HybridDataDestructor)) {
            return false;
        }
        HybridDataDestructor hybridDataDestructor = (HybridDataDestructor) obj;
        if (this.isNotOpenBankingUser != hybridDataDestructor.isNotOpenBankingUser) {
            return false;
        }
        if (this.entireRestrictionDays == hybridDataDestructor.entireRestrictionDays) {
            return Intrinsics.areEqual(this.daysSinceInitialAgreement, hybridDataDestructor.daysSinceInitialAgreement) && !(Intrinsics.areEqual(this.restrictionReleaseRemainingDays, hybridDataDestructor.restrictionReleaseRemainingDays) ^ true);
        }
        int i6 = i2 + 71;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = Boolean.hashCode(this.isNotOpenBankingUser);
        int iHashCode3 = Integer.hashCode(this.entireRestrictionDays);
        Integer num = this.daysSinceInitialAgreement;
        if (num == null) {
            int i4 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        Integer num2 = this.restrictionReleaseRemainingDays;
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OpenBankingWithdrawRestrictionResponse(isNotOpenBankingUser=" + this.isNotOpenBankingUser + ", entireRestrictionDays=" + this.entireRestrictionDays + ", daysSinceInitialAgreement=" + this.daysSinceInitialAgreement + ", restrictionReleaseRemainingDays=" + this.restrictionReleaseRemainingDays + ")";
        int i2 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.isNotOpenBankingUser;
        int i4 = i3 + 95;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 103;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.entireRestrictionDays;
        int i6 = i2 + 81;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final Integer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Integer num = this.daysSinceInitialAgreement;
        int i5 = i3 + 109;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Integer num = this.restrictionReleaseRemainingDays;
        int i5 = i3 + 107;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }
}
