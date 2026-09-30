package viva.republica.toss.network.model.pedometer;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.aeu2;
import o.getBgColor;
import o.oty1;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.pedometer.PedometerTerms;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class PedometerTerms$Term$$serializer implements aeu2<PedometerTerms.Term> {
    private static int IAuthTabCallback = 0;
    public static final PedometerTerms$Term$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 73;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 65;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return serialDescriptor;
        }
        obj.hashCode();
        throw null;
    }

    static {
        PedometerTerms$Term$$serializer pedometerTerms$Term$$serializer = new PedometerTerms$Term$$serializer();
        INSTANCE = pedometerTerms$Term$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.pedometer.PedometerTerms.Term", pedometerTerms$Term$$serializer, 2);
        setanimationsloop.onWarmupCompleted("termsId", false);
        setanimationsloop.onWarmupCompleted("agreed", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 107;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private PedometerTerms$Term$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {oty1.onExtraCallback, getBgColor.IAuthTabCallback};
        int i4 = onExtraCallback + 5;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        PedometerTerms.Term termM74deserialize = m74deserialize(decoder);
        int i4 = onExtraCallback + 3;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return termM74deserialize;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final PedometerTerms.Term m74deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean zOnExtraCallbackWithResult;
        long j;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onExtraCallback + 65;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            long jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
            j = jIAuthTabCallbackDefault;
            i = 3;
        } else {
            long jIAuthTabCallbackDefault2 = 0;
            boolean zOnExtraCallbackWithResult2 = false;
            int i5 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i6 = onExtraCallback + 7;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
                    i5 |= 2;
                } else {
                    jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                    i5 |= 1;
                }
            }
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
            j = jIAuthTabCallbackDefault2;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new PedometerTerms.Term(i, j, zOnExtraCallbackWithResult, null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (PedometerTerms.Term) obj);
        int i4 = onExtraCallbackWithResult + 85;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull PedometerTerms.Term term) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(term, BuildConfig.FLAVOR);
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            PedometerTerms.Term.onExtraCallbackWithResult(term, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(term, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        PedometerTerms.Term.onExtraCallbackWithResult(term, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 63 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = onExtraCallbackWithResult + 27;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
