package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import im.toss.features.loan.comparison.result.view.LoanComparisonResultWarningNoticeView;
import im.toss.features.loan.home.LoanRefinancingListContentScreenKt$;
import im.toss.features.loan.ui.R;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.QuirkSettingsLoader;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.toPreviewOnlyRange;
import o.y1ExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanHomeService;
import viva.republica.toss.network.model.loan.LoanHomeServiceSummaryResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class installSubPackage {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallbackWithResult;
    private static char[] onNavigationEvent = {32513, 32520, 32523, 32527, 32519, 32514, 32517, 32526, 32529, 32524, 32528, 32515, 32708, 32719, 32522, 32541, 32533, 32531, 32535, 32512, 32532, 32713, 32521};
    private static int onWarmupCompleted = -1184333890;
    private static boolean onExtraCallback = true;
    private static boolean IAuthTabCallback = true;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        setRubIn setrubin = (setRubIn) objArr[0];
        setRubIn setrubin2 = (setRubIn) objArr[1];
        Function0 function0 = (Function0) objArr[2];
        SessionTrackerb sessionTrackerb = (SessionTrackerb) objArr[3];
        String str = (String) objArr[4];
        String str2 = (String) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        ((Number) objArr[8]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted((setRubIn<deleteOldPkgByFullInstall>) setrubin, (setRubIn<Boolean>) setrubin2, (Function0<Unit>) function0, sessionTrackerb, str, str2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 73;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, String str2, LoanHomeService loanHomeService, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        Unit unit = (Unit) onExtraCallbackWithResult(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{str, str2, loanHomeService, setDetectableSize}, 299340644, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -299340644, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
        int i3 = IAuthTabCallbackDefault + 109;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, setDetectableSize);
        if (i3 == 0) {
            int i4 = 0 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function0);
        int i4 = onExtraCallbackWithResult + 81;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(SessionTrackerb sessionTrackerb, Context context, String str, String str2, LoanHomeService loanHomeService) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(sessionTrackerb, context, str, str2, loanHomeService);
        int i4 = onExtraCallbackWithResult + 39;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    private static final Unit IAuthTabCallback(setRubIn setrubin, SessionTrackerb sessionTrackerb, String str, String str2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 83;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallbackWithResult((setRubIn<deleteOldPkgByFullInstall>) setrubin, sessionTrackerb, str, str2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallbackDefault + 61;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(LoanHomeService loanHomeService, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 51;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(loanHomeService, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 41;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(LoanHomeService loanHomeService, SessionTrackerb sessionTrackerb, String str, String str2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 43;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            onExtraCallback(loanHomeService, sessionTrackerb, str, str2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(loanHomeService, sessionTrackerb, str, str2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = IAuthTabCallbackDefault + 53;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(LoanHomeService loanHomeService, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 87;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(loanHomeService, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 81;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1))}, 1267766674, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -1267766663, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
        } else {
            onExtraCallbackWithResult(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1))}, 1267766674, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -1267766663, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallbackWithResult + 27;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 9;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Integer numValueOf = Integer.valueOf(i);
        Integer numValueOf2 = Integer.valueOf(i2);
        if (i5 == 0) {
            return (Unit) onExtraCallbackWithResult(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{numValueOf, cameraCaptureResultEmptyCameraCaptureResult, numValueOf2}, -1514847225, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 1514847229, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return (Unit) onExtraCallbackWithResult(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{str, setDetectableSize}, 68627542, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -68627533, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(SessionTrackerb sessionTrackerb, Context context, String str, String str2, LoanHomeService loanHomeService) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            asInterface(sessionTrackerb, context, str, str2, loanHomeService);
            obj.hashCode();
            throw null;
        }
        Unit unitAsInterface = asInterface(sessionTrackerb, context, str, str2, loanHomeService);
        int i3 = onExtraCallbackWithResult + 13;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return unitAsInterface;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(LoanHomeService loanHomeService, String str, String str2, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(loanHomeService, str, str2, setDetectableSize);
        int i4 = IAuthTabCallbackDefault + 123;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static final Unit onExtraCallback(LoanHomeService loanHomeService, SessionTrackerb sessionTrackerb, String str, String str2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 7;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            onExtraCallbackWithResult(loanHomeService, sessionTrackerb, str, str2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i));
        } else {
            onExtraCallbackWithResult(loanHomeService, sessionTrackerb, str, str2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        }
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallbackDefault + 83;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i5;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i2);
        int i11 = i9 | i10 | (~(i8 | i2));
        int i12 = i10 | i;
        int i13 = ~i2;
        int i14 = (~(i | i13 | i5)) | (~(i7 | i13 | i8)) | (~(i8 | i5 | i2));
        int i15 = i5 + i2 + i4 + ((-1329026341) * i6) + ((-1277752516) * i3);
        int i16 = i15 * i15;
        int i17 = ((1212708917 * i5) - 1912602624) + ((-659060787) * i2) + ((-1871769704) * i11) + (i12 * 935884852) + (935884852 * i14) + (276824064 * i4) + (494927872 * i6) + (1577058304 * i3) + ((-1783103488) * i16);
        int i18 = (i5 * 595972471) + 129777640 + (i2 * 595971967) + (i11 * (-504)) + (i12 * 252) + (i14 * 252) + (i4 * 595972219) + (i6 * (-1341978823)) + (i3 * 731850196) + (i16 * 1869086720);
        switch (i17 + (i18 * i18 * (-846725120))) {
            case 1:
                LoanHomeService loanHomeService = (LoanHomeService) objArr[0];
                String str = (String) objArr[1];
                String str2 = (String) objArr[2];
                SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[3];
                int i19 = 2 % 2;
                int i20 = IAuthTabCallbackDefault + 9;
                onExtraCallbackWithResult = i20 % 128;
                int i21 = i20 % 2;
                Intrinsics.checkNotNullParameter(setDetectableSize, "");
                Object[] objArr2 = new Object[1];
                a(null, null, new byte[]{-119, -120, -121, -122}, Gravity.getAbsoluteGravity(0, 0) + 127, objArr2);
                setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), "jeonse_refinancing");
                setDetectableSize.onExtraCallback("loan_status", loanHomeService.onNavigationEvent());
                Object[] objArr3 = new Object[1];
                a(null, null, new byte[]{-118, -119, -118, -118, -119, -117, -119, -118}, 127 - View.combineMeasuredStates(0, 0), objArr3);
                setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), str);
                setDetectableSize.onExtraCallback("service_referrer", str2);
                Unit unit = Unit.INSTANCE;
                int i22 = onExtraCallbackWithResult + 41;
                IAuthTabCallbackDefault = i22 % 128;
                int i23 = i22 % 2;
                return unit;
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                String str3 = (String) objArr[0];
                String str4 = (String) objArr[1];
                LoanHomeService loanHomeService2 = (LoanHomeService) objArr[2];
                SetDetectableSize setDetectableSize2 = (SetDetectableSize) objArr[3];
                int i24 = 2 % 2;
                int i25 = onExtraCallbackWithResult + 63;
                IAuthTabCallbackDefault = i25 % 128;
                int i26 = i25 % 2;
                Intrinsics.checkNotNullParameter(setDetectableSize2, "");
                Object[] objArr4 = new Object[1];
                a(null, null, new byte[]{-119, -120, -121, -122}, 127 - Color.green(0), objArr4);
                setDetectableSize2.onExtraCallback(((String) objArr4[0]).intern(), "mortgage_refinancing");
                setDetectableSize2.onExtraCallback("service_referrer", str3);
                Object[] objArr5 = new Object[1];
                a(null, null, new byte[]{-118, -119, -118, -118, -119, -117, -119, -118}, 127 - TextUtils.indexOf("", "", 0), objArr5);
                setDetectableSize2.onExtraCallback(((String) objArr5[0]).intern(), str4);
                setDetectableSize2.onExtraCallback("loan_status", loanHomeService2.onExtraCallbackWithResult());
                Unit unit2 = Unit.INSTANCE;
                int i27 = IAuthTabCallbackDefault + 87;
                onExtraCallbackWithResult = i27 % 128;
                int i28 = i27 % 2;
                return unit2;
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                String str5 = (String) objArr[0];
                SetDetectableSize setDetectableSize3 = (SetDetectableSize) objArr[1];
                int i29 = 2 % 2;
                int i30 = IAuthTabCallbackDefault + 109;
                onExtraCallbackWithResult = i30 % 128;
                int i31 = i30 % 2;
                Intrinsics.checkNotNullParameter(setDetectableSize3, "");
                setDetectableSize3.onExtraCallback("menu_entry_id", 11001923L);
                setDetectableSize3.onExtraCallback("service_home", "loan_home");
                Object[] objArr6 = new Object[1];
                a(null, null, new byte[]{-118, -119, -118, -118, -119, -117, -119, -118}, View.getDefaultSize(0, 0) + 127, objArr6);
                setDetectableSize3.onExtraCallback(((String) objArr6[0]).intern(), str5);
                Unit unit3 = Unit.INSTANCE;
                int i32 = onExtraCallbackWithResult + 55;
                IAuthTabCallbackDefault = i32 % 128;
                int i33 = i32 % 2;
                return unit3;
            case 7:
                return IAuthTabCallback(objArr);
            case 8:
                return onWarmupCompleted(objArr);
            case 9:
                String str6 = (String) objArr[0];
                SetDetectableSize setDetectableSize4 = (SetDetectableSize) objArr[1];
                int i34 = 2 % 2;
                int i35 = IAuthTabCallbackDefault + 51;
                onExtraCallbackWithResult = i35 % 128;
                int i36 = i35 % 2;
                Intrinsics.checkNotNullParameter(setDetectableSize4, "");
                setDetectableSize4.onExtraCallback("menu_entry_id", 11001420L);
                setDetectableSize4.onExtraCallback("service_home", "loan_home");
                Object[] objArr7 = new Object[1];
                a(null, null, new byte[]{-118, -119, -118, -118, -119, -117, -119, -118}, 127 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr7);
                setDetectableSize4.onExtraCallback(((String) objArr7[0]).intern(), str6);
                Unit unit4 = Unit.INSTANCE;
                int i37 = IAuthTabCallbackDefault + 25;
                onExtraCallbackWithResult = i37 % 128;
                int i38 = i37 % 2;
                return unit4;
            case 10:
                return asInterface(objArr);
            case 11:
                return IAuthTabCallbackDefault(objArr);
            default:
                String str7 = (String) objArr[0];
                String str8 = (String) objArr[1];
                LoanHomeService loanHomeService3 = (LoanHomeService) objArr[2];
                SetDetectableSize setDetectableSize5 = (SetDetectableSize) objArr[3];
                int i39 = 2 % 2;
                int i40 = IAuthTabCallbackDefault + 35;
                onExtraCallbackWithResult = i40 % 128;
                int i41 = i40 % 2;
                Intrinsics.checkNotNullParameter(setDetectableSize5, "");
                Object[] objArr8 = new Object[1];
                a(null, null, new byte[]{-119, -120, -121, -122}, 127 - TextUtils.getCapsMode("", 0, 0), objArr8);
                setDetectableSize5.onExtraCallback(((String) objArr8[0]).intern(), "refinancing");
                setDetectableSize5.onExtraCallback("service_referrer", str7);
                Object[] objArr9 = new Object[1];
                a(null, null, new byte[]{-118, -119, -118, -118, -119, -117, -119, -118}, 127 - TextUtils.getOffsetAfter("", 0), objArr9);
                setDetectableSize5.onExtraCallback(((String) objArr9[0]).intern(), str8);
                setDetectableSize5.onExtraCallback("loan_status", loanHomeService3.onExtraCallbackWithResult());
                Unit unit5 = Unit.INSTANCE;
                int i42 = onExtraCallbackWithResult + 81;
                IAuthTabCallbackDefault = i42 % 128;
                int i43 = i42 % 2;
                return unit5;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        LoanHomeService loanHomeService = (LoanHomeService) objArr[0];
        w5a w5aVar = (w5a) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onTransact(loanHomeService, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        onTransact(loanHomeService, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, String str2, LoanHomeService loanHomeService, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onExtraCallbackWithResult(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{str, str2, loanHomeService, setDetectableSize}, -414349106, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 414349109, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
        int i3 = IAuthTabCallbackDefault + 105;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SessionTrackerb sessionTrackerb, Context context, String str, String str2, LoanHomeService loanHomeService) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(sessionTrackerb, context, str, str2, loanHomeService);
        int i4 = IAuthTabCallbackDefault + 113;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanHomeService loanHomeService, String str, String str2, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(loanHomeService, str, str2, setDetectableSize);
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
        int i5 = onExtraCallbackWithResult + 5;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanHomeService loanHomeService, SessionTrackerb sessionTrackerb, String str, String str2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 51;
        IAuthTabCallbackDefault = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            onTransact(loanHomeService, sessionTrackerb, str, str2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            throw null;
        }
        Unit unitOnTransact = onTransact(loanHomeService, sessionTrackerb, str, str2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onExtraCallbackWithResult + 69;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnTransact;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        LoanHomeService loanHomeService = (LoanHomeService) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[3];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr2 = {loanHomeService, str, str2, setDetectableSize};
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onExtraCallbackWithResult(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{loanHomeService, str, str2, setDetectableSize}, 98947711, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -98947710, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
        int i3 = onExtraCallbackWithResult + 25;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 99 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, String str2, LoanHomeService loanHomeService, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, str2, loanHomeService, setDetectableSize);
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 63;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return (Unit) onExtraCallbackWithResult(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{str, setDetectableSize}, -546132883, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 546132889, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
        }
        Unit unit = (Unit) onExtraCallbackWithResult(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{str, setDetectableSize}, -546132883, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 546132889, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
        int i3 = 16 / 0;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanHomeService loanHomeService, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 21;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(loanHomeService, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 49 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanHomeService loanHomeService, SessionTrackerb sessionTrackerb, String str, String str2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 117;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(loanHomeService, sessionTrackerb, str, str2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallbackWithResult + 85;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    private static final Unit onTransact(LoanHomeService loanHomeService, SessionTrackerb sessionTrackerb, String str, String str2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 5;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(loanHomeService, sessionTrackerb, str, str2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 57;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        Function0 function0 = (Function0) objArr[1];
        setRubIn setrubin = (setRubIn) objArr[2];
        SessionTrackerb sessionTrackerb = (SessionTrackerb) objArr[3];
        String str = (String) objArr[4];
        String str2 = (String) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(zBooleanValue, function0, setrubin, sessionTrackerb, str, str2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = IAuthTabCallbackDefault + 121;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(setRubIn setrubin, SessionTrackerb sessionTrackerb, String str, String str2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 69;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            IAuthTabCallback(setrubin, sessionTrackerb, str, str2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(setrubin, sessionTrackerb, str, str2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = onExtraCallbackWithResult + 65;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(setRubIn setrubin, SessionTrackerb sessionTrackerb, String str, String str2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 91;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(setrubin, sessionTrackerb, str, str2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackDefault + 67;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(setRubIn setrubin, setRubIn setrubin2, Function0 function0, SessionTrackerb sessionTrackerb, String str, String str2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 45;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return (Unit) onExtraCallbackWithResult(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{setrubin, setrubin2, function0, sessionTrackerb, str, str2, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, 2047182829, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -2047182822, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
        }
        int i5 = 55 / 0;
        return (Unit) onExtraCallbackWithResult(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{setrubin, setrubin2, function0, sessionTrackerb, str, str2, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, 2047182829, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -2047182822, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanHomeService loanHomeService, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 91;
        IAuthTabCallbackDefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            IAuthTabCallbackStub(loanHomeService, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(loanHomeService, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallbackDefault + 53;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallbackStub;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(LoanHomeService loanHomeService, SessionTrackerb sessionTrackerb, String str, String str2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 99;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {loanHomeService, sessionTrackerb, str, str2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))};
        onExtraCallbackWithResult(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), objArr, -589462336, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 589462346, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallbackDefault + 43;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanHomeService loanHomeService, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 35;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return onExtraCallback(loanHomeService, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallback(loanHomeService, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(Function0 function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 37 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(setRubIn setrubin, SessionTrackerb sessionTrackerb, String str, String str2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        String strIntern;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onExtraCallbackWithResult + 39;
            IAuthTabCallbackDefault = i3 % 128;
            z = i3 % 2 != 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-413900049, i, -1, "im.toss.features.loan.home.LoanRefinancingListContentScreen.<anonymous>.<anonymous> (LoanRefinancingListContentScreen.kt:56)");
                int i4 = onExtraCallbackWithResult + 55;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
            }
            Object obj = null;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = UseTorchAsFlashQuirk.onExtraCallback(setContentInsetsAbsolute.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResult, 0, 1), false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null), StillCaptureFlashStopRepeatingQuirk.onExtraCallback(ZslDisablerQuirk.onExtraCallback(PreviewOrientationIncorrectQuirk.Companion, cameraCaptureResultEmptyCameraCaptureResult, 6), TorchIsClosedAfterImageCapturingQuirk.Companion.onWarmupCompleted()));
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i6 = onExtraCallbackWithResult + 5;
                IAuthTabCallbackDefault = i6 % 128;
                if (i6 % 2 == 0) {
                    getAwbState.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                int i7 = IAuthTabCallbackDefault + 93;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            onExtraCallbackWithResult(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{cameraCaptureResultEmptyCameraCaptureResult, 0}, 1267766674, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -1267766663, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
            if (str == null) {
                Object[] objArr = new Object[1];
                a(null, null, new byte[]{-126, -123, -124, -126, -125, -126, -127}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 127, objArr);
                strIntern = ((String) objArr[0]).intern();
            } else {
                strIntern = str;
            }
            onExtraCallbackWithResult((setRubIn<deleteOldPkgByFullInstall>) setrubin, sessionTrackerb, strIntern, str2, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onExtraCallbackWithResult + 21;
                IAuthTabCallbackDefault = i9 % 128;
                if (i9 % 2 == 0) {
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(boolean z, Function0 function0, setRubIn setrubin, SessionTrackerb sessionTrackerb, String str, String str2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i3 = onExtraCallbackWithResult + 103;
            IAuthTabCallbackDefault = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = IAuthTabCallbackDefault + 111;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1758417561, i, -1, "im.toss.features.loan.home.LoanRefinancingListContentScreen.<anonymous> (LoanRefinancingListContentScreen.kt:52)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1758417561, i, -1, "im.toss.features.loan.home.LoanRefinancingListContentScreen.<anonymous> (LoanRefinancingListContentScreen.kt:52)");
                int i5 = IAuthTabCallbackDefault + 7;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent) {
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda9 externalSyntheticLambda9 = new LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda9(function0);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda9);
                    obj2 = externalSyntheticLambda9;
                }
                LottieDrawableExternalSyntheticLambda2.onExtraCallback(z, (QuirksExternalSyntheticBackport0) null, false, false, 0.0f, 0, (LottieDrawableExternalSyntheticLambda3) null, (Function0) obj2, ForwardingCameraControl.onExtraCallback(-413900049, true, new LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda10(setrubin, sessionTrackerb, str, str2), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 100663296, 126);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i7 = IAuthTabCallbackDefault + 25;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@NotNull setRubIn<deleteOldPkgByFullInstall> setrubin, @NotNull setRubIn<Boolean> setrubin2, @NotNull Function0<Unit> function0, @NotNull SessionTrackerb sessionTrackerb, @Nullable String str, @Nullable String str2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        Intrinsics.checkNotNullParameter(setrubin, "");
        Intrinsics.checkNotNullParameter(setrubin2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(sessionTrackerb, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1461407503);
        if ((i & 6) == 0) {
            int i9 = onExtraCallbackWithResult + 93;
            IAuthTabCallbackDefault = i9 % 128;
            int i10 = i9 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(setrubin)) {
                int i11 = IAuthTabCallbackDefault + 105;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            int i13 = IAuthTabCallbackDefault + 13;
            onExtraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i15 = onExtraCallbackWithResult + 19;
            IAuthTabCallbackDefault = i15 % 128;
            if (i15 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(setrubin2);
                throw null;
            }
            i2 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(setrubin2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0))) {
                int i16 = onExtraCallbackWithResult + 43;
                IAuthTabCallbackDefault = i16 % 128;
                i6 = i16 % 2 == 0 ? 18322 : 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(sessionTrackerb)) {
                int i17 = onExtraCallbackWithResult + 31;
                IAuthTabCallbackDefault = i17 % 128;
                int i18 = i17 % 2;
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                int i19 = onExtraCallbackWithResult + 69;
                IAuthTabCallbackDefault = i19 % 128;
                int i20 = i19 % 2;
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            int i21 = onExtraCallbackWithResult + 109;
            IAuthTabCallbackDefault = i21 % 128;
            if (i21 % 2 == 0) {
                int i22 = 80 / 0;
                i3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 131072 : 65536;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2)) {
            }
            i2 |= i3;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i2) != 74898, i2 & 1)) {
            int i23 = IAuthTabCallbackDefault + 59;
            onExtraCallbackWithResult = i23 % 128;
            int i24 = i23 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1461407503, i2, -1, "im.toss.features.loan.home.LoanRefinancingListContentScreen (LoanRefinancingListContentScreen.kt:49)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(1758417561, true, new LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda11(((Boolean) AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(setrubin2, (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i2 >> 3) & 14, 7).onExtraCallbackWithResult()).booleanValue(), function0, setrubin, sessionTrackerb, str, str2), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i25 = IAuthTabCallbackDefault + 107;
                onExtraCallbackWithResult = i25 % 128;
                int i26 = i25 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda12(setrubin, setrubin2, function0, sessionTrackerb, str, str2, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(setRubIn<deleteOldPkgByFullInstall> setrubin, SessionTrackerb sessionTrackerb, String str, String str2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws Throwable {
        int i3;
        String str3;
        boolean z;
        String str4;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        String str5;
        Object next;
        Object next2;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-111981243);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(setrubin) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(sessionTrackerb) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 256 : 128;
        } else {
            int i5 = onExtraCallbackWithResult + 123;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                str3 = str2;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170) {
                int i8 = onExtraCallbackWithResult + 99;
                IAuthTabCallbackDefault = i8 % 128;
                z = i8 % 2 != 0;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                str4 = str3;
            } else {
                int i9 = IAuthTabCallbackDefault;
                int i10 = i9 + 45;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                Object obj = null;
                if (i7 != 0) {
                    int i12 = i9 + 43;
                    onExtraCallbackWithResult = i12 % 128;
                    if (i12 % 2 != 0) {
                        int i13 = 41 / 0;
                    }
                    str5 = null;
                } else {
                    str5 = str3;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i14 = onExtraCallbackWithResult + 85;
                    IAuthTabCallbackDefault = i14 % 128;
                    int i15 = i14 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-111981243, i3, -1, "im.toss.features.loan.home.RefinancingList (LoanRefinancingListContentScreen.kt:81)");
                }
                deleteOldPkgByFullInstall deleteoldpkgbyfullinstall = (deleteOldPkgByFullInstall) AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(setrubin, (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i3 & 14, 7).onExtraCallbackWithResult();
                if (!deleteoldpkgbyfullinstall.onNavigationEvent().IAuthTabCallback().isEmpty()) {
                    int i16 = onExtraCallbackWithResult + 113;
                    IAuthTabCallbackDefault = i16 % 128;
                    if (i16 % 2 == 0) {
                        deleteoldpkgbyfullinstall.onNavigationEvent().IAuthTabCallback().iterator();
                        obj.hashCode();
                        throw null;
                    }
                    Iterator it = deleteoldpkgbyfullinstall.onNavigationEvent().IAuthTabCallback().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            int i17 = onExtraCallbackWithResult + 113;
                            IAuthTabCallbackDefault = i17 % 128;
                            int i18 = i17 % 2;
                            next = it.next();
                            if (((LoanHomeService) next).IAuthTabCallback() == ImagePipelineExperimentsBuilderExternalSyntheticLambda23.REFINANCING_LOAN) {
                                break;
                            }
                        } else {
                            int i19 = onExtraCallbackWithResult + 39;
                            IAuthTabCallbackDefault = i19 % 128;
                            if (i19 % 2 == 0) {
                                int i20 = 5 / 2;
                            }
                            next = null;
                        }
                    }
                    LoanHomeService loanHomeService = (LoanHomeService) next;
                    if (loanHomeService == null) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-180341526);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-180341525);
                        onExtraCallbackWithResult(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{loanHomeService, sessionTrackerb, str, str5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i3 & 8176)}, -589462336, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 589462346, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    }
                    Iterator it2 = deleteoldpkgbyfullinstall.onNavigationEvent().IAuthTabCallback().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        } else {
                            next2 = it2.next();
                            if (((LoanHomeService) next2).IAuthTabCallback() == ImagePipelineExperimentsBuilderExternalSyntheticLambda23.MORTGAGE_REFINANCING) {
                                break;
                            }
                        }
                    }
                    LoanHomeService loanHomeService2 = (LoanHomeService) next2;
                    if (loanHomeService2 == null) {
                        int i21 = IAuthTabCallbackDefault + 71;
                        onExtraCallbackWithResult = i21 % 128;
                        int i22 = i21 % 2;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-180049816);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-180049815);
                        IAuthTabCallback(loanHomeService2, sessionTrackerb, str, str5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i3 & 8176);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    }
                    Iterator it3 = deleteoldpkgbyfullinstall.onNavigationEvent().IAuthTabCallback().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next3 = it3.next();
                        if (((LoanHomeService) next3).IAuthTabCallback() == ImagePipelineExperimentsBuilderExternalSyntheticLambda23.JEONSE_REFINANCING) {
                            obj = next3;
                            break;
                        }
                    }
                    LoanHomeService loanHomeService3 = (LoanHomeService) obj;
                    if (loanHomeService3 == null) {
                        int i23 = onExtraCallbackWithResult + 45;
                        IAuthTabCallbackDefault = i23 % 128;
                        int i24 = i23 % 2;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-179758230);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-179758229);
                        onExtraCallbackWithResult(loanHomeService3, sessionTrackerb, str, str5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i3 & 8176);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    }
                }
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                str4 = str5;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda1(setrubin, sessionTrackerb, str, str4, i, i2));
                return;
            }
            return;
        }
        i3 |= 3072;
        str3 = str2;
        if ((i3 & 1171) == 1170) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onNavigationEvent;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 77 - View.getDefaultSize(0, 0), 20951 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i3++;
                    int i4 = $10 + 121;
                    $11 = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 5 % 5;
                    }
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 75 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 16037 - (ViewConfiguration.getTouchSlop() >> 8), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            int i6 = 1052772399;
            if (IAuthTabCallback) {
                int i7 = $11 + 15;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i9 = $11 + 83;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (ViewConfiguration.getWindowTouchSlop() >> 8) + 63, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i6 = 1052772399;
                }
                String str = new String(cArr4);
                int i11 = $11 + 37;
                $10 = i11 % 128;
                if (i11 % 2 == 0) {
                    objArr[0] = str;
                    return;
                } else {
                    int i12 = 91 / 0;
                    objArr[0] = str;
                    return;
                }
            }
            if (!onExtraCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            int i13 = $11 + 115;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 4 / 3;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i15 = $10 + 45;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 63 - Color.blue(0), View.getDefaultSize(0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private static final Unit onExtraCallbackWithResult(LoanHomeService loanHomeService, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = IAuthTabCallbackDefault + 45;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 5;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1338877150, i, -1, "im.toss.features.loan.home.RefinancingListJeonse.<anonymous>.<anonymous> (LoanRefinancingListContentScreen.kt:178)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            int i8 = R.string.loan_refinancing_lowest_interest;
            LoanHomeServiceSummaryResult loanHomeServiceSummaryResultOnWarmupCompleted = loanHomeService.onWarmupCompleted();
            Intrinsics.checkNotNull(loanHomeServiceSummaryResultOnWarmupCompleted);
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(i8, new Object[]{loanHomeServiceSummaryResultOnWarmupCompleted.onNavigationEvent()}, cameraCaptureResultEmptyCameraCaptureResult, 0), quirksExternalSyntheticBackport0OnExtraCallback, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 48, 0, 131060}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i9 = onExtraCallbackWithResult + 65;
                IAuthTabCallbackDefault = i9 % 128;
                int i10 = i9 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(LoanHomeService loanHomeService, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        getBacktraceNote getbacktracenoteWriteTypedObject;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
        }
        if ((i & 19) != 18) {
            int i4 = IAuthTabCallbackDefault + 11;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-947597413, i, -1, "im.toss.features.loan.home.RefinancingListJeonse.<anonymous> (LoanRefinancingListContentScreen.kt:146)");
                int i6 = IAuthTabCallbackDefault + 19;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
            }
            if (loanHomeService.onWarmupCompleted() == null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(945589596);
                if (loanHomeService.onNavigationEvent() == ImagePipelineExperimentsBuilderExternalSyntheticLambda8.INIT) {
                    int i8 = onExtraCallbackWithResult + 21;
                    IAuthTabCallbackDefault = i8 % 128;
                    if (i8 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(945634205);
                        getbacktracenoteWriteTypedObject = ResourceLoadExtension1.onNavigationEvent.writeTypedObject();
                        i2 = ((i / 3) & 58) | 3;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(945634205);
                        getbacktracenoteWriteTypedObject = ResourceLoadExtension1.onNavigationEvent.writeTypedObject();
                        i2 = ((i << 3) & 112) | 6;
                    }
                    w5aVar.onWarmupCompleted(getbacktracenoteWriteTypedObject, cameraCaptureResultEmptyCameraCaptureResult, i2);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(946009119);
                    ResourceLoadExtension1 resourceLoadExtension1 = ResourceLoadExtension1.onNavigationEvent;
                    w5a.onExtraCallback(new Object[]{w5aVar, resourceLoadExtension1.onTransact(), resourceLoadExtension1.asBinder(), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i << 6) & 896) | 54)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1616849278, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1616849279, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(946703395);
                w5a.onExtraCallback(new Object[]{w5aVar, ResourceLoadExtension1.onNavigationEvent.getInterfaceDescriptor(), ForwardingCameraControl.onExtraCallback(-1338877150, true, new LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda22(loanHomeService), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i << 6) & 896) | 54)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1616849278, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1616849279, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = IAuthTabCallbackDefault + 41;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i10 = IAuthTabCallbackDefault + 31;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("menu_entry_id", 11001939L);
        setDetectableSize.onExtraCallback("service_home", "loan_home");
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-118, -119, -118, -118, -119, -117, -119, -118}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 126, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 99;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallback(String str, String str2, LoanHomeService loanHomeService, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-119, -120, -121, -122}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "jeonse_refinancing");
        setDetectableSize.onExtraCallback("service_referrer", str);
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-118, -119, -118, -118, -119, -117, -119, -118}, 127 - Color.green(0), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str2);
        setDetectableSize.onExtraCallback("loan_status", loanHomeService.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 77;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(SessionTrackerb sessionTrackerb, Context context, String str, String str2, LoanHomeService loanHomeService) throws Throwable {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1285163L, false, (String) null, (Map) null, new LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda6(str), 14, (Object) null);
        ConvertByteArrayToFloatArray.onExtraCallback(1325527L, false, (String) null, (Map) null, new LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda7(str2, str, loanHomeService), 14, (Object) null);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-109, -126, -111, -110, -126, -112, -126, -111, -117, -119, -118, -106, -126, -112, -124, -113, -106, -119, -116, -126, -124, -119, -107, -114, -114, -115, -116, -116, -124, -122, -119, -110, -111, -108, -118, -119, -116}, 126 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-118, -119, -118, -118, -119, -117, -119, -118}, 126 - MotionEvent.axisFromString(""), objArr2);
        SessionTrackerb.onExtraCallbackWithResult(sessionTrackerb, context, convertAnyToMap.IAuthTabCallback(strIntern, ((String) objArr2[0]).intern(), str), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallbackWithResult + 27;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b A[PHI: r0
      0x003b: PHI (r0v61 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v62 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x002d, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[PHI: r0
      0x002f: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v62 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x002d, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(LoanHomeService loanHomeService, SessionTrackerb sessionTrackerb, String str, String str2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
        Object obj;
        boolean z;
        boolean z2;
        boolean zOnExtraCallback;
        boolean zOnExtraCallback2;
        boolean zOnExtraCallback3;
        int i3;
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 1;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1665122376);
            if ((i & 122) == 0) {
                i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(loanHomeService) ? 4 : 2) | i;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i2 = i;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1665122376);
            if ((i & 6) == 0) {
            }
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(sessionTrackerb)) {
                int i6 = IAuthTabCallbackDefault + 53;
                onExtraCallbackWithResult = i6 % 128;
                i3 = i6 % 2 != 0 ? 95 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(str2) ? 2048 : 1024;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i2 & 1171) != 1170, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult2;
            cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackStubProxy();
            int i7 = IAuthTabCallbackDefault + 57;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 4 / 2;
            }
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1665122376, i2, -1, "im.toss.features.loan.home.RefinancingListJeonse (LoanRefinancingListContentScreen.kt:119)");
            }
            boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(loanHomeService);
            int i9 = i2 & 896;
            boolean z3 = i9 == 256;
            int i10 = i2 & 7168;
            boolean z4 = i10 == 2048;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
            if (!(!(zOnExtraCallback4 | z3 | z4))) {
                LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda13 externalSyntheticLambda13 = new LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda13(loanHomeService, str, str2);
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(externalSyntheticLambda13);
                obj = externalSyntheticLambda13;
                ConvertByteArrayToFloatArray.onExtraCallback(1483679L, false, (String) null, (Map) null, (Function1) obj, 14, (Object) null);
                Context context = (Context) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(-947597413, true, new LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda14(loanHomeService), cameraCaptureResultEmptyCameraCaptureResult2, 54);
                getBacktraceNote getbacktracenoteIAuthTabCallbackDefault = ResourceLoadExtension1.onNavigationEvent.IAuthTabCallbackDefault();
                z = i9 != 256;
                z2 = i10 != 2048;
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(loanHomeService);
                zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(sessionTrackerb);
                zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(context);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                if (z | z2 | zOnExtraCallback | zOnExtraCallback2 | zOnExtraCallback3) {
                    int i11 = onExtraCallbackWithResult + 23;
                    IAuthTabCallbackDefault = i11 % 128;
                    if (i11 % 2 == 0) {
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    Object obj3 = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda15 externalSyntheticLambda15 = new LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda15(sessionTrackerb, context, str, str2, loanHomeService);
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(externalSyntheticLambda15);
                        obj3 = externalSyntheticLambda15;
                    }
                    Float fValueOf = Float.valueOf(0.0f);
                    cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult2;
                    w4.onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{encoderProfilesProxyVideoProfileProxyOnExtraCallback, true, null, getbacktracenoteIAuthTabCallbackDefault, null, null, null, null, null, fValueOf, null, null, null, null, null, (Function0) obj3, null, null, cameraCaptureResultEmptyCameraCaptureResult3, 3126, 0, 229364}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1882733109, -1882733101);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                ConvertByteArrayToFloatArray.onExtraCallback(1483679L, false, (String) null, (Map) null, (Function1) obj, 14, (Object) null);
                Context context2 = (Context) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(-947597413, true, new LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda14(loanHomeService), cameraCaptureResultEmptyCameraCaptureResult2, 54);
                getBacktraceNote getbacktracenoteIAuthTabCallbackDefault2 = ResourceLoadExtension1.onNavigationEvent.IAuthTabCallbackDefault();
                if (i9 != 256) {
                }
                if (i10 != 2048) {
                }
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(loanHomeService);
                zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(sessionTrackerb);
                zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(context2);
                Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                if (z | z2 | zOnExtraCallback | zOnExtraCallback2 | zOnExtraCallback3) {
                }
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda16(loanHomeService, sessionTrackerb, str, str2, i));
        }
    }

    private static final Unit IAuthTabCallbackDefault(LoanHomeService loanHomeService, String str, String str2, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-119, -120, -121, -122}, 127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "mortgage_refinancing");
        setDetectableSize.onExtraCallback("loan_status", loanHomeService.onNavigationEvent());
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-118, -119, -118, -118, -119, -117, -119, -118}, View.resolveSize(0, 0) + 127, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str);
        setDetectableSize.onExtraCallback("service_referrer", str2);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 5;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(LoanHomeService loanHomeService, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 51;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallbackWithResult + 101;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1709280238, i, -1, "im.toss.features.loan.home.RefinancingListMortgage.<anonymous>.<anonymous> (LoanRefinancingListContentScreen.kt:274)");
                    int i6 = 45 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1709280238, i, -1, "im.toss.features.loan.home.RefinancingListMortgage.<anonymous>.<anonymous> (LoanRefinancingListContentScreen.kt:274)");
                }
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            int i7 = R.string.loan_refinancing_lowest_interest;
            LoanHomeServiceSummaryResult loanHomeServiceSummaryResultOnWarmupCompleted = loanHomeService.onWarmupCompleted();
            Intrinsics.checkNotNull(loanHomeServiceSummaryResultOnWarmupCompleted);
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(i7, new Object[]{loanHomeServiceSummaryResultOnWarmupCompleted.onNavigationEvent()}, cameraCaptureResultEmptyCameraCaptureResult, 0), quirksExternalSyntheticBackport0OnExtraCallback, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 48, 0, 131060}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onTransact(LoanHomeService loanHomeService, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 47;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 29) == 0) {
                i |= !cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 2 : 4;
            }
        } else {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i & 19) != 18) {
            int i4 = IAuthTabCallbackDefault + 85;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onExtraCallbackWithResult + 123;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(648392267, i, -1, "im.toss.features.loan.home.RefinancingListMortgage.<anonymous> (LoanRefinancingListContentScreen.kt:242)");
                int i8 = onExtraCallbackWithResult + 121;
                IAuthTabCallbackDefault = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 5 / 4;
                }
            }
            if (loanHomeService.onWarmupCompleted() == null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1786179322);
                if (loanHomeService.onNavigationEvent() == ImagePipelineExperimentsBuilderExternalSyntheticLambda8.INIT) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1786224148);
                    w5aVar.onWarmupCompleted(ResourceLoadExtension1.onNavigationEvent.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1786592118);
                    ResourceLoadExtension1 resourceLoadExtension1 = ResourceLoadExtension1.onNavigationEvent;
                    w5a.onExtraCallback(new Object[]{w5aVar, resourceLoadExtension1.IAuthTabCallback_Parcel(), resourceLoadExtension1.asInterface(), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i << 6) & 896) | 54)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1616849278, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1616849279, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1787279450);
                w5a.onExtraCallback(new Object[]{w5aVar, ResourceLoadExtension1.onNavigationEvent.access100(), ForwardingCameraControl.onExtraCallback(-1709280238, true, new LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda17(loanHomeService), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i << 6) & 896) | 54)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1616849278, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1616849279, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i10 = onExtraCallbackWithResult + 25;
            IAuthTabCallbackDefault = i10 % 128;
            int i11 = i10 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(SessionTrackerb sessionTrackerb, Context context, String str, String str2, LoanHomeService loanHomeService) throws Throwable {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1325527L, false, (String) null, (Map) null, new LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda20(str2, str, loanHomeService), 14, (Object) null);
        ConvertByteArrayToFloatArray.onExtraCallback(1285163L, false, (String) null, (Map) null, new LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda21(str), 14, (Object) null);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-109, -126, -111, -110, -126, -112, -126, -111, -117, -119, -118, -106, -126, -112, -124, -113, -106, -119, -109, -112, -109, -122, -118, -124, -105, -114, -114, -115, -116, -116, -124, -122, -119, -110, -111, -108, -118, -119, -116}, 127 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-118, -119, -118, -118, -119, -117, -119, -118}, 127 - Drawable.resolveOpacity(0, 0), objArr2);
        SessionTrackerb.onExtraCallbackWithResult(sessionTrackerb, context, convertAnyToMap.IAuthTabCallback(strIntern, ((String) objArr2[0]).intern(), str), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackDefault + 37;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IAuthTabCallback(LoanHomeService loanHomeService, SessionTrackerb sessionTrackerb, String str, String str2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        boolean z;
        int i3;
        int i4;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1698329816);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(loanHomeService) ? 4 : 2) | i;
            int i6 = IAuthTabCallbackDefault + 71;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(sessionTrackerb)) {
                int i8 = IAuthTabCallbackDefault + 31;
                onExtraCallbackWithResult = i8 % 128;
                i4 = i8 % 2 != 0 ? 80 : 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            int i9 = IAuthTabCallbackDefault + 3;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2)) {
                i3 = 1024;
            } else {
                int i11 = onExtraCallbackWithResult + 23;
                IAuthTabCallbackDefault = i11 % 128;
                int i12 = i11 % 2;
                i3 = 2048;
            }
            i2 |= i3;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 1171) != 1170, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = IAuthTabCallbackDefault + 55;
                onExtraCallbackWithResult = i13 % 128;
                if (i13 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1698329816, i2, -1, "im.toss.features.loan.home.RefinancingListMortgage (LoanRefinancingListContentScreen.kt:215)");
                    int i14 = 56 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1698329816, i2, -1, "im.toss.features.loan.home.RefinancingListMortgage (LoanRefinancingListContentScreen.kt:215)");
                }
            }
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(loanHomeService);
            int i15 = i2 & 896;
            boolean z2 = i15 == 256;
            int i16 = i2 & 7168;
            boolean z3 = i16 == 2048;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!(zOnExtraCallback | z2 | z3)) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda2 externalSyntheticLambda2 = new LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda2(loanHomeService, str, str2);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda2);
                    obj = externalSyntheticLambda2;
                }
                ConvertByteArrayToFloatArray.onExtraCallback(1483679L, false, (String) null, (Map) null, (Function1) obj, 14, (Object) null);
                Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(648392267, true, new LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda3(loanHomeService), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                getBacktraceNote getbacktracenoteOnExtraCallbackWithResult = ResourceLoadExtension1.onNavigationEvent.onExtraCallbackWithResult();
                if (i16 == 2048) {
                    int i17 = onExtraCallbackWithResult + 125;
                    IAuthTabCallbackDefault = i17 % 128;
                    int i18 = i17 % 2;
                    z = true;
                } else {
                    z = false;
                }
                boolean z4 = i15 == 256;
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(loanHomeService);
                boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(sessionTrackerb);
                boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(context);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!(z | z4 | zOnExtraCallback2 | zOnExtraCallback3 | zOnExtraCallback4)) {
                    Object obj2 = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda4 externalSyntheticLambda4 = new LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda4(sessionTrackerb, context, str, str2, loanHomeService);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda4);
                        obj2 = externalSyntheticLambda4;
                    }
                    Float fValueOf = Float.valueOf(0.0f);
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    w4.onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{encoderProfilesProxyVideoProfileProxyOnExtraCallback, true, null, getbacktracenoteOnExtraCallbackWithResult, null, null, null, null, null, fValueOf, null, null, null, null, null, (Function0) obj2, null, null, cameraCaptureResultEmptyCameraCaptureResult2, 3126, 0, 229364}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1882733109, -1882733101);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i19 = IAuthTabCallbackDefault + 115;
                        onExtraCallbackWithResult = i19 % 128;
                        if (i19 % 2 != 0) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda5(loanHomeService, sessionTrackerb, str, str2, i));
        }
    }

    private static final Unit onNavigationEvent(LoanHomeService loanHomeService, String str, String str2, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-119, -120, -121, -122}, (ViewConfiguration.getLongPressTimeout() >> 16) + 127, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "refinancing");
        setDetectableSize.onExtraCallback("loan_status", loanHomeService.onNavigationEvent());
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-118, -119, -118, -118, -119, -117, -119, -118}, 128 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str);
        setDetectableSize.onExtraCallback("service_referrer", str2);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 61;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(LoanHomeService loanHomeService, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = IAuthTabCallbackDefault + 27;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(312134191, i, -1, "im.toss.features.loan.home.RefinancingListCredit.<anonymous>.<anonymous> (LoanRefinancingListContentScreen.kt:370)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            int i5 = R.string.loan_refinancing_lowest_interest;
            LoanHomeServiceSummaryResult loanHomeServiceSummaryResultOnWarmupCompleted = loanHomeService.onWarmupCompleted();
            Intrinsics.checkNotNull(loanHomeServiceSummaryResultOnWarmupCompleted);
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(i5, new Object[]{loanHomeServiceSummaryResultOnWarmupCompleted.onNavigationEvent()}, cameraCaptureResultEmptyCameraCaptureResult, 0), quirksExternalSyntheticBackport0OnExtraCallback, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 48, 0, 131060}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = IAuthTabCallbackDefault + 23;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i7 = 30 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i8 = IAuthTabCallbackDefault + 55;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(LoanHomeService loanHomeService, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
        }
        if ((i & 19) != 18) {
            int i3 = IAuthTabCallbackDefault + 19;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(703413928, i, -1, "im.toss.features.loan.home.RefinancingListCredit.<anonymous> (LoanRefinancingListContentScreen.kt:338)");
            }
            if (loanHomeService.onWarmupCompleted() == null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(258975411);
                if (loanHomeService.onNavigationEvent() == ImagePipelineExperimentsBuilderExternalSyntheticLambda8.INIT) {
                    int i5 = onExtraCallbackWithResult + 53;
                    IAuthTabCallbackDefault = i5 % 128;
                    int i6 = i5 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(259020082);
                    w5aVar.onWarmupCompleted(ResourceLoadExtension1.onNavigationEvent.onExtraCallback(), cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(259393012);
                    ResourceLoadExtension1 resourceLoadExtension1 = ResourceLoadExtension1.onNavigationEvent;
                    w5a.onExtraCallback(new Object[]{w5aVar, resourceLoadExtension1.IAuthTabCallbackStub(), resourceLoadExtension1.access000(), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i << 6) & 896) | 54)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1616849278, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1616849279, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(260085304);
                w5a.onExtraCallback(new Object[]{w5aVar, ResourceLoadExtension1.onNavigationEvent.IAuthTabCallback(), ForwardingCameraControl.onExtraCallback(312134191, true, new LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda8(loanHomeService), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i << 6) & 896) | 54)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1616849278, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1616849279, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(SessionTrackerb sessionTrackerb, Context context, String str, String str2, LoanHomeService loanHomeService) throws Throwable {
        int i = 2 % 2;
        Object obj = null;
        ConvertByteArrayToFloatArray.onExtraCallback(1285163L, false, (String) null, (Map) null, new LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda18(str), 14, (Object) null);
        ConvertByteArrayToFloatArray.onExtraCallback(1325527L, false, (String) null, (Map) null, new LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda19(str2, str, loanHomeService), 14, (Object) null);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-109, -126, -111, -110, -126, -112, -126, -111, -117, -119, -118, -114, -126, -112, -124, -113, -114, -114, -115, -116, -116, -124, -122, -118, -119, -120, -127, -116}, 127 - Drawable.resolveOpacity(0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-118, -119, -118, -118, -119, -117, -119, -118}, TextUtils.lastIndexOf("", '0', 0) + 128, objArr2);
        SessionTrackerb.onExtraCallbackWithResult(sessionTrackerb, context, convertAnyToMap.IAuthTabCallback(strIntern, ((String) objArr2[0]).intern(), str), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackDefault + 85;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0051 A[PHI: r4
      0x0051: PHI (r4v42 o.CameraCaptureResultEmptyCameraCaptureResult) = (r4v2 o.CameraCaptureResultEmptyCameraCaptureResult), (r4v43 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0044, B:5:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046 A[PHI: r4
      0x0046: PHI (r4v3 o.CameraCaptureResultEmptyCameraCaptureResult) = (r4v2 o.CameraCaptureResultEmptyCameraCaptureResult), (r4v43 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0044, B:5:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asInterface(Object[] objArr) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        boolean z2;
        int i2;
        LoanHomeService loanHomeService = (LoanHomeService) objArr[0];
        SessionTrackerb sessionTrackerb = (SessionTrackerb) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 51;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback(-14111035);
            if ((iIntValue & 41) == 0) {
                i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(loanHomeService) ? 4 : 2) | iIntValue;
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i = iIntValue;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback(-14111035);
            if ((iIntValue & 6) == 0) {
            }
        }
        if ((iIntValue & 48) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(sessionTrackerb) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str2)) {
                i2 = 2048;
            } else {
                int i5 = IAuthTabCallbackDefault + 47;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                i2 = 1024;
            }
            i |= i2;
        }
        if ((i & 1171) != 1170) {
            z = true;
        } else {
            int i7 = onExtraCallbackWithResult + 49;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i9 = onExtraCallbackWithResult + 113;
            IAuthTabCallbackDefault = i9 % 128;
            if (i9 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-14111035, i, -1, "im.toss.features.loan.home.RefinancingListCredit (LoanRefinancingListContentScreen.kt:311)");
            }
            Context context = (Context) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(loanHomeService);
            int i10 = i & 896;
            boolean z3 = i10 == 256;
            int i11 = i & 7168;
            boolean z4 = i11 == 2048;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback | z3 | z4)) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda23 externalSyntheticLambda23 = new LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda23(loanHomeService, str, str2);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda23);
                    obj = externalSyntheticLambda23;
                }
                ConvertByteArrayToFloatArray.onExtraCallback(1483679L, false, (String) null, (Map) null, (Function1) obj, 14, (Object) null);
                EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(703413928, true, new LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda24(loanHomeService), cameraCaptureResultEmptyCameraCaptureResult, 54);
                getBacktraceNote getbacktracenoteOnNavigationEvent = ResourceLoadExtension1.onNavigationEvent.onNavigationEvent();
                if (i10 == 256) {
                    z2 = true;
                } else {
                    int i12 = IAuthTabCallbackDefault + 39;
                    onExtraCallbackWithResult = i12 % 128;
                    int i13 = i12 % 2;
                    z2 = false;
                }
                boolean z5 = i11 == 2048;
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(loanHomeService);
                boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(sessionTrackerb);
                boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(context);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(z5 | z2 | zOnExtraCallback2 | zOnExtraCallback3 | zOnExtraCallback4)) {
                    int i14 = IAuthTabCallbackDefault + 69;
                    onExtraCallbackWithResult = i14 % 128;
                    if (i14 % 2 != 0) {
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        throw null;
                    }
                    Object obj2 = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda25 externalSyntheticLambda25 = new LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda25(sessionTrackerb, context, str, str2, loanHomeService);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda25);
                        obj2 = externalSyntheticLambda25;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                    w4.onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{encoderProfilesProxyVideoProfileProxyOnExtraCallback, true, null, getbacktracenoteOnNavigationEvent, null, null, null, null, null, Float.valueOf(0.0f), null, null, null, null, null, (Function0) obj2, null, null, cameraCaptureResultEmptyCameraCaptureResult2, 3126, 0, 229364}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1882733109, -1882733101);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda26(loanHomeService, sessionTrackerb, str, str2, iIntValue));
        }
        return null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1616054330);
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(iIntValue != 0, iIntValue & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1616054330, iIntValue, -1, "im.toss.features.loan.home.RefinancingListTitle (LoanRefinancingListContentScreen.kt:402)");
                }
                y1ExternalSyntheticLambda6.onExtraCallbackWithResult(ResourceLoadExtension1.onNavigationEvent.onWarmupCompleted(), (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote) null, (getBacktraceNote) null, 0.0f, 0.0f, (Function0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 0, 16382);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i3 = IAuthTabCallbackDefault + 111;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 3 / 3;
                    }
                }
            }
            clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new LoanRefinancingListContentScreenKt$.ExternalSyntheticLambda0(iIntValue));
            }
            return null;
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1616054330);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanHomeService loanHomeService, String str, String str2, SetDetectableSize setDetectableSize) {
        return (Unit) onExtraCallbackWithResult(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{loanHomeService, str, str2, setDetectableSize}, 1156147235, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -1156147233, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onNavigationEvent(boolean z, Function0 function0, setRubIn setrubin, SessionTrackerb sessionTrackerb, String str, String str2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {Boolean.valueOf(z), function0, setrubin, sessionTrackerb, str, str2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), objArr, -2115500239, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 2115500247, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanHomeService loanHomeService, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {loanHomeService, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), objArr, 87312159, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -87312154, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
    }

    private static final Unit IAuthTabCallback(setRubIn setrubin, setRubIn setrubin2, Function0 function0, SessionTrackerb sessionTrackerb, String str, String str2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {setrubin, setrubin2, function0, sessionTrackerb, str, str2, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onExtraCallbackWithResult(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), objArr, 2047182829, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -2047182822, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
    }

    private static final void onWarmupCompleted(LoanHomeService loanHomeService, SessionTrackerb sessionTrackerb, String str, String str2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        Object[] objArr = {loanHomeService, sessionTrackerb, str, str2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        onExtraCallbackWithResult(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), objArr, -589462336, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 589462346, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
    }

    private static final Unit onExtraCallbackWithResult(String str, SetDetectableSize setDetectableSize) {
        return (Unit) onExtraCallbackWithResult(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{str, setDetectableSize}, 68627542, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -68627533, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
    }

    private static final Unit onWarmupCompleted(String str, String str2, LoanHomeService loanHomeService, SetDetectableSize setDetectableSize) {
        return (Unit) onExtraCallbackWithResult(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{str, str2, loanHomeService, setDetectableSize}, 299340644, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -299340644, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
    }

    private static final Unit IAuthTabCallback(LoanHomeService loanHomeService, String str, String str2, SetDetectableSize setDetectableSize) {
        return (Unit) onExtraCallbackWithResult(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{loanHomeService, str, str2, setDetectableSize}, 98947711, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -98947710, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
    }

    private static final Unit IAuthTabCallbackDefault(String str, String str2, LoanHomeService loanHomeService, SetDetectableSize setDetectableSize) {
        return (Unit) onExtraCallbackWithResult(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{str, str2, loanHomeService, setDetectableSize}, -414349106, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 414349109, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
    }

    private static final Unit IAuthTabCallbackDefault(String str, SetDetectableSize setDetectableSize) {
        return (Unit) onExtraCallbackWithResult(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{str, setDetectableSize}, -546132883, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 546132889, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
    }

    private static final void IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        onExtraCallbackWithResult(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), objArr, 1267766674, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -1267766663, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
    }

    private static final Unit onWarmupCompleted(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onExtraCallbackWithResult(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), objArr, -1514847225, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 1514847229, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
    }
}
