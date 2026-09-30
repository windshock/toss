package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.TossStreamSingleFeedLocal;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.widget.TextContentLocal;
import im.toss.features.home.core.local.model.dst.widget.TextContentLocal$;
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
import o.oty1;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossStreamSingleFeedLocal$$serializer implements aeu2<TossStreamSingleFeedLocal> {
    private static int IAuthTabCallback = 1;
    public static final TossStreamSingleFeedLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 51;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        TossStreamSingleFeedLocal$$serializer tossStreamSingleFeedLocal$$serializer = new TossStreamSingleFeedLocal$$serializer();
        INSTANCE = tossStreamSingleFeedLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.TossStreamSingleFeedLocal", tossStreamSingleFeedLocal$$serializer, 6);
        setanimationsloop.onWarmupCompleted("contentId", false);
        setanimationsloop.onWarmupCompleted("thumbnail", false);
        setanimationsloop.onWarmupCompleted("row1", false);
        setanimationsloop.onWarmupCompleted("row2", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("horizontalPadding", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private TossStreamSingleFeedLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {oty1.onExtraCallback, TossStreamSingleFeedLocal$Thumbnail$$serializer.INSTANCE, TextContentLocal$.serializer.INSTANCE, TossStreamSingleFeedLocal$Row2$$serializer.INSTANCE, setAppxVersionInWorker.onExtraCallback, dj3.onWarmupCompleted};
        int i4 = onWarmupCompleted + 93;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final TossStreamSingleFeedLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        float fOnWarmupCompleted;
        TossStreamSingleFeedLocal.Row2 row2;
        HandlerLocal handlerLocal;
        long jIAuthTabCallbackDefault;
        TextContentLocal textContentLocal;
        TossStreamSingleFeedLocal.Thumbnail thumbnail;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onExtraCallback + 31;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
            TossStreamSingleFeedLocal.Thumbnail thumbnail2 = (TossStreamSingleFeedLocal.Thumbnail) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, TossStreamSingleFeedLocal$Thumbnail$$serializer.INSTANCE, (Object) null);
            TextContentLocal textContentLocal2 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, TextContentLocal$.serializer.INSTANCE, (Object) null);
            TossStreamSingleFeedLocal.Row2 row22 = (TossStreamSingleFeedLocal.Row2) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, TossStreamSingleFeedLocal$Row2$$serializer.INSTANCE, (Object) null);
            HandlerLocal handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, setAppxVersionInWorker.onExtraCallback, (Object) null);
            textContentLocal = textContentLocal2;
            thumbnail = thumbnail2;
            fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 5);
            row2 = row22;
            handlerLocal = handlerLocal2;
            i = 63;
        } else {
            float fOnWarmupCompleted2 = 0.0f;
            boolean z = true;
            TextContentLocal textContentLocal3 = null;
            TossStreamSingleFeedLocal.Thumbnail thumbnail3 = null;
            long jIAuthTabCallbackDefault2 = 0;
            TossStreamSingleFeedLocal.Row2 row23 = null;
            HandlerLocal handlerLocal3 = null;
            i = 0;
            while (z) {
                int i5 = onExtraCallback + 51;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                    case 0:
                        jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                        i |= 1;
                    case 1:
                        thumbnail3 = (TossStreamSingleFeedLocal.Thumbnail) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, TossStreamSingleFeedLocal$Thumbnail$$serializer.INSTANCE, thumbnail3);
                        i |= 2;
                    case 2:
                        textContentLocal3 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, TextContentLocal$.serializer.INSTANCE, textContentLocal3);
                        i |= 4;
                    case 3:
                        row23 = (TossStreamSingleFeedLocal.Row2) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, TossStreamSingleFeedLocal$Row2$$serializer.INSTANCE, row23);
                        i |= 8;
                    case 4:
                        handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, setAppxVersionInWorker.onExtraCallback, handlerLocal3);
                        i |= 16;
                    case 5:
                        fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 5);
                        i |= 32;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            fOnWarmupCompleted = fOnWarmupCompleted2;
            long j = jIAuthTabCallbackDefault2;
            row2 = row23;
            handlerLocal = handlerLocal3;
            jIAuthTabCallbackDefault = j;
            TossStreamSingleFeedLocal.Thumbnail thumbnail4 = thumbnail3;
            textContentLocal = textContentLocal3;
            thumbnail = thumbnail4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TossStreamSingleFeedLocal(i, jIAuthTabCallbackDefault, thumbnail, textContentLocal, row2, handlerLocal, fOnWarmupCompleted, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m417deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TossStreamSingleFeedLocal tossStreamSingleFeedLocalDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 45;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return tossStreamSingleFeedLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TossStreamSingleFeedLocal tossStreamSingleFeedLocal) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tossStreamSingleFeedLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TossStreamSingleFeedLocal.onExtraCallbackWithResult(tossStreamSingleFeedLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 77;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TossStreamSingleFeedLocal) obj);
        int i4 = onWarmupCompleted + 19;
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
        int i2 = onExtraCallback + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 99;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
