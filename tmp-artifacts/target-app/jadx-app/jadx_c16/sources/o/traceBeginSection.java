package o;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.google.android.gms.internal.ads.zziea;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import com.otaliastudios.cameraview.R$styleable;
import im.toss.core.webkit.bridge.accessarybutton.IconDoubleAccessoryButtonConfiguration;
import im.toss.features.home.core.ui.R;
import im.toss.features.home.feature.cashflow.CashflowViewModel;
import im.toss.features.home.feature.cashflow.R$string;
import im.toss.features.home.feature.cashflow.screen.CashflowScreenKt$;
import im.toss.features.home.feature.cashflow.screen.CashflowScreenKt$CashflowContent$6$1$;
import im.toss.features.home.feature.cashflow.screen.CashflowScreenKt$TabsContent$2$1$;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.inventory_sdk.InventoryAdManager;
import im.toss.inventory_sdk.model.InventoryAdDto;
import im.toss.inventory_sdk.model.TriggerDto;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import j$.time.LocalDate;
import j$.time.YearMonth;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BrickModuleImplExternalSyntheticLambda1;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CheckMask;
import o.DefaultAppOperatorImpl;
import o.DefaultLoggerProxyImpl;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RVLogger;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.getPrivacyDestinationUri;
import o.getTyroBlockTime;
import o.r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA;
import o.setCallToAction;
import o.setViewableMRC50Requests;
import o.toPreviewOnlyRange;
import o.x2ExternalSyntheticLambda25;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.account.agreement.AccountAgreementHelper$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class traceBeginSection {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static final /* synthetic */ Boolean IAuthTabCallback(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolOnNavigationEvent = onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1);
        int i4 = onNavigationEvent + 85;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return boolOnNavigationEvent;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i4);
        int i9 = ~(i | i4);
        int i10 = ~i;
        int i11 = ~i4;
        int i12 = i8 | i9 | (~(i10 | i11 | i5));
        int i13 = i8 | (~(i7 | i)) | i9;
        int i14 = (~(i4 | i5)) | (~(i10 | i4)) | (~(i7 | i11 | i));
        int i15 = i5 + i + i2 + (1880080305 * i3) + (458392769 * i6);
        int i16 = i15 * i15;
        int i17 = ((766573918 * i5) - 2147483648) + (1582236324 * i) + (i12 * (-407831203)) + (815662406 * i13) + ((-407831203) * i14) + (1174405120 * i2) + (1711276032 * i3) + ((-973078528) * i6) + (68288512 * i16);
        int i18 = ((i5 * 319678698) - 2002258816) + (i * 319678284) + (i12 * 207) + (i13 * (-414)) + (i14 * 207) + (i2 * 319678491) + (i3 * (-161570901)) + (i6 * (-1160779685)) + (i16 * (-1109000192));
        switch (i17 + (i18 * i18 * (-1432485888))) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return IAuthTabCallbackStub(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                return asInterface(objArr);
            case 9:
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                int i19 = 2 % 2;
                int i20 = onWarmupCompleted + 81;
                onNavigationEvent = i20 % 128;
                int i21 = i20 % 2;
                IAuthTabCallback(-1205514679, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{getsupportedhighspeedresolutionsfor, Boolean.valueOf(zBooleanValue)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1205514689, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
                int i22 = onWarmupCompleted + 35;
                onNavigationEvent = i22 % 128;
                int i23 = i22 % 2;
                return null;
            case 10:
                return onTransact(objArr);
            case 11:
                return getInterfaceDescriptor(objArr);
            case 12:
                return access000(objArr);
            case 13:
                return IAuthTabCallbackStubProxy(objArr);
            case 14:
                return access100(objArr);
            case 15:
                return IAuthTabCallback_Parcel(objArr);
            case 16:
                return readTypedObject(objArr);
            case 17:
                return ICustomTabsCallback(objArr);
            case 18:
                return extraCallbackWithResult(objArr);
            case 19:
                return extraCallback(objArr);
            case 20:
                return writeTypedObject(objArr);
            case 21:
                return onMessageChannelReady(objArr);
            case 22:
                return onActivityLayout(objArr);
            case 23:
                return onMinimized(objArr);
            case 24:
                return onPostMessage(objArr);
            case 25:
                DefaultAppOperatorImpl defaultAppOperatorImpl = (DefaultAppOperatorImpl) objArr[0];
                RVLogger.onWarmupCompleted onwarmupcompleted = (RVLogger.onWarmupCompleted) objArr[1];
                Function1 function1 = (Function1) objArr[2];
                Function1 function12 = (Function1) objArr[3];
                int i24 = 2 % 2;
                int i25 = onNavigationEvent + 43;
                onWarmupCompleted = i25 % 128;
                int i26 = i25 % 2;
                Unit unitOnNavigationEvent = onNavigationEvent(defaultAppOperatorImpl, onwarmupcompleted, function1, function12);
                int i27 = onNavigationEvent + 13;
                onWarmupCompleted = i27 % 128;
                int i28 = i27 % 2;
                return unitOnNavigationEvent;
            case R$styleable.CameraView_cameraPictureMetering /* 26 */:
                return onActivityResized(objArr);
            case 27:
                return onRelationshipValidationResult(objArr);
            case 28:
                return ICustomTabsCallbackStub(objArr);
            case 29:
                return ICustomTabsCallbackDefault(objArr);
            case 30:
                return onUnminimized(objArr);
            case 31:
                return ICustomTabsCallbackStubProxy(objArr);
            case 32:
                return extraCommand(objArr);
            case 33:
                CashflowViewModel cashflowViewModel = (CashflowViewModel) objArr[0];
                String str = (String) objArr[1];
                int i29 = 2 % 2;
                int i30 = onWarmupCompleted + 109;
                onNavigationEvent = i30 % 128;
                int i31 = i30 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
                CashflowViewModel.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1236282920, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1236282929, new Object[]{cashflowViewModel, str});
                Unit unit = Unit.INSTANCE;
                int i32 = onWarmupCompleted + 39;
                onNavigationEvent = i32 % 128;
                int i33 = i32 % 2;
                return unit;
            case 34:
                return ICustomTabsCallback_Parcel(objArr);
            case 35:
                return ICustomTabsService(objArr);
            case R$styleable.CameraView_cameraPictureSnapshotMetering /* 36 */:
                return isEngagementSignalsApiAvailable(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static final /* synthetic */ Object IAuthTabCallback(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = onWarmupCompleted(camera2CameraMetadataExternalSyntheticLambda1, (access13800<? super Unit>) access13800Var);
        int i4 = onWarmupCompleted + 43;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return objOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 93;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unit = (Unit) IAuthTabCallback(238508972, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -238508941, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        int i6 = onWarmupCompleted + 33;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(View view, String str, Function0 function0) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(view, str, function0);
        int i4 = onWarmupCompleted + 65;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CashflowViewModel cashflowViewModel) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit interfaceDescriptor = getInterfaceDescriptor(cashflowViewModel);
        int i4 = onNavigationEvent + 77;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return interfaceDescriptor;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CashflowViewModel cashflowViewModel, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 57;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) IAuthTabCallback(1918297013, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{cashflowViewModel, Integer.valueOf(i)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1918297011, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        int i5 = onNavigationEvent + 51;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CashflowViewModel cashflowViewModel, LocalDate localDate) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cashflowViewModel, localDate);
        int i4 = onNavigationEvent + 113;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CashflowViewModel cashflowViewModel, String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackDefault(cashflowViewModel, str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(cashflowViewModel, str);
        int i3 = onNavigationEvent + 93;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CashflowViewModel cashflowViewModel, DefaultLoggerProxyImpl.onExtraCallbackWithResult onextracallbackwithresult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 45;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            onWarmupCompleted(cashflowViewModel, onextracallbackwithresult, i);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(cashflowViewModel, onextracallbackwithresult, i);
        int i4 = onWarmupCompleted + 47;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(str);
        int i4 = onWarmupCompleted + 91;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(DefaultAppOperatorImpl defaultAppOperatorImpl, Object obj, String str, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 3;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallback = onExtraCallback(defaultAppOperatorImpl, obj, str, function0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onWarmupCompleted + 103;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallback;
    }

    private static final Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, RVLogger.onWarmupCompleted onwarmupcompleted, InventoryAdManager inventoryAdManager, String str, InventoryAdDto inventoryAdDto, applyConfig applyconfig, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, boolean z, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function0 function0, Function1 function15, String str2, Function0 function02, Function1 function16, Function1 function17, Function1 function18, getBacktraceNote getbacktracenote, Function2 function2, Function1 function19, Function1 function110, Function1 function111, View view, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 51;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        IAuthTabCallback(399265859, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{quirksExternalSyntheticBackport0, onwarmupcompleted, inventoryAdManager, str, inventoryAdDto, applyconfig, camera2CameraMetadataExternalSyntheticLambda1, Boolean.valueOf(z), function1, function12, function13, function14, function0, function15, str2, function02, function16, function17, function18, getbacktracenote, function2, function19, function110, function111, view, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i2)), Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i3))}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -399265833, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i8 = onNavigationEvent + 65;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getBacktraceNote getbacktracenote, RVLogger.onWarmupCompleted onwarmupcompleted, applyConfig applyconfig, DefaultLoggerProxyImpl.IAuthTabCallback.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getbacktracenote, onwarmupcompleted, applyconfig, iAuthTabCallback);
        int i4 = onNavigationEvent + 95;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ void IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, z);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 21;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(CashflowViewModel cashflowViewModel) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitExtraCallbackWithResult = extraCallbackWithResult(cashflowViewModel);
        if (i3 == 0) {
            int i4 = 81 / 0;
        }
        int i5 = onWarmupCompleted + 43;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(CashflowViewModel cashflowViewModel) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess000 = access000(cashflowViewModel);
        int i4 = onNavigationEvent + 47;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
        return unitAccess000;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        YearMonth yearMonth = (YearMonth) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        YearMonth yearMonthOnExtraCallbackWithResult = onExtraCallbackWithResult(yearMonth);
        int i4 = onNavigationEvent + 45;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 19 / 0;
        }
        return yearMonthOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback_Parcel(CashflowViewModel cashflowViewModel) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        Unit unit = (Unit) IAuthTabCallback(-1442328751, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{cashflowViewModel}, iOnExtraCallbackWithResult, 1442328771, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        int i4 = onWarmupCompleted + 33;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        CashflowViewModel cashflowViewModel = (CashflowViewModel) objArr[0];
        CommonAppExitExtension commonAppExitExtension = (CommonAppExitExtension) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cashflowViewModel, commonAppExitExtension);
        int i4 = onWarmupCompleted + 83;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallbackDefault(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        getTyroBlockTime gettyroblocktime = (getTyroBlockTime) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        Unit unit = (Unit) IAuthTabCallback(-181866816, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{function1, gettyroblocktime}, iOnExtraCallbackWithResult, 181866831, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        int i4 = onWarmupCompleted + 43;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStub(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        Function0 function02 = (Function0) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(function0, function02);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(function0, function02);
        int i3 = onNavigationEvent + 3;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStubProxy(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(-414590168, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1))}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 414590186, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 47;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object ICustomTabsService(Object[] objArr) {
        CashflowViewModel cashflowViewModel = (CashflowViewModel) objArr[0];
        CommonAppExitExtension commonAppExitExtension = (CommonAppExitExtension) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(cashflowViewModel, commonAppExitExtension);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(cashflowViewModel, commonAppExitExtension);
        int i3 = onNavigationEvent + 95;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        Function0 function02 = (Function0) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(function0, function02);
        }
        onNavigationEvent(function0, function02);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        CashflowViewModel cashflowViewModel = (CashflowViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {cashflowViewModel};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        if (i3 == 0) {
            throw null;
        }
        Unit unit = (Unit) IAuthTabCallback(346265184, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, objArr2, iOnExtraCallbackWithResult, -346265179, iOnExtraCallbackWithResult4);
        int i4 = onWarmupCompleted + 73;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit access100(CashflowViewModel cashflowViewModel) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            onMinimized(cashflowViewModel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnMinimized = onMinimized(cashflowViewModel);
        int i3 = onWarmupCompleted + 89;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 72 / 0;
        }
        return unitOnMinimized;
    }

    public static /* synthetic */ Unit asBinder(CashflowViewModel cashflowViewModel) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitWriteTypedObject = writeTypedObject(cashflowViewModel);
        int i4 = onWarmupCompleted + 113;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return unitWriteTypedObject;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        CommonAppExitExtension commonAppExitExtension = (CommonAppExitExtension) objArr[1];
        Function1 function12 = (Function1) objArr[2];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function1, commonAppExitExtension, function12);
        int i4 = onNavigationEvent + 15;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 50 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit asInterface(CashflowViewModel cashflowViewModel) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallback = ICustomTabsCallback(cashflowViewModel);
        int i4 = onWarmupCompleted + 91;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitICustomTabsCallback;
    }

    private static final Unit asInterface(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, RVLogger.onWarmupCompleted onwarmupcompleted, InventoryAdManager inventoryAdManager, String str, InventoryAdDto inventoryAdDto, applyConfig applyconfig, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, boolean z, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function0 function0, Function1 function15, String str2, Function0 function02, Function1 function16, Function1 function17, Function1 function18, getBacktraceNote getbacktracenote, Function2 function2, Function1 function19, Function1 function110, Function1 function111, View view, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 19;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        IAuthTabCallback(399265859, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{quirksExternalSyntheticBackport0, onwarmupcompleted, inventoryAdManager, str, inventoryAdDto, applyconfig, camera2CameraMetadataExternalSyntheticLambda1, Boolean.valueOf(z), function1, function12, function13, function14, function0, function15, str2, function02, function16, function17, function18, getbacktracenote, function2, function19, function110, function111, view, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i2)), Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i3))}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -399265833, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i8 = onNavigationEvent + 11;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 3 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        List list = (List) objArr[0];
        RVLogger.onWarmupCompleted onwarmupcompleted = (RVLogger.onWarmupCompleted) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        String str = (String) objArr[3];
        x4ExternalSyntheticLambda4 x4externalsyntheticlambda4 = (x4ExternalSyntheticLambda4) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(list, onwarmupcompleted, function1, str, x4externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(list, onwarmupcompleted, function1, str, x4externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = onWarmupCompleted + 37;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 99;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return onWarmupCompleted(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onWarmupCompleted(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CashflowViewModel cashflowViewModel) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnPostMessage = onPostMessage(cashflowViewModel);
        int i4 = onWarmupCompleted + 65;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnPostMessage;
    }

    public static /* synthetic */ Unit onExtraCallback(CashflowViewModel cashflowViewModel, LocalDate localDate) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(cashflowViewModel, localDate);
        int i4 = onWarmupCompleted + 33;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onExtraCallback(CashflowViewModel cashflowViewModel, String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(cashflowViewModel, str);
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        int i5 = onWarmupCompleted + 69;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return unitAsBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CashflowViewModel cashflowViewModel, DefaultLoggerProxyImpl.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(cashflowViewModel, iAuthTabCallback);
        int i4 = onNavigationEvent + 3;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(CashflowViewModel cashflowViewModel, DefaultLoggerProxyImpl.IAuthTabCallback iAuthTabCallback, RVLogger rVLogger, Function1 function1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(cashflowViewModel, iAuthTabCallback, rVLogger, function1);
        if (i3 == 0) {
            int i4 = 64 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, DefaultLoggerProxyImpl.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, iAuthTabCallback);
        int i4 = onWarmupCompleted + 101;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0, Context context, Resources resources, RVLogger.onWarmupCompleted onwarmupcompleted, List list, Function0 function02, Function1 function1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function0, context, resources, onwarmupcompleted, list, function02, function1);
        int i4 = onNavigationEvent + 101;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static final Unit onExtraCallback(DefaultAppOperatorImpl defaultAppOperatorImpl, Object obj, String str, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 119;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            onWarmupCompleted(defaultAppOperatorImpl, obj, str, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i));
        } else {
            onWarmupCompleted(defaultAppOperatorImpl, obj, str, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        }
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 101;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(ImageLoaderBuilderExternalSyntheticLambda6 imageLoaderBuilderExternalSyntheticLambda6, CashflowViewModel cashflowViewModel, RVLogger rVLogger, Function1 function1, DefaultLoggerProxyImpl.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        Unit unit = (Unit) IAuthTabCallback(440720837, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{imageLoaderBuilderExternalSyntheticLambda6, cashflowViewModel, rVLogger, function1, iAuthTabCallback}, iOnExtraCallbackWithResult, -440720833, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        int i4 = onWarmupCompleted + 59;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, RVLogger.onWarmupCompleted onwarmupcompleted, InventoryAdManager inventoryAdManager, String str, InventoryAdDto inventoryAdDto, applyConfig applyconfig, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, boolean z, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function0 function0, Function1 function15, String str2, Function0 function02, Function1 function16, Function1 function17, Function1 function18, getBacktraceNote getbacktracenote, Function2 function2, Function1 function19, Function1 function110, Function1 function111, View view, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 73;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(quirksExternalSyntheticBackport0, onwarmupcompleted, inventoryAdManager, str, inventoryAdDto, applyconfig, camera2CameraMetadataExternalSyntheticLambda1, z, function1, function12, function13, function14, function0, function15, str2, function02, function16, function17, function18, getbacktracenote, function2, function19, function110, function111, view, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = onNavigationEvent + 89;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit onExtraCallback(RVLogger.onWarmupCompleted onwarmupcompleted, InventoryAdManager inventoryAdManager, String str, InventoryAdDto inventoryAdDto, applyConfig applyconfig, Function2 function2, Function1 function1, Function0 function0, Function1 function12, Function1 function13, Function1 function14, Function0 function02, Function1 function15, Function0 function03, Function0 function04, Function1 function16, Function0 function05, Function1 function17, Function0 function06, Function0 function07, Function1 function18, Function1 function19, Function1 function110, Function1 function111, getBacktraceNote getbacktracenote, Function2 function22, Function1 function112, Function1 function113, Function1 function114, Function1 function115, Function0 function08, Function1 function116, Function0 function09, Function0 function010, getBacktraceNote getbacktracenote2, Function1 function117, Function0 function011, int i, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) throws NoWhenBranchMatchedException {
        int i6 = 2 % 2;
        int i7 = onNavigationEvent + 49;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        onExtraCallbackWithResult(onwarmupcompleted, inventoryAdManager, str, inventoryAdDto, applyconfig, function2, function1, function0, function12, function13, function14, function02, function15, function03, function04, function16, function05, function17, function06, function07, function18, function19, function110, function111, getbacktracenote, function22, function112, function113, function114, function115, function08, function116, function09, function010, getbacktracenote2, function117, function011, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i2), RecomposeScopeImplKt.onExtraCallbackWithResult(i3), RecomposeScopeImplKt.onExtraCallbackWithResult(i4));
        Unit unit = Unit.INSTANCE;
        int i9 = onWarmupCompleted + 5;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    public static final /* synthetic */ Function2 onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Function2<YearMonth, String, Unit> function2OnWarmupCompleted = onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<? extends Function2<? super YearMonth, ? super String, Unit>>) cameraPresenceProviderExternalSyntheticLambda6);
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
        int i5 = onNavigationEvent + 97;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return function2OnWarmupCompleted;
    }

    public static /* synthetic */ getPackageType onExtraCallback(findResAndMsg findresandmsg, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getPackageType getpackagetypeOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, getsupportedhighspeedresolutionsfor, camera2CameraMetadataExternalSyntheticLambda1);
        int i4 = onNavigationEvent + 57;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return getpackagetypeOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CashflowViewModel cashflowViewModel) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit typedObject = readTypedObject(cashflowViewModel);
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
        int i5 = onNavigationEvent + 25;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return typedObject;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CashflowViewModel cashflowViewModel, YearMonth yearMonth) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cashflowViewModel, yearMonth);
        int i4 = onNavigationEvent + 119;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CashflowViewModel cashflowViewModel, String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(cashflowViewModel, str);
        int i4 = onNavigationEvent + 97;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CashflowViewModel cashflowViewModel, debug debugVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            return (Unit) IAuthTabCallback(177411133, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{cashflowViewModel, debugVar}, iOnExtraCallbackWithResult, -177411117, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        }
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        Unit unit = (Unit) IAuthTabCallback(177411133, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{cashflowViewModel, debugVar}, iOnExtraCallbackWithResult2, -177411117, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        int i3 = 80 / 0;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 9;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(th, function0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 125;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(List list, RVLogger.onWarmupCompleted onwarmupcompleted, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Context context, Resources resources, List list2, Function1 function1, Function1 function12, Function1 function13, Function0 function05, Function1 function14, Function0 function06, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 63;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return (Unit) IAuthTabCallback(-1382629473, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{list, onwarmupcompleted, function0, function02, function03, function04, context, resources, list2, function1, function12, function13, function05, function14, function06, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1382629480, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1, getTyroBlockTime gettyroblocktime, Function1 function12, applyConfig applyconfig) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {function1, gettyroblocktime, function12, applyconfig};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) IAuthTabCallback(-1740991652, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, objArr, iOnExtraCallbackWithResult, 1740991658, iOnExtraCallbackWithResult4);
        int i4 = onNavigationEvent + 19;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(DefaultAppOperatorImpl.onExtraCallback onextracallback, boolean z, String str, Function0 function0, Function1 function1, Function0 function02, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 5;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted(onextracallback, z, str, function0, function1, function02, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, RVLogger.onWarmupCompleted onwarmupcompleted, InventoryAdManager inventoryAdManager, String str, InventoryAdDto inventoryAdDto, applyConfig applyconfig, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, boolean z, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function0 function0, Function1 function15, String str2, Function0 function02, Function1 function16, Function1 function17, Function1 function18, getBacktraceNote getbacktracenote, Function2 function2, Function1 function19, Function1 function110, Function1 function111, View view, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 85;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        IAuthTabCallback(399265859, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{quirksExternalSyntheticBackport0, onwarmupcompleted, inventoryAdManager, str, inventoryAdDto, applyconfig, camera2CameraMetadataExternalSyntheticLambda1, Boolean.valueOf(z), function1, function12, function13, function14, function0, function15, str2, function02, function16, function17, function18, getbacktracenote, function2, function19, function110, function111, view, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i2)), Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i3))}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -399265833, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i8 = onWarmupCompleted + 31;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(RVLogger.onWarmupCompleted onwarmupcompleted, InventoryAdManager inventoryAdManager, String str, InventoryAdDto inventoryAdDto, applyConfig applyconfig, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function0 function02, Function1 function15, String str2, Function0 function03, Function1 function16, Function1 function17, Function1 function18, getBacktraceNote getbacktracenote, Function2 function2, Function1 function19, Function1 function110, Function1 function111, View view, CommonAppExitExtension commonAppExitExtension, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Function0 function04, getBacktraceNote getbacktracenote2, Function0 function05, Function1 function112, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 5;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(onwarmupcompleted, inventoryAdManager, str, inventoryAdDto, applyconfig, camera2CameraMetadataExternalSyntheticLambda1, function0, function1, function12, function13, function14, function02, function15, str2, function03, function16, function17, function18, getbacktracenote, function2, function19, function110, function111, view, commonAppExitExtension, getsupportedhighspeedresolutionsfor, function04, getbacktracenote2, function05, function112, getsupportedhighspeedresolutionsfor2, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 19;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(RVLogger.onWarmupCompleted onwarmupcompleted, Function0 function0, Function1 function1, YearMonth yearMonth) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {onwarmupcompleted, function0, function1, yearMonth};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) IAuthTabCallback(1475853367, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, objArr, iOnExtraCallbackWithResult, -1475853333, iOnExtraCallbackWithResult4);
        int i4 = onNavigationEvent + 41;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(RVLogger.onWarmupCompleted onwarmupcompleted, Function0 function0, Function1 function1, String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        Unit unit = (Unit) IAuthTabCallback(404820933, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{onwarmupcompleted, function0, function1, str}, iOnExtraCallbackWithResult, -404820903, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        int i4 = onNavigationEvent + 39;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(RVLogger.onWarmupCompleted onwarmupcompleted, Function1 function1, Function1 function12, debug debugVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(onwarmupcompleted, function1, function12, debugVar);
        }
        onWarmupCompleted(onwarmupcompleted, function1, function12, debugVar);
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor, str);
        int i4 = onWarmupCompleted + 105;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) {
        CashflowViewModel cashflowViewModel = (CashflowViewModel) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        DefaultLoggerProxyImpl.onExtraCallbackWithResult onextracallbackwithresult = (DefaultLoggerProxyImpl.onExtraCallbackWithResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        String str = (String) objArr[4];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return (Unit) IAuthTabCallback(1936353096, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{cashflowViewModel, function1, onextracallbackwithresult, Integer.valueOf(iIntValue), str}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1936353060, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        }
        Object[] objArr2 = {cashflowViewModel, function1, onextracallbackwithresult, Integer.valueOf(iIntValue), str};
        int i3 = 71 / 0;
        return (Unit) IAuthTabCallback(1936353096, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), objArr2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1936353060, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        CashflowViewModel cashflowViewModel = (CashflowViewModel) objArr[0];
        YearMonth yearMonth = (YearMonth) objArr[1];
        String str = (String) objArr[2];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cashflowViewModel, yearMonth, str);
        if (i3 == 0) {
            int i4 = 81 / 0;
        }
        int i5 = onNavigationEvent + 115;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        List list = (List) objArr[0];
        RVLogger.onWarmupCompleted onwarmupcompleted = (RVLogger.onWarmupCompleted) objArr[1];
        Function0 function0 = (Function0) objArr[2];
        Function0 function02 = (Function0) objArr[3];
        Function0 function03 = (Function0) objArr[4];
        Function0 function04 = (Function0) objArr[5];
        Context context = (Context) objArr[6];
        Resources resources = (Resources) objArr[7];
        List list2 = (List) objArr[8];
        Function1 function1 = (Function1) objArr[9];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[10];
        int iIntValue = ((Number) objArr[11]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(list, onwarmupcompleted, function0, function02, function03, function04, context, resources, list2, function1, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onWarmupCompleted + 75;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String strOnWarmupCompleted = onWarmupCompleted((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor);
        int i4 = onNavigationEvent + 81;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return strOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CashflowViewModel cashflowViewModel) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitExtraCallback = extraCallback(cashflowViewModel);
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        return unitExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(CashflowViewModel cashflowViewModel, LocalDate localDate) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cashflowViewModel, localDate);
        if (i3 != 0) {
            int i4 = 24 / 0;
        }
        int i5 = onNavigationEvent + 83;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(CashflowViewModel cashflowViewModel, String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(cashflowViewModel, str);
        int i4 = onNavigationEvent + 75;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 44 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onNavigationEvent(CashflowViewModel cashflowViewModel, Function1 function1, Function1 function12, Function2 function2, Function1 function13, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 97;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cashflowViewModel, function1, function12, function2, function13, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onNavigationEvent + 95;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(CashflowViewModel cashflowViewModel, Function2 function2, String str, String str2, DefaultLoggerProxyImpl.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(cashflowViewModel, function2, str, str2, iAuthTabCallback);
        }
        IAuthTabCallback(cashflowViewModel, function2, str, str2, iAuthTabCallback);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str);
        int i4 = onNavigationEvent + 55;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(DefaultAppOperatorImpl.onExtraCallback onextracallback, boolean z, String str, Function0 function0, Function1 function1, Function0 function02, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 29;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(onextracallback, z, str, function0, function1, function02, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onWarmupCompleted + 93;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, RVLogger.onWarmupCompleted onwarmupcompleted, InventoryAdManager inventoryAdManager, String str, InventoryAdDto inventoryAdDto, applyConfig applyconfig, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, boolean z, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function0 function0, Function1 function15, String str2, Function0 function02, Function1 function16, Function1 function17, Function1 function18, getBacktraceNote getbacktracenote, Function2 function2, Function1 function19, Function1 function110, Function1 function111, View view, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 111;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(quirksExternalSyntheticBackport0, onwarmupcompleted, inventoryAdManager, str, inventoryAdDto, applyconfig, camera2CameraMetadataExternalSyntheticLambda1, z, function1, function12, function13, function14, function0, function15, str2, function02, function16, function17, function18, getbacktracenote, function2, function19, function110, function111, view, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = onNavigationEvent + 29;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(RVLogger.onWarmupCompleted onwarmupcompleted, InventoryAdManager inventoryAdManager, String str, InventoryAdDto inventoryAdDto, applyConfig applyconfig, Function2 function2, Function1 function1, Function0 function0, Function1 function12, Function1 function13, Function1 function14, Function0 function02, Function1 function15, Function0 function03, Function0 function04, Function1 function16, Function0 function05, Function1 function17, Function0 function06, Function0 function07, Function1 function18, Function1 function19, Function1 function110, Function1 function111, getBacktraceNote getbacktracenote, Function2 function22, Function1 function112, Function1 function113, Function1 function114, Function1 function115, Function0 function08, Function1 function116, Function0 function09, Function0 function010, getBacktraceNote getbacktracenote2, Function1 function117, Function0 function011, int i, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) throws NoWhenBranchMatchedException {
        int i6 = 2 % 2;
        int i7 = onWarmupCompleted + 21;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        Unit unitOnExtraCallback = onExtraCallback(onwarmupcompleted, inventoryAdManager, str, inventoryAdDto, applyconfig, function2, function1, function0, function12, function13, function14, function02, function15, function03, function04, function16, function05, function17, function06, function07, function18, function19, function110, function111, getbacktracenote, function22, function112, function113, function114, function115, function08, function116, function09, function010, getbacktracenote2, function117, function011, i, i2, i3, i4, cameraCaptureResultEmptyCameraCaptureResult, i5);
        int i9 = onNavigationEvent + 45;
        onWarmupCompleted = i9 % 128;
        if (i9 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static final /* synthetic */ Function0 onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Function0<Unit> function0OnExtraCallbackWithResult = onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<? extends Function0<Unit>>) cameraPresenceProviderExternalSyntheticLambda6);
        int i4 = onWarmupCompleted + 97;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return function0OnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(Function0 function0, Function0 function02, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function0, function02, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult);
        int i4 = onNavigationEvent + 51;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ boolean onNavigationEvent(toStringArray tostringarray) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(tostringarray);
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
        int i5 = onNavigationEvent + 67;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return zOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) throws NoWhenBranchMatchedException {
        getTyroBlockTime gettyroblocktime = (getTyroBlockTime) objArr[0];
        RVLogger.onWarmupCompleted onwarmupcompleted = (RVLogger.onWarmupCompleted) objArr[1];
        InventoryAdManager inventoryAdManager = (InventoryAdManager) objArr[2];
        String str = (String) objArr[3];
        InventoryAdDto inventoryAdDto = (InventoryAdDto) objArr[4];
        Function1 function1 = (Function1) objArr[5];
        Function1 function12 = (Function1) objArr[6];
        Function1 function13 = (Function1) objArr[7];
        Function0 function0 = (Function0) objArr[8];
        Function1 function14 = (Function1) objArr[9];
        Function1 function15 = (Function1) objArr[10];
        Function1 function16 = (Function1) objArr[11];
        Function1 function17 = (Function1) objArr[12];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[13];
        Function2 function2 = (Function2) objArr[14];
        Function1 function18 = (Function1) objArr[15];
        Function1 function19 = (Function1) objArr[16];
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = (Camera2CameraMetadataExternalSyntheticLambda1) objArr[17];
        boolean zBooleanValue = ((Boolean) objArr[18]).booleanValue();
        Function1 function110 = (Function1) objArr[19];
        applyConfig applyconfig = (applyConfig) objArr[20];
        int iIntValue = ((Number) objArr[21]).intValue();
        r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult = (r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult) objArr[22];
        List list = (List) objArr[23];
        Function1 function111 = (Function1) objArr[24];
        String str2 = (String) objArr[25];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[26];
        int iIntValue2 = ((Number) objArr[27]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(gettyroblocktime, onwarmupcompleted, inventoryAdManager, str, inventoryAdDto, function1, function12, function13, function0, function14, function15, function16, function17, getbacktracenote, function2, function18, function19, camera2CameraMetadataExternalSyntheticLambda1, zBooleanValue, function110, applyconfig, iIntValue, onextracallbackwithresult, list, function111, str2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i4 = onWarmupCompleted + 119;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onRelationshipValidationResult(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
        int i4 = onWarmupCompleted + 17;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(zIAuthTabCallback);
        }
        int i5 = 93 / 0;
        return Boolean.valueOf(zIAuthTabCallback);
    }

    public static /* synthetic */ Unit onTransact(CashflowViewModel cashflowViewModel) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnUnminimized = onUnminimized(cashflowViewModel);
        int i4 = onNavigationEvent + 73;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnUnminimized;
        }
        throw null;
    }

    public static final /* synthetic */ long onWarmupCompleted(long j) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        long jOnNavigationEvent = onNavigationEvent(j);
        int i4 = onNavigationEvent + 31;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
        return jOnNavigationEvent;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        Function0 function02 = (Function0) objArr[2];
        isInVideoUsage isinvideousage = (isInVideoUsage) objArr[3];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        decrementVideoUsage decrementvideousageIAuthTabCallback = IAuthTabCallback(textFieldScrollKtExternalSyntheticLambda0, function0, function02, isinvideousage);
        int i4 = onNavigationEvent + 83;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return decrementvideousageIAuthTabCallback;
    }

    private static final Unit onWarmupCompleted(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 45;
        onNavigationEvent = i4 % 128;
        onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, i4 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CashflowViewModel cashflowViewModel) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnActivityResized = onActivityResized(cashflowViewModel);
        if (i3 == 0) {
            int i4 = 94 / 0;
        }
        int i5 = onWarmupCompleted + 115;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnActivityResized;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CashflowViewModel cashflowViewModel, String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            return (Unit) IAuthTabCallback(1715808164, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{cashflowViewModel, str}, iOnExtraCallbackWithResult, -1715808131, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        }
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(CashflowViewModel cashflowViewModel, Function1 function1, Function1 function12, Function2 function2, Function1 function13, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 59;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(cashflowViewModel, function1, function12, function2, function13, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted + 37;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(str);
        }
        onExtraCallback(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(Throwable th, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 45;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(-305695574, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{th, function0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 305695596, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i6 = onWarmupCompleted + 107;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, List list, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 55;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) IAuthTabCallback(204843267, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{function1, list, Integer.valueOf(i)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -204843266, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        int i5 = onWarmupCompleted + 111;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, RVLogger.onWarmupCompleted onwarmupcompleted, InventoryAdManager inventoryAdManager, String str, InventoryAdDto inventoryAdDto, applyConfig applyconfig, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, boolean z, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function0 function0, Function1 function15, String str2, Function0 function02, Function1 function16, Function1 function17, Function1 function18, getBacktraceNote getbacktracenote, Function2 function2, Function1 function19, Function1 function110, Function1 function111, View view, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 119;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        Unit unitAsInterface = asInterface(quirksExternalSyntheticBackport0, onwarmupcompleted, inventoryAdManager, str, inventoryAdDto, applyconfig, camera2CameraMetadataExternalSyntheticLambda1, z, function1, function12, function13, function14, function0, function15, str2, function02, function16, function17, function18, getbacktracenote, function2, function19, function110, function111, view, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = onNavigationEvent + 111;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 != 0) {
            return unitAsInterface;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(RVLogger.onWarmupCompleted onwarmupcompleted, Function1 function1, Function1 function12, Function0 function0, Function1 function13, Function0 function02, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 91;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(onwarmupcompleted, function1, function12, function0, function13, function02, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 19;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static final /* synthetic */ boolean onWarmupCompleted(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        boolean zBooleanValue = ((Boolean) IAuthTabCallback(-1098747541, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{camera2CameraMetadataExternalSyntheticLambda1}, iOnExtraCallbackWithResult, 1098747573, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())).booleanValue();
        int i4 = onNavigationEvent + 25;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        throw null;
    }

    public static /* synthetic */ boolean onWarmupCompleted(RVClientStarter rVClientStarter, YearMonth yearMonth) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(rVClientStarter, yearMonth);
        int i4 = onNavigationEvent + 19;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return zIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class asInterface implements decrementVideoUsage {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 onNavigationEvent;
        final /* synthetic */ LifecycleEventObserver onWarmupCompleted;

        public asInterface(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, LifecycleEventObserver lifecycleEventObserver) {
            this.onNavigationEvent = textFieldScrollKtExternalSyntheticLambda0;
            this.onWarmupCompleted = lifecycleEventObserver;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent.getLifecycle().onExtraCallbackWithResult(this.onWarmupCompleted);
            int i4 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final Unit onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onNavigationEvent + 81;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(str, "");
        int i3 = 69 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(String str, DefaultLoggerProxyImpl.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onTransact(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 33;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
        return unit;
    }

    static final /* synthetic */ class access100 extends FunctionReferenceImpl implements Function0<Unit> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        access100(Object obj) {
            super(0, obj, CashflowViewModel.class, "refreshOnResume", "refreshOnResume()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback();
            if (i3 != 0) {
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            Unit unit2 = Unit.INSTANCE;
            int i4 = onNavigationEvent + 71;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit2;
        }

        public final void onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 97;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                ((CashflowViewModel) ((CallableReference) this).receiver).access000();
                int i3 = 46 / 0;
            } else {
                ((CashflowViewModel) ((CallableReference) this).receiver).access000();
            }
            int i4 = onWarmupCompleted + 87;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 58 / 0;
            }
        }
    }

    private static final Unit onPostMessage(CashflowViewModel cashflowViewModel) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        cashflowViewModel.readTypedObject();
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 47;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    static final class IAuthTabCallback_Parcel extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ CashflowViewModel $vm;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback_Parcel(CashflowViewModel cashflowViewModel, access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(2, access13800Var);
            this.$vm = cashflowViewModel;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback_Parcel iAuthTabCallback_Parcel = new IAuthTabCallback_Parcel(this.$vm, access13800Var);
            int i2 = onNavigationEvent + 29;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 79 / 0;
            }
            return iAuthTabCallback_Parcel;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 7;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 5;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 49;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i2 + 95;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            CashflowViewModel cashflowViewModel = this.$vm;
            if (i6 != 0) {
                cashflowViewModel.onNavigationEvent();
                return Unit.INSTANCE;
            }
            cashflowViewModel.onNavigationEvent();
            Unit unit = Unit.INSTANCE;
            throw null;
        }
    }

    static final class getInterfaceDescriptor extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ CashflowViewModel $vm;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        getInterfaceDescriptor(CashflowViewModel cashflowViewModel, access13800<? super getInterfaceDescriptor> access13800Var) {
            super(2, access13800Var);
            this.$vm = cashflowViewModel;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            getInterfaceDescriptor getinterfacedescriptor = new getInterfaceDescriptor(this.$vm, access13800Var);
            int i2 = onNavigationEvent + 89;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return getinterfacedescriptor;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 67;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 37;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 51 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            getInterfaceDescriptor getinterfacedescriptorCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                getinterfacedescriptorCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = getinterfacedescriptorCreate.invokeSuspend(unit);
            int i4 = onNavigationEvent + 109;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 11;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i2 + 91;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            this.$vm.onNavigationEvent();
            Unit unit = Unit.INSTANCE;
            if (i6 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i7 = onWarmupCompleted + 63;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return unit;
        }
    }

    private static final Unit getInterfaceDescriptor(CashflowViewModel cashflowViewModel) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        cashflowViewModel.IAuthTabCallback_Parcel();
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        throw null;
    }

    static final class access000 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ zzdt $inventoryAdSpaceId;
        final /* synthetic */ DefaultLoggerProxyImpl.onNavigationEvent $inventoryItem;
        final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 $lifecycleOwner;
        final /* synthetic */ RVLogger $s;
        final /* synthetic */ CashflowViewModel $vm;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access000(DefaultLoggerProxyImpl.onNavigationEvent onnavigationevent, zzdt zzdtVar, CashflowViewModel cashflowViewModel, RVLogger rVLogger, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, access13800<? super access000> access13800Var) {
            super(2, access13800Var);
            this.$inventoryItem = onnavigationevent;
            this.$inventoryAdSpaceId = zzdtVar;
            this.$vm = cashflowViewModel;
            this.$s = rVLogger;
            this.$lifecycleOwner = textFieldScrollKtExternalSyntheticLambda0;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access000 access000Var = new access000(this.$inventoryItem, this.$inventoryAdSpaceId, this.$vm, this.$s, this.$lifecycleOwner, access13800Var);
            int i2 = IAuthTabCallback + 91;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return access000Var;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 29;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 55;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            TriggerDto triggerDto;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 63;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = i2 + 23;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i5 == 0) {
                int i6 = 62 / 0;
                if (this.$inventoryItem != null) {
                    if (this.$inventoryAdSpaceId == null) {
                        this.$vm.onNavigationEvent();
                    } else if (this.$s.extraCallbackWithResult()) {
                        InventoryAdManager.onWarmupCompleted(this.$vm.IAuthTabCallback(), this.$lifecycleOwner, this.$inventoryAdSpaceId, zzm.INVENTORY_AD_BANNER, (InventoryAdManager.IAuthTabCallback) null, (Map) null, (ViewGroup) null, (InventoryAdManager.onExtraCallbackWithResult) null, 120, (Object) null);
                        CashflowViewModel cashflowViewModel = this.$vm;
                        DefaultLoggerProxyImpl.onNavigationEvent onnavigationevent = this.$inventoryItem;
                        zzdt zzdtVar = this.$inventoryAdSpaceId;
                        if (this.$s.IAuthTabCallback_Parcel() == toStringArray.PullToRefresh) {
                            triggerDto = TriggerDto.PTR;
                        } else {
                            triggerDto = TriggerDto.OPEN;
                        }
                        cashflowViewModel.onExtraCallbackWithResult(onnavigationevent, zzdtVar, triggerDto);
                    }
                }
            } else if (this.$inventoryItem != null) {
            }
            Unit unit = Unit.INSTANCE;
            int i7 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return unit;
        }
    }

    private static final Unit onWarmupCompleted(CashflowViewModel cashflowViewModel, YearMonth yearMonth, String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(yearMonth, "");
        Intrinsics.checkNotNullParameter(str, "");
        cashflowViewModel.onWarmupCompleted(yearMonth, str);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 117;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 74 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(CashflowViewModel cashflowViewModel, String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            cashflowViewModel.onExtraCallback(str);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(str, "");
        cashflowViewModel.onExtraCallback(str);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit access000(CashflowViewModel cashflowViewModel) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            CashflowViewModel.onExtraCallbackWithResult(iOnExtraCallback2, iOnExtraCallback, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -2044858710, iOnExtraCallback3, 2044858736, new Object[]{cashflowViewModel});
            return Unit.INSTANCE;
        }
        int iOnExtraCallback4 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback5 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback6 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        CashflowViewModel.onExtraCallbackWithResult(iOnExtraCallback5, iOnExtraCallback4, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -2044858710, iOnExtraCallback6, 2044858736, new Object[]{cashflowViewModel});
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(CashflowViewModel cashflowViewModel, LocalDate localDate) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(localDate, "");
            cashflowViewModel.onExtraCallback(localDate);
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(localDate, "");
        cashflowViewModel.onExtraCallback(localDate);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onNavigationEvent + 109;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(CashflowViewModel cashflowViewModel, LocalDate localDate) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(localDate, "");
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        CashflowViewModel.onExtraCallbackWithResult(iOnExtraCallback2, iOnExtraCallback, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1739912646, iOnExtraCallback3, -1739912627, new Object[]{cashflowViewModel, localDate});
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 19;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit asInterface(CashflowViewModel cashflowViewModel, LocalDate localDate) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(localDate, "");
            cashflowViewModel.onNavigationEvent(localDate);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(localDate, "");
        cashflowViewModel.onNavigationEvent(localDate);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit writeTypedObject(CashflowViewModel cashflowViewModel) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        cashflowViewModel.access100();
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 29;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CashflowViewModel cashflowViewModel = (CashflowViewModel) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        cashflowViewModel.IAuthTabCallback(iIntValue);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 37;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit ICustomTabsCallback(CashflowViewModel cashflowViewModel) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        cashflowViewModel.asBinder();
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 107;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
        return unit;
    }

    private static final Unit extraCallback(CashflowViewModel cashflowViewModel) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        cashflowViewModel.onTransact();
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 47;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(CashflowViewModel cashflowViewModel, YearMonth yearMonth) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(yearMonth, "");
        cashflowViewModel.onExtraCallbackWithResult(yearMonth);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 125;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit extraCallbackWithResult(CashflowViewModel cashflowViewModel) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        cashflowViewModel.ICustomTabsCallback();
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
        int i5 = onWarmupCompleted + 79;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit asInterface(CashflowViewModel cashflowViewModel, String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        cashflowViewModel.onWarmupCompleted(str);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 31;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit readTypedObject(CashflowViewModel cashflowViewModel) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        cashflowViewModel.IAuthTabCallbackStubProxy();
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onActivityResized(CashflowViewModel cashflowViewModel) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        cashflowViewModel.getInterfaceDescriptor();
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        Unit unit;
        CashflowViewModel cashflowViewModel = (CashflowViewModel) objArr[0];
        debug debugVar = (debug) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(debugVar, "");
            cashflowViewModel.IAuthTabCallback(debugVar);
            unit = Unit.INSTANCE;
            int i3 = 47 / 0;
        } else {
            Intrinsics.checkNotNullParameter(debugVar, "");
            cashflowViewModel.IAuthTabCallback(debugVar);
            unit = Unit.INSTANCE;
        }
        int i4 = onWarmupCompleted + 21;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit asBinder(CashflowViewModel cashflowViewModel, String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        cashflowViewModel.IAuthTabCallbackStub(str);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 11;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(CashflowViewModel cashflowViewModel, DefaultLoggerProxyImpl.IAuthTabCallback iAuthTabCallback, RVLogger rVLogger, Function1 function1) {
        String strOnWarmupCompleted;
        String strIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            cashflowViewModel.onExtraCallback(iAuthTabCallback);
            String strAsBinder = iAuthTabCallback.asBinder();
            if (strAsBinder != null && (strOnWarmupCompleted = cashflowViewModel.asInterface().onWarmupCompleted(strAsBinder)) != null && (strIAuthTabCallback = deprecated.IAuthTabCallback(strOnWarmupCompleted, ((RVLogger.onWarmupCompleted) rVLogger).IAuthTabCallbackStub())) != null) {
                int i3 = onWarmupCompleted + 93;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    function1.invoke(strIAuthTabCallback);
                    int i4 = 4 / 0;
                } else {
                    function1.invoke(strIAuthTabCallback);
                }
            }
            return Unit.INSTANCE;
        }
        cashflowViewModel.onExtraCallback(iAuthTabCallback);
        iAuthTabCallback.asBinder();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ImageLoaderBuilderExternalSyntheticLambda6 imageLoaderBuilderExternalSyntheticLambda6 = (ImageLoaderBuilderExternalSyntheticLambda6) objArr[0];
        CashflowViewModel cashflowViewModel = (CashflowViewModel) objArr[1];
        RVLogger rVLogger = (RVLogger) objArr[2];
        Function1 function1 = (Function1) objArr[3];
        DefaultLoggerProxyImpl.IAuthTabCallback iAuthTabCallback = (DefaultLoggerProxyImpl.IAuthTabCallback) objArr[4];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        imageLoaderBuilderExternalSyntheticLambda6.onWarmupCompleted(new CashflowScreenKt$.ExternalSyntheticLambda70(cashflowViewModel, iAuthTabCallback, rVLogger, function1));
        Unit unit = Unit.INSTANCE;
        int i2 = onNavigationEvent + 51;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object isEngagementSignalsApiAvailable(Object[] objArr) {
        CashflowViewModel cashflowViewModel = (CashflowViewModel) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        DefaultLoggerProxyImpl.onExtraCallbackWithResult onextracallbackwithresult = (DefaultLoggerProxyImpl.onExtraCallbackWithResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        String str = (String) objArr[4];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            cashflowViewModel.onExtraCallbackWithResult(onextracallbackwithresult, iIntValue);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        cashflowViewModel.onExtraCallbackWithResult(onextracallbackwithresult, iIntValue);
        if (str != null) {
            int i3 = onNavigationEvent + 123;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                function1.invoke(str);
                int i4 = 51 / 0;
            } else {
                function1.invoke(str);
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(CashflowViewModel cashflowViewModel, DefaultLoggerProxyImpl.onExtraCallbackWithResult onextracallbackwithresult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 109;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            cashflowViewModel.onWarmupCompleted(onextracallbackwithresult);
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        cashflowViewModel.onWarmupCompleted(onextracallbackwithresult);
        Unit unit2 = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 73;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit2;
    }

    private static final Unit IAuthTabCallbackDefault(CashflowViewModel cashflowViewModel, String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        cashflowViewModel.IAuthTabCallback(str);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 53;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(CashflowViewModel cashflowViewModel, CommonAppExitExtension commonAppExitExtension) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(commonAppExitExtension, "");
            cashflowViewModel.IAuthTabCallback(commonAppExitExtension);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(commonAppExitExtension, "");
        cashflowViewModel.IAuthTabCallback(commonAppExitExtension);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(CashflowViewModel cashflowViewModel, CommonAppExitExtension commonAppExitExtension) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(commonAppExitExtension, "");
            cashflowViewModel.onExtraCallback(commonAppExitExtension);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(commonAppExitExtension, "");
        cashflowViewModel.onExtraCallback(commonAppExitExtension);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        CashflowViewModel cashflowViewModel = (CashflowViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        cashflowViewModel.extraCallbackWithResult();
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        return unit;
    }

    private static final Unit onNavigationEvent(CashflowViewModel cashflowViewModel, DefaultLoggerProxyImpl.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        cashflowViewModel.IAuthTabCallback(iAuthTabCallback);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 23;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        CashflowViewModel cashflowViewModel = (CashflowViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        cashflowViewModel.writeTypedObject();
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 37;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onMinimized(CashflowViewModel cashflowViewModel) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        cashflowViewModel.onWarmupCompleted();
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            int i4 = 68 / 0;
        }
        int i5 = onWarmupCompleted + 59;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 75 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(CashflowViewModel cashflowViewModel, Function2 function2, String str, String str2, DefaultLoggerProxyImpl.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        CashflowViewModel.onExtraCallbackWithResult(iOnExtraCallback2, iOnExtraCallback, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1553828085, iOnExtraCallback3, -1553828068, new Object[]{cashflowViewModel, str});
        function2.invoke(str2, iAuthTabCallback);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 47;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onUnminimized(CashflowViewModel cashflowViewModel) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        cashflowViewModel.onExtraCallback();
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent + 125;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x083e  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@Nullable CashflowViewModel cashflowViewModel, @Nullable Function1<? super String, Unit> function1, @Nullable Function1<? super String, Unit> function12, @Nullable Function2<? super String, ? super DefaultLoggerProxyImpl.IAuthTabCallback, Unit> function2, @Nullable Function1<? super String, Unit> function13, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        CashflowViewModel cashflowViewModel2;
        int i3;
        Function1<? super String, Unit> function14;
        Function1<? super String, Unit> function15;
        Function2<? super String, ? super DefaultLoggerProxyImpl.IAuthTabCallback, Unit> function22;
        int i4;
        Function1<? super String, Unit> function16;
        boolean z;
        CashflowViewModel cashflowViewModel3;
        Function1<? super String, Unit> function17;
        Function2<? super String, ? super DefaultLoggerProxyImpl.IAuthTabCallback, Unit> function23;
        Function1<? super String, Unit> function18;
        int i5;
        CashflowViewModel cashflowViewModel4;
        Function1<? super String, Unit> function19;
        Function2<? super String, ? super DefaultLoggerProxyImpl.IAuthTabCallback, Unit> function24;
        Function1<? super String, Unit> function110;
        int i6;
        CashflowViewModel cashflowViewModel5;
        Function2<? super String, ? super DefaultLoggerProxyImpl.IAuthTabCallback, Unit> function25;
        Function1<? super String, Unit> function111;
        Function1<? super String, Unit> function112;
        AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback defaultViewModelCreationExtras;
        Function1<? super String, Unit> function113;
        Function1 function114;
        boolean zOnExtraCallback;
        Function0 function0;
        Object obj;
        boolean zOnExtraCallback2;
        Function1 function115;
        boolean z2;
        Object obj2;
        boolean zOnExtraCallback3;
        Function0 function02;
        Object obj3;
        boolean zOnExtraCallback4;
        Function1 function116;
        boolean z3;
        Function2<? super String, ? super DefaultLoggerProxyImpl.IAuthTabCallback, Unit> function26;
        Object obj4;
        Function2<? super String, ? super DefaultLoggerProxyImpl.IAuthTabCallback, Unit> function27;
        Function1<? super String, Unit> function117;
        int i7;
        int i8 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1849014204);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                cashflowViewModel2 = cashflowViewModel;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel2)) {
                    i7 = 4;
                }
                i3 = i7 | i;
            } else {
                cashflowViewModel2 = cashflowViewModel;
            }
            i7 = 2;
            i3 = i7 | i;
        } else {
            cashflowViewModel2 = cashflowViewModel;
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
            function14 = function1;
        } else {
            function14 = function1;
            if ((i & 48) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function14) ? 32 : 16;
            }
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
            function15 = function12;
        } else {
            function15 = function12;
            if ((i & 384) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function15) ? 256 : 128;
            }
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
            function22 = function2;
        } else {
            function22 = function2;
            if ((i & 3072) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function22)) {
                    int i12 = onNavigationEvent + 121;
                    onWarmupCompleted = i12 % 128;
                    int i13 = i12 % 2;
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
        }
        int i14 = i2 & 16;
        if (i14 != 0) {
            i3 |= 24576;
            function16 = function13;
        } else {
            function16 = function13;
            if ((i & 24576) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function16) ? 16384 : 8192;
            }
        }
        if ((i3 & 9363) != 9362) {
            int i15 = onWarmupCompleted + 83;
            onNavigationEvent = i15 % 128;
            z = i15 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                if ((i2 & 1) != 0) {
                    TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                    if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    int i16 = onWarmupCompleted + 121;
                    onNavigationEvent = i16 % 128;
                    if (i16 % 2 != 0) {
                        int i17 = 14 / 0;
                        defaultViewModelCreationExtras = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6 ? textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent.getDefaultViewModelCreationExtras() : AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult;
                    } else if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                    }
                    cashflowViewModel4 = (CashflowViewModel) DefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda11.onExtraCallback(Reflection.getOrCreateKotlinClass(CashflowViewModel.class), textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent, (String) null, (ViewModelProvider.onWarmupCompleted) null, defaultViewModelCreationExtras, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0);
                    i3 &= -15;
                    i5 = 0;
                } else {
                    i5 = 0;
                    cashflowViewModel4 = cashflowViewModel;
                }
                if (i9 != 0) {
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new CashflowScreenKt$.ExternalSyntheticLambda5();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    function14 = (Function1) objOnMinimized;
                }
                if (i10 != 0) {
                    int i18 = onWarmupCompleted + 7;
                    onNavigationEvent = i18 % 128;
                    int i19 = i18 % 2;
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized2 = new CashflowScreenKt$.ExternalSyntheticLambda16();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                    }
                    function19 = (Function1) objOnMinimized2;
                } else {
                    function19 = function12;
                }
                if (i11 != 0) {
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized3 = new CashflowScreenKt$.ExternalSyntheticLambda27();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                    }
                    function24 = (Function2) objOnMinimized3;
                } else {
                    function24 = function2;
                }
                if (i14 != 0) {
                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized4 = new CashflowScreenKt$.ExternalSyntheticLambda35();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                    }
                    i6 = i3;
                    cashflowViewModel5 = cashflowViewModel4;
                    function25 = function24;
                    function110 = (Function1) objOnMinimized4;
                } else {
                    function110 = function13;
                    i6 = i3;
                    cashflowViewModel5 = cashflowViewModel4;
                    function25 = function24;
                }
                Function1<? super String, Unit> function118 = function14;
                function111 = function19;
                function112 = function118;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                i6 = i3;
                function110 = function16;
                function112 = function14;
                cashflowViewModel5 = cashflowViewModel2;
                function111 = function15;
                i5 = 0;
                function25 = function22;
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1849014204, i6, -1, "im.toss.features.home.feature.cashflow.screen.CashflowScreen (CashflowScreen.kt:116)");
            }
            boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!zOnExtraCallback5) {
                int i20 = onWarmupCompleted + 39;
                onNavigationEvent = i20 % 128;
                if (i20 % 2 != 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    throw null;
                }
                if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized5 = new CashflowScreenKt$.ExternalSyntheticLambda36(cashflowViewModel5);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                }
                RealImageLoaderKt.IAuthTabCallback(new Object[]{(Function0) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i5)}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1641337170, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1641337169);
                boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnExtraCallback6 || objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized6 = new access100(cashflowViewModel5);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                }
                int iOrdinal = -1;
                int i21 = i6;
                Function2<? super String, ? super DefaultLoggerProxyImpl.IAuthTabCallback, Unit> function28 = function25;
                disableEncrypt.onNavigationEvent(0L, (Function0) null, (access5300) objOnMinimized6, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 3);
                Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized7 = new ImageLoaderBuilderExternalSyntheticLambda6(0L, 1, (DefaultConstructorMarker) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized7);
                }
                ImageLoaderBuilderExternalSyntheticLambda6 imageLoaderBuilderExternalSyntheticLambda6 = (ImageLoaderBuilderExternalSyntheticLambda6) objOnMinimized7;
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(cashflowViewModel5.IAuthTabCallbackStub(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2 = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(cashflowViewModel5.IAuthTabCallbackDefault(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda1.IAuthTabCallback());
                RVLogger.onNavigationEvent onnavigationeventIAuthTabCallback = IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<? extends RVLogger>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                if (onnavigationeventIAuthTabCallback instanceof RVLogger.onExtraCallback) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1027317284);
                    Unit unit = Unit.INSTANCE;
                    boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                    Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnExtraCallback7 || objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized8 = new IAuthTabCallback_Parcel(cashflowViewModel5, null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized8);
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized8, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                    onExtraCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i5);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else if (onnavigationeventIAuthTabCallback instanceof RVLogger.onNavigationEvent) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1027452289);
                    Unit unit2 = Unit.INSTANCE;
                    boolean zOnExtraCallback8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                    Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!(!zOnExtraCallback8) || objOnMinimized9 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized9 = new getInterfaceDescriptor(cashflowViewModel5, null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized9);
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(unit2, (Function2) objOnMinimized9, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                    Throwable thOnExtraCallback = onnavigationeventIAuthTabCallback.onExtraCallback();
                    boolean zOnExtraCallback9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                    Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnExtraCallback9 || objOnMinimized10 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized10 = new CashflowScreenKt$.ExternalSyntheticLambda37(cashflowViewModel5);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized10);
                    }
                    IAuthTabCallback(-305695574, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{thOnExtraCallback, (Function0) objOnMinimized10, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i5)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 305695596, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    if (!(onnavigationeventIAuthTabCallback instanceof RVLogger.onWarmupCompleted)) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1213783381);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        throw new NoWhenBranchMatchedException();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1027774317);
                    RVLogger.onWarmupCompleted onwarmupcompleted2 = (RVLogger.onWarmupCompleted) onnavigationeventIAuthTabCallback;
                    List list = (List) RVLogger.onWarmupCompleted.onWarmupCompleted(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 915695779, -915695779, new Object[]{onwarmupcompleted2}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
                    String strIAuthTabCallbackStub = onwarmupcompleted2.IAuthTabCallbackStub();
                    Map mapIAuthTabCallback = onwarmupcompleted2.IAuthTabCallback();
                    boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list);
                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strIAuthTabCallbackStub);
                    boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(mapIAuthTabCallback);
                    Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if ((zOnNavigationEvent | zOnNavigationEvent2 | zOnNavigationEvent3) || objOnMinimized11 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized11 = getStringDefault.onExtraCallbackWithResult(onwarmupcompleted2);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized11);
                    }
                    DefaultLoggerProxyImpl.onNavigationEvent onnavigationevent = (DefaultLoggerProxyImpl.onNavigationEvent) objOnMinimized11;
                    boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onnavigationevent);
                    Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnNavigationEvent4 || objOnMinimized12 == onwarmupcompleted.onExtraCallback()) {
                        zzdt zzdtVarOnNavigationEvent = onnavigationevent != null ? getStringDefault.onNavigationEvent(onnavigationevent) : null;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(zzdtVarOnNavigationEvent);
                        objOnMinimized12 = zzdtVarOnNavigationEvent;
                    }
                    zzdt zzdtVar = (zzdt) objOnMinimized12;
                    Object[] objArr = {textFieldScrollKtExternalSyntheticLambda0, onnavigationevent, zzdtVar, Boolean.valueOf(onwarmupcompleted2.extraCallbackWithResult())};
                    boolean zOnExtraCallback10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onnavigationevent);
                    if (zzdtVar != null) {
                        iOrdinal = zzdtVar.ordinal();
                    }
                    boolean zOnExtraCallback11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOrdinal);
                    boolean zOnExtraCallback12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                    boolean zOnExtraCallback13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onnavigationeventIAuthTabCallback);
                    boolean zOnExtraCallback14 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0);
                    Object objOnMinimized13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if ((zOnExtraCallback11 | zOnExtraCallback10 | zOnExtraCallback12 | zOnExtraCallback13 | zOnExtraCallback14) || objOnMinimized13 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized13 = new access000(onnavigationevent, zzdtVar, cashflowViewModel5, onnavigationeventIAuthTabCallback, textFieldScrollKtExternalSyntheticLambda0, null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized13);
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(objArr, (Function2) objOnMinimized13, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    InventoryAdManager inventoryAdManagerIAuthTabCallback = cashflowViewModel5.IAuthTabCallback();
                    mergeJsonWhitoutRecursive mergejsonwhitoutrecursive = (mergeJsonWhitoutRecursive) IAuthTabCallback(1770505342, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1770505331, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
                    String strOnNavigationEvent = mergejsonwhitoutrecursive != null ? mergejsonwhitoutrecursive.onNavigationEvent() : null;
                    mergeJsonWhitoutRecursive mergejsonwhitoutrecursive2 = (mergeJsonWhitoutRecursive) IAuthTabCallback(1770505342, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1770505331, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
                    InventoryAdDto inventoryAdDtoOnExtraCallbackWithResult = mergejsonwhitoutrecursive2 != null ? mergejsonwhitoutrecursive2.onExtraCallbackWithResult() : null;
                    applyConfig applyconfigAsInterface = cashflowViewModel5.asInterface();
                    boolean zOnExtraCallback15 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                    Object objOnMinimized14 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnExtraCallback15 || objOnMinimized14 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized14 = new CashflowScreenKt$.ExternalSyntheticLambda38(cashflowViewModel5);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized14);
                    }
                    Function2 function29 = (Function2) objOnMinimized14;
                    boolean zOnExtraCallback16 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                    Object objOnMinimized15 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnExtraCallback16 || objOnMinimized15 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized15 = new CashflowScreenKt$.ExternalSyntheticLambda39(cashflowViewModel5);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized15);
                    }
                    Function1 function119 = (Function1) objOnMinimized15;
                    boolean zOnExtraCallback17 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                    Object objOnMinimized16 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnExtraCallback17 || objOnMinimized16 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized16 = new CashflowScreenKt$.ExternalSyntheticLambda40(cashflowViewModel5);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized16);
                    }
                    Function0 function03 = (Function0) objOnMinimized16;
                    boolean zOnExtraCallback18 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                    Object objOnMinimized17 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnExtraCallback18 || objOnMinimized17 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized17 = new CashflowScreenKt$.ExternalSyntheticLambda41(cashflowViewModel5);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized17);
                    }
                    Function1 function120 = (Function1) objOnMinimized17;
                    boolean zOnExtraCallback19 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                    Object objOnMinimized18 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnExtraCallback19 || objOnMinimized18 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized18 = new CashflowScreenKt$.ExternalSyntheticLambda6(cashflowViewModel5);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized18);
                    }
                    Function1 function121 = (Function1) objOnMinimized18;
                    boolean zOnExtraCallback20 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                    function113 = function112;
                    Object objOnMinimized19 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnExtraCallback20 || objOnMinimized19 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized19 = new CashflowScreenKt$.ExternalSyntheticLambda7(cashflowViewModel5);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized19);
                    }
                    Function1 function122 = (Function1) objOnMinimized19;
                    boolean zOnExtraCallback21 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                    Object objOnMinimized20 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnExtraCallback21) {
                        function114 = function121;
                    } else {
                        int i22 = onWarmupCompleted + 125;
                        function114 = function121;
                        onNavigationEvent = i22 % 128;
                        int i23 = i22 % 2;
                        if (objOnMinimized20 == onwarmupcompleted.onExtraCallback()) {
                        }
                        Function0 function04 = (Function0) objOnMinimized20;
                        zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                        Object objOnMinimized21 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (zOnExtraCallback) {
                            Object obj5 = objOnMinimized21;
                            if (objOnMinimized21 == onwarmupcompleted.onExtraCallback()) {
                                CashflowScreenKt$.ExternalSyntheticLambda9 externalSyntheticLambda9 = new CashflowScreenKt$.ExternalSyntheticLambda9(cashflowViewModel5);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda9);
                                obj5 = externalSyntheticLambda9;
                            }
                            Function1 function123 = (Function1) obj5;
                            boolean zOnExtraCallback22 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                            Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (zOnExtraCallback22 || objOnMinimized22 == onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized22 = new CashflowScreenKt$.ExternalSyntheticLambda10(cashflowViewModel5);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized22);
                            }
                            Function0 function05 = (Function0) objOnMinimized22;
                            boolean zOnExtraCallback23 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                            Object objOnMinimized23 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!zOnExtraCallback23) {
                                Object obj6 = objOnMinimized23;
                                if (objOnMinimized23 == onwarmupcompleted.onExtraCallback()) {
                                    CashflowScreenKt$.ExternalSyntheticLambda11 externalSyntheticLambda11 = new CashflowScreenKt$.ExternalSyntheticLambda11(cashflowViewModel5);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda11);
                                    obj6 = externalSyntheticLambda11;
                                }
                                Function0 function06 = (Function0) obj6;
                                boolean zOnExtraCallback24 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                                Object objOnMinimized24 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (zOnExtraCallback24) {
                                    function0 = function04;
                                } else {
                                    int i24 = onNavigationEvent + 93;
                                    function0 = function04;
                                    onWarmupCompleted = i24 % 128;
                                    int i25 = i24 % 2;
                                    obj = objOnMinimized24;
                                    if (objOnMinimized24 == onwarmupcompleted.onExtraCallback()) {
                                    }
                                    Function1 function124 = (Function1) obj;
                                    zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                                    Object objOnMinimized25 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (zOnExtraCallback2) {
                                        int i26 = onNavigationEvent + 49;
                                        function115 = function124;
                                        onWarmupCompleted = i26 % 128;
                                        if (i26 % 2 == 0) {
                                            z2 = false;
                                            int i27 = 21 / 0;
                                            obj2 = objOnMinimized25;
                                            if (objOnMinimized25 == onwarmupcompleted.onExtraCallback()) {
                                            }
                                            Function0 function07 = (Function0) obj2;
                                            zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                                            Object objOnMinimized26 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            if (zOnExtraCallback3) {
                                                Object obj7 = objOnMinimized26;
                                                if (objOnMinimized26 == onwarmupcompleted.onExtraCallback()) {
                                                    CashflowScreenKt$.ExternalSyntheticLambda14 externalSyntheticLambda14 = new CashflowScreenKt$.ExternalSyntheticLambda14(cashflowViewModel5);
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda14);
                                                    obj7 = externalSyntheticLambda14;
                                                }
                                                Function1 function125 = (Function1) obj7;
                                                boolean zOnExtraCallback25 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                                                Object objOnMinimized27 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                if (!zOnExtraCallback25) {
                                                    Object obj8 = objOnMinimized27;
                                                    if (objOnMinimized27 == onwarmupcompleted.onExtraCallback()) {
                                                        CashflowScreenKt$.ExternalSyntheticLambda15 externalSyntheticLambda15 = new CashflowScreenKt$.ExternalSyntheticLambda15(cashflowViewModel5);
                                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda15);
                                                        obj8 = externalSyntheticLambda15;
                                                    }
                                                    Function0 function08 = (Function0) obj8;
                                                    boolean zOnExtraCallback26 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                                                    Object objOnMinimized28 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                    if (zOnExtraCallback26) {
                                                        function02 = function07;
                                                    } else {
                                                        int i28 = onNavigationEvent + 9;
                                                        function02 = function07;
                                                        onWarmupCompleted = i28 % 128;
                                                        int i29 = i28 % 2;
                                                        obj3 = objOnMinimized28;
                                                        if (objOnMinimized28 == onwarmupcompleted.onExtraCallback()) {
                                                        }
                                                        Function0 function09 = (Function0) obj3;
                                                        zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                                                        Object objOnMinimized29 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                        if (zOnExtraCallback4) {
                                                            Object obj9 = objOnMinimized29;
                                                            if (objOnMinimized29 == onwarmupcompleted.onExtraCallback()) {
                                                                CashflowScreenKt$.ExternalSyntheticLambda18 externalSyntheticLambda18 = new CashflowScreenKt$.ExternalSyntheticLambda18(cashflowViewModel5);
                                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda18);
                                                                obj9 = externalSyntheticLambda18;
                                                            }
                                                            Function1 function126 = (Function1) obj9;
                                                            boolean zOnExtraCallback27 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                                                            Object objOnMinimized30 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                            if (!zOnExtraCallback27) {
                                                                Object obj10 = objOnMinimized30;
                                                                if (objOnMinimized30 == onwarmupcompleted.onExtraCallback()) {
                                                                    CashflowScreenKt$.ExternalSyntheticLambda19 externalSyntheticLambda19 = new CashflowScreenKt$.ExternalSyntheticLambda19(cashflowViewModel5);
                                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda19);
                                                                    obj10 = externalSyntheticLambda19;
                                                                }
                                                                Function1 function127 = (Function1) obj10;
                                                                boolean zOnExtraCallback28 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(imageLoaderBuilderExternalSyntheticLambda6);
                                                                boolean zOnExtraCallback29 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                                                                boolean zOnExtraCallback30 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onnavigationeventIAuthTabCallback);
                                                                int i30 = i21 & 896;
                                                                if (i30 == 256) {
                                                                    function116 = function119;
                                                                    z3 = true;
                                                                } else {
                                                                    function116 = function119;
                                                                    z3 = z2;
                                                                }
                                                                Object objOnMinimized31 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                                if (!(zOnExtraCallback28 | zOnExtraCallback29 | zOnExtraCallback30 | z3)) {
                                                                    Object obj11 = objOnMinimized31;
                                                                    if (objOnMinimized31 == onwarmupcompleted.onExtraCallback()) {
                                                                        CashflowScreenKt$.ExternalSyntheticLambda20 externalSyntheticLambda20 = new CashflowScreenKt$.ExternalSyntheticLambda20(imageLoaderBuilderExternalSyntheticLambda6, cashflowViewModel5, onnavigationeventIAuthTabCallback, function111);
                                                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda20);
                                                                        obj11 = externalSyntheticLambda20;
                                                                    }
                                                                    Function1 function128 = (Function1) obj11;
                                                                    boolean zOnExtraCallback31 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                                                                    boolean z4 = i30 == 256 ? true : z2;
                                                                    Object objOnMinimized32 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                                    if (!(zOnExtraCallback31 | z4)) {
                                                                        Object obj12 = objOnMinimized32;
                                                                        if (objOnMinimized32 == onwarmupcompleted.onExtraCallback()) {
                                                                            CashflowScreenKt$.ExternalSyntheticLambda21 externalSyntheticLambda21 = new CashflowScreenKt$.ExternalSyntheticLambda21(cashflowViewModel5, function111);
                                                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda21);
                                                                            obj12 = externalSyntheticLambda21;
                                                                        }
                                                                        getBacktraceNote getbacktracenote = (getBacktraceNote) obj12;
                                                                        boolean zOnExtraCallback32 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                                                                        Object objOnMinimized33 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                                        if (!zOnExtraCallback32) {
                                                                            Object obj13 = objOnMinimized33;
                                                                            if (objOnMinimized33 == onwarmupcompleted.onExtraCallback()) {
                                                                                CashflowScreenKt$.ExternalSyntheticLambda22 externalSyntheticLambda22 = new CashflowScreenKt$.ExternalSyntheticLambda22(cashflowViewModel5);
                                                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda22);
                                                                                obj13 = externalSyntheticLambda22;
                                                                            }
                                                                            Function2 function210 = (Function2) obj13;
                                                                            boolean zOnExtraCallback33 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                                                                            Object objOnMinimized34 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                                            if (!zOnExtraCallback33) {
                                                                                Object obj14 = objOnMinimized34;
                                                                                if (objOnMinimized34 == onwarmupcompleted.onExtraCallback()) {
                                                                                    CashflowScreenKt$.ExternalSyntheticLambda23 externalSyntheticLambda23 = new CashflowScreenKt$.ExternalSyntheticLambda23(cashflowViewModel5);
                                                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda23);
                                                                                    obj14 = externalSyntheticLambda23;
                                                                                }
                                                                                Function1 function129 = (Function1) obj14;
                                                                                boolean zOnExtraCallback34 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                                                                                Object objOnMinimized35 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                                                if (!zOnExtraCallback34) {
                                                                                    Object obj15 = objOnMinimized35;
                                                                                    if (objOnMinimized35 == onwarmupcompleted.onExtraCallback()) {
                                                                                        CashflowScreenKt$.ExternalSyntheticLambda24 externalSyntheticLambda24 = new CashflowScreenKt$.ExternalSyntheticLambda24(cashflowViewModel5);
                                                                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda24);
                                                                                        obj15 = externalSyntheticLambda24;
                                                                                    }
                                                                                    Function1 function130 = (Function1) obj15;
                                                                                    boolean zOnExtraCallback35 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                                                                                    Object objOnMinimized36 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                                                    if (!zOnExtraCallback35) {
                                                                                        Object obj16 = objOnMinimized36;
                                                                                        if (objOnMinimized36 == onwarmupcompleted.onExtraCallback()) {
                                                                                            CashflowScreenKt$.ExternalSyntheticLambda25 externalSyntheticLambda25 = new CashflowScreenKt$.ExternalSyntheticLambda25(cashflowViewModel5);
                                                                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda25);
                                                                                            obj16 = externalSyntheticLambda25;
                                                                                        }
                                                                                        Function1 function131 = (Function1) obj16;
                                                                                        boolean zOnExtraCallback36 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                                                                                        Object objOnMinimized37 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                                                        if (!zOnExtraCallback36) {
                                                                                            Object obj17 = objOnMinimized37;
                                                                                            if (objOnMinimized37 == onwarmupcompleted.onExtraCallback()) {
                                                                                                CashflowScreenKt$.ExternalSyntheticLambda26 externalSyntheticLambda26 = new CashflowScreenKt$.ExternalSyntheticLambda26(cashflowViewModel5);
                                                                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda26);
                                                                                                obj17 = externalSyntheticLambda26;
                                                                                            }
                                                                                            Function1 function132 = (Function1) obj17;
                                                                                            boolean zOnExtraCallback37 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                                                                                            Object objOnMinimized38 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                                                            if (!zOnExtraCallback37) {
                                                                                                Object obj18 = objOnMinimized38;
                                                                                                if (objOnMinimized38 == onwarmupcompleted.onExtraCallback()) {
                                                                                                    CashflowScreenKt$.ExternalSyntheticLambda28 externalSyntheticLambda28 = new CashflowScreenKt$.ExternalSyntheticLambda28(cashflowViewModel5);
                                                                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda28);
                                                                                                    obj18 = externalSyntheticLambda28;
                                                                                                }
                                                                                                Function0 function010 = (Function0) obj18;
                                                                                                boolean zOnExtraCallback38 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                                                                                                Object objOnMinimized39 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                                                                if (!zOnExtraCallback38) {
                                                                                                    Object obj19 = objOnMinimized39;
                                                                                                    if (objOnMinimized39 == onwarmupcompleted.onExtraCallback()) {
                                                                                                        CashflowScreenKt$.ExternalSyntheticLambda29 externalSyntheticLambda29 = new CashflowScreenKt$.ExternalSyntheticLambda29(cashflowViewModel5);
                                                                                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda29);
                                                                                                        obj19 = externalSyntheticLambda29;
                                                                                                    }
                                                                                                    Function1 function133 = (Function1) obj19;
                                                                                                    boolean zOnExtraCallback39 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                                                                                                    Object objOnMinimized40 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                                                                    if (!zOnExtraCallback39) {
                                                                                                        Object obj20 = objOnMinimized40;
                                                                                                        if (objOnMinimized40 == onwarmupcompleted.onExtraCallback()) {
                                                                                                            CashflowScreenKt$.ExternalSyntheticLambda30 externalSyntheticLambda30 = new CashflowScreenKt$.ExternalSyntheticLambda30(cashflowViewModel5);
                                                                                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda30);
                                                                                                            obj20 = externalSyntheticLambda30;
                                                                                                        }
                                                                                                        Function0 function011 = (Function0) obj20;
                                                                                                        boolean zOnExtraCallback40 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                                                                                                        Object objOnMinimized41 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                                                                        if (!zOnExtraCallback40) {
                                                                                                            int i31 = onNavigationEvent + 103;
                                                                                                            onWarmupCompleted = i31 % 128;
                                                                                                            if (i31 % 2 == 0) {
                                                                                                                onwarmupcompleted.onExtraCallback();
                                                                                                                throw null;
                                                                                                            }
                                                                                                            Object obj21 = objOnMinimized41;
                                                                                                            if (objOnMinimized41 == onwarmupcompleted.onExtraCallback()) {
                                                                                                                CashflowScreenKt$.ExternalSyntheticLambda31 externalSyntheticLambda31 = new CashflowScreenKt$.ExternalSyntheticLambda31(cashflowViewModel5);
                                                                                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda31);
                                                                                                                obj21 = externalSyntheticLambda31;
                                                                                                            }
                                                                                                            Function0 function012 = (Function0) obj21;
                                                                                                            boolean zOnExtraCallback41 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                                                                                                            boolean z5 = (i21 & 7168) == 2048 ? true : z2;
                                                                                                            Object objOnMinimized42 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                                                                            if ((zOnExtraCallback41 || z5) || objOnMinimized42 == onwarmupcompleted.onExtraCallback()) {
                                                                                                                function26 = function28;
                                                                                                                CashflowScreenKt$.ExternalSyntheticLambda32 externalSyntheticLambda32 = new CashflowScreenKt$.ExternalSyntheticLambda32(cashflowViewModel5, function26);
                                                                                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda32);
                                                                                                                obj4 = externalSyntheticLambda32;
                                                                                                            } else {
                                                                                                                function26 = function28;
                                                                                                                obj4 = objOnMinimized42;
                                                                                                            }
                                                                                                            getBacktraceNote getbacktracenote2 = (getBacktraceNote) obj4;
                                                                                                            boolean zOnExtraCallback42 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                                                                                                            Object objOnMinimized43 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                                                                            if (!zOnExtraCallback42) {
                                                                                                                Object obj22 = objOnMinimized43;
                                                                                                                if (objOnMinimized43 == onwarmupcompleted.onExtraCallback()) {
                                                                                                                    CashflowScreenKt$.ExternalSyntheticLambda33 externalSyntheticLambda33 = new CashflowScreenKt$.ExternalSyntheticLambda33(cashflowViewModel5);
                                                                                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda33);
                                                                                                                    obj22 = externalSyntheticLambda33;
                                                                                                                }
                                                                                                                function27 = function26;
                                                                                                                function117 = function111;
                                                                                                                onExtraCallbackWithResult(onwarmupcompleted2, inventoryAdManagerIAuthTabCallback, strOnNavigationEvent, inventoryAdDtoOnExtraCallbackWithResult, applyconfigAsInterface, function29, function116, function03, function120, function114, function122, function0, function123, function05, function06, function115, function02, function125, function08, function09, function126, function113, function127, function128, getbacktracenote, function210, function129, function130, function131, function132, function010, function133, function011, function012, getbacktracenote2, function110, (Function0) obj22, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (InventoryAdManager.onExtraCallbackWithResult << 3) | (InventoryAdDto.$stable << 9), 0, i21 & 112, (i21 << 3) & 458752);
                                                                                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                                                                                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                                                                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                                                                                                }
                                                                                                                function14 = function113;
                                                                                                                cashflowViewModel3 = cashflowViewModel5;
                                                                                                                function17 = function117;
                                                                                                                function18 = function110;
                                                                                                                function23 = function27;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    CashflowScreenKt$.ExternalSyntheticLambda17 externalSyntheticLambda17 = new CashflowScreenKt$.ExternalSyntheticLambda17(cashflowViewModel5);
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda17);
                                                    obj3 = externalSyntheticLambda17;
                                                    Function0 function092 = (Function0) obj3;
                                                    zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                                                    Object objOnMinimized292 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                    if (zOnExtraCallback4) {
                                                    }
                                                }
                                            }
                                        } else {
                                            z2 = false;
                                            obj2 = objOnMinimized25;
                                            if (objOnMinimized25 == onwarmupcompleted.onExtraCallback()) {
                                            }
                                            Function0 function072 = (Function0) obj2;
                                            zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                                            Object objOnMinimized262 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            if (zOnExtraCallback3) {
                                            }
                                        }
                                    } else {
                                        function115 = function124;
                                        z2 = false;
                                    }
                                    CashflowScreenKt$.ExternalSyntheticLambda13 externalSyntheticLambda13 = new CashflowScreenKt$.ExternalSyntheticLambda13(cashflowViewModel5);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda13);
                                    obj2 = externalSyntheticLambda13;
                                    Function0 function0722 = (Function0) obj2;
                                    zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                                    Object objOnMinimized2622 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (zOnExtraCallback3) {
                                    }
                                }
                                CashflowScreenKt$.ExternalSyntheticLambda12 externalSyntheticLambda12 = new CashflowScreenKt$.ExternalSyntheticLambda12(cashflowViewModel5);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda12);
                                obj = externalSyntheticLambda12;
                                Function1 function1242 = (Function1) obj;
                                zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                                Object objOnMinimized252 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (zOnExtraCallback2) {
                                }
                                CashflowScreenKt$.ExternalSyntheticLambda13 externalSyntheticLambda132 = new CashflowScreenKt$.ExternalSyntheticLambda13(cashflowViewModel5);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda132);
                                obj2 = externalSyntheticLambda132;
                                Function0 function07222 = (Function0) obj2;
                                zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                                Object objOnMinimized26222 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (zOnExtraCallback3) {
                                }
                            }
                        }
                    }
                    objOnMinimized20 = new CashflowScreenKt$.ExternalSyntheticLambda8(cashflowViewModel5);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized20);
                    Function0 function042 = (Function0) objOnMinimized20;
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowViewModel5);
                    Object objOnMinimized212 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnExtraCallback) {
                    }
                }
                function113 = function112;
                function117 = function111;
                function27 = function28;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                function14 = function113;
                cashflowViewModel3 = cashflowViewModel5;
                function17 = function117;
                function18 = function110;
                function23 = function27;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            cashflowViewModel3 = cashflowViewModel;
            function17 = function12;
            function23 = function2;
            function18 = function13;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CashflowScreenKt$.ExternalSyntheticLambda34(cashflowViewModel3, function14, function17, function23, function18, i, i2));
        }
    }

    private static final getPackageType onExtraCallbackWithResult(findResAndMsg findresandmsg, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1) {
        int i = 2 % 2;
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        IAuthTabCallback(-1205514679, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{getsupportedhighspeedresolutionsfor, false}, iOnExtraCallbackWithResult, 1205514689, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        getPackageType getpackagetypeOnNavigationEvent = maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onTransact(camera2CameraMetadataExternalSyntheticLambda1, null), 3, (Object) null);
        int i2 = onWarmupCompleted + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return getpackagetypeOnNavigationEvent;
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Camera2CameraMetadataExternalSyntheticLambda1 $selectedPresenceListState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
            this.$selectedPresenceListState = camera2CameraMetadataExternalSyntheticLambda1;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 123;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onTransact ontransactCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return ontransactCreate.invokeSuspend(unit);
            }
            ontransactCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = new onTransact(this.$selectedPresenceListState, access13800Var);
            int i2 = onExtraCallback + 101;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return ontransact;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                IAuthTabCallback(findresandmsg, access13800Var);
                throw null;
            }
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i3 = IAuthTabCallback + 7;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return objIAuthTabCallback;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[PHI: r1
          0x0032: PHI (r1v5 java.lang.Object) = (r1v4 java.lang.Object), (r1v6 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r3
          0x0024: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted;
            int i;
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 19;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 21 / 0;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = this.$selectedPresenceListState;
                    this.label = 1;
                    if (traceBeginSection.IAuthTabCallback(camera2CameraMetadataExternalSyntheticLambda1, (access13800) this) == objOnWarmupCompleted) {
                        int i5 = onExtraCallback + 97;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $keepCalendarSticky$delegate;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<String> $previousSelectedTabId$delegate;
        final /* synthetic */ RVLogger.onWarmupCompleted $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(RVLogger.onWarmupCompleted onwarmupcompleted, getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor2, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$state = onwarmupcompleted;
            this.$previousSelectedTabId$delegate = getsupportedhighspeedresolutionsfor;
            this.$keepCalendarSticky$delegate = getsupportedhighspeedresolutionsfor2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$state, this.$previousSelectedTabId$delegate, this.$keepCalendarSticky$delegate, access13800Var);
            int i2 = onExtraCallback + 37;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 111;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 73 / 0;
            return onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (!Intrinsics.areEqual(traceBeginSection.onNavigationEvent(this.$previousSelectedTabId$delegate), this.$state.IAuthTabCallbackStub())) {
                int i4 = onExtraCallback + 35;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                traceBeginSection.onExtraCallbackWithResult(this.$previousSelectedTabId$delegate, this.$state.IAuthTabCallbackStub());
                traceBeginSection.IAuthTabCallback(1234703003, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{this.$keepCalendarSticky$delegate, false}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1234702994, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
            }
            return Unit.INSTANCE;
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $keepCalendarSticky$delegate;
        final /* synthetic */ Camera2CameraMetadataExternalSyntheticLambda1 $selectedPresenceListState;
        final /* synthetic */ RVLogger.onWarmupCompleted $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(RVLogger.onWarmupCompleted onwarmupcompleted, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$state = onwarmupcompleted;
            this.$selectedPresenceListState = camera2CameraMetadataExternalSyntheticLambda1;
            this.$keepCalendarSticky$delegate = getsupportedhighspeedresolutionsfor;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$state, this.$selectedPresenceListState, this.$keepCalendarSticky$delegate, access13800Var);
            int i2 = onNavigationEvent + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 77;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (!traceBeginSection.onNavigationEvent(this.$state.IAuthTabCallback_Parcel())) {
                    Unit unit = Unit.INSTANCE;
                    int i4 = onNavigationEvent + 99;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return unit;
                }
                traceBeginSection.IAuthTabCallback(1234703003, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{this.$keepCalendarSticky$delegate, false}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1234702994, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
                Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = this.$selectedPresenceListState;
                this.label = 1;
                if (traceBeginSection.IAuthTabCallback(camera2CameraMetadataExternalSyntheticLambda1, (access13800) this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            Unit unit2 = Unit.INSTANCE;
            int i6 = onNavigationEvent + 3;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return unit2;
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ CommonAppExitExtension $attentionFloatingButton;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $isAttentionFloatingButtonActivated$delegate;
        final /* synthetic */ Function1<CommonAppExitExtension, Unit> $onAttentionFloatingButtonImpression;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(CommonAppExitExtension commonAppExitExtension, Function1<? super CommonAppExitExtension, Unit> function1, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$attentionFloatingButton = commonAppExitExtension;
            this.$onAttentionFloatingButtonImpression = function1;
            this.$isAttentionFloatingButtonActivated$delegate = getsupportedhighspeedresolutionsfor;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$attentionFloatingButton, this.$onAttentionFloatingButtonImpression, this.$isAttentionFloatingButtonActivated$delegate, access13800Var);
            int i2 = onWarmupCompleted + 53;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onnavigationevent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 47;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallbackWithResult;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 25;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (this.$attentionFloatingButton != null) {
                int i2 = onNavigationEvent + 119;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    ((Boolean) traceBeginSection.IAuthTabCallback(-1845765533, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{this.$isAttentionFloatingButtonActivated$delegate}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1845765560, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())).booleanValue();
                    throw null;
                }
                if (!((Boolean) traceBeginSection.IAuthTabCallback(-1845765533, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{this.$isAttentionFloatingButtonActivated$delegate}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1845765560, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())).booleanValue()) {
                    traceBeginSection.IAuthTabCallback((getSupportedHighSpeedResolutionsFor) this.$isAttentionFloatingButtonActivated$delegate, true);
                    this.$onAttentionFloatingButtonImpression.invoke(this.$attentionFloatingButton);
                    return Unit.INSTANCE;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i3 = onNavigationEvent + 45;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    }

    public static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<Function0<Unit>> $currentOnTabItemBannerImpression$delegate;
        final /* synthetic */ RVLogger.onWarmupCompleted $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackDefault(RVLogger.onWarmupCompleted onwarmupcompleted, CameraPresenceProviderExternalSyntheticLambda6<? extends Function0<Unit>> cameraPresenceProviderExternalSyntheticLambda6, access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
            this.$state = onwarmupcompleted;
            this.$currentOnTabItemBannerImpression$delegate = cameraPresenceProviderExternalSyntheticLambda6;
        }

        public static /* synthetic */ Unit IAuthTabCallback(long j) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 59;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return onNavigationEvent(j);
            }
            onNavigationEvent(j);
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = new IAuthTabCallbackDefault(this.$state, this.$currentOnTabItemBannerImpression$delegate, access13800Var);
            int i2 = onNavigationEvent + 103;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallbackDefault;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 115;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 117;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 5;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        private static final Unit onNavigationEvent(long j) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Unit unit = Unit.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Unit unit2 = Unit.INSTANCE;
            int i3 = onNavigationEvent + 109;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return unit2;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onNavigationEvent + 43;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                if (this.$state.IAuthTabCallback_Parcel() != toStringArray.Tab) {
                    int i4 = onExtraCallback + 51;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        return Unit.INSTANCE;
                    }
                    Unit unit = Unit.INSTANCE;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                CashflowScreenKt$CashflowContent$6$1$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new CashflowScreenKt$CashflowContent$6$1$.ExternalSyntheticLambda0();
                this.label = 1;
                if (addSessionCaptureCallback.IAuthTabCallback(externalSyntheticLambda0, this) == objOnWarmupCompleted) {
                    int i5 = onNavigationEvent + 21;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return objOnWarmupCompleted;
                }
            }
            traceBeginSection.onNavigationEvent(this.$currentOnTabItemBannerImpression$delegate).invoke();
            return Unit.INSTANCE;
        }
    }

    private static final void onExtraCallbackWithResult(Function0 function0, Function0 function02, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if (onextracallbackwithresult == TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_PAUSE) {
            int i4 = onNavigationEvent + 101;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                function0.invoke();
                function02.invoke();
            } else {
                function0.invoke();
                function02.invoke();
                throw null;
            }
        }
    }

    private static final Unit onExtraCallback(Function0 function0, Function0 function02) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            function0.invoke();
            function02.invoke();
            return Unit.INSTANCE;
        }
        function0.invoke();
        function02.invoke();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(Function0 function0, Function0 function02) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            function0.invoke();
            function02.invoke();
            unit = Unit.INSTANCE;
            int i3 = 66 / 0;
        } else {
            function0.invoke();
            function02.invoke();
            unit = Unit.INSTANCE;
        }
        int i4 = onNavigationEvent + 15;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object ICustomTabsCallback_Parcel(Object[] objArr) {
        RVLogger.onWarmupCompleted onwarmupcompleted = (RVLogger.onWarmupCompleted) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        YearMonth yearMonth = (YearMonth) objArr[3];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(yearMonth, "");
        if (!Intrinsics.areEqual(yearMonth, onwarmupcompleted.asBinder())) {
            int i2 = onWarmupCompleted + 107;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            function0.invoke();
        }
        function1.invoke(yearMonth);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 35;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(Function0 function0, Context context, Resources resources, RVLogger.onWarmupCompleted onwarmupcompleted, List list, Function0 function02, Function1 function1) {
        int i = 2 % 2;
        function0.invoke();
        onNavigationEvent(context, resources, onwarmupcompleted.asBinder(), (List<YearMonth>) list, (Function1<? super YearMonth, Unit>) new CashflowScreenKt$.ExternalSyntheticLambda68(onwarmupcompleted, function02, function1));
        Unit unit = Unit.INSTANCE;
        int i2 = onNavigationEvent + 117;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(List list, RVLogger.onWarmupCompleted onwarmupcompleted, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Context context, Resources resources, List list2, Function1 function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onWarmupCompleted + 103;
            onNavigationEvent = i3 % 128;
            z = i3 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i4 = onNavigationEvent + 47;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-267694450, i, -1, "im.toss.features.home.feature.cashflow.screen.CashflowContent.<anonymous>.<anonymous> (CashflowScreen.kt:387)");
                    int i5 = 25 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-267694450, i, -1, "im.toss.features.home.feature.cashflow.screen.CashflowContent.<anonymous>.<anonymous> (CashflowScreen.kt:387)");
                }
            }
            if (list.isEmpty()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(870987956);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(869035204);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = CaptureNoResponseQuirk.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(logDebugOnMode.IAuthTabCallback.onWarmupCompleted(onwarmupcompleted.onExtraCallback().size())), 0.0f, 2, (Object) null);
                String string = onwarmupcompleted.asBinder().toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                String strOnExtraCallbackWithResult = getScreenOrientationThroughActivityFirst.onExtraCallbackWithResult(string);
                List list3 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    String string2 = ((YearMonth) it.next()).toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    arrayList.add(getScreenOrientationThroughActivityFirst.onExtraCallback(getScreenOrientationThroughActivityFirst.onExtraCallbackWithResult(string2)));
                }
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function02);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnNavigationEvent | zOnNavigationEvent2)) {
                    Object obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        CashflowScreenKt$.ExternalSyntheticLambda45 externalSyntheticLambda45 = new CashflowScreenKt$.ExternalSyntheticLambda45(function0, function02);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda45);
                        obj = externalSyntheticLambda45;
                    }
                    Function0 function05 = (Function0) obj;
                    boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
                    boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function03);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(zOnNavigationEvent3 | zOnNavigationEvent4)) {
                        Object obj2 = objOnMinimized2;
                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            CashflowScreenKt$.ExternalSyntheticLambda46 externalSyntheticLambda46 = new CashflowScreenKt$.ExternalSyntheticLambda46(function0, function03);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda46);
                            obj2 = externalSyntheticLambda46;
                        }
                        Function0 function06 = (Function0) obj2;
                        boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function04);
                        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(context);
                        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(resources);
                        boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(onwarmupcompleted);
                        boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(list2);
                        boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
                        boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!(zOnNavigationEvent5 | zOnExtraCallback | zOnExtraCallback2 | zOnExtraCallback3 | zOnExtraCallback4 | zOnNavigationEvent6 | zOnNavigationEvent7)) {
                            int i6 = onWarmupCompleted + 45;
                            onNavigationEvent = i6 % 128;
                            if (i6 % 2 != 0) {
                                int i7 = 91 / 0;
                                if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    CashflowScreenKt$.ExternalSyntheticLambda47 externalSyntheticLambda47 = new CashflowScreenKt$.ExternalSyntheticLambda47(function04, context, resources, onwarmupcompleted, list2, function0, function1);
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda47);
                                    objOnMinimized3 = externalSyntheticLambda47;
                                }
                                ByteArrayPoolsByteArrayPool.IAuthTabCallback(quirksExternalSyntheticBackport0OnWarmupCompleted, strOnExtraCallbackWithResult, arrayList, function05, function06, (Function0) objOnMinimized3, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f), (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), (GraphicDeviceInfo) null, readBoolean2.Side, cameraCaptureResultEmptyCameraCaptureResult, 806879232, 256);
                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            } else {
                                if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                }
                                ByteArrayPoolsByteArrayPool.IAuthTabCallback(quirksExternalSyntheticBackport0OnWarmupCompleted, strOnExtraCallbackWithResult, arrayList, function05, function06, (Function0) objOnMinimized3, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f), (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), (GraphicDeviceInfo) null, readBoolean2.Side, cameraCaptureResultEmptyCameraCaptureResult, 806879232, 256);
                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            }
                        }
                    }
                }
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(DefaultAppOperatorImpl defaultAppOperatorImpl, RVLogger.onWarmupCompleted onwarmupcompleted, Function1 function1, Function1 function12) {
        String strOnExtraCallback;
        int i = 2 % 2;
        DefaultAppOperatorImpl.onNavigationEvent onnavigationevent = (DefaultAppOperatorImpl.onNavigationEvent) defaultAppOperatorImpl;
        String strOnExtraCallback2 = onnavigationevent.onExtraCallback();
        Object obj = null;
        if (StringsKt.isBlank(strOnExtraCallback2)) {
            int i2 = onNavigationEvent + 93;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            strOnExtraCallback = null;
        } else {
            strOnExtraCallback = deprecated.onExtraCallback(strOnExtraCallback2, onwarmupcompleted.asBinder(), onwarmupcompleted.IAuthTabCallbackStub(), onwarmupcompleted.IAuthTabCallbackDefault());
        }
        if (strOnExtraCallback != null) {
            int i3 = onWarmupCompleted + 67;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                function1.invoke(onnavigationevent.onNavigationEvent());
                function12.invoke(strOnExtraCallback);
                throw null;
            }
            function1.invoke(onnavigationevent.onNavigationEvent());
            function12.invoke(strOnExtraCallback);
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(RVLogger.onWarmupCompleted onwarmupcompleted, Function1 function1, Function1 function12, debug debugVar) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(debugVar, "");
        String strOnNavigationEvent = parseConfig.onNavigationEvent.onNavigationEvent(deprecated.onNavigationEvent(debugVar.onWarmupCompleted(), onwarmupcompleted.asBinder(), onwarmupcompleted.IAuthTabCallbackStub()));
        function1.invoke(debugVar);
        function12.invoke(strOnNavigationEvent);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 13;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(RVLogger.onWarmupCompleted onwarmupcompleted, Function1 function1, Function1 function12, Function0 function0, Function1 function13, Function0 function02, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = onWarmupCompleted + 1;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = onNavigationEvent + 51;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1853194020, i, -1, "im.toss.features.home.feature.cashflow.screen.CashflowContent.<anonymous>.<anonymous> (CashflowScreen.kt:426)");
            }
            for (DefaultAppOperatorImpl.onExtraCallback onextracallback : CollectionsKt.asReversed(onwarmupcompleted.onExtraCallback())) {
                if (onextracallback instanceof DefaultAppOperatorImpl.onNavigationEvent) {
                    int i6 = onWarmupCompleted + 15;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1933501570);
                    deprecated_followRedirects deprecated_followredirectsOnNavigationEvent = canonicalizeokhttp.onNavigationEvent(OkHttp.onExtraCallback);
                    String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R$string.home_v2_feature_cashflow_search_title, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(onextracallback);
                    boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(onwarmupcompleted);
                    boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function12);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(zOnExtraCallback | zOnExtraCallback2 | zOnNavigationEvent | zOnNavigationEvent2)) {
                        Object obj2 = objOnMinimized;
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            CashflowScreenKt$.ExternalSyntheticLambda60 externalSyntheticLambda60 = new CashflowScreenKt$.ExternalSyntheticLambda60(onextracallback, onwarmupcompleted, function1, function12);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda60);
                            int i8 = onNavigationEvent + 3;
                            onWarmupCompleted = i8 % 128;
                            int i9 = i8 % 2;
                            obj2 = externalSyntheticLambda60;
                        }
                        onWarmupCompleted(onextracallback, deprecated_followredirectsOnNavigationEvent, strOnExtraCallback, (Function0) obj2, cameraCaptureResultEmptyCameraCaptureResult, 0);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                } else {
                    if (!(onextracallback instanceof DefaultAppOperatorImpl.onExtraCallback)) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1863485375);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        throw new NoWhenBranchMatchedException();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1934938420);
                    DefaultAppOperatorImpl.onExtraCallback onextracallback2 = onextracallback;
                    boolean typedObject = onwarmupcompleted.readTypedObject();
                    String strOnExtraCallback2 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R$string.home_v2_feature_cashflow_button_edit, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(onwarmupcompleted);
                    boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function13);
                    boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function12);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(zOnExtraCallback3 | zOnNavigationEvent3 | zOnNavigationEvent4)) {
                        Object obj3 = objOnMinimized2;
                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            CashflowScreenKt$.ExternalSyntheticLambda61 externalSyntheticLambda61 = new CashflowScreenKt$.ExternalSyntheticLambda61(onwarmupcompleted, function13, function12);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda61);
                            obj3 = externalSyntheticLambda61;
                        }
                        onWarmupCompleted(onextracallback2, typedObject, strOnExtraCallback2, function0, (Function1) obj3, function02, cameraCaptureResultEmptyCameraCaptureResult, 0);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                }
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        boolean z;
        List list = (List) objArr[0];
        RVLogger.onWarmupCompleted onwarmupcompleted = (RVLogger.onWarmupCompleted) objArr[1];
        Function0 function0 = (Function0) objArr[2];
        Function0 function02 = (Function0) objArr[3];
        Function0 function03 = (Function0) objArr[4];
        Function0 function04 = (Function0) objArr[5];
        Context context = (Context) objArr[6];
        Resources resources = (Resources) objArr[7];
        List list2 = (List) objArr[8];
        Function1 function1 = (Function1) objArr[9];
        Function1 function12 = (Function1) objArr[10];
        Function1 function13 = (Function1) objArr[11];
        Function0 function05 = (Function0) objArr[12];
        Function1 function14 = (Function1) objArr[13];
        Function0 function06 = (Function0) objArr[14];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[15];
        int iIntValue = ((Number) objArr[16]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if ((iIntValue & 3) != 2) {
            z = true;
        } else {
            int i5 = i3 + 29;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-665201491, iIntValue, -1, "im.toss.features.home.feature.cashflow.screen.CashflowContent.<anonymous> (CashflowScreen.kt:384)");
                int i7 = onWarmupCompleted + 35;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
            }
            ByteArrayPoolsByteArray127Pool.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, ForwardingCameraControl.onExtraCallback(-267694450, true, new CashflowScreenKt$.ExternalSyntheticLambda63(list, onwarmupcompleted, function0, function02, function03, function04, context, resources, list2, function1), cameraCaptureResultEmptyCameraCaptureResult, 54), FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onNavigationEvent(), ForwardingCameraControl.onExtraCallback(1853194020, true, new CashflowScreenKt$.ExternalSyntheticLambda64(onwarmupcompleted, function12, function13, function05, function14, function06), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 3504, 1);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onNavigationEvent + 87;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 == 0) {
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

    private static /* synthetic */ Object onUnminimized(Object[] objArr) {
        RVLogger.onWarmupCompleted onwarmupcompleted = (RVLogger.onWarmupCompleted) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        String str = (String) objArr[3];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.areEqual(str, onwarmupcompleted.IAuthTabCallbackStub());
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        if (!Intrinsics.areEqual(str, onwarmupcompleted.IAuthTabCallbackStub())) {
            function0.invoke();
            int i3 = onWarmupCompleted + 33;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 4 % 2;
            }
        }
        function1.invoke(str);
        Unit unit = Unit.INSTANCE;
        int i5 = onWarmupCompleted + 29;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(getBacktraceNote getbacktracenote, RVLogger.onWarmupCompleted onwarmupcompleted, applyConfig applyconfig, DefaultLoggerProxyImpl.IAuthTabCallback.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        getbacktracenote.invoke(iAuthTabCallback.IAuthTabCallback(), applyconfig.IAuthTabCallback(deprecated.IAuthTabCallback(deprecated.onNavigationEvent(iAuthTabCallback.onWarmupCompleted(), onwarmupcompleted.asBinder(), onwarmupcompleted.IAuthTabCallbackStub()), onwarmupcompleted.IAuthTabCallbackStub()), iAuthTabCallback.IAuthTabCallback()), (DefaultLoggerProxyImpl.IAuthTabCallback) RVLogger.onWarmupCompleted.onWarmupCompleted(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 730331882, -730331879, new Object[]{onwarmupcompleted}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback()));
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 53;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(Function1 function1, CommonAppExitExtension commonAppExitExtension, Function1 function12) {
        int i = 2 % 2;
        function1.invoke(commonAppExitExtension);
        String strOnWarmupCompleted = commonAppExitExtension.IAuthTabCallback().onWarmupCompleted();
        if (StringsKt.isBlank(strOnWarmupCompleted)) {
            int i2 = onWarmupCompleted + 53;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 3;
            }
            strOnWarmupCompleted = null;
        }
        if (strOnWarmupCompleted != null) {
            int i4 = onWarmupCompleted + 95;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            String strOnNavigationEvent = deprecated.onNavigationEvent(strOnWarmupCompleted, "consumption");
            if (strOnNavigationEvent != null) {
                int i6 = onNavigationEvent + 73;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                function12.invoke(strOnNavigationEvent);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x027e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(RVLogger.onWarmupCompleted onwarmupcompleted, InventoryAdManager inventoryAdManager, String str, InventoryAdDto inventoryAdDto, applyConfig applyconfig, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function0 function02, Function1 function15, String str2, Function0 function03, Function1 function16, Function1 function17, Function1 function18, getBacktraceNote getbacktracenote, Function2 function2, Function1 function19, Function1 function110, Function1 function111, View view, CommonAppExitExtension commonAppExitExtension, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Function0 function04, getBacktraceNote getbacktracenote2, Function0 function05, Function1 function112, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean zOnExtraCallback;
        boolean zOnNavigationEvent;
        boolean zOnNavigationEvent2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 59;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i6 = onNavigationEvent + 91;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 33 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(470482714, i2, -1, "im.toss.features.home.feature.cashflow.screen.CashflowContent.<anonymous> (CashflowScreen.kt:477)");
                }
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null), deviceQuirksExternalSyntheticLambda0);
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    int i8 = onWarmupCompleted + 79;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                } else {
                    int i10 = onWarmupCompleted + 61;
                    onNavigationEvent = i10 % 128;
                    if (i10 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                        throw null;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
                boolean zOnExtraCallback2 = onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(onwarmupcompleted);
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
                zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback | zOnNavigationEvent | zOnNavigationEvent2) {
                    Object obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        CashflowScreenKt$.ExternalSyntheticLambda42 externalSyntheticLambda42 = new CashflowScreenKt$.ExternalSyntheticLambda42(onwarmupcompleted, function0, function1);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda42);
                        obj = externalSyntheticLambda42;
                    }
                    IAuthTabCallback(399265859, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{quirksExternalSyntheticBackport0OnNavigationEvent, onwarmupcompleted, inventoryAdManager, str, inventoryAdDto, applyconfig, camera2CameraMetadataExternalSyntheticLambda1, Boolean.valueOf(zOnExtraCallback2), (Function1) obj, function12, function13, function14, function02, function15, str2, function03, function16, function17, function18, getbacktracenote, function2, function19, function110, function111, view, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((InventoryAdManager.onExtraCallbackWithResult << 6) | 6 | (InventoryAdDto.$stable << 12)), 0, 0}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -399265833, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
                    List listOnWarmupCompleted = onwarmupcompleted.onWarmupCompleted();
                    if (listOnWarmupCompleted == null) {
                        int i11 = onNavigationEvent + 45;
                        onWarmupCompleted = i11 % 128;
                        int i12 = i11 % 2;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1022506770);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1022506771);
                        RealImageLoaderKt.IAuthTabCallback(new Object[]{function04, cameraCaptureResultEmptyCameraCaptureResult2, 0}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1641337170, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1641337169);
                        boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(getbacktracenote2);
                        boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(onwarmupcompleted);
                        boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(applyconfig);
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if ((zOnNavigationEvent3 | zOnExtraCallback3 | zOnExtraCallback4) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized2 = new CashflowScreenKt$.ExternalSyntheticLambda43(getbacktracenote2, onwarmupcompleted, applyconfig);
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
                        }
                        unRegisterServerChannel.IAuthTabCallback(listOnWarmupCompleted, (Function1) objOnMinimized2, function05, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                    if (commonAppExitExtension == null) {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1023420929);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        int i13 = onWarmupCompleted + 101;
                        onNavigationEvent = i13 % 128;
                        int i14 = i13 % 2;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1023420930);
                        boolean zIAuthTabCallback = IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2);
                        boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(function112);
                        boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(commonAppExitExtension);
                        boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(function111);
                        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!(zOnNavigationEvent4 | zOnExtraCallback5 | zOnNavigationEvent5)) {
                            Object obj2 = objOnMinimized3;
                            if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                CashflowScreenKt$.ExternalSyntheticLambda44 externalSyntheticLambda44 = new CashflowScreenKt$.ExternalSyntheticLambda44(function112, commonAppExitExtension, function111);
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(externalSyntheticLambda44);
                                int i15 = onWarmupCompleted + 111;
                                onNavigationEvent = i15 % 128;
                                int i16 = i15 % 2;
                                obj2 = externalSyntheticLambda44;
                            }
                            parseAriverCodeUrl.onExtraCallback(zIAuthTabCallback, commonAppExitExtension, (Function0) obj2, highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult.onWarmupCompleted()), cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        }
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback2, 0.0f, 1, (Object) null), deviceQuirksExternalSyntheticLambda0);
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult3 = QuirkSettingsLoader.Companion;
                component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult3.access100(), false);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback2);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult22 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback2 = onextracallbackwithresult22.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult22.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult22.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult22.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult22.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult22.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda12 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback2, 0.0f, 1, (Object) null);
                boolean zOnExtraCallback22 = onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(onwarmupcompleted);
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
                zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback | zOnNavigationEvent | zOnNavigationEvent2) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:319:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x069c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(RVLogger.onWarmupCompleted onwarmupcompleted, InventoryAdManager inventoryAdManager, String str, InventoryAdDto inventoryAdDto, applyConfig applyconfig, Function2<? super YearMonth, ? super String, Unit> function2, Function1<? super String, Unit> function1, Function0<Unit> function0, Function1<? super LocalDate, Unit> function12, Function1<? super LocalDate, Unit> function13, Function1<? super LocalDate, Unit> function14, Function0<Unit> function02, Function1<? super Integer, Unit> function15, Function0<Unit> function03, Function0<Unit> function04, Function1<? super YearMonth, Unit> function16, Function0<Unit> function05, Function1<? super String, Unit> function17, Function0<Unit> function06, Function0<Unit> function07, Function1<? super debug, Unit> function18, Function1<? super String, Unit> function19, Function1<? super String, Unit> function110, Function1<? super DefaultLoggerProxyImpl.IAuthTabCallback, Unit> function111, getBacktraceNote<? super DefaultLoggerProxyImpl.onExtraCallbackWithResult, ? super Integer, ? super String, Unit> getbacktracenote, Function2<? super DefaultLoggerProxyImpl.onExtraCallbackWithResult, ? super Integer, Unit> function22, Function1<? super String, Unit> function112, Function1<? super String, Unit> function113, Function1<? super CommonAppExitExtension, Unit> function114, Function1<? super CommonAppExitExtension, Unit> function115, Function0<Unit> function08, Function1<? super DefaultLoggerProxyImpl.IAuthTabCallback, Unit> function116, Function0<Unit> function09, Function0<Unit> function010, getBacktraceNote<? super String, ? super String, ? super DefaultLoggerProxyImpl.IAuthTabCallback, Unit> getbacktracenote2, Function1<? super String, Unit> function117, Function0<Unit> function011, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3, int i4) throws NoWhenBranchMatchedException {
        int i5;
        int i6;
        int i7;
        Function0<Unit> function012;
        int i8;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        Context context;
        List list;
        Object obj;
        int i9;
        int i10;
        int i11 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(896986241);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted)) {
                int i12 = onWarmupCompleted + 53;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                i10 = 4;
            } else {
                i10 = 2;
            }
            i5 = i10 | i;
        } else {
            i5 = i;
        }
        if ((i & 48) == 0) {
            i5 |= (i & 64) == 0 ? cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(inventoryAdManager) : cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(inventoryAdManager) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                int i14 = onNavigationEvent + 3;
                onWarmupCompleted = i14 % 128;
                int i15 = i14 % 2;
                i9 = 256;
            } else {
                i9 = 128;
            }
            i5 |= i9;
        }
        if ((i & 3072) == 0) {
            i5 |= !(((i & 4096) == 0 ? cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(inventoryAdDto) : cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(inventoryAdDto)) ^ true) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= (32768 & i) == 0 ? cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(applyconfig) : cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(applyconfig) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            int i16 = onNavigationEvent + 93;
            onWarmupCompleted = i16 % 128;
            int i17 = i16 % 2;
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function13) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i6 = i2 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function14) ? 4 : 2);
        } else {
            i6 = i2;
        }
        if ((i2 & 48) == 0) {
            i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function15) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function03) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function04) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function16) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function05) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            int i18 = onNavigationEvent + 97;
            onWarmupCompleted = i18 % 128;
            if (i18 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function17);
                throw null;
            }
            i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function17) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            int i19 = onNavigationEvent + 71;
            onWarmupCompleted = i19 % 128;
            int i20 = i19 % 2;
            i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function06) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function07) ? 536870912 : 268435456;
        }
        int i21 = i6;
        if ((i3 & 6) == 0) {
            i7 = i3 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function18) ? 4 : 2);
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function19) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function110) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            int i22 = onNavigationEvent + 47;
            onWarmupCompleted = i22 % 128;
            int i23 = i22 % 2;
            i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function111) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function22) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function112) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function113) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function114) ^ true ? 33554432 : 67108864;
        }
        if ((i3 & 805306368) == 0) {
            i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function115) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            int i24 = onNavigationEvent + 79;
            onWarmupCompleted = i24 % 128;
            if (i24 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function08);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            function012 = function08;
            i8 = i4 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function012) ? 4 : 2);
        } else {
            function012 = function08;
            i8 = i4;
        }
        if ((i4 & 48) == 0) {
            i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function116) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function09) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function010) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote2) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function117) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function011) ? 1048576 : 524288;
        }
        int i25 = i8;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i5 & 306783379) == 306783378 && (306783379 & i21) == 306783378 && (i7 & 306783379) == 306783378 && (599187 & i25) == 599186) ? false : true, i5 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(896986241, i5, i21, "im.toss.features.home.feature.cashflow.screen.CashflowContent (CashflowScreen.kt:265)");
            }
            RVClientStarter rVClientStarterAccess100 = onwarmupcompleted.access100();
            YearMonth yearMonthAsBinder = onwarmupcompleted.asBinder();
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(rVClientStarterAccess100);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(yearMonthAsBinder);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!(zOnNavigationEvent | zOnNavigationEvent2)) {
                int i26 = onNavigationEvent + 125;
                onWarmupCompleted = i26 % 128;
                if (i26 % 2 == 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    throw null;
                }
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = onExtraCallback(onwarmupcompleted.access100(), onwarmupcompleted.asBinder());
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                List list2 = (List) objOnMinimized;
                RVClientStarter rVClientStarterAccess1002 = onwarmupcompleted.access100();
                YearMonth yearMonthAsBinder2 = onwarmupcompleted.asBinder();
                boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(rVClientStarterAccess1002);
                boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(yearMonthAsBinder2);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((zOnNavigationEvent3 | zOnNavigationEvent4) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized2 = onExtraCallbackWithResult(onwarmupcompleted.access100(), onwarmupcompleted.asBinder());
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                }
                List list3 = (List) objOnMinimized2;
                Context context2 = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                Resources resources = (Resources) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback());
                View view = (View) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallbackDefault());
                TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda1.IAuthTabCallback());
                String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_v2_core_ui_refresh_list, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                CommonAppExitExtension commonAppExitExtensionOnExtraCallbackWithResult = onwarmupcompleted.onExtraCallbackWithResult();
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(function2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i5 >> 15) & 14);
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2 = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(function0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i5 >> 21) & 14);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted2 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized3 == onwarmupcompleted2.onExtraCallback()) {
                    context = context2;
                    objOnMinimized3 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                } else {
                    context = context2;
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized3;
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized4 == onwarmupcompleted2.onExtraCallback()) {
                    list = list3;
                    objOnMinimized4 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                } else {
                    list = list3;
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized4;
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized5 == onwarmupcompleted2.onExtraCallback()) {
                    int i27 = onWarmupCompleted + 73;
                    onNavigationEvent = i27 % 128;
                    int i28 = i27 % 2;
                    objOnMinimized5 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(onwarmupcompleted.IAuthTabCallbackStub(), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objOnMinimized5;
                Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult = Camera2CameraControllerExternalSyntheticLambda0.onExtraCallbackWithResult(0, 0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 3);
                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized6 == onwarmupcompleted2.onExtraCallback()) {
                    objOnMinimized6 = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                }
                findResAndMsg findresandmsg = (findResAndMsg) objOnMinimized6;
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(findresandmsg);
                boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult);
                Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!(zOnExtraCallback | zOnNavigationEvent5)) {
                    Object obj3 = objOnMinimized7;
                    if (objOnMinimized7 == onwarmupcompleted2.onExtraCallback()) {
                        CashflowScreenKt$.ExternalSyntheticLambda49 externalSyntheticLambda49 = new CashflowScreenKt$.ExternalSyntheticLambda49(findresandmsg, getsupportedhighspeedresolutionsfor2, camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda49);
                        obj3 = externalSyntheticLambda49;
                    }
                    Function0 function013 = (Function0) obj3;
                    String strIAuthTabCallbackStub = onwarmupcompleted.IAuthTabCallbackStub();
                    boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted);
                    Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnExtraCallback2 || objOnMinimized8 == onwarmupcompleted2.onExtraCallback()) {
                        objOnMinimized8 = new onExtraCallback(onwarmupcompleted, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor2, null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized8);
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(strIAuthTabCallbackStub, (Function2) objOnMinimized8, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    String strIAuthTabCallbackStub2 = onwarmupcompleted.IAuthTabCallbackStub();
                    YearMonth yearMonthAsBinder3 = onwarmupcompleted.asBinder();
                    toStringArray tostringarrayIAuthTabCallback_Parcel = onwarmupcompleted.IAuthTabCallback_Parcel();
                    boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted);
                    boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult);
                    Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!(zOnExtraCallback3 | zOnNavigationEvent6)) {
                        Object obj4 = objOnMinimized9;
                        if (objOnMinimized9 == onwarmupcompleted2.onExtraCallback()) {
                            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(onwarmupcompleted, camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult, getsupportedhighspeedresolutionsfor2, null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(iAuthTabCallback);
                            obj4 = iAuthTabCallback;
                        }
                        isZslDisabledByByUserCaseConfig.IAuthTabCallback(strIAuthTabCallbackStub2, yearMonthAsBinder3, tostringarrayIAuthTabCallback_Parcel, (Function2) obj4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult);
                        Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (zOnNavigationEvent7 || objOnMinimized10 == onwarmupcompleted2.onExtraCallback()) {
                            objOnMinimized10 = new onExtraCallbackWithResult(camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult, getsupportedhighspeedresolutionsfor2, (access13800) null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized10);
                        }
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult, (Function2) objOnMinimized10, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        List list4 = (List) RVLogger.onWarmupCompleted.onWarmupCompleted(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 915695779, -915695779, new Object[]{onwarmupcompleted}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
                        String strIAuthTabCallbackStub3 = onwarmupcompleted.IAuthTabCallbackStub();
                        boolean zOnNavigationEvent8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list4);
                        boolean zOnNavigationEvent9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strIAuthTabCallbackStub3);
                        Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if ((zOnNavigationEvent8 | zOnNavigationEvent9) || objOnMinimized11 == onwarmupcompleted2.onExtraCallback()) {
                            objOnMinimized11 = onExtraCallback(onwarmupcompleted);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized11);
                        }
                        getTyroBlockTime gettyroblocktime = (getTyroBlockTime) objOnMinimized11;
                        boolean zIAuthTabCallback = IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
                        boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(commonAppExitExtensionOnExtraCallbackWithResult);
                        boolean z = (i7 & 234881024) == 67108864;
                        Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if ((zOnExtraCallback4 | z) || objOnMinimized12 == onwarmupcompleted2.onExtraCallback()) {
                            objOnMinimized12 = new onNavigationEvent(commonAppExitExtensionOnExtraCallbackWithResult, function114, getsupportedhighspeedresolutionsfor, null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized12);
                        }
                        isZslDisabledByByUserCaseConfig.onExtraCallback(commonAppExitExtensionOnExtraCallbackWithResult, Boolean.valueOf(zIAuthTabCallback), (Function2) objOnMinimized12, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        Object[] objArr = {onwarmupcompleted.asBinder(), onwarmupcompleted.IAuthTabCallbackStub(), Integer.valueOf(onwarmupcompleted.IAuthTabCallbackStubProxy()), camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult};
                        boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted);
                        boolean zOnNavigationEvent10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult);
                        boolean z2 = (i25 & 14) == 4;
                        Object objOnMinimized13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if ((z2 | zOnExtraCallback5 | zOnNavigationEvent10) || objOnMinimized13 == onwarmupcompleted2.onExtraCallback()) {
                            objOnMinimized13 = new onWarmupCompleted(onwarmupcompleted, function012, camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult, (access13800) null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized13);
                        }
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(objArr, (Function2) objOnMinimized13, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        String strIAuthTabCallbackStub4 = onwarmupcompleted.IAuthTabCallbackStub();
                        toStringArray tostringarrayIAuthTabCallback_Parcel2 = onwarmupcompleted.IAuthTabCallback_Parcel();
                        boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted);
                        boolean zOnNavigationEvent11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2);
                        Object objOnMinimized14 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!(zOnExtraCallback6 | zOnNavigationEvent11)) {
                            int i29 = onWarmupCompleted + 13;
                            onNavigationEvent = i29 % 128;
                            int i30 = i29 % 2;
                            if (objOnMinimized14 == onwarmupcompleted2.onExtraCallback()) {
                                objOnMinimized14 = new IAuthTabCallbackDefault(onwarmupcompleted, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2, null);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized14);
                            }
                            isZslDisabledByByUserCaseConfig.onExtraCallback(strIAuthTabCallbackStub4, tostringarrayIAuthTabCallback_Parcel2, (Function2) objOnMinimized14, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            boolean z3 = (i25 & 7168) == 2048;
                            boolean z4 = (3670016 & i25) == 1048576;
                            boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0);
                            Object objOnMinimized15 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (((z3 | z4) || zOnExtraCallback7) || objOnMinimized15 == onwarmupcompleted2.onExtraCallback()) {
                                CashflowScreenKt$.ExternalSyntheticLambda50 externalSyntheticLambda50 = new CashflowScreenKt$.ExternalSyntheticLambda50(textFieldScrollKtExternalSyntheticLambda0, function010, function011);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda50);
                                obj = externalSyntheticLambda50;
                            } else {
                                obj = objOnMinimized15;
                            }
                            isZslDisabledByByUserCaseConfig.onExtraCallbackWithResult(textFieldScrollKtExternalSyntheticLambda0, function010, function011, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i25 >> 6) & 112) | ((i25 >> 12) & 896));
                            Object[] objArr2 = {textFieldScrollKtExternalSyntheticLambda0, onwarmupcompleted.IAuthTabCallbackStub(), onwarmupcompleted.asBinder(), Long.valueOf(onwarmupcompleted.onTransact())};
                            boolean zOnExtraCallback8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0);
                            boolean zOnExtraCallback9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted);
                            boolean zOnNavigationEvent12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                            Object objOnMinimized16 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if ((zOnExtraCallback8 | zOnExtraCallback9 | zOnNavigationEvent12) || objOnMinimized16 == onwarmupcompleted2.onExtraCallback()) {
                                objOnMinimized16 = new IAuthTabCallbackStub(textFieldScrollKtExternalSyntheticLambda0, onwarmupcompleted, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, (access13800) null);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized16);
                            }
                            isZslDisabledByByUserCaseConfig.onNavigationEvent(objArr2, (Function2) objOnMinimized16, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            Map mapIAuthTabCallback = onwarmupcompleted.IAuthTabCallback();
                            boolean zOnNavigationEvent13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gettyroblocktime);
                            boolean zOnNavigationEvent14 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(mapIAuthTabCallback);
                            Object objOnMinimized17 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if ((zOnNavigationEvent14 | zOnNavigationEvent13) || objOnMinimized17 == onwarmupcompleted2.onExtraCallback()) {
                                objOnMinimized17 = onExtraCallbackWithResult(gettyroblocktime, (Map<String, ? extends DefaultLoggerProxyImpl>) onwarmupcompleted.IAuthTabCallback());
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized17);
                            }
                            String str2 = (String) objOnMinimized17;
                            Object[] objArr3 = {textFieldScrollKtExternalSyntheticLambda0, onwarmupcompleted.IAuthTabCallbackStub(), onwarmupcompleted.asBinder(), str2};
                            boolean zOnNavigationEvent15 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2);
                            boolean zOnExtraCallback10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0);
                            boolean z5 = (i7 & 29360128) == 8388608;
                            Object objOnMinimized18 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if ((zOnNavigationEvent15 | zOnExtraCallback10 | z5) || objOnMinimized18 == onwarmupcompleted2.onExtraCallback()) {
                                objOnMinimized18 = new asBinder(str2, textFieldScrollKtExternalSyntheticLambda0, function113, (access13800) null);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized18);
                            }
                            isZslDisabledByByUserCaseConfig.onNavigationEvent(objArr3, (Function2) objOnMinimized18, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            clearValueCallback.onWarmupCompleted(new Object[]{null, null, ForwardingCameraControl.onExtraCallback(-665201491, true, new CashflowScreenKt$.ExternalSyntheticLambda51(list, onwarmupcompleted, function013, function03, function04, function05, context, resources, list2, function16, function17, function117, function07, function18, function011), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), false, null, null, null, 0, false, 0L, 0L, ForwardingCameraControl.onExtraCallback(470482714, true, new CashflowScreenKt$.ExternalSyntheticLambda52(onwarmupcompleted, inventoryAdManager, str, inventoryAdDto, applyconfig, camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult, function013, function1, function12, function13, function14, function02, function15, strOnExtraCallback, function06, function19, function110, function111, getbacktracenote, function22, function112, function116, function117, view, commonAppExitExtensionOnExtraCallbackWithResult, getsupportedhighspeedresolutionsfor2, function09, getbacktracenote2, function010, function115, getsupportedhighspeedresolutionsfor), cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 384, 48, 2043}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), -274372088, zziea.IAuthTabCallback(), 274372088, zziea.IAuthTabCallback());
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CashflowScreenKt$.ExternalSyntheticLambda53(onwarmupcompleted, inventoryAdManager, str, inventoryAdDto, applyconfig, function2, function1, function0, function12, function13, function14, function02, function15, function03, function04, function16, function05, function17, function06, function07, function18, function19, function110, function111, getbacktracenote, function22, function112, function113, function114, function115, function08, function116, function09, function010, getbacktracenote2, function117, function011, i, i2, i3, i4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(DefaultAppOperatorImpl defaultAppOperatorImpl, Object obj, String str, Function0<Unit> function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        String str2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1866364736);
        if ((i & 6) == 0) {
            int i6 = onNavigationEvent + 119;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(defaultAppOperatorImpl)) {
                i4 = 2;
            } else {
                int i8 = onNavigationEvent + 97;
                onWarmupCompleted = i8 % 128;
                i4 = i8 % 2 == 0 ? 3 : 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        Object obj2 = null;
        if ((i & 48) == 0) {
            int i9 = onWarmupCompleted + 95;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(obj);
                obj2.hashCode();
                throw null;
            }
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str2 = str;
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 256 : 128;
        } else {
            str2 = str;
        }
        if ((i & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                int i10 = onWarmupCompleted + 61;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 1171) != 1170, i2 & 1)) {
            int i12 = onNavigationEvent + 73;
            onWarmupCompleted = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 45 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i14 = onWarmupCompleted + 21;
                    onNavigationEvent = i14 % 128;
                    if (i14 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1866364736, i2, -1, "im.toss.features.home.feature.cashflow.screen.CashflowNavigationBarIconButton (CashflowScreen.kt:559)");
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1866364736, i2, -1, "im.toss.features.home.feature.cashflow.screen.CashflowNavigationBarIconButton (CashflowScreen.kt:559)");
                }
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(defaultAppOperatorImpl.onExtraCallbackWithResult(), obj, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i2 & 112);
                String strOnWarmupCompleted = defaultAppOperatorImpl.onWarmupCompleted();
                AppLovinNativeAdImpla.IAuthTabCallback(objOnExtraCallbackWithResult, function0, !StringsKt.isBlank(strOnWarmupCompleted) ? str2 : strOnWarmupCompleted, (QuirksExternalSyntheticBackport0) null, (setViewableMRC50Requests.onWarmupCompleted) null, (setViewableMRC50Requests.onNavigationEvent) null, onExtraCallbackWithResult(defaultAppOperatorImpl.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i2 >> 6) & 112, 56);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                Object objOnExtraCallbackWithResult2 = onExtraCallbackWithResult(defaultAppOperatorImpl.onExtraCallbackWithResult(), obj, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i2 & 112);
                String strOnWarmupCompleted2 = defaultAppOperatorImpl.onWarmupCompleted();
                AppLovinNativeAdImpla.IAuthTabCallback(objOnExtraCallbackWithResult2, function0, !StringsKt.isBlank(strOnWarmupCompleted2) ? str2 : strOnWarmupCompleted2, (QuirksExternalSyntheticBackport0) null, (setViewableMRC50Requests.onWarmupCompleted) null, (setViewableMRC50Requests.onNavigationEvent) null, onExtraCallbackWithResult(defaultAppOperatorImpl.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i2 >> 6) & 112, 56);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CashflowScreenKt$.ExternalSyntheticLambda48(defaultAppOperatorImpl, obj, str, function0, i));
        }
    }

    private static final void onWarmupCompleted(DefaultAppOperatorImpl.onExtraCallback onextracallback, boolean z, String str, Function0<Unit> function0, Function1<? super debug, Unit> function1, Function0<Unit> function02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 65;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-931667119);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallback) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z2 = true;
        if ((i & 48) == 0) {
            int i8 = onWarmupCompleted + 97;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            i2 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            int i10 = onWarmupCompleted + 61;
            onNavigationEvent = i10 % 128;
            if (i10 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                int i11 = onWarmupCompleted + 13;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            int i13 = onNavigationEvent + 15;
            onWarmupCompleted = i13 % 128;
            int i14 = i13 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                int i15 = onNavigationEvent + 75;
                onWarmupCompleted = i15 % 128;
                int i16 = i15 % 2;
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i & 24576) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 131072 : 65536;
        }
        int i17 = i2;
        if ((74899 & i17) != 74898) {
            int i18 = onWarmupCompleted + 41;
            onNavigationEvent = i18 % 128;
            int i19 = i18 % 2;
        } else {
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i17 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-931667119, i17, -1, "im.toss.features.home.feature.cashflow.screen.CashflowNavigationBarMenuButton (CashflowScreen.kt:576)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback2);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                int i20 = onWarmupCompleted + 105;
                onNavigationEvent = i20 % 128;
                int i21 = i20 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            onWarmupCompleted(onextracallback, deprecated_authenticator.onWarmupCompleted("icon-system-dots-horizontal-outlined"), str, function0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i17 & 8078);
            int i22 = i17 >> 6;
            registerClientListener.onExtraCallbackWithResult(onextracallback.onNavigationEvent(), z, function1, function02, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i22 & 7168) | (i17 & 112) | (i22 & 896));
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CashflowScreenKt$.ExternalSyntheticLambda69(onextracallback, z, str, function0, function1, function02, i));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final Object onExtraCallbackWithResult(startClient startclient, Object obj, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        String strIAuthTabCallbackStub;
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(694046745, i, -1, "im.toss.features.home.feature.cashflow.screen.toNavigationBarIconButtonData (CashflowScreen.kt:594)");
        }
        int i3 = readTypedObject.onWarmupCompleted[startclient.onWarmupCompleted().ordinal()];
        if (i3 != 1) {
            int i4 = onWarmupCompleted + 53;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0 ? i3 != 2 : i3 != 3) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1258994180);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                throw new NoWhenBranchMatchedException();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(374405876);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            String strIAuthTabCallback = startclient.IAuthTabCallback();
            if (strIAuthTabCallback != null) {
                if (StringsKt.isBlank(strIAuthTabCallback)) {
                    int i5 = onWarmupCompleted + 65;
                    int i6 = i5 % 128;
                    onNavigationEvent = i6;
                    if (i5 % 2 != 0) {
                        throw null;
                    }
                    int i7 = i6 + 99;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    obj = deprecated_authenticator.onWarmupCompleted(strIAuthTabCallback);
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(374159829);
            if (!addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0) || (strIAuthTabCallbackStub = startclient.onExtraCallbackWithResult()) == null) {
                strIAuthTabCallbackStub = startclient.IAuthTabCallbackStub();
            }
            if (!StringsKt.isBlank(strIAuthTabCallbackStub)) {
                int i9 = onWarmupCompleted + 39;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                obj = strIAuthTabCallbackStub;
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i11 = onWarmupCompleted + 113;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final long onExtraCallbackWithResult(startClient startclient, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        long jOnTransact;
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onNavigationEvent + 33;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1690074944, i, -1, "im.toss.features.home.feature.cashflow.screen.navigationBarTintColor (CashflowScreen.kt:613)");
            if (i4 == 0) {
                int i5 = 22 / 0;
            }
        }
        int i6 = readTypedObject.onWarmupCompleted[startclient.onWarmupCompleted().ordinal()];
        if (i6 != 1) {
            int i7 = onNavigationEvent + 53;
            int i8 = i7 % 128;
            onWarmupCompleted = i8;
            int i9 = i7 % 2;
            if (i6 != 2) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-664381240);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                throw new NoWhenBranchMatchedException();
            }
            int i10 = i8 + 53;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-664377557);
            jOnTransact = getHash.onExtraCallbackWithResult(startclient.onExtraCallback(), setByteOrder.Companion.onTransact(), cameraCaptureResultEmptyCameraCaptureResult, 48, 0);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-664379509);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            jOnTransact = setByteOrder.Companion.onTransact();
        }
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i12 = onWarmupCompleted + 105;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i14 = onNavigationEvent + 27;
            onWarmupCompleted = i14 % 128;
            int i15 = i14 % 2;
        }
        return jOnTransact;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final String onExtraCallbackWithResult(getTyroBlockTime gettyroblocktime, Map<String, ? extends DefaultLoggerProxyImpl> map) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        if (gettyroblocktime instanceof getTyroBlockTime.onWarmupCompleted) {
            return onExtraCallback((getTyroBlockTime.onWarmupCompleted) gettyroblocktime);
        }
        if (!(gettyroblocktime instanceof getTyroBlockTime.onNavigationEvent)) {
            if (gettyroblocktime == null) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        int i2 = onWarmupCompleted + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (!IAuthTabCallback((getTyroBlockTime.onNavigationEvent) gettyroblocktime, map)) {
            return "no_history";
        }
        int i4 = onNavigationEvent + 39;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final String onExtraCallback(getTyroBlockTime.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = onwarmupcompleted.onNavigationEvent();
        if (strOnNavigationEvent != null) {
            int i4 = onWarmupCompleted + 111;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            if (!StringsKt.isBlank(strOnNavigationEvent)) {
                return strOnNavigationEvent;
            }
        }
        int i6 = onWarmupCompleted + 43;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return "no_registered";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[PHI: r6
      0x002f: PHI (r6v4 java.util.Collection) = (r6v3 java.util.Collection), (r6v15 java.util.Collection) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean IAuthTabCallback(getTyroBlockTime.onNavigationEvent onnavigationevent, Map<String, ? extends DefaultLoggerProxyImpl> map) {
        Collection collectionValues;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            collectionValues = onnavigationevent.IAuthTabCallback().values();
            int i3 = 93 / 0;
            if (collectionValues instanceof Collection) {
                if (collectionValues.isEmpty()) {
                    int i4 = onWarmupCompleted + 101;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
            }
        } else {
            collectionValues = onnavigationevent.IAuthTabCallback().values();
            if (collectionValues instanceof Collection) {
            }
        }
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            List listOnWarmupCompleted = ((getTyroBlockTime.onNavigationEvent.IAuthTabCallback) it.next()).onWarmupCompleted();
            if ((!(listOnWarmupCompleted instanceof Collection)) || !listOnWarmupCompleted.isEmpty()) {
                Iterator it2 = listOnWarmupCompleted.iterator();
                while (it2.hasNext()) {
                    int i6 = onNavigationEvent + 51;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 == 0) {
                        map.containsKey((String) it2.next());
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (map.containsKey((String) it2.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static final long onNavigationEvent(long j) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0 ? j <= 0 : j <= 1) {
            return 3000L;
        }
        long jCoerceAtLeast = RangesKt.coerceAtLeast(3000 - (SystemClock.elapsedRealtime() - j), 0L);
        int i3 = onWarmupCompleted + 63;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return jCoerceAtLeast;
    }

    private static final Boolean onNavigationEvent(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1) {
        Object next;
        Object next2;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        List listOnTransact = camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallback_Parcel().onTransact();
        Iterator it = listOnTransact.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            int i4 = onNavigationEvent + 9;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            next = it.next();
            if (Intrinsics.areEqual(((Camera2CameraControlExternalSyntheticLambda7) next).onExtraCallback(), "calendar")) {
                break;
            }
        }
        Camera2CameraControlExternalSyntheticLambda7 camera2CameraControlExternalSyntheticLambda7 = (Camera2CameraControlExternalSyntheticLambda7) next;
        if (camera2CameraControlExternalSyntheticLambda7 == null) {
            int i6 = onWarmupCompleted + 83;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }
        Iterator it2 = listOnTransact.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (Intrinsics.areEqual(((Camera2CameraControlExternalSyntheticLambda7) next2).onExtraCallback(), "grey_card_group")) {
                break;
            }
        }
        Camera2CameraControlExternalSyntheticLambda7 camera2CameraControlExternalSyntheticLambda72 = (Camera2CameraControlExternalSyntheticLambda7) next2;
        if (camera2CameraControlExternalSyntheticLambda72 == null) {
            return Boolean.valueOf(camera2CameraControlExternalSyntheticLambda7.onWarmupCompleted() <= 0);
        }
        int iOnWarmupCompleted = camera2CameraControlExternalSyntheticLambda72.onWarmupCompleted();
        int iOnNavigationEvent = camera2CameraControlExternalSyntheticLambda72.onNavigationEvent();
        if (camera2CameraControlExternalSyntheticLambda7.onWarmupCompleted() > 0 || iOnWarmupCompleted + iOnNavigationEvent > 0) {
            z = false;
        } else {
            int i8 = onWarmupCompleted + 7;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        int i10 = onNavigationEvent + 41;
        onWarmupCompleted = i10 % 128;
        if (i10 % 2 != 0) {
            return boolValueOf;
        }
        throw null;
    }

    private static final boolean onExtraCallbackWithResult(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (camera2CameraMetadataExternalSyntheticLambda1.asBinder() > 0 || camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallbackStub() > 0) {
            return true;
        }
        int i4 = onNavigationEvent + 9;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    private static final Object onWarmupCompleted(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (!onExtraCallbackWithResult(camera2CameraMetadataExternalSyntheticLambda1)) {
            int i4 = onWarmupCompleted + 81;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return Unit.INSTANCE;
        }
        Object objOnNavigationEvent = Camera2CameraMetadataExternalSyntheticLambda1.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1, 0, 0, access13800Var, 2, (Object) null);
        return objOnNavigationEvent == access14300.onWarmupCompleted() ? objOnNavigationEvent : Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final boolean onExtraCallbackWithResult(toStringArray tostringarray) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            int i3 = readTypedObject.onExtraCallback[tostringarray.ordinal()];
            obj.hashCode();
            throw null;
        }
        switch (readTypedObject.onExtraCallback[tostringarray.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return true;
            case 4:
            case 5:
            case 6:
            case 7:
                int i4 = onWarmupCompleted + 47;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return false;
                }
                obj.hashCode();
                throw null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final class IAuthTabCallbackStubProxy extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ int $selectedIndex;
        final /* synthetic */ r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult $tabFluidState;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStubProxy(int i, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult, access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(2, access13800Var);
            this.$selectedIndex = i;
            this.$tabFluidState = onextracallbackwithresult;
        }

        public static /* synthetic */ Unit onWarmupCompleted(long j) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 121;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                onNavigationEvent(j);
                throw null;
            }
            Unit unitOnNavigationEvent = onNavigationEvent(j);
            int i3 = IAuthTabCallback + 81;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return unitOnNavigationEvent;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = new IAuthTabCallbackStubProxy(this.$selectedIndex, this.$tabFluidState, access13800Var);
            int i2 = onWarmupCompleted + 45;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallbackStubProxy;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 115;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxyCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                iAuthTabCallbackStubProxyCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = iAuthTabCallbackStubProxyCreate.invokeSuspend(unit);
            int i4 = IAuthTabCallback + 17;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        private static final Unit onNavigationEvent(long j) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 13;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 83;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x009d -> B:24:0x009e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult;
            int i;
            int i2;
            int i3;
            r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult2;
            int i4;
            int i5;
            int i6;
            setContentInsetsRelative setcontentinsetsrelativeOnExtraCallbackWithResult;
            int i7 = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i8 = this.label;
            if (i8 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (this.$selectedIndex == 0) {
                    int i9 = onWarmupCompleted + 75;
                    IAuthTabCallback = i9 % 128;
                    if (i9 % 2 == 0) {
                        onextracallbackwithresult = this.$tabFluidState;
                        i = 5;
                        i2 = 1;
                    } else {
                        onextracallbackwithresult = this.$tabFluidState;
                        i = 2;
                        i2 = 0;
                    }
                    if (i2 < i) {
                    }
                }
                return Unit.INSTANCE;
            }
            if (i8 == 1) {
                int i10 = this.I$3;
                int i11 = this.I$2;
                int i12 = this.I$1;
                int i13 = this.I$0;
                onextracallbackwithresult2 = (r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult) this.L$0;
                ResultKt.onNavigationEvent(obj);
                int i14 = onWarmupCompleted + 77;
                IAuthTabCallback = i14 % 128;
                int i15 = i14 % 2;
                i3 = i10;
                i6 = i12;
                i4 = i11;
                i5 = i13;
                setcontentinsetsrelativeOnExtraCallbackWithResult = onextracallbackwithresult2.onExtraCallbackWithResult();
                this.L$0 = onextracallbackwithresult2;
                this.I$0 = i5;
                this.I$1 = i6;
                this.I$2 = i4;
                this.I$3 = i3;
                this.label = 2;
                if (setcontentinsetsrelativeOnExtraCallbackWithResult.onWarmupCompleted(0, this) != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            if (i8 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i6 = this.I$1;
            i5 = this.I$0;
            r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult3 = (r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult) this.L$0;
            ResultKt.onNavigationEvent(obj);
            onextracallbackwithresult = onextracallbackwithresult3;
            int i16 = i5;
            i2 = i6 + 1;
            i = i16;
            if (i2 < i) {
                CashflowScreenKt$TabsContent$2$1$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new CashflowScreenKt$TabsContent$2$1$.ExternalSyntheticLambda0();
                this.L$0 = onextracallbackwithresult;
                this.I$0 = i;
                this.I$1 = i2;
                this.I$2 = i2;
                this.I$3 = 0;
                this.label = 1;
                if (addSessionCaptureCallback.IAuthTabCallback(externalSyntheticLambda0, this) != objOnWarmupCompleted) {
                    int i17 = onWarmupCompleted + 119;
                    IAuthTabCallback = i17 % 128;
                    int i18 = i17 % 2;
                    onextracallbackwithresult2 = onextracallbackwithresult;
                    i3 = 0;
                    i4 = i2;
                    i5 = i;
                    i6 = i4;
                    setcontentinsetsrelativeOnExtraCallbackWithResult = onextracallbackwithresult2.onExtraCallbackWithResult();
                    this.L$0 = onextracallbackwithresult2;
                    this.I$0 = i5;
                    this.I$1 = i6;
                    this.I$2 = i4;
                    this.I$3 = i3;
                    this.label = 2;
                    if (setcontentinsetsrelativeOnExtraCallbackWithResult.onWarmupCompleted(0, this) != objOnWarmupCompleted) {
                        onextracallbackwithresult = onextracallbackwithresult2;
                        int i162 = i5;
                        i2 = i6 + 1;
                        i = i162;
                        if (i2 < i) {
                        }
                    }
                }
                return objOnWarmupCompleted;
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onNavigationEvent(View view, String str, Function0 function0) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            view.announceForAccessibility(str);
            function0.invoke();
            unit = Unit.INSTANCE;
            int i3 = 12 / 0;
        } else {
            view.announceForAccessibility(str);
            function0.invoke();
            unit = Unit.INSTANCE;
        }
        int i4 = onNavigationEvent + 17;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        getTyroBlockTime gettyroblocktime = (getTyroBlockTime) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(gettyroblocktime.onWarmupCompleted());
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 25 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0087 A[PHI: r1
      0x0087: PHI (r1v19 java.lang.Object) = (r1v18 java.lang.Object), (r1v31 java.lang.Object) binds: [B:28:0x0085, B:25:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(List list, RVLogger.onWarmupCompleted onwarmupcompleted, Function1 function1, String str, x4ExternalSyntheticLambda4 x4externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        Object next;
        Object obj;
        Function0 function0;
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(x4externalsyntheticlambda4, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(x4externalsyntheticlambda4)) {
                i3 = 4;
            } else {
                int i5 = onWarmupCompleted + 47;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i7 = onWarmupCompleted + 77;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(884193983, i2, -1, "im.toss.features.home.feature.cashflow.screen.TabsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CashflowScreen.kt:759)");
            }
            Iterator it = list.iterator();
            int i9 = 0;
            while (it.hasNext()) {
                int i10 = onNavigationEvent + 101;
                onWarmupCompleted = i10 % 128;
                if (i10 % 2 == 0) {
                    next = it.next();
                    int i11 = 65 / 0;
                    if (i9 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                } else {
                    next = it.next();
                    if (i9 < 0) {
                    }
                }
                getTyroBlockTime gettyroblocktime = (getTyroBlockTime) next;
                boolean zAreEqual = Intrinsics.areEqual(gettyroblocktime.onWarmupCompleted(), onwarmupcompleted.IAuthTabCallbackStub());
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(function1);
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(gettyroblocktime);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnNavigationEvent | zOnExtraCallback)) {
                    obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        CashflowScreenKt$.ExternalSyntheticLambda66 externalSyntheticLambda66 = new CashflowScreenKt$.ExternalSyntheticLambda66(function1, gettyroblocktime);
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(externalSyntheticLambda66);
                        obj = externalSyntheticLambda66;
                    }
                }
                Function0 function02 = (Function0) obj;
                String strOnExtraCallbackWithResult = gettyroblocktime.onExtraCallbackWithResult();
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                String strOnWarmupCompleted = stopPhase.onWarmupCompleted.onWarmupCompleted((Resources) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback()), gettyroblocktime.onExtraCallbackWithResult(), zAreEqual, str);
                if (zAreEqual) {
                    function0 = null;
                } else {
                    int i12 = onNavigationEvent + 35;
                    onWarmupCompleted = i12 % 128;
                    int i13 = i12 % 2;
                    function0 = function02;
                }
                x4externalsyntheticlambda4.onExtraCallback(strOnExtraCallbackWithResult, zAreEqual, function02, isValidUrl.onExtraCallback(onextracallback, strOnWarmupCompleted, (Role) null, (String) null, (Boolean) null, (String) null, function0, (List) null, 94, (Object) null), false, false, 0L, (GraphicDeviceInfo) null, 0L, (GraphicDeviceInfo) null, (getBacktraceNote) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 0, (i2 << 9) & 7168, 8176);
                i9++;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                i2 = i2;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i14 = onWarmupCompleted + 7;
                onNavigationEvent = i14 % 128;
                int i15 = i14 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        String strOnWarmupCompleted;
        String strOnExtraCallbackWithResult;
        Function1 function1 = (Function1) objArr[0];
        getTyroBlockTime.onWarmupCompleted onwarmupcompleted = (getTyroBlockTime) objArr[1];
        Function1 function12 = (Function1) objArr[2];
        applyConfig applyconfig = (applyConfig) objArr[3];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            getTyroBlockTime.onWarmupCompleted onwarmupcompleted2 = onwarmupcompleted;
            function1.invoke(onExtraCallback(onwarmupcompleted2));
            onwarmupcompleted2.IAuthTabCallback().onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getTyroBlockTime.onWarmupCompleted onwarmupcompleted3 = onwarmupcompleted;
        function1.invoke(onExtraCallback(onwarmupcompleted3));
        ServerSideRender serverSideRenderOnExtraCallback = onwarmupcompleted3.IAuthTabCallback().onExtraCallback();
        if (serverSideRenderOnExtraCallback != null && (strOnWarmupCompleted = serverSideRenderOnExtraCallback.onWarmupCompleted()) != null && (strOnExtraCallbackWithResult = applyconfig.onExtraCallbackWithResult(strOnWarmupCompleted, onExtraCallback(onwarmupcompleted3))) != null) {
            int i3 = onNavigationEvent + 95;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                function12.invoke(strOnExtraCallbackWithResult);
                int i4 = 70 / 0;
            } else {
                function12.invoke(strOnExtraCallbackWithResult);
            }
            int i5 = onNavigationEvent + 101;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted + 69;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 6 / 0;
        }
        return unit;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0308  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(getTyroBlockTime gettyroblocktime, RVLogger.onWarmupCompleted onwarmupcompleted, InventoryAdManager inventoryAdManager, String str, InventoryAdDto inventoryAdDto, Function1 function1, Function1 function12, Function1 function13, Function0 function0, Function1 function14, Function1 function15, Function1 function16, Function1 function17, getBacktraceNote getbacktracenote, Function2 function2, Function1 function18, Function1 function19, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, boolean z, Function1 function110, applyConfig applyconfig, int i, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult, List list, Function1 function111, String str2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 85;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2080255827, i2, -1, "im.toss.features.home.feature.cashflow.screen.TabsContent.<anonymous> (CashflowScreen.kt:750)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub();
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult2 = QuirkSettingsLoader.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult2.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult3.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i6 = onWarmupCompleted + 43;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i8 = onNavigationEvent + 47;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult3.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult3.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult3.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult3.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult3.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult2.access100(), false);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult3.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                int i10 = onNavigationEvent + 125;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted, onextracallbackwithresult3.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult3.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult3.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult3.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult3.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            x4ExternalSyntheticLambda3.onNavigationEvent(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{Integer.valueOf(i), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback.Square, null, null, onextracallbackwithresult, 0L, null, ForwardingCameraControl.onExtraCallback(884193983, true, new CashflowScreenKt$.ExternalSyntheticLambda58(list, onwarmupcompleted, function111, str2), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 100663728, 216}, -323720451, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 323720470, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult2.onWarmupCompleted()), 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f));
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0IAuthTabCallback, y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null), cameraCaptureResultEmptyCameraCaptureResult, 0);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f)), y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null), cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (!(!(gettyroblocktime instanceof getTyroBlockTime.onNavigationEvent))) {
                int i12 = onWarmupCompleted + 85;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(568601382);
                ReflectUtils.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null), (getTyroBlockTime.onNavigationEvent) gettyroblocktime, onwarmupcompleted.asBinder(), onwarmupcompleted.IAuthTabCallbackDefault(), onwarmupcompleted.getInterfaceDescriptor(), ((Boolean) RVLogger.onWarmupCompleted.onWarmupCompleted(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -1558807617, 1558807619, new Object[]{onwarmupcompleted}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback())).booleanValue(), ((Boolean) RVLogger.onWarmupCompleted.onWarmupCompleted(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -143946419, 143946420, new Object[]{onwarmupcompleted}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback())).booleanValue(), onwarmupcompleted.IAuthTabCallback(), inventoryAdManager, str, inventoryAdDto, function1, function12, function13, function0, function14, function15, function16, function17, getbacktracenote, function2, function18, function19, camera2CameraMetadataExternalSyntheticLambda1, z, cameraCaptureResultEmptyCameraCaptureResult, (InventoryAdManager.onExtraCallbackWithResult << 24) | 6, InventoryAdDto.$stable, 0, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                if (!(gettyroblocktime instanceof getTyroBlockTime.onWarmupCompleted)) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(18340522);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    throw new NoWhenBranchMatchedException();
                }
                int i14 = onWarmupCompleted + 81;
                onNavigationEvent = i14 % 128;
                int i15 = i14 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(570225968);
                getTyroBlockTime.onWarmupCompleted onwarmupcompleted2 = (getTyroBlockTime.onWarmupCompleted) gettyroblocktime;
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function110);
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(gettyroblocktime);
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(applyconfig);
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function18);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnNavigationEvent | zOnExtraCallback | zOnExtraCallback2 | zOnNavigationEvent2)) {
                    int i16 = onNavigationEvent + 75;
                    onWarmupCompleted = i16 % 128;
                    int i17 = i16 % 2;
                    Object obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        CashflowScreenKt$.ExternalSyntheticLambda59 externalSyntheticLambda59 = new CashflowScreenKt$.ExternalSyntheticLambda59(function110, gettyroblocktime, function18, applyconfig);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda59);
                        obj = externalSyntheticLambda59;
                    }
                    parseDouble.onExtraCallback(onwarmupcompleted2, (Function0) obj, (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 4);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i18 = onWarmupCompleted + 79;
                onNavigationEvent = i18 % 128;
                int i19 = i18 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:262:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        Function1 function1;
        int i;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        int i2;
        Function1 function12;
        Function0 function0;
        Function1 function13;
        String str;
        Function1 function14;
        Function0 function02;
        Function0 function03;
        Function1 function15;
        Function1 function16;
        Function1 function17;
        String str2;
        Function1 function18;
        Function1 function19;
        getBacktraceNote getbacktracenote;
        int i3;
        Function1 function110;
        Function1 function111;
        Function1 function112;
        Function1 function113;
        Function1 function114;
        boolean z;
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1;
        InventoryAdDto inventoryAdDto;
        String str3;
        InventoryAdManager inventoryAdManager;
        RVLogger.onWarmupCompleted onwarmupcompleted;
        int i4;
        Function0 function04;
        Function1 function115;
        Function1 function116;
        getBacktraceNote getbacktracenote2;
        Function2 function2;
        Function1 function117;
        Function1 function118;
        Function1 function119;
        View view;
        String str4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        Object obj;
        Function1 function120;
        Function1 function121;
        int i5;
        Object iAuthTabCallbackStubProxy;
        boolean z2;
        String str5;
        Function0 function05;
        Object obj2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Function2 externalSyntheticLambda1;
        int i6;
        int i7;
        int i8;
        boolean zOnExtraCallback;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = (QuirksExternalSyntheticBackport0) objArr[0];
        RVLogger.onWarmupCompleted onwarmupcompleted2 = (RVLogger.onWarmupCompleted) objArr[1];
        InventoryAdManager inventoryAdManager2 = (InventoryAdManager) objArr[2];
        String str6 = (String) objArr[3];
        InventoryAdDto inventoryAdDto2 = (InventoryAdDto) objArr[4];
        applyConfig applyconfig = (applyConfig) objArr[5];
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda12 = (Camera2CameraMetadataExternalSyntheticLambda1) objArr[6];
        boolean zBooleanValue = ((Boolean) objArr[7]).booleanValue();
        Function1 function122 = (Function1) objArr[8];
        Function1 function123 = (Function1) objArr[9];
        Function1 function124 = (Function1) objArr[10];
        Function1 function125 = (Function1) objArr[11];
        Function0 function06 = (Function0) objArr[12];
        Function1 function126 = (Function1) objArr[13];
        String str7 = (String) objArr[14];
        Function0 function07 = (Function0) objArr[15];
        Function1 function127 = (Function1) objArr[16];
        Function1 function128 = (Function1) objArr[17];
        Function1 function129 = (Function1) objArr[18];
        getBacktraceNote getbacktracenote3 = (getBacktraceNote) objArr[19];
        Function2 function22 = (Function2) objArr[20];
        Function1 function130 = (Function1) objArr[21];
        Function1 function131 = (Function1) objArr[22];
        Function1 function132 = (Function1) objArr[23];
        View view2 = (View) objArr[24];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[25];
        int iIntValue = ((Number) objArr[26]).intValue();
        int iIntValue2 = ((Number) objArr[27]).intValue();
        int iIntValue3 = ((Number) objArr[28]).intValue();
        int i9 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1859178307);
        if ((iIntValue & 6) == 0) {
            int i10 = onWarmupCompleted + 69;
            function1 = function125;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            i = (!(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport03) ^ true) ? 4 : 2) | iIntValue;
        } else {
            function1 = function125;
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted2) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            if ((iIntValue & 512) == 0) {
                int i12 = onNavigationEvent + 3;
                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport03;
                onWarmupCompleted = i12 % 128;
                if (i12 % 2 == 0) {
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(inventoryAdManager2);
                    int i13 = 51 / 0;
                } else {
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(inventoryAdManager2);
                }
            } else {
                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport03;
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(inventoryAdManager2);
            }
            i |= zOnExtraCallback ? 256 : 128;
        } else {
            quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport03;
        }
        if ((iIntValue & 3072) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str6) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i |= (32768 & iIntValue) == 0 ? cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(inventoryAdDto2) : cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(inventoryAdDto2) ? 16384 : 8192;
        }
        if ((196608 & iIntValue) == 0) {
            i |= (262144 & iIntValue) == 0 ? cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(applyconfig) : cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(applyconfig) ? 131072 : 65536;
        }
        Object obj3 = null;
        if ((1572864 & iIntValue) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda12)) {
                int i14 = onNavigationEvent + 91;
                onWarmupCompleted = i14 % 128;
                if (i14 % 2 == 0) {
                    obj3.hashCode();
                    throw null;
                }
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i |= i8;
        }
        if ((12582912 & iIntValue) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue) ? 8388608 : 4194304;
        }
        if ((iIntValue & 100663296) == 0) {
            int i15 = onNavigationEvent + 77;
            onWarmupCompleted = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 56 / 0;
                i7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function122) ? 67108864 : 33554432;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function122)) {
            }
            i |= i7;
        }
        if ((805306368 & iIntValue) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function123) ? 536870912 : 268435456;
        }
        int i17 = i;
        if ((iIntValue2 & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function124)) {
                int i18 = onWarmupCompleted + 51;
                onNavigationEvent = i18 % 128;
                int i19 = i18 % 2;
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | iIntValue2;
        } else {
            i2 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            function12 = function1;
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 32 : 16;
        } else {
            function12 = function1;
        }
        if ((iIntValue2 & 384) == 0) {
            function0 = function06;
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 256 : 128;
        } else {
            function0 = function06;
        }
        if ((iIntValue2 & 3072) == 0) {
            function13 = function126;
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function13) ^ true ? 1024 : 2048;
        } else {
            function13 = function126;
        }
        Function1 function133 = function13;
        if ((iIntValue2 & 24576) == 0) {
            str = str7;
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 16384 : 8192;
        } else {
            str = str7;
        }
        if ((iIntValue2 & 196608) == 0) {
            function14 = function12;
            function02 = function07;
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 131072 : 65536;
        } else {
            function14 = function12;
            function02 = function07;
        }
        if ((iIntValue2 & 1572864) == 0) {
            function03 = function02;
            function15 = function127;
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function15) ? 1048576 : 524288;
        } else {
            function03 = function02;
            function15 = function127;
        }
        if ((iIntValue2 & 12582912) == 0) {
            function16 = function15;
            function17 = function128;
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function17) ? 8388608 : 4194304;
        } else {
            function16 = function15;
            function17 = function128;
        }
        if ((iIntValue2 & 100663296) == 0) {
            str2 = str;
            int i20 = onWarmupCompleted + 9;
            function18 = function17;
            onNavigationEvent = i20 % 128;
            function19 = function129;
            if (i20 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function19);
                throw null;
            }
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function19) ? 67108864 : 33554432;
        } else {
            str2 = str;
            function18 = function17;
            function19 = function129;
        }
        if ((805306368 & iIntValue2) == 0) {
            getbacktracenote = getbacktracenote3;
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 536870912 : 268435456;
        } else {
            getbacktracenote = getbacktracenote3;
        }
        Function1 function134 = function19;
        if ((iIntValue3 & 6) == 0) {
            i3 = iIntValue3 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function22) ? 4 : 2);
        } else {
            i3 = iIntValue3;
        }
        if ((iIntValue3 & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function130) ? 32 : 16;
        }
        Function0 function08 = function0;
        getBacktraceNote getbacktracenote4 = getbacktracenote;
        if ((iIntValue3 & 384) == 0) {
            function110 = function131;
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function110) ? 256 : 128;
        } else {
            function110 = function131;
        }
        Function1 function135 = function110;
        if ((iIntValue3 & 3072) == 0) {
            function111 = function132;
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function111) ? 2048 : 1024;
        } else {
            function111 = function132;
        }
        Function1 function136 = function111;
        if ((iIntValue3 & 24576) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(view2) ? 16384 : 8192;
            view2 = view2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i17 & 306783379) == 306783378 && (306783379 & i2) == 306783378 && (i3 & 9363) == 9362) ? false : true, i17 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1859178307, i17, i2, "im.toss.features.home.feature.cashflow.screen.TabsContent (CashflowScreen.kt:719)");
            }
            List list = (List) RVLogger.onWarmupCompleted.onWarmupCompleted(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 915695779, -915695779, new Object[]{onwarmupcompleted2}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
            if (list.isEmpty()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1116188230);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport0;
                FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport04, 0.0f, 1, (Object) null), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    return null;
                }
                externalSyntheticLambda1 = new CashflowScreenKt$.ExternalSyntheticLambda0(quirksExternalSyntheticBackport04, onwarmupcompleted2, inventoryAdManager2, str6, inventoryAdDto2, applyconfig, camera2CameraMetadataExternalSyntheticLambda12, zBooleanValue, function122, function123, function124, function14, function08, function133, str2, function03, function16, function18, function134, getbacktracenote4, function22, function130, function135, function136, view2, iIntValue, iIntValue2, iIntValue3);
            } else {
                function112 = function124;
                function113 = function123;
                function114 = function122;
                z = zBooleanValue;
                i4 = iIntValue2;
                Function0 function09 = function03;
                function115 = function18;
                function116 = function134;
                getbacktracenote2 = getbacktracenote4;
                function2 = function22;
                function117 = function130;
                function118 = function135;
                function119 = function136;
                View view3 = view2;
                String str8 = str2;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport0;
                function120 = function16;
                function121 = function133;
                i5 = iIntValue;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1116121921);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                Iterator it = list.iterator();
                int i21 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i21 = -1;
                        break;
                    }
                    if (Intrinsics.areEqual(((getTyroBlockTime) it.next()).onWarmupCompleted(), onwarmupcompleted2.IAuthTabCallbackStub())) {
                        break;
                    }
                    i21++;
                }
                int iCoerceAtLeast = RangesKt.coerceAtLeast(i21, 0);
                getTyroBlockTime gettyroblocktime = (getTyroBlockTime) CollectionsKt.getOrNull(list, iCoerceAtLeast);
                if (gettyroblocktime == null) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        return null;
                    }
                    externalSyntheticLambda1 = new CashflowScreenKt$.ExternalSyntheticLambda1(quirksExternalSyntheticBackport05, onwarmupcompleted2, inventoryAdManager2, str6, inventoryAdDto2, applyconfig, camera2CameraMetadataExternalSyntheticLambda12, z, function114, function113, function112, function14, function08, function121, str8, function09, function120, function115, function116, getbacktracenote2, function2, function117, function118, function119, view3, i5, i4, iIntValue3);
                } else {
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((getTyroBlockTime) it2.next()).onWarmupCompleted());
                    }
                    boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(arrayList);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!zOnNavigationEvent) {
                        Object obj4 = objOnMinimized;
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult = new r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult(new setContentInsetsRelative(0));
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(onextracallbackwithresult);
                            obj4 = onextracallbackwithresult;
                        }
                        r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult2 = (r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult) obj4;
                        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iCoerceAtLeast);
                        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallbackwithresult2);
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!(zOnExtraCallback2 | zOnNavigationEvent2)) {
                            int i22 = onWarmupCompleted + 11;
                            onNavigationEvent = i22 % 128;
                            if (i22 % 2 != 0) {
                                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                                throw null;
                            }
                            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                iAuthTabCallbackStubProxy = new IAuthTabCallbackStubProxy(iCoerceAtLeast, onextracallbackwithresult2, null);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(iAuthTabCallbackStubProxy);
                            } else {
                                iAuthTabCallbackStubProxy = objOnMinimized2;
                            }
                            isZslDisabledByByUserCaseConfig.onExtraCallback(onextracallbackwithresult2, Integer.valueOf(iCoerceAtLeast), (Function2) iAuthTabCallbackStubProxy, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R$string.home_v2_feature_cashflow_accessibility_selected, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            boolean zICustomTabsCallback = onwarmupcompleted2.ICustomTabsCallback();
                            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(view3);
                            boolean z3 = (i2 & 57344) == 16384;
                            if ((i2 & 458752) == 131072) {
                                int i23 = onNavigationEvent + 87;
                                onWarmupCompleted = i23 % 128;
                                int i24 = i23 % 2;
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!(z3 | zOnExtraCallback3 | z2)) {
                                int i25 = onNavigationEvent + 59;
                                onWarmupCompleted = i25 % 128;
                                int i26 = i25 % 2;
                                if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    str5 = str8;
                                    function05 = function09;
                                    CashflowScreenKt$.ExternalSyntheticLambda2 externalSyntheticLambda2 = new CashflowScreenKt$.ExternalSyntheticLambda2(view3, str5, function05);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda2);
                                    obj2 = externalSyntheticLambda2;
                                } else {
                                    str5 = str8;
                                    function05 = function09;
                                    obj2 = objOnMinimized3;
                                }
                                view = view3;
                                function04 = function05;
                                obj = null;
                                camera2CameraMetadataExternalSyntheticLambda1 = camera2CameraMetadataExternalSyntheticLambda12;
                                inventoryAdDto = inventoryAdDto2;
                                str3 = str6;
                                inventoryAdManager = inventoryAdManager2;
                                onwarmupcompleted = onwarmupcompleted2;
                                str4 = str5;
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport05;
                                LottieDrawableExternalSyntheticLambda2.onExtraCallback(zICustomTabsCallback, quirksExternalSyntheticBackport02, false, false, 0.0f, 0, (LottieDrawableExternalSyntheticLambda3) null, (Function0) obj2, ForwardingCameraControl.onExtraCallback(-2080255827, true, new CashflowScreenKt$.ExternalSyntheticLambda3(gettyroblocktime, onwarmupcompleted2, inventoryAdManager2, str6, inventoryAdDto2, function113, function112, function14, function08, function121, function120, function115, function116, getbacktracenote2, function2, function119, function118, camera2CameraMetadataExternalSyntheticLambda1, z, function117, applyconfig, iCoerceAtLeast, onextracallbackwithresult2, list, function114, strOnExtraCallback), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i17 << 3) & 112) | 100663296, 124);
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    int i27 = onNavigationEvent + 125;
                                    onWarmupCompleted = i27 % 128;
                                    if (i27 % 2 == 0) {
                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                        obj.hashCode();
                                        throw null;
                                    }
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                            }
                        }
                    }
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(externalSyntheticLambda1);
            return null;
        }
        function112 = function124;
        function113 = function123;
        function114 = function122;
        z = zBooleanValue;
        camera2CameraMetadataExternalSyntheticLambda1 = camera2CameraMetadataExternalSyntheticLambda12;
        inventoryAdDto = inventoryAdDto2;
        str3 = str6;
        inventoryAdManager = inventoryAdManager2;
        onwarmupcompleted = onwarmupcompleted2;
        i4 = iIntValue2;
        function04 = function03;
        function115 = function18;
        function116 = function134;
        getbacktracenote2 = getbacktracenote4;
        function2 = function22;
        function117 = function130;
        function118 = function135;
        function119 = function136;
        view = view2;
        str4 = str2;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        obj = null;
        function120 = function16;
        function121 = function133;
        i5 = iIntValue;
        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel2 == null) {
            return obj;
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel2.onExtraCallback(new CashflowScreenKt$.ExternalSyntheticLambda4(quirksExternalSyntheticBackport02, onwarmupcompleted, inventoryAdManager, str3, inventoryAdDto, applyconfig, camera2CameraMetadataExternalSyntheticLambda1, z, function114, function113, function112, function14, function08, function121, str4, function04, function120, function115, function116, getbacktracenote2, function2, function117, function118, function119, view, i5, i4, iIntValue3));
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 77;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1650710804);
            throw null;
        }
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1650710804);
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            int i4 = onNavigationEvent + 65;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 21 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1650710804, i, -1, "im.toss.features.home.feature.cashflow.screen.CashflowLoading (CashflowScreen.kt:843)");
                }
                x2ExternalSyntheticLambda24.onExtraCallback(x2ExternalSyntheticLambda25.IAuthTabCallback.onExtraCallback.onExtraCallbackWithResult, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), (x2ExternalSyntheticLambda28) null, (x2ExternalSyntheticLambda25.onExtraCallback) null, 0L, (DeviceQuirksExternalSyntheticLambda0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54, 60);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                x2ExternalSyntheticLambda24.onExtraCallback(x2ExternalSyntheticLambda25.IAuthTabCallback.onExtraCallback.onExtraCallbackWithResult, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), (x2ExternalSyntheticLambda28) null, (x2ExternalSyntheticLambda25.onExtraCallback) null, 0L, (DeviceQuirksExternalSyntheticLambda0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54, 60);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CashflowScreenKt$.ExternalSyntheticLambda65(i));
            int i6 = onWarmupCompleted + 93;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = onWarmupCompleted + 31;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        int i;
        Object obj;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i2;
        String message;
        String simpleName;
        int i3;
        Throwable th = (Throwable) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 43;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(-1479346674);
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(th)) {
                int i7 = onNavigationEvent + 39;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            int i9 = onWarmupCompleted + 47;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 32 : 16;
        }
        int i11 = i;
        Object obj2 = null;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(!((i11 & 19) == 18), i11 & 1)) {
            int i12 = onNavigationEvent + 25;
            onWarmupCompleted = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 38 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1479346674, i11, -1, "im.toss.features.home.feature.cashflow.screen.CashflowError (CashflowScreen.kt:851)");
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
                String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R$string.home_v2_feature_cashflow_error_title, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                message = th.getMessage();
                if (message != null) {
                    int i14 = onWarmupCompleted + 25;
                    onNavigationEvent = i14 % 128;
                    if (i14 % 2 != 0) {
                        th.getClass().getSimpleName();
                        obj2.hashCode();
                        throw null;
                    }
                    simpleName = th.getClass().getSimpleName();
                } else {
                    simpleName = message;
                }
                obj = null;
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i2 = iIntValue;
                x2ExternalSyntheticLambda13.onNavigationEvent(quirksExternalSyntheticBackport0OnNavigationEvent, 0L, 0.0f, (getPrivacyDestinationUri.onExtraCallbackWithResult) null, 0L, strOnExtraCallback, (deprecated_followRedirects) null, simpleName, function0, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R$string.home_v2_feature_cashflow_button_retry, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), setCallToAction.onWarmupCompleted.Primary, setCallToAction.onExtraCallback.Fill, cameraCaptureResultEmptyCameraCaptureResult, ((i11 << 21) & 234881024) | 6, 54, 94);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
                String strOnExtraCallback2 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R$string.home_v2_feature_cashflow_error_title, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                message = th.getMessage();
                if (message != null) {
                }
                obj = null;
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i2 = iIntValue;
                x2ExternalSyntheticLambda13.onNavigationEvent(quirksExternalSyntheticBackport0OnNavigationEvent2, 0L, 0.0f, (getPrivacyDestinationUri.onExtraCallbackWithResult) null, 0L, strOnExtraCallback2, (deprecated_followRedirects) null, simpleName, function0, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R$string.home_v2_feature_cashflow_button_retry, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), setCallToAction.onWarmupCompleted.Primary, setCallToAction.onExtraCallback.Fill, cameraCaptureResultEmptyCameraCaptureResult, ((i11 << 21) & 234881024) | 6, 54, 94);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            obj = null;
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            i2 = iIntValue;
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CashflowScreenKt$.ExternalSyntheticLambda62(th, function0, i2));
        }
        return obj;
    }

    private static final YearMonth onExtraCallbackWithResult(YearMonth yearMonth) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(yearMonth, "");
        YearMonth yearMonthMinusMonths = yearMonth.minusMonths(1L);
        int i4 = onWarmupCompleted + 9;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return yearMonthMinusMonths;
    }

    private static final boolean IAuthTabCallback(RVClientStarter rVClientStarter, YearMonth yearMonth) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(yearMonth, "");
        boolean z = !yearMonth.isBefore(rVClientStarter.IAuthTabCallback());
        int i4 = onWarmupCompleted + 71;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final List<YearMonth> onNavigationEvent(RVClientStarter rVClientStarter) {
        int i = 2 % 2;
        List<YearMonth> listAccess000 = clearRevision.access000(clearRevision.onTransact(clearRevision.onExtraCallbackWithResult(rVClientStarter.onExtraCallback(), new CashflowScreenKt$.ExternalSyntheticLambda55()), new CashflowScreenKt$.ExternalSyntheticLambda56(rVClientStarter)));
        int i2 = onWarmupCompleted + 41;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 11 / 0;
        }
        return listAccess000;
    }

    private static final List<YearMonth> onExtraCallback(RVClientStarter rVClientStarter, YearMonth yearMonth) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        List<YearMonth> listSortedDescending = CollectionsKt.sortedDescending(CollectionsKt.distinct(CollectionsKt.plus(onNavigationEvent(rVClientStarter), yearMonth)));
        int i4 = onWarmupCompleted + 33;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return listSortedDescending;
    }

    private static final List<YearMonth> onExtraCallbackWithResult(RVClientStarter rVClientStarter, YearMonth yearMonth) {
        int i = 2 % 2;
        YearMonth yearMonthPlusMonths = yearMonth.plusMonths(1L);
        YearMonth yearMonthMinusMonths = yearMonth.minusMonths(1L);
        YearMonth yearMonthOnExtraCallbackWithResult = onExtraCallbackWithResult(rVClientStarter);
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        if (!yearMonthPlusMonths.isAfter(yearMonthOnExtraCallbackWithResult)) {
            listCreateListBuilder.add(yearMonthPlusMonths);
        }
        listCreateListBuilder.add(yearMonth);
        if (!yearMonthMinusMonths.isBefore(rVClientStarter.IAuthTabCallback())) {
            int i2 = onWarmupCompleted + 93;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                listCreateListBuilder.add(yearMonthMinusMonths);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            listCreateListBuilder.add(yearMonthMinusMonths);
        }
        List<YearMonth> listSortedDescending = CollectionsKt.sortedDescending(CollectionsKt.distinct(CollectionsKt.build(listCreateListBuilder)));
        int i3 = onNavigationEvent + 5;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 30 / 0;
        }
        return listSortedDescending;
    }

    private static final YearMonth onExtraCallbackWithResult(RVClientStarter rVClientStarter) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (!rVClientStarter.onExtraCallback().isAfter(YearMonth.now())) {
            YearMonth yearMonthNow = YearMonth.now();
            Intrinsics.checkNotNullExpressionValue(yearMonthNow, "");
            return yearMonthNow;
        }
        int i4 = onNavigationEvent + 73;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return rVClientStarter.onExtraCallback();
        }
        rVClientStarter.onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        List list = (List) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(list.get(iIntValue));
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 57;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
        return unit;
    }

    private static final void onNavigationEvent(Context context, Resources resources, YearMonth yearMonth, List<YearMonth> list, Function1<? super YearMonth, Unit> function1) {
        int i = 2 % 2;
        BrickModuleImplExternalSyntheticLambda1.IAuthTabCallback iAuthTabCallbackOnExtraCallback = new BrickModuleImplExternalSyntheticLambda1.IAuthTabCallback(context).onExtraCallback(R$string.home_v2_feature_cashflow_select_month).onWarmupCompleted(false).onExtraCallback(true);
        List<YearMonth> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        int i2 = onNavigationEvent + 41;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 2 % 4;
        }
        while (it.hasNext()) {
            String string = ((YearMonth) it.next()).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            arrayList.add(isRemoteExtension.onNavigationEvent(string, CommonModule_closeView.onWarmupCompleted.extraCallbackWithResult(), CheckMask.onWarmupCompleted.onExtraCallback.onExtraCallbackWithResult(), resources));
        }
        Object[] objArr = {iAuthTabCallbackOnExtraCallback.onExtraCallbackWithResult(arrayList).onExtraCallback(new CashflowScreenKt$.ExternalSyntheticLambda57(function1, list)).IAuthTabCallback(list.indexOf(yearMonth))};
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        ((BrickModuleImplExternalSyntheticLambda1) BrickModuleImplExternalSyntheticLambda1.IAuthTabCallback.onExtraCallback(objArr, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent, -846891035, 846891035, iOnNavigationEvent2)).show();
        int i4 = onWarmupCompleted + 79;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031 A[PHI: r1
      0x0031: PHI (r1v6 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v2 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v7 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x002d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[PHI: r1
      0x002f: PHI (r1v3 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v2 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v7 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x002d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(730858366);
            int i3 = 9 / 0;
            z = iIntValue != 0;
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(730858366);
            if (iIntValue != 0) {
            }
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, iIntValue & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            int i4 = onNavigationEvent + 11;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(730858366, iIntValue, -1, "im.toss.features.home.feature.cashflow.screen.CashflowLoadingPreview (CashflowScreen.kt:921)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(TypeUtils.IAuthTabCallback.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onNavigationEvent + 79;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i6 = 90 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CashflowScreenKt$.ExternalSyntheticLambda67(iIntValue));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
    
        return (o.getTyroBlockTime) r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final getTyroBlockTime onExtraCallback(RVLogger.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Iterator it = ((List) RVLogger.onWarmupCompleted.onWarmupCompleted(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 915695779, -915695779, new Object[]{onwarmupcompleted}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback())).iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(!Intrinsics.areEqual(((getTyroBlockTime) next).onWarmupCompleted(), onwarmupcompleted.IAuthTabCallbackStub()))) {
                int i4 = onNavigationEvent + 71;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                obj = next;
            }
        }
    }

    private static /* synthetic */ Object extraCommand(Object[] objArr) {
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = (Camera2CameraMetadataExternalSyntheticLambda1) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        List listOnTransact = camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallback_Parcel().onTransact();
        if (listOnTransact instanceof Collection) {
            int i4 = onWarmupCompleted + 11;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            if (listOnTransact.isEmpty()) {
                return false;
            }
        }
        Iterator it = listOnTransact.iterator();
        while (!(!it.hasNext())) {
            int i6 = onNavigationEvent + 83;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                boolean z = ((Camera2CameraControlExternalSyntheticLambda7) it.next()).onExtraCallback() instanceof String;
                throw null;
            }
            Object objOnExtraCallback = ((Camera2CameraControlExternalSyntheticLambda7) it.next()).onExtraCallback();
            String str = objOnExtraCallback instanceof String ? (String) objOnExtraCallback : null;
            if (str != null) {
                int i7 = onWarmupCompleted + 1;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                if (StringsKt.startsWith$default(str, "txn_row_", false, 2, (Object) null)) {
                    int i9 = onNavigationEvent + 15;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    return true;
                }
            }
        }
        int i11 = onNavigationEvent + 119;
        onWarmupCompleted = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    private static final RVLogger IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<? extends RVLogger> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        RVLogger rVLogger = (RVLogger) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = onNavigationEvent + 101;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return rVLogger;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        mergeJsonWhitoutRecursive mergejsonwhitoutrecursive = (mergeJsonWhitoutRecursive) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            int i4 = 71 / 0;
        }
        int i5 = onNavigationEvent + 27;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return mergejsonwhitoutrecursive;
    }

    private static final decrementVideoUsage IAuthTabCallback(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, Function0 function0, Function0 function02, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        CashflowScreenKt$.ExternalSyntheticLambda54 externalSyntheticLambda54 = new CashflowScreenKt$.ExternalSyntheticLambda54(function0, function02);
        textFieldScrollKtExternalSyntheticLambda0.getLifecycle().IAuthTabCallback(externalSyntheticLambda54);
        asInterface asinterface = new asInterface(textFieldScrollKtExternalSyntheticLambda0, externalSyntheticLambda54);
        int i2 = onWarmupCompleted + 65;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return asinterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Function2<YearMonth, String, Unit> onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6<? extends Function2<? super YearMonth, ? super String, Unit>> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Function2<YearMonth, String, Unit> function2 = (Function2) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = onNavigationEvent + 111;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return function2;
    }

    private static final Function0<Unit> onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6<? extends Function0<Unit>> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Function0<Unit> function0 = (Function0) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = onWarmupCompleted + 21;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return function0;
        }
        throw null;
    }

    private static final boolean IAuthTabCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = onWarmupCompleted + 39;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final void onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onWarmupCompleted + 5;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final boolean onExtraCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = onNavigationEvent + 31;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(zBooleanValue));
        int i4 = onNavigationEvent + 41;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final String onWarmupCompleted(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        int i4 = onNavigationEvent + 43;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static final void onWarmupCompleted(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(str);
        int i4 = onWarmupCompleted + 105;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, CommonAppExitExtension commonAppExitExtension, Function1 function12) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(-1497115568, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{function1, commonAppExitExtension, function12}, iOnExtraCallbackWithResult, 1497115576, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit IAuthTabCallback(CashflowViewModel cashflowViewModel, YearMonth yearMonth, String str) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(-1576277396, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{cashflowViewModel, yearMonth, str}, iOnExtraCallbackWithResult, 1576277419, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onWarmupCompleted(DefaultAppOperatorImpl defaultAppOperatorImpl, RVLogger.onWarmupCompleted onwarmupcompleted, Function1 function1, Function1 function12) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(678877124, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{defaultAppOperatorImpl, onwarmupcompleted, function1, function12}, iOnExtraCallbackWithResult, -678877099, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    public static /* synthetic */ YearMonth onExtraCallback(YearMonth yearMonth) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (YearMonth) IAuthTabCallback(-320434814, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{yearMonth}, iOnExtraCallbackWithResult, 320434827, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0, Function0 function02) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(1321931680, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{function0, function02}, iOnExtraCallbackWithResult, -1321931652, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CashflowViewModel cashflowViewModel, Function1 function1, DefaultLoggerProxyImpl.onExtraCallbackWithResult onextracallbackwithresult, int i, String str) {
        return (Unit) IAuthTabCallback(-907518186, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{cashflowViewModel, function1, onextracallbackwithresult, Integer.valueOf(i), str}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 907518207, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit IAuthTabCallback(CashflowViewModel cashflowViewModel, CommonAppExitExtension commonAppExitExtension) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(-2094188447, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{cashflowViewModel, commonAppExitExtension}, iOnExtraCallbackWithResult, 2094188482, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0, Function0 function02) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(1014628907, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{function0, function02}, iOnExtraCallbackWithResult, -1014628895, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    public static /* synthetic */ decrementVideoUsage onExtraCallback(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, Function0 function0, Function0 function02, isInVideoUsage isinvideousage) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (decrementVideoUsage) IAuthTabCallback(188525173, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{textFieldScrollKtExternalSyntheticLambda0, function0, function02, isinvideousage}, iOnExtraCallbackWithResult, -188525170, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onExtraCallback(CashflowViewModel cashflowViewModel, CommonAppExitExtension commonAppExitExtension) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(-1660154671, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{cashflowViewModel, commonAppExitExtension}, iOnExtraCallbackWithResult, 1660154688, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, getTyroBlockTime gettyroblocktime) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(-1468185330, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{function1, gettyroblocktime}, iOnExtraCallbackWithResult, 1468185359, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getTyroBlockTime gettyroblocktime, RVLogger.onWarmupCompleted onwarmupcompleted, InventoryAdManager inventoryAdManager, String str, InventoryAdDto inventoryAdDto, Function1 function1, Function1 function12, Function1 function13, Function0 function0, Function1 function14, Function1 function15, Function1 function16, Function1 function17, getBacktraceNote getbacktracenote, Function2 function2, Function1 function18, Function1 function19, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, boolean z, Function1 function110, applyConfig applyconfig, int i, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallbackWithResult onextracallbackwithresult, List list, Function1 function111, String str2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) IAuthTabCallback(516400183, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{gettyroblocktime, onwarmupcompleted, inventoryAdManager, str, inventoryAdDto, function1, function12, function13, function0, function14, function15, function16, function17, getbacktracenote, function2, function18, function19, camera2CameraMetadataExternalSyntheticLambda1, Boolean.valueOf(z), function110, applyconfig, Integer.valueOf(i), onextracallbackwithresult, list, function111, str2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -516400159, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit IAuthTabCallback(List list, RVLogger.onWarmupCompleted onwarmupcompleted, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Context context, Resources resources, List list2, Function1 function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(-989218513, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{list, onwarmupcompleted, function0, function02, function03, function04, context, resources, list2, function1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 989218513, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit IAuthTabCallbackStubProxy(CashflowViewModel cashflowViewModel) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(-1200439601, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{cashflowViewModel}, iOnExtraCallbackWithResult, 1200439615, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(List list, RVLogger.onWarmupCompleted onwarmupcompleted, Function1 function1, String str, x4ExternalSyntheticLambda4 x4externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(798846802, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{list, onwarmupcompleted, function1, str, x4externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -798846783, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    private static final Unit onNavigationEvent(List list, RVLogger.onWarmupCompleted onwarmupcompleted, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Context context, Resources resources, List list2, Function1 function1, Function1 function12, Function1 function13, Function0 function05, Function1 function14, Function0 function06, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(-1382629473, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{list, onwarmupcompleted, function0, function02, function03, function04, context, resources, list2, function1, function12, function13, function05, function14, function06, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1382629480, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    private static final Unit onNavigationEvent(RVLogger.onWarmupCompleted onwarmupcompleted, Function0 function0, Function1 function1, YearMonth yearMonth) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(1475853367, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{onwarmupcompleted, function0, function1, yearMonth}, iOnExtraCallbackWithResult, -1475853333, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    private static final Unit IAuthTabCallback(RVLogger.onWarmupCompleted onwarmupcompleted, Function0 function0, Function1 function1, String str) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(404820933, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{onwarmupcompleted, function0, function1, str}, iOnExtraCallbackWithResult, -404820903, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    private static final void onNavigationEvent(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        IAuthTabCallback(-1205514679, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1205514689, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    public static final void IAuthTabCallback(@NotNull Throwable th, @NotNull Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        IAuthTabCallback(-305695574, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{th, function0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 305695596, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    private static final void onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        IAuthTabCallback(-414590168, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 414590186, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    private static final Unit onExtraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) IAuthTabCallback(238508972, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -238508941, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    private static final Unit onExtraCallback(CashflowViewModel cashflowViewModel, int i) {
        return (Unit) IAuthTabCallback(1918297013, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{cashflowViewModel, Integer.valueOf(i)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1918297011, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    private static final Unit onWarmupCompleted(CashflowViewModel cashflowViewModel, debug debugVar) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(177411133, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{cashflowViewModel, debugVar}, iOnExtraCallbackWithResult, -177411117, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    private static final Unit onExtraCallbackWithResult(ImageLoaderBuilderExternalSyntheticLambda6 imageLoaderBuilderExternalSyntheticLambda6, CashflowViewModel cashflowViewModel, RVLogger rVLogger, Function1 function1, DefaultLoggerProxyImpl.IAuthTabCallback iAuthTabCallback) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(440720837, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{imageLoaderBuilderExternalSyntheticLambda6, cashflowViewModel, rVLogger, function1, iAuthTabCallback}, iOnExtraCallbackWithResult, -440720833, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    private static final Unit onExtraCallback(CashflowViewModel cashflowViewModel, Function1 function1, DefaultLoggerProxyImpl.onExtraCallbackWithResult onextracallbackwithresult, int i, String str) {
        return (Unit) IAuthTabCallback(1936353096, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{cashflowViewModel, function1, onextracallbackwithresult, Integer.valueOf(i), str}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1936353060, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    private static final Unit onTransact(CashflowViewModel cashflowViewModel, String str) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(1715808164, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{cashflowViewModel, str}, iOnExtraCallbackWithResult, -1715808131, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    private static final Unit onActivityLayout(CashflowViewModel cashflowViewModel) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(-1442328751, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{cashflowViewModel}, iOnExtraCallbackWithResult, 1442328771, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    private static final Unit onMessageChannelReady(CashflowViewModel cashflowViewModel) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(346265184, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{cashflowViewModel}, iOnExtraCallbackWithResult, -346265179, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    private static final mergeJsonWhitoutRecursive IAuthTabCallbackStub(CameraPresenceProviderExternalSyntheticLambda6<mergeJsonWhitoutRecursive> cameraPresenceProviderExternalSyntheticLambda6) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (mergeJsonWhitoutRecursive) IAuthTabCallback(1770505342, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, iOnExtraCallbackWithResult, -1770505331, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    private static final void onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, RVLogger.onWarmupCompleted onwarmupcompleted, InventoryAdManager inventoryAdManager, String str, InventoryAdDto inventoryAdDto, applyConfig applyconfig, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, boolean z, Function1<? super String, Unit> function1, Function1<? super LocalDate, Unit> function12, Function1<? super LocalDate, Unit> function13, Function1<? super LocalDate, Unit> function14, Function0<Unit> function0, Function1<? super Integer, Unit> function15, String str2, Function0<Unit> function02, Function1<? super String, Unit> function16, Function1<? super String, Unit> function17, Function1<? super DefaultLoggerProxyImpl.IAuthTabCallback, Unit> function18, getBacktraceNote<? super DefaultLoggerProxyImpl.onExtraCallbackWithResult, ? super Integer, ? super String, Unit> getbacktracenote, Function2<? super DefaultLoggerProxyImpl.onExtraCallbackWithResult, ? super Integer, Unit> function2, Function1<? super String, Unit> function19, Function1<? super DefaultLoggerProxyImpl.IAuthTabCallback, Unit> function110, Function1<? super String, Unit> function111, View view, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) {
        IAuthTabCallback(399265859, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{quirksExternalSyntheticBackport0, onwarmupcompleted, inventoryAdManager, str, inventoryAdDto, applyconfig, camera2CameraMetadataExternalSyntheticLambda1, Boolean.valueOf(z), function1, function12, function13, function14, function0, function15, str2, function02, function16, function17, function18, getbacktracenote, function2, function19, function110, function111, view, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -399265833, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    private static final Unit onExtraCallbackWithResult(Function1 function1, getTyroBlockTime gettyroblocktime) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(-181866816, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{function1, gettyroblocktime}, iOnExtraCallbackWithResult, 181866831, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    private static final Unit onWarmupCompleted(Function1 function1, getTyroBlockTime gettyroblocktime, Function1 function12, applyConfig applyconfig) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(-1740991652, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{function1, gettyroblocktime, function12, applyconfig}, iOnExtraCallbackWithResult, 1740991658, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ boolean onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return ((Boolean) IAuthTabCallback(-1845765533, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{getsupportedhighspeedresolutionsfor}, iOnExtraCallbackWithResult, 1845765560, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())).booleanValue();
    }

    private static final boolean onExtraCallback(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return ((Boolean) IAuthTabCallback(-1098747541, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{camera2CameraMetadataExternalSyntheticLambda1}, iOnExtraCallbackWithResult, 1098747573, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())).booleanValue();
    }

    private static final Unit onExtraCallback(Function1 function1, List list, int i) {
        return (Unit) IAuthTabCallback(204843267, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{function1, list, Integer.valueOf(i)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -204843266, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }
}
