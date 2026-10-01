package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.CardBillDetailCardBenefitLocal;
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
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardBillDetailCardBenefitLocal$$serializer implements aeu2<CardBillDetailCardBenefitLocal> {
    private static int IAuthTabCallback = 1;
    public static final CardBillDetailCardBenefitLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 101;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 23 / 0;
        }
        return serialDescriptor;
    }

    static {
        CardBillDetailCardBenefitLocal$$serializer cardBillDetailCardBenefitLocal$$serializer = new CardBillDetailCardBenefitLocal$$serializer();
        INSTANCE = cardBillDetailCardBenefitLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.CardBillDetailCardBenefitLocal", cardBillDetailCardBenefitLocal$$serializer, 3);
        setanimationsloop.onWarmupCompleted("header", false);
        setanimationsloop.onWarmupCompleted("leftCard", false);
        setanimationsloop.onWarmupCompleted("rightCard", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 17;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private CardBillDetailCardBenefitLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = CardBillDetailCardBenefitLocal$CardBenefitInfo$$serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {CardBillDetailCardBenefitLocal$Header$$serializer.INSTANCE, kSerializer, sp.IAuthTabCallback(kSerializer)};
        int i4 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CardBillDetailCardBenefitLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        CardBillDetailCardBenefitLocal.Header header;
        CardBillDetailCardBenefitLocal.CardBenefitInfo cardBenefitInfo;
        int i;
        CardBillDetailCardBenefitLocal.CardBenefitInfo cardBenefitInfo2;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        CardBillDetailCardBenefitLocal.CardBenefitInfo cardBenefitInfo3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            CardBillDetailCardBenefitLocal.Header header2 = (CardBillDetailCardBenefitLocal.Header) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, CardBillDetailCardBenefitLocal$Header$$serializer.INSTANCE, (Object) null);
            CardBillDetailCardBenefitLocal$CardBenefitInfo$$serializer cardBillDetailCardBenefitLocal$CardBenefitInfo$$serializer = CardBillDetailCardBenefitLocal$CardBenefitInfo$$serializer.INSTANCE;
            CardBillDetailCardBenefitLocal.CardBenefitInfo cardBenefitInfo4 = (CardBillDetailCardBenefitLocal.CardBenefitInfo) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, cardBillDetailCardBenefitLocal$CardBenefitInfo$$serializer, (Object) null);
            header = header2;
            cardBenefitInfo2 = (CardBillDetailCardBenefitLocal.CardBenefitInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, cardBillDetailCardBenefitLocal$CardBenefitInfo$$serializer, (Object) null);
            cardBenefitInfo = cardBenefitInfo4;
            i = 7;
        } else {
            int i4 = 0;
            boolean z = true;
            CardBillDetailCardBenefitLocal.Header header3 = null;
            CardBillDetailCardBenefitLocal.CardBenefitInfo cardBenefitInfo5 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    if (iOnNavigationEvent == 0) {
                        header3 = (CardBillDetailCardBenefitLocal.Header) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, CardBillDetailCardBenefitLocal$Header$$serializer.INSTANCE, header3);
                        i4 |= 1;
                        i2 = onExtraCallbackWithResult + 35;
                    } else if (iOnNavigationEvent != 1) {
                        int i5 = onExtraCallbackWithResult + 57;
                        int i6 = i5 % 128;
                        onNavigationEvent = i6;
                        if (i5 % 2 == 0) {
                            if (iOnNavigationEvent != 5) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i7 = i6 + 109;
                            onExtraCallbackWithResult = i7 % 128;
                            int i8 = i7 % 2;
                            cardBenefitInfo5 = (CardBillDetailCardBenefitLocal.CardBenefitInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, CardBillDetailCardBenefitLocal$CardBenefitInfo$$serializer.INSTANCE, cardBenefitInfo5);
                            i4 |= 4;
                            i2 = onExtraCallbackWithResult + 111;
                        } else {
                            if (iOnNavigationEvent != 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i72 = i6 + 109;
                            onExtraCallbackWithResult = i72 % 128;
                            int i82 = i72 % 2;
                            cardBenefitInfo5 = (CardBillDetailCardBenefitLocal.CardBenefitInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, CardBillDetailCardBenefitLocal$CardBenefitInfo$$serializer.INSTANCE, cardBenefitInfo5);
                            i4 |= 4;
                            i2 = onExtraCallbackWithResult + 111;
                        }
                    } else {
                        cardBenefitInfo3 = (CardBillDetailCardBenefitLocal.CardBenefitInfo) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, CardBillDetailCardBenefitLocal$CardBenefitInfo$$serializer.INSTANCE, cardBenefitInfo3);
                        i4 |= 2;
                    }
                    onNavigationEvent = i2 % 128;
                    int i9 = i2 % 2;
                } else {
                    z = false;
                }
            }
            int i10 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            header = header3;
            cardBenefitInfo = cardBenefitInfo3;
            i = i4;
            cardBenefitInfo2 = cardBenefitInfo5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        CardBillDetailCardBenefitLocal cardBillDetailCardBenefitLocal = new CardBillDetailCardBenefitLocal(i, header, cardBenefitInfo, cardBenefitInfo2, (okycx) null);
        int i12 = onExtraCallbackWithResult + 51;
        onNavigationEvent = i12 % 128;
        int i13 = i12 % 2;
        return cardBillDetailCardBenefitLocal;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m312deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CardBillDetailCardBenefitLocal cardBillDetailCardBenefitLocalDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return cardBillDetailCardBenefitLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CardBillDetailCardBenefitLocal cardBillDetailCardBenefitLocal) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(cardBillDetailCardBenefitLocal, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CardBillDetailCardBenefitLocal.onExtraCallback(cardBillDetailCardBenefitLocal, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(cardBillDetailCardBenefitLocal, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        CardBillDetailCardBenefitLocal.onExtraCallback(cardBillDetailCardBenefitLocal, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CardBillDetailCardBenefitLocal) obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}
