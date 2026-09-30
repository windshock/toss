package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.feature.credit.ui.quiz.qna.CreditQuizNavHostKt$;
import im.toss.feature.credit.ui.quiz.qna.CreditQuizViewModel;
import im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AppOnConfigurationChangedPoint;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AppLoadPoint {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] IAuthTabCallback = {27255, 27173, 27173, 27196, 27173, 27179, 27179, 27173, 27198, 27281, 27289, 27284, 27281, 27281, 27311, 27287, 27290, 27282, 27307, 27307};
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) throws Throwable {
        int i7 = i2 | i5;
        int i8 = ~((~i5) | i2);
        int i9 = ~i2;
        int i10 = i8 | (~(i9 | i | i5));
        int i11 = (~(i5 | i9)) | i;
        int i12 = i2 + i + i6 + (2127773517 * i4) + (1026174006 * i3);
        int i13 = i12 * i12;
        int i14 = (i2 * (-484454144)) + 743702528 + ((-484454144) * i) + (i7 * (-1605095679)) + (1605095679 * i10) + ((-1605095679) * i11) + ((-2089549824) * i6) + (367263744 * i4) + ((-1434976256) * i3) + (1105526784 * i13);
        int i15 = (i2 * 21308160) + 1622758390 + (i * 21308160) + (i7 * 947) + (i10 * (-947)) + (i11 * 947) + (i6 * 21309107) + (i4 * 1708896471) + (i3 * 664464834) + (i13 * 287244288);
        int i16 = i14 + (i15 * i15 * 966983680);
        if (i16 != 1) {
            return i16 != 2 ? i16 != 3 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
        }
        String str = (String) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[2];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[3];
        int i17 = 2 % 2;
        int i18 = onNavigationEvent + 15;
        onWarmupCompleted = i18 % 128;
        int i19 = i18 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, getsupportedhighspeedresolutionsfor, cameraPresenceProviderExternalSyntheticLambda6, setDetectableSize);
        int i20 = onNavigationEvent + 47;
        onWarmupCompleted = i20 % 128;
        int i21 = i20 % 2;
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        String str = (String) objArr[0];
        CreditQuizViewModel creditQuizViewModel = (CreditQuizViewModel) objArr[1];
        setParentLayoutDirection setparentlayoutdirection = (setParentLayoutDirection) objArr[2];
        Function1 function1 = (Function1) objArr[3];
        Function0 function0 = (Function0) objArr[4];
        String str2 = (String) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int iIntValue2 = ((Number) objArr[7]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        ((Number) objArr[9]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr2 = {str, creditQuizViewModel, setparentlayoutdirection, function1, function0, str2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue)), Integer.valueOf(iIntValue2)};
            int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            IAuthTabCallback(-1762606800, 1762606803, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback, iOnExtraCallback2, objArr2);
        } else {
            Object[] objArr3 = {str, creditQuizViewModel, setparentlayoutdirection, function1, function0, str2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(1 | iIntValue)), Integer.valueOf(iIntValue2)};
            int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            int iOnExtraCallback4 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            IAuthTabCallback(-1762606800, 1762606803, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback4, objArr3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditQuizViewModel creditQuizViewModel) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(creditQuizViewModel);
        int i4 = onNavigationEvent + 15;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditQuizViewModel creditQuizViewModel, String str, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Function1 function1, Function0 function0, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 117;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditQuizViewModel, str, cameraPresenceProviderExternalSyntheticLambda6, function1, function0, cameraPresenceProviderExternalSyntheticLambda62, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 8 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1, String str, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, String str2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(function1, str, getsupportedhighspeedresolutionsfor, cameraPresenceProviderExternalSyntheticLambda6, str2);
        }
        onExtraCallbackWithResult(function1, str, getsupportedhighspeedresolutionsfor, cameraPresenceProviderExternalSyntheticLambda6, str2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditQuizViewModel creditQuizViewModel, String str, enableContextFromLogger enablecontextfromlogger, Boolean bool) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditQuizViewModel, str, enablecontextfromlogger, bool);
        int i4 = onNavigationEvent + 105;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, CreditQuizViewModel creditQuizViewModel, setParentLayoutDirection setparentlayoutdirection, Function1 function1, Function0 function0, String str2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Unit unit;
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 47;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            Object[] objArr = {str, creditQuizViewModel, setparentlayoutdirection, function1, function0, str2, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
            unit = (Unit) IAuthTabCallback(-1344087550, 1344087552, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr);
            int i6 = 95 / 0;
        } else {
            Object[] objArr2 = {str, creditQuizViewModel, setparentlayoutdirection, function1, function0, str2, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
            unit = (Unit) IAuthTabCallback(-1344087550, 1344087552, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr2);
        }
        int i7 = onWarmupCompleted + 9;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        CreditQuizViewModel creditQuizViewModel = (CreditQuizViewModel) objArr[1];
        String str = (String) objArr[2];
        Function0 function0 = (Function0) objArr[3];
        setDividerDrawable setdividerdrawable = (setDividerDrawable) objArr[4];
        TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0 = (TwoLineExternalSyntheticLambda0) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6, creditQuizViewModel, str, function0, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onWarmupCompleted + 75;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, enableContextFromLogger enablecontextfromlogger, Boolean bool, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(str, enablecontextfromlogger, bool, setDetectableSize);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, enablecontextfromlogger, bool, setDetectableSize);
        int i3 = onNavigationEvent + 125;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 89 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CreditQuizViewModel creditQuizViewModel, String str, Function0 function0, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, Function1 function1, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda63, ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6, creditQuizViewModel, str, function0, cameraPresenceProviderExternalSyntheticLambda62, function1, cameraPresenceProviderExternalSyntheticLambda63, exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8);
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
        int i5 = onWarmupCompleted + 101;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(String str, enableContextFromLogger enablecontextfromlogger, Boolean bool, SetDetectableSize setDetectableSize) throws Throwable {
        String str2;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr = new Object[1];
            a(new int[]{0, 8, 0, 3}, true, new byte[]{0, 1, 1, 0, 1, 1, 1, 1}, objArr);
            setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
            setDetectableSize.onExtraCallback("quiz_title", enablecontextfromlogger.onNavigationEvent());
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                int i3 = onWarmupCompleted + 75;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                str2 = "O";
            } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                int i5 = onNavigationEvent + 99;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                str2 = "X";
            } else {
                str2 = "TIMEOUT";
            }
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr2 = new Object[1];
            a(new int[]{0, 8, 0, 3}, false, new byte[]{0, 1, 1, 0, 1, 1, 1, 1}, objArr2);
            setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str);
            setDetectableSize.onExtraCallback("quiz_title", enablecontextfromlogger.onNavigationEvent());
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            }
        }
        setDetectableSize.onExtraCallback("answer", str2);
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(CreditQuizViewModel creditQuizViewModel, String str, enableContextFromLogger enablecontextfromlogger, Boolean bool) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1266215L, false, (String) null, (Map) null, new CreditQuizNavHostKt$.ExternalSyntheticLambda2(str, enablecontextfromlogger, bool), 14, (Object) null);
        creditQuizViewModel.onExtraCallback(bool);
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 73;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 62 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CreditQuizViewModel creditQuizViewModel, String str, Function0 function0, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        long jOnExtraCallback;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(setdividerdrawable, "");
        Intrinsics.checkNotNullParameter(twoLineExternalSyntheticLambda0, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-831737560, i, -1, "im.toss.feature.credit.ui.quiz.qna.CreditQuizNavHost.<anonymous>.<anonymous>.<anonymous> (CreditQuizNavHost.kt:36)");
        }
        enableContextFromLogger enablecontextfromloggerOnWarmupCompleted = onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<enableContextFromLogger>) cameraPresenceProviderExternalSyntheticLambda6);
        if (enablecontextfromloggerOnWarmupCompleted == null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-627264465);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-627264464);
            ImageLoaderBuilderExternalSyntheticLambda6 imageLoaderBuilderExternalSyntheticLambda6IAuthTabCallbackDefault = creditQuizViewModel.IAuthTabCallbackDefault();
            String strOnNavigationEvent = enablecontextfromloggerOnWarmupCompleted.onNavigationEvent();
            enableAudioDjangoExecutorOpt enableaudiodjangoexecutoroptAsInterface = creditQuizViewModel.asInterface();
            if (enableaudiodjangoexecutoroptAsInterface != null) {
                jOnExtraCallback = enableaudiodjangoexecutoroptAsInterface.onExtraCallback();
            } else {
                int i3 = onNavigationEvent + 119;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                jOnExtraCallback = 0;
            }
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(enablecontextfromloggerOnWarmupCompleted);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditQuizViewModel);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent | zOnNavigationEvent2 | zOnExtraCallback)) {
                int i5 = onWarmupCompleted + 45;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    CreditQuizNavHostKt$.ExternalSyntheticLambda6 externalSyntheticLambda6 = new CreditQuizNavHostKt$.ExternalSyntheticLambda6(creditQuizViewModel, str, enablecontextfromloggerOnWarmupCompleted);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda6);
                    obj2 = externalSyntheticLambda6;
                }
                AppOnLoadResultPoint.onExtraCallback(imageLoaderBuilderExternalSyntheticLambda6IAuthTabCallbackDefault, str, strOnNavigationEvent, jOnExtraCallback, function0, (Function1) obj2, cameraCaptureResultEmptyCameraCaptureResult, ImageLoaderBuilderExternalSyntheticLambda6.onNavigationEvent);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = onNavigationEvent + 115;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        Unit unit = Unit.INSTANCE;
        int i8 = onWarmupCompleted + 3;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c A[PHI: r7
      0x006c: PHI (r7v54 o.AppLoadInterceptorPoint$onExtraCallback) = (r7v53 o.AppLoadInterceptorPoint$onExtraCallback), (r7v58 o.AppLoadInterceptorPoint$onExtraCallback) binds: [B:16:0x006a, B:13:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2 A[PHI: r7
      0x00f2: PHI (r7v23 o.enableEndSpmReportInIOThread) = (r7v22 o.enableEndSpmReportInIOThread), (r7v42 o.enableEndSpmReportInIOThread) binds: [B:48:0x00f0, B:45:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(String str, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, SetDetectableSize setDetectableSize) throws Throwable {
        String strOnExtraCallbackWithResult;
        String strOnExtraCallbackWithResult2;
        enableEndSpmReportInIOThread enableendspmreportiniothreadOnExtraCallback;
        enableEndSpmReportInIOThread enableendspmreportiniothreadOnExtraCallback2;
        enableEventTrackerAdd enableeventtrackeraddOnNavigationEvent;
        enableEndSpmReportInIOThread enableendspmreportiniothreadOnExtraCallback3;
        enableEventTrackerAdd enableeventtrackeraddOnNavigationEvent2;
        enableEndSpmReportInIOThread enableendspmreportiniothreadOnExtraCallback4;
        enableEventTrackerAdd enableeventtrackeraddOnNavigationEvent3;
        AppLoadInterceptorPoint$onExtraCallback appLoadInterceptorPoint$onExtraCallbackOnNavigationEvent;
        enableEndSpmReportInIOThread enableendspmreportiniothreadOnExtraCallback5;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new int[]{0, 8, 0, 3}, false, new byte[]{0, 1, 1, 0, 1, 1, 1, 1}, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        AppLoadInterceptorPoint$onExtraCallback appLoadInterceptorPoint$onExtraCallbackOnNavigationEvent2 = onNavigationEvent(getsupportedhighspeedresolutionsfor);
        String strOnExtraCallback = null;
        if (appLoadInterceptorPoint$onExtraCallbackOnNavigationEvent2 == null || (enableendspmreportiniothreadOnExtraCallback5 = appLoadInterceptorPoint$onExtraCallbackOnNavigationEvent2.onExtraCallback()) == null) {
            int i2 = onNavigationEvent + 115;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            strOnExtraCallbackWithResult = null;
        } else {
            strOnExtraCallbackWithResult = zzaz.onExtraCallbackWithResult(enableendspmreportiniothreadOnExtraCallback5.asInterface());
        }
        setDetectableSize.onExtraCallback("answer_yn", strOnExtraCallbackWithResult);
        enableContextFromLogger enablecontextfromloggerOnExtraCallbackWithResult = onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<enableContextFromLogger>) cameraPresenceProviderExternalSyntheticLambda6);
        if (enablecontextfromloggerOnExtraCallbackWithResult == null) {
            int i4 = onWarmupCompleted + 117;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                appLoadInterceptorPoint$onExtraCallbackOnNavigationEvent = onNavigationEvent(getsupportedhighspeedresolutionsfor);
                int i5 = 61 / 0;
                if (appLoadInterceptorPoint$onExtraCallbackOnNavigationEvent != null) {
                    enableEndSpmReportInIOThread enableendspmreportiniothreadOnExtraCallback6 = appLoadInterceptorPoint$onExtraCallbackOnNavigationEvent.onExtraCallback();
                    enablecontextfromloggerOnExtraCallbackWithResult = enableendspmreportiniothreadOnExtraCallback6 != null ? enableendspmreportiniothreadOnExtraCallback6.onExtraCallback() : null;
                }
            } else {
                appLoadInterceptorPoint$onExtraCallbackOnNavigationEvent = onNavigationEvent(getsupportedhighspeedresolutionsfor);
                if (appLoadInterceptorPoint$onExtraCallbackOnNavigationEvent != null) {
                }
            }
        }
        setDetectableSize.onExtraCallback("quiz_title", enablecontextfromloggerOnExtraCallbackWithResult != null ? enablecontextfromloggerOnExtraCallbackWithResult.onNavigationEvent() : null);
        AppLoadInterceptorPoint$onExtraCallback appLoadInterceptorPoint$onExtraCallbackOnNavigationEvent3 = onNavigationEvent(getsupportedhighspeedresolutionsfor);
        if (appLoadInterceptorPoint$onExtraCallbackOnNavigationEvent3 == null || (enableendspmreportiniothreadOnExtraCallback4 = appLoadInterceptorPoint$onExtraCallbackOnNavigationEvent3.onExtraCallback()) == null || (enableeventtrackeraddOnNavigationEvent3 = enableendspmreportiniothreadOnExtraCallback4.onNavigationEvent()) == null) {
            int i6 = onWarmupCompleted + 71;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            strOnExtraCallbackWithResult2 = null;
        } else {
            strOnExtraCallbackWithResult2 = enableeventtrackeraddOnNavigationEvent3.onExtraCallbackWithResult();
            int i8 = onNavigationEvent + 17;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
        }
        setDetectableSize.onExtraCallback("text1", strOnExtraCallbackWithResult2);
        AppLoadInterceptorPoint$onExtraCallback appLoadInterceptorPoint$onExtraCallbackOnNavigationEvent4 = onNavigationEvent(getsupportedhighspeedresolutionsfor);
        setDetectableSize.onExtraCallback("text2", (appLoadInterceptorPoint$onExtraCallbackOnNavigationEvent4 == null || (enableendspmreportiniothreadOnExtraCallback3 = appLoadInterceptorPoint$onExtraCallbackOnNavigationEvent4.onExtraCallback()) == null || (enableeventtrackeraddOnNavigationEvent2 = enableendspmreportiniothreadOnExtraCallback3.onNavigationEvent()) == null) ? null : enableeventtrackeraddOnNavigationEvent2.onNavigationEvent());
        AppLoadInterceptorPoint$onExtraCallback appLoadInterceptorPoint$onExtraCallbackOnNavigationEvent5 = onNavigationEvent(getsupportedhighspeedresolutionsfor);
        if (appLoadInterceptorPoint$onExtraCallbackOnNavigationEvent5 != null) {
            int i10 = onNavigationEvent + 125;
            onWarmupCompleted = i10 % 128;
            if (i10 % 2 != 0) {
                enableendspmreportiniothreadOnExtraCallback = appLoadInterceptorPoint$onExtraCallbackOnNavigationEvent5.onExtraCallback();
                int i11 = 53 / 0;
                if (enableendspmreportiniothreadOnExtraCallback != null) {
                    enableEventTrackerAdd enableeventtrackeraddOnNavigationEvent4 = enableendspmreportiniothreadOnExtraCallback.onNavigationEvent();
                    if (enableeventtrackeraddOnNavigationEvent4 != null) {
                        int i12 = onWarmupCompleted + 125;
                        onNavigationEvent = i12 % 128;
                        if (i12 % 2 == 0) {
                            enableeventtrackeraddOnNavigationEvent4.onExtraCallback();
                            throw null;
                        }
                        if (enableeventtrackeraddOnNavigationEvent4.onExtraCallback() != null && (!StringsKt.isBlank(r7))) {
                            int i13 = onNavigationEvent + 47;
                            onWarmupCompleted = i13 % 128;
                            int i14 = i13 % 2;
                            AppLoadInterceptorPoint$onExtraCallback appLoadInterceptorPoint$onExtraCallbackOnNavigationEvent6 = onNavigationEvent(getsupportedhighspeedresolutionsfor);
                            if (appLoadInterceptorPoint$onExtraCallbackOnNavigationEvent6 != null && (enableendspmreportiniothreadOnExtraCallback2 = appLoadInterceptorPoint$onExtraCallbackOnNavigationEvent6.onExtraCallback()) != null && (enableeventtrackeraddOnNavigationEvent = enableendspmreportiniothreadOnExtraCallback2.onNavigationEvent()) != null) {
                                strOnExtraCallback = enableeventtrackeraddOnNavigationEvent.onExtraCallback();
                            }
                            Object[] objArr2 = new Object[1];
                            a(new int[]{8, 12, 113, 8}, false, new byte[]{0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0}, objArr2);
                            setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), strOnExtraCallback);
                            int i15 = onWarmupCompleted + 87;
                            onNavigationEvent = i15 % 128;
                            int i16 = i15 % 2;
                        }
                    }
                }
            } else {
                enableendspmreportiniothreadOnExtraCallback = appLoadInterceptorPoint$onExtraCallbackOnNavigationEvent5.onExtraCallback();
                if (enableendspmreportiniothreadOnExtraCallback != null) {
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(Function1 function1, String str, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str2, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1266225L, false, (String) null, (Map) null, new CreditQuizNavHostKt$.ExternalSyntheticLambda3(str, getsupportedhighspeedresolutionsfor, cameraPresenceProviderExternalSyntheticLambda6), 14, (Object) null);
        function1.invoke(str2);
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(CreditQuizViewModel creditQuizViewModel) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            creditQuizViewModel.onTransact();
            unit = Unit.INSTANCE;
            int i3 = 14 / 0;
        } else {
            creditQuizViewModel.onTransact();
            unit = Unit.INSTANCE;
        }
        int i4 = onNavigationEvent + 109;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(CreditQuizViewModel creditQuizViewModel, String str, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Function1 function1, Function0 function0, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object obj;
        enableEndSpmReportInIOThread enableendspmreportiniothreadOnExtraCallback;
        AppLoadInterceptorPoint$onExtraCallback appLoadInterceptorPoint$onExtraCallback;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(setdividerdrawable, "");
        Intrinsics.checkNotNullParameter(twoLineExternalSyntheticLambda0, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onWarmupCompleted + 57;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(309911647, i, -1, "im.toss.feature.credit.ui.quiz.qna.CreditQuizNavHost.<anonymous>.<anonymous>.<anonymous> (CreditQuizNavHost.kt:60)");
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
        Object obj2 = null;
        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
            AppLoadInterceptorPoint appLoadInterceptorPointOnExtraCallback = onExtraCallback(cameraPresenceProviderExternalSyntheticLambda62);
            if (appLoadInterceptorPointOnExtraCallback instanceof AppLoadInterceptorPoint$onExtraCallback) {
                int i5 = onNavigationEvent + 1;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                appLoadInterceptorPoint$onExtraCallback = (AppLoadInterceptorPoint$onExtraCallback) appLoadInterceptorPointOnExtraCallback;
            } else {
                appLoadInterceptorPoint$onExtraCallback = null;
            }
            objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(appLoadInterceptorPoint$onExtraCallback, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
        enableContextFromLogger enablecontextfromloggerOnExtraCallbackWithResult = onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<enableContextFromLogger>) cameraPresenceProviderExternalSyntheticLambda6);
        if (enablecontextfromloggerOnExtraCallbackWithResult == null) {
            AppLoadInterceptorPoint$onExtraCallback appLoadInterceptorPoint$onExtraCallbackOnNavigationEvent = onNavigationEvent(getsupportedhighspeedresolutionsfor);
            if (appLoadInterceptorPoint$onExtraCallbackOnNavigationEvent == null || (enableendspmreportiniothreadOnExtraCallback = appLoadInterceptorPoint$onExtraCallbackOnNavigationEvent.onExtraCallback()) == null) {
                enablecontextfromloggerOnExtraCallbackWithResult = null;
            } else {
                int i7 = onWarmupCompleted + 95;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    enableendspmreportiniothreadOnExtraCallback.onExtraCallback();
                    throw null;
                }
                enablecontextfromloggerOnExtraCallbackWithResult = enableendspmreportiniothreadOnExtraCallback.onExtraCallback();
            }
        }
        boolean zOnNavigationEvent = creditQuizViewModel.onNavigationEvent();
        AppLoadInterceptorPoint$onExtraCallback appLoadInterceptorPoint$onExtraCallbackOnNavigationEvent2 = onNavigationEvent(getsupportedhighspeedresolutionsfor);
        enableEndSpmReportInIOThread enableendspmreportiniothreadOnExtraCallback2 = appLoadInterceptorPoint$onExtraCallbackOnNavigationEvent2 != null ? appLoadInterceptorPoint$onExtraCallbackOnNavigationEvent2.onExtraCallback() : null;
        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
        boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6);
        boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnNavigationEvent2 | zOnNavigationEvent3 | zOnNavigationEvent4)) {
            int i8 = onNavigationEvent + 3;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            obj = objOnMinimized2;
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                CreditQuizNavHostKt$.ExternalSyntheticLambda7 externalSyntheticLambda7 = new CreditQuizNavHostKt$.ExternalSyntheticLambda7(function1, str, getsupportedhighspeedresolutionsfor, cameraPresenceProviderExternalSyntheticLambda6);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda7);
                int i10 = onNavigationEvent + 47;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                obj = externalSyntheticLambda7;
            }
        }
        Function1 function12 = (Function1) obj;
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditQuizViewModel);
        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnExtraCallback) {
            int i12 = onWarmupCompleted + 53;
            onNavigationEvent = i12 % 128;
            if (i12 % 2 == 0) {
                onwarmupcompleted.onExtraCallback();
                obj2.hashCode();
                throw null;
            }
            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized3 = new CreditQuizNavHostKt$.ExternalSyntheticLambda8(creditQuizViewModel);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
            }
        }
        onAppInteraction.onExtraCallback(str, enablecontextfromloggerOnExtraCallbackWithResult, !zOnNavigationEvent, function12, (Function0) objOnMinimized3, enableendspmreportiniothreadOnExtraCallback2, function0, cameraCaptureResultEmptyCameraCaptureResult, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i13 = onWarmupCompleted + 11;
            onNavigationEvent = i13 % 128;
            if (i13 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                obj2.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CreditQuizViewModel creditQuizViewModel, String str, Function0 function0, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, Function1 function1, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda63, ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        RippleContainer.onNavigationEvent(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, AppOnConfigurationChangedPoint.onExtraCallbackWithResult.onExtraCallbackWithResult.onExtraCallbackWithResult(), (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ForwardingCameraControl.onExtraCallbackWithResult(-831737560, true, new CreditQuizNavHostKt$.ExternalSyntheticLambda4(cameraPresenceProviderExternalSyntheticLambda6, creditQuizViewModel, str, function0)), 254, (Object) null);
        RippleContainer.onNavigationEvent(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, AppOnConfigurationChangedPoint.onWarmupCompleted.IAuthTabCallback.onExtraCallbackWithResult(), (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ForwardingCameraControl.onExtraCallbackWithResult(309911647, true, new CreditQuizNavHostKt$.ExternalSyntheticLambda5(creditQuizViewModel, str, cameraPresenceProviderExternalSyntheticLambda62, function1, function0, cameraPresenceProviderExternalSyntheticLambda63)), 254, (Object) null);
        RippleContainer.onNavigationEvent(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, AppOnConfigurationChangedPoint.IAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult(), (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, onAppExit.onNavigationEvent.IAuthTabCallback(), 254, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i2;
        Function0 function0;
        Function1 function1;
        setParentLayoutDirection setparentlayoutdirection;
        String str;
        int i3;
        int i4;
        boolean zOnNavigationEvent;
        boolean zOnExtraCallback;
        boolean z;
        boolean z2;
        boolean zOnNavigationEvent2;
        boolean zOnNavigationEvent3;
        boolean z3;
        int i5;
        int i6;
        int i7;
        String str2 = (String) objArr[0];
        CreditQuizViewModel creditQuizViewModel = (CreditQuizViewModel) objArr[1];
        setParentLayoutDirection setparentlayoutdirection2 = (setParentLayoutDirection) objArr[2];
        Function1 function12 = (Function1) objArr[3];
        Function0 function02 = (Function0) objArr[4];
        String strOnExtraCallbackWithResult = (String) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int iIntValue2 = ((Number) objArr[8]).intValue();
        int i8 = 2 % 2;
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(creditQuizViewModel, "");
        Intrinsics.checkNotNullParameter(setparentlayoutdirection2, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function02, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(1889264965);
        if ((iIntValue & 6) == 0) {
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ^ true ? 2 : 4) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(creditQuizViewModel) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(setparentlayoutdirection2) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            int i9 = onNavigationEvent + 45;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 68 / 0;
                i7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 16384 : 8192;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02)) {
            }
            i |= i7;
        }
        if ((196608 & iIntValue) == 0) {
            i |= ((iIntValue2 & 32) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strOnExtraCallbackWithResult)) ? 131072 : 65536;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i) != 74898, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((iIntValue & 1) != 0) {
                int i11 = onWarmupCompleted + 97;
                onNavigationEvent = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 65 / 0;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                        if ((iIntValue2 & 32) != 0) {
                            int i13 = onNavigationEvent + 99;
                            onWarmupCompleted = i13 % 128;
                            if (i13 % 2 != 0) {
                                strOnExtraCallbackWithResult = AppOnConfigurationChangedPoint.onExtraCallbackWithResult.onExtraCallbackWithResult.onExtraCallbackWithResult();
                                int i14 = 86 / 0;
                            } else {
                                strOnExtraCallbackWithResult = AppOnConfigurationChangedPoint.onExtraCallbackWithResult.onExtraCallbackWithResult.onExtraCallbackWithResult();
                            }
                            i &= -458753;
                        }
                        str = strOnExtraCallbackWithResult;
                        i3 = i;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.onExtraCallbackWithResult(creditQuizViewModel.onExtraCallback(), (Object) null, (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 14);
                        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(creditQuizViewModel.IAuthTabCallback(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2 = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(creditQuizViewModel.onExtraCallbackWithResult(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onExtraCallbackWithResult(), (toMetersPerSecond) null, 2, (Object) null);
                        i4 = (i3 >> 6) & 14;
                        setAdVideoPlaybackListener.onExtraCallbackWithResult(setparentlayoutdirection2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i4);
                        zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                        zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(creditQuizViewModel);
                        if ((i3 & 14) != 4) {
                        }
                        if ((57344 & i3) != 16384) {
                        }
                        zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult);
                        zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2);
                        if ((i3 & 7168) == 2048) {
                        }
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!(z | zOnNavigationEvent | zOnExtraCallback | z2 | zOnNavigationEvent2 | zOnNavigationEvent3 | z3)) {
                            i6 = i3;
                            i5 = i4;
                            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            i2 = iIntValue;
                            function0 = function02;
                            function1 = function12;
                            setparentlayoutdirection = setparentlayoutdirection2;
                            RippleHostViewExternalSyntheticLambda0.onWarmupCompleted(setparentlayoutdirection2, str, quirksExternalSyntheticBackport0OnExtraCallback, (QuirkSettingsLoader) null, (String) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, ((i6 >> 12) & 112) | i5, 0, 1016);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            }
                        }
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        if ((iIntValue2 & 32) != 0) {
                            i &= -458753;
                        }
                        str = strOnExtraCallbackWithResult;
                        i3 = i;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i15 = onNavigationEvent + 119;
                            onWarmupCompleted = i15 % 128;
                            int i16 = i15 % 2;
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1889264965, i3, -1, "im.toss.feature.credit.ui.quiz.qna.CreditQuizNavHost (CreditQuizNavHost.kt:25)");
                        }
                        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult2 = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.onExtraCallbackWithResult(creditQuizViewModel.onExtraCallback(), (Object) null, (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 14);
                        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback3 = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(creditQuizViewModel.IAuthTabCallback(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback22 = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(creditQuizViewModel.onExtraCallbackWithResult(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = verifyDrawable.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onExtraCallbackWithResult(), (toMetersPerSecond) null, 2, (Object) null);
                        i4 = (i3 >> 6) & 14;
                        setAdVideoPlaybackListener.onExtraCallbackWithResult(setparentlayoutdirection2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i4);
                        zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback3);
                        zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(creditQuizViewModel);
                        if ((i3 & 14) != 4) {
                            int i17 = onWarmupCompleted + 89;
                            onNavigationEvent = i17 % 128;
                            int i18 = i17 % 2;
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = (57344 & i3) != 16384;
                        zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult2);
                        zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback22);
                        if ((i3 & 7168) == 2048) {
                            int i19 = onNavigationEvent + 83;
                            onWarmupCompleted = i19 % 128;
                            int i20 = i19 % 2;
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if ((!(z | zOnNavigationEvent | zOnExtraCallback | z2 | zOnNavigationEvent2 | zOnNavigationEvent3) && !z3) && objOnMinimized2 != CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            i6 = i3;
                            i5 = i4;
                        } else {
                            i5 = i4;
                            i6 = i3;
                            CreditQuizNavHostKt$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new CreditQuizNavHostKt$.ExternalSyntheticLambda0(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback3, creditQuizViewModel, str2, function02, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback22, function12, cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult2);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda0);
                            objOnMinimized2 = externalSyntheticLambda0;
                        }
                        cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        i2 = iIntValue;
                        function0 = function02;
                        function1 = function12;
                        setparentlayoutdirection = setparentlayoutdirection2;
                        RippleHostViewExternalSyntheticLambda0.onWarmupCompleted(setparentlayoutdirection2, str, quirksExternalSyntheticBackport0OnExtraCallback2, (QuirkSettingsLoader) null, (String) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, ((i6 >> 12) & 112) | i5, 0, 1016);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                } else if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            i2 = iIntValue;
            function0 = function02;
            function1 = function12;
            setparentlayoutdirection = setparentlayoutdirection2;
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            str = strOnExtraCallbackWithResult;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            return null;
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CreditQuizNavHostKt$.ExternalSyntheticLambda1(str2, creditQuizViewModel, setparentlayoutdirection, function1, function0, str, i2, iIntValue2));
        return null;
    }

    private static final AppLoadInterceptorPoint$onExtraCallback onNavigationEvent(getSupportedHighSpeedResolutionsFor<AppLoadInterceptorPoint$onExtraCallback> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AppLoadInterceptorPoint$onExtraCallback appLoadInterceptorPoint$onExtraCallback = (AppLoadInterceptorPoint$onExtraCallback) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        int i4 = onNavigationEvent + 7;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return appLoadInterceptorPoint$onExtraCallback;
    }

    private static final AppLoadInterceptorPoint onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<? extends AppLoadInterceptorPoint> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AppLoadInterceptorPoint appLoadInterceptorPoint = (AppLoadInterceptorPoint) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            return appLoadInterceptorPoint;
        }
        throw null;
    }

    private static final enableContextFromLogger onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6<enableContextFromLogger> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        enableContextFromLogger enablecontextfromlogger = (enableContextFromLogger) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            return enablecontextfromlogger;
        }
        throw null;
    }

    private static final enableContextFromLogger onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6<enableContextFromLogger> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        enableContextFromLogger enablecontextfromlogger = (enableContextFromLogger) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            return enablecontextfromlogger;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = IAuthTabCallback;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + 105;
                $10 = i10 % 128;
                if (i10 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35284 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1))), 35 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), AndroidCharacter.getMirror('0') + 14191, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i9--;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i9])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 35283), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 34, (ViewConfiguration.getLongPressTimeout() >> 16) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i9++;
                }
                i3 = 2;
                j = 0;
            }
            int i11 = $10 + 69;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cArr = cArr2;
        }
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr, i5, cArr3, 0, i6);
        if (bArr != null) {
            int i13 = $10 + 109;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr4 = new char[i6];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i6) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i15 = $11 + 63;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    int i17 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 10936), 65 - (ViewConfiguration.getJumpTapTimeout() >> 16), 16718 - Color.argb(0, 0, 0, 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i17] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i18 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 30 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 17656 - TextUtils.indexOf((CharSequence) "", '0'), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i18] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 49467), 69 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getFadingEdgeLength() >> 16) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            int i19 = $10 + 67;
            $11 = i19 % 128;
            i = 2;
            int i20 = i19 % 2;
            cArr3 = cArr4;
        } else {
            i = 2;
        }
        if (i8 > 0) {
            int i21 = $11 + 77;
            $10 = i21 % 128;
            int i22 = i21 % i;
            char[] cArr5 = new char[i6];
            System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i23 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr3, i23, i8);
            System.arraycopy(cArr5, i8, cArr3, 0, i23);
        }
        if (z) {
            int i24 = $10 + 31;
            $11 = i24 % 128;
            int i25 = i24 % 2;
            char[] cArr6 = new char[i6];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i6) {
                int i26 = $11 + 9;
                $10 = i26 % 128;
                if (i26 % 2 != 0) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[i6 % trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    i2 = trackGroupExternalSyntheticLambda0.onNavigationEvent >> 1;
                } else {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i6 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i2 = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i2;
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            int i27 = $10 + 123;
            $11 = i27 % 128;
            if (i27 % 2 == 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i6) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CreditQuizViewModel creditQuizViewModel, String str, Function0 function0, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraPresenceProviderExternalSyntheticLambda6, creditQuizViewModel, str, function0, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (Unit) IAuthTabCallback(-605810291, 605810291, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback, iOnExtraCallback2, objArr);
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, SetDetectableSize setDetectableSize) {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (Unit) IAuthTabCallback(576455090, -576455089, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, iOnExtraCallback2, new Object[]{str, getsupportedhighspeedresolutionsfor, cameraPresenceProviderExternalSyntheticLambda6, setDetectableSize});
    }

    public static final void onNavigationEvent(@NotNull String str, @NotNull CreditQuizViewModel creditQuizViewModel, @NotNull setParentLayoutDirection setparentlayoutdirection, @NotNull Function1<? super String, Unit> function1, @NotNull Function0<Unit> function0, @Nullable String str2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws Throwable {
        Object[] objArr = {str, creditQuizViewModel, setparentlayoutdirection, function1, function0, str2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        IAuthTabCallback(-1762606800, 1762606803, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback, iOnExtraCallback2, objArr);
    }

    private static final Unit onNavigationEvent(String str, CreditQuizViewModel creditQuizViewModel, setParentLayoutDirection setparentlayoutdirection, Function1 function1, Function0 function0, String str2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {str, creditQuizViewModel, setparentlayoutdirection, function1, function0, str2, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (Unit) IAuthTabCallback(-1344087550, 1344087552, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback, iOnExtraCallback2, objArr);
    }
}
