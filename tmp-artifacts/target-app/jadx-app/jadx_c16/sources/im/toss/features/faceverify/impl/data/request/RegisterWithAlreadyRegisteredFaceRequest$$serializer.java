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
public final /* synthetic */ class RegisterWithAlreadyRegisteredFaceRequest$$serializer implements aeu2<RegisterWithAlreadyRegisteredFaceRequest> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final RegisterWithAlreadyRegisteredFaceRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        RegisterWithAlreadyRegisteredFaceRequest$$serializer registerWithAlreadyRegisteredFaceRequest$$serializer = new RegisterWithAlreadyRegisteredFaceRequest$$serializer();
        INSTANCE = registerWithAlreadyRegisteredFaceRequest$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.faceverify.impl.data.request.RegisterWithAlreadyRegisteredFaceRequest", registerWithAlreadyRegisteredFaceRequest$$serializer, 1);
        setanimationsloop.onWarmupCompleted("entryPoint", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 71;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private RegisterWithAlreadyRegisteredFaceRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return new KSerializer[]{getWriggleLayout.onNavigationEvent};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[0];
        kSerializerArr[1] = getWriggleLayout.onNavigationEvent;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RegisterWithAlreadyRegisteredFaceRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        int iOnNavigationEvent;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 89;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i5 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
        } else {
            String strAsInterface2 = null;
            boolean z = true;
            int i6 = 0;
            while (z) {
                int i7 = onExtraCallback + 109;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    int i8 = 41 / 0;
                    if (iOnNavigationEvent != -1) {
                        i = onExtraCallback + 125;
                        IAuthTabCallback = i % 128;
                        if (i % 2 != 0) {
                            int i9 = 29 / 0;
                            if (iOnNavigationEvent != 0) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                            int i10 = onExtraCallback + 81;
                            IAuthTabCallback = i10 % 128;
                            int i11 = i10 % 2;
                            i6 = 1;
                        } else {
                            if (iOnNavigationEvent != 0) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                            int i102 = onExtraCallback + 81;
                            IAuthTabCallback = i102 % 128;
                            int i112 = i102 % 2;
                            i6 = 1;
                        }
                    } else {
                        z = false;
                    }
                } else {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent != -1) {
                        i = onExtraCallback + 125;
                        IAuthTabCallback = i % 128;
                        if (i % 2 != 0) {
                        }
                    } else {
                        z = false;
                    }
                }
            }
            strAsInterface = strAsInterface2;
            i5 = i6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new RegisterWithAlreadyRegisteredFaceRequest(i5, strAsInterface, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m235deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        RegisterWithAlreadyRegisteredFaceRequest registerWithAlreadyRegisteredFaceRequestDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 21;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return registerWithAlreadyRegisteredFaceRequestDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull RegisterWithAlreadyRegisteredFaceRequest registerWithAlreadyRegisteredFaceRequest) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(registerWithAlreadyRegisteredFaceRequest, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            RegisterWithAlreadyRegisteredFaceRequest.onExtraCallbackWithResult(registerWithAlreadyRegisteredFaceRequest, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(registerWithAlreadyRegisteredFaceRequest, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        RegisterWithAlreadyRegisteredFaceRequest.onExtraCallbackWithResult(registerWithAlreadyRegisteredFaceRequest, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (RegisterWithAlreadyRegisteredFaceRequest) obj);
        if (i3 == 0) {
            int i4 = 39 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 30 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = onExtraCallback + 25;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
