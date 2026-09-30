package viva.republica.toss.tosscert.tosscacert.api.model;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.aeu2;
import o.oty1;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class DebugCertificateExpireTsRestoreRequest$$serializer implements aeu2<DebugCertificateExpireTsRestoreRequest> {
    public static final int $stable;
    public static final DebugCertificateExpireTsRestoreRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DebugCertificateExpireTsRestoreRequest$$serializer debugCertificateExpireTsRestoreRequest$$serializer = new DebugCertificateExpireTsRestoreRequest$$serializer();
        INSTANCE = debugCertificateExpireTsRestoreRequest$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.tosscert.tosscacert.api.model.DebugCertificateExpireTsRestoreRequest", debugCertificateExpireTsRestoreRequest$$serializer, 1);
        setanimationsloop.onWarmupCompleted("serialNumber", false);
        descriptor = setanimationsloop;
    }

    private DebugCertificateExpireTsRestoreRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{oty1.onExtraCallback};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final DebugCertificateExpireTsRestoreRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        long jIAuthTabCallbackDefault;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
        } else {
            long jIAuthTabCallbackDefault2 = 0;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else {
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                    i2 = 1;
                }
            }
            jIAuthTabCallbackDefault = jIAuthTabCallbackDefault2;
            i = i2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new DebugCertificateExpireTsRestoreRequest(i, jIAuthTabCallbackDefault, null);
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DebugCertificateExpireTsRestoreRequest debugCertificateExpireTsRestoreRequest) {
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(debugCertificateExpireTsRestoreRequest, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        vylVarOnExtraCallback.onExtraCallback(serialDescriptor, 0, debugCertificateExpireTsRestoreRequest.serialNumber);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
