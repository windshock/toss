package viva.republica.toss.network.model.verify.guest;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.htf31;
import o.liq;
import o.nativeReadByte;
import o.okycx;
import o.oty1;
import o.py;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.verify.guest.VisitorSignUpRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class VisitorSignUpRequest {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final String password;
    private final nativeReadByte passwordFormat;
    private final Long selfieSessionId;
    private final long sessionId;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.verify.guest.VisitorSignUpRequest$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerIAuthTabCallback = VisitorSignUpRequest.IAuthTabCallback();
            int i4 = IAuthTabCallback + 105;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 21 / 0;
            }
            return kSerializerIAuthTabCallback;
        }
    }), null};

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallback = onExtraCallback();
        int i4 = onExtraCallbackWithResult + 21;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallback;
    }

    private static final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.password.PasswordFormat", nativeReadByte.values());
        }
        updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.password.PasswordFormat", nativeReadByte.values());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisitorSignUpRequest)) {
            int i2 = onExtraCallback + 107;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        VisitorSignUpRequest visitorSignUpRequest = (VisitorSignUpRequest) obj;
        if (this.sessionId != visitorSignUpRequest.sessionId) {
            return false;
        }
        if (!Intrinsics.areEqual(this.password, visitorSignUpRequest.password)) {
            int i4 = onExtraCallback + 21;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.passwordFormat != visitorSignUpRequest.passwordFormat) {
            int i6 = onExtraCallback + 109;
            onExtraCallbackWithResult = i6 % 128;
            return i6 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.selfieSessionId, visitorSignUpRequest.selfieSessionId)) {
            return true;
        }
        int i7 = onExtraCallbackWithResult + 105;
        onExtraCallback = i7 % 128;
        return i7 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Long.hashCode(this.sessionId);
        int iHashCode3 = this.password.hashCode();
        int iHashCode4 = this.passwordFormat.hashCode();
        Long l = this.selfieSessionId;
        if (l == null) {
            int i2 = onExtraCallbackWithResult + 5;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = l.hashCode();
        }
        int i4 = (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
        int i5 = onExtraCallback + 29;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VisitorSignUpRequest(sessionId=" + this.sessionId + ", password=" + this.password + ", passwordFormat=" + this.passwordFormat + ", selfieSessionId=" + this.selfieSessionId + ")";
        int i2 = onExtraCallbackWithResult + 89;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<VisitorSignUpRequest> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            VisitorSignUpRequest$.serializer serializerVar = VisitorSignUpRequest$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 119;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = IAuthTabCallback + 109;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ VisitorSignUpRequest(int i, long j, String str, nativeReadByte nativereadbyte, Long l, okycx okycxVar) {
        if (7 != (i & 7)) {
            int i2 = onExtraCallbackWithResult + 73;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 7, VisitorSignUpRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallback + 25;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 / 2;
            } else {
                int i6 = 2 % 2;
            }
        }
        this.sessionId = j;
        this.password = str;
        this.passwordFormat = nativereadbyte;
        if ((i & 8) != 0) {
            this.selfieSessionId = l;
            return;
        }
        this.selfieSessionId = null;
        int i7 = onExtraCallback + 95;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public VisitorSignUpRequest(long j, @NotNull String str, @NotNull nativeReadByte nativereadbyte, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(nativereadbyte, "");
        this.sessionId = j;
        this.password = str;
        this.passwordFormat = nativereadbyte;
        this.selfieSessionId = l;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(VisitorSignUpRequest visitorSignUpRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, visitorSignUpRequest.sessionId);
        vylVar.onExtraCallback(serialDescriptor, 1, visitorSignUpRequest.password);
        vylVar.onNavigationEvent(serialDescriptor, 2, (py) lazyArr[2].getValue(), visitorSignUpRequest.passwordFormat);
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            int i4 = onExtraCallbackWithResult + 21;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                Long l = visitorSignUpRequest.selfieSessionId;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (visitorSignUpRequest.selfieSessionId == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, oty1.onExtraCallback, visitorSignUpRequest.selfieSessionId);
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return $childSerializers;
        }
        throw null;
    }
}
