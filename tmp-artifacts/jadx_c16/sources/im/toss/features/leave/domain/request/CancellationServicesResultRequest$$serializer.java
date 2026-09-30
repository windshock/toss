package im.toss.features.leave.domain.request;

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
public final /* synthetic */ class CancellationServicesResultRequest$$serializer implements aeu2<CancellationServicesResultRequest> {
    public static final CancellationServicesResultRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 121;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 87;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        CancellationServicesResultRequest$$serializer cancellationServicesResultRequest$$serializer = new CancellationServicesResultRequest$$serializer();
        INSTANCE = cancellationServicesResultRequest$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.leave.domain.request.CancellationServicesResultRequest", cancellationServicesResultRequest$$serializer, 1);
        setanimationsloop.onWarmupCompleted("types", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 91;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private CancellationServicesResultRequest$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlinx.serialization.KSerializer[]] */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlinx.serialization.KSerializer[]] */
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            ?? r4 = new KSerializer[0];
            r4[1] = CancellationServicesResultRequest.onNavigationEvent()[0].getValue();
            kSerializerArr = r4;
        } else {
            kSerializerArr = new KSerializer[]{CancellationServicesResultRequest.onNavigationEvent()[0].getValue()};
        }
        int i3 = onWarmupCompleted + 105;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 31 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CancellationServicesResultRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = CancellationServicesResultRequest.onNavigationEvent();
        int i4 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), (Object) null);
        } else {
            List list2 = null;
            boolean z = true;
            int i5 = 0;
            while (z) {
                int i6 = onWarmupCompleted + 21;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    int i8 = onWarmupCompleted + 89;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    z = false;
                } else {
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i10 = onWarmupCompleted + 91;
                    onExtraCallback = i10 % 128;
                    list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) (i10 % 2 == 0 ? lazyArrOnNavigationEvent[1].getValue() : lazyArrOnNavigationEvent[0].getValue()), list2);
                    i5 = 1;
                }
            }
            list = list2;
            i4 = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CancellationServicesResultRequest(i4, list, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m645deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        CancellationServicesResultRequest cancellationServicesResultRequestDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 117;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return cancellationServicesResultRequestDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CancellationServicesResultRequest cancellationServicesResultRequest) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(cancellationServicesResultRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CancellationServicesResultRequest.IAuthTabCallback(cancellationServicesResultRequest, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 111;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CancellationServicesResultRequest) obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 41;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
