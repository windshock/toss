package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.CardBillDetailCardBenefitCategoryLocal;
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
public final /* synthetic */ class CardBillDetailCardBenefitCategoryLocal$$serializer implements aeu2<CardBillDetailCardBenefitCategoryLocal> {
    private static int IAuthTabCallback = 1;
    public static final CardBillDetailCardBenefitCategoryLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 49;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 13;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        CardBillDetailCardBenefitCategoryLocal$$serializer cardBillDetailCardBenefitCategoryLocal$$serializer = new CardBillDetailCardBenefitCategoryLocal$$serializer();
        INSTANCE = cardBillDetailCardBenefitCategoryLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.CardBillDetailCardBenefitCategoryLocal", cardBillDetailCardBenefitCategoryLocal$$serializer, 3);
        setanimationsloop.onWarmupCompleted("header", false);
        setanimationsloop.onWarmupCompleted("leftCard", false);
        setanimationsloop.onWarmupCompleted("rightCard", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 3;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 89 / 0;
        }
    }

    private CardBillDetailCardBenefitCategoryLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            KSerializer<?> kSerializer = CardBillDetailCardBenefitCategoryLocal$CardBenefitInfo$$serializer.INSTANCE;
            return new KSerializer[]{CardBillDetailCardBenefitCategoryLocal$Header$$serializer.INSTANCE, kSerializer, sp.IAuthTabCallback(kSerializer)};
        }
        KSerializer<?> kSerializer2 = CardBillDetailCardBenefitCategoryLocal$CardBenefitInfo$$serializer.INSTANCE;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(kSerializer2);
        KSerializer<?>[] kSerializerArr = new KSerializer[3];
        kSerializerArr[1] = CardBillDetailCardBenefitCategoryLocal$Header$$serializer.INSTANCE;
        kSerializerArr[1] = kSerializer2;
        kSerializerArr[4] = kSerializerIAuthTabCallback;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CardBillDetailCardBenefitCategoryLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        CardBillDetailCardBenefitCategoryLocal.CardBenefitInfo cardBenefitInfo;
        CardBillDetailCardBenefitCategoryLocal.Header header;
        CardBillDetailCardBenefitCategoryLocal.CardBenefitInfo cardBenefitInfo2;
        int iOnNavigationEvent;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        CardBillDetailCardBenefitCategoryLocal.CardBenefitInfo cardBenefitInfo3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            CardBillDetailCardBenefitCategoryLocal.Header header2 = (CardBillDetailCardBenefitCategoryLocal.Header) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, CardBillDetailCardBenefitCategoryLocal$Header$$serializer.INSTANCE, (Object) null);
            CardBillDetailCardBenefitCategoryLocal$CardBenefitInfo$$serializer cardBillDetailCardBenefitCategoryLocal$CardBenefitInfo$$serializer = CardBillDetailCardBenefitCategoryLocal$CardBenefitInfo$$serializer.INSTANCE;
            CardBillDetailCardBenefitCategoryLocal.CardBenefitInfo cardBenefitInfo4 = (CardBillDetailCardBenefitCategoryLocal.CardBenefitInfo) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, cardBillDetailCardBenefitCategoryLocal$CardBenefitInfo$$serializer, (Object) null);
            cardBenefitInfo2 = (CardBillDetailCardBenefitCategoryLocal.CardBenefitInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, cardBillDetailCardBenefitCategoryLocal$CardBenefitInfo$$serializer, (Object) null);
            header = header2;
            i = 7;
            cardBenefitInfo = cardBenefitInfo4;
        } else {
            int i3 = onWarmupCompleted + 27;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            boolean z = true;
            CardBillDetailCardBenefitCategoryLocal.Header header3 = null;
            CardBillDetailCardBenefitCategoryLocal.CardBenefitInfo cardBenefitInfo5 = null;
            while (z) {
                int i6 = onWarmupCompleted + 47;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    int i7 = 7 / 0;
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent != 0) {
                        header3 = (CardBillDetailCardBenefitCategoryLocal.Header) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, CardBillDetailCardBenefitCategoryLocal$Header$$serializer.INSTANCE, header3);
                        i5 |= 1;
                    } else if (iOnNavigationEvent == 1) {
                        cardBenefitInfo3 = (CardBillDetailCardBenefitCategoryLocal.CardBenefitInfo) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, CardBillDetailCardBenefitCategoryLocal$CardBenefitInfo$$serializer.INSTANCE, cardBenefitInfo3);
                        i5 |= 2;
                    } else {
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        cardBenefitInfo5 = (CardBillDetailCardBenefitCategoryLocal.CardBenefitInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, CardBillDetailCardBenefitCategoryLocal$CardBenefitInfo$$serializer.INSTANCE, cardBenefitInfo5);
                        i5 |= 4;
                    }
                } else {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent != 0) {
                    }
                }
            }
            i = i5;
            cardBenefitInfo = cardBenefitInfo3;
            header = header3;
            cardBenefitInfo2 = cardBenefitInfo5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CardBillDetailCardBenefitCategoryLocal(i, header, cardBenefitInfo, cardBenefitInfo2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m307deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        CardBillDetailCardBenefitCategoryLocal cardBillDetailCardBenefitCategoryLocalDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 27 / 0;
        }
        return cardBillDetailCardBenefitCategoryLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CardBillDetailCardBenefitCategoryLocal cardBillDetailCardBenefitCategoryLocal) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(cardBillDetailCardBenefitCategoryLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CardBillDetailCardBenefitCategoryLocal.IAuthTabCallback(cardBillDetailCardBenefitCategoryLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 37;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        serialize(encoder, (CardBillDetailCardBenefitCategoryLocal) obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 13;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
