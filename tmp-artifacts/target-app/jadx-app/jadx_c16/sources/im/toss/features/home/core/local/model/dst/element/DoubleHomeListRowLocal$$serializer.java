package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.DoubleHomeListRowLocal;
import im.toss.features.home.core.local.model.dst.property.LayoutLocal;
import im.toss.features.home.core.local.model.dst.property.LayoutLocal$$serializer;
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
public final /* synthetic */ class DoubleHomeListRowLocal$$serializer implements aeu2<DoubleHomeListRowLocal> {
    public static final DoubleHomeListRowLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 67;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        DoubleHomeListRowLocal$$serializer doubleHomeListRowLocal$$serializer = new DoubleHomeListRowLocal$$serializer();
        INSTANCE = doubleHomeListRowLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.DoubleHomeListRowLocal", doubleHomeListRowLocal$$serializer, 4);
        setanimationsloop.onWarmupCompleted("layout", false);
        setanimationsloop.onWarmupCompleted("left", false);
        setanimationsloop.onWarmupCompleted("right", false);
        setanimationsloop.onWarmupCompleted("betweenSpace", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 11;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private DoubleHomeListRowLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        DoubleHomeListRowLocal$Container$$serializer doubleHomeListRowLocal$Container$$serializer = DoubleHomeListRowLocal$Container$$serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {LayoutLocal$$serializer.INSTANCE, doubleHomeListRowLocal$Container$$serializer, doubleHomeListRowLocal$Container$$serializer, dj3.onWarmupCompleted};
        int i4 = onWarmupCompleted + 121;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DoubleHomeListRowLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        LayoutLocal layoutLocal;
        DoubleHomeListRowLocal.Container container;
        DoubleHomeListRowLocal.Container container2;
        float fOnWarmupCompleted;
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 93;
        onNavigationEvent = i3 % 128;
        DoubleHomeListRowLocal.Container container3 = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            LayoutLocal layoutLocal2 = (LayoutLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, LayoutLocal$$serializer.INSTANCE, (Object) null);
            DoubleHomeListRowLocal$Container$$serializer doubleHomeListRowLocal$Container$$serializer = DoubleHomeListRowLocal$Container$$serializer.INSTANCE;
            DoubleHomeListRowLocal.Container container4 = (DoubleHomeListRowLocal.Container) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, doubleHomeListRowLocal$Container$$serializer, (Object) null);
            container2 = (DoubleHomeListRowLocal.Container) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, doubleHomeListRowLocal$Container$$serializer, (Object) null);
            layoutLocal = layoutLocal2;
            fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 3);
            i = 15;
            container = container4;
        } else {
            float fOnWarmupCompleted2 = 0.0f;
            LayoutLocal layoutLocal3 = null;
            DoubleHomeListRowLocal.Container container5 = null;
            int i4 = 0;
            boolean z = true;
            while (z) {
                int i5 = onNavigationEvent + 55;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i7 = onWarmupCompleted;
                    int i8 = i7 + 31;
                    onNavigationEvent = i8 % 128;
                    if (i8 % 2 == 0) {
                        if (iOnNavigationEvent == 0) {
                            container3 = (DoubleHomeListRowLocal.Container) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, DoubleHomeListRowLocal$Container$$serializer.INSTANCE, container3);
                            i4 |= 2;
                            int i9 = onNavigationEvent + 83;
                            onWarmupCompleted = i9 % 128;
                            int i10 = i9 % 2;
                        } else if (iOnNavigationEvent != 2) {
                            container5 = (DoubleHomeListRowLocal.Container) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, DoubleHomeListRowLocal$Container$$serializer.INSTANCE, container5);
                            i4 |= 4;
                        } else {
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i11 = i7 + 79;
                            onNavigationEvent = i11 % 128;
                            if (i11 % 2 == 0) {
                                fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 4);
                                i4 |= 107;
                            } else {
                                fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 3);
                                i4 |= 8;
                            }
                        }
                    } else if (iOnNavigationEvent == 1) {
                        container3 = (DoubleHomeListRowLocal.Container) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, DoubleHomeListRowLocal$Container$$serializer.INSTANCE, container3);
                        i4 |= 2;
                        int i92 = onNavigationEvent + 83;
                        onWarmupCompleted = i92 % 128;
                        int i102 = i92 % 2;
                    } else if (iOnNavigationEvent != 2) {
                    }
                } else {
                    layoutLocal3 = (LayoutLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, LayoutLocal$$serializer.INSTANCE, layoutLocal3);
                    i4 |= 1;
                    int i12 = onNavigationEvent + 91;
                    onWarmupCompleted = i12 % 128;
                    int i13 = i12 % 2;
                }
            }
            layoutLocal = layoutLocal3;
            container = container3;
            container2 = container5;
            fOnWarmupCompleted = fOnWarmupCompleted2;
            i = i4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new DoubleHomeListRowLocal(i, layoutLocal, container, container2, fOnWarmupCompleted, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m338deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        DoubleHomeListRowLocal doubleHomeListRowLocalDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 11 / 0;
        }
        int i5 = onWarmupCompleted + 75;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 48 / 0;
        }
        return doubleHomeListRowLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DoubleHomeListRowLocal doubleHomeListRowLocal) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(doubleHomeListRowLocal, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            DoubleHomeListRowLocal.onExtraCallbackWithResult(doubleHomeListRowLocal, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(doubleHomeListRowLocal, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        DoubleHomeListRowLocal.onExtraCallbackWithResult(doubleHomeListRowLocal, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 71 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DoubleHomeListRowLocal) obj);
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 111;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
