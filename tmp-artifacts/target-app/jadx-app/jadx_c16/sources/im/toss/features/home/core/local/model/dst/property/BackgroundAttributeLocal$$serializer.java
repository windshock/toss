package im.toss.features.home.core.local.model.dst.property;

import im.toss.features.home.core.local.model.dst.property.ColorAttributeLocal$;
import java.util.Set;
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
import o.setAnimationsLoop;
import o.setVideoListener;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BackgroundAttributeLocal$$serializer implements aeu2<BackgroundAttributeLocal> {
    private static int IAuthTabCallback = 1;
    public static final BackgroundAttributeLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        BackgroundAttributeLocal$$serializer backgroundAttributeLocal$$serializer = new BackgroundAttributeLocal$$serializer();
        INSTANCE = backgroundAttributeLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.property.BackgroundAttributeLocal", backgroundAttributeLocal$$serializer, 3);
        setanimationsloop.onWarmupCompleted("color", false);
        setanimationsloop.onWarmupCompleted("corners", false);
        setanimationsloop.onWarmupCompleted("cornerRadius", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 45;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 45 / 0;
        }
    }

    private BackgroundAttributeLocal$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(ColorAttributeLocal$.serializer.INSTANCE), BackgroundAttributeLocal.onNavigationEvent()[1].getValue(), setVideoListener.onWarmupCompleted};
        int i4 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final BackgroundAttributeLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Set set;
        ColorAttributeLocal colorAttributeLocal;
        double dIAuthTabCallback;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = BackgroundAttributeLocal.onNavigationEvent();
        int i3 = 7;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            ColorAttributeLocal colorAttributeLocal2 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, ColorAttributeLocal$.serializer.INSTANCE, (Object) null);
            Set set2 = (Set) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnNavigationEvent[1].getValue(), (Object) null);
            dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 2);
            set = set2;
            colorAttributeLocal = colorAttributeLocal2;
        } else {
            int i4 = 0;
            set = null;
            boolean z = true;
            double dIAuthTabCallback2 = 0.0d;
            ColorAttributeLocal colorAttributeLocal3 = null;
            while (z) {
                int i5 = onExtraCallbackWithResult + i3;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = onExtraCallbackWithResult;
                    int i7 = i6 + 17;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    if (iOnNavigationEvent != 0) {
                        int i9 = i6 + 95;
                        int i10 = i9 % 128;
                        IAuthTabCallback = i10;
                        if (i9 % 2 != 0 ? iOnNavigationEvent == 1 : iOnNavigationEvent == 0) {
                            set = (Set) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnNavigationEvent[1].getValue(), set);
                            i4 |= 2;
                        } else {
                            if (iOnNavigationEvent != 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i11 = i10 + 99;
                            onExtraCallbackWithResult = i11 % 128;
                            if (i11 % 2 != 0) {
                                dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 5);
                                i = i4 | 3;
                            } else {
                                dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 2);
                                i = i4 | 4;
                            }
                            i4 = i;
                            int i12 = IAuthTabCallback + 45;
                            onExtraCallbackWithResult = i12 % 128;
                            int i13 = i12 % 2;
                        }
                    } else {
                        colorAttributeLocal3 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, ColorAttributeLocal$.serializer.INSTANCE, colorAttributeLocal3);
                        i4 |= 1;
                    }
                    i3 = 7;
                } else {
                    z = false;
                }
            }
            colorAttributeLocal = colorAttributeLocal3;
            dIAuthTabCallback = dIAuthTabCallback2;
            i3 = i4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new BackgroundAttributeLocal(i3, colorAttributeLocal, set, dIAuthTabCallback, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m457deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        BackgroundAttributeLocal backgroundAttributeLocalDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 117;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return backgroundAttributeLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BackgroundAttributeLocal backgroundAttributeLocal) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(backgroundAttributeLocal, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            BackgroundAttributeLocal.onWarmupCompleted(backgroundAttributeLocal, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 20 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(backgroundAttributeLocal, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            BackgroundAttributeLocal.onWarmupCompleted(backgroundAttributeLocal, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = onExtraCallbackWithResult + 53;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BackgroundAttributeLocal) obj);
        int i4 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
