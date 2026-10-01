package o;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelProvider;
import im.toss.features.home.feature.asset_home.R;
import im.toss.features.home.feature.asset_home.compose.edit.screen.AssetCardHomeEditScreenKt$;
import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetCardHomeEditViewModel;
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
import o.getFontSize;
import o.getPreRenderJob;
import o.setCallToAction;
import o.t7ExternalSyntheticLambda0;
import o.toJSONObject$onNavigationEvent;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class convertPlatform {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ Unit IAuthTabCallback(AssetCardHomeEditViewModel assetCardHomeEditViewModel, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 99;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(assetCardHomeEditViewModel, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onNavigationEvent + 85;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(AssetCardHomeEditViewModel assetCardHomeEditViewModel, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 17;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        IAuthTabCallback(assetCardHomeEditViewModel, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 21;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(AssetCardHomeEditViewModel assetCardHomeEditViewModel, toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult, toJSONObject tojsonobject) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(assetCardHomeEditViewModel, onextracallbackwithresult, tojsonobject);
        if (i3 != 0) {
            int i4 = 77 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i2);
        int i9 = ~(i4 | i2);
        int i10 = ~i4;
        int i11 = ~i2;
        int i12 = i8 | i9 | (~(i10 | i11 | i6));
        int i13 = i8 | (~(i7 | i4)) | i9;
        int i14 = (~(i2 | i6)) | (~(i10 | i2)) | (~(i7 | i11 | i4));
        int i15 = i6 + i4 + i3 + (1880080305 * i5) + (458392769 * i);
        int i16 = i15 * i15;
        int i17 = ((766573918 * i6) - 2147483648) + (1582236324 * i4) + (i12 * (-407831203)) + (815662406 * i13) + ((-407831203) * i14) + (1174405120 * i3) + (1711276032 * i5) + ((-973078528) * i) + (68288512 * i16);
        int i18 = ((i6 * 319678698) - 2002258816) + (i4 * 319678284) + (i12 * 207) + (i13 * (-414)) + (i14 * 207) + (i3 * 319678491) + (i5 * (-161570901)) + (i * (-1160779685)) + (i16 * (-1109000192));
        int i19 = i17 + (i18 * i18 * (-1432485888));
        if (i19 != 1) {
            return i19 != 2 ? i19 != 3 ? i19 != 4 ? i19 != 5 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr);
        }
        AssetCardHomeEditViewModel assetCardHomeEditViewModel = (AssetCardHomeEditViewModel) objArr[0];
        toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult = (toJSONObject$onNavigationEvent.onExtraCallbackWithResult) objArr[1];
        toJSONObject tojsonobject = (toJSONObject) objArr[2];
        int i20 = 2 % 2;
        int i21 = onNavigationEvent + 13;
        onExtraCallback = i21 % 128;
        int i22 = i21 % 2;
        Intrinsics.checkNotNullParameter(tojsonobject, "");
        IndexedValue indexedValue = (IndexedValue) AssetCardHomeEditViewModel.onNavigationEvent(739656888, new Object[]{assetCardHomeEditViewModel, onextracallbackwithresult}, -739656887, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback());
        if (indexedValue != null) {
            RVRpcProxy.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, (toJSONObject) indexedValue.onExtraCallback(), indexedValue.onNavigationEvent() + 1, "card", null, false, 8, null);
            int i23 = onNavigationEvent + 83;
            onExtraCallback = i23 % 128;
            int i24 = i23 % 2;
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getRpcProxy getrpcproxy = (getRpcProxy) objArr[0];
        toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult = (toJSONObject$onNavigationEvent.onExtraCallbackWithResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(getrpcproxy, onextracallbackwithresult, iIntValue);
        if (i3 == 0) {
            int i4 = 91 / 0;
        }
        int i5 = onExtraCallback + 13;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AssetCardHomeEditViewModel assetCardHomeEditViewModel, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 79;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(assetCardHomeEditViewModel, cameraPresenceProviderExternalSyntheticLambda6, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 35;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AssetCardHomeEditViewModel assetCardHomeEditViewModel, toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult, toJSONObject tojsonobject) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {assetCardHomeEditViewModel, onextracallbackwithresult, tojsonobject};
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback4 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onExtraCallbackWithResult(iIAuthTabCallback4, iIAuthTabCallback, iIAuthTabCallback2, objArr, 969465672, iIAuthTabCallback3, -969465671);
        int i4 = onExtraCallback + 113;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        AssetCardHomeEditViewModel assetCardHomeEditViewModel = (AssetCardHomeEditViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(assetCardHomeEditViewModel);
        if (i3 != 0) {
            int i4 = 42 / 0;
        }
        int i5 = onExtraCallback + 15;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(AssetCardHomeEditViewModel assetCardHomeEditViewModel) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(assetCardHomeEditViewModel);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(assetCardHomeEditViewModel);
        int i3 = onExtraCallback + 39;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6, getsupportedhighspeedresolutionsfor);
        }
        IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6, getsupportedhighspeedresolutionsfor);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(getRelativeLeft getrelativeleft, Resources resources, getRpcProxy getrpcproxy, AssetCardHomeEditViewModel assetCardHomeEditViewModel, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getrelativeleft, resources, getrpcproxy, assetCardHomeEditViewModel, audioRestrictionControllerImplExternalSyntheticLambda0);
        int i4 = onExtraCallback + 115;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(getRpcProxy getrpcproxy, getRelativeLeft getrelativeleft, AssetCardHomeEditViewModel assetCardHomeEditViewModel, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 25;
        onNavigationEvent = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            onWarmupCompleted(getrpcproxy, getrelativeleft, assetCardHomeEditViewModel, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, i, onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, i2);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(getrpcproxy, getrelativeleft, assetCardHomeEditViewModel, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, i, onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onExtraCallback + 19;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getRpcProxy getrpcproxy = (getRpcProxy) objArr[0];
        AssetCardHomeEditViewModel assetCardHomeEditViewModel = (AssetCardHomeEditViewModel) objArr[1];
        RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0 = (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult = (toJSONObject$onNavigationEvent.onExtraCallbackWithResult) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue2 = ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getrpcproxy, assetCardHomeEditViewModel, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, iIntValue, onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i4 = onNavigationEvent + 3;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getRpcProxy getrpcproxy, toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult, getRelativeLeft getrelativeleft, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 53;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(getrpcproxy, onextracallbackwithresult, getrelativeleft, i);
        if (i4 == 0) {
            int i5 = 59 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getTimebase gettimebase, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(gettimebase, extensionsManager1);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(gettimebase, extensionsManager1);
        int i3 = onNavigationEvent + 53;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    private static final Unit onNavigationEvent(getRpcProxy getrpcproxy, toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 7;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        getRpcProxy.onExtraCallbackWithResult(getrpcproxy, onextracallbackwithresult, i + 1, "card", (String) null, false, 8, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallback + 111;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(AssetCardHomeEditViewModel assetCardHomeEditViewModel, toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult, toJSONObject tojsonobject) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tojsonobject, "");
        IndexedValue indexedValueOnWarmupCompleted = assetCardHomeEditViewModel.onWarmupCompleted(onextracallbackwithresult);
        if (indexedValueOnWarmupCompleted != null) {
            int i2 = onExtraCallback + 29;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                RVRpcProxy.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, (toJSONObject) indexedValueOnWarmupCompleted.onExtraCallback(), indexedValueOnWarmupCompleted.onNavigationEvent() % 1, "card", null, false, 116, null);
            } else {
                RVRpcProxy.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, (toJSONObject) indexedValueOnWarmupCompleted.onExtraCallback(), indexedValueOnWarmupCompleted.onNavigationEvent() + 1, "card", null, true, 8, null);
            }
            int i3 = onNavigationEvent + 1;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(getRpcProxy getrpcproxy, AssetCardHomeEditViewModel assetCardHomeEditViewModel, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        boolean z;
        boolean z2;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if ((i2 & 6) == 0) {
            i3 = (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            int i6 = onExtraCallback + 111;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i)) {
                int i8 = onNavigationEvent + 3;
                onExtraCallback = i8 % 128;
                i4 = i8 % 2 == 0 ? 26 : 32;
            } else {
                int i9 = onExtraCallback + 29;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i2 & 384) == 0) {
            int i11 = onExtraCallback + 121;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            i3 |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onextracallbackwithresult) ? 256 : 128;
        }
        int i13 = i3;
        if ((i13 & 1171) != 1170) {
            int i14 = onExtraCallback + 1;
            onNavigationEvent = i14 % 128;
            int i15 = i14 % 2;
            z = true;
        } else {
            int i16 = onExtraCallback + 57;
            onNavigationEvent = i16 % 128;
            int i17 = i16 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i13 & 1)) {
            int i18 = onNavigationEvent + 125;
            onExtraCallback = i18 % 128;
            int i19 = i18 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-378350710, i13, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetCardHomeEditScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetCardHomeEditScreen.kt:123)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = RequestMonitorRequestCompleteListenerExternalSyntheticLambda0.onWarmupCompleted(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, QuirksExternalSyntheticBackport0.Companion, (updateFocusedState) null, (updateFocusedState) null, (updateFocusedState) null, 7, (Object) null);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getrpcproxy);
            int i20 = i13 & 896;
            boolean z3 = i20 == 256;
            boolean z4 = (i13 & 112) == 32;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback | z3 | z4)) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    AssetCardHomeEditScreenKt$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new AssetCardHomeEditScreenKt$.ExternalSyntheticLambda0(getrpcproxy, onextracallbackwithresult, i);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda0);
                    obj = externalSyntheticLambda0;
                }
                Function0 function0 = (Function0) obj;
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetCardHomeEditViewModel);
                if (i20 == 256) {
                    int i21 = onExtraCallback + 57;
                    onNavigationEvent = i21 % 128;
                    int i22 = i21 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnExtraCallback2 | z2)) {
                    int i23 = onExtraCallback + 113;
                    onNavigationEvent = i23 % 128;
                    if (i23 % 2 != 0) {
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        throw null;
                    }
                    Object obj2 = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        AssetCardHomeEditScreenKt$.ExternalSyntheticLambda1 externalSyntheticLambda1 = new AssetCardHomeEditScreenKt$.ExternalSyntheticLambda1(assetCardHomeEditViewModel, onextracallbackwithresult);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda1);
                        obj2 = externalSyntheticLambda1;
                    }
                    putConfigCache.onWarmupCompleted(854830388, _string.onNavigationEvent.IAuthTabCallback(), -854830385, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), new Object[]{quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult, false, false, function0, (Function1) obj2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i13 >> 3) & 112) | 384), 8});
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i24 = onNavigationEvent + 121;
        onExtraCallback = i24 % 128;
        int i25 = i24 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(getRpcProxy getrpcproxy, toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult, getRelativeLeft getrelativeleft, int i) {
        int size;
        String str;
        String str2;
        boolean z;
        int i2;
        Object obj;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 121;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            size = (getrelativeleft.onWarmupCompleted().size() + i) % 0;
            str = "card";
            str2 = null;
            z = false;
            i2 = 84;
            obj = null;
        } else {
            size = getrelativeleft.onWarmupCompleted().size() + i + 1;
            str = "card";
            str2 = null;
            z = true;
            i2 = 8;
            obj = null;
        }
        getRpcProxy.onExtraCallbackWithResult(getrpcproxy, onextracallbackwithresult, size, str, str2, z, i2, obj);
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 21;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(getRpcProxy getrpcproxy, getRelativeLeft getrelativeleft, AssetCardHomeEditViewModel assetCardHomeEditViewModel, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        boolean z;
        boolean z2;
        Object obj;
        boolean zOnExtraCallback;
        boolean z3;
        Object objOnMinimized;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if ((i2 & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0)) {
                int i6 = onExtraCallback + 21;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onextracallbackwithresult) ? 256 : 128;
        }
        int i8 = i3;
        if ((i8 & 1171) != 1170) {
            int i9 = onExtraCallback + 75;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i8 & 1)) {
            int i11 = onNavigationEvent + 83;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1393107085, i8, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetCardHomeEditScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetCardHomeEditScreen.kt:154)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = RequestMonitorRequestCompleteListenerExternalSyntheticLambda0.onWarmupCompleted(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, QuirksExternalSyntheticBackport0.Companion, (updateFocusedState) null, (updateFocusedState) null, (updateFocusedState) null, 7, (Object) null);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getrpcproxy);
            int i13 = i8 & 896;
            if (i13 == 256) {
                int i14 = onExtraCallback + 33;
                onNavigationEvent = i14 % 128;
                int i15 = i14 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getrelativeleft);
            boolean z4 = (i8 & 112) == 32;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((zOnExtraCallback2 | z2 | zOnExtraCallback3) || z4) {
                AssetCardHomeEditScreenKt$.ExternalSyntheticLambda9 externalSyntheticLambda9 = new AssetCardHomeEditScreenKt$.ExternalSyntheticLambda9(getrpcproxy, onextracallbackwithresult, getrelativeleft, i);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda9);
                obj = externalSyntheticLambda9;
                Function0 function0 = (Function0) obj;
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetCardHomeEditViewModel);
                z3 = i13 != 256;
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnExtraCallback | z3) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new AssetCardHomeEditScreenKt$.ExternalSyntheticLambda10(assetCardHomeEditViewModel, onextracallbackwithresult);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                putConfigCache.onWarmupCompleted(854830388, _string.onNavigationEvent.IAuthTabCallback(), -854830385, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), new Object[]{quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult, true, false, function0, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i8 >> 3) & 112) | 384), 8});
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                obj = objOnMinimized2;
                if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                Function0 function02 = (Function0) obj;
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetCardHomeEditViewModel);
                if (i13 != 256) {
                }
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnExtraCallback | z3)) {
                    objOnMinimized = new AssetCardHomeEditScreenKt$.ExternalSyntheticLambda10(assetCardHomeEditViewModel, onextracallbackwithresult);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    putConfigCache.onWarmupCompleted(854830388, _string.onNavigationEvent.IAuthTabCallback(), -854830385, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), new Object[]{quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult, true, false, function02, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i8 >> 3) & 112) | 384), 8});
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(getRelativeLeft getrelativeleft, Resources resources, getRpcProxy getrpcproxy, AssetCardHomeEditViewModel assetCardHomeEditViewModel, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) throws Resources.NotFoundException {
        String str;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
        List listOnWarmupCompleted = getrelativeleft.onWarmupCompleted();
        if (getrelativeleft.IAuthTabCallback().isEmpty()) {
            int i2 = onNavigationEvent;
            int i3 = i2 + 11;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 99;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            str = "";
        } else {
            String string = resources.getString(R.string.home_v2_feature_asset_home_edit_category_section_header_card_shown);
            Intrinsics.checkNotNull(string);
            str = string;
        }
        RVConfigService.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (String) null, listOnWarmupCompleted, str, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallbackWithResult(-378350710, true, new AssetCardHomeEditScreenKt$.ExternalSyntheticLambda11(getrpcproxy, assetCardHomeEditViewModel)), 9, (Object) null);
        List listIAuthTabCallback = getrelativeleft.IAuthTabCallback();
        String string2 = resources.getString(R.string.home_v2_feature_asset_home_edit_category_section_header_card_hidden);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        RVConfigService.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (String) null, listIAuthTabCallback, string2, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallbackWithResult(-1393107085, true, new AssetCardHomeEditScreenKt$.ExternalSyntheticLambda12(getrpcproxy, getrelativeleft, assetCardHomeEditViewModel)), 9, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 50 / 0;
            if (IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<getScreenWidth>) cameraPresenceProviderExternalSyntheticLambda6).onWarmupCompleted()) {
                int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
                int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
                int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
                if (!((Boolean) onExtraCallbackWithResult(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{getsupportedhighspeedresolutionsfor}, 2106457915, iIAuthTabCallback3, -2106457910)).booleanValue()) {
                    int iIAuthTabCallback4 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
                    int iIAuthTabCallback5 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
                    int iIAuthTabCallback6 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
                    onExtraCallbackWithResult(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback4, iIAuthTabCallback5, new Object[]{getsupportedhighspeedresolutionsfor, true}, 820840600, iIAuthTabCallback6, -820840596);
                    RVRpcProxy.asBinder(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "card");
                }
            }
        } else if (IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<getScreenWidth>) cameraPresenceProviderExternalSyntheticLambda6).onWarmupCompleted()) {
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 31;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(getTimebase gettimebase, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(gettimebase, (int) extensionsManager1.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 17;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(AssetCardHomeEditViewModel assetCardHomeEditViewModel) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            RVRpcProxy.asInterface(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "card");
            assetCardHomeEditViewModel.onNavigationEvent();
            Unit unit = Unit.INSTANCE;
            int i3 = onNavigationEvent + 79;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }
        RVRpcProxy.asInterface(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "card");
        assetCardHomeEditViewModel.onNavigationEvent();
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(AssetCardHomeEditViewModel assetCardHomeEditViewModel, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                int i5 = onNavigationEvent + 11;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i7 = onNavigationEvent + 51;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i9 = onExtraCallback + 119;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1055248149, i2, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetCardHomeEditScreen.<anonymous>.<anonymous>.<anonymous> (AssetCardHomeEditScreen.kt:219)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_v2_feature_asset_home_edit_save_cta_label, cameraCaptureResultEmptyCameraCaptureResult, 0);
            boolean zOnExtraCallback = IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<getScreenWidth>) cameraPresenceProviderExternalSyntheticLambda6).onExtraCallback();
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetCardHomeEditViewModel);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback2) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    AssetCardHomeEditScreenKt$.ExternalSyntheticLambda2 externalSyntheticLambda2 = new AssetCardHomeEditScreenKt$.ExternalSyntheticLambda2(assetCardHomeEditViewModel);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda2);
                    int i11 = onExtraCallback + 49;
                    onNavigationEvent = i11 % 128;
                    int i12 = i11 % 2;
                    obj = externalSyntheticLambda2;
                }
                u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, zOnExtraCallback, cameraCaptureResultEmptyCameraCaptureResult, 0, i2 & 14, 502);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(AssetCardHomeEditViewModel assetCardHomeEditViewModel) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            assetCardHomeEditViewModel.onExtraCallback();
            Unit unit = Unit.INSTANCE;
            int i3 = onExtraCallback + 59;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            throw null;
        }
        assetCardHomeEditViewModel.onExtraCallback();
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02df  */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@Nullable AssetCardHomeEditViewModel assetCardHomeEditViewModel, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        AssetCardHomeEditViewModel assetCardHomeEditViewModel2;
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        boolean z;
        ?? r14;
        AssetCardHomeEditViewModel assetCardHomeEditViewModel3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1367373942);
        if ((i & 6) == 0) {
            int i7 = onExtraCallback + 31;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0 && (i2 & 1) != 0) {
                assetCardHomeEditViewModel2 = assetCardHomeEditViewModel;
            } else {
                assetCardHomeEditViewModel2 = assetCardHomeEditViewModel;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(assetCardHomeEditViewModel2)) {
                    i5 = 4;
                }
                i3 = i5 | i;
            }
            i5 = 2;
            i3 = i5 | i;
        } else {
            assetCardHomeEditViewModel2 = assetCardHomeEditViewModel;
            i3 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 3) != 2, i3 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((i & 1) != 0) {
                int i8 = onExtraCallback + 25;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 77 / 0;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                        if ((i2 & 1) != 0) {
                            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                            if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent == null) {
                                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            }
                            z = false;
                            assetCardHomeEditViewModel2 = (AssetCardHomeEditViewModel) DefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda11.onExtraCallback(Reflection.getOrCreateKotlinClass(AssetCardHomeEditViewModel.class), textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent, (String) null, (ViewModelProvider.onWarmupCompleted) null, textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6 ? textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent.getDefaultViewModelCreationExtras() : AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0);
                            i3 &= -15;
                            r14 = z;
                        }
                        r14 = 0;
                    } else {
                        int i10 = onNavigationEvent + 23;
                        onExtraCallback = i10 % 128;
                        int i11 = i10 % 2;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        if ((i2 & 1) != 0) {
                            z = false;
                            i3 &= -15;
                            r14 = z;
                        }
                        r14 = 0;
                    }
                } else if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                }
                int i12 = i3;
                AssetCardHomeEditViewModel assetCardHomeEditViewModel4 = assetCardHomeEditViewModel2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i13 = onNavigationEvent + 33;
                    onExtraCallback = i13 % 128;
                    if (i13 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1367373942, i12, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetCardHomeEditScreen (AssetCardHomeEditScreen.kt:56)");
                        int i14 = 77 / r14;
                    } else {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1367373942, i12, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetCardHomeEditScreen (AssetCardHomeEditScreen.kt:56)");
                    }
                }
                getFontSize.IAuthTabCallback iAuthTabCallback = (getFontSize) AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(assetCardHomeEditViewModel4.IAuthTabCallback(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7).onExtraCallbackWithResult();
                Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback((Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback()));
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback((setRubIn) AssetCardHomeEditViewModel.onNavigationEvent(1629277376, new Object[]{assetCardHomeEditViewModel4}, -1629277376, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback()), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                Unit unit = Unit.INSTANCE;
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(assetCardHomeEditViewModel4);
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(activityIAuthTabCallback);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!(!(zOnExtraCallback | zOnExtraCallback2)) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new onExtraCallbackWithResult(assetCardHomeEditViewModel4, activityIAuthTabCallback, (access13800) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                getRpcProxy getrpcproxyOnNavigationEvent = RVRpcProxy.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (int) r14);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized2 = notifyPublicListeners.onWarmupCompleted((int) r14);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                }
                getTimebase gettimebase = (getTimebase) objOnMinimized2;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
                FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub();
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (int) r14);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (int) r14));
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
                getConfigJSONArray.onNavigationEvent(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_v2_feature_asset_home_edit_page_card_header, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (int) r14), (String) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (int) r14, 2);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = MeteringRepeatingSessionExternalSyntheticLambda0.onNavigationEvent(lowLightBoostControlExternalSyntheticLambda0, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport02, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null);
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), (boolean) r14);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (int) r14));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
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
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                if (iAuthTabCallback instanceof getFontSize.IAuthTabCallback) {
                    int i15 = onNavigationEvent + 69;
                    onExtraCallback = i15 % 128;
                    int i16 = i15 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(118619149);
                    Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult = Camera2CameraControllerExternalSyntheticLambda0.onExtraCallbackWithResult((int) r14, (int) r14, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (int) r14, 3);
                    getFontSize.IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
                    getRelativeLeft getrelativeleftIAuthTabCallback = iAuthTabCallback2.IAuthTabCallback();
                    Resources resources = (Resources) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback());
                    DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0IAuthTabCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).c_(IAuthTabCallback(gettimebase)) + VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(w3a.onWarmupCompleted.IAuthTabCallbackDefault() / 2.0f)), 7, (Object) null);
                    boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getrelativeleftIAuthTabCallback);
                    boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(resources);
                    boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getrpcproxyOnNavigationEvent);
                    boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(assetCardHomeEditViewModel4);
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!(zOnExtraCallback3 | zOnExtraCallback4 | zOnExtraCallback5 | zOnExtraCallback6)) {
                        Object obj = objOnMinimized3;
                        if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                            AssetCardHomeEditScreenKt$.ExternalSyntheticLambda3 externalSyntheticLambda3 = new AssetCardHomeEditScreenKt$.ExternalSyntheticLambda3(getrelativeleftIAuthTabCallback, resources, getrpcproxyOnNavigationEvent, assetCardHomeEditViewModel4);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda3);
                            obj = externalSyntheticLambda3;
                        }
                        ResolutionCorrector.onWarmupCompleted((QuirksExternalSyntheticBackport0) null, camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult, deviceQuirksExternalSyntheticLambda0IAuthTabCallback, false, (FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel) null, (QuirkSettingsLoader.onNavigationEvent) null, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, (removeChildrenForExpandedActionView) null, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 505);
                        if (iAuthTabCallback2.onNavigationEvent()) {
                            cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(123023846);
                            quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                            i4 = 0;
                            getNick.IAuthTabCallback(highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(quirksExternalSyntheticBackport0, onextracallbackwithresult.onExtraCallback()), cameraCaptureResultEmptyCameraCaptureResult3, 0, 0);
                            cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
                        } else {
                            quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                            cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            i4 = 0;
                            cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(123179528);
                            cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
                        }
                        u2 u2VarOnWarmupCompleted = t7a.onWarmupCompleted(IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<getScreenWidth>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback).onWarmupCompleted(), (Function0) null, (Function0) null, 0.0f, new t7ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent((Integer) null, i4, 1, (DefaultConstructorMarker) null), false, cameraCaptureResultEmptyCameraCaptureResult3, 0, 46);
                        if (IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<getScreenWidth>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback).onWarmupCompleted()) {
                            int i17 = onNavigationEvent + 121;
                            onExtraCallback = i17 % 128;
                            if (i17 % 2 == 0) {
                                u2.IAuthTabCallback(u2VarOnWarmupCompleted, (t7ExternalSyntheticLambda0.onExtraCallback) null, i4, (Object) null);
                            } else {
                                u2.IAuthTabCallback(u2VarOnWarmupCompleted, (t7ExternalSyntheticLambda0.onExtraCallback) null, 1, (Object) null);
                            }
                        } else {
                            u2.onNavigationEvent(u2VarOnWarmupCompleted, (t7ExternalSyntheticLambda0.onExtraCallback) null, 1, (Object) null);
                        }
                        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                        if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                            int i18 = onExtraCallback + 81;
                            onNavigationEvent = i18 % 128;
                            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = i18 % 2 != 0 ? CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 4, (Object) null) : CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                            cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted);
                            objOnMinimized4 = getsupportedhighspeedresolutionsforOnWarmupCompleted;
                        }
                        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized4;
                        boolean zOnWarmupCompleted = IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<getScreenWidth>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback).onWarmupCompleted();
                        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                        if (!zOnNavigationEvent) {
                            Object obj2 = objOnMinimized5;
                            if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                                AssetCardHomeEditScreenKt$.ExternalSyntheticLambda4 externalSyntheticLambda4 = new AssetCardHomeEditScreenKt$.ExternalSyntheticLambda4(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, getsupportedhighspeedresolutionsfor);
                                cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(externalSyntheticLambda4);
                                obj2 = externalSyntheticLambda4;
                            }
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(ImageLoaderBuilderExternalSyntheticLambda1.onWarmupCompleted(quirksExternalSyntheticBackport0, 0.0f, Boolean.valueOf(zOnWarmupCompleted), (Function0) obj2, cameraCaptureResultEmptyCameraCaptureResult3, 6, 1), onextracallbackwithresult.onWarmupCompleted());
                            Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                            if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized6 = new AssetCardHomeEditScreenKt$.ExternalSyntheticLambda5(gettimebase);
                                cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized6);
                            }
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4 = cameraCaptureResultEmptyCameraCaptureResult3;
                            u1.IAuthTabCallback(YuvImageOnePixelShiftQuirk.onExtraCallback(calculatePlaceholderForExtensions.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnWarmupCompleted3, (Function1) objOnMinimized6)), u2VarOnWarmupCompleted, ForwardingCameraControl.onExtraCallback(1055248149, true, new AssetCardHomeEditScreenKt$.ExternalSyntheticLambda6(assetCardHomeEditViewModel4, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback), cameraCaptureResultEmptyCameraCaptureResult3, 54), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (getBacktraceNote) null, 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResult4, 384, 0, 4088);
                            cameraCaptureResultEmptyCameraCaptureResult4.IAuthTabCallbackDefault();
                            assetCardHomeEditViewModel3 = assetCardHomeEditViewModel4;
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult4;
                        }
                    }
                } else {
                    assetCardHomeEditViewModel3 = assetCardHomeEditViewModel4;
                    if (Intrinsics.areEqual(iAuthTabCallback, new getFontSize() { // from class: o.getFontSize$onExtraCallbackWithResult
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallback = 1;
                        private static int onNavigationEvent = 0;
                        private static int onWarmupCompleted = 1;

                        static {
                            int i19 = IAuthTabCallback + 35;
                            onWarmupCompleted = i19 % 128;
                            if (i19 % 2 != 0) {
                                return;
                            }
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }

                        public boolean equals(@Nullable Object obj3) {
                            int i19 = 2 % 2;
                            if (this == obj3) {
                                int i20 = onNavigationEvent + 71;
                                onExtraCallback = i20 % 128;
                                int i21 = i20 % 2;
                                return true;
                            }
                            if (!(obj3 instanceof getFontSize$onExtraCallbackWithResult)) {
                                int i22 = onExtraCallback + 85;
                                onNavigationEvent = i22 % 128;
                                if (i22 % 2 != 0) {
                                    int i23 = 77 / 0;
                                }
                                return false;
                            }
                            int i24 = onNavigationEvent + 41;
                            onExtraCallback = i24 % 128;
                            if (i24 % 2 != 0) {
                                return true;
                            }
                            Object obj4 = null;
                            obj4.hashCode();
                            throw null;
                        }

                        public int hashCode() {
                            int i19 = 2 % 2;
                            int i20 = onNavigationEvent + 39;
                            onExtraCallback = i20 % 128;
                            if (i20 % 2 != 0) {
                                return -1595797885;
                            }
                            throw null;
                        }

                        public String toString() {
                            int i19 = 2 % 2;
                            int i20 = onNavigationEvent;
                            int i21 = i20 + 85;
                            onExtraCallback = i21 % 128;
                            if (i21 % 2 == 0) {
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                            int i22 = i20 + 125;
                            onExtraCallback = i22 % 128;
                            if (i22 % 2 == 0) {
                                int i23 = 6 / 0;
                            }
                            return "EmptyList";
                        }

                        public /* bridge */ IndexedValue<toJSONObject$onNavigationEvent.onExtraCallbackWithResult> onNavigationEvent(@NotNull String str) {
                            int i19 = 2 % 2;
                            int i20 = onNavigationEvent + 77;
                            onExtraCallback = i20 % 128;
                            int i21 = i20 % 2;
                            IndexedValue<toJSONObject$onNavigationEvent.onExtraCallbackWithResult> indexedValueOnNavigationEvent = super.onNavigationEvent(str);
                            if (i21 == 0) {
                                int i22 = 78 / 0;
                            }
                            int i23 = onExtraCallback + 19;
                            onNavigationEvent = i23 % 128;
                            int i24 = i23 % 2;
                            return indexedValueOnNavigationEvent;
                        }

                        public /* bridge */ getFontSize.IAuthTabCallback onWarmupCompleted() {
                            int i19 = 2 % 2;
                            int i20 = onExtraCallback + 37;
                            onNavigationEvent = i20 % 128;
                            if (i20 % 2 == 0) {
                                return super.onWarmupCompleted();
                            }
                            super.onWarmupCompleted();
                            throw null;
                        }
                    })) {
                        int i19 = onExtraCallback + 93;
                        onNavigationEvent = i19 % 128;
                        int i20 = i19 % 2;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(125099916);
                        getNick.onExtraCallback(highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(quirksExternalSyntheticBackport02, onextracallbackwithresult.onExtraCallback()), cameraCaptureResultEmptyCameraCaptureResult2, (int) r14, (int) r14);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        if (!(iAuthTabCallback instanceof getFontSize$onNavigationEvent)) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(973655917);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            throw new NoWhenBranchMatchedException();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(125331610);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(quirksExternalSyntheticBackport02, onextracallbackwithresult.onExtraCallback());
                        boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(assetCardHomeEditViewModel3);
                        Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                        if (!zOnExtraCallback7) {
                            int i21 = onExtraCallback + 123;
                            onNavigationEvent = i21 % 128;
                            if (i21 % 2 != 0) {
                                onwarmupcompleted.onExtraCallback();
                                throw null;
                            }
                            if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized7 = new AssetCardHomeEditScreenKt$.ExternalSyntheticLambda7(assetCardHomeEditViewModel3);
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized7);
                            }
                            getNick.onExtraCallbackWithResult((Function0) objOnMinimized7, quirksExternalSyntheticBackport0OnWarmupCompleted4, cameraCaptureResultEmptyCameraCaptureResult2, (int) r14, (int) r14);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        }
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i22 = onNavigationEvent + 103;
                    onExtraCallback = i22 % 128;
                    int i23 = i22 % 2;
                }
                assetCardHomeEditViewModel2 = assetCardHomeEditViewModel3;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new AssetCardHomeEditScreenKt$.ExternalSyntheticLambda8(assetCardHomeEditViewModel2, i, i2));
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = onExtraCallback + 113;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(zBooleanValue));
        if (i3 == 0) {
            return null;
        }
        int i4 = 79 / 0;
        return null;
    }

    private static final getScreenWidth IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<getScreenWidth> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getScreenWidth getscreenwidth = (getScreenWidth) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = onNavigationEvent + 123;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
        return getscreenwidth;
    }

    private static final int IAuthTabCallback(getTimebase gettimebase) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = gettimebase.onWarmupCompleted();
        int i4 = onNavigationEvent + 25;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(getTimebase gettimebase, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 3;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        gettimebase.onExtraCallback(i);
        int i5 = onExtraCallback + 119;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ Unit onExtraCallback(AssetCardHomeEditViewModel assetCardHomeEditViewModel) {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{assetCardHomeEditViewModel}, 875525802, iIAuthTabCallback3, -875525799);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getRpcProxy getrpcproxy, toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult, int i) {
        Object[] objArr = {getrpcproxy, onextracallbackwithresult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), objArr, 509068431, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -509068431);
    }

    public static /* synthetic */ Unit onExtraCallback(getRpcProxy getrpcproxy, AssetCardHomeEditViewModel assetCardHomeEditViewModel, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {getrpcproxy, assetCardHomeEditViewModel, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer.valueOf(i), onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onExtraCallbackWithResult(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), objArr, -298086524, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 298086526);
    }

    private static final Unit IAuthTabCallback(AssetCardHomeEditViewModel assetCardHomeEditViewModel, toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult, toJSONObject tojsonobject) {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{assetCardHomeEditViewModel, onextracallbackwithresult, tojsonobject}, 969465672, iIAuthTabCallback3, -969465671);
    }

    private static final boolean IAuthTabCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return ((Boolean) onExtraCallbackWithResult(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{getsupportedhighspeedresolutionsfor}, 2106457915, iIAuthTabCallback3, -2106457910)).booleanValue();
    }

    private static final void onNavigationEvent(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        onExtraCallbackWithResult(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), objArr, 820840600, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -820840596);
    }
}
