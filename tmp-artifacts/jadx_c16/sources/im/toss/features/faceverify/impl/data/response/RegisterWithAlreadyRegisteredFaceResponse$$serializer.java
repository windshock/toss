package im.toss.features.faceverify.impl.data.response;

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
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class RegisterWithAlreadyRegisteredFaceResponse$$serializer implements aeu2<RegisterWithAlreadyRegisteredFaceResponse> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final RegisterWithAlreadyRegisteredFaceResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        RegisterWithAlreadyRegisteredFaceResponse$$serializer registerWithAlreadyRegisteredFaceResponse$$serializer = new RegisterWithAlreadyRegisteredFaceResponse$$serializer();
        INSTANCE = registerWithAlreadyRegisteredFaceResponse$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.faceverify.impl.data.response.RegisterWithAlreadyRegisteredFaceResponse", registerWithAlreadyRegisteredFaceResponse$$serializer, 1);
        setanimationsloop.onWarmupCompleted("entryPoint", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 1;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private RegisterWithAlreadyRegisteredFaceResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        IAuthTabCallback = i2 % 128;
        return i2 % 2 != 0 ? new KSerializer[]{sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent)} : new KSerializer[]{sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent)};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final RegisterWithAlreadyRegisteredFaceResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i2 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onExtraCallback + 69;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            str = (String) (i4 != 0 ? ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null) : ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null));
        } else {
            String str2 = null;
            int i5 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = IAuthTabCallback + 19;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str2);
                    int i8 = IAuthTabCallback + 23;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    i5 = 1;
                } else {
                    z = false;
                }
            }
            str = str2;
            i2 = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new RegisterWithAlreadyRegisteredFaceResponse(i2, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m242deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        RegisterWithAlreadyRegisteredFaceResponse registerWithAlreadyRegisteredFaceResponseDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
        int i5 = onExtraCallback + 107;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return registerWithAlreadyRegisteredFaceResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull RegisterWithAlreadyRegisteredFaceResponse registerWithAlreadyRegisteredFaceResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(registerWithAlreadyRegisteredFaceResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            RegisterWithAlreadyRegisteredFaceResponse.onNavigationEvent(registerWithAlreadyRegisteredFaceResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(registerWithAlreadyRegisteredFaceResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        RegisterWithAlreadyRegisteredFaceResponse.onNavigationEvent(registerWithAlreadyRegisteredFaceResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = IAuthTabCallback + 51;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (RegisterWithAlreadyRegisteredFaceResponse) obj);
        int i4 = IAuthTabCallback + 31;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}
