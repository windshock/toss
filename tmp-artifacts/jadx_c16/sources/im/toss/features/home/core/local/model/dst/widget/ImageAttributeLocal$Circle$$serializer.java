package im.toss.features.home.core.local.model.dst.widget;

import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal$$serializer;
import im.toss.features.home.core.local.model.dst.property.StrokeAttributeLocal;
import im.toss.features.home.core.local.model.dst.property.StrokeAttributeLocal$$serializer;
import im.toss.features.home.core.local.model.dst.widget.ImageAttributeLocal;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.jp;
import o.okycx;
import o.removeNextStartHandler;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.setVideoListener;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ImageAttributeLocal$Circle$$serializer implements aeu2<ImageAttributeLocal.Circle> {
    private static int IAuthTabCallback = 1;
    public static final ImageAttributeLocal$Circle$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 63;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 117;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return serialDescriptor;
        }
        obj.hashCode();
        throw null;
    }

    static {
        ImageAttributeLocal$Circle$$serializer imageAttributeLocal$Circle$$serializer = new ImageAttributeLocal$Circle$$serializer();
        INSTANCE = imageAttributeLocal$Circle$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.ImageAttributeLocal.Circle", imageAttributeLocal$Circle$$serializer, 8);
        setanimationsloop.onWarmupCompleted("imageSource", false);
        setanimationsloop.onWarmupCompleted("backgroundColors", false);
        setanimationsloop.onWarmupCompleted("padding", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("longPressHandler", false);
        setanimationsloop.onWarmupCompleted("scaleType", false);
        setanimationsloop.onWarmupCompleted("stroke", false);
        setanimationsloop.onWarmupCompleted("diameter", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 33;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private ImageAttributeLocal$Circle$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnWarmupCompleted = ImageAttributeLocal.Circle.onWarmupCompleted();
        setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
        KSerializer<?>[] kSerializerArr = {removeNextStartHandler.onWarmupCompleted, lazyArrOnWarmupCompleted[1].getValue(), sp.IAuthTabCallback(PaddingLocal$$serializer.INSTANCE), sp.IAuthTabCallback(setappxversioninworker), sp.IAuthTabCallback(setappxversioninworker), lazyArrOnWarmupCompleted[5].getValue(), sp.IAuthTabCallback(StrokeAttributeLocal$$serializer.INSTANCE), setVideoListener.onWarmupCompleted};
        int i4 = onExtraCallback + 79;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ImageAttributeLocal.Circle deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        ImageSourceLocal imageSourceLocal;
        List list;
        PaddingLocal paddingLocal;
        HandlerLocal handlerLocal;
        HandlerLocal handlerLocal2;
        ImageAttributeLocal.IAuthTabCallback iAuthTabCallback;
        double dIAuthTabCallback;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 49;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = ImageAttributeLocal.Circle.onWarmupCompleted();
        int i5 = 7;
        int i6 = 6;
        StrokeAttributeLocal strokeAttributeLocal = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i7 = onExtraCallback + 27;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            boolean z = true;
            handlerLocal = null;
            handlerLocal2 = null;
            iAuthTabCallback = null;
            imageSourceLocal = null;
            dIAuthTabCallback = 0.0d;
            i = 0;
            paddingLocal = null;
            list = null;
            for (boolean z2 = true; z == z2; z2 = true) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i6 = 6;
                    case 0:
                        imageSourceLocal = (ImageSourceLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, removeNextStartHandler.onWarmupCompleted, imageSourceLocal);
                        i |= 1;
                        i5 = 7;
                        i6 = 6;
                    case 1:
                        list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), list);
                        i |= 2;
                        int i9 = onExtraCallback + 97;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                        i5 = 7;
                    case 2:
                        paddingLocal = (PaddingLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, PaddingLocal$$serializer.INSTANCE, paddingLocal);
                        i |= 4;
                        i5 = 7;
                    case 3:
                        handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setAppxVersionInWorker.onExtraCallback, handlerLocal);
                        i |= 8;
                        i5 = 7;
                    case 4:
                        handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setAppxVersionInWorker.onExtraCallback, handlerLocal2);
                        i |= 16;
                    case 5:
                        iAuthTabCallback = (ImageAttributeLocal.IAuthTabCallback) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrOnWarmupCompleted[5].getValue(), iAuthTabCallback);
                        i |= 32;
                    case 6:
                        strokeAttributeLocal = (StrokeAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, StrokeAttributeLocal$$serializer.INSTANCE, strokeAttributeLocal);
                        i |= 64;
                    case 7:
                        dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, i5);
                        i |= 128;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
        } else {
            imageSourceLocal = (ImageSourceLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, removeNextStartHandler.onWarmupCompleted, (Object) null);
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), (Object) null);
            paddingLocal = (PaddingLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, PaddingLocal$$serializer.INSTANCE, (Object) null);
            setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
            handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setappxversioninworker, (Object) null);
            handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setappxversioninworker, (Object) null);
            iAuthTabCallback = (ImageAttributeLocal.IAuthTabCallback) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrOnWarmupCompleted[5].getValue(), (Object) null);
            strokeAttributeLocal = (StrokeAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, StrokeAttributeLocal$$serializer.INSTANCE, (Object) null);
            dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 7);
            i = 255;
        }
        int i11 = i;
        PaddingLocal paddingLocal2 = paddingLocal;
        List list2 = list;
        ImageAttributeLocal.IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
        ImageSourceLocal imageSourceLocal2 = imageSourceLocal;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ImageAttributeLocal.Circle(i11, imageSourceLocal2, list2, paddingLocal2, handlerLocal, handlerLocal2, iAuthTabCallback2, strokeAttributeLocal, dIAuthTabCallback, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m504deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            throw null;
        }
        ImageAttributeLocal.Circle circleDeserialize = deserialize(decoder);
        int i3 = IAuthTabCallback + 81;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return circleDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ImageAttributeLocal.Circle circle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(circle, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ImageAttributeLocal.Circle.onExtraCallbackWithResult(circle, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(circle, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        ImageAttributeLocal.Circle.onExtraCallbackWithResult(circle, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = IAuthTabCallback + 55;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ImageAttributeLocal.Circle) obj);
        int i4 = IAuthTabCallback + 101;
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
        int i2 = onExtraCallback + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 11;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
