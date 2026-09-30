package im.toss.features.faceverify.impl.data.response;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CheckRegistrationResponse$$serializer implements aeu2<CheckRegistrationResponse> {
    public static final int $stable;
    public static final CheckRegistrationResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 == 0) {
            int i4 = 31 / 0;
        }
        return serialDescriptor;
    }

    static {
        CheckRegistrationResponse$$serializer checkRegistrationResponse$$serializer = new CheckRegistrationResponse$$serializer();
        INSTANCE = checkRegistrationResponse$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.faceverify.impl.data.response.CheckRegistrationResponse", checkRegistrationResponse$$serializer, 4);
        setanimationsloop.onWarmupCompleted("registered", false);
        setanimationsloop.onWarmupCompleted("serviceType", true);
        setanimationsloop.onWarmupCompleted("needReRegister", true);
        setanimationsloop.onWarmupCompleted("faceAccessBlocked", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 25;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private CheckRegistrationResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getBgColor.IAuthTabCallback;
        KSerializer<?>[] kSerializerArr = {kSerializer, sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer)};
        int i4 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CheckRegistrationResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean z;
        int i;
        Boolean bool;
        Boolean bool2;
        String str;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
            String str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, (Object) null);
            getBgColor getbgcolor = getBgColor.IAuthTabCallback;
            bool = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getbgcolor, (Object) null);
            z = zOnExtraCallbackWithResult;
            bool2 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getbgcolor, (Object) null);
            str = str2;
            i = 15;
        } else {
            boolean zOnExtraCallbackWithResult2 = false;
            boolean z2 = true;
            Boolean bool3 = null;
            Boolean bool4 = null;
            String str3 = null;
            int i4 = 0;
            while (z2) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z2 = false;
                } else if (iOnNavigationEvent != 0) {
                    if (iOnNavigationEvent != 1) {
                        int i5 = onExtraCallbackWithResult;
                        int i6 = i5 + 55;
                        onNavigationEvent = i6 % 128;
                        int i7 = i6 % 2;
                        if (iOnNavigationEvent != 2) {
                            int i8 = i5 + 113;
                            int i9 = i8 % 128;
                            onNavigationEvent = i9;
                            int i10 = i8 % 2;
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i11 = i9 + 41;
                            onExtraCallbackWithResult = i11 % 128;
                            int i12 = i11 % 2;
                            bool4 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getBgColor.IAuthTabCallback, bool4);
                            i4 = i12 == 0 ? i4 | 7 : i4 | 8;
                        } else {
                            bool3 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getBgColor.IAuthTabCallback, bool3);
                            i4 |= 4;
                            i2 = onNavigationEvent + 59;
                            onExtraCallbackWithResult = i2 % 128;
                        }
                    } else {
                        str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str3);
                        i4 |= 2;
                        i2 = onExtraCallbackWithResult + 23;
                        onNavigationEvent = i2 % 128;
                    }
                    int i13 = i2 % 2;
                } else {
                    zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
                    i4 |= 1;
                }
            }
            z = zOnExtraCallbackWithResult2;
            i = i4;
            bool = bool3;
            bool2 = bool4;
            str = str3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CheckRegistrationResponse(i, z, str, bool, bool2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m236deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CheckRegistrationResponse checkRegistrationResponseDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return checkRegistrationResponseDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CheckRegistrationResponse checkRegistrationResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(checkRegistrationResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CheckRegistrationResponse.onExtraCallback(checkRegistrationResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(checkRegistrationResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        CheckRegistrationResponse.onExtraCallback(checkRegistrationResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CheckRegistrationResponse) obj);
        int i4 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        obj.hashCode();
        throw null;
    }
}
