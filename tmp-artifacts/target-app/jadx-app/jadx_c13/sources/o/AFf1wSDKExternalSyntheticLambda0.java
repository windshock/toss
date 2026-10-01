package o;

import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.tmoney.a;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tosssecurities.core.currency.domain.Currency;
import im.toss.tosssecurities.uikit.compound.toggle.TossSecCurrencyToggleKt$;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AFf1wSDKExternalSyntheticLambda0;
import o.AFf1zSDKAFa1vSDK;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFf1wSDKExternalSyntheticLambda0 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] onExtraCallback = {1348647304, 1902697836, -180985402, 278150870, -1880250319, -1453359415, 1390577417, 1365554710, 314247764, 1135411920, 461119990, 285222027, -1920470890, 150444818, -161373979, -2120483285, 246737270, -1679264945};
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public static final /* synthetic */ class IAuthTabCallback {
        private static int onExtraCallback = 1;
        public static final /* synthetic */ int[] onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[Currency.values().length];
            try {
                iArr[Currency.USD.ordinal()] = 1;
                int i = onExtraCallback + 53;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Currency.KRW.ordinal()] = 2;
                int i4 = onExtraCallback + 109;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            onNavigationEvent = iArr;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Currency currency) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
        Unit unit = (Unit) onExtraCallbackWithResult(a.3.onWarmupCompleted(), 1180963954, iOnWarmupCompleted3, iOnWarmupCompleted2, new Object[]{currency}, -1180963951, iOnWarmupCompleted);
        int i4 = onNavigationEvent + 65;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Currency onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent();
        }
        onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        }
        onWarmupCompleted(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        throw null;
    }

    public static /* synthetic */ String onExtraCallback(List list, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String strOnWarmupCompleted = onWarmupCompleted(list, i);
        int i5 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return strOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(AFf1zSDKAFa1vSDK aFf1zSDKAFa1vSDK, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, List list, Function0 function0, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallback(aFf1zSDKAFa1vSDK, quirksExternalSyntheticBackport0, z, list, function0, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Currency onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted();
        }
        onWarmupCompleted();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i2;
        int i9 = i7 | i8;
        int i10 = ~(i9 | i6);
        int i11 = ~i6;
        int i12 = (~(i7 | i2)) | (~(i8 | i11)) | (~(i8 | i5));
        int i13 = ~(i11 | i9);
        int i14 = i5 + i2 + i4 + (1938118820 * i3) + ((-1869228383) * i);
        int i15 = i14 * i14;
        int i16 = (i5 * (-1046486968)) + 2037645312 + ((-1046486968) * i2) + (1604861810 * i10) + (i12 * (-1345052743)) + ((-1345052743) * i13) + (1903427584 * i4) + ((-1907359744) * i3) + (1374945280 * i) + (1516044288 * i15);
        int i17 = ((i5 * 647972376) - 1941852458) + (i2 * 647972376) + (i10 * 1702) + (i12 * 851) + (i13 * 851) + (i4 * 647973227) + (i3 * (-1260466036)) + (i * 1557372491) + (i15 * 1239351296);
        int i18 = i16 + (i17 * i17 * 490405888);
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : onExtraCallback(objArr);
    }

    private static final Unit onExtraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            i |= 1;
        }
        onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i));
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Currency currency) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(currency);
        int i4 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        List list = (List) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        AFf1zSDKAFa1vSDK aFf1zSDKAFa1vSDK = (AFf1zSDKAFa1vSDK) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        boolean zBooleanValue2 = ((Boolean) objArr[4]).booleanValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue2 = ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(list, zBooleanValue, aFf1zSDKAFa1vSDK, iIntValue, zBooleanValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        }
        onNavigationEvent(list, zBooleanValue, aFf1zSDKAFa1vSDK, iIntValue, zBooleanValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        AFf1zSDKAFa1vSDK aFf1zSDKAFa1vSDK = (AFf1zSDKAFa1vSDK) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        List list = (List) objArr[3];
        Function0 function0 = (Function0) objArr[4];
        Function1 function1 = (Function1) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int iIntValue2 = ((Number) objArr[7]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        int iIntValue3 = ((Number) objArr[9]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(aFf1zSDKAFa1vSDK, quirksExternalSyntheticBackport0, zBooleanValue, list, function0, function1, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        }
        onExtraCallback(aFf1zSDKAFa1vSDK, quirksExternalSyntheticBackport0, zBooleanValue, list, function0, function1, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 21;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, List list, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return IAuthTabCallback(function1, list, i);
        }
        IAuthTabCallback(function1, list, i);
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onExtraCallback;
        int i4 = -1469660336;
        int i5 = 0;
        if (iArr2 != null) {
            int i6 = $10 + 45;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 119;
                $10 = i9 % 128;
                if (i9 % i2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), 72 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i8] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i8])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 1), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0) + 72, (ViewConfiguration.getEdgeSlop() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i8++;
                }
                i2 = 2;
            }
            int i10 = $10 + 101;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onExtraCallback;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                Object[] objArr4 = new Object[1];
                objArr4[i5] = Integer.valueOf(iArr5[i12]);
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (ViewConfiguration.getFadingEdgeLength() >> 16) + 72, 8848 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i12] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                i12++;
                i4 = -1469660336;
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        int i13 = i5;
        System.arraycopy(iArr5, i13, iArr4, i13, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i13;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i13] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                int i16 = $10 + 79;
                $11 = i16 % 128;
                if (i16 % 2 == 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                    try {
                        Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22251 - MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 39, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10300, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                        i14 += 52;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                    Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 38, 10300 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                    i14++;
                }
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
            Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4032 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0')), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 78, AndroidCharacter.getMirror('0') + 7350, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
            i13 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static final Unit IAuthTabCallback(Function1 function1, List list, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        function1.invoke(list.get(i));
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallbackWithResult + 77;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 44 / 0;
        }
        return unit;
    }

    private static final String onWarmupCompleted(List list, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = IAuthTabCallback.onNavigationEvent[((Currency) list.get(i)).ordinal()];
        if (i5 == 1) {
            return "달러";
        }
        int i6 = onExtraCallbackWithResult;
        int i7 = i6 + 39;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0 ? i5 != 2 : i5 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int i8 = i6 + 105;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 == 0) {
            return "원";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(List list, boolean z, AFf1zSDKAFa1vSDK aFf1zSDKAFa1vSDK, int i, boolean z2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3;
        verifyClientState verifyclientstateOnWarmupCompleted;
        long jOnUnminimized;
        int i4 = 2 % 2;
        if ((i2 & 6) == 0) {
            i3 = i2 | (!cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z2) ? 32 : 16;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 147) != 146, i3 & 1)) {
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallbackWithResult + 77;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1281982316, i3, -1, "im.toss.tosssecurities.uikit.compound.toggle.TossSecCurrencyToggle.<anonymous> (TossSecCurrencyToggle.kt:181)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1281982316, i3, -1, "im.toss.tosssecurities.uikit.compound.toggle.TossSecCurrencyToggle.<anonymous> (TossSecCurrencyToggle.kt:181)");
            }
            Currency currency = (Currency) CollectionsKt___CollectionsKt.getOrNull(list, i);
            if (currency == null) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                return Unit.INSTANCE;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, aFf1zSDKAFa1vSDK.m153getTogglePaddingD9Ej5fM()).onExtraCallback(z ? ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0.Companion, aFf1zSDKAFa1vSDK.m152getIconSizeD9Ej5fM()) : FocusMeteringControlExternalSyntheticLambda2.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, 1.0f, false, 2, (Object) null));
            int i6 = IAuthTabCallback.onNavigationEvent[currency.ordinal()];
            if (i6 != 1) {
                int i7 = onNavigationEvent + 47;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Object[] objArr = new Object[1];
                a(new int[]{-92041088, 2081056004, -2110856498, -429980769, -2075489534, -870912531, -424630839, 154985555, -1046766163, -308883610, 944731252, 545968302, -953500633, -523467555, 987495006, -448894104, -365174461, 37981194, -1594191098, -427470898, -193515054, -1886685656, 2075971402, -346378967, -1391689220, 522702888, 32883452, -661972357, -1717788476, 45148522}, 60 - KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET), objArr);
                verifyclientstateOnWarmupCompleted = deprecated_authenticator.onWarmupCompleted(((String) objArr[0]).intern());
            } else {
                Object[] objArr2 = new Object[1];
                a(new int[]{-92041088, 2081056004, -2110856498, -429980769, -2075489534, -870912531, -424630839, 154985555, -1046766163, -308883610, 944731252, 545968302, -953500633, -523467555, 987495006, -448894104, -365174461, 37981194, -1594191098, -427470898, 1692662724, -340656679, -2005579123, 1688530029, -397588746, 1090478214, 171344744, -1375937327, -979551841, -669223394, 2086891273, 1088038105}, 63 - View.MeasureSpec.getSize(0), objArr2);
                verifyclientstateOnWarmupCompleted = deprecated_authenticator.onWarmupCompleted(((String) objArr2[0]).intern());
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(670629648);
            if (z2) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(670630523);
                jOnUnminimized = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable();
            } else {
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(670632315);
                    jOnUnminimized = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(670633275);
                    jOnUnminimized = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onUnminimized();
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            AppLovinNativeAdImplc.IAuthTabCallback(verifyclientstateOnWarmupCompleted, quirksExternalSyntheticBackport0OnExtraCallback, jOnUnminimized, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 504);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i9 = onExtraCallbackWithResult + 125;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[PHI: r0
      0x004f: PHI (r0v6 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v7 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x003e, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040 A[PHI: r0
      0x0040: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v7 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x003e, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@NotNull final AFf1zSDKAFa1vSDK aFf1zSDKAFa1vSDK, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, @Nullable List<? extends Currency> list, @NotNull final Function0<? extends Currency> function0, @NotNull final Function1<? super Currency, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7;
        List<? extends Currency> list2;
        boolean z3;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final boolean z4;
        final List<? extends Currency> list3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        boolean z5;
        int i8 = 2 % 2;
        int i9 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i9 % 128;
        if (i9 % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFf1zSDKAFa1vSDK, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function1, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1672988917);
            if ((i & 123) == 0) {
                i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(aFf1zSDKAFa1vSDK.ordinal()) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(aFf1zSDKAFa1vSDK, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function1, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1672988917);
            if ((i & 6) == 0) {
            }
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                    int i11 = onExtraCallbackWithResult + 5;
                    onNavigationEvent = i11 % 128;
                    int i12 = i11 % 2;
                    i4 = 32;
                } else {
                    i4 = 16;
                }
                i3 |= i4;
            }
            i5 = i2 & 4;
            if (i5 == 0) {
                int i13 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
                onExtraCallbackWithResult = i13 % 128;
                i3 = i13 % 2 == 0 ? i3 | 6489 : i3 | 384;
            } else {
                if ((i & 384) == 0) {
                    int i14 = onExtraCallbackWithResult + 91;
                    onNavigationEvent = i14 % 128;
                    int i15 = i14 % 2;
                    z2 = z;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2)) {
                        i6 = 256;
                    } else {
                        int i16 = onNavigationEvent + 45;
                        onExtraCallbackWithResult = i16 % 128;
                        int i17 = i16 % 2;
                        i6 = 128;
                    }
                    i3 |= i6;
                }
                i7 = i2 & 8;
                if (i7 == 0) {
                    if ((i & 3072) == 0) {
                        list2 = list;
                        i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list2) ? 2048 : 1024;
                    }
                    Object obj = null;
                    if ((i & 24576) == 0) {
                        int i18 = onExtraCallbackWithResult + 93;
                        onNavigationEvent = i18 % 128;
                        if (i18 % 2 != 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0);
                            obj.hashCode();
                            throw null;
                        }
                        i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : TTHistoryActivity2.SIZE;
                    }
                    if ((196608 & i) == 0) {
                        i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? Imgproc.FLOODFILL_MASK_ONLY : Imgproc.FLOODFILL_FIXED_RANGE;
                    }
                    boolean z6 = false;
                    if ((74899 & i3) == 74898) {
                        int i19 = onNavigationEvent + 75;
                        onExtraCallbackWithResult = i19 % 128;
                        int i20 = i19 % 2;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i3 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                        z4 = z2;
                        list3 = list2;
                    } else {
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i10 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                        final boolean z7 = i5 != 0 ? true : z2;
                        final List<? extends Currency> listListOf = i7 != 0 ? CollectionsKt__CollectionsKt.listOf((Object[]) new Currency[]{Currency.USD, Currency.KRW}) : list2;
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1672988917, i3, -1, "im.toss.tosssecurities.uikit.compound.toggle.TossSecCurrencyToggle (TossSecCurrencyToggle.kt:162)");
                        }
                        int iIndexOf = listListOf.indexOf(function0.invoke());
                        float fM151getBackgroundRadiusD9Ej5fM = aFf1zSDKAFa1vSDK.m151getBackgroundRadiusD9Ej5fM();
                        float fM154getToggleRadiusD9Ej5fM = aFf1zSDKAFa1vSDK.m154getToggleRadiusD9Ej5fM();
                        boolean z8 = (458752 & i3) == 131072;
                        int i21 = i3 & 7168;
                        if (i21 == 2048) {
                            int i22 = onExtraCallbackWithResult + 123;
                            onNavigationEvent = i22 % 128;
                            int i23 = i22 % 2;
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if ((z5 | z8) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized = new Function1() { // from class: im.toss.tosssecurities.uikit.compound.toggle.TossSecCurrencyToggleKt$$ExternalSyntheticLambda6
                                private static int onExtraCallbackWithResult = 0;
                                private static int onWarmupCompleted = 1;

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    int i24 = 2 % 2;
                                    int i25 = onExtraCallbackWithResult + 87;
                                    onWarmupCompleted = i25 % 128;
                                    if (i25 % 2 == 0) {
                                        AFf1wSDKExternalSyntheticLambda0.onWarmupCompleted(function1, listListOf, ((Integer) obj2).intValue());
                                        Object obj3 = null;
                                        obj3.hashCode();
                                        throw null;
                                    }
                                    Unit unitOnWarmupCompleted = AFf1wSDKExternalSyntheticLambda0.onWarmupCompleted(function1, listListOf, ((Integer) obj2).intValue());
                                    int i26 = onExtraCallbackWithResult + 67;
                                    onWarmupCompleted = i26 % 128;
                                    int i27 = i26 % 2;
                                    return unitOnWarmupCompleted;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        }
                        Function1 function12 = (Function1) objOnMinimized;
                        if (i21 == 2048) {
                            int i24 = onNavigationEvent + 59;
                            onExtraCallbackWithResult = i24 % 128;
                            if (i24 % 2 != 0) {
                                z6 = true;
                            }
                        }
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!z6) {
                            int i25 = onExtraCallbackWithResult + 101;
                            onNavigationEvent = i25 % 128;
                            if (i25 % 2 != 0) {
                                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                                throw null;
                            }
                            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized2 = new Function1() { // from class: im.toss.tosssecurities.uikit.compound.toggle.TossSecCurrencyToggleKt$$ExternalSyntheticLambda7
                                    private static int onExtraCallbackWithResult = 0;
                                    private static int onWarmupCompleted = 1;

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        int i26 = 2 % 2;
                                        int i27 = onExtraCallbackWithResult + 107;
                                        onWarmupCompleted = i27 % 128;
                                        int i28 = i27 % 2;
                                        String strOnExtraCallback = AFf1wSDKExternalSyntheticLambda0.onExtraCallback(listListOf, ((Integer) obj2).intValue());
                                        int i29 = onExtraCallbackWithResult + 51;
                                        onWarmupCompleted = i29 % 128;
                                        int i30 = i29 % 2;
                                        return strOnExtraCallback;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                            }
                            int i26 = ((i3 << 9) & 57344) | 100663296;
                            List<? extends Currency> list4 = listListOf;
                            boolean z9 = z7;
                            AFf1ySDK.onExtraCallback(iIndexOf, fM151getBackgroundRadiusD9Ej5fM, fM154getToggleRadiusD9Ej5fM, function12, quirksExternalSyntheticBackport04, 0L, 0L, (Function1) objOnMinimized2, ForwardingCameraControl.onExtraCallback(-1281982316, true, new setTaggedAddrCtrl() { // from class: im.toss.tosssecurities.uikit.compound.toggle.TossSecCurrencyToggleKt$$ExternalSyntheticLambda8
                                private static int IAuthTabCallback = 1;
                                private static int onWarmupCompleted;

                                @Override // o.setTaggedAddrCtrl
                                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                    int i27 = 2 % 2;
                                    int i28 = IAuthTabCallback + 107;
                                    onWarmupCompleted = i28 % 128;
                                    int i29 = i28 % 2;
                                    List list5 = listListOf;
                                    boolean z10 = z7;
                                    AFf1zSDKAFa1vSDK aFf1zSDKAFa1vSDK2 = aFf1zSDKAFa1vSDK;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    Object[] objArr = {list5, Boolean.valueOf(z10), aFf1zSDKAFa1vSDK2, Integer.valueOf(iIntValue), Boolean.valueOf(zBooleanValue), (CameraCaptureResultEmptyCameraCaptureResult) obj4, Integer.valueOf(iIntValue2)};
                                    int iOnWarmupCompleted = a.3.onWarmupCompleted();
                                    int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
                                    Unit unit = (Unit) AFf1wSDKExternalSyntheticLambda0.onExtraCallbackWithResult(a.3.onWarmupCompleted(), -1341814503, a.3.onWarmupCompleted(), iOnWarmupCompleted2, objArr, 1341814505, iOnWarmupCompleted);
                                    int i30 = IAuthTabCallback + 71;
                                    onWarmupCompleted = i30 % 128;
                                    int i31 = i30 % 2;
                                    return unit;
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i26, 96);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                            list3 = list4;
                            z4 = z9;
                        }
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.compound.toggle.TossSecCurrencyToggleKt$$ExternalSyntheticLambda9
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallbackWithResult = 1;

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i27 = 2 % 2;
                                int i28 = IAuthTabCallback + 67;
                                onExtraCallbackWithResult = i28 % 128;
                                int i29 = i28 % 2;
                                AFf1zSDKAFa1vSDK aFf1zSDKAFa1vSDK2 = aFf1zSDKAFa1vSDK;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport03;
                                boolean z10 = z4;
                                List list5 = list3;
                                Function0 function02 = function0;
                                Function1 function13 = function1;
                                int i30 = i;
                                int i31 = i2;
                                int iIntValue = ((Integer) obj3).intValue();
                                Object[] objArr = {aFf1zSDKAFa1vSDK2, quirksExternalSyntheticBackport05, Boolean.valueOf(z10), list5, function02, function13, Integer.valueOf(i30), Integer.valueOf(i31), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)};
                                int iOnWarmupCompleted = a.3.onWarmupCompleted();
                                int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
                                Unit unit = (Unit) AFf1wSDKExternalSyntheticLambda0.onExtraCallbackWithResult(a.3.onWarmupCompleted(), 1449246790, a.3.onWarmupCompleted(), iOnWarmupCompleted2, objArr, -1449246790, iOnWarmupCompleted);
                                int i32 = IAuthTabCallback + 11;
                                onExtraCallbackWithResult = i32 % 128;
                                if (i32 % 2 == 0) {
                                    int i33 = 45 / 0;
                                }
                                return unit;
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                list2 = list;
                Object obj2 = null;
                if ((i & 24576) == 0) {
                }
                if ((196608 & i) == 0) {
                }
                boolean z62 = false;
                if ((74899 & i3) == 74898) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i3 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            z2 = z;
            i7 = i2 & 8;
            if (i7 == 0) {
            }
            list2 = list;
            Object obj22 = null;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            boolean z622 = false;
            if ((74899 & i3) == 74898) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i5 = i2 & 4;
        if (i5 == 0) {
        }
        z2 = z;
        i7 = i2 & 8;
        if (i7 == 0) {
        }
        list2 = list;
        Object obj222 = null;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        boolean z6222 = false;
        if ((74899 & i3) == 74898) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final Currency onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Currency currency = Currency.USD;
        int i4 = onNavigationEvent + 27;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return currency;
    }

    private static final Unit onNavigationEvent(Currency currency) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(currency, "");
            unit = Unit.INSTANCE;
            int i3 = 87 / 0;
        } else {
            Intrinsics.checkNotNullParameter(currency, "");
            unit = Unit.INSTANCE;
        }
        int i4 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-664478695);
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            int i3 = onExtraCallbackWithResult + 101;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-664478695, i, -1, "im.toss.tosssecurities.uikit.compound.toggle.SmallPreview (TossSecCurrencyToggle.kt:202)");
            }
            AFf1zSDKAFa1vSDK aFf1zSDKAFa1vSDKOnWarmupCompleted = AFf1zSDKAFa1vSDK.Companion.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new TossSecCurrencyToggleKt$.ExternalSyntheticLambda3();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            Function0 function0 = (Function0) objOnMinimized;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new TossSecCurrencyToggleKt$.ExternalSyntheticLambda4();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                int i4 = onExtraCallbackWithResult + 71;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
            onExtraCallback(aFf1zSDKAFa1vSDKOnWarmupCompleted, null, false, null, function0, (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 221184, 14);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            int i6 = onExtraCallbackWithResult + 93;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TossSecCurrencyToggleKt$.ExternalSyntheticLambda5(i));
        }
    }

    private static final Currency onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Currency currency = Currency.USD;
        int i4 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return currency;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Currency currency = (Currency) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(currency, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(currency, "");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(819058962);
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(819058962, i, -1, "im.toss.tosssecurities.uikit.compound.toggle.BigPreview (TossSecCurrencyToggle.kt:212)");
            }
            AFf1zSDKAFa1vSDK aFf1zSDKAFa1vSDKOnExtraCallback = AFf1zSDKAFa1vSDK.Companion.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.tosssecurities.uikit.compound.toggle.TossSecCurrencyToggleKt$$ExternalSyntheticLambda0
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i3 = 2 % 2;
                        int i4 = onNavigationEvent + 1;
                        onWarmupCompleted = i4 % 128;
                        int i5 = i4 % 2;
                        Currency currencyOnExtraCallback = AFf1wSDKExternalSyntheticLambda0.onExtraCallback();
                        int i6 = onWarmupCompleted + 95;
                        onNavigationEvent = i6 % 128;
                        int i7 = i6 % 2;
                        return currencyOnExtraCallback;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            Function0 function0 = (Function0) objOnMinimized;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new Function1() { // from class: im.toss.tosssecurities.uikit.compound.toggle.TossSecCurrencyToggleKt$$ExternalSyntheticLambda1
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i3 = 2 % 2;
                        int i4 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
                        onExtraCallback = i4 % 128;
                        int i5 = i4 % 2;
                        Unit unitIAuthTabCallback = AFf1wSDKExternalSyntheticLambda0.IAuthTabCallback((Currency) obj);
                        int i6 = onExtraCallback + 3;
                        onExtraCallbackWithResult = i6 % 128;
                        int i7 = i6 % 2;
                        return unitIAuthTabCallback;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            onExtraCallback(aFf1zSDKAFa1vSDKOnExtraCallback, null, false, null, function0, (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 221184, 14);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onNavigationEvent + 31;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            int i4 = onNavigationEvent + 43;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.compound.toggle.TossSecCurrencyToggleKt$$ExternalSyntheticLambda2
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int i6 = 2 % 2;
                    int i7 = onNavigationEvent + 29;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = i;
                        int iIntValue = ((Integer) obj3).intValue();
                        Object[] objArr = {Integer.valueOf(i8), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)};
                        int iOnWarmupCompleted = a.3.onWarmupCompleted();
                        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
                        throw null;
                    }
                    int i9 = i;
                    int iIntValue2 = ((Integer) obj3).intValue();
                    Object[] objArr2 = {Integer.valueOf(i9), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue2)};
                    int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
                    int iOnWarmupCompleted4 = a.3.onWarmupCompleted();
                    Unit unit = (Unit) AFf1wSDKExternalSyntheticLambda0.onExtraCallbackWithResult(a.3.onWarmupCompleted(), 1570313217, a.3.onWarmupCompleted(), iOnWarmupCompleted4, objArr2, -1570313216, iOnWarmupCompleted3);
                    int i10 = onExtraCallbackWithResult + 107;
                    onNavigationEvent = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 58 / 0;
                    }
                    return unit;
                }
            });
            int i6 = onExtraCallbackWithResult + 79;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(AFf1zSDKAFa1vSDK aFf1zSDKAFa1vSDK, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, List list, Function0 function0, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {aFf1zSDKAFa1vSDK, quirksExternalSyntheticBackport0, Boolean.valueOf(z), list, function0, function1, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(a.3.onWarmupCompleted(), 1449246790, a.3.onWarmupCompleted(), iOnWarmupCompleted2, objArr, -1449246790, iOnWarmupCompleted);
    }

    public static /* synthetic */ Unit IAuthTabCallback(List list, boolean z, AFf1zSDKAFa1vSDK aFf1zSDKAFa1vSDK, int i, boolean z2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {list, Boolean.valueOf(z), aFf1zSDKAFa1vSDK, Integer.valueOf(i), Boolean.valueOf(z2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(a.3.onWarmupCompleted(), -1341814503, a.3.onWarmupCompleted(), iOnWarmupCompleted2, objArr, 1341814505, iOnWarmupCompleted);
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(a.3.onWarmupCompleted(), 1570313217, a.3.onWarmupCompleted(), iOnWarmupCompleted2, objArr, -1570313216, iOnWarmupCompleted);
    }

    private static final Unit onExtraCallback(Currency currency) {
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(a.3.onWarmupCompleted(), 1180963954, iOnWarmupCompleted3, iOnWarmupCompleted2, new Object[]{currency}, -1180963951, iOnWarmupCompleted);
    }
}
