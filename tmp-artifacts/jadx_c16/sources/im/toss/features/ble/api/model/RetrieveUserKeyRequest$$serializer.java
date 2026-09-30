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
public final /* synthetic */ class RetrieveUserKeyRequest$$serializer implements aeu2<RetrieveUserKeyRequest> {
    public static final RetrieveUserKeyRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 47;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 9;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return serialDescriptor;
    }

    static {
        RetrieveUserKeyRequest$$serializer retrieveUserKeyRequest$$serializer = new RetrieveUserKeyRequest$$serializer();
        INSTANCE = retrieveUserKeyRequest$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.ble.api.model.RetrieveUserKeyRequest", retrieveUserKeyRequest$$serializer, 1);
        setanimationsloop.onWarmupCompleted("uuids", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 37;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private RetrieveUserKeyRequest$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.serialization.KSerializer[]] */
    /* JADX WARN: Type inference failed for: r3v4, types: [kotlinx.serialization.KSerializer[]] */
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            ?? r3 = new KSerializer[0];
            r3[1] = RetrieveUserKeyRequest.IAuthTabCallback()[1].getValue();
            kSerializerArr = r3;
        } else {
            kSerializerArr = new KSerializer[]{RetrieveUserKeyRequest.IAuthTabCallback()[0].getValue()};
        }
        int i3 = onExtraCallback + 35;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final RetrieveUserKeyRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = RetrieveUserKeyRequest.IAuthTabCallback();
        int i4 = 1;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            list = null;
            boolean z = true;
            int i5 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = onWarmupCompleted + 89;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 12 / 0;
                        if (iOnNavigationEvent != 0) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), list);
                        i5 = 1;
                    } else {
                        if (iOnNavigationEvent != 0) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), list);
                        i5 = 1;
                    }
                } else {
                    z = false;
                }
            }
            i4 = i5;
        } else {
            int i8 = onExtraCallback + 73;
            onWarmupCompleted = i8 % 128;
            list = (List) (i8 % 2 == 0 ? ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[0].getValue(), (Object) null) : ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), (Object) null));
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new RetrieveUserKeyRequest(i4, list, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m102deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        RetrieveUserKeyRequest retrieveUserKeyRequestDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 43;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return retrieveUserKeyRequestDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull RetrieveUserKeyRequest retrieveUserKeyRequest) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(retrieveUserKeyRequest, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            RetrieveUserKeyRequest.onExtraCallbackWithResult(retrieveUserKeyRequest, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 23 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(retrieveUserKeyRequest, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            RetrieveUserKeyRequest.onExtraCallbackWithResult(retrieveUserKeyRequest, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = onWarmupCompleted + 81;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (RetrieveUserKeyRequest) obj);
        if (i3 == 0) {
            int i4 = 28 / 0;
        }
        int i5 = onExtraCallback + 15;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 75;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
