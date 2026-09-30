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
import o.removeNextStartHandler;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionRecommendationBannerLocal$Icon$$serializer implements aeu2<ConsumptionRecommendationBannerLocal.Icon> {
    private static int IAuthTabCallback = 0;
    public static final ConsumptionRecommendationBannerLocal$Icon$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        ConsumptionRecommendationBannerLocal$Icon$$serializer consumptionRecommendationBannerLocal$Icon$$serializer = new ConsumptionRecommendationBannerLocal$Icon$$serializer();
        INSTANCE = consumptionRecommendationBannerLocal$Icon$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.ConsumptionRecommendationBannerLocal.Icon", consumptionRecommendationBannerLocal$Icon$$serializer, 6);
        setanimationsloop.onWarmupCompleted("id", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("impressionEventLog", false);
        setanimationsloop.onWarmupCompleted("row1", false);
        setanimationsloop.onWarmupCompleted("row2", false);
        setanimationsloop.onWarmupCompleted("imageSource", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 61;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 68 / 0;
        }
    }

    private ConsumptionRecommendationBannerLocal$Icon$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(ImpressionEventLogLocal$.serializer.INSTANCE);
        TextContentLocal$.serializer serializerVar = TextContentLocal$.serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent, setAppxVersionInWorker.onExtraCallback, kSerializerIAuthTabCallback, serializerVar, serializerVar, removeNextStartHandler.onWarmupCompleted};
        int i4 = onExtraCallback + 113;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ConsumptionRecommendationBannerLocal.Icon deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        ImpressionEventLogLocal impressionEventLogLocal;
        int i;
        TextContentLocal textContentLocal;
        String str;
        TextContentLocal textContentLocal2;
        HandlerLocal handlerLocal;
        ImageSourceLocal imageSourceLocal;
        char c;
        int i2;
        boolean z;
        char c2;
        int i3 = 2;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        TextContentLocal textContentLocal3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            HandlerLocal handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, setAppxVersionInWorker.onExtraCallback, (Object) null);
            ImpressionEventLogLocal impressionEventLogLocal2 = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ImpressionEventLogLocal$.serializer.INSTANCE, (Object) null);
            TextContentLocal$.serializer serializerVar = TextContentLocal$.serializer.INSTANCE;
            TextContentLocal textContentLocal4 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, serializerVar, (Object) null);
            TextContentLocal textContentLocal5 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, serializerVar, (Object) null);
            i = 63;
            impressionEventLogLocal = impressionEventLogLocal2;
            str = strAsInterface;
            imageSourceLocal = (ImageSourceLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, removeNextStartHandler.onWarmupCompleted, (Object) null);
            textContentLocal2 = textContentLocal5;
            textContentLocal = textContentLocal4;
            handlerLocal = handlerLocal2;
        } else {
            boolean z2 = true;
            int i5 = 0;
            TextContentLocal textContentLocal6 = null;
            impressionEventLogLocal = null;
            String strAsInterface2 = null;
            ImageSourceLocal imageSourceLocal2 = null;
            HandlerLocal handlerLocal3 = null;
            while (z2) {
                int i6 = onNavigationEvent + 115;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (i7 != 0) {
                    int i8 = 45 / 0;
                    switch (iOnNavigationEvent) {
                        case -1:
                            z = true;
                            z2 = false;
                            i3 = 2;
                            break;
                        case 0:
                            z = true;
                            c2 = 3;
                            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                            i5 |= 1;
                            i3 = 2;
                            break;
                        case 1:
                            c2 = 3;
                            z = true;
                            handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, setAppxVersionInWorker.onExtraCallback, handlerLocal3);
                            i5 |= 2;
                            i3 = 2;
                            break;
                        case 2:
                            c = 3;
                            impressionEventLogLocal = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, ImpressionEventLogLocal$.serializer.INSTANCE, impressionEventLogLocal);
                            i5 |= 4;
                            break;
                        case 3:
                            c = 3;
                            textContentLocal3 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, TextContentLocal$.serializer.INSTANCE, textContentLocal3);
                            i5 |= 8;
                            break;
                        case 4:
                            textContentLocal6 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, TextContentLocal$.serializer.INSTANCE, textContentLocal6);
                            i5 |= 16;
                            i2 = onNavigationEvent + 113;
                            onExtraCallback = i2 % 128;
                            if (i2 % i3 != 0) {
                                int i9 = 3 / 5;
                            }
                            break;
                        case 5:
                            imageSourceLocal2 = (ImageSourceLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, removeNextStartHandler.onWarmupCompleted, imageSourceLocal2);
                            i5 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                } else {
                    switch (iOnNavigationEvent) {
                        case -1:
                            z = true;
                            z2 = false;
                            i3 = 2;
                            break;
                        case 0:
                            z = true;
                            c2 = 3;
                            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                            i5 |= 1;
                            i3 = 2;
                            break;
                        case 1:
                            c2 = 3;
                            z = true;
                            handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, setAppxVersionInWorker.onExtraCallback, handlerLocal3);
                            i5 |= 2;
                            i3 = 2;
                            break;
                        case 2:
                            c = 3;
                            impressionEventLogLocal = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, ImpressionEventLogLocal$.serializer.INSTANCE, impressionEventLogLocal);
                            i5 |= 4;
                            break;
                        case 3:
                            c = 3;
                            textContentLocal3 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, TextContentLocal$.serializer.INSTANCE, textContentLocal3);
                            i5 |= 8;
                            break;
                        case 4:
                            textContentLocal6 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, TextContentLocal$.serializer.INSTANCE, textContentLocal6);
                            i5 |= 16;
                            i2 = onNavigationEvent + 113;
                            onExtraCallback = i2 % 128;
                            if (i2 % i3 != 0) {
                            }
                            break;
                        case 5:
                            imageSourceLocal2 = (ImageSourceLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, removeNextStartHandler.onWarmupCompleted, imageSourceLocal2);
                            i5 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                }
            }
            i = i5;
            String str2 = strAsInterface2;
            textContentLocal = textContentLocal3;
            str = str2;
            ImageSourceLocal imageSourceLocal3 = imageSourceLocal2;
            textContentLocal2 = textContentLocal6;
            handlerLocal = handlerLocal3;
            imageSourceLocal = imageSourceLocal3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ConsumptionRecommendationBannerLocal.Icon(i, str, handlerLocal, impressionEventLogLocal, textContentLocal, textContentLocal2, imageSourceLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m485deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ConsumptionRecommendationBannerLocal.Icon iconDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 37 / 0;
        }
        return iconDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ConsumptionRecommendationBannerLocal.Icon icon) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(icon, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ConsumptionRecommendationBannerLocal.Icon.onExtraCallback(icon, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(icon, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        ConsumptionRecommendationBannerLocal.Icon.onExtraCallback(icon, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ConsumptionRecommendationBannerLocal.Icon) obj);
        int i4 = onNavigationEvent + 7;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onExtraCallback + 109;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
