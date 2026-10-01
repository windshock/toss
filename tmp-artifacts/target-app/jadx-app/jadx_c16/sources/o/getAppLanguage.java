package o;

import android.app.Activity;
import android.content.res.Resources;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.sdk.openadsdk.wwx.lt;
import im.toss.features.home.feature.asset_home.R;
import im.toss.features.home.feature.asset_home.compose.edit.screen.AssetLoanHomeEditScreenKt$;
import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetLoanHomeEditViewModel;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o._string;
import o.px2sp;
import o.setCallToAction;
import o.t7ExternalSyntheticLambda0;
import o.toJSONObject$onNavigationEvent;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getAppLanguage {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        AssetLoanHomeEditViewModel assetLoanHomeEditViewModel = (AssetLoanHomeEditViewModel) objArr[0];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[1];
        u4 u4Var = (u4) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(assetLoanHomeEditViewModel, cameraPresenceProviderExternalSyntheticLambda6, u4Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 != 0) {
            int i4 = 19 / 0;
        }
        int i5 = onWarmupCompleted + 89;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(AssetLoanHomeEditViewModel assetLoanHomeEditViewModel) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(assetLoanHomeEditViewModel);
        int i4 = onNavigationEvent + 55;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getRelativeLeft getrelativeleft, Resources resources, getRpcProxy getrpcproxy, AssetLoanHomeEditViewModel assetLoanHomeEditViewModel, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(getrelativeleft, resources, getrpcproxy, assetLoanHomeEditViewModel, audioRestrictionControllerImplExternalSyntheticLambda0);
        }
        onExtraCallback(getrelativeleft, resources, getrpcproxy, assetLoanHomeEditViewModel, audioRestrictionControllerImplExternalSyntheticLambda0);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getRpcProxy getrpcproxy, AssetLoanHomeEditViewModel assetLoanHomeEditViewModel, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject$onNavigationEvent.onWarmupCompleted onwarmupcompleted, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 39;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            onWarmupCompleted(getrpcproxy, assetLoanHomeEditViewModel, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, i, onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResult, i2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(getrpcproxy, assetLoanHomeEditViewModel, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, i, onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onNavigationEvent + 91;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(AssetLoanHomeEditViewModel assetLoanHomeEditViewModel, toJSONObject$onNavigationEvent.onWarmupCompleted onwarmupcompleted, toJSONObject tojsonobject) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(assetLoanHomeEditViewModel, onwarmupcompleted, tojsonobject);
        if (i3 == 0) {
            int i4 = 62 / 0;
        }
        int i5 = onNavigationEvent + 115;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(getRpcProxy getrpcproxy, getRelativeLeft getrelativeleft, AssetLoanHomeEditViewModel assetLoanHomeEditViewModel, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject$onNavigationEvent.onWarmupCompleted onwarmupcompleted, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 83;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {getrpcproxy, getrelativeleft, assetLoanHomeEditViewModel, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer.valueOf(i), onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        if (i5 != 0) {
            return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -465719764, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 465719768, objArr);
        }
        int i6 = 8 / 0;
        return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -465719764, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 465719768, objArr);
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~((~i) | i6);
        int i8 = ~((~i6) | i2);
        int i9 = i8 | i7;
        int i10 = i8 | (~((~i2) | i6));
        int i11 = i6 + i2 + i4 + (762724209 * i5) + (1201824936 * i3);
        int i12 = i11 * i11;
        int i13 = ((-126223985) * i6) + 43253760 + (1339426419 * i2) + ((-1465650404) * i7) + (1465650404 * i9) + (1414658446 * i10) + ((-1540882432) * i4) + (1302855680 * i5) + (1514143744 * i3) + (1905524736 * i12);
        int i14 = ((i6 * 162561953) - 555857873) + (i2 * 162559997) + (i7 * 1956) + (i9 * (-1956)) + (i10 * 978) + (i4 * 162560975) + (i5 * 701011807) + (i3 * 237771736) + (i12 * (-223608832));
        int i15 = i13 + (i14 * i14 * 703332352);
        if (i15 == 1) {
            return IAuthTabCallback(objArr);
        }
        if (i15 != 2) {
            return i15 != 3 ? i15 != 4 ? i15 != 5 ? onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr);
        }
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        int i16 = 2 % 2;
        if (IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<getScreenWidth>) cameraPresenceProviderExternalSyntheticLambda6).onWarmupCompleted()) {
            int i17 = onNavigationEvent + 89;
            onWarmupCompleted = i17 % 128;
            int i18 = i17 % 2;
            if (!IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
                int i19 = onNavigationEvent + 69;
                onWarmupCompleted = i19 % 128;
                if (i19 % 2 != 0) {
                    onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -727370938, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 727370943, new Object[]{getsupportedhighspeedresolutionsfor, true});
                } else {
                    onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -727370938, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 727370943, new Object[]{getsupportedhighspeedresolutionsfor, true});
                }
                RVRpcProxy.asBinder(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "loan");
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getRpcProxy getrpcproxy = (getRpcProxy) objArr[0];
        toJSONObject$onNavigationEvent.onWarmupCompleted onwarmupcompleted = (toJSONObject$onNavigationEvent.onWarmupCompleted) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(getrpcproxy, onwarmupcompleted, iIntValue);
        int i4 = onNavigationEvent + 23;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(AssetLoanHomeEditViewModel assetLoanHomeEditViewModel) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(assetLoanHomeEditViewModel);
        int i4 = onWarmupCompleted + 95;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(AssetLoanHomeEditViewModel assetLoanHomeEditViewModel, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 87;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(assetLoanHomeEditViewModel, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onNavigationEvent + 17;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(AssetLoanHomeEditViewModel assetLoanHomeEditViewModel, toJSONObject$onNavigationEvent.onWarmupCompleted onwarmupcompleted, toJSONObject tojsonobject) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallback4 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback5 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback6 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        Unit unit = (Unit) onNavigationEvent(iOnExtraCallback4, 1393351282, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback5, iOnExtraCallback6, -1393351282, new Object[]{assetLoanHomeEditViewModel, onwarmupcompleted, tojsonobject});
        int i3 = onNavigationEvent + 109;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(AssetLoanHomeEditViewModel assetLoanHomeEditViewModel, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 115;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            i |= 1;
        }
        onExtraCallback(assetLoanHomeEditViewModel, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 73;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            return (Unit) onNavigationEvent(iOnExtraCallback, 1075100913, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback3, -1075100911, new Object[]{cameraPresenceProviderExternalSyntheticLambda6, getsupportedhighspeedresolutionsfor});
        }
        int iOnExtraCallback4 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback5 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback6 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        Unit unit = (Unit) onNavigationEvent(iOnExtraCallback4, 1075100913, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback5, iOnExtraCallback6, -1075100911, new Object[]{cameraPresenceProviderExternalSyntheticLambda6, getsupportedhighspeedresolutionsfor});
        int i3 = 8 / 0;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getRpcProxy getrpcproxy, toJSONObject$onNavigationEvent.onWarmupCompleted onwarmupcompleted, getRelativeLeft getrelativeleft, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 57;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            onExtraCallback(getrpcproxy, onwarmupcompleted, getrelativeleft, i);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(getrpcproxy, onwarmupcompleted, getrelativeleft, i);
        int i4 = onWarmupCompleted + 61;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getTimebase gettimebase, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(gettimebase, extensionsManager1);
        int i4 = onNavigationEvent + 111;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static final Unit onNavigationEvent(getRpcProxy getrpcproxy, toJSONObject$onNavigationEvent.onWarmupCompleted onwarmupcompleted, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 91;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            getRpcProxy.onExtraCallbackWithResult(getrpcproxy, onwarmupcompleted, i, "loan", (String) null, false, 95, (Object) null);
        } else {
            getRpcProxy.onExtraCallbackWithResult(getrpcproxy, onwarmupcompleted, i + 1, "loan", (String) null, false, 8, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(AssetLoanHomeEditViewModel assetLoanHomeEditViewModel, toJSONObject$onNavigationEvent.onWarmupCompleted onwarmupcompleted, toJSONObject tojsonobject) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tojsonobject, "");
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
        IndexedValue indexedValue = (IndexedValue) AssetLoanHomeEditViewModel.onExtraCallback(-1234807466, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, new Object[]{assetLoanHomeEditViewModel, onwarmupcompleted}, 1234807467, iOnExtraCallbackWithResult);
        if (indexedValue != null) {
            int i2 = onNavigationEvent + 31;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            RVRpcProxy.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, (toJSONObject) indexedValue.onExtraCallback(), indexedValue.onNavigationEvent() + 1, "loan", null, true, 8, null);
            int i4 = onWarmupCompleted + 73;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(getRpcProxy getrpcproxy, AssetLoanHomeEditViewModel assetLoanHomeEditViewModel, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject$onNavigationEvent.onWarmupCompleted onwarmupcompleted, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        if ((i2 & 6) == 0) {
            int i7 = onNavigationEvent + 1;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 17 / 0;
                i5 = !cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0) ? 2 : 4;
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0)) {
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i)) {
                i4 = 16;
            } else {
                int i9 = onWarmupCompleted;
                int i10 = i9 + 39;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                int i12 = i9 + 9;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                i4 = 32;
            }
            i3 |= i4;
        }
        if ((i2 & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onwarmupcompleted) ? 256 : 128;
        }
        int i14 = i3;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i14 & 1171) != 1170, i14 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1605182454, i14, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetLoanHomeEditScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetLoanHomeEditScreen.kt:121)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = RequestMonitorRequestCompleteListenerExternalSyntheticLambda0.onWarmupCompleted(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, QuirksExternalSyntheticBackport0.Companion, (updateFocusedState) null, (updateFocusedState) null, (updateFocusedState) null, 7, (Object) null);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getrpcproxy);
            int i15 = i14 & 896;
            if (i15 == 256) {
                int i16 = onNavigationEvent + 39;
                onWarmupCompleted = i16 % 128;
                if (i16 % 2 != 0) {
                    int i17 = 3 % 2;
                }
                z = true;
            } else {
                z = false;
            }
            boolean z3 = (i14 & 112) == 32;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback | z | z3)) {
                int i18 = onNavigationEvent + 111;
                onWarmupCompleted = i18 % 128;
                int i19 = i18 % 2;
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    AssetLoanHomeEditScreenKt$.ExternalSyntheticLambda2 externalSyntheticLambda2 = new AssetLoanHomeEditScreenKt$.ExternalSyntheticLambda2(getrpcproxy, onwarmupcompleted, i);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda2);
                    obj = externalSyntheticLambda2;
                }
                Function0 function0 = (Function0) obj;
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetLoanHomeEditViewModel);
                if (i15 == 256) {
                    int i20 = onWarmupCompleted + 89;
                    onNavigationEvent = i20 % 128;
                    int i21 = i20 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnExtraCallback2 | z2)) {
                    int i22 = onWarmupCompleted + 81;
                    onNavigationEvent = i22 % 128;
                    int i23 = i22 % 2;
                    Object obj2 = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        AssetLoanHomeEditScreenKt$.ExternalSyntheticLambda3 externalSyntheticLambda3 = new AssetLoanHomeEditScreenKt$.ExternalSyntheticLambda3(assetLoanHomeEditViewModel, onwarmupcompleted);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda3);
                        obj2 = externalSyntheticLambda3;
                    }
                    putConfigCache.onWarmupCompleted(854830388, _string.onNavigationEvent.IAuthTabCallback(), -854830385, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), new Object[]{quirksExternalSyntheticBackport0OnWarmupCompleted, onwarmupcompleted, false, false, function0, (Function1) obj2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i14 >> 3) & 112) | 384), 8});
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(getRpcProxy getrpcproxy, toJSONObject$onNavigationEvent.onWarmupCompleted onwarmupcompleted, getRelativeLeft getrelativeleft, int i) {
        int size;
        String str;
        String str2;
        boolean z;
        int i2;
        Object obj;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 89;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            size = (getrelativeleft.onWarmupCompleted().size() % i) % 0;
            str = "loan";
            str2 = null;
            z = false;
            i2 = 123;
            obj = null;
        } else {
            size = getrelativeleft.onWarmupCompleted().size() + i + 1;
            str = "loan";
            str2 = null;
            z = true;
            i2 = 8;
            obj = null;
        }
        getRpcProxy.onExtraCallbackWithResult(getrpcproxy, onwarmupcompleted, size, str, str2, z, i2, obj);
        Unit unit = Unit.INSTANCE;
        int i5 = onWarmupCompleted + 27;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        AssetLoanHomeEditViewModel assetLoanHomeEditViewModel = (AssetLoanHomeEditViewModel) objArr[0];
        toJSONObject$onNavigationEvent.onWarmupCompleted onwarmupcompleted = (toJSONObject$onNavigationEvent.onWarmupCompleted) objArr[1];
        toJSONObject tojsonobject = (toJSONObject) objArr[2];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(tojsonobject, "");
            assetLoanHomeEditViewModel.IAuthTabCallback(onwarmupcompleted);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(tojsonobject, "");
        IndexedValue indexedValueIAuthTabCallback = assetLoanHomeEditViewModel.IAuthTabCallback(onwarmupcompleted);
        if (indexedValueIAuthTabCallback != null) {
            RVRpcProxy.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, (toJSONObject) indexedValueIAuthTabCallback.onExtraCallback(), indexedValueIAuthTabCallback.onNavigationEvent() + 1, "loan", null, false, 8, null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 101;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i;
        boolean z;
        int i2;
        int i3;
        getRpcProxy getrpcproxy = (getRpcProxy) objArr[0];
        getRelativeLeft getrelativeleft = (getRelativeLeft) objArr[1];
        AssetLoanHomeEditViewModel assetLoanHomeEditViewModel = (AssetLoanHomeEditViewModel) objArr[2];
        RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0 = (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        toJSONObject$onNavigationEvent.onWarmupCompleted onwarmupcompleted = (toJSONObject$onNavigationEvent.onWarmupCompleted) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue2 = ((Number) objArr[7]).intValue();
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        if ((iIntValue2 & 6) == 0) {
            i = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iIntValue)) {
                int i5 = onNavigationEvent + 63;
                onWarmupCompleted = i5 % 128;
                i3 = i5 % 2 != 0 ? 46 : 32;
            } else {
                i3 = 16;
            }
            i |= i3;
        }
        if ((iIntValue2 & 384) == 0) {
            int i6 = onNavigationEvent + 87;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onwarmupcompleted)) {
                int i8 = onNavigationEvent + 41;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                i2 = 256;
            } else {
                int i10 = onNavigationEvent + 123;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                i2 = 128;
            }
            i |= i2;
        }
        if ((i & 1171) != 1170) {
            int i12 = onNavigationEvent + 65;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i14 = onWarmupCompleted + 59;
                onNavigationEvent = i14 % 128;
                if (i14 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1568743437, i, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetLoanHomeEditScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetLoanHomeEditScreen.kt:153)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1568743437, i, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetLoanHomeEditScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetLoanHomeEditScreen.kt:153)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = RequestMonitorRequestCompleteListenerExternalSyntheticLambda0.onWarmupCompleted(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, QuirksExternalSyntheticBackport0.Companion, (updateFocusedState) null, (updateFocusedState) null, (updateFocusedState) null, 7, (Object) null);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getrpcproxy);
            int i15 = i & 896;
            boolean z2 = i15 == 256;
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getrelativeleft);
            boolean z3 = (i & 112) == 32;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(z3 | zOnExtraCallback | z2 | zOnExtraCallback2)) {
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    AssetLoanHomeEditScreenKt$.ExternalSyntheticLambda4 externalSyntheticLambda4 = new AssetLoanHomeEditScreenKt$.ExternalSyntheticLambda4(getrpcproxy, onwarmupcompleted, getrelativeleft, iIntValue);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda4);
                    obj2 = externalSyntheticLambda4;
                }
                Function0 function0 = (Function0) obj2;
                boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetLoanHomeEditViewModel);
                boolean z4 = i15 == 256;
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(z4 | zOnExtraCallback3)) {
                    int i16 = onWarmupCompleted + 85;
                    onNavigationEvent = i16 % 128;
                    int i17 = i16 % 2;
                    Object obj3 = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        AssetLoanHomeEditScreenKt$.ExternalSyntheticLambda5 externalSyntheticLambda5 = new AssetLoanHomeEditScreenKt$.ExternalSyntheticLambda5(assetLoanHomeEditViewModel, onwarmupcompleted);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda5);
                        obj3 = externalSyntheticLambda5;
                    }
                    putConfigCache.onWarmupCompleted(854830388, _string.onNavigationEvent.IAuthTabCallback(), -854830385, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), new Object[]{quirksExternalSyntheticBackport0OnWarmupCompleted, onwarmupcompleted, true, false, function0, (Function1) obj3, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i >> 3) & 112) | 384), 8});
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(getRelativeLeft getrelativeleft, Resources resources, getRpcProxy getrpcproxy, AssetLoanHomeEditViewModel assetLoanHomeEditViewModel, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) throws Resources.NotFoundException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
        List listOnWarmupCompleted = getrelativeleft.onWarmupCompleted();
        String string = resources.getString(R.string.home_v2_feature_asset_home_edit_category_section_header_loan_shown);
        Intrinsics.checkNotNullExpressionValue(string, "");
        RVConfigService.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (String) null, listOnWarmupCompleted, string, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallbackWithResult(-1605182454, true, new AssetLoanHomeEditScreenKt$.ExternalSyntheticLambda0(getrpcproxy, assetLoanHomeEditViewModel)), 9, (Object) null);
        List listIAuthTabCallback = getrelativeleft.IAuthTabCallback();
        String string2 = resources.getString(R.string.home_v2_feature_asset_home_edit_category_section_header_loan_hidden);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        RVConfigService.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (String) null, listIAuthTabCallback, string2, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallbackWithResult(-1568743437, true, new AssetLoanHomeEditScreenKt$.ExternalSyntheticLambda1(getrpcproxy, getrelativeleft, assetLoanHomeEditViewModel)), 9, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(getTimebase gettimebase, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(gettimebase, (int) extensionsManager1.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 51;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(AssetLoanHomeEditViewModel assetLoanHomeEditViewModel) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            RVRpcProxy.asInterface(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "loan");
            assetLoanHomeEditViewModel.onExtraCallbackWithResult();
            Unit unit = Unit.INSTANCE;
            int i3 = onNavigationEvent + 81;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        RVRpcProxy.asInterface(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "loan");
        assetLoanHomeEditViewModel.onExtraCallbackWithResult();
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(AssetLoanHomeEditViewModel assetLoanHomeEditViewModel, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                int i5 = onWarmupCompleted + 45;
                onNavigationEvent = i5 % 128;
                i3 = i5 % 2 == 0 ? 3 : 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1259842187, i2, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetLoanHomeEditScreen.<anonymous>.<anonymous>.<anonymous> (AssetLoanHomeEditScreen.kt:220)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_v2_feature_asset_home_edit_save_cta_label, cameraCaptureResultEmptyCameraCaptureResult, 0);
            boolean zOnExtraCallback = IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<getScreenWidth>) cameraPresenceProviderExternalSyntheticLambda6).onExtraCallback();
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetLoanHomeEditViewModel);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback2) {
                int i6 = onNavigationEvent + 101;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    AssetLoanHomeEditScreenKt$.ExternalSyntheticLambda6 externalSyntheticLambda6 = new AssetLoanHomeEditScreenKt$.ExternalSyntheticLambda6(assetLoanHomeEditViewModel);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda6);
                    obj2 = externalSyntheticLambda6;
                }
                u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj2, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, zOnExtraCallback, cameraCaptureResultEmptyCameraCaptureResult, 0, i2 & 14, 502);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i7 = onWarmupCompleted + 125;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i8 = 22 / 0;
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

    private static final Unit onExtraCallback(AssetLoanHomeEditViewModel assetLoanHomeEditViewModel) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        assetLoanHomeEditViewModel.onNavigationEvent();
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 85;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@Nullable AssetLoanHomeEditViewModel assetLoanHomeEditViewModel, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        AssetLoanHomeEditViewModel assetLoanHomeEditViewModel2;
        int i3;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback defaultViewModelCreationExtras;
        int i4;
        int i5;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6;
        AssetLoanHomeEditViewModel assetLoanHomeEditViewModel3;
        HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
        int i6;
        Boolean bool;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted;
        int i7;
        int i8 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-947716394);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                assetLoanHomeEditViewModel2 = assetLoanHomeEditViewModel;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(assetLoanHomeEditViewModel2)) {
                    i7 = 4;
                }
                i3 = i7 | i;
            } else {
                assetLoanHomeEditViewModel2 = assetLoanHomeEditViewModel;
            }
            i7 = 2;
            i3 = i7 | i;
        } else {
            assetLoanHomeEditViewModel2 = assetLoanHomeEditViewModel;
            i3 = i;
        }
        if ((i3 & 3) != 2) {
            int i9 = onWarmupCompleted + 125;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                if ((i2 & 1) != 0) {
                    TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                    if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    int i11 = onWarmupCompleted + 103;
                    onNavigationEvent = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 89 / 0;
                        defaultViewModelCreationExtras = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6 ? textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent.getDefaultViewModelCreationExtras() : AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult;
                    } else if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                    }
                    i4 = 6;
                    i5 = 0;
                    assetLoanHomeEditViewModel2 = (AssetLoanHomeEditViewModel) DefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda11.onExtraCallback(Reflection.getOrCreateKotlinClass(AssetLoanHomeEditViewModel.class), textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent, (String) null, (ViewModelProvider.onWarmupCompleted) null, defaultViewModelCreationExtras, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0);
                    i3 &= -15;
                }
                i4 = 6;
                i5 = 0;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                if ((i2 & 1) != 0) {
                    i4 = 6;
                    i5 = 0;
                    i3 &= -15;
                }
                i4 = 6;
                i5 = 0;
            }
            int i13 = i3;
            AssetLoanHomeEditViewModel assetLoanHomeEditViewModel4 = assetLoanHomeEditViewModel2;
            int i14 = onNavigationEvent + 111;
            onWarmupCompleted = i14 % 128;
            int i15 = i14 % 2;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i16 = onNavigationEvent + 17;
                onWarmupCompleted = i16 % 128;
                int i17 = i16 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-947716394, i13, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetLoanHomeEditScreen (AssetLoanHomeEditScreen.kt:55)");
            }
            px2sp.onExtraCallback onextracallback = (px2sp) AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(assetLoanHomeEditViewModel4.IAuthTabCallback(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7).onExtraCallbackWithResult();
            Activity activity = (Activity) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(prefetchWithMultipleUrls.IAuthTabCallback());
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback((setRubIn) AssetLoanHomeEditViewModel.onExtraCallback(-2014550672, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), new Object[]{assetLoanHomeEditViewModel4}, 2014550672, lt.40.onExtraCallbackWithResult()), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
            Unit unit = Unit.INSTANCE;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(assetLoanHomeEditViewModel4);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(activity);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if ((zOnExtraCallback | zOnExtraCallback2) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new onWarmupCompleted(assetLoanHomeEditViewModel4, activity, (access13800) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i4);
            getRpcProxy getrpcproxyOnNavigationEvent = RVRpcProxy.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i5);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = notifyPublicListeners.onWarmupCompleted(i5);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            getTimebase gettimebase = (getTimebase) objOnMinimized2;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub();
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i5);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i5));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport02);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                int i18 = onNavigationEvent + 35;
                cameraPresenceProviderExternalSyntheticLambda6 = cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback;
                onWarmupCompleted = i18 % 128;
                if (i18 % 2 != 0) {
                    getAwbState.onExtraCallback();
                    throw null;
                }
                getAwbState.onExtraCallback();
            } else {
                cameraPresenceProviderExternalSyntheticLambda6 = cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback;
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            getConfigJSONArray.onNavigationEvent(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_v2_feature_asset_home_edit_page_loan_header, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_v2_feature_asset_home_edit_page_loan_header_description, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = MeteringRepeatingSessionExternalSyntheticLambda0.onNavigationEvent(lowLightBoostControlExternalSyntheticLambda0, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport02, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                int i19 = onNavigationEvent + 67;
                onWarmupCompleted = i19 % 128;
                int i20 = i19 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda22 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            if (onextracallback instanceof px2sp.onExtraCallback) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-152747659);
                Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult = Camera2CameraControllerExternalSyntheticLambda0.onExtraCallbackWithResult(0, 0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 3);
                px2sp.onExtraCallback onextracallback2 = onextracallback;
                getRelativeLeft getrelativeleftOnNavigationEvent = onextracallback2.onNavigationEvent();
                Resources resources = (Resources) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback());
                DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0IAuthTabCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).c_(onExtraCallback(gettimebase)) + VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(w3a.onWarmupCompleted.IAuthTabCallbackDefault() / 2.0f)), 7, (Object) null);
                boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getrelativeleftOnNavigationEvent);
                boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(resources);
                boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getrpcproxyOnNavigationEvent);
                boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(assetLoanHomeEditViewModel4);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((zOnExtraCallback3 | zOnExtraCallback4 | zOnExtraCallback5 | zOnExtraCallback6) || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized3 = new AssetLoanHomeEditScreenKt$.ExternalSyntheticLambda7(getrelativeleftOnNavigationEvent, resources, getrpcproxyOnNavigationEvent, assetLoanHomeEditViewModel4);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                }
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62 = cameraPresenceProviderExternalSyntheticLambda6;
                ResolutionCorrector.onWarmupCompleted((QuirksExternalSyntheticBackport0) null, camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult, deviceQuirksExternalSyntheticLambda0IAuthTabCallback, false, (FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel) null, (QuirkSettingsLoader.onNavigationEvent) null, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, (removeChildrenForExpandedActionView) null, (Function1) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 505);
                if (onextracallback2.onWarmupCompleted()) {
                    int i21 = onNavigationEvent + 89;
                    onWarmupCompleted = i21 % 128;
                    if (i21 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(-148505402);
                        highSpeedResolverExternalSyntheticLambda2 = highSpeedResolverExternalSyntheticLambda22;
                        quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                        quirksExternalSyntheticBackport0OnWarmupCompleted = highSpeedResolverExternalSyntheticLambda2.onWarmupCompleted(quirksExternalSyntheticBackport0, onextracallbackwithresult.onExtraCallback());
                        i6 = 0;
                    } else {
                        highSpeedResolverExternalSyntheticLambda2 = highSpeedResolverExternalSyntheticLambda22;
                        quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                        cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        i6 = 0;
                        cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(-148505402);
                        quirksExternalSyntheticBackport0OnWarmupCompleted = highSpeedResolverExternalSyntheticLambda2.onWarmupCompleted(quirksExternalSyntheticBackport0, onextracallbackwithresult.onExtraCallback());
                    }
                    getNick.IAuthTabCallback(quirksExternalSyntheticBackport0OnWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult3, i6, i6);
                    cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
                } else {
                    highSpeedResolverExternalSyntheticLambda2 = highSpeedResolverExternalSyntheticLambda22;
                    quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                    cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    i6 = 0;
                    cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(-148349720);
                    cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
                }
                u2 u2VarOnWarmupCompleted = t7a.onWarmupCompleted(IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<getScreenWidth>) cameraPresenceProviderExternalSyntheticLambda62).onWarmupCompleted(), (Function0) null, (Function0) null, 0.0f, new t7ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent((Integer) null, i6, 1, (DefaultConstructorMarker) null), false, cameraCaptureResultEmptyCameraCaptureResult3, 0, 46);
                if (IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<getScreenWidth>) cameraPresenceProviderExternalSyntheticLambda62).onWarmupCompleted()) {
                    u2.IAuthTabCallback(u2VarOnWarmupCompleted, (t7ExternalSyntheticLambda0.onExtraCallback) null, 1, (Object) null);
                } else {
                    u2.onNavigationEvent(u2VarOnWarmupCompleted, (t7ExternalSyntheticLambda0.onExtraCallback) null, 1, (Object) null);
                }
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                    int i22 = onWarmupCompleted + 3;
                    onNavigationEvent = i22 % 128;
                    int i23 = 2;
                    if (i22 % 2 == 0) {
                        bool = Boolean.FALSE;
                        i23 = 4;
                    } else {
                        bool = Boolean.FALSE;
                    }
                    objOnMinimized4 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, i23, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized4);
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized4;
                boolean zOnWarmupCompleted = IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<getScreenWidth>) cameraPresenceProviderExternalSyntheticLambda62).onWarmupCompleted();
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda62);
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                if (zOnNavigationEvent || objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized5 = new AssetLoanHomeEditScreenKt$.ExternalSyntheticLambda8(cameraPresenceProviderExternalSyntheticLambda62, getsupportedhighspeedresolutionsfor);
                    cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized5);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = highSpeedResolverExternalSyntheticLambda2.onWarmupCompleted(ImageLoaderBuilderExternalSyntheticLambda1.onWarmupCompleted(quirksExternalSyntheticBackport0, 0.0f, Boolean.valueOf(zOnWarmupCompleted), (Function0) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResult3, 6, 1), onextracallbackwithresult.onWarmupCompleted());
                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized6 = new AssetLoanHomeEditScreenKt$.ExternalSyntheticLambda9(gettimebase);
                    cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized6);
                }
                assetLoanHomeEditViewModel3 = assetLoanHomeEditViewModel4;
                u1.IAuthTabCallback(YuvImageOnePixelShiftQuirk.onExtraCallback(calculatePlaceholderForExtensions.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnWarmupCompleted4, (Function1) objOnMinimized6)), u2VarOnWarmupCompleted, ForwardingCameraControl.onExtraCallback(-1259842187, true, new AssetLoanHomeEditScreenKt$.ExternalSyntheticLambda10(assetLoanHomeEditViewModel4, cameraPresenceProviderExternalSyntheticLambda62), cameraCaptureResultEmptyCameraCaptureResult3, 54), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (getBacktraceNote) null, 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResult3, 384, 0, 4088);
                cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult3;
            } else {
                assetLoanHomeEditViewModel3 = assetLoanHomeEditViewModel4;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                if (Intrinsics.areEqual(onextracallback, new px2sp() { // from class: o.px2sp$onExtraCallbackWithResult
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    static {
                        int i24 = onExtraCallback + 107;
                        IAuthTabCallback = i24 % 128;
                        if (i24 % 2 == 0) {
                            throw null;
                        }
                    }

                    public boolean equals(@Nullable Object obj) {
                        int i24 = 2 % 2;
                        int i25 = onNavigationEvent;
                        int i26 = i25 + 35;
                        int i27 = i26 % 128;
                        onWarmupCompleted = i27;
                        int i28 = i26 % 2;
                        if (this == obj) {
                            int i29 = i27 + 93;
                            onNavigationEvent = i29 % 128;
                            return i29 % 2 == 0;
                        }
                        if (obj instanceof px2sp$onExtraCallbackWithResult) {
                            return true;
                        }
                        int i30 = i25 + 17;
                        onWarmupCompleted = i30 % 128;
                        return i30 % 2 == 0;
                    }

                    public int hashCode() {
                        int i24 = 2 % 2;
                        int i25 = onWarmupCompleted;
                        int i26 = i25 + 21;
                        onNavigationEvent = i26 % 128;
                        if (i26 % 2 != 0) {
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        int i27 = i25 + 101;
                        onNavigationEvent = i27 % 128;
                        int i28 = i27 % 2;
                        return 1362524866;
                    }

                    public String toString() {
                        int i24 = 2 % 2;
                        int i25 = onWarmupCompleted;
                        int i26 = i25 + 65;
                        onNavigationEvent = i26 % 128;
                        int i27 = i26 % 2;
                        int i28 = i25 + 19;
                        onNavigationEvent = i28 % 128;
                        if (i28 % 2 == 0) {
                            return "EmptyList";
                        }
                        throw null;
                    }

                    public /* bridge */ px2sp.onExtraCallback IAuthTabCallback() {
                        int i24 = 2 % 2;
                        int i25 = onNavigationEvent + 45;
                        onWarmupCompleted = i25 % 128;
                        if (i25 % 2 == 0) {
                            super.IAuthTabCallback();
                            throw null;
                        }
                        px2sp.onExtraCallback onextracallbackIAuthTabCallback = super.IAuthTabCallback();
                        int i26 = onWarmupCompleted + 33;
                        onNavigationEvent = i26 % 128;
                        int i27 = i26 % 2;
                        return onextracallbackIAuthTabCallback;
                    }

                    public /* bridge */ IndexedValue<toJSONObject$onNavigationEvent.onWarmupCompleted> onNavigationEvent(@NotNull String str) {
                        int i24 = 2 % 2;
                        int i25 = onNavigationEvent + 87;
                        onWarmupCompleted = i25 % 128;
                        if (i25 % 2 != 0) {
                            return super.onNavigationEvent(str);
                        }
                        super.onNavigationEvent(str);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                })) {
                    int i24 = onNavigationEvent + 57;
                    onWarmupCompleted = i24 % 128;
                    int i25 = i24 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-146429332);
                    getNick.onExtraCallback(highSpeedResolverExternalSyntheticLambda22.onWarmupCompleted(quirksExternalSyntheticBackport02, onextracallbackwithresult.onExtraCallback()), cameraCaptureResultEmptyCameraCaptureResult2, 0, 0);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                } else {
                    if (!(onextracallback instanceof px2sp$onNavigationEvent)) {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(964902178);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        throw new NoWhenBranchMatchedException();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-146198630);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted5 = highSpeedResolverExternalSyntheticLambda22.onWarmupCompleted(quirksExternalSyntheticBackport02, onextracallbackwithresult.onExtraCallback());
                    assetLoanHomeEditViewModel2 = assetLoanHomeEditViewModel3;
                    boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(assetLoanHomeEditViewModel2);
                    Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    if (zOnExtraCallback7 || objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized7 = new AssetLoanHomeEditScreenKt$.ExternalSyntheticLambda11(assetLoanHomeEditViewModel2);
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized7);
                    }
                    getNick.onExtraCallbackWithResult((Function0) objOnMinimized7, quirksExternalSyntheticBackport0OnWarmupCompleted5, cameraCaptureResultEmptyCameraCaptureResult2, 0, 0);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                    cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
            assetLoanHomeEditViewModel2 = assetLoanHomeEditViewModel3;
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new AssetLoanHomeEditScreenKt$.ExternalSyntheticLambda12(assetLoanHomeEditViewModel2, i, i2));
        }
    }

    private static final boolean IAuthTabCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = onNavigationEvent + 17;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(zBooleanValue));
        if (i3 != 0) {
            int i4 = 88 / 0;
        }
        int i5 = onNavigationEvent + 101;
        onWarmupCompleted = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final getScreenWidth IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<getScreenWidth> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        getScreenWidth getscreenwidth = (getScreenWidth) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 29;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return getscreenwidth;
        }
        obj.hashCode();
        throw null;
    }

    private static final int onExtraCallback(getTimebase gettimebase) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = gettimebase.onWarmupCompleted();
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
        int i5 = onWarmupCompleted + 15;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return iOnWarmupCompleted;
    }

    private static final void onExtraCallbackWithResult(getTimebase gettimebase, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 65;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        gettimebase.onExtraCallback(i);
        int i5 = onNavigationEvent + 85;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ Unit onExtraCallback(getRpcProxy getrpcproxy, toJSONObject$onNavigationEvent.onWarmupCompleted onwarmupcompleted, int i) {
        Object[] objArr = {getrpcproxy, onwarmupcompleted, Integer.valueOf(i)};
        return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -702046137, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 702046140, objArr);
    }

    public static /* synthetic */ Unit onWarmupCompleted(AssetLoanHomeEditViewModel assetLoanHomeEditViewModel, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {assetLoanHomeEditViewModel, cameraPresenceProviderExternalSyntheticLambda6, u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 238964652, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -238964651, objArr);
    }

    private static final Unit onExtraCallbackWithResult(getRpcProxy getrpcproxy, getRelativeLeft getrelativeleft, AssetLoanHomeEditViewModel assetLoanHomeEditViewModel, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject$onNavigationEvent.onWarmupCompleted onwarmupcompleted, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {getrpcproxy, getrelativeleft, assetLoanHomeEditViewModel, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer.valueOf(i), onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -465719764, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 465719768, objArr);
    }

    private static final Unit onExtraCallbackWithResult(AssetLoanHomeEditViewModel assetLoanHomeEditViewModel, toJSONObject$onNavigationEvent.onWarmupCompleted onwarmupcompleted, toJSONObject tojsonobject) {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onNavigationEvent(iOnExtraCallback, 1393351282, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback3, -1393351282, new Object[]{assetLoanHomeEditViewModel, onwarmupcompleted, tojsonobject});
    }

    private static final void onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -727370938, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 727370943, objArr);
    }

    private static final Unit IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onNavigationEvent(iOnExtraCallback, 1075100913, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback3, -1075100911, new Object[]{cameraPresenceProviderExternalSyntheticLambda6, getsupportedhighspeedresolutionsfor});
    }
}
