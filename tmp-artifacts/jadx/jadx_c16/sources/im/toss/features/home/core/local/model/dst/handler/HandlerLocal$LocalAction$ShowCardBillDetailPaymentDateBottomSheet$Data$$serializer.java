package im.toss.features.home.core.local.model.dst.handler;

import im.toss.features.home.core.local.model.dst.eventlog.EventLogLocal;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import java.util.List;
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
import o.onAlipayJSBridgeReady;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HandlerLocal$LocalAction$ShowCardBillDetailPaymentDateBottomSheet$Data$$serializer implements aeu2<HandlerLocal.LocalAction.ShowCardBillDetailPaymentDateBottomSheet.Data> {
    public static final HandlerLocal$LocalAction$ShowCardBillDetailPaymentDateBottomSheet$Data$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 1;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 85;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        HandlerLocal$LocalAction$ShowCardBillDetailPaymentDateBottomSheet$Data$$serializer handlerLocal$LocalAction$ShowCardBillDetailPaymentDateBottomSheet$Data$$serializer = new HandlerLocal$LocalAction$ShowCardBillDetailPaymentDateBottomSheet$Data$$serializer();
        INSTANCE = handlerLocal$LocalAction$ShowCardBillDetailPaymentDateBottomSheet$Data$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.handler.HandlerLocal.LocalAction.ShowCardBillDetailPaymentDateBottomSheet.Data", handlerLocal$LocalAction$ShowCardBillDetailPaymentDateBottomSheet$Data$$serializer, 3);
        setanimationsloop.onWarmupCompleted("selectors", true);
        setanimationsloop.onWarmupCompleted("stateEventLog", false);
        setanimationsloop.onWarmupCompleted("selectedEventLog", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 119;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private HandlerLocal$LocalAction$ShowCardBillDetailPaymentDateBottomSheet$Data$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onAlipayJSBridgeReady onalipayjsbridgeready = onAlipayJSBridgeReady.onExtraCallbackWithResult;
        KSerializer<?>[] kSerializerArr = {HandlerLocal.LocalAction.ShowCardBillDetailPaymentDateBottomSheet.Data.onNavigationEvent()[0].getValue(), sp.IAuthTabCallback(onalipayjsbridgeready), sp.IAuthTabCallback(onalipayjsbridgeready)};
        int i4 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HandlerLocal.LocalAction.ShowCardBillDetailPaymentDateBottomSheet.Data deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        EventLogLocal eventLogLocal;
        List list;
        EventLogLocal eventLogLocal2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = HandlerLocal.LocalAction.ShowCardBillDetailPaymentDateBottomSheet.Data.onNavigationEvent();
        EventLogLocal eventLogLocal3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            List list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), (Object) null);
            onAlipayJSBridgeReady onalipayjsbridgeready = onAlipayJSBridgeReady.onExtraCallbackWithResult;
            EventLogLocal eventLogLocal4 = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, onalipayjsbridgeready, (Object) null);
            eventLogLocal2 = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, onalipayjsbridgeready, (Object) null);
            list = list2;
            i = 7;
            eventLogLocal = eventLogLocal4;
        } else {
            boolean z = true;
            int i3 = 0;
            List list3 = null;
            EventLogLocal eventLogLocal5 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i4 = onNavigationEvent + 77;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    if (iOnNavigationEvent == 1) {
                        eventLogLocal3 = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, onAlipayJSBridgeReady.onExtraCallbackWithResult, eventLogLocal3);
                        i3 |= 2;
                        int i6 = onNavigationEvent + 93;
                        onExtraCallbackWithResult = i6 % 128;
                        int i7 = i6 % 2;
                    } else {
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        eventLogLocal5 = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, onAlipayJSBridgeReady.onExtraCallbackWithResult, eventLogLocal5);
                        i3 |= 4;
                    }
                } else {
                    list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), list3);
                    i3 |= 1;
                }
            }
            i = i3;
            eventLogLocal = eventLogLocal3;
            list = list3;
            eventLogLocal2 = eventLogLocal5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HandlerLocal.LocalAction.ShowCardBillDetailPaymentDateBottomSheet.Data(i, list, eventLogLocal, eventLogLocal2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m443deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HandlerLocal.LocalAction.ShowCardBillDetailPaymentDateBottomSheet.Data data) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(data, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            HandlerLocal.LocalAction.ShowCardBillDetailPaymentDateBottomSheet.Data.IAuthTabCallback(data, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(data, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        HandlerLocal.LocalAction.ShowCardBillDetailPaymentDateBottomSheet.Data.IAuthTabCallback(data, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HandlerLocal.LocalAction.ShowCardBillDetailPaymentDateBottomSheet.Data) obj);
        int i4 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
