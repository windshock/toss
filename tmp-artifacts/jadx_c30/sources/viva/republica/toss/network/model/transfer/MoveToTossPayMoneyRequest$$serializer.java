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
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.TransferLocation$;
import viva.republica.toss.network.model.transfer.TransferSignatureDto$;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class MoveToTossPayMoneyRequest$$serializer implements aeu2<MoveToTossPayMoneyRequest> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final MoveToTossPayMoneyRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
        return serialDescriptor;
    }

    static {
        MoveToTossPayMoneyRequest$$serializer moveToTossPayMoneyRequest$$serializer = new MoveToTossPayMoneyRequest$$serializer();
        INSTANCE = moveToTossPayMoneyRequest$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.MoveToTossPayMoneyRequest", moveToTossPayMoneyRequest$$serializer, 3);
        setanimationsloop.onWarmupCompleted("amount", false);
        setanimationsloop.onWarmupCompleted("signatureDto", false);
        setanimationsloop.onWarmupCompleted("location", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 95;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private MoveToTossPayMoneyRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {oty1.onExtraCallback, TransferSignatureDto$.serializer.INSTANCE, sp.IAuthTabCallback(TransferLocation$.serializer.INSTANCE)};
        int i4 = onNavigationEvent + 23;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return m95deserialize(decoder);
        }
        m95deserialize(decoder);
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final MoveToTossPayMoneyRequest m95deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        TransferSignatureDto transferSignatureDto;
        TransferLocation transferLocation;
        long j;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        TransferLocation transferLocation2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            long jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
            TransferSignatureDto transferSignatureDto2 = (TransferSignatureDto) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, TransferSignatureDto$.serializer.INSTANCE, (Object) null);
            transferLocation = (TransferLocation) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, TransferLocation$.serializer.INSTANCE, (Object) null);
            j = jIAuthTabCallbackDefault;
            i = 7;
            transferSignatureDto = transferSignatureDto2;
        } else {
            long jIAuthTabCallbackDefault2 = 0;
            int i3 = 0;
            TransferSignatureDto transferSignatureDto3 = null;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = onExtraCallback + 1;
                    int i5 = i4 % 128;
                    onNavigationEvent = i5;
                    int i6 = i4 % 2;
                    if (iOnNavigationEvent == 0) {
                        jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                        i3 |= 1;
                    } else if (iOnNavigationEvent != 1) {
                        int i7 = i5 + 97;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i9 = i5 + 83;
                        onExtraCallback = i9 % 128;
                        int i10 = i9 % 2;
                        Object objOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, TransferLocation$.serializer.INSTANCE, transferLocation2);
                        if (i10 != 0) {
                            transferLocation2 = (TransferLocation) objOnExtraCallbackWithResult;
                            i3 |= 3;
                        } else {
                            transferLocation2 = (TransferLocation) objOnExtraCallbackWithResult;
                            i3 |= 4;
                        }
                    } else {
                        transferSignatureDto3 = (TransferSignatureDto) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, TransferSignatureDto$.serializer.INSTANCE, transferSignatureDto3);
                        i3 |= 2;
                    }
                } else {
                    z = false;
                }
            }
            transferSignatureDto = transferSignatureDto3;
            transferLocation = transferLocation2;
            j = jIAuthTabCallbackDefault2;
            i = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new MoveToTossPayMoneyRequest(i, j, transferSignatureDto, transferLocation, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (MoveToTossPayMoneyRequest) obj);
        int i4 = onExtraCallback + 31;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull MoveToTossPayMoneyRequest moveToTossPayMoneyRequest) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(moveToTossPayMoneyRequest, BuildConfig.FLAVOR);
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            MoveToTossPayMoneyRequest.onExtraCallbackWithResult(moveToTossPayMoneyRequest, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(moveToTossPayMoneyRequest, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        MoveToTossPayMoneyRequest.onExtraCallbackWithResult(moveToTossPayMoneyRequest, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
