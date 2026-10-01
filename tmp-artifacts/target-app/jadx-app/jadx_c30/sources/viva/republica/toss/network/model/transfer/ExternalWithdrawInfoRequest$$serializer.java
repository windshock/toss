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
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.TransferAccountDto$;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ExternalWithdrawInfoRequest$$serializer implements aeu2<ExternalWithdrawInfoRequest> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final ExternalWithdrawInfoRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 41;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 101;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        ExternalWithdrawInfoRequest$$serializer externalWithdrawInfoRequest$$serializer = new ExternalWithdrawInfoRequest$$serializer();
        INSTANCE = externalWithdrawInfoRequest$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.ExternalWithdrawInfoRequest", externalWithdrawInfoRequest$$serializer, 1);
        setanimationsloop.onWarmupCompleted("withdrawAccount", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 99;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private ExternalWithdrawInfoRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {TransferAccountDto$.serializer.INSTANCE};
        int i4 = onNavigationEvent + 65;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return m94deserialize(decoder);
        }
        m94deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final ExternalWithdrawInfoRequest m94deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        TransferAccountDto transferAccountDto;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i2 = 1;
        if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            transferAccountDto = (TransferAccountDto) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, TransferAccountDto$.serializer.INSTANCE, (Object) null);
        } else {
            boolean z = true;
            TransferAccountDto transferAccountDto2 = null;
            int i3 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = onExtraCallback;
                    int i5 = i4 + 101;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i7 = i4 + 113;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    transferAccountDto2 = (TransferAccountDto) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, TransferAccountDto$.serializer.INSTANCE, transferAccountDto2);
                    int i9 = onExtraCallback + 33;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    i3 = 1;
                } else {
                    z = false;
                }
            }
            transferAccountDto = transferAccountDto2;
            i2 = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ExternalWithdrawInfoRequest(i2, transferAccountDto, null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ExternalWithdrawInfoRequest) obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ExternalWithdrawInfoRequest externalWithdrawInfoRequest) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(externalWithdrawInfoRequest, BuildConfig.FLAVOR);
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ExternalWithdrawInfoRequest.onWarmupCompleted(externalWithdrawInfoRequest, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(externalWithdrawInfoRequest, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        ExternalWithdrawInfoRequest.onWarmupCompleted(externalWithdrawInfoRequest, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onNavigationEvent + 41;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 45;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
