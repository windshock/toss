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
import o.getBgColor;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TransferReserveKeyAmountInfoResponse$$serializer implements aeu2<TransferReserveKeyAmountInfoResponse> {
    private static int IAuthTabCallback = 0;
    public static final TransferReserveKeyAmountInfoResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 111;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 33;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        TransferReserveKeyAmountInfoResponse$$serializer transferReserveKeyAmountInfoResponse$$serializer = new TransferReserveKeyAmountInfoResponse$$serializer();
        INSTANCE = transferReserveKeyAmountInfoResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.TransferReserveKeyAmountInfoResponse", transferReserveKeyAmountInfoResponse$$serializer, 2);
        setanimationsloop.onWarmupCompleted("amount", true);
        setanimationsloop.onWarmupCompleted("isFixedAmount", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 83;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 67 / 0;
        }
    }

    private TransferReserveKeyAmountInfoResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(oty1.onExtraCallback);
            KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(getBgColor.IAuthTabCallback);
            kSerializerArr = new KSerializer[2];
            kSerializerArr[0] = kSerializerIAuthTabCallback;
            kSerializerArr[0] = kSerializerIAuthTabCallback2;
        } else {
            kSerializerArr = new KSerializer[]{sp.IAuthTabCallback(oty1.onExtraCallback), sp.IAuthTabCallback(getBgColor.IAuthTabCallback)};
        }
        int i3 = onExtraCallback + 11;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 73 / 0;
        }
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TransferReserveKeyAmountInfoResponse transferReserveKeyAmountInfoResponseM106deserialize = m106deserialize(decoder);
        int i4 = IAuthTabCallback + 17;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return transferReserveKeyAmountInfoResponseM106deserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047 A[PHI: r1 r13
      0x0047: PHI (r1v7 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0047: PHI (r13v5 o.yw) = (r13v1 o.yw), (r13v7 o.yw) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035 A[PHI: r1 r13
      0x0035: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r13v2 o.yw) = (r13v1 o.yw), (r13v7 o.yw) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TransferReserveKeyAmountInfoResponse m106deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Long l;
        Boolean bool;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 29;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            int i4 = 99 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                l = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, oty1.onExtraCallback, (Object) null);
                bool = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getBgColor.IAuthTabCallback, (Object) null);
                i = 3;
            } else {
                Long l2 = null;
                Boolean bool2 = null;
                int i5 = 0;
                boolean z = true;
                while (z) {
                    int i6 = onExtraCallback + 67;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent != 0) {
                        int i8 = onExtraCallback + 49;
                        IAuthTabCallback = i8 % 128;
                        if (i8 % 2 != 0) {
                            if (iOnNavigationEvent != 1) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            bool2 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getBgColor.IAuthTabCallback, bool2);
                            i5 |= 2;
                        } else {
                            if (iOnNavigationEvent != 1) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            bool2 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getBgColor.IAuthTabCallback, bool2);
                            i5 |= 2;
                        }
                    } else {
                        l2 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, oty1.onExtraCallback, l2);
                        i5 |= 1;
                    }
                }
                l = l2;
                bool = bool2;
                i = i5;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TransferReserveKeyAmountInfoResponse(i, l, bool, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TransferReserveKeyAmountInfoResponse) obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallback + 119;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TransferReserveKeyAmountInfoResponse transferReserveKeyAmountInfoResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(transferReserveKeyAmountInfoResponse, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TransferReserveKeyAmountInfoResponse.onNavigationEvent(transferReserveKeyAmountInfoResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 9;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 71 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = onExtraCallback + 5;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
