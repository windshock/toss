package viva.republica.toss.network.model.verify.guest;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.verify.guest.GuestUnderFourteenSignUpFailReasonRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GuestUnderFourteenSignUpFailReasonRequest {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String failReason;
    private final long guestSessionId;

    static {
        int i = onWarmupCompleted + 37;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuestUnderFourteenSignUpFailReasonRequest)) {
            int i2 = onExtraCallbackWithResult + 79;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        GuestUnderFourteenSignUpFailReasonRequest guestUnderFourteenSignUpFailReasonRequest = (GuestUnderFourteenSignUpFailReasonRequest) obj;
        if (this.guestSessionId != guestUnderFourteenSignUpFailReasonRequest.guestSessionId) {
            return false;
        }
        if (Intrinsics.areEqual(this.failReason, guestUnderFourteenSignUpFailReasonRequest.failReason)) {
            return true;
        }
        int i4 = IAuthTabCallback + 57;
        int i5 = i4 % 128;
        onExtraCallbackWithResult = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 93;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 37 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Long.hashCode(this.guestSessionId) * 31) + this.failReason.hashCode();
        int i4 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GuestUnderFourteenSignUpFailReasonRequest(guestSessionId=" + this.guestSessionId + ", failReason=" + this.failReason + ")";
        int i2 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 40 / 0;
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

        public final KSerializer<GuestUnderFourteenSignUpFailReasonRequest> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            GuestUnderFourteenSignUpFailReasonRequest$.serializer serializerVar = GuestUnderFourteenSignUpFailReasonRequest$.serializer.INSTANCE;
            if (i3 != 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    public /* synthetic */ GuestUnderFourteenSignUpFailReasonRequest(int i, long j, String str, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = IAuthTabCallback + 83;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 3, GuestUnderFourteenSignUpFailReasonRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = IAuthTabCallback + 61;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.guestSessionId = j;
        this.failReason = str;
    }

    public GuestUnderFourteenSignUpFailReasonRequest(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.guestSessionId = j;
        this.failReason = str;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(GuestUnderFourteenSignUpFailReasonRequest guestUnderFourteenSignUpFailReasonRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, guestUnderFourteenSignUpFailReasonRequest.guestSessionId);
        vylVar.onExtraCallback(serialDescriptor, 1, guestUnderFourteenSignUpFailReasonRequest.failReason);
        int i4 = onExtraCallbackWithResult + 81;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
