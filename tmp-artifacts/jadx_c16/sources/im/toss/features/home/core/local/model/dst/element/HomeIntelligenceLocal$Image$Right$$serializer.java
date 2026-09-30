package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.HomeIntelligenceLocal;
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
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeIntelligenceLocal$Image$Right$$serializer implements aeu2<HomeIntelligenceLocal.Image.Right> {
    private static int IAuthTabCallback = 1;
    public static final HomeIntelligenceLocal$Image$Right$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        HomeIntelligenceLocal$Image$Right$$serializer homeIntelligenceLocal$Image$Right$$serializer = new HomeIntelligenceLocal$Image$Right$$serializer();
        INSTANCE = homeIntelligenceLocal$Image$Right$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.HomeIntelligenceLocal.Image.Right", homeIntelligenceLocal$Image$Right$$serializer, 1);
        setanimationsloop.onWarmupCompleted("imageSource", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 61;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private HomeIntelligenceLocal$Image$Right$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(removeNextStartHandler.onWarmupCompleted)};
        int i4 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HomeIntelligenceLocal.Image.Right deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        ImageSourceLocal imageSourceLocal;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i2 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            imageSourceLocal = (ImageSourceLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, removeNextStartHandler.onWarmupCompleted, (Object) null);
            int i3 = onExtraCallbackWithResult + 27;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        } else {
            imageSourceLocal = null;
            boolean z = true;
            int i5 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = onWarmupCompleted;
                    int i7 = i6 + 45;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i9 = i6 + 87;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    imageSourceLocal = (ImageSourceLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, removeNextStartHandler.onWarmupCompleted, imageSourceLocal);
                    i5 = 1;
                } else {
                    z = false;
                }
            }
            i2 = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeIntelligenceLocal.Image.Right(i2, imageSourceLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m387deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            throw null;
        }
        HomeIntelligenceLocal.Image.Right rightDeserialize = deserialize(decoder);
        int i3 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return rightDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeIntelligenceLocal.Image.Right right) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(right, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            HomeIntelligenceLocal.Image.Right.onWarmupCompleted(right, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(right, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        HomeIntelligenceLocal.Image.Right.onWarmupCompleted(right, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeIntelligenceLocal.Image.Right) obj);
        int i4 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}
