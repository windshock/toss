package o;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelProvider;
import gatewayprotocol.v1.AdResponseKtKt;
import im.toss.features.home.feature.asset_home.R;
import im.toss.features.home.feature.asset_home.compose.edit.screen.AssetEtcHomeEditScreenKt$;
import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetEtcHomeEditViewModel;
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
import o.setCallToAction;
import o.t7ExternalSyntheticLambda0;
import o.toJSONObject$onNavigationEvent;
import o.toPreviewOnlyRange;
import o.tryUnparcel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getAppCurrency {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ Unit IAuthTabCallback(AssetEtcHomeEditViewModel assetEtcHomeEditViewModel) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(assetEtcHomeEditViewModel);
        int i4 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getRpcProxy getrpcproxy, getRelativeLeft getrelativeleft, AssetEtcHomeEditViewModel assetEtcHomeEditViewModel, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getrpcproxy, getrelativeleft, assetEtcHomeEditViewModel, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, i, onnavigationevent, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6, getsupportedhighspeedresolutionsfor);
        }
        onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6, getsupportedhighspeedresolutionsfor);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(getRelativeLeft getrelativeleft, Resources resources, getRpcProxy getrpcproxy, AssetEtcHomeEditViewModel assetEtcHomeEditViewModel, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
            int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
            int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
            return (Unit) onExtraCallbackWithResult(iIAuthTabCallback, 608836574, -608836574, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{getrelativeleft, resources, getrpcproxy, assetEtcHomeEditViewModel, audioRestrictionControllerImplExternalSyntheticLambda0}, iIAuthTabCallback2);
        }
        int iIAuthTabCallback4 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback5 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback6 = AdResponseKtKt.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(iIAuthTabCallback4, 608836574, -608836574, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback6, new Object[]{getrelativeleft, resources, getrpcproxy, assetEtcHomeEditViewModel, audioRestrictionControllerImplExternalSyntheticLambda0}, iIAuthTabCallback5);
        int i3 = 65 / 0;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(getRpcProxy getrpcproxy, toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(getrpcproxy, onnavigationevent, i);
        int i5 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 65 / 0;
        }
        return unitIAuthTabCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7;
        boolean z;
        boolean z2;
        boolean z3;
        int i8;
        int i9 = ~i3;
        int i10 = ~i;
        int i11 = ~(i9 | i10);
        int i12 = ~(i9 | i);
        int i13 = ~i2;
        int i14 = (~(i10 | i13 | i3)) | i12;
        int i15 = (~(i | i13)) | (~(i9 | i13));
        int i16 = i3 + i2 + i6 + (1941422536 * i5) + ((-555707305) * i4);
        int i17 = i16 * i16;
        int i18 = ((i3 * 487360618) - 1291405921) + (i2 * 487360618) + (i11 * 543) + (i14 * 543) + (i15 * 543) + (487361161 * i6) + ((-1188264952) * i5) + (624576655 * i4) + (i17 * (-25952256));
        int i19 = (i3 * (-2131549542)) + 177471488 + ((-2131549542) * i2) + (i11 * (-207299225)) + (i14 * (-207299225)) + ((-207299225) * i15) + (1956118528 * i6) + ((-1363148800) * i5) + (2141716480 * i4) + ((-573308928) * i17) + (i18 * i18 * 74186752);
        int i20 = 5;
        if (i19 != 1) {
            return i19 != 2 ? i19 != 3 ? i19 != 4 ? i19 != 5 ? onExtraCallback(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
        }
        getRpcProxy getrpcproxy = (getRpcProxy) objArr[0];
        AssetEtcHomeEditViewModel assetEtcHomeEditViewModel = (AssetEtcHomeEditViewModel) objArr[1];
        RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0 = (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent = (toJSONObject$onNavigationEvent.onNavigationEvent) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue2 = ((Number) objArr[6]).intValue();
        int i21 = 2 % 2;
        int i22 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i22 % 128;
        int i23 = i22 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        if ((iIntValue2 & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0)) {
                int i24 = onNavigationEvent + 91;
                onExtraCallbackWithResult = i24 % 128;
                if (i24 % 2 != 0) {
                    i20 = 4;
                }
            } else {
                i20 = 2;
            }
            i7 = i20 | iIntValue2;
        } else {
            int i25 = onExtraCallbackWithResult + 59;
            onNavigationEvent = i25 % 128;
            int i26 = i25 % 2;
            i7 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iIntValue)) {
                int i27 = onExtraCallbackWithResult + 87;
                onNavigationEvent = i27 % 128;
                int i28 = i27 % 2;
                i8 = 32;
            } else {
                i8 = 16;
            }
            i7 |= i8;
        }
        if ((iIntValue2 & 384) == 0) {
            i7 |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onnavigationevent) ? 256 : 128;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i7 & 1171) != 1170, i7 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2053115122, i7, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetEtcHomeEditScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetEtcHomeEditScreen.kt:124)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = RequestMonitorRequestCompleteListenerExternalSyntheticLambda0.onWarmupCompleted(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, QuirksExternalSyntheticBackport0.Companion, (updateFocusedState) null, (updateFocusedState) null, (updateFocusedState) null, 7, (Object) null);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getrpcproxy);
            int i29 = i7 & 896;
            if (i29 == 256) {
                int i30 = onExtraCallbackWithResult + 39;
                onNavigationEvent = i30 % 128;
                int i31 = i30 % 2;
                z = true;
            } else {
                int i32 = onExtraCallbackWithResult + 77;
                onNavigationEvent = i32 % 128;
                int i33 = i32 % 2;
                z = false;
            }
            if ((i7 & 112) == 32) {
                int i34 = onExtraCallbackWithResult + 21;
                onNavigationEvent = i34 % 128;
                int i35 = i34 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((z | zOnExtraCallback | z2) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new AssetEtcHomeEditScreenKt$.ExternalSyntheticLambda0(getrpcproxy, onnavigationevent, iIntValue);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            Function0 function0 = (Function0) objOnMinimized;
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetEtcHomeEditViewModel);
            if (i29 == 256) {
                int i36 = onExtraCallbackWithResult + 45;
                onNavigationEvent = i36 % 128;
                int i37 = i36 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback2 | z3)) {
                Object obj = objOnMinimized2;
                if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    AssetEtcHomeEditScreenKt$.ExternalSyntheticLambda1 externalSyntheticLambda1 = new AssetEtcHomeEditScreenKt$.ExternalSyntheticLambda1(assetEtcHomeEditViewModel, onnavigationevent);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda1);
                    obj = externalSyntheticLambda1;
                }
                putConfigCache.onWarmupCompleted(854830388, _string.onNavigationEvent.IAuthTabCallback(), -854830385, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), new Object[]{quirksExternalSyntheticBackport0OnWarmupCompleted, onnavigationevent, false, false, function0, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i7 >> 3) & 112) | 384), 8});
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AssetEtcHomeEditViewModel assetEtcHomeEditViewModel) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(assetEtcHomeEditViewModel);
        int i4 = onExtraCallbackWithResult + 25;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AssetEtcHomeEditViewModel assetEtcHomeEditViewModel, toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent, toJSONObject tojsonobject) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(iIAuthTabCallback, -1770008237, 1770008240, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{assetEtcHomeEditViewModel, onnavigationevent, tojsonobject}, iIAuthTabCallback2);
        int i4 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getRpcProxy getrpcproxy, AssetEtcHomeEditViewModel assetEtcHomeEditViewModel, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {getrpcproxy, assetEtcHomeEditViewModel, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer.valueOf(i), onnavigationevent, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(iIAuthTabCallback, -889742464, 889742465, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), objArr, iIAuthTabCallback2);
        int i6 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getTimebase gettimebase = (getTimebase) objArr[0];
        ExtensionsManager1 extensionsManager1 = (ExtensionsManager1) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(gettimebase, extensionsManager1);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(gettimebase, extensionsManager1);
        int i3 = onNavigationEvent + 9;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onNavigationEvent(AssetEtcHomeEditViewModel assetEtcHomeEditViewModel, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {assetEtcHomeEditViewModel, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(iIAuthTabCallback, 1848056336, -1848056332, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), objArr, iIAuthTabCallback2);
        int i7 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 16 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(AssetEtcHomeEditViewModel assetEtcHomeEditViewModel, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 31;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return onExtraCallbackWithResult(assetEtcHomeEditViewModel, cameraPresenceProviderExternalSyntheticLambda6, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallbackWithResult(assetEtcHomeEditViewModel, cameraPresenceProviderExternalSyntheticLambda6, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(getRpcProxy getrpcproxy, toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent, getRelativeLeft getrelativeleft, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getrpcproxy, onnavigationevent, getrelativeleft, i);
        int i5 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws NoWhenBranchMatchedException {
        AssetEtcHomeEditViewModel assetEtcHomeEditViewModel = (AssetEtcHomeEditViewModel) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(assetEtcHomeEditViewModel, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AssetEtcHomeEditViewModel assetEtcHomeEditViewModel, toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent, toJSONObject tojsonobject) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(assetEtcHomeEditViewModel, onnavigationevent, tojsonobject);
        int i4 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(getRpcProxy getrpcproxy, toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            getRpcProxy.onExtraCallbackWithResult(getrpcproxy, onnavigationevent, 0, "other_assets", (String) null, false, 52, (Object) null);
        } else {
            getRpcProxy.onExtraCallbackWithResult(getrpcproxy, onnavigationevent, i + 1, "other_assets", (String) null, false, 8, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(AssetEtcHomeEditViewModel assetEtcHomeEditViewModel, toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent, toJSONObject tojsonobject) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tojsonobject, "");
        IndexedValue indexedValueOnExtraCallbackWithResult = assetEtcHomeEditViewModel.onExtraCallbackWithResult(onnavigationevent);
        if (indexedValueOnExtraCallbackWithResult != null) {
            int i2 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            RVRpcProxy.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, (toJSONObject) indexedValueOnExtraCallbackWithResult.onExtraCallback(), indexedValueOnExtraCallbackWithResult.onNavigationEvent() + 1, "other_assets", null, true, 8, null);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(getRpcProxy getrpcproxy, toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent, getRelativeLeft getrelativeleft, int i) {
        int size;
        String str;
        String str2;
        boolean z;
        int i2;
        Object obj;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            size = getrelativeleft.onWarmupCompleted().size() * i;
            str = "other_assets";
            str2 = null;
            z = false;
            i2 = 117;
            obj = null;
        } else {
            size = getrelativeleft.onWarmupCompleted().size() + i + 1;
            str = "other_assets";
            str2 = null;
            z = true;
            i2 = 8;
            obj = null;
        }
        getRpcProxy.onExtraCallbackWithResult(getrpcproxy, onnavigationevent, size, str, str2, z, i2, obj);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0034 A[PHI: r1
      0x0034: PHI (r1v3 kotlin.collections.IndexedValue) = (r1v2 kotlin.collections.IndexedValue), (r1v4 kotlin.collections.IndexedValue) binds: [B:8:0x0032, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        IndexedValue indexedValueOnExtraCallback;
        AssetEtcHomeEditViewModel assetEtcHomeEditViewModel = (AssetEtcHomeEditViewModel) objArr[0];
        toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent = (toJSONObject$onNavigationEvent.onNavigationEvent) objArr[1];
        toJSONObject tojsonobject = (toJSONObject) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(tojsonobject, "");
            indexedValueOnExtraCallback = assetEtcHomeEditViewModel.onExtraCallback(onnavigationevent);
            int i3 = 73 / 0;
            if (indexedValueOnExtraCallback != null) {
                int i4 = onExtraCallbackWithResult + 113;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    RVRpcProxy.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, (toJSONObject) indexedValueOnExtraCallback.onExtraCallback(), indexedValueOnExtraCallback.onNavigationEvent() - 1, "other_assets", null, false, 31, null);
                } else {
                    RVRpcProxy.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, (toJSONObject) indexedValueOnExtraCallback.onExtraCallback(), indexedValueOnExtraCallback.onNavigationEvent() + 1, "other_assets", null, false, 8, null);
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(tojsonobject, "");
            indexedValueOnExtraCallback = assetEtcHomeEditViewModel.onExtraCallback(onnavigationevent);
            if (indexedValueOnExtraCallback != null) {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(getRpcProxy getrpcproxy, getRelativeLeft getrelativeleft, AssetEtcHomeEditViewModel assetEtcHomeEditViewModel, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 125;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        if ((i2 & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0)) {
                i4 = 4;
            } else {
                int i8 = onNavigationEvent + 109;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                i4 = 2;
            }
            i3 = i4 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            int i10 = onExtraCallbackWithResult + 125;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            i3 |= cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            int i12 = onExtraCallbackWithResult + 83;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
            i3 |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onnavigationevent) ? 256 : 128;
        }
        int i14 = i3;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i14 & 1171) != 1170, i14 & 1)) {
            int i15 = onExtraCallbackWithResult + 53;
            onNavigationEvent = i15 % 128;
            int i16 = i15 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i17 = onNavigationEvent + 35;
                onExtraCallbackWithResult = i17 % 128;
                int i18 = i17 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1640012987, i14, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetEtcHomeEditScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetEtcHomeEditScreen.kt:155)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = RequestMonitorRequestCompleteListenerExternalSyntheticLambda0.onWarmupCompleted(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, QuirksExternalSyntheticBackport0.Companion, (updateFocusedState) null, (updateFocusedState) null, (updateFocusedState) null, 7, (Object) null);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getrpcproxy);
            int i19 = i14 & 896;
            if (i19 == 256) {
                int i20 = onNavigationEvent + 105;
                onExtraCallbackWithResult = i20 % 128;
                int i21 = i20 % 2;
                z = true;
            } else {
                z = false;
            }
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getrelativeleft);
            boolean z2 = (i14 & 112) == 32;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback | z | zOnExtraCallback2 | z2)) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    AssetEtcHomeEditScreenKt$.ExternalSyntheticLambda2 externalSyntheticLambda2 = new AssetEtcHomeEditScreenKt$.ExternalSyntheticLambda2(getrpcproxy, onnavigationevent, getrelativeleft, i);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda2);
                    int i22 = onNavigationEvent + 11;
                    onExtraCallbackWithResult = i22 % 128;
                    obj = externalSyntheticLambda2;
                    if (i22 % 2 == 0) {
                        int i23 = 4 / 2;
                        obj = externalSyntheticLambda2;
                    }
                }
                Function0 function0 = (Function0) obj;
                boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetEtcHomeEditViewModel);
                if (i19 == 256) {
                    int i24 = onExtraCallbackWithResult + 97;
                    onNavigationEvent = i24 % 128;
                    boolean z3 = i24 % 2 == 0;
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(zOnExtraCallback3 | z3)) {
                        Object obj2 = objOnMinimized2;
                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            AssetEtcHomeEditScreenKt$.ExternalSyntheticLambda3 externalSyntheticLambda3 = new AssetEtcHomeEditScreenKt$.ExternalSyntheticLambda3(assetEtcHomeEditViewModel, onnavigationevent);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda3);
                            obj2 = externalSyntheticLambda3;
                        }
                        putConfigCache.onWarmupCompleted(854830388, _string.onNavigationEvent.IAuthTabCallback(), -854830385, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), new Object[]{quirksExternalSyntheticBackport0OnWarmupCompleted, onnavigationevent, true, false, function0, (Function1) obj2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i14 >> 3) & 112) | 384), 8});
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i25 = onExtraCallbackWithResult + 7;
                            onNavigationEvent = i25 % 128;
                            int i26 = i25 % 2;
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

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Resources.NotFoundException {
        String str;
        getRelativeLeft getrelativeleft = (getRelativeLeft) objArr[0];
        Resources resources = (Resources) objArr[1];
        getRpcProxy getrpcproxy = (getRpcProxy) objArr[2];
        AssetEtcHomeEditViewModel assetEtcHomeEditViewModel = (AssetEtcHomeEditViewModel) objArr[3];
        AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0 = (AudioRestrictionControllerImplExternalSyntheticLambda0) objArr[4];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
            getrelativeleft.onWarmupCompleted();
            getrelativeleft.IAuthTabCallback().isEmpty();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
        List listOnWarmupCompleted = getrelativeleft.onWarmupCompleted();
        if (getrelativeleft.IAuthTabCallback().isEmpty()) {
            int i3 = onNavigationEvent + 37;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str = "";
        } else {
            String string = resources.getString(R.string.home_v2_feature_asset_home_edit_category_section_header_etc_shown);
            Intrinsics.checkNotNull(string);
            str = string;
        }
        RVConfigService.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (String) null, listOnWarmupCompleted, str, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallbackWithResult(-2053115122, true, new AssetEtcHomeEditScreenKt$.ExternalSyntheticLambda5(getrpcproxy, assetEtcHomeEditViewModel)), 9, (Object) null);
        List listIAuthTabCallback = getrelativeleft.IAuthTabCallback();
        String string2 = resources.getString(R.string.home_v2_feature_asset_home_edit_category_section_header_etc_hidden);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        RVConfigService.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (String) null, listIAuthTabCallback, string2, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallbackWithResult(-1640012987, true, new AssetEtcHomeEditScreenKt$.ExternalSyntheticLambda6(getrpcproxy, getrelativeleft, assetEtcHomeEditViewModel)), 9, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 35;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<getScreenWidth>) cameraPresenceProviderExternalSyntheticLambda6).onWarmupCompleted()) {
            int i4 = onExtraCallbackWithResult + 81;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
                throw null;
            }
            if (!onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
                int i5 = onExtraCallbackWithResult + 95;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, false);
                } else {
                    onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, true);
                }
                RVRpcProxy.asBinder(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "other_assets");
            }
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(getTimebase gettimebase, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(gettimebase, (int) extensionsManager1.onExtraCallbackWithResult());
            int i3 = 89 / 0;
            return Unit.INSTANCE;
        }
        onNavigationEvent(gettimebase, (int) extensionsManager1.onExtraCallbackWithResult());
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(AssetEtcHomeEditViewModel assetEtcHomeEditViewModel) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            RVRpcProxy.asInterface(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "other_assets");
            assetEtcHomeEditViewModel.onExtraCallbackWithResult();
            Unit unit = Unit.INSTANCE;
            int i3 = onNavigationEvent + 63;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }
        RVRpcProxy.asInterface(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "other_assets");
        assetEtcHomeEditViewModel.onExtraCallbackWithResult();
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(AssetEtcHomeEditViewModel assetEtcHomeEditViewModel, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i4 = onExtraCallbackWithResult + 105;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1605003121, i2, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetEtcHomeEditScreen.<anonymous>.<anonymous>.<anonymous> (AssetEtcHomeEditScreen.kt:221)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_v2_feature_asset_home_edit_save_cta_label, cameraCaptureResultEmptyCameraCaptureResult, 0);
            boolean zOnExtraCallback = onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<getScreenWidth>) cameraPresenceProviderExternalSyntheticLambda6).onExtraCallback();
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetEtcHomeEditViewModel);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback2) {
                int i5 = onExtraCallbackWithResult + 71;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    throw null;
                }
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    AssetEtcHomeEditScreenKt$.ExternalSyntheticLambda4 externalSyntheticLambda4 = new AssetEtcHomeEditScreenKt$.ExternalSyntheticLambda4(assetEtcHomeEditViewModel);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda4);
                    obj = externalSyntheticLambda4;
                }
                u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, zOnExtraCallback, cameraCaptureResultEmptyCameraCaptureResult, 0, i2 & 14, 502);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(AssetEtcHomeEditViewModel assetEtcHomeEditViewModel) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AssetEtcHomeEditViewModel.IAuthTabCallback(new Object[]{assetEtcHomeEditViewModel}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1451411101, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1451411102, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[PHI: r0
      0x0045: PHI (r0v7 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v8 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0026, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[PHI: r0
      0x0028: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v8 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0026, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@Nullable AssetEtcHomeEditViewModel assetEtcHomeEditViewModel, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        AssetEtcHomeEditViewModel assetEtcHomeEditViewModel2;
        int i3;
        int i4;
        int i5;
        boolean z;
        AssetEtcHomeEditViewModel assetEtcHomeEditViewModel3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2;
        int i6;
        boolean z2;
        Object obj;
        Object objOnMinimized;
        int i7 = 2 % 2;
        int i8 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-816176720);
            if ((i & 17) == 0) {
                int i9 = onNavigationEvent + 17;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                if ((i2 & 1) == 0) {
                    assetEtcHomeEditViewModel2 = assetEtcHomeEditViewModel;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(assetEtcHomeEditViewModel2)) {
                        i3 = 4;
                    }
                    i4 = i3 | i;
                } else {
                    assetEtcHomeEditViewModel2 = assetEtcHomeEditViewModel;
                }
                i3 = 2;
                i4 = i3 | i;
            } else {
                assetEtcHomeEditViewModel2 = assetEtcHomeEditViewModel;
                i4 = i;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-816176720);
            if ((i & 6) == 0) {
            }
        }
        ?? r13 = 0;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 3) != 2, i4 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((i & 1) == 0 || !(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage())) {
                if ((i2 & 1) != 0) {
                    TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                    if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    int i11 = onNavigationEvent + 97;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                    i5 = 6;
                    z = false;
                    assetEtcHomeEditViewModel3 = (AssetEtcHomeEditViewModel) DefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda11.onExtraCallback(Reflection.getOrCreateKotlinClass(AssetEtcHomeEditViewModel.class), textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent, (String) null, (ViewModelProvider.onWarmupCompleted) null, textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6 ? textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent.getDefaultViewModelCreationExtras() : AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0);
                    i4 &= -15;
                    r13 = z;
                    assetEtcHomeEditViewModel2 = assetEtcHomeEditViewModel3;
                }
                i5 = 6;
            } else {
                int i13 = onNavigationEvent + 93;
                onExtraCallbackWithResult = i13 % 128;
                if (i13 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i2 & 1) != 0) {
                        assetEtcHomeEditViewModel3 = assetEtcHomeEditViewModel2;
                        i5 = 6;
                        z = false;
                        i4 &= -15;
                        r13 = z;
                        assetEtcHomeEditViewModel2 = assetEtcHomeEditViewModel3;
                    }
                }
                i5 = 6;
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-816176720, i4, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetEtcHomeEditScreen (AssetEtcHomeEditScreen.kt:56)");
            }
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(assetEtcHomeEditViewModel2.onNavigationEvent(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
            Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback((Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback()));
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2 = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback((setRubIn) AssetEtcHomeEditViewModel.IAuthTabCallback(new Object[]{assetEtcHomeEditViewModel2}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1033418122, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1033418122, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback()), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
            Unit unit = Unit.INSTANCE;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(assetEtcHomeEditViewModel2);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(activityIAuthTabCallback);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if ((zOnExtraCallback | zOnExtraCallback2) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = new onExtraCallbackWithResult(assetEtcHomeEditViewModel2, activityIAuthTabCallback, (access13800) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i5);
            getRpcProxy getrpcproxyOnNavigationEvent = RVRpcProxy.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (int) r13);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized3 = notifyPublicListeners.onWarmupCompleted((int) r13);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
            }
            getTimebase gettimebase = (getTimebase) objOnMinimized3;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub();
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (int) r13);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (int) r13));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport02);
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            getConfigJSONArray.onNavigationEvent(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_v2_feature_asset_home_edit_page_etc_header, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (int) r13), DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_v2_feature_asset_home_edit_page_etc_header_description, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (int) r13), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (int) r13, (int) r13);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = MeteringRepeatingSessionExternalSyntheticLambda0.onNavigationEvent(lowLightBoostControlExternalSyntheticLambda0, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport02, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), (boolean) r13);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (int) r13));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                int i14 = onExtraCallbackWithResult + 9;
                onNavigationEvent = i14 % 128;
                int i15 = i14 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda22 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            tryUnparcel.onExtraCallbackWithResult onextracallbackwithresult3 = (tryUnparcel) onExtraCallbackWithResult(AdResponseKtKt.IAuthTabCallback(), -612945009, 612945011, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback}, AdResponseKtKt.IAuthTabCallback());
            if (onextracallbackwithresult3 instanceof tryUnparcel.onExtraCallbackWithResult) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-2066791314);
                Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult = Camera2CameraControllerExternalSyntheticLambda0.onExtraCallbackWithResult(0, 0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 3);
                tryUnparcel.onExtraCallbackWithResult onextracallbackwithresult4 = onextracallbackwithresult3;
                getRelativeLeft getrelativeleftOnExtraCallbackWithResult = onextracallbackwithresult4.onExtraCallbackWithResult();
                Resources resources = (Resources) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback());
                DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0IAuthTabCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).c_(IAuthTabCallback(gettimebase)) + VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(w3a.onWarmupCompleted.IAuthTabCallbackDefault() / 2.0f)), 7, (Object) null);
                boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getrelativeleftOnExtraCallbackWithResult);
                boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(resources);
                boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getrpcproxyOnNavigationEvent);
                boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(assetEtcHomeEditViewModel2);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!(zOnExtraCallback3 | zOnExtraCallback4 | zOnExtraCallback5 | zOnExtraCallback6)) {
                    Object obj2 = objOnMinimized4;
                    if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                        AssetEtcHomeEditScreenKt$.ExternalSyntheticLambda7 externalSyntheticLambda7 = new AssetEtcHomeEditScreenKt$.ExternalSyntheticLambda7(getrelativeleftOnExtraCallbackWithResult, resources, getrpcproxyOnNavigationEvent, assetEtcHomeEditViewModel2);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda7);
                        obj2 = externalSyntheticLambda7;
                    }
                    ResolutionCorrector.onWarmupCompleted((QuirksExternalSyntheticBackport0) null, camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult, deviceQuirksExternalSyntheticLambda0IAuthTabCallback, false, (FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel) null, (QuirkSettingsLoader.onNavigationEvent) null, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, (removeChildrenForExpandedActionView) null, (Function1) obj2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 505);
                    if (onextracallbackwithresult4.IAuthTabCallback()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-2062360236);
                        quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                        highSpeedResolverExternalSyntheticLambda2 = highSpeedResolverExternalSyntheticLambda22;
                        i6 = 0;
                        getNick.IAuthTabCallback(highSpeedResolverExternalSyntheticLambda2.onWarmupCompleted(quirksExternalSyntheticBackport0, onextracallbackwithresult.onExtraCallback()), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    } else {
                        quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                        highSpeedResolverExternalSyntheticLambda2 = highSpeedResolverExternalSyntheticLambda22;
                        i6 = 0;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-2062204554);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    }
                    u2 u2VarOnWarmupCompleted = t7a.onWarmupCompleted(onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<getScreenWidth>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2).onWarmupCompleted(), (Function0) null, (Function0) null, 0.0f, new t7ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent((Integer) null, i6, 1, (DefaultConstructorMarker) null), false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 46);
                    if (onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<getScreenWidth>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2).onWarmupCompleted()) {
                        int i16 = onNavigationEvent + 123;
                        onExtraCallbackWithResult = i16 % 128;
                        int i17 = i16 % 2;
                        z2 = true;
                        u2.IAuthTabCallback(u2VarOnWarmupCompleted, (t7ExternalSyntheticLambda0.onExtraCallback) null, 1, (Object) null);
                    } else {
                        z2 = true;
                        u2.onNavigationEvent(u2VarOnWarmupCompleted, (t7ExternalSyntheticLambda0.onExtraCallback) null, 1, (Object) null);
                    }
                    Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized5 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                    }
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized5;
                    boolean zOnWarmupCompleted = onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<getScreenWidth>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2).onWarmupCompleted();
                    boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2);
                    Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!zOnNavigationEvent) {
                        int i18 = onExtraCallbackWithResult + 81;
                        onNavigationEvent = i18 % 128;
                        if (i18 % 2 != 0) {
                            int i19 = 89 / 0;
                            obj = objOnMinimized6;
                            if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                                AssetEtcHomeEditScreenKt$.ExternalSyntheticLambda8 externalSyntheticLambda8 = new AssetEtcHomeEditScreenKt$.ExternalSyntheticLambda8(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2, getsupportedhighspeedresolutionsfor);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda8);
                                obj = externalSyntheticLambda8;
                            }
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = highSpeedResolverExternalSyntheticLambda2.onWarmupCompleted(ImageLoaderBuilderExternalSyntheticLambda1.onWarmupCompleted(quirksExternalSyntheticBackport0, 0.0f, Boolean.valueOf(zOnWarmupCompleted), (Function0) obj, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 1), onextracallbackwithresult.onWarmupCompleted());
                            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized = new AssetEtcHomeEditScreenKt$.ExternalSyntheticLambda9(gettimebase);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                            }
                            u1.IAuthTabCallback(YuvImageOnePixelShiftQuirk.onExtraCallback(calculatePlaceholderForExtensions.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnWarmupCompleted3, (Function1) objOnMinimized)), u2VarOnWarmupCompleted, ForwardingCameraControl.onExtraCallback(1605003121, z2, new AssetEtcHomeEditScreenKt$.ExternalSyntheticLambda10(assetEtcHomeEditViewModel2, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (getBacktraceNote) null, 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 384, 0, 4088);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        } else {
                            obj = objOnMinimized6;
                            if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                            }
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted32 = highSpeedResolverExternalSyntheticLambda2.onWarmupCompleted(ImageLoaderBuilderExternalSyntheticLambda1.onWarmupCompleted(quirksExternalSyntheticBackport0, 0.0f, Boolean.valueOf(zOnWarmupCompleted), (Function0) obj, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 1), onextracallbackwithresult.onWarmupCompleted());
                            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                            }
                            u1.IAuthTabCallback(YuvImageOnePixelShiftQuirk.onExtraCallback(calculatePlaceholderForExtensions.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnWarmupCompleted32, (Function1) objOnMinimized)), u2VarOnWarmupCompleted, ForwardingCameraControl.onExtraCallback(1605003121, z2, new AssetEtcHomeEditScreenKt$.ExternalSyntheticLambda10(assetEtcHomeEditViewModel2, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (getBacktraceNote) null, 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 384, 0, 4088);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        }
                    }
                }
            } else if (Intrinsics.areEqual(onextracallbackwithresult3, new tryUnparcel() { // from class: o.tryUnparcel$IAuthTabCallback
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                static {
                    int i20 = IAuthTabCallback + 21;
                    onExtraCallback = i20 % 128;
                    int i21 = i20 % 2;
                }

                public boolean equals(@Nullable Object obj3) {
                    int i20 = 2 % 2;
                    int i21 = onWarmupCompleted;
                    int i22 = i21 + 109;
                    onExtraCallbackWithResult = i22 % 128;
                    Object obj4 = null;
                    if (i22 % 2 != 0) {
                        obj4.hashCode();
                        throw null;
                    }
                    if (this == obj3) {
                        int i23 = i21 + 81;
                        onExtraCallbackWithResult = i23 % 128;
                        int i24 = i23 % 2;
                        return true;
                    }
                    if (!(!(obj3 instanceof tryUnparcel$IAuthTabCallback))) {
                        return true;
                    }
                    int i25 = i21 + 113;
                    int i26 = i25 % 128;
                    onExtraCallbackWithResult = i26;
                    int i27 = i25 % 2;
                    int i28 = i26 + 107;
                    onWarmupCompleted = i28 % 128;
                    if (i28 % 2 != 0) {
                        return false;
                    }
                    throw null;
                }

                public int hashCode() {
                    int i20 = 2 % 2;
                    int i21 = onExtraCallbackWithResult + 17;
                    int i22 = i21 % 128;
                    onWarmupCompleted = i22;
                    int i23 = i21 % 2;
                    int i24 = i22 + 69;
                    onExtraCallbackWithResult = i24 % 128;
                    int i25 = i24 % 2;
                    return -576768510;
                }

                public String toString() {
                    int i20 = 2 % 2;
                    int i21 = onExtraCallbackWithResult;
                    int i22 = i21 + 3;
                    onWarmupCompleted = i22 % 128;
                    int i23 = i22 % 2;
                    int i24 = i21 + 35;
                    onWarmupCompleted = i24 % 128;
                    if (i24 % 2 != 0) {
                        return "EmptyList";
                    }
                    throw null;
                }

                public /* bridge */ IndexedValue<toJSONObject$onNavigationEvent.onNavigationEvent> onWarmupCompleted(@NotNull String str) {
                    int i20 = 2 % 2;
                    int i21 = onExtraCallbackWithResult + 23;
                    onWarmupCompleted = i21 % 128;
                    int i22 = i21 % 2;
                    IndexedValue<toJSONObject$onNavigationEvent.onNavigationEvent> indexedValueOnWarmupCompleted = super.onWarmupCompleted(str);
                    int i23 = onExtraCallbackWithResult + 125;
                    onWarmupCompleted = i23 % 128;
                    if (i23 % 2 != 0) {
                        return indexedValueOnWarmupCompleted;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }

                public /* bridge */ tryUnparcel.onExtraCallbackWithResult onWarmupCompleted() {
                    int i20 = 2 % 2;
                    int i21 = onWarmupCompleted + 91;
                    onExtraCallbackWithResult = i21 % 128;
                    if (i21 % 2 != 0) {
                        super.onWarmupCompleted();
                        throw null;
                    }
                    tryUnparcel.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = super.onWarmupCompleted();
                    int i22 = onWarmupCompleted + 17;
                    onExtraCallbackWithResult = i22 % 128;
                    if (i22 % 2 != 0) {
                        int i23 = 92 / 0;
                    }
                    return onextracallbackwithresultOnWarmupCompleted;
                }
            })) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-2060269286);
                getNick.onExtraCallback(highSpeedResolverExternalSyntheticLambda22.onWarmupCompleted(quirksExternalSyntheticBackport02, onextracallbackwithresult.onExtraCallback()), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            } else {
                if (!(onextracallbackwithresult3 instanceof tryUnparcel$onNavigationEvent)) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-482315041);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    throw new NoWhenBranchMatchedException();
                }
                int i20 = onExtraCallbackWithResult + 111;
                onNavigationEvent = i20 % 128;
                int i21 = i20 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-2060039390);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = highSpeedResolverExternalSyntheticLambda22.onWarmupCompleted(quirksExternalSyntheticBackport02, onextracallbackwithresult.onExtraCallback());
                boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(assetEtcHomeEditViewModel2);
                Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnExtraCallback7 || objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized7 = new AssetEtcHomeEditScreenKt$.ExternalSyntheticLambda11(assetEtcHomeEditViewModel2);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized7);
                }
                getNick.onExtraCallbackWithResult((Function0) objOnMinimized7, quirksExternalSyntheticBackport0OnWarmupCompleted4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new AssetEtcHomeEditScreenKt$.ExternalSyntheticLambda12(assetEtcHomeEditViewModel2, i, i2));
        }
    }

    private static final boolean onExtraCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        tryUnparcel tryunparcel = (tryUnparcel) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            return tryunparcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final getScreenWidth onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6<getScreenWidth> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getScreenWidth getscreenwidth = (getScreenWidth) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return getscreenwidth;
    }

    private static final int IAuthTabCallback(getTimebase gettimebase) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = gettimebase.onWarmupCompleted();
        if (i3 != 0) {
            int i4 = 49 / 0;
        }
        int i5 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 41 / 0;
        }
        return iOnWarmupCompleted;
    }

    private static final void onNavigationEvent(getTimebase gettimebase, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        gettimebase.onExtraCallback(i);
        int i5 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getTimebase gettimebase, ExtensionsManager1 extensionsManager1) {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(iIAuthTabCallback, -767436328, 767436333, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{gettimebase, extensionsManager1}, iIAuthTabCallback2);
    }

    private static final tryUnparcel IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<? extends tryUnparcel> cameraPresenceProviderExternalSyntheticLambda6) {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        return (tryUnparcel) onExtraCallbackWithResult(iIAuthTabCallback, -612945009, 612945011, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, iIAuthTabCallback2);
    }

    private static final Unit onWarmupCompleted(getRelativeLeft getrelativeleft, Resources resources, getRpcProxy getrpcproxy, AssetEtcHomeEditViewModel assetEtcHomeEditViewModel, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(iIAuthTabCallback, 608836574, -608836574, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{getrelativeleft, resources, getrpcproxy, assetEtcHomeEditViewModel, audioRestrictionControllerImplExternalSyntheticLambda0}, iIAuthTabCallback2);
    }

    private static final Unit onNavigationEvent(getRpcProxy getrpcproxy, AssetEtcHomeEditViewModel assetEtcHomeEditViewModel, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {getrpcproxy, assetEtcHomeEditViewModel, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer.valueOf(i), onnavigationevent, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(iIAuthTabCallback, -889742464, 889742465, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), objArr, iIAuthTabCallback2);
    }

    private static final Unit onExtraCallback(AssetEtcHomeEditViewModel assetEtcHomeEditViewModel, toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent, toJSONObject tojsonobject) {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(iIAuthTabCallback, -1770008237, 1770008240, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{assetEtcHomeEditViewModel, onnavigationevent, tojsonobject}, iIAuthTabCallback2);
    }

    private static final Unit IAuthTabCallback(AssetEtcHomeEditViewModel assetEtcHomeEditViewModel, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {assetEtcHomeEditViewModel, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(iIAuthTabCallback, 1848056336, -1848056332, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), objArr, iIAuthTabCallback2);
    }
}
