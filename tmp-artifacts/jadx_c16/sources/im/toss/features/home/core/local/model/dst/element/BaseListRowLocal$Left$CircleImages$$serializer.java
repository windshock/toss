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
public final /* synthetic */ class BaseListRowLocal$Left$CircleImages$$serializer implements aeu2<BaseListRowLocal.Left.CircleImages> {
    private static int IAuthTabCallback = 0;
    public static final BaseListRowLocal$Left$CircleImages$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 37;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 13;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        BaseListRowLocal$Left$CircleImages$$serializer baseListRowLocal$Left$CircleImages$$serializer = new BaseListRowLocal$Left$CircleImages$$serializer();
        INSTANCE = baseListRowLocal$Left$CircleImages$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.BaseListRowLocal.Left.CircleImages", baseListRowLocal$Left$CircleImages$$serializer, 2);
        setanimationsloop.onWarmupCompleted("images", false);
        setanimationsloop.onWarmupCompleted("badgeImageResource", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 47;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private BaseListRowLocal$Left$CircleImages$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {BaseListRowLocal.Left.CircleImages.onNavigationEvent()[0].getValue(), sp.IAuthTabCallback(removeNextStartHandler.onWarmupCompleted)};
        int i4 = onExtraCallback + 45;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BaseListRowLocal.Left.CircleImages deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        ImageSourceLocal imageSourceLocal;
        int i;
        int iOnNavigationEvent;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = BaseListRowLocal.Left.CircleImages.onNavigationEvent();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), (Object) null);
            imageSourceLocal = (ImageSourceLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, removeNextStartHandler.onWarmupCompleted, (Object) null);
            i = 3;
        } else {
            boolean z = true;
            List list2 = null;
            ImageSourceLocal imageSourceLocal2 = null;
            int i3 = 0;
            while (z) {
                int i4 = onExtraCallback + 29;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    int i5 = 0 / 0;
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent == 0) {
                        int i6 = IAuthTabCallback + 85;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        imageSourceLocal2 = (ImageSourceLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, removeNextStartHandler.onWarmupCompleted, imageSourceLocal2);
                        i3 |= 2;
                    } else {
                        list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), list2);
                        i3 |= 1;
                        int i8 = onExtraCallback + 19;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                    }
                } else {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent == 0) {
                    }
                }
            }
            list = list2;
            imageSourceLocal = imageSourceLocal2;
            i = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new BaseListRowLocal.Left.CircleImages(i, list, imageSourceLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m291deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BaseListRowLocal.Left.CircleImages circleImages) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(circleImages, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            BaseListRowLocal.Left.CircleImages.onExtraCallbackWithResult(circleImages, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(circleImages, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        BaseListRowLocal.Left.CircleImages.onExtraCallbackWithResult(circleImages, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BaseListRowLocal.Left.CircleImages) obj);
        int i4 = IAuthTabCallback + 65;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 111;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
