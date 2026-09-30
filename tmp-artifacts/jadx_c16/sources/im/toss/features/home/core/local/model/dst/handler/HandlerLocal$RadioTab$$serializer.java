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
import o.getBgColor;
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
public final /* synthetic */ class HandlerLocal$RadioTab$$serializer implements aeu2<HandlerLocal.RadioTab> {
    public static final HandlerLocal$RadioTab$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 53;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        HandlerLocal$RadioTab$$serializer handlerLocal$RadioTab$$serializer = new HandlerLocal$RadioTab$$serializer();
        INSTANCE = handlerLocal$RadioTab$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.handler.HandlerLocal.RadioTab", handlerLocal$RadioTab$$serializer, 5);
        setanimationsloop.onWarmupCompleted("eventLog", true);
        setanimationsloop.onWarmupCompleted("runOption", true);
        setanimationsloop.onWarmupCompleted("radioTabKey", false);
        setanimationsloop.onWarmupCompleted("radioTabItemKey", false);
        setanimationsloop.onWarmupCompleted("saveStatus", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 85;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private HandlerLocal$RadioTab$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArr = new KSerializer[4];
            kSerializerArr[1] = sp.IAuthTabCallback(onAlipayJSBridgeReady.onExtraCallbackWithResult);
            kSerializerArr[1] = BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult;
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            kSerializerArr[5] = getwrigglelayout;
            kSerializerArr[2] = getwrigglelayout;
            kSerializerArr[3] = getBgColor.IAuthTabCallback;
        } else {
            KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
            kSerializerArr = new KSerializer[]{sp.IAuthTabCallback(onAlipayJSBridgeReady.onExtraCallbackWithResult), BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, kSerializer, kSerializer, getBgColor.IAuthTabCallback};
        }
        int i3 = onExtraCallback + 47;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HandlerLocal.RadioTab deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        EventLogLocal eventLogLocal;
        HandlerLocal.RunOption runOption;
        String strAsInterface;
        boolean zOnExtraCallbackWithResult;
        int i;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        String strAsInterface2 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            runOption = null;
            eventLogLocal = null;
            strAsInterface = null;
            i = 0;
            zOnExtraCallbackWithResult = false;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = onWarmupCompleted + 115;
                    int i5 = i4 % 128;
                    onExtraCallback = i5;
                    int i6 = i4 % 2;
                    if (iOnNavigationEvent == 0) {
                        eventLogLocal = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, onAlipayJSBridgeReady.onExtraCallbackWithResult, eventLogLocal);
                        i |= 1;
                    } else if (iOnNavigationEvent != 1) {
                        int i7 = i5 + 45;
                        int i8 = i7 % 128;
                        onWarmupCompleted = i8;
                        if (i7 % 2 == 0) {
                            if (iOnNavigationEvent != 3) {
                                i2 = i8 + 83;
                                onExtraCallback = i2 % 128;
                                if (i2 % 2 == 0) {
                                    if (iOnNavigationEvent == 3) {
                                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                                        i |= 8;
                                    } else {
                                        if (iOnNavigationEvent == 4) {
                                            throw new UnknownFieldException(iOnNavigationEvent);
                                        }
                                        zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4);
                                        i |= 16;
                                    }
                                } else if (iOnNavigationEvent == 3) {
                                    strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                                    i |= 8;
                                } else if (iOnNavigationEvent == 4) {
                                }
                            } else {
                                strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                                i |= 4;
                            }
                        } else if (iOnNavigationEvent != 2) {
                            i2 = i8 + 83;
                            onExtraCallback = i2 % 128;
                            if (i2 % 2 == 0) {
                            }
                        } else {
                            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                            i |= 4;
                        }
                    } else {
                        runOption = (HandlerLocal.RunOption) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, runOption);
                        i |= 2;
                    }
                } else {
                    z = false;
                }
            }
        } else {
            eventLogLocal = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, onAlipayJSBridgeReady.onExtraCallbackWithResult, (Object) null);
            runOption = (HandlerLocal.RunOption) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, (Object) null);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4);
            i = 31;
        }
        EventLogLocal eventLogLocal2 = eventLogLocal;
        int i9 = i;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HandlerLocal.RadioTab(i9, eventLogLocal2, runOption, strAsInterface2, strAsInterface, zOnExtraCallbackWithResult, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m449deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HandlerLocal.RadioTab radioTab) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(radioTab, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HandlerLocal.RadioTab.onWarmupCompleted(radioTab, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 59;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HandlerLocal.RadioTab) obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}
