package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.AttentionAmountTopLocal;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.widget.ImageSourceLocal;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.InterceptRequest;
import o.aeu2;
import o.okycx;
import o.removeNextStartHandler;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AttentionAmountTopLocal$Amount$$serializer implements aeu2<AttentionAmountTopLocal.Amount> {
    public static final AttentionAmountTopLocal$Amount$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 37;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        AttentionAmountTopLocal$Amount$$serializer attentionAmountTopLocal$Amount$$serializer = new AttentionAmountTopLocal$Amount$$serializer();
        INSTANCE = attentionAmountTopLocal$Amount$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.AttentionAmountTopLocal.Amount", attentionAmountTopLocal$Amount$$serializer, 3);
        setanimationsloop.onWarmupCompleted("content", false);
        setanimationsloop.onWarmupCompleted("icon", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 101;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private AttentionAmountTopLocal$Amount$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(InterceptRequest.IAuthTabCallback), sp.IAuthTabCallback(removeNextStartHandler.onWarmupCompleted), sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback)};
        int i4 = onWarmupCompleted + 77;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AttentionAmountTopLocal.Amount deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        HandlerLocal handlerLocal;
        AttentionAmountTopLocal.Amount.Content content;
        ImageSourceLocal imageSourceLocal;
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 47;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Object obj = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            AttentionAmountTopLocal.Amount.Content content2 = (AttentionAmountTopLocal.Amount.Content) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, InterceptRequest.IAuthTabCallback, (Object) null);
            ImageSourceLocal imageSourceLocal2 = (ImageSourceLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, removeNextStartHandler.onWarmupCompleted, (Object) null);
            handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, setAppxVersionInWorker.onExtraCallback, (Object) null);
            content = content2;
            imageSourceLocal = imageSourceLocal2;
            i = 7;
        } else {
            int i5 = 0;
            boolean z = true;
            HandlerLocal handlerLocal2 = null;
            AttentionAmountTopLocal.Amount.Content content3 = null;
            ImageSourceLocal imageSourceLocal3 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = onExtraCallback + 55;
                    int i7 = i6 % 128;
                    onWarmupCompleted = i7;
                    if (i6 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (iOnNavigationEvent != 0) {
                        int i8 = i7 + 25;
                        onExtraCallback = i8 % 128;
                        if (i8 % 2 != 0) {
                            if (iOnNavigationEvent == 1) {
                                imageSourceLocal3 = (ImageSourceLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, removeNextStartHandler.onWarmupCompleted, imageSourceLocal3);
                                i5 |= 2;
                            } else {
                                if (iOnNavigationEvent == 2) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, setAppxVersionInWorker.onExtraCallback, handlerLocal2);
                                i5 |= 4;
                            }
                        } else if (iOnNavigationEvent == 1) {
                            imageSourceLocal3 = (ImageSourceLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, removeNextStartHandler.onWarmupCompleted, imageSourceLocal3);
                            i5 |= 2;
                        } else if (iOnNavigationEvent == 2) {
                        }
                    } else {
                        content3 = (AttentionAmountTopLocal.Amount.Content) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, InterceptRequest.IAuthTabCallback, content3);
                        i5 |= 1;
                    }
                } else {
                    int i9 = onWarmupCompleted + 115;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    z = false;
                }
            }
            handlerLocal = handlerLocal2;
            content = content3;
            imageSourceLocal = imageSourceLocal3;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AttentionAmountTopLocal.Amount(i, content, imageSourceLocal, handlerLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m279deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AttentionAmountTopLocal.Amount amountDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 1;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
        return amountDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AttentionAmountTopLocal.Amount amount) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(amount, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AttentionAmountTopLocal.Amount.IAuthTabCallback(amount, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 49;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AttentionAmountTopLocal.Amount) obj);
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 5;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
