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
public final /* synthetic */ class ConsumptionRecommendationBannerLocal$BigCard$$serializer implements aeu2<ConsumptionRecommendationBannerLocal.BigCard> {
    private static int IAuthTabCallback = 0;
    public static final ConsumptionRecommendationBannerLocal$BigCard$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 7;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return serialDescriptor;
        }
        obj.hashCode();
        throw null;
    }

    static {
        ConsumptionRecommendationBannerLocal$BigCard$$serializer consumptionRecommendationBannerLocal$BigCard$$serializer = new ConsumptionRecommendationBannerLocal$BigCard$$serializer();
        INSTANCE = consumptionRecommendationBannerLocal$BigCard$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.ConsumptionRecommendationBannerLocal.BigCard", consumptionRecommendationBannerLocal$BigCard$$serializer, 6);
        setanimationsloop.onWarmupCompleted("id", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("impressionEventLog", false);
        setanimationsloop.onWarmupCompleted("row1", false);
        setanimationsloop.onWarmupCompleted("row2", false);
        setanimationsloop.onWarmupCompleted("imageSource", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 113;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private ConsumptionRecommendationBannerLocal$BigCard$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(ImpressionEventLogLocal$.serializer.INSTANCE);
            TextContentLocal$.serializer serializerVar = TextContentLocal$.serializer.INSTANCE;
            return new KSerializer[]{getWriggleLayout.onNavigationEvent, setAppxVersionInWorker.onExtraCallback, kSerializerIAuthTabCallback, serializerVar, serializerVar, CardImageSourceLocal$$serializer.INSTANCE};
        }
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(ImpressionEventLogLocal$.serializer.INSTANCE);
        KSerializer<?>[] kSerializerArr = new KSerializer[2];
        kSerializerArr[0] = getWriggleLayout.onNavigationEvent;
        kSerializerArr[0] = setAppxVersionInWorker.onExtraCallback;
        kSerializerArr[4] = kSerializerIAuthTabCallback2;
        TextContentLocal$.serializer serializerVar2 = TextContentLocal$.serializer.INSTANCE;
        kSerializerArr[3] = serializerVar2;
        kSerializerArr[5] = serializerVar2;
        kSerializerArr[4] = CardImageSourceLocal$$serializer.INSTANCE;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ConsumptionRecommendationBannerLocal.BigCard deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        CardImageSourceLocal cardImageSourceLocal;
        TextContentLocal textContentLocal;
        String str;
        ImpressionEventLogLocal impressionEventLogLocal;
        HandlerLocal handlerLocal;
        TextContentLocal textContentLocal2;
        int i;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 5;
        TextContentLocal textContentLocal3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            HandlerLocal handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, setAppxVersionInWorker.onExtraCallback, (Object) null);
            ImpressionEventLogLocal impressionEventLogLocal2 = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ImpressionEventLogLocal$.serializer.INSTANCE, (Object) null);
            TextContentLocal$.serializer serializerVar = TextContentLocal$.serializer.INSTANCE;
            TextContentLocal textContentLocal4 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, serializerVar, (Object) null);
            TextContentLocal textContentLocal5 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, serializerVar, (Object) null);
            impressionEventLogLocal = impressionEventLogLocal2;
            str = strAsInterface;
            cardImageSourceLocal = (CardImageSourceLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, CardImageSourceLocal$$serializer.INSTANCE, (Object) null);
            textContentLocal2 = textContentLocal4;
            textContentLocal = textContentLocal5;
            handlerLocal = handlerLocal2;
            i = 63;
        } else {
            int i5 = 0;
            boolean z = true;
            TextContentLocal textContentLocal6 = null;
            ImpressionEventLogLocal impressionEventLogLocal3 = null;
            String strAsInterface2 = null;
            HandlerLocal handlerLocal3 = null;
            CardImageSourceLocal cardImageSourceLocal2 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                    case 0:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i5 |= 1;
                        i2 = onWarmupCompleted + 17;
                        onNavigationEvent = i2 % 128;
                        int i6 = i2 % 2;
                        i4 = 5;
                    case 1:
                        handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, setAppxVersionInWorker.onExtraCallback, handlerLocal3);
                        i5 |= 2;
                        i4 = 5;
                    case 2:
                        impressionEventLogLocal3 = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ImpressionEventLogLocal$.serializer.INSTANCE, impressionEventLogLocal3);
                        i5 |= 4;
                        i4 = 5;
                    case 3:
                        textContentLocal3 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, TextContentLocal$.serializer.INSTANCE, textContentLocal3);
                        i5 |= 8;
                        i2 = onWarmupCompleted + 23;
                        onNavigationEvent = i2 % 128;
                        int i62 = i2 % 2;
                        i4 = 5;
                    case 4:
                        textContentLocal6 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, TextContentLocal$.serializer.INSTANCE, textContentLocal6);
                        i5 |= 16;
                    case 5:
                        cardImageSourceLocal2 = (CardImageSourceLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i4, CardImageSourceLocal$$serializer.INSTANCE, cardImageSourceLocal2);
                        i5 |= 32;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            cardImageSourceLocal = cardImageSourceLocal2;
            textContentLocal = textContentLocal6;
            str = strAsInterface2;
            impressionEventLogLocal = impressionEventLogLocal3;
            handlerLocal = handlerLocal3;
            textContentLocal2 = textContentLocal3;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ConsumptionRecommendationBannerLocal.BigCard(i, str, handlerLocal, impressionEventLogLocal, textContentLocal2, textContentLocal, cardImageSourceLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m478deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ConsumptionRecommendationBannerLocal.BigCard bigCardDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
        int i5 = onWarmupCompleted + 45;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return bigCardDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ConsumptionRecommendationBannerLocal.BigCard bigCard) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(bigCard, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ConsumptionRecommendationBannerLocal.BigCard.onExtraCallbackWithResult(bigCard, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 68 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(bigCard, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            ConsumptionRecommendationBannerLocal.BigCard.onExtraCallbackWithResult(bigCard, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = onNavigationEvent + 31;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ConsumptionRecommendationBannerLocal.BigCard) obj);
        int i4 = onNavigationEvent + 105;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 107;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
