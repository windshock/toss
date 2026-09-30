package im.toss.features.credit.data.response.membership;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftPayCheckResponse$$serializer implements aeu2<CreditPlusGiftPayCheckResponse> {
    private static int IAuthTabCallback = 0;
    public static final CreditPlusGiftPayCheckResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 25;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 107;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        CreditPlusGiftPayCheckResponse$$serializer creditPlusGiftPayCheckResponse$$serializer = new CreditPlusGiftPayCheckResponse$$serializer();
        INSTANCE = creditPlusGiftPayCheckResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.membership.CreditPlusGiftPayCheckResponse", creditPlusGiftPayCheckResponse$$serializer, 2);
        setanimationsloop.onWarmupCompleted("giftHistoryId", false);
        setanimationsloop.onWarmupCompleted("isComplete", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 45;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private CreditPlusGiftPayCheckResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {oty1.onExtraCallback, getBgColor.IAuthTabCallback};
        int i4 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CreditPlusGiftPayCheckResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean zOnExtraCallbackWithResult;
        long jIAuthTabCallbackDefault;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
            i = 3;
        } else {
            int i5 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            long jIAuthTabCallbackDefault2 = 0;
            boolean zOnExtraCallbackWithResult2 = false;
            int i7 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    int i8 = onWarmupCompleted + 107;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                    i7 |= 1;
                } else {
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
                    i7 |= 2;
                }
            }
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
            jIAuthTabCallbackDefault = jIAuthTabCallbackDefault2;
            i = i7;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        CreditPlusGiftPayCheckResponse creditPlusGiftPayCheckResponse = new CreditPlusGiftPayCheckResponse(i, jIAuthTabCallbackDefault, zOnExtraCallbackWithResult, (okycx) null);
        int i10 = onWarmupCompleted + 113;
        onExtraCallbackWithResult = i10 % 128;
        int i11 = i10 % 2;
        return creditPlusGiftPayCheckResponse;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m213deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CreditPlusGiftPayCheckResponse creditPlusGiftPayCheckResponseDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return creditPlusGiftPayCheckResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditPlusGiftPayCheckResponse creditPlusGiftPayCheckResponse) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(creditPlusGiftPayCheckResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CreditPlusGiftPayCheckResponse.onNavigationEvent(creditPlusGiftPayCheckResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditPlusGiftPayCheckResponse) obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}
