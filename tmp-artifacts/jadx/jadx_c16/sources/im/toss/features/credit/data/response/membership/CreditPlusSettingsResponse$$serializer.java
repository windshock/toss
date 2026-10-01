package im.toss.features.credit.data.response.membership;

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
public final /* synthetic */ class CreditPlusSettingsResponse$$serializer implements aeu2<CreditPlusSettingsResponse> {
    public static final CreditPlusSettingsResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 31;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 55;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        CreditPlusSettingsResponse$$serializer creditPlusSettingsResponse$$serializer = new CreditPlusSettingsResponse$$serializer();
        INSTANCE = creditPlusSettingsResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.membership.CreditPlusSettingsResponse", creditPlusSettingsResponse$$serializer, 2);
        setanimationsloop.onWarmupCompleted("subscribeInfo", true);
        setanimationsloop.onWarmupCompleted("paymentInfo", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 19;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private CreditPlusSettingsResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(SubscribeInfo$$serializer.INSTANCE), sp.IAuthTabCallback(PaymentInfo$$serializer.INSTANCE)};
        int i4 = onExtraCallbackWithResult + 53;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0056 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CreditPlusSettingsResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SubscribeInfo subscribeInfo;
        PaymentInfo paymentInfo;
        int iOnNavigationEvent;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i2 = 3;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            subscribeInfo = (SubscribeInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, SubscribeInfo$$serializer.INSTANCE, (Object) null);
            paymentInfo = (PaymentInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, PaymentInfo$$serializer.INSTANCE, (Object) null);
            int i3 = onWarmupCompleted + 93;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        } else {
            subscribeInfo = null;
            PaymentInfo paymentInfo2 = null;
            int i5 = 0;
            boolean z = true;
            while (z) {
                int i6 = onExtraCallbackWithResult + 125;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    int i7 = 58 / 0;
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent != 0) {
                        subscribeInfo = (SubscribeInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, SubscribeInfo$$serializer.INSTANCE, subscribeInfo);
                        i5 |= 1;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i8 = onExtraCallbackWithResult + 113;
                        onWarmupCompleted = i8 % 128;
                        if (i8 % 2 == 0) {
                            paymentInfo2 = (PaymentInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, PaymentInfo$$serializer.INSTANCE, paymentInfo2);
                            i5 = 3;
                        } else {
                            paymentInfo2 = (PaymentInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, PaymentInfo$$serializer.INSTANCE, paymentInfo2);
                            i5 |= 2;
                        }
                    }
                } else {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent != 0) {
                    }
                }
            }
            paymentInfo = paymentInfo2;
            i2 = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditPlusSettingsResponse(i2, subscribeInfo, paymentInfo, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m219deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        CreditPlusSettingsResponse creditPlusSettingsResponseDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 9;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return creditPlusSettingsResponseDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditPlusSettingsResponse creditPlusSettingsResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(creditPlusSettingsResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CreditPlusSettingsResponse.IAuthTabCallback(creditPlusSettingsResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(creditPlusSettingsResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        CreditPlusSettingsResponse.IAuthTabCallback(creditPlusSettingsResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 48 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditPlusSettingsResponse) obj);
        int i4 = onWarmupCompleted + 103;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onExtraCallbackWithResult + 25;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
