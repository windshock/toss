package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.property.ColorAttributeLocal;
import im.toss.features.home.core.local.model.dst.property.ColorAttributeLocal$;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.okycx;
import o.setAnimationsLoop;
import o.setVideoListener;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class VerticalGradientLocal$$serializer implements aeu2<VerticalGradientLocal> {
    private static int IAuthTabCallback = 0;
    public static final VerticalGradientLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        VerticalGradientLocal$$serializer verticalGradientLocal$$serializer = new VerticalGradientLocal$$serializer();
        INSTANCE = verticalGradientLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.VerticalGradientLocal", verticalGradientLocal$$serializer, 3);
        setanimationsloop.onWarmupCompleted("topColor", false);
        setanimationsloop.onWarmupCompleted("bottomColor", false);
        setanimationsloop.onWarmupCompleted("height", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 29;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private VerticalGradientLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ColorAttributeLocal$.serializer serializerVar = ColorAttributeLocal$.serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {serializerVar, serializerVar, setVideoListener.onWarmupCompleted};
        int i4 = IAuthTabCallback + 69;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final VerticalGradientLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        ColorAttributeLocal colorAttributeLocal;
        ColorAttributeLocal colorAttributeLocal2;
        double dIAuthTabCallback;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = IAuthTabCallback + 23;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            ColorAttributeLocal$.serializer serializerVar = ColorAttributeLocal$.serializer.INSTANCE;
            ColorAttributeLocal colorAttributeLocal3 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, serializerVar, (Object) null);
            i = 7;
            colorAttributeLocal = (ColorAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, serializerVar, (Object) null);
            colorAttributeLocal2 = colorAttributeLocal3;
            dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 2);
        } else {
            int i5 = 0;
            boolean z = true;
            double dIAuthTabCallback2 = 0.0d;
            ColorAttributeLocal colorAttributeLocal4 = null;
            ColorAttributeLocal colorAttributeLocal5 = null;
            while (z) {
                int i6 = onWarmupCompleted + 85;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    colorAttributeLocal5 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, ColorAttributeLocal$.serializer.INSTANCE, colorAttributeLocal5);
                    i5 |= 1;
                } else if (iOnNavigationEvent != 1) {
                    int i7 = IAuthTabCallback + 9;
                    int i8 = i7 % 128;
                    onWarmupCompleted = i8;
                    int i9 = i7 % 2;
                    if (iOnNavigationEvent != 2) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i10 = i8 + 19;
                    IAuthTabCallback = i10 % 128;
                    dIAuthTabCallback2 = i10 % 2 != 0 ? ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 3) : ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 2);
                    i5 |= 4;
                } else {
                    colorAttributeLocal4 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, ColorAttributeLocal$.serializer.INSTANCE, colorAttributeLocal4);
                    i5 |= 2;
                }
            }
            i = i5;
            colorAttributeLocal = colorAttributeLocal4;
            colorAttributeLocal2 = colorAttributeLocal5;
            dIAuthTabCallback = dIAuthTabCallback2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new VerticalGradientLocal(i, colorAttributeLocal2, colorAttributeLocal, dIAuthTabCallback, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m420deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        VerticalGradientLocal verticalGradientLocalDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 97;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return verticalGradientLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull VerticalGradientLocal verticalGradientLocal) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(verticalGradientLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        VerticalGradientLocal.onNavigationEvent(verticalGradientLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 5;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (VerticalGradientLocal) obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 5;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onWarmupCompleted + 89;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
