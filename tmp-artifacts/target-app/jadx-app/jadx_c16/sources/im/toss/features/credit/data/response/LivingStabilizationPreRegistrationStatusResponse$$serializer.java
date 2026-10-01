package im.toss.features.credit.data.response;

import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LivingStabilizationPreRegistrationStatusResponse$$serializer implements aeu2<LivingStabilizationPreRegistrationStatusResponse> {
    private static int IAuthTabCallback = 0;
    public static final LivingStabilizationPreRegistrationStatusResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 35;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            serialDescriptor = descriptor;
            int i4 = 73 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i2 + 85;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        LivingStabilizationPreRegistrationStatusResponse$$serializer livingStabilizationPreRegistrationStatusResponse$$serializer = new LivingStabilizationPreRegistrationStatusResponse$$serializer();
        INSTANCE = livingStabilizationPreRegistrationStatusResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.LivingStabilizationPreRegistrationStatusResponse", livingStabilizationPreRegistrationStatusResponse$$serializer, 2);
        setanimationsloop.onWarmupCompleted("status", true);
        setanimationsloop.onWarmupCompleted("scoreRaiseRedirectUrl", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private LivingStabilizationPreRegistrationStatusResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onNavigationEvent = i2 % 128;
        return i2 % 2 != 0 ? new KSerializer[]{sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback((KSerializer) LivingStabilizationPreRegistrationStatusResponse.onNavigationEvent()[0].getValue())} : new KSerializer[]{sp.IAuthTabCallback((KSerializer) LivingStabilizationPreRegistrationStatusResponse.onNavigationEvent()[0].getValue()), sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent)};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final LivingStabilizationPreRegistrationStatusResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        LivingStabilizationPreRegistrationStatus livingStabilizationPreRegistrationStatus;
        String str;
        int i;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 113;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            LivingStabilizationPreRegistrationStatusResponse.onNavigationEvent();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = LivingStabilizationPreRegistrationStatusResponse.onNavigationEvent();
        if (ywVarOnWarmupCompleted2.extraCallbackWithResult()) {
            livingStabilizationPreRegistrationStatus = (LivingStabilizationPreRegistrationStatus) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), (Object) null);
            str = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, (Object) null);
            i = 3;
        } else {
            int i4 = 0;
            livingStabilizationPreRegistrationStatus = null;
            String str2 = null;
            boolean z = true;
            while (!(!z)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i5 = onWarmupCompleted + 85;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    str2 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str2);
                    i4 |= 2;
                    int i7 = onNavigationEvent + 43;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    livingStabilizationPreRegistrationStatus = (LivingStabilizationPreRegistrationStatus) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), livingStabilizationPreRegistrationStatus);
                    i4 |= 1;
                }
            }
            str = str2;
            i = i4;
        }
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        return new LivingStabilizationPreRegistrationStatusResponse(i, livingStabilizationPreRegistrationStatus, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m178deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        LivingStabilizationPreRegistrationStatusResponse livingStabilizationPreRegistrationStatusResponseDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 79;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return livingStabilizationPreRegistrationStatusResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull LivingStabilizationPreRegistrationStatusResponse livingStabilizationPreRegistrationStatusResponse) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(livingStabilizationPreRegistrationStatusResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        LivingStabilizationPreRegistrationStatusResponse.onExtraCallbackWithResult(livingStabilizationPreRegistrationStatusResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 37;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (LivingStabilizationPreRegistrationStatusResponse) obj);
        int i4 = onNavigationEvent + 13;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 71;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
