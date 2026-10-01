package im.toss.features.credit.data.request;

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
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditConsultingReservationRequest$$serializer implements aeu2<CreditConsultingReservationRequest> {
    private static int IAuthTabCallback = 0;
    public static final CreditConsultingReservationRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        CreditConsultingReservationRequest$$serializer creditConsultingReservationRequest$$serializer = new CreditConsultingReservationRequest$$serializer();
        INSTANCE = creditConsultingReservationRequest$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.request.CreditConsultingReservationRequest", creditConsultingReservationRequest$$serializer, 4);
        setanimationsloop.onWarmupCompleted("categoryCode", true);
        setanimationsloop.onWarmupCompleted("contents", true);
        setanimationsloop.onWarmupCompleted("date", true);
        setanimationsloop.onWarmupCompleted("time", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 7;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 45 / 0;
        }
    }

    private CreditConsultingReservationRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            return new KSerializer[]{getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[3];
        getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
        kSerializerArr[1] = getwrigglelayout2;
        kSerializerArr[1] = getwrigglelayout2;
        kSerializerArr[3] = getwrigglelayout2;
        kSerializerArr[4] = getwrigglelayout2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CreditConsultingReservationRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String strAsInterface2;
        String strAsInterface3;
        String strAsInterface4;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            strAsInterface2 = null;
            strAsInterface3 = null;
            strAsInterface = null;
            strAsInterface4 = null;
            boolean z = true;
            i = 0;
            while (z) {
                int i3 = onExtraCallbackWithResult + 83;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i5 = onExtraCallbackWithResult;
                    int i6 = i5 + 117;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    if (iOnNavigationEvent != 0) {
                        int i8 = i5 + 1;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                        if (iOnNavigationEvent != 1) {
                            int i10 = i5 + 75;
                            int i11 = i10 % 128;
                            onNavigationEvent = i11;
                            int i12 = i10 % 2;
                            if (iOnNavigationEvent != 2) {
                                int i13 = i11 + 19;
                                onExtraCallbackWithResult = i13 % 128;
                                if (i13 % 2 != 0) {
                                    if (iOnNavigationEvent != 2) {
                                        throw new UnknownFieldException(iOnNavigationEvent);
                                    }
                                    strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                                    i |= 8;
                                } else {
                                    if (iOnNavigationEvent != 3) {
                                        throw new UnknownFieldException(iOnNavigationEvent);
                                    }
                                    strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                                    i |= 8;
                                }
                            } else {
                                strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                                i |= 4;
                            }
                        } else {
                            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                            i |= 2;
                            int i14 = onExtraCallbackWithResult + 11;
                            onNavigationEvent = i14 % 128;
                            int i15 = i14 % 2;
                        }
                    } else {
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i |= 1;
                    }
                } else {
                    z = false;
                }
            }
        } else {
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            i = 15;
        }
        String str = strAsInterface;
        int i16 = i;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditConsultingReservationRequest(i16, str, strAsInterface2, strAsInterface3, strAsInterface4, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m128deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CreditConsultingReservationRequest creditConsultingReservationRequestDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 69 / 0;
        }
        int i5 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return creditConsultingReservationRequestDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditConsultingReservationRequest creditConsultingReservationRequest) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(creditConsultingReservationRequest, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CreditConsultingReservationRequest.onExtraCallback(creditConsultingReservationRequest, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(creditConsultingReservationRequest, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        CreditConsultingReservationRequest.onExtraCallback(creditConsultingReservationRequest, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditConsultingReservationRequest) obj);
        int i4 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
