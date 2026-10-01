package o;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowScope;
import im.toss.features.credit.ui.quiz.R;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityOnDestroyPoint;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.areAllItemsEnabled;
import o.setCurrentIndex;
import o.w3b;
import o.w5a;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ActivityOnDestroyPoint {
    private static int $10 = 0;
    private static int $11 = 1;
    private static getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback = null;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackDefault = null;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStub = null;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 1;
    private static int access100;
    private static int asBinder;
    private static getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asInterface;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback;
    private static getBacktraceNote<areAllItemsEnabled, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult;
    public static final ActivityOnDestroyPoint onNavigationEvent;
    private static int[] onTransact;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted;

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = ~i4;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i4 | i6);
        int i12 = i10 | i11;
        int i13 = (~(i7 | i6)) | (~(i7 | i9)) | (~(i9 | i6));
        int i14 = i6 + i5 + i2 + (669352129 * i3) + (266941808 * i);
        int i15 = i14 * i14;
        int i16 = (i6 * 1617402437) + 56426783 + (i5 * 1617401273) + (i12 * (-582)) + (i11 * 582) + (i13 * 582) + (1617401855 * i2) + (1244927807 * i3) + ((-404665712) * i) + (i15 * (-45350912));
        int i17 = (720661947 * i6) + 1572077568 + ((-1243901369) * i5) + (1165201990 * i12) + (i11 * (-1165201990)) + ((-1165201990) * i13) + (1885863936 * i2) + ((-1100480512) * i3) + ((-1249902592) * i) + ((-491520000) * i15) + (i16 * i16 * 1565261824);
        if (i17 == 1) {
            w3b w3bVar = (w3b) objArr[0];
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
            int iIntValue = ((Number) objArr[2]).intValue();
            int i18 = 2 % 2;
            int i19 = asBinder + 63;
            access000 = i19 % 128;
            int i20 = i19 % 2;
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            int i21 = access000 + 89;
            asBinder = i21 % 128;
            int i22 = i21 % 2;
            return unitOnExtraCallbackWithResult;
        }
        if (i17 == 2) {
            return onNavigationEvent(objArr);
        }
        RowScope rowScope = (RowScope) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i23 = 2 % 2;
        int i24 = access000 + 81;
        asBinder = i24 % 128;
        int i25 = i24 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-750365880, iIntValue2, -1, "im.toss.feature.credit.ui.quiz.mypage.ComposableSingletons$CreditQuizMyPageScreenKt.lambda$-750365880.<anonymous> (CreditQuizMyPageScreen.kt:414)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.my_credit_quiz_point, cameraCaptureResultEmptyCameraCaptureResult2, 0), null, null, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).ICustomTabsService()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult2, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i26 = asBinder + 39;
                access000 = i26 % 128;
                int i27 = i26 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i28 = access000 + 27;
        asBinder = i28 % 128;
        int i29 = i28 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 25;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asBinder + 7;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        w3b w3bVar = (w3b) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = access000 + 67;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 19;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        Unit unit = (Unit) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, -419488628, 419488628);
        int i5 = access000 + 125;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 101;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 73 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 119;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            IAuthTabCallback(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = asBinder + 37;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 9;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallbackWithResult(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = access000 + 13;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public final getBacktraceNote<areAllItemsEnabled, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        getBacktraceNote<areAllItemsEnabled, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote;
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 47;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            getbacktracenote = onExtraCallbackWithResult;
            int i4 = 41 / 0;
        } else {
            getbacktracenote = onExtraCallbackWithResult;
        }
        int i5 = i2 + 67;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return getbacktracenote;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 111;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = asInterface;
        int i5 = i2 + 1;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return getbacktracenote;
        }
        throw null;
    }

    public final getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IAuthTabCallback;
        int i5 = i3 + 123;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return getbacktracenote;
        }
        throw null;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IAuthTabCallbackDefault;
        int i5 = i3 + 81;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 24 / 0;
        }
        return getbacktracenote;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access000 + 11;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onTransact;
        double d = 0.0d;
        int i4 = -1469660336;
        int i5 = 0;
        if (iArr3 != null) {
            int i6 = $10 + 27;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i2])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), View.MeasureSpec.makeMeasureSpec(0, 0) + 72, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d ? 0 : -1)) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i2] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i2++;
                    d = 0.0d;
                    i4 = -1469660336;
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
        int[] iArr5 = onTransact;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i7 = 0;
            while (i7 < length3) {
                int i8 = $10 + 31;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                Object[] objArr3 = new Object[1];
                objArr3[i5] = Integer.valueOf(iArr5[i7]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", i5, i5), (CdmaCellLocation.convertQuartSecToDecDegrees(i5) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i5) == 0.0d ? 0 : -1)) + 72, KeyEvent.keyCodeFromString("") + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i7++;
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        int i10 = i5;
        System.arraycopy(iArr5, i10, iArr4, i10, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i10;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i11 = $10 + 13;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i13 = $11 + 61;
            $10 = i13 % 128;
            int i14 = 2;
            int i15 = i13 % 2;
            int i16 = 0;
            while (i16 < 16) {
                int i17 = $11 + 17;
                $10 = i17 % 128;
                int i18 = i17 % i14;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i16];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - Drawable.resolveOpacity(0, 0)), TextUtils.indexOf((CharSequence) "", '0') + 40, 10301 - TextUtils.indexOf("", "", 0, 0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i16++;
                i14 = 2;
            }
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i19;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i21 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 4033), (ViewConfiguration.getTouchSlop() >> 8) + 78, 7398 - View.MeasureSpec.makeMeasureSpec(0, 0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        String str = new String(cArr2, 0, i);
        int i22 = $11 + 113;
        $10 = i22 % 128;
        int i23 = i22 % 2;
        objArr[0] = str;
    }

    static {
        onTransact();
        onNavigationEvent = new ActivityOnDestroyPoint();
        onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(1472083092, false, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.quiz.mypage.ComposableSingletons$CreditQuizMyPageScreenKt$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 111;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnNavigationEvent = ActivityOnDestroyPoint.onNavigationEvent((areAllItemsEnabled) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onWarmupCompleted + 107;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitOnNavigationEvent;
                }
                throw null;
            }
        });
        onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(-1723910497, false, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.quiz.mypage.ComposableSingletons$CreditQuizMyPageScreenKt$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Unit unitOnWarmupCompleted;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 125;
                onExtraCallback = i2 % 128;
                RowScope rowScope = (RowScope) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                if (i2 % 2 != 0) {
                    unitOnWarmupCompleted = ActivityOnDestroyPoint.onWarmupCompleted(rowScope, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                    int i3 = 55 / 0;
                } else {
                    unitOnWarmupCompleted = ActivityOnDestroyPoint.onWarmupCompleted(rowScope, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                }
                int i4 = onExtraCallback + 69;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return unitOnWarmupCompleted;
            }
        });
        IAuthTabCallbackStub = ForwardingCameraControl.onExtraCallbackWithResult(1885321896, false, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.quiz.mypage.ComposableSingletons$CreditQuizMyPageScreenKt$$ExternalSyntheticLambda2
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 89;
                onWarmupCompleted = i2 % 128;
                w5a w5aVar = (w5a) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                if (i2 % 2 == 0) {
                    return ActivityOnDestroyPoint.onNavigationEvent(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                }
                ActivityOnDestroyPoint.onNavigationEvent(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        });
        IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(1464329588, false, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.quiz.mypage.ComposableSingletons$CreditQuizMyPageScreenKt$$ExternalSyntheticLambda3
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 15;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                w3b w3bVar = (w3b) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                Integer numValueOf = Integer.valueOf(((Integer) obj3).intValue());
                if (i3 != 0) {
                    int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
                    int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
                    int iOnNavigationEvent3 = setCurrentIndex.onNavigationEvent();
                    return (Unit) ActivityOnDestroyPoint.IAuthTabCallback(setCurrentIndex.onNavigationEvent(), new Object[]{w3bVar, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent, -529245675, 529245676);
                }
                int iOnNavigationEvent4 = setCurrentIndex.onNavigationEvent();
                int iOnNavigationEvent5 = setCurrentIndex.onNavigationEvent();
                int iOnNavigationEvent6 = setCurrentIndex.onNavigationEvent();
                throw null;
            }
        });
        onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(-750365880, false, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.quiz.mypage.ComposableSingletons$CreditQuizMyPageScreenKt$$ExternalSyntheticLambda4
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 113;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                RowScope rowScope = (RowScope) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i3 != 0) {
                    ActivityOnDestroyPoint.onNavigationEvent(rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
                Unit unitOnNavigationEvent = ActivityOnDestroyPoint.onNavigationEvent(rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i4 = onExtraCallbackWithResult + 123;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitOnNavigationEvent;
            }
        });
        IAuthTabCallbackDefault = ForwardingCameraControl.onExtraCallbackWithResult(1683355921, false, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.quiz.mypage.ComposableSingletons$CreditQuizMyPageScreenKt$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Unit unitOnExtraCallbackWithResult;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 9;
                onExtraCallbackWithResult = i2 % 128;
                w5a w5aVar = (w5a) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                if (i2 % 2 != 0) {
                    unitOnExtraCallbackWithResult = ActivityOnDestroyPoint.onExtraCallbackWithResult(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                    int i3 = 27 / 0;
                } else {
                    unitOnExtraCallbackWithResult = ActivityOnDestroyPoint.onExtraCallbackWithResult(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                }
                int i4 = IAuthTabCallback + 5;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 55 / 0;
                }
                return unitOnExtraCallbackWithResult;
            }
        });
        asInterface = ForwardingCameraControl.onExtraCallbackWithResult(836673757, false, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.quiz.mypage.ComposableSingletons$CreditQuizMyPageScreenKt$$ExternalSyntheticLambda6
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 25;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {(w3b) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
                Unit unit = (Unit) ActivityOnDestroyPoint.IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, -1352955282, 1352955284);
                int i4 = onNavigationEvent + 81;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 43 / 0;
                }
                return unit;
            }
        });
        int i = IAuthTabCallback_Parcel + 41;
        access100 = i % 128;
        int i2 = i % 2;
    }

    private static final Unit onExtraCallback(areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(areallitemsenabled, "");
        if ((i & 17) != 16) {
            int i3 = access000 + 117;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            int i5 = asBinder + 23;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1472083092, i, -1, "im.toss.feature.credit.ui.quiz.mypage.ComposableSingletons$CreditQuizMyPageScreenKt.lambda$1472083092.<anonymous> (CreditQuizMyPageScreen.kt:298)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.my_credit_quiz_count, cameraCaptureResultEmptyCameraCaptureResult, 0), null, null, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = asBinder + 35;
                access000 = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = access000 + 15;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((i & 6) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar)) {
                int i7 = asBinder + 57;
                access000 = i7 % 128;
                int i8 = i7 % 2;
                i3 = 2;
            } else {
                int i9 = access000 + 7;
                int i10 = i9 % 128;
                asBinder = i10;
                int i11 = i9 % 2;
                int i12 = i10 + 35;
                access000 = i12 % 128;
                int i13 = i12 % 2;
                i3 = 4;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i14 = access000 + 47;
            asBinder = i14 % 128;
            if (i14 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1464329588, i2, -1, "im.toss.feature.credit.ui.quiz.mypage.ComposableSingletons$CreditQuizMyPageScreenKt.lambda$1464329588.<anonymous> (CreditQuizMyPageScreen.kt:387)");
            }
            Object[] objArr = new Object[1];
            a(new int[]{-1017324498, 281881510, 1450807445, 1858765135, 411929159, -1909366069, 174433404, 428217787, -191228622, -601161663, 515596513, 509904659, 35267629, 315506764, -977941382, 1706196550, -863851432, -1826222679, 161820385, 79556493, -135219014, 228354593, -252630376, 959237913, -2026445794, 147730900, -2113005290, 1311549671, -294050723, 922216625, -1054790123, 953520096}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 63, objArr);
            w3bVar.onExtraCallbackWithResult(((String) objArr[0]).intern(), (QuirksExternalSyntheticBackport0) null, 0.0f, (immediateFailedFuture) null, 0L, 0L, (toMetersPerSecond) null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 21) & 29360128) | 6, 126);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i3 = access000 + 49;
            asBinder = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1723910497, i, -1, "im.toss.feature.credit.ui.quiz.mypage.ComposableSingletons$CreditQuizMyPageScreenKt.lambda$-1723910497.<anonymous> (CreditQuizMyPageScreen.kt:391)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.my_credit_answer_rate, cameraCaptureResultEmptyCameraCaptureResult, 0), null, null, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = access000 + 29;
                asBinder = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i4 = access000 + 17;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i6 = access000 + 7;
            asBinder = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 78 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1885321896, i, -1, "im.toss.feature.credit.ui.quiz.mypage.ComposableSingletons$CreditQuizMyPageScreenKt.lambda$1885321896.<anonymous> (CreditQuizMyPageScreen.kt:390)");
                }
                w5aVar.IAuthTabCallback(onWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                w5aVar.IAuthTabCallback(onWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i4 = access000 + 61;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = access000 + 77;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(836673757, i2, -1, "im.toss.feature.credit.ui.quiz.mypage.ComposableSingletons$CreditQuizMyPageScreenKt.lambda$836673757.<anonymous> (CreditQuizMyPageScreen.kt:410)");
            }
            Object[] objArr = new Object[1];
            a(new int[]{-1017324498, 281881510, 1450807445, 1858765135, 411929159, -1909366069, 174433404, 428217787, -191228622, -601161663, 515596513, 509904659, 35267629, 315506764, -977941382, 1706196550, -863851432, -1826222679, 161820385, 79556493, -1437709314, -375364160, -985979480, -352494208, 1840910146, 182623313, 2131648539, -270663199, 1790388747, -1199098567}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 58, objArr);
            w3bVar.onExtraCallbackWithResult(((String) objArr[0]).intern(), (QuirksExternalSyntheticBackport0) null, 0.0f, (immediateFailedFuture) null, 0L, 0L, (toMetersPerSecond) null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 21) & 29360128) | 6, 126);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i8 = access000 + 41;
                asBinder = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = asBinder + 37;
        access000 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 29) == 0) {
                int i4 = asBinder + 61;
                access000 = i4 % 128;
                if (i4 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar);
                    obj.hashCode();
                    throw null;
                }
                i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i & 19) != 18) {
            z = true;
        } else {
            int i5 = access000 + 5;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = asBinder + 17;
            access000 = i7 % 128;
            if (i7 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1683355921, i, -1, "im.toss.feature.credit.ui.quiz.mypage.ComposableSingletons$CreditQuizMyPageScreenKt.lambda$1683355921.<anonymous> (CreditQuizMyPageScreen.kt:413)");
            }
            w5aVar.IAuthTabCallback(onExtraCallback, cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (Unit) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, -1352955282, 1352955284);
    }

    public static /* synthetic */ Unit IAuthTabCallback(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (Unit) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, -529245675, 529245676);
    }

    private static final Unit IAuthTabCallback(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (Unit) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, -419488628, 419488628);
    }

    static void onTransact() {
        onTransact = new int[]{19737582, 1976824949, -395739020, -546889809, 1556158020, 1512821053, -1473310126, -1737652618, -782697077, 151403526, 1948199858, -1680463800, 340659824, 398329921, -689092225, 122494285, 1873911037, 1174234045};
    }
}
