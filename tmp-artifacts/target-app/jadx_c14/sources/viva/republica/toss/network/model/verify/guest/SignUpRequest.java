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
import o.py;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.verify.guest.SignUpRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SignUpRequest {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final long guestId;
    private final String password;
    private final nativeReadByte passwordFormat;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.verify.guest.SignUpRequest$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 31;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return SignUpRequest.onExtraCallback();
            }
            SignUpRequest.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    })};

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted();
        }
        onWarmupCompleted();
        throw null;
    }

    private static final /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.password.PasswordFormat", nativeReadByte.values());
            throw null;
        }
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.password.PasswordFormat", nativeReadByte.values());
        int i3 = IAuthTabCallback + 5;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 113;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof SignUpRequest)) {
            return false;
        }
        SignUpRequest signUpRequest = (SignUpRequest) obj;
        if (this.guestId != signUpRequest.guestId) {
            return false;
        }
        if (!Intrinsics.areEqual(this.password, signUpRequest.password)) {
            int i4 = IAuthTabCallback + 59;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (this.passwordFormat == signUpRequest.passwordFormat) {
            return true;
        }
        int i5 = onWarmupCompleted + 17;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onWarmupCompleted = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((Long.hashCode(this.guestId) >> 68) >> this.password.hashCode()) / 109) % this.passwordFormat.hashCode() : (((Long.hashCode(this.guestId) * 31) + this.password.hashCode()) * 31) + this.passwordFormat.hashCode();
        int i3 = IAuthTabCallback + 29;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SignUpRequest(guestId=" + this.guestId + ", password=" + this.password + ", passwordFormat=" + this.passwordFormat + ")";
        int i2 = IAuthTabCallback + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SignUpRequest> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            SignUpRequest$.serializer serializerVar = SignUpRequest$.serializer.INSTANCE;
            if (i3 != 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    static {
        int i = onNavigationEvent + 87;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ SignUpRequest(int i, long j, String str, nativeReadByte nativereadbyte, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 7;
        if (7 != (i & 7)) {
            int i3 = onWarmupCompleted + 99;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = SignUpRequest$.serializer.INSTANCE.getDescriptor();
                i2 = 127;
            } else {
                descriptor = SignUpRequest$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = 2 % 2;
        }
        this.guestId = j;
        this.password = str;
        this.passwordFormat = nativereadbyte;
    }

    public SignUpRequest(long j, @NotNull String str, @NotNull nativeReadByte nativereadbyte) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(nativereadbyte, "");
        this.guestId = j;
        this.password = str;
        this.passwordFormat = nativereadbyte;
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 113;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 73;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(SignUpRequest signUpRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, signUpRequest.guestId);
        vylVar.onExtraCallback(serialDescriptor, 1, signUpRequest.password);
        vylVar.onNavigationEvent(serialDescriptor, 2, (py) lazyArr[2].getValue(), signUpRequest.passwordFormat);
        int i4 = onWarmupCompleted + 55;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
