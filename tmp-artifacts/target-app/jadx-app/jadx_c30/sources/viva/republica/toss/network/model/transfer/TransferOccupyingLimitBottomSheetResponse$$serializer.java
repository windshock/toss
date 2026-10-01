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
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.TransferOccupyingLimitBottomSheetResponse;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TransferOccupyingLimitBottomSheetResponse$$serializer implements aeu2<TransferOccupyingLimitBottomSheetResponse> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final TransferOccupyingLimitBottomSheetResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        TransferOccupyingLimitBottomSheetResponse$$serializer transferOccupyingLimitBottomSheetResponse$$serializer = new TransferOccupyingLimitBottomSheetResponse$$serializer();
        INSTANCE = transferOccupyingLimitBottomSheetResponse$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.TransferOccupyingLimitBottomSheetResponse", transferOccupyingLimitBottomSheetResponse$$serializer, 1);
        setanimationsloop.onWarmupCompleted("bottomSheet", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 121;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private TransferOccupyingLimitBottomSheetResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArr = new KSerializer[0];
            kSerializerArr[0] = sp.IAuthTabCallback(TransferOccupyingLimitBottomSheetResponse$BottomSheetInfo$$serializer.INSTANCE);
        } else {
            kSerializerArr = new KSerializer[]{sp.IAuthTabCallback(TransferOccupyingLimitBottomSheetResponse$BottomSheetInfo$$serializer.INSTANCE)};
        }
        int i3 = onWarmupCompleted + 3;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TransferOccupyingLimitBottomSheetResponse transferOccupyingLimitBottomSheetResponseM104deserialize = m104deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 64 / 0;
        }
        return transferOccupyingLimitBottomSheetResponseM104deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TransferOccupyingLimitBottomSheetResponse m104deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        TransferOccupyingLimitBottomSheetResponse.BottomSheetInfo bottomSheetInfo;
        int iOnNavigationEvent;
        int i;
        Object objOnExtraCallbackWithResult;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i3 = 1;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            TransferOccupyingLimitBottomSheetResponse.BottomSheetInfo bottomSheetInfo2 = null;
            boolean z = true;
            loop0: while (true) {
                int i4 = 0;
                while (z) {
                    int i5 = onWarmupCompleted + 1;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent != -1) {
                        int i7 = onWarmupCompleted + 33;
                        int i8 = i7 % 128;
                        onExtraCallbackWithResult = i8;
                        if (i7 % 2 != 0) {
                            int i9 = 72 / 0;
                            if (iOnNavigationEvent != 0) {
                                break loop0;
                            }
                            int i10 = i8 + 75;
                            onWarmupCompleted = i10 % 128;
                            i = i10 % 2;
                            objOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, TransferOccupyingLimitBottomSheetResponse$BottomSheetInfo$$serializer.INSTANCE, bottomSheetInfo2);
                            if (i != 0) {
                                break;
                            }
                            bottomSheetInfo2 = (TransferOccupyingLimitBottomSheetResponse.BottomSheetInfo) objOnExtraCallbackWithResult;
                            i4 = 1;
                        } else {
                            if (iOnNavigationEvent != 0) {
                                break loop0;
                            }
                            int i102 = i8 + 75;
                            onWarmupCompleted = i102 % 128;
                            i = i102 % 2;
                            objOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, TransferOccupyingLimitBottomSheetResponse$BottomSheetInfo$$serializer.INSTANCE, bottomSheetInfo2);
                            if (i != 0) {
                            }
                        }
                    } else {
                        z = false;
                    }
                }
                bottomSheetInfo = bottomSheetInfo2;
                i3 = i4;
                bottomSheetInfo2 = (TransferOccupyingLimitBottomSheetResponse.BottomSheetInfo) objOnExtraCallbackWithResult;
            }
            throw new UnknownFieldException(iOnNavigationEvent);
        }
        bottomSheetInfo = (TransferOccupyingLimitBottomSheetResponse.BottomSheetInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, TransferOccupyingLimitBottomSheetResponse$BottomSheetInfo$$serializer.INSTANCE, (Object) null);
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TransferOccupyingLimitBottomSheetResponse(i3, bottomSheetInfo, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TransferOccupyingLimitBottomSheetResponse) obj);
        int i4 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TransferOccupyingLimitBottomSheetResponse transferOccupyingLimitBottomSheetResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(transferOccupyingLimitBottomSheetResponse, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TransferOccupyingLimitBottomSheetResponse.IAuthTabCallback(transferOccupyingLimitBottomSheetResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}
