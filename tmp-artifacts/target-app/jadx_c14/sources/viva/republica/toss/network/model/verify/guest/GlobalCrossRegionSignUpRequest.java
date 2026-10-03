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
import viva.republica.toss.network.model.verify.guest.GlobalCrossRegionSignUpRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GlobalCrossRegionSignUpRequest {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final Map<String, String> crossRegionPasswords;
    private final long onboardingEventId;
    private final String password;
    private final nativeReadByte passwordFormat;
    private final String passwordVerifierRegion;

    private static final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.password.PasswordFormat", nativeReadByte.values());
            throw null;
        }
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.password.PasswordFormat", nativeReadByte.values());
        int i3 = onNavigationEvent + 65;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getwrigglelayout, getwrigglelayout);
        int i2 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return getmutilbackgrounddrawable;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i3 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback();
        }
        int i3 = 2 / 0;
        return onExtraCallback();
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 81;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof GlobalCrossRegionSignUpRequest)) {
            return false;
        }
        GlobalCrossRegionSignUpRequest globalCrossRegionSignUpRequest = (GlobalCrossRegionSignUpRequest) obj;
        if (this.onboardingEventId != globalCrossRegionSignUpRequest.onboardingEventId || !Intrinsics.areEqual(this.password, globalCrossRegionSignUpRequest.password)) {
            return false;
        }
        if (Intrinsics.areEqual(this.crossRegionPasswords, globalCrossRegionSignUpRequest.crossRegionPasswords)) {
            return this.passwordFormat == globalCrossRegionSignUpRequest.passwordFormat && !(Intrinsics.areEqual(this.passwordVerifierRegion, globalCrossRegionSignUpRequest.passwordVerifierRegion) ^ true);
        }
        int i7 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 125;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Long.hashCode(this.onboardingEventId);
            this.password.hashCode();
            this.crossRegionPasswords.hashCode();
            this.passwordFormat.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = Long.hashCode(this.onboardingEventId);
        int iHashCode2 = this.password.hashCode();
        int iHashCode3 = this.crossRegionPasswords.hashCode();
        int iHashCode4 = this.passwordFormat.hashCode();
        String str = this.passwordVerifierRegion;
        if (str == null) {
            i = 0;
        } else {
            int iHashCode5 = str.hashCode();
            int i4 = onExtraCallbackWithResult + 51;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            i = iHashCode5;
        }
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GlobalCrossRegionSignUpRequest(onboardingEventId=" + this.onboardingEventId + ", password=" + this.password + ", crossRegionPasswords=" + this.crossRegionPasswords + ", passwordFormat=" + this.passwordFormat + ", passwordVerifierRegion=" + this.passwordVerifierRegion + ")";
        int i2 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GlobalCrossRegionSignUpRequest> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 87;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                GlobalCrossRegionSignUpRequest$.serializer serializerVar = GlobalCrossRegionSignUpRequest$.serializer.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            GlobalCrossRegionSignUpRequest$.serializer serializerVar2 = GlobalCrossRegionSignUpRequest$.serializer.INSTANCE;
            int i3 = onExtraCallbackWithResult + 105;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 87 / 0;
            }
            return serializerVar2;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.verify.guest.GlobalCrossRegionSignUpRequest$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 59;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnNavigationEvent = GlobalCrossRegionSignUpRequest.onNavigationEvent();
                int i4 = onWarmupCompleted + 121;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnNavigationEvent;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.verify.guest.GlobalCrossRegionSignUpRequest$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                KSerializer kSerializerOnWarmupCompleted;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 55;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    kSerializerOnWarmupCompleted = GlobalCrossRegionSignUpRequest.onWarmupCompleted();
                    int i3 = 57 / 0;
                } else {
                    kSerializerOnWarmupCompleted = GlobalCrossRegionSignUpRequest.onWarmupCompleted();
                }
                int i4 = onExtraCallback + 11;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return kSerializerOnWarmupCompleted;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }), null};
        int i = onExtraCallback + 37;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ GlobalCrossRegionSignUpRequest(int i, long j, String str, Map map, nativeReadByte nativereadbyte, String str2, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 15;
        if (15 != (i & 15)) {
            int i3 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = GlobalCrossRegionSignUpRequest$.serializer.INSTANCE.getDescriptor();
                i2 = 17;
            } else {
                descriptor = GlobalCrossRegionSignUpRequest$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = 2 % 2;
        }
        this.onboardingEventId = j;
        this.password = str;
        this.crossRegionPasswords = map;
        this.passwordFormat = nativereadbyte;
        if ((i & 16) == 0) {
            this.passwordVerifierRegion = null;
            return;
        }
        this.passwordVerifierRegion = str2;
        int i5 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public GlobalCrossRegionSignUpRequest(long j, @NotNull String str, @NotNull Map<String, String> map, @NotNull nativeReadByte nativereadbyte, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(nativereadbyte, "");
        this.onboardingEventId = j;
        this.password = str;
        this.crossRegionPasswords = map;
        this.passwordFormat = nativereadbyte;
        this.passwordVerifierRegion = str2;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 35;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 105;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(GlobalCrossRegionSignUpRequest globalCrossRegionSignUpRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, globalCrossRegionSignUpRequest.onboardingEventId);
        vylVar.onExtraCallback(serialDescriptor, 1, globalCrossRegionSignUpRequest.password);
        vylVar.onNavigationEvent(serialDescriptor, 2, (py) lazyArr[2].getValue(), globalCrossRegionSignUpRequest.crossRegionPasswords);
        vylVar.onNavigationEvent(serialDescriptor, 3, (py) lazyArr[3].getValue(), globalCrossRegionSignUpRequest.passwordFormat);
        if ((!vylVar.onWarmupCompleted(serialDescriptor, 4)) && globalCrossRegionSignUpRequest.passwordVerifierRegion == null) {
            return;
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, globalCrossRegionSignUpRequest.passwordVerifierRegion);
        int i4 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
