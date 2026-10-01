package im.toss.features.leave.domain.response;

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
import o.oty1;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class VisitorRemainingBalanceInfoResponse$$serializer implements aeu2<VisitorRemainingBalanceInfoResponse> {
    private static int IAuthTabCallback = 0;
    public static final VisitorRemainingBalanceInfoResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 99;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        VisitorRemainingBalanceInfoResponse$$serializer visitorRemainingBalanceInfoResponse$$serializer = new VisitorRemainingBalanceInfoResponse$$serializer();
        INSTANCE = visitorRemainingBalanceInfoResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.leave.domain.response.VisitorRemainingBalanceInfoResponse", visitorRemainingBalanceInfoResponse$$serializer, 5);
        setanimationsloop.onWarmupCompleted("maxWithdrawLimit", false);
        setanimationsloop.onWarmupCompleted("remainingWithdrawAmount", false);
        setanimationsloop.onWarmupCompleted("minimumWithdrawAmount", false);
        setanimationsloop.onWarmupCompleted("commission", false);
        setanimationsloop.onWarmupCompleted("cvsWithdrawScheme", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 121;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private VisitorRemainingBalanceInfoResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            oty1 oty1Var = oty1.onExtraCallback;
            return new KSerializer[]{oty1Var, oty1Var, oty1Var, oty1Var, getWriggleLayout.onNavigationEvent};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[2];
        oty1 oty1Var2 = oty1.onExtraCallback;
        kSerializerArr[1] = oty1Var2;
        kSerializerArr[1] = oty1Var2;
        kSerializerArr[5] = oty1Var2;
        kSerializerArr[2] = oty1Var2;
        kSerializerArr[4] = getWriggleLayout.onNavigationEvent;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final VisitorRemainingBalanceInfoResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        long j;
        int i;
        long j2;
        long j3;
        long j4;
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = IAuthTabCallback + 35;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            long jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
            long jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
            long jIAuthTabCallbackDefault3 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 2);
            long jIAuthTabCallbackDefault4 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 3);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            j = jIAuthTabCallbackDefault4;
            i = 31;
            j2 = jIAuthTabCallbackDefault2;
            j3 = jIAuthTabCallbackDefault;
            j4 = jIAuthTabCallbackDefault3;
        } else {
            long jIAuthTabCallbackDefault5 = 0;
            String strAsInterface2 = null;
            int i7 = 0;
            boolean z = true;
            long jIAuthTabCallbackDefault6 = 0;
            long jIAuthTabCallbackDefault7 = 0;
            long jIAuthTabCallbackDefault8 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i8 = IAuthTabCallback + 47;
                    int i9 = i8 % 128;
                    onExtraCallbackWithResult = i9;
                    int i10 = i8 % 2;
                    if (iOnNavigationEvent != 0) {
                        int i11 = i9 + 25;
                        int i12 = i11 % 128;
                        IAuthTabCallback = i12;
                        int i13 = i11 % 2;
                        if (iOnNavigationEvent == 1) {
                            jIAuthTabCallbackDefault6 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
                            i7 |= 2;
                        } else if (iOnNavigationEvent != 2) {
                            int i14 = i12 + 11;
                            onExtraCallbackWithResult = i14 % 128;
                            if (i14 % 2 != 0) {
                                i2 = 3;
                                i3 = 4;
                                if (iOnNavigationEvent == 3) {
                                    jIAuthTabCallbackDefault5 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, i2);
                                    i7 |= 8;
                                } else if (iOnNavigationEvent == i3) {
                                }
                            } else if (iOnNavigationEvent != 5) {
                                i3 = 4;
                                if (iOnNavigationEvent == i3) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i3);
                                i7 |= 16;
                            } else {
                                i2 = 3;
                                jIAuthTabCallbackDefault5 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, i2);
                                i7 |= 8;
                            }
                        } else {
                            jIAuthTabCallbackDefault8 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 2);
                            i7 |= 4;
                        }
                    } else {
                        jIAuthTabCallbackDefault7 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                        i7 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            int i15 = IAuthTabCallback + 123;
            onExtraCallbackWithResult = i15 % 128;
            int i16 = i15 % 2;
            strAsInterface = strAsInterface2;
            j = jIAuthTabCallbackDefault5;
            i = i7;
            j2 = jIAuthTabCallbackDefault6;
            j3 = jIAuthTabCallbackDefault7;
            j4 = jIAuthTabCallbackDefault8;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new VisitorRemainingBalanceInfoResponse(i, j3, j2, j4, j, strAsInterface, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m655deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        VisitorRemainingBalanceInfoResponse visitorRemainingBalanceInfoResponseDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return visitorRemainingBalanceInfoResponseDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull VisitorRemainingBalanceInfoResponse visitorRemainingBalanceInfoResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(visitorRemainingBalanceInfoResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            VisitorRemainingBalanceInfoResponse.onExtraCallbackWithResult(visitorRemainingBalanceInfoResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(visitorRemainingBalanceInfoResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        VisitorRemainingBalanceInfoResponse.onExtraCallbackWithResult(visitorRemainingBalanceInfoResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (VisitorRemainingBalanceInfoResponse) obj);
        int i4 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 17;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
