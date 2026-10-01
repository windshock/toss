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
import o.getWriggleLayout;
import o.oty1;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class DebugCertificateExpireTsRequest$$serializer implements aeu2<DebugCertificateExpireTsRequest> {
    public static final int $stable;
    public static final DebugCertificateExpireTsRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DebugCertificateExpireTsRequest$$serializer debugCertificateExpireTsRequest$$serializer = new DebugCertificateExpireTsRequest$$serializer();
        INSTANCE = debugCertificateExpireTsRequest$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.tosscert.tosscacert.api.model.DebugCertificateExpireTsRequest", debugCertificateExpireTsRequest$$serializer, 2);
        setanimationsloop.onWarmupCompleted("serialNumber", false);
        setanimationsloop.onWarmupCompleted("expireTs", false);
        descriptor = setanimationsloop;
    }

    private DebugCertificateExpireTsRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{oty1.onExtraCallback, getWriggleLayout.onNavigationEvent};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final DebugCertificateExpireTsRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        long jIAuthTabCallbackDefault;
        int i;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            i = 3;
        } else {
            String strAsInterface2 = null;
            long jIAuthTabCallbackDefault2 = 0;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                    i2 |= 1;
                } else {
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                    i2 |= 2;
                }
            }
            strAsInterface = strAsInterface2;
            jIAuthTabCallbackDefault = jIAuthTabCallbackDefault2;
            i = i2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new DebugCertificateExpireTsRequest(i, jIAuthTabCallbackDefault, strAsInterface, null);
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DebugCertificateExpireTsRequest debugCertificateExpireTsRequest) {
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(debugCertificateExpireTsRequest, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        DebugCertificateExpireTsRequest.onExtraCallback(debugCertificateExpireTsRequest, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
