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
public final /* synthetic */ class TransferReserveKeyInfoResponse$$serializer implements aeu2<TransferReserveKeyInfoResponse> {
    public static final TransferReserveKeyInfoResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        TransferReserveKeyInfoResponse$$serializer transferReserveKeyInfoResponse$$serializer = new TransferReserveKeyInfoResponse$$serializer();
        INSTANCE = transferReserveKeyInfoResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.TransferReserveKeyInfoResponse", transferReserveKeyInfoResponse$$serializer, 3);
        setanimationsloop.onWarmupCompleted("depositBankCode", true);
        setanimationsloop.onWarmupCompleted("depositAccountNo", true);
        setanimationsloop.onWarmupCompleted("amount", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 21;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private TransferReserveKeyInfoResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getDynamicHeight.onWarmupCompleted), sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), TransferReserveKeyAmountInfoResponse$$serializer.INSTANCE};
        int i4 = onExtraCallback + 39;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            m107deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TransferReserveKeyInfoResponse transferReserveKeyInfoResponseM107deserialize = m107deserialize(decoder);
        int i3 = onExtraCallback + 41;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return transferReserveKeyInfoResponseM107deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final TransferReserveKeyInfoResponse m107deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        Integer num;
        TransferReserveKeyAmountInfoResponse transferReserveKeyAmountInfoResponse;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        String str2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onExtraCallbackWithResult + 35;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Integer num2 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getDynamicHeight.onWarmupCompleted, (Object) null);
            String str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, (Object) null);
            transferReserveKeyAmountInfoResponse = (TransferReserveKeyAmountInfoResponse) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, TransferReserveKeyAmountInfoResponse$$serializer.INSTANCE, (Object) null);
            num = num2;
            str = str3;
            i = 7;
        } else {
            int i5 = onExtraCallbackWithResult + 101;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 0;
            boolean z = true;
            Integer num3 = null;
            TransferReserveKeyAmountInfoResponse transferReserveKeyAmountInfoResponse2 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    num3 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getDynamicHeight.onWarmupCompleted, num3);
                    i7 |= 1;
                } else if (iOnNavigationEvent == 1) {
                    str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str2);
                    i7 |= 2;
                } else {
                    if (iOnNavigationEvent != 2) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    transferReserveKeyAmountInfoResponse2 = (TransferReserveKeyAmountInfoResponse) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, TransferReserveKeyAmountInfoResponse$$serializer.INSTANCE, transferReserveKeyAmountInfoResponse2);
                    i7 |= 4;
                }
            }
            i = i7;
            str = str2;
            num = num3;
            transferReserveKeyAmountInfoResponse = transferReserveKeyAmountInfoResponse2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TransferReserveKeyInfoResponse(i, num, str, transferReserveKeyAmountInfoResponse, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TransferReserveKeyInfoResponse) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 99;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TransferReserveKeyInfoResponse transferReserveKeyInfoResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(transferReserveKeyInfoResponse, BuildConfig.FLAVOR);
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            TransferReserveKeyInfoResponse.onExtraCallback(transferReserveKeyInfoResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(transferReserveKeyInfoResponse, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        TransferReserveKeyInfoResponse.onExtraCallback(transferReserveKeyInfoResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onExtraCallbackWithResult + 57;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 19;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
