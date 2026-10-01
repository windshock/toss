package im.toss.features.home.core.local.model.dst.widget;

import im.toss.features.home.core.local.model.dst.eventlog.EventLogLocal;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.widget.BottomCtaLocal$;
import im.toss.features.home.core.local.model.dst.widget.BottomSheetLocal;
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
import o.setAppxVersionInWorker;
import o.setVideoListener;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BottomSheetLocal$$serializer implements aeu2<BottomSheetLocal> {
    private static int IAuthTabCallback = 0;
    public static final BottomSheetLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 39;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 125;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        BottomSheetLocal$$serializer bottomSheetLocal$$serializer = new BottomSheetLocal$$serializer();
        INSTANCE = bottomSheetLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.BottomSheetLocal", bottomSheetLocal$$serializer, 6);
        setanimationsloop.onWarmupCompleted("stateEventLog", false);
        setanimationsloop.onWarmupCompleted("header", false);
        setanimationsloop.onWarmupCompleted("sections", false);
        setanimationsloop.onWarmupCompleted("bottomCta", false);
        setanimationsloop.onWarmupCompleted("initializeHandler", false);
        setanimationsloop.onWarmupCompleted("maxHeightRatio", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 83;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 38 / 0;
        }
    }

    private BottomSheetLocal$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(onAlipayJSBridgeReady.onExtraCallbackWithResult), sp.IAuthTabCallback(BottomSheetLocal$Header$$serializer.INSTANCE), BottomSheetLocal.onExtraCallback()[2].getValue(), sp.IAuthTabCallback(BottomCtaLocal$.serializer.INSTANCE), sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback), sp.IAuthTabCallback(setVideoListener.onWarmupCompleted)};
        int i4 = onExtraCallback + 73;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final BottomSheetLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        List list;
        BottomCtaLocal bottomCtaLocal;
        EventLogLocal eventLogLocal;
        BottomSheetLocal.Header header;
        Double d;
        HandlerLocal handlerLocal;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallback = BottomSheetLocal.onExtraCallback();
        if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            EventLogLocal eventLogLocal2 = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, onAlipayJSBridgeReady.onExtraCallbackWithResult, (Object) null);
            BottomSheetLocal.Header header2 = (BottomSheetLocal.Header) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, BottomSheetLocal$Header$$serializer.INSTANCE, (Object) null);
            List list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnExtraCallback[2].getValue(), (Object) null);
            BottomCtaLocal bottomCtaLocal2 = (BottomCtaLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, BottomCtaLocal$.serializer.INSTANCE, (Object) null);
            handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setAppxVersionInWorker.onExtraCallback, (Object) null);
            i = 63;
            d = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, setVideoListener.onWarmupCompleted, (Object) null);
            bottomCtaLocal = bottomCtaLocal2;
            eventLogLocal = eventLogLocal2;
            header = header2;
            list = list2;
        } else {
            boolean z = true;
            i = 0;
            List list3 = null;
            BottomCtaLocal bottomCtaLocal3 = null;
            EventLogLocal eventLogLocal3 = null;
            BottomSheetLocal.Header header3 = null;
            Double d2 = null;
            HandlerLocal handlerLocal2 = null;
            while (z) {
                int i3 = IAuthTabCallback + 33;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        eventLogLocal3 = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, onAlipayJSBridgeReady.onExtraCallbackWithResult, eventLogLocal3);
                        i |= 1;
                        continue;
                    case 1:
                        header3 = (BottomSheetLocal.Header) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, BottomSheetLocal$Header$$serializer.INSTANCE, header3);
                        i |= 2;
                        break;
                    case 2:
                        list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnExtraCallback[2].getValue(), list3);
                        i |= 4;
                        break;
                    case 3:
                        bottomCtaLocal3 = (BottomCtaLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, BottomCtaLocal$.serializer.INSTANCE, bottomCtaLocal3);
                        i |= 8;
                        int i4 = IAuthTabCallback + 55;
                        onExtraCallback = i4 % 128;
                        int i5 = i4 % 2;
                        break;
                    case 4:
                        handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setAppxVersionInWorker.onExtraCallback, handlerLocal2);
                        i |= 16;
                        break;
                    case 5:
                        d2 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, setVideoListener.onWarmupCompleted, d2);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            list = list3;
            bottomCtaLocal = bottomCtaLocal3;
            eventLogLocal = eventLogLocal3;
            header = header3;
            d = d2;
            handlerLocal = handlerLocal2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new BottomSheetLocal(i, eventLogLocal, header, list, bottomCtaLocal, handlerLocal, d, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m474deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        BottomSheetLocal bottomSheetLocalDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 89;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return bottomSheetLocalDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BottomSheetLocal bottomSheetLocal) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(bottomSheetLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        BottomSheetLocal.onExtraCallback(bottomSheetLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 7;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BottomSheetLocal) obj);
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        int i5 = IAuthTabCallback + 43;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
