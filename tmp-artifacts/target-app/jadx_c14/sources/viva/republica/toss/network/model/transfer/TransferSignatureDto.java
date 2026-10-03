package viva.republica.toss.network.model.transfer;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.NativeAnimatedModuleExternalSyntheticLambda3;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TypeUtils2;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.updateRenderInfoForVideo;
import o.userDrivenScrollEnded;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.TransferSignatureDto$;
import viva.republica.toss.network.model.transfer.TransferSignatureDto$Companion$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransferSignatureDto {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final userDrivenScrollEnded certificateType;
    private final String originDocument;
    private final String signedDocument;
    private final TransferSigningMethod signingMethod;

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onExtraCallback + 113;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<TransferSigningMethod> kSerializerSerializer = TransferSigningMethod.Companion.serializer();
        int i4 = onExtraCallback + 79;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerSerializer;
        }
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerAsInterface = asInterface();
        int i4 = onWarmupCompleted + 51;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
        return kSerializerAsInterface;
    }

    private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.TransferCertificateType", userDrivenScrollEnded.values());
        int i4 = onExtraCallback + 53;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 123;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 33;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof TransferSignatureDto)) {
            return false;
        }
        TransferSignatureDto transferSignatureDto = (TransferSignatureDto) obj;
        if (!Intrinsics.areEqual(this.originDocument, transferSignatureDto.originDocument)) {
            int i6 = onExtraCallback + 59;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.signedDocument, transferSignatureDto.signedDocument) || this.certificateType != transferSignatureDto.certificateType) {
            return false;
        }
        if (this.signingMethod == transferSignatureDto.signingMethod) {
            return true;
        }
        int i8 = onWarmupCompleted + 87;
        onExtraCallback = i8 % 128;
        return i8 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.originDocument;
        int iHashCode3 = 0;
        if (str == null) {
            int i2 = onExtraCallback + 11;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = onWarmupCompleted + 39;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        String str2 = this.signedDocument;
        if (str2 == null) {
            int i6 = onWarmupCompleted + 3;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        userDrivenScrollEnded userdrivenscrollended = this.certificateType;
        if (userdrivenscrollended != null) {
            int i8 = onWarmupCompleted + 97;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            iHashCode3 = userdrivenscrollended.hashCode();
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + this.signingMethod.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransferSignatureDto(originDocument=" + this.originDocument + ", signedDocument=" + this.signedDocument + ", certificateType=" + this.certificateType + ", signingMethod=" + this.signingMethod + ")";
        int i2 = onExtraCallback + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ TransferSignatureDto(int i, String str, String str2, userDrivenScrollEnded userdrivenscrollended, TransferSigningMethod transferSigningMethod, okycx okycxVar) {
        if (15 != (i & 15)) {
            int i2 = onWarmupCompleted + 115;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 15, TransferSignatureDto$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallback + 83;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this.originDocument = str;
        this.signedDocument = str2;
        this.certificateType = userdrivenscrollended;
        this.signingMethod = transferSigningMethod;
    }

    public TransferSignatureDto(@Nullable String str, @Nullable String str2, @Nullable userDrivenScrollEnded userdrivenscrollended, @NotNull TransferSigningMethod transferSigningMethod) {
        Intrinsics.checkNotNullParameter(transferSigningMethod, "");
        this.originDocument = str;
        this.signedDocument = str2;
        this.certificateType = userdrivenscrollended;
        this.signingMethod = transferSigningMethod;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(TransferSignatureDto transferSignatureDto, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, transferSignatureDto.originDocument);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, transferSignatureDto.signedDocument);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, (py) lazyArr[2].getValue(), transferSignatureDto.certificateType);
        vylVar.onNavigationEvent(serialDescriptor, 3, (py) lazyArr[3].getValue(), transferSignatureDto.signingMethod);
        int i4 = onExtraCallback + 85;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 81;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.signedDocument;
        int i4 = i3 + 121;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String onExtraCallback(String str, String str2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(str, str2);
            }
            onExtraCallbackWithResult(str, str2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final String onExtraCallbackWithResult(String str, String str2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str2, "");
            if (i3 != 0) {
                int i4 = 10 / 0;
            }
            return str;
        }

        private Companion() {
        }

        public final KSerializer<TransferSignatureDto> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                TransferSignatureDto$.serializer serializerVar = TransferSignatureDto$.serializer.INSTANCE;
                throw null;
            }
            TransferSignatureDto$.serializer serializerVar2 = TransferSignatureDto$.serializer.INSTANCE;
            int i3 = IAuthTabCallback + 111;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return serializerVar2;
        }

        public final TransferSignatureDto IAuthTabCallback() {
            int i = 2 % 2;
            TransferSignatureDto transferSignatureDto = new TransferSignatureDto(null, null, null, TransferSigningMethod.SKIP);
            int i2 = onWarmupCompleted + 111;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return transferSignatureDto;
        }

        public final TransferSignatureDto onExtraCallbackWithResult(@NotNull String str, @NotNull TypeUtils2 typeUtils2) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(typeUtils2, "");
            TransferSignatureDto transferSignatureDto = new TransferSignatureDto(str, typeUtils2.onExtraCallback(new TransferSignatureDto$Companion$.ExternalSyntheticLambda0(str)).onWarmupCompleted(), userDrivenScrollEnded.Companion.onNavigationEvent(typeUtils2.asInterface()), NativeAnimatedModuleExternalSyntheticLambda3.onNavigationEvent(typeUtils2.IAuthTabCallback()));
            int i2 = onWarmupCompleted + 79;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return transferSignatureDto;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.TransferSignatureDto$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 89;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerIAuthTabCallback = TransferSignatureDto.IAuthTabCallback();
                if (i3 == 0) {
                    int i4 = 80 / 0;
                }
                return kSerializerIAuthTabCallback;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.TransferSignatureDto$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                KSerializer kSerializerOnExtraCallback;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 31;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    kSerializerOnExtraCallback = TransferSignatureDto.onExtraCallback();
                    int i3 = 55 / 0;
                } else {
                    kSerializerOnExtraCallback = TransferSignatureDto.onExtraCallback();
                }
                int i4 = IAuthTabCallback + 13;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializerOnExtraCallback;
                }
                throw null;
            }
        })};
        int i = onExtraCallbackWithResult + 33;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }
}
