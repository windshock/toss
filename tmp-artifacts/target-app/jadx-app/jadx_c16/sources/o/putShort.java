package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.home.core.ui.compose.dst.ComposableSingletons$HomeImageKt$;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getThis;
import o.setHasWhiteScreen;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class putShort {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] IAuthTabCallback = null;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    public static final putShort onExtraCallback;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult = null;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent = null;
    private static int onTransact = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onTransact + 87;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 17;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onTransact + 121;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 31;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onExtraCallbackWithResult;
        int i5 = i2 + 37;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return function2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 43;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onNavigationEvent;
        int i4 = i2 + 85;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return function2;
    }

    static {
        onNavigationEvent();
        onExtraCallback = new putShort();
        onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(408143559, false, new ComposableSingletons$HomeImageKt$.ExternalSyntheticLambda0());
        onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(1228089628, false, new ComposableSingletons$HomeImageKt$.ExternalSyntheticLambda1());
        int i = asInterface + 1;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            int i2 = 26 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 125;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0 ? (i & 3) != 2 : (i & 2) != 5) {
            int i5 = i3 + 11;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                z = true;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            } else {
                int i6 = onTransact + 41;
                onWarmupCompleted = i6 % 128;
                Object obj = null;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.asBinder();
                    obj.hashCode();
                    throw null;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(408143559, i, -1, "im.toss.features.home.core.ui.compose.dst.ComposableSingletons$HomeImageKt.lambda$408143559.<anonymous> (HomeImage.kt:104)");
                }
                getThis.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = getThis.Companion.onNavigationEvent();
                List listEmptyList = CollectionsKt.emptyList();
                Object[] objArr = new Object[1];
                a(new int[]{-2141781521, -152451934, -1770389982, 1241760197, 756250622, 1883318729, -726856987, -1758245184, 2008616078, -879957489, 604615034, -1399139116, 1050968536, 615573035, 1519346511, -74074010, 947286383, -709784279, 667337635, 870349387, 1203233165, 768436252, -379679155, 864769065, 1402222565, 846661087, 1398666422, 363726566, -2027137640, 31623492}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 58, objArr);
                DefaultExtensionManager1.onNavigationEvent(new setInternal("preview-center", (ExecutorHelper) null, onextracallbackwithresultOnNavigationEvent, listEmptyList, new setHasWhiteScreen.IAuthTabCallback(((String) objArr[0]).intern(), (String) null, 1.0f, "Preview Image", false, 0, 16, (DefaultConstructorMarker) null), 48.0d, 48.0d, 0.0d, 24.0d, 24.0d, 0.0d, indexOf.CENTER), (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 2);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
            return Unit.INSTANCE;
        }
        int i7 = i3 + 49;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        z = false;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
        }
        return Unit.INSTANCE;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = IAuthTabCallback;
        int i3 = -1469660336;
        char c = '0';
        int i4 = 0;
        if (iArr3 != null) {
            int i5 = $10 + 111;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", c) + 1), 72 - View.resolveSizeAndState(0, 0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    int i7 = $11 + 9;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    i3 = -1469660336;
                    c = '0';
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
        int[] iArr5 = IAuthTabCallback;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                try {
                    Object[] objArr3 = new Object[1];
                    objArr3[i4] = Integer.valueOf(iArr5[i9]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - Process.getGidForName("")), 71 - TextUtils.indexOf((CharSequence) "", '0', i4, i4), TextUtils.indexOf((CharSequence) "", '0') + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i9++;
                    i4 = 0;
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
        int i10 = i4;
        System.arraycopy(iArr5, i10, iArr4, i10, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i10;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i11 = $10 + 31;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i13 = 0;
            while (i13 < 16) {
                int i14 = $10 + 125;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i13];
                    try {
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - View.MeasureSpec.getSize(0)), Color.argb(0, 0, 0, 0) + 39, 10302 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                        i13 += 52;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i13];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - TextUtils.getOffsetBefore("", 0)), 39 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 10302 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                    i13++;
                }
            }
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i15;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 4034), TextUtils.getOffsetBefore("", 0) + 78, Color.blue(0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static final Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onWarmupCompleted;
            int i4 = i3 + 115;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 113;
            onTransact = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 % 5;
            }
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i8 = onTransact + 75;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1228089628, i, -1, "im.toss.features.home.core.ui.compose.dst.ComposableSingletons$HomeImageKt.lambda$1228089628.<anonymous> (HomeImage.kt:133)");
            }
            getThis.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = getThis.Companion.onNavigationEvent();
            List listEmptyList = CollectionsKt.emptyList();
            Object[] objArr = new Object[1];
            a(new int[]{-2141781521, -152451934, -1770389982, 1241760197, 756250622, 1883318729, -726856987, -1758245184, 2008616078, -879957489, 604615034, -1399139116, 1050968536, 615573035, 1519346511, -74074010, 947286383, -709784279, 667337635, 870349387, 844357577, -727632246, 1743370207, -1340748491, -1358944249, 181091156, -375022206, 2013889218, 305608289, 180940387, -2027137640, 31623492}, 62 - Color.argb(0, 0, 0, 0), objArr);
            DefaultExtensionManager1.onNavigationEvent(new setInternal("preview-icon", (ExecutorHelper) null, onextracallbackwithresultOnNavigationEvent, listEmptyList, new setHasWhiteScreen.onExtraCallback(((String) objArr[0]).intern(), (String) null, 1.0f, 24.0d, 24.0d, "Arrow Icon", "icon-arrow", (String) null), 24.0d, 24.0d, 8.0d, 24.0d, 24.0d, 8.0d, indexOf.LEFT), (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    static void onNavigationEvent() {
        IAuthTabCallback = new int[]{-1013790160, -426455130, 468956977, -1496851046, -2037868299, -1134214460, -120629849, -1275608508, 335357157, -280271856, -562857429, 1171282979, 205084474, -958096012, 1612463093, 684752009, -1448564194, -308369251};
    }
}
