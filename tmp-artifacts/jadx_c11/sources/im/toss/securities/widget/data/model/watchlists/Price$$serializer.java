package im.toss.securities.widget.data.model.watchlists;

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
public final /* synthetic */ class Price$$serializer implements aeu2<Price> {
    private static int IAuthTabCallback = 1;
    public static final Price$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 == 0) {
            int i4 = 41 / 0;
        }
        return serialDescriptor;
    }

    static {
        Price$$serializer price$$serializer = new Price$$serializer();
        INSTANCE = price$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.widget.data.model.watchlists.Price", price$$serializer, 2);
        setanimationsloop.onWarmupCompleted("krw", true);
        setanimationsloop.onWarmupCompleted("usd", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 5;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private Price$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(setvideolistener), sp.IAuthTabCallback(setvideolistener)};
        int i4 = onExtraCallbackWithResult + 15;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final Price deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        Double d;
        Double d2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onExtraCallback + 79;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
            d2 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, setvideolistener, (Object) null);
            d = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, setvideolistener, (Object) null);
            int i5 = onExtraCallbackWithResult + 63;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            i = 3;
        } else {
            int i7 = onExtraCallbackWithResult + 17;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            i = 0;
            d = null;
            Double d3 = null;
            boolean z = true;
            while (!(!z)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    d3 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, setVideoListener.onWarmupCompleted, d3);
                    i |= 1;
                } else {
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    d = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, setVideoListener.onWarmupCompleted, d);
                    i |= 2;
                }
            }
            d2 = d3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new Price(i, d2, d, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m55deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull Price price) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(price, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        Price.onExtraCallbackWithResult(price, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 19;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (Price) obj);
        int i4 = onExtraCallbackWithResult + 21;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 53;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
