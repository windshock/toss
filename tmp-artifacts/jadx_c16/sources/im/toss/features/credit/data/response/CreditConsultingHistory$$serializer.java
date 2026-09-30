package im.toss.features.credit.data.response;

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
public final /* synthetic */ class CreditConsultingHistory$$serializer implements aeu2<CreditConsultingHistory> {
    private static int IAuthTabCallback = 0;
    public static final CreditConsultingHistory$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 82 / 0;
        }
        return serialDescriptor;
    }

    static {
        CreditConsultingHistory$$serializer creditConsultingHistory$$serializer = new CreditConsultingHistory$$serializer();
        INSTANCE = creditConsultingHistory$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.CreditConsultingHistory", creditConsultingHistory$$serializer, 6);
        setanimationsloop.onWarmupCompleted("reservationNo", true);
        setanimationsloop.onWarmupCompleted("categoryName", true);
        setanimationsloop.onWarmupCompleted("reservationDate", true);
        setanimationsloop.onWarmupCompleted("consultingStartTime", true);
        setanimationsloop.onWarmupCompleted("agency", true);
        setanimationsloop.onWarmupCompleted("consultingEndTime", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 67;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private CreditConsultingHistory$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout};
        int i4 = onNavigationEvent + 37;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CreditConsultingHistory deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String strAsInterface2;
        String str;
        String str2;
        int i;
        String strAsInterface3;
        String str3;
        char c;
        int i2;
        char c2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            String strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            String strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            str3 = strAsInterface6;
            strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
            strAsInterface = strAsInterface7;
            strAsInterface2 = strAsInterface8;
            str2 = strAsInterface5;
            i = 63;
            str = strAsInterface4;
        } else {
            int i4 = onExtraCallbackWithResult + 53;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            String strAsInterface9 = null;
            String strAsInterface10 = null;
            String strAsInterface11 = null;
            strAsInterface = null;
            strAsInterface2 = null;
            String strAsInterface12 = null;
            boolean z = true;
            int i6 = 0;
            while (z) {
                int i7 = onNavigationEvent + 57;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (i8 == 0) {
                    int i9 = 13 / 0;
                    switch (iOnNavigationEvent) {
                        case -1:
                            i2 = 1;
                            c = 3;
                            z = false;
                            break;
                        case 0:
                            i2 = 1;
                            c = 3;
                            strAsInterface10 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                            i6 |= 1;
                            break;
                        case 1:
                            i2 = 1;
                            c = 3;
                            strAsInterface12 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i2);
                            i6 |= 2;
                            break;
                        case 2:
                            c2 = 3;
                            strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                            i6 |= 4;
                            break;
                        case 3:
                            c2 = 3;
                            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                            i6 |= 8;
                            break;
                        case 4:
                            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                            i6 |= 16;
                            break;
                        case 5:
                            strAsInterface11 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                            i6 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                } else {
                    switch (iOnNavigationEvent) {
                        case -1:
                            i2 = 1;
                            c = 3;
                            z = false;
                            break;
                        case 0:
                            i2 = 1;
                            c = 3;
                            strAsInterface10 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                            i6 |= 1;
                            break;
                        case 1:
                            c = 3;
                            i2 = 1;
                            strAsInterface12 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i2);
                            i6 |= 2;
                            break;
                        case 2:
                            c2 = 3;
                            strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                            i6 |= 4;
                            break;
                        case 3:
                            c2 = 3;
                            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                            i6 |= 8;
                            break;
                        case 4:
                            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                            i6 |= 16;
                            break;
                        case 5:
                            strAsInterface11 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                            i6 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                }
            }
            str = strAsInterface10;
            str2 = strAsInterface12;
            i = i6;
            strAsInterface3 = strAsInterface11;
            str3 = strAsInterface9;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditConsultingHistory(i, str, str2, str3, strAsInterface, strAsInterface2, strAsInterface3, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m139deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            throw null;
        }
        CreditConsultingHistory creditConsultingHistoryDeserialize = deserialize(decoder);
        int i3 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return creditConsultingHistoryDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditConsultingHistory creditConsultingHistory) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(creditConsultingHistory, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CreditConsultingHistory.onNavigationEvent(creditConsultingHistory, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 62 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(creditConsultingHistory, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            CreditConsultingHistory.onNavigationEvent(creditConsultingHistory, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditConsultingHistory) obj);
        int i4 = onNavigationEvent + 9;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
