package im.toss.features.home.core.local.model.dst.widget;

import im.toss.features.home.core.local.model.dst.eventlog.ImpressionEventLogLocal;
import im.toss.features.home.core.local.model.dst.eventlog.ImpressionEventLogLocal$;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.widget.ConsumptionRecommendationBannerLocal;
import im.toss.features.home.core.local.model.dst.widget.TextContentLocal$;
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
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionRecommendationBannerLocal$SmallCard$$serializer implements aeu2<ConsumptionRecommendationBannerLocal.SmallCard> {
    public static final ConsumptionRecommendationBannerLocal$SmallCard$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 71;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 117;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        ConsumptionRecommendationBannerLocal$SmallCard$$serializer consumptionRecommendationBannerLocal$SmallCard$$serializer = new ConsumptionRecommendationBannerLocal$SmallCard$$serializer();
        INSTANCE = consumptionRecommendationBannerLocal$SmallCard$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.ConsumptionRecommendationBannerLocal.SmallCard", consumptionRecommendationBannerLocal$SmallCard$$serializer, 7);
        setanimationsloop.onWarmupCompleted("id", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("impressionEventLog", false);
        setanimationsloop.onWarmupCompleted("row1", false);
        setanimationsloop.onWarmupCompleted("row2", false);
        setanimationsloop.onWarmupCompleted("row3", false);
        setanimationsloop.onWarmupCompleted("imageSource", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 97;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private ConsumptionRecommendationBannerLocal$SmallCard$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(ImpressionEventLogLocal$.serializer.INSTANCE);
        TextContentLocal$.serializer serializerVar = TextContentLocal$.serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent, setAppxVersionInWorker.onExtraCallback, kSerializerIAuthTabCallback, serializerVar, serializerVar, serializerVar, CardImageSourceLocal$$serializer.INSTANCE};
        int i4 = onExtraCallback + 55;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ConsumptionRecommendationBannerLocal.SmallCard deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        CardImageSourceLocal cardImageSourceLocal;
        HandlerLocal handlerLocal;
        TextContentLocal textContentLocal;
        int i;
        TextContentLocal textContentLocal2;
        String str;
        TextContentLocal textContentLocal3;
        ImpressionEventLogLocal impressionEventLogLocal;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i3 = 6;
        int i4 = 3;
        TextContentLocal textContentLocal4 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onExtraCallbackWithResult + 5;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            HandlerLocal handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, setAppxVersionInWorker.onExtraCallback, (Object) null);
            ImpressionEventLogLocal impressionEventLogLocal2 = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ImpressionEventLogLocal$.serializer.INSTANCE, (Object) null);
            TextContentLocal$.serializer serializerVar = TextContentLocal$.serializer.INSTANCE;
            TextContentLocal textContentLocal5 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, serializerVar, (Object) null);
            TextContentLocal textContentLocal6 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, serializerVar, (Object) null);
            TextContentLocal textContentLocal7 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, serializerVar, (Object) null);
            impressionEventLogLocal = impressionEventLogLocal2;
            str = strAsInterface;
            cardImageSourceLocal = (CardImageSourceLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 6, CardImageSourceLocal$$serializer.INSTANCE, (Object) null);
            textContentLocal3 = textContentLocal5;
            textContentLocal = textContentLocal6;
            textContentLocal2 = textContentLocal7;
            handlerLocal = handlerLocal2;
            i = 127;
        } else {
            int i7 = 0;
            boolean z = true;
            TextContentLocal textContentLocal8 = null;
            CardImageSourceLocal cardImageSourceLocal2 = null;
            TextContentLocal textContentLocal9 = null;
            ImpressionEventLogLocal impressionEventLogLocal3 = null;
            HandlerLocal handlerLocal3 = null;
            String strAsInterface2 = null;
            while (z) {
                int i8 = onExtraCallbackWithResult + 37;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i7 |= 1;
                        int i10 = onExtraCallbackWithResult + 73;
                        onExtraCallback = i10 % 128;
                        int i11 = i10 % 2;
                        i3 = 6;
                        i4 = 3;
                        continue;
                    case 1:
                        handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, setAppxVersionInWorker.onExtraCallback, handlerLocal3);
                        i7 |= 2;
                        continue;
                    case 2:
                        impressionEventLogLocal3 = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ImpressionEventLogLocal$.serializer.INSTANCE, impressionEventLogLocal3);
                        i7 |= 4;
                        break;
                    case 3:
                        textContentLocal9 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i4, TextContentLocal$.serializer.INSTANCE, textContentLocal9);
                        i7 |= 8;
                        break;
                    case 4:
                        textContentLocal4 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, TextContentLocal$.serializer.INSTANCE, textContentLocal4);
                        i7 |= 16;
                        break;
                    case 5:
                        textContentLocal8 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, TextContentLocal$.serializer.INSTANCE, textContentLocal8);
                        i7 |= 32;
                        break;
                    case 6:
                        cardImageSourceLocal2 = (CardImageSourceLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i3, CardImageSourceLocal$$serializer.INSTANCE, cardImageSourceLocal2);
                        i7 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            cardImageSourceLocal = cardImageSourceLocal2;
            handlerLocal = handlerLocal3;
            textContentLocal = textContentLocal4;
            i = i7;
            String str2 = strAsInterface2;
            textContentLocal2 = textContentLocal8;
            str = str2;
            ImpressionEventLogLocal impressionEventLogLocal4 = impressionEventLogLocal3;
            textContentLocal3 = textContentLocal9;
            impressionEventLogLocal = impressionEventLogLocal4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ConsumptionRecommendationBannerLocal.SmallCard(i, str, handlerLocal, impressionEventLogLocal, textContentLocal3, textContentLocal, textContentLocal2, cardImageSourceLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m488deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ConsumptionRecommendationBannerLocal.SmallCard smallCard) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(smallCard, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ConsumptionRecommendationBannerLocal.SmallCard.onWarmupCompleted(smallCard, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(smallCard, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        ConsumptionRecommendationBannerLocal.SmallCard.onWarmupCompleted(smallCard, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ConsumptionRecommendationBannerLocal.SmallCard) obj);
        int i4 = onExtraCallbackWithResult + 49;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 11 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = onExtraCallback + 57;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
