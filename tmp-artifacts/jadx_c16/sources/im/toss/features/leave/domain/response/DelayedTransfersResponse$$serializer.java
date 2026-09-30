package im.toss.features.leave.domain.response;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DelayedTransfersResponse$$serializer implements aeu2<DelayedTransfersResponse> {
    private static int IAuthTabCallback = 1;
    public static final DelayedTransfersResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 59 / 0;
        }
        return serialDescriptor;
    }

    static {
        DelayedTransfersResponse$$serializer delayedTransfersResponse$$serializer = new DelayedTransfersResponse$$serializer();
        INSTANCE = delayedTransfersResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.leave.domain.response.DelayedTransfersResponse", delayedTransfersResponse$$serializer, 1);
        setanimationsloop.onWarmupCompleted("items", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 43;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private DelayedTransfersResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {DelayedTransfersResponse.onWarmupCompleted()[0].getValue()};
        int i4 = onWarmupCompleted + 55;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final DelayedTransfersResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = DelayedTransfersResponse.onWarmupCompleted();
        int i4 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), (Object) null);
        } else {
            int i5 = onWarmupCompleted + 83;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 / 3;
            }
            list = null;
            boolean z = true;
            int i7 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else {
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i8 = IAuthTabCallback + 63;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), list);
                    i7 = 1;
                }
            }
            i4 = i7;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new DelayedTransfersResponse(i4, list, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m651deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DelayedTransfersResponse delayedTransfersResponse) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(delayedTransfersResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        DelayedTransfersResponse.onExtraCallbackWithResult(delayedTransfersResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 3;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DelayedTransfersResponse) obj);
        int i4 = onWarmupCompleted + 51;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 15;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
