package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import im.toss.features.home.core.ui.compose.dst.ComposableSingletons$HomeButtonsHorizontalKt$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import o.getThis;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class writeStringArray2 {
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback;
    private static char IAuthTabCallbackDefault;
    private static int asBinder;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback;
    private static long onExtraCallbackWithResult;
    private static int onNavigationEvent;
    public static final writeStringArray2 onWarmupCompleted;
    private static final byte[] $$a = {102, 12, 98, 84};
    private static final int $$b = 10;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, int i) {
        int i2;
        int i3 = 110 - i;
        byte[] bArr = $$a;
        int i4 = (s * 3) + 4;
        int i5 = b * 2;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i4;
            i3 = i6;
            i2 = 0;
            i4++;
            i3 += -i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i4];
            i2++;
            i4++;
            i3 += -i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asInterface + 25;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = asInterface + 65;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asInterface + 73;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 29;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onExtraCallback;
        int i4 = i3 + 125;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return function2;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 47;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        asBinder = 1;
        onNavigationEvent();
        onWarmupCompleted = new writeStringArray2();
        IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(217252709, false, new ComposableSingletons$HomeButtonsHorizontalKt$.ExternalSyntheticLambda0());
        onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(1344716266, false, new ComposableSingletons$HomeButtonsHorizontalKt$.ExternalSyntheticLambda1());
        int i = onTransact + 99;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
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
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i5 = $10 + 93;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i7 = $10 + 67;
            $11 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 43 - Gravity.getAbsoluteGravity(0, 0), TextUtils.getCapsMode("", 0, 0) + 1451, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49171 - AndroidCharacter.getMirror('0')), (ViewConfiguration.getTouchSlop() >> 8) + 44, 1494 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1533236389, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 23972), 50 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Color.alpha(0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                i2 = 2;
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - Color.blue(0)), 29 - (Process.myTid() >> 22), TextUtils.lastIndexOf("", '0', 0, 0) + 12578, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            } else {
                                i2 = 2;
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallbackDefault ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            i3 = i2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static final Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        Object obj = null;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = asInterface + 113;
                IAuthTabCallbackStub = i3 % 128;
                if (i3 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(217252709, i, -1, "im.toss.features.home.core.ui.compose.dst.ComposableSingletons$HomeButtonsHorizontalKt.lambda$217252709.<anonymous> (HomeButtonsHorizontal.kt:107)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(217252709, i, -1, "im.toss.features.home.core.ui.compose.dst.ComposableSingletons$HomeButtonsHorizontalKt.lambda$217252709.<anonymous> (HomeButtonsHorizontal.kt:107)");
            }
            getThis.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = getThis.Companion.onNavigationEvent();
            List listEmptyList = CollectionsKt.emptyList();
            Object[] objArr = new Object[1];
            a((char) (39877 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0') + 1, new char[]{8361, 15256}, new char[]{0, 0, 0, 0}, new char[]{34878, 7874, 50350, 14235}, objArr);
            AccessControlException accessControlExceptionIAuthTabCallback = asyncInterceptJsapi.IAuthTabCallback(((String) objArr[0]).intern(), false, 1, (Object) null);
            TdsButtonV1View.IAuthTabCallbackStub iAuthTabCallbackStub = TdsButtonV1View.IAuthTabCallbackStub.PRIMARY;
            TdsButtonV1View.IAuthTabCallbackDefault iAuthTabCallbackDefault = TdsButtonV1View.IAuthTabCallbackDefault.FILL;
            TdsButtonV1View.onWarmupCompleted onwarmupcompleted = TdsButtonV1View.onWarmupCompleted.LARGE;
            Object[] objArr2 = new Object[1];
            a((char) (65361 - Process.getGidForName("")), 96943357 - TextUtils.indexOf("", "", 0, 0), new char[]{64761}, new char[]{0, 0, 0, 0}, new char[]{64943, 51004, 20997, 40447}, objArr2);
            getIgnoreErrorResourceHostList getignoreerrorresourcehostlist = new getIgnoreErrorResourceHostList(((String) objArr2[0]).intern(), (ExecutorHelper) null, accessControlExceptionIAuthTabCallback, (String) null, iAuthTabCallbackStub, iAuthTabCallbackDefault, onwarmupcompleted, (fillData) null, true);
            AccessControlException accessControlExceptionIAuthTabCallback2 = asyncInterceptJsapi.IAuthTabCallback("취소", false, 1, (Object) null);
            TdsButtonV1View.IAuthTabCallbackStub iAuthTabCallbackStub2 = TdsButtonV1View.IAuthTabCallbackStub.DARK;
            TdsButtonV1View.IAuthTabCallbackDefault iAuthTabCallbackDefault2 = TdsButtonV1View.IAuthTabCallbackDefault.WEAK;
            Object[] objArr3 = new Object[1];
            a((char) (MotionEvent.axisFromString("") + 62654), (ViewConfiguration.getTouchSlop() >> 8) - 1021171573, new char[]{15160}, new char[]{0, 0, 0, 0}, new char[]{35682, 8744, 48579, 19444}, objArr3);
            getBridgeDSLRegistry.onNavigationEvent(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{new loadUrl("preview", (ExecutorHelper) null, onextracallbackwithresultOnNavigationEvent, listEmptyList, getignoreerrorresourcehostlist, new getIgnoreErrorResourceHostList(((String) objArr3[0]).intern(), (ExecutorHelper) null, accessControlExceptionIAuthTabCallback2, (String) null, iAuthTabCallbackStub2, iAuthTabCallbackDefault2, onwarmupcompleted, (fillData) null, true), (String) null, new offer(24.0f, 24.0f, 0.0f, 0.0f)), null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 432, 8}, 959109338, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -959109336);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = asInterface + 19;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i5 = asInterface + 15;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = asInterface + 113;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            int i5 = asInterface + 123;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1344716266, i, -1, "im.toss.features.home.core.ui.compose.dst.ComposableSingletons$HomeButtonsHorizontalKt.lambda$1344716266.<anonymous> (HomeButtonsHorizontal.kt:153)");
            }
            getThis.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = getThis.Companion.onNavigationEvent();
            List listEmptyList = CollectionsKt.emptyList();
            Object[] objArr = new Object[1];
            a((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 39875), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, new char[]{8361, 15256}, new char[]{0, 0, 0, 0}, new char[]{34878, 7874, 50350, 14235}, objArr);
            AccessControlException accessControlExceptionIAuthTabCallback = asyncInterceptJsapi.IAuthTabCallback(((String) objArr[0]).intern(), false, 1, (Object) null);
            TdsButtonV1View.IAuthTabCallbackStub iAuthTabCallbackStub = TdsButtonV1View.IAuthTabCallbackStub.PRIMARY;
            TdsButtonV1View.IAuthTabCallbackDefault iAuthTabCallbackDefault = TdsButtonV1View.IAuthTabCallbackDefault.FILL;
            TdsButtonV1View.onWarmupCompleted onwarmupcompleted = TdsButtonV1View.onWarmupCompleted.LARGE;
            Object[] objArr2 = new Object[1];
            a((char) (65362 - (ViewConfiguration.getPressedStateDuration() >> 16)), 96943357 - (ViewConfiguration.getWindowTouchSlop() >> 8), new char[]{64761}, new char[]{0, 0, 0, 0}, new char[]{64943, 51004, 20997, 40447}, objArr2);
            getBridgeDSLRegistry.onNavigationEvent(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{new loadUrl("preview-single", (ExecutorHelper) null, onextracallbackwithresultOnNavigationEvent, listEmptyList, new getIgnoreErrorResourceHostList(((String) objArr2[0]).intern(), (ExecutorHelper) null, accessControlExceptionIAuthTabCallback, (String) null, iAuthTabCallbackStub, iAuthTabCallbackDefault, onwarmupcompleted, (fillData) null, true), (getIgnoreErrorResourceHostList) null, (String) null, new offer(24.0f, 24.0f, 0.0f, 0.0f)), null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 432, 8}, 959109338, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -959109336);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i6 = IAuthTabCallbackStub + 75;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
        }
        return Unit.INSTANCE;
    }

    static void onNavigationEvent() {
        onExtraCallbackWithResult = 7798559133331975163L;
        onNavigationEvent = -1776194565;
        IAuthTabCallbackDefault = (char) 48674;
    }
}
