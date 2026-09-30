package im.toss.features.home.core.local.model.dst.handler;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.eventlog.EventLogLocal;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.widget.ButtonLocal;
import im.toss.features.home.core.local.model.dst.widget.ButtonLocal$;
import im.toss.features.home.core.local.model.dst.widget.ImageSourceLocal;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BaseWorkerImplRenderReadyListener;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.aeu2;
import o.getBgColor;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.okycx;
import o.onAlipayJSBridgeReady;
import o.removeNextStartHandler;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HandlerLocal$Toast$$serializer implements aeu2<HandlerLocal.Toast> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    public static final HandlerLocal$Toast$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int[] onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            serialDescriptor = descriptor;
            int i4 = 71 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i3 + 39;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onWarmupCompleted;
        int i5 = -1469660336;
        int i6 = 16;
        int i7 = 0;
        if (iArr3 != null) {
            int i8 = $10 + 19;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i9 = $10 + 83;
                $11 = i9 % 128;
                int i10 = i9 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i2])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> i6), 72 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 8848 - Color.blue(0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i2] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i2++;
                    i3 = 2;
                    i6 = 16;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onWarmupCompleted;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                try {
                    Object[] objArr3 = new Object[1];
                    objArr3[i7] = Integer.valueOf(iArr5[i11]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(i7, i7), 72 - (Process.myTid() >> 22), 8848 - Color.argb(i7, i7, i7, i7), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i11++;
                    i5 = -1469660336;
                    i7 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr5 = iArr6;
        }
        int i12 = i7;
        System.arraycopy(iArr5, i12, iArr4, i12, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i12;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i13 = $10 + 25;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i15 = 0;
            for (int i16 = 16; i15 < i16; i16 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i15];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - Color.alpha(0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 38, TextUtils.indexOf("", "", 0) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i15++;
            }
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i17;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4032 - ExpandableListView.getPackedPositionChild(0L)), 79 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 7398 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        onNavigationEvent();
        HandlerLocal$Toast$$serializer handlerLocal$Toast$$serializer = new HandlerLocal$Toast$$serializer();
        INSTANCE = handlerLocal$Toast$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.handler.HandlerLocal.Toast", handlerLocal$Toast$$serializer, 8);
        setanimationsloop.onWarmupCompleted("eventLog", true);
        setanimationsloop.onWarmupCompleted("runOption", true);
        Object[] objArr = new Object[1];
        a(new int[]{-1670280818, -482790671}, 4 - Color.alpha(0), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("logText", false);
        setanimationsloop.onWarmupCompleted("imageSource", false);
        Object[] objArr2 = new Object[1];
        a(new int[]{463510356, -227271830, -24166666, 846394392}, 6 - (ViewConfiguration.getTapTimeout() >> 16), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("timeInterval", false);
        setanimationsloop.onWarmupCompleted("isPersistentUntilDismissed", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 31;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private HandlerLocal$Toast$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(onAlipayJSBridgeReady.onExtraCallbackWithResult);
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, kSerializer, sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(removeNextStartHandler.onWarmupCompleted), sp.IAuthTabCallback(ButtonLocal$.serializer.INSTANCE), sp.IAuthTabCallback(getDynamicHeight.onWarmupCompleted), getBgColor.IAuthTabCallback};
        int i4 = onNavigationEvent + 67;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HandlerLocal.Toast deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        Integer num;
        HandlerLocal.RunOption runOption;
        String str;
        ImageSourceLocal imageSourceLocal;
        String str2;
        EventLogLocal eventLogLocal;
        boolean zOnExtraCallbackWithResult;
        ButtonLocal buttonLocal;
        char c;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 79;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i6 = 7;
        String str3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i7 = IAuthTabCallback + 121;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            eventLogLocal = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, onAlipayJSBridgeReady.onExtraCallbackWithResult, (Object) null);
            HandlerLocal.RunOption runOption2 = (HandlerLocal.RunOption) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, (Object) null);
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, (Object) null);
            ImageSourceLocal imageSourceLocal2 = (ImageSourceLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, removeNextStartHandler.onWarmupCompleted, (Object) null);
            ButtonLocal buttonLocal2 = (ButtonLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ButtonLocal$.serializer.INSTANCE, (Object) null);
            num = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getDynamicHeight.onWarmupCompleted, (Object) null);
            str = strAsInterface;
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7);
            runOption = runOption2;
            i = 255;
            buttonLocal = buttonLocal2;
            str2 = str4;
            imageSourceLocal = imageSourceLocal2;
        } else {
            boolean z = true;
            i = 0;
            boolean zOnExtraCallbackWithResult2 = false;
            String strAsInterface2 = null;
            ImageSourceLocal imageSourceLocal3 = null;
            EventLogLocal eventLogLocal2 = null;
            num = null;
            ButtonLocal buttonLocal3 = null;
            HandlerLocal.RunOption runOption3 = null;
            while (z) {
                int i9 = IAuthTabCallback + 23;
                onNavigationEvent = i9 % 128;
                if (i9 % i2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i2 = 2;
                        i6 = 7;
                    case 0:
                        eventLogLocal2 = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, onAlipayJSBridgeReady.onExtraCallbackWithResult, eventLogLocal2);
                        i |= 1;
                        i2 = 2;
                        i6 = 7;
                    case 1:
                        i |= 2;
                        runOption3 = (HandlerLocal.RunOption) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, runOption3);
                        i2 = 2;
                        i6 = 7;
                    case 2:
                        c = 3;
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i2);
                        i |= 4;
                        i6 = 7;
                    case 3:
                        c = 3;
                        str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str3);
                        i |= 8;
                        i6 = 7;
                    case 4:
                        imageSourceLocal3 = (ImageSourceLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, removeNextStartHandler.onWarmupCompleted, imageSourceLocal3);
                        i |= 16;
                    case 5:
                        buttonLocal3 = (ButtonLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ButtonLocal$.serializer.INSTANCE, buttonLocal3);
                        i |= 32;
                    case 6:
                        num = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getDynamicHeight.onWarmupCompleted, num);
                        i |= 64;
                    case 7:
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6);
                        i |= 128;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            runOption = runOption3;
            str = strAsInterface2;
            imageSourceLocal = imageSourceLocal3;
            str2 = str3;
            eventLogLocal = eventLogLocal2;
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
            buttonLocal = buttonLocal3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HandlerLocal.Toast(i, eventLogLocal, runOption, str, str2, imageSourceLocal, buttonLocal, num, zOnExtraCallbackWithResult, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m454deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HandlerLocal.Toast toast) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(toast, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HandlerLocal.Toast.onWarmupCompleted(toast, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 117;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HandlerLocal.Toast) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallback + 123;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 21 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 25;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    static void onNavigationEvent() {
        onWarmupCompleted = new int[]{-488995896, -1435666499, -1995679389, -11965582, 1829339503, -1156374959, 1756889727, 122937986, 292622590, -267546648, -260072051, -1320186843, -156209765, -194950453, -246643240, -1878607451, 200358085, 1602580903};
    }
}
