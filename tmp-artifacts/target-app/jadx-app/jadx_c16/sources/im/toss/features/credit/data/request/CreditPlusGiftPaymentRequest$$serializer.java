package im.toss.features.credit.data.request;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
import o.getWriggleLayout;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftPaymentRequest$$serializer implements aeu2<CreditPlusGiftPaymentRequest> {
    private static int IAuthTabCallback = 1;
    public static final CreditPlusGiftPaymentRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 7;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 75;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        CreditPlusGiftPaymentRequest$$serializer creditPlusGiftPaymentRequest$$serializer = new CreditPlusGiftPaymentRequest$$serializer();
        INSTANCE = creditPlusGiftPaymentRequest$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.request.CreditPlusGiftPaymentRequest", creditPlusGiftPaymentRequest$$serializer, 6);
        setanimationsloop.onWarmupCompleted("itemId", false);
        setanimationsloop.onWarmupCompleted("recipientUserNo", true);
        setanimationsloop.onWarmupCompleted("recipientPhoneNo", true);
        setanimationsloop.onWarmupCompleted("postcardType", true);
        setanimationsloop.onWarmupCompleted("postcardMessage", true);
        setanimationsloop.onWarmupCompleted("isTest", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 7;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private CreditPlusGiftPaymentRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = oty1.onExtraCallback;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializer2 = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializer, kSerializerIAuthTabCallback, sp.IAuthTabCallback(kSerializer2), kSerializer2, kSerializer2, getBgColor.IAuthTabCallback};
        int i4 = onWarmupCompleted + 59;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CreditPlusGiftPaymentRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean zOnExtraCallbackWithResult;
        int i;
        String str;
        String str2;
        String str3;
        Long l;
        long j;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            long jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
            Long l2 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, oty1.onExtraCallback, (Object) null);
            String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, (Object) null);
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            str3 = str4;
            l = l2;
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5);
            str = strAsInterface;
            str2 = strAsInterface2;
            i = 63;
            j = jIAuthTabCallbackDefault;
        } else {
            boolean z = true;
            boolean zOnExtraCallbackWithResult2 = false;
            String str5 = null;
            Long l3 = null;
            long jIAuthTabCallbackDefault2 = 0;
            String strAsInterface3 = null;
            String strAsInterface4 = null;
            int i3 = 0;
            while (z) {
                int i4 = IAuthTabCallback + 51;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                    case 0:
                        jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                        i3 |= 1;
                    case 1:
                        l3 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, oty1.onExtraCallback, l3);
                        i3 |= 2;
                    case 2:
                        str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str5);
                        i3 |= 4;
                    case 3:
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i3 |= 8;
                        int i6 = IAuthTabCallback + 99;
                        onWarmupCompleted = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i7 = 3 / 4;
                        }
                    case 4:
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i3 |= 16;
                    case 5:
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5);
                        i3 |= 32;
                        int i8 = onWarmupCompleted + 69;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            int i10 = onWarmupCompleted + 55;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 4 / 3;
            }
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
            i = i3;
            str = strAsInterface3;
            str2 = strAsInterface4;
            str3 = str5;
            l = l3;
            j = jIAuthTabCallbackDefault2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditPlusGiftPaymentRequest(i, j, l, str3, str, str2, zOnExtraCallbackWithResult, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m133deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CreditPlusGiftPaymentRequest creditPlusGiftPaymentRequestDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
        return creditPlusGiftPaymentRequestDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditPlusGiftPaymentRequest creditPlusGiftPaymentRequest) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(creditPlusGiftPaymentRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CreditPlusGiftPaymentRequest.onWarmupCompleted(creditPlusGiftPaymentRequest, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 89;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditPlusGiftPaymentRequest) obj);
        int i4 = onWarmupCompleted + 89;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 97;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
