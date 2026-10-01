package im.toss.features.cardrecommend.home.model.feed;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.WifiInfoExtension;
import o.aeu2;
import o.getWifiInfo;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardRecommendFeedResp$$serializer implements aeu2<CardRecommendFeedResp> {
    public static final int $stable;
    public static final CardRecommendFeedResp$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        CardRecommendFeedResp$$serializer cardRecommendFeedResp$$serializer = new CardRecommendFeedResp$$serializer();
        INSTANCE = cardRecommendFeedResp$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.cardrecommend.home.model.feed.CardRecommendFeedResp", cardRecommendFeedResp$$serializer, 2);
        setanimationsloop.onWarmupCompleted("components", true);
        setanimationsloop.onWarmupCompleted("cardType", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private CardRecommendFeedResp$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlinx.serialization.KSerializer[]] */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlinx.serialization.KSerializer[]] */
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Lazy[] lazyArrIAuthTabCallback = CardRecommendFeedResp.IAuthTabCallback();
            ?? r4 = new KSerializer[5];
            r4[1] = WifiInfoExtension.INSTANCE;
            r4[1] = lazyArrIAuthTabCallback[0].getValue();
            kSerializerArr = r4;
        } else {
            kSerializerArr = new KSerializer[]{WifiInfoExtension.INSTANCE, CardRecommendFeedResp.IAuthTabCallback()[1].getValue()};
        }
        int i3 = onNavigationEvent + 47;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 27 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CardRecommendFeedResp deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        getWifiInfo getwifiinfo;
        int i;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = CardRecommendFeedResp.IAuthTabCallback();
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            list = null;
            getwifiinfo = null;
            i = 0;
            boolean z = true;
            while (z) {
                int i4 = onExtraCallback + 33;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = onExtraCallback + 75;
                    int i7 = i6 % 128;
                    onNavigationEvent = i7;
                    if (i6 % 2 == 0) {
                        int i8 = 85 / 0;
                        if (iOnNavigationEvent != 0) {
                            i2 = i7 + 51;
                            onExtraCallback = i2 % 128;
                            if (i2 % 2 == 0) {
                                if (iOnNavigationEvent != 0) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                getwifiinfo = (getWifiInfo) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), getwifiinfo);
                                i |= 2;
                            } else {
                                if (iOnNavigationEvent != 1) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                getwifiinfo = (getWifiInfo) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), getwifiinfo);
                                i |= 2;
                            }
                        } else {
                            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, WifiInfoExtension.INSTANCE, list);
                            i |= 1;
                        }
                    } else if (iOnNavigationEvent != 0) {
                        i2 = i7 + 51;
                        onExtraCallback = i2 % 128;
                        if (i2 % 2 == 0) {
                        }
                    } else {
                        list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, WifiInfoExtension.INSTANCE, list);
                        i |= 1;
                    }
                } else {
                    z = false;
                }
            }
        } else {
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, WifiInfoExtension.INSTANCE, (Object) null);
            getwifiinfo = (getWifiInfo) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), (Object) null);
            i = 3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CardRecommendFeedResp(i, list, getwifiinfo, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m104deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CardRecommendFeedResp cardRecommendFeedRespDeserialize = deserialize(decoder);
        int i3 = onExtraCallback + 61;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 20 / 0;
        }
        return cardRecommendFeedRespDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CardRecommendFeedResp cardRecommendFeedResp) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(cardRecommendFeedResp, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CardRecommendFeedResp.onExtraCallbackWithResult(cardRecommendFeedResp, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 43;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CardRecommendFeedResp) obj);
        int i4 = onExtraCallback + 121;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 29;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
