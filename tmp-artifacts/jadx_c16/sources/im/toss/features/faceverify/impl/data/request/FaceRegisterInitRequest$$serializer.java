package im.toss.features.faceverify.impl.data.request;

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
public final /* synthetic */ class FaceRegisterInitRequest$$serializer implements aeu2<FaceRegisterInitRequest> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final FaceRegisterInitRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 45;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        FaceRegisterInitRequest$$serializer faceRegisterInitRequest$$serializer = new FaceRegisterInitRequest$$serializer();
        INSTANCE = faceRegisterInitRequest$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.faceverify.impl.data.request.FaceRegisterInitRequest", faceRegisterInitRequest$$serializer, 2);
        setanimationsloop.onWarmupCompleted("serviceType", false);
        setanimationsloop.onWarmupCompleted("clientInfo", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 87;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private FaceRegisterInitRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent, ClientInfo$$serializer.INSTANCE};
        int i4 = onExtraCallback + 81;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final FaceRegisterInitRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        ClientInfo clientInfo;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onExtraCallback + 41;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            clientInfo = (ClientInfo) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, ClientInfo$$serializer.INSTANCE, (Object) null);
            i = 3;
        } else {
            String strAsInterface2 = null;
            ClientInfo clientInfo2 = null;
            int i5 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = onExtraCallback + 101;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    if (iOnNavigationEvent == 0) {
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i5 |= 1;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        clientInfo2 = (ClientInfo) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, ClientInfo$$serializer.INSTANCE, clientInfo2);
                        i5 |= 2;
                    }
                } else {
                    int i8 = onExtraCallback + 27;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    z = false;
                }
            }
            strAsInterface = strAsInterface2;
            clientInfo = clientInfo2;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new FaceRegisterInitRequest(i, strAsInterface, clientInfo, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m234deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        FaceRegisterInitRequest faceRegisterInitRequestDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
        return faceRegisterInitRequestDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull FaceRegisterInitRequest faceRegisterInitRequest) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(faceRegisterInitRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        FaceRegisterInitRequest.onNavigationEvent(faceRegisterInitRequest, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 121;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (FaceRegisterInitRequest) obj);
        if (i3 == 0) {
            int i4 = 69 / 0;
        }
        int i5 = IAuthTabCallback + 47;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 79 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
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
