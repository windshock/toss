package im.toss.features.home.core.remote.model;

import im.toss.features.home.core.remote.model.OverviewResponse;
import im.toss.features.home.core.remote.model.dst.eventlog.EventLogResponse;
import im.toss.features.home.core.remote.model.dst.handler.HandlerResponse;
import im.toss.features.home.core.remote.model.dst.property.ColorAttributeResponse;
import im.toss.features.home.core.remote.model.dst.property.ColorAttributeResponse$;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.ResourceJsApiBridgeExtension4;
import o.TBPermissionHelper;
import o.aeu2;
import o.jp;
import o.okycx;
import o.openSetting;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class OverviewResponse$$serializer implements aeu2<OverviewResponse> {
    private static int IAuthTabCallback = 0;
    public static final OverviewResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 71;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 65 / 0;
        }
        return serialDescriptor;
    }

    static {
        OverviewResponse$$serializer overviewResponse$$serializer = new OverviewResponse$$serializer();
        INSTANCE = overviewResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.OverviewResponse", overviewResponse$$serializer, 9);
        setanimationsloop.onWarmupCompleted("sections", true);
        setanimationsloop.onWarmupCompleted("logo", true);
        setanimationsloop.onWarmupCompleted("exchangeRate", true);
        setanimationsloop.onWarmupCompleted("initializeHandler", true);
        setanimationsloop.onWarmupCompleted("navigationBarRightItems", true);
        setanimationsloop.onWarmupCompleted("backgroundColor", true);
        setanimationsloop.onWarmupCompleted("screenEventLog", true);
        setanimationsloop.onWarmupCompleted("state", false);
        setanimationsloop.onWarmupCompleted("refreshGuide", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 11;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private OverviewResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnNavigationEvent = OverviewResponse.onNavigationEvent();
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback((KSerializer) lazyArrOnNavigationEvent[0].getValue()), sp.IAuthTabCallback(ResourceJsApiBridgeExtension4.onExtraCallbackWithResult), sp.IAuthTabCallback(OverviewResponse$ExchangeRateResponse$$serializer.INSTANCE), sp.IAuthTabCallback(TBPermissionHelper.onExtraCallbackWithResult), sp.IAuthTabCallback((KSerializer) lazyArrOnNavigationEvent[4].getValue()), sp.IAuthTabCallback(ColorAttributeResponse$.serializer.INSTANCE), sp.IAuthTabCallback(openSetting.IAuthTabCallback), sp.IAuthTabCallback((KSerializer) lazyArrOnNavigationEvent[7].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrOnNavigationEvent[8].getValue())};
        int i4 = onWarmupCompleted + 121;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final OverviewResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        HandlerResponse handlerResponse;
        LogoResponse logoResponse;
        ColorAttributeResponse colorAttributeResponse;
        List list;
        Map map;
        EventLogResponse eventLogResponse;
        Map map2;
        List list2;
        OverviewResponse.ExchangeRateResponse exchangeRateResponse;
        HandlerResponse handlerResponse2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = OverviewResponse.onNavigationEvent();
        boolean z = true;
        int i3 = 6;
        int i4 = 7;
        int i5 = 8;
        Map map3 = null;
        if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            List list3 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), (Object) null);
            LogoResponse logoResponse2 = (LogoResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ResourceJsApiBridgeExtension4.onExtraCallbackWithResult, (Object) null);
            OverviewResponse.ExchangeRateResponse exchangeRateResponse2 = (OverviewResponse.ExchangeRateResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, OverviewResponse$ExchangeRateResponse$$serializer.INSTANCE, (Object) null);
            HandlerResponse handlerResponse3 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, TBPermissionHelper.onExtraCallbackWithResult, (Object) null);
            List list4 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, (jp) lazyArrOnNavigationEvent[4].getValue(), (Object) null);
            ColorAttributeResponse colorAttributeResponse2 = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ColorAttributeResponse$.serializer.INSTANCE, (Object) null);
            EventLogResponse eventLogResponse2 = (EventLogResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, openSetting.IAuthTabCallback, (Object) null);
            Map map4 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArrOnNavigationEvent[7].getValue(), (Object) null);
            exchangeRateResponse = exchangeRateResponse2;
            map = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, (jp) lazyArrOnNavigationEvent[8].getValue(), (Object) null);
            list = list3;
            logoResponse = logoResponse2;
            eventLogResponse = eventLogResponse2;
            colorAttributeResponse = colorAttributeResponse2;
            handlerResponse = handlerResponse3;
            map2 = map4;
            i = 511;
            list2 = list4;
        } else {
            boolean z2 = true;
            int i6 = 0;
            ColorAttributeResponse colorAttributeResponse3 = null;
            Map map5 = null;
            EventLogResponse eventLogResponse3 = null;
            List list5 = null;
            OverviewResponse.ExchangeRateResponse exchangeRateResponse3 = null;
            HandlerResponse handlerResponse4 = null;
            List list6 = null;
            LogoResponse logoResponse3 = null;
            while ((!z2) != z) {
                int i7 = onWarmupCompleted + 57;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z2 = false;
                        z = true;
                        i3 = 6;
                        i5 = 8;
                    case 0:
                        list6 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), list6);
                        i6 |= 1;
                        z = true;
                        i3 = 6;
                        i4 = 7;
                        i5 = 8;
                    case 1:
                        i6 |= 2;
                        handlerResponse4 = handlerResponse4;
                        logoResponse3 = (LogoResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ResourceJsApiBridgeExtension4.onExtraCallbackWithResult, logoResponse3);
                        z = true;
                        i3 = 6;
                        i4 = 7;
                    case 2:
                        handlerResponse2 = handlerResponse4;
                        exchangeRateResponse3 = (OverviewResponse.ExchangeRateResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, OverviewResponse$ExchangeRateResponse$$serializer.INSTANCE, exchangeRateResponse3);
                        i6 |= 4;
                        handlerResponse4 = handlerResponse2;
                        z = true;
                        i3 = 6;
                    case 3:
                        handlerResponse2 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, TBPermissionHelper.onExtraCallbackWithResult, handlerResponse4);
                        i6 |= 8;
                        int i9 = onWarmupCompleted + 95;
                        onExtraCallbackWithResult = i9 % 128;
                        int i10 = i9 % 2;
                        handlerResponse4 = handlerResponse2;
                        z = true;
                        i3 = 6;
                    case 4:
                        list5 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, (jp) lazyArrOnNavigationEvent[4].getValue(), list5);
                        i6 |= 16;
                        z = true;
                        i3 = 6;
                    case 5:
                        colorAttributeResponse3 = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ColorAttributeResponse$.serializer.INSTANCE, colorAttributeResponse3);
                        i6 |= 32;
                        z = true;
                    case 6:
                        eventLogResponse3 = (EventLogResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, openSetting.IAuthTabCallback, eventLogResponse3);
                        i6 |= 64;
                        int i11 = onWarmupCompleted + 87;
                        onExtraCallbackWithResult = i11 % 128;
                        int i12 = i11 % 2;
                        z = true;
                    case 7:
                        map3 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, (jp) lazyArrOnNavigationEvent[i4].getValue(), map3);
                        i6 |= 128;
                        z = true;
                    case 8:
                        map5 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, (jp) lazyArrOnNavigationEvent[i5].getValue(), map5);
                        i6 |= 256;
                        z = true;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            List list7 = list6;
            int i13 = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i13 % 128;
            int i14 = i13 % 2;
            i = i6;
            handlerResponse = handlerResponse4;
            logoResponse = logoResponse3;
            colorAttributeResponse = colorAttributeResponse3;
            list = list7;
            map = map5;
            eventLogResponse = eventLogResponse3;
            map2 = map3;
            list2 = list5;
            exchangeRateResponse = exchangeRateResponse3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new OverviewResponse(i, list, logoResponse, exchangeRateResponse, handlerResponse, list2, colorAttributeResponse, eventLogResponse, map2, map, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m544deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        OverviewResponse overviewResponseDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return overviewResponseDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull OverviewResponse overviewResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(overviewResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        OverviewResponse.onExtraCallbackWithResult(overviewResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (OverviewResponse) obj);
        int i4 = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 48 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
