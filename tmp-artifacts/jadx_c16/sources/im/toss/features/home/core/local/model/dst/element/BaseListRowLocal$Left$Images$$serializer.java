package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.BaseListRowLocal;
import im.toss.features.home.core.local.model.dst.widget.ImageSourceLocal;
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
import o.removeNextStartHandler;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseListRowLocal$Left$Images$$serializer implements aeu2<BaseListRowLocal.Left.Images> {
    private static int IAuthTabCallback = 0;
    public static final BaseListRowLocal$Left$Images$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 73;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        BaseListRowLocal$Left$Images$$serializer baseListRowLocal$Left$Images$$serializer = new BaseListRowLocal$Left$Images$$serializer();
        INSTANCE = baseListRowLocal$Left$Images$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.BaseListRowLocal.Left.Images", baseListRowLocal$Left$Images$$serializer, 2);
        setanimationsloop.onWarmupCompleted("images", false);
        setanimationsloop.onWarmupCompleted("badgeImageResource", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 95;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private BaseListRowLocal$Left$Images$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {BaseListRowLocal.Left.Images.onNavigationEvent()[0].getValue(), sp.IAuthTabCallback(removeNextStartHandler.onWarmupCompleted)};
        int i4 = onExtraCallback + 109;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 19 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final BaseListRowLocal.Left.Images deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        ImageSourceLocal imageSourceLocal;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 65;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            BaseListRowLocal.Left.Images.onNavigationEvent();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = BaseListRowLocal.Left.Images.onNavigationEvent();
        if (ywVarOnWarmupCompleted2.extraCallbackWithResult()) {
            list = (List) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), (Object) null);
            imageSourceLocal = (ImageSourceLocal) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, removeNextStartHandler.onWarmupCompleted, (Object) null);
            i = 3;
        } else {
            List list2 = null;
            ImageSourceLocal imageSourceLocal2 = null;
            boolean z = true;
            int i4 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i5 = onExtraCallbackWithResult;
                    int i6 = i5 + 55;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        list2 = (List) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), list2);
                        i4 |= 1;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i7 = i5 + 15;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        removeNextStartHandler removenextstarthandler = removeNextStartHandler.onWarmupCompleted;
                        if (i8 != 0) {
                            imageSourceLocal2 = (ImageSourceLocal) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 0, removenextstarthandler, imageSourceLocal2);
                            i4 |= 4;
                        } else {
                            imageSourceLocal2 = (ImageSourceLocal) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, removenextstarthandler, imageSourceLocal2);
                            i4 |= 2;
                        }
                    }
                } else {
                    int i9 = onExtraCallback + 37;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    z = false;
                }
            }
            list = list2;
            imageSourceLocal = imageSourceLocal2;
            i = i4;
        }
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        return new BaseListRowLocal.Left.Images(i, list, imageSourceLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m294deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        BaseListRowLocal.Left.Images imagesDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 67;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return imagesDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BaseListRowLocal.Left.Images images) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(images, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        BaseListRowLocal.Left.Images.onWarmupCompleted(images, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 87;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BaseListRowLocal.Left.Images) obj);
        int i4 = onExtraCallback + 91;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 33 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = onExtraCallback + 103;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
