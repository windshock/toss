package im.toss.features.home.core.remote.model.consumption;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionInfoResponse$$serializer implements aeu2<ConsumptionInfoResponse> {
    private static int IAuthTabCallback = 0;
    public static final ConsumptionInfoResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 71;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 27;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        ConsumptionInfoResponse$$serializer consumptionInfoResponse$$serializer = new ConsumptionInfoResponse$$serializer();
        INSTANCE = consumptionInfoResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.consumption.ConsumptionInfoResponse", consumptionInfoResponse$$serializer, 1);
        setanimationsloop.onWarmupCompleted("lastYearMonth", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 37;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private ConsumptionInfoResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent};
        int i4 = IAuthTabCallback + 25;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ConsumptionInfoResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        int iOnNavigationEvent;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i2 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
        } else {
            String strAsInterface2 = null;
            boolean z = true;
            int i3 = 0;
            while (z) {
                int i4 = IAuthTabCallback + 25;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    int i5 = 9 / 0;
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else {
                        if (iOnNavigationEvent == 0) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i6 = onNavigationEvent + 51;
                        IAuthTabCallback = i6 % 128;
                        int i7 = i6 % 2;
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i3 = 1;
                    }
                } else {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent == 0) {
                    }
                }
            }
            strAsInterface = strAsInterface2;
            i2 = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ConsumptionInfoResponse(i2, strAsInterface, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m579deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ConsumptionInfoResponse consumptionInfoResponseDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 71;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return consumptionInfoResponseDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ConsumptionInfoResponse consumptionInfoResponse) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(consumptionInfoResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ConsumptionInfoResponse.onExtraCallbackWithResult(consumptionInfoResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 17;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ConsumptionInfoResponse) obj);
        int i4 = IAuthTabCallback + 49;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 41;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
