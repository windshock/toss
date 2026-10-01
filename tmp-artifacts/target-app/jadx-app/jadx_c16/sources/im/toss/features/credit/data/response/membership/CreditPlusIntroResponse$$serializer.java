package im.toss.features.credit.data.response.membership;

import im.toss.features.credit.data.response.Disclaimer;
import im.toss.features.credit.data.response.Disclaimer$$serializer;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getDynamicHeight;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusIntroResponse$$serializer implements aeu2<CreditPlusIntroResponse> {
    public static final CreditPlusIntroResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 45;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 21;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        CreditPlusIntroResponse$$serializer creditPlusIntroResponse$$serializer = new CreditPlusIntroResponse$$serializer();
        INSTANCE = creditPlusIntroResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.membership.CreditPlusIntroResponse", creditPlusIntroResponse$$serializer, 2);
        setanimationsloop.onWarmupCompleted("creditScore", true);
        setanimationsloop.onWarmupCompleted("disclaimer", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 75;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private CreditPlusIntroResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return new KSerializer[]{sp.IAuthTabCallback(getDynamicHeight.onWarmupCompleted), sp.IAuthTabCallback(Disclaimer$$serializer.INSTANCE)};
        }
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getDynamicHeight.onWarmupCompleted);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(Disclaimer$$serializer.INSTANCE);
        KSerializer<?>[] kSerializerArr = new KSerializer[5];
        kSerializerArr[0] = kSerializerIAuthTabCallback;
        kSerializerArr[1] = kSerializerIAuthTabCallback2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CreditPlusIntroResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Integer num;
        Disclaimer disclaimer;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i2 = 3;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            num = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getDynamicHeight.onWarmupCompleted, (Object) null);
            disclaimer = (Disclaimer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, Disclaimer$$serializer.INSTANCE, (Object) null);
        } else {
            Integer num2 = null;
            Disclaimer disclaimer2 = null;
            int i3 = 0;
            boolean z = true;
            while (z) {
                int i4 = onExtraCallbackWithResult + 9;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = onWarmupCompleted + 9;
                    int i7 = i6 % 128;
                    onExtraCallbackWithResult = i7;
                    int i8 = i6 % 2;
                    if (iOnNavigationEvent == 0) {
                        num2 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getDynamicHeight.onWarmupCompleted, num2);
                        i3 |= 1;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i9 = i7 + 105;
                        onWarmupCompleted = i9 % 128;
                        if (i9 % 2 == 0) {
                            disclaimer2 = (Disclaimer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, Disclaimer$$serializer.INSTANCE, disclaimer2);
                            i3 = 3;
                        } else {
                            disclaimer2 = (Disclaimer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, Disclaimer$$serializer.INSTANCE, disclaimer2);
                            i3 |= 2;
                        }
                    }
                } else {
                    z = false;
                }
            }
            num = num2;
            disclaimer = disclaimer2;
            i2 = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditPlusIntroResponse(i2, num, disclaimer, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m218deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            throw null;
        }
        CreditPlusIntroResponse creditPlusIntroResponseDeserialize = deserialize(decoder);
        int i3 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return creditPlusIntroResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditPlusIntroResponse creditPlusIntroResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(creditPlusIntroResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CreditPlusIntroResponse.onExtraCallback(creditPlusIntroResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(creditPlusIntroResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        CreditPlusIntroResponse.onExtraCallback(creditPlusIntroResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onExtraCallbackWithResult + 81;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 38 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditPlusIntroResponse) obj);
        int i4 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
