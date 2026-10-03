package viva.republica.toss.network.model.cardsales.funnel;

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
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.cardsales.funnel.UploadImageReq$;
import viva.republica.toss.network.model.cardsales.funnel.formvalue.IdVerificationFormValue;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UploadImageReq {
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.cardsales.funnel.UploadImageReq$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnNavigationEvent = UploadImageReq.onNavigationEvent();
            int i4 = onWarmupCompleted + 73;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnNavigationEvent;
        }
    }), null, null};
    public static final Companion Companion;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String ocrImage;
    private final String sessionId;
    private final IdVerificationFormValue.IdType type;

    private static final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<IdVerificationFormValue.IdType> kSerializerSerializer = IdVerificationFormValue.IdType.Companion.serializer();
        int i4 = onNavigationEvent + 23;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerSerializer;
        }
        throw null;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback();
        }
        onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 7;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 23;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof UploadImageReq)) {
            int i8 = i2 + 77;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 == 0) {
                return false;
            }
            throw null;
        }
        UploadImageReq uploadImageReq = (UploadImageReq) obj;
        if (this.type != uploadImageReq.type) {
            return false;
        }
        if (Intrinsics.areEqual(this.ocrImage, uploadImageReq.ocrImage)) {
            return Intrinsics.areEqual(this.sessionId, uploadImageReq.sessionId);
        }
        int i9 = onWarmupCompleted + 19;
        onNavigationEvent = i9 % 128;
        return i9 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.type.hashCode() * 31) + this.ocrImage.hashCode()) * 31) + this.sessionId.hashCode();
        int i4 = onWarmupCompleted + 33;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UploadImageReq(type=" + this.type + ", ocrImage=" + this.ocrImage + ", sessionId=" + this.sessionId + ")";
        int i2 = onWarmupCompleted + 55;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<UploadImageReq> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 31;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                UploadImageReq$.serializer serializerVar = UploadImageReq$.serializer.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            UploadImageReq$.serializer serializerVar2 = UploadImageReq$.serializer.INSTANCE;
            int i3 = onExtraCallback + 107;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return serializerVar2;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onExtraCallbackWithResult + 35;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* synthetic */ UploadImageReq(int i, IdVerificationFormValue.IdType idType, String str, String str2, okycx okycxVar) {
        if (7 != (i & 7)) {
            int i2 = onNavigationEvent + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 7, UploadImageReq$.serializer.INSTANCE.getDescriptor());
            int i4 = onWarmupCompleted + 21;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this.type = idType;
        this.ocrImage = str;
        this.sessionId = str2;
    }

    public UploadImageReq(@NotNull IdVerificationFormValue.IdType idType, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(idType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.type = idType;
        this.ocrImage = str;
        this.sessionId = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(UploadImageReq uploadImageReq, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) $childSerializers[0].getValue(), uploadImageReq.type);
        vylVar.onExtraCallback(serialDescriptor, 1, uploadImageReq.ocrImage);
        vylVar.onExtraCallback(serialDescriptor, 2, uploadImageReq.sessionId);
        int i4 = onWarmupCompleted + 85;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 99;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }
}
