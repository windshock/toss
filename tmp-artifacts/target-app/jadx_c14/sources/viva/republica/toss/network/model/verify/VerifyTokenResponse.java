package viva.republica.toss.network.model.verify;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.verify.VerifyTokenResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class VerifyTokenResponse {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final long sessionId;
    private final String verifyToken;

    static {
        int i = onExtraCallbackWithResult + 29;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 17;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (obj instanceof VerifyTokenResponse) {
            VerifyTokenResponse verifyTokenResponse = (VerifyTokenResponse) obj;
            return this.sessionId == verifyTokenResponse.sessionId && Intrinsics.areEqual(this.verifyToken, verifyTokenResponse.verifyToken);
        }
        int i6 = i3 + 49;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onNavigationEvent = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (Long.hashCode(this.sessionId) >>> 27) * this.verifyToken.hashCode() : (Long.hashCode(this.sessionId) * 31) + this.verifyToken.hashCode();
        int i3 = onNavigationEvent + 65;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 39 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VerifyTokenResponse(sessionId=" + this.sessionId + ", verifyToken=" + this.verifyToken + ")";
        int i2 = onWarmupCompleted + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<VerifyTokenResponse> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 13;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            VerifyTokenResponse$.serializer serializerVar = VerifyTokenResponse$.serializer.INSTANCE;
            int i4 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 26 / 0;
            }
            return serializerVar;
        }
    }

    public /* synthetic */ VerifyTokenResponse(int i, long j, String str, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 3;
        if (3 != (i & 3)) {
            int i3 = onNavigationEvent + 71;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                descriptor = VerifyTokenResponse$.serializer.INSTANCE.getDescriptor();
                i2 = 5;
            } else {
                descriptor = VerifyTokenResponse$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = 2 % 2;
        }
        this.sessionId = j;
        this.verifyToken = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(VerifyTokenResponse verifyTokenResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onNavigationEvent = i2 % 128;
        int i3 = 0;
        if (i2 % 2 != 0) {
            vylVar.onExtraCallback(serialDescriptor, 0, verifyTokenResponse.sessionId);
        } else {
            vylVar.onExtraCallback(serialDescriptor, 0, verifyTokenResponse.sessionId);
            i3 = 1;
        }
        vylVar.onExtraCallback(serialDescriptor, i3, verifyTokenResponse.verifyToken);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 125;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.verifyToken;
        int i5 = i2 + 51;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
