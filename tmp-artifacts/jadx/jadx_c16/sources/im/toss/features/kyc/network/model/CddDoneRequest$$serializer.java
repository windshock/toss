package im.toss.features.kyc.network.model;

import im.toss.featurescommon.profile.library.model.Address;
import im.toss.featurescommon.profile.library.model.Address$;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getDynamicHeight;
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
public final /* synthetic */ class CddDoneRequest$$serializer implements aeu2<CddDoneRequest> {
    public static final int $stable;
    public static final CddDoneRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        CddDoneRequest$$serializer cddDoneRequest$$serializer = new CddDoneRequest$$serializer();
        INSTANCE = cddDoneRequest$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.kyc.network.model.CddDoneRequest", cddDoneRequest$$serializer, 10);
        setanimationsloop.onWarmupCompleted("unifiedId", true);
        setanimationsloop.onWarmupCompleted("jobCode", false);
        setanimationsloop.onWarmupCompleted("companyName", true);
        setanimationsloop.onWarmupCompleted("companyAddress", true);
        setanimationsloop.onWarmupCompleted("industryCode", true);
        setanimationsloop.onWarmupCompleted("homeAddress", false);
        setanimationsloop.onWarmupCompleted("email", true);
        setanimationsloop.onWarmupCompleted("industryCodeVersion", true);
        setanimationsloop.onWarmupCompleted("manualInputCountryCode", true);
        setanimationsloop.onWarmupCompleted("possessionVerifyId", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 33;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private CddDoneRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        oty1 oty1Var = oty1.onExtraCallback;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(oty1Var);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(getwrigglelayout);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(getwrigglelayout);
        Address$.serializer serializerVar = Address$.serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3, sp.IAuthTabCallback(serializerVar), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(serializerVar), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getDynamicHeight.onWarmupCompleted), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(oty1Var)};
        int i4 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CddDoneRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        String str2;
        Long l;
        String str3;
        Integer num;
        Address address;
        String str4;
        int i;
        Address address2;
        Long l2;
        String str5;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i3 = 9;
        int i4 = 7;
        int i5 = 8;
        Integer num2 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i6 = onNavigationEvent + 87;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 5 / 4;
            }
            boolean z = true;
            Address address3 = null;
            String str6 = null;
            Address address4 = null;
            Long l3 = null;
            String str7 = null;
            str = null;
            str2 = null;
            String str8 = null;
            Long l4 = null;
            int i8 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        int i9 = onExtraCallbackWithResult + 1;
                        onNavigationEvent = i9 % 128;
                        int i10 = i9 % 2;
                        str8 = str8;
                        l4 = l4;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        z = false;
                    case 0:
                        i8 |= 1;
                        l4 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, oty1.onExtraCallback, l4);
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                    case 1:
                        str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str);
                        i8 |= 2;
                        i3 = 9;
                        i5 = 8;
                    case 2:
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str2);
                        i8 |= 4;
                        i3 = 9;
                        i5 = 8;
                    case 3:
                        address3 = (Address) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, Address$.serializer.INSTANCE, address3);
                        i8 |= 8;
                        i3 = 9;
                        i5 = 8;
                    case 4:
                        i8 |= 16;
                        str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str8);
                        i3 = 9;
                        i5 = 8;
                    case 5:
                        address4 = (Address) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, Address$.serializer.INSTANCE, address4);
                        i8 |= 32;
                        i3 = 9;
                    case 6:
                        str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, str6);
                        i8 |= 64;
                        int i11 = onExtraCallbackWithResult + 77;
                        onNavigationEvent = i11 % 128;
                        int i12 = i11 % 2;
                        i3 = 9;
                    case 7:
                        num2 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, getDynamicHeight.onWarmupCompleted, num2);
                        i8 |= 128;
                    case 8:
                        str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, getWriggleLayout.onNavigationEvent, str7);
                        i8 |= 256;
                    case 9:
                        l3 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, oty1.onExtraCallback, l3);
                        i8 |= 512;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            address = address3;
            str4 = str8;
            str3 = str6;
            l = l4;
            i = i8;
            address2 = address4;
            l2 = l3;
            str5 = str7;
            num = num2;
        } else {
            oty1 oty1Var = oty1.onExtraCallback;
            Long l5 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, oty1Var, (Object) null);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            Address$.serializer serializerVar = Address$.serializer.INSTANCE;
            Address address5 = (Address) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, serializerVar, (Object) null);
            String str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
            Address address6 = (Address) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, serializerVar, (Object) null);
            String str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
            Integer num3 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getDynamicHeight.onWarmupCompleted, (Object) null);
            String str11 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, getwrigglelayout, (Object) null);
            l = l5;
            str3 = str10;
            num = num3;
            address = address5;
            str4 = str9;
            i = 1023;
            address2 = address6;
            l2 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, oty1Var, (Object) null);
            str5 = str11;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CddDoneRequest(i, l, str, str2, address, str4, address2, str3, num, str5, l2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m625deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CddDoneRequest cddDoneRequestDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
        return cddDoneRequestDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CddDoneRequest cddDoneRequest) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(cddDoneRequest, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CddDoneRequest.onWarmupCompleted(cddDoneRequest, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(cddDoneRequest, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        CddDoneRequest.onWarmupCompleted(cddDoneRequest, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onNavigationEvent + 21;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 81 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CddDoneRequest) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 == 0) {
            int i4 = 4 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
