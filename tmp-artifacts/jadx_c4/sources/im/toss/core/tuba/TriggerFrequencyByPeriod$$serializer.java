package im.toss.core.tuba;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getDynamicHeight;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class TriggerFrequencyByPeriod$$serializer implements aeu2<TriggerFrequencyByPeriod> {
    private static int IAuthTabCallback = 0;
    public static final TriggerFrequencyByPeriod$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 123;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 1;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        TriggerFrequencyByPeriod$$serializer triggerFrequencyByPeriod$$serializer = new TriggerFrequencyByPeriod$$serializer();
        INSTANCE = triggerFrequencyByPeriod$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.core.tuba.TriggerFrequencyByPeriod", triggerFrequencyByPeriod$$serializer, 2);
        setanimationsloop.onWarmupCompleted("maxTimes", false);
        setanimationsloop.onWarmupCompleted("inDays", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 109;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private TriggerFrequencyByPeriod$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {getdynamicheight, getdynamicheight};
        int i4 = onExtraCallback + 41;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final TriggerFrequencyByPeriod deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int iOnTransact;
        int iOnTransact2;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 105;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i4 = onExtraCallback + 55;
            onNavigationEvent = i4 % 128;
            i = 3;
            if (i4 % 2 != 0) {
                iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
                iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
            } else {
                iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
            }
        } else {
            boolean z = true;
            iOnTransact = 0;
            int iOnTransact3 = 0;
            int i5 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = onNavigationEvent + 47;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    if (iOnNavigationEvent == 0) {
                        iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                        i5 |= 1;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        iOnTransact3 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
                        i5 |= 2;
                    }
                } else {
                    z = false;
                }
            }
            iOnTransact2 = iOnTransact3;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        TriggerFrequencyByPeriod triggerFrequencyByPeriod = new TriggerFrequencyByPeriod(i, iOnTransact, iOnTransact2, null);
        int i8 = onNavigationEvent + 109;
        onExtraCallback = i8 % 128;
        if (i8 % 2 != 0) {
            return triggerFrequencyByPeriod;
        }
        throw null;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m92deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TriggerFrequencyByPeriod triggerFrequencyByPeriod) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(triggerFrequencyByPeriod, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TriggerFrequencyByPeriod.onExtraCallback(triggerFrequencyByPeriod, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 85;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TriggerFrequencyByPeriod) obj);
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 113;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
