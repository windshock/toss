package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.HomeIntelligenceHeroLocal;
import im.toss.features.home.core.local.model.dst.widget.ImageSourceLocal;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.okycx;
import o.removeNextStartHandler;
import o.setAnimationsLoop;
import o.setVideoListener;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeIntelligenceHeroLocal$Image$$serializer implements aeu2<HomeIntelligenceHeroLocal.Image> {
    private static int IAuthTabCallback = 0;
    public static final HomeIntelligenceHeroLocal$Image$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        HomeIntelligenceHeroLocal$Image$$serializer homeIntelligenceHeroLocal$Image$$serializer = new HomeIntelligenceHeroLocal$Image$$serializer();
        INSTANCE = homeIntelligenceHeroLocal$Image$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.HomeIntelligenceHeroLocal.Image", homeIntelligenceHeroLocal$Image$$serializer, 3);
        setanimationsloop.onWarmupCompleted("width", false);
        setanimationsloop.onWarmupCompleted("height", false);
        setanimationsloop.onWarmupCompleted("imageSource", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 7;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 37 / 0;
        }
    }

    private HomeIntelligenceHeroLocal$Image$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(removeNextStartHandler.onWarmupCompleted);
        setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {setvideolistener, setvideolistener, kSerializerIAuthTabCallback};
        int i4 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HomeIntelligenceHeroLocal.Image deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        ImageSourceLocal imageSourceLocal;
        double d;
        int i;
        double d2;
        int iOnNavigationEvent;
        int i2;
        double dIAuthTabCallback;
        double dIAuthTabCallback2;
        ImageSourceLocal imageSourceLocal2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Object obj = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onExtraCallbackWithResult + 123;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 1);
                dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 1);
                imageSourceLocal2 = (ImageSourceLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, removeNextStartHandler.onWarmupCompleted, (Object) null);
                i3 = 58;
            } else {
                dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 0);
                dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 1);
                imageSourceLocal2 = (ImageSourceLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, removeNextStartHandler.onWarmupCompleted, (Object) null);
                i3 = 7;
            }
            imageSourceLocal = imageSourceLocal2;
            d = dIAuthTabCallback;
            i = i3;
            d2 = dIAuthTabCallback2;
        } else {
            int i6 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            double dIAuthTabCallback3 = 0.0d;
            int i8 = 0;
            ImageSourceLocal imageSourceLocal3 = null;
            boolean z = true;
            double dIAuthTabCallback4 = 0.0d;
            while (z) {
                int i9 = onExtraCallbackWithResult + 55;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 == 0) {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    int i10 = 1 / 0;
                    if (iOnNavigationEvent != -1) {
                        i2 = onNavigationEvent + 41;
                        onExtraCallbackWithResult = i2 % 128;
                        if (i2 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        if (iOnNavigationEvent == 0) {
                            dIAuthTabCallback3 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 0);
                            i8 |= 1;
                        } else if (iOnNavigationEvent == 1) {
                            dIAuthTabCallback4 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 1);
                            i8 |= 2;
                        } else {
                            if (iOnNavigationEvent != 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            imageSourceLocal3 = (ImageSourceLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, removeNextStartHandler.onWarmupCompleted, imageSourceLocal3);
                            i8 |= 4;
                        }
                    } else {
                        z = false;
                    }
                } else {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent != -1) {
                        i2 = onNavigationEvent + 41;
                        onExtraCallbackWithResult = i2 % 128;
                        if (i2 % 2 == 0) {
                        }
                    } else {
                        z = false;
                    }
                }
            }
            imageSourceLocal = imageSourceLocal3;
            d = dIAuthTabCallback3;
            i = i8;
            d2 = dIAuthTabCallback4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeIntelligenceHeroLocal.Image(i, d, d2, imageSourceLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m380deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        HomeIntelligenceHeroLocal.Image imageDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
        return imageDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeIntelligenceHeroLocal.Image image) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(image, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HomeIntelligenceHeroLocal.Image.IAuthTabCallback(image, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 17;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeIntelligenceHeroLocal.Image) obj);
        int i4 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        obj.hashCode();
        throw null;
    }
}
