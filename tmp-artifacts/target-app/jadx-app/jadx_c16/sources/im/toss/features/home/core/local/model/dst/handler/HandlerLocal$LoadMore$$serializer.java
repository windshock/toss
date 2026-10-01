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
public final /* synthetic */ class HandlerLocal$LoadMore$$serializer implements aeu2<HandlerLocal.LoadMore> {
    public static final HandlerLocal$LoadMore$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 67;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        HandlerLocal$LoadMore$$serializer handlerLocal$LoadMore$$serializer = new HandlerLocal$LoadMore$$serializer();
        INSTANCE = handlerLocal$LoadMore$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.handler.HandlerLocal.LoadMore", handlerLocal$LoadMore$$serializer, 3);
        setanimationsloop.onWarmupCompleted("eventLog", true);
        setanimationsloop.onWarmupCompleted("paginationId", false);
        setanimationsloop.onWarmupCompleted("runOption", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private HandlerLocal$LoadMore$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return new KSerializer[]{sp.IAuthTabCallback(onAlipayJSBridgeReady.onExtraCallbackWithResult), getWriggleLayout.onNavigationEvent, BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[3];
        kSerializerArr[1] = sp.IAuthTabCallback(onAlipayJSBridgeReady.onExtraCallbackWithResult);
        kSerializerArr[1] = getWriggleLayout.onNavigationEvent;
        kSerializerArr[2] = BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HandlerLocal.LoadMore deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        EventLogLocal eventLogLocal;
        HandlerLocal.RunOption runOption;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        String strAsInterface = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            EventLogLocal eventLogLocal2 = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, onAlipayJSBridgeReady.onExtraCallbackWithResult, (Object) null);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            HandlerLocal.RunOption runOption2 = (HandlerLocal.RunOption) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, (Object) null);
            int i3 = onNavigationEvent + 43;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            i = 7;
            eventLogLocal = eventLogLocal2;
            str = strAsInterface2;
            runOption = runOption2;
        } else {
            int i5 = 0;
            boolean z = true;
            EventLogLocal eventLogLocal3 = null;
            HandlerLocal.RunOption runOption3 = null;
            while (z) {
                int i6 = onNavigationEvent + 65;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i8 = onNavigationEvent + 5;
                    int i9 = i8 % 128;
                    onExtraCallback = i9;
                    int i10 = i8 % 2;
                    if (iOnNavigationEvent != 1) {
                        int i11 = i9 + 15;
                        onNavigationEvent = i11 % 128;
                        if (i11 % 2 == 0) {
                            if (iOnNavigationEvent != 5) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            runOption3 = (HandlerLocal.RunOption) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, runOption3);
                            i5 |= 4;
                        } else {
                            if (iOnNavigationEvent != 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            runOption3 = (HandlerLocal.RunOption) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, runOption3);
                            i5 |= 4;
                        }
                    } else {
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i5 |= 2;
                    }
                } else {
                    eventLogLocal3 = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, onAlipayJSBridgeReady.onExtraCallbackWithResult, eventLogLocal3);
                    i5 |= 1;
                }
            }
            i = i5;
            str = strAsInterface;
            eventLogLocal = eventLogLocal3;
            runOption = runOption3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HandlerLocal.LoadMore(i, eventLogLocal, str, runOption, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m432deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        HandlerLocal.LoadMore loadMoreDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 115;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return loadMoreDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HandlerLocal.LoadMore loadMore) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(loadMore, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            HandlerLocal.LoadMore.IAuthTabCallback(loadMore, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(loadMore, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        HandlerLocal.LoadMore.IAuthTabCallback(loadMore, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 50 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HandlerLocal.LoadMore) obj);
        if (i3 != 0) {
            int i4 = 19 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 33;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
