package im.toss.features.credit.data.response.membership;

import im.toss.features.credit.data.response.membership.CreditPlusBillingKeyStatusResponse;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusBillingKeyStatusResponse$$serializer implements aeu2<CreditPlusBillingKeyStatusResponse> {
    private static int IAuthTabCallback = 0;
    public static final CreditPlusBillingKeyStatusResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 == 0) {
            int i4 = 71 / 0;
        }
        return serialDescriptor;
    }

    static {
        CreditPlusBillingKeyStatusResponse$$serializer creditPlusBillingKeyStatusResponse$$serializer = new CreditPlusBillingKeyStatusResponse$$serializer();
        INSTANCE = creditPlusBillingKeyStatusResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.membership.CreditPlusBillingKeyStatusResponse", creditPlusBillingKeyStatusResponse$$serializer, 2);
        setanimationsloop.onWarmupCompleted("billingKey", true);
        setanimationsloop.onWarmupCompleted("billingKeyStatus", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 91;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private CreditPlusBillingKeyStatusResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), CreditPlusBillingKeyStatusResponse.IAuthTabCallback()[1].getValue()};
        int i4 = onExtraCallback + 25;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CreditPlusBillingKeyStatusResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        CreditPlusBillingKeyStatusResponse.Status status;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 7;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            CreditPlusBillingKeyStatusResponse.IAuthTabCallback();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = CreditPlusBillingKeyStatusResponse.IAuthTabCallback();
        if (ywVarOnWarmupCompleted2.extraCallbackWithResult()) {
            str = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            status = (CreditPlusBillingKeyStatusResponse.Status) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), (Object) null);
            i = 3;
        } else {
            String str2 = null;
            CreditPlusBillingKeyStatusResponse.Status status2 = null;
            int i4 = 0;
            boolean z = true;
            while (z) {
                int i5 = IAuthTabCallback + 23;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i7 = IAuthTabCallback;
                    int i8 = i7 + 5;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    if (iOnNavigationEvent != 0) {
                        int i10 = i7 + 85;
                        onExtraCallback = i10 % 128;
                        if (i10 % 2 == 0) {
                            if (iOnNavigationEvent != 0) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            status2 = (CreditPlusBillingKeyStatusResponse.Status) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), status2);
                            i4 |= 2;
                        } else {
                            if (iOnNavigationEvent != 1) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            status2 = (CreditPlusBillingKeyStatusResponse.Status) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), status2);
                            i4 |= 2;
                        }
                    } else {
                        str2 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str2);
                        i4 |= 1;
                        int i11 = IAuthTabCallback + 77;
                        onExtraCallback = i11 % 128;
                        int i12 = i11 % 2;
                    }
                } else {
                    z = false;
                }
            }
            str = str2;
            status = status2;
            i = i4;
        }
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        return new CreditPlusBillingKeyStatusResponse(i, str, status, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m202deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditPlusBillingKeyStatusResponse creditPlusBillingKeyStatusResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(creditPlusBillingKeyStatusResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CreditPlusBillingKeyStatusResponse.onNavigationEvent(creditPlusBillingKeyStatusResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 121;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditPlusBillingKeyStatusResponse) obj);
        int i4 = IAuthTabCallback + 87;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 52 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = onExtraCallback + 87;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
