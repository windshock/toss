package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.CardBillDetailCardBenefitCategoryLocal;
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
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardBillDetailCardBenefitCategoryLocal$Header$$serializer implements aeu2<CardBillDetailCardBenefitCategoryLocal.Header> {
    public static final CardBillDetailCardBenefitCategoryLocal$Header$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 69;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 99;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        CardBillDetailCardBenefitCategoryLocal$Header$$serializer cardBillDetailCardBenefitCategoryLocal$Header$$serializer = new CardBillDetailCardBenefitCategoryLocal$Header$$serializer();
        INSTANCE = cardBillDetailCardBenefitCategoryLocal$Header$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.CardBillDetailCardBenefitCategoryLocal.Header", cardBillDetailCardBenefitCategoryLocal$Header$$serializer, 2);
        setanimationsloop.onWarmupCompleted("row1", false);
        setanimationsloop.onWarmupCompleted("row2", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 75;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private CardBillDetailCardBenefitCategoryLocal$Header$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        TextContentLocal$.serializer serializerVar = TextContentLocal$.serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {serializerVar, serializerVar};
        int i4 = onWarmupCompleted + 27;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CardBillDetailCardBenefitCategoryLocal.Header deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        TextContentLocal textContentLocal;
        TextContentLocal textContentLocal2;
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 103;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            TextContentLocal$.serializer serializerVar = TextContentLocal$.serializer.INSTANCE;
            textContentLocal2 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, serializerVar, (Object) null);
            textContentLocal = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, serializerVar, (Object) null);
            i = 3;
        } else {
            int i5 = 0;
            TextContentLocal textContentLocal3 = null;
            TextContentLocal textContentLocal4 = null;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i6 = onNavigationEvent + 17;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    textContentLocal3 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, TextContentLocal$.serializer.INSTANCE, textContentLocal3);
                    i5 |= 2;
                    int i8 = onWarmupCompleted + 61;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    textContentLocal4 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, TextContentLocal$.serializer.INSTANCE, textContentLocal4);
                    i5 |= 1;
                }
            }
            textContentLocal = textContentLocal3;
            textContentLocal2 = textContentLocal4;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CardBillDetailCardBenefitCategoryLocal.Header(i, textContentLocal2, textContentLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m311deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            throw null;
        }
        CardBillDetailCardBenefitCategoryLocal.Header headerDeserialize = deserialize(decoder);
        int i3 = onWarmupCompleted + 107;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return headerDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CardBillDetailCardBenefitCategoryLocal.Header header) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(header, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CardBillDetailCardBenefitCategoryLocal.Header.onExtraCallbackWithResult(header, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 5;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CardBillDetailCardBenefitCategoryLocal.Header) obj);
        int i4 = onWarmupCompleted + 101;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onWarmupCompleted + 105;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
