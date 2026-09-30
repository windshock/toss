package im.toss.features.ble.api.model;

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
public final /* synthetic */ class PointForestLocalPushResponse$$serializer implements aeu2<PointForestLocalPushResponse> {
    public static final PointForestLocalPushResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 31;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        PointForestLocalPushResponse$$serializer pointForestLocalPushResponse$$serializer = new PointForestLocalPushResponse$$serializer();
        INSTANCE = pointForestLocalPushResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.ble.api.model.PointForestLocalPushResponse", pointForestLocalPushResponse$$serializer, 1);
        setanimationsloop.onWarmupCompleted("contexts", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 103;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private PointForestLocalPushResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return new KSerializer[]{PointForestLocalPushResponse.IAuthTabCallback()[0].getValue()};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[1];
        kSerializerArr[1] = PointForestLocalPushResponse.IAuthTabCallback()[1].getValue();
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointForestLocalPushResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrIAuthTabCallback;
        boolean z;
        List list;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onExtraCallback = i2 % 128;
        int i3 = 1;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrIAuthTabCallback = PointForestLocalPushResponse.IAuthTabCallback();
            if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
                i3 = 0;
                list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), (Object) null);
            }
            List list2 = null;
            z = true;
            int i4 = 0;
            while (z) {
                int i5 = onExtraCallbackWithResult + 23;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else {
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), list2);
                    int i7 = onExtraCallback + 111;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    i4 = 1;
                }
            }
            list = list2;
            i3 = i4;
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrIAuthTabCallback = PointForestLocalPushResponse.IAuthTabCallback();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), (Object) null);
            } else {
                List list22 = null;
                z = true;
                int i42 = 0;
                while (z) {
                }
                list = list22;
                i3 = i42;
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new PointForestLocalPushResponse(i3, list, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m101deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        PointForestLocalPushResponse pointForestLocalPushResponseDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 7;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return pointForestLocalPushResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull PointForestLocalPushResponse pointForestLocalPushResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(pointForestLocalPushResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            PointForestLocalPushResponse.onExtraCallbackWithResult(pointForestLocalPushResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(pointForestLocalPushResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        PointForestLocalPushResponse.onExtraCallbackWithResult(pointForestLocalPushResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 70 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (PointForestLocalPushResponse) obj);
        int i4 = onExtraCallbackWithResult + 91;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 91;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
