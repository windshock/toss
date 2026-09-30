package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.CardBillDetailCardBenefitLocal;
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
public final /* synthetic */ class CardBillDetailCardBenefitLocal$Header$$serializer implements aeu2<CardBillDetailCardBenefitLocal.Header> {
    private static int IAuthTabCallback = 0;
    public static final CardBillDetailCardBenefitLocal$Header$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 59;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        CardBillDetailCardBenefitLocal$Header$$serializer cardBillDetailCardBenefitLocal$Header$$serializer = new CardBillDetailCardBenefitLocal$Header$$serializer();
        INSTANCE = cardBillDetailCardBenefitLocal$Header$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.CardBillDetailCardBenefitLocal.Header", cardBillDetailCardBenefitLocal$Header$$serializer, 2);
        setanimationsloop.onWarmupCompleted("row1", false);
        setanimationsloop.onWarmupCompleted("row2", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 13;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private CardBillDetailCardBenefitLocal$Header$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        TextContentLocal$.serializer serializerVar = TextContentLocal$.serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {serializerVar, serializerVar};
        int i4 = onExtraCallbackWithResult + 81;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CardBillDetailCardBenefitLocal.Header deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        TextContentLocal textContentLocal;
        TextContentLocal textContentLocal2;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Object obj = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onExtraCallbackWithResult + 105;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            TextContentLocal$.serializer serializerVar = TextContentLocal$.serializer.INSTANCE;
            textContentLocal2 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, serializerVar, (Object) null);
            textContentLocal = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, serializerVar, (Object) null);
            i = 3;
        } else {
            int i5 = 0;
            TextContentLocal textContentLocal3 = null;
            TextContentLocal textContentLocal4 = null;
            boolean z = true;
            while (!(!z)) {
                int i6 = onWarmupCompleted + 9;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    obj.hashCode();
                    throw null;
                }
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
                    textContentLocal3 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, TextContentLocal$.serializer.INSTANCE, textContentLocal3);
                    i5 |= 2;
                }
            }
            textContentLocal = textContentLocal3;
            textContentLocal2 = textContentLocal4;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CardBillDetailCardBenefitLocal.Header(i, textContentLocal2, textContentLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m316deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CardBillDetailCardBenefitLocal.Header header) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(header, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CardBillDetailCardBenefitLocal.Header.onExtraCallback(header, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 97;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CardBillDetailCardBenefitLocal.Header) obj);
        int i4 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 31;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
