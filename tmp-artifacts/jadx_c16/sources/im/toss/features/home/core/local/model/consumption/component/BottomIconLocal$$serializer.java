package im.toss.features.home.core.local.model.consumption.component;

import im.toss.features.home.core.local.model.consumption.component.BottomIconLocal;
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
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BottomIconLocal$$serializer implements aeu2<BottomIconLocal> {
    private static int IAuthTabCallback = 1;
    public static final BottomIconLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 17;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        BottomIconLocal$$serializer bottomIconLocal$$serializer = new BottomIconLocal$$serializer();
        INSTANCE = bottomIconLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.consumption.component.BottomIconLocal", bottomIconLocal$$serializer, 3);
        setanimationsloop.onWarmupCompleted("image", false);
        setanimationsloop.onWarmupCompleted("width", false);
        setanimationsloop.onWarmupCompleted("height", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private BottomIconLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(BottomIconLocal$ImageSource$$serializer.INSTANCE);
        setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, sp.IAuthTabCallback(setvideolistener), sp.IAuthTabCallback(setvideolistener)};
        int i4 = onExtraCallback + 125;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final BottomIconLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        BottomIconLocal.ImageSource imageSource;
        Double d;
        Double d2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Object obj = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            BottomIconLocal.ImageSource imageSource2 = (BottomIconLocal.ImageSource) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, BottomIconLocal$ImageSource$$serializer.INSTANCE, (Object) null);
            setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
            Double d3 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, setvideolistener, (Object) null);
            Double d4 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, setvideolistener, (Object) null);
            int i3 = onNavigationEvent + 45;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            i = 7;
            imageSource = imageSource2;
            d = d4;
            d2 = d3;
        } else {
            int i5 = 0;
            boolean z = true;
            BottomIconLocal.ImageSource imageSource3 = null;
            Double d5 = null;
            Double d6 = null;
            while (z) {
                int i6 = onExtraCallback + 117;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i8 = onExtraCallback + 83;
                    onNavigationEvent = i8 % 128;
                    if (i8 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        imageSource3 = (BottomIconLocal.ImageSource) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, BottomIconLocal$ImageSource$$serializer.INSTANCE, imageSource3);
                        i5 |= 1;
                        int i9 = onExtraCallback + 103;
                        onNavigationEvent = i9 % 128;
                        int i10 = i9 % 2;
                    } else if (iOnNavigationEvent == 1) {
                        d6 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, setVideoListener.onWarmupCompleted, d6);
                        i5 |= 2;
                    } else {
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        d5 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, setVideoListener.onWarmupCompleted, d5);
                        i5 |= 4;
                    }
                } else {
                    z = false;
                }
            }
            i = i5;
            imageSource = imageSource3;
            d = d5;
            d2 = d6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new BottomIconLocal(i, imageSource, d2, d, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m256deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        BottomIconLocal bottomIconLocalDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 29;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
        return bottomIconLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BottomIconLocal bottomIconLocal) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(bottomIconLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        BottomIconLocal.onExtraCallback(bottomIconLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 15;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BottomIconLocal) obj);
        int i4 = onNavigationEvent + 37;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
