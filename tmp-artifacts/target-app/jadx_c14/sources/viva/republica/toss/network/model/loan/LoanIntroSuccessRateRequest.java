package viva.republica.toss.network.model.loan;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanIntroSuccessRateRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanIntroSuccessRateRequest {
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final int creditScore;

    static {
        int i = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 25 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof LoanIntroSuccessRateRequest) {
            if (this.creditScore == ((LoanIntroSuccessRateRequest) obj).creditScore) {
                return true;
            }
            int i2 = onNavigationEvent + 109;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = onExtraCallback + 119;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 5;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.creditScore);
        int i4 = onNavigationEvent + 117;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanIntroSuccessRateRequest(creditScore=" + this.creditScore + ")";
        int i2 = onExtraCallback + 37;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 36 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanIntroSuccessRateRequest> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            LoanIntroSuccessRateRequest$.serializer serializerVar = LoanIntroSuccessRateRequest$.serializer.INSTANCE;
            int i4 = IAuthTabCallback + 5;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public LoanIntroSuccessRateRequest(int i) {
        this.creditScore = i;
    }

    public /* synthetic */ LoanIntroSuccessRateRequest(int i, int i2, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i3 = onNavigationEvent + 21;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            htf31.onExtraCallbackWithResult(i, 1, LoanIntroSuccessRateRequest$.serializer.INSTANCE.getDescriptor());
            int i5 = 2 % 2;
        }
        this.creditScore = i2;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(LoanIntroSuccessRateRequest loanIntroSuccessRateRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, loanIntroSuccessRateRequest.creditScore);
        int i4 = onNavigationEvent + 21;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
