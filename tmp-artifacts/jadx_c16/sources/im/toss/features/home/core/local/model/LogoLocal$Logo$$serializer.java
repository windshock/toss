package im.toss.features.home.core.local.model;

import im.toss.features.home.core.local.model.LogoLocal;
import im.toss.features.home.core.local.model.dst.eventlog.ImpressionEventLogLocal;
import im.toss.features.home.core.local.model.dst.eventlog.ImpressionEventLogLocal$;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.widget.ImageSourceLocal;
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
public final /* synthetic */ class LogoLocal$Logo$$serializer implements aeu2<LogoLocal.Logo> {
    private static int IAuthTabCallback = 1;
    public static final LogoLocal$Logo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 123;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        LogoLocal$Logo$$serializer logoLocal$Logo$$serializer = new LogoLocal$Logo$$serializer();
        INSTANCE = logoLocal$Logo$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.LogoLocal.Logo", logoLocal$Logo$$serializer, 6);
        setanimationsloop.onWarmupCompleted("image", false);
        setanimationsloop.onWarmupCompleted("width", false);
        setanimationsloop.onWarmupCompleted("height", false);
        setanimationsloop.onWarmupCompleted("titleAlt", false);
        setanimationsloop.onWarmupCompleted("handler", true);
        setanimationsloop.onWarmupCompleted("impressionEventLog", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 43;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private LogoLocal$Logo$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(removeNextStartHandler.onWarmupCompleted);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(ImpressionEventLogLocal$.serializer.INSTANCE);
        setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, setvideolistener, setvideolistener, getWriggleLayout.onNavigationEvent, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3};
        int i4 = onNavigationEvent + 33;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final LogoLocal.Logo deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        ImageSourceLocal imageSourceLocal;
        double dIAuthTabCallback;
        double dIAuthTabCallback2;
        String strAsInterface;
        HandlerLocal handlerLocal;
        ImpressionEventLogLocal impressionEventLogLocal;
        int i;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            dIAuthTabCallback2 = 0.0d;
            boolean z = true;
            dIAuthTabCallback = 0.0d;
            impressionEventLogLocal = null;
            handlerLocal = null;
            imageSourceLocal = null;
            strAsInterface = null;
            i = 0;
            while (!(!z)) {
                int i4 = onExtraCallback + 93;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        imageSourceLocal = (ImageSourceLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, removeNextStartHandler.onWarmupCompleted, imageSourceLocal);
                        i |= 1;
                        continue;
                    case 1:
                        dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 1);
                        i |= 2;
                        i2 = onNavigationEvent + 9;
                        onExtraCallback = i2 % 128;
                        break;
                    case 2:
                        dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 2);
                        i |= 4;
                        i2 = onNavigationEvent + 115;
                        onExtraCallback = i2 % 128;
                        break;
                    case 3:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i |= 8;
                        continue;
                    case 4:
                        handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setAppxVersionInWorker.onExtraCallback, handlerLocal);
                        i |= 16;
                        continue;
                    case 5:
                        impressionEventLogLocal = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ImpressionEventLogLocal$.serializer.INSTANCE, impressionEventLogLocal);
                        i |= 32;
                        continue;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
                int i6 = i2 % 2;
            }
        } else {
            int i7 = onNavigationEvent + 75;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            imageSourceLocal = (ImageSourceLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, removeNextStartHandler.onWarmupCompleted, (Object) null);
            dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 1);
            dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 2);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setAppxVersionInWorker.onExtraCallback, (Object) null);
            impressionEventLogLocal = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ImpressionEventLogLocal$.serializer.INSTANCE, (Object) null);
            i = 63;
        }
        ImageSourceLocal imageSourceLocal2 = imageSourceLocal;
        int i9 = i;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        LogoLocal.Logo logo = new LogoLocal.Logo(i9, imageSourceLocal2, dIAuthTabCallback, dIAuthTabCallback2, strAsInterface, handlerLocal, impressionEventLogLocal, (okycx) null);
        int i10 = onNavigationEvent + 81;
        onExtraCallback = i10 % 128;
        if (i10 % 2 != 0) {
            return logo;
        }
        throw null;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m253deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        LogoLocal.Logo logoDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 93;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return logoDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull LogoLocal.Logo logo) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(logo, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            LogoLocal.Logo.onWarmupCompleted(logo, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(logo, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        LogoLocal.Logo.onWarmupCompleted(logo, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onExtraCallback + 19;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 72 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (LogoLocal.Logo) obj);
        int i4 = onNavigationEvent + 27;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onNavigationEvent + 17;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
