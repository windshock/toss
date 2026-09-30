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
import o.oty1;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.TransferShareTossMoneyMoveRequest;
import viva.republica.toss.network.model.transfer.TransferSignatureDto$;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TransferShareTossMoneyMoveRequest$$serializer implements aeu2<TransferShareTossMoneyMoveRequest> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final TransferShareTossMoneyMoveRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
        return serialDescriptor;
    }

    static {
        TransferShareTossMoneyMoveRequest$$serializer transferShareTossMoneyMoveRequest$$serializer = new TransferShareTossMoneyMoveRequest$$serializer();
        INSTANCE = transferShareTossMoneyMoveRequest$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.TransferShareTossMoneyMoveRequest", transferShareTossMoneyMoveRequest$$serializer, 4);
        setanimationsloop.onWarmupCompleted("withdrawAccount", false);
        setanimationsloop.onWarmupCompleted("depositAccount", false);
        setanimationsloop.onWarmupCompleted("amount", false);
        setanimationsloop.onWarmupCompleted("signatureDto", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 97;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private TransferShareTossMoneyMoveRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            TransferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer transferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer = TransferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer.INSTANCE;
            return new KSerializer[]{transferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer, transferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer, oty1.onExtraCallback, TransferSignatureDto$.serializer.INSTANCE};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[3];
        TransferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer transferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer2 = TransferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer.INSTANCE;
        kSerializerArr[1] = transferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer2;
        kSerializerArr[0] = transferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer2;
        kSerializerArr[4] = oty1.onExtraCallback;
        kSerializerArr[5] = TransferSignatureDto$.serializer.INSTANCE;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TransferShareTossMoneyMoveRequest transferShareTossMoneyMoveRequestM109deserialize = m109deserialize(decoder);
        int i4 = onExtraCallback + 95;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return transferShareTossMoneyMoveRequestM109deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final TransferShareTossMoneyMoveRequest m109deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        TransferShareTossMoneyMoveRequest.TransferShareTossMoneyMoveAccountModel transferShareTossMoneyMoveAccountModel;
        TransferSignatureDto transferSignatureDto;
        TransferShareTossMoneyMoveRequest.TransferShareTossMoneyMoveAccountModel transferShareTossMoneyMoveAccountModel2;
        long j;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 35;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        TransferShareTossMoneyMoveRequest.TransferShareTossMoneyMoveAccountModel transferShareTossMoneyMoveAccountModel3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onExtraCallback + 35;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            TransferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer transferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer = TransferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer.INSTANCE;
            TransferShareTossMoneyMoveRequest.TransferShareTossMoneyMoveAccountModel transferShareTossMoneyMoveAccountModel4 = (TransferShareTossMoneyMoveRequest.TransferShareTossMoneyMoveAccountModel) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, transferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer, (Object) null);
            TransferShareTossMoneyMoveRequest.TransferShareTossMoneyMoveAccountModel transferShareTossMoneyMoveAccountModel5 = (TransferShareTossMoneyMoveRequest.TransferShareTossMoneyMoveAccountModel) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, transferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer, (Object) null);
            long jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 2);
            transferSignatureDto = (TransferSignatureDto) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, TransferSignatureDto$.serializer.INSTANCE, (Object) null);
            transferShareTossMoneyMoveAccountModel = transferShareTossMoneyMoveAccountModel5;
            i = 15;
            transferShareTossMoneyMoveAccountModel2 = transferShareTossMoneyMoveAccountModel4;
            j = jIAuthTabCallbackDefault;
        } else {
            int i7 = 0;
            boolean z = true;
            long jIAuthTabCallbackDefault2 = 0;
            TransferSignatureDto transferSignatureDto2 = null;
            TransferShareTossMoneyMoveRequest.TransferShareTossMoneyMoveAccountModel transferShareTossMoneyMoveAccountModel6 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    transferShareTossMoneyMoveAccountModel6 = (TransferShareTossMoneyMoveRequest.TransferShareTossMoneyMoveAccountModel) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, TransferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer.INSTANCE, transferShareTossMoneyMoveAccountModel6);
                    i7 |= 1;
                } else if (iOnNavigationEvent == 1) {
                    transferShareTossMoneyMoveAccountModel3 = (TransferShareTossMoneyMoveRequest.TransferShareTossMoneyMoveAccountModel) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, TransferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer.INSTANCE, transferShareTossMoneyMoveAccountModel3);
                    i7 |= 2;
                } else if (iOnNavigationEvent == 2) {
                    jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 2);
                    i7 |= 4;
                } else {
                    if (iOnNavigationEvent != 3) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i8 = IAuthTabCallback + 91;
                    onExtraCallback = i8 % 128;
                    if (i8 % 2 == 0) {
                        transferSignatureDto2 = (TransferSignatureDto) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, TransferSignatureDto$.serializer.INSTANCE, transferSignatureDto2);
                        i7 |= 98;
                    } else {
                        transferSignatureDto2 = (TransferSignatureDto) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, TransferSignatureDto$.serializer.INSTANCE, transferSignatureDto2);
                        i7 |= 8;
                    }
                }
            }
            i = i7;
            transferShareTossMoneyMoveAccountModel = transferShareTossMoneyMoveAccountModel3;
            transferSignatureDto = transferSignatureDto2;
            transferShareTossMoneyMoveAccountModel2 = transferShareTossMoneyMoveAccountModel6;
            j = jIAuthTabCallbackDefault2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TransferShareTossMoneyMoveRequest(i, transferShareTossMoneyMoveAccountModel2, transferShareTossMoneyMoveAccountModel, j, transferSignatureDto, null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TransferShareTossMoneyMoveRequest) obj);
        int i4 = IAuthTabCallback + 51;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TransferShareTossMoneyMoveRequest transferShareTossMoneyMoveRequest) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(transferShareTossMoneyMoveRequest, BuildConfig.FLAVOR);
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            TransferShareTossMoneyMoveRequest.IAuthTabCallback(transferShareTossMoneyMoveRequest, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(transferShareTossMoneyMoveRequest, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        TransferShareTossMoneyMoveRequest.IAuthTabCallback(transferShareTossMoneyMoveRequest, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 41 / 0;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 99;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
