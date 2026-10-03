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
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency$Monthly$$serializer;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class PeriodicTransferFrequency$Daily$$serializer implements aeu2<PeriodicTransferFrequency.Daily> {
    private static int IAuthTabCallback = 0;
    public static final PeriodicTransferFrequency$Daily$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 23;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        PeriodicTransferFrequency$Daily$$serializer periodicTransferFrequency$Daily$$serializer = new PeriodicTransferFrequency$Daily$$serializer();
        INSTANCE = periodicTransferFrequency$Daily$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("DAILY", periodicTransferFrequency$Daily$$serializer, 2);
        setanimationsloop.onWarmupCompleted("startDate", false);
        setanimationsloop.onWarmupCompleted("endDate", false);
        setanimationsloop.onWarmupCompleted(new PeriodicTransferFrequency$Monthly$$serializer.onExtraCallback("frequencyType"));
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 113;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private PeriodicTransferFrequency$Daily$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getwrigglelayout);
            KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(getwrigglelayout);
            kSerializerArr = new KSerializer[4];
            kSerializerArr[1] = kSerializerIAuthTabCallback;
            kSerializerArr[0] = kSerializerIAuthTabCallback2;
        } else {
            getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
            kSerializerArr = new KSerializer[]{sp.IAuthTabCallback(getwrigglelayout2), sp.IAuthTabCallback(getwrigglelayout2)};
        }
        int i3 = onNavigationEvent + 121;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        PeriodicTransferFrequency.Daily dailyM131deserialize = m131deserialize(decoder);
        int i4 = onNavigationEvent + 15;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return dailyM131deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final PeriodicTransferFrequency.Daily m131deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        String str2;
        int i;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 95;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            i = 3;
        } else {
            int i5 = onExtraCallback + 93;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            boolean z = true;
            int i7 = 0;
            String str3 = null;
            String str4 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i8 = onNavigationEvent + 83;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str3);
                    i7 |= 2;
                    int i10 = onNavigationEvent + 109;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                } else {
                    str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str4);
                    i7 |= 1;
                }
            }
            str = str3;
            str2 = str4;
            i = i7;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new PeriodicTransferFrequency.Daily(i, str2, str, null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (PeriodicTransferFrequency.Daily) obj);
        if (i3 == 0) {
            int i4 = 68 / 0;
        }
        int i5 = onNavigationEvent + 33;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull PeriodicTransferFrequency.Daily daily) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(daily, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        PeriodicTransferFrequency.Daily.onWarmupCompleted(daily, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 31;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onExtraCallback + 43;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
