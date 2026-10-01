package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.BaseListRowLocal;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.widget.ImageWithSizeLocal;
import im.toss.features.home.core.local.model.dst.widget.ImageWithSizeLocal$$serializer;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.okycx;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseListRowLocal$Right$Icon$$serializer implements aeu2<BaseListRowLocal.Right.Icon> {
    private static int IAuthTabCallback = 1;
    public static final BaseListRowLocal$Right$Icon$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 77;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 52 / 0;
        }
        return serialDescriptor;
    }

    static {
        BaseListRowLocal$Right$Icon$$serializer baseListRowLocal$Right$Icon$$serializer = new BaseListRowLocal$Right$Icon$$serializer();
        INSTANCE = baseListRowLocal$Right$Icon$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.BaseListRowLocal.Right.Icon", baseListRowLocal$Right$Icon$$serializer, 2);
        setanimationsloop.onWarmupCompleted("image", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 5;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private BaseListRowLocal$Right$Icon$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback);
            kSerializerArr = new KSerializer[5];
            kSerializerArr[1] = ImageWithSizeLocal$$serializer.INSTANCE;
            kSerializerArr[1] = kSerializerIAuthTabCallback;
        } else {
            kSerializerArr = new KSerializer[]{ImageWithSizeLocal$$serializer.INSTANCE, sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback)};
        }
        int i3 = onExtraCallback + 39;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047 A[PHI: r1 r13
      0x0047: PHI (r1v7 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0047: PHI (r13v5 o.yw) = (r13v1 o.yw), (r13v7 o.yw) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035 A[PHI: r1 r13
      0x0035: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r13v2 o.yw) = (r13v1 o.yw), (r13v7 o.yw) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BaseListRowLocal.Right.Icon deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        ImageWithSizeLocal imageWithSizeLocal;
        HandlerLocal handlerLocal;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 77;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            int i4 = 28 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                imageWithSizeLocal = (ImageWithSizeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, ImageWithSizeLocal$$serializer.INSTANCE, (Object) null);
                handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, setAppxVersionInWorker.onExtraCallback, (Object) null);
                i = 3;
            } else {
                ImageWithSizeLocal imageWithSizeLocal2 = null;
                HandlerLocal handlerLocal2 = null;
                boolean z = true;
                int i5 = 0;
                while (z) {
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent != -1) {
                        int i6 = IAuthTabCallback + 61;
                        onExtraCallback = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i7 = 31 / 0;
                            if (iOnNavigationEvent == 0) {
                                imageWithSizeLocal2 = (ImageWithSizeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, ImageWithSizeLocal$$serializer.INSTANCE, imageWithSizeLocal2);
                                i5 |= 1;
                                int i8 = onExtraCallback + 1;
                                IAuthTabCallback = i8 % 128;
                                int i9 = i8 % 2;
                            } else {
                                if (iOnNavigationEvent == 1) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, setAppxVersionInWorker.onExtraCallback, handlerLocal2);
                                i5 |= 2;
                            }
                        } else if (iOnNavigationEvent == 0) {
                            imageWithSizeLocal2 = (ImageWithSizeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, ImageWithSizeLocal$$serializer.INSTANCE, imageWithSizeLocal2);
                            i5 |= 1;
                            int i82 = onExtraCallback + 1;
                            IAuthTabCallback = i82 % 128;
                            int i92 = i82 % 2;
                        } else if (iOnNavigationEvent == 1) {
                        }
                    } else {
                        int i10 = IAuthTabCallback + 33;
                        onExtraCallback = i10 % 128;
                        int i11 = i10 % 2;
                        z = false;
                    }
                }
                imageWithSizeLocal = imageWithSizeLocal2;
                handlerLocal = handlerLocal2;
                i = i5;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new BaseListRowLocal.Right.Icon(i, imageWithSizeLocal, handlerLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m299deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        BaseListRowLocal.Right.Icon iconDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 3;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return iconDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BaseListRowLocal.Right.Icon icon) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(icon, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            BaseListRowLocal.Right.Icon.IAuthTabCallback(icon, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(icon, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        BaseListRowLocal.Right.Icon.IAuthTabCallback(icon, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = IAuthTabCallback + 55;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BaseListRowLocal.Right.Icon) obj);
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback + 33;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 5;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
