package im.toss.features.home.core.local.model.dst.property;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.dj3;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class VerticalPaddingLocal$$serializer implements aeu2<VerticalPaddingLocal> {
    private static int IAuthTabCallback = 0;
    public static final VerticalPaddingLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 == 0) {
            int i4 = 52 / 0;
        }
        return serialDescriptor;
    }

    static {
        VerticalPaddingLocal$$serializer verticalPaddingLocal$$serializer = new VerticalPaddingLocal$$serializer();
        INSTANCE = verticalPaddingLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.property.VerticalPaddingLocal", verticalPaddingLocal$$serializer, 2);
        setanimationsloop.onWarmupCompleted("top", false);
        setanimationsloop.onWarmupCompleted("bottom", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 21;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private VerticalPaddingLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        dj3 dj3Var = dj3.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {dj3Var, dj3Var};
        int i4 = onWarmupCompleted + 95;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final VerticalPaddingLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        float fOnWarmupCompleted;
        float fOnWarmupCompleted2;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 3;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 0);
            fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
        } else {
            float fOnWarmupCompleted3 = 0.0f;
            float fOnWarmupCompleted4 = 0.0f;
            int i5 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i6 = IAuthTabCallback + 51;
                    int i7 = i6 % 128;
                    onWarmupCompleted = i7;
                    int i8 = i6 % 2;
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i9 = i7 + 123;
                    IAuthTabCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        fOnWarmupCompleted4 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 0);
                        i5 = 3;
                    } else {
                        fOnWarmupCompleted4 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
                        i5 |= 2;
                    }
                } else {
                    fOnWarmupCompleted3 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 0);
                    i5 |= 1;
                }
            }
            fOnWarmupCompleted = fOnWarmupCompleted3;
            fOnWarmupCompleted2 = fOnWarmupCompleted4;
            i4 = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new VerticalPaddingLocal(i4, fOnWarmupCompleted, fOnWarmupCompleted2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m465deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull VerticalPaddingLocal verticalPaddingLocal) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(verticalPaddingLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        VerticalPaddingLocal.IAuthTabCallback(verticalPaddingLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 121;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (VerticalPaddingLocal) obj);
        int i4 = IAuthTabCallback + 39;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
