package im.toss.features.home.core.local.model.dst.property;

import im.toss.features.home.core.local.model.dst.property.ColorAttributeLocal$;
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
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class OuterStrokeLocal$$serializer implements aeu2<OuterStrokeLocal> {
    private static int IAuthTabCallback = 1;
    public static final OuterStrokeLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 3;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 57;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        OuterStrokeLocal$$serializer outerStrokeLocal$$serializer = new OuterStrokeLocal$$serializer();
        INSTANCE = outerStrokeLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.property.OuterStrokeLocal", outerStrokeLocal$$serializer, 2);
        setanimationsloop.onWarmupCompleted("width", false);
        setanimationsloop.onWarmupCompleted("color", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 69;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 85 / 0;
        }
    }

    private OuterStrokeLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return new KSerializer[]{sp.IAuthTabCallback(dj3.onWarmupCompleted), sp.IAuthTabCallback(ColorAttributeLocal$.serializer.INSTANCE)};
        }
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(dj3.onWarmupCompleted);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(ColorAttributeLocal$.serializer.INSTANCE);
        KSerializer<?>[] kSerializerArr = new KSerializer[4];
        kSerializerArr[1] = kSerializerIAuthTabCallback;
        kSerializerArr[1] = kSerializerIAuthTabCallback2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final OuterStrokeLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Float f;
        ColorAttributeLocal colorAttributeLocal;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 77;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            f = (Float) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, dj3.onWarmupCompleted, (Object) null);
            colorAttributeLocal = (ColorAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ColorAttributeLocal$.serializer.INSTANCE, (Object) null);
            i = 3;
        } else {
            Float f2 = null;
            ColorAttributeLocal colorAttributeLocal2 = null;
            int i4 = 0;
            boolean z = true;
            while (!(!z)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    int i5 = IAuthTabCallback + 103;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    f2 = (Float) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, dj3.onWarmupCompleted, f2);
                    i4 |= 1;
                    int i7 = IAuthTabCallback + 17;
                    onWarmupCompleted = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 5 / 2;
                    }
                } else {
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i9 = IAuthTabCallback + 7;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    colorAttributeLocal2 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ColorAttributeLocal$.serializer.INSTANCE, colorAttributeLocal2);
                    i4 |= 2;
                }
            }
            f = f2;
            colorAttributeLocal = colorAttributeLocal2;
            i = i4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new OuterStrokeLocal(i, f, colorAttributeLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m462deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        OuterStrokeLocal outerStrokeLocalDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 28 / 0;
        }
        return outerStrokeLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull OuterStrokeLocal outerStrokeLocal) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(outerStrokeLocal, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            OuterStrokeLocal.onExtraCallbackWithResult(outerStrokeLocal, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(outerStrokeLocal, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        OuterStrokeLocal.onExtraCallbackWithResult(outerStrokeLocal, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (OuterStrokeLocal) obj);
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onWarmupCompleted + 85;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        obj.hashCode();
        throw null;
    }
}
