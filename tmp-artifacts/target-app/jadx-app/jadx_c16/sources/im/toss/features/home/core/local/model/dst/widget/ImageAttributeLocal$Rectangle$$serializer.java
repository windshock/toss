package im.toss.features.home.core.local.model.dst.widget;

import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal$$serializer;
import im.toss.features.home.core.local.model.dst.property.SizeLocal;
import im.toss.features.home.core.local.model.dst.property.SizeLocal$;
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
public final /* synthetic */ class ImageAttributeLocal$Rectangle$$serializer implements aeu2<ImageAttributeLocal.Rectangle> {
    private static int IAuthTabCallback = 1;
    public static final ImageAttributeLocal$Rectangle$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 65;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 95;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        ImageAttributeLocal$Rectangle$$serializer imageAttributeLocal$Rectangle$$serializer = new ImageAttributeLocal$Rectangle$$serializer();
        INSTANCE = imageAttributeLocal$Rectangle$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.ImageAttributeLocal.Rectangle", imageAttributeLocal$Rectangle$$serializer, 10);
        setanimationsloop.onWarmupCompleted("imageSource", false);
        setanimationsloop.onWarmupCompleted("backgroundColors", false);
        setanimationsloop.onWarmupCompleted("padding", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("longPressHandler", false);
        setanimationsloop.onWarmupCompleted("scaleType", false);
        setanimationsloop.onWarmupCompleted("stroke", false);
        setanimationsloop.onWarmupCompleted("size", false);
        setanimationsloop.onWarmupCompleted("corners", false);
        setanimationsloop.onWarmupCompleted("cornerRadius", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 15;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ImageAttributeLocal$Rectangle$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnWarmupCompleted = ImageAttributeLocal.Rectangle.onWarmupCompleted();
        setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
        KSerializer<?>[] kSerializerArr = {removeNextStartHandler.onWarmupCompleted, lazyArrOnWarmupCompleted[1].getValue(), sp.IAuthTabCallback(PaddingLocal$$serializer.INSTANCE), sp.IAuthTabCallback(setappxversioninworker), sp.IAuthTabCallback(setappxversioninworker), lazyArrOnWarmupCompleted[5].getValue(), sp.IAuthTabCallback(StrokeAttributeLocal$$serializer.INSTANCE), SizeLocal$.serializer.INSTANCE, lazyArrOnWarmupCompleted[8].getValue(), setVideoListener.onWarmupCompleted};
        int i4 = onNavigationEvent + 125;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ImageAttributeLocal.Rectangle deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        double dIAuthTabCallback;
        PaddingLocal paddingLocal;
        ImageSourceLocal imageSourceLocal;
        HandlerLocal handlerLocal;
        HandlerLocal handlerLocal2;
        StrokeAttributeLocal strokeAttributeLocal;
        SizeLocal sizeLocal;
        ImageAttributeLocal.IAuthTabCallback iAuthTabCallback;
        int i;
        List list2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = ImageAttributeLocal.Rectangle.onWarmupCompleted();
        int i3 = 9;
        int i4 = 7;
        int i5 = 8;
        boolean z = true;
        StrokeAttributeLocal strokeAttributeLocal2 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z2 = true;
            PaddingLocal paddingLocal2 = null;
            SizeLocal sizeLocal2 = null;
            ImageAttributeLocal.IAuthTabCallback iAuthTabCallback2 = null;
            List list3 = null;
            ImageSourceLocal imageSourceLocal2 = null;
            HandlerLocal handlerLocal3 = null;
            HandlerLocal handlerLocal4 = null;
            dIAuthTabCallback = 0.0d;
            int i6 = 0;
            list = null;
            while ((!z2) != z) {
                int i7 = onNavigationEvent + 85;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        i5 = 8;
                        z = true;
                        z2 = false;
                    case 0:
                        i6 |= 1;
                        imageSourceLocal2 = (ImageSourceLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, removeNextStartHandler.onWarmupCompleted, imageSourceLocal2);
                        handlerLocal4 = handlerLocal4;
                        handlerLocal3 = handlerLocal3;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        z = true;
                    case 1:
                        list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), list);
                        i6 |= 2;
                        i3 = 9;
                        i5 = 8;
                        z = true;
                    case 2:
                        paddingLocal2 = (PaddingLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, PaddingLocal$$serializer.INSTANCE, paddingLocal2);
                        i6 |= 4;
                        i3 = 9;
                        i5 = 8;
                        z = true;
                    case 3:
                        i6 |= 8;
                        handlerLocal4 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setAppxVersionInWorker.onExtraCallback, handlerLocal4);
                        handlerLocal3 = handlerLocal3;
                        i3 = 9;
                        i5 = 8;
                        z = true;
                    case 4:
                        i6 |= 16;
                        handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setAppxVersionInWorker.onExtraCallback, handlerLocal3);
                        i3 = 9;
                        z = true;
                    case 5:
                        iAuthTabCallback2 = (ImageAttributeLocal.IAuthTabCallback) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrOnWarmupCompleted[5].getValue(), iAuthTabCallback2);
                        i6 |= 32;
                        z = true;
                    case 6:
                        strokeAttributeLocal2 = (StrokeAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, StrokeAttributeLocal$$serializer.INSTANCE, strokeAttributeLocal2);
                        i6 |= 64;
                        z = true;
                    case 7:
                        sizeLocal2 = (SizeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i4, SizeLocal$.serializer.INSTANCE, sizeLocal2);
                        i6 |= 128;
                        z = true;
                    case 8:
                        list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i5, (jp) lazyArrOnWarmupCompleted[i5].getValue(), list3);
                        i6 |= 256;
                        z = true;
                    case 9:
                        dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, i3);
                        i6 |= 512;
                        int i9 = IAuthTabCallback + 89;
                        onNavigationEvent = i9 % 128;
                        int i10 = i9 % 2;
                        z = true;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            paddingLocal = paddingLocal2;
            handlerLocal2 = handlerLocal4;
            sizeLocal = sizeLocal2;
            iAuthTabCallback = iAuthTabCallback2;
            i = i6;
            list2 = list3;
            imageSourceLocal = imageSourceLocal2;
            handlerLocal = handlerLocal3;
            strokeAttributeLocal = strokeAttributeLocal2;
        } else {
            ImageSourceLocal imageSourceLocal3 = (ImageSourceLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, removeNextStartHandler.onWarmupCompleted, (Object) null);
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), (Object) null);
            PaddingLocal paddingLocal3 = (PaddingLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, PaddingLocal$$serializer.INSTANCE, (Object) null);
            setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
            HandlerLocal handlerLocal5 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setappxversioninworker, (Object) null);
            HandlerLocal handlerLocal6 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setappxversioninworker, (Object) null);
            ImageAttributeLocal.IAuthTabCallback iAuthTabCallback3 = (ImageAttributeLocal.IAuthTabCallback) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrOnWarmupCompleted[5].getValue(), (Object) null);
            StrokeAttributeLocal strokeAttributeLocal3 = (StrokeAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, StrokeAttributeLocal$$serializer.INSTANCE, (Object) null);
            SizeLocal sizeLocal3 = (SizeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 7, SizeLocal$.serializer.INSTANCE, (Object) null);
            List list4 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 8, (jp) lazyArrOnWarmupCompleted[8].getValue(), (Object) null);
            dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 9);
            paddingLocal = paddingLocal3;
            imageSourceLocal = imageSourceLocal3;
            handlerLocal = handlerLocal6;
            handlerLocal2 = handlerLocal5;
            strokeAttributeLocal = strokeAttributeLocal3;
            sizeLocal = sizeLocal3;
            iAuthTabCallback = iAuthTabCallback3;
            i = 1023;
            list2 = list4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ImageAttributeLocal.Rectangle(i, imageSourceLocal, list, paddingLocal, handlerLocal2, handlerLocal, iAuthTabCallback, strokeAttributeLocal, sizeLocal, list2, dIAuthTabCallback, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m505deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ImageAttributeLocal.Rectangle rectangleDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 23;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return rectangleDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ImageAttributeLocal.Rectangle rectangle) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(rectangle, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ImageAttributeLocal.Rectangle.onNavigationEvent(rectangle, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(rectangle, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        ImageAttributeLocal.Rectangle.onNavigationEvent(rectangle, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ImageAttributeLocal.Rectangle) obj);
        if (i3 != 0) {
            int i4 = 31 / 0;
        }
        int i5 = onNavigationEvent + 61;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 71;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
