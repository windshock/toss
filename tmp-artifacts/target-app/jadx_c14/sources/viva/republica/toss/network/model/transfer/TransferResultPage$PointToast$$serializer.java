package viva.republica.toss.network.model.transfer;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.TransferResultPage;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class TransferResultPage$PointToast$$serializer implements aeu2<TransferResultPage.PointToast> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final TransferResultPage$PointToast$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 35;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 19;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        TransferResultPage$PointToast$$serializer transferResultPage$PointToast$$serializer = new TransferResultPage$PointToast$$serializer();
        INSTANCE = transferResultPage$PointToast$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.TransferResultPage.PointToast", transferResultPage$PointToast$$serializer, 2);
        setanimationsloop.onWarmupCompleted("currentPoint", true);
        setanimationsloop.onWarmupCompleted("addedPoint", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 125;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private TransferResultPage$PointToast$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            oty1 oty1Var = oty1.onExtraCallback;
            return new KSerializer[]{oty1Var, oty1Var};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[3];
        oty1 oty1Var2 = oty1.onExtraCallback;
        kSerializerArr[0] = oty1Var2;
        kSerializerArr[1] = oty1Var2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TransferResultPage.PointToast pointToastM119deserialize = m119deserialize(decoder);
        int i4 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
        return pointToastM119deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final TransferResultPage.PointToast m119deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        long jIAuthTabCallbackDefault;
        long jIAuthTabCallbackDefault2;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 37;
        onExtraCallbackWithResult = i3 % 128;
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
            jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
            jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
            i = 3;
        } else {
            int i4 = IAuthTabCallback + 43;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 4;
            }
            long jIAuthTabCallbackDefault3 = 0;
            int i6 = 0;
            boolean z = true;
            long jIAuthTabCallbackDefault4 = 0;
            while (!(!z)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i7 = IAuthTabCallback + 37;
                    int i8 = i7 % 128;
                    onExtraCallbackWithResult = i8;
                    if (i7 % 2 != 0) {
                        throw null;
                    }
                    if (iOnNavigationEvent != 0) {
                        int i9 = i8 + 91;
                        IAuthTabCallback = i9 % 128;
                        if (i9 % 2 == 0) {
                            if (iOnNavigationEvent != 0) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            jIAuthTabCallbackDefault4 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
                            i6 |= 2;
                        } else {
                            if (iOnNavigationEvent != 1) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            jIAuthTabCallbackDefault4 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
                            i6 |= 2;
                        }
                    } else {
                        jIAuthTabCallbackDefault3 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                        i6 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            i = i6;
            jIAuthTabCallbackDefault = jIAuthTabCallbackDefault3;
            jIAuthTabCallbackDefault2 = jIAuthTabCallbackDefault4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TransferResultPage.PointToast(i, jIAuthTabCallbackDefault, jIAuthTabCallbackDefault2, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        serialize(encoder, (TransferResultPage.PointToast) obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TransferResultPage.PointToast pointToast) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(pointToast, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TransferResultPage.PointToast.onExtraCallback(pointToast, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 49;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
