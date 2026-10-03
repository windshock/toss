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
import viva.republica.toss.network.model.verify.guest.GlobalSignInRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GlobalSignInRequest {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final Map<String, String> crossRegionPasswords;
    private final long onboardingEventId;
    private final String password;
    private final nativeReadByte passwordFormat;

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        KSerializer kSerializerOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerOnNavigationEvent = onNavigationEvent();
            int i3 = 13 / 0;
        } else {
            kSerializerOnNavigationEvent = onNavigationEvent();
        }
        int i4 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
        return kSerializerOnNavigationEvent;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        KSerializer kSerializerOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i3 = 72 / 0;
        } else {
            kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
        }
        int i4 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
        return kSerializerOnExtraCallbackWithResult;
    }

    private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.password.PasswordFormat", nativeReadByte.values());
        }
        int i3 = 41 / 0;
        return updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.password.PasswordFormat", nativeReadByte.values());
    }

    private static final /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getwrigglelayout, getwrigglelayout);
        int i2 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 70 / 0;
        }
        return getmutilbackgrounddrawable;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 101;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof GlobalSignInRequest)) {
            return false;
        }
        GlobalSignInRequest globalSignInRequest = (GlobalSignInRequest) obj;
        if (this.onboardingEventId != globalSignInRequest.onboardingEventId) {
            return false;
        }
        if (!Intrinsics.areEqual(this.password, globalSignInRequest.password)) {
            int i7 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i7 % 128;
            return i7 % 2 == 0;
        }
        if (this.passwordFormat == globalSignInRequest.passwordFormat) {
            return Intrinsics.areEqual(this.crossRegionPasswords, globalSignInRequest.crossRegionPasswords);
        }
        int i8 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i8 % 128;
        return i8 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Long.hashCode(this.onboardingEventId);
        int iHashCode3 = this.password.hashCode();
        int iHashCode4 = this.passwordFormat.hashCode();
        Map<String, String> map = this.crossRegionPasswords;
        if (map == null) {
            int i2 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = map.hashCode();
        }
        int i4 = (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
        int i5 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GlobalSignInRequest(onboardingEventId=" + this.onboardingEventId + ", password=" + this.password + ", passwordFormat=" + this.passwordFormat + ", crossRegionPasswords=" + this.crossRegionPasswords + ")";
        int i2 = onNavigationEvent + 93;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 94 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GlobalSignInRequest> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            GlobalSignInRequest$.serializer serializerVar = GlobalSignInRequest$.serializer.INSTANCE;
            if (i3 == 0) {
                int i4 = 43 / 0;
            }
            return serializerVar;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.verify.guest.GlobalSignInRequest$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                KSerializer kSerializerOnExtraCallback;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 97;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    kSerializerOnExtraCallback = GlobalSignInRequest.onExtraCallback();
                    int i3 = 42 / 0;
                } else {
                    kSerializerOnExtraCallback = GlobalSignInRequest.onExtraCallback();
                }
                int i4 = onExtraCallback + 45;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallback;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.verify.guest.GlobalSignInRequest$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 49;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return GlobalSignInRequest.IAuthTabCallback();
                }
                GlobalSignInRequest.IAuthTabCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        })};
        int i = onWarmupCompleted + 29;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ GlobalSignInRequest(int i, long j, String str, nativeReadByte nativereadbyte, Map map, okycx okycxVar) {
        if (7 != (i & 7)) {
            int i2 = onNavigationEvent + 83;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 7, GlobalSignInRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallbackWithResult + 67;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.onboardingEventId = j;
        this.password = str;
        this.passwordFormat = nativereadbyte;
        if ((i & 8) == 0) {
            this.crossRegionPasswords = null;
        } else {
            this.crossRegionPasswords = map;
        }
    }

    public GlobalSignInRequest(long j, @NotNull String str, @NotNull nativeReadByte nativereadbyte, @Nullable Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(nativereadbyte, "");
        this.onboardingEventId = j;
        this.password = str;
        this.passwordFormat = nativereadbyte;
        this.crossRegionPasswords = map;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(GlobalSignInRequest globalSignInRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, globalSignInRequest.onboardingEventId);
        vylVar.onExtraCallback(serialDescriptor, 1, globalSignInRequest.password);
        vylVar.onNavigationEvent(serialDescriptor, 2, (py) lazyArr[2].getValue(), globalSignInRequest.passwordFormat);
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            int i4 = onExtraCallbackWithResult + 87;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            if (globalSignInRequest.crossRegionPasswords == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, (py) lazyArr[3].getValue(), globalSignInRequest.crossRegionPasswords);
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 117;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 81;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GlobalSignInRequest(long j, String str, nativeReadByte nativereadbyte, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 8) != 0) {
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 83;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 119;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            map = null;
        }
        this(j, str, nativereadbyte, map);
    }
}
