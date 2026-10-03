package viva.republica.toss.network.model.verify.guest;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.verify.guest.GuestAddCertifyRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GuestAddCertifyRequest {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @SerializedName("guestId")
    private final long guestId;

    @SerializedName("unifiedId")
    private final long unifiedId;

    static {
        int i = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 107;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 + 83;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof GuestAddCertifyRequest)) {
            return false;
        }
        GuestAddCertifyRequest guestAddCertifyRequest = (GuestAddCertifyRequest) obj;
        if (this.guestId != guestAddCertifyRequest.guestId) {
            int i8 = i2 + 109;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.unifiedId == guestAddCertifyRequest.unifiedId) {
            return true;
        }
        int i10 = i4 + 123;
        onNavigationEvent = i10 % 128;
        return i10 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onWarmupCompleted = i2 % 128;
        return i2 % 2 != 0 ? (Long.hashCode(this.guestId) - 108) >>> Long.hashCode(this.unifiedId) : (Long.hashCode(this.guestId) * 31) + Long.hashCode(this.unifiedId);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GuestAddCertifyRequest(guestId=" + this.guestId + ", unifiedId=" + this.unifiedId + ")";
        int i2 = onNavigationEvent + 35;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GuestAddCertifyRequest> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 63;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            GuestAddCertifyRequest$.serializer serializerVar = GuestAddCertifyRequest$.serializer.INSTANCE;
            if (i3 != 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ GuestAddCertifyRequest(int i, long j, long j2, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onNavigationEvent + 5;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 3, GuestAddCertifyRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = onNavigationEvent + 13;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this.guestId = j;
        this.unifiedId = j2;
    }

    public GuestAddCertifyRequest(long j, long j2) {
        this.guestId = j;
        this.unifiedId = j2;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(GuestAddCertifyRequest guestAddCertifyRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        long j = guestAddCertifyRequest.guestId;
        if (i3 == 0) {
            vylVar.onExtraCallback(serialDescriptor, 1, j);
            vylVar.onExtraCallback(serialDescriptor, 0, guestAddCertifyRequest.unifiedId);
        } else {
            vylVar.onExtraCallback(serialDescriptor, 0, j);
            vylVar.onExtraCallback(serialDescriptor, 1, guestAddCertifyRequest.unifiedId);
        }
        int i4 = onWarmupCompleted + 123;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
    }
}
