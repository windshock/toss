package im.toss.features.home.core.local.model.dst.handler;

import im.toss.features.home.core.local.model.dst.eventlog.EventLogLocal;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BaseWorkerImplRenderReadyListener;
import o.aeu2;
import o.okycx;
import o.onAlipayJSBridgeReady;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HandlerLocal$Close$$serializer implements aeu2<HandlerLocal.Close> {
    public static final HandlerLocal$Close$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 119;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        HandlerLocal$Close$$serializer handlerLocal$Close$$serializer = new HandlerLocal$Close$$serializer();
        INSTANCE = handlerLocal$Close$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.handler.HandlerLocal.Close", handlerLocal$Close$$serializer, 2);
        setanimationsloop.onWarmupCompleted("eventLog", true);
        setanimationsloop.onWarmupCompleted("runOption", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 95;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private HandlerLocal$Close$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(onAlipayJSBridgeReady.onExtraCallbackWithResult), BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult};
        int i4 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HandlerLocal.Close deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        EventLogLocal eventLogLocal;
        HandlerLocal.RunOption runOption;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i3 = 3;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            int i4 = 0;
            eventLogLocal = null;
            runOption = null;
            while (z) {
                int i5 = onExtraCallbackWithResult + 109;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i7 = onNavigationEvent + 103;
                    int i8 = i7 % 128;
                    onExtraCallbackWithResult = i8;
                    if (i7 % 2 != 0) {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        i = i8 + 117;
                        onNavigationEvent = i % 128;
                        if (i % 2 != 0) {
                            runOption = (HandlerLocal.RunOption) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, runOption);
                            i4 = 3;
                        } else {
                            runOption = (HandlerLocal.RunOption) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, runOption);
                            i4 |= 2;
                        }
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        i = i8 + 117;
                        onNavigationEvent = i % 128;
                        if (i % 2 != 0) {
                        }
                    }
                } else {
                    eventLogLocal = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, onAlipayJSBridgeReady.onExtraCallbackWithResult, eventLogLocal);
                    i4 |= 1;
                }
            }
            i3 = i4;
        } else {
            int i9 = onExtraCallbackWithResult + 117;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            eventLogLocal = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, onAlipayJSBridgeReady.onExtraCallbackWithResult, (Object) null);
            runOption = (HandlerLocal.RunOption) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, (Object) null);
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HandlerLocal.Close(i3, eventLogLocal, runOption, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m427deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        HandlerLocal.Close closeDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return closeDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HandlerLocal.Close close) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(close, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            HandlerLocal.Close.IAuthTabCallback(close, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(close, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        HandlerLocal.Close.IAuthTabCallback(close, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        serialize(encoder, (HandlerLocal.Close) obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
