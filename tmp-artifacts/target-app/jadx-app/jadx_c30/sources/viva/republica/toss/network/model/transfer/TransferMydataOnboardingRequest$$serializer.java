package viva.republica.toss.network.model.transfer;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.aeu2;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TransferMydataOnboardingRequest$$serializer implements aeu2<TransferMydataOnboardingRequest> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final TransferMydataOnboardingRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 93;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 29;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        TransferMydataOnboardingRequest$$serializer transferMydataOnboardingRequest$$serializer = new TransferMydataOnboardingRequest$$serializer();
        INSTANCE = transferMydataOnboardingRequest$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.TransferMydataOnboardingRequest", transferMydataOnboardingRequest$$serializer, 3);
        setanimationsloop.onWarmupCompleted("accountNo", true);
        setanimationsloop.onWarmupCompleted("bankCode", true);
        setanimationsloop.onWarmupCompleted("sessionKey", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 87;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private TransferMydataOnboardingRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getwrigglelayout);
            KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(getDynamicHeight.onWarmupCompleted);
            KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(getwrigglelayout);
            kSerializerArr = new KSerializer[2];
            kSerializerArr[0] = kSerializerIAuthTabCallback;
            kSerializerArr[1] = kSerializerIAuthTabCallback2;
            kSerializerArr[3] = kSerializerIAuthTabCallback3;
        } else {
            getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
            kSerializerArr = new KSerializer[]{sp.IAuthTabCallback(getwrigglelayout2), sp.IAuthTabCallback(getDynamicHeight.onWarmupCompleted), sp.IAuthTabCallback(getwrigglelayout2)};
        }
        int i3 = IAuthTabCallback + 63;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TransferMydataOnboardingRequest transferMydataOnboardingRequestM102deserialize = m102deserialize(decoder);
        if (i3 != 0) {
            int i4 = 25 / 0;
        }
        int i5 = onNavigationEvent + 77;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return transferMydataOnboardingRequestM102deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078 A[SYNTHETIC] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TransferMydataOnboardingRequest m102deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        Integer num;
        String str;
        String str2;
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Integer num2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            Integer num3 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getDynamicHeight.onWarmupCompleted, (Object) null);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            i = 7;
            str2 = str3;
            num = num3;
        } else {
            int i5 = 0;
            boolean z = true;
            String str4 = null;
            String str5 = null;
            while (z) {
                int i6 = IAuthTabCallback + 5;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i8 = IAuthTabCallback;
                    int i9 = i8 + 35;
                    onNavigationEvent = i9 % 128;
                    if (i9 % 2 != 0) {
                        if (iOnNavigationEvent == 1) {
                            num2 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getDynamicHeight.onWarmupCompleted, num2);
                            i5 |= 2;
                        }
                        i2 = i8 + 97;
                        int i10 = i2 % 128;
                        onNavigationEvent = i10;
                        if (i2 % 2 == 0) {
                            if (iOnNavigationEvent != 5) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i11 = i10 + 109;
                            IAuthTabCallback = i11 % 128;
                            i3 = i11 % 2;
                            getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
                            if (i3 != 0) {
                                str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout2, str4);
                                i5 |= 2;
                            } else {
                                str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout2, str4);
                                i5 |= 4;
                            }
                        } else {
                            if (iOnNavigationEvent != 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i112 = i10 + 109;
                            IAuthTabCallback = i112 % 128;
                            i3 = i112 % 2;
                            getWriggleLayout getwrigglelayout22 = getWriggleLayout.onNavigationEvent;
                            if (i3 != 0) {
                            }
                        }
                    } else {
                        if (iOnNavigationEvent == 1) {
                            num2 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getDynamicHeight.onWarmupCompleted, num2);
                            i5 |= 2;
                        }
                        i2 = i8 + 97;
                        int i102 = i2 % 128;
                        onNavigationEvent = i102;
                        if (i2 % 2 == 0) {
                        }
                    }
                } else {
                    str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str5);
                    i5 |= 1;
                }
            }
            i = i5;
            num = num2;
            str = str4;
            str2 = str5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TransferMydataOnboardingRequest(i, str2, num, str, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TransferMydataOnboardingRequest) obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent + 59;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TransferMydataOnboardingRequest transferMydataOnboardingRequest) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(transferMydataOnboardingRequest, BuildConfig.FLAVOR);
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            TransferMydataOnboardingRequest.onExtraCallback(transferMydataOnboardingRequest, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(transferMydataOnboardingRequest, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        TransferMydataOnboardingRequest.onExtraCallback(transferMydataOnboardingRequest, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 73 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = IAuthTabCallback + 61;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
