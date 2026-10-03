package viva.republica.toss.network.model.transfer.periodic;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency$Monthly$$serializer;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class PeriodicTransferFrequency$OneTime$$serializer implements aeu2<PeriodicTransferFrequency.OneTime> {
    private static int IAuthTabCallback = 0;
    public static final PeriodicTransferFrequency$OneTime$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 119;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 47;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        PeriodicTransferFrequency$OneTime$$serializer periodicTransferFrequency$OneTime$$serializer = new PeriodicTransferFrequency$OneTime$$serializer();
        INSTANCE = periodicTransferFrequency$OneTime$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("ONE_TIME", periodicTransferFrequency$OneTime$$serializer, 1);
        setanimationsloop.onWarmupCompleted("dueDate", false);
        setanimationsloop.onWarmupCompleted(new PeriodicTransferFrequency$Monthly$$serializer.onExtraCallback("frequencyType"));
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 53;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private PeriodicTransferFrequency$OneTime$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onWarmupCompleted = i2 % 128;
        return i2 % 2 == 0 ? new KSerializer[]{getWriggleLayout.onNavigationEvent} : new KSerializer[]{getWriggleLayout.onNavigationEvent};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        PeriodicTransferFrequency.OneTime oneTimeM133deserialize = m133deserialize(decoder);
        int i4 = IAuthTabCallback + 105;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return oneTimeM133deserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final PeriodicTransferFrequency.OneTime m133deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i2 = 1;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onWarmupCompleted + 103;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 5 / 5;
            }
            boolean z = true;
            strAsInterface = null;
            int i5 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else {
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i5 = 1;
                }
            }
            i2 = i5;
        } else {
            int i6 = onWarmupCompleted + 45;
            IAuthTabCallback = i6 % 128;
            strAsInterface = i6 % 2 != 0 ? ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1) : ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new PeriodicTransferFrequency.OneTime(i2, strAsInterface, null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (PeriodicTransferFrequency.OneTime) obj);
        int i4 = IAuthTabCallback + 53;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull PeriodicTransferFrequency.OneTime oneTime) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(oneTime, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        PeriodicTransferFrequency.OneTime.onNavigationEvent(oneTime, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 15;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}
