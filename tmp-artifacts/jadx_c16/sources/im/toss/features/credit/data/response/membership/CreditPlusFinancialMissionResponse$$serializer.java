package im.toss.features.credit.data.response.membership;

import im.toss.features.credit.data.response.membership.CreditPlusFinancialMissionResponse;
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
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusFinancialMissionResponse$$serializer implements aeu2<CreditPlusFinancialMissionResponse> {
    private static int IAuthTabCallback = 0;
    public static final CreditPlusFinancialMissionResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        CreditPlusFinancialMissionResponse$$serializer creditPlusFinancialMissionResponse$$serializer = new CreditPlusFinancialMissionResponse$$serializer();
        INSTANCE = creditPlusFinancialMissionResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.membership.CreditPlusFinancialMissionResponse", creditPlusFinancialMissionResponse$$serializer, 3);
        setanimationsloop.onWarmupCompleted("status", false);
        setanimationsloop.onWarmupCompleted("rewardAmount", true);
        setanimationsloop.onWarmupCompleted("balance", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 89;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private CreditPlusFinancialMissionResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        oty1 oty1Var = oty1.onExtraCallback;
        KSerializer<?>[] kSerializerArr = {CreditPlusFinancialMissionResponse.IAuthTabCallback()[0].getValue(), sp.IAuthTabCallback(oty1Var), sp.IAuthTabCallback(oty1Var)};
        int i4 = onExtraCallback + 117;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CreditPlusFinancialMissionResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        Long l;
        CreditPlusFinancialMissionResponse.Status status;
        Long l2;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = CreditPlusFinancialMissionResponse.IAuthTabCallback();
        Long l3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            CreditPlusFinancialMissionResponse.Status status2 = (CreditPlusFinancialMissionResponse.Status) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), (Object) null);
            oty1 oty1Var = oty1.onExtraCallback;
            Long l4 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, oty1Var, (Object) null);
            Long l5 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, oty1Var, (Object) null);
            int i4 = onExtraCallback + 93;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            i = 7;
            status = status2;
            l2 = l5;
            l = l4;
        } else {
            boolean z = true;
            int i6 = 0;
            CreditPlusFinancialMissionResponse.Status status3 = null;
            Long l6 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i7 = onExtraCallback;
                    int i8 = i7 + 47;
                    IAuthTabCallback = i8 % 128;
                    if (i8 % 2 != 0) {
                        if (iOnNavigationEvent != 0) {
                            i2 = i7 + 43;
                            IAuthTabCallback = i2 % 128;
                            if (i2 % 2 == 0) {
                                if (iOnNavigationEvent != 4) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                l6 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, oty1.onExtraCallback, l6);
                                i6 |= 4;
                            } else {
                                if (iOnNavigationEvent != 2) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                l6 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, oty1.onExtraCallback, l6);
                                i6 |= 4;
                            }
                        } else {
                            l3 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, oty1.onExtraCallback, l3);
                            i6 |= 2;
                            int i9 = IAuthTabCallback + 117;
                            onExtraCallback = i9 % 128;
                            int i10 = i9 % 2;
                        }
                    } else if (iOnNavigationEvent != 1) {
                        i2 = i7 + 43;
                        IAuthTabCallback = i2 % 128;
                        if (i2 % 2 == 0) {
                        }
                    } else {
                        l3 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, oty1.onExtraCallback, l3);
                        i6 |= 2;
                        int i92 = IAuthTabCallback + 117;
                        onExtraCallback = i92 % 128;
                        int i102 = i92 % 2;
                    }
                } else {
                    status3 = (CreditPlusFinancialMissionResponse.Status) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), status3);
                    i6 |= 1;
                }
            }
            i = i6;
            l = l3;
            status = status3;
            l2 = l6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditPlusFinancialMissionResponse(i, status, l, l2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m204deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            obj.hashCode();
            throw null;
        }
        CreditPlusFinancialMissionResponse creditPlusFinancialMissionResponseDeserialize = deserialize(decoder);
        int i3 = onExtraCallback + 101;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return creditPlusFinancialMissionResponseDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditPlusFinancialMissionResponse creditPlusFinancialMissionResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(creditPlusFinancialMissionResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CreditPlusFinancialMissionResponse.onWarmupCompleted(creditPlusFinancialMissionResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 11 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(creditPlusFinancialMissionResponse, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            CreditPlusFinancialMissionResponse.onWarmupCompleted(creditPlusFinancialMissionResponse, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = IAuthTabCallback + 37;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditPlusFinancialMissionResponse) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallback + 3;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 65 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = onExtraCallback + 81;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
