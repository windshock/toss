package o;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.feature.credit.ui.main.R;
import im.toss.features.teens.cvscash.CvsCashTransactionActivity$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C0064gradeStrategy;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceGradeJudgement;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.getViewTypeCount;
import o.pauseAnimation;
import o.setCallToAction;
import o.t7ExternalSyntheticLambda0;
import o.toPreviewOnlyRange;
import o.u4;
import o.w3b;
import o.w5a;
import o.y1ExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DeviceGradeJudgement {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 1;
    private static long onNavigationEvent = -124656003881309899L;
    private static int onWarmupCompleted;

    private static final Unit IAuthTabCallback(String str, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 27;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallbackWithResult(str, (Function0<Unit>) function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onWarmupCompleted + 67;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 83 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(String str, C0064gradeStrategy c0064gradeStrategy, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 65;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallbackWithResult(str, c0064gradeStrategy, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onWarmupCompleted + 125;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(C0064gradeStrategy.onWarmupCompleted onwarmupcompleted, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 59;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            onWarmupCompleted(onwarmupcompleted, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(onwarmupcompleted, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallback + 87;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Unit unit;
        C0064gradeStrategy.onWarmupCompleted onwarmupcompleted = (C0064gradeStrategy.onWarmupCompleted) objArr[0];
        w3b w3bVar = (w3b) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {onwarmupcompleted, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)};
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        if (i3 == 0) {
            unit = (Unit) onNavigationEvent(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), objArr2, iOnWarmupCompleted, 209330561, -209330559, iOnWarmupCompleted2, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted());
            int i4 = 47 / 0;
        } else {
            unit = (Unit) onNavigationEvent(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), objArr2, iOnWarmupCompleted, 209330561, -209330559, iOnWarmupCompleted2, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted());
        }
        int i5 = onExtraCallback + 69;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 31;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, function0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 != 0) {
            int i6 = 57 / 0;
        }
        int i7 = onWarmupCompleted + 31;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function0);
        int i4 = onExtraCallback + 9;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(C0064gradeStrategy.onWarmupCompleted onwarmupcompleted, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 115;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            onNavigationEvent(onwarmupcompleted, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(onwarmupcompleted, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallback + 91;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onNavigationEvent(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        boolean z;
        int i7 = ~i4;
        int i8 = ~i3;
        int i9 = ~i2;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i8 | i4 | i2);
        int i12 = (~(i2 | i4)) | (~(i7 | i9)) | i8;
        int i13 = i3 + i4 + i5 + (62936680 * i) + ((-2032430997) * i6);
        int i14 = i13 * i13;
        int i15 = ((i3 * 1175661207) - 43826732) + (i4 * 1175659659) + (i10 * (-774)) + (i11 * (-774)) + (i12 * 774) + (1175660433 * i5) + (1188219112 * i) + ((-816965221) * i6) + (i14 * 1798373376);
        int i16 = ((-476632153) * i3) + 797966336 + (1756943451 * i4) + (i10 * (-1030695846)) + ((-1030695846) * i11) + (1030695846 * i12) + ((-1507328000) * i5) + ((-264241152) * i) + ((-222822400) * i6) + (2040594432 * i14) + (i15 * i15 * 914292736);
        if (i16 != 1) {
            return i16 != 2 ? onExtraCallback(objArr) : IAuthTabCallback(objArr);
        }
        final Function0 function0 = (Function0) objArr[0];
        u4 u4Var = (u4) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i17 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((iIntValue & 6) == 0) {
            iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2;
        }
        if ((iIntValue & 19) != 18) {
            int i18 = onWarmupCompleted + 125;
            onExtraCallback = i18 % 128;
            int i19 = i18 % 2;
            z = true;
        } else {
            z = false;
        }
        if (true ^ cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i20 = onWarmupCompleted + 71;
            onExtraCallback = i20 % 128;
            int i21 = i20 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(890721371, iIntValue, -1, "im.toss.feature.credit.ui.main.intro.CreditIntroScreen.<anonymous>.<anonymous> (CreditIntroScreen.kt:94)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.intro_cta, cameraCaptureResultEmptyCameraCaptureResult, 0);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent) {
                int i22 = onExtraCallback + 103;
                onWarmupCompleted = i22 % 128;
                int i23 = i22 % 2;
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function0 function02 = new Function0() { // from class: im.toss.feature.credit.ui.main.intro.CreditIntroScreenKt$$ExternalSyntheticLambda3
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke() {
                            int i24 = 2 % 2;
                            int i25 = onWarmupCompleted + 35;
                            onNavigationEvent = i25 % 128;
                            int i26 = i25 % 2;
                            Unit unitOnExtraCallback = DeviceGradeJudgement.onExtraCallback(function0);
                            int i27 = onWarmupCompleted + 23;
                            onNavigationEvent = i27 % 128;
                            int i28 = i27 % 2;
                            return unitOnExtraCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function02);
                    obj = function02;
                }
                u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 0, iIntValue & 14, 1014);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, C0064gradeStrategy c0064gradeStrategy, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 57;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, c0064gradeStrategy, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallback + 25;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 71;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Integer numValueOf = Integer.valueOf(i);
        if (i4 != 0) {
            int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
            int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
            return (Unit) onNavigationEvent(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), new Object[]{function0, u4Var, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, iOnWarmupCompleted, 1320495463, -1320495462, iOnWarmupCompleted2, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted());
        }
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted4 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onNavigationEvent ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 53;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $11 + 83;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 45811), TextUtils.indexOf("", "") + 84, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), TextUtils.lastIndexOf("", '0') + 20, 8808 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    private static final Unit onNavigationEvent(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 67;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[PHI: r2
      0x0044: PHI (r2v5 o.CameraCaptureResultEmptyCameraCaptureResult) = (r2v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r2v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0037, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039 A[PHI: r2
      0x0039: PHI (r2v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r2v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r2v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0037, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@NotNull final String str, @NotNull final Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) throws Throwable {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 63;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function0, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(803332174);
            if ((i & 36) == 0) {
                i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function0, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(803332174);
            if ((i & 6) == 0) {
            }
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                i3 = 32;
            } else {
                int i6 = onWarmupCompleted + 101;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                i3 = 16;
            }
            i2 |= i3;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(803332174, i2, -1, "im.toss.feature.credit.ui.main.intro.CreditIntroScreen (CreditIntroScreen.kt:31)");
            }
            setContentInsetsRelative setcontentinsetsrelativeIAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1);
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, 0.0f, 1, (Object) null);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0IAuthTabCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                int i8 = onWarmupCompleted + 61;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = setContentInsetsAbsolute.IAuthTabCallback(onextracallback, setcontentinsetsrelativeIAuthTabCallback, false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), onextracallbackwithresult.onTransact(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0IAuthTabCallback2);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                int i10 = onWarmupCompleted + 73;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            Object obj = null;
            y1ExternalSyntheticLambda6.onExtraCallbackWithResult(getRuntimeEnvironmentProxy.onNavigationEvent.onExtraCallback(), (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote) null, (getBacktraceNote) null, 0.0f, 0.0f, (Function0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 0, 16382);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(250.0f));
            Object[] objArr = new Object[1];
            a(new char[]{65005, 64901, 2019, 38318, 21225, 24115, 30447, 59624, 46458, 20105, 16272, 41363, 27734, 45531, 58546, 5684, 10024, 63784, 44505, 53008, 56850, 8212, 6808, 33830, 37360, 27502, 49696, 32064, 18650, 53835, 35671, 12889, 948, 1448, 28776, 60081, 47776, 19608, 14609, 41873, 28100, 47008, 59131, 6321, 9585, 65255, 45018, 53710, 56394, 8642, 5305, 34339, 38768, 26917, 56766, 32522, 19995, 53263, 35466, 13345, 423, 6961, 29289, 60771, 47326, 16981}, (ViewConfiguration.getPressedStateDuration() >> 16) + 1, objArr);
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            AppLovinStarRatingView.IAuthTabCallback(((String) objArr[0]).intern(), quirksExternalSyntheticBackport0IAuthTabCallbackDefault, false, false, Integer.MAX_VALUE, 0.0f, false, 0.0f, 0.0f, (QuirkSettingsLoader) null, (immediateFailedFuture) null, false, (String) null, cameraCaptureResultEmptyCameraCaptureResult2, 24630, 0, 8172);
            String str2 = String.format(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.credit_intro_header1, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "");
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.credit_intro_li1, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            Object[] objArr2 = new Object[1];
            a(new char[]{7118, 7078, 40735, 3410, 28422, 38381, 19200, 9014, 21337, 54901, 639, 27213, 35445, 10535, 55645, 56810, 49419, 25044, 36918, 1230, 14385, 47336, 10103, 20472, 30675, 62354, 65487, 46747, 44789, 19116, 46754, 63901, 58845, 40279, 19910, 8557, 23745, 54335, 1260, 26633, 35747, 12044, 56095, 54060, 49931, 26132, 37422, 6687, 14962, 47423, 10517, 19966, 28945, 61900, 57418, 46232, 43050, 18673, 46951}, 1 - KeyEvent.getDeadChar(0, 0), objArr2);
            C0064gradeStrategy.onWarmupCompleted onwarmupcompleted = new C0064gradeStrategy.onWarmupCompleted(strOnExtraCallback, ((String) objArr2[0]).intern());
            String strOnExtraCallback2 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.credit_intro_li2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            Object[] objArr3 = new Object[1];
            a(new char[]{61414, 61326, 56139, 18694, 32208, 35431, 22998, 15548, 42865, 37409, 4265, 30151, 32349, 28019, 52107, 49760, 13603, 9600, 33504, 6980, 52249, 64700, 13729, 20594, 33787, 47046, 60697, 43281, 23261, 3832, 42100, 58903, 4597, 55555, 24336, 16103, 43241, 36971, 5690, 30595, 32651, 27480, 51657, 52390, 14115, 8778, 32997, 1434, 52815, 64890, 15299, 21106, 34103, 46472, 62175, 43845, 23575, 3239, 42426, 57399, 5097, 51097, 23882, 14634, 43741}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr3);
            onExtraCallbackWithResult(str2, new C0064gradeStrategy(onwarmupcompleted, new C0064gradeStrategy.onWarmupCompleted(strOnExtraCallback2, ((String) objArr3[0]).intern())), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            String strOnExtraCallback3 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.credit_intro_header2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            String strOnExtraCallback4 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.credit_intro_li3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            Object[] objArr4 = new Object[1];
            a(new char[]{7542, 7454, 41360, 13277, 7401, 57748, 14575, 22351, 21985, 59642, 29072, 7732, 36045, 6056, 43698, 43411, 51123, 24411, 58329, 28855, 16009, 34407, 21656, 15233, 29035, 52509, 35872, 49890, 43085, 29731, 50509, 36324, 58213, 41944, 15913, 21780, 23161, 60080, 30467, 7280, 36123, 4483, 43248, 42837, 50611, 22687, 57793, 28258, 15582, 34737, 23203, 14798, 30625, 53062, 37802, 49323, 44679, 30269, 50316, 35779, 57707, 48399, 15464, 21145, 22618, 58406, 30016}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, objArr4);
            C0064gradeStrategy.onWarmupCompleted onwarmupcompleted2 = new C0064gradeStrategy.onWarmupCompleted(strOnExtraCallback4, ((String) objArr4[0]).intern());
            String strOnExtraCallback5 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.credit_intro_li4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            Object[] objArr5 = new Object[1];
            a(new char[]{17637, 17549, 38218, 1799, 5535, 63478, 12697, 16685, 3186, 56352, 30950, 2134, 54622, 9074, 41924, 49137, 40480, 27521, 60079, 26325, 26394, 45757, 24046, 11747, 10488, 63943, 34134, 54400, 61918, 16633, 52283, 39814, 47862, 38658, 14175, 17270, 1002, 56938, 32373, 2578, 54408, 9561, 41350, 45367, 39968, 27719, 59575, 30743, 25926, 45941, 21388, 12264, 11835, 64397, 39631, 54984, 63248, 17081, 52732, 40423, 47341, 35288, 13586}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr5);
            C0064gradeStrategy.onWarmupCompleted onwarmupcompleted3 = new C0064gradeStrategy.onWarmupCompleted(strOnExtraCallback5, ((String) objArr5[0]).intern());
            String strOnExtraCallback6 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.credit_intro_li5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            Object[] objArr6 = new Object[1];
            a(new char[]{8118, 8158, 46184, 9765, 46231, 42312, 37009, 5011, 22305, 64770, 55790, 23272, 36365, 592, 716, 60751, 50547, 19107, 19367, 13419, 15433, 37791, 64742, 32605, 29611, 55525, 9310, 34366, 43661, 25051, 27955, 51512, 57765, 46624, 38487, 4552, 22713, 65352, 57213, 22700, 36827, 1147, 142, 58249, 51059, 19836, 18912, 10921, 15903, 37444, 62084, 32089, 30063, 55968, 15321, 33853, 44114, 25478, 27894}, -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr6);
            C0064gradeStrategy.onWarmupCompleted onwarmupcompleted4 = new C0064gradeStrategy.onWarmupCompleted(strOnExtraCallback6, ((String) objArr6[0]).intern());
            String strOnExtraCallback7 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.credit_intro_li6, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            Object[] objArr7 = new Object[1];
            a(new char[]{19226, 19314, 43104, 14893, 47728, 12649, 40566, 34738, 909, 57610, 55049, 52937, 55969, 7768, 3115, 31086, 37343, 22187, 17728, 41034, 26853, 36759, 61953, 60284, 9991, 50413, 10937, 4639, 65057, 32211, 25556, 23833, 46345, 43560, 39088, 34281, 3093, 58176, 53658, 52365, 56183, 6259, 3689, 30632, 37855, 20845, 18246, 48795, 27300, 36421, 64608, 59758, 8644, 50851}, -TextUtils.indexOf((CharSequence) "", '0', 0), objArr7);
            onExtraCallbackWithResult(strOnExtraCallback3, new C0064gradeStrategy(onwarmupcompleted2, onwarmupcompleted3, onwarmupcompleted4, new C0064gradeStrategy.onWarmupCompleted(strOnExtraCallback7, ((String) objArr7[0]).intern())), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(120.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            u1.IAuthTabCallback(highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult.onWarmupCompleted()), (u2) null, ForwardingCameraControl.onExtraCallback(890721371, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.intro.CreditIntroScreenKt$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i12 = 2 % 2;
                    int i13 = IAuthTabCallback + 41;
                    onWarmupCompleted = i13 % 128;
                    int i14 = i13 % 2;
                    Unit unitOnWarmupCompleted = DeviceGradeJudgement.onWarmupCompleted(function0, (u4) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i15 = IAuthTabCallback + 119;
                    onWarmupCompleted = i15 % 128;
                    int i16 = i15 % 2;
                    return unitOnWarmupCompleted;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (getBacktraceNote) null, 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResult2, 384, 0, 4090);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = onWarmupCompleted + 107;
                onExtraCallback = i12 % 128;
                if (i12 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.intro.CreditIntroScreenKt$$ExternalSyntheticLambda2
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj2, Object obj3) throws Throwable {
                    int i13 = 2 % 2;
                    int i14 = onExtraCallbackWithResult + 75;
                    onExtraCallback = i14 % 128;
                    if (i14 % 2 == 0) {
                        DeviceGradeJudgement.onExtraCallback(str, function0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                    Unit unitOnExtraCallback = DeviceGradeJudgement.onExtraCallback(str, function0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i15 = onExtraCallback + 27;
                    onExtraCallbackWithResult = i15 % 128;
                    int i16 = i15 % 2;
                    return unitOnExtraCallback;
                }
            });
        }
    }

    private static final Unit onWarmupCompleted(C0064gradeStrategy.onWarmupCompleted onwarmupcompleted, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i3 = onWarmupCompleted + 59;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onWarmupCompleted + 115;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1037613137, i, -1, "im.toss.feature.credit.ui.main.intro.CreditIntroContentSection.<anonymous>.<anonymous>.<anonymous> (CreditIntroScreen.kt:134)");
                    int i5 = 7 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1037613137, i, -1, "im.toss.feature.credit.ui.main.intro.CreditIntroContentSection.<anonymous>.<anonymous>.<anonymous> (CreditIntroScreen.kt:134)");
                }
                int i6 = onExtraCallback + 109;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{onwarmupcompleted.onNavigationEvent(), null, null, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(final C0064gradeStrategy.onWarmupCompleted onwarmupcompleted, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onWarmupCompleted + 77;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1046672570, i, -1, "im.toss.feature.credit.ui.main.intro.CreditIntroContentSection.<anonymous>.<anonymous> (CreditIntroScreen.kt:132)");
                int i5 = onExtraCallback + 77;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }
            w5aVar.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-1037613137, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.intro.CreditIntroScreenKt$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i7 = 2 % 2;
                    int i8 = IAuthTabCallback + 69;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    Unit unitIAuthTabCallback = DeviceGradeJudgement.IAuthTabCallback(onwarmupcompleted, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i10 = onWarmupCompleted + 49;
                    IAuthTabCallback = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 89 / 0;
                    }
                    return unitIAuthTabCallback;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onWarmupCompleted + 123;
                onExtraCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        boolean z = false;
        C0064gradeStrategy.onWarmupCompleted onwarmupcompleted = (C0064gradeStrategy.onWarmupCompleted) objArr[0];
        w3b w3bVar = (w3b) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(w3bVar, "");
            if ((iIntValue & 99) == 0) {
                iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar) ? 4 : 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(w3bVar, "");
            if ((iIntValue & 6) == 0) {
            }
        }
        if ((iIntValue & 19) != 18) {
            int i3 = onWarmupCompleted + 31;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i4 = onWarmupCompleted + 49;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onWarmupCompleted + 123;
                onExtraCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1650231302, iIntValue, -1, "im.toss.feature.credit.ui.main.intro.CreditIntroContentSection.<anonymous>.<anonymous> (CreditIntroScreen.kt:142)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1650231302, iIntValue, -1, "im.toss.feature.credit.ui.main.intro.CreditIntroContentSection.<anonymous>.<anonymous> (CreditIntroScreen.kt:142)");
            }
            w3bVar.onExtraCallbackWithResult(onwarmupcompleted.onWarmupCompleted(), (QuirksExternalSyntheticBackport0) null, 0.0f, (immediateFailedFuture) null, 0L, 0L, (toMetersPerSecond) null, cameraCaptureResultEmptyCameraCaptureResult, (iIntValue << 21) & 29360128, 126);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final void onExtraCallbackWithResult(final String str, final C0064gradeStrategy c0064gradeStrategy, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) throws NoWhenBranchMatchedException {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1158266738);
        Object obj = null;
        boolean z = true;
        if ((i & 6) == 0) {
            int i4 = onWarmupCompleted + 35;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str);
                throw null;
            }
            i2 = (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i5 = onExtraCallback + 23;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(c0064gradeStrategy) ? 32 : 16;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i7 = onWarmupCompleted + 51;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1158266738, i2, -1, "im.toss.feature.credit.ui.main.intro.CreditIntroContentSection (CreditIntroScreen.kt:120)");
            }
            getRepeatMode.onExtraCallbackWithResult(str, pauseAnimation.onExtraCallbackWithResult.Row1A, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 5, (Object) null), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i2 & 14) | 432, 0);
            for (final C0064gradeStrategy.onWarmupCompleted onwarmupcompleted : c0064gradeStrategy.onExtraCallback()) {
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-1046672570, z, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.intro.CreditIntroScreenKt$$ExternalSyntheticLambda4
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i8 = 2 % 2;
                        int i9 = onExtraCallback + 55;
                        onExtraCallbackWithResult = i9 % 128;
                        int i10 = i9 % 2;
                        Unit unitOnExtraCallbackWithResult = DeviceGradeJudgement.onExtraCallbackWithResult(onwarmupcompleted, (w5a) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i11 = onExtraCallback + 75;
                        onExtraCallbackWithResult = i11 % 128;
                        int i12 = i11 % 2;
                        return unitOnExtraCallbackWithResult;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (QuirksExternalSyntheticBackport0) null, ForwardingCameraControl.onExtraCallback(-1650231302, z, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.intro.CreditIntroScreenKt$$ExternalSyntheticLambda5
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i8 = 2 % 2;
                        int i9 = onExtraCallback + 53;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                        Unit unit = (Unit) DeviceGradeJudgement.onNavigationEvent(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), new Object[]{onwarmupcompleted, (w3b) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())}, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 297827501, -297827501, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted());
                        int i11 = IAuthTabCallback + 21;
                        onExtraCallback = i11 % 128;
                        int i12 = i11 % 2;
                        return unit;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult3, 390, 0, 131066);
                z = z;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult3;
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onWarmupCompleted + 19;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.intro.CreditIntroScreenKt$$ExternalSyntheticLambda6
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                    int i10 = 2 % 2;
                    int i11 = onNavigationEvent + 109;
                    onExtraCallback = i11 % 128;
                    int i12 = i11 % 2;
                    String str2 = str;
                    if (i12 == 0) {
                        return DeviceGradeJudgement.onNavigationEvent(str2, c0064gradeStrategy, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    Unit unitOnNavigationEvent = DeviceGradeJudgement.onNavigationEvent(str2, c0064gradeStrategy, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i13 = 48 / 0;
                    return unitOnNavigationEvent;
                }
            });
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(C0064gradeStrategy.onWarmupCompleted onwarmupcompleted, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onNavigationEvent(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), new Object[]{onwarmupcompleted, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 297827501, -297827501, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted());
    }

    private static final Unit onNavigationEvent(C0064gradeStrategy.onWarmupCompleted onwarmupcompleted, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onNavigationEvent(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), new Object[]{onwarmupcompleted, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 209330561, -209330559, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted());
    }

    private static final Unit onExtraCallback(Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onNavigationEvent(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), new Object[]{function0, u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 1320495463, -1320495462, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted());
    }
}
