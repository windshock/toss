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
import viva.republica.toss.network.model.verify.guest.GlobalSignUpRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GlobalSignUpRequest {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final long onboardingEventId;
    private final String password;
    private final nativeReadByte passwordFormat;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.verify.guest.GlobalSignUpRequest$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 121;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return GlobalSignUpRequest.onExtraCallbackWithResult();
            }
            GlobalSignUpRequest.onExtraCallbackWithResult();
            throw null;
        }
    })};

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
        int i4 = onWarmupCompleted + 53;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnWarmupCompleted;
    }

    private static final /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.password.PasswordFormat", nativeReadByte.values());
        int i4 = onWarmupCompleted + 105;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GlobalSignUpRequest)) {
            int i2 = onWarmupCompleted + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        GlobalSignUpRequest globalSignUpRequest = (GlobalSignUpRequest) obj;
        if (this.onboardingEventId != globalSignUpRequest.onboardingEventId || !Intrinsics.areEqual(this.password, globalSignUpRequest.password)) {
            return false;
        }
        if (this.passwordFormat == globalSignUpRequest.passwordFormat) {
            return true;
        }
        int i4 = onExtraCallback + 7;
        onWarmupCompleted = i4 % 128;
        return i4 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onWarmupCompleted = i2 % 128;
        int iHashCode = (i2 % 2 != 0 ? ((Long.hashCode(this.onboardingEventId) / 78) + this.password.hashCode()) << 66 : ((Long.hashCode(this.onboardingEventId) * 31) + this.password.hashCode()) * 31) + this.passwordFormat.hashCode();
        int i3 = onExtraCallback + 51;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 74 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GlobalSignUpRequest(onboardingEventId=" + this.onboardingEventId + ", password=" + this.password + ", passwordFormat=" + this.passwordFormat + ")";
        int i2 = onExtraCallback + 1;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GlobalSignUpRequest> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                GlobalSignUpRequest$.serializer serializerVar = GlobalSignUpRequest$.serializer.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            GlobalSignUpRequest$.serializer serializerVar2 = GlobalSignUpRequest$.serializer.INSTANCE;
            int i3 = onWarmupCompleted + 45;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return serializerVar2;
        }
    }

    static {
        int i = onNavigationEvent + 11;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ GlobalSignUpRequest(int i, long j, String str, nativeReadByte nativereadbyte, okycx okycxVar) {
        if (7 != (i & 7)) {
            int i2 = onExtraCallback + 3;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 7, GlobalSignUpRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallback + 43;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this.onboardingEventId = j;
        this.password = str;
        this.passwordFormat = nativereadbyte;
    }

    public GlobalSignUpRequest(long j, @NotNull String str, @NotNull nativeReadByte nativereadbyte) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(nativereadbyte, "");
        this.onboardingEventId = j;
        this.password = str;
        this.passwordFormat = nativereadbyte;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 101;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 77;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(GlobalSignUpRequest globalSignUpRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, globalSignUpRequest.onboardingEventId);
        vylVar.onExtraCallback(serialDescriptor, 1, globalSignUpRequest.password);
        vylVar.onNavigationEvent(serialDescriptor, 2, (py) lazyArr[2].getValue(), globalSignUpRequest.passwordFormat);
        int i4 = onExtraCallback + 45;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
