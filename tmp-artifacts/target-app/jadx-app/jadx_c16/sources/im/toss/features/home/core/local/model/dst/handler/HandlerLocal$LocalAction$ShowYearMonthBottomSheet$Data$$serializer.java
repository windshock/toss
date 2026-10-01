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
public final /* synthetic */ class HandlerLocal$LocalAction$ShowYearMonthBottomSheet$Data$$serializer implements aeu2<HandlerLocal.LocalAction.ShowYearMonthBottomSheet.Data> {
    public static final HandlerLocal$LocalAction$ShowYearMonthBottomSheet$Data$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
        return serialDescriptor;
    }

    static {
        HandlerLocal$LocalAction$ShowYearMonthBottomSheet$Data$$serializer handlerLocal$LocalAction$ShowYearMonthBottomSheet$Data$$serializer = new HandlerLocal$LocalAction$ShowYearMonthBottomSheet$Data$$serializer();
        INSTANCE = handlerLocal$LocalAction$ShowYearMonthBottomSheet$Data$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.handler.HandlerLocal.LocalAction.ShowYearMonthBottomSheet.Data", handlerLocal$LocalAction$ShowYearMonthBottomSheet$Data$$serializer, 5);
        setanimationsloop.onWarmupCompleted("startYearMonth", false);
        setanimationsloop.onWarmupCompleted("endYearMonth", false);
        setanimationsloop.onWarmupCompleted("selectedYearMonth", false);
        setanimationsloop.onWarmupCompleted("stateEventLog", false);
        setanimationsloop.onWarmupCompleted("selectedEventLog", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private HandlerLocal$LocalAction$ShowYearMonthBottomSheet$Data$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onAlipayJSBridgeReady onalipayjsbridgeready = onAlipayJSBridgeReady.onExtraCallbackWithResult;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(onalipayjsbridgeready);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(onalipayjsbridgeready);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, getwrigglelayout, kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2};
        int i4 = onNavigationEvent + 21;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HandlerLocal.LocalAction.ShowYearMonthBottomSheet.Data deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        EventLogLocal eventLogLocal;
        EventLogLocal eventLogLocal2;
        String str2;
        String str3;
        int i;
        char c;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            onAlipayJSBridgeReady onalipayjsbridgeready = onAlipayJSBridgeReady.onExtraCallbackWithResult;
            EventLogLocal eventLogLocal3 = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, onalipayjsbridgeready, (Object) null);
            str = strAsInterface;
            eventLogLocal = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, onalipayjsbridgeready, (Object) null);
            eventLogLocal2 = eventLogLocal3;
            str2 = strAsInterface2;
            str3 = strAsInterface3;
            i = 31;
        } else {
            int i3 = 0;
            boolean z = true;
            String strAsInterface4 = null;
            EventLogLocal eventLogLocal4 = null;
            EventLogLocal eventLogLocal5 = null;
            String strAsInterface5 = null;
            String strAsInterface6 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = onExtraCallback;
                    int i5 = i4 + 3;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 43 / 0;
                        if (iOnNavigationEvent != 0) {
                            int i7 = i4 + 125;
                            int i8 = i7 % 128;
                            onNavigationEvent = i8;
                            int i9 = i7 % 2;
                            if (iOnNavigationEvent != 1) {
                                int i10 = i8 + 87;
                                onExtraCallback = i10 % 128;
                                if (i10 % 2 == 0 ? iOnNavigationEvent == 2 : iOnNavigationEvent == 5) {
                                    c = 3;
                                    strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                                    i3 |= 4;
                                } else if (iOnNavigationEvent == 3) {
                                    c = 3;
                                    eventLogLocal5 = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, onAlipayJSBridgeReady.onExtraCallbackWithResult, eventLogLocal5);
                                    i3 |= 8;
                                } else {
                                    if (iOnNavigationEvent != 4) {
                                        throw new UnknownFieldException(iOnNavigationEvent);
                                    }
                                    eventLogLocal4 = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, onAlipayJSBridgeReady.onExtraCallbackWithResult, eventLogLocal4);
                                    i3 |= 16;
                                }
                            } else {
                                c = 3;
                                strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                                i3 |= 2;
                            }
                        } else {
                            c = 3;
                            strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                            i3 |= 1;
                        }
                    } else if (iOnNavigationEvent != 0) {
                    }
                } else {
                    z = false;
                }
            }
            str = strAsInterface4;
            eventLogLocal = eventLogLocal4;
            eventLogLocal2 = eventLogLocal5;
            str2 = strAsInterface5;
            str3 = strAsInterface6;
            i = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        HandlerLocal.LocalAction.ShowYearMonthBottomSheet.Data data = new HandlerLocal.LocalAction.ShowYearMonthBottomSheet.Data(i, str, str2, str3, eventLogLocal2, eventLogLocal, (okycx) null);
        int i11 = onNavigationEvent + 65;
        onExtraCallback = i11 % 128;
        if (i11 % 2 == 0) {
            return data;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m447deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        HandlerLocal.LocalAction.ShowYearMonthBottomSheet.Data dataDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
        return dataDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HandlerLocal.LocalAction.ShowYearMonthBottomSheet.Data data) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(data, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            HandlerLocal.LocalAction.ShowYearMonthBottomSheet.Data.onNavigationEvent(data, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 81 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(data, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            HandlerLocal.LocalAction.ShowYearMonthBottomSheet.Data.onNavigationEvent(data, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = onExtraCallback + 105;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HandlerLocal.LocalAction.ShowYearMonthBottomSheet.Data) obj);
        int i4 = onNavigationEvent + 103;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 73;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
