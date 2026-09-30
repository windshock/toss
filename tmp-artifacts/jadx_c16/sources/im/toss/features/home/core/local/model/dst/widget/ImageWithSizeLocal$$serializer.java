package im.toss.features.home.core.local.model.dst.widget;

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
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ImageWithSizeLocal$$serializer implements aeu2<ImageWithSizeLocal> {
    public static final ImageWithSizeLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 51;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 97;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        ImageWithSizeLocal$$serializer imageWithSizeLocal$$serializer = new ImageWithSizeLocal$$serializer();
        INSTANCE = imageWithSizeLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.ImageWithSizeLocal", imageWithSizeLocal$$serializer, 3);
        setanimationsloop.onWarmupCompleted("image", false);
        setanimationsloop.onWarmupCompleted("width", false);
        setanimationsloop.onWarmupCompleted("height", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 121;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 92 / 0;
        }
    }

    private ImageWithSizeLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {removeNextStartHandler.onWarmupCompleted, setvideolistener, setvideolistener};
        int i4 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ImageWithSizeLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        ImageSourceLocal imageSourceLocal;
        double dIAuthTabCallback;
        double dIAuthTabCallback2;
        int iOnNavigationEvent;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        ImageSourceLocal imageSourceLocal2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            i = 7;
            imageSourceLocal = (ImageSourceLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, removeNextStartHandler.onWarmupCompleted, (Object) null);
            dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 1);
            dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 2);
        } else {
            int i5 = onExtraCallbackWithResult + 19;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            double dIAuthTabCallback3 = 0.0d;
            int i7 = 0;
            boolean z = true;
            double dIAuthTabCallback4 = 0.0d;
            while (z) {
                int i8 = onNavigationEvent + 35;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 == 0) {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    int i9 = 75 / 0;
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent != 0) {
                        imageSourceLocal2 = (ImageSourceLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, removeNextStartHandler.onWarmupCompleted, imageSourceLocal2);
                        i7 |= 1;
                    } else if (iOnNavigationEvent == 1) {
                        dIAuthTabCallback3 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 1);
                        i7 |= 2;
                    } else {
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i10 = onExtraCallbackWithResult + 107;
                        onNavigationEvent = i10 % 128;
                        int i11 = i10 % 2;
                        dIAuthTabCallback4 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 2);
                        i7 |= 4;
                    }
                } else {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent != 0) {
                    }
                }
            }
            i = i7;
            imageSourceLocal = imageSourceLocal2;
            dIAuthTabCallback = dIAuthTabCallback3;
            dIAuthTabCallback2 = dIAuthTabCallback4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ImageWithSizeLocal(i, imageSourceLocal, dIAuthTabCallback, dIAuthTabCallback2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m508deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ImageWithSizeLocal imageWithSizeLocalDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return imageWithSizeLocalDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ImageWithSizeLocal imageWithSizeLocal) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(imageWithSizeLocal, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ImageWithSizeLocal.onExtraCallback(imageWithSizeLocal, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(imageWithSizeLocal, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        ImageWithSizeLocal.onExtraCallback(imageWithSizeLocal, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onNavigationEvent + 83;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ImageWithSizeLocal) obj);
        int i4 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
