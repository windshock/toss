package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.BaseListRowLocal;
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
public final /* synthetic */ class BaseListRowLocal$Content$Image$$serializer implements aeu2<BaseListRowLocal.Content.Image> {
    public static final BaseListRowLocal$Content$Image$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 75;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        BaseListRowLocal$Content$Image$$serializer baseListRowLocal$Content$Image$$serializer = new BaseListRowLocal$Content$Image$$serializer();
        INSTANCE = baseListRowLocal$Content$Image$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.BaseListRowLocal.Content.Image", baseListRowLocal$Content$Image$$serializer, 3);
        setanimationsloop.onWarmupCompleted("image", false);
        setanimationsloop.onWarmupCompleted("width", false);
        setanimationsloop.onWarmupCompleted("height", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 97;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private BaseListRowLocal$Content$Image$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
            return new KSerializer[]{sp.IAuthTabCallback(removeNextStartHandler.onWarmupCompleted), setvideolistener, setvideolistener};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[2];
        kSerializerArr[0] = sp.IAuthTabCallback(removeNextStartHandler.onWarmupCompleted);
        setVideoListener setvideolistener2 = setVideoListener.onWarmupCompleted;
        kSerializerArr[1] = setvideolistener2;
        kSerializerArr[5] = setvideolistener2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final BaseListRowLocal.Content.Image deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        ImageSourceLocal imageSourceLocal;
        double dIAuthTabCallback;
        double dIAuthTabCallback2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        ImageSourceLocal imageSourceLocal2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onNavigationEvent + 43;
            onExtraCallbackWithResult = i3 % 128;
            imageSourceLocal = (ImageSourceLocal) (i3 % 2 == 0 ? ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, removeNextStartHandler.onWarmupCompleted, (Object) null) : ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, removeNextStartHandler.onWarmupCompleted, (Object) null));
            dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 1);
            i = 7;
            dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 2);
        } else {
            int i4 = onExtraCallbackWithResult + 21;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            double dIAuthTabCallback3 = 0.0d;
            int i6 = 0;
            boolean z = true;
            double dIAuthTabCallback4 = 0.0d;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i7 = onNavigationEvent;
                    int i8 = i7 + 101;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    if (iOnNavigationEvent == 0) {
                        imageSourceLocal2 = (ImageSourceLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, removeNextStartHandler.onWarmupCompleted, imageSourceLocal2);
                        i6 |= 1;
                    } else if (iOnNavigationEvent == 1) {
                        dIAuthTabCallback3 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 1);
                        i6 |= 2;
                    } else {
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i10 = i7 + 103;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % 2;
                        dIAuthTabCallback4 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 2);
                        i6 |= 4;
                    }
                } else {
                    z = false;
                }
            }
            i = i6;
            imageSourceLocal = imageSourceLocal2;
            dIAuthTabCallback = dIAuthTabCallback3;
            dIAuthTabCallback2 = dIAuthTabCallback4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new BaseListRowLocal.Content.Image(i, imageSourceLocal, dIAuthTabCallback, dIAuthTabCallback2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m289deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            throw null;
        }
        BaseListRowLocal.Content.Image imageDeserialize = deserialize(decoder);
        int i3 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return imageDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BaseListRowLocal.Content.Image image) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(image, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            BaseListRowLocal.Content.Image.onExtraCallbackWithResult(image, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(image, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        BaseListRowLocal.Content.Image.onExtraCallbackWithResult(image, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BaseListRowLocal.Content.Image) obj);
        int i4 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}
