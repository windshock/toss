package im.toss.features.home.core.local.model.dst.handler;

import com.iap.ac.android.acs.plugin.utils.AuthCodeUtil;
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
public final /* synthetic */ class HandlerLocal$Telephone$$serializer implements aeu2<HandlerLocal.Telephone> {
    public static final HandlerLocal$Telephone$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 25;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        HandlerLocal$Telephone$$serializer handlerLocal$Telephone$$serializer = new HandlerLocal$Telephone$$serializer();
        INSTANCE = handlerLocal$Telephone$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.handler.HandlerLocal.Telephone", handlerLocal$Telephone$$serializer, 3);
        setanimationsloop.onWarmupCompleted("eventLog", true);
        setanimationsloop.onWarmupCompleted("runOption", true);
        setanimationsloop.onWarmupCompleted(AuthCodeUtil.SCOPE_PHONE_NUMBER, false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 13;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private HandlerLocal$Telephone$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArr = new KSerializer[2];
            kSerializerArr[0] = sp.IAuthTabCallback(onAlipayJSBridgeReady.onExtraCallbackWithResult);
            kSerializerArr[1] = BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult;
            kSerializerArr[2] = getWriggleLayout.onNavigationEvent;
        } else {
            kSerializerArr = new KSerializer[]{sp.IAuthTabCallback(onAlipayJSBridgeReady.onExtraCallbackWithResult), BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, getWriggleLayout.onNavigationEvent};
        }
        int i3 = onExtraCallback + 105;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HandlerLocal.Telephone deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        HandlerLocal.RunOption runOption;
        EventLogLocal eventLogLocal;
        String strAsInterface;
        int i2 = 2 % 2;
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
            int i3 = 0;
            boolean z = true;
            EventLogLocal eventLogLocal3 = null;
            String strAsInterface2 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    eventLogLocal3 = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, onAlipayJSBridgeReady.onExtraCallbackWithResult, eventLogLocal3);
                    i3 |= 1;
                    int i4 = onWarmupCompleted + 123;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                } else if (iOnNavigationEvent != 1) {
                    int i6 = onWarmupCompleted + 23;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    if (iOnNavigationEvent != 2) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                    i3 |= 4;
                } else {
                    runOption2 = (HandlerLocal.RunOption) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, runOption2);
                    i3 |= 2;
                }
            }
            i = i3;
            runOption = runOption2;
            eventLogLocal = eventLogLocal3;
            strAsInterface = strAsInterface2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HandlerLocal.Telephone(i, eventLogLocal, runOption, strAsInterface, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m453deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HandlerLocal.Telephone telephone) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(telephone, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HandlerLocal.Telephone.onWarmupCompleted(telephone, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 71;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        serialize(encoder, (HandlerLocal.Telephone) obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 17;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 91;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
