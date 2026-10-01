package im.toss.features.benefit.dto;

import im.toss.features.benefit.dto.CardsV2;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardsV2$$serializer implements aeu2<CardsV2> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final CardsV2$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 79;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 109;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        CardsV2$$serializer cardsV2$$serializer = new CardsV2$$serializer();
        INSTANCE = cardsV2$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.benefit.dto.CardsV2", cardsV2$$serializer, 2);
        setanimationsloop.onWarmupCompleted("sections", true);
        setanimationsloop.onWarmupCompleted("pointInfo", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 13;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private CardsV2$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return new KSerializer[]{CardsV2.onExtraCallback()[0].getValue(), CardsV2$PointInfo$$serializer.INSTANCE};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[4];
        kSerializerArr[1] = CardsV2.onExtraCallback()[1].getValue();
        kSerializerArr[0] = CardsV2$PointInfo$$serializer.INSTANCE;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CardsV2 deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        CardsV2.PointInfo pointInfo;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallback = CardsV2.onExtraCallback();
        int i4 = 3;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            pointInfo = null;
            list = null;
            int i5 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = onExtraCallback + 63;
                    int i7 = i6 % 128;
                    IAuthTabCallback = i7;
                    if (i6 % 2 == 0) {
                        throw null;
                    }
                    if (iOnNavigationEvent != 0) {
                        int i8 = i7 + 29;
                        onExtraCallback = i8 % 128;
                        int i9 = i8 % 2;
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i10 = i7 + 59;
                        onExtraCallback = i10 % 128;
                        if (i10 % 2 != 0) {
                            pointInfo = (CardsV2.PointInfo) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, CardsV2$PointInfo$$serializer.INSTANCE, pointInfo);
                            i5 = 3;
                        } else {
                            pointInfo = (CardsV2.PointInfo) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, CardsV2$PointInfo$$serializer.INSTANCE, pointInfo);
                            i5 |= 2;
                        }
                        int i11 = IAuthTabCallback + 75;
                        onExtraCallback = i11 % 128;
                        int i12 = i11 % 2;
                    } else {
                        list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), list);
                        i5 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            i4 = i5;
        } else {
            int i13 = IAuthTabCallback + 1;
            onExtraCallback = i13 % 128;
            int i14 = i13 % 2;
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), (Object) null);
            pointInfo = (CardsV2.PointInfo) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, CardsV2$PointInfo$$serializer.INSTANCE, (Object) null);
            int i15 = onExtraCallback + 29;
            IAuthTabCallback = i15 % 128;
            int i16 = i15 % 2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CardsV2(i4, list, pointInfo, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m94deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CardsV2 cardsV2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(cardsV2, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CardsV2.onExtraCallbackWithResult(cardsV2, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 71;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CardsV2) obj);
        int i4 = onExtraCallback + 51;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 115;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
