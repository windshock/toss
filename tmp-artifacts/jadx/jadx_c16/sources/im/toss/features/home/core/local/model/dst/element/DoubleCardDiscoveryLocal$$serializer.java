package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.DoubleCardDiscoveryLocal;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.dj3;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DoubleCardDiscoveryLocal$$serializer implements aeu2<DoubleCardDiscoveryLocal> {
    private static int IAuthTabCallback = 0;
    public static final DoubleCardDiscoveryLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 115;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 61;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        DoubleCardDiscoveryLocal$$serializer doubleCardDiscoveryLocal$$serializer = new DoubleCardDiscoveryLocal$$serializer();
        INSTANCE = doubleCardDiscoveryLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.DoubleCardDiscoveryLocal", doubleCardDiscoveryLocal$$serializer, 3);
        setanimationsloop.onWarmupCompleted("left", false);
        setanimationsloop.onWarmupCompleted("right", false);
        setanimationsloop.onWarmupCompleted("horizontalPadding", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 81;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private DoubleCardDiscoveryLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            DoubleCardDiscoveryLocal$Content$$serializer doubleCardDiscoveryLocal$Content$$serializer = DoubleCardDiscoveryLocal$Content$$serializer.INSTANCE;
            return new KSerializer[]{doubleCardDiscoveryLocal$Content$$serializer, doubleCardDiscoveryLocal$Content$$serializer, dj3.onWarmupCompleted};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[5];
        DoubleCardDiscoveryLocal$Content$$serializer doubleCardDiscoveryLocal$Content$$serializer2 = DoubleCardDiscoveryLocal$Content$$serializer.INSTANCE;
        kSerializerArr[0] = doubleCardDiscoveryLocal$Content$$serializer2;
        kSerializerArr[1] = doubleCardDiscoveryLocal$Content$$serializer2;
        kSerializerArr[4] = dj3.onWarmupCompleted;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DoubleCardDiscoveryLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        float fOnWarmupCompleted;
        DoubleCardDiscoveryLocal.Content content;
        int i;
        DoubleCardDiscoveryLocal.Content content2;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 3;
        IAuthTabCallback = i3 % 128;
        DoubleCardDiscoveryLocal.Content content3 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            DoubleCardDiscoveryLocal$Content$$serializer doubleCardDiscoveryLocal$Content$$serializer = DoubleCardDiscoveryLocal$Content$$serializer.INSTANCE;
            DoubleCardDiscoveryLocal.Content content4 = (DoubleCardDiscoveryLocal.Content) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, doubleCardDiscoveryLocal$Content$$serializer, (Object) null);
            DoubleCardDiscoveryLocal.Content content5 = (DoubleCardDiscoveryLocal.Content) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, doubleCardDiscoveryLocal$Content$$serializer, (Object) null);
            fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 2);
            content = content5;
            i = 7;
            content2 = content4;
        } else {
            float fOnWarmupCompleted2 = 0.0f;
            DoubleCardDiscoveryLocal.Content content6 = null;
            int i4 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i5 = IAuthTabCallback + 41;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 == 0) {
                        if (iOnNavigationEvent == 0) {
                            content3 = (DoubleCardDiscoveryLocal.Content) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, DoubleCardDiscoveryLocal$Content$$serializer.INSTANCE, content3);
                            i4 |= 2;
                        } else {
                            if (iOnNavigationEvent == 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 2);
                            i4 |= 4;
                        }
                    } else if (iOnNavigationEvent == 1) {
                        content3 = (DoubleCardDiscoveryLocal.Content) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, DoubleCardDiscoveryLocal$Content$$serializer.INSTANCE, content3);
                        i4 |= 2;
                    } else if (iOnNavigationEvent == 2) {
                    }
                } else {
                    content6 = (DoubleCardDiscoveryLocal.Content) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, DoubleCardDiscoveryLocal$Content$$serializer.INSTANCE, content6);
                    i4 |= 1;
                }
            }
            fOnWarmupCompleted = fOnWarmupCompleted2;
            content = content3;
            i = i4;
            content2 = content6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new DoubleCardDiscoveryLocal(i, content2, content, fOnWarmupCompleted, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m335deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        DoubleCardDiscoveryLocal doubleCardDiscoveryLocalDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 45;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return doubleCardDiscoveryLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DoubleCardDiscoveryLocal doubleCardDiscoveryLocal) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(doubleCardDiscoveryLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        DoubleCardDiscoveryLocal.onWarmupCompleted(doubleCardDiscoveryLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 117;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DoubleCardDiscoveryLocal) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
