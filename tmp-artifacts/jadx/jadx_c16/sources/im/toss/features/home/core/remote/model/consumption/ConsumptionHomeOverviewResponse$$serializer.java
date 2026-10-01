package im.toss.features.home.core.remote.model.consumption;

import im.toss.features.home.core.remote.model.consumption.ConsumptionHomeOverviewResponse;
import im.toss.features.home.core.remote.model.consumption.element.ConsumptionSectionResponse;
import im.toss.features.home.core.remote.model.consumption.element.ConsumptionSectionResponse$;
import im.toss.features.home.core.remote.model.dst.handler.HandlerResponse;
import im.toss.features.home.core.remote.model.dst.widget.ConsumptionTransactionActionCellResponse;
import im.toss.features.home.core.remote.model.dst.widget.ConsumptionTransactionActionCellResponse$$serializer;
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
import o.PreviewImageBridgeExtension;
import o.TBPermissionHelper;
import o.aeu2;
import o.getDynamicHeight;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionHomeOverviewResponse$$serializer implements aeu2<ConsumptionHomeOverviewResponse> {
    private static int IAuthTabCallback = 1;
    public static final ConsumptionHomeOverviewResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        ConsumptionHomeOverviewResponse$$serializer consumptionHomeOverviewResponse$$serializer = new ConsumptionHomeOverviewResponse$$serializer();
        INSTANCE = consumptionHomeOverviewResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.consumption.ConsumptionHomeOverviewResponse", consumptionHomeOverviewResponse$$serializer, 11);
        setanimationsloop.onWarmupCompleted("initializeHandler", false);
        setanimationsloop.onWarmupCompleted("sections", false);
        setanimationsloop.onWarmupCompleted("transactions", false);
        setanimationsloop.onWarmupCompleted("bottomCta", false);
        setanimationsloop.onWarmupCompleted("rightBarButtonType", false);
        setanimationsloop.onWarmupCompleted("bottomSheet", false);
        setanimationsloop.onWarmupCompleted("transactionCount", false);
        setanimationsloop.onWarmupCompleted("pinHeader", false);
        setanimationsloop.onWarmupCompleted("transactionActionCell", false);
        setanimationsloop.onWarmupCompleted("state", true);
        setanimationsloop.onWarmupCompleted("refreshGuide", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 117;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ConsumptionHomeOverviewResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrAsBinder = ConsumptionHomeOverviewResponse.asBinder();
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(TBPermissionHelper.onExtraCallbackWithResult);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback((KSerializer) lazyArrAsBinder[1].getValue());
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback((KSerializer) lazyArrAsBinder[2].getValue());
        ConsumptionSectionResponse$.serializer serializerVar = ConsumptionSectionResponse$.serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3, sp.IAuthTabCallback(serializerVar), sp.IAuthTabCallback((KSerializer) lazyArrAsBinder[4].getValue()), sp.IAuthTabCallback(serializerVar), sp.IAuthTabCallback(getDynamicHeight.onWarmupCompleted), sp.IAuthTabCallback(ConsumptionHomeOverviewResponse$PinHeader$$serializer.INSTANCE), sp.IAuthTabCallback(ConsumptionTransactionActionCellResponse$$serializer.INSTANCE), sp.IAuthTabCallback((KSerializer) lazyArrAsBinder[9].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrAsBinder[10].getValue())};
        int i4 = onExtraCallback + 51;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ConsumptionHomeOverviewResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        int i;
        Map map;
        Map map2;
        ConsumptionHomeOverviewResponse.PinHeader pinHeader;
        List list2;
        ConsumptionTransactionActionCellResponse consumptionTransactionActionCellResponse;
        HandlerResponse handlerResponse;
        PreviewImageBridgeExtension previewImageBridgeExtension;
        Integer num;
        ConsumptionSectionResponse consumptionSectionResponse;
        ConsumptionSectionResponse consumptionSectionResponse2;
        PreviewImageBridgeExtension previewImageBridgeExtension2;
        ConsumptionSectionResponse consumptionSectionResponse3;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 69;
        onExtraCallbackWithResult = i3 % 128;
        Map map3 = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            ConsumptionHomeOverviewResponse.asBinder();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrAsBinder = ConsumptionHomeOverviewResponse.asBinder();
        int i4 = 9;
        if (ywVarOnWarmupCompleted2.extraCallbackWithResult()) {
            HandlerResponse handlerResponse2 = (HandlerResponse) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 0, TBPermissionHelper.onExtraCallbackWithResult, (Object) null);
            List list3 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrAsBinder[1].getValue(), (Object) null);
            List list4 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrAsBinder[2].getValue(), (Object) null);
            ConsumptionSectionResponse$.serializer serializerVar = ConsumptionSectionResponse$.serializer.INSTANCE;
            ConsumptionSectionResponse consumptionSectionResponse4 = (ConsumptionSectionResponse) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 3, serializerVar, (Object) null);
            PreviewImageBridgeExtension previewImageBridgeExtension3 = (PreviewImageBridgeExtension) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 4, (jp) lazyArrAsBinder[4].getValue(), (Object) null);
            ConsumptionSectionResponse consumptionSectionResponse5 = (ConsumptionSectionResponse) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 5, serializerVar, (Object) null);
            Integer num2 = (Integer) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 6, getDynamicHeight.onWarmupCompleted, (Object) null);
            ConsumptionHomeOverviewResponse.PinHeader pinHeader2 = (ConsumptionHomeOverviewResponse.PinHeader) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 7, ConsumptionHomeOverviewResponse$PinHeader$$serializer.INSTANCE, (Object) null);
            ConsumptionTransactionActionCellResponse consumptionTransactionActionCellResponse2 = (ConsumptionTransactionActionCellResponse) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 8, ConsumptionTransactionActionCellResponse$$serializer.INSTANCE, (Object) null);
            Map map4 = (Map) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 9, (jp) lazyArrAsBinder[9].getValue(), (Object) null);
            Map map5 = (Map) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 10, (jp) lazyArrAsBinder[10].getValue(), (Object) null);
            int i5 = onExtraCallbackWithResult + 53;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            consumptionSectionResponse = consumptionSectionResponse5;
            map2 = map5;
            pinHeader = pinHeader2;
            consumptionTransactionActionCellResponse = consumptionTransactionActionCellResponse2;
            consumptionSectionResponse2 = consumptionSectionResponse4;
            map = map4;
            list2 = list3;
            i = 2047;
            handlerResponse = handlerResponse2;
            previewImageBridgeExtension = previewImageBridgeExtension3;
            list = list4;
            num = num2;
        } else {
            ConsumptionSectionResponse consumptionSectionResponse6 = null;
            ConsumptionSectionResponse consumptionSectionResponse7 = null;
            Map map6 = null;
            ConsumptionHomeOverviewResponse.PinHeader pinHeader3 = null;
            list = null;
            Integer num3 = null;
            HandlerResponse handlerResponse3 = null;
            PreviewImageBridgeExtension previewImageBridgeExtension4 = null;
            i = 0;
            boolean z = true;
            List list5 = null;
            ConsumptionTransactionActionCellResponse consumptionTransactionActionCellResponse3 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        previewImageBridgeExtension2 = previewImageBridgeExtension4;
                        consumptionSectionResponse3 = consumptionSectionResponse6;
                        z = false;
                        consumptionSectionResponse6 = consumptionSectionResponse3;
                        previewImageBridgeExtension4 = previewImageBridgeExtension2;
                        i4 = 9;
                    case 0:
                        previewImageBridgeExtension2 = previewImageBridgeExtension4;
                        consumptionSectionResponse3 = consumptionSectionResponse6;
                        i |= 1;
                        handlerResponse3 = (HandlerResponse) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 0, TBPermissionHelper.onExtraCallbackWithResult, handlerResponse3);
                        consumptionSectionResponse6 = consumptionSectionResponse3;
                        previewImageBridgeExtension4 = previewImageBridgeExtension2;
                        i4 = 9;
                    case 1:
                        previewImageBridgeExtension2 = previewImageBridgeExtension4;
                        consumptionSectionResponse3 = consumptionSectionResponse6;
                        list5 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrAsBinder[1].getValue(), list5);
                        i |= 2;
                        consumptionSectionResponse6 = consumptionSectionResponse3;
                        previewImageBridgeExtension4 = previewImageBridgeExtension2;
                        i4 = 9;
                    case 2:
                        previewImageBridgeExtension2 = previewImageBridgeExtension4;
                        consumptionSectionResponse3 = consumptionSectionResponse6;
                        list = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrAsBinder[2].getValue(), list);
                        i |= 4;
                        consumptionSectionResponse6 = consumptionSectionResponse3;
                        previewImageBridgeExtension4 = previewImageBridgeExtension2;
                        i4 = 9;
                    case 3:
                        previewImageBridgeExtension2 = previewImageBridgeExtension4;
                        consumptionSectionResponse3 = consumptionSectionResponse6;
                        consumptionSectionResponse7 = (ConsumptionSectionResponse) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 3, ConsumptionSectionResponse$.serializer.INSTANCE, consumptionSectionResponse7);
                        i |= 8;
                        consumptionSectionResponse6 = consumptionSectionResponse3;
                        previewImageBridgeExtension4 = previewImageBridgeExtension2;
                        i4 = 9;
                    case 4:
                        previewImageBridgeExtension4 = (PreviewImageBridgeExtension) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 4, (jp) lazyArrAsBinder[4].getValue(), previewImageBridgeExtension4);
                        i |= 16;
                        i4 = 9;
                    case 5:
                        consumptionSectionResponse6 = (ConsumptionSectionResponse) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 5, ConsumptionSectionResponse$.serializer.INSTANCE, consumptionSectionResponse6);
                        i |= 32;
                    case 6:
                        num3 = (Integer) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 6, getDynamicHeight.onWarmupCompleted, num3);
                        i |= 64;
                    case 7:
                        pinHeader3 = (ConsumptionHomeOverviewResponse.PinHeader) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 7, ConsumptionHomeOverviewResponse$PinHeader$$serializer.INSTANCE, pinHeader3);
                        i |= 128;
                    case 8:
                        consumptionTransactionActionCellResponse3 = (ConsumptionTransactionActionCellResponse) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 8, ConsumptionTransactionActionCellResponse$$serializer.INSTANCE, consumptionTransactionActionCellResponse3);
                        i |= 256;
                    case 9:
                        map3 = (Map) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, i4, (jp) lazyArrAsBinder[i4].getValue(), map3);
                        i |= 512;
                    case 10:
                        map6 = (Map) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 10, (jp) lazyArrAsBinder[10].getValue(), map6);
                        i |= 1024;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            PreviewImageBridgeExtension previewImageBridgeExtension5 = previewImageBridgeExtension4;
            ConsumptionSectionResponse consumptionSectionResponse8 = consumptionSectionResponse6;
            HandlerResponse handlerResponse4 = handlerResponse3;
            map = map3;
            map2 = map6;
            pinHeader = pinHeader3;
            list2 = list5;
            consumptionTransactionActionCellResponse = consumptionTransactionActionCellResponse3;
            handlerResponse = handlerResponse4;
            previewImageBridgeExtension = previewImageBridgeExtension5;
            num = num3;
            consumptionSectionResponse = consumptionSectionResponse8;
            consumptionSectionResponse2 = consumptionSectionResponse7;
        }
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        return new ConsumptionHomeOverviewResponse(i, handlerResponse, list2, list, consumptionSectionResponse2, previewImageBridgeExtension, consumptionSectionResponse, num, pinHeader, consumptionTransactionActionCellResponse, map, map2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m576deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ConsumptionHomeOverviewResponse consumptionHomeOverviewResponseDeserialize = deserialize(decoder);
        int i3 = onExtraCallback + 87;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return consumptionHomeOverviewResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ConsumptionHomeOverviewResponse consumptionHomeOverviewResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(consumptionHomeOverviewResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ConsumptionHomeOverviewResponse.onNavigationEvent(consumptionHomeOverviewResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(consumptionHomeOverviewResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        ConsumptionHomeOverviewResponse.onNavigationEvent(consumptionHomeOverviewResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ConsumptionHomeOverviewResponse) obj);
        int i4 = onExtraCallbackWithResult + 93;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 51;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
