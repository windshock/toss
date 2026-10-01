package im.toss.features.kyc.network.model;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class OfficialDocumentEddResponse$$serializer implements aeu2<OfficialDocumentEddResponse> {
    public static final int $stable;
    public static final OfficialDocumentEddResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        OfficialDocumentEddResponse$$serializer officialDocumentEddResponse$$serializer = new OfficialDocumentEddResponse$$serializer();
        INSTANCE = officialDocumentEddResponse$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.kyc.network.model.OfficialDocumentEddResponse", officialDocumentEddResponse$$serializer, 2);
        setanimationsloop.onWarmupCompleted("kycKey", true);
        setanimationsloop.onWarmupCompleted("isBlockTarget", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 117;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private OfficialDocumentEddResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArr = new KSerializer[4];
            kSerializerArr[1] = sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent);
            kSerializerArr[0] = getBgColor.IAuthTabCallback;
        } else {
            kSerializerArr = new KSerializer[]{sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), getBgColor.IAuthTabCallback};
        }
        int i3 = onExtraCallbackWithResult + 79;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final OfficialDocumentEddResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        boolean zOnExtraCallbackWithResult;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onNavigationEvent + 13;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            if (i6 != 0) {
                str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
                zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
                i = 4;
            } else {
                str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
                zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
                i = 3;
            }
        } else {
            String str2 = null;
            boolean zOnExtraCallbackWithResult2 = false;
            int i7 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str2);
                    i7 |= 1;
                    int i8 = onNavigationEvent + 15;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
                    i7 |= 2;
                }
            }
            str = str2;
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
            i = i7;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new OfficialDocumentEddResponse(i, str, zOnExtraCallbackWithResult, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m638deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            throw null;
        }
        OfficialDocumentEddResponse officialDocumentEddResponseDeserialize = deserialize(decoder);
        int i3 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 45 / 0;
        }
        return officialDocumentEddResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull OfficialDocumentEddResponse officialDocumentEddResponse) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(officialDocumentEddResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        OfficialDocumentEddResponse.onExtraCallbackWithResult(officialDocumentEddResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 107;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (OfficialDocumentEddResponse) obj);
        int i4 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        obj.hashCode();
        throw null;
    }
}
