package im.toss.features.cardrecommend.home.model.benefit;

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
public final /* synthetic */ class CardRecommendBenefitResp$$serializer implements aeu2<CardRecommendBenefitResp> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final CardRecommendBenefitResp$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 75;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 59;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        CardRecommendBenefitResp$$serializer cardRecommendBenefitResp$$serializer = new CardRecommendBenefitResp$$serializer();
        INSTANCE = cardRecommendBenefitResp$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.cardrecommend.home.model.benefit.CardRecommendBenefitResp", cardRecommendBenefitResp$$serializer, 3);
        setanimationsloop.onWarmupCompleted("headerTitle", true);
        setanimationsloop.onWarmupCompleted("iconUrl", true);
        setanimationsloop.onWarmupCompleted("rankBoardList", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 3;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private CardRecommendBenefitResp$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallback = CardRecommendBenefitResp.onExtraCallback();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, lazyArrOnExtraCallback[2].getValue()};
        int i4 = onWarmupCompleted + 19;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CardRecommendBenefitResp deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        List list;
        String str2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallback = CardRecommendBenefitResp.onExtraCallback();
        String strAsInterface = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onExtraCallback + 59;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnExtraCallback[2].getValue(), (Object) null);
            i = 7;
            str2 = strAsInterface2;
            str = strAsInterface3;
        } else {
            int i5 = 0;
            List list2 = null;
            String strAsInterface4 = null;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i5 |= 1;
                } else if (iOnNavigationEvent == 1) {
                    strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                    i5 |= 2;
                } else {
                    if (iOnNavigationEvent != 2) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i6 = onExtraCallback + 11;
                    onWarmupCompleted = i6 % 128;
                    list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) (i6 % 2 != 0 ? lazyArrOnExtraCallback[5] : lazyArrOnExtraCallback[2]).getValue(), list2);
                    i5 |= 4;
                }
            }
            int i7 = onExtraCallback + 49;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            i = i5;
            str = strAsInterface;
            list = list2;
            str2 = strAsInterface4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CardRecommendBenefitResp(i, str2, str, list, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m103deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        CardRecommendBenefitResp cardRecommendBenefitRespDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 111;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return cardRecommendBenefitRespDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CardRecommendBenefitResp cardRecommendBenefitResp) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(cardRecommendBenefitResp, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CardRecommendBenefitResp.onNavigationEvent(cardRecommendBenefitResp, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 79;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CardRecommendBenefitResp) obj);
        int i4 = onWarmupCompleted + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onExtraCallback + 69;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
