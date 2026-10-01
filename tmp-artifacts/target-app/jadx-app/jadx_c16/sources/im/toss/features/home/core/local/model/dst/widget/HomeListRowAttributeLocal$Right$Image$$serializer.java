package im.toss.features.home.core.local.model.dst.widget;

import im.toss.features.home.core.local.model.dst.widget.HomeListRowAttributeLocal;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BaseManifest3;
import o.aeu2;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.startPage;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeListRowAttributeLocal$Right$Image$$serializer implements aeu2<HomeListRowAttributeLocal.Right.Image> {
    private static int IAuthTabCallback = 0;
    public static final HomeListRowAttributeLocal$Right$Image$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        return serialDescriptor;
    }

    static {
        HomeListRowAttributeLocal$Right$Image$$serializer homeListRowAttributeLocal$Right$Image$$serializer = new HomeListRowAttributeLocal$Right$Image$$serializer();
        INSTANCE = homeListRowAttributeLocal$Right$Image$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.HomeListRowAttributeLocal.Right.Image", homeListRowAttributeLocal$Right$Image$$serializer, 2);
        setanimationsloop.onWarmupCompleted("verticalAlignment", false);
        setanimationsloop.onWarmupCompleted("image", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 119;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private HomeListRowAttributeLocal$Right$Image$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {HomeListRowAttributeLocal.Right.Image.IAuthTabCallback()[0].getValue(), startPage.onWarmupCompleted};
        int i4 = onExtraCallbackWithResult + 25;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HomeListRowAttributeLocal.Right.Image deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        BaseManifest3 baseManifest3;
        ImageAttributeLocal imageAttributeLocal;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = HomeListRowAttributeLocal.Right.Image.IAuthTabCallback();
        if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            int i3 = onExtraCallbackWithResult + 29;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                baseManifest3 = (BaseManifest3) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), (Object) null);
                imageAttributeLocal = (ImageAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, startPage.onWarmupCompleted, (Object) null);
                i = 5;
            } else {
                baseManifest3 = (BaseManifest3) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), (Object) null);
                imageAttributeLocal = (ImageAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, startPage.onWarmupCompleted, (Object) null);
                i = 3;
            }
        } else {
            boolean z = true;
            BaseManifest3 baseManifest32 = null;
            ImageAttributeLocal imageAttributeLocal2 = null;
            int i4 = 0;
            while (z) {
                int i5 = onExtraCallbackWithResult + 85;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i6 = onExtraCallbackWithResult + 123;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    imageAttributeLocal2 = (ImageAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, startPage.onWarmupCompleted, imageAttributeLocal2);
                    i4 |= 2;
                } else {
                    baseManifest32 = (BaseManifest3) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), baseManifest32);
                    i4 |= 1;
                }
            }
            baseManifest3 = baseManifest32;
            imageAttributeLocal = imageAttributeLocal2;
            i = i4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeListRowAttributeLocal.Right.Image(i, baseManifest3, imageAttributeLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m500deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        HomeListRowAttributeLocal.Right.Image imageDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return imageDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeListRowAttributeLocal.Right.Image image) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(image, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HomeListRowAttributeLocal.Right.Image.onExtraCallback(image, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeListRowAttributeLocal.Right.Image) obj);
        if (i3 == 0) {
            int i4 = 61 / 0;
        }
        int i5 = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
