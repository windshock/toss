package o;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelProvider;
import im.toss.features.home.feature.expense_method_edit.ExpenseMethodEditViewModel;
import im.toss.features.home.feature.expense_method_edit.screen.ExpenseMethodEditScreenKt$;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import im.toss.tds.compose.component.compound.tablerow.ComposableSingletons$TdsTableRowV1Kt$;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.OfficialAppPoint;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.clearPermissions;
import o.setCallToAction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class startPermissionGuide {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static char[] IAuthTabCallback = {51243, 51244, 64991, 51245, 64981, 65004, 64967, 64961, 51242, 64986, 64977, 64982, 64989, 51240, 64988, 64966};
    private static char onWarmupCompleted = 51245;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Unit unit;
        ExpenseMethodEditViewModel expenseMethodEditViewModel = (ExpenseMethodEditViewModel) objArr[0];
        String str = (String) objArr[1];
        SessionTrackerb sessionTrackerb = (SessionTrackerb) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int iIntValue2 = ((Number) objArr[4]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue3 = ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {expenseMethodEditViewModel, str, sessionTrackerb, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue3)};
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        if (i3 == 0) {
            unit = (Unit) onNavigationEvent(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90323971, iOnExtraCallbackWithResult3, objArr2, iOnExtraCallbackWithResult, -90323964, iOnExtraCallbackWithResult2);
            int i4 = 49 / 0;
        } else {
            unit = (Unit) onNavigationEvent(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90323971, iOnExtraCallbackWithResult3, objArr2, iOnExtraCallbackWithResult, -90323964, iOnExtraCallbackWithResult2);
        }
        int i5 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, AccessControlException accessControlException, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, accessControlException, setDetectableSize);
        int i4 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, OfficialAppPoint.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult, boolean z, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(str, onextracallbackwithresult, z, setDetectableSize);
        }
        onWarmupCompleted(str, onextracallbackwithresult, z, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getAuthNoticeDialog getauthnoticedialog, String str, Activity activity, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {getauthnoticedialog, str, activity, u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        Unit unit = (Unit) onNavigationEvent(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1467259489, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult, -1467259489, iOnExtraCallbackWithResult2);
        int i5 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getAuthNoticeDialog getauthnoticedialog, ignorePermission ignorepermission, String str, ExpenseMethodEditViewModel expenseMethodEditViewModel, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Unit unit;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            unit = (Unit) onNavigationEvent(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1895324585, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{getauthnoticedialog, ignorepermission, str, expenseMethodEditViewModel, u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -1895324584, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
            int i4 = 1 / 0;
        } else {
            unit = (Unit) onNavigationEvent(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1895324585, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{getauthnoticedialog, ignorepermission, str, expenseMethodEditViewModel, u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -1895324584, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        }
        int i5 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        ExpenseMethodEditViewModel expenseMethodEditViewModel = (ExpenseMethodEditViewModel) objArr[0];
        String str = (String) objArr[1];
        SessionTrackerb sessionTrackerb = (SessionTrackerb) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int iIntValue2 = ((Number) objArr[4]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(expenseMethodEditViewModel, str, sessionTrackerb, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        ignorePermission ignorepermission = (ignorePermission) objArr[0];
        String str = (String) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(ignorepermission, str, setDetectableSize);
        int i4 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(Activity activity, String str, AccessControlException accessControlException) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(activity, str, accessControlException);
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        int i5 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(ExpenseMethodEditViewModel expenseMethodEditViewModel) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        Unit unit = (Unit) onNavigationEvent(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 784730902, iOnExtraCallbackWithResult3, new Object[]{expenseMethodEditViewModel}, iOnExtraCallbackWithResult, -784730900, iOnExtraCallbackWithResult2);
        int i4 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, OfficialAppPoint officialAppPoint, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, officialAppPoint, setDetectableSize);
        int i4 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(clearPermissions clearpermissions, SessionTrackerb sessionTrackerb, Context context, String str, OfficialAppPoint.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            throw null;
        }
        int iOnExtraCallbackWithResult4 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        Unit unit = (Unit) onNavigationEvent(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 602655243, iOnExtraCallbackWithResult6, new Object[]{clearpermissions, sessionTrackerb, context, str, onnavigationevent}, iOnExtraCallbackWithResult4, -602655237, iOnExtraCallbackWithResult5);
        int i3 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(getAuthNoticeDialog getauthnoticedialog, Resources resources, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getauthnoticedialog, resources, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 74 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(ignorePermission ignorepermission, String str, AccessControlException accessControlException, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(ignorepermission, str, accessControlException, setDetectableSize);
        }
        onNavigationEvent(ignorepermission, str, accessControlException, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ExpenseMethodEditViewModel expenseMethodEditViewModel, ignorePermission ignorepermission, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(expenseMethodEditViewModel, ignorepermission, str);
        int i4 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 69 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, OfficialAppPoint.onNavigationEvent onnavigationevent, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(str, onnavigationevent, setDetectableSize);
        }
        onNavigationEvent(str, onnavigationevent, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        AccessControlException accessControlExceptionOnExtraCallbackWithResult;
        int i7 = (~((~i4) | i5)) | i2;
        int i8 = ~i2;
        int i9 = (~(i8 | i5)) | (~(i8 | i4)) | (~(i5 | i4));
        int i10 = (~(i4 | (~i5))) | i8;
        int i11 = i2 + i5 + i6 + ((-2137991558) * i3) + (111092868 * i);
        int i12 = i11 * i11;
        int i13 = (((-431794203) * i2) - 566755328) + (427185167 * i5) + (i7 * 1717982222) + (1717982222 * i9) + ((-1717982222) * i10) + ((-1290797056) * i6) + ((-1247805440) * i3) + ((-1807745024) * i) + ((-591921152) * i12);
        int i14 = (i2 * (-1469267343)) + 1003592187 + (i5 * (-1469268429)) + (i7 * (-362)) + (i9 * (-362)) + (i10 * 362) + ((-1469268067) * i6) + (1951436498 * i3) + ((-746069772) * i) + (i12 * (-1529348096));
        boolean z = false;
        switch (i13 + (i14 * i14 * 1762131968)) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return onNavigationEvent(objArr);
            case 6:
                return onTransact(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            case 8:
                getAuthNoticeDialog getauthnoticedialog = (getAuthNoticeDialog) objArr[0];
                Resources resources = (Resources) objArr[1];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue = ((Number) objArr[3]).intValue();
                int i15 = 2 % 2;
                int i16 = onExtraCallbackWithResult + 63;
                onNavigationEvent = i16 % 128;
                int i17 = i16 % 2;
                Unit unitIAuthTabCallback = IAuthTabCallback(getauthnoticedialog, resources, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i18 = onExtraCallbackWithResult + 77;
                onNavigationEvent = i18 % 128;
                int i19 = i18 % 2;
                return unitIAuthTabCallback;
            default:
                getAuthNoticeDialog getauthnoticedialog2 = (getAuthNoticeDialog) objArr[0];
                String str = (String) objArr[1];
                Activity activity = (Activity) objArr[2];
                u4 u4Var = (u4) objArr[3];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
                int iIntValue2 = ((Number) objArr[5]).intValue();
                int i20 = 2 % 2;
                Intrinsics.checkNotNullParameter(u4Var, "");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(u4Var) ^ true ? 2 : 4;
                    int i21 = onExtraCallbackWithResult + 83;
                    onNavigationEvent = i21 % 128;
                    int i22 = i21 % 2;
                }
                if ((iIntValue2 & 19) != 18) {
                    int i23 = onExtraCallbackWithResult + 29;
                    onNavigationEvent = i23 % 128;
                    int i24 = i23 % 2;
                    z = true;
                }
                if (!cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, iIntValue2 & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                } else {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2137499024, iIntValue2, -1, "im.toss.features.home.feature.expense_method_edit.screen.ExpenseMethodEditScreen.<anonymous>.<anonymous> (ExpenseMethodEditScreen.kt:122)");
                    }
                    PermissionSettingPointInner permissionSettingPointInnerOnExtraCallbackWithResult = getauthnoticedialog2.onExtraCallbackWithResult();
                    if (permissionSettingPointInnerOnExtraCallbackWithResult != null) {
                        int i25 = onNavigationEvent + 57;
                        onExtraCallbackWithResult = i25 % 128;
                        int i26 = i25 % 2;
                        accessControlExceptionOnExtraCallbackWithResult = permissionSettingPointInnerOnExtraCallbackWithResult.onExtraCallbackWithResult();
                    } else {
                        accessControlExceptionOnExtraCallbackWithResult = null;
                    }
                    if (accessControlExceptionOnExtraCallbackWithResult != null) {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1048093040);
                        String strOnExtraCallbackWithResult = accessControlExceptionOnExtraCallbackWithResult.onExtraCallbackWithResult();
                        setCallToAction.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = setCallToAction.IAuthTabCallback.Companion.onWarmupCompleted();
                        setCallToAction.onExtraCallback onextracallback = setCallToAction.onExtraCallback.Weak;
                        setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Dark;
                        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(str);
                        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(accessControlExceptionOnExtraCallbackWithResult);
                        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(activity);
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                        if ((zOnNavigationEvent | zOnExtraCallback | zOnExtraCallback2) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized = new ExpenseMethodEditScreenKt$.ExternalSyntheticLambda5(activity, str, accessControlExceptionOnExtraCallbackWithResult);
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
                        }
                        u4Var.onNavigationEvent(strOnExtraCallbackWithResult, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) objOnMinimized, onextracallback, onwarmupcompleted, iAuthTabCallbackOnWarmupCompleted, (setCallToAction.onNavigationEvent) null, false, false, cameraCaptureResultEmptyCameraCaptureResult2, 1794048, iIntValue2 & 14, 902);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1047388782);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    }
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        int i27 = onExtraCallbackWithResult + 85;
                        onNavigationEvent = i27 % 128;
                        int i28 = i27 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
                return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        String str = (String) objArr[0];
        OfficialAppPoint officialAppPoint = (OfficialAppPoint) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, officialAppPoint, setDetectableSize);
        int i4 = onNavigationEvent + 123;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, OfficialAppPoint officialAppPoint) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, officialAppPoint);
        int i4 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(clearPermissions clearpermissions, ExpenseMethodEditViewModel expenseMethodEditViewModel, String str, OfficialAppPoint.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(clearpermissions, expenseMethodEditViewModel, str, onextracallbackwithresult, z);
        int i4 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(getAuthNoticeDialog getauthnoticedialog) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(getauthnoticedialog);
        int i4 = onExtraCallbackWithResult + 11;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(getAuthNoticeDialog getauthnoticedialog, ignorePermission ignorepermission, String str, ExpenseMethodEditViewModel expenseMethodEditViewModel, Activity activity, v5b v5bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            IAuthTabCallback(getauthnoticedialog, ignorepermission, str, expenseMethodEditViewModel, activity, v5bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(getauthnoticedialog, ignorepermission, str, expenseMethodEditViewModel, activity, v5bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallbackWithResult + 15;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(ExpenseMethodEditViewModel expenseMethodEditViewModel, ignorePermission ignorepermission, String str, AccessControlException accessControlException) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(expenseMethodEditViewModel, ignorepermission, str, accessControlException);
        }
        IAuthTabCallback(expenseMethodEditViewModel, ignorepermission, str, accessControlException);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(clearPermissions clearpermissions, ExpenseMethodEditViewModel expenseMethodEditViewModel, String str, SessionTrackerb sessionTrackerb, ignorePermission ignorepermission, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 99;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(clearpermissions, expenseMethodEditViewModel, str, sessionTrackerb, ignorepermission, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 3 / 0;
        }
        int i6 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        ExpenseMethodEditViewModel expenseMethodEditViewModel = (ExpenseMethodEditViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            ExpenseMethodEditViewModel.onExtraCallback(iIAuthTabCallback, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, -1460879787, new Object[]{expenseMethodEditViewModel}, 1460879789);
            return Unit.INSTANCE;
        }
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback4 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        ExpenseMethodEditViewModel.onExtraCallback(iIAuthTabCallback3, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback4, -1460879787, new Object[]{expenseMethodEditViewModel}, 1460879789);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(access13800Var);
            int i2 = onExtraCallback + 55;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onNavigationEvent(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i3 = onExtraCallback + 105;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                onwarmupcompletedCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(unit);
            int i4 = onNavigationEvent + 5;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 15 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onExtraCallback + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1372226L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 123;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 78 / 0;
            }
            return unit;
        }
    }

    private static final Unit onExtraCallback(getAuthNoticeDialog getauthnoticedialog) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            getauthnoticedialog.onNavigationEvent();
            int i3 = 72 / 0;
            return Unit.INSTANCE;
        }
        getauthnoticedialog.onNavigationEvent();
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(getAuthNoticeDialog getauthnoticedialog, Resources resources, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        AccessControlException accessControlExceptionOnExtraCallback;
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onExtraCallbackWithResult + 27;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(40354636, i, -1, "im.toss.features.home.feature.expense_method_edit.screen.ExpenseMethodEditScreen.<anonymous> (ExpenseMethodEditScreen.kt:84)");
                    int i4 = 65 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(40354636, i, -1, "im.toss.features.home.feature.expense_method_edit.screen.ExpenseMethodEditScreen.<anonymous> (ExpenseMethodEditScreen.kt:84)");
                }
            }
            PermissionSettingPointInner permissionSettingPointInnerOnExtraCallbackWithResult = getauthnoticedialog.onExtraCallbackWithResult();
            if (permissionSettingPointInnerOnExtraCallbackWithResult != null) {
                int i5 = onExtraCallbackWithResult + 17;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                accessControlExceptionOnExtraCallback = permissionSettingPointInnerOnExtraCallbackWithResult.onExtraCallback();
            } else {
                accessControlExceptionOnExtraCallback = null;
            }
            if (accessControlExceptionOnExtraCallback != null) {
                int i7 = onNavigationEvent + 31;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-385772558);
                AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(accessControlExceptionOnExtraCallback.onNavigationEvent(resources), (QuirksExternalSyntheticBackport0) null, (getHumanReadableName) null, 0L, 0L, 0L, (handshake) null, (Integer) null, (createCameraCaptureCallback) null, 0.0f, (Map) null, (bindChildren) null, (use) null, 0L, 0, false, (GraphicDeviceInfo) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 262142);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-385676458);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(getAuthNoticeDialog getauthnoticedialog, Resources resources, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        AccessControlException accessControlExceptionOnNavigationEvent;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 41;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        boolean z = false;
        if (i3 % 2 == 0 ? (i & 3) == 2 : (i & 2) == 2) {
            int i5 = i4 + 67;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        } else {
            int i7 = i4 + 17;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 != 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1965136243, i, -1, "im.toss.features.home.feature.expense_method_edit.screen.ExpenseMethodEditScreen.<anonymous> (ExpenseMethodEditScreen.kt:90)");
            }
            PermissionSettingPointInner permissionSettingPointInnerOnExtraCallbackWithResult = getauthnoticedialog.onExtraCallbackWithResult();
            if (permissionSettingPointInnerOnExtraCallbackWithResult != null) {
                accessControlExceptionOnNavigationEvent = permissionSettingPointInnerOnExtraCallbackWithResult.onNavigationEvent();
                int i8 = onExtraCallbackWithResult + 15;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 5 % 3;
                }
            } else {
                accessControlExceptionOnNavigationEvent = null;
            }
            if (accessControlExceptionOnNavigationEvent != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1325511823);
                AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(accessControlExceptionOnNavigationEvent.onNavigationEvent(resources), (QuirksExternalSyntheticBackport0) null, (getHumanReadableName) null, 0L, 0L, 0L, (handshake) null, (Integer) null, (createCameraCaptureCallback) null, 0.0f, (Map) null, (bindChildren) null, (use) null, 0L, 0, false, (GraphicDeviceInfo) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 262142);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1325609845);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(ignorePermission ignorepermission, String str, AccessControlException accessControlException, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("final_card_cnt", Integer.valueOf(ignorepermission.onWarmupCompleted()));
        setDetectableSize.onExtraCallback("final_account_cnt", Integer.valueOf(ignorepermission.IAuthTabCallback()));
        setDetectableSize.onExtraCallback("final_etc_cnt", Integer.valueOf(ignorepermission.IAuthTabCallbackDefault()));
        setDetectableSize.onExtraCallback("card_cnt", Integer.valueOf(ignorepermission.onExtraCallback()));
        setDetectableSize.onExtraCallback("account_cnt", Integer.valueOf(ignorepermission.onExtraCallbackWithResult()));
        setDetectableSize.onExtraCallback("etc_cnt", Integer.valueOf(ignorepermission.onNavigationEvent()));
        Object[] objArr = new Object[1];
        a(new char[]{11, 15, 7, '\b', 13814, 13814, 15, 11}, (byte) (13 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 9 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        Object[] objArr2 = new Object[1];
        a(new char[]{11, 14, 13930, 13930, 15, '\r', 6, 7, '\n', 5, 3, '\n'}, (byte) (125 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 12 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), accessControlException.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(ExpenseMethodEditViewModel expenseMethodEditViewModel, ignorePermission ignorepermission, String str, AccessControlException accessControlException) {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1372228L, false, (String) null, (Map) null, new ExpenseMethodEditScreenKt$.ExternalSyntheticLambda2(ignorepermission, str, accessControlException), 14, (Object) null);
        expenseMethodEditViewModel.asInterface();
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 24 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        AccessControlException accessControlExceptionOnWarmupCompleted;
        Object obj;
        int i;
        getAuthNoticeDialog getauthnoticedialog = (getAuthNoticeDialog) objArr[0];
        ignorePermission ignorepermission = (ignorePermission) objArr[1];
        String str = (String) objArr[2];
        ExpenseMethodEditViewModel expenseMethodEditViewModel = (ExpenseMethodEditViewModel) objArr[3];
        u4 u4Var = (u4) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((iIntValue & 6) == 0) {
            int i3 = onExtraCallbackWithResult + 55;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 11 / 0;
                i = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2;
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
            }
            iIntValue |= i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            int i5 = onNavigationEvent + 59;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-264285487, iIntValue, -1, "im.toss.features.home.feature.expense_method_edit.screen.ExpenseMethodEditScreen.<anonymous>.<anonymous> (ExpenseMethodEditScreen.kt:98)");
            }
            PermissionSettingPointInner permissionSettingPointInnerOnExtraCallbackWithResult = getauthnoticedialog.onExtraCallbackWithResult();
            if (permissionSettingPointInnerOnExtraCallbackWithResult != null) {
                accessControlExceptionOnWarmupCompleted = permissionSettingPointInnerOnExtraCallbackWithResult.onWarmupCompleted();
            } else {
                int i7 = onExtraCallbackWithResult + 123;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 4 / 5;
                }
                accessControlExceptionOnWarmupCompleted = null;
            }
            if (accessControlExceptionOnWarmupCompleted != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-653689387);
                String strOnExtraCallbackWithResult = accessControlExceptionOnWarmupCompleted.onExtraCallbackWithResult();
                setCallToAction.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = setCallToAction.IAuthTabCallback.Companion.onWarmupCompleted();
                setCallToAction.onExtraCallback onextracallback = setCallToAction.onExtraCallback.Fill;
                setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Primary;
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(ignorepermission);
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(accessControlExceptionOnWarmupCompleted);
                boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(expenseMethodEditViewModel);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnNavigationEvent | zOnNavigationEvent2 | zOnExtraCallback | zOnNavigationEvent3)) {
                    int i9 = onNavigationEvent + 119;
                    onExtraCallbackWithResult = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 89 / 0;
                        obj = objOnMinimized;
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            ExpenseMethodEditScreenKt$.ExternalSyntheticLambda20 externalSyntheticLambda20 = new ExpenseMethodEditScreenKt$.ExternalSyntheticLambda20(expenseMethodEditViewModel, ignorepermission, str, accessControlExceptionOnWarmupCompleted);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda20);
                            obj = externalSyntheticLambda20;
                        }
                        u4Var.onNavigationEvent(strOnExtraCallbackWithResult, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, onextracallback, onwarmupcompleted, iAuthTabCallbackOnWarmupCompleted, (setCallToAction.onNavigationEvent) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 1794048, iIntValue & 14, 902);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    } else {
                        obj = objOnMinimized;
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        }
                        u4Var.onNavigationEvent(strOnExtraCallbackWithResult, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, onextracallback, onwarmupcompleted, iAuthTabCallbackOnWarmupCompleted, (setCallToAction.onNavigationEvent) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 1794048, iIntValue & 14, 902);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-652437359);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i11 = onExtraCallbackWithResult + 21;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i13 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i13 % 128;
        if (i13 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(String str, AccessControlException accessControlException, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{11, 15, 7, '\b', 13814, 13814, 15, 11}, (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 14), 8 - KeyEvent.getDeadChar(0, 0), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        Object[] objArr2 = new Object[1];
        a(new char[]{11, 14, 13930, 13930, 15, '\r', 6, 7, '\n', 5, 3, '\n'}, (byte) (124 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 12 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), accessControlException.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(Activity activity, String str, AccessControlException accessControlException) {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1372228L, false, (String) null, (Map) null, new ExpenseMethodEditScreenKt$.ExternalSyntheticLambda4(str, accessControlException), 14, (Object) null);
        if (activity != null) {
            int i2 = onNavigationEvent + 29;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                activity.finish();
            } else {
                activity.finish();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 99 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(getAuthNoticeDialog getauthnoticedialog, ignorePermission ignorepermission, String str, ExpenseMethodEditViewModel expenseMethodEditViewModel, Activity activity, v5b v5bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(v5bVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(v5bVar)) {
                int i7 = onNavigationEvent + 97;
                onExtraCallbackWithResult = i7 % 128;
                i3 = i7 % 2 != 0 ? 3 : 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i8 = onExtraCallbackWithResult + 97;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(939182269, i2, -1, "im.toss.features.home.feature.expense_method_edit.screen.ExpenseMethodEditScreen.<anonymous> (ExpenseMethodEditScreen.kt:96)");
            }
            v5bVar.onNavigationEvent((QuirksExternalSyntheticBackport0) null, ForwardingCameraControl.onExtraCallback(-264285487, true, new ExpenseMethodEditScreenKt$.ExternalSyntheticLambda0(getauthnoticedialog, ignorepermission, str, expenseMethodEditViewModel), cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(-2137499024, true, new ExpenseMethodEditScreenKt$.ExternalSyntheticLambda1(getauthnoticedialog, str, activity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 9) & 7168) | 432, 1);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onExtraCallbackWithResult + 101;
                onNavigationEvent = i10 % 128;
                if (i10 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i11 = 96 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i12 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i12 % 128;
        int i13 = i12 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(clearPermissions clearpermissions, ExpenseMethodEditViewModel expenseMethodEditViewModel, String str, OfficialAppPoint.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            int i3 = 2 / 0;
            if (!((clearPermissions.onExtraCallback) clearpermissions).onNavigationEvent()) {
                expenseMethodEditViewModel.onExtraCallbackWithResult(onextracallbackwithresult.onTransact(), z);
                onExtraCallback(onextracallbackwithresult, z, str);
                int i4 = onExtraCallbackWithResult + 5;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            if (!((clearPermissions.onExtraCallback) clearpermissions).onNavigationEvent()) {
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(String str, OfficialAppPoint.onNavigationEvent onnavigationevent, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{11, 15, 7, '\b', 13814, 13814, 15, 11}, (byte) (14 - View.resolveSizeAndState(0, 0, 0)), 8 - Color.argb(0, 0, 0, 0), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        setDetectableSize.onExtraCallback("item_title", onnavigationevent.onExtraCallback().onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        clearPermissions.onExtraCallback onextracallback = (clearPermissions) objArr[0];
        SessionTrackerb sessionTrackerb = (SessionTrackerb) objArr[1];
        Context context = (Context) objArr[2];
        String str = (String) objArr[3];
        OfficialAppPoint.onNavigationEvent onnavigationevent = (OfficialAppPoint.onNavigationEvent) objArr[4];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        if (!onextracallback.onNavigationEvent()) {
            SessionTrackerb.onExtraCallbackWithResult(sessionTrackerb, context, onnavigationevent.onWarmupCompleted(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1372220L, false, (String) null, (Map) null, new ExpenseMethodEditScreenKt$.ExternalSyntheticLambda3(str, onnavigationevent), 14, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(ignorePermission ignorepermission, String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("final_card_cnt", Integer.valueOf(ignorepermission.onWarmupCompleted()));
        setDetectableSize.onExtraCallback("final_account_cnt", Integer.valueOf(ignorepermission.IAuthTabCallback()));
        setDetectableSize.onExtraCallback("final_etc_cnt", Integer.valueOf(ignorepermission.IAuthTabCallbackDefault()));
        setDetectableSize.onExtraCallback("card_cnt", Integer.valueOf(ignorepermission.onExtraCallback()));
        setDetectableSize.onExtraCallback("account_cnt", Integer.valueOf(ignorepermission.onExtraCallbackWithResult()));
        setDetectableSize.onExtraCallback("etc_cnt", Integer.valueOf(ignorepermission.onNavigationEvent()));
        Object[] objArr = new Object[1];
        a(new char[]{11, 15, 7, '\b', 13814, 13814, 15, 11}, (byte) (13 - TextUtils.indexOf((CharSequence) "", '0', 0)), 8 - TextUtils.indexOf("", "", 0, 0), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(ExpenseMethodEditViewModel expenseMethodEditViewModel, ignorePermission ignorepermission, String str) {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1372222L, false, (String) null, (Map) null, new ExpenseMethodEditScreenKt$.ExternalSyntheticLambda6(ignorepermission, str), 14, (Object) null);
        expenseMethodEditViewModel.asInterface();
        Unit unit = Unit.INSTANCE;
        int i2 = onNavigationEvent + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(String str, OfficialAppPoint officialAppPoint, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{11, 15, 7, '\b', 13814, 13814, 15, 11}, (byte) ((Process.myPid() >> 22) + 14), TextUtils.getOffsetBefore("", 0) + 8, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        setDetectableSize.onExtraCallback("asset_type", ((OfficialAppPoint.onWarmupCompleted) officialAppPoint).onNavigationEvent().getLogName());
        if (officialAppPoint instanceof OfficialAppPoint.onWarmupCompleted.onExtraCallbackWithResult) {
            int i4 = onExtraCallbackWithResult + 49;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                OfficialAppPoint.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult = (OfficialAppPoint.onWarmupCompleted.onExtraCallbackWithResult) officialAppPoint;
                setDetectableSize.onExtraCallback("id", onextracallbackwithresult.onTransact());
                setDetectableSize.onExtraCallback("enabled_yn", zzaz.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallback()));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            OfficialAppPoint.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult2 = (OfficialAppPoint.onWarmupCompleted.onExtraCallbackWithResult) officialAppPoint;
            setDetectableSize.onExtraCallback("id", onextracallbackwithresult2.onTransact());
            setDetectableSize.onExtraCallback("enabled_yn", zzaz.onExtraCallbackWithResult(onextracallbackwithresult2.onExtraCallback()));
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(String str, OfficialAppPoint officialAppPoint, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{11, 15, 7, '\b', 13814, 13814, 15, 11}, (byte) (15 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), ExpandableListView.getPackedPositionType(0L) + 8, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        setDetectableSize.onExtraCallback("item_title", ((OfficialAppPoint.onNavigationEvent) officialAppPoint).onExtraCallback().onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 109;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(String str, OfficialAppPoint officialAppPoint) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(officialAppPoint, "");
            boolean z = officialAppPoint instanceof OfficialAppPoint.onWarmupCompleted;
            throw null;
        }
        Intrinsics.checkNotNullParameter(officialAppPoint, "");
        if (officialAppPoint instanceof OfficialAppPoint.onWarmupCompleted) {
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1372214L, false, (String) null, (Map) null, new ExpenseMethodEditScreenKt$.ExternalSyntheticLambda11(str, officialAppPoint), 14, (Object) null);
        } else if (officialAppPoint instanceof OfficialAppPoint.onNavigationEvent) {
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1372218L, false, (String) null, (Map) null, new ExpenseMethodEditScreenKt$.ExternalSyntheticLambda12(str, officialAppPoint), 14, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(clearPermissions clearpermissions, ExpenseMethodEditViewModel expenseMethodEditViewModel, String str, SessionTrackerb sessionTrackerb, ignorePermission ignorepermission, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        Object obj;
        boolean zOnExtraCallback;
        boolean zOnExtraCallback2;
        boolean zOnExtraCallback3;
        boolean zOnNavigationEvent;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0)) {
                int i5 = onNavigationEvent + 43;
                int i6 = i5 % 128;
                onExtraCallbackWithResult = i6;
                i3 = i5 % 2 != 0 ? 3 : 4;
                int i7 = i6 + 17;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            int i9 = onExtraCallbackWithResult + 75;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            Object obj2 = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onExtraCallbackWithResult + 73;
                onNavigationEvent = i11 % 128;
                if (i11 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(989457893, i2, -1, "im.toss.features.home.feature.expense_method_edit.screen.ExpenseMethodEditScreen.<anonymous> (ExpenseMethodEditScreen.kt:165)");
                    obj2.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(989457893, i2, -1, "im.toss.features.home.feature.expense_method_edit.screen.ExpenseMethodEditScreen.<anonymous> (ExpenseMethodEditScreen.kt:165)");
            }
            if (Intrinsics.areEqual(clearpermissions, clearPermissions.onNavigationEvent.onExtraCallback)) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(579631692);
                PermissionKeyPoint.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, deviceQuirksExternalSyntheticLambda0), 0.0f, 1, (Object) null), cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else if (clearpermissions instanceof clearPermissions.onExtraCallback) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(579976350);
                Context context = (Context) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, deviceQuirksExternalSyntheticLambda0), 0.0f, 1, (Object) null);
                clearPermissions.onExtraCallback onextracallback = (clearPermissions.onExtraCallback) clearpermissions;
                boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(clearpermissions);
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(expenseMethodEditViewModel);
                boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnExtraCallback4 | zOnNavigationEvent2 | zOnNavigationEvent3)) {
                    int i12 = onExtraCallbackWithResult + 35;
                    onNavigationEvent = i12 % 128;
                    if (i12 % 2 == 0) {
                        int i13 = 73 / 0;
                        obj = objOnMinimized;
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            ExpenseMethodEditScreenKt$.ExternalSyntheticLambda7 externalSyntheticLambda7 = new ExpenseMethodEditScreenKt$.ExternalSyntheticLambda7(clearpermissions, expenseMethodEditViewModel, str);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda7);
                            obj = externalSyntheticLambda7;
                        }
                        Function2 function2 = (Function2) obj;
                        zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(clearpermissions);
                        zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(sessionTrackerb);
                        zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(context);
                        zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (zOnExtraCallback | zOnExtraCallback2 | zOnExtraCallback3 | zOnNavigationEvent) {
                            Object obj3 = objOnMinimized2;
                            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                ExpenseMethodEditScreenKt$.ExternalSyntheticLambda8 externalSyntheticLambda8 = new ExpenseMethodEditScreenKt$.ExternalSyntheticLambda8(clearpermissions, sessionTrackerb, context, str);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda8);
                                obj3 = externalSyntheticLambda8;
                            }
                            Function1 function1 = (Function1) obj3;
                            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(ignorepermission);
                            boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
                            boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(expenseMethodEditViewModel);
                            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (!(zOnNavigationEvent4 | zOnNavigationEvent5 | zOnNavigationEvent6)) {
                                Object obj4 = objOnMinimized3;
                                if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    ExpenseMethodEditScreenKt$.ExternalSyntheticLambda9 externalSyntheticLambda9 = new ExpenseMethodEditScreenKt$.ExternalSyntheticLambda9(expenseMethodEditViewModel, ignorepermission, str);
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda9);
                                    obj4 = externalSyntheticLambda9;
                                }
                                Function0 function0 = (Function0) obj4;
                                boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
                                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (!zOnNavigationEvent7) {
                                    Object obj5 = objOnMinimized4;
                                    if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        ExpenseMethodEditScreenKt$.ExternalSyntheticLambda10 externalSyntheticLambda10 = new ExpenseMethodEditScreenKt$.ExternalSyntheticLambda10(str);
                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda10);
                                        obj5 = externalSyntheticLambda10;
                                    }
                                    getLocalPermissionDialog.onNavigationEvent(quirksExternalSyntheticBackport0OnNavigationEvent, onextracallback, function2, function1, function0, (Function1) obj5, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
                                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                }
                            }
                        }
                    } else {
                        obj = objOnMinimized;
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        }
                        Function2 function22 = (Function2) obj;
                        zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(clearpermissions);
                        zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(sessionTrackerb);
                        zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(context);
                        zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
                        Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (zOnExtraCallback | zOnExtraCallback2 | zOnExtraCallback3 | zOnNavigationEvent) {
                        }
                    }
                }
            } else {
                if (!Intrinsics.areEqual(clearpermissions, clearPermissions.onWarmupCompleted.IAuthTabCallback)) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1681267272);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    throw new NoWhenBranchMatchedException();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(582977646);
                buildLocalPermissionKey.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, deviceQuirksExternalSyntheticLambda0), 0.0f, 1, (Object) null), cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i14 = onNavigationEvent + 91;
                onExtraCallbackWithResult = i14 % 128;
                int i15 = i14 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@Nullable ExpenseMethodEditViewModel expenseMethodEditViewModel, @NotNull String str, @NotNull SessionTrackerb sessionTrackerb, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        ExpenseMethodEditViewModel expenseMethodEditViewModel2;
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i4;
        int i5;
        ExpenseMethodEditViewModel expenseMethodEditViewModel3;
        int i6;
        boolean z;
        Activity activity;
        int i7;
        ExpenseMethodEditViewModel expenseMethodEditViewModel4;
        boolean z2;
        getAuthNoticeDialog getauthnoticedialog;
        int i8;
        ignorePermission ignorepermission;
        Activity activity2;
        boolean z3;
        int i9;
        int i10 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(sessionTrackerb, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1886582464);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                int i11 = onNavigationEvent + 95;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                expenseMethodEditViewModel2 = expenseMethodEditViewModel;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(expenseMethodEditViewModel2)) {
                    int i13 = onExtraCallbackWithResult + 113;
                    onNavigationEvent = i13 % 128;
                    int i14 = i13 % 2;
                    i9 = 4;
                }
                i3 = i9 | i;
            } else {
                expenseMethodEditViewModel2 = expenseMethodEditViewModel;
            }
            i9 = 2;
            i3 = i9 | i;
        } else {
            expenseMethodEditViewModel2 = expenseMethodEditViewModel;
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i15 = onNavigationEvent + 61;
            onExtraCallbackWithResult = i15 % 128;
            int i16 = i15 % 2;
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(sessionTrackerb) ? 256 : 128;
        }
        boolean z4 = false;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 147) != 146, i3 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                if ((i2 & 1) != 0) {
                    TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                    if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    int i17 = onNavigationEvent + 85;
                    onExtraCallbackWithResult = i17 % 128;
                    if (i17 % 2 != 0) {
                        boolean z5 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6;
                        throw null;
                    }
                    i4 = 6;
                    z4 = false;
                    i5 = i3 & (-15);
                    expenseMethodEditViewModel3 = (ExpenseMethodEditViewModel) DefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda11.onExtraCallback(Reflection.getOrCreateKotlinClass(ExpenseMethodEditViewModel.class), textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent, (String) null, (ViewModelProvider.onWarmupCompleted) null, textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6 ? textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent.getDefaultViewModelCreationExtras() : AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0);
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i18 = onExtraCallbackWithResult + 91;
                    onNavigationEvent = i18 % 128;
                    int i19 = i18 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1886582464, i5, -1, "im.toss.features.home.feature.expense_method_edit.screen.ExpenseMethodEditScreen (ExpenseMethodEditScreen.kt:60)");
                }
                boolean z6 = z4;
                clearPermissions clearpermissions = (clearPermissions) AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(expenseMethodEditViewModel3.onWarmupCompleted(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7).onExtraCallbackWithResult();
                Activity activity3 = (Activity) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(prefetchWithMultipleUrls.IAuthTabCallback());
                ignorePermission ignorepermission2 = (ignorePermission) AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(expenseMethodEditViewModel3.IAuthTabCallback(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7).onExtraCallbackWithResult();
                Resources resources = (Resources) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback());
                i6 = (i5 & 14) ^ 6;
                if (i6 <= 4) {
                    int i20 = onNavigationEvent + 65;
                    onExtraCallbackWithResult = i20 % 128;
                    int i21 = i20 % 2;
                    if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(expenseMethodEditViewModel3)) {
                        if ((i5 & 6) != 4) {
                            z = z6 ? 1 : 0;
                        }
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (z) {
                            int i22 = onExtraCallbackWithResult + 57;
                            onNavigationEvent = i22 % 128;
                            int i23 = i22 % 2;
                            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized = new ExpenseMethodEditScreenKt$.ExternalSyntheticLambda13(expenseMethodEditViewModel3);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                            }
                            requestPostMessageChannel.onExtraCallbackWithResult(z6, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, z6 ? 1 : 0, 1);
                            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized2 = new getAuthNoticeDialog();
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                            }
                            getAuthNoticeDialog getauthnoticedialog2 = (getAuthNoticeDialog) objOnMinimized2;
                            if (getauthnoticedialog2.onExtraCallback()) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(764484880);
                                Unit unit = Unit.INSTANCE;
                                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized3 = new onWarmupCompleted(null);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                                }
                                isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i4);
                                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized4 = new ExpenseMethodEditScreenKt$.ExternalSyntheticLambda14(getauthnoticedialog2);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                                }
                                Function0 function0 = (Function0) objOnMinimized4;
                                activity = activity3;
                                i7 = i5;
                                expenseMethodEditViewModel4 = expenseMethodEditViewModel3;
                                EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(939182269, true, new ExpenseMethodEditScreenKt$.ExternalSyntheticLambda15(getauthnoticedialog2, ignorepermission2, str, expenseMethodEditViewModel4, activity), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                                EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(40354636, true, new ExpenseMethodEditScreenKt$.ExternalSyntheticLambda16(getauthnoticedialog2, resources), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                                EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback3 = ForwardingCameraControl.onExtraCallback(-1965136243, true, new ExpenseMethodEditScreenKt$.ExternalSyntheticLambda17(getauthnoticedialog2, resources), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                                z2 = true;
                                getauthnoticedialog = getauthnoticedialog2;
                                i8 = i6;
                                ignorepermission = ignorepermission2;
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                v6.onWarmupCompleted(new Object[]{function0, encoderProfilesProxyVideoProfileProxyOnExtraCallback, encoderProfilesProxyVideoProfileProxyOnExtraCallback2, encoderProfilesProxyVideoProfileProxyOnExtraCallback3, null, null, 0L, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3510, 112}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 1196661986, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -1196661974, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback());
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            } else {
                                activity = activity3;
                                i7 = i5;
                                expenseMethodEditViewModel4 = expenseMethodEditViewModel3;
                                z2 = true;
                                getauthnoticedialog = getauthnoticedialog2;
                                i8 = i6;
                                ignorepermission = ignorepermission2;
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(767638882);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            }
                            ExpenseMethodEditViewModel expenseMethodEditViewModel5 = expenseMethodEditViewModel4;
                            if ((i8 <= 4 || !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(expenseMethodEditViewModel5)) && (i7 & 6) != 4) {
                                activity2 = activity;
                                z3 = false;
                            } else {
                                z3 = z2;
                                activity2 = activity;
                            }
                            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(activity2);
                            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if ((z3 | zOnExtraCallback) || objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized5 = new IAuthTabCallback(expenseMethodEditViewModel5, getauthnoticedialog, activity2, (access13800) null);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                            }
                            isZslDisabledByByUserCaseConfig.onNavigationEvent(ignorepermission, (Function2) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult3;
                            ImageLoaderBuilderExternalSyntheticLambda7.IAuthTabCallback(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1843163246, 1843163248, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{YuvImageOnePixelShiftQuirk.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion), null, null, null, null, null, 0, false, null, false, null, Float.valueOf(0.0f), 0L, 0L, 0L, 0L, 0L, ForwardingCameraControl.onExtraCallback(989457893, z2, new ExpenseMethodEditScreenKt$.ExternalSyntheticLambda18(clearpermissions, expenseMethodEditViewModel5, str, sessionTrackerb, ignorepermission), cameraCaptureResultEmptyCameraCaptureResult3, 54), cameraCaptureResultEmptyCameraCaptureResult2, 0, 12582912, 131070}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            int i24 = onNavigationEvent + 39;
                            onExtraCallbackWithResult = i24 % 128;
                            int i25 = i24 % 2;
                            expenseMethodEditViewModel2 = expenseMethodEditViewModel5;
                        }
                    }
                    z = true;
                    Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (z) {
                    }
                }
            } else {
                int i26 = onNavigationEvent + 93;
                onExtraCallbackWithResult = i26 % 128;
                if (i26 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i2 & 1) != 0) {
                        i3 &= -15;
                        int i27 = onExtraCallbackWithResult + 51;
                        onNavigationEvent = i27 % 128;
                        int i28 = i27 % 2;
                    }
                }
            }
            i4 = 6;
            int i29 = i3;
            expenseMethodEditViewModel3 = expenseMethodEditViewModel2;
            i5 = i29;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
            boolean z62 = z4;
            clearPermissions clearpermissions2 = (clearPermissions) AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(expenseMethodEditViewModel3.onWarmupCompleted(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7).onExtraCallbackWithResult();
            Activity activity32 = (Activity) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(prefetchWithMultipleUrls.IAuthTabCallback());
            ignorePermission ignorepermission22 = (ignorePermission) AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(expenseMethodEditViewModel3.IAuthTabCallback(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7).onExtraCallbackWithResult();
            Resources resources2 = (Resources) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback());
            i6 = (i5 & 14) ^ 6;
            if (i6 <= 4) {
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new ExpenseMethodEditScreenKt$.ExternalSyntheticLambda19(expenseMethodEditViewModel2, str, sessionTrackerb, i, i2));
        }
    }

    private static final void onExtraCallback(OfficialAppPoint.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult, boolean z, String str) {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1372216L, false, (String) null, (Map) null, new ExpenseMethodEditScreenKt$.ExternalSyntheticLambda21(str, onextracallbackwithresult, z), 14, (Object) null);
        int i2 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(String str, OfficialAppPoint.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult, boolean z, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{11, 15, 7, '\b', 13814, 13814, 15, 11}, (byte) (TextUtils.indexOf("", "", 0, 0) + 14), 8 - View.combineMeasuredStates(0, 0), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        setDetectableSize.onExtraCallback("asset_type", onextracallbackwithresult.onNavigationEvent().getLogName());
        setDetectableSize.onExtraCallback("id", onextracallbackwithresult.onTransact());
        setDetectableSize.onExtraCallback("enabled_yn", zzaz.onExtraCallbackWithResult(z));
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = IAuthTabCallback;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 26 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 26 - Color.blue(0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i5 = $11 + 5;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                i2 = i + 119;
                cArr4[i2] = (char) (cArr[i2] / b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i6 = $10 + 45;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent % 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), KeyEvent.getDeadChar(0, 0) + 74, 8088 - View.MeasureSpec.makeMeasureSpec(0, 0), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            int i7 = $10 + 101;
                            $11 = i7 % 128;
                            int i8 = i7 % 2;
                            try {
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - Process.getGidForName("")), 30 - (KeyEvent.getMaxKeyCode() >> 16), 19487 - Process.getGidForName(""), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i9];
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i10 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i10];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                            } else {
                                int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                            }
                        }
                    }
                } else {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i14 = 0; i14 < i; i14++) {
            cArr4[i14] = (char) (cArr4[i14] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, OfficialAppPoint officialAppPoint, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -1795010731, iOnExtraCallbackWithResult3, new Object[]{str, officialAppPoint, setDetectableSize}, iOnExtraCallbackWithResult, 1795010736, iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit onNavigationEvent(ExpenseMethodEditViewModel expenseMethodEditViewModel, String str, SessionTrackerb sessionTrackerb, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {expenseMethodEditViewModel, str, sessionTrackerb, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1532674974, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult, -1532674971, iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit onExtraCallback(ignorePermission ignorepermission, String str, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 736682559, iOnExtraCallbackWithResult3, new Object[]{ignorepermission, str, setDetectableSize}, iOnExtraCallbackWithResult, -736682555, iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit onWarmupCompleted(getAuthNoticeDialog getauthnoticedialog, Resources resources, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getauthnoticedialog, resources, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -1561750991, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult, 1561750999, iOnExtraCallbackWithResult2);
    }

    private static final Unit IAuthTabCallback(ExpenseMethodEditViewModel expenseMethodEditViewModel) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 784730902, iOnExtraCallbackWithResult3, new Object[]{expenseMethodEditViewModel}, iOnExtraCallbackWithResult, -784730900, iOnExtraCallbackWithResult2);
    }

    private static final Unit onExtraCallback(getAuthNoticeDialog getauthnoticedialog, ignorePermission ignorepermission, String str, ExpenseMethodEditViewModel expenseMethodEditViewModel, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getauthnoticedialog, ignorepermission, str, expenseMethodEditViewModel, u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1895324585, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult, -1895324584, iOnExtraCallbackWithResult2);
    }

    private static final Unit onNavigationEvent(getAuthNoticeDialog getauthnoticedialog, String str, Activity activity, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getauthnoticedialog, str, activity, u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1467259489, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult, -1467259489, iOnExtraCallbackWithResult2);
    }

    private static final Unit IAuthTabCallback(clearPermissions clearpermissions, SessionTrackerb sessionTrackerb, Context context, String str, OfficialAppPoint.onNavigationEvent onnavigationevent) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 602655243, iOnExtraCallbackWithResult3, new Object[]{clearpermissions, sessionTrackerb, context, str, onnavigationevent}, iOnExtraCallbackWithResult, -602655237, iOnExtraCallbackWithResult2);
    }

    private static final Unit onWarmupCompleted(ExpenseMethodEditViewModel expenseMethodEditViewModel, String str, SessionTrackerb sessionTrackerb, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {expenseMethodEditViewModel, str, sessionTrackerb, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90323971, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult, -90323964, iOnExtraCallbackWithResult2);
    }
}
