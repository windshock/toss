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
public final /* synthetic */ class ConsumptionRecommendationBannerLocal$HorizontalBarGraph$$serializer implements aeu2<ConsumptionRecommendationBannerLocal.HorizontalBarGraph> {
    private static int IAuthTabCallback = 0;
    public static final ConsumptionRecommendationBannerLocal$HorizontalBarGraph$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 49;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 33;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        ConsumptionRecommendationBannerLocal$HorizontalBarGraph$$serializer consumptionRecommendationBannerLocal$HorizontalBarGraph$$serializer = new ConsumptionRecommendationBannerLocal$HorizontalBarGraph$$serializer();
        INSTANCE = consumptionRecommendationBannerLocal$HorizontalBarGraph$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.ConsumptionRecommendationBannerLocal.HorizontalBarGraph", consumptionRecommendationBannerLocal$HorizontalBarGraph$$serializer, 8);
        setanimationsloop.onWarmupCompleted("id", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("impressionEventLog", false);
        setanimationsloop.onWarmupCompleted("row1", false);
        setanimationsloop.onWarmupCompleted("row2", false);
        setanimationsloop.onWarmupCompleted("barGraph1", false);
        setanimationsloop.onWarmupCompleted("barGraph2", false);
        setanimationsloop.onWarmupCompleted("barGraph3", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 37;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private ConsumptionRecommendationBannerLocal$HorizontalBarGraph$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(ImpressionEventLogLocal$.serializer.INSTANCE);
        TextContentLocal$.serializer serializerVar = TextContentLocal$.serializer.INSTANCE;
        ConsumptionRecommendationBannerLocal$HorizontalBarGraph$BarGraph$$serializer consumptionRecommendationBannerLocal$HorizontalBarGraph$BarGraph$$serializer = ConsumptionRecommendationBannerLocal$HorizontalBarGraph$BarGraph$$serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent, setAppxVersionInWorker.onExtraCallback, kSerializerIAuthTabCallback, serializerVar, serializerVar, consumptionRecommendationBannerLocal$HorizontalBarGraph$BarGraph$$serializer, consumptionRecommendationBannerLocal$HorizontalBarGraph$BarGraph$$serializer, consumptionRecommendationBannerLocal$HorizontalBarGraph$BarGraph$$serializer};
        int i4 = onExtraCallback + 33;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0084 A[PHI: r0 r2
      0x0084: PHI (r0v5 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x003a, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0084: PHI (r2v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003a, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c A[PHI: r0 r2
      0x003c: PHI (r0v2 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x003a, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x003c: PHI (r2v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003a, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ConsumptionRecommendationBannerLocal.HorizontalBarGraph deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        TextContentLocal textContentLocal;
        TextContentLocal textContentLocal2;
        ConsumptionRecommendationBannerLocal.HorizontalBarGraph.BarGraph barGraph;
        ImpressionEventLogLocal impressionEventLogLocal;
        ConsumptionRecommendationBannerLocal.HorizontalBarGraph.BarGraph barGraph2;
        String str;
        int i;
        ConsumptionRecommendationBannerLocal.HorizontalBarGraph.BarGraph barGraph3;
        HandlerLocal handlerLocal;
        char c;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 17;
        onExtraCallback = i3 % 128;
        int i4 = 7;
        int i5 = 6;
        int i6 = 5;
        ImpressionEventLogLocal impressionEventLogLocal2 = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            int i7 = 12 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                HandlerLocal handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, setAppxVersionInWorker.onExtraCallback, (Object) null);
                ImpressionEventLogLocal impressionEventLogLocal3 = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ImpressionEventLogLocal$.serializer.INSTANCE, (Object) null);
                TextContentLocal$.serializer serializerVar = TextContentLocal$.serializer.INSTANCE;
                textContentLocal = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, serializerVar, (Object) null);
                TextContentLocal textContentLocal3 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, serializerVar, (Object) null);
                ConsumptionRecommendationBannerLocal$HorizontalBarGraph$BarGraph$$serializer consumptionRecommendationBannerLocal$HorizontalBarGraph$BarGraph$$serializer = ConsumptionRecommendationBannerLocal$HorizontalBarGraph$BarGraph$$serializer.INSTANCE;
                ConsumptionRecommendationBannerLocal.HorizontalBarGraph.BarGraph barGraph4 = (ConsumptionRecommendationBannerLocal.HorizontalBarGraph.BarGraph) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, consumptionRecommendationBannerLocal$HorizontalBarGraph$BarGraph$$serializer, (Object) null);
                ConsumptionRecommendationBannerLocal.HorizontalBarGraph.BarGraph barGraph5 = (ConsumptionRecommendationBannerLocal.HorizontalBarGraph.BarGraph) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 6, consumptionRecommendationBannerLocal$HorizontalBarGraph$BarGraph$$serializer, (Object) null);
                textContentLocal2 = textContentLocal3;
                barGraph = barGraph4;
                impressionEventLogLocal = impressionEventLogLocal3;
                barGraph2 = (ConsumptionRecommendationBannerLocal.HorizontalBarGraph.BarGraph) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 7, consumptionRecommendationBannerLocal$HorizontalBarGraph$BarGraph$$serializer, (Object) null);
                str = strAsInterface;
                i = 255;
                barGraph3 = barGraph5;
                handlerLocal = handlerLocal2;
            } else {
                boolean z = true;
                i = 0;
                TextContentLocal textContentLocal4 = null;
                ConsumptionRecommendationBannerLocal.HorizontalBarGraph.BarGraph barGraph6 = null;
                ConsumptionRecommendationBannerLocal.HorizontalBarGraph.BarGraph barGraph7 = null;
                ConsumptionRecommendationBannerLocal.HorizontalBarGraph.BarGraph barGraph8 = null;
                textContentLocal2 = null;
                HandlerLocal handlerLocal3 = null;
                String strAsInterface2 = null;
                while (z) {
                    int i8 = onWarmupCompleted + 53;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    switch (iOnNavigationEvent) {
                        case -1:
                            z = false;
                            i4 = 7;
                        case 0:
                            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                            i |= 1;
                            int i10 = onWarmupCompleted + 121;
                            onExtraCallback = i10 % 128;
                            int i11 = i10 % 2;
                            handlerLocal3 = handlerLocal3;
                            i4 = 7;
                            i5 = 6;
                            i6 = 5;
                        case 1:
                            i |= 2;
                            handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, setAppxVersionInWorker.onExtraCallback, handlerLocal3);
                            i4 = 7;
                            i5 = 6;
                        case 2:
                            c = 3;
                            impressionEventLogLocal2 = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ImpressionEventLogLocal$.serializer.INSTANCE, impressionEventLogLocal2);
                            i |= 4;
                        case 3:
                            c = 3;
                            textContentLocal4 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, TextContentLocal$.serializer.INSTANCE, textContentLocal4);
                            i |= 8;
                        case 4:
                            textContentLocal2 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, TextContentLocal$.serializer.INSTANCE, textContentLocal2);
                            i |= 16;
                        case 5:
                            barGraph8 = (ConsumptionRecommendationBannerLocal.HorizontalBarGraph.BarGraph) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i6, ConsumptionRecommendationBannerLocal$HorizontalBarGraph$BarGraph$$serializer.INSTANCE, barGraph8);
                            i |= 32;
                        case 6:
                            barGraph7 = (ConsumptionRecommendationBannerLocal.HorizontalBarGraph.BarGraph) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i5, ConsumptionRecommendationBannerLocal$HorizontalBarGraph$BarGraph$$serializer.INSTANCE, barGraph7);
                            i |= 64;
                        case 7:
                            barGraph6 = (ConsumptionRecommendationBannerLocal.HorizontalBarGraph.BarGraph) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i4, ConsumptionRecommendationBannerLocal$HorizontalBarGraph$BarGraph$$serializer.INSTANCE, barGraph6);
                            i |= 128;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                }
                handlerLocal = handlerLocal3;
                textContentLocal = textContentLocal4;
                impressionEventLogLocal = impressionEventLogLocal2;
                barGraph2 = barGraph6;
                barGraph3 = barGraph7;
                barGraph = barGraph8;
                str = strAsInterface2;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ConsumptionRecommendationBannerLocal.HorizontalBarGraph(i, str, handlerLocal, impressionEventLogLocal, textContentLocal, textContentLocal2, barGraph, barGraph3, barGraph2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m483deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            throw null;
        }
        ConsumptionRecommendationBannerLocal.HorizontalBarGraph horizontalBarGraphDeserialize = deserialize(decoder);
        int i3 = onWarmupCompleted + 13;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return horizontalBarGraphDeserialize;
        }
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ConsumptionRecommendationBannerLocal.HorizontalBarGraph horizontalBarGraph) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(horizontalBarGraph, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ConsumptionRecommendationBannerLocal.HorizontalBarGraph.onExtraCallbackWithResult(horizontalBarGraph, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 29;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ConsumptionRecommendationBannerLocal.HorizontalBarGraph) obj);
        int i4 = onExtraCallback + 91;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 50 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
