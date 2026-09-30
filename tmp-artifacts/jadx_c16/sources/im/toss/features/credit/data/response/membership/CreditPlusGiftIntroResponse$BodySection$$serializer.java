package im.toss.features.credit.data.response.membership;

import im.toss.features.credit.data.response.membership.CreditPlusGiftIntroResponse;
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
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftIntroResponse$BodySection$$serializer implements aeu2<CreditPlusGiftIntroResponse.BodySection> {
    private static int IAuthTabCallback = 0;
    public static final CreditPlusGiftIntroResponse$BodySection$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 103;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 19;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        CreditPlusGiftIntroResponse$BodySection$$serializer creditPlusGiftIntroResponse$BodySection$$serializer = new CreditPlusGiftIntroResponse$BodySection$$serializer();
        INSTANCE = creditPlusGiftIntroResponse$BodySection$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.membership.CreditPlusGiftIntroResponse.BodySection", creditPlusGiftIntroResponse$BodySection$$serializer, 1);
        setanimationsloop.onWarmupCompleted("contents", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 101;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private CreditPlusGiftIntroResponse$BodySection$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return new KSerializer[]{sp.IAuthTabCallback((KSerializer) CreditPlusGiftIntroResponse.BodySection.onNavigationEvent()[0].getValue())};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[0];
        kSerializerArr[0] = sp.IAuthTabCallback((KSerializer) CreditPlusGiftIntroResponse.BodySection.onNavigationEvent()[1].getValue());
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CreditPlusGiftIntroResponse.BodySection deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = CreditPlusGiftIntroResponse.BodySection.onNavigationEvent();
        int i2 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onNavigationEvent + 109;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            list = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), (Object) null);
        } else {
            boolean z = true;
            List list2 = null;
            int i5 = 0;
            while (z) {
                int i6 = onExtraCallbackWithResult + 67;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else {
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), list2);
                    i5 = 1;
                }
            }
            list = list2;
            i2 = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        CreditPlusGiftIntroResponse.BodySection bodySection = new CreditPlusGiftIntroResponse.BodySection(i2, list, (okycx) null);
        int i7 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 0 / 0;
        }
        return bodySection;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m209deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditPlusGiftIntroResponse.BodySection bodySection) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(bodySection, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CreditPlusGiftIntroResponse.BodySection.onNavigationEvent(bodySection, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 93 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditPlusGiftIntroResponse.BodySection) obj);
        int i4 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}
