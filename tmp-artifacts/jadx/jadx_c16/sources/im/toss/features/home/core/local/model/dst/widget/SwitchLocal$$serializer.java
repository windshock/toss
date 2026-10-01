package im.toss.features.home.core.local.model.dst.widget;

import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
import o.okycx;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class SwitchLocal$$serializer implements aeu2<SwitchLocal> {
    private static int IAuthTabCallback = 1;
    public static final SwitchLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            serialDescriptor = descriptor;
            int i4 = 29 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i3 + 87;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        SwitchLocal$$serializer switchLocal$$serializer = new SwitchLocal$$serializer();
        INSTANCE = switchLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.SwitchLocal", switchLocal$$serializer, 4);
        setanimationsloop.onWarmupCompleted("checked", false);
        setanimationsloop.onWarmupCompleted("disabled", false);
        setanimationsloop.onWarmupCompleted("checkedHandler", false);
        setanimationsloop.onWarmupCompleted("uncheckedHandler", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 3;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private SwitchLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(setappxversioninworker);
            KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(setappxversioninworker);
            kSerializerArr = new KSerializer[3];
            getBgColor getbgcolor = getBgColor.IAuthTabCallback;
            kSerializerArr[0] = getbgcolor;
            kSerializerArr[0] = getbgcolor;
            kSerializerArr[3] = kSerializerIAuthTabCallback;
            kSerializerArr[5] = kSerializerIAuthTabCallback2;
        } else {
            setAppxVersionInWorker setappxversioninworker2 = setAppxVersionInWorker.onExtraCallback;
            KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(setappxversioninworker2);
            KSerializer<?> kSerializerIAuthTabCallback4 = sp.IAuthTabCallback(setappxversioninworker2);
            getBgColor getbgcolor2 = getBgColor.IAuthTabCallback;
            kSerializerArr = new KSerializer[]{getbgcolor2, getbgcolor2, kSerializerIAuthTabCallback3, kSerializerIAuthTabCallback4};
        }
        int i3 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SwitchLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        boolean z;
        boolean z2;
        HandlerLocal handlerLocal;
        HandlerLocal handlerLocal2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
            boolean zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
            setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
            HandlerLocal handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, setappxversioninworker, (Object) null);
            HandlerLocal handlerLocal4 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setappxversioninworker, (Object) null);
            int i3 = onNavigationEvent + 55;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            i = 15;
            z = zOnExtraCallbackWithResult;
            z2 = zOnExtraCallbackWithResult2;
            handlerLocal = handlerLocal4;
            handlerLocal2 = handlerLocal3;
        } else {
            boolean z3 = true;
            HandlerLocal handlerLocal5 = null;
            HandlerLocal handlerLocal6 = null;
            int i5 = 0;
            boolean zOnExtraCallbackWithResult3 = false;
            boolean zOnExtraCallbackWithResult4 = false;
            while (z3) {
                int i6 = onNavigationEvent + 51;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z3 = false;
                } else if (iOnNavigationEvent == 0) {
                    zOnExtraCallbackWithResult3 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
                    i5 |= 1;
                } else if (iOnNavigationEvent != 1) {
                    int i7 = onExtraCallbackWithResult + 45;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 == 0) {
                        if (iOnNavigationEvent == 5) {
                            handlerLocal6 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, setAppxVersionInWorker.onExtraCallback, handlerLocal6);
                            i5 |= 4;
                        } else {
                            if (iOnNavigationEvent == 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            handlerLocal5 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setAppxVersionInWorker.onExtraCallback, handlerLocal5);
                            i5 |= 8;
                        }
                    } else if (iOnNavigationEvent == 2) {
                        handlerLocal6 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, setAppxVersionInWorker.onExtraCallback, handlerLocal6);
                        i5 |= 4;
                    } else if (iOnNavigationEvent == 3) {
                    }
                } else {
                    zOnExtraCallbackWithResult4 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
                    i5 |= 2;
                }
            }
            i = i5;
            z = zOnExtraCallbackWithResult3;
            z2 = zOnExtraCallbackWithResult4;
            handlerLocal = handlerLocal5;
            handlerLocal2 = handlerLocal6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new SwitchLocal(i, z, z2, handlerLocal2, handlerLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m510deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        SwitchLocal switchLocalDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return switchLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull SwitchLocal switchLocal) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(switchLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        SwitchLocal.onWarmupCompleted(switchLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (SwitchLocal) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
