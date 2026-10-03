package viva.republica.toss.network.model.pedometer;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.pedometer.HalfHourlySyncReq;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class HalfHourlySyncReq$Step$$serializer implements aeu2<HalfHourlySyncReq.Step> {
    private static int IAuthTabCallback = 1;
    public static final HalfHourlySyncReq$Step$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 123;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 73;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        HalfHourlySyncReq$Step$$serializer halfHourlySyncReq$Step$$serializer = new HalfHourlySyncReq$Step$$serializer();
        INSTANCE = halfHourlySyncReq$Step$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.pedometer.HalfHourlySyncReq.Step", halfHourlySyncReq$Step$$serializer, 2);
        setanimationsloop.onWarmupCompleted("time", false);
        setanimationsloop.onWarmupCompleted("stepCount", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 109;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 78 / 0;
        }
    }

    private HalfHourlySyncReq$Step$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArr = new KSerializer[3];
            kSerializerArr[0] = getWriggleLayout.onNavigationEvent;
            kSerializerArr[0] = getDynamicHeight.onWarmupCompleted;
        } else {
            kSerializerArr = new KSerializer[]{getWriggleLayout.onNavigationEvent, getDynamicHeight.onWarmupCompleted};
        }
        int i3 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        HalfHourlySyncReq.Step stepM65deserialize = m65deserialize(decoder);
        if (i3 == 0) {
            int i4 = 40 / 0;
        }
        int i5 = onExtraCallbackWithResult + 73;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return stepM65deserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final HalfHourlySyncReq.Step m65deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        int iOnTransact;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onExtraCallbackWithResult + 79;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
            i = 3;
        } else {
            String strAsInterface2 = null;
            int iOnTransact2 = 0;
            int i7 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i8 = onNavigationEvent + 95;
                    int i9 = i8 % 128;
                    onExtraCallbackWithResult = i9;
                    int i10 = i8 % 2;
                    if (iOnNavigationEvent != 0) {
                        int i11 = i9 + 21;
                        onNavigationEvent = i11 % 128;
                        if (i11 % 2 != 0) {
                            if (iOnNavigationEvent != 1) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i12 = i9 + 81;
                            onNavigationEvent = i12 % 128;
                            int i13 = i12 % 2;
                            iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
                            i7 |= 2;
                        } else {
                            if (iOnNavigationEvent != 1) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i122 = i9 + 81;
                            onNavigationEvent = i122 % 128;
                            int i132 = i122 % 2;
                            iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
                            i7 |= 2;
                        }
                    } else {
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i7 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            strAsInterface = strAsInterface2;
            iOnTransact = iOnTransact2;
            i = i7;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HalfHourlySyncReq.Step(i, strAsInterface, iOnTransact, null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HalfHourlySyncReq.Step) obj);
        if (i3 != 0) {
            int i4 = 95 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HalfHourlySyncReq.Step step) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(step, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HalfHourlySyncReq.Step.onWarmupCompleted(step, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
