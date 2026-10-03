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
import viva.republica.toss.network.model.teens.CvsCashBarcodeTypeRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CvsCashBarcodeTypeRequest {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final DestructorThreadDestructor type;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.teens.CvsCashBarcodeTypeRequest$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            KSerializer kSerializerOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 125;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                kSerializerOnExtraCallbackWithResult = CvsCashBarcodeTypeRequest.onExtraCallbackWithResult();
                int i3 = 73 / 0;
            } else {
                kSerializerOnExtraCallbackWithResult = CvsCashBarcodeTypeRequest.onExtraCallbackWithResult();
            }
            int i4 = IAuthTabCallback + 59;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnExtraCallbackWithResult;
        }
    })};

    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.teens.CvsCashTransactionType", DestructorThreadDestructor.values());
        int i4 = onExtraCallbackWithResult + 49;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallback = IAuthTabCallback();
        int i4 = onExtraCallback + 7;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallback;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CvsCashBarcodeTypeRequest)) {
            int i2 = onExtraCallbackWithResult + 71;
            onExtraCallback = i2 % 128;
            return i2 % 2 != 0;
        }
        if (this.type == ((CvsCashBarcodeTypeRequest) obj).type) {
            return true;
        }
        int i3 = onExtraCallbackWithResult + 105;
        onExtraCallback = i3 % 128;
        return i3 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.type.hashCode();
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CvsCashBarcodeTypeRequest(type=" + this.type + ")";
        int i2 = onExtraCallbackWithResult + 73;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CvsCashBarcodeTypeRequest> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            CvsCashBarcodeTypeRequest$.serializer serializerVar = CvsCashBarcodeTypeRequest$.serializer.INSTANCE;
            if (i3 != 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 55;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 29 / 0;
        }
    }

    public /* synthetic */ CvsCashBarcodeTypeRequest(int i, DestructorThreadDestructor destructorThreadDestructor, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 1;
        if (1 != (i & 1)) {
            int i3 = onExtraCallback + 57;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                descriptor = CvsCashBarcodeTypeRequest$.serializer.INSTANCE.getDescriptor();
                i2 = 0;
            } else {
                descriptor = CvsCashBarcodeTypeRequest$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = onExtraCallbackWithResult + 25;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.type = destructorThreadDestructor;
    }

    public CvsCashBarcodeTypeRequest(@NotNull DestructorThreadDestructor destructorThreadDestructor) {
        Intrinsics.checkNotNullParameter(destructorThreadDestructor, "");
        this.type = destructorThreadDestructor;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(CvsCashBarcodeTypeRequest cvsCashBarcodeTypeRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) $childSerializers[0].getValue(), cvsCashBarcodeTypeRequest.type);
        int i4 = onExtraCallback + 95;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i3 + 37;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return lazyArr;
        }
        throw null;
    }
}
