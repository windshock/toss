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
public final /* synthetic */ class ConsumptionRecommendationBannerLocal$Article$$serializer implements aeu2<ConsumptionRecommendationBannerLocal.Article> {
    public static final ConsumptionRecommendationBannerLocal$Article$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 97;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        ConsumptionRecommendationBannerLocal$Article$$serializer consumptionRecommendationBannerLocal$Article$$serializer = new ConsumptionRecommendationBannerLocal$Article$$serializer();
        INSTANCE = consumptionRecommendationBannerLocal$Article$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.ConsumptionRecommendationBannerLocal.Article", consumptionRecommendationBannerLocal$Article$$serializer, 5);
        setanimationsloop.onWarmupCompleted("id", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("impressionEventLog", false);
        setanimationsloop.onWarmupCompleted("row1", false);
        setanimationsloop.onWarmupCompleted("row2", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 121;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private ConsumptionRecommendationBannerLocal$Article$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(ImpressionEventLogLocal$.serializer.INSTANCE);
        TextContentLocal$.serializer serializerVar = TextContentLocal$.serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent, setAppxVersionInWorker.onExtraCallback, kSerializerIAuthTabCallback, serializerVar, serializerVar};
        int i4 = onWarmupCompleted + 113;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ConsumptionRecommendationBannerLocal.Article deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        TextContentLocal textContentLocal;
        TextContentLocal textContentLocal2;
        ImpressionEventLogLocal impressionEventLogLocal;
        String str;
        HandlerLocal handlerLocal;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 27;
        onWarmupCompleted = i3 % 128;
        TextContentLocal textContentLocal3 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            textContentLocal3.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        boolean z = false;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            HandlerLocal handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, setAppxVersionInWorker.onExtraCallback, (Object) null);
            ImpressionEventLogLocal impressionEventLogLocal2 = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ImpressionEventLogLocal$.serializer.INSTANCE, (Object) null);
            TextContentLocal$.serializer serializerVar = TextContentLocal$.serializer.INSTANCE;
            TextContentLocal textContentLocal4 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, serializerVar, (Object) null);
            TextContentLocal textContentLocal5 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, serializerVar, (Object) null);
            int i4 = onExtraCallback + 107;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            i = 31;
            str = strAsInterface;
            textContentLocal2 = textContentLocal5;
            textContentLocal = textContentLocal4;
            handlerLocal = handlerLocal2;
            impressionEventLogLocal = impressionEventLogLocal2;
        } else {
            TextContentLocal textContentLocal6 = null;
            ImpressionEventLogLocal impressionEventLogLocal3 = null;
            String strAsInterface2 = null;
            HandlerLocal handlerLocal3 = null;
            int i6 = 0;
            boolean z2 = true;
            while (z2) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i7 = onWarmupCompleted;
                    int i8 = i7 + 125;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    if (iOnNavigationEvent != 0) {
                        if (iOnNavigationEvent == 1) {
                            handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, setAppxVersionInWorker.onExtraCallback, handlerLocal3);
                            i6 |= 2;
                        } else if (iOnNavigationEvent == 2) {
                            impressionEventLogLocal3 = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ImpressionEventLogLocal$.serializer.INSTANCE, impressionEventLogLocal3);
                            i6 |= 4;
                        } else if (iOnNavigationEvent != 3) {
                            int i10 = i7 + 83;
                            onExtraCallback = i10 % 128;
                            int i11 = i10 % 2;
                            if (iOnNavigationEvent != 4) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            textContentLocal6 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, TextContentLocal$.serializer.INSTANCE, textContentLocal6);
                            i6 |= 16;
                        } else {
                            textContentLocal3 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, TextContentLocal$.serializer.INSTANCE, textContentLocal3);
                            i6 |= 8;
                        }
                        z = false;
                    } else {
                        z = false;
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i6 |= 1;
                        int i12 = onWarmupCompleted + 9;
                        onExtraCallback = i12 % 128;
                        int i13 = i12 % 2;
                    }
                } else {
                    int i14 = onWarmupCompleted + 45;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                    z2 = z;
                }
            }
            i = i6;
            textContentLocal = textContentLocal3;
            textContentLocal2 = textContentLocal6;
            impressionEventLogLocal = impressionEventLogLocal3;
            str = strAsInterface2;
            handlerLocal = handlerLocal3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ConsumptionRecommendationBannerLocal.Article(i, str, handlerLocal, impressionEventLogLocal, textContentLocal, textContentLocal2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m477deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            throw null;
        }
        ConsumptionRecommendationBannerLocal.Article articleDeserialize = deserialize(decoder);
        int i3 = onExtraCallback + 21;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return articleDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ConsumptionRecommendationBannerLocal.Article article) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(article, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ConsumptionRecommendationBannerLocal.Article.onWarmupCompleted(article, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(article, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        ConsumptionRecommendationBannerLocal.Article.onWarmupCompleted(article, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ConsumptionRecommendationBannerLocal.Article) obj);
        if (i3 == 0) {
            int i4 = 4 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onWarmupCompleted + 67;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
