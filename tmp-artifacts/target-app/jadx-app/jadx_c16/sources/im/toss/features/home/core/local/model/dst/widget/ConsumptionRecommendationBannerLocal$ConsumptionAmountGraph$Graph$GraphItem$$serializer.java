package im.toss.features.home.core.local.model.dst.widget;

import im.toss.features.home.core.local.model.dst.widget.ConsumptionRecommendationBannerLocal;
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
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$GraphItem$$serializer implements aeu2<ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Graph.GraphItem> {
    public static final ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$GraphItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 73;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$GraphItem$$serializer consumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$GraphItem$$serializer = new ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$GraphItem$$serializer();
        INSTANCE = consumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$GraphItem$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Graph.GraphItem", consumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$GraphItem$$serializer, 2);
        setanimationsloop.onWarmupCompleted("color", false);
        setanimationsloop.onWarmupCompleted("series", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 69;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$GraphItem$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent, ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Graph.GraphItem.onExtraCallbackWithResult()[1].getValue()};
        int i4 = onExtraCallback + 13;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Graph.GraphItem deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        List list;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Graph.GraphItem.onExtraCallbackWithResult();
        int i2 = 3;
        if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            int i3 = onWarmupCompleted + 81;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnExtraCallbackWithResult[1].getValue(), (Object) null);
        } else {
            int i5 = onWarmupCompleted + 67;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            boolean z = true;
            String strAsInterface2 = null;
            List list2 = null;
            int i7 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i8 = onExtraCallback + 3;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 != 0) {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnExtraCallbackWithResult[1].getValue(), list2);
                        i7 |= 2;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnExtraCallbackWithResult[1].getValue(), list2);
                        i7 |= 2;
                    }
                } else {
                    strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i7 |= 1;
                }
            }
            strAsInterface = strAsInterface2;
            list = list2;
            i2 = i7;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Graph.GraphItem(i2, strAsInterface, list, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m482deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Graph.GraphItem graphItemDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 91 / 0;
        }
        int i5 = onExtraCallback + 1;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return graphItemDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Graph.GraphItem graphItem) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(graphItem, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Graph.GraphItem.onExtraCallbackWithResult(graphItem, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 5;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Graph.GraphItem) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onWarmupCompleted + 79;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
