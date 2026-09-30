package im.toss.features.kyc.network.model;

import im.toss.features.kyc.network.model.CddProfileInfoResponse;
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
public final /* synthetic */ class CddProfileInfoResponse$HomeAddress$$serializer implements aeu2<CddProfileInfoResponse.HomeAddress> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final CddProfileInfoResponse$HomeAddress$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        CddProfileInfoResponse$HomeAddress$$serializer cddProfileInfoResponse$HomeAddress$$serializer = new CddProfileInfoResponse$HomeAddress$$serializer();
        INSTANCE = cddProfileInfoResponse$HomeAddress$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.kyc.network.model.CddProfileInfoResponse.HomeAddress", cddProfileInfoResponse$HomeAddress$$serializer, 4);
        setanimationsloop.onWarmupCompleted("id", true);
        setanimationsloop.onWarmupCompleted("address", false);
        setanimationsloop.onWarmupCompleted("addressDetail", false);
        setanimationsloop.onWarmupCompleted("zipcode", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 5;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private CddProfileInfoResponse$HomeAddress$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
            return new KSerializer[]{sp.IAuthTabCallback(kSerializer), kSerializer, kSerializer, sp.IAuthTabCallback(kSerializer)};
        }
        KSerializer<?> kSerializer2 = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(kSerializer2);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(kSerializer2);
        KSerializer<?>[] kSerializerArr = new KSerializer[3];
        kSerializerArr[0] = kSerializerIAuthTabCallback;
        kSerializerArr[1] = kSerializer2;
        kSerializerArr[4] = kSerializer2;
        kSerializerArr[3] = kSerializerIAuthTabCallback2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CddProfileInfoResponse.HomeAddress deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String str;
        int i;
        String str2;
        String str3;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            i = 15;
            str2 = str4;
            str3 = strAsInterface2;
        } else {
            int i4 = onWarmupCompleted + 25;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 % 2;
            }
            String strAsInterface3 = null;
            String str5 = null;
            String str6 = null;
            String strAsInterface4 = null;
            int i6 = 0;
            boolean z = true;
            while (z) {
                int i7 = onExtraCallbackWithResult + 65;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i9 = onWarmupCompleted + 57;
                    onExtraCallbackWithResult = i9 % 128;
                    if (i9 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str6);
                        i6 |= 1;
                    } else if (iOnNavigationEvent == 1) {
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i6 |= 2;
                    } else if (iOnNavigationEvent == 2) {
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i6 |= 4;
                    } else {
                        if (iOnNavigationEvent != 3) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str5);
                        i6 |= 8;
                    }
                } else {
                    int i10 = onExtraCallbackWithResult + 37;
                    onWarmupCompleted = i10 % 128;
                    int i11 = i10 % 2;
                    z = false;
                }
            }
            strAsInterface = strAsInterface3;
            str = str5;
            i = i6;
            str2 = str6;
            str3 = strAsInterface4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CddProfileInfoResponse.HomeAddress(i, str2, str3, strAsInterface, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m629deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        CddProfileInfoResponse.HomeAddress homeAddressDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return homeAddressDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CddProfileInfoResponse.HomeAddress homeAddress) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(homeAddress, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CddProfileInfoResponse.HomeAddress.IAuthTabCallback(homeAddress, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(homeAddress, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        CddProfileInfoResponse.HomeAddress.IAuthTabCallback(homeAddress, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CddProfileInfoResponse.HomeAddress) obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 75;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
