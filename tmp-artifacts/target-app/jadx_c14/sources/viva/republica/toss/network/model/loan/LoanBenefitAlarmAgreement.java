package viva.republica.toss.network.model.loan;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanBenefitAlarmAgreement$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanBenefitAlarmAgreement {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final boolean agreed;

    static {
        int i = onExtraCallback + 77;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public LoanBenefitAlarmAgreement() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 63;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof LoanBenefitAlarmAgreement) {
            return this.agreed == ((LoanBenefitAlarmAgreement) obj).agreed;
        }
        int i5 = i2 + 97;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.agreed);
        int i4 = onExtraCallbackWithResult + 63;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanBenefitAlarmAgreement(agreed=" + this.agreed + ")";
        int i2 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanBenefitAlarmAgreement> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 89;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                LoanBenefitAlarmAgreement$.serializer serializerVar = LoanBenefitAlarmAgreement$.serializer.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            LoanBenefitAlarmAgreement$.serializer serializerVar2 = LoanBenefitAlarmAgreement$.serializer.INSTANCE;
            int i3 = onExtraCallbackWithResult + 53;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return serializerVar2;
        }
    }

    public /* synthetic */ LoanBenefitAlarmAgreement(int i, boolean z, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.agreed = false;
            int i2 = onExtraCallbackWithResult + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.agreed = z;
        int i4 = IAuthTabCallback + 11;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
    }

    public LoanBenefitAlarmAgreement(boolean z) {
        this.agreed = z;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(LoanBenefitAlarmAgreement loanBenefitAlarmAgreement, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 0)) || loanBenefitAlarmAgreement.agreed) {
            vylVar.onNavigationEvent(serialDescriptor, 0, loanBenefitAlarmAgreement.agreed);
        }
        int i4 = onExtraCallbackWithResult + 17;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoanBenefitAlarmAgreement(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 3;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 89;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            z = false;
        }
        this(z);
    }

    public final boolean onWarmupCompleted() {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            z = this.agreed;
            int i4 = 60 / 0;
        } else {
            z = this.agreed;
        }
        int i5 = i3 + 59;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }
}
