package im.toss.features.credit.data.response.membership;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftRefundResponse$$serializer implements aeu2<CreditPlusGiftRefundResponse> {
    private static int IAuthTabCallback = 1;
    public static final CreditPlusGiftRefundResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        return serialDescriptor;
    }

    static {
        CreditPlusGiftRefundResponse$$serializer creditPlusGiftRefundResponse$$serializer = new CreditPlusGiftRefundResponse$$serializer();
        INSTANCE = creditPlusGiftRefundResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.membership.CreditPlusGiftRefundResponse", creditPlusGiftRefundResponse$$serializer, 4);
        setanimationsloop.onWarmupCompleted("sentDate", false);
        setanimationsloop.onWarmupCompleted("cancelDate", false);
        setanimationsloop.onWarmupCompleted("recipientName", false);
        setanimationsloop.onWarmupCompleted("recipientPhoneNumber", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private CreditPlusGiftRefundResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout)};
        int i4 = onExtraCallback + 89;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CreditPlusGiftRefundResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        String str2;
        int i;
        String str3;
        String str4;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 47;
        onExtraCallback = i3 % 128;
        String str5 = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            i = 15;
            str4 = str6;
            str3 = str7;
        } else {
            String str8 = null;
            String str9 = null;
            String str10 = null;
            int i4 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str10);
                    i4 |= 1;
                } else if (iOnNavigationEvent == 1) {
                    str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str9);
                    i4 |= 2;
                } else if (iOnNavigationEvent == 2) {
                    str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str5);
                    i4 |= 4;
                    int i5 = onExtraCallback + 85;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 3 / 3;
                    }
                } else {
                    if (iOnNavigationEvent != 3) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str8);
                    i4 |= 8;
                }
            }
            str = str8;
            str2 = str5;
            i = i4;
            str3 = str9;
            str4 = str10;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditPlusGiftRefundResponse(i, str4, str3, str2, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m216deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        CreditPlusGiftRefundResponse creditPlusGiftRefundResponseDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 17;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return creditPlusGiftRefundResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditPlusGiftRefundResponse creditPlusGiftRefundResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(creditPlusGiftRefundResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CreditPlusGiftRefundResponse.onExtraCallbackWithResult(creditPlusGiftRefundResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 81;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditPlusGiftRefundResponse) obj);
        int i4 = onWarmupCompleted + 101;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onExtraCallback + 11;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
