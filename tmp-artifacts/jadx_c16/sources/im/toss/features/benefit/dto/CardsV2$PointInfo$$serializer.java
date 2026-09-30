package im.toss.features.benefit.dto;

import im.toss.features.benefit.dto.CardsV2;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardsV2$PointInfo$$serializer implements aeu2<CardsV2.PointInfo> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final CardsV2$PointInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 121;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        CardsV2$PointInfo$$serializer cardsV2$PointInfo$$serializer = new CardsV2$PointInfo$$serializer();
        INSTANCE = cardsV2$PointInfo$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.benefit.dto.CardsV2.PointInfo", cardsV2$PointInfo$$serializer, 2);
        setanimationsloop.onWarmupCompleted("balance", true);
        setanimationsloop.onWarmupCompleted("amountMicros", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 61;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private CardsV2$PointInfo$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            oty1 oty1Var = oty1.onExtraCallback;
            return new KSerializer[]{oty1Var, oty1Var};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[3];
        oty1 oty1Var2 = oty1.onExtraCallback;
        kSerializerArr[0] = oty1Var2;
        kSerializerArr[1] = oty1Var2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CardsV2.PointInfo deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        long jIAuthTabCallbackDefault;
        long jIAuthTabCallbackDefault2;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i4 = onNavigationEvent + 7;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            i = 3;
            jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
            jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
        } else {
            long jIAuthTabCallbackDefault3 = 0;
            int i6 = 0;
            boolean z = true;
            long jIAuthTabCallbackDefault4 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    if (iOnNavigationEvent != 0) {
                        int i7 = onNavigationEvent + 61;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        jIAuthTabCallbackDefault4 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
                        i6 |= 2;
                        i2 = onExtraCallbackWithResult + 115;
                        onNavigationEvent = i2 % 128;
                    } else {
                        jIAuthTabCallbackDefault3 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                        i6 |= 1;
                        i2 = onNavigationEvent + 1;
                        onExtraCallbackWithResult = i2 % 128;
                    }
                    int i9 = i2 % 2;
                } else {
                    z = false;
                }
            }
            i = i6;
            jIAuthTabCallbackDefault = jIAuthTabCallbackDefault3;
            jIAuthTabCallbackDefault2 = jIAuthTabCallbackDefault4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CardsV2.PointInfo(i, jIAuthTabCallbackDefault, jIAuthTabCallbackDefault2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m95deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CardsV2.PointInfo pointInfoDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
        return pointInfoDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CardsV2.PointInfo pointInfo) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(pointInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CardsV2.PointInfo.IAuthTabCallback(pointInfo, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 83;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CardsV2.PointInfo) obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 121;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
