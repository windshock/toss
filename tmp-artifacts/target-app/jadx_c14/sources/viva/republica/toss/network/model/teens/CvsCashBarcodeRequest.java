package viva.republica.toss.network.model.teens;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.DestructorThreadDestructor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.teens.CvsCashBarcodeRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CvsCashBarcodeRequest {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final long amount;
    private final DestructorThreadDestructor type;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.teens.CvsCashBarcodeRequest$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                CvsCashBarcodeRequest.onExtraCallback();
                throw null;
            }
            KSerializer kSerializerOnExtraCallback = CvsCashBarcodeRequest.onExtraCallback();
            int i3 = onWarmupCompleted + 125;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return kSerializerOnExtraCallback;
            }
            throw null;
        }
    })};

    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.teens.CvsCashTransactionType", DestructorThreadDestructor.values());
        int i4 = IAuthTabCallback + 117;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallback = IAuthTabCallback();
        int i4 = IAuthTabCallback + 9;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallback;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 5;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof CvsCashBarcodeRequest)) {
            int i3 = onExtraCallback + 63;
            IAuthTabCallback = i3 % 128;
            return i3 % 2 != 0;
        }
        CvsCashBarcodeRequest cvsCashBarcodeRequest = (CvsCashBarcodeRequest) obj;
        if (this.amount == cvsCashBarcodeRequest.amount) {
            return this.type == cvsCashBarcodeRequest.type;
        }
        int i4 = IAuthTabCallback + 119;
        onExtraCallback = i4 % 128;
        return i4 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onExtraCallback = i2 % 128;
        return i2 % 2 == 0 ? (Long.hashCode(this.amount) << 123) % this.type.hashCode() : (Long.hashCode(this.amount) * 31) + this.type.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CvsCashBarcodeRequest(amount=" + this.amount + ", type=" + this.type + ")";
        int i2 = IAuthTabCallback + 69;
        onExtraCallback = i2 % 128;
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

        public final KSerializer<CvsCashBarcodeRequest> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 19;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            CvsCashBarcodeRequest$.serializer serializerVar = CvsCashBarcodeRequest$.serializer.INSTANCE;
            if (i3 != 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 43;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ CvsCashBarcodeRequest(int i, long j, DestructorThreadDestructor destructorThreadDestructor, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = IAuthTabCallback + 71;
            onExtraCallback = i2 % 128;
            htf31.onExtraCallbackWithResult(i, 3, (i2 % 2 == 0 ? CvsCashBarcodeRequest$.serializer.INSTANCE : CvsCashBarcodeRequest$.serializer.INSTANCE).getDescriptor());
            int i3 = onExtraCallback + 33;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        }
        this.amount = j;
        this.type = destructorThreadDestructor;
    }

    public CvsCashBarcodeRequest(long j, @NotNull DestructorThreadDestructor destructorThreadDestructor) {
        Intrinsics.checkNotNullParameter(destructorThreadDestructor, "");
        this.amount = j;
        this.type = destructorThreadDestructor;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(CvsCashBarcodeRequest cvsCashBarcodeRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        Lazy<KSerializer<Object>> lazy;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            vylVar.onExtraCallback(serialDescriptor, 1, cvsCashBarcodeRequest.amount);
            lazy = lazyArr[1];
        } else {
            Lazy<KSerializer<Object>>[] lazyArr2 = $childSerializers;
            vylVar.onExtraCallback(serialDescriptor, 0, cvsCashBarcodeRequest.amount);
            lazy = lazyArr2[1];
        }
        vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazy.getValue(), cvsCashBarcodeRequest.type);
        int i3 = onExtraCallback + 23;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 77;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 73;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }
}
