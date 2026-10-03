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
import viva.republica.toss.network.model.verify.guest.SignInRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SignInRequest {
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.verify.guest.SignInRequest$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnWarmupCompleted = SignInRequest.onWarmupCompleted();
            int i4 = onExtraCallbackWithResult + 81;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnWarmupCompleted;
        }
    })};
    public static final Companion Companion;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final long guestId;
    private final String password;
    private final nativeReadByte passwordFormat;

    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        KSerializer kSerializerOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.password.PasswordFormat", nativeReadByte.values());
            int i3 = 90 / 0;
        } else {
            kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.password.PasswordFormat", nativeReadByte.values());
        }
        int i4 = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallback = IAuthTabCallback();
        int i4 = onWarmupCompleted + 37;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallback;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 11;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof SignInRequest)) {
            return false;
        }
        SignInRequest signInRequest = (SignInRequest) obj;
        if (this.guestId != signInRequest.guestId) {
            return false;
        }
        if (Intrinsics.areEqual(this.password, signInRequest.password)) {
            if (this.passwordFormat == signInRequest.passwordFormat) {
                return true;
            }
            int i7 = onWarmupCompleted + 19;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = onExtraCallbackWithResult;
        int i10 = i9 + 51;
        onWarmupCompleted = i10 % 128;
        int i11 = i10 % 2;
        int i12 = i9 + 115;
        onWarmupCompleted = i12 % 128;
        if (i12 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Long.hashCode(this.guestId) * 31) + this.password.hashCode()) * 31) + this.passwordFormat.hashCode();
        int i4 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SignInRequest(guestId=" + this.guestId + ", password=" + this.password + ", passwordFormat=" + this.passwordFormat + ")";
        int i2 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 21 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SignInRequest> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 19;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            SignInRequest$.serializer serializerVar = SignInRequest$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 39;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onExtraCallback + 77;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* synthetic */ SignInRequest(int i, long j, String str, nativeReadByte nativereadbyte, okycx okycxVar) {
        if (7 != (i & 7)) {
            int i2 = onWarmupCompleted + 121;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 7, SignInRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallbackWithResult + 75;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this.guestId = j;
        this.password = str;
        this.passwordFormat = nativereadbyte;
    }

    public SignInRequest(long j, @NotNull String str, @NotNull nativeReadByte nativereadbyte) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(nativereadbyte, "");
        this.guestId = j;
        this.password = str;
        this.passwordFormat = nativereadbyte;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(SignInRequest signInRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, signInRequest.guestId);
        vylVar.onExtraCallback(serialDescriptor, 1, signInRequest.password);
        vylVar.onNavigationEvent(serialDescriptor, 2, (py) lazyArr[2].getValue(), signInRequest.passwordFormat);
        int i4 = onExtraCallbackWithResult + 1;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            lazyArr = $childSerializers;
            int i4 = 66 / 0;
        } else {
            lazyArr = $childSerializers;
        }
        int i5 = i3 + 119;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return lazyArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
