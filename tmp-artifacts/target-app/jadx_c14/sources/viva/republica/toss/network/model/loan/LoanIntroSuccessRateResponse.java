package viva.republica.toss.network.model.loan;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import viva.republica.toss.network.model.loan.LoanIntroSuccessRateResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanIntroSuccessRateResponse {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final int approveRatio;

    static {
        int i = IAuthTabCallback + 61;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof viva.republica.toss.network.model.loan.LoanIntroSuccessRateResponse) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        if (r5.approveRatio == ((viva.republica.toss.network.model.loan.LoanIntroSuccessRateResponse) r6).approveRatio) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        r1 = r1 + 93;
        r6 = r1 % 128;
        viva.republica.toss.network.model.loan.LoanIntroSuccessRateResponse.onWarmupCompleted = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if ((r1 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r6 = r6 + 109;
        viva.republica.toss.network.model.loan.LoanIntroSuccessRateResponse.onExtraCallbackWithResult = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.LoanIntroSuccessRateResponse.onExtraCallbackWithResult
            int r2 = r1 + 99
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.LoanIntroSuccessRateResponse.onWarmupCompleted = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L16
            r2 = 20
            int r2 = r2 / r4
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r3
        L19:
            boolean r2 = r6 instanceof viva.republica.toss.network.model.loan.LoanIntroSuccessRateResponse
            if (r2 != 0) goto L1e
            return r4
        L1e:
            viva.republica.toss.network.model.loan.LoanIntroSuccessRateResponse r6 = (viva.republica.toss.network.model.loan.LoanIntroSuccessRateResponse) r6
            int r2 = r5.approveRatio
            int r6 = r6.approveRatio
            if (r2 == r6) goto L38
            int r1 = r1 + 93
            int r6 = r1 % 128
            viva.republica.toss.network.model.loan.LoanIntroSuccessRateResponse.onWarmupCompleted = r6
            int r1 = r1 % r0
            if (r1 != 0) goto L30
            goto L31
        L30:
            r3 = r4
        L31:
            int r6 = r6 + 109
            int r1 = r6 % 128
            viva.republica.toss.network.model.loan.LoanIntroSuccessRateResponse.onExtraCallbackWithResult = r1
            int r6 = r6 % r0
        L38:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanIntroSuccessRateResponse.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Integer.hashCode(this.approveRatio);
            throw null;
        }
        int iHashCode = Integer.hashCode(this.approveRatio);
        int i3 = onWarmupCompleted + 9;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanIntroSuccessRateResponse(approveRatio=" + this.approveRatio + ")";
        int i2 = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanIntroSuccessRateResponse> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 37;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            LoanIntroSuccessRateResponse$.serializer serializerVar = LoanIntroSuccessRateResponse$.serializer.INSTANCE;
            int i4 = onExtraCallback + 107;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 60 / 0;
            }
            return serializerVar;
        }
    }

    public /* synthetic */ LoanIntroSuccessRateResponse(int i, int i2, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i3 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            htf31.onExtraCallbackWithResult(i, 1, LoanIntroSuccessRateResponse$.serializer.INSTANCE.getDescriptor());
            int i5 = onWarmupCompleted + 27;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        this.approveRatio = i2;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(LoanIntroSuccessRateResponse loanIntroSuccessRateResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, loanIntroSuccessRateResponse.approveRatio);
        int i4 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.approveRatio;
        if (i3 != 0) {
            int i5 = 41 / 0;
        }
        return i4;
    }
}
