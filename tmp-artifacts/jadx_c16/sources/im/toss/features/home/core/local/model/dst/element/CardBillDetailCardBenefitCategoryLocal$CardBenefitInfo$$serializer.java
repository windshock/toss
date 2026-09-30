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
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardBillDetailCardBenefitCategoryLocal$CardBenefitInfo$$serializer implements aeu2<CardBillDetailCardBenefitCategoryLocal.CardBenefitInfo> {
    public static final CardBillDetailCardBenefitCategoryLocal$CardBenefitInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 107;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 89;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        CardBillDetailCardBenefitCategoryLocal$CardBenefitInfo$$serializer cardBillDetailCardBenefitCategoryLocal$CardBenefitInfo$$serializer = new CardBillDetailCardBenefitCategoryLocal$CardBenefitInfo$$serializer();
        INSTANCE = cardBillDetailCardBenefitCategoryLocal$CardBenefitInfo$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.CardBillDetailCardBenefitCategoryLocal.CardBenefitInfo", cardBillDetailCardBenefitCategoryLocal$CardBenefitInfo$$serializer, 5);
        setanimationsloop.onWarmupCompleted("image", false);
        setanimationsloop.onWarmupCompleted("header", false);
        setanimationsloop.onWarmupCompleted("row1", false);
        setanimationsloop.onWarmupCompleted("row2", false);
        setanimationsloop.onWarmupCompleted("row3", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 29;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private CardBillDetailCardBenefitCategoryLocal$CardBenefitInfo$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(CardBillDetailCardBenefitCategoryLocal$CardBenefitCardImage$$serializer.INSTANCE);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(TextContentLocal$.serializer.INSTANCE);
        CardBillDetailCardBenefitCategoryLocal$CardBenefitRow$$serializer cardBillDetailCardBenefitCategoryLocal$CardBenefitRow$$serializer = CardBillDetailCardBenefitCategoryLocal$CardBenefitRow$$serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, sp.IAuthTabCallback(cardBillDetailCardBenefitCategoryLocal$CardBenefitRow$$serializer), sp.IAuthTabCallback(cardBillDetailCardBenefitCategoryLocal$CardBenefitRow$$serializer), sp.IAuthTabCallback(cardBillDetailCardBenefitCategoryLocal$CardBenefitRow$$serializer)};
        int i4 = onExtraCallback + 23;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CardBillDetailCardBenefitCategoryLocal.CardBenefitInfo deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        CardBillDetailCardBenefitCategoryLocal.CardBenefitRow cardBenefitRow;
        CardBillDetailCardBenefitCategoryLocal.CardBenefitRow cardBenefitRow2;
        CardBillDetailCardBenefitCategoryLocal.CardBenefitRow cardBenefitRow3;
        CardBillDetailCardBenefitCategoryLocal.CardBenefitCardImage cardBenefitCardImage;
        TextContentLocal textContentLocal;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 117;
        onExtraCallbackWithResult = i3 % 128;
        CardBillDetailCardBenefitCategoryLocal.CardBenefitRow cardBenefitRow4 = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            cardBenefitRow4.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        boolean z = false;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i4 = onExtraCallbackWithResult + 47;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            CardBillDetailCardBenefitCategoryLocal.CardBenefitCardImage cardBenefitCardImage2 = (CardBillDetailCardBenefitCategoryLocal.CardBenefitCardImage) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, CardBillDetailCardBenefitCategoryLocal$CardBenefitCardImage$$serializer.INSTANCE, (Object) null);
            TextContentLocal textContentLocal2 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, TextContentLocal$.serializer.INSTANCE, (Object) null);
            CardBillDetailCardBenefitCategoryLocal$CardBenefitRow$$serializer cardBillDetailCardBenefitCategoryLocal$CardBenefitRow$$serializer = CardBillDetailCardBenefitCategoryLocal$CardBenefitRow$$serializer.INSTANCE;
            CardBillDetailCardBenefitCategoryLocal.CardBenefitRow cardBenefitRow5 = (CardBillDetailCardBenefitCategoryLocal.CardBenefitRow) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, cardBillDetailCardBenefitCategoryLocal$CardBenefitRow$$serializer, (Object) null);
            CardBillDetailCardBenefitCategoryLocal.CardBenefitRow cardBenefitRow6 = (CardBillDetailCardBenefitCategoryLocal.CardBenefitRow) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, cardBillDetailCardBenefitCategoryLocal$CardBenefitRow$$serializer, (Object) null);
            cardBenefitRow3 = cardBenefitRow5;
            cardBenefitCardImage = cardBenefitCardImage2;
            cardBenefitRow = (CardBillDetailCardBenefitCategoryLocal.CardBenefitRow) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, cardBillDetailCardBenefitCategoryLocal$CardBenefitRow$$serializer, (Object) null);
            cardBenefitRow2 = cardBenefitRow6;
            i = 31;
            textContentLocal = textContentLocal2;
        } else {
            CardBillDetailCardBenefitCategoryLocal.CardBenefitRow cardBenefitRow7 = null;
            CardBillDetailCardBenefitCategoryLocal.CardBenefitRow cardBenefitRow8 = null;
            CardBillDetailCardBenefitCategoryLocal.CardBenefitCardImage cardBenefitCardImage3 = null;
            TextContentLocal textContentLocal3 = null;
            int i6 = 0;
            boolean z2 = true;
            while (z2) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i7 = onExtraCallbackWithResult;
                    int i8 = i7 + 17;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    if (iOnNavigationEvent != 0) {
                        if (iOnNavigationEvent == 1) {
                            textContentLocal3 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, TextContentLocal$.serializer.INSTANCE, textContentLocal3);
                            i6 |= 2;
                        } else if (iOnNavigationEvent == 2) {
                            cardBenefitRow8 = (CardBillDetailCardBenefitCategoryLocal.CardBenefitRow) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, CardBillDetailCardBenefitCategoryLocal$CardBenefitRow$$serializer.INSTANCE, cardBenefitRow8);
                            i6 |= 4;
                            int i10 = onExtraCallbackWithResult + 95;
                            onExtraCallback = i10 % 128;
                            int i11 = i10 % 2;
                        } else if (iOnNavigationEvent == 3) {
                            cardBenefitRow4 = (CardBillDetailCardBenefitCategoryLocal.CardBenefitRow) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, CardBillDetailCardBenefitCategoryLocal$CardBenefitRow$$serializer.INSTANCE, cardBenefitRow4);
                            i6 |= 8;
                        } else {
                            if (iOnNavigationEvent != 4) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i12 = i7 + 105;
                            onExtraCallback = i12 % 128;
                            int i13 = i12 % 2;
                            cardBenefitRow7 = (CardBillDetailCardBenefitCategoryLocal.CardBenefitRow) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, CardBillDetailCardBenefitCategoryLocal$CardBenefitRow$$serializer.INSTANCE, cardBenefitRow7);
                            i6 |= 16;
                        }
                        z = false;
                    } else {
                        cardBenefitCardImage3 = (CardBillDetailCardBenefitCategoryLocal.CardBenefitCardImage) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, CardBillDetailCardBenefitCategoryLocal$CardBenefitCardImage$$serializer.INSTANCE, cardBenefitCardImage3);
                        i6 |= 1;
                        z = false;
                    }
                } else {
                    z2 = z;
                }
            }
            cardBenefitRow = cardBenefitRow7;
            cardBenefitRow2 = cardBenefitRow4;
            cardBenefitRow3 = cardBenefitRow8;
            cardBenefitCardImage = cardBenefitCardImage3;
            textContentLocal = textContentLocal3;
            i = i6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CardBillDetailCardBenefitCategoryLocal.CardBenefitInfo(i, cardBenefitCardImage, textContentLocal, cardBenefitRow3, cardBenefitRow2, cardBenefitRow, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m309deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CardBillDetailCardBenefitCategoryLocal.CardBenefitInfo cardBenefitInfoDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
        return cardBenefitInfoDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CardBillDetailCardBenefitCategoryLocal.CardBenefitInfo cardBenefitInfo) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(cardBenefitInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CardBillDetailCardBenefitCategoryLocal.CardBenefitInfo.IAuthTabCallback(cardBenefitInfo, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 89;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CardBillDetailCardBenefitCategoryLocal.CardBenefitInfo) obj);
        int i4 = onExtraCallbackWithResult + 89;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 71;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
