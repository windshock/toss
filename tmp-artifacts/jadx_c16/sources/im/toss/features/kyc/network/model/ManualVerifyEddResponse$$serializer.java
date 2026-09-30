package im.toss.features.kyc.network.model;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ManualVerifyEddResponse$$serializer implements aeu2<ManualVerifyEddResponse> {
    public static final int $stable;
    public static final ManualVerifyEddResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 91;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        ManualVerifyEddResponse$$serializer manualVerifyEddResponse$$serializer = new ManualVerifyEddResponse$$serializer();
        INSTANCE = manualVerifyEddResponse$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.kyc.network.model.ManualVerifyEddResponse", manualVerifyEddResponse$$serializer, 1);
        setanimationsloop.onWarmupCompleted("kycKey", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 107;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private ManualVerifyEddResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArr = new KSerializer[0];
            kSerializerArr[0] = getWriggleLayout.onNavigationEvent;
        } else {
            kSerializerArr = new KSerializer[]{getWriggleLayout.onNavigationEvent};
        }
        int i3 = onExtraCallback + 125;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ManualVerifyEddResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            int i5 = onExtraCallbackWithResult + 63;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        } else {
            strAsInterface = null;
            boolean z = true;
            int i7 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i8 = onExtraCallbackWithResult;
                    int i9 = i8 + 13;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i11 = i8 + 53;
                    onExtraCallback = i11 % 128;
                    int i12 = i11 % 2;
                    strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i7 = 1;
                } else {
                    z = false;
                }
            }
            i4 = i7;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        ManualVerifyEddResponse manualVerifyEddResponse = new ManualVerifyEddResponse(i4, strAsInterface, (okycx) null);
        int i13 = onExtraCallbackWithResult + 79;
        onExtraCallback = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 18 / 0;
        }
        return manualVerifyEddResponse;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m635deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            throw null;
        }
        ManualVerifyEddResponse manualVerifyEddResponseDeserialize = deserialize(decoder);
        int i3 = onExtraCallback + 73;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return manualVerifyEddResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ManualVerifyEddResponse manualVerifyEddResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(manualVerifyEddResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ManualVerifyEddResponse.onExtraCallback(manualVerifyEddResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 3;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        serialize(encoder, (ManualVerifyEddResponse) obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 15;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 23;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
