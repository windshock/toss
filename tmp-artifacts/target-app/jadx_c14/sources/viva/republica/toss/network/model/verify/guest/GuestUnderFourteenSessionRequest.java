package viva.republica.toss.network.model.verify.guest;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.verify.guest.GuestUnderFourteenSessionRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GuestUnderFourteenSessionRequest {
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final long guestSessionId;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onNavigationEvent + 7;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 117;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuestUnderFourteenSessionRequest)) {
            int i6 = i4 + 49;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.guestSessionId == ((GuestUnderFourteenSessionRequest) obj).guestSessionId) {
            return true;
        }
        int i8 = i2 + 99;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.guestSessionId);
        int i4 = onExtraCallback + 95;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GuestUnderFourteenSessionRequest(guestSessionId=" + this.guestSessionId + ")";
        int i2 = onExtraCallback + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GuestUnderFourteenSessionRequest> serializer() {
            GuestUnderFourteenSessionRequest$.serializer serializerVar;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 67;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                serializerVar = GuestUnderFourteenSessionRequest$.serializer.INSTANCE;
                int i3 = 68 / 0;
            } else {
                serializerVar = GuestUnderFourteenSessionRequest$.serializer.INSTANCE;
            }
            int i4 = onNavigationEvent + 117;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public /* synthetic */ GuestUnderFourteenSessionRequest(int i, long j, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = IAuthTabCallback + 37;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, GuestUnderFourteenSessionRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = 2 % 2;
        }
        this.guestSessionId = j;
    }

    public GuestUnderFourteenSessionRequest(long j) {
        this.guestSessionId = j;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(GuestUnderFourteenSessionRequest guestUnderFourteenSessionRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, guestUnderFourteenSessionRequest.guestSessionId);
        int i4 = IAuthTabCallback + 9;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
