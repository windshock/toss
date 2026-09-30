package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.property.ColorAttributeLocal;
import im.toss.features.home.core.local.model.dst.property.ColorAttributeLocal$;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal$$serializer;
import im.toss.features.home.core.local.model.dst.widget.TextAttributeLocal;
import im.toss.features.home.core.local.model.dst.widget.TextAttributeLocal$;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getDynamicHeight;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HorizontalProgressBarLocal$$serializer implements aeu2<HorizontalProgressBarLocal> {
    private static int IAuthTabCallback = 0;
    public static final HorizontalProgressBarLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        HorizontalProgressBarLocal$$serializer horizontalProgressBarLocal$$serializer = new HorizontalProgressBarLocal$$serializer();
        INSTANCE = horizontalProgressBarLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.HorizontalProgressBarLocal", horizontalProgressBarLocal$$serializer, 7);
        setanimationsloop.onWarmupCompleted("progress", false);
        setanimationsloop.onWarmupCompleted("max", false);
        setanimationsloop.onWarmupCompleted("progressBarColor", false);
        setanimationsloop.onWarmupCompleted("progressBarBackgroundColor", false);
        setanimationsloop.onWarmupCompleted("leftText", false);
        setanimationsloop.onWarmupCompleted("rightText", false);
        setanimationsloop.onWarmupCompleted("padding", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private HorizontalProgressBarLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(PaddingLocal$$serializer.INSTANCE);
        getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
        ColorAttributeLocal$.serializer serializerVar = ColorAttributeLocal$.serializer.INSTANCE;
        TextAttributeLocal$.serializer serializerVar2 = TextAttributeLocal$.serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {getdynamicheight, getdynamicheight, serializerVar, serializerVar, serializerVar2, serializerVar2, kSerializerIAuthTabCallback};
        int i4 = onExtraCallback + 95;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HorizontalProgressBarLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        TextAttributeLocal textAttributeLocal;
        PaddingLocal paddingLocal;
        TextAttributeLocal textAttributeLocal2;
        ColorAttributeLocal colorAttributeLocal;
        ColorAttributeLocal colorAttributeLocal2;
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i5 = 6;
        int i6 = 5;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i7 = IAuthTabCallback + 51;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            int iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
            int iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
            ColorAttributeLocal$.serializer serializerVar = ColorAttributeLocal$.serializer.INSTANCE;
            ColorAttributeLocal colorAttributeLocal3 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, serializerVar, (Object) null);
            ColorAttributeLocal colorAttributeLocal4 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, serializerVar, (Object) null);
            TextAttributeLocal$.serializer serializerVar2 = TextAttributeLocal$.serializer.INSTANCE;
            TextAttributeLocal textAttributeLocal3 = (TextAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, serializerVar2, (Object) null);
            TextAttributeLocal textAttributeLocal4 = (TextAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, serializerVar2, (Object) null);
            colorAttributeLocal = colorAttributeLocal3;
            i3 = iOnTransact;
            paddingLocal = (PaddingLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, PaddingLocal$$serializer.INSTANCE, (Object) null);
            textAttributeLocal2 = textAttributeLocal4;
            colorAttributeLocal2 = colorAttributeLocal4;
            textAttributeLocal = textAttributeLocal3;
            i = iOnTransact2;
            i2 = 127;
        } else {
            boolean z = true;
            int iOnTransact3 = 0;
            int i9 = 0;
            ColorAttributeLocal colorAttributeLocal5 = null;
            TextAttributeLocal textAttributeLocal5 = null;
            ColorAttributeLocal colorAttributeLocal6 = null;
            textAttributeLocal = null;
            PaddingLocal paddingLocal2 = null;
            int iOnTransact4 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                    case 0:
                        iOnTransact3 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                        i9 |= 1;
                        int i10 = IAuthTabCallback + 9;
                        onExtraCallback = i10 % 128;
                        int i11 = i10 % 2;
                        i5 = 6;
                        i6 = 5;
                    case 1:
                        iOnTransact4 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
                        i9 |= 2;
                        i5 = 6;
                    case 2:
                        colorAttributeLocal6 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, ColorAttributeLocal$.serializer.INSTANCE, colorAttributeLocal6);
                        i9 |= 4;
                        i5 = 6;
                    case 3:
                        colorAttributeLocal5 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, ColorAttributeLocal$.serializer.INSTANCE, colorAttributeLocal5);
                        i9 |= 8;
                        i5 = 6;
                    case 4:
                        textAttributeLocal = (TextAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, TextAttributeLocal$.serializer.INSTANCE, textAttributeLocal);
                        i9 |= 16;
                        i5 = 6;
                    case 5:
                        textAttributeLocal5 = (TextAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i6, TextAttributeLocal$.serializer.INSTANCE, textAttributeLocal5);
                        i9 |= 32;
                        i5 = 6;
                    case 6:
                        paddingLocal2 = (PaddingLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, PaddingLocal$$serializer.INSTANCE, paddingLocal2);
                        i9 |= 64;
                        int i12 = onExtraCallback + 119;
                        IAuthTabCallback = i12 % 128;
                        int i13 = i12 % 2;
                        i5 = 6;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            paddingLocal = paddingLocal2;
            textAttributeLocal2 = textAttributeLocal5;
            colorAttributeLocal = colorAttributeLocal6;
            colorAttributeLocal2 = colorAttributeLocal5;
            i = iOnTransact4;
            i2 = i9;
            i3 = iOnTransact3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HorizontalProgressBarLocal(i2, i3, i, colorAttributeLocal, colorAttributeLocal2, textAttributeLocal, textAttributeLocal2, paddingLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m394deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        HorizontalProgressBarLocal horizontalProgressBarLocalDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 49;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return horizontalProgressBarLocalDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HorizontalProgressBarLocal horizontalProgressBarLocal) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(horizontalProgressBarLocal, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            HorizontalProgressBarLocal.IAuthTabCallback(horizontalProgressBarLocal, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(horizontalProgressBarLocal, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        HorizontalProgressBarLocal.IAuthTabCallback(horizontalProgressBarLocal, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onExtraCallback + 89;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 36 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HorizontalProgressBarLocal) obj);
        int i4 = IAuthTabCallback + 55;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
