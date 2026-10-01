package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.BaseListRowLocal;
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
public final /* synthetic */ class BaseListRowLocal$Right$Switch$$serializer implements aeu2<BaseListRowLocal.Right.Switch> {
    private static int IAuthTabCallback = 1;
    public static final BaseListRowLocal$Right$Switch$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 121;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 83;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        BaseListRowLocal$Right$Switch$$serializer baseListRowLocal$Right$Switch$$serializer = new BaseListRowLocal$Right$Switch$$serializer();
        INSTANCE = baseListRowLocal$Right$Switch$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.BaseListRowLocal.Right.Switch", baseListRowLocal$Right$Switch$$serializer, 4);
        setanimationsloop.onWarmupCompleted("checked", false);
        setanimationsloop.onWarmupCompleted("disabled", false);
        setanimationsloop.onWarmupCompleted("checkedHandler", false);
        setanimationsloop.onWarmupCompleted("uncheckedHandler", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 115;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private BaseListRowLocal$Right$Switch$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(setappxversioninworker);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(setappxversioninworker);
        getBgColor getbgcolor = getBgColor.IAuthTabCallback;
        KSerializer<?>[] kSerializerArr = {getbgcolor, getbgcolor, kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2};
        int i4 = onWarmupCompleted + 73;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final BaseListRowLocal.Right.Switch deserialize(@NotNull Decoder decoder) throws Throwable {
        HandlerLocal handlerLocal;
        HandlerLocal handlerLocal2;
        boolean zOnExtraCallbackWithResult;
        boolean z;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Throwable th = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
            boolean zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
            setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
            HandlerLocal handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, setappxversioninworker, (Object) null);
            HandlerLocal handlerLocal4 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setappxversioninworker, (Object) null);
            i = 15;
            handlerLocal = handlerLocal4;
            z = zOnExtraCallbackWithResult2;
            handlerLocal2 = handlerLocal3;
        } else {
            boolean z2 = true;
            boolean zOnExtraCallbackWithResult3 = false;
            boolean zOnExtraCallbackWithResult4 = false;
            int i3 = 0;
            HandlerLocal handlerLocal5 = null;
            handlerLocal = null;
            while (z2) {
                int i4 = onWarmupCompleted + 93;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i5 = onWarmupCompleted + 117;
                    int i6 = i5 % 128;
                    IAuthTabCallback = i6;
                    if (i5 % 2 == 0) {
                        throw th;
                    }
                    if (iOnNavigationEvent == 0) {
                        zOnExtraCallbackWithResult3 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
                        i3 |= 1;
                    } else if (iOnNavigationEvent != 1) {
                        int i7 = i6 + 25;
                        onWarmupCompleted = i7 % 128;
                        int i8 = i7 % 2;
                        if (iOnNavigationEvent != 2) {
                            int i9 = i6 + 69;
                            onWarmupCompleted = i9 % 128;
                            int i10 = i9 % 2;
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setAppxVersionInWorker.onExtraCallback, handlerLocal);
                            i3 |= 8;
                        } else {
                            handlerLocal5 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, setAppxVersionInWorker.onExtraCallback, handlerLocal5);
                            i3 |= 4;
                        }
                    } else {
                        zOnExtraCallbackWithResult4 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
                        i3 |= 2;
                    }
                } else {
                    int i11 = onWarmupCompleted + 25;
                    IAuthTabCallback = i11 % 128;
                    int i12 = i11 % 2;
                    z2 = false;
                }
                th = null;
            }
            handlerLocal2 = handlerLocal5;
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult3;
            z = zOnExtraCallbackWithResult4;
            i = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new BaseListRowLocal.Right.Switch(i, zOnExtraCallbackWithResult, z, handlerLocal2, handlerLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m300deserialize(Decoder decoder) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        BaseListRowLocal.Right.Switch switchDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 0 / 0;
        }
        return switchDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BaseListRowLocal.Right.Switch r5) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(r5, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            BaseListRowLocal.Right.Switch.onNavigationEvent(r5, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(r5, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        BaseListRowLocal.Right.Switch.onNavigationEvent(r5, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BaseListRowLocal.Right.Switch) obj);
        int i4 = IAuthTabCallback + 79;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 89;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
