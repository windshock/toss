package im.toss.features.leave.domain.response;

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
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class RequiredCancellationServiceResponse$$serializer implements aeu2<RequiredCancellationServiceResponse> {
    private static int IAuthTabCallback = 0;
    public static final RequiredCancellationServiceResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 3;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 79;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        RequiredCancellationServiceResponse$$serializer requiredCancellationServiceResponse$$serializer = new RequiredCancellationServiceResponse$$serializer();
        INSTANCE = requiredCancellationServiceResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.leave.domain.response.RequiredCancellationServiceResponse", requiredCancellationServiceResponse$$serializer, 2);
        setanimationsloop.onWarmupCompleted("intro", true);
        setanimationsloop.onWarmupCompleted("services", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 83;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private RequiredCancellationServiceResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(CancellationServiceIntroResponse$$serializer.INSTANCE), sp.IAuthTabCallback(CancellationServicesResponse$$serializer.INSTANCE)};
        int i4 = onExtraCallbackWithResult + 65;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final RequiredCancellationServiceResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        CancellationServiceIntroResponse cancellationServiceIntroResponse;
        CancellationServicesResponse cancellationServicesResponse;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i3 = 3;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            cancellationServiceIntroResponse = (CancellationServiceIntroResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, CancellationServiceIntroResponse$$serializer.INSTANCE, (Object) null);
            cancellationServicesResponse = (CancellationServicesResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, CancellationServicesResponse$$serializer.INSTANCE, (Object) null);
        } else {
            CancellationServiceIntroResponse cancellationServiceIntroResponse2 = null;
            CancellationServicesResponse cancellationServicesResponse2 = null;
            int i4 = 0;
            boolean z = true;
            while (z) {
                int i5 = onExtraCallbackWithResult + 125;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    cancellationServiceIntroResponse2 = (CancellationServiceIntroResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, CancellationServiceIntroResponse$$serializer.INSTANCE, cancellationServiceIntroResponse2);
                    i4 |= 1;
                } else {
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i7 = onExtraCallbackWithResult + 55;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        cancellationServicesResponse2 = (CancellationServicesResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, CancellationServicesResponse$$serializer.INSTANCE, cancellationServicesResponse2);
                        i4 = 3;
                    } else {
                        cancellationServicesResponse2 = (CancellationServicesResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, CancellationServicesResponse$$serializer.INSTANCE, cancellationServicesResponse2);
                        i4 |= 2;
                    }
                }
            }
            cancellationServiceIntroResponse = cancellationServiceIntroResponse2;
            cancellationServicesResponse = cancellationServicesResponse2;
            i3 = i4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new RequiredCancellationServiceResponse(i3, cancellationServiceIntroResponse, cancellationServicesResponse, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m654deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        RequiredCancellationServiceResponse requiredCancellationServiceResponseDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 105;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return requiredCancellationServiceResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull RequiredCancellationServiceResponse requiredCancellationServiceResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(requiredCancellationServiceResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            RequiredCancellationServiceResponse.onNavigationEvent(requiredCancellationServiceResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(requiredCancellationServiceResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        RequiredCancellationServiceResponse.onNavigationEvent(requiredCancellationServiceResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (RequiredCancellationServiceResponse) obj);
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 18 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
