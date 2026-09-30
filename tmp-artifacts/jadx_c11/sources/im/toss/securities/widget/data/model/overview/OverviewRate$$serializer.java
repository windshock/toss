package im.toss.securities.widget.data.model.overview;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.okycx;
import o.setAnimationsLoop;
import o.setVideoListener;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class OverviewRate$$serializer implements aeu2<OverviewRate> {
    private static int IAuthTabCallback = 1;
    public static final OverviewRate$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 91;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 47;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        OverviewRate$$serializer overviewRate$$serializer = new OverviewRate$$serializer();
        INSTANCE = overviewRate$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.widget.data.model.overview.OverviewRate", overviewRate$$serializer, 2);
        setanimationsloop.onWarmupCompleted("krw", true);
        setanimationsloop.onWarmupCompleted("usd", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 15;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private OverviewRate$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(setvideolistener);
            KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(setvideolistener);
            kSerializerArr = new KSerializer[4];
            kSerializerArr[0] = kSerializerIAuthTabCallback;
            kSerializerArr[1] = kSerializerIAuthTabCallback2;
        } else {
            setVideoListener setvideolistener2 = setVideoListener.onWarmupCompleted;
            kSerializerArr = new KSerializer[]{sp.IAuthTabCallback(setvideolistener2), sp.IAuthTabCallback(setvideolistener2)};
        }
        int i3 = IAuthTabCallback + 47;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final OverviewRate deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Double d;
        Double d2;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 61;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            i = 0;
            d2 = null;
            d = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i5 = IAuthTabCallback + 73;
                    int i6 = i5 % 128;
                    onExtraCallback = i6;
                    int i7 = i5 % 2;
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i8 = i6 + 17;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    Object objOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, setVideoListener.onWarmupCompleted, d2);
                    if (i9 == 0) {
                        d2 = (Double) objOnExtraCallbackWithResult;
                        i |= 5;
                    } else {
                        d2 = (Double) objOnExtraCallbackWithResult;
                        i |= 2;
                    }
                } else {
                    d = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, setVideoListener.onWarmupCompleted, d);
                    i |= 1;
                }
            }
        } else {
            setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
            d = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, setvideolistener, (Object) null);
            d2 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, setvideolistener, (Object) null);
            int i10 = IAuthTabCallback + 15;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            i = 3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new OverviewRate(i, d, d2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m52deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        OverviewRate overviewRateDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 82 / 0;
        }
        return overviewRateDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull OverviewRate overviewRate) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(overviewRate, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        OverviewRate.IAuthTabCallback(overviewRate, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 19;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (OverviewRate) obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 75;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
