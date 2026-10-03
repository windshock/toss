package viva.republica.toss.network.model.login;

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
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.login.GlobalCoreResetPasswordResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GlobalCoreResetPasswordResponse {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final String cert;
    private final nativeReadByte currentPasswordFormat;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.login.GlobalCoreResetPasswordResponse$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 83;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                GlobalCoreResetPasswordResponse.onExtraCallbackWithResult();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            KSerializer kSerializerOnExtraCallbackWithResult = GlobalCoreResetPasswordResponse.onExtraCallbackWithResult();
            int i3 = onExtraCallback + 31;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerOnExtraCallbackWithResult;
        }
    })};

    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.password.PasswordFormat", nativeReadByte.values());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.password.PasswordFormat", nativeReadByte.values());
        int i3 = onNavigationEvent + 9;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallback = IAuthTabCallback();
        int i4 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallback;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 35;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GlobalCoreResetPasswordResponse)) {
            int i5 = i2 + 67;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        GlobalCoreResetPasswordResponse globalCoreResetPasswordResponse = (GlobalCoreResetPasswordResponse) obj;
        if (Intrinsics.areEqual(this.cert, globalCoreResetPasswordResponse.cert)) {
            return this.currentPasswordFormat == globalCoreResetPasswordResponse.currentPasswordFormat;
        }
        int i7 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.cert.hashCode();
        return i3 != 0 ? (iHashCode >> 101) << this.currentPasswordFormat.hashCode() : (iHashCode * 31) + this.currentPasswordFormat.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GlobalCoreResetPasswordResponse(cert=" + this.cert + ", currentPasswordFormat=" + this.currentPasswordFormat + ")";
        int i2 = onNavigationEvent + 9;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GlobalCoreResetPasswordResponse> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            GlobalCoreResetPasswordResponse$.serializer serializerVar = GlobalCoreResetPasswordResponse$.serializer.INSTANCE;
            if (i3 != 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = IAuthTabCallback + 53;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ GlobalCoreResetPasswordResponse(int i, String str, nativeReadByte nativereadbyte, okycx okycxVar) {
        if (2 != (i & 2)) {
            int i2 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 2, GlobalCoreResetPasswordResponse$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        if ((i & 1) == 0) {
            this.cert = "";
        } else {
            this.cert = str;
        }
        int i6 = 2 % 2;
        this.currentPasswordFormat = nativereadbyte;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(GlobalCoreResetPasswordResponse globalCoreResetPasswordResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(globalCoreResetPasswordResponse.cert, "")) {
            vylVar.onExtraCallback(serialDescriptor, 0, globalCoreResetPasswordResponse.cert);
            int i4 = onNavigationEvent + 29;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), globalCoreResetPasswordResponse.currentPasswordFormat);
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return $childSerializers;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 51;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.cert;
        int i5 = i2 + 39;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final nativeReadByte onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        nativeReadByte nativereadbyte = this.currentPasswordFormat;
        int i5 = i3 + 119;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return nativereadbyte;
        }
        throw null;
    }
}
