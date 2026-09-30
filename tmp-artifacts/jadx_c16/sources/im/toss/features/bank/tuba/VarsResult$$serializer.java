package im.toss.features.bank.tuba;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonObject;
import o.aeu2;
import o.encryptType4;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class VarsResult$$serializer implements aeu2<VarsResult> {
    private static int IAuthTabCallback = 0;
    public static final VarsResult$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 117;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        VarsResult$$serializer varsResult$$serializer = new VarsResult$$serializer();
        INSTANCE = varsResult$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.bank.tuba.VarsResult", varsResult$$serializer, 1);
        setanimationsloop.onWarmupCompleted("vars", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 65;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private VarsResult$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {encryptType4.IAuthTabCallback};
        int i4 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final VarsResult deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        JsonObject jsonObject;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i2 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            jsonObject = (JsonObject) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, encryptType4.IAuthTabCallback, (Object) null);
            int i3 = onExtraCallbackWithResult + 113;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        } else {
            int i5 = onNavigationEvent + 107;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            boolean z = true;
            jsonObject = null;
            int i7 = 0;
            while (z) {
                int i8 = onExtraCallbackWithResult + 57;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i9 = onExtraCallbackWithResult + 33;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    jsonObject = (JsonObject) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, encryptType4.IAuthTabCallback, jsonObject);
                    i7 = 1;
                } else {
                    int i11 = onExtraCallbackWithResult + 17;
                    onNavigationEvent = i11 % 128;
                    int i12 = i11 % 2;
                    z = false;
                }
            }
            i2 = i7;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new VarsResult(i2, jsonObject, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m78deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        VarsResult varsResultDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
        return varsResultDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull VarsResult varsResult) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(varsResult, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            VarsResult.onWarmupCompleted(varsResult, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(varsResult, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        VarsResult.onWarmupCompleted(varsResult, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (VarsResult) obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
