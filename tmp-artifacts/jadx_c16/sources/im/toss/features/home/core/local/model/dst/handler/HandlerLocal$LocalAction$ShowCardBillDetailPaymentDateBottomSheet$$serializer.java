package im.toss.features.home.core.local.model.dst.handler;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
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
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BaseWorkerImplRenderReadyListener;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
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
public final /* synthetic */ class HandlerLocal$LocalAction$ShowCardBillDetailPaymentDateBottomSheet$$serializer implements aeu2<HandlerLocal.LocalAction.ShowCardBillDetailPaymentDateBottomSheet> {
    public static final HandlerLocal$LocalAction$ShowCardBillDetailPaymentDateBottomSheet$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static final byte[] $$a = {5, 64, Byte.MAX_VALUE, 81};
    private static final int $$b = 234;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, byte b) {
        int i2;
        int i3 = (b * 3) + 105;
        int i4 = (s * 2) + 4;
        int i5 = i * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            i3 += i6;
            i4++;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i4];
            i2++;
            i3 += i6;
            i4++;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 115;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 35124), 23 - ExpandableListView.getPackedPositionType(0L), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 10277, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - MotionEvent.axisFromString("")), 55 - View.getDefaultSize(0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2168, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            int i7 = $10 + 71;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i9 = $10 + 105;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12843), 56 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 2168, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static {
        onExtraCallbackWithResult = 1;
        IAuthTabCallback();
        HandlerLocal$LocalAction$ShowCardBillDetailPaymentDateBottomSheet$$serializer handlerLocal$LocalAction$ShowCardBillDetailPaymentDateBottomSheet$$serializer = new HandlerLocal$LocalAction$ShowCardBillDetailPaymentDateBottomSheet$$serializer();
        INSTANCE = handlerLocal$LocalAction$ShowCardBillDetailPaymentDateBottomSheet$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.handler.HandlerLocal.LocalAction.ShowCardBillDetailPaymentDateBottomSheet", handlerLocal$LocalAction$ShowCardBillDetailPaymentDateBottomSheet$$serializer, 4);
        setanimationsloop.onWarmupCompleted("eventLog", true);
        setanimationsloop.onWarmupCompleted("runOption", true);
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 4, TextUtils.getOffsetBefore("", 0) + 1, new char[]{6, 65533, 5, 65529}, true, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 173, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        Object[] objArr2 = new Object[1];
        a(View.resolveSize(0, 0) + 4, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2, new char[]{65531, 65534, 65531, 14}, true, KeyEvent.normalizeMetaState(0) + 171, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private HandlerLocal$LocalAction$ShowCardBillDetailPaymentDateBottomSheet$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(onAlipayJSBridgeReady.onExtraCallbackWithResult), BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, getWriggleLayout.onNavigationEvent, HandlerLocal$LocalAction$ShowCardBillDetailPaymentDateBottomSheet$Data$$serializer.INSTANCE};
        int i4 = IAuthTabCallback + 73;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HandlerLocal.LocalAction.ShowCardBillDetailPaymentDateBottomSheet deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        HandlerLocal.RunOption runOption;
        EventLogLocal eventLogLocal;
        HandlerLocal.LocalAction.ShowCardBillDetailPaymentDateBottomSheet.Data data;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        String strAsInterface = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = IAuthTabCallback + 71;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            EventLogLocal eventLogLocal2 = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, onAlipayJSBridgeReady.onExtraCallbackWithResult, (Object) null);
            HandlerLocal.RunOption runOption2 = (HandlerLocal.RunOption) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, (Object) null);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            HandlerLocal.LocalAction.ShowCardBillDetailPaymentDateBottomSheet.Data data2 = (HandlerLocal.LocalAction.ShowCardBillDetailPaymentDateBottomSheet.Data) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, HandlerLocal$LocalAction$ShowCardBillDetailPaymentDateBottomSheet$Data$$serializer.INSTANCE, (Object) null);
            int i5 = onNavigationEvent + 97;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            i = 15;
            eventLogLocal = eventLogLocal2;
            data = data2;
            runOption = runOption2;
            str = strAsInterface2;
        } else {
            int i7 = 0;
            boolean z = true;
            HandlerLocal.RunOption runOption3 = null;
            EventLogLocal eventLogLocal3 = null;
            HandlerLocal.LocalAction.ShowCardBillDetailPaymentDateBottomSheet.Data data3 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i8 = onNavigationEvent + 125;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    if (iOnNavigationEvent == 0) {
                        eventLogLocal3 = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, onAlipayJSBridgeReady.onExtraCallbackWithResult, eventLogLocal3);
                        i7 |= 1;
                    } else if (iOnNavigationEvent == 1) {
                        runOption3 = (HandlerLocal.RunOption) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, runOption3);
                        i7 |= 2;
                    } else if (iOnNavigationEvent == 2) {
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i7 |= 4;
                    } else {
                        if (iOnNavigationEvent != 3) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        data3 = (HandlerLocal.LocalAction.ShowCardBillDetailPaymentDateBottomSheet.Data) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, HandlerLocal$LocalAction$ShowCardBillDetailPaymentDateBottomSheet$Data$$serializer.INSTANCE, data3);
                        i7 |= 8;
                    }
                } else {
                    z = false;
                }
            }
            i = i7;
            str = strAsInterface;
            runOption = runOption3;
            eventLogLocal = eventLogLocal3;
            data = data3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HandlerLocal.LocalAction.ShowCardBillDetailPaymentDateBottomSheet(i, eventLogLocal, runOption, str, data, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m442deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            throw null;
        }
        HandlerLocal.LocalAction.ShowCardBillDetailPaymentDateBottomSheet showCardBillDetailPaymentDateBottomSheetDeserialize = deserialize(decoder);
        int i3 = IAuthTabCallback + 107;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return showCardBillDetailPaymentDateBottomSheetDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HandlerLocal.LocalAction.ShowCardBillDetailPaymentDateBottomSheet showCardBillDetailPaymentDateBottomSheet) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(showCardBillDetailPaymentDateBottomSheet, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            HandlerLocal.LocalAction.ShowCardBillDetailPaymentDateBottomSheet.onExtraCallback(showCardBillDetailPaymentDateBottomSheet, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(showCardBillDetailPaymentDateBottomSheet, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        HandlerLocal.LocalAction.ShowCardBillDetailPaymentDateBottomSheet.onExtraCallback(showCardBillDetailPaymentDateBottomSheet, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 82 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HandlerLocal.LocalAction.ShowCardBillDetailPaymentDateBottomSheet) obj);
        int i4 = IAuthTabCallback + 89;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = IAuthTabCallback + 81;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    static void IAuthTabCallback() {
        onExtraCallback = 478308972;
    }
}
