package viva.republica.toss.network.model.verify.guest;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import viva.republica.toss.network.model.verify.guest.GuestUnderFourteenAgreementCountRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GuestUnderFourteenAgreementCountRequest {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final boolean clearRemainingCancelCount;
    private final boolean clearRemainingResendCount;
    private final long guestSessionId;

    static {
        int i = onWarmupCompleted + 125;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r9 instanceof viva.republica.toss.network.model.verify.guest.GuestUnderFourteenAgreementCountRequest) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r1 + 67;
        viva.republica.toss.network.model.verify.guest.GuestUnderFourteenAgreementCountRequest.onNavigationEvent = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r9 = (viva.republica.toss.network.model.verify.guest.GuestUnderFourteenAgreementCountRequest) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r8.guestSessionId == r9.guestSessionId) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if (r8.clearRemainingCancelCount == r9.clearRemainingCancelCount) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        r3 = r3 + 53;
        viva.republica.toss.network.model.verify.guest.GuestUnderFourteenAgreementCountRequest.onExtraCallbackWithResult = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r8.clearRemainingResendCount == r9.clearRemainingResendCount) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        r3 = r3 + 7;
        viva.republica.toss.network.model.verify.guest.GuestUnderFourteenAgreementCountRequest.onExtraCallbackWithResult = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if ((r3 % 2) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r8 == r9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r8 == r9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.verify.guest.GuestUnderFourteenAgreementCountRequest.onExtraCallbackWithResult
            int r2 = r1 + 11
            int r3 = r2 % 128
            viva.republica.toss.network.model.verify.guest.GuestUnderFourteenAgreementCountRequest.onNavigationEvent = r3
            int r2 = r2 % r0
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L16
            r2 = 87
            int r2 = r2 / r5
            if (r8 != r9) goto L19
            goto L18
        L16:
            if (r8 != r9) goto L19
        L18:
            return r4
        L19:
            boolean r2 = r9 instanceof viva.republica.toss.network.model.verify.guest.GuestUnderFourteenAgreementCountRequest
            if (r2 != 0) goto L25
            int r1 = r1 + 67
            int r9 = r1 % 128
            viva.republica.toss.network.model.verify.guest.GuestUnderFourteenAgreementCountRequest.onNavigationEvent = r9
            int r1 = r1 % r0
            return r5
        L25:
            viva.republica.toss.network.model.verify.guest.GuestUnderFourteenAgreementCountRequest r9 = (viva.republica.toss.network.model.verify.guest.GuestUnderFourteenAgreementCountRequest) r9
            long r1 = r8.guestSessionId
            long r6 = r9.guestSessionId
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 == 0) goto L30
            return r5
        L30:
            boolean r1 = r8.clearRemainingCancelCount
            boolean r2 = r9.clearRemainingCancelCount
            if (r1 == r2) goto L3e
            int r3 = r3 + 53
            int r9 = r3 % 128
            viva.republica.toss.network.model.verify.guest.GuestUnderFourteenAgreementCountRequest.onExtraCallbackWithResult = r9
            int r3 = r3 % r0
            return r5
        L3e:
            boolean r1 = r8.clearRemainingResendCount
            boolean r9 = r9.clearRemainingResendCount
            if (r1 == r9) goto L45
            return r5
        L45:
            int r3 = r3 + 7
            int r9 = r3 % 128
            viva.republica.toss.network.model.verify.guest.GuestUnderFourteenAgreementCountRequest.onExtraCallbackWithResult = r9
            int r3 = r3 % r0
            if (r3 != 0) goto L4f
            return r4
        L4f:
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.verify.guest.GuestUnderFourteenAgreementCountRequest.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i2 % 128;
        return (i2 % 2 != 0 ? ((Long.hashCode(this.guestSessionId) - 117) - Boolean.hashCode(this.clearRemainingCancelCount)) / 21 : ((Long.hashCode(this.guestSessionId) * 31) + Boolean.hashCode(this.clearRemainingCancelCount)) * 31) + Boolean.hashCode(this.clearRemainingResendCount);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GuestUnderFourteenAgreementCountRequest(guestSessionId=" + this.guestSessionId + ", clearRemainingCancelCount=" + this.clearRemainingCancelCount + ", clearRemainingResendCount=" + this.clearRemainingResendCount + ")";
        int i2 = onNavigationEvent + 35;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 22 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GuestUnderFourteenAgreementCountRequest> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 121;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            GuestUnderFourteenAgreementCountRequest$.serializer serializerVar = GuestUnderFourteenAgreementCountRequest$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 45;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ GuestUnderFourteenAgreementCountRequest(int i, long j, boolean z, boolean z2, okycx okycxVar) {
        if (7 != (i & 7)) {
            int i2 = onExtraCallbackWithResult + 105;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 7, GuestUnderFourteenAgreementCountRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = onNavigationEvent + 27;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this.guestSessionId = j;
        this.clearRemainingCancelCount = z;
        this.clearRemainingResendCount = z2;
    }

    public GuestUnderFourteenAgreementCountRequest(long j, boolean z, boolean z2) {
        this.guestSessionId = j;
        this.clearRemainingCancelCount = z;
        this.clearRemainingResendCount = z2;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(GuestUnderFourteenAgreementCountRequest guestUnderFourteenAgreementCountRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, guestUnderFourteenAgreementCountRequest.guestSessionId);
        vylVar.onNavigationEvent(serialDescriptor, 1, guestUnderFourteenAgreementCountRequest.clearRemainingCancelCount);
        vylVar.onNavigationEvent(serialDescriptor, 2, guestUnderFourteenAgreementCountRequest.clearRemainingResendCount);
        int i4 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
