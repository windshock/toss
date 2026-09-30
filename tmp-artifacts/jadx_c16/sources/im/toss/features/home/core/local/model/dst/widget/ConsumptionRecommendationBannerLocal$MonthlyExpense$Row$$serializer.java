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
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionRecommendationBannerLocal$MonthlyExpense$Row$$serializer implements aeu2<ConsumptionRecommendationBannerLocal.MonthlyExpense.Row> {
    private static int IAuthTabCallback = 0;
    public static final ConsumptionRecommendationBannerLocal$MonthlyExpense$Row$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 3;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        ConsumptionRecommendationBannerLocal$MonthlyExpense$Row$$serializer consumptionRecommendationBannerLocal$MonthlyExpense$Row$$serializer = new ConsumptionRecommendationBannerLocal$MonthlyExpense$Row$$serializer();
        INSTANCE = consumptionRecommendationBannerLocal$MonthlyExpense$Row$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.ConsumptionRecommendationBannerLocal.MonthlyExpense.Row", consumptionRecommendationBannerLocal$MonthlyExpense$Row$$serializer, 2);
        setanimationsloop.onWarmupCompleted("row1", false);
        setanimationsloop.onWarmupCompleted("row2", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 65;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private ConsumptionRecommendationBannerLocal$MonthlyExpense$Row$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TextContentLocal$.serializer serializerVar = TextContentLocal$.serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {serializerVar, serializerVar};
        int i4 = onExtraCallbackWithResult + 45;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ConsumptionRecommendationBannerLocal.MonthlyExpense.Row deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        TextContentLocal textContentLocal;
        TextContentLocal textContentLocal2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            TextContentLocal$.serializer serializerVar = TextContentLocal$.serializer.INSTANCE;
            textContentLocal2 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, serializerVar, (Object) null);
            textContentLocal = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, serializerVar, (Object) null);
            int i3 = onExtraCallbackWithResult + 41;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            i = 3;
        } else {
            TextContentLocal textContentLocal3 = null;
            TextContentLocal textContentLocal4 = null;
            int i5 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    textContentLocal4 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, TextContentLocal$.serializer.INSTANCE, textContentLocal4);
                    i5 |= 1;
                } else {
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i6 = onExtraCallbackWithResult + 11;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 == 0) {
                        textContentLocal3 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, TextContentLocal$.serializer.INSTANCE, textContentLocal3);
                        i5 |= 4;
                    } else {
                        textContentLocal3 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, TextContentLocal$.serializer.INSTANCE, textContentLocal3);
                        i5 |= 2;
                    }
                    int i7 = onWarmupCompleted + 61;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
            i = i5;
            textContentLocal = textContentLocal3;
            textContentLocal2 = textContentLocal4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ConsumptionRecommendationBannerLocal.MonthlyExpense.Row(i, textContentLocal2, textContentLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m487deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ConsumptionRecommendationBannerLocal.MonthlyExpense.Row row) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(row, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ConsumptionRecommendationBannerLocal.MonthlyExpense.Row.onWarmupCompleted(row, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(row, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        ConsumptionRecommendationBannerLocal.MonthlyExpense.Row.onWarmupCompleted(row, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onExtraCallbackWithResult + 25;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ConsumptionRecommendationBannerLocal.MonthlyExpense.Row) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 == 0) {
            int i4 = 82 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
