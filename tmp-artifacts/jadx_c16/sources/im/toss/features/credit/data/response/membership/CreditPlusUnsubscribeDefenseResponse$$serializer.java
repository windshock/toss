package im.toss.features.credit.data.response.membership;

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
import o.getBgColor;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusUnsubscribeDefenseResponse$$serializer implements aeu2<CreditPlusUnsubscribeDefenseResponse> {
    private static int IAuthTabCallback = 1;
    public static final CreditPlusUnsubscribeDefenseResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 123;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 23;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 38 / 0;
        }
        return serialDescriptor;
    }

    static {
        CreditPlusUnsubscribeDefenseResponse$$serializer creditPlusUnsubscribeDefenseResponse$$serializer = new CreditPlusUnsubscribeDefenseResponse$$serializer();
        INSTANCE = creditPlusUnsubscribeDefenseResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.membership.CreditPlusUnsubscribeDefenseResponse", creditPlusUnsubscribeDefenseResponse$$serializer, 2);
        setanimationsloop.onWarmupCompleted("benefitStatusSection", true);
        setanimationsloop.onWarmupCompleted("isRefundable", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 73;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private CreditPlusUnsubscribeDefenseResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback((KSerializer) CreditPlusUnsubscribeDefenseResponse.onWarmupCompleted()[0].getValue()), sp.IAuthTabCallback(getBgColor.IAuthTabCallback)};
        int i4 = onExtraCallbackWithResult + 1;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CreditPlusUnsubscribeDefenseResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        Boolean bool;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = CreditPlusUnsubscribeDefenseResponse.onWarmupCompleted();
        int i2 = 3;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            list = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), (Object) null);
            bool = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getBgColor.IAuthTabCallback, (Object) null);
        } else {
            List list2 = null;
            Boolean bool2 = null;
            int i3 = 0;
            boolean z = true;
            while (z) {
                int i4 = onExtraCallbackWithResult + 91;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), list2);
                    i3 |= 1;
                    int i6 = onExtraCallback + 81;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i8 = onExtraCallback + 15;
                    onExtraCallbackWithResult = i8 % 128;
                    if (i8 % 2 != 0) {
                        bool2 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getBgColor.IAuthTabCallback, bool2);
                        i3 = 3;
                    } else {
                        bool2 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getBgColor.IAuthTabCallback, bool2);
                        i3 |= 2;
                    }
                }
            }
            list = list2;
            bool = bool2;
            i2 = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditPlusUnsubscribeDefenseResponse(i2, list, bool, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m220deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            throw null;
        }
        CreditPlusUnsubscribeDefenseResponse creditPlusUnsubscribeDefenseResponseDeserialize = deserialize(decoder);
        int i3 = onExtraCallback + 39;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 36 / 0;
        }
        return creditPlusUnsubscribeDefenseResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditPlusUnsubscribeDefenseResponse creditPlusUnsubscribeDefenseResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(creditPlusUnsubscribeDefenseResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CreditPlusUnsubscribeDefenseResponse.onExtraCallbackWithResult(creditPlusUnsubscribeDefenseResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 101;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditPlusUnsubscribeDefenseResponse) obj);
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 91;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
