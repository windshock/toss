package viva.republica.toss.network.model.loan;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanComparisonBenefitAlarmResult$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanComparisonBenefitAlarmResult {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final String nextAlarmAt;

    static {
        int i = onExtraCallback + 91;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LoanComparisonBenefitAlarmResult() {
        String str = null;
        this(str, 1, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 57;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof LoanComparisonBenefitAlarmResult) {
            return Intrinsics.areEqual(this.nextAlarmAt, ((LoanComparisonBenefitAlarmResult) obj).nextAlarmAt);
        }
        int i4 = onExtraCallbackWithResult + 75;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.nextAlarmAt.hashCode();
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanComparisonBenefitAlarmResult(nextAlarmAt=" + this.nextAlarmAt + ")";
        int i2 = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 57 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanComparisonBenefitAlarmResult> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            LoanComparisonBenefitAlarmResult$.serializer serializerVar = LoanComparisonBenefitAlarmResult$.serializer.INSTANCE;
            if (i3 == 0) {
                int i4 = 46 / 0;
            }
            return serializerVar;
        }
    }

    public /* synthetic */ LoanComparisonBenefitAlarmResult(int i, String str, okycx okycxVar) {
        if ((i & 1) != 0) {
            this.nextAlarmAt = str;
            int i2 = onWarmupCompleted + 53;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.nextAlarmAt = "";
        int i4 = onWarmupCompleted + 103;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public LoanComparisonBenefitAlarmResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nextAlarmAt = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(LoanComparisonBenefitAlarmResult loanComparisonBenefitAlarmResult, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0 ? !vylVar.onWarmupCompleted(serialDescriptor, 0) : !vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            if (Intrinsics.areEqual(loanComparisonBenefitAlarmResult.nextAlarmAt, "")) {
                return;
            }
        }
        vylVar.onExtraCallback(serialDescriptor, 0, loanComparisonBenefitAlarmResult.nextAlarmAt);
        int i3 = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoanComparisonBenefitAlarmResult(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 117;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i3 = 2 % 2;
            str = "";
        }
        this(str);
    }
}
