package viva.republica.toss.network.model.loan;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.liq;
import o.okycx;
import o.vyl;
import viva.republica.toss.network.model.loan.LoanComparisonFunnelTypeRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanComparisonFunnelTypeRequest {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final boolean hasTossCert;

    static {
        int i = IAuthTabCallback + 41;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public LoanComparisonFunnelTypeRequest() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if ((!(r6 instanceof viva.republica.toss.network.model.loan.LoanComparisonFunnelTypeRequest)) == true) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r5.hasTossCert == ((viva.republica.toss.network.model.loan.LoanComparisonFunnelTypeRequest) r6).hasTossCert) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        r2 = r2 + 103;
        viva.republica.toss.network.model.loan.LoanComparisonFunnelTypeRequest.onNavigationEvent = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        r2 = r2 + 83;
        viva.republica.toss.network.model.loan.LoanComparisonFunnelTypeRequest.onNavigationEvent = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        r2 = r2 + 121;
        viva.republica.toss.network.model.loan.LoanComparisonFunnelTypeRequest.onNavigationEvent = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        return false;
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
            int r1 = viva.republica.toss.network.model.loan.LoanComparisonFunnelTypeRequest.onNavigationEvent
            int r1 = r1 + 17
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.LoanComparisonFunnelTypeRequest.onWarmupCompleted = r2
            int r1 = r1 % r0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L16
            r1 = 42
            int r1 = r1 / r3
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r4
        L19:
            boolean r1 = r6 instanceof viva.republica.toss.network.model.loan.LoanComparisonFunnelTypeRequest
            r1 = r1 ^ r4
            if (r1 == r4) goto L36
            viva.republica.toss.network.model.loan.LoanComparisonFunnelTypeRequest r6 = (viva.republica.toss.network.model.loan.LoanComparisonFunnelTypeRequest) r6
            boolean r1 = r5.hasTossCert
            boolean r6 = r6.hasTossCert
            if (r1 == r6) goto L2e
            int r2 = r2 + 103
            int r6 = r2 % 128
            viva.republica.toss.network.model.loan.LoanComparisonFunnelTypeRequest.onNavigationEvent = r6
            int r2 = r2 % r0
            return r3
        L2e:
            int r2 = r2 + 83
            int r6 = r2 % 128
            viva.republica.toss.network.model.loan.LoanComparisonFunnelTypeRequest.onNavigationEvent = r6
            int r2 = r2 % r0
            return r4
        L36:
            int r2 = r2 + 121
            int r6 = r2 % 128
            viva.republica.toss.network.model.loan.LoanComparisonFunnelTypeRequest.onNavigationEvent = r6
            int r2 = r2 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanComparisonFunnelTypeRequest.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.hasTossCert);
        if (i3 == 0) {
            int i4 = 15 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanComparisonFunnelTypeRequest(hasTossCert=" + this.hasTossCert + ")";
        int i2 = onWarmupCompleted + 61;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanComparisonFunnelTypeRequest> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            LoanComparisonFunnelTypeRequest$.serializer serializerVar = LoanComparisonFunnelTypeRequest$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 95;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public /* synthetic */ LoanComparisonFunnelTypeRequest(int i, boolean z, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.hasTossCert = false;
            int i2 = onNavigationEvent + 75;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.hasTossCert = z;
        int i4 = onNavigationEvent + 121;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
    }

    public LoanComparisonFunnelTypeRequest(boolean z) {
        this.hasTossCert = z;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(LoanComparisonFunnelTypeRequest loanComparisonFunnelTypeRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i4 = onNavigationEvent + 15;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                boolean z = loanComparisonFunnelTypeRequest.hasTossCert;
                throw null;
            }
            if (!loanComparisonFunnelTypeRequest.hasTossCert) {
                return;
            }
        }
        vylVar.onNavigationEvent(serialDescriptor, 0, loanComparisonFunnelTypeRequest.hasTossCert);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoanComparisonFunnelTypeRequest(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted;
            int i3 = i2 + 41;
            onNavigationEvent = i3 % 128;
            boolean z2 = i3 % 2 == 0;
            int i4 = i2 + 43;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
            z = z2;
        }
        this(z);
    }
}
