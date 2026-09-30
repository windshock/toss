package viva.republica.toss.network.model.transfer;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.aeu2;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.SimpleDetectFraudRequest;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class SimpleDetectFraudRequest$$serializer implements aeu2<SimpleDetectFraudRequest> {
    public static final SimpleDetectFraudRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 67;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 39;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        SimpleDetectFraudRequest$$serializer simpleDetectFraudRequest$$serializer = new SimpleDetectFraudRequest$$serializer();
        INSTANCE = simpleDetectFraudRequest$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.SimpleDetectFraudRequest", simpleDetectFraudRequest$$serializer, 1);
        setanimationsloop.onWarmupCompleted("depositTarget", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 105;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 69 / 0;
        }
    }

    private SimpleDetectFraudRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArr = new KSerializer[0];
            kSerializerArr[0] = SimpleDetectFraudRequest$AccountTarget$$serializer.INSTANCE;
        } else {
            kSerializerArr = new KSerializer[]{SimpleDetectFraudRequest$AccountTarget$$serializer.INSTANCE};
        }
        int i3 = onExtraCallbackWithResult + 85;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return m99deserialize(decoder);
        }
        m99deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final SimpleDetectFraudRequest m99deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SimpleDetectFraudRequest.AccountTarget accountTarget;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            accountTarget = (SimpleDetectFraudRequest.AccountTarget) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, SimpleDetectFraudRequest$AccountTarget$$serializer.INSTANCE, (Object) null);
        } else {
            SimpleDetectFraudRequest.AccountTarget accountTarget2 = null;
            boolean z = true;
            int i5 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else {
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i6 = onWarmupCompleted + 3;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    accountTarget2 = (SimpleDetectFraudRequest.AccountTarget) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, SimpleDetectFraudRequest$AccountTarget$$serializer.INSTANCE, accountTarget2);
                    i5 = 1;
                }
            }
            accountTarget = accountTarget2;
            i4 = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new SimpleDetectFraudRequest(i4, accountTarget, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (SimpleDetectFraudRequest) obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull SimpleDetectFraudRequest simpleDetectFraudRequest) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(simpleDetectFraudRequest, BuildConfig.FLAVOR);
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            SimpleDetectFraudRequest.onNavigationEvent(simpleDetectFraudRequest, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(simpleDetectFraudRequest, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        SimpleDetectFraudRequest.onNavigationEvent(simpleDetectFraudRequest, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
