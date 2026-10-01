package im.toss.features.faceverify.impl.data.request;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FacePassInitRequest$$serializer implements aeu2<FacePassInitRequest> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final FacePassInitRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 11;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 95;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        FacePassInitRequest$$serializer facePassInitRequest$$serializer = new FacePassInitRequest$$serializer();
        INSTANCE = facePassInitRequest$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.faceverify.impl.data.request.FacePassInitRequest", facePassInitRequest$$serializer, 1);
        setanimationsloop.onWarmupCompleted("clientInfo", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 93;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private FacePassInitRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {ClientInfo$$serializer.INSTANCE};
        int i4 = onExtraCallback + 5;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final FacePassInitRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        ClientInfo clientInfo;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i2 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onWarmupCompleted + 113;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            clientInfo = (ClientInfo) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, ClientInfo$$serializer.INSTANCE, (Object) null);
            int i5 = onWarmupCompleted + 45;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        } else {
            int i7 = onExtraCallback + 73;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            clientInfo = null;
            boolean z = true;
            loop0: while (true) {
                int i9 = 0;
                while (z) {
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else {
                        if (iOnNavigationEvent != 0) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i10 = onExtraCallback + 33;
                        onWarmupCompleted = i10 % 128;
                        if (i10 % 2 == 0) {
                            break;
                        }
                        clientInfo = (ClientInfo) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, ClientInfo$$serializer.INSTANCE, clientInfo);
                        i9 = 1;
                    }
                }
                i2 = i9;
                clientInfo = (ClientInfo) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, ClientInfo$$serializer.INSTANCE, clientInfo);
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new FacePassInitRequest(i2, clientInfo, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m233deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        FacePassInitRequest facePassInitRequestDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 55;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return facePassInitRequestDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull FacePassInitRequest facePassInitRequest) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(facePassInitRequest, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            FacePassInitRequest.onExtraCallback(facePassInitRequest, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 4 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(facePassInitRequest, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            FacePassInitRequest.onExtraCallback(facePassInitRequest, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = onWarmupCompleted + 15;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (FacePassInitRequest) obj);
        int i4 = onExtraCallback + 81;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 5;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
