package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.AmountTopLocal;
import im.toss.features.home.core.local.model.dst.widget.ImageSourceLocal;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.okycx;
import o.removeNextStartHandler;
import o.setAnimationsLoop;
import o.setVideoListener;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AmountTopLocal$Right$Image$$serializer implements aeu2<AmountTopLocal.Right.Image> {
    private static int IAuthTabCallback = 1;
    public static final AmountTopLocal$Right$Image$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 5;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        AmountTopLocal$Right$Image$$serializer amountTopLocal$Right$Image$$serializer = new AmountTopLocal$Right$Image$$serializer();
        INSTANCE = amountTopLocal$Right$Image$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.AmountTopLocal.Right.Image", amountTopLocal$Right$Image$$serializer, 3);
        setanimationsloop.onWarmupCompleted("image", false);
        setanimationsloop.onWarmupCompleted("width", false);
        setanimationsloop.onWarmupCompleted("height", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 61;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private AmountTopLocal$Right$Image$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(removeNextStartHandler.onWarmupCompleted), setvideolistener, setvideolistener};
        int i4 = IAuthTabCallback + 19;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AmountTopLocal.Right.Image deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        double dIAuthTabCallback;
        double dIAuthTabCallback2;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        ImageSourceLocal imageSourceLocal = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onWarmupCompleted + 117;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            dIAuthTabCallback2 = 0.0d;
            boolean z = true;
            i = 0;
            dIAuthTabCallback = 0.0d;
            while (!(!z)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    int i5 = IAuthTabCallback + 107;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    imageSourceLocal = (ImageSourceLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, removeNextStartHandler.onWarmupCompleted, imageSourceLocal);
                    i |= 1;
                } else if (iOnNavigationEvent != 1) {
                    int i7 = IAuthTabCallback + 37;
                    onWarmupCompleted = i7 % 128;
                    if (i7 % 2 != 0) {
                        if (iOnNavigationEvent != 3) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 2);
                        i |= 4;
                    } else {
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 2);
                        i |= 4;
                    }
                } else {
                    dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 1);
                    i |= 2;
                }
            }
        } else {
            imageSourceLocal = (ImageSourceLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, removeNextStartHandler.onWarmupCompleted, (Object) null);
            dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 1);
            dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 2);
            i = 7;
        }
        double d = dIAuthTabCallback;
        int i8 = i;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AmountTopLocal.Right.Image(i8, imageSourceLocal, d, dIAuthTabCallback2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m270deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AmountTopLocal.Right.Image image) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(image, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AmountTopLocal.Right.Image.onExtraCallback(image, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 115;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AmountTopLocal.Right.Image) obj);
        int i4 = IAuthTabCallback + 7;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 41;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
