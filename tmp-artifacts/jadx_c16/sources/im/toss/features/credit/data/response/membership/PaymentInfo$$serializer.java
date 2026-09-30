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
public final /* synthetic */ class PaymentInfo$$serializer implements aeu2<PaymentInfo> {
    private static int IAuthTabCallback = 0;
    public static final PaymentInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 85;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 34 / 0;
        }
        return serialDescriptor;
    }

    static {
        PaymentInfo$$serializer paymentInfo$$serializer = new PaymentInfo$$serializer();
        INSTANCE = paymentInfo$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.membership.PaymentInfo", paymentInfo$$serializer, 3);
        setanimationsloop.onWarmupCompleted("nextPaymentDate", true);
        setanimationsloop.onWarmupCompleted("paymentAmount", true);
        setanimationsloop.onWarmupCompleted("nextPaymentAmount", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 21;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 11 / 0;
        }
    }

    private PaymentInfo$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            return new KSerializer[]{sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout)};
        }
        getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getwrigglelayout2);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(getwrigglelayout2);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(getwrigglelayout2);
        KSerializer<?>[] kSerializerArr = new KSerializer[5];
        kSerializerArr[0] = kSerializerIAuthTabCallback;
        kSerializerArr[0] = kSerializerIAuthTabCallback2;
        kSerializerArr[5] = kSerializerIAuthTabCallback3;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final PaymentInfo deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        String str2;
        String str3;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 31;
        IAuthTabCallback = i3 % 128;
        String str4 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            str4.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            int i4 = IAuthTabCallback + 63;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            i = 7;
            str = str6;
            str3 = str5;
        } else {
            String str7 = null;
            String str8 = null;
            boolean z = true;
            int i6 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str8);
                    i6 |= 1;
                } else if (iOnNavigationEvent == 1) {
                    str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str4);
                    i6 |= 2;
                } else {
                    if (iOnNavigationEvent != 2) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str7);
                    i6 |= 4;
                }
            }
            i = i6;
            str = str4;
            str2 = str7;
            str3 = str8;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new PaymentInfo(i, str3, str, str2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m226deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        PaymentInfo paymentInfoDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 80 / 0;
        }
        return paymentInfoDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull PaymentInfo paymentInfo) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(paymentInfo, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            PaymentInfo.onExtraCallback(paymentInfo, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(paymentInfo, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        PaymentInfo.onExtraCallback(paymentInfo, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (PaymentInfo) obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 == 0) {
            int i4 = 9 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
