package im.toss.appsintoss.data.remote.model;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AppsInTossCashReceiptRequest$$serializer implements aeu2<AppsInTossCashReceiptRequest> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final AppsInTossCashReceiptRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 45;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        AppsInTossCashReceiptRequest$$serializer appsInTossCashReceiptRequest$$serializer = new AppsInTossCashReceiptRequest$$serializer();
        INSTANCE = appsInTossCashReceiptRequest$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.appsintoss.data.remote.model.AppsInTossCashReceiptRequest", appsInTossCashReceiptRequest$$serializer, 1);
        setanimationsloop.onWarmupCompleted("orderId", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 15;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private AppsInTossCashReceiptRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent};
        int i4 = onExtraCallback + 115;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AppsInTossCashReceiptRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 1;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            strAsInterface = null;
            int i5 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else {
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i5 = 1;
                }
            }
            i4 = i5;
        } else {
            int i6 = onWarmupCompleted + 101;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            int i8 = onExtraCallback + 55;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AppsInTossCashReceiptRequest(i4, strAsInterface, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m44deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        AppsInTossCashReceiptRequest appsInTossCashReceiptRequestDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 83;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return appsInTossCashReceiptRequestDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AppsInTossCashReceiptRequest appsInTossCashReceiptRequest) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(appsInTossCashReceiptRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AppsInTossCashReceiptRequest.onWarmupCompleted(appsInTossCashReceiptRequest, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 93;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AppsInTossCashReceiptRequest) obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
