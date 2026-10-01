package im.toss.features.ble.api.model;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AcquaintanceRequest$$serializer implements aeu2<AcquaintanceRequest> {
    private static int IAuthTabCallback = 1;
    public static final AcquaintanceRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 59;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 0 / 0;
        }
        return serialDescriptor;
    }

    static {
        AcquaintanceRequest$$serializer acquaintanceRequest$$serializer = new AcquaintanceRequest$$serializer();
        INSTANCE = acquaintanceRequest$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.ble.api.model.AcquaintanceRequest", acquaintanceRequest$$serializer, 1);
        setanimationsloop.onWarmupCompleted("cursor", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 107;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private AcquaintanceRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArr = new KSerializer[0];
            kSerializerArr[1] = oty1.onExtraCallback;
        } else {
            kSerializerArr = new KSerializer[]{oty1.onExtraCallback};
        }
        int i3 = IAuthTabCallback + 115;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AcquaintanceRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        long jIAuthTabCallbackDefault;
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onExtraCallback + 3;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
        } else {
            int i7 = IAuthTabCallback + 117;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 5 / 4;
            }
            long jIAuthTabCallbackDefault2 = 0;
            boolean z = true;
            int i9 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i10 = IAuthTabCallback + 67;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                    i9 = 1;
                } else {
                    int i12 = IAuthTabCallback + 45;
                    onExtraCallback = i12 % 128;
                    int i13 = i12 % 2;
                    z = false;
                }
            }
            jIAuthTabCallbackDefault = jIAuthTabCallbackDefault2;
            i4 = i9;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AcquaintanceRequest(i4, jIAuthTabCallbackDefault, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m99deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AcquaintanceRequest acquaintanceRequestDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 63 / 0;
        }
        int i5 = IAuthTabCallback + 97;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 13 / 0;
        }
        return acquaintanceRequestDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AcquaintanceRequest acquaintanceRequest) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(acquaintanceRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AcquaintanceRequest.onExtraCallback(acquaintanceRequest, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 105;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AcquaintanceRequest) obj);
        int i4 = IAuthTabCallback + 95;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
