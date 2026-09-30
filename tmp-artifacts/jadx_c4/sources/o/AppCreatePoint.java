package o;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import com.tmoney.LiveCheckConstants;
import im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageViewModel;
import im.toss.features.credit.CreditBaseViewModel;
import im.toss.features.credit.data.response.MyQuizDetailsResponse;
import im.toss.features.credit.data.response.QuizCta;
import im.toss.features.credit.ui.quiz.R;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.ActivityOnPausePoint;
import o.AppCreatePoint;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8;
import o.PullRefreshIndicatorKtExternalSyntheticLambda3;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SetDetectableSize;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TwoLineExternalSyntheticLambda0;
import o.decrementVideoUsage;
import o.getDistanceBetweenPoints;
import o.isInVideoUsage;
import o.onAppCreate;
import o.setCallToAction;
import o.setDividerDrawable;
import o.t7ExternalSyntheticLambda0;
import o.toPreviewOnlyRange;
import o.u3;
import o.u4;
import o.useAndConfigureProgramWithTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AppCreatePoint {
    private static final byte[] $$a = {5, -4, -80, 1};
    private static final int $$b = 181;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int onNavigationEvent = 1;
    private static char[] onExtraCallbackWithResult = {60838, 33332, 12984, 41790, 21426, 49215, 28847, 57605};
    private static long IAuthTabCallback = 4776899569902125649L;

    public static final /* synthetic */ class onWarmupCompleted {
        private static int onExtraCallback = 0;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onNavigationEvent = 1;

        static {
            int[] iArr = new int[AppExitPoint.values().length];
            try {
                iArr[AppExitPoint.AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppExitPoint.COOLTIME.ordinal()] = 2;
                int i = onNavigationEvent + 61;
                onExtraCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppExitPoint.REQUIRE_ALARM_TERM.ordinal()] = 3;
                int i4 = onExtraCallback + 11;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            onExtraCallbackWithResult = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, int i) {
        int i2;
        int i3 = 97 - (i * 2);
        int i4 = s + 4;
        int i5 = b * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i6;
            int i8 = 0;
            i3 = (-i3) + i7;
            i2 = i8;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i4++;
            int i9 = i2 + 1;
            i7 = i3;
            i3 = bArr[i4];
            i8 = i9;
            i3 = (-i3) + i7;
            i2 = i8;
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

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        CreditQuizMyPageViewModel creditQuizMyPageViewModel = (CreditQuizMyPageViewModel) objArr[0];
        ActivityOnPausePoint activityOnPausePoint = (ActivityOnPausePoint) objArr[1];
        setParentLayoutDirection setparentlayoutdirection = (setParentLayoutDirection) objArr[2];
        Function1 function1 = (Function1) objArr[3];
        setDividerDrawable setdividerdrawable = (setDividerDrawable) objArr[4];
        TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0 = (TwoLineExternalSyntheticLambda0) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(creditQuizMyPageViewModel, activityOnPausePoint, setparentlayoutdirection, function1, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        onWarmupCompleted(creditQuizMyPageViewModel, activityOnPausePoint, setparentlayoutdirection, function1, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditQuizMyPageViewModel creditQuizMyPageViewModel) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditQuizMyPageViewModel);
        int i4 = onNavigationEvent + 105;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditQuizMyPageViewModel creditQuizMyPageViewModel, Function1 function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 85;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(creditQuizMyPageViewModel, function1, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 35 / 0;
        }
        int i6 = onNavigationEvent + 49;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, CreditQuizMyPageViewModel creditQuizMyPageViewModel, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 107;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, creditQuizMyPageViewModel, function1, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 97;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 15 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(str, setDetectableSize);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(str, setDetectableSize);
        int i3 = onNavigationEvent + 121;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(ActivityOnPausePoint activityOnPausePoint, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(activityOnPausePoint, setDetectableSize);
        }
        onExtraCallback(activityOnPausePoint, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(setParentLayoutDirection setparentlayoutdirection, Context context, CreditQuizMyPageViewModel creditQuizMyPageViewModel) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(setparentlayoutdirection, context, creditQuizMyPageViewModel);
        }
        onWarmupCompleted(setparentlayoutdirection, context, creditQuizMyPageViewModel);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x036a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7;
        boolean z;
        Object obj;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Function2 function2;
        int i8;
        boolean z2;
        getBacktraceNote getbacktracenote;
        int i9;
        int i10;
        final String strOnExtraCallback;
        int i11 = ~i3;
        int i12 = ~i6;
        int i13 = ~(i11 | i12);
        int i14 = ~(i | i6);
        int i15 = i13 | i14;
        int i16 = ~i;
        int i17 = i13 | (~(i16 | i3)) | i14;
        int i18 = (~(i6 | i | i3)) | (~(i11 | i16 | i12));
        int i19 = i + i3 + i4 + (1322235619 * i2) + (440487356 * i5);
        int i20 = i19 * i19;
        int i21 = (((-1102165783) * i) - 2100690944) + ((-281430247) * i3) + ((-820735536) * i15) + (i17 * 410367768) + (410367768 * i18) + ((-691798016) * i4) + ((-942931968) * i2) + ((-1410334720) * i5) + (1251606528 * i20);
        int i22 = (i * 157034417) + 1376579869 + (i3 * 157036385) + (i15 * (-1968)) + (i17 * 984) + (i18 * 984) + (157035401 * i4) + ((-982187909) * i2) + ((-1869533796) * i5) + (i20 * (-899022848));
        int i23 = 4;
        boolean z3 = false;
        switch (i21 + (i22 * i22 * (-511311872))) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                final String str = (String) objArr[0];
                final CreditQuizMyPageViewModel creditQuizMyPageViewModel = (CreditQuizMyPageViewModel) objArr[1];
                final Function1 function1 = (Function1) objArr[2];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
                final int iIntValue = ((Number) objArr[4]).intValue();
                int i24 = 2 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(creditQuizMyPageViewModel, "");
                Intrinsics.checkNotNullParameter(function1, "");
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1534850281);
                if ((iIntValue & 6) == 0) {
                    i7 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | iIntValue;
                } else {
                    i7 = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(creditQuizMyPageViewModel)) {
                        i10 = 16;
                    } else {
                        int i25 = onWarmupCompleted + 115;
                        onNavigationEvent = i25 % 128;
                        int i26 = i25 % 2;
                        i10 = 32;
                    }
                    i7 |= i10;
                }
                if ((iIntValue & 384) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                        int i27 = onWarmupCompleted + 25;
                        onNavigationEvent = i27 % 128;
                        i9 = i27 % 2 == 0 ? 12429 : 256;
                    } else {
                        i9 = 128;
                    }
                    i7 |= i9;
                    int i28 = onWarmupCompleted + 67;
                    onNavigationEvent = i28 % 128;
                    int i29 = i28 % 2;
                }
                if ((i7 & 147) != 146) {
                    int i30 = onNavigationEvent + 21;
                    onWarmupCompleted = i30 % 128;
                    int i31 = i30 % 2;
                    z = true;
                } else {
                    int i32 = onNavigationEvent + 65;
                    onWarmupCompleted = i32 % 128;
                    int i33 = i32 % 2;
                    z = false;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i7 & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i34 = onNavigationEvent + 113;
                        onWarmupCompleted = i34 % 128;
                        int i35 = i34 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1534850281, i7, -1, "im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageNavHost (CreditQuizMyPageNavigationRoute.kt:36)");
                    }
                    Object objOnNavigationEvent = ((kotlin.Result) AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(creditQuizMyPageViewModel.IAuthTabCallback(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7).onExtraCallbackWithResult()).onNavigationEvent();
                    if (kotlin.Result.onExtraCallback(objOnNavigationEvent)) {
                        objOnNavigationEvent = null;
                    }
                    final ActivityOnPausePoint activityOnPausePoint = (ActivityOnPausePoint) objOnNavigationEvent;
                    if (activityOnPausePoint == null) {
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                            obj = null;
                            return obj;
                        }
                        function2 = new Function2() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageNavigationRouteKt$$ExternalSyntheticLambda11
                            private static int onExtraCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj2, Object obj3) {
                                Unit unit;
                                int i36 = 2 % 2;
                                int i37 = onExtraCallback + 73;
                                onNavigationEvent = i37 % 128;
                                if (i37 % 2 != 0) {
                                    String str2 = str;
                                    CreditQuizMyPageViewModel creditQuizMyPageViewModel2 = creditQuizMyPageViewModel;
                                    Function1 function12 = function1;
                                    int i38 = iIntValue;
                                    int iIntValue2 = ((Integer) obj3).intValue();
                                    Object[] objArr2 = {str2, creditQuizMyPageViewModel2, function12, Integer.valueOf(i38), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue2)};
                                    int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
                                    unit = (Unit) AppCreatePoint.onExtraCallback(-39195595, TTVideoLandingPageActivity.onExtraCallbackWithResult(), objArr2, 39195595, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
                                    int i39 = 88 / 0;
                                } else {
                                    String str3 = str;
                                    CreditQuizMyPageViewModel creditQuizMyPageViewModel3 = creditQuizMyPageViewModel;
                                    Function1 function13 = function1;
                                    int i40 = iIntValue;
                                    int iIntValue3 = ((Integer) obj3).intValue();
                                    Object[] objArr3 = {str3, creditQuizMyPageViewModel3, function13, Integer.valueOf(i40), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue3)};
                                    int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
                                    unit = (Unit) AppCreatePoint.onExtraCallback(-39195595, TTVideoLandingPageActivity.onExtraCallbackWithResult(), objArr3, 39195595, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
                                }
                                int i41 = onNavigationEvent + 33;
                                onExtraCallback = i41 % 128;
                                int i42 = i41 % 2;
                                return unit;
                            }
                        };
                        obj = null;
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
                        return obj;
                    }
                    final setParentLayoutDirection setparentlayoutdirectionOnWarmupCompleted = RippleAnimationfadeOut21.onWarmupCompleted(new PullRefreshIndicatorKtExternalSyntheticLambda3[0], cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    final Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
                    QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                    component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
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
                    boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(setparentlayoutdirectionOnWarmupCompleted);
                    boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(context);
                    boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(creditQuizMyPageViewModel);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!(zOnExtraCallback | zOnExtraCallback2 | zOnExtraCallback3)) {
                        int i36 = onWarmupCompleted + 69;
                        onNavigationEvent = i36 % 128;
                        int i37 = i36 % 2;
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized = new Function0() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageNavigationRouteKt$$ExternalSyntheticLambda12
                                private static int onExtraCallback = 0;
                                private static int onWarmupCompleted = 1;

                                public final Object invoke() {
                                    int i38 = 2 % 2;
                                    int i39 = onExtraCallback + 79;
                                    onWarmupCompleted = i39 % 128;
                                    int i40 = i39 % 2;
                                    Unit unitIAuthTabCallback = AppCreatePoint.IAuthTabCallback(setparentlayoutdirectionOnWarmupCompleted, context, creditQuizMyPageViewModel);
                                    int i41 = onExtraCallback + 73;
                                    onWarmupCompleted = i41 % 128;
                                    int i42 = i41 % 2;
                                    return unitIAuthTabCallback;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        }
                        requestPostMessageChannel.onExtraCallbackWithResult(false, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
                        String strOnNavigationEvent = onAppCreate.onExtraCallbackWithResult.onExtraCallback.onNavigationEvent();
                        setAdVideoPlaybackListener.onExtraCallbackWithResult(setparentlayoutdirectionOnWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        boolean z4 = (i7 & 14) == 4;
                        boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(creditQuizMyPageViewModel);
                        boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(setparentlayoutdirectionOnWarmupCompleted);
                        boolean z5 = (i7 & 896) == 256;
                        boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(activityOnPausePoint);
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!(z4 | zOnExtraCallback4 | zOnExtraCallback5 | z5 | zOnExtraCallback6)) {
                            Object obj2 = objOnMinimized2;
                            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                Function1 function12 = new Function1() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageNavigationRouteKt$$ExternalSyntheticLambda13
                                    private static int IAuthTabCallback = 1;
                                    private static int onExtraCallbackWithResult;

                                    public final Object invoke(Object obj3) {
                                        int i38 = 2 % 2;
                                        int i39 = onExtraCallbackWithResult + 111;
                                        IAuthTabCallback = i39 % 128;
                                        int i40 = i39 % 2;
                                        Unit unitOnWarmupCompleted = AppCreatePoint.onWarmupCompleted(str, creditQuizMyPageViewModel, setparentlayoutdirectionOnWarmupCompleted, function1, activityOnPausePoint, (ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8) obj3);
                                        int i41 = IAuthTabCallback + 75;
                                        onExtraCallbackWithResult = i41 % 128;
                                        if (i41 % 2 == 0) {
                                            return unitOnWarmupCompleted;
                                        }
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function12);
                                obj2 = function12;
                            }
                            obj = null;
                            RippleHostViewExternalSyntheticLambda0.onWarmupCompleted(setparentlayoutdirectionOnWarmupCompleted, strOnNavigationEvent, quirksExternalSyntheticBackport0OnNavigationEvent2, (QuirkSettingsLoader) null, (String) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) obj2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 384, 0, 1016);
                            final AppExitPoint appExitPointOnNavigationEvent = activityOnPausePoint.onNavigationEvent();
                            if (appExitPointOnNavigationEvent == null) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1037777747);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1037777746);
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult.onWarmupCompleted());
                                final QuizCta quizCtaOnWarmupCompleted = activityOnPausePoint.onWarmupCompleted();
                                if (quizCtaOnWarmupCompleted == null) {
                                    int i38 = onWarmupCompleted + 19;
                                    onNavigationEvent = i38 % 128;
                                    int i39 = i38 % 2;
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(918726300);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                    getbacktracenote = null;
                                    i8 = 54;
                                    z2 = true;
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(918726301);
                                    i8 = 54;
                                    z2 = true;
                                    getBacktraceNote getbacktracenoteOnExtraCallback = ForwardingCameraControl.onExtraCallback(323910194, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageNavigationRouteKt$$ExternalSyntheticLambda14
                                        private static int onNavigationEvent = 1;
                                        private static int onWarmupCompleted;

                                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                            int i40 = 2 % 2;
                                            int i41 = onNavigationEvent + 111;
                                            onWarmupCompleted = i41 % 128;
                                            int i42 = i41 % 2;
                                            Unit unitOnNavigationEvent = AppCreatePoint.onNavigationEvent(appExitPointOnNavigationEvent, quizCtaOnWarmupCompleted, (u3) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                            int i43 = onWarmupCompleted + 125;
                                            onNavigationEvent = i43 % 128;
                                            int i44 = i43 % 2;
                                            return unitOnNavigationEvent;
                                        }
                                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                    getbacktracenote = getbacktracenoteOnExtraCallback;
                                }
                                u1.IAuthTabCallback(quirksExternalSyntheticBackport0OnWarmupCompleted2, (u2) null, ForwardingCameraControl.onExtraCallback(-1757067137, z2, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageNavigationRouteKt$$ExternalSyntheticLambda15
                                    private static int onExtraCallback = 1;
                                    private static int onWarmupCompleted;

                                    public final Object invoke(Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
                                        int i40 = 2 % 2;
                                        int i41 = onExtraCallback + 7;
                                        onWarmupCompleted = i41 % 128;
                                        if (i41 % 2 == 0) {
                                            return AppCreatePoint.onNavigationEvent(appExitPointOnNavigationEvent, activityOnPausePoint, creditQuizMyPageViewModel, str, (u4) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                        }
                                        Unit unitOnNavigationEvent = AppCreatePoint.onNavigationEvent(appExitPointOnNavigationEvent, activityOnPausePoint, creditQuizMyPageViewModel, str, (u4) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                        int i42 = 96 / 0;
                                        return unitOnNavigationEvent;
                                    }
                                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i8), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (setCallToAction.onExtraCallbackWithResult) null, getbacktracenote, (getBacktraceNote) null, 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 384, 0, 4026);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                int i40 = onWarmupCompleted + 25;
                                onNavigationEvent = i40 % 128;
                                int i41 = i40 % 2;
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                        }
                    }
                    return obj;
                }
                obj = null;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    function2 = new Function2() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageNavigationRouteKt$$ExternalSyntheticLambda16
                        private static int onExtraCallbackWithResult = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj3, Object obj4) {
                            Unit unitIAuthTabCallback;
                            int i42 = 2 % 2;
                            int i43 = onExtraCallbackWithResult + 95;
                            onNavigationEvent = i43 % 128;
                            if (i43 % 2 == 0) {
                                unitIAuthTabCallback = AppCreatePoint.IAuthTabCallback(str, creditQuizMyPageViewModel, function1, iIntValue, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                int i44 = 83 / 0;
                            } else {
                                unitIAuthTabCallback = AppCreatePoint.IAuthTabCallback(str, creditQuizMyPageViewModel, function1, iIntValue, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            }
                            int i45 = onNavigationEvent + 125;
                            onExtraCallbackWithResult = i45 % 128;
                            int i46 = i45 % 2;
                            return unitIAuthTabCallback;
                        }
                    };
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
                }
                return obj;
            case 5:
                return onExtraCallback(objArr);
            case 6:
                AppExitPoint appExitPoint = (AppExitPoint) objArr[0];
                QuizCta quizCta = (QuizCta) objArr[1];
                u3 u3Var = (u3) objArr[2];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
                int iIntValue2 = ((Number) objArr[4]).intValue();
                int i42 = 2 % 2;
                Intrinsics.checkNotNullParameter(u3Var, "");
                if ((iIntValue2 & 6) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(u3Var)) {
                        int i43 = onNavigationEvent + 85;
                        onWarmupCompleted = i43 % 128;
                        if (i43 % 2 != 0) {
                            i23 = 5;
                        }
                    } else {
                        i23 = 2;
                    }
                    iIntValue2 |= i23;
                }
                if ((iIntValue2 & 19) != 18) {
                    int i44 = onWarmupCompleted + 77;
                    onNavigationEvent = i44 % 128;
                    int i45 = i44 % 2;
                    z3 = true;
                }
                if (!cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z3, iIntValue2 & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                } else {
                    int i46 = onWarmupCompleted + 107;
                    onNavigationEvent = i46 % 128;
                    int i47 = i46 % 2;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(323910194, iIntValue2, -1, "im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageNavHost.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditQuizMyPageNavigationRoute.kt:118)");
                    }
                    if (appExitPoint.needTermsAgreement()) {
                        int i48 = onNavigationEvent + 9;
                        onWarmupCompleted = i48 % 128;
                        int i49 = i48 % 2;
                        strOnExtraCallback = quizCta.IAuthTabCallback();
                    } else {
                        strOnExtraCallback = quizCta.onExtraCallback();
                    }
                    if (StringsKt.isBlank(strOnExtraCallback)) {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1181867184);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1182628296);
                        u3Var.onWarmupCompleted((QuirksExternalSyntheticBackport0) null, ForwardingCameraControl.onExtraCallback(-2066490409, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageNavigationRouteKt$$ExternalSyntheticLambda1
                            private static int IAuthTabCallback = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                int i50 = 2 % 2;
                                int i51 = onWarmupCompleted + 123;
                                IAuthTabCallback = i51 % 128;
                                int i52 = i51 % 2;
                                Unit unitOnExtraCallback = AppCreatePoint.onExtraCallback(strOnExtraCallback, (u3) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                int i53 = IAuthTabCallback + 121;
                                onWarmupCompleted = i53 % 128;
                                int i54 = i53 % 2;
                                return unitOnExtraCallback;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, ((iIntValue2 << 6) & 896) | 48, 1);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
                return Unit.INSTANCE;
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                CreditQuizMyPageViewModel creditQuizMyPageViewModel2 = (CreditQuizMyPageViewModel) objArr[0];
                setParentLayoutDirection setparentlayoutdirection = (setParentLayoutDirection) objArr[1];
                int i50 = 2 % 2;
                int i51 = onNavigationEvent + 19;
                onWarmupCompleted = i51 % 128;
                int i52 = i51 % 2;
                Unit unit = (Unit) onExtraCallback(-1078457862, TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{creditQuizMyPageViewModel2, setparentlayoutdirection}, 1078457869, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
                int i53 = onWarmupCompleted + 67;
                onNavigationEvent = i53 % 128;
                int i54 = i53 % 2;
                return unit;
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return onTransact(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        long jLongValue = ((Number) objArr[0]).longValue();
        String str = (String) objArr[1];
        Function0 function0 = (Function0) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(jLongValue, str, (Function0<Unit>) function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 85;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(long j, String str, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 23;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {Long.valueOf(j), str, function0, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallback(-1161124724, TTVideoLandingPageActivity.onExtraCallbackWithResult(), objArr, 1161124729, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
        int i6 = onNavigationEvent + 99;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditQuizMyPageViewModel creditQuizMyPageViewModel) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(creditQuizMyPageViewModel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(creditQuizMyPageViewModel);
        int i3 = onWarmupCompleted + 69;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditQuizMyPageViewModel creditQuizMyPageViewModel, ActivityOnPausePoint activityOnPausePoint, AppExitPoint appExitPoint, String str, String str2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditQuizMyPageViewModel, activityOnPausePoint, appExitPoint, str, str2);
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        int i5 = onNavigationEvent + 105;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 39;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 29;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, useandconfigureprogramwithtexture);
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        int i5 = onNavigationEvent + 9;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ decrementVideoUsage onExtraCallback(Function0 function0, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        decrementVideoUsage decrementvideousage = (decrementVideoUsage) onExtraCallback(-252163393, TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{function0, isinvideousage}, 252163395, iOnExtraCallbackWithResult2, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
        int i4 = onNavigationEvent + 5;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return decrementvideousage;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        CreditQuizMyPageViewModel creditQuizMyPageViewModel = (CreditQuizMyPageViewModel) objArr[0];
        String str = (String) objArr[1];
        AppExitPoint appExitPoint = (AppExitPoint) objArr[2];
        String str2 = (String) objArr[3];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[4];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(creditQuizMyPageViewModel, str, appExitPoint, str2, setDetectableSize);
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 65;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return IAuthTabCallback(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallback(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        String str = (String) objArr[0];
        CreditQuizMyPageViewModel creditQuizMyPageViewModel = (CreditQuizMyPageViewModel) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue2 = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return (Unit) onExtraCallback(-1997993744, TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{str, creditQuizMyPageViewModel, function1, Integer.valueOf(iIntValue), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue2)}, 1997993753, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditQuizMyPageViewModel creditQuizMyPageViewModel, setParentLayoutDirection setparentlayoutdirection) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallback(creditQuizMyPageViewModel, setparentlayoutdirection);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(creditQuizMyPageViewModel, setparentlayoutdirection);
        int i3 = onWarmupCompleted + 55;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(String str, CreditQuizMyPageViewModel creditQuizMyPageViewModel, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 41;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            onExtraCallback(889362224, TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{str, creditQuizMyPageViewModel, function1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i))}, -889362220, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
        } else {
            onExtraCallback(889362224, TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{str, creditQuizMyPageViewModel, function1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))}, -889362220, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent(ActivityOnPausePoint activityOnPausePoint, CreditQuizMyPageViewModel creditQuizMyPageViewModel) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(activityOnPausePoint, creditQuizMyPageViewModel);
        int i4 = onWarmupCompleted + 95;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(AppExitPoint appExitPoint, QuizCta quizCta, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 47;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {appExitPoint, quizCta, u3Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        if (i4 != 0) {
            return (Unit) onExtraCallback(1640971713, TTVideoLandingPageActivity.onExtraCallbackWithResult(), objArr, -1640971707, iOnExtraCallbackWithResult2, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(AppExitPoint appExitPoint, ActivityOnPausePoint activityOnPausePoint, CreditQuizMyPageViewModel creditQuizMyPageViewModel, String str, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 83;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(appExitPoint, activityOnPausePoint, creditQuizMyPageViewModel, str, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 14 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        String str = (String) objArr[0];
        CreditQuizMyPageViewModel creditQuizMyPageViewModel = (CreditQuizMyPageViewModel) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(889362224, TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{str, creditQuizMyPageViewModel, function1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1))}, -889362220, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 65;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, CreditQuizMyPageViewModel creditQuizMyPageViewModel, setParentLayoutDirection setparentlayoutdirection, Function1 function1, ActivityOnPausePoint activityOnPausePoint, ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, creditQuizMyPageViewModel, setparentlayoutdirection, function1, activityOnPausePoint, exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8);
        int i4 = onWarmupCompleted + 85;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, CreditQuizMyPageViewModel creditQuizMyPageViewModel, setParentLayoutDirection setparentlayoutdirection, Function1 function1, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 33;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            IAuthTabCallback(str, creditQuizMyPageViewModel, setparentlayoutdirection, function1, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(str, creditQuizMyPageViewModel, setparentlayoutdirection, function1, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onNavigationEvent + 79;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(function1, str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function1, str);
        int i3 = onWarmupCompleted + 9;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit onWarmupCompleted(setParentLayoutDirection setparentlayoutdirection, Context context, CreditQuizMyPageViewModel creditQuizMyPageViewModel) {
        int i = 2 % 2;
        ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2AsInterface = setparentlayoutdirection.asInterface();
        if (!Intrinsics.areEqual(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2AsInterface != null ? exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2AsInterface.getInterfaceDescriptor() : null, onAppCreate.onExtraCallbackWithResult.onExtraCallback.onNavigationEvent())) {
            creditQuizMyPageViewModel.onNavigationEvent(true);
            setparentlayoutdirection.getInterfaceDescriptor();
        } else {
            int i2 = onWarmupCompleted + 113;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                zzbc.IAuthTabCallback(context).finish();
                int i3 = 75 / 0;
            } else {
                zzbc.IAuthTabCallback(context).finish();
            }
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 39;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(CreditQuizMyPageViewModel creditQuizMyPageViewModel) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            creditQuizMyPageViewModel.isEngagementSignalsApiAvailable();
            unit = Unit.INSTANCE;
            int i3 = 47 / 0;
        } else {
            creditQuizMyPageViewModel.isEngagementSignalsApiAvailable();
            unit = Unit.INSTANCE;
        }
        int i4 = onNavigationEvent + 19;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static final class onNavigationEvent implements decrementVideoUsage {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Function0 IAuthTabCallback;

        public onNavigationEvent(Function0 function0) {
            this.IAuthTabCallback = function0;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                this.IAuthTabCallback.invoke();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.IAuthTabCallback.invoke();
            int i3 = onWarmupCompleted + 87;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        String strOnNavigationEvent;
        setPositionProvider setpositionprovider;
        PullRefreshIndicatorKtExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallback;
        int i;
        Object obj;
        CreditQuizMyPageViewModel creditQuizMyPageViewModel = (CreditQuizMyPageViewModel) objArr[0];
        setParentLayoutDirection setparentlayoutdirection = (setParentLayoutDirection) objArr[1];
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 115;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            creditQuizMyPageViewModel.onNavigationEvent(true);
            strOnNavigationEvent = onAppCreate.onExtraCallback.onWarmupCompleted.onNavigationEvent();
            setpositionprovider = null;
            iAuthTabCallback = null;
            i = 68;
            obj = null;
        } else {
            creditQuizMyPageViewModel.onNavigationEvent(false);
            strOnNavigationEvent = onAppCreate.onExtraCallback.onWarmupCompleted.onNavigationEvent();
            setpositionprovider = null;
            iAuthTabCallback = null;
            i = 6;
            obj = null;
        }
        TypographyKtExternalSyntheticLambda0.onNavigationEvent(setparentlayoutdirection, strOnNavigationEvent, setpositionprovider, iAuthTabCallback, i, obj);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 97;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(Function1 function1, String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(str);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 67;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(String str, final CreditQuizMyPageViewModel creditQuizMyPageViewModel, final setParentLayoutDirection setparentlayoutdirection, final Function1 function1, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        Object obj;
        Object obj2;
        Object obj3;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(setdividerdrawable, "");
        Intrinsics.checkNotNullParameter(twoLineExternalSyntheticLambda0, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onWarmupCompleted + 71;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1530048000, i, -1, "im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageNavHost.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditQuizMyPageNavigationRoute.kt:60)");
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1530048000, i, -1, "im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageNavHost.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditQuizMyPageNavigationRoute.kt:60)");
        }
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditQuizMyPageViewModel);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnExtraCallback) {
            obj = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                Function0 function0 = new Function0() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageNavigationRouteKt$$ExternalSyntheticLambda2
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        Unit unitIAuthTabCallback;
                        int i4 = 2 % 2;
                        int i5 = onWarmupCompleted + 11;
                        onNavigationEvent = i5 % 128;
                        if (i5 % 2 != 0) {
                            unitIAuthTabCallback = AppCreatePoint.IAuthTabCallback(creditQuizMyPageViewModel);
                            int i6 = 54 / 0;
                        } else {
                            unitIAuthTabCallback = AppCreatePoint.IAuthTabCallback(creditQuizMyPageViewModel);
                        }
                        int i7 = onNavigationEvent + 69;
                        onWarmupCompleted = i7 % 128;
                        int i8 = i7 % 2;
                        return unitIAuthTabCallback;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0);
                int i4 = onNavigationEvent + 77;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                obj = function0;
            }
        }
        onExtraCallbackWithResult(1303033L, str, (Function0<Unit>) obj, cameraCaptureResultEmptyCameraCaptureResult, 6);
        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditQuizMyPageViewModel);
        boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(setparentlayoutdirection);
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnExtraCallback2 | zOnExtraCallback3)) {
            int i6 = onNavigationEvent + 87;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 90 / 0;
                obj2 = objOnMinimized2;
                if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function0 function02 = new Function0() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageNavigationRouteKt$$ExternalSyntheticLambda3
                        private static int IAuthTabCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke() {
                            int i8 = 2 % 2;
                            int i9 = onWarmupCompleted + 113;
                            IAuthTabCallback = i9 % 128;
                            int i10 = i9 % 2;
                            Object[] objArr = {creditQuizMyPageViewModel, setparentlayoutdirection};
                            int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
                            Unit unit = (Unit) AppCreatePoint.onExtraCallback(41394507, TTVideoLandingPageActivity.onExtraCallbackWithResult(), objArr, -41394499, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
                            int i11 = IAuthTabCallback + 19;
                            onWarmupCompleted = i11 % 128;
                            if (i11 % 2 == 0) {
                                int i12 = 89 / 0;
                            }
                            return unit;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function02);
                    obj2 = function02;
                }
            } else {
                obj2 = objOnMinimized2;
                if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
            }
        }
        Function0 function03 = (Function0) obj2;
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnNavigationEvent) {
            Function1 function12 = new Function1() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageNavigationRouteKt$$ExternalSyntheticLambda4
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj5) {
                    int i8 = 2 % 2;
                    int i9 = onExtraCallbackWithResult + 25;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    Unit unitOnWarmupCompleted = AppCreatePoint.onWarmupCompleted(function1, (String) obj5);
                    int i11 = onExtraCallbackWithResult + 49;
                    onWarmupCompleted = i11 % 128;
                    int i12 = i11 % 2;
                    return unitOnWarmupCompleted;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function12);
            int i8 = onNavigationEvent + 57;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            obj3 = function12;
        } else {
            int i10 = onNavigationEvent + 57;
            onWarmupCompleted = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 38 / 0;
                obj3 = objOnMinimized3;
                if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
            } else {
                obj3 = objOnMinimized3;
                if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
            }
        }
        AppCreateMenuPointType.onWarmupCompleted(str, creditQuizMyPageViewModel, function03, (Function1) obj3, cameraCaptureResultEmptyCameraCaptureResult, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(CreditQuizMyPageViewModel creditQuizMyPageViewModel) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            creditQuizMyPageViewModel.isEngagementSignalsApiAvailable();
            return Unit.INSTANCE;
        }
        creditQuizMyPageViewModel.isEngagementSignalsApiAvailable();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0073 A[PHI: r8
      0x0073: PHI (r8v2 o.AppExitPoint) = (r8v1 o.AppExitPoint), (r8v10 o.AppExitPoint) binds: [B:8:0x0071, B:5:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(ActivityOnPausePoint activityOnPausePoint, SetDetectableSize setDetectableSize) throws Throwable {
        AppExitPoint appExitPointOnNavigationEvent;
        String logParam;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr = new Object[1];
            a(ViewConfiguration.getWindowTouchSlop() >> 124, 16 << (ViewConfiguration.getMinimumFlingVelocity() - 52), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >>> 100), objArr);
            setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "credit_quiz_mypage");
            appExitPointOnNavigationEvent = activityOnPausePoint.onNavigationEvent();
            if (appExitPointOnNavigationEvent != null) {
                logParam = appExitPointOnNavigationEvent.getLogParam();
            } else {
                int i3 = onWarmupCompleted + 105;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                logParam = null;
            }
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr2 = new Object[1];
            a(ViewConfiguration.getWindowTouchSlop() >> 8, 8 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
            setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), "credit_quiz_mypage");
            appExitPointOnNavigationEvent = activityOnPausePoint.onNavigationEvent();
            if (appExitPointOnNavigationEvent != null) {
            }
        }
        setDetectableSize.onExtraCallback("cta_type", logParam);
        Unit unit = Unit.INSTANCE;
        int i5 = onWarmupCompleted + 49;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(final ActivityOnPausePoint activityOnPausePoint, CreditQuizMyPageViewModel creditQuizMyPageViewModel) {
        String logParam;
        int i = 2 % 2;
        AppExitPoint appExitPointOnNavigationEvent = activityOnPausePoint.onNavigationEvent();
        Object obj = null;
        if (appExitPointOnNavigationEvent != null) {
            int i2 = onNavigationEvent + 31;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                appExitPointOnNavigationEvent.getLogParam();
                obj.hashCode();
                throw null;
            }
            logParam = appExitPointOnNavigationEvent.getLogParam();
        } else {
            logParam = null;
        }
        CreditBaseViewModel.onExtraCallback(creditQuizMyPageViewModel, 1303059L, logParam, false, true, new Function1() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageNavigationRouteKt$$ExternalSyntheticLambda10
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj2) throws Throwable {
                int i3 = 2 % 2;
                int i4 = onNavigationEvent + 17;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                Unit unitIAuthTabCallback = AppCreatePoint.IAuthTabCallback(activityOnPausePoint, (SetDetectableSize) obj2);
                int i6 = onWarmupCompleted + 53;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    return unitIAuthTabCallback;
                }
                throw null;
            }
        }, 4, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 99;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.onExtraCallbackWithResult(useandconfigureprogramwithtexture, str);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.onExtraCallbackWithResult(useandconfigureprogramwithtexture, str);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 15;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        long j;
        char c2;
        char c3;
        Throwable cause;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            j = 0;
            c2 = 3;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onExtraCallbackWithResult[i + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59698 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 16 - MotionEvent.axisFromString(""), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46182 - AndroidCharacter.getMirror('0')), 31 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 20220 - Color.argb(0, 0, 0, 0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    char gidForName = (char) (Process.getGidForName("") + 49124);
                    int scrollBarFadeDuration = 44 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 1494;
                    byte b = (byte) (-$$a[3]);
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(gidForName, scrollBarFadeDuration, deadChar, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i5 = $11 + 123;
                $10 = i5 % 128;
                int i6 = i5 % 2;
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
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $10 + 79;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 49123);
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(j) + 45;
                    int minimumFlingVelocity = 1494 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    byte b3 = (byte) (-$$a[c2]);
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(maxKeyCode, packedPositionChild, minimumFlingVelocity, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i8 = 27 / 0;
                c3 = 3;
            } else {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback5 == null) {
                    char packedPositionChild2 = (char) (49122 - ExpandableListView.getPackedPositionChild(j));
                    int iIndexOf = 44 - TextUtils.indexOf("", "", 0);
                    int packedPositionGroup = 1494 - ExpandableListView.getPackedPositionGroup(j);
                    c3 = 3;
                    byte b5 = (byte) (-$$a[3]);
                    byte b6 = (byte) (b5 + 1);
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionChild2, iIndexOf, packedPositionGroup, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                } else {
                    c3 = 3;
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            int i9 = $10 + 17;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            c2 = c3;
            j = 0;
        }
        objArr[0] = new String(cArr);
    }

    private static final Unit onExtraCallback(CreditQuizMyPageViewModel creditQuizMyPageViewModel, setParentLayoutDirection setparentlayoutdirection) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        creditQuizMyPageViewModel.onNavigationEvent(true);
        setparentlayoutdirection.getInterfaceDescriptor();
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 67;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(CreditQuizMyPageViewModel creditQuizMyPageViewModel, Function1 function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        boolean z = true;
        int i3 = onNavigationEvent + 1;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        if (i3 % 2 == 0 ? (i & 3) == 2 : (i & 3) == 3) {
            z = false;
        } else {
            int i5 = i4 + 7;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        boolean zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1);
        Object obj = null;
        if (zOnWarmupCompleted) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-636808751, i, -1, "im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageNavHost.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditQuizMyPageNavigationRoute.kt:104)");
            }
            ActivityResultPoint.onNavigationEvent("credit_quiz_mypage", creditQuizMyPageViewModel, (QuirksExternalSyntheticBackport0) null, (Function1<? super String, Unit>) function1, cameraCaptureResultEmptyCameraCaptureResult, 6, 4);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onNavigationEvent + 31;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i8 = onWarmupCompleted + 55;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(final CreditQuizMyPageViewModel creditQuizMyPageViewModel, final ActivityOnPausePoint activityOnPausePoint, final setParentLayoutDirection setparentlayoutdirection, final Function1 function1, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        Object obj;
        Object obj2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(setdividerdrawable, "");
        Intrinsics.checkNotNullParameter(twoLineExternalSyntheticLambda0, "");
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1960329673, i, -1, "im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageNavHost.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditQuizMyPageNavigationRoute.kt:78)");
        }
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditQuizMyPageViewModel);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnExtraCallback) {
            int i3 = onWarmupCompleted + 125;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 37 / 0;
                obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function0 function0 = new Function0() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageNavigationRouteKt$$ExternalSyntheticLambda5
                        private static int onExtraCallbackWithResult = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke() {
                            int i5 = 2 % 2;
                            int i6 = onExtraCallbackWithResult + 125;
                            onWarmupCompleted = i6 % 128;
                            if (i6 % 2 != 0) {
                                AppCreatePoint.onExtraCallback(creditQuizMyPageViewModel);
                                throw null;
                            }
                            Unit unitOnExtraCallback = AppCreatePoint.onExtraCallback(creditQuizMyPageViewModel);
                            int i7 = onWarmupCompleted + 107;
                            onExtraCallbackWithResult = i7 % 128;
                            if (i7 % 2 != 0) {
                                return unitOnExtraCallback;
                            }
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0);
                    obj = function0;
                }
            } else {
                obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
            }
        }
        onExtraCallbackWithResult(1266247L, "credit_quiz_mypage", (Function0<Unit>) obj, cameraCaptureResultEmptyCameraCaptureResult, 54);
        final String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.credit_quiz_mypage_history_title, cameraCaptureResultEmptyCameraCaptureResult, 0);
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(activityOnPausePoint);
        boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditQuizMyPageViewModel);
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnExtraCallback2 | zOnExtraCallback3) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized2 = new Function0() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageNavigationRouteKt$$ExternalSyntheticLambda6
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke() {
                    int i5 = 2 % 2;
                    int i6 = onNavigationEvent + 65;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    ActivityOnPausePoint activityOnPausePoint2 = activityOnPausePoint;
                    if (i7 != 0) {
                        return AppCreatePoint.onNavigationEvent(activityOnPausePoint2, creditQuizMyPageViewModel);
                    }
                    AppCreatePoint.onNavigationEvent(activityOnPausePoint2, creditQuizMyPageViewModel);
                    throw null;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = ImageLoaderBuilderExternalSyntheticLambda1.onWarmupCompleted(onextracallback, 0.0f, null, (Function0) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, 6, 3);
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(strOnExtraCallback);
        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnNavigationEvent) {
            int i5 = onNavigationEvent + 73;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 26 / 0;
                if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized3 = new Function1() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageNavigationRouteKt$$ExternalSyntheticLambda7
                        private static int IAuthTabCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj3) {
                            int i7 = 2 % 2;
                            int i8 = onWarmupCompleted + 11;
                            IAuthTabCallback = i8 % 128;
                            int i9 = i8 % 2;
                            Unit unitOnExtraCallback = AppCreatePoint.onExtraCallback(strOnExtraCallback, (useAndConfigureProgramWithTexture) obj3);
                            int i10 = IAuthTabCallback + 25;
                            onWarmupCompleted = i10 % 128;
                            int i11 = i10 % 2;
                            return unitOnExtraCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                }
            } else if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            }
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnWarmupCompleted, false, (Function1) objOnMinimized3, 1, (Object) null);
        boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditQuizMyPageViewModel);
        boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(setparentlayoutdirection);
        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnExtraCallback4 | zOnExtraCallback5)) {
            obj2 = objOnMinimized4;
            if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                Function0 function02 = new Function0() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageNavigationRouteKt$$ExternalSyntheticLambda8
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke() {
                        int i7 = 2 % 2;
                        int i8 = onWarmupCompleted + 51;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                        Unit unitOnNavigationEvent = AppCreatePoint.onNavigationEvent(creditQuizMyPageViewModel, setparentlayoutdirection);
                        int i10 = IAuthTabCallback + 3;
                        onWarmupCompleted = i10 % 128;
                        if (i10 % 2 != 0) {
                            int i11 = 29 / 0;
                        }
                        return unitOnNavigationEvent;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function02);
                obj2 = function02;
            }
        }
        PromptPoint.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, 0L, (Function0) obj2, ForwardingCameraControl.onExtraCallback(-636808751, true, new Function2() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageNavigationRouteKt$$ExternalSyntheticLambda9
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj3, Object obj4) {
                Unit unitIAuthTabCallback;
                int i7 = 2 % 2;
                int i8 = onExtraCallback + 29;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 != 0) {
                    unitIAuthTabCallback = AppCreatePoint.IAuthTabCallback(creditQuizMyPageViewModel, function1, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i9 = 89 / 0;
                } else {
                    unitIAuthTabCallback = AppCreatePoint.IAuthTabCallback(creditQuizMyPageViewModel, function1, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                }
                int i10 = onNavigationEvent + 89;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                return unitIAuthTabCallback;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = onWarmupCompleted + 53;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(final String str, final CreditQuizMyPageViewModel creditQuizMyPageViewModel, final setParentLayoutDirection setparentlayoutdirection, final Function1 function1, final ActivityOnPausePoint activityOnPausePoint, ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        RippleContainer.onNavigationEvent(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, onAppCreate.onExtraCallbackWithResult.onExtraCallback.onNavigationEvent(), (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ForwardingCameraControl.onExtraCallbackWithResult(-1530048000, true, new setTaggedAddrCtrl() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageNavigationRouteKt$$ExternalSyntheticLambda17
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 125;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    return AppCreatePoint.onWarmupCompleted(str, creditQuizMyPageViewModel, setparentlayoutdirection, function1, (setDividerDrawable) obj, (TwoLineExternalSyntheticLambda0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                }
                Unit unitOnWarmupCompleted = AppCreatePoint.onWarmupCompleted(str, creditQuizMyPageViewModel, setparentlayoutdirection, function1, (setDividerDrawable) obj, (TwoLineExternalSyntheticLambda0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                int i4 = 26 / 0;
                return unitOnWarmupCompleted;
            }
        }), 254, (Object) null);
        RippleContainer.onNavigationEvent(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, onAppCreate.onExtraCallback.onWarmupCompleted.onNavigationEvent(), (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ForwardingCameraControl.onExtraCallbackWithResult(-1960329673, true, new setTaggedAddrCtrl() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageNavigationRouteKt$$ExternalSyntheticLambda18
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 27;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unit = (Unit) AppCreatePoint.onExtraCallback(1248613171, TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{creditQuizMyPageViewModel, activityOnPausePoint, setparentlayoutdirection, function1, (setDividerDrawable) obj, (TwoLineExternalSyntheticLambda0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())}, -1248613168, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
                int i5 = onNavigationEvent + 13;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }
        }), 254, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        long jLongValue;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1))) {
            int i3 = onWarmupCompleted + 105;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1400741899, i, -1, "im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageNavHost.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditQuizMyPageNavigationRoute.kt:128)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                int i5 = onWarmupCompleted + 39;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1788210578);
                jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1788211538);
                jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            int i7 = onNavigationEvent + 75;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, quirksExternalSyntheticBackport0OnExtraCallback, null, Long.valueOf(jLongValue), 0L, 0L, null, null, createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.IAuthTabCallback()), Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 48, 0, 130804}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onWarmupCompleted + 33;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(final String str, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 31;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(u3Var, "");
            z = (i & 103) != 113;
        } else {
            Intrinsics.checkNotNullParameter(u3Var, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i4 = onNavigationEvent + 3;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2066490409, i, -1, "im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageNavHost.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditQuizMyPageNavigationRoute.kt:125)");
            }
            getStarPath.onExtraCallbackWithResult(-514183958, 514183960, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{ForwardingCameraControl.onExtraCallback(1400741899, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageNavigationRouteKt$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = 2 % 2;
                    int i7 = onNavigationEvent + 65;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    Unit unitOnExtraCallbackWithResult = AppCreatePoint.onExtraCallbackWithResult(str, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i9 = IAuthTabCallback + 123;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), getDistanceBetweenPoints.onWarmupCompleted.Companion.IAuthTabCallbackDefault(), null, Float.valueOf(0.0f), cameraCaptureResultEmptyCameraCaptureResult, 54, 12}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i6 = onWarmupCompleted + 79;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(CreditQuizMyPageViewModel creditQuizMyPageViewModel, String str, AppExitPoint appExitPoint, String str2, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        if (!creditQuizMyPageViewModel.asInterface()) {
            int i4 = onNavigationEvent + 123;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            str = "credit_quiz_mypage";
        }
        Object[] objArr = new Object[1];
        a(1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 8 - Color.alpha(0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        setDetectableSize.onExtraCallback("cta_type", appExitPoint.getLogParam());
        setDetectableSize.onExtraCallback("button_text", str2);
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(final CreditQuizMyPageViewModel creditQuizMyPageViewModel, ActivityOnPausePoint activityOnPausePoint, final AppExitPoint appExitPoint, final String str, final String str2) {
        long j;
        String str3;
        int i = 2 % 2;
        if (creditQuizMyPageViewModel.asInterface()) {
            j = 1303043;
        } else {
            int i2 = onWarmupCompleted + 83;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            j = 1303057;
        }
        ConvertByteArrayToFloatArray.onExtraCallback(j, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageNavigationRouteKt$$ExternalSyntheticLambda22
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i4 = 2 % 2;
                int i5 = onExtraCallbackWithResult + 77;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                CreditQuizMyPageViewModel creditQuizMyPageViewModel2 = creditQuizMyPageViewModel;
                if (i6 == 0) {
                    Object[] objArr = {creditQuizMyPageViewModel2, str, appExitPoint, str2, (SetDetectableSize) obj};
                    int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
                    return (Unit) AppCreatePoint.onExtraCallback(895237671, TTVideoLandingPageActivity.onExtraCallbackWithResult(), objArr, -895237670, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
                }
                Object[] objArr2 = {creditQuizMyPageViewModel2, str, appExitPoint, str2, (SetDetectableSize) obj};
                int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
                int i7 = 1 / 0;
                return (Unit) AppCreatePoint.onExtraCallback(895237671, TTVideoLandingPageActivity.onExtraCallbackWithResult(), objArr2, -895237670, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
            }
        }, 14, null);
        QuizCta quizCtaOnWarmupCompleted = activityOnPausePoint.onWarmupCompleted();
        if (creditQuizMyPageViewModel.asInterface()) {
            int i4 = onNavigationEvent + 21;
            onWarmupCompleted = i4 % 128;
            str3 = "credit_quiz_mypage";
            if (i4 % 2 != 0) {
                int i5 = 39 / 0;
            }
        } else {
            str3 = "credit_quiz_mypage_detail";
        }
        CreditQuizMyPageViewModel.onExtraCallbackWithResult(new Object[]{creditQuizMyPageViewModel, quizCtaOnWarmupCompleted, appExitPoint, str3}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -1285714508, 1285714508, JsParamKeys.onExtraCallbackWithResult());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(final AppExitPoint appExitPoint, final ActivityOnPausePoint activityOnPausePoint, final CreditQuizMyPageViewModel creditQuizMyPageViewModel, final String str, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        String strOnNavigationEvent;
        String text;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            int i4 = onNavigationEvent + 39;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                int i6 = onNavigationEvent + 47;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2 != 0 ? 2 : 4;
                i2 = i | i7;
                int i8 = onNavigationEvent + 15;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
            }
        } else {
            i2 = i;
        }
        boolean zBooleanValue = false;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1757067137, i2, -1, "im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageNavHost.<anonymous>.<anonymous>.<anonymous> (CreditQuizMyPageNavigationRoute.kt:141)");
                int i10 = onWarmupCompleted + 65;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
            }
            int i12 = onWarmupCompleted.onExtraCallbackWithResult[appExitPoint.ordinal()];
            if (i12 != 1) {
                int i13 = onNavigationEvent + 115;
                onWarmupCompleted = i13 % 128;
                if (i13 % 2 == 0 ? i12 == 2 : i12 == 3) {
                    QuizCta quizCtaOnWarmupCompleted = activityOnPausePoint.onWarmupCompleted();
                    if (quizCtaOnWarmupCompleted == null || (text = quizCtaOnWarmupCompleted.onNavigationEvent()) == null) {
                        text = appExitPoint.getText();
                    }
                } else {
                    if (i12 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    QuizCta quizCtaOnWarmupCompleted2 = activityOnPausePoint.onWarmupCompleted();
                    if (quizCtaOnWarmupCompleted2 == null || (text = quizCtaOnWarmupCompleted2.onExtraCallbackWithResult()) == null) {
                        text = appExitPoint.getText();
                        int i14 = onNavigationEvent + 95;
                        onWarmupCompleted = i14 % 128;
                        int i15 = i14 % 2;
                    }
                }
            } else {
                QuizCta quizCtaOnWarmupCompleted3 = activityOnPausePoint.onWarmupCompleted();
                if (quizCtaOnWarmupCompleted3 == null || (strOnNavigationEvent = quizCtaOnWarmupCompleted3.onNavigationEvent()) == null) {
                    String text2 = appExitPoint.getText();
                    MyQuizDetailsResponse myQuizDetailsResponseAsInterface = activityOnPausePoint.asInterface();
                    strOnNavigationEvent = String.format(text2, Arrays.copyOf(new Object[]{Long.valueOf(myQuizDetailsResponseAsInterface != null ? myQuizDetailsResponseAsInterface.IAuthTabCallbackDefault() : 0L)}, 1));
                    Intrinsics.checkNotNullExpressionValue(strOnNavigationEvent, "");
                }
                text = strOnNavigationEvent;
            }
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditQuizMyPageViewModel);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(appExitPoint.ordinal());
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(text);
            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(activityOnPausePoint);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(!(zOnExtraCallback | zOnNavigationEvent | zOnExtraCallback2 | zOnNavigationEvent2 | zOnExtraCallback3)) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                final String str2 = text;
                Function0 function0 = new Function0() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageNavigationRouteKt$$ExternalSyntheticLambda23
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke() {
                        int i16 = 2 % 2;
                        int i17 = onWarmupCompleted + 45;
                        onExtraCallback = i17 % 128;
                        int i18 = i17 % 2;
                        Unit unitOnExtraCallback = AppCreatePoint.onExtraCallback(creditQuizMyPageViewModel, activityOnPausePoint, appExitPoint, str, str2);
                        int i19 = onExtraCallback + 109;
                        onWarmupCompleted = i19 % 128;
                        if (i19 % 2 == 0) {
                            return unitOnExtraCallback;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0);
                objOnMinimized = function0;
            }
            Function0 function02 = (Function0) objOnMinimized;
            if (!appExitPoint.needTermsAgreement()) {
                QuizCta quizCtaOnWarmupCompleted4 = activityOnPausePoint.onWarmupCompleted();
                if (quizCtaOnWarmupCompleted4 != null) {
                    int i16 = onNavigationEvent + 89;
                    onWarmupCompleted = i16 % 128;
                    int i17 = i16 % 2;
                    Boolean boolOnWarmupCompleted = quizCtaOnWarmupCompleted4.onWarmupCompleted();
                    if (boolOnWarmupCompleted != null) {
                        zBooleanValue = boolOnWarmupCompleted.booleanValue();
                    } else {
                        if (appExitPoint != AppExitPoint.COOLTIME) {
                            z = true;
                        }
                        u4Var.onNavigationEvent(text, (QuirksExternalSyntheticBackport0) null, (Function0) null, function02, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, z, false, cameraCaptureResultEmptyCameraCaptureResult, 0, i2 & 14, 758);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                    z = zBooleanValue;
                    u4Var.onNavigationEvent(text, (QuirksExternalSyntheticBackport0) null, (Function0) null, function02, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, z, false, cameraCaptureResultEmptyCameraCaptureResult, 0, i2 & 14, 758);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(Process.getGidForName("") + 1, 8 - KeyEvent.keyCodeFromString(""), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 117;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(final long j, final String str, final Function0<Unit> function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) throws Throwable {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1444649044);
        if ((i & 6) == 0) {
            int i6 = onNavigationEvent + 99;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 70 / 0;
                i4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ? 4 : 2;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j)) {
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                int i8 = onWarmupCompleted + 3;
                onNavigationEvent = i8 % 128;
                i3 = i8 % 2 == 0 ? 21104 : 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        int i9 = i2;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i9 & 147) != 146, i9 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1444649044, i9, -1, "im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageLogger (CreditQuizMyPageNavigationRoute.kt:187)");
            }
            boolean z = (i9 & 112) == 32;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!z) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function1 function1 = new Function1() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageNavigationRouteKt$$ExternalSyntheticLambda19
                        private static int onExtraCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj2) throws Throwable {
                            int i10 = 2 % 2;
                            int i11 = onExtraCallback + 45;
                            onNavigationEvent = i11 % 128;
                            int i12 = i11 % 2;
                            Unit unitIAuthTabCallback = AppCreatePoint.IAuthTabCallback(str, (SetDetectableSize) obj2);
                            int i13 = onNavigationEvent + 25;
                            onExtraCallback = i13 % 128;
                            int i14 = i13 % 2;
                            return unitIAuthTabCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function1);
                    obj = function1;
                }
                RealImageLoaderexecute3.onNavigationEvent(j, null, null, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i9 & 14, 6);
                Boolean bool = Boolean.TRUE;
                boolean z2 = (i9 & 896) == 256;
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (z2 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized2 = new Function1() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageNavigationRouteKt$$ExternalSyntheticLambda20
                        private static int onExtraCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke(Object obj2) {
                            int i10 = 2 % 2;
                            int i11 = onExtraCallbackWithResult + 55;
                            onExtraCallback = i11 % 128;
                            int i12 = i11 % 2;
                            decrementVideoUsage decrementvideousageOnExtraCallback = AppCreatePoint.onExtraCallback(function0, (isInVideoUsage) obj2);
                            int i13 = onExtraCallbackWithResult + 113;
                            onExtraCallback = i13 % 128;
                            if (i13 % 2 == 0) {
                                return decrementvideousageOnExtraCallback;
                            }
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                }
                isZslDisabledByByUserCaseConfig.onExtraCallback(bool, (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i10 = onNavigationEvent + 51;
                    onWarmupCompleted = i10 % 128;
                    int i11 = i10 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageNavigationRouteKt$$ExternalSyntheticLambda21
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i12 = 2 % 2;
                    int i13 = onWarmupCompleted + 99;
                    IAuthTabCallback = i13 % 128;
                    int i14 = i13 % 2;
                    Unit unitOnExtraCallback = AppCreatePoint.onExtraCallback(j, str, function0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i15 = onWarmupCompleted + 29;
                    IAuthTabCallback = i15 % 128;
                    int i16 = i15 % 2;
                    return unitOnExtraCallback;
                }
            });
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter((isInVideoUsage) objArr[1], "");
        onNavigationEvent onnavigationevent = new onNavigationEvent(function0);
        int i2 = onWarmupCompleted + 59;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onnavigationevent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditQuizMyPageViewModel creditQuizMyPageViewModel, ActivityOnPausePoint activityOnPausePoint, setParentLayoutDirection setparentlayoutdirection, Function1 function1, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {creditQuizMyPageViewModel, activityOnPausePoint, setparentlayoutdirection, function1, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(1248613171, TTVideoLandingPageActivity.onExtraCallbackWithResult(), objArr, -1248613168, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, CreditQuizMyPageViewModel creditQuizMyPageViewModel, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {str, creditQuizMyPageViewModel, function1, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(-39195595, TTVideoLandingPageActivity.onExtraCallbackWithResult(), objArr, 39195595, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditQuizMyPageViewModel creditQuizMyPageViewModel, setParentLayoutDirection setparentlayoutdirection) {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(41394507, TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{creditQuizMyPageViewModel, setparentlayoutdirection}, -41394499, iOnExtraCallbackWithResult2, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditQuizMyPageViewModel creditQuizMyPageViewModel, String str, AppExitPoint appExitPoint, String str2, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(895237671, TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{creditQuizMyPageViewModel, str, appExitPoint, str2, setDetectableSize}, -895237670, iOnExtraCallbackWithResult2, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    private static final decrementVideoUsage onNavigationEvent(Function0 function0, isInVideoUsage isinvideousage) {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (decrementVideoUsage) onExtraCallback(-252163393, TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{function0, isinvideousage}, 252163395, iOnExtraCallbackWithResult2, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    private static final Unit onWarmupCompleted(long j, String str, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Long.valueOf(j), str, function0, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(-1161124724, TTVideoLandingPageActivity.onExtraCallbackWithResult(), objArr, 1161124729, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    public static final void onExtraCallback(@NotNull String str, @NotNull CreditQuizMyPageViewModel creditQuizMyPageViewModel, @NotNull Function1<? super String, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {str, creditQuizMyPageViewModel, function1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        onExtraCallback(889362224, TTVideoLandingPageActivity.onExtraCallbackWithResult(), objArr, -889362220, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    private static final Unit onExtraCallback(String str, CreditQuizMyPageViewModel creditQuizMyPageViewModel, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {str, creditQuizMyPageViewModel, function1, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(-1997993744, TTVideoLandingPageActivity.onExtraCallbackWithResult(), objArr, 1997993753, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    private static final Unit onWarmupCompleted(CreditQuizMyPageViewModel creditQuizMyPageViewModel, setParentLayoutDirection setparentlayoutdirection) {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(-1078457862, TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{creditQuizMyPageViewModel, setparentlayoutdirection}, 1078457869, iOnExtraCallbackWithResult2, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    private static final Unit onExtraCallbackWithResult(AppExitPoint appExitPoint, QuizCta quizCta, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {appExitPoint, quizCta, u3Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(1640971713, TTVideoLandingPageActivity.onExtraCallbackWithResult(), objArr, -1640971707, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }
}
