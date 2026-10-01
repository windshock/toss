package im.toss.features.credit.data.response.membership;

import im.toss.features.credit.data.response.membership.CreditPlusGiftInfoResponse;
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
public final /* synthetic */ class CreditPlusGiftInfoResponse$$serializer implements aeu2<CreditPlusGiftInfoResponse> {
    private static int IAuthTabCallback = 0;
    public static final CreditPlusGiftInfoResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        CreditPlusGiftInfoResponse$$serializer creditPlusGiftInfoResponse$$serializer = new CreditPlusGiftInfoResponse$$serializer();
        INSTANCE = creditPlusGiftInfoResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.membership.CreditPlusGiftInfoResponse", creditPlusGiftInfoResponse$$serializer, 2);
        setanimationsloop.onWarmupCompleted("redeemStatus", true);
        setanimationsloop.onWarmupCompleted("giftInfo", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 39;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private CreditPlusGiftInfoResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return new KSerializer[]{CreditPlusGiftInfoResponse.onExtraCallbackWithResult()[0].getValue(), sp.IAuthTabCallback(CreditPlusGiftInfoResponse$GiftInfo$$serializer.INSTANCE)};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[5];
        kSerializerArr[0] = CreditPlusGiftInfoResponse.onExtraCallbackWithResult()[1].getValue();
        kSerializerArr[0] = sp.IAuthTabCallback(CreditPlusGiftInfoResponse$GiftInfo$$serializer.INSTANCE);
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CreditPlusGiftInfoResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        CreditGiftRedeemStatus creditGiftRedeemStatus;
        CreditPlusGiftInfoResponse.GiftInfo giftInfo;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            CreditPlusGiftInfoResponse.onExtraCallbackWithResult();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = CreditPlusGiftInfoResponse.onExtraCallbackWithResult();
        if (ywVarOnWarmupCompleted2.extraCallbackWithResult()) {
            int i4 = onNavigationEvent + 11;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            creditGiftRedeemStatus = (CreditGiftRedeemStatus) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), (Object) null);
            giftInfo = (CreditPlusGiftInfoResponse.GiftInfo) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, CreditPlusGiftInfoResponse$GiftInfo$$serializer.INSTANCE, (Object) null);
            i = 3;
        } else {
            CreditGiftRedeemStatus creditGiftRedeemStatus2 = null;
            CreditPlusGiftInfoResponse.GiftInfo giftInfo2 = null;
            boolean z = true;
            int i6 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i7 = onNavigationEvent + 11;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 == 0) {
                        if (iOnNavigationEvent != 0) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        giftInfo2 = (CreditPlusGiftInfoResponse.GiftInfo) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, CreditPlusGiftInfoResponse$GiftInfo$$serializer.INSTANCE, giftInfo2);
                        i6 |= 2;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        giftInfo2 = (CreditPlusGiftInfoResponse.GiftInfo) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, CreditPlusGiftInfoResponse$GiftInfo$$serializer.INSTANCE, giftInfo2);
                        i6 |= 2;
                    }
                } else {
                    creditGiftRedeemStatus2 = (CreditGiftRedeemStatus) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), creditGiftRedeemStatus2);
                    i6 |= 1;
                }
            }
            creditGiftRedeemStatus = creditGiftRedeemStatus2;
            giftInfo = giftInfo2;
            i = i6;
        }
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        return new CreditPlusGiftInfoResponse(i, creditGiftRedeemStatus, giftInfo, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m206deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditPlusGiftInfoResponse creditPlusGiftInfoResponse) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(creditPlusGiftInfoResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CreditPlusGiftInfoResponse.onExtraCallbackWithResult(creditPlusGiftInfoResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(creditPlusGiftInfoResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        CreditPlusGiftInfoResponse.onExtraCallbackWithResult(creditPlusGiftInfoResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditPlusGiftInfoResponse) obj);
        int i4 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 123;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
