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
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.TransferShareTossMoneyMoveRequest;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TransferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer implements aeu2<TransferShareTossMoneyMoveRequest.TransferShareTossMoneyMoveAccountModel> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final TransferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 0 / 0;
        }
        return serialDescriptor;
    }

    static {
        TransferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer transferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer = new TransferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer();
        INSTANCE = transferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.TransferShareTossMoneyMoveRequest.TransferShareTossMoneyMoveAccountModel", transferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer, 2);
        setanimationsloop.onWarmupCompleted("bankCode", false);
        setanimationsloop.onWarmupCompleted("accountNo", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 41;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private TransferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArr = new KSerializer[5];
            kSerializerArr[0] = getDynamicHeight.onWarmupCompleted;
            kSerializerArr[0] = getWriggleLayout.onNavigationEvent;
        } else {
            kSerializerArr = new KSerializer[]{getDynamicHeight.onWarmupCompleted, getWriggleLayout.onNavigationEvent};
        }
        int i3 = onExtraCallback + 25;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TransferShareTossMoneyMoveRequest.TransferShareTossMoneyMoveAccountModel transferShareTossMoneyMoveAccountModelM110deserialize = m110deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 55;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return transferShareTossMoneyMoveAccountModelM110deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0040 A[PHI: r1 r13
      0x0040: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0034, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0040: PHI (r13v2 o.yw) = (r13v1 o.yw), (r13v7 o.yw) binds: [B:8:0x0034, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036 A[PHI: r1 r13
      0x0036: PHI (r1v7 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0034, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0036: PHI (r13v6 o.yw) = (r13v1 o.yw), (r13v7 o.yw) binds: [B:8:0x0034, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TransferShareTossMoneyMoveRequest.TransferShareTossMoneyMoveAccountModel m110deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        int iOnTransact;
        String strAsInterface;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 93;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = 3;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            int i5 = 70 / 0;
            if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                int i6 = onExtraCallback + 21;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                String strAsInterface2 = null;
                boolean z = true;
                int iOnTransact2 = 0;
                int i8 = 0;
                while (z) {
                    int i9 = onExtraCallbackWithResult + 91;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        int i11 = onExtraCallback + 79;
                        onExtraCallbackWithResult = i11 % 128;
                        int i12 = i11 % 2;
                        z = false;
                    } else if (iOnNavigationEvent != 0) {
                        int i13 = onExtraCallbackWithResult + 89;
                        int i14 = i13 % 128;
                        onExtraCallback = i14;
                        if (i13 % 2 != 0) {
                            if (iOnNavigationEvent != 0) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            i = i14 + 83;
                            onExtraCallbackWithResult = i % 128;
                            if (i % 2 != 0) {
                                strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                                i8 = 3;
                            } else {
                                strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                                i8 |= 2;
                            }
                        } else {
                            if (iOnNavigationEvent != 1) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            i = i14 + 83;
                            onExtraCallbackWithResult = i % 128;
                            if (i % 2 != 0) {
                            }
                        }
                    } else {
                        iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                        i8 |= 1;
                        int i15 = onExtraCallbackWithResult + 73;
                        onExtraCallback = i15 % 128;
                        int i16 = i15 % 2;
                    }
                }
                iOnTransact = iOnTransact2;
                strAsInterface = strAsInterface2;
                i4 = i8;
            } else {
                iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TransferShareTossMoneyMoveRequest.TransferShareTossMoneyMoveAccountModel(i4, iOnTransact, strAsInterface, null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TransferShareTossMoneyMoveRequest.TransferShareTossMoneyMoveAccountModel) obj);
        int i4 = onExtraCallback + 57;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TransferShareTossMoneyMoveRequest.TransferShareTossMoneyMoveAccountModel transferShareTossMoneyMoveAccountModel) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(transferShareTossMoneyMoveAccountModel, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TransferShareTossMoneyMoveRequest.TransferShareTossMoneyMoveAccountModel.onNavigationEvent(transferShareTossMoneyMoveAccountModel, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 81;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 88 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = onExtraCallbackWithResult + 39;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
