package viva.republica.toss.network.model.transfer;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getDynamicHeight;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.TransferResultPage;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class TransferResultPage$Icon$Size$$serializer implements aeu2<TransferResultPage.Icon.Size> {
    public static final int $stable;
    public static final TransferResultPage$Icon$Size$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        return serialDescriptor;
    }

    static {
        TransferResultPage$Icon$Size$$serializer transferResultPage$Icon$Size$$serializer = new TransferResultPage$Icon$Size$$serializer();
        INSTANCE = transferResultPage$Icon$Size$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.TransferResultPage.Icon.Size", transferResultPage$Icon$Size$$serializer, 2);
        setanimationsloop.onWarmupCompleted("width", true);
        setanimationsloop.onWarmupCompleted("height", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 87;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private TransferResultPage$Icon$Size$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArr = new KSerializer[5];
            getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
            kSerializerArr[1] = getdynamicheight;
            kSerializerArr[1] = getdynamicheight;
        } else {
            getDynamicHeight getdynamicheight2 = getDynamicHeight.onWarmupCompleted;
            kSerializerArr = new KSerializer[]{getdynamicheight2, getdynamicheight2};
        }
        int i3 = onNavigationEvent + 79;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TransferResultPage.Icon.Size sizeM108deserialize = m108deserialize(decoder);
        int i4 = onNavigationEvent + 25;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return sizeM108deserialize;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final TransferResultPage.Icon.Size m108deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int iOnTransact;
        int iOnTransact2;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
            iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
            i = 3;
        } else {
            boolean z = true;
            iOnTransact = 0;
            int iOnTransact3 = 0;
            int i3 = 0;
            while (z) {
                int i4 = onNavigationEvent + 111;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i5 = onNavigationEvent + 119;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    iOnTransact3 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
                    i3 |= 2;
                } else {
                    iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                    i3 |= 1;
                }
            }
            iOnTransact2 = iOnTransact3;
            i = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        TransferResultPage.Icon.Size size = new TransferResultPage.Icon.Size(i, iOnTransact, iOnTransact2, (okycx) null);
        int i7 = onNavigationEvent + 51;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return size;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TransferResultPage.Icon.Size) obj);
        if (i3 == 0) {
            int i4 = 39 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TransferResultPage.Icon.Size size) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(size, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            TransferResultPage.Icon.Size.onWarmupCompleted(size, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(size, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        TransferResultPage.Icon.Size.onWarmupCompleted(size, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 34 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
