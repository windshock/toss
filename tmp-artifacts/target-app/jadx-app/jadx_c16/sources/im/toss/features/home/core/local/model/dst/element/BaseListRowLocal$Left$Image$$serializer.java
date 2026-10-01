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
import o.getWriggleLayout;
import o.okycx;
import o.removeNextStartHandler;
import o.setAnimationsLoop;
import o.setExtraData;
import o.setVideoListener;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseListRowLocal$Left$Image$$serializer implements aeu2<BaseListRowLocal.Left.Image> {
    private static int IAuthTabCallback = 1;
    public static final BaseListRowLocal$Left$Image$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        BaseListRowLocal$Left$Image$$serializer baseListRowLocal$Left$Image$$serializer = new BaseListRowLocal$Left$Image$$serializer();
        INSTANCE = baseListRowLocal$Left$Image$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.BaseListRowLocal.Left.Image", baseListRowLocal$Left$Image$$serializer, 5);
        setanimationsloop.onWarmupCompleted("image", false);
        setanimationsloop.onWarmupCompleted("width", false);
        setanimationsloop.onWarmupCompleted("height", false);
        setanimationsloop.onWarmupCompleted("corner", false);
        setanimationsloop.onWarmupCompleted("backgroundColor", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 71;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private BaseListRowLocal$Left$Image$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(removeNextStartHandler.onWarmupCompleted);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(setExtraData.onExtraCallbackWithResult);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent);
        setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, setvideolistener, setvideolistener, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3};
        int i4 = onExtraCallbackWithResult + 49;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BaseListRowLocal.Left.Image deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        ImageSourceLocal imageSourceLocal;
        double dIAuthTabCallback;
        double dIAuthTabCallback2;
        BaseListRowLocal.Left.Image.Corner corner;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        String str = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            imageSourceLocal = null;
            dIAuthTabCallback = 0.0d;
            i = 0;
            dIAuthTabCallback2 = 0.0d;
            corner = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i3 = onExtraCallbackWithResult;
                    int i4 = i3 + 97;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 12 / 0;
                        if (iOnNavigationEvent == 0) {
                            imageSourceLocal = (ImageSourceLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, removeNextStartHandler.onWarmupCompleted, imageSourceLocal);
                            i |= 1;
                        } else if (iOnNavigationEvent != 1) {
                            int i6 = i3 + 71;
                            onExtraCallback = i6 % 128;
                            int i7 = i6 % 2;
                            if (iOnNavigationEvent == 2) {
                                dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 2);
                                i |= 4;
                            } else if (iOnNavigationEvent != 3) {
                                int i8 = i3 + 9;
                                onExtraCallback = i8 % 128;
                                int i9 = i8 % 2;
                                if (iOnNavigationEvent != 4) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str);
                                i |= 16;
                                int i10 = onExtraCallback + 83;
                                onExtraCallbackWithResult = i10 % 128;
                                int i11 = i10 % 2;
                            } else {
                                corner = (BaseListRowLocal.Left.Image.Corner) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setExtraData.onExtraCallbackWithResult, corner);
                                i |= 8;
                            }
                        } else {
                            dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 1);
                            i |= 2;
                        }
                    } else if (iOnNavigationEvent != 0) {
                    }
                } else {
                    z = false;
                }
            }
        } else {
            int i12 = onExtraCallback + 89;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            imageSourceLocal = (ImageSourceLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, removeNextStartHandler.onWarmupCompleted, (Object) null);
            dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 1);
            dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 2);
            corner = (BaseListRowLocal.Left.Image.Corner) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setExtraData.onExtraCallbackWithResult, (Object) null);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, (Object) null);
            i = 31;
        }
        BaseListRowLocal.Left.Image.Corner corner2 = corner;
        double d = dIAuthTabCallback2;
        double d2 = dIAuthTabCallback;
        int i14 = i;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new BaseListRowLocal.Left.Image(i14, imageSourceLocal, d2, d, corner2, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m292deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        BaseListRowLocal.Left.Image imageDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 93;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return imageDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BaseListRowLocal.Left.Image image) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(image, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            BaseListRowLocal.Left.Image.IAuthTabCallback(image, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(image, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        BaseListRowLocal.Left.Image.IAuthTabCallback(image, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 51 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BaseListRowLocal.Left.Image) obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 61;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
