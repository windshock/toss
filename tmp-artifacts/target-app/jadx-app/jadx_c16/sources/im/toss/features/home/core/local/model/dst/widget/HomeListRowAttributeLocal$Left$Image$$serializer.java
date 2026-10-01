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
public final /* synthetic */ class HomeListRowAttributeLocal$Left$Image$$serializer implements aeu2<HomeListRowAttributeLocal.Left.Image> {
    private static int IAuthTabCallback = 1;
    public static final HomeListRowAttributeLocal$Left$Image$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            serialDescriptor = descriptor;
            int i4 = 79 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i3 + 99;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        HomeListRowAttributeLocal$Left$Image$$serializer homeListRowAttributeLocal$Left$Image$$serializer = new HomeListRowAttributeLocal$Left$Image$$serializer();
        INSTANCE = homeListRowAttributeLocal$Left$Image$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.HomeListRowAttributeLocal.Left.Image", homeListRowAttributeLocal$Left$Image$$serializer, 2);
        setanimationsloop.onWarmupCompleted("verticalAlignment", false);
        setanimationsloop.onWarmupCompleted("image", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 83;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private HomeListRowAttributeLocal$Left$Image$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return new KSerializer[]{HomeListRowAttributeLocal.Left.Image.onNavigationEvent()[0].getValue(), startPage.onWarmupCompleted};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[2];
        kSerializerArr[0] = HomeListRowAttributeLocal.Left.Image.onNavigationEvent()[1].getValue();
        kSerializerArr[0] = startPage.onWarmupCompleted;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HomeListRowAttributeLocal.Left.Image deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        BaseManifest3 baseManifest3;
        ImageAttributeLocal imageAttributeLocal;
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = HomeListRowAttributeLocal.Left.Image.onNavigationEvent();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onWarmupCompleted + 29;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            baseManifest3 = (BaseManifest3) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), (Object) null);
            imageAttributeLocal = (ImageAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, startPage.onWarmupCompleted, (Object) null);
            i = 3;
        } else {
            int i7 = onWarmupCompleted + 41;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            BaseManifest3 baseManifest32 = null;
            ImageAttributeLocal imageAttributeLocal2 = null;
            boolean z = true;
            int i9 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    baseManifest32 = (BaseManifest3) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), baseManifest32);
                    i9 |= 1;
                } else {
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i10 = onExtraCallbackWithResult + 87;
                    onWarmupCompleted = i10 % 128;
                    int i11 = i10 % 2;
                    imageAttributeLocal2 = (ImageAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, startPage.onWarmupCompleted, imageAttributeLocal2);
                    i9 |= 2;
                }
            }
            baseManifest3 = baseManifest32;
            imageAttributeLocal = imageAttributeLocal2;
            i = i9;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeListRowAttributeLocal.Left.Image(i, baseManifest3, imageAttributeLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m495deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeListRowAttributeLocal.Left.Image image) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(image, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HomeListRowAttributeLocal.Left.Image.onExtraCallback(image, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeListRowAttributeLocal.Left.Image) obj);
        int i4 = onWarmupCompleted + 39;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
