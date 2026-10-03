package viva.republica.toss.network.model.verify.guest;

import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.getMutilBackgroundDrawable;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.nativeReadByte;
import o.okycx;
import o.py;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.verify.guest.GlobalCrossRegionSignUpWithResetPasswordRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GlobalCrossRegionSignUpWithResetPasswordRequest {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final Map<String, String> crossRegionPasswords;
    private final long onboardingEventId;
    private final String password;
    private final nativeReadByte passwordFormat;

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
        int i4 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.password.PasswordFormat", nativeReadByte.values());
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.password.PasswordFormat", nativeReadByte.values());
        int i3 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallback = onExtraCallback();
        int i4 = IAuthTabCallback + 17;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallback;
    }

    private static final /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getwrigglelayout, getwrigglelayout);
        int i2 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return getmutilbackgrounddrawable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GlobalCrossRegionSignUpWithResetPasswordRequest)) {
            return false;
        }
        GlobalCrossRegionSignUpWithResetPasswordRequest globalCrossRegionSignUpWithResetPasswordRequest = (GlobalCrossRegionSignUpWithResetPasswordRequest) obj;
        if (this.onboardingEventId != globalCrossRegionSignUpWithResetPasswordRequest.onboardingEventId) {
            int i2 = onExtraCallbackWithResult + 9;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.password, globalCrossRegionSignUpWithResetPasswordRequest.password)) {
            int i4 = IAuthTabCallback + 77;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.crossRegionPasswords, globalCrossRegionSignUpWithResetPasswordRequest.crossRegionPasswords)) {
            return false;
        }
        if (this.passwordFormat == globalCrossRegionSignUpWithResetPasswordRequest.passwordFormat) {
            return true;
        }
        int i6 = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        IAuthTabCallback = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (((((Long.hashCode(this.onboardingEventId) << 8) + this.password.hashCode()) * 50) / this.crossRegionPasswords.hashCode()) - 55) >>> this.passwordFormat.hashCode() : (((((Long.hashCode(this.onboardingEventId) * 31) + this.password.hashCode()) * 31) + this.crossRegionPasswords.hashCode()) * 31) + this.passwordFormat.hashCode();
        int i3 = IAuthTabCallback + 35;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GlobalCrossRegionSignUpWithResetPasswordRequest(onboardingEventId=" + this.onboardingEventId + ", password=" + this.password + ", crossRegionPasswords=" + this.crossRegionPasswords + ", passwordFormat=" + this.passwordFormat + ")";
        int i2 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GlobalCrossRegionSignUpWithResetPasswordRequest> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            GlobalCrossRegionSignUpWithResetPasswordRequest$.serializer serializerVar = GlobalCrossRegionSignUpWithResetPasswordRequest$.serializer.INSTANCE;
            if (i3 == 0) {
                int i4 = 53 / 0;
            }
            return serializerVar;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.verify.guest.GlobalCrossRegionSignUpWithResetPasswordRequest$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 47;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerIAuthTabCallback = GlobalCrossRegionSignUpWithResetPasswordRequest.IAuthTabCallback();
                int i4 = onWarmupCompleted + 25;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerIAuthTabCallback;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.verify.guest.GlobalCrossRegionSignUpWithResetPasswordRequest$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 53;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    GlobalCrossRegionSignUpWithResetPasswordRequest.onExtraCallbackWithResult();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                KSerializer kSerializerOnExtraCallbackWithResult = GlobalCrossRegionSignUpWithResetPasswordRequest.onExtraCallbackWithResult();
                int i3 = onExtraCallback + 33;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 79 / 0;
                }
                return kSerializerOnExtraCallbackWithResult;
            }
        })};
        int i = onExtraCallback + 93;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* synthetic */ GlobalCrossRegionSignUpWithResetPasswordRequest(int i, long j, String str, Map map, nativeReadByte nativereadbyte, okycx okycxVar) {
        if (15 != (i & 15)) {
            int i2 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                htf31.onExtraCallbackWithResult(i, 2, GlobalCrossRegionSignUpWithResetPasswordRequest$.serializer.INSTANCE.getDescriptor());
            } else {
                htf31.onExtraCallbackWithResult(i, 15, GlobalCrossRegionSignUpWithResetPasswordRequest$.serializer.INSTANCE.getDescriptor());
            }
            int i3 = onExtraCallbackWithResult + 57;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        }
        this.onboardingEventId = j;
        this.password = str;
        this.crossRegionPasswords = map;
        this.passwordFormat = nativereadbyte;
    }

    public GlobalCrossRegionSignUpWithResetPasswordRequest(long j, @NotNull String str, @NotNull Map<String, String> map, @NotNull nativeReadByte nativereadbyte) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(nativereadbyte, "");
        this.onboardingEventId = j;
        this.password = str;
        this.crossRegionPasswords = map;
        this.passwordFormat = nativereadbyte;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(GlobalCrossRegionSignUpWithResetPasswordRequest globalCrossRegionSignUpWithResetPasswordRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, globalCrossRegionSignUpWithResetPasswordRequest.onboardingEventId);
        vylVar.onExtraCallback(serialDescriptor, 1, globalCrossRegionSignUpWithResetPasswordRequest.password);
        vylVar.onNavigationEvent(serialDescriptor, 2, (py) lazyArr[2].getValue(), globalCrossRegionSignUpWithResetPasswordRequest.crossRegionPasswords);
        vylVar.onNavigationEvent(serialDescriptor, 3, (py) lazyArr[3].getValue(), globalCrossRegionSignUpWithResetPasswordRequest.passwordFormat);
        int i4 = onExtraCallbackWithResult + 101;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i3 + 47;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return lazyArr;
        }
        throw null;
    }
}
