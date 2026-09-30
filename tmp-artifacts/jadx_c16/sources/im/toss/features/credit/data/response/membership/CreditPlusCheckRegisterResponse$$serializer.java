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
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusCheckRegisterResponse$$serializer implements aeu2<CreditPlusCheckRegisterResponse> {
    public static final CreditPlusCheckRegisterResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 107;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 57;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        CreditPlusCheckRegisterResponse$$serializer creditPlusCheckRegisterResponse$$serializer = new CreditPlusCheckRegisterResponse$$serializer();
        INSTANCE = creditPlusCheckRegisterResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.membership.CreditPlusCheckRegisterResponse", creditPlusCheckRegisterResponse$$serializer, 4);
        setanimationsloop.onWarmupCompleted("registered", true);
        setanimationsloop.onWarmupCompleted("isFreeTrial", true);
        setanimationsloop.onWarmupCompleted("hasActivatedBillingKey", true);
        setanimationsloop.onWarmupCompleted("remainingDays", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 91;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private CreditPlusCheckRegisterResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(oty1.onExtraCallback);
            kSerializerArr = new KSerializer[2];
            getBgColor getbgcolor = getBgColor.IAuthTabCallback;
            kSerializerArr[1] = getbgcolor;
            kSerializerArr[1] = getbgcolor;
            kSerializerArr[3] = getbgcolor;
            kSerializerArr[3] = kSerializerIAuthTabCallback;
        } else {
            KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(oty1.onExtraCallback);
            getBgColor getbgcolor2 = getBgColor.IAuthTabCallback;
            kSerializerArr = new KSerializer[]{getbgcolor2, getbgcolor2, getbgcolor2, kSerializerIAuthTabCallback2};
        }
        int i3 = onNavigationEvent + 35;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CreditPlusCheckRegisterResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean zOnExtraCallbackWithResult;
        boolean z;
        Long l;
        int i;
        boolean z2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
            boolean zOnExtraCallbackWithResult3 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
            z = zOnExtraCallbackWithResult2;
            l = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, oty1.onExtraCallback, (Object) null);
            i = 15;
            z2 = zOnExtraCallbackWithResult3;
        } else {
            Long l2 = null;
            boolean z3 = true;
            boolean zOnExtraCallbackWithResult4 = false;
            boolean zOnExtraCallbackWithResult5 = false;
            int i3 = 0;
            boolean zOnExtraCallbackWithResult6 = false;
            while (z3) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = onExtraCallbackWithResult + 21;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        zOnExtraCallbackWithResult5 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
                        i3 |= 1;
                    } else if (iOnNavigationEvent == 1) {
                        zOnExtraCallbackWithResult6 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
                        i3 |= 2;
                    } else if (iOnNavigationEvent == 2) {
                        zOnExtraCallbackWithResult4 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
                        i3 |= 4;
                    } else {
                        if (iOnNavigationEvent != 3) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        l2 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, oty1.onExtraCallback, l2);
                        i3 |= 8;
                    }
                } else {
                    int i5 = onExtraCallbackWithResult + 31;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    z3 = false;
                }
            }
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult4;
            z = zOnExtraCallbackWithResult5;
            l = l2;
            i = i3;
            z2 = zOnExtraCallbackWithResult6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditPlusCheckRegisterResponse(i, z, z2, zOnExtraCallbackWithResult, l, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m203deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditPlusCheckRegisterResponse creditPlusCheckRegisterResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(creditPlusCheckRegisterResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CreditPlusCheckRegisterResponse.IAuthTabCallback(creditPlusCheckRegisterResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditPlusCheckRegisterResponse) obj);
        int i4 = onNavigationEvent + 9;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
