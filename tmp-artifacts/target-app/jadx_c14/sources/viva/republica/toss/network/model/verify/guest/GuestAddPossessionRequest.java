package viva.republica.toss.network.model.verify.guest;

import com.google.gson.annotations.SerializedName;
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
import o.jniHandleMemoryPressure;
import o.liq;
import o.okycx;
import o.py;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.verify.guest.GuestAddPossessionRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GuestAddPossessionRequest {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    @SerializedName("guestId")
    private final long guestId;

    @SerializedName("possessionType")
    private final jniHandleMemoryPressure possessionType;

    @SerializedName("verifyId")
    private final long verifyId;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.verify.guest.GuestAddPossessionRequest$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                GuestAddPossessionRequest.onExtraCallbackWithResult();
                throw null;
            }
            KSerializer kSerializerOnExtraCallbackWithResult = GuestAddPossessionRequest.onExtraCallbackWithResult();
            int i3 = onExtraCallbackWithResult + 125;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerOnExtraCallbackWithResult;
        }
    }), null};

    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        KSerializer kSerializerOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.verify.guest.GuestPossessionMethod", jniHandleMemoryPressure.values());
            int i3 = 47 / 0;
        } else {
            kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.verify.guest.GuestPossessionMethod", jniHandleMemoryPressure.values());
        }
        int i4 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallback = IAuthTabCallback();
        int i4 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerIAuthTabCallback;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 81;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof GuestAddPossessionRequest) {
            GuestAddPossessionRequest guestAddPossessionRequest = (GuestAddPossessionRequest) obj;
            return this.guestId == guestAddPossessionRequest.guestId && this.possessionType == guestAddPossessionRequest.possessionType && this.verifyId == guestAddPossessionRequest.verifyId;
        }
        int i4 = i2 + 85;
        onExtraCallbackWithResult = i4 % 128;
        return i4 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((Long.hashCode(this.guestId) >> 57) >>> this.possessionType.hashCode()) >> 7) % Long.hashCode(this.verifyId) : (((Long.hashCode(this.guestId) * 31) + this.possessionType.hashCode()) * 31) + Long.hashCode(this.verifyId);
        int i3 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GuestAddPossessionRequest(guestId=" + this.guestId + ", possessionType=" + this.possessionType + ", verifyId=" + this.verifyId + ")";
        int i2 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GuestAddPossessionRequest> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            GuestAddPossessionRequest$.serializer serializerVar = GuestAddPossessionRequest$.serializer.INSTANCE;
            if (i3 != 0) {
                int i4 = 98 / 0;
            }
            return serializerVar;
        }
    }

    static {
        int i = onExtraCallback + 19;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ GuestAddPossessionRequest(int i, long j, jniHandleMemoryPressure jnihandlememorypressure, long j2, okycx okycxVar) {
        if (7 != (i & 7)) {
            int i2 = onNavigationEvent + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 7, GuestAddPossessionRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = onNavigationEvent + 35;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this.guestId = j;
        this.possessionType = jnihandlememorypressure;
        this.verifyId = j2;
    }

    public GuestAddPossessionRequest(long j, @NotNull jniHandleMemoryPressure jnihandlememorypressure, long j2) {
        Intrinsics.checkNotNullParameter(jnihandlememorypressure, "");
        this.guestId = j;
        this.possessionType = jnihandlememorypressure;
        this.verifyId = j2;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 47;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 27;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 90 / 0;
        }
        return lazyArr;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(GuestAddPossessionRequest guestAddPossessionRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, guestAddPossessionRequest.guestId);
        vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), guestAddPossessionRequest.possessionType);
        vylVar.onExtraCallback(serialDescriptor, 2, guestAddPossessionRequest.verifyId);
        int i4 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
