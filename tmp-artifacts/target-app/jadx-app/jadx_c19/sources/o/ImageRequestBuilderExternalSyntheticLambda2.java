package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.AUTextView;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.ImageRequestBuilderExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ImageRequestBuilderExternalSyntheticLambda2 {
    private static int IAuthTabCallback;
    private static char asBinder;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback;
    public static final ImageRequestBuilderExternalSyntheticLambda2 onExtraCallbackWithResult;
    private static long onNavigationEvent;
    private static int onTransact;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted;
    private static final byte[] $$a = {51, -39, 98, -44};
    private static final int $$b = 30;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 0;
    private static int IAuthTabCallbackStub = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, int i2) {
        int i3;
        int i4 = s * 2;
        int i5 = (s2 * 4) + 4;
        int i6 = 110 - i2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i4];
        int i7 = 0 - i4;
        if (bArr == null) {
            int i8 = i7;
            i3 = 0;
            i5++;
            i6 += i8;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i5];
            i3++;
            i5++;
            i6 += i8;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = asInterface + 71;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit interfaceDescriptor = getInterfaceDescriptor();
        int i5 = IAuthTabCallbackStub + 57;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return interfaceDescriptor;
    }

    public static /* synthetic */ Unit IAuthTabCallback() {
        int i2 = 2 % 2;
        int i3 = asInterface + 65;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i5 = asInterface + 59;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 5;
        asInterface = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, i2);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = IAuthTabCallbackStub + 73;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~i4;
        int i9 = ~(i8 | i7);
        int i10 = (~(i8 | i5)) | i9 | (~(i7 | i5));
        int i11 = (~((~i7) | i4)) | (~(i4 | i5));
        int i12 = (~((~i5) | i8)) | i9;
        int i13 = i4 + i7 + i6 + (1821889583 * i3) + ((-349070011) * i2);
        int i14 = i13 * i13;
        int i15 = (575745661 * i4) + 325058560 + (1920428227 * i7) + (i10 * 448227522) + ((-448227522) * i11) + (448227522 * i12) + (1472200704 * i6) + (473956352 * i3) + (1723858944 * i2) + ((-1436549120) * i14);
        int i16 = (i4 * 921699331) + 387174459 + (i7 * 921699517) + (i10 * 62) + (i11 * (-62)) + (i12 * 62) + (i6 * 921699455) + (i3 * 347275089) + (i2 * 1925323067) + (i14 * 94371840);
        return i15 + ((i16 * i16) * (-174063616)) != 1 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 59;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            onTransact();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnTransact = onTransact();
        int i4 = IAuthTabCallbackStub + 53;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 51;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i5 = IAuthTabCallbackStub + 67;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent() {
        int i2 = 2 % 2;
        int i3 = asInterface + 53;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub();
        if (i4 == 0) {
            int i5 = 98 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asInterface() {
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2;
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 33;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            function2 = onExtraCallback;
            int i5 = 5 / 0;
        } else {
            function2 = onExtraCallback;
        }
        int i6 = i3 + 37;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return function2;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2;
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 99;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            function2 = onWarmupCompleted;
            int i5 = 24 / 0;
        } else {
            function2 = onWarmupCompleted;
        }
        int i6 = i3 + 85;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return function2;
    }

    private static void a(char c, int i2, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i2));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i5 = $11 + 3;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i7 = $10 + 45;
            $11 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 43 - ExpandableListView.getPackedPositionGroup(0L), 1452 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43, Color.rgb(0, 0, 0) + 16778710, 1533236389, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23971 - ExpandableListView.getPackedPositionChild(0L)), 'b' - AndroidCharacter.getMirror('0'), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myTid() >> 22) + 45848), (ViewConfiguration.getScrollBarSize() >> 8) + 29, 12577 - (KeyEvent.getMaxKeyCode() >> 16), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (IAuthTabCallback ^ 7798559133331975163L)) ^ ((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (asBinder ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i3 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static {
        onTransact = 1;
        asBinder();
        onExtraCallbackWithResult = new ImageRequestBuilderExternalSyntheticLambda2();
        onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(351884337, false, new Function2() { // from class: im.toss.components.tuba.trigger.internal.ComposableSingletons$BottomSheetV2TriggerExecutorKt$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 59;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitIAuthTabCallback = ImageRequestBuilderExternalSyntheticLambda2.IAuthTabCallback((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                int i5 = onWarmupCompleted + 55;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return unitIAuthTabCallback;
            }
        });
        onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(1894194473, false, new Function2() { // from class: im.toss.components.tuba.trigger.internal.ComposableSingletons$BottomSheetV2TriggerExecutorKt$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 19;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {(CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
                int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
                int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
                Unit unit = (Unit) ImageRequestBuilderExternalSyntheticLambda2.onExtraCallback(AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), 1111281552, objArr, iOnExtraCallback, iOnExtraCallback2, -1111281551);
                int i5 = onNavigationEvent + 31;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 16 / 0;
                }
                return unit;
            }
        });
        int i2 = IAuthTabCallbackDefault + 25;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit IAuthTabCallbackStub() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 29;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = Unit.INSTANCE;
        int i5 = asInterface + 13;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit getInterfaceDescriptor() {
        int i2 = 2 % 2;
        int i3 = asInterface + 57;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = Unit.INSTANCE;
        if (i4 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 59;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
            int i6 = asInterface + 27;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = IAuthTabCallbackStub + 17;
                asInterface = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(351884337, i2, -1, "im.toss.components.tuba.trigger.internal.ComposableSingletons$BottomSheetV2TriggerExecutorKt.lambda$351884337.<anonymous> (BottomSheetV2TriggerExecutor.kt:431)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.components.tuba.trigger.internal.ComposableSingletons$BottomSheetV2TriggerExecutorKt$$ExternalSyntheticLambda2
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke() {
                        int i10 = 2 % 2;
                        int i11 = onNavigationEvent + 49;
                        onExtraCallbackWithResult = i11 % 128;
                        if (i11 % 2 == 0) {
                            return ImageRequestBuilderExternalSyntheticLambda2.onNavigationEvent();
                        }
                        ImageRequestBuilderExternalSyntheticLambda2.onNavigationEvent();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            Function0 function0 = (Function0) objOnMinimized;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new Function0() { // from class: im.toss.components.tuba.trigger.internal.ComposableSingletons$BottomSheetV2TriggerExecutorKt$$ExternalSyntheticLambda3
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke() {
                        int i10 = 2 % 2;
                        int i11 = IAuthTabCallback + 5;
                        onNavigationEvent = i11 % 128;
                        int i12 = i11 % 2;
                        Object[] objArr = new Object[0];
                        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
                        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
                        int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
                        int iOnExtraCallback4 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
                        if (i12 != 0) {
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        Unit unit = (Unit) ImageRequestBuilderExternalSyntheticLambda2.onExtraCallback(iOnExtraCallback4, iOnExtraCallback3, 584831378, objArr, iOnExtraCallback, iOnExtraCallback2, -584831378);
                        int i13 = onNavigationEvent + 63;
                        IAuthTabCallback = i13 % 128;
                        int i14 = i13 % 2;
                        return unit;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null);
            Object[] objArr = new Object[1];
            a((char) KeyEvent.getDeadChar(0, 0), (-1019927290) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), new char[]{3198, 56340, 6666, 24172, 45905, 2777, 17746, 49948, 55550, 45164, 15901, 47655, 36133, 36126, 63737, 10712, 26759, 8286, 12169, 14783, 29134, 50410, 60319, 58545, 62970, 27715, 6786, 54042, 53557, 40333, 23161, 23777, 30914, 39036, 20786, 52229, 28707, 20456, 10287, 48049, 50388, 16915, 37151, 57356, 34503, 3340, 57718, 57849, 19854, 27022, 46510, 25681, 2275, 64089, 36294, 43735, 55520, 39124, 12911}, new char[]{0, 0, 0, 0}, new char[]{1501, 13605, 31683, 13045}, objArr);
            OkHttpNetworkFetcherExternalSyntheticLambda6.onWarmupCompleted("최신 버전의 앱이 필요해요", "안전한 송금을 위해 업데이트 된 기능이 있어요. 앱을 계속 쓰려면 최신 버전이 필요해요.", ((String) objArr[0]).intern(), 60, "업데이트 하기", "나중에", function0, (Function0) objOnMinimized2, quirksExternalSyntheticBackport0OnExtraCallback, cameraCaptureResultEmptyCameraCaptureResult, 14380470, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i10 = asInterface + 115;
        IAuthTabCallbackStub = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 94 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 35;
        asInterface = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i4 = asInterface + 43;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onTransact() {
        int i2 = 2 % 2;
        int i3 = asInterface + 109;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallbackStub + 67;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1894194473, i2, -1, "im.toss.components.tuba.trigger.internal.ComposableSingletons$BottomSheetV2TriggerExecutorKt.lambda$1894194473.<anonymous> (BottomSheetV2TriggerExecutor.kt:449)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.components.tuba.trigger.internal.ComposableSingletons$BottomSheetV2TriggerExecutorKt$$ExternalSyntheticLambda4
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke() {
                        int i4 = 2 % 2;
                        int i5 = onWarmupCompleted + 111;
                        onExtraCallback = i5 % 128;
                        int i6 = i5 % 2;
                        Unit unitIAuthTabCallback = ImageRequestBuilderExternalSyntheticLambda2.IAuthTabCallback();
                        int i7 = onWarmupCompleted + 101;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        return unitIAuthTabCallback;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                int i4 = asInterface + 107;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
            }
            Function0 function0 = (Function0) objOnMinimized;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new Function0() { // from class: im.toss.components.tuba.trigger.internal.ComposableSingletons$BottomSheetV2TriggerExecutorKt$$ExternalSyntheticLambda5
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        int i6 = 2 % 2;
                        int i7 = onExtraCallback + 99;
                        onWarmupCompleted = i7 % 128;
                        int i8 = i7 % 2;
                        Unit unitOnExtraCallbackWithResult = ImageRequestBuilderExternalSyntheticLambda2.onExtraCallbackWithResult();
                        int i9 = onExtraCallback + 117;
                        onWarmupCompleted = i9 % 128;
                        int i10 = i9 % 2;
                        return unitOnExtraCallbackWithResult;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null);
            Object[] objArr = new Object[1];
            a((char) (Process.myPid() >> 22), ViewConfiguration.getTapTimeout() >> 16, new char[]{44646, 26810, 38315, 28547, 6899, 55630, 59021, 54208, 62038, 39086, 10247, 1826, 25100, 36620, 64998, 33359, 65118, 48117, 35875, 28119, 15190, 14168, 8347, 55500, 28904, 12255, 48100, 42164, 36462, 9146, 16035, 57643, 4181, 31429, 19209, 9611, 31455, 34188, 27425, 42809, 49077, 33013, 32348, 31008, 57127, 3928, 43028, 48483, 20644, 41010, 13483, 11925, 39164, 59471, 44683, 33773, 64553, 57111, 4380, 58858, 45939, 49746}, new char[]{0, 0, 0, 0}, new char[]{6450, 29446, 8531, 18364}, objArr);
            OkHttpNetworkFetcherExternalSyntheticLambda6.onWarmupCompleted("5년동안 쓴\n현금 영수증이 도착했어요", (String) null, ((String) objArr[0]).intern(), 100, "확인하고 돌려받기", "7일 동안 안보기", function0, (Function0) objOnMinimized2, quirksExternalSyntheticBackport0OnExtraCallback, cameraCaptureResultEmptyCameraCaptureResult, 14380470, 0);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i6 = IAuthTabCallbackStub + 113;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallback() {
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        return (Unit) onExtraCallback(AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback3, 584831378, new Object[0], iOnExtraCallback, iOnExtraCallback2, -584831378);
    }

    public static /* synthetic */ Unit onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        return (Unit) onExtraCallback(AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), 1111281552, objArr, iOnExtraCallback, iOnExtraCallback2, -1111281551);
    }

    static void asBinder() {
        onNavigationEvent = 7798559133331975163L;
        IAuthTabCallback = -1776194565;
        asBinder = (char) 58661;
    }
}
