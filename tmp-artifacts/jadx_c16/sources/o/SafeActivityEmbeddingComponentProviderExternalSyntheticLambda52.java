package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import im.toss.appsintoss.R$string;
import im.toss.appsintoss.iap.InAppPurchaseHistoryDetailViewModel;
import im.toss.appsintoss.iap.model.AppsInTossCashReceipt;
import im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailScreenKt$;
import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$;
import im.toss.tds.compose.R;
import im.toss.uikit.widget.TdsSkeletonV1View;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.MaxRewardedInterstitialAdapter;
import o.PullRefreshIndicatorKtExternalSyntheticLambda3;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.access;
import o.getPrivacyDestinationUri;
import o.initSDK;
import o.setCallToAction;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static char[] IAuthTabCallback = {64990, 64960, 64986, 64987, 64977, 64967, 64989, 64906, 64961, 64981, 64963, 64988, 64982, 64983, 64924, 64964, 64991, 64926, 64925, 65065, 64898, 64905, 64970, 64907, 65013, 64966, 64903, 64984, 64976, 64980, 64897, 64896, 64979, 64985, 64902, 64978};
    private static char onNavigationEvent = 51247;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42) objArr[0];
        InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel = (InAppPurchaseHistoryDetailViewModel) objArr[1];
        setDividerDrawable setdividerdrawable = (setDividerDrawable) objArr[2];
        TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0 = (TwoLineExternalSyntheticLambda0) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, inAppPurchaseHistoryDetailViewModel, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        IAuthTabCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, inAppPurchaseHistoryDetailViewModel, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Function0 function0, Function1 function1, Function0 function02, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 51;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(inAppPurchaseHistoryDetailViewModel, cameraPresenceProviderExternalSyntheticLambda6, function0, function1, function02, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 11;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, String str2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {str, str2};
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback4 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        if (i3 == 0) {
            throw null;
        }
        Unit unit = (Unit) onExtraCallback(iIAuthTabCallback3, -255894655, iIAuthTabCallback2, objArr, iIAuthTabCallback4, iIAuthTabCallback, 255894658);
        int i4 = onExtraCallbackWithResult + 45;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 1057417407, iIAuthTabCallback2, new Object[]{function0}, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, -1057417406);
        int i4 = onExtraCallbackWithResult + 29;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function2 function2, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(function2, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42);
        int i4 = onExtraCallbackWithResult + 15;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function2 function2, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(function2, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, function0);
        }
        onWarmupCompleted(function2, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, function0);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function2 function2, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function2, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, function1);
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
        int i5 = onExtraCallbackWithResult + 33;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener, setDividerDrawable setdividerdrawable, String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 33;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return onNavigationEvent(maxRewardedInterstitialAdapterListener, setdividerdrawable, str, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onNavigationEvent(maxRewardedInterstitialAdapterListener, setdividerdrawable, str, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    private static final Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel, boolean z, Function1 function1, Function0 function0, Function2 function2, Function2 function22, Function0 function02, Function0 function03, Function1 function12, Function0 function04, Function2 function23, Function2 function24, Function2 function25, Function2 function26, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws Throwable {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 97;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        onExtraCallback(quirksExternalSyntheticBackport0, inAppPurchaseHistoryDetailViewModel, z, function1, function0, function2, function22, function02, function03, function12, function04, function23, function24, function25, function26, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = onExtraCallbackWithResult + 31;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(setParentLayoutDirection setparentlayoutdirection, Function2 function2, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(setparentlayoutdirection, function2, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42);
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(String str, String str2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(str, str2);
        if (i3 == 0) {
            int i4 = 12 / 0;
        }
        int i5 = onExtraCallbackWithResult + 105;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackStubProxy;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolOnExtraCallbackWithResult = onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6);
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        return boolOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object access000(Object[] objArr) throws Throwable {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel = (InAppPurchaseHistoryDetailViewModel) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        Function1 function1 = (Function1) objArr[3];
        Function0 function0 = (Function0) objArr[4];
        Function2 function2 = (Function2) objArr[5];
        Function2 function22 = (Function2) objArr[6];
        Function0 function02 = (Function0) objArr[7];
        Function0 function03 = (Function0) objArr[8];
        Function1 function12 = (Function1) objArr[9];
        Function0 function04 = (Function0) objArr[10];
        Function2 function23 = (Function2) objArr[11];
        Function2 function24 = (Function2) objArr[12];
        Function2 function25 = (Function2) objArr[13];
        Function2 function26 = (Function2) objArr[14];
        int iIntValue = ((Number) objArr[15]).intValue();
        int iIntValue2 = ((Number) objArr[16]).intValue();
        int iIntValue3 = ((Number) objArr[17]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[18];
        int iIntValue4 = ((Number) objArr[19]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(quirksExternalSyntheticBackport0, inAppPurchaseHistoryDetailViewModel, zBooleanValue, function1, function0, function2, function22, function02, function03, function12, function04, function23, function24, function25, function26, iIntValue, iIntValue2, iIntValue3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue4);
        int i4 = onExtraCallback + 43;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 49 / 0;
        }
        return unitAsBinder;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function0);
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
        int i5 = onExtraCallbackWithResult + 15;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    private static final Unit asBinder(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel, boolean z, Function1 function1, Function0 function0, Function2 function2, Function2 function22, Function0 function02, Function0 function03, Function1 function12, Function0 function04, Function2 function23, Function2 function24, Function2 function25, Function2 function26, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws Throwable {
        int i5 = 2 % 2;
        int i6 = onExtraCallback + 27;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        onExtraCallback(quirksExternalSyntheticBackport0, inAppPurchaseHistoryDetailViewModel, z, function1, function0, function2, function22, function02, function03, function12, function04, function23, function24, function25, function26, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = onExtraCallbackWithResult + 41;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact();
        if (i3 == 0) {
            int i4 = 98 / 0;
        }
        return unitOnTransact;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i2;
        int i9 = ~i5;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i5 | i2);
        int i12 = i10 | i11;
        int i13 = (~(i7 | i2)) | (~(i7 | i9)) | (~(i9 | i2));
        int i14 = i2 + i6 + i3 + (669352129 * i) + (266941808 * i4);
        int i15 = i14 * i14;
        int i16 = (i2 * 1617402437) + 56426783 + (i6 * 1617401273) + (i12 * (-582)) + (i11 * 582) + (i13 * 582) + (1617401855 * i3) + (1244927807 * i) + ((-404665712) * i4) + (i15 * (-45350912));
        switch ((720661947 * i2) + 1572077568 + ((-1243901369) * i6) + (1165201990 * i12) + (i11 * (-1165201990)) + ((-1165201990) * i13) + (1885863936 * i3) + ((-1100480512) * i) + ((-1249902592) * i4) + ((-491520000) * i15) + (i16 * i16 * 1565261824)) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            case 8:
                String str = (String) objArr[0];
                int i17 = 2 % 2;
                int i18 = onExtraCallback + 103;
                onExtraCallbackWithResult = i18 % 128;
                int i19 = i18 % 2;
                Unit unitOnWarmupCompleted = onWarmupCompleted(str);
                int i20 = onExtraCallback + 37;
                onExtraCallbackWithResult = i20 % 128;
                int i21 = i20 % 2;
                return unitOnWarmupCompleted;
            case 9:
                return IAuthTabCallbackStub(objArr);
            case 10:
                setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
                int i22 = 2 % 2;
                int i23 = onExtraCallback + 87;
                onExtraCallbackWithResult = i23 % 128;
                if (i23 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(setdividerpadding, "");
                    return setBaselineAlignedChildIndex.onNavigationEvent(ResourceManagerInternalVdcInflateDelegate.IAuthTabCallback(onQueryRefine.onExtraCallbackWithResult(20200, 0, (setOnQueryTextListener) null, 85, (Object) null), 1.0f, 3, (Object) null), ResourceManagerInternalVdcInflateDelegate.onWarmupCompleted(onQueryRefine.onExtraCallbackWithResult(2126, 0, (setOnQueryTextListener) null, 19, (Object) null), 2.0f, 5, (Object) null));
                }
                Intrinsics.checkNotNullParameter(setdividerpadding, "");
                return setBaselineAlignedChildIndex.onNavigationEvent(ResourceManagerInternalVdcInflateDelegate.IAuthTabCallback(onQueryRefine.onExtraCallbackWithResult(700, 0, (setOnQueryTextListener) null, 6, (Object) null), 0.0f, 2, (Object) null), ResourceManagerInternalVdcInflateDelegate.onWarmupCompleted(onQueryRefine.onExtraCallbackWithResult(700, 0, (setOnQueryTextListener) null, 6, (Object) null), 0.0f, 2, (Object) null));
            case 11:
                InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel = (InAppPurchaseHistoryDetailViewModel) objArr[0];
                SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42) objArr[1];
                Function0 function0 = (Function0) objArr[2];
                Function1 function1 = (Function1) objArr[3];
                Function0 function02 = (Function0) objArr[4];
                enableLoopMonitor enableloopmonitor = (enableLoopMonitor) objArr[5];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
                int iIntValue = ((Number) objArr[7]).intValue();
                int i24 = 2 % 2;
                int i25 = onExtraCallback + 103;
                onExtraCallbackWithResult = i25 % 128;
                int i26 = i25 % 2;
                Unit unitIAuthTabCallback = IAuthTabCallback(inAppPurchaseHistoryDetailViewModel, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, function0, function1, function02, enableloopmonitor, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i27 = onExtraCallbackWithResult + 85;
                onExtraCallback = i27 % 128;
                int i28 = i27 % 2;
                return unitIAuthTabCallback;
            case 12:
                return asBinder(objArr);
            case 13:
                return onTransact(objArr);
            case 14:
                return access000(objArr);
            case 15:
                return access100(objArr);
            case 16:
                return getInterfaceDescriptor(objArr);
            case 17:
                return IAuthTabCallback_Parcel(objArr);
            case 18:
                return IAuthTabCallbackStubProxy(objArr);
            default:
                setParentLayoutDirection setparentlayoutdirection = (setParentLayoutDirection) objArr[0];
                Function2 function2 = (Function2) objArr[1];
                SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda422 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42) objArr[2];
                int i29 = 2 % 2;
                int i30 = onExtraCallbackWithResult + 49;
                onExtraCallback = i30 % 128;
                int i31 = i30 % 2;
                Object[] objArr2 = {setparentlayoutdirection, function2, safeActivityEmbeddingComponentProviderExternalSyntheticLambda422};
                int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                Unit unit = (Unit) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 423669684, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr2, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, -423669672);
                int i32 = onExtraCallback + 109;
                onExtraCallbackWithResult = i32 % 128;
                int i33 = i32 % 2;
                return unit;
        }
    }

    public static /* synthetic */ Unit onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface();
        int i4 = onExtraCallback + 51;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, String str2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(str, str2);
        int i4 = onExtraCallbackWithResult + 119;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback_Parcel;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function2 function2, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(function2, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42);
        int i4 = onExtraCallbackWithResult + 95;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel, boolean z, Function1 function1, Function0 function0, Function2 function2, Function2 function22, Function0 function02, Function0 function03, Function1 function12, Function0 function04, Function2 function23, Function2 function24, Function2 function25, Function2 function26, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws Throwable {
        Unit unitIAuthTabCallback;
        int i5 = 2 % 2;
        int i6 = onExtraCallback + 5;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            unitIAuthTabCallback = IAuthTabCallback(quirksExternalSyntheticBackport0, inAppPurchaseHistoryDetailViewModel, z, function1, function0, function2, function22, function02, function03, function12, function04, function23, function24, function25, function26, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
            int i7 = 16 / 0;
        } else {
            unitIAuthTabCallback = IAuthTabCallback(quirksExternalSyntheticBackport0, inAppPurchaseHistoryDetailViewModel, z, function1, function0, function2, function22, function02, function03, function12, function04, function23, function24, function25, function26, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        }
        int i8 = onExtraCallback + 55;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 28 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(onextracallbackwithresult);
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return asInterface(str, str2);
        }
        asInterface(str, str2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return asBinder();
        }
        asBinder();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 479327891, iIAuthTabCallback2, new Object[]{inAppPurchaseHistoryDetailViewModel, str}, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, -479327884);
        int i4 = onExtraCallbackWithResult + 79;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, String str2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(str, str2);
        int i4 = onExtraCallback + 13;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function2 function2, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackDefault(function2, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42);
        }
        IAuthTabCallbackDefault(function2, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel, initSDK.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, inAppPurchaseHistoryDetailViewModel, onnavigationevent);
        if (i3 != 0) {
            int i4 = 56 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, initSDK.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, onnavigationevent);
        }
        onNavigationEvent(safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, onnavigationevent);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i4 = onExtraCallbackWithResult + 53;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onNavigationEvent(InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel, enableLoopMonitor enableloopmonitor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 15;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(inAppPurchaseHistoryDetailViewModel, enableloopmonitor, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 105;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, String str2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallbackDefault(str, str2);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(str, str2);
        int i3 = onExtraCallback + 43;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallbackDefault;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(function1);
        }
        onWarmupCompleted(function1);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function2 function2, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStub(function2, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42);
            throw null;
        }
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(function2, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42);
        int i3 = onExtraCallback + 47;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallbackStub;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 121;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6, maxRewardedInterstitialAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6, maxRewardedInterstitialAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel, boolean z, Function1 function1, Function0 function0, Function2 function2, Function2 function22, Function0 function02, Function0 function03, Function1 function12, Function0 function04, Function2 function23, Function2 function24, Function2 function25, Function2 function26, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws Throwable {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 33;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return onWarmupCompleted(quirksExternalSyntheticBackport0, inAppPurchaseHistoryDetailViewModel, z, function1, function0, function2, function22, function02, function03, function12, function04, function23, function24, function25, function26, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        }
        onWarmupCompleted(quirksExternalSyntheticBackport0, inAppPurchaseHistoryDetailViewModel, z, function1, function0, function2, function22, function02, function03, function12, function04, function23, function24, function25, function26, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, boolean z, setParentLayoutDirection setparentlayoutdirection, Function2 function2, Function2 function22, Function2 function23, Function1 function1, Function2 function24, Function0 function0, Function2 function25, Function2 function26, InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Function0 function02, Function1 function12, Function0 function03, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, z, setparentlayoutdirection, function2, function22, function23, function1, function24, function0, function25, function26, inAppPurchaseHistoryDetailViewModel, cameraPresenceProviderExternalSyntheticLambda6, function02, function12, function03, cameraPresenceProviderExternalSyntheticLambda62, exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8);
        int i4 = onExtraCallbackWithResult + 81;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, boolean z, setParentLayoutDirection setparentlayoutdirection, Function2 function2, Function2 function22, Function2 function23, Function1 function1, Function2 function24, Function0 function0, Function2 function25, Function2 function26, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 47;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, z, setparentlayoutdirection, function2, function22, function23, function1, function24, function0, function25, function26, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 3;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(boolean z, setParentLayoutDirection setparentlayoutdirection) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(z, setparentlayoutdirection);
        int i4 = onExtraCallbackWithResult + 81;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ ResourceManagerInternalAsldcInflateDelegate onNavigationEvent(setDividerPadding setdividerpadding) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        ResourceManagerInternalAsldcInflateDelegate resourceManagerInternalAsldcInflateDelegate = (ResourceManagerInternalAsldcInflateDelegate) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 1750334331, iIAuthTabCallback2, new Object[]{setdividerpadding}, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, -1750334321);
        int i4 = onExtraCallbackWithResult + 47;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return resourceManagerInternalAsldcInflateDelegate;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        setParentLayoutDirection setparentlayoutdirection = (setParentLayoutDirection) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            return (Unit) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -84349311, iIAuthTabCallback2, new Object[]{setparentlayoutdirection}, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, 84349320);
        }
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback4 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42) objArr[0];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[1];
        setDividerDrawable setdividerdrawable = (setDividerDrawable) objArr[2];
        TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0 = (TwoLineExternalSyntheticLambda0) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, cameraPresenceProviderExternalSyntheticLambda6, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        IAuthTabCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, cameraPresenceProviderExternalSyntheticLambda6, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub();
        int i4 = onExtraCallback + 89;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(function0);
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function2 function2, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onTransact(function2, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42);
            throw null;
        }
        Unit unitOnTransact = onTransact(function2, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42);
        int i3 = onExtraCallback + 57;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnTransact;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel, boolean z, Function1 function1, Function0 function0, Function2 function2, Function2 function22, Function0 function02, Function0 function03, Function1 function12, Function0 function04, Function2 function23, Function2 function24, Function2 function25, Function2 function26, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws Throwable {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 57;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        onExtraCallback(quirksExternalSyntheticBackport0, inAppPurchaseHistoryDetailViewModel, z, function1, function0, function2, function22, function02, function03, function12, function04, function23, function24, function25, function26, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = onExtraCallbackWithResult + 99;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(setParentLayoutDirection setparentlayoutdirection, Function2 function2, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            throw null;
        }
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback4 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -410259588, iIAuthTabCallback4, new Object[]{setparentlayoutdirection, function2, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42}, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, 410259605);
        int i3 = onExtraCallbackWithResult + 121;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 125;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 103;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit asInterface(String str, String str2) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            unit = Unit.INSTANCE;
            int i3 = 26 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            unit = Unit.INSTANCE;
        }
        int i4 = onExtraCallback + 85;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 27;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 31;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 45;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback_Parcel(String str, String str2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 103;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackStubProxy(String str, String str2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 41;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onTransact(String str, String str2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 73;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(String str, String str2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int i3 = 15 / 0;
        return Unit.INSTANCE;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onTransact = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ setParentLayoutDirection $navController;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<Boolean> $resultRefundRequest$delegate;
        int label;
        private static char[] onExtraCallbackWithResult = {32619, 32632, 32618, 32616, 32625, 32617};
        private static int onNavigationEvent = -1184333851;
        private static boolean onExtraCallback = true;
        private static boolean IAuthTabCallback = true;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(setParentLayoutDirection setparentlayoutdirection, CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$navController = setparentlayoutdirection;
            this.$resultRefundRequest$delegate = cameraPresenceProviderExternalSyntheticLambda6;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$navController, this.$resultRefundRequest$delegate, access13800Var);
            int i2 = onTransact + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onTransact + 73;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 27;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 66 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onTransact + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 62 / 0;
            return onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            Object[] objArr = {this.$resultRefundRequest$delegate};
            int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            if (Intrinsics.areEqual((Boolean) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 1468882573, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, -1468882555), access14000.onNavigationEvent(true))) {
                int i2 = onTransact + 19;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                setParentLayoutDirection setparentlayoutdirection = this.$navController;
                Object[] objArr2 = new Object[1];
                a(null, null, new byte[]{-122, -123, -124, -125, -126, -127}, TextUtils.indexOf((CharSequence) "", '0', 0) + 128, objArr2);
                TypographyKtExternalSyntheticLambda0.onNavigationEvent(setparentlayoutdirection, ((String) objArr2[0]).intern(), (setPositionProvider) null, (PullRefreshIndicatorKtExternalSyntheticLambda3.IAuthTabCallback) null, 6, (Object) null);
            }
            Unit unit = Unit.INSTANCE;
            int i4 = onTransact + 1;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = onExtraCallbackWithResult;
            Object obj = null;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i5 = 0;
                while (i5 < length) {
                    int i6 = $10 + 7;
                    $11 = i6 % 128;
                    if (i6 % i3 == 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), 77 - TextUtils.indexOf("", "", 0, 0), 20952 - ((Process.getThreadPriority(0) + 20) >> 6), 1064889259, false, "x", new Class[]{Integer.TYPE});
                            }
                            cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(obj, objArr2)).charValue();
                            i3 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), 77 - View.MeasureSpec.getSize(0), ExpandableListView.getPackedPositionType(0L) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i5++;
                        i3 = 2;
                        obj = null;
                    }
                }
                cArr2 = cArr3;
            }
            try {
                Object[] objArr4 = {Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), ((Process.getThreadPriority(0) + 20) >> 6) + 75, 16036 - MotionEvent.axisFromString(""), -807942443, false, "y", new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                int i7 = 1052772399;
                if (IAuthTabCallback) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                    char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        int i8 = $10 + 125;
                        $11 = i8 % 128;
                        int i9 = i8 % 2;
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 63, 12214 - (ViewConfiguration.getTouchSlop() >> 8), 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                if (!onExtraCallback) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                    char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        int i10 = $11 + 5;
                        $10 = i10 % 128;
                        if (i10 % 2 != 0) {
                            cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback / 0) << defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] % i] >> iIntValue);
                            i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted % 0;
                        } else {
                            cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                            i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                        }
                        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i11 = $10 + 99;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback * defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] % i] / iIntValue);
                        Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i7);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 63 - View.MeasureSpec.makeMeasureSpec(0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback5).invoke(null, objArr6);
                    } else {
                        cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                        Object[] objArr7 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback6 == null) {
                            objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 63, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback6).invoke(null, objArr7);
                    }
                    i7 = 1052772399;
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
    }

    private static final Unit onNavigationEvent(MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener, setDividerDrawable setdividerdrawable, String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 59;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(setdividerdrawable, "");
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1464064160, i, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePurchaseHistoryDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InAppPurchaseHistoryDetailScreen.kt:100)");
        }
        if (Intrinsics.areEqual(str, "detail")) {
            int i5 = onExtraCallbackWithResult + 29;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1783618298);
            maxRewardedInterstitialAdapterListener.onExtraCallback(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R$string.appsintoss_purchase_history_detail_title, cameraCaptureResultEmptyCameraCaptureResult, 0), (QuirksExternalSyntheticBackport0) null, 0L, cameraCaptureResultEmptyCameraCaptureResult, 0, 6);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else if (Intrinsics.areEqual(str, "cash-receipt")) {
            int i7 = onExtraCallbackWithResult + 27;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1783622665);
            maxRewardedInterstitialAdapterListener.onExtraCallback(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R$string.appsintoss_cash_receipt, cameraCaptureResultEmptyCameraCaptureResult, 0), (QuirksExternalSyntheticBackport0) null, 0L, cameraCaptureResultEmptyCameraCaptureResult, 0, 6);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1783626120);
            maxRewardedInterstitialAdapterListener.onExtraCallback("", (QuirksExternalSyntheticBackport0) null, 0L, cameraCaptureResultEmptyCameraCaptureResult, 6, 6);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i9 = onExtraCallback + 65;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2OnWarmupCompleted;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(maxRewardedInterstitialAdapterListener, "");
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(maxRewardedInterstitialAdapterListener) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            int i4 = onExtraCallback + 85;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onExtraCallbackWithResult + 107;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1602996790, i2, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePurchaseHistoryDetailScreen.<anonymous>.<anonymous>.<anonymous> (InAppPurchaseHistoryDetailScreen.kt:92)");
            }
            TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0 = (TwoLineExternalSyntheticLambda0) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -179757285, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 179757301);
            String interfaceDescriptor = (twoLineExternalSyntheticLambda0 == null || (exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2OnWarmupCompleted = twoLineExternalSyntheticLambda0.onWarmupCompleted()) == null) ? null : exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2OnWarmupCompleted.getInterfaceDescriptor();
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda43();
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            setBaselineAlignedChildIndex.onWarmupCompleted(interfaceDescriptor, (QuirksExternalSyntheticBackport0) null, (Function1) objOnMinimized, (QuirkSettingsLoader) null, "navigation_title_animation", (Function1) null, ForwardingCameraControl.onExtraCallback(-1464064160, true, new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda44(maxRewardedInterstitialAdapterListener), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 1597824, 42);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(setParentLayoutDirection setparentlayoutdirection, Function2 function2, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TypographyKtExternalSyntheticLambda0.onNavigationEvent(setparentlayoutdirection, "refund", (setPositionProvider) null, (PullRefreshIndicatorKtExternalSyntheticLambda3.IAuthTabCallback) null, 6, (Object) null);
        function2.invoke(safeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onExtraCallback(), safeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 73;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit asInterface(Function2 function2, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function2.invoke(safeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onExtraCallback(), safeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 3;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(boolean z, setParentLayoutDirection setparentlayoutdirection) {
        int i = 2 % 2;
        if (z) {
            int i2 = onExtraCallbackWithResult + 93;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                TypographyKtExternalSyntheticLambda0.onNavigationEvent(setparentlayoutdirection, "cash-receipt", (setPositionProvider) null, (PullRefreshIndicatorKtExternalSyntheticLambda3.IAuthTabCallback) null, 64, (Object) null);
            } else {
                TypographyKtExternalSyntheticLambda0.onNavigationEvent(setparentlayoutdirection, "cash-receipt", (setPositionProvider) null, (PullRefreshIndicatorKtExternalSyntheticLambda3.IAuthTabCallback) null, 6, (Object) null);
            }
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallback + 51;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(Function2 function2, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted onwarmupcompleted = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted) safeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
            function2.invoke(onwarmupcompleted.onExtraCallback(), onwarmupcompleted.onExtraCallbackWithResult());
            int i3 = 0 / 0;
            if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda42 instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted.onExtraCallbackWithResult) {
                int i4 = onExtraCallback + 51;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                function1.invoke(safeActivityEmbeddingComponentProviderExternalSyntheticLambda42);
            }
        } else {
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted onwarmupcompleted2 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted) safeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
            function2.invoke(onwarmupcompleted2.onExtraCallback(), onwarmupcompleted2.onExtraCallbackWithResult());
            if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda42 instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted.onExtraCallbackWithResult) {
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(Function2 function2, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, Function0 function0) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted onwarmupcompleted = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted) safeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
            function2.invoke(onwarmupcompleted.onExtraCallback(), onwarmupcompleted.onExtraCallbackWithResult());
            function0.invoke();
            unit = Unit.INSTANCE;
            int i3 = 92 / 0;
        } else {
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted onwarmupcompleted2 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted) safeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
            function2.invoke(onwarmupcompleted2.onExtraCallback(), onwarmupcompleted2.onExtraCallbackWithResult());
            function0.invoke();
            unit = Unit.INSTANCE;
        }
        int i4 = onExtraCallback + 43;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(Function2 function2, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted onwarmupcompleted = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted) safeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
            function2.invoke(onwarmupcompleted.onExtraCallback(), onwarmupcompleted.onExtraCallbackWithResult());
            int i3 = 25 / 0;
            return Unit.INSTANCE;
        }
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted onwarmupcompleted2 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted) safeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
        function2.invoke(onwarmupcompleted2.onExtraCallback(), onwarmupcompleted2.onExtraCallbackWithResult());
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        String strOnExtraCallback;
        String strOnExtraCallbackWithResult;
        setParentLayoutDirection setparentlayoutdirection = (setParentLayoutDirection) objArr[0];
        Function2 function2 = (Function2) objArr[1];
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted onwarmupcompleted = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            TypographyKtExternalSyntheticLambda0.onNavigationEvent(setparentlayoutdirection, "refund", (setPositionProvider) null, (PullRefreshIndicatorKtExternalSyntheticLambda3.IAuthTabCallback) null, 90, (Object) null);
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted onwarmupcompleted2 = onwarmupcompleted;
            strOnExtraCallback = onwarmupcompleted2.onExtraCallback();
            strOnExtraCallbackWithResult = onwarmupcompleted2.onExtraCallbackWithResult();
        } else {
            TypographyKtExternalSyntheticLambda0.onNavigationEvent(setparentlayoutdirection, "refund", (setPositionProvider) null, (PullRefreshIndicatorKtExternalSyntheticLambda3.IAuthTabCallback) null, 6, (Object) null);
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted onwarmupcompleted3 = onwarmupcompleted;
            strOnExtraCallback = onwarmupcompleted3.onExtraCallback();
            strOnExtraCallbackWithResult = onwarmupcompleted3.onExtraCallbackWithResult();
        }
        function2.invoke(strOnExtraCallback, strOnExtraCallbackWithResult);
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallback + 105;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onTransact(Function2 function2, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted onwarmupcompleted = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted) safeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
        function2.invoke(onwarmupcompleted.onExtraCallback(), onwarmupcompleted.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 101;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 42 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(Function2 function2, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted onwarmupcompleted = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted) safeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
        function2.invoke(onwarmupcompleted.onExtraCallback(), onwarmupcompleted.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 55;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 32 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        String str;
        setPositionProvider setpositionprovider;
        PullRefreshIndicatorKtExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallback;
        int i;
        setParentLayoutDirection setparentlayoutdirection = (setParentLayoutDirection) objArr[0];
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 93;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            str = "cash-receipt";
            setpositionprovider = null;
            iAuthTabCallback = null;
            i = 15;
        } else {
            str = "cash-receipt";
            setpositionprovider = null;
            iAuthTabCallback = null;
            i = 6;
        }
        TypographyKtExternalSyntheticLambda0.onNavigationEvent(setparentlayoutdirection, str, setpositionprovider, iAuthTabCallback, i, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 93;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        setParentLayoutDirection setparentlayoutdirection = (setParentLayoutDirection) objArr[0];
        Function2 function2 = (Function2) objArr[1];
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onExtraCallback onextracallback = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TypographyKtExternalSyntheticLambda0.onNavigationEvent(setparentlayoutdirection, "refund", (setPositionProvider) null, (PullRefreshIndicatorKtExternalSyntheticLambda3.IAuthTabCallback) null, 6, (Object) null);
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onExtraCallback onextracallback2 = onextracallback;
        function2.invoke(onextracallback2.onExtraCallback(), onextracallback2.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 33;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit asBinder(Function2 function2, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onExtraCallback onextracallback = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onExtraCallback) safeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
        function2.invoke(onextracallback.onExtraCallback(), onextracallback.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 65;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, boolean z, setParentLayoutDirection setparentlayoutdirection, Function2 function2, Function2 function22, Function2 function23, Function1 function1, Function2 function24, Function0 function0, Function2 function25, Function2 function26, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        String strIAuthTabCallbackStub;
        Object obj;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 99;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(setdividerdrawable, "");
        Intrinsics.checkNotNullParameter(twoLineExternalSyntheticLambda0, "");
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-969509290, i, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePurchaseHistoryDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InAppPurchaseHistoryDetailScreen.kt:155)");
        }
        boolean z2 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda42 instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.IAuthTabCallback;
        if (z2 || (safeActivityEmbeddingComponentProviderExternalSyntheticLambda42 instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onNavigationEvent)) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1004048919);
            if (z2) {
                int i5 = onExtraCallbackWithResult + 55;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    ((SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.IAuthTabCallback) safeActivityEmbeddingComponentProviderExternalSyntheticLambda42).IAuthTabCallbackStub();
                    throw null;
                }
                strIAuthTabCallbackStub = ((SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.IAuthTabCallback) safeActivityEmbeddingComponentProviderExternalSyntheticLambda42).IAuthTabCallbackStub();
            } else {
                strIAuthTabCallbackStub = null;
                if (!(!(safeActivityEmbeddingComponentProviderExternalSyntheticLambda42 instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onNavigationEvent))) {
                    strIAuthTabCallbackStub = ((SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onNavigationEvent) safeActivityEmbeddingComponentProviderExternalSyntheticLambda42).IAuthTabCallbackStub();
                }
            }
            String str = strIAuthTabCallbackStub;
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            String strAsInterface = safeActivityEmbeddingComponentProviderExternalSyntheticLambda42.asInterface();
            String strOnExtraCallback = safeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onExtraCallback();
            String strOnNavigationEvent = safeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onNavigationEvent();
            String strIAuthTabCallback = safeActivityEmbeddingComponentProviderExternalSyntheticLambda42.IAuthTabCallback();
            String strAsBinder = safeActivityEmbeddingComponentProviderExternalSyntheticLambda42.asBinder();
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(setparentlayoutdirection);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function2);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda42);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback | zOnNavigationEvent | zOnExtraCallback2)) {
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda19 externalSyntheticLambda19 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda19(setparentlayoutdirection, function2, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda19);
                    obj2 = externalSyntheticLambda19;
                }
                Function0 function02 = (Function0) obj2;
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function22);
                boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda42);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if ((zOnNavigationEvent2 | zOnExtraCallback3) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized2 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda22(function22, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                    int i6 = onExtraCallbackWithResult + 69;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                }
                Function0 function03 = (Function0) objOnMinimized2;
                boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z);
                boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(setparentlayoutdirection);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(!(zOnExtraCallback4 | zOnExtraCallback5))) {
                    InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda23 externalSyntheticLambda23 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda23(z, setparentlayoutdirection);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda23);
                    obj = externalSyntheticLambda23;
                    SafeActivityEmbeddingComponentProviderExternalSyntheticLambda54.onExtraCallback(onextracallback, strAsInterface, strOnExtraCallback, strOnNavigationEvent, strIAuthTabCallback, strAsBinder, str, z, function02, function03, (Function0) obj, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 0);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    obj = objOnMinimized3;
                    if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    SafeActivityEmbeddingComponentProviderExternalSyntheticLambda54.onExtraCallback(onextracallback, strAsInterface, strOnExtraCallback, strOnNavigationEvent, strIAuthTabCallback, strAsBinder, str, z, function02, function03, (Function0) obj, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 0);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            }
        } else if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda42 instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1005737210);
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted onwarmupcompleted = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted) safeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function23);
            boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda42);
            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent3 | zOnExtraCallback6 | zOnNavigationEvent4)) {
                int i8 = onExtraCallbackWithResult + 117;
                onExtraCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    throw null;
                }
                Object obj3 = objOnMinimized4;
                if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda24 externalSyntheticLambda24 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda24(function23, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, function1);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda24);
                    obj3 = externalSyntheticLambda24;
                }
                Function0 function04 = (Function0) obj3;
                boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function24);
                boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda42);
                boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnNavigationEvent5 | zOnExtraCallback7 | zOnNavigationEvent6)) {
                    Object obj4 = objOnMinimized5;
                    if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda25 externalSyntheticLambda25 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda25(function24, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, function0);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda25);
                        obj4 = externalSyntheticLambda25;
                    }
                    Function0 function05 = (Function0) obj4;
                    boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function22);
                    boolean zOnExtraCallback8 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda42);
                    Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(zOnNavigationEvent7 | zOnExtraCallback8)) {
                        Object obj5 = objOnMinimized6;
                        if (objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda26 externalSyntheticLambda26 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda26(function22, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda26);
                            obj5 = externalSyntheticLambda26;
                        }
                        Function0 function06 = (Function0) obj5;
                        boolean zOnExtraCallback9 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(setparentlayoutdirection);
                        boolean zOnNavigationEvent8 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function2);
                        boolean zOnExtraCallback10 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda42);
                        Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!(zOnExtraCallback9 | zOnNavigationEvent8 | zOnExtraCallback10)) {
                            Object obj6 = objOnMinimized7;
                            if (objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda27 externalSyntheticLambda27 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda27(setparentlayoutdirection, function2, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda27);
                                obj6 = externalSyntheticLambda27;
                            }
                            Function0 function07 = (Function0) obj6;
                            boolean zOnNavigationEvent9 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function25);
                            boolean zOnExtraCallback11 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda42);
                            Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (!(zOnNavigationEvent9 | zOnExtraCallback11)) {
                                Object obj7 = objOnMinimized8;
                                if (objOnMinimized8 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda28 externalSyntheticLambda28 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda28(function25, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42);
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda28);
                                    obj7 = externalSyntheticLambda28;
                                }
                                Function0 function08 = (Function0) obj7;
                                boolean zOnNavigationEvent10 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function26);
                                boolean zOnExtraCallback12 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda42);
                                Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (!(zOnNavigationEvent10 | zOnExtraCallback12)) {
                                    Object obj8 = objOnMinimized9;
                                    if (objOnMinimized9 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda29 externalSyntheticLambda29 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda29(function26, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42);
                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda29);
                                        obj8 = externalSyntheticLambda29;
                                    }
                                    SafeActivityEmbeddingComponentProviderExternalSyntheticLambda60.onNavigationEvent(onextracallback2, onwarmupcompleted, function04, function05, function06, function07, function08, (Function0) obj8, cameraCaptureResultEmptyCameraCaptureResult, 6, 0);
                                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (!(safeActivityEmbeddingComponentProviderExternalSyntheticLambda42 instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onExtraCallback)) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(309480961);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                throw new NoWhenBranchMatchedException();
            }
            int i9 = onExtraCallbackWithResult + 41;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1007432197);
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onExtraCallback onextracallback3 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onExtraCallback) safeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
            String strOnExtraCallback2 = onextracallback3.onExtraCallback();
            String strOnNavigationEvent2 = onextracallback3.onNavigationEvent();
            String strIAuthTabCallback2 = onextracallback3.IAuthTabCallback();
            String strAsBinder2 = onextracallback3.asBinder();
            String strIAuthTabCallbackStub2 = onextracallback3.IAuthTabCallbackStub();
            boolean zOnExtraCallback13 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(setparentlayoutdirection);
            Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback13) {
                int i11 = onExtraCallbackWithResult + 107;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
                if (objOnMinimized10 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized10 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda30(setparentlayoutdirection);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized10);
                }
                Function0 function09 = (Function0) objOnMinimized10;
                boolean zOnExtraCallback14 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(setparentlayoutdirection);
                boolean zOnNavigationEvent11 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function2);
                boolean zOnExtraCallback15 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda42);
                Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnExtraCallback14 | zOnNavigationEvent11 | zOnExtraCallback15)) {
                    Object obj9 = objOnMinimized11;
                    if (objOnMinimized11 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda20 externalSyntheticLambda20 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda20(setparentlayoutdirection, function2, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda20);
                        obj9 = externalSyntheticLambda20;
                    }
                    Function0 function010 = (Function0) obj9;
                    boolean zOnNavigationEvent12 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function22);
                    boolean zOnExtraCallback16 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda42);
                    Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(zOnNavigationEvent12 | zOnExtraCallback16)) {
                        Object obj10 = objOnMinimized12;
                        if (objOnMinimized12 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda21 externalSyntheticLambda21 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda21(function22, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda21);
                            obj10 = externalSyntheticLambda21;
                        }
                        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda5.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, strOnExtraCallback2, strOnNavigationEvent2, strIAuthTabCallback2, strAsBinder2, strIAuthTabCallbackStub2, z, function09, function010, (Function0) obj10, cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                }
            }
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, initSDK.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            onnavigationevent.onExtraCallback("order_id", safeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onExtraCallbackWithResult());
            onnavigationevent.onExtraCallback("service_name", safeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onExtraCallback());
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        onnavigationevent.onExtraCallback("order_id", safeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onExtraCallbackWithResult());
        onnavigationevent.onExtraCallback("service_name", safeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onExtraCallback());
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 19;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel = (InAppPurchaseHistoryDetailViewModel) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        inAppPurchaseHistoryDetailViewModel.onWarmupCompleted(str);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 107;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel, enableLoopMonitor enableloopmonitor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 121;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(enableloopmonitor, "");
        if ((i & 17) != 16) {
            int i5 = onExtraCallbackWithResult + 21;
            onExtraCallback = i5 % 128;
            z = i5 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1087024992, i, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePurchaseHistoryDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InAppPurchaseHistoryDetailScreen.kt:249)");
            }
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(inAppPurchaseHistoryDetailViewModel);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda31 externalSyntheticLambda31 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda31(inAppPurchaseHistoryDetailViewModel);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda31);
                    obj = externalSyntheticLambda31;
                }
                SafeActivityEmbeddingComponentProviderExternalSyntheticLambda51.onNavigationEvent((QuirksExternalSyntheticBackport0) null, false, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResult, 0, 3);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i6 = onExtraCallback + 101;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i7 = 22 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object obj;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(setdividerdrawable, "");
        Intrinsics.checkNotNullParameter(twoLineExternalSyntheticLambda0, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onExtraCallbackWithResult + 25;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1041840781, i, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePurchaseHistoryDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InAppPurchaseHistoryDetailScreen.kt:242)");
        }
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda42);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnExtraCallback) {
            int i5 = onExtraCallbackWithResult + 1;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            obj = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda38 externalSyntheticLambda38 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda38(safeActivityEmbeddingComponentProviderExternalSyntheticLambda42);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda38);
                obj = externalSyntheticLambda38;
            }
        }
        setThreadList.onWarmupCompleted(1639248L, (String) null, (Function1) obj, ForwardingCameraControl.onExtraCallback(-1087024992, true, new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda39(inAppPurchaseHistoryDetailViewModel), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 3078, 2);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 17;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 84 / 0;
        }
        return unit;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = IAuthTabCallback;
        int i4 = -1310771303;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.indexOf("", "") + 26, 23139 - (Process.myPid() >> 22), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    i4 = -1310771303;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i6 = $10 + 45;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        float f = 0.0f;
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 26 - ((Process.getThreadPriority(0) + 20) >> 6), 23139 - ((Process.getThreadPriority(0) + 20) >> 6), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i8 = $11 + 57;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    int i10 = $10 + 29;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback % b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent % 0] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback >>> b);
                    } else {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    }
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 73 - ImageFormat.getBitsPerPixel(0), (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int i11 = $10 + 95;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), (KeyEvent.getMaxKeyCode() >> 16) + 30, Color.rgb(0, 0, 0) + 16796704, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i14 = $11 + 29;
                            $10 = i14 % 128;
                            int i15 = i14 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i16 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i17 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i16];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i17];
                        } else {
                            int i18 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i19 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i18];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i19];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
                f = 0.0f;
            }
        }
        for (int i20 = 0; i20 < i; i20++) {
            cArr4[i20] = (char) (cArr4[i20] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private static final Unit IAuthTabCallback(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel, initSDK.onNavigationEvent onnavigationevent) {
        String str;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        onnavigationevent.onExtraCallback("order_id", safeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onExtraCallbackWithResult());
        onnavigationevent.onExtraCallback("service_name", safeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onExtraCallback());
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        if (!Intrinsics.areEqual((String) InAppPurchaseHistoryDetailViewModel.onWarmupCompleted(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback, 25361969, new Object[]{inAppPurchaseHistoryDetailViewModel}, -25361966, iIAuthTabCallback2), SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3.REQUESTED.getValue())) {
            int i2 = onExtraCallback + 87;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
            int iIAuthTabCallback4 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
            int iIAuthTabCallback5 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
            if (!Intrinsics.areEqual((String) InAppPurchaseHistoryDetailViewModel.onWarmupCompleted(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback5, iIAuthTabCallback3, 25361969, new Object[]{inAppPurchaseHistoryDetailViewModel}, -25361966, iIAuthTabCallback4), SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3.REJECTED_BY_PLAY_STORE.getValue())) {
                str = "partner";
            } else {
                int i4 = onExtraCallbackWithResult + 95;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 3 / 2;
                }
                str = "playstore";
            }
            onnavigationevent.onExtraCallback("reject_source", str);
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
        int i5 = onExtraCallback + 19;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(Function1 function1) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[1];
            a(new char[]{4, 0, 4, 11, 3, 19, 13852, 13852, 7, 31, 13905, 13905, 6, '\t', 0, 23, '#', 17, 17, '#', 17, '\r', 22, 24, 6, 5, 17, 26, 13916, 13916, 28, 17, 16, 6, 17, '\"', 20, 16, 17, '\t', '\t', 26, '\n', 15, '\t', 17, '\r', '\b', 18, 21, ' ', 31, 13845, 13845}, (byte) (22 - (TypedValue.complexToFraction(0, 2.0f, 1.0f) > 1.0f ? 1 : (TypedValue.complexToFraction(0, 2.0f, 1.0f) == 1.0f ? 0 : -1))), Color.red(0) * 52, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(new char[]{4, 0, 4, 11, 3, 19, 13852, 13852, 7, 31, 13905, 13905, 6, '\t', 0, 23, '#', 17, 17, '#', 17, '\r', 22, 24, 6, 5, 17, 26, 13916, 13916, 28, 17, 16, 6, 17, '\"', 20, 16, 17, '\t', '\t', 26, '\n', 15, '\t', 17, '\r', '\b', 18, 21, ' ', 31, 13845, 13845}, (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 103), 54 - Color.red(0), objArr2);
            obj = objArr2[0];
        }
        function1.invoke(((String) obj).intern());
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallback + 79;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit asBinder(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 97;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, Function0 function0, Function1 function1, Function0 function02, enableLoopMonitor enableloopmonitor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(enableloopmonitor, "");
        if ((i & 17) != 16) {
            int i3 = onExtraCallbackWithResult + 85;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 / 4;
            }
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1253977119, i, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePurchaseHistoryDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InAppPurchaseHistoryDetailScreen.kt:277)");
            }
            int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
            int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
            String str = (String) InAppPurchaseHistoryDetailViewModel.onWarmupCompleted(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback, 25361969, new Object[]{inAppPurchaseHistoryDetailViewModel}, -25361966, iIAuthTabCallback2);
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3 safeActivityEmbeddingComponentProviderExternalSyntheticLambda3 = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3.REQUESTED;
            if (!Intrinsics.areEqual(str, safeActivityEmbeddingComponentProviderExternalSyntheticLambda3.getValue())) {
                SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3 safeActivityEmbeddingComponentProviderExternalSyntheticLambda32 = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3.REJECTED;
                if (Intrinsics.areEqual(str, safeActivityEmbeddingComponentProviderExternalSyntheticLambda32.getValue())) {
                    int i5 = onExtraCallback + 53;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    safeActivityEmbeddingComponentProviderExternalSyntheticLambda32 = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3.REJECTED_BY_PLAY_STORE;
                    if (!Intrinsics.areEqual(str, safeActivityEmbeddingComponentProviderExternalSyntheticLambda32.getValue())) {
                        safeActivityEmbeddingComponentProviderExternalSyntheticLambda32 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda3;
                    }
                }
                String strOnExtraCallback = safeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onExtraCallback();
                String strIAuthTabCallbackDefault = safeActivityEmbeddingComponentProviderExternalSyntheticLambda42.IAuthTabCallbackDefault();
                String strOnTransact = safeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onTransact();
                if (strOnTransact == null) {
                    int i7 = onExtraCallback + 37;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    strOnTransact = "";
                }
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnNavigationEvent) {
                    Object obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda40 externalSyntheticLambda40 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda40(function0);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda40);
                        obj = externalSyntheticLambda40;
                    }
                    Function0 function03 = (Function0) obj;
                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnNavigationEvent2 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized2 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda41(function1);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                    }
                    Function0 function04 = (Function0) objOnMinimized2;
                    boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function02);
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!zOnNavigationEvent3) {
                        Object obj2 = objOnMinimized3;
                        if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda42 externalSyntheticLambda42 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda42(function02);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda42);
                            int i9 = onExtraCallback + 13;
                            onExtraCallbackWithResult = i9 % 128;
                            int i10 = i9 % 2;
                            obj2 = externalSyntheticLambda42;
                        }
                        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda53.IAuthTabCallback(new Object[]{null, safeActivityEmbeddingComponentProviderExternalSyntheticLambda32, strOnExtraCallback, strIAuthTabCallbackDefault, strOnTransact, function03, function04, (Function0) obj2, cameraCaptureResultEmptyCameraCaptureResult, 0, 1}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 850584658, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -850584653);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Function0 function0, Function1 function1, Function0 function02, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        long j;
        Object obj;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(setdividerdrawable, "");
        Intrinsics.checkNotNullParameter(twoLineExternalSyntheticLambda0, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(874888654, i, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePurchaseHistoryDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InAppPurchaseHistoryDetailScreen.kt:256)");
        }
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42OnExtraCallbackWithResult = onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12>) cameraPresenceProviderExternalSyntheticLambda6).onExtraCallbackWithResult();
        if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda42OnExtraCallbackWithResult == null) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onExtraCallbackWithResult + 69;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            return Unit.INSTANCE;
        }
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        if (!Intrinsics.areEqual((String) InAppPurchaseHistoryDetailViewModel.onWarmupCompleted(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback, 25361969, new Object[]{inAppPurchaseHistoryDetailViewModel}, -25361966, iIAuthTabCallback2), SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3.REJECTED.getValue())) {
            int i4 = onExtraCallbackWithResult + 75;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (!(!Intrinsics.areEqual(r3, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3.REJECTED_BY_PLAY_STORE.getValue()))) {
                j = 1639364;
            } else {
                int i6 = onExtraCallback + 23;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 55 / 0;
                }
                j = 1639306;
            }
        }
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda42OnExtraCallbackWithResult);
        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(inAppPurchaseHistoryDetailViewModel);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnExtraCallback | zOnExtraCallback2)) {
            obj = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda36 externalSyntheticLambda36 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda36(safeActivityEmbeddingComponentProviderExternalSyntheticLambda42OnExtraCallbackWithResult, inAppPurchaseHistoryDetailViewModel);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda36);
                int i8 = onExtraCallback + 65;
                onExtraCallbackWithResult = i8 % 128;
                obj = externalSyntheticLambda36;
                if (i8 % 2 == 0) {
                    int i9 = 5 % 2;
                    obj = externalSyntheticLambda36;
                }
            }
        }
        setThreadList.onWarmupCompleted(j, (String) null, (Function1) obj, ForwardingCameraControl.onExtraCallback(-1253977119, true, new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda37(inAppPurchaseHistoryDetailViewModel, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42OnExtraCallbackWithResult, function0, function1, function02), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 25;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setdividerdrawable, "");
            Intrinsics.checkNotNullParameter(twoLineExternalSyntheticLambda0, "");
            CameraConfigExternalSyntheticLambda0.asBinder();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setdividerdrawable, "");
        Intrinsics.checkNotNullParameter(twoLineExternalSyntheticLambda0, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(707936527, i, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePurchaseHistoryDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InAppPurchaseHistoryDetailScreen.kt:297)");
        }
        AppsInTossCashReceipt appsInTossCashReceiptOnExtraCallbackWithResult = onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<RuleController>) cameraPresenceProviderExternalSyntheticLambda6).onExtraCallbackWithResult();
        if (appsInTossCashReceiptOnExtraCallbackWithResult != null) {
            int i4 = onExtraCallback + 27;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1847765029);
            Object[] objArr = {null, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda28.onExtraCallbackWithResult(appsInTossCashReceiptOnExtraCallbackWithResult, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onExtraCallback(), cameraCaptureResultEmptyCameraCaptureResult, 0), cameraCaptureResultEmptyCameraCaptureResult, 0, 1};
            int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda55.onExtraCallback(objArr, setCurrentIndex.onNavigationEvent(), -1970067015, setCurrentIndex.onNavigationEvent(), 1970067017, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1847962995);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, boolean z, setParentLayoutDirection setparentlayoutdirection, Function2 function2, Function2 function22, Function2 function23, Function1 function1, Function2 function24, Function0 function0, Function2 function25, Function2 function26, InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Function0 function02, Function1 function12, Function0 function03, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        RippleContainer.onNavigationEvent(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "detail", (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ForwardingCameraControl.onExtraCallbackWithResult(-969509290, true, new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda32(safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, z, setparentlayoutdirection, function2, function22, function23, function1, function24, function0, function25, function26)), 254, (Object) null);
        RippleContainer.onNavigationEvent(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "refund", (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ForwardingCameraControl.onExtraCallbackWithResult(1041840781, true, new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda33(safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, inAppPurchaseHistoryDetailViewModel)), 254, (Object) null);
        Object[] objArr = new Object[1];
        a(new char[]{6, 14, 7, 31, 17, 4}, (byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 5), 6 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
        RippleContainer.onNavigationEvent(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, ((String) objArr[0]).intern(), (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ForwardingCameraControl.onExtraCallbackWithResult(874888654, true, new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda34(inAppPurchaseHistoryDetailViewModel, cameraPresenceProviderExternalSyntheticLambda6, function02, function12, function03)), 254, (Object) null);
        RippleContainer.onNavigationEvent(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "cash-receipt", (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ForwardingCameraControl.onExtraCallbackWithResult(707936527, true, new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda35(safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, cameraPresenceProviderExternalSyntheticLambda62)), 254, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0a2a  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0a50  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:400:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel, boolean z, @Nullable Function1<? super String, Unit> function1, @Nullable Function0<Unit> function0, @Nullable Function2<? super String, ? super String, Unit> function2, @Nullable Function2<? super String, ? super String, Unit> function22, @Nullable Function0<Unit> function02, @Nullable Function0<Unit> function03, @Nullable Function1<? super SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted.onExtraCallbackWithResult, Unit> function12, @Nullable Function0<Unit> function04, @Nullable Function2<? super String, ? super String, Unit> function23, @Nullable Function2<? super String, ? super String, Unit> function24, @Nullable Function2<? super String, ? super String, Unit> function25, @Nullable Function2<? super String, ? super String, Unit> function26, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) throws Throwable {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        boolean z2;
        Function1<? super String, Unit> function13;
        Function0<Unit> function05;
        Function2<? super String, ? super String, Unit> function27;
        Function2<? super String, ? super String, Unit> function28;
        Function0<Unit> function06;
        Function0<Unit> function07;
        Function1<? super SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted.onExtraCallbackWithResult, Unit> function14;
        Function0<Unit> function08;
        Function2<? super String, ? super String, Unit> function29;
        Function2<? super String, ? super String, Unit> function210;
        Function2<? super String, ? super String, Unit> function211;
        Function2<? super String, ? super String, Unit> function212;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Function1<? super String, Unit> function15;
        Function0<Unit> function09;
        Function2<? super String, ? super String, Unit> function213;
        Function2<? super String, ? super String, Unit> function214;
        Function0<Unit> function010;
        Function0<Unit> function011;
        Function1<? super SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted.onExtraCallbackWithResult, Unit> function16;
        Function0<Unit> function012;
        Function2<? super String, ? super String, Unit> function215;
        Function2<? super String, ? super String, Unit> function216;
        Function2<? super String, ? super String, Unit> function217;
        Function2<? super String, ? super String, Unit> function218;
        int i22;
        String strIntern;
        Object obj;
        Function2 externalSyntheticLambda6;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18;
        boolean z3;
        InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel2;
        boolean z4;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6;
        boolean z5;
        setParentLayoutDirection setparentlayoutdirection;
        Function0<Unit> function013;
        int i23 = 2 % 2;
        Intrinsics.checkNotNullParameter(inAppPurchaseHistoryDetailViewModel, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-697335433);
        int iExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.extraCallback();
        int i24 = i3 & 1;
        if (i24 != 0) {
            int i25 = onExtraCallbackWithResult + 83;
            onExtraCallback = i25 % 128;
            i4 = i25 % 2 != 0 ? i | 20 : i | 6;
        } else if ((i & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(inAppPurchaseHistoryDetailViewModel) ? 32 : 16;
        }
        int i26 = i3 & 4;
        if (i26 != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 256 : 128;
            }
            i5 = i3 & 8;
            int i27 = 1024;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    int i28 = onExtraCallback + 109;
                    onExtraCallbackWithResult = i28 % 128;
                    int i29 = i28 % 2;
                    i4 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= 196608;
                    } else if ((i & 196608) == 0) {
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 131072 : 65536;
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i4 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function22) ? 524288 : 1048576;
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                    } else {
                        if ((12582912 & i) == 0) {
                            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 8388608 : 4194304;
                        }
                        i10 = i3 & 256;
                        if (i10 != 0) {
                            i4 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function03) ^ true ? 33554432 : 67108864;
                        }
                        i11 = i3 & 512;
                        if (i11 != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 536870912 : 268435456;
                        }
                        i12 = i3 & 1024;
                        if (i12 != 0) {
                            i13 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i13 = i2 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function04) ? 4 : 2);
                        } else {
                            i13 = i2;
                        }
                        i14 = i3 & 2048;
                        if (i14 != 0) {
                            i13 |= 48;
                        } else {
                            if ((i2 & 48) == 0) {
                                int i30 = onExtraCallbackWithResult + 15;
                                onExtraCallback = i30 % 128;
                                int i31 = i30 % 2;
                                i13 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function23) ? 32 : 16;
                            }
                            i15 = i13;
                            i16 = i3 & 4096;
                            if (i16 == 0) {
                                i15 |= 384;
                            } else {
                                if ((i2 & 384) == 0) {
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function24)) {
                                        int i32 = onExtraCallbackWithResult + 33;
                                        i17 = iExtraCallback;
                                        onExtraCallback = i32 % 128;
                                        int i33 = i32 % 2;
                                        i18 = 256;
                                    } else {
                                        i17 = iExtraCallback;
                                        i18 = 128;
                                    }
                                    i15 |= i18;
                                }
                                i19 = i3 & 8192;
                                if (i19 != 0) {
                                    i15 |= 3072;
                                } else {
                                    if ((i2 & 3072) == 0) {
                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function25)) {
                                            int i34 = onExtraCallback + 69;
                                            i20 = i19;
                                            onExtraCallbackWithResult = i34 % 128;
                                            i27 = i34 % 2 == 0 ? 10941 : 2048;
                                        } else {
                                            i20 = i19;
                                        }
                                        i15 |= i27;
                                    }
                                    i21 = i3 & 16384;
                                    if (i21 != 0) {
                                        if ((i2 & 24576) == 0) {
                                            i15 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function26) ? 16384 : 8192;
                                        }
                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i4 & 306783379) == 306783378 && (i15 & 9363) == 9362) ? false : true, i4 & 1)) {
                                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i24 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                            boolean z6 = i26 != 0 ? false : z;
                                            if (i5 != 0) {
                                                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                    objOnMinimized = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda0();
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                                }
                                                function15 = (Function1) objOnMinimized;
                                            } else {
                                                function15 = function1;
                                            }
                                            if (i6 != 0) {
                                                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                    objOnMinimized2 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda10();
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                                                }
                                                function09 = (Function0) objOnMinimized2;
                                            } else {
                                                function09 = function0;
                                            }
                                            if (i7 != 0) {
                                                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                    objOnMinimized3 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda11();
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                                                }
                                                function213 = (Function2) objOnMinimized3;
                                            } else {
                                                function213 = function2;
                                            }
                                            if (i8 != 0) {
                                                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                    objOnMinimized4 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda12();
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                                                }
                                                function214 = (Function2) objOnMinimized4;
                                            } else {
                                                function214 = function22;
                                            }
                                            if (i9 != 0) {
                                                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                    objOnMinimized5 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda13();
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                                                }
                                                function010 = (Function0) objOnMinimized5;
                                            } else {
                                                function010 = function02;
                                            }
                                            if (i10 != 0) {
                                                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                if (objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                    objOnMinimized6 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda14();
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                                                }
                                                function011 = (Function0) objOnMinimized6;
                                            } else {
                                                function011 = function03;
                                            }
                                            if (i11 != 0) {
                                                Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                if (objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                    objOnMinimized7 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda15();
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized7);
                                                }
                                                function16 = (Function1) objOnMinimized7;
                                            } else {
                                                function16 = function12;
                                            }
                                            if (i12 != 0) {
                                                int i35 = onExtraCallbackWithResult + 59;
                                                onExtraCallback = i35 % 128;
                                                int i36 = i35 % 2;
                                                Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                if (objOnMinimized8 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                    objOnMinimized8 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda16();
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized8);
                                                }
                                                function012 = (Function0) objOnMinimized8;
                                            } else {
                                                function012 = function04;
                                            }
                                            if (i14 != 0) {
                                                Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                if (objOnMinimized9 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                    objOnMinimized9 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda17();
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized9);
                                                }
                                                function215 = (Function2) objOnMinimized9;
                                            } else {
                                                function215 = function23;
                                            }
                                            if (i16 != 0) {
                                                Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                if (objOnMinimized10 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                    objOnMinimized10 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda18();
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized10);
                                                }
                                                function216 = (Function2) objOnMinimized10;
                                            } else {
                                                function216 = function24;
                                            }
                                            if (i20 != 0) {
                                                Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                if (objOnMinimized11 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                    objOnMinimized11 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda1();
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized11);
                                                }
                                                function217 = (Function2) objOnMinimized11;
                                            } else {
                                                function217 = function25;
                                            }
                                            if (i21 != 0) {
                                                Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                if (objOnMinimized12 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                    objOnMinimized12 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda2();
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized12);
                                                }
                                                function218 = (Function2) objOnMinimized12;
                                            } else {
                                                function218 = function26;
                                            }
                                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-697335433, i4, i15, "im.toss.appsintoss.iap.screen.InAppPurchasePurchaseHistoryDetailScreen (InAppPurchaseHistoryDetailScreen.kt:62)");
                                            }
                                            setParentLayoutDirection setparentlayoutdirectionOnWarmupCompleted = RippleAnimationfadeOut21.onWarmupCompleted(new PullRefreshIndicatorKtExternalSyntheticLambda3[0], cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(inAppPurchaseHistoryDetailViewModel.onTransact(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                                            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2 = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(inAppPurchaseHistoryDetailViewModel.onNavigationEvent(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                                            boolean z7 = onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<RuleController>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2).onExtraCallbackWithResult() != null;
                                            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.onExtraCallbackWithResult(inAppPurchaseHistoryDetailViewModel.asBinder(), (Object) null, (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 14);
                                            Boolean boolOnExtraCallbackWithResult = onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult);
                                            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult);
                                            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(setparentlayoutdirectionOnWarmupCompleted);
                                            Object objOnMinimized13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            boolean z8 = zOnNavigationEvent | zOnExtraCallback;
                                            Object obj2 = null;
                                            if (!z8) {
                                                int i37 = onExtraCallbackWithResult + 51;
                                                onExtraCallback = i37 % 128;
                                                if (i37 % 2 != 0) {
                                                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                                                    obj2.hashCode();
                                                    throw null;
                                                }
                                                if (objOnMinimized13 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                    objOnMinimized13 = new onWarmupCompleted(setparentlayoutdirectionOnWarmupCompleted, cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult, null);
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized13);
                                                }
                                                isZslDisabledByByUserCaseConfig.onNavigationEvent(boolOnExtraCallbackWithResult, (Function2) objOnMinimized13, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                                String str = (String) InAppPurchaseHistoryDetailViewModel.onWarmupCompleted(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 25361969, new Object[]{inAppPurchaseHistoryDetailViewModel}, -25361966, access.IAuthTabCallbackStubProxy.IAuthTabCallback());
                                                if (Intrinsics.areEqual(str, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3.REJECTED.getValue()) || Intrinsics.areEqual(str, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3.REJECTED_BY_PLAY_STORE.getValue())) {
                                                    i22 = 1;
                                                    Object[] objArr = new Object[1];
                                                    a(new char[]{6, 14, 7, 31, 17, 4}, (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 5), TextUtils.indexOf((CharSequence) "", '0', 0) + 7, objArr);
                                                    strIntern = ((String) objArr[0]).intern();
                                                } else {
                                                    int i38 = onExtraCallbackWithResult + 1;
                                                    onExtraCallback = i38 % 128;
                                                    int i39 = i38 % 2;
                                                    strIntern = "detail";
                                                    i22 = 1;
                                                }
                                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport03, 0.0f, i22, (Object) null), y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null);
                                                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                                                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                                                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                                                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
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
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1498088979);
                                                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = RippleAnimationfadeOut21.onExtraCallback(setparentlayoutdirectionOnWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                                                FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
                                                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                                                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback);
                                                int i40 = i15;
                                                Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                                    getAwbState.onExtraCallback();
                                                }
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                                                } else {
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                                                }
                                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                                                boolean z9 = z7;
                                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
                                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                                                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                                                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(859529449);
                                                boolean z10 = (29360128 & i4) == 8388608;
                                                Object objOnMinimized14 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                if (!z10) {
                                                    int i41 = onExtraCallback + 25;
                                                    onExtraCallbackWithResult = i41 % 128;
                                                    if (i41 % 2 != 0) {
                                                        obj = objOnMinimized14;
                                                        if (objOnMinimized14 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                        }
                                                        MaxAdViewAdapterListener.onWarmupCompleted((Function0) obj, (QuirksExternalSyntheticBackport0) null, (MaxRewardedInterstitialAdapter.onExtraCallback) null, 0L, 0L, (DeviceQuirksExternalSyntheticLambda0) null, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallback(-1602996790, true, new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda4(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 12582912, 126);
                                                        if (asInterface((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) CameraPresenceProviderExternalSyntheticLambda2.onNavigationEvent(inAppPurchaseHistoryDetailViewModel.asInterface(), Boolean.FALSE, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 2))) {
                                                        }
                                                        clearallcamerastateobserverslambda19lambda18.onExtraCallback(externalSyntheticLambda6);
                                                        return;
                                                    }
                                                    int i42 = 41 / 0;
                                                    obj = objOnMinimized14;
                                                    if (objOnMinimized14 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                        InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda3 externalSyntheticLambda3 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda3(function010);
                                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda3);
                                                        obj = externalSyntheticLambda3;
                                                    }
                                                    MaxAdViewAdapterListener.onWarmupCompleted((Function0) obj, (QuirksExternalSyntheticBackport0) null, (MaxRewardedInterstitialAdapter.onExtraCallback) null, 0L, 0L, (DeviceQuirksExternalSyntheticLambda0) null, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallback(-1602996790, true, new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda4(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 12582912, 126);
                                                    if (asInterface((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) CameraPresenceProviderExternalSyntheticLambda2.onNavigationEvent(inAppPurchaseHistoryDetailViewModel.asInterface(), Boolean.FALSE, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 2))) {
                                                        int i43 = i17;
                                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(860498415);
                                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                                        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42OnExtraCallbackWithResult = onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback).onExtraCallbackWithResult();
                                                        if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda42OnExtraCallbackWithResult == null || onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback).onNavigationEvent() != null) {
                                                            Function0<Unit> function014 = function010;
                                                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(860602854);
                                                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
                                                            Object[] objArr2 = new Object[1];
                                                            a(new char[]{4, 0, 4, 11, 3, 19, 13852, 13852, 2, 0, 5, 11, 4, 26, 23, 0, 7, 5, 0, 19, 3, 1, '\r', ' ', 14, '\f', 18, 6, '\t', '#', 3, 2, '\r', 26, 18, 26, ' ', 22, 11, '\r', 6, 14, 1, 29, '\t', 7, 22, 6, 11, 24}, (byte) (103 - KeyEvent.getDeadChar(0, 0)), Color.argb(0, 0, 0, 0) + 50, objArr2);
                                                            x2ExternalSyntheticLambda13.onNavigationEvent(quirksExternalSyntheticBackport0OnNavigationEvent, 0L, 0.0f, new getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(60.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(60.0f), RectangleShapeKt.onExtraCallback(), (DefaultConstructorMarker) null), 0L, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.error_page_404_title, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), deprecated_followSslRedirects.onExtraCallback(((String) objArr2[0]).intern()), DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.error_page_404_message, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), (Function0) null, (String) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.onExtraCallback) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3078, 0, 3862);
                                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i43);
                                                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                                CameraConfigExternalSyntheticLambda0.onTransact();
                                                            }
                                                            clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                                                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel2 == null) {
                                                                return;
                                                            }
                                                            externalSyntheticLambda6 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda6(quirksExternalSyntheticBackport04, inAppPurchaseHistoryDetailViewModel, z6, function15, function09, function213, function214, function014, function011, function16, function012, function215, function216, function217, function218, i, i2, i3);
                                                            clearallcamerastateobserverslambda19lambda18 = clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel2;
                                                        } else {
                                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(861103535);
                                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                                            if (z6) {
                                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(861167612);
                                                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = setContentInsetsAbsolute.onExtraCallbackWithResult(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)), setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1), false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null);
                                                                component5 component5VarOnExtraCallback = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.asInterface(), onextracallbackwithresult.access000(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                                                int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                                                                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
                                                                Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
                                                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                                                    getAwbState.onExtraCallback();
                                                                }
                                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                                                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback3);
                                                                } else {
                                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                                                                }
                                                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                                                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
                                                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
                                                                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
                                                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
                                                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
                                                                RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                                                                setCallToAction.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = setCallToAction.IAuthTabCallback.Companion.onNavigationEvent();
                                                                Object objOnMinimized15 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                                if (objOnMinimized15 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                                    objOnMinimized15 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda7();
                                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized15);
                                                                }
                                                                setAdvertiser.onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -1453984414, new Object[]{"Success", null, iAuthTabCallbackOnNavigationEvent, null, null, null, (Function0) objOnMinimized15, null, false, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1573254, 954}, 1453984418, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult());
                                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                                            } else {
                                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(861585647);
                                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                                            }
                                                            setAdVideoPlaybackListener.onExtraCallbackWithResult(setparentlayoutdirectionOnWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                                            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda42OnExtraCallbackWithResult);
                                                            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z9);
                                                            boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(setparentlayoutdirectionOnWarmupCompleted);
                                                            boolean z11 = (458752 & i4) == 131072;
                                                            boolean z12 = (3670016 & i4) == 1048576;
                                                            boolean z13 = (i40 & 112) == 32;
                                                            boolean z14 = (1879048192 & i4) == 536870912;
                                                            Function0<Unit> function015 = function010;
                                                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport03;
                                                            boolean z15 = (i40 & 7168) == 2048;
                                                            boolean z16 = (i40 & 14) == 4;
                                                            if ((i40 & 896) == 256) {
                                                                int i44 = onExtraCallback + 71;
                                                                onExtraCallbackWithResult = i44 % 128;
                                                                int i45 = i44 % 2;
                                                                z3 = true;
                                                            } else {
                                                                z3 = false;
                                                            }
                                                            if ((i40 & 57344) == 16384) {
                                                                inAppPurchaseHistoryDetailViewModel2 = inAppPurchaseHistoryDetailViewModel;
                                                                z4 = true;
                                                            } else {
                                                                inAppPurchaseHistoryDetailViewModel2 = inAppPurchaseHistoryDetailViewModel;
                                                                z4 = false;
                                                            }
                                                            boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(inAppPurchaseHistoryDetailViewModel2);
                                                            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                                                            boolean z17 = (i4 & 57344) == 16384;
                                                            boolean z18 = (i4 & 7168) == 2048;
                                                            if ((i4 & 234881024) == 67108864) {
                                                                cameraPresenceProviderExternalSyntheticLambda6 = cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2;
                                                                z5 = true;
                                                            } else {
                                                                cameraPresenceProviderExternalSyntheticLambda6 = cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2;
                                                                z5 = false;
                                                            }
                                                            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6);
                                                            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62 = cameraPresenceProviderExternalSyntheticLambda6;
                                                            Object objOnMinimized16 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                            if (((zOnExtraCallback2 | zOnExtraCallback3 | zOnExtraCallback4 | z11 | z12 | z13 | z14 | z15 | z16 | z3 | z4 | zOnExtraCallback5 | zOnNavigationEvent2 | z17 | z18 | z5) || zOnNavigationEvent3) || objOnMinimized16 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                                setparentlayoutdirection = setparentlayoutdirectionOnWarmupCompleted;
                                                                function013 = function015;
                                                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport05;
                                                                InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda8 externalSyntheticLambda8 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda8(safeActivityEmbeddingComponentProviderExternalSyntheticLambda42OnExtraCallbackWithResult, z9, setparentlayoutdirectionOnWarmupCompleted, function213, function214, function215, function16, function217, function012, function216, function218, inAppPurchaseHistoryDetailViewModel, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, function09, function15, function011, cameraPresenceProviderExternalSyntheticLambda62);
                                                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(externalSyntheticLambda8);
                                                                objOnMinimized16 = externalSyntheticLambda8;
                                                            } else {
                                                                setparentlayoutdirection = setparentlayoutdirectionOnWarmupCompleted;
                                                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                                                function013 = function015;
                                                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport05;
                                                            }
                                                            RippleHostViewExternalSyntheticLambda0.onWarmupCompleted(setparentlayoutdirection, strIntern, (QuirksExternalSyntheticBackport0) null, (QuirkSettingsLoader) null, (String) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) objOnMinimized16, cameraCaptureResultEmptyCameraCaptureResult2, 0, 0, 1020);
                                                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                                            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                                                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                                            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                                                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                                CameraConfigExternalSyntheticLambda0.onTransact();
                                                            }
                                                            function05 = function09;
                                                            z2 = z6;
                                                            function06 = function013;
                                                            function28 = function214;
                                                            function13 = function15;
                                                            function27 = function213;
                                                            function07 = function011;
                                                            function14 = function16;
                                                            function08 = function012;
                                                            function29 = function215;
                                                            function210 = function216;
                                                            function211 = function217;
                                                            function212 = function218;
                                                        }
                                                    } else {
                                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(860265853);
                                                        removeAllUpdateListeners.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null), false, false, (TdsSkeletonV1View.onWarmupCompleted) null, TdsSkeletonV1View.IAuthTabCallback.getInterfaceDescriptor.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (TdsSkeletonV1View.IAuthTabCallback.getInterfaceDescriptor.onNavigationEvent << 12) | 6, 14);
                                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i17);
                                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                            CameraConfigExternalSyntheticLambda0.onTransact();
                                                        }
                                                        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                                                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel3 == null) {
                                                            return;
                                                        }
                                                        externalSyntheticLambda6 = new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda5(quirksExternalSyntheticBackport03, inAppPurchaseHistoryDetailViewModel, z6, function15, function09, function213, function214, function010, function011, function16, function012, function215, function216, function217, function218, i, i2, i3);
                                                        clearallcamerastateobserverslambda19lambda18 = clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel3;
                                                    }
                                                    clearallcamerastateobserverslambda19lambda18.onExtraCallback(externalSyntheticLambda6);
                                                    return;
                                                }
                                            }
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                            z2 = z;
                                            function13 = function1;
                                            function05 = function0;
                                            function27 = function2;
                                            function28 = function22;
                                            function06 = function02;
                                            function07 = function03;
                                            function14 = function12;
                                            function08 = function04;
                                            function29 = function23;
                                            function210 = function24;
                                            function211 = function25;
                                            function212 = function26;
                                        }
                                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new InAppPurchaseHistoryDetailScreenKt$.ExternalSyntheticLambda9(quirksExternalSyntheticBackport02, inAppPurchaseHistoryDetailViewModel, z2, function13, function05, function27, function28, function06, function07, function14, function08, function29, function210, function211, function212, i, i2, i3));
                                            return;
                                        }
                                        return;
                                    }
                                    i15 |= 24576;
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i4 & 306783379) == 306783378 && (i15 & 9363) == 9362) ? false : true, i4 & 1)) {
                                    }
                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                    }
                                }
                                i20 = i19;
                                i21 = i3 & 16384;
                                if (i21 != 0) {
                                }
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i4 & 306783379) == 306783378 && (i15 & 9363) == 9362) ? false : true, i4 & 1)) {
                                }
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                }
                            }
                            i17 = iExtraCallback;
                            i19 = i3 & 8192;
                            if (i19 != 0) {
                            }
                            i20 = i19;
                            i21 = i3 & 16384;
                            if (i21 != 0) {
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i4 & 306783379) == 306783378 && (i15 & 9363) == 9362) ? false : true, i4 & 1)) {
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            }
                        }
                        i15 = i13;
                        i16 = i3 & 4096;
                        if (i16 == 0) {
                        }
                        i17 = iExtraCallback;
                        i19 = i3 & 8192;
                        if (i19 != 0) {
                        }
                        i20 = i19;
                        i21 = i3 & 16384;
                        if (i21 != 0) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i4 & 306783379) == 306783378 && (i15 & 9363) == 9362) ? false : true, i4 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        }
                    }
                    i10 = i3 & 256;
                    if (i10 != 0) {
                    }
                    i11 = i3 & 512;
                    if (i11 != 0) {
                    }
                    i12 = i3 & 1024;
                    if (i12 != 0) {
                    }
                    i14 = i3 & 2048;
                    if (i14 != 0) {
                    }
                    i15 = i13;
                    i16 = i3 & 4096;
                    if (i16 == 0) {
                    }
                    i17 = iExtraCallback;
                    i19 = i3 & 8192;
                    if (i19 != 0) {
                    }
                    i20 = i19;
                    i21 = i3 & 16384;
                    if (i21 != 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i4 & 306783379) == 306783378 && (i15 & 9363) == 9362) ? false : true, i4 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                i10 = i3 & 256;
                if (i10 != 0) {
                }
                i11 = i3 & 512;
                if (i11 != 0) {
                }
                i12 = i3 & 1024;
                if (i12 != 0) {
                }
                i14 = i3 & 2048;
                if (i14 != 0) {
                }
                i15 = i13;
                i16 = i3 & 4096;
                if (i16 == 0) {
                }
                i17 = iExtraCallback;
                i19 = i3 & 8192;
                if (i19 != 0) {
                }
                i20 = i19;
                i21 = i3 & 16384;
                if (i21 != 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i4 & 306783379) == 306783378 && (i15 & 9363) == 9362) ? false : true, i4 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            i10 = i3 & 256;
            if (i10 != 0) {
            }
            i11 = i3 & 512;
            if (i11 != 0) {
            }
            i12 = i3 & 1024;
            if (i12 != 0) {
            }
            i14 = i3 & 2048;
            if (i14 != 0) {
            }
            i15 = i13;
            i16 = i3 & 4096;
            if (i16 == 0) {
            }
            i17 = iExtraCallback;
            i19 = i3 & 8192;
            if (i19 != 0) {
            }
            i20 = i19;
            i21 = i3 & 16384;
            if (i21 != 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i4 & 306783379) == 306783378 && (i15 & 9363) == 9362) ? false : true, i4 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        i5 = i3 & 8;
        int i272 = 1024;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        i10 = i3 & 256;
        if (i10 != 0) {
        }
        i11 = i3 & 512;
        if (i11 != 0) {
        }
        i12 = i3 & 1024;
        if (i12 != 0) {
        }
        i14 = i3 & 2048;
        if (i14 != 0) {
        }
        i15 = i13;
        i16 = i3 & 4096;
        if (i16 == 0) {
        }
        i17 = iExtraCallback;
        i19 = i3 & 8192;
        if (i19 != 0) {
        }
        i20 = i19;
        i21 = i3 & 16384;
        if (i21 != 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i4 & 306783379) == 306783378 && (i15 & 9363) == 9362) ? false : true, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final boolean asInterface(CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).booleanValue();
        int i4 = onExtraCallbackWithResult + 95;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0 = (TwoLineExternalSyntheticLambda0) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = onExtraCallbackWithResult + 49;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return twoLineExternalSyntheticLambda0;
    }

    private static final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12 onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12 safeActivityEmbeddingComponentProviderExternalSyntheticLambda12 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = onExtraCallback + 43;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return safeActivityEmbeddingComponentProviderExternalSyntheticLambda12;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final RuleController onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6<RuleController> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        RuleController ruleController = (RuleController) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 57;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return ruleController;
    }

    private static final Boolean onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = onExtraCallbackWithResult + 97;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel, boolean z, Function1 function1, Function0 function0, Function2 function2, Function2 function22, Function0 function02, Function0 function03, Function1 function12, Function0 function04, Function2 function23, Function2 function24, Function2 function25, Function2 function26, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        Object[] objArr = {quirksExternalSyntheticBackport0, inAppPurchaseHistoryDetailViewModel, Boolean.valueOf(z), function1, function0, function2, function22, function02, function03, function12, function04, function23, function24, function25, function26, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -1139547815, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, 1139547829);
    }

    public static /* synthetic */ Unit onWarmupCompleted(InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, Function0 function0, Function1 function1, Function0 function02, enableLoopMonitor enableloopmonitor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {inAppPurchaseHistoryDetailViewModel, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, function0, function1, function02, enableloopmonitor, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -837590048, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, 837590059);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, inAppPurchaseHistoryDetailViewModel, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -1058768223, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, 1058768227);
    }

    public static /* synthetic */ Unit IAuthTabCallback() {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 108863006, iIAuthTabCallback2, new Object[0], TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, -108863000);
    }

    public static /* synthetic */ Unit onNavigationEvent(setParentLayoutDirection setparentlayoutdirection, Function2 function2, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -1838825135, iIAuthTabCallback2, new Object[]{setparentlayoutdirection, function2, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42}, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, 1838825135);
    }

    public static /* synthetic */ Unit onExtraCallback(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, cameraPresenceProviderExternalSyntheticLambda6, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -1174726365, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, 1174726367);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 908269934, iIAuthTabCallback2, new Object[]{str}, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, -908269926);
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, String str2) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 272189584, iIAuthTabCallback2, new Object[]{str, str2}, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, -272189579);
    }

    public static /* synthetic */ Unit onExtraCallback(setParentLayoutDirection setparentlayoutdirection) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 963408849, iIAuthTabCallback2, new Object[]{setparentlayoutdirection}, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, -963408836);
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 898670716, iIAuthTabCallback2, new Object[]{function0}, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, -898670701);
    }

    private static final TwoLineExternalSyntheticLambda0 IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<TwoLineExternalSyntheticLambda0> cameraPresenceProviderExternalSyntheticLambda6) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (TwoLineExternalSyntheticLambda0) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -179757285, iIAuthTabCallback2, new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, 179757301);
    }

    private static final ResourceManagerInternalAsldcInflateDelegate onExtraCallbackWithResult(setDividerPadding setdividerpadding) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (ResourceManagerInternalAsldcInflateDelegate) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 1750334331, iIAuthTabCallback2, new Object[]{setdividerpadding}, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, -1750334321);
    }

    private static final Unit onExtraCallbackWithResult(setParentLayoutDirection setparentlayoutdirection, Function2 function2, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 423669684, iIAuthTabCallback2, new Object[]{setparentlayoutdirection, function2, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42}, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, -423669672);
    }

    private static final Unit IAuthTabCallbackDefault(setParentLayoutDirection setparentlayoutdirection, Function2 function2, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -410259588, iIAuthTabCallback2, new Object[]{setparentlayoutdirection, function2, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42}, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, 410259605);
    }

    private static final Unit onExtraCallbackWithResult(setParentLayoutDirection setparentlayoutdirection) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -84349311, iIAuthTabCallback2, new Object[]{setparentlayoutdirection}, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, 84349320);
    }

    private static final Unit onNavigationEvent(InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel, String str) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 479327891, iIAuthTabCallback2, new Object[]{inAppPurchaseHistoryDetailViewModel, str}, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, -479327884);
    }

    private static final Unit onExtraCallbackWithResult(Function0 function0) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 1057417407, iIAuthTabCallback2, new Object[]{function0}, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, -1057417406);
    }

    private static final Unit asBinder(String str, String str2) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -255894655, iIAuthTabCallback2, new Object[]{str, str2}, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, 255894658);
    }

    public static final /* synthetic */ Boolean onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Boolean) onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 1468882573, iIAuthTabCallback2, new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, -1468882555);
    }
}
