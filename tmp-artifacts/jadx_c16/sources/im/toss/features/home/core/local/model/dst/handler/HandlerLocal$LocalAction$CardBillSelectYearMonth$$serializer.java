package im.toss.features.home.core.local.model.dst.handler;

import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.eventlog.EventLogLocal;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
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
public final /* synthetic */ class HandlerLocal$LocalAction$CardBillSelectYearMonth$$serializer implements aeu2<HandlerLocal.LocalAction.CardBillSelectYearMonth> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    public static final HandlerLocal$LocalAction$CardBillSelectYearMonth$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static long onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 21;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 31;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $10 + 99;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = $10 + 3;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 24 - View.resolveSize(0, 0), 19627 - KeyEvent.getDeadChar(0, 0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() % (onExtraCallbackWithResult & 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 60 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), 24 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 19628, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i7] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
                    Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 58, 6383 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), View.MeasureSpec.getMode(0) + 59, ExpandableListView.getPackedPositionGroup(0L) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            int i8 = $11 + 15;
            $10 = i8 % 128;
            int i9 = i8 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    static {
        onNavigationEvent();
        HandlerLocal$LocalAction$CardBillSelectYearMonth$$serializer handlerLocal$LocalAction$CardBillSelectYearMonth$$serializer = new HandlerLocal$LocalAction$CardBillSelectYearMonth$$serializer();
        INSTANCE = handlerLocal$LocalAction$CardBillSelectYearMonth$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.handler.HandlerLocal.LocalAction.CardBillSelectYearMonth", handlerLocal$LocalAction$CardBillSelectYearMonth$$serializer, 4);
        setanimationsloop.onWarmupCompleted("eventLog", true);
        setanimationsloop.onWarmupCompleted("runOption", true);
        Object[] objArr = new Object[1];
        a(new char[]{34384, 38152, 41213, 48222}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 4950, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        Object[] objArr2 = new Object[1];
        a(new char[]{34394, 4434, 43088, 17272}, 38669 - ExpandableListView.getPackedPositionGroup(0L), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 97;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private HandlerLocal$LocalAction$CardBillSelectYearMonth$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(onAlipayJSBridgeReady.onExtraCallbackWithResult), BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, getWriggleLayout.onNavigationEvent, HandlerLocal$LocalAction$CardBillSelectYearMonth$Data$$serializer.INSTANCE};
        int i4 = onNavigationEvent + 97;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005b A[PHI: r1 r14
      0x005b: PHI (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0034, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x005b: PHI (r14v5 o.yw) = (r14v1 o.yw), (r14v7 o.yw) binds: [B:8:0x0034, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036 A[PHI: r1 r14
      0x0036: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0034, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0036: PHI (r14v2 o.yw) = (r14v1 o.yw), (r14v7 o.yw) binds: [B:8:0x0034, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HandlerLocal.LocalAction.CardBillSelectYearMonth deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        EventLogLocal eventLogLocal;
        int i;
        HandlerLocal.LocalAction.CardBillSelectYearMonth.Data data;
        HandlerLocal.RunOption runOption;
        String str;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 79;
        onExtraCallback = i3 % 128;
        String strAsInterface = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            int i4 = 15 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                EventLogLocal eventLogLocal2 = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, onAlipayJSBridgeReady.onExtraCallbackWithResult, (Object) null);
                HandlerLocal.RunOption runOption2 = (HandlerLocal.RunOption) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, (Object) null);
                String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                eventLogLocal = eventLogLocal2;
                i = 15;
                data = (HandlerLocal.LocalAction.CardBillSelectYearMonth.Data) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, HandlerLocal$LocalAction$CardBillSelectYearMonth$Data$$serializer.INSTANCE, (Object) null);
                runOption = runOption2;
                str = strAsInterface2;
            } else {
                boolean z = true;
                i = 0;
                HandlerLocal.RunOption runOption3 = null;
                eventLogLocal = null;
                HandlerLocal.LocalAction.CardBillSelectYearMonth.Data data2 = null;
                while (z) {
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent == 0) {
                        eventLogLocal = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, onAlipayJSBridgeReady.onExtraCallbackWithResult, eventLogLocal);
                        i |= 1;
                        int i5 = onExtraCallback + 87;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                    } else if (iOnNavigationEvent == 1) {
                        runOption3 = (HandlerLocal.RunOption) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, runOption3);
                        i |= 2;
                    } else if (iOnNavigationEvent == 2) {
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i |= 4;
                    } else {
                        if (iOnNavigationEvent != 3) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i7 = onExtraCallback + 103;
                        onNavigationEvent = i7 % 128;
                        if (i7 % 2 == 0) {
                            data2 = (HandlerLocal.LocalAction.CardBillSelectYearMonth.Data) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, HandlerLocal$LocalAction$CardBillSelectYearMonth$Data$$serializer.INSTANCE, data2);
                            i |= 3;
                        } else {
                            data2 = (HandlerLocal.LocalAction.CardBillSelectYearMonth.Data) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, HandlerLocal$LocalAction$CardBillSelectYearMonth$Data$$serializer.INSTANCE, data2);
                            i |= 8;
                        }
                    }
                }
                str = strAsInterface;
                runOption = runOption3;
                data = data2;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HandlerLocal.LocalAction.CardBillSelectYearMonth(i, eventLogLocal, runOption, str, data, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m433deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HandlerLocal.LocalAction.CardBillSelectYearMonth cardBillSelectYearMonth) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(cardBillSelectYearMonth, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            HandlerLocal.LocalAction.CardBillSelectYearMonth.onWarmupCompleted(cardBillSelectYearMonth, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(cardBillSelectYearMonth, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        HandlerLocal.LocalAction.CardBillSelectYearMonth.onWarmupCompleted(cardBillSelectYearMonth, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onNavigationEvent + 45;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HandlerLocal.LocalAction.CardBillSelectYearMonth) obj);
        int i4 = onExtraCallback + 75;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 47;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    static void onNavigationEvent() {
        onExtraCallbackWithResult = 3347995029788951305L;
    }
}
