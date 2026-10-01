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
import o.BaseWorkerImplRenderReadyListener;
import o.aeu2;
import o.dj3;
import o.getBgColor;
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
public final /* synthetic */ class HandlerLocal$ScrollAndHighlight$$serializer implements aeu2<HandlerLocal.ScrollAndHighlight> {
    private static int IAuthTabCallback = 1;
    public static final HandlerLocal$ScrollAndHighlight$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 113;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        HandlerLocal$ScrollAndHighlight$$serializer handlerLocal$ScrollAndHighlight$$serializer = new HandlerLocal$ScrollAndHighlight$$serializer();
        INSTANCE = handlerLocal$ScrollAndHighlight$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.handler.HandlerLocal.ScrollAndHighlight", handlerLocal$ScrollAndHighlight$$serializer, 5);
        setanimationsloop.onWarmupCompleted("eventLog", true);
        setanimationsloop.onWarmupCompleted("runOption", true);
        setanimationsloop.onWarmupCompleted("targets", false);
        setanimationsloop.onWarmupCompleted("highlight", false);
        setanimationsloop.onWarmupCompleted("scrollRatio", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 111;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private HandlerLocal$ScrollAndHighlight$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlinx.serialization.KSerializer[]] */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlinx.serialization.KSerializer[]] */
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Lazy[] lazyArrOnExtraCallbackWithResult = HandlerLocal.ScrollAndHighlight.onExtraCallbackWithResult();
            ?? r6 = new KSerializer[3];
            r6[1] = sp.IAuthTabCallback(onAlipayJSBridgeReady.onExtraCallbackWithResult);
            r6[0] = BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult;
            r6[3] = lazyArrOnExtraCallbackWithResult[5].getValue();
            r6[5] = getBgColor.IAuthTabCallback;
            r6[3] = dj3.onWarmupCompleted;
            kSerializerArr = r6;
        } else {
            kSerializerArr = new KSerializer[]{sp.IAuthTabCallback(onAlipayJSBridgeReady.onExtraCallbackWithResult), BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, HandlerLocal.ScrollAndHighlight.onExtraCallbackWithResult()[2].getValue(), getBgColor.IAuthTabCallback, dj3.onWarmupCompleted};
        }
        int i3 = IAuthTabCallback + 63;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HandlerLocal.ScrollAndHighlight deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean zOnExtraCallbackWithResult;
        float fOnWarmupCompleted;
        int i;
        List list;
        HandlerLocal.RunOption runOption;
        EventLogLocal eventLogLocal;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = HandlerLocal.ScrollAndHighlight.onExtraCallbackWithResult();
        int i3 = 3;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i4 = IAuthTabCallback + 25;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            EventLogLocal eventLogLocal2 = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, onAlipayJSBridgeReady.onExtraCallbackWithResult, (Object) null);
            HandlerLocal.RunOption runOption2 = (HandlerLocal.RunOption) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, (Object) null);
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnExtraCallbackWithResult[2].getValue(), (Object) null);
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
            eventLogLocal = eventLogLocal2;
            fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 4);
            i = 31;
            runOption = runOption2;
        } else {
            int i6 = 0;
            boolean z = true;
            List list2 = null;
            HandlerLocal.RunOption runOption3 = null;
            EventLogLocal eventLogLocal3 = null;
            float fOnWarmupCompleted2 = 0.0f;
            boolean zOnExtraCallbackWithResult2 = false;
            while (z) {
                int i7 = IAuthTabCallback + 9;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    eventLogLocal3 = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, onAlipayJSBridgeReady.onExtraCallbackWithResult, eventLogLocal3);
                    i6 |= 1;
                    int i9 = onNavigationEvent + 97;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                    i3 = 3;
                } else if (iOnNavigationEvent == 1) {
                    runOption3 = (HandlerLocal.RunOption) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, runOption3);
                    i6 |= 2;
                } else if (iOnNavigationEvent == 2) {
                    list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnExtraCallbackWithResult[2].getValue(), list2);
                    i6 |= 4;
                } else if (iOnNavigationEvent == i3) {
                    zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3);
                    i6 |= 8;
                    int i11 = onNavigationEvent + 117;
                    IAuthTabCallback = i11 % 128;
                    int i12 = i11 % 2;
                } else {
                    if (iOnNavigationEvent != 4) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 4);
                    i6 |= 16;
                }
            }
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
            fOnWarmupCompleted = fOnWarmupCompleted2;
            i = i6;
            list = list2;
            runOption = runOption3;
            eventLogLocal = eventLogLocal3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HandlerLocal.ScrollAndHighlight(i, eventLogLocal, runOption, list, zOnExtraCallbackWithResult, fOnWarmupCompleted, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m452deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        HandlerLocal.ScrollAndHighlight scrollAndHighlightDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 43 / 0;
        }
        int i5 = onNavigationEvent + 105;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return scrollAndHighlightDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HandlerLocal.ScrollAndHighlight scrollAndHighlight) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(scrollAndHighlight, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HandlerLocal.ScrollAndHighlight.onWarmupCompleted(scrollAndHighlight, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 95;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HandlerLocal.ScrollAndHighlight) obj);
        int i4 = IAuthTabCallback + 91;
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
        int i2 = IAuthTabCallback + 121;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 103;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
