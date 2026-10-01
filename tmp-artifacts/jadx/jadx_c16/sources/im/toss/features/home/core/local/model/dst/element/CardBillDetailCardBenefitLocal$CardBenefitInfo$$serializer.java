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
public final /* synthetic */ class CardBillDetailCardBenefitLocal$CardBenefitInfo$$serializer implements aeu2<CardBillDetailCardBenefitLocal.CardBenefitInfo> {
    public static final CardBillDetailCardBenefitLocal$CardBenefitInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 49;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 15;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        CardBillDetailCardBenefitLocal$CardBenefitInfo$$serializer cardBillDetailCardBenefitLocal$CardBenefitInfo$$serializer = new CardBillDetailCardBenefitLocal$CardBenefitInfo$$serializer();
        INSTANCE = cardBillDetailCardBenefitLocal$CardBenefitInfo$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.CardBillDetailCardBenefitLocal.CardBenefitInfo", cardBillDetailCardBenefitLocal$CardBenefitInfo$$serializer, 4);
        setanimationsloop.onWarmupCompleted("image", false);
        setanimationsloop.onWarmupCompleted("row1", false);
        setanimationsloop.onWarmupCompleted("row2", false);
        setanimationsloop.onWarmupCompleted("row3", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private CardBillDetailCardBenefitLocal$CardBenefitInfo$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(CardBillDetailCardBenefitLocal$CardBenefitCardImage$$serializer.INSTANCE);
        CardBillDetailCardBenefitLocal$CardBenefitRow$$serializer cardBillDetailCardBenefitLocal$CardBenefitRow$$serializer = CardBillDetailCardBenefitLocal$CardBenefitRow$$serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, sp.IAuthTabCallback(cardBillDetailCardBenefitLocal$CardBenefitRow$$serializer), sp.IAuthTabCallback(cardBillDetailCardBenefitLocal$CardBenefitRow$$serializer), sp.IAuthTabCallback(cardBillDetailCardBenefitLocal$CardBenefitRow$$serializer)};
        int i4 = onNavigationEvent + 15;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CardBillDetailCardBenefitLocal.CardBenefitInfo deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        CardBillDetailCardBenefitLocal.CardBenefitRow cardBenefitRow;
        CardBillDetailCardBenefitLocal.CardBenefitRow cardBenefitRow2;
        CardBillDetailCardBenefitLocal.CardBenefitCardImage cardBenefitCardImage;
        CardBillDetailCardBenefitLocal.CardBenefitRow cardBenefitRow3;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        CardBillDetailCardBenefitLocal.CardBenefitRow cardBenefitRow4 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i4 = onNavigationEvent + 13;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            CardBillDetailCardBenefitLocal.CardBenefitCardImage cardBenefitCardImage2 = (CardBillDetailCardBenefitLocal.CardBenefitCardImage) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, CardBillDetailCardBenefitLocal$CardBenefitCardImage$$serializer.INSTANCE, (Object) null);
            CardBillDetailCardBenefitLocal$CardBenefitRow$$serializer cardBillDetailCardBenefitLocal$CardBenefitRow$$serializer = CardBillDetailCardBenefitLocal$CardBenefitRow$$serializer.INSTANCE;
            CardBillDetailCardBenefitLocal.CardBenefitRow cardBenefitRow5 = (CardBillDetailCardBenefitLocal.CardBenefitRow) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, cardBillDetailCardBenefitLocal$CardBenefitRow$$serializer, (Object) null);
            cardBenefitRow = (CardBillDetailCardBenefitLocal.CardBenefitRow) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, cardBillDetailCardBenefitLocal$CardBenefitRow$$serializer, (Object) null);
            cardBenefitCardImage = cardBenefitCardImage2;
            cardBenefitRow3 = (CardBillDetailCardBenefitLocal.CardBenefitRow) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, cardBillDetailCardBenefitLocal$CardBenefitRow$$serializer, (Object) null);
            i = 15;
            cardBenefitRow2 = cardBenefitRow5;
        } else {
            int i6 = 0;
            boolean z = true;
            CardBillDetailCardBenefitLocal.CardBenefitRow cardBenefitRow6 = null;
            CardBillDetailCardBenefitLocal.CardBenefitCardImage cardBenefitCardImage3 = null;
            CardBillDetailCardBenefitLocal.CardBenefitRow cardBenefitRow7 = null;
            while (!(!z)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    if (iOnNavigationEvent == 1) {
                        cardBenefitRow6 = (CardBillDetailCardBenefitLocal.CardBenefitRow) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, CardBillDetailCardBenefitLocal$CardBenefitRow$$serializer.INSTANCE, cardBenefitRow6);
                        i6 |= 2;
                        i2 = onExtraCallback + 19;
                        onNavigationEvent = i2 % 128;
                    } else if (iOnNavigationEvent != 2) {
                        int i7 = onExtraCallback + 87;
                        onNavigationEvent = i7 % 128;
                        if (i7 % 2 != 0) {
                            if (iOnNavigationEvent != 4) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            cardBenefitRow7 = (CardBillDetailCardBenefitLocal.CardBenefitRow) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, CardBillDetailCardBenefitLocal$CardBenefitRow$$serializer.INSTANCE, cardBenefitRow7);
                            i6 |= 8;
                        } else {
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            cardBenefitRow7 = (CardBillDetailCardBenefitLocal.CardBenefitRow) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, CardBillDetailCardBenefitLocal$CardBenefitRow$$serializer.INSTANCE, cardBenefitRow7);
                            i6 |= 8;
                        }
                    } else {
                        cardBenefitRow4 = (CardBillDetailCardBenefitLocal.CardBenefitRow) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, CardBillDetailCardBenefitLocal$CardBenefitRow$$serializer.INSTANCE, cardBenefitRow4);
                        i6 |= 4;
                        i2 = onNavigationEvent + 59;
                        onExtraCallback = i2 % 128;
                    }
                    int i8 = i2 % 2;
                } else {
                    cardBenefitCardImage3 = (CardBillDetailCardBenefitLocal.CardBenefitCardImage) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, CardBillDetailCardBenefitLocal$CardBenefitCardImage$$serializer.INSTANCE, cardBenefitCardImage3);
                    i6 |= 1;
                }
            }
            i = i6;
            cardBenefitRow = cardBenefitRow4;
            cardBenefitRow2 = cardBenefitRow6;
            cardBenefitCardImage = cardBenefitCardImage3;
            cardBenefitRow3 = cardBenefitRow7;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CardBillDetailCardBenefitLocal.CardBenefitInfo(i, cardBenefitCardImage, cardBenefitRow2, cardBenefitRow, cardBenefitRow3, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m314deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CardBillDetailCardBenefitLocal.CardBenefitInfo cardBenefitInfoDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 111;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
        return cardBenefitInfoDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CardBillDetailCardBenefitLocal.CardBenefitInfo cardBenefitInfo) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(cardBenefitInfo, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CardBillDetailCardBenefitLocal.CardBenefitInfo.onExtraCallbackWithResult(cardBenefitInfo, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(cardBenefitInfo, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        CardBillDetailCardBenefitLocal.CardBenefitInfo.onExtraCallbackWithResult(cardBenefitInfo, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CardBillDetailCardBenefitLocal.CardBenefitInfo) obj);
        int i4 = onExtraCallback + 3;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}
