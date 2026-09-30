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
import o.getWriggleLayout;
import o.okycx;
import o.onAlipayJSBridgeReady;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HandlerLocal$RemoveItem$$serializer implements aeu2<HandlerLocal.RemoveItem> {
    private static int IAuthTabCallback = 0;
    public static final HandlerLocal$RemoveItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 65;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        HandlerLocal$RemoveItem$$serializer handlerLocal$RemoveItem$$serializer = new HandlerLocal$RemoveItem$$serializer();
        INSTANCE = handlerLocal$RemoveItem$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.handler.HandlerLocal.RemoveItem", handlerLocal$RemoveItem$$serializer, 3);
        setanimationsloop.onWarmupCompleted("eventLog", true);
        setanimationsloop.onWarmupCompleted("runOption", true);
        setanimationsloop.onWarmupCompleted("itemId", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 67;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private HandlerLocal$RemoveItem$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(onAlipayJSBridgeReady.onExtraCallbackWithResult), BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, getWriggleLayout.onNavigationEvent};
        int i4 = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HandlerLocal.RemoveItem deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        HandlerLocal.RunOption runOption;
        EventLogLocal eventLogLocal;
        String strAsInterface;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        HandlerLocal.RunOption runOption2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            EventLogLocal eventLogLocal2 = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, onAlipayJSBridgeReady.onExtraCallbackWithResult, (Object) null);
            HandlerLocal.RunOption runOption3 = (HandlerLocal.RunOption) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, (Object) null);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            eventLogLocal = eventLogLocal2;
            runOption = runOption3;
            i = 7;
        } else {
            int i5 = 0;
            boolean z = true;
            EventLogLocal eventLogLocal3 = null;
            String strAsInterface2 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    eventLogLocal3 = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, onAlipayJSBridgeReady.onExtraCallbackWithResult, eventLogLocal3);
                    i5 |= 1;
                } else if (iOnNavigationEvent != 1) {
                    int i6 = onExtraCallbackWithResult + 91;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    if (iOnNavigationEvent != 2) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                    i5 |= 4;
                } else {
                    runOption2 = (HandlerLocal.RunOption) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, runOption2);
                    i5 |= 2;
                }
            }
            i = i5;
            runOption = runOption2;
            eventLogLocal = eventLogLocal3;
            strAsInterface = strAsInterface2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HandlerLocal.RemoveItem(i, eventLogLocal, runOption, strAsInterface, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m451deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        HandlerLocal.RemoveItem removeItemDeserialize = deserialize(decoder);
        int i3 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return removeItemDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HandlerLocal.RemoveItem removeItem) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(removeItem, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HandlerLocal.RemoveItem.IAuthTabCallback(removeItem, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HandlerLocal.RemoveItem) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 107;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
