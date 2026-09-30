package im.toss.features.home.core.local.model.dst.widget;

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
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$Amount$$serializer implements aeu2<ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Amount> {
    private static int IAuthTabCallback = 1;
    public static final ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$Amount$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 8 / 0;
        }
        return serialDescriptor;
    }

    static {
        ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$Amount$$serializer consumptionRecommendationBannerLocal$ConsumptionAmountGraph$Amount$$serializer = new ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$Amount$$serializer();
        INSTANCE = consumptionRecommendationBannerLocal$ConsumptionAmountGraph$Amount$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Amount", consumptionRecommendationBannerLocal$ConsumptionAmountGraph$Amount$$serializer, 3);
        setanimationsloop.onWarmupCompleted("number", false);
        setanimationsloop.onWarmupCompleted("prefix", false);
        setanimationsloop.onWarmupCompleted("suffix", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 19;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$Amount$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(oty1.onExtraCallback);
            TextContentLocal$.serializer serializerVar = TextContentLocal$.serializer.INSTANCE;
            return new KSerializer[]{kSerializerIAuthTabCallback, sp.IAuthTabCallback(serializerVar), sp.IAuthTabCallback(serializerVar)};
        }
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(oty1.onExtraCallback);
        TextContentLocal$.serializer serializerVar2 = TextContentLocal$.serializer.INSTANCE;
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(serializerVar2);
        KSerializer<?> kSerializerIAuthTabCallback4 = sp.IAuthTabCallback(serializerVar2);
        KSerializer<?>[] kSerializerArr = new KSerializer[2];
        kSerializerArr[0] = kSerializerIAuthTabCallback3;
        kSerializerArr[1] = kSerializerIAuthTabCallback2;
        kSerializerArr[2] = kSerializerIAuthTabCallback4;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Amount deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        TextContentLocal textContentLocal;
        Long l;
        TextContentLocal textContentLocal2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        TextContentLocal textContentLocal3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            Long l2 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, oty1.onExtraCallback, (Object) null);
            TextContentLocal$.serializer serializerVar = TextContentLocal$.serializer.INSTANCE;
            TextContentLocal textContentLocal4 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, serializerVar, (Object) null);
            textContentLocal2 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, serializerVar, (Object) null);
            l = l2;
            i = 7;
            textContentLocal = textContentLocal4;
        } else {
            int i3 = 0;
            boolean z = true;
            Long l3 = null;
            TextContentLocal textContentLocal5 = null;
            while (z) {
                int i4 = onExtraCallback + 119;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    int i6 = IAuthTabCallback + 33;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    l3 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, oty1.onExtraCallback, l3);
                    i3 |= 1;
                    int i8 = IAuthTabCallback + 37;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                } else if (iOnNavigationEvent == 1) {
                    textContentLocal3 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, TextContentLocal$.serializer.INSTANCE, textContentLocal3);
                    i3 |= 2;
                } else {
                    if (iOnNavigationEvent != 2) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    textContentLocal5 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, TextContentLocal$.serializer.INSTANCE, textContentLocal5);
                    i3 |= 4;
                }
            }
            i = i3;
            textContentLocal = textContentLocal3;
            l = l3;
            textContentLocal2 = textContentLocal5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Amount(i, l, textContentLocal, textContentLocal2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m480deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Amount amountDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 117;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return amountDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Amount amount) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(amount, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Amount.onExtraCallback(amount, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 15 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(amount, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Amount.onExtraCallback(amount, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = onExtraCallback + 15;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Amount) obj);
        if (i3 != 0) {
            int i4 = 6 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = IAuthTabCallback + 21;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        obj.hashCode();
        throw null;
    }
}
