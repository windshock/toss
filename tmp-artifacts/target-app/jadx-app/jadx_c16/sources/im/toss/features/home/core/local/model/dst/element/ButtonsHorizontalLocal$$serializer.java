package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.property.PaddingLocal;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal$$serializer;
import im.toss.features.home.core.local.model.dst.widget.ButtonLocal;
import im.toss.features.home.core.local.model.dst.widget.ButtonLocal$;
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
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ButtonsHorizontalLocal$$serializer implements aeu2<ButtonsHorizontalLocal> {
    private static int IAuthTabCallback = 0;
    public static final ButtonsHorizontalLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 99;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        ButtonsHorizontalLocal$$serializer buttonsHorizontalLocal$$serializer = new ButtonsHorizontalLocal$$serializer();
        INSTANCE = buttonsHorizontalLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ButtonsHorizontalLocal", buttonsHorizontalLocal$$serializer, 4);
        setanimationsloop.onWarmupCompleted("primaryButton", false);
        setanimationsloop.onWarmupCompleted("secondaryButton", false);
        setanimationsloop.onWarmupCompleted("backgroundColor", false);
        setanimationsloop.onWarmupCompleted("padding", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 43;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ButtonsHorizontalLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            KSerializer<?> kSerializer = ButtonLocal$.serializer.INSTANCE;
            return new KSerializer[]{kSerializer, sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), PaddingLocal$$serializer.INSTANCE};
        }
        KSerializer<?> kSerializer2 = ButtonLocal$.serializer.INSTANCE;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(kSerializer2);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent);
        KSerializer<?>[] kSerializerArr = new KSerializer[5];
        kSerializerArr[0] = kSerializer2;
        kSerializerArr[0] = kSerializerIAuthTabCallback;
        kSerializerArr[3] = kSerializerIAuthTabCallback2;
        kSerializerArr[4] = PaddingLocal$$serializer.INSTANCE;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ButtonsHorizontalLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        ButtonLocal buttonLocal;
        String str;
        PaddingLocal paddingLocal;
        ButtonLocal buttonLocal2;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 27;
        IAuthTabCallback = i3 % 128;
        String str2 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            ButtonLocal$.serializer serializerVar = ButtonLocal$.serializer.INSTANCE;
            ButtonLocal buttonLocal3 = (ButtonLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, serializerVar, (Object) null);
            ButtonLocal buttonLocal4 = (ButtonLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, serializerVar, (Object) null);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, (Object) null);
            buttonLocal = buttonLocal4;
            paddingLocal = (PaddingLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, PaddingLocal$$serializer.INSTANCE, (Object) null);
            i = 15;
            buttonLocal2 = buttonLocal3;
        } else {
            ButtonLocal buttonLocal5 = null;
            PaddingLocal paddingLocal2 = null;
            ButtonLocal buttonLocal6 = null;
            int i4 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i5 = onExtraCallback + 87;
                    int i6 = i5 % 128;
                    IAuthTabCallback = i6;
                    int i7 = i5 % 2;
                    if (iOnNavigationEvent == 0) {
                        buttonLocal6 = (ButtonLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, ButtonLocal$.serializer.INSTANCE, buttonLocal6);
                        i4 |= 1;
                    } else if (iOnNavigationEvent == 1) {
                        buttonLocal5 = (ButtonLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ButtonLocal$.serializer.INSTANCE, buttonLocal5);
                        i4 |= 2;
                    } else if (iOnNavigationEvent == 2) {
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str2);
                        i4 |= 4;
                    } else {
                        if (iOnNavigationEvent != 3) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i8 = i6 + 57;
                        onExtraCallback = i8 % 128;
                        int i9 = i8 % 2;
                        paddingLocal2 = (PaddingLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, PaddingLocal$$serializer.INSTANCE, paddingLocal2);
                        i4 |= 8;
                    }
                } else {
                    int i10 = IAuthTabCallback + 41;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                    z = false;
                }
            }
            buttonLocal = buttonLocal5;
            str = str2;
            paddingLocal = paddingLocal2;
            buttonLocal2 = buttonLocal6;
            i = i4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ButtonsHorizontalLocal(i, buttonLocal2, buttonLocal, str, paddingLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m304deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ButtonsHorizontalLocal buttonsHorizontalLocal) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(buttonsHorizontalLocal, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ButtonsHorizontalLocal.onWarmupCompleted(buttonsHorizontalLocal, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(buttonsHorizontalLocal, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        ButtonsHorizontalLocal.onWarmupCompleted(buttonsHorizontalLocal, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ButtonsHorizontalLocal) obj);
        int i4 = onExtraCallback + 63;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}
