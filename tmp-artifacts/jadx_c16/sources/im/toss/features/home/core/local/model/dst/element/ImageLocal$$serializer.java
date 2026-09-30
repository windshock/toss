package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.widget.ImageSourceLocal;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBridgeDSLs;
import o.jp;
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
public final /* synthetic */ class ImageLocal$$serializer implements aeu2<ImageLocal> {
    private static int IAuthTabCallback = 0;
    public static final ImageLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 113;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 55;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        ImageLocal$$serializer imageLocal$$serializer = new ImageLocal$$serializer();
        INSTANCE = imageLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ImageLocal", imageLocal$$serializer, 8);
        setanimationsloop.onWarmupCompleted("image", false);
        setanimationsloop.onWarmupCompleted("width", false);
        setanimationsloop.onWarmupCompleted("height", false);
        setanimationsloop.onWarmupCompleted("paddingTop", false);
        setanimationsloop.onWarmupCompleted("paddingLeft", false);
        setanimationsloop.onWarmupCompleted("paddingRight", false);
        setanimationsloop.onWarmupCompleted("paddingBottom", false);
        setanimationsloop.onWarmupCompleted("horizontalAlignment", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 3;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private ImageLocal$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnNavigationEvent = ImageLocal.onNavigationEvent();
        setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(removeNextStartHandler.onWarmupCompleted), setvideolistener, setvideolistener, setvideolistener, setvideolistener, setvideolistener, setvideolistener, lazyArrOnNavigationEvent[7].getValue()};
        int i4 = onExtraCallback + 39;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ImageLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        ImageSourceLocal imageSourceLocal;
        int i;
        double d;
        double d2;
        double d3;
        double d4;
        getBridgeDSLs getbridgedsls;
        double d5;
        double d6;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 125;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            ImageLocal.onNavigationEvent();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = ImageLocal.onNavigationEvent();
        if (!(!ywVarOnWarmupCompleted2.extraCallbackWithResult())) {
            ImageSourceLocal imageSourceLocal2 = (ImageSourceLocal) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 0, removeNextStartHandler.onWarmupCompleted, (Object) null);
            double dIAuthTabCallback = ywVarOnWarmupCompleted2.IAuthTabCallback(serialDescriptor, 1);
            double dIAuthTabCallback2 = ywVarOnWarmupCompleted2.IAuthTabCallback(serialDescriptor, 2);
            double dIAuthTabCallback3 = ywVarOnWarmupCompleted2.IAuthTabCallback(serialDescriptor, 3);
            double dIAuthTabCallback4 = ywVarOnWarmupCompleted2.IAuthTabCallback(serialDescriptor, 4);
            double dIAuthTabCallback5 = ywVarOnWarmupCompleted2.IAuthTabCallback(serialDescriptor, 5);
            double dIAuthTabCallback6 = ywVarOnWarmupCompleted2.IAuthTabCallback(serialDescriptor, 6);
            getBridgeDSLs getbridgedsls2 = (getBridgeDSLs) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 7, (jp) lazyArrOnNavigationEvent[7].getValue(), (Object) null);
            i = 255;
            d = dIAuthTabCallback4;
            d3 = dIAuthTabCallback3;
            getbridgedsls = getbridgedsls2;
            imageSourceLocal = imageSourceLocal2;
            d5 = dIAuthTabCallback;
            d4 = dIAuthTabCallback5;
            d6 = dIAuthTabCallback6;
            d2 = dIAuthTabCallback2;
        } else {
            getBridgeDSLs getbridgedsls3 = null;
            boolean z = true;
            double dIAuthTabCallback7 = 0.0d;
            double dIAuthTabCallback8 = 0.0d;
            double dIAuthTabCallback9 = 0.0d;
            double dIAuthTabCallback10 = 0.0d;
            double dIAuthTabCallback11 = 0.0d;
            double dIAuthTabCallback12 = 0.0d;
            imageSourceLocal = null;
            int i4 = 0;
            while (z) {
                int i5 = onExtraCallback + 77;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                    case 0:
                        imageSourceLocal = (ImageSourceLocal) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 0, removeNextStartHandler.onWarmupCompleted, imageSourceLocal);
                        i4 |= 1;
                    case 1:
                        dIAuthTabCallback9 = ywVarOnWarmupCompleted2.IAuthTabCallback(serialDescriptor, 1);
                        i4 |= 2;
                    case 2:
                        dIAuthTabCallback10 = ywVarOnWarmupCompleted2.IAuthTabCallback(serialDescriptor, 2);
                        i4 |= 4;
                    case 3:
                        dIAuthTabCallback11 = ywVarOnWarmupCompleted2.IAuthTabCallback(serialDescriptor, 3);
                        i4 |= 8;
                    case 4:
                        dIAuthTabCallback8 = ywVarOnWarmupCompleted2.IAuthTabCallback(serialDescriptor, 4);
                        i4 |= 16;
                    case 5:
                        dIAuthTabCallback12 = ywVarOnWarmupCompleted2.IAuthTabCallback(serialDescriptor, 5);
                        i4 |= 32;
                    case 6:
                        dIAuthTabCallback7 = ywVarOnWarmupCompleted2.IAuthTabCallback(serialDescriptor, 6);
                        i4 |= 64;
                    case 7:
                        getbridgedsls3 = (getBridgeDSLs) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 7, (jp) lazyArrOnNavigationEvent[7].getValue(), getbridgedsls3);
                        i4 |= 128;
                        int i6 = onExtraCallback + 53;
                        onNavigationEvent = i6 % 128;
                        int i7 = i6 % 2;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            i = i4;
            d = dIAuthTabCallback8;
            d2 = dIAuthTabCallback10;
            d3 = dIAuthTabCallback11;
            d4 = dIAuthTabCallback12;
            getbridgedsls = getbridgedsls3;
            d5 = dIAuthTabCallback9;
            d6 = dIAuthTabCallback7;
        }
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        return new ImageLocal(i, imageSourceLocal, d5, d2, d3, d, d4, d6, getbridgedsls, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m397deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            obj.hashCode();
            throw null;
        }
        ImageLocal imageLocalDeserialize = deserialize(decoder);
        int i3 = onNavigationEvent + 85;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return imageLocalDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ImageLocal imageLocal) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(imageLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ImageLocal.onWarmupCompleted(imageLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 85;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ImageLocal) obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 1;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
