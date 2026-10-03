package viva.republica.toss.network.model.verify.guest;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import viva.republica.toss.network.model.verify.guest.GuestIdRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GuestIdRequest {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final long guestId;

    static {
        int i = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 30 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r10 instanceof viva.republica.toss.network.model.verify.guest.GuestIdRequest) == true) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r9.guestId == ((viva.republica.toss.network.model.verify.guest.GuestIdRequest) r10).guestId) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        r2 = r2 + 39;
        viva.republica.toss.network.model.verify.guest.GuestIdRequest.onWarmupCompleted = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r9 == r10) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r9 == r10) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.verify.guest.GuestIdRequest.onWarmupCompleted
            int r1 = r1 + 33
            int r2 = r1 % 128
            viva.republica.toss.network.model.verify.guest.GuestIdRequest.onNavigationEvent = r2
            int r1 = r1 % r0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L16
            r1 = 57
            int r1 = r1 / r4
            if (r9 != r10) goto L19
            goto L18
        L16:
            if (r9 != r10) goto L19
        L18:
            return r3
        L19:
            boolean r1 = r10 instanceof viva.republica.toss.network.model.verify.guest.GuestIdRequest
            if (r1 == r3) goto L1e
            return r4
        L1e:
            viva.republica.toss.network.model.verify.guest.GuestIdRequest r10 = (viva.republica.toss.network.model.verify.guest.GuestIdRequest) r10
            long r5 = r9.guestId
            long r7 = r10.guestId
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 == 0) goto L30
            int r2 = r2 + 39
            int r10 = r2 % 128
            viva.republica.toss.network.model.verify.guest.GuestIdRequest.onWarmupCompleted = r10
            int r2 = r2 % r0
            return r4
        L30:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.verify.guest.GuestIdRequest.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Long.hashCode(this.guestId);
            throw null;
        }
        int iHashCode = Long.hashCode(this.guestId);
        int i3 = onWarmupCompleted + 69;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GuestIdRequest(guestId=" + this.guestId + ")";
        int i2 = onNavigationEvent + 31;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GuestIdRequest> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            GuestIdRequest$.serializer serializerVar = GuestIdRequest$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 19;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public /* synthetic */ GuestIdRequest(int i, long j, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 1;
        if (1 != (i & 1)) {
            int i3 = onWarmupCompleted + 125;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                descriptor = GuestIdRequest$.serializer.INSTANCE.getDescriptor();
                i2 = 0;
            } else {
                descriptor = GuestIdRequest$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = onWarmupCompleted + 33;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this.guestId = j;
    }

    public GuestIdRequest(long j) {
        this.guestId = j;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(GuestIdRequest guestIdRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, guestIdRequest.guestId);
        int i4 = onWarmupCompleted + 53;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
