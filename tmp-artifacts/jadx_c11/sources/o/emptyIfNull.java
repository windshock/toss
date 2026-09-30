package o;

import android.content.Context;
import android.content.res.Configuration;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.content.ContextCompat;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AndroidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.ExtensionsManager1;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.GeckoHubImp;
import o.ImageViewUtilsExternalSyntheticLambda5;
import o.JsonUtils;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SessionProcessorCaptureCallback;
import o.addLinks;
import o.appendQueryParameters;
import o.emptyIfNull;
import o.encodeUriString;
import o.flipHorizontally;
import o.getSupportedHighSpeedResolutionsFor;
import o.onMenuItemClick;
import o.readFully;
import o.removeObserverLocked;
import o.setByteOrder;
import o.setIso;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class emptyIfNull {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static /* synthetic */ Unit IAuthTabCallback(long j, readFully readfully, setIso setiso) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(j, readfully, setiso);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(j, readfully, setiso);
        int i3 = onExtraCallback + 11;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 35 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(r8lambdanm9dm2eewl4vrptnjmesfjqky4, getsupportedhighspeedresolutionsfor, extensionsManager1);
        int i4 = onExtraCallbackWithResult + 15;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ removeObserverLocked IAuthTabCallback(long j, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        removeObserverLocked removeobserverlockedOnExtraCallback = onExtraCallback(j, sessionProcessorCaptureCallback);
        int i4 = onExtraCallback + 25;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return removeobserverlockedOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        ExtensionsManager1 extensionsManager1 = (ExtensionsManager1) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(getsupportedhighspeedresolutionsfor, extensionsManager1);
        }
        onWarmupCompleted(getsupportedhighspeedresolutionsfor, extensionsManager1);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        putDoubleIfValid putdoubleifvalid = (putDoubleIfValid) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[2];
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1 = (VirtualCameraControlExternalSyntheticLambda1) objArr[3];
        Function2 function2 = (Function2) objArr[4];
        Function2 function22 = (Function2) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int iIntValue2 = ((Number) objArr[7]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        ((Number) objArr[9]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(putdoubleifvalid, fFloatValue, quirksExternalSyntheticBackport0, virtualCameraControlExternalSyntheticLambda1, function2, function22, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 41;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        encodeUriString encodeuristring = (encodeUriString) objArr[2];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        addLinks.IAuthTabCallback iAuthTabCallback = (addLinks.IAuthTabCallback) objArr[5];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objArr[6];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4 = (getSupportedHighSpeedResolutionsFor) objArr[7];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5 = (getSupportedHighSpeedResolutionsFor) objArr[8];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6 = (getSupportedHighSpeedResolutionsFor) objArr[9];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[10];
        int iIntValue = ((Number) objArr[11]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, jLongValue, encodeuristring, getsupportedhighspeedresolutionsfor2, zBooleanValue, iAuthTabCallback, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4, getsupportedhighspeedresolutionsfor5, getsupportedhighspeedresolutionsfor6, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onExtraCallbackWithResult + 93;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, Function2 function2, Function2 function22, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 77;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallback(quirksExternalSyntheticBackport0, f, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function2, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function22, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 3;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function2 function2, Function2 function22, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 17;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport0, function2, function22, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 != 0) {
            int i7 = 5 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, defaultIfEmpty defaultifempty, encodeUriString encodeuristring, putDoubleIfValid putdoubleifvalid, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 125;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            Object[] objArr = {quirksExternalSyntheticBackport0, defaultifempty, encodeuristring, putdoubleifvalid, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
            return (Unit) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1266358655, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), objArr, 1266358655);
        }
        Object[] objArr2 = {quirksExternalSyntheticBackport0, defaultifempty, encodeuristring, putdoubleifvalid, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int i6 = 86 / 0;
        return (Unit) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1266358655, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), objArr2, 1266358655);
    }

    public static /* synthetic */ Unit onExtraCallback(putDoubleIfValid putdoubleifvalid, float f, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1, Function2 function2, Function2 function22, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 67;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {putdoubleifvalid, Float.valueOf(f), quirksExternalSyntheticBackport0, virtualCameraControlExternalSyntheticLambda1, function2, function22, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        Unit unit = (Unit) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -475243839, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), objArr, 475243850);
        int i7 = onExtraCallback + 55;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onWarmupCompleted(useandconfigureprogramwithtexture);
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(useandconfigureprogramwithtexture);
        int i3 = onExtraCallback + 125;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ AndroidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0 onExtraCallback(Context context, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, onMenuItemClick onmenuitemclick) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AndroidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0 androidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0IAuthTabCallback = IAuthTabCallback(context, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, onmenuitemclick);
        int i4 = onExtraCallbackWithResult + 13;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return androidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallbackDefault = IAuthTabCallbackDefault((getSupportedHighSpeedResolutionsFor<Object>) getsupportedhighspeedresolutionsfor);
        int i4 = onExtraCallback + 53;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return objIAuthTabCallbackDefault;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback2, 1087189983, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, new Object[]{getsupportedhighspeedresolutionsfor, obj}, -1087189977);
            return;
        }
        int iIAuthTabCallback3 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback4 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback4, 1087189983, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{getsupportedhighspeedresolutionsfor, obj}, -1087189977);
        int i3 = 83 / 0;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, JsonUtils jsonUtils) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onNavigationEvent((getSupportedHighSpeedResolutionsFor<JsonUtils>) getsupportedhighspeedresolutionsfor, jsonUtils);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 113;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, tryToStringObjectMap trytostringobjectmap) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback((getSupportedHighSpeedResolutionsFor<tryToStringObjectMap>) getsupportedhighspeedresolutionsfor, trytostringobjectmap);
        if (i3 == 0) {
            int i4 = 41 / 0;
        }
        int i5 = onExtraCallbackWithResult + 99;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(getsupportedhighspeedresolutionsfor, z);
        if (i3 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws NoWhenBranchMatchedException {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        defaultIfEmpty defaultifempty = (defaultIfEmpty) objArr[1];
        encodeUriString encodeuristring = (encodeUriString) objArr[2];
        putDoubleIfValid putdoubleifvalid = (putDoubleIfValid) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int iIntValue2 = ((Number) objArr[5]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(quirksExternalSyntheticBackport0, defaultifempty, encodeuristring, putdoubleifvalid, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 23;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(float f, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1, Function2 function2, Function2 function22, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 119;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            IAuthTabCallback(f, quirksExternalSyntheticBackport0, virtualCameraControlExternalSyntheticLambda1, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function2, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function22, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            IAuthTabCallback(f, quirksExternalSyntheticBackport0, virtualCameraControlExternalSyntheticLambda1, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function2, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function22, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent(putDoubleIfValid putdoubleifvalid, boolean z, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, long j, addLinks.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 93;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {putdoubleifvalid, Boolean.valueOf(z), getsupportedhighspeedresolutionsfor, r8lambdanm9dm2eewl4vrptnjmesfjqky4, Long.valueOf(j), iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        Unit unit = (Unit) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -435582498, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, objArr, 435582499);
        int i5 = onExtraCallback + 37;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static final /* synthetic */ tryToStringObjectMap onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tryToStringObjectMap trytostringobjectmapIAuthTabCallbackStub = IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<tryToStringObjectMap>) getsupportedhighspeedresolutionsfor);
        int i4 = onExtraCallback + 75;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return trytostringobjectmapIAuthTabCallbackStub;
    }

    public static final /* synthetic */ void onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, tryToStringObjectMap trytostringobjectmap) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback((getSupportedHighSpeedResolutionsFor<tryToStringObjectMap>) getsupportedhighspeedresolutionsfor, trytostringobjectmap);
        int i4 = onExtraCallbackWithResult + 119;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        asInterface(getsupportedhighspeedresolutionsfor, z);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i5);
        int i11 = ~i3;
        int i12 = (~(i8 | i11 | i6)) | i10;
        int i13 = (~(i5 | i11)) | (~(i7 | i11));
        int i14 = i6 + i3 + i2 + (1941422536 * i) + ((-555707305) * i4);
        int i15 = i14 * i14;
        int i16 = (i6 * (-2131549542)) + 177471488 + ((-2131549542) * i3) + (i9 * (-207299225)) + (i12 * (-207299225)) + ((-207299225) * i13) + (1956118528 * i2) + ((-1363148800) * i) + (2141716480 * i4) + ((-573308928) * i15);
        int i17 = ((i6 * 487360618) - 1291405921) + (i3 * 487360618) + (i9 * 543) + (i12 * 543) + (i13 * 543) + (i2 * 487361161) + (i * (-1188264952)) + (i4 * 624576655) + (i15 * (-25952256));
        switch (i16 + (i17 * i17 * 74186752)) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return asBinder(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case 9:
                return asInterface(objArr);
            case 10:
                return IAuthTabCallbackStubProxy(objArr);
            case 11:
                return IAuthTabCallback_Parcel(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        isQueryRefinementEnabled isqueryrefinementenabled = (isQueryRefinementEnabled) objArr[0];
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) objArr[1];
        isQueryRefinementEnabled isqueryrefinementenabled2 = (isQueryRefinementEnabled) objArr[2];
        flipHorizontally fliphorizontally = (flipHorizontally) objArr[3];
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(isqueryrefinementenabled, r8lambdanm9dm2eewl4vrptnjmesfjqky4, isqueryrefinementenabled2, fliphorizontally);
        }
        onWarmupCompleted(isqueryrefinementenabled, r8lambdanm9dm2eewl4vrptnjmesfjqky4, isqueryrefinementenabled2, fliphorizontally);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(float f, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1, Function2 function2, Function2 function22, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 9;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(f, quirksExternalSyntheticBackport0, virtualCameraControlExternalSyntheticLambda1, function2, function22, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallback + 21;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, Function2 function2, Function2 function22, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 53;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, f, function2, function22, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallbackWithResult + 93;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function2 function2, Function2 function22, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 113;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(quirksExternalSyntheticBackport0, function2, function22, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ tryToStringObjectMap onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tryToStringObjectMap trytostringobjectmapAsInterface = asInterface((getSupportedHighSpeedResolutionsFor<tryToStringObjectMap>) getsupportedhighspeedresolutionsfor);
        int i4 = onExtraCallback + 101;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return trytostringobjectmapAsInterface;
    }

    public static final /* synthetic */ void onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, appendQueryParameters appendqueryparameters) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback((getSupportedHighSpeedResolutionsFor<appendQueryParameters>) getsupportedhighspeedresolutionsfor, appendqueryparameters);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 77;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af A[PHI: r0
      0x00af: PHI (r0v2 o.tryToStringObjectMap) = (r0v1 o.tryToStringObjectMap), (r0v7 o.tryToStringObjectMap) binds: [B:36:0x00ad, B:33:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, ExtensionsManager1 extensionsManager1) {
        tryToStringObjectMap trytostringobjectmapIAuthTabCallbackStub;
        Integer numOnWarmupCompleted;
        int i = 2 % 2;
        long jOnNavigationEvent = ExtensionsManager1.Companion.onNavigationEvent();
        if (extensionsManager1 == null || !ExtensionsManager1.IAuthTabCallback(extensionsManager1.onExtraCallbackWithResult(), jOnNavigationEvent)) {
            int i2 = onExtraCallback + 15;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<tryToStringObjectMap>) getsupportedhighspeedresolutionsfor) != null) {
                int i4 = onExtraCallback + 77;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                tryToStringObjectMap trytostringobjectmapIAuthTabCallbackStub2 = IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<tryToStringObjectMap>) getsupportedhighspeedresolutionsfor);
                if ((trytostringobjectmapIAuthTabCallbackStub2 != null ? trytostringobjectmapIAuthTabCallbackStub2.onExtraCallback() : null) == null) {
                    tryToStringObjectMap trytostringobjectmapIAuthTabCallbackStub3 = IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<tryToStringObjectMap>) getsupportedhighspeedresolutionsfor);
                    onExtraCallback((getSupportedHighSpeedResolutionsFor<tryToStringObjectMap>) getsupportedhighspeedresolutionsfor, trytostringobjectmapIAuthTabCallbackStub3 != null ? tryToStringObjectMap.onWarmupCompleted(trytostringobjectmapIAuthTabCallbackStub3, null, Integer.valueOf((int) extensionsManager1.onExtraCallbackWithResult()), null, 5, null) : null);
                    int i6 = onExtraCallbackWithResult + 119;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    tryToStringObjectMap trytostringobjectmapIAuthTabCallbackStub4 = IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<tryToStringObjectMap>) getsupportedhighspeedresolutionsfor);
                    if (trytostringobjectmapIAuthTabCallbackStub4 != null) {
                        int i8 = onExtraCallbackWithResult + 91;
                        onExtraCallback = i8 % 128;
                        int i9 = i8 % 2;
                        Integer numOnExtraCallback = trytostringobjectmapIAuthTabCallbackStub4.onExtraCallback();
                        int iOnExtraCallbackWithResult = (int) extensionsManager1.onExtraCallbackWithResult();
                        if (numOnExtraCallback != null && numOnExtraCallback.intValue() == iOnExtraCallbackWithResult) {
                            int i10 = onExtraCallback + 69;
                            onExtraCallbackWithResult = i10 % 128;
                            if (!(i10 % 2 != 0)) {
                                int i11 = onExtraCallbackWithResult + 61;
                                onExtraCallback = i11 % 128;
                                if (i11 % 2 != 0) {
                                    trytostringobjectmapIAuthTabCallbackStub = IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<tryToStringObjectMap>) getsupportedhighspeedresolutionsfor);
                                    int i12 = 22 / 0;
                                    numOnWarmupCompleted = trytostringobjectmapIAuthTabCallbackStub != null ? trytostringobjectmapIAuthTabCallbackStub.onWarmupCompleted() : null;
                                } else {
                                    trytostringobjectmapIAuthTabCallbackStub = IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<tryToStringObjectMap>) getsupportedhighspeedresolutionsfor);
                                    if (trytostringobjectmapIAuthTabCallbackStub != null) {
                                    }
                                }
                                if (numOnWarmupCompleted == null) {
                                    tryToStringObjectMap trytostringobjectmapIAuthTabCallbackStub5 = IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<tryToStringObjectMap>) getsupportedhighspeedresolutionsfor);
                                    onExtraCallback((getSupportedHighSpeedResolutionsFor<tryToStringObjectMap>) getsupportedhighspeedresolutionsfor, trytostringobjectmapIAuthTabCallbackStub5 != null ? tryToStringObjectMap.onWarmupCompleted(trytostringobjectmapIAuthTabCallbackStub5, null, null, Integer.valueOf((int) extensionsManager1.onExtraCallbackWithResult()), 3, null) : null);
                                }
                            }
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static final removeObserverLocked onExtraCallback(final long j, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        float fOnExtraCallback = sessionProcessorCaptureCallback.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)) / Float.intBitsToFloat((int) sessionProcessorCaptureCallback.onWarmupCompleted());
        readFully.onExtraCallback onextracallback = readFully.Companion;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(Float.valueOf(0.0f), setByteOrder.onNavigationEvent(j));
        setByteOrder.onExtraCallbackWithResult onextracallbackwithresult = setByteOrder.Companion;
        final readFully readfullyIAuthTabCallback = readFully.onExtraCallback.IAuthTabCallback(onextracallback, new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(Float.valueOf(fOnExtraCallback), setByteOrder.onNavigationEvent(onextracallbackwithresult.IAuthTabCallbackDefault())), getWrite.IAuthTabCallback(Float.valueOf(1.0f - fOnExtraCallback), setByteOrder.onNavigationEvent(onextracallbackwithresult.IAuthTabCallbackDefault())), getWrite.IAuthTabCallback(Float.valueOf(1.0f), setByteOrder.onNavigationEvent(j))}, 0.0f, 0.0f, 0, 14, (Object) null);
        removeObserverLocked removeobserverlockedIAuthTabCallback = sessionProcessorCaptureCallback.IAuthTabCallback(new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenKt$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 69;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitIAuthTabCallback = emptyIfNull.IAuthTabCallback(j, readfullyIAuthTabCallback, (setIso) obj);
                int i5 = onNavigationEvent + 73;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitIAuthTabCallback;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        int i2 = onExtraCallbackWithResult + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return removeobserverlockedIAuthTabCallback;
    }

    private static final Unit onExtraCallbackWithResult(long j, readFully readfully, setIso setiso) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setiso, "");
        setOrientationDegrees.onWarmupCompleted(setiso, j, 0L, 0L, 0.0f, (hasMoreElements) null, (seek) null, 0, 126, (Object) null);
        setiso.onWarmupCompleted();
        setOrientationDegrees.onExtraCallback(setiso, readfully, 0L, 0L, 0.0f, (hasMoreElements) null, (seek) null, 0, 126, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 59;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ long $backgroundColor;
        final /* synthetic */ appendQueryParameters $contentState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(appendQueryParameters appendqueryparameters, long j, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$contentState = appendqueryparameters;
            this.$backgroundColor = j;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$contentState, this.$backgroundColor, access13800Var);
            int i2 = IAuthTabCallback + 117;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 3;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 25;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 31;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 89;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i2 + 33;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            this.$contentState.onExtraCallback(this.$backgroundColor);
            return Unit.INSTANCE;
        }
    }

    static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $enableMotion$delegate;
        final /* synthetic */ Object $screenContentId;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Object> $screenId$delegate;
        final /* synthetic */ boolean $showInitAnimation;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<JsonUtils> $slideMotion$delegate;
        final /* synthetic */ addLinks.IAuthTabCallback $type;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asInterface(boolean z, addLinks.IAuthTabCallback iAuthTabCallback, Object obj, getSupportedHighSpeedResolutionsFor<JsonUtils> getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor<Object> getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor3, access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
            this.$showInitAnimation = z;
            this.$type = iAuthTabCallback;
            this.$screenContentId = obj;
            this.$slideMotion$delegate = getsupportedhighspeedresolutionsfor;
            this.$screenId$delegate = getsupportedhighspeedresolutionsfor2;
            this.$enableMotion$delegate = getsupportedhighspeedresolutionsfor3;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asInterface asinterface = new asInterface(this.$showInitAnimation, this.$type, this.$screenContentId, this.$slideMotion$delegate, this.$screenId$delegate, this.$enableMotion$delegate, access13800Var);
            int i2 = onExtraCallbackWithResult + 67;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 53 / 0;
            }
            return asinterface;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 50 / 0;
            }
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            JsonUtils.onExtraCallbackWithResult onextracallbackwithresult;
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onWarmupCompleted + 55;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            getSupportedHighSpeedResolutionsFor<JsonUtils> getsupportedhighspeedresolutionsfor = this.$slideMotion$delegate;
            boolean z = true;
            if (!this.$showInitAnimation) {
                int i4 = onExtraCallbackWithResult + 75;
                onWarmupCompleted = i4 % 128;
                onextracallbackwithresult = null;
                if (i4 % 2 != 0) {
                    Intrinsics.areEqual(this.$type, addLinks.IAuthTabCallback.C0010IAuthTabCallback.onExtraCallbackWithResult);
                    throw null;
                }
                if (Intrinsics.areEqual(this.$type, addLinks.IAuthTabCallback.C0010IAuthTabCallback.onExtraCallbackWithResult)) {
                    onextracallbackwithresult = JsonUtils.onExtraCallbackWithResult.onExtraCallback;
                    int i5 = onExtraCallbackWithResult + 17;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    int i7 = onExtraCallbackWithResult + 55;
                    onWarmupCompleted = i7 % 128;
                    if (i7 % 2 != 0) {
                        onextracallbackwithresult.hashCode();
                        throw null;
                    }
                }
            }
            emptyIfNull.onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor) getsupportedhighspeedresolutionsfor, (JsonUtils) onextracallbackwithresult);
            getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor2 = this.$enableMotion$delegate;
            if (!this.$showInitAnimation) {
                int i8 = onExtraCallbackWithResult + 115;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                if (emptyIfNull.onExtraCallbackWithResult(this.$screenId$delegate) != null) {
                    int i10 = onExtraCallbackWithResult + 23;
                    onWarmupCompleted = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = 89 / 0;
                        if (Intrinsics.areEqual(emptyIfNull.onExtraCallbackWithResult(this.$screenId$delegate), this.$screenContentId)) {
                            z = false;
                        }
                    } else if (Intrinsics.areEqual(emptyIfNull.onExtraCallbackWithResult(this.$screenId$delegate), this.$screenContentId)) {
                    }
                }
            }
            emptyIfNull.onNavigationEvent(getsupportedhighspeedresolutionsfor2, z);
            emptyIfNull.onExtraCallbackWithResult(this.$screenId$delegate, this.$screenContentId);
            return Unit.INSTANCE;
        }
    }

    public static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Object $screenContentId;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<tryToStringObjectMap> $topAssetHeightState$delegate;
        final /* synthetic */ encodeUriString $topState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asBinder(Object obj, getSupportedHighSpeedResolutionsFor<tryToStringObjectMap> getsupportedhighspeedresolutionsfor, encodeUriString encodeuristring, access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
            this.$screenContentId = obj;
            this.$topAssetHeightState$delegate = getsupportedhighspeedresolutionsfor;
            this.$topState = encodeuristring;
        }

        public static /* synthetic */ int onExtraCallback(encodeUriString encodeuristring) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iIAuthTabCallback = IAuthTabCallback(encodeuristring);
            int i4 = IAuthTabCallback + 91;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return iIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = new asBinder(this.$screenContentId, this.$topAssetHeightState$delegate, this.$topState, access13800Var);
            int i2 = onNavigationEvent + 97;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return asbinder;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            int i3 = 2 / 0;
            return onExtraCallbackWithResult(findresandmsg, access13800Var);
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 103;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        private static final int IAuthTabCallback(encodeUriString encodeuristring) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                encodeuristring.onNavigationEvent();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iOnNavigationEvent = encodeuristring.onNavigationEvent();
            int i3 = IAuthTabCallback + 121;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return iOnNavigationEvent;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0048 A[PHI: r1
          0x0048: PHI (r1v12 java.lang.Object) = (r1v4 java.lang.Object), (r1v13 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r4
          0x0024: PHI (r4v1 int) = (r4v0 int), (r4v4 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted;
            int i;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 9;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 37 / 0;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    Object obj2 = this.$screenContentId;
                    if (obj2 != null) {
                        emptyIfNull.onNavigationEvent(this.$topAssetHeightState$delegate, new tryToStringObjectMap(obj2, access14000.onNavigationEvent(0), null, 4, null));
                    }
                    final encodeUriString encodeuristring = this.$topState;
                    IAnimation iAnimationOnNavigationEvent = ycxycx.onNavigationEvent(ycxycx.onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new Function0() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenKt$TdsAgreementV4Screen$agreementContent$1$1$1$5$1$$ExternalSyntheticLambda0
                        private static int onExtraCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke() {
                            int i5 = 2 % 2;
                            int i6 = onWarmupCompleted + 121;
                            onExtraCallback = i6 % 128;
                            int i7 = i6 % 2;
                            int iOnExtraCallback = emptyIfNull.asBinder.onExtraCallback(encodeuristring);
                            if (i7 != 0) {
                                return Integer.valueOf(iOnExtraCallback);
                            }
                            Integer.valueOf(iOnExtraCallback);
                            throw null;
                        }
                    })));
                    final getSupportedHighSpeedResolutionsFor<tryToStringObjectMap> getsupportedhighspeedresolutionsfor = this.$topAssetHeightState$delegate;
                    setRipple setripple = new setRipple() { // from class: o.emptyIfNull.asBinder.4
                        private static int onExtraCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public /* synthetic */ Object emit(Object obj3, access13800 access13800Var) {
                            int i5 = 2 % 2;
                            int i6 = onExtraCallbackWithResult + 49;
                            onExtraCallback = i6 % 128;
                            int i7 = i6 % 2;
                            Object objOnNavigationEvent = onNavigationEvent(((Number) obj3).intValue(), access13800Var);
                            int i8 = onExtraCallbackWithResult + 53;
                            onExtraCallback = i8 % 128;
                            if (i8 % 2 == 0) {
                                return objOnNavigationEvent;
                            }
                            Object obj4 = null;
                            obj4.hashCode();
                            throw null;
                        }

                        public final Object onNavigationEvent(int i5, access13800<? super Unit> access13800Var) {
                            Integer numOnWarmupCompleted;
                            int i6 = 2 % 2;
                            int i7 = onExtraCallbackWithResult + 107;
                            onExtraCallback = i7 % 128;
                            int i8 = i7 % 2;
                            tryToStringObjectMap trytostringobjectmapOnWarmupCompleted = emptyIfNull.onWarmupCompleted(getsupportedhighspeedresolutionsfor);
                            tryToStringObjectMap trytostringobjectmapOnWarmupCompleted2 = null;
                            if ((trytostringobjectmapOnWarmupCompleted != null ? trytostringobjectmapOnWarmupCompleted.onExtraCallback() : null) != null) {
                                tryToStringObjectMap trytostringobjectmapOnWarmupCompleted3 = emptyIfNull.onWarmupCompleted(getsupportedhighspeedresolutionsfor);
                                if (trytostringobjectmapOnWarmupCompleted3 != null) {
                                    int i9 = onExtraCallback + 99;
                                    onExtraCallbackWithResult = i9 % 128;
                                    if (i9 % 2 == 0) {
                                        trytostringobjectmapOnWarmupCompleted3.onWarmupCompleted();
                                        throw null;
                                    }
                                    numOnWarmupCompleted = trytostringobjectmapOnWarmupCompleted3.onWarmupCompleted();
                                } else {
                                    numOnWarmupCompleted = null;
                                }
                                if (numOnWarmupCompleted == null) {
                                    getSupportedHighSpeedResolutionsFor<tryToStringObjectMap> getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor;
                                    tryToStringObjectMap trytostringobjectmapOnWarmupCompleted4 = emptyIfNull.onWarmupCompleted(getsupportedhighspeedresolutionsfor2);
                                    if (trytostringobjectmapOnWarmupCompleted4 != null) {
                                        trytostringobjectmapOnWarmupCompleted2 = tryToStringObjectMap.onWarmupCompleted(trytostringobjectmapOnWarmupCompleted4, null, null, access14000.onNavigationEvent(i5), 3, null);
                                        int i10 = onExtraCallbackWithResult + 45;
                                        onExtraCallback = i10 % 128;
                                        int i11 = i10 % 2;
                                    }
                                    emptyIfNull.onNavigationEvent(getsupportedhighspeedresolutionsfor2, trytostringobjectmapOnWarmupCompleted2);
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (iAnimationOnNavigationEvent.collect(setripple, this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = onNavigationEvent + 71;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    ResultKt.onNavigationEvent(obj);
                    if (i6 == 0) {
                        int i7 = 5 / 0;
                    }
                    int i8 = IAuthTabCallback + 111;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                }
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
            }
            Unit unit = Unit.INSTANCE;
            int i10 = onNavigationEvent + 43;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            return unit;
        }
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Object $screenContentId;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<tryToStringObjectMap> $screenHeightState$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(Object obj, getSupportedHighSpeedResolutionsFor<tryToStringObjectMap> getsupportedhighspeedresolutionsfor, access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
            this.$screenContentId = obj;
            this.$screenHeightState$delegate = getsupportedhighspeedresolutionsfor;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = new onTransact(this.$screenContentId, this.$screenHeightState$delegate, access13800Var);
            int i2 = IAuthTabCallback + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return ontransact;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 47;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onTransact ontransactCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return ontransactCreate.invokeSuspend(Unit.INSTANCE);
            }
            ontransactCreate.invokeSuspend(Unit.INSTANCE);
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
            Object obj2 = this.$screenContentId;
            if (obj2 != null) {
                emptyIfNull.onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor) this.$screenHeightState$delegate, new tryToStringObjectMap(obj2, null, null, 6, null));
                int i2 = IAuthTabCallback + 119;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
            }
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 125;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, final long j, encodeUriString encodeuristring, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, boolean z, addLinks.IAuthTabCallback iAuthTabCallback, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 97;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0 ? (i & 3) == 2 : (i & 4) == 4) {
            int i5 = i3 + 95;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 / 5;
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1)) {
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallbackWithResult + 5;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1034281195, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4Screen.<anonymous>.<anonymous> (TdsAgreementV4Screen.kt:124)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1034281195, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4Screen.<anonymous>.<anonymous> (TdsAgreementV4Screen.kt:124)");
            }
            int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            appendQueryParameters appendqueryparameters = (appendQueryParameters) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1269760032, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, new Object[]{getsupportedhighspeedresolutionsfor}, -1269760030);
            if (appendqueryparameters == null) {
                int i8 = onExtraCallback + 77;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(175829810);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(175829811);
                Object objIAuthTabCallback = appendqueryparameters.IAuthTabCallback();
                int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
                boolean zBooleanValue = ((Boolean) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1107538970, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{getsupportedhighspeedresolutionsfor4}, 1107538978)).booleanValue();
                JsonUtils jsonUtilsAccess100 = access100(getsupportedhighspeedresolutionsfor2);
                Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult = Camera2CameraControllerExternalSyntheticLambda0.onExtraCallbackWithResult(0, 0, cameraCaptureResultEmptyCameraCaptureResult, 0, 3);
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenKt$$ExternalSyntheticLambda9
                        private static int onExtraCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke(Object obj2) {
                            int i10 = 2 % 2;
                            int i11 = onExtraCallback + 39;
                            onExtraCallbackWithResult = i11 % 128;
                            int i12 = i11 % 2;
                            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor7 = getsupportedhighspeedresolutionsfor5;
                            ExtensionsManager1 extensionsManager1 = (ExtensionsManager1) obj2;
                            if (i12 != 0) {
                                int iIAuthTabCallback3 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
                                int iIAuthTabCallback4 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
                                return (Unit) emptyIfNull.onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback4, 2088066611, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{getsupportedhighspeedresolutionsfor7, extensionsManager1}, -2088066601);
                            }
                            int iIAuthTabCallback5 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
                            int iIAuthTabCallback6 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
                            int i13 = 39 / 0;
                            return (Unit) emptyIfNull.onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback6, 2088066611, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback5, new Object[]{getsupportedhighspeedresolutionsfor7, extensionsManager1}, -2088066601);
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    int i10 = onExtraCallbackWithResult + 59;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = calculatePlaceholderForExtensions.onExtraCallbackWithResult(onextracallback, (Function1) objOnMinimized);
                boolean zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(j);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnWarmupCompleted || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized2 = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenKt$$ExternalSyntheticLambda10
                        private static int IAuthTabCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj2) {
                            int i12 = 2 % 2;
                            int i13 = onNavigationEvent + 45;
                            IAuthTabCallback = i13 % 128;
                            int i14 = i13 % 2;
                            removeObserverLocked removeobserverlockedIAuthTabCallback = emptyIfNull.IAuthTabCallback(j, (SessionProcessorCaptureCallback) obj2);
                            int i15 = IAuthTabCallback + 119;
                            onNavigationEvent = i15 % 128;
                            if (i15 % 2 == 0) {
                                return removeobserverlockedIAuthTabCallback;
                            }
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                }
                Object obj2 = null;
                containsIgnoreCase.onExtraCallback(SessionProcessorSurface.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, (Function1) objOnMinimized2), zBooleanValue, jsonUtilsAccess100, encodeuristring, appendqueryparameters, camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
                setByteOrder setbyteorderOnNavigationEvent = setByteOrder.onNavigationEvent(j);
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appendqueryparameters);
                boolean zOnWarmupCompleted2 = cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(j);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if ((zOnNavigationEvent | zOnWarmupCompleted2) || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized3 = new onExtraCallback(appendqueryparameters, j, null);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                }
                isZslDisabledByByUserCaseConfig.onExtraCallback(appendqueryparameters, setbyteorderOnNavigationEvent, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult, 0);
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor2);
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z);
                boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iAuthTabCallback);
                boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor3);
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(objIAuthTabCallback);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if ((zOnNavigationEvent2 | zOnExtraCallback | zOnNavigationEvent3 | zOnNavigationEvent4 | zOnExtraCallback2) || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized4 = new asInterface(z, iAuthTabCallback, objIAuthTabCallback, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4, null);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(objIAuthTabCallback, (Function2) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResult, 0);
                boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(objIAuthTabCallback);
                boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(encodeuristring);
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if ((zOnExtraCallback3 | zOnNavigationEvent5) || objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized5 = new asBinder(objIAuthTabCallback, getsupportedhighspeedresolutionsfor6, encodeuristring, null);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(objIAuthTabCallback, (Function2) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResult, 0);
                boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(objIAuthTabCallback);
                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnExtraCallback4) {
                    int i12 = onExtraCallbackWithResult + 11;
                    onExtraCallback = i12 % 128;
                    if (i12 % 2 != 0) {
                        onwarmupcompleted.onExtraCallback();
                        obj2.hashCode();
                        throw null;
                    }
                    if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized6 = new onTransact(objIAuthTabCallback, getsupportedhighspeedresolutionsfor5, null);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized6);
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(objIAuthTabCallback, (Function2) objOnMinimized6, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        long jOnNavigationEvent = ExtensionsManager1.Companion.onNavigationEvent();
        if (extensionsManager1 != null) {
            boolean zIAuthTabCallback = ExtensionsManager1.IAuthTabCallback(extensionsManager1.onExtraCallbackWithResult(), jOnNavigationEvent);
            int i2 = onExtraCallback + 69;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 % 5;
            }
            if (!zIAuthTabCallback) {
            }
            return Unit.INSTANCE;
        }
        int i4 = onExtraCallback + 63;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback((getSupportedHighSpeedResolutionsFor<VirtualCameraControlExternalSyntheticLambda1>) getsupportedhighspeedresolutionsfor, r8lambdanm9dm2eewl4vrptnjmesfjqky4.c_((int) extensionsManager1.onExtraCallbackWithResult()));
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(isQueryRefinementEnabled isqueryrefinementenabled, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, isQueryRefinementEnabled isqueryrefinementenabled2, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.IAuthTabCallbackStub(((Number) isqueryrefinementenabled.IAuthTabCallback()).floatValue());
        fliphorizontally.access000(r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(((Number) isqueryrefinementenabled2.IAuthTabCallback()).floatValue())));
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 77;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        } else {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        }
        unregisterOutputSurface.onTransact(useandconfigureprogramwithtexture, true);
        return Unit.INSTANCE;
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $ctaOpacity;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $ctaTranslationY;
        final /* synthetic */ boolean $showInitAnimation;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStub(boolean z, isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled2, access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
            this.$showInitAnimation = z;
            this.$ctaTranslationY = isqueryrefinementenabled;
            this.$ctaOpacity = isqueryrefinementenabled2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = new IAuthTabCallbackStub(this.$showInitAnimation, this.$ctaTranslationY, this.$ctaOpacity, access13800Var);
            iAuthTabCallbackStub.L$0 = obj;
            int i2 = IAuthTabCallback + 105;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallbackStub;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 1;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallback;
            }
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            IAuthTabCallbackStub iAuthTabCallbackStubCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                iAuthTabCallbackStubCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = iAuthTabCallbackStubCreate.invokeSuspend(unit);
            int i4 = IAuthTabCallback + 107;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 35;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i2 + 23;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            if (this.$showInitAnimation) {
                maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass1(this.$ctaTranslationY, 320, null), 3, (Object) null);
                maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass5(this.$ctaOpacity, 320, null), 3, (Object) null);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: o.emptyIfNull$IAuthTabCallbackStub$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;
            final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $ctaTranslationY;
            final /* synthetic */ int $delayMillis;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, int i, access13800<? super AnonymousClass1> access13800Var) {
                super(2, access13800Var);
                this.$ctaTranslationY = isqueryrefinementenabled;
                this.$delayMillis = i;
            }

            public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 39;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onNavigationEvent + 27;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$ctaTranslationY, this.$delayMillis, access13800Var);
                int i2 = onNavigationEvent + 33;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass1;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                Object objIAuthTabCallback;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 17;
                IAuthTabCallback = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
                    int i3 = 66 / 0;
                } else {
                    objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
                }
                int i4 = IAuthTabCallback + 33;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return objIAuthTabCallback;
                }
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 37;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i4 = this.label;
                if (i4 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled = this.$ctaTranslationY;
                    Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(0.0f);
                    getThumbPosition getthumbpositionOnExtraCallbackWithResult = getSplitTrack.onExtraCallbackWithResult(getIconContentView.onWarmupCompleted.IAuthTabCallback(), this.$delayMillis);
                    this.label = 1;
                    if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled, fOnExtraCallbackWithResult, getthumbpositionOnExtraCallbackWithResult, (Object) null, (Function1) null, this, 12, (Object) null) == objOnWarmupCompleted) {
                        int i5 = IAuthTabCallback + 11;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i7 = onNavigationEvent + 87;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        throw null;
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* renamed from: o.emptyIfNull$IAuthTabCallbackStub$5, reason: invalid class name */
        static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $ctaOpacity;
            final /* synthetic */ int $delayMillis;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, int i, access13800<? super AnonymousClass5> access13800Var) {
                super(2, access13800Var);
                this.$ctaOpacity = isqueryrefinementenabled;
                this.$delayMillis = i;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$ctaOpacity, this.$delayMillis, access13800Var);
                int i2 = onExtraCallbackWithResult + 13;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return anonymousClass5;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 103;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
                int i4 = onWarmupCompleted + 89;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return objOnExtraCallbackWithResult;
            }

            public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 21;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onWarmupCompleted + 19;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 55 / 0;
                }
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 67;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i4 = this.label;
                if (i4 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled = this.$ctaOpacity;
                    Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(1.0f);
                    getThumbPosition getthumbpositionOnExtraCallbackWithResult = getSplitTrack.onExtraCallbackWithResult(getIconContentView.onWarmupCompleted.IAuthTabCallback(), this.$delayMillis);
                    this.label = 1;
                    if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled, fOnExtraCallbackWithResult, getthumbpositionOnExtraCallbackWithResult, (Object) null, (Function1) null, this, 12, (Object) null) == objOnWarmupCompleted) {
                        int i5 = onExtraCallbackWithResult + 1;
                        onWarmupCompleted = i5 % 128;
                        if (i5 % 2 != 0) {
                            return objOnWarmupCompleted;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        boolean z;
        float f;
        float f2;
        float f3;
        putDoubleIfValid putdoubleifvalid = (putDoubleIfValid) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[2];
        final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) objArr[3];
        long jLongValue = ((Number) objArr[4]).longValue();
        addLinks.IAuthTabCallback iAuthTabCallback = (addLinks.IAuthTabCallback) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        if ((iIntValue & 3) != 2) {
            z = true;
        } else {
            int i2 = onExtraCallback + 37;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i4 = onExtraCallbackWithResult + 51;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1825394480, iIntValue, -1, "im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4Screen.<anonymous>.<anonymous> (TdsAgreementV4Screen.kt:200)");
            }
            if (putdoubleifvalid == null) {
                int i6 = onExtraCallbackWithResult + 9;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1746100276);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    int i7 = 17 / 0;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1746100276);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1746100277);
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(putdoubleifvalid);
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(zBooleanValue);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnNavigationEvent | zOnExtraCallback)) {
                    int i8 = onExtraCallbackWithResult + 47;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        if (zBooleanValue) {
                            f = 0.0f;
                        } else {
                            int i10 = onExtraCallbackWithResult + 11;
                            onExtraCallback = i10 % 128;
                            int i11 = i10 % 2;
                            f = 1.0f;
                        }
                        objOnMinimized = isIconified.onWarmupCompleted(f, 0.0f, 2, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    }
                    final isQueryRefinementEnabled isqueryrefinementenabled = (isQueryRefinementEnabled) objOnMinimized;
                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(putdoubleifvalid);
                    boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(zBooleanValue);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(zOnNavigationEvent2 | zOnExtraCallback2)) {
                        Object obj = objOnMinimized2;
                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            if (zBooleanValue) {
                                int i12 = onExtraCallback + 29;
                                onExtraCallbackWithResult = i12 % 128;
                                f3 = 20.0f;
                                if (i12 % 2 == 0) {
                                    int i13 = 12 / 0;
                                }
                                f2 = 0.0f;
                            } else {
                                f2 = 0.0f;
                                f3 = 0.0f;
                            }
                            isQueryRefinementEnabled isqueryrefinementenabledOnWarmupCompleted = isIconified.onWarmupCompleted(f3, f2, 2, (Object) null);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(isqueryrefinementenabledOnWarmupCompleted);
                            obj = isqueryrefinementenabledOnWarmupCompleted;
                        }
                        final isQueryRefinementEnabled isqueryrefinementenabled2 = (isQueryRefinementEnabled) obj;
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                        boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                        boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4);
                        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if ((zOnNavigationEvent3 | zOnNavigationEvent4) || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized3 = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenKt$$ExternalSyntheticLambda11
                                private static int onExtraCallback = 0;
                                private static int onNavigationEvent = 1;

                                public final Object invoke(Object obj2) {
                                    int i14 = 2 % 2;
                                    int i15 = onExtraCallback + 71;
                                    onNavigationEvent = i15 % 128;
                                    int i16 = i15 % 2;
                                    Unit unitIAuthTabCallback = emptyIfNull.IAuthTabCallback(r8lambdanm9dm2eewl4vrptnjmesfjqky4, getsupportedhighspeedresolutionsfor, (ExtensionsManager1) obj2);
                                    int i17 = onExtraCallback + 109;
                                    onNavigationEvent = i17 % 128;
                                    if (i17 % 2 == 0) {
                                        int i18 = 44 / 0;
                                    }
                                    return unitIAuthTabCallback;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = calculatePlaceholderForExtensions.onExtraCallbackWithResult(onextracallback, (Function1) objOnMinimized3);
                        boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(isqueryrefinementenabled);
                        boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4);
                        boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(isqueryrefinementenabled2);
                        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if ((zOnExtraCallback3 | zOnNavigationEvent5 | zOnExtraCallback4) || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized4 = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenKt$$ExternalSyntheticLambda12
                                private static int IAuthTabCallback = 0;
                                private static int onExtraCallback = 1;

                                public final Object invoke(Object obj2) {
                                    int i14 = 2 % 2;
                                    int i15 = IAuthTabCallback + 105;
                                    onExtraCallback = i15 % 128;
                                    int i16 = i15 % 2;
                                    Object[] objArr2 = {isqueryrefinementenabled, r8lambdanm9dm2eewl4vrptnjmesfjqky4, isqueryrefinementenabled2, (flipHorizontally) obj2};
                                    int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
                                    Unit unit = (Unit) emptyIfNull.onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 3271863, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, objArr2, -3271859);
                                    int i17 = onExtraCallback + 67;
                                    IAuthTabCallback = i17 % 128;
                                    if (i17 % 2 == 0) {
                                        return unit;
                                    }
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, (Function1) objOnMinimized4);
                        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                        if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized5 = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenKt$$ExternalSyntheticLambda13
                                private static int IAuthTabCallback = 0;
                                private static int onExtraCallbackWithResult = 1;

                                public final Object invoke(Object obj2) {
                                    int i14 = 2 % 2;
                                    int i15 = onExtraCallbackWithResult + 47;
                                    IAuthTabCallback = i15 % 128;
                                    useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) obj2;
                                    if (i15 % 2 == 0) {
                                        return emptyIfNull.onExtraCallback(useandconfigureprogramwithtexture);
                                    }
                                    emptyIfNull.onExtraCallback(useandconfigureprogramwithtexture);
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
                        }
                        putFloatIfValid.onNavigationEvent(jLongValue, getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0IAuthTabCallback, false, (Function1) objOnMinimized5, 1, (Object) null), putdoubleifvalid, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
                        boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(zBooleanValue);
                        boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(isqueryrefinementenabled2);
                        boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(isqueryrefinementenabled);
                        Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!(zOnExtraCallback5 | zOnExtraCallback6 | zOnExtraCallback7)) {
                            int i14 = onExtraCallback + 45;
                            onExtraCallbackWithResult = i14 % 128;
                            int i15 = i14 % 2;
                            if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized6 = new IAuthTabCallbackStub(zBooleanValue, isqueryrefinementenabled2, isqueryrefinementenabled, null);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized6);
                            }
                            isZslDisabledByByUserCaseConfig.onExtraCallback(putdoubleifvalid, iAuthTabCallback, (Function2) objOnMinimized6, cameraCaptureResultEmptyCameraCaptureResult, 0);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        }
                    }
                }
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i16 = onExtraCallback + 87;
                onExtraCallbackWithResult = i16 % 128;
                int i17 = i16 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<appendQueryParameters> $screenState$delegate;
        final /* synthetic */ defaultIfEmpty $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(defaultIfEmpty defaultifempty, getSupportedHighSpeedResolutionsFor<appendQueryParameters> getsupportedhighspeedresolutionsfor, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$state = defaultifempty;
            this.$screenState$delegate = getsupportedhighspeedresolutionsfor;
        }

        public static /* synthetic */ appendQueryParameters onExtraCallback(defaultIfEmpty defaultifempty) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            appendQueryParameters appendqueryparametersOnWarmupCompleted = onWarmupCompleted(defaultifempty);
            int i4 = onExtraCallback + 109;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return appendqueryparametersOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$state, this.$screenState$delegate, access13800Var);
            int i2 = onExtraCallback + 49;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onnavigationevent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 9;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 109;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 73 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                final defaultIfEmpty defaultifempty = this.$state;
                IAnimation iAnimationOnNavigationEvent = ycxycx.onNavigationEvent(ycxycx.onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new Function0() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenKt$TdsAgreementV4Screen$1$1$$ExternalSyntheticLambda0
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        int i5 = 2 % 2;
                        int i6 = onWarmupCompleted + 53;
                        onNavigationEvent = i6 % 128;
                        int i7 = i6 % 2;
                        appendQueryParameters appendqueryparametersOnExtraCallback = emptyIfNull.onNavigationEvent.onExtraCallback(defaultifempty);
                        int i8 = onWarmupCompleted + 111;
                        onNavigationEvent = i8 % 128;
                        if (i8 % 2 == 0) {
                            return appendqueryparametersOnExtraCallback;
                        }
                        throw null;
                    }
                })));
                final getSupportedHighSpeedResolutionsFor<appendQueryParameters> getsupportedhighspeedresolutionsfor = this.$screenState$delegate;
                setRipple setripple = new setRipple() { // from class: o.emptyIfNull.onNavigationEvent.5
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public /* synthetic */ Object emit(Object obj2, access13800 access13800Var) {
                        int i5 = 2 % 2;
                        int i6 = IAuthTabCallback + 51;
                        onExtraCallbackWithResult = i6 % 128;
                        int i7 = i6 % 2;
                        Object objOnWarmupCompleted2 = onWarmupCompleted((appendQueryParameters) obj2, access13800Var);
                        int i8 = onExtraCallbackWithResult + 45;
                        IAuthTabCallback = i8 % 128;
                        if (i8 % 2 == 0) {
                            int i9 = 40 / 0;
                        }
                        return objOnWarmupCompleted2;
                    }

                    public final Object onWarmupCompleted(appendQueryParameters appendqueryparameters, access13800<? super Unit> access13800Var) {
                        Unit unit;
                        int i5 = 2 % 2;
                        int i6 = IAuthTabCallback + 89;
                        onExtraCallbackWithResult = i6 % 128;
                        if (i6 % 2 != 0) {
                            emptyIfNull.onWarmupCompleted(getsupportedhighspeedresolutionsfor, appendqueryparameters);
                            unit = Unit.INSTANCE;
                            int i7 = 46 / 0;
                        } else {
                            emptyIfNull.onWarmupCompleted(getsupportedhighspeedresolutionsfor, appendqueryparameters);
                            unit = Unit.INSTANCE;
                        }
                        int i8 = IAuthTabCallback + 125;
                        onExtraCallbackWithResult = i8 % 128;
                        int i9 = i8 % 2;
                        return unit;
                    }
                };
                this.label = 1;
                if (iAnimationOnNavigationEvent.collect(setripple, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = onWarmupCompleted + 67;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }

        private static final appendQueryParameters onWarmupCompleted(defaultIfEmpty defaultifempty) {
            Object next;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Iterator<T> it = defaultifempty.IAuthTabCallback_Parcel().iterator();
            int i4 = onExtraCallback + 93;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            while (true) {
                if (!it.hasNext()) {
                    int i6 = onWarmupCompleted + 113;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    next = null;
                    break;
                }
                int i8 = onWarmupCompleted + 119;
                onExtraCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    next = it.next();
                    int i9 = 99 / 0;
                    if (((appendQueryParameters) next).extraCallback()) {
                        break;
                    }
                } else {
                    next = it.next();
                    if (((appendQueryParameters) next).extraCallback()) {
                        break;
                    }
                }
            }
            return (appendQueryParameters) next;
        }
    }

    public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<tryToStringObjectMap> $screenHeightState$delegate;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Object> $screenId$delegate;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<JsonUtils> $slideMotion$delegate;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<tryToStringObjectMap> $topAssetHeightState$delegate;
        final /* synthetic */ addLinks.IAuthTabCallback $type;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(addLinks.IAuthTabCallback iAuthTabCallback, getSupportedHighSpeedResolutionsFor<Object> getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor<tryToStringObjectMap> getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor<tryToStringObjectMap> getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutionsFor<JsonUtils> getsupportedhighspeedresolutionsfor4, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$type = iAuthTabCallback;
            this.$screenId$delegate = getsupportedhighspeedresolutionsfor;
            this.$topAssetHeightState$delegate = getsupportedhighspeedresolutionsfor2;
            this.$screenHeightState$delegate = getsupportedhighspeedresolutionsfor3;
            this.$slideMotion$delegate = getsupportedhighspeedresolutionsfor4;
        }

        public static /* synthetic */ JsonUtils IAuthTabCallback(addLinks.IAuthTabCallback iAuthTabCallback, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 29;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                onWarmupCompleted(iAuthTabCallback, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            JsonUtils jsonUtilsOnWarmupCompleted = onWarmupCompleted(iAuthTabCallback, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3);
            int i3 = onExtraCallbackWithResult + 71;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return jsonUtilsOnWarmupCompleted;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$type, this.$screenId$delegate, this.$topAssetHeightState$delegate, this.$screenHeightState$delegate, this.$slideMotion$delegate, access13800Var);
            int i2 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallback;
            }
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                onextracallbackwithresultCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = onextracallbackwithresultCreate.invokeSuspend(unit);
            int i4 = onExtraCallbackWithResult + 59;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0129  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final JsonUtils onWarmupCompleted(addLinks.IAuthTabCallback iAuthTabCallback, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3) {
            Integer numValueOf;
            Integer numOnExtraCallback;
            Integer numValueOf2;
            Integer numOnWarmupCompleted;
            Integer numOnWarmupCompleted2;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 17;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (Intrinsics.areEqual(iAuthTabCallback, addLinks.IAuthTabCallback.C0010IAuthTabCallback.onExtraCallbackWithResult)) {
                return JsonUtils.onExtraCallbackWithResult.onExtraCallback;
            }
            if (emptyIfNull.onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor) != null) {
                Object objOnExtraCallbackWithResult = emptyIfNull.onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor);
                tryToStringObjectMap trytostringobjectmapOnWarmupCompleted = emptyIfNull.onWarmupCompleted(getsupportedhighspeedresolutionsfor2);
                Object obj = null;
                if (Intrinsics.areEqual(objOnExtraCallbackWithResult, trytostringobjectmapOnWarmupCompleted != null ? trytostringobjectmapOnWarmupCompleted.onNavigationEvent() : null)) {
                    int i4 = onExtraCallbackWithResult + 29;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    Object objOnExtraCallbackWithResult2 = emptyIfNull.onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor);
                    tryToStringObjectMap trytostringobjectmapOnNavigationEvent = emptyIfNull.onNavigationEvent(getsupportedhighspeedresolutionsfor3);
                    if (Intrinsics.areEqual(objOnExtraCallbackWithResult2, trytostringobjectmapOnNavigationEvent != null ? trytostringobjectmapOnNavigationEvent.onNavigationEvent() : null)) {
                        tryToStringObjectMap trytostringobjectmapOnWarmupCompleted2 = emptyIfNull.onWarmupCompleted(getsupportedhighspeedresolutionsfor2);
                        if ((trytostringobjectmapOnWarmupCompleted2 != null ? trytostringobjectmapOnWarmupCompleted2.onExtraCallback() : null) != null) {
                            int i6 = onExtraCallbackWithResult + 79;
                            onWarmupCompleted = i6 % 128;
                            if (i6 % 2 == 0) {
                                emptyIfNull.onWarmupCompleted(getsupportedhighspeedresolutionsfor2);
                                throw null;
                            }
                            tryToStringObjectMap trytostringobjectmapOnWarmupCompleted3 = emptyIfNull.onWarmupCompleted(getsupportedhighspeedresolutionsfor2);
                            if ((trytostringobjectmapOnWarmupCompleted3 != null ? trytostringobjectmapOnWarmupCompleted3.onWarmupCompleted() : null) != null) {
                                tryToStringObjectMap trytostringobjectmapOnWarmupCompleted4 = emptyIfNull.onWarmupCompleted(getsupportedhighspeedresolutionsfor2);
                                if (trytostringobjectmapOnWarmupCompleted4 != null) {
                                    int i7 = onWarmupCompleted + 31;
                                    onExtraCallbackWithResult = i7 % 128;
                                    int i8 = i7 % 2;
                                    numOnWarmupCompleted2 = trytostringobjectmapOnWarmupCompleted4.onWarmupCompleted();
                                } else {
                                    numOnWarmupCompleted2 = null;
                                }
                                Intrinsics.checkNotNull(numOnWarmupCompleted2);
                                int iIntValue = numOnWarmupCompleted2.intValue();
                                tryToStringObjectMap trytostringobjectmapOnWarmupCompleted5 = emptyIfNull.onWarmupCompleted(getsupportedhighspeedresolutionsfor2);
                                Integer numOnExtraCallback2 = trytostringobjectmapOnWarmupCompleted5 != null ? trytostringobjectmapOnWarmupCompleted5.onExtraCallback() : null;
                                Intrinsics.checkNotNull(numOnExtraCallback2);
                                numValueOf = Integer.valueOf(iIntValue - numOnExtraCallback2.intValue());
                            } else {
                                numValueOf = null;
                            }
                        }
                        tryToStringObjectMap trytostringobjectmapOnNavigationEvent2 = emptyIfNull.onNavigationEvent(getsupportedhighspeedresolutionsfor3);
                        if (trytostringobjectmapOnNavigationEvent2 != null) {
                            numOnExtraCallback = trytostringobjectmapOnNavigationEvent2.onExtraCallback();
                        } else {
                            int i9 = onExtraCallbackWithResult + 115;
                            onWarmupCompleted = i9 % 128;
                            if (i9 % 2 == 0) {
                                int i10 = 3 / 4;
                            }
                            numOnExtraCallback = null;
                        }
                        if (numOnExtraCallback == null) {
                            numValueOf2 = null;
                        } else {
                            tryToStringObjectMap trytostringobjectmapOnNavigationEvent3 = emptyIfNull.onNavigationEvent(getsupportedhighspeedresolutionsfor3);
                            if (trytostringobjectmapOnNavigationEvent3 != null) {
                                int i11 = onExtraCallbackWithResult + 125;
                                onWarmupCompleted = i11 % 128;
                                if (i11 % 2 == 0) {
                                    trytostringobjectmapOnNavigationEvent3.onWarmupCompleted();
                                    obj.hashCode();
                                    throw null;
                                }
                                numOnWarmupCompleted = trytostringobjectmapOnNavigationEvent3.onWarmupCompleted();
                            } else {
                                numOnWarmupCompleted = null;
                            }
                            if (numOnWarmupCompleted != null) {
                                tryToStringObjectMap trytostringobjectmapOnNavigationEvent4 = emptyIfNull.onNavigationEvent(getsupportedhighspeedresolutionsfor3);
                                Integer numOnWarmupCompleted3 = trytostringobjectmapOnNavigationEvent4 != null ? trytostringobjectmapOnNavigationEvent4.onWarmupCompleted() : null;
                                Intrinsics.checkNotNull(numOnWarmupCompleted3);
                                int iIntValue2 = numOnWarmupCompleted3.intValue();
                                tryToStringObjectMap trytostringobjectmapOnNavigationEvent5 = emptyIfNull.onNavigationEvent(getsupportedhighspeedresolutionsfor3);
                                Integer numOnExtraCallback3 = trytostringobjectmapOnNavigationEvent5 != null ? trytostringobjectmapOnNavigationEvent5.onExtraCallback() : null;
                                Intrinsics.checkNotNull(numOnExtraCallback3);
                                numValueOf2 = Integer.valueOf(iIntValue2 - numOnExtraCallback3.intValue());
                                int i12 = onExtraCallbackWithResult + 87;
                                onWarmupCompleted = i12 % 128;
                                if (i12 % 2 == 0) {
                                    int i13 = 2 / 5;
                                }
                            }
                        }
                        if (numValueOf == null || numValueOf2 == null) {
                            return JsonUtils.onExtraCallback.onExtraCallbackWithResult;
                        }
                        if (numValueOf.intValue() >= 0) {
                            int i14 = onWarmupCompleted + 87;
                            onExtraCallbackWithResult = i14 % 128;
                            if (i14 % 2 != 0) {
                                Intrinsics.areEqual(iAuthTabCallback, addLinks.IAuthTabCallback.onNavigationEvent.onExtraCallbackWithResult);
                                obj.hashCode();
                                throw null;
                            }
                            if (Intrinsics.areEqual(iAuthTabCallback, addLinks.IAuthTabCallback.onNavigationEvent.onExtraCallbackWithResult) || numValueOf2.intValue() <= 0) {
                                return JsonUtils.onWarmupCompleted.onExtraCallback;
                            }
                        }
                        return JsonUtils.onExtraCallbackWithResult.onExtraCallback;
                    }
                }
            }
            return JsonUtils.onExtraCallback.onExtraCallbackWithResult;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallbackWithResult + 43;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                final addLinks.IAuthTabCallback iAuthTabCallback = this.$type;
                final getSupportedHighSpeedResolutionsFor<Object> getsupportedhighspeedresolutionsfor = this.$screenId$delegate;
                final getSupportedHighSpeedResolutionsFor<tryToStringObjectMap> getsupportedhighspeedresolutionsfor2 = this.$topAssetHeightState$delegate;
                final getSupportedHighSpeedResolutionsFor<tryToStringObjectMap> getsupportedhighspeedresolutionsfor3 = this.$screenHeightState$delegate;
                IAnimation iAnimationOnExtraCallbackWithResult = ycxycx.onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new Function0() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenKt$TdsAgreementV4Screen$2$1$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke() {
                        int i5 = 2 % 2;
                        int i6 = onExtraCallbackWithResult + 97;
                        IAuthTabCallback = i6 % 128;
                        int i7 = i6 % 2;
                        addLinks.IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
                        if (i7 != 0) {
                            return emptyIfNull.onExtraCallbackWithResult.IAuthTabCallback(iAuthTabCallback2, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3);
                        }
                        emptyIfNull.onExtraCallbackWithResult.IAuthTabCallback(iAuthTabCallback2, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }));
                final getSupportedHighSpeedResolutionsFor<JsonUtils> getsupportedhighspeedresolutionsfor4 = this.$slideMotion$delegate;
                setRipple setripple = new setRipple() { // from class: o.emptyIfNull.onExtraCallbackWithResult.1
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public /* synthetic */ Object emit(Object obj2, access13800 access13800Var) {
                        int i5 = 2 % 2;
                        int i6 = onWarmupCompleted + 47;
                        onNavigationEvent = i6 % 128;
                        int i7 = i6 % 2;
                        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((JsonUtils) obj2, access13800Var);
                        int i8 = onWarmupCompleted + 93;
                        onNavigationEvent = i8 % 128;
                        if (i8 % 2 == 0) {
                            return objOnExtraCallbackWithResult;
                        }
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }

                    public final Object onExtraCallbackWithResult(JsonUtils jsonUtils, access13800<? super Unit> access13800Var) {
                        int i5 = 2 % 2;
                        int i6 = onWarmupCompleted + 19;
                        onNavigationEvent = i6 % 128;
                        if (i6 % 2 == 0) {
                            emptyIfNull.onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor) getsupportedhighspeedresolutionsfor4, jsonUtils);
                            return Unit.INSTANCE;
                        }
                        emptyIfNull.onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor) getsupportedhighspeedresolutionsfor4, jsonUtils);
                        Unit unit = Unit.INSTANCE;
                        throw null;
                    }
                };
                this.label = 1;
                if (iAnimationOnExtraCallbackWithResult.collect(setripple, this) == objOnWarmupCompleted) {
                    int i5 = onExtraCallbackWithResult + 47;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ putDoubleIfValid $ctaState;
        final /* synthetic */ addLinks.IAuthTabCallback $type;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(putDoubleIfValid putdoubleifvalid, addLinks.IAuthTabCallback iAuthTabCallback, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$ctaState = putdoubleifvalid;
            this.$type = iAuthTabCallback;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 33;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 77;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$ctaState, this.$type, access13800Var);
            int i2 = onWarmupCompleted + 103;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                IAuthTabCallback(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i3 = IAuthTabCallback + 115;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return objIAuthTabCallback;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            float fIAuthTabCallback;
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            putDoubleIfValid putdoubleifvalid = this.$ctaState;
            if (putdoubleifvalid != null) {
                addLinks.IAuthTabCallback iAuthTabCallback = this.$type;
                float fIAuthTabCallback2 = (iAuthTabCallback instanceof addLinks.IAuthTabCallback.onWarmupCompleted) ^ true ? iAuthTabCallback instanceof addLinks.IAuthTabCallback.C0010IAuthTabCallback ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f) : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f);
                ImageViewUtilsExternalSyntheticLambda5 imageViewUtilsExternalSyntheticLambda5AsBinder = putdoubleifvalid.asBinder();
                Object obj2 = null;
                if (!(!Intrinsics.areEqual(imageViewUtilsExternalSyntheticLambda5AsBinder, ImageViewUtilsExternalSyntheticLambda5.onExtraCallbackWithResult.onNavigationEvent)) || Intrinsics.areEqual(imageViewUtilsExternalSyntheticLambda5AsBinder, ImageViewUtilsExternalSyntheticLambda5.onWarmupCompleted.IAuthTabCallback) || Intrinsics.areEqual(imageViewUtilsExternalSyntheticLambda5AsBinder, ImageViewUtilsExternalSyntheticLambda5.onNavigationEvent.IAuthTabCallback)) {
                    float fIAuthTabCallback3 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);
                    float fIAuthTabCallback4 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);
                    VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnExtraCallbackWithResult = putdoubleifvalid.onExtraCallbackWithResult();
                    if (virtualCameraControlExternalSyntheticLambda1OnExtraCallbackWithResult != null) {
                        int i2 = onWarmupCompleted + 37;
                        IAuthTabCallback = i2 % 128;
                        if (i2 % 2 != 0) {
                            virtualCameraControlExternalSyntheticLambda1OnExtraCallbackWithResult.IAuthTabCallback();
                            obj2.hashCode();
                            throw null;
                        }
                        fIAuthTabCallback = virtualCameraControlExternalSyntheticLambda1OnExtraCallbackWithResult.IAuthTabCallback();
                    } else {
                        fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);
                    }
                    putdoubleifvalid.IAuthTabCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(fIAuthTabCallback3, fIAuthTabCallback2, fIAuthTabCallback4, fIAuthTabCallback));
                    int i3 = onWarmupCompleted + 107;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                } else {
                    int i5 = IAuthTabCallback + 99;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 == 0) {
                        Intrinsics.areEqual(imageViewUtilsExternalSyntheticLambda5AsBinder, ImageViewUtilsExternalSyntheticLambda5.IAuthTabCallback.onWarmupCompleted);
                        throw null;
                    }
                    if (Intrinsics.areEqual(imageViewUtilsExternalSyntheticLambda5AsBinder, ImageViewUtilsExternalSyntheticLambda5.IAuthTabCallback.onWarmupCompleted)) {
                        putdoubleifvalid.IAuthTabCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), fIAuthTabCallback2, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)));
                    } else {
                        if (!(imageViewUtilsExternalSyntheticLambda5AsBinder instanceof ImageViewUtilsExternalSyntheticLambda5.onExtraCallback)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i6 = IAuthTabCallback + 41;
                        onWarmupCompleted = i6 % 128;
                        int i7 = i6 % 2;
                        putdoubleifvalid.IAuthTabCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), fIAuthTabCallback2, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(18.0f)));
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final defaultIfEmpty defaultifempty, @NotNull final encodeUriString encodeuristring, @Nullable final putDoubleIfValid putdoubleifvalid, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws NoWhenBranchMatchedException {
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i4;
        Object objOnWarmupCompleted;
        int i5;
        CameraPresenceProviderExternalSyntheticLambda0 cameraPresenceProviderExternalSyntheticLambda0;
        int i6;
        Object objOnWarmupCompleted2;
        final addLinks.IAuthTabCallback iAuthTabCallback;
        int i7;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor;
        int i8;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3;
        boolean z;
        long j;
        Object obj;
        long j2;
        boolean z2;
        int i9;
        Object obj2;
        boolean z3;
        int i10;
        access13800 access13800Var;
        defaultIfEmpty defaultifempty2;
        access13800 access13800VarAsBinder;
        boolean z4;
        int i11;
        Object next;
        int i12;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        int i13 = 2 % 2;
        Intrinsics.checkNotNullParameter(defaultifempty, "");
        Intrinsics.checkNotNullParameter(encodeuristring, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-762445294);
        int i14 = i2 & 1;
        Object obj3 = null;
        if (i14 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            int i15 = onExtraCallback + 109;
            onExtraCallbackWithResult = i15 % 128;
            if (i15 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02);
                obj3.hashCode();
                throw null;
            }
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(defaultifempty) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i16 = onExtraCallback + 75;
            onExtraCallbackWithResult = i16 % 128;
            int i17 = i16 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(encodeuristring)) {
                int i18 = onExtraCallback + 15;
                onExtraCallbackWithResult = i18 % 128;
                int i19 = i18 % 2;
                i12 = 256;
            } else {
                i12 = 128;
            }
            i3 |= i12;
        }
        if ((i & 3072) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(putdoubleifvalid) ? 2048 : 1024;
        }
        int i20 = i3;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i20 & 1171) != 1170, i20 & 1)) {
            int i21 = onExtraCallbackWithResult + 53;
            onExtraCallback = i21 % 128;
            int i22 = i21 % 2;
            if (i14 != 0) {
                quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-762445294, i20, -1, "im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4Screen (TdsAgreementV4Screen.kt:78)");
            }
            final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
            Configuration configuration = (Configuration) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallbackWithResult());
            addLinks.IAuthTabCallback iAuthTabCallbackIAuthTabCallbackDefault = defaultifempty.IAuthTabCallbackDefault();
            final long jAccess100 = defaultifempty.access100();
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackIAuthTabCallbackDefault);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = Boolean.valueOf(iAuthTabCallbackIAuthTabCallbackDefault instanceof addLinks.IAuthTabCallback.onWarmupCompleted);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            Boolean bool = (Boolean) objOnMinimized;
            final boolean zBooleanValue = bool.booleanValue();
            int i23 = i20 & 112;
            boolean z5 = i23 == 32;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (z5 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                i4 = 2;
                objOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnWarmupCompleted);
            } else {
                objOnWarmupCompleted = objOnMinimized2;
                i4 = 2;
            }
            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4 = (getSupportedHighSpeedResolutionsFor) objOnWarmupCompleted;
            if (i23 == 32) {
                int i24 = onExtraCallback + 49;
                onExtraCallbackWithResult = i24 % 128;
                boolean z6 = i24 % i4 != 0;
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (z6 || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted);
                    objOnMinimized3 = getsupportedhighspeedresolutionsforOnWarmupCompleted;
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5 = (getSupportedHighSpeedResolutionsFor) objOnMinimized3;
                boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(defaultifempty.getInterfaceDescriptor());
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zIAuthTabCallback || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized4 = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(defaultifempty.getInterfaceDescriptor() * configuration.screenHeightDp));
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                }
                float fIAuthTabCallback = ((VirtualCameraControlExternalSyntheticLambda1) objOnMinimized4).IAuthTabCallback();
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Iterator<T> it = defaultifempty.IAuthTabCallback_Parcel().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i11 = 2;
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            if (((appendQueryParameters) next).extraCallback()) {
                                i11 = 2;
                                break;
                            }
                        }
                    }
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(next, (CameraPresenceProviderExternalSyntheticLambda0) null, i11, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted2);
                    objOnMinimized5 = getsupportedhighspeedresolutionsforOnWarmupCompleted2;
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6 = (getSupportedHighSpeedResolutionsFor) objOnMinimized5;
                boolean z7 = i23 == 32;
                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (z7 || objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    i5 = i23;
                    cameraPresenceProviderExternalSyntheticLambda0 = null;
                    i6 = 2;
                    objOnWarmupCompleted2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnWarmupCompleted2);
                } else {
                    i5 = i23;
                    objOnWarmupCompleted2 = objOnMinimized6;
                    cameraPresenceProviderExternalSyntheticLambda0 = null;
                    i6 = 2;
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor7 = (getSupportedHighSpeedResolutionsFor) objOnWarmupCompleted2;
                Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized7 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda0, cameraPresenceProviderExternalSyntheticLambda0, i6, cameraPresenceProviderExternalSyntheticLambda0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized7);
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor8 = (getSupportedHighSpeedResolutionsFor) objOnMinimized7;
                Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized8 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda0, cameraPresenceProviderExternalSyntheticLambda0, i6, cameraPresenceProviderExternalSyntheticLambda0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized8);
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor9 = (getSupportedHighSpeedResolutionsFor) objOnMinimized8;
                Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized9 == onwarmupcompleted.onExtraCallback()) {
                    int i25 = onExtraCallback + 61;
                    onExtraCallbackWithResult = i25 % 128;
                    objOnMinimized9 = i25 % 2 == 0 ? CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 3, (Object) null) : CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized9);
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor10 = (getSupportedHighSpeedResolutionsFor) objOnMinimized9;
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent((appendQueryParameters) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1269760032, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor6}, -1269760030));
                boolean z8 = (i20 & 896) == 256;
                boolean zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jAccess100);
                Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (((zOnNavigationEvent2 | z8) || zOnWarmupCompleted) || objOnMinimized10 == onwarmupcompleted.onExtraCallback()) {
                    int i26 = i5;
                    iAuthTabCallback = iAuthTabCallbackIAuthTabCallbackDefault;
                    i7 = i20;
                    getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor6;
                    i8 = i26;
                    getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor5;
                    getsupportedhighspeedresolutionsfor3 = getsupportedhighspeedresolutionsfor4;
                    z = true;
                    j = jAccess100;
                    EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(1034281195, true, new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenKt$$ExternalSyntheticLambda6
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallback;

                        public final Object invoke(Object obj4, Object obj5) {
                            int i27 = 2 % 2;
                            int i28 = IAuthTabCallback + 97;
                            onExtraCallback = i28 % 128;
                            int i29 = i28 % 2;
                            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor11 = getsupportedhighspeedresolutionsfor6;
                            long j3 = jAccess100;
                            encodeUriString encodeuristring2 = encodeuristring;
                            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor12 = getsupportedhighspeedresolutionsfor5;
                            boolean z9 = zBooleanValue;
                            int iIntValue = ((Integer) obj5).intValue();
                            Object[] objArr = {getsupportedhighspeedresolutionsfor11, Long.valueOf(j3), encodeuristring2, getsupportedhighspeedresolutionsfor12, Boolean.valueOf(z9), iAuthTabCallback, getsupportedhighspeedresolutionsfor4, getsupportedhighspeedresolutionsfor10, getsupportedhighspeedresolutionsfor9, getsupportedhighspeedresolutionsfor8, (CameraCaptureResultEmptyCameraCaptureResult) obj4, Integer.valueOf(iIntValue)};
                            int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
                            Unit unit = (Unit) emptyIfNull.onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -921891622, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, objArr, 921891631);
                            int i30 = onExtraCallback + 1;
                            IAuthTabCallback = i30 % 128;
                            if (i30 % 2 != 0) {
                                return unit;
                            }
                            throw null;
                        }
                    });
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult);
                    obj = encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult;
                } else {
                    i8 = i5;
                    i7 = i20;
                    getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor6;
                    getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor5;
                    getsupportedhighspeedresolutionsfor3 = getsupportedhighspeedresolutionsfor4;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    j = jAccess100;
                    iAuthTabCallback = iAuthTabCallbackIAuthTabCallbackDefault;
                    z = true;
                    obj = objOnMinimized10;
                }
                Function2 function2 = (Function2) obj;
                int i27 = i7 & 7168;
                if (i27 == 2048) {
                    z2 = z;
                    j2 = j;
                } else {
                    j2 = j;
                    z2 = false;
                }
                boolean zOnWarmupCompleted2 = cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(j2);
                Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                if ((zOnWarmupCompleted2 || z2) || objOnMinimized11 == onwarmupcompleted.onExtraCallback()) {
                    final long j3 = j2;
                    i9 = i27;
                    final addLinks.IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
                    EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult2 = ForwardingCameraControl.onExtraCallbackWithResult(1825394480, z, new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenKt$$ExternalSyntheticLambda7
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj4, Object obj5) {
                            int i28 = 2 % 2;
                            int i29 = onWarmupCompleted + 75;
                            onNavigationEvent = i29 % 128;
                            if (i29 % 2 != 0) {
                                return emptyIfNull.onNavigationEvent(putdoubleifvalid, zBooleanValue, getsupportedhighspeedresolutionsfor7, r8lambdanm9dm2eewl4vrptnjmesfjqky4, j3, iAuthTabCallback2, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                            }
                            Unit unitOnNavigationEvent = emptyIfNull.onNavigationEvent(putdoubleifvalid, zBooleanValue, getsupportedhighspeedresolutionsfor7, r8lambdanm9dm2eewl4vrptnjmesfjqky4, j3, iAuthTabCallback2, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                            int i30 = 1 / 0;
                            return unitOnNavigationEvent;
                        }
                    });
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult2);
                    obj2 = encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult2;
                } else {
                    i9 = i27;
                    obj2 = objOnMinimized11;
                }
                Function2 function22 = (Function2) obj2;
                addLinks.IAuthTabCallback iAuthTabCallback3 = iAuthTabCallback;
                if (Intrinsics.areEqual(iAuthTabCallback3, addLinks.IAuthTabCallback.onNavigationEvent.onExtraCallbackWithResult)) {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(2081070843);
                    onNavigationEvent(verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport02, j2, (toMetersPerSecond) null, 2, (Object) null), function2, function22, cameraCaptureResultEmptyCameraCaptureResult2, 0, 0);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                } else if (Intrinsics.areEqual(iAuthTabCallback3, addLinks.IAuthTabCallback.onExtraCallback.onWarmupCompleted)) {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(2081334281);
                    onExtraCallback(verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport02, j2, (toMetersPerSecond) null, 2, (Object) null), asBinder((getSupportedHighSpeedResolutionsFor<VirtualCameraControlExternalSyntheticLambda1>) getsupportedhighspeedresolutionsfor7), (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function2, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function22, cameraCaptureResultEmptyCameraCaptureResult2, 0, 0);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                } else if (iAuthTabCallback3 instanceof addLinks.IAuthTabCallback.onWarmupCompleted) {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(2081648311);
                    IAuthTabCallback(asBinder((getSupportedHighSpeedResolutionsFor<VirtualCameraControlExternalSyntheticLambda1>) getsupportedhighspeedresolutionsfor7), verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport02, j2, (toMetersPerSecond) null, 2, (Object) null), defaultifempty.getInterfaceDescriptor() < 1.0f ? VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fIAuthTabCallback + asBinder((getSupportedHighSpeedResolutionsFor<VirtualCameraControlExternalSyntheticLambda1>) getsupportedhighspeedresolutionsfor7))) : null, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function2, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function22, cameraCaptureResultEmptyCameraCaptureResult2, 0, 0);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                } else {
                    if (!Intrinsics.areEqual(iAuthTabCallback3, addLinks.IAuthTabCallback.C0010IAuthTabCallback.onExtraCallbackWithResult)) {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1729698651);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        throw new NoWhenBranchMatchedException();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(2082070066);
                    onExtraCallbackWithResult(putdoubleifvalid, asBinder((getSupportedHighSpeedResolutionsFor<VirtualCameraControlExternalSyntheticLambda1>) getsupportedhighspeedresolutionsfor7), verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport02, j2, (toMetersPerSecond) null, 2, (Object) null), defaultifempty.getInterfaceDescriptor() < 1.0f ? VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fIAuthTabCallback + asBinder((getSupportedHighSpeedResolutionsFor<VirtualCameraControlExternalSyntheticLambda1>) getsupportedhighspeedresolutionsfor7))) : null, function2, function22, cameraCaptureResultEmptyCameraCaptureResult2, (i7 >> 9) & 14, 0);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                }
                if (i8 == 32) {
                    int i28 = onExtraCallback + 119;
                    onExtraCallbackWithResult = i28 % 128;
                    int i29 = i28 % 2;
                    z3 = z;
                } else {
                    z3 = false;
                }
                Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                if (z3 || objOnMinimized12 == onwarmupcompleted.onExtraCallback()) {
                    i10 = i7;
                    access13800Var = null;
                    defaultifempty2 = defaultifempty;
                    objOnMinimized12 = new onNavigationEvent(defaultifempty2, getsupportedhighspeedresolutionsfor, null);
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized12);
                } else {
                    i10 = i7;
                    access13800Var = null;
                    defaultifempty2 = defaultifempty;
                }
                int i30 = (i10 >> 3) & 14;
                isZslDisabledByByUserCaseConfig.onNavigationEvent(defaultifempty2, (Function2) objOnMinimized12, cameraCaptureResultEmptyCameraCaptureResult2, i30);
                boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(iAuthTabCallback3);
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor11 = getsupportedhighspeedresolutionsfor3;
                boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(getsupportedhighspeedresolutionsfor11);
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor12 = getsupportedhighspeedresolutionsfor2;
                boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(getsupportedhighspeedresolutionsfor12);
                Object objOnMinimized13 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                if ((zOnNavigationEvent3 | zOnNavigationEvent4 | zOnNavigationEvent5) || objOnMinimized13 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized13 = new onExtraCallbackWithResult(iAuthTabCallback3, getsupportedhighspeedresolutionsfor11, getsupportedhighspeedresolutionsfor8, getsupportedhighspeedresolutionsfor9, getsupportedhighspeedresolutionsfor12, null);
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized13);
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(defaultifempty2, (Function2) objOnMinimized13, cameraCaptureResultEmptyCameraCaptureResult2, i30);
                if (putdoubleifvalid != null) {
                    int i31 = onExtraCallbackWithResult + 13;
                    onExtraCallback = i31 % 128;
                    int i32 = i31 % 2;
                    access13800VarAsBinder = putdoubleifvalid.asBinder();
                } else {
                    access13800VarAsBinder = access13800Var;
                }
                Object[] objArr = {iAuthTabCallback3, putdoubleifvalid, access13800VarAsBinder, putdoubleifvalid != null ? putdoubleifvalid.onExtraCallbackWithResult() : access13800Var};
                if (i9 == 2048) {
                    int i33 = onExtraCallbackWithResult + 37;
                    onExtraCallback = i33 % 128;
                    int i34 = i33 % 2;
                    z4 = z;
                } else {
                    int i35 = onExtraCallback + 69;
                    onExtraCallbackWithResult = i35 % 128;
                    int i36 = i35 % 2;
                    z4 = false;
                }
                boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(iAuthTabCallback3);
                Object objOnMinimized14 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                if ((zOnNavigationEvent6 | z4) || objOnMinimized14 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized14 = new IAuthTabCallback(putdoubleifvalid, iAuthTabCallback3, access13800Var);
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized14);
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(objArr, (Function2) objOnMinimized14, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenKt$$ExternalSyntheticLambda8
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj4, Object obj5) {
                    int i37 = 2 % 2;
                    int i38 = onWarmupCompleted + 61;
                    onNavigationEvent = i38 % 128;
                    if (i38 % 2 == 0) {
                        return emptyIfNull.onExtraCallback(quirksExternalSyntheticBackport03, defaultifempty, encodeuristring, putdoubleifvalid, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                    }
                    Unit unitOnExtraCallback = emptyIfNull.onExtraCallback(quirksExternalSyntheticBackport03, defaultifempty, encodeuristring, putdoubleifvalid, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                    int i39 = 7 / 0;
                    return unitOnExtraCallback;
                }
            });
        }
    }

    private static final void onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function22, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        int i4;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(407749786);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 4 : 2) | i;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            int i7 = onExtraCallback + 7;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2)) {
                int i9 = onExtraCallbackWithResult + 111;
                onExtraCallback = i9 % 128;
                i4 = i9 % 2 != 0 ? 74 : 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i & 384) == 0) {
            int i10 = onExtraCallbackWithResult + 71;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function22) ? 256 : 128;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 147) != 146, i3 & 1)) {
            int i12 = onExtraCallback + 43;
            onExtraCallbackWithResult = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
            quirksExternalSyntheticBackport03 = i6 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(407749786, i3, -1, "im.toss.tds.compose.component.compound.agreement.v4.screen.FullPage (TdsAgreementV4Screen.kt:371)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport03, 0.0f, 1, (Object) null);
            FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub();
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = MeteringRepeatingSessionExternalSyntheticLambda0.onNavigationEvent(LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent2);
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
            function2.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i3 >> 3) & 14));
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            function22.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i3 >> 6) & 14));
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = onExtraCallback + 37;
                onExtraCallbackWithResult = i13 % 128;
                int i14 = i13 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenKt$$ExternalSyntheticLambda4
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2) {
                    int i15 = 2 % 2;
                    int i16 = IAuthTabCallback + 53;
                    onNavigationEvent = i16 % 128;
                    if (i16 % 2 == 0) {
                        return emptyIfNull.onExtraCallback(quirksExternalSyntheticBackport04, function2, function22, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    emptyIfNull.onExtraCallback(quirksExternalSyntheticBackport04, function2, function22, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    throw null;
                }
            });
            int i15 = onExtraCallbackWithResult + 121;
            onExtraCallback = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 3 / 3;
            }
        }
    }

    public static final class onWarmupCompleted implements AndroidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0 {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ onMenuItemClick IAuthTabCallback;
        final /* synthetic */ AccessibilityManager.AccessibilityStateChangeListener onExtraCallback;
        final /* synthetic */ AccessibilityManager onWarmupCompleted;

        public onWarmupCompleted(onMenuItemClick onmenuitemclick, AccessibilityManager accessibilityManager, AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener) {
            this.IAuthTabCallback = onmenuitemclick;
            this.onWarmupCompleted = accessibilityManager;
            this.onExtraCallback = accessibilityStateChangeListener;
        }

        public void onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 81;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            AccessibilityManager accessibilityManager = this.onWarmupCompleted;
            Object obj = null;
            if (accessibilityManager != null) {
                int i5 = i3 + 111;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    accessibilityManager.removeAccessibilityStateChangeListener(this.onExtraCallback);
                    obj.hashCode();
                    throw null;
                }
                accessibilityManager.removeAccessibilityStateChangeListener(this.onExtraCallback);
            }
            int i6 = onExtraCallbackWithResult + 59;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
        }
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        if (i3 != 0) {
            onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback2, 41188712, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, objArr, -41188707);
            int i4 = 20 / 0;
        } else {
            onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback2, 41188712, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, objArr, -41188707);
        }
        int i5 = onExtraCallback + 39;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(final putDoubleIfValid putdoubleifvalid, final float f, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1, final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function22, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1992718774);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(putdoubleifvalid) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        Object obj = null;
        if ((i & 48) == 0) {
            int i6 = onExtraCallback + 23;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f);
                obj.hashCode();
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                int i8 = onExtraCallback + 79;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(virtualCameraControlExternalSyntheticLambda1) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function22) ? 131072 : 65536;
            }
            i4 = i3;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i4) == 74898, i4 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            } else {
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = i7 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1992718774, i4, -1, "im.toss.tds.compose.component.compound.agreement.v4.screen.Payment (TdsAgreementV4Screen.kt:393)");
                }
                if (Intrinsics.areEqual(putdoubleifvalid != null ? putdoubleifvalid.asBinder() : null, ImageViewUtilsExternalSyntheticLambda5.IAuthTabCallback.onWarmupCompleted)) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(47374187);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                        int i10 = onExtraCallbackWithResult + 15;
                        onExtraCallback = i10 % 128;
                        int i11 = i10 % 2;
                        objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                        int i12 = onExtraCallbackWithResult + 109;
                        onExtraCallback = i12 % 128;
                        int i13 = i12 % 2;
                        objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                    }
                    final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
                    final Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                    Unit unit = Unit.INSTANCE;
                    boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(context);
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnExtraCallback || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized3 = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenKt$$ExternalSyntheticLambda2
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallbackWithResult = 1;

                            public final Object invoke(Object obj2) {
                                int i14 = 2 % 2;
                                int i15 = onExtraCallbackWithResult + 17;
                                IAuthTabCallback = i15 % 128;
                                if (i15 % 2 != 0) {
                                    emptyIfNull.onExtraCallback(context, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, (onMenuItemClick) obj2);
                                    throw null;
                                }
                                AndroidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0 androidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0OnExtraCallback = emptyIfNull.onExtraCallback(context, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, (onMenuItemClick) obj2);
                                int i16 = onExtraCallbackWithResult + 111;
                                IAuthTabCallback = i16 % 128;
                                if (i16 % 2 == 0) {
                                    return androidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0OnExtraCallback;
                                }
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                    }
                    Function1 function1 = (Function1) objOnMinimized3;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport05;
                    AndroidTextContextMenuToolbarProviderExternalSyntheticLambda5.onExtraCallbackWithResult(unit, (TextFieldScrollKtExternalSyntheticLambda0) null, function1, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 2);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport06, 0.0f, 1, (Object) null);
                    QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                    component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.onWarmupCompleted(), false);
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
                    int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
                    if (((Boolean) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1548833066, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, new Object[]{getsupportedhighspeedresolutionsfor}, -1548833063)).booleanValue() || IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2)) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(783373172);
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                        component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback);
                        Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                            int i14 = onExtraCallback + 117;
                            onExtraCallbackWithResult = i14 % 128;
                            int i15 = i14 % 2;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                        LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                        function2.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i4 >> 12) & 14));
                        function22.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i4 >> 15) & 14));
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    } else {
                        int i16 = onExtraCallbackWithResult + 29;
                        onExtraCallback = i16 % 128;
                        int i17 = i16 % 2;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(783527924);
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                        component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback2);
                        Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                            int i18 = onExtraCallback + 125;
                            onExtraCallbackWithResult = i18 % 128;
                            int i19 = i18 % 2;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback3);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
                        LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda02 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                        function22.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i4 >> 15) & 14));
                        function2.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i4 >> 12) & 14));
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        int i20 = onExtraCallbackWithResult + 79;
                        onExtraCallback = i20 % 128;
                        if (i20 % 2 != 0) {
                            int i21 = 5 % 5;
                        }
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport06;
                } else {
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport07 = quirksExternalSyntheticBackport05;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(48793057);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport07, 0.0f, 1, (Object) null);
                    QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult3 = QuirkSettingsLoader.Companion;
                    component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult3.onWarmupCompleted(), false);
                    int iHashCode4 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback2);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult4 = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback4 = onextracallbackwithresult4.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback4);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, component5VarOnWarmupCompleted2, onextracallbackwithresult4.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4, onextracallbackwithresult4.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, Integer.valueOf(iHashCode4), onextracallbackwithresult4.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, onextracallbackwithresult4.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult4.onTransact());
                    HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda12 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport07;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 0.0f, 0.0f, f, 7, (Object) null), 0.0f, 1, (Object) null), 0.0f, 0.0f, 0.0f, virtualCameraControlExternalSyntheticLambda1 != null ? virtualCameraControlExternalSyntheticLambda1.IAuthTabCallback() : VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback(), 7, (Object) null);
                    component5 component5VarOnWarmupCompleted3 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult3.access100(), false);
                    int iHashCode5 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted5 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
                    Function0 function0IAuthTabCallback5 = onextracallbackwithresult4.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback5);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, component5VarOnWarmupCompleted3, onextracallbackwithresult4.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject5, onextracallbackwithresult4.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, Integer.valueOf(iHashCode5), onextracallbackwithresult4.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, onextracallbackwithresult4.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, quirksExternalSyntheticBackport0OnWarmupCompleted5, onextracallbackwithresult4.onTransact());
                    function2.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i4 >> 12) & 14));
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                    function22.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i4 >> 15) & 14));
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i22 = onExtraCallbackWithResult + 53;
                    onExtraCallback = i22 % 128;
                    int i23 = i22 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenKt$$ExternalSyntheticLambda3
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i24 = 2 % 2;
                        int i25 = IAuthTabCallback + 121;
                        onWarmupCompleted = i25 % 128;
                        if (i25 % 2 != 0) {
                            emptyIfNull.onExtraCallback(putdoubleifvalid, f, quirksExternalSyntheticBackport03, virtualCameraControlExternalSyntheticLambda1, function2, function22, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            throw null;
                        }
                        Unit unitOnExtraCallback = emptyIfNull.onExtraCallback(putdoubleifvalid, f, quirksExternalSyntheticBackport03, virtualCameraControlExternalSyntheticLambda1, function2, function22, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i26 = onWarmupCompleted + 25;
                        IAuthTabCallback = i26 % 128;
                        int i27 = i26 % 2;
                        return unitOnExtraCallback;
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        int i24 = onExtraCallback + 97;
        onExtraCallbackWithResult = i24 % 128;
        int i25 = i24 % 2;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i4 = i3;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i4) == 74898, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final void onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final float f, final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function22, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        int i4;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        int i5;
        int i6 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1627662446);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                int i8 = onExtraCallbackWithResult + 87;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function22)) {
                int i10 = onExtraCallback + 27;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                i5 = 1024;
            } else {
                i5 = 2048;
            }
            i3 |= i5;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 1171) != 1170, i3 & 1))) {
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i7 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = onExtraCallbackWithResult + 71;
                onExtraCallback = i12 % 128;
                if (i12 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1627662446, i3, -1, "im.toss.tds.compose.component.compound.agreement.v4.screen.BottomSheet (TdsAgreementV4Screen.kt:462)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1627662446, i3, -1, "im.toss.tds.compose.component.compound.agreement.v4.screen.BottomSheet (TdsAgreementV4Screen.kt:462)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport04, 0.0f, 1, (Object) null);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.onWarmupCompleted(), false);
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
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 0.0f, 0.0f, f, 7, (Object) null), 0.0f, 1, (Object) null);
            component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback2);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                int i13 = onExtraCallback + 93;
                onExtraCallbackWithResult = i13 % 128;
                int i14 = i13 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            function2.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i3 >> 6) & 14));
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            function22.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i3 >> 9) & 14));
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenKt$$ExternalSyntheticLambda1
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i15 = 2 % 2;
                    int i16 = onNavigationEvent + 105;
                    onWarmupCompleted = i16 % 128;
                    int i17 = i16 % 2;
                    Object obj4 = null;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport03;
                    float f2 = f;
                    Function2 function23 = function2;
                    Function2 function24 = function22;
                    int i18 = i;
                    int i19 = i2;
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (i17 == 0) {
                        emptyIfNull.onWarmupCompleted(quirksExternalSyntheticBackport05, f2, function23, function24, i18, i19, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue);
                        throw null;
                    }
                    Unit unitOnWarmupCompleted = emptyIfNull.onWarmupCompleted(quirksExternalSyntheticBackport05, f2, function23, function24, i18, i19, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue);
                    int i20 = onNavigationEvent + 17;
                    onWarmupCompleted = i20 % 128;
                    if (i20 % 2 != 0) {
                        return unitOnWarmupCompleted;
                    }
                    obj4.hashCode();
                    throw null;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IAuthTabCallback(final float f, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1, final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function22, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        boolean z;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i5;
        int i6 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1151830726);
        if ((i & 6) == 0) {
            int i7 = onExtraCallbackWithResult + 111;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f);
                throw null;
            }
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                int i9 = onExtraCallbackWithResult + 111;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(virtualCameraControlExternalSyntheticLambda1) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                int i11 = onExtraCallbackWithResult + 107;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2)) {
                    int i13 = onExtraCallback + 37;
                    onExtraCallbackWithResult = i13 % 128;
                    i5 = i13 % 2 == 0 ? 8168 : 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function22) ? 16384 : 8192;
            }
            i4 = i3;
            if ((i4 & 9363) == 9362) {
                int i14 = onExtraCallbackWithResult + 75;
                onExtraCallback = i14 % 128;
                int i15 = i14 % 2;
                z = true;
            } else {
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            } else {
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i8 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1151830726, i4, -1, "im.toss.tds.compose.component.compound.agreement.v4.screen.Overlay (TdsAgreementV4Screen.kt:487)");
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport04, 0.0f, 1, (Object) null);
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.onWarmupCompleted(), false);
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
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 0.0f, 0.0f, f, 7, (Object) null), 0.0f, 1, (Object) null), 0.0f, 0.0f, 0.0f, virtualCameraControlExternalSyntheticLambda1 != null ? virtualCameraControlExternalSyntheticLambda1.IAuthTabCallback() : VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback(), 7, (Object) null);
                component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
                Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    int i16 = onExtraCallbackWithResult + 83;
                    onExtraCallback = i16 % 128;
                    int i17 = i16 % 2;
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout())) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                function2.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i4 >> 9) & 14));
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                function22.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i4 >> 12) & 14));
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenKt$$ExternalSyntheticLambda5
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i18 = 2 % 2;
                        int i19 = onNavigationEvent + 55;
                        onWarmupCompleted = i19 % 128;
                        if (i19 % 2 != 0) {
                            return emptyIfNull.onWarmupCompleted(f, quirksExternalSyntheticBackport03, virtualCameraControlExternalSyntheticLambda1, function2, function22, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        }
                        emptyIfNull.onWarmupCompleted(f, quirksExternalSyntheticBackport03, virtualCameraControlExternalSyntheticLambda1, function2, function22, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                });
                return;
            }
            return;
        }
        int i18 = onExtraCallback + 117;
        onExtraCallbackWithResult = i18 % 128;
        int i19 = i18 % 2;
        i3 |= 48;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if ((i & 384) == 0) {
        }
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i4 = i3;
        if ((i4 & 9363) == 9362) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final Object IAuthTabCallbackDefault(getSupportedHighSpeedResolutionsFor<Object> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        }
        getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(obj);
        int i4 = onExtraCallbackWithResult + 105;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static final JsonUtils access100(getSupportedHighSpeedResolutionsFor<JsonUtils> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        JsonUtils jsonUtils = (JsonUtils) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        int i4 = onExtraCallbackWithResult + 9;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return jsonUtils;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onNavigationEvent(getSupportedHighSpeedResolutionsFor<JsonUtils> getsupportedhighspeedresolutionsfor, JsonUtils jsonUtils) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(jsonUtils);
        if (i3 != 0) {
            int i4 = 39 / 0;
        }
        int i5 = onExtraCallback + 81;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        appendQueryParameters appendqueryparameters = (appendQueryParameters) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        int i4 = onExtraCallbackWithResult + 101;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return appendqueryparameters;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<appendQueryParameters> getsupportedhighspeedresolutionsfor, appendQueryParameters appendqueryparameters) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(appendqueryparameters);
        int i4 = onExtraCallback + 123;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final float asBinder(getSupportedHighSpeedResolutionsFor<VirtualCameraControlExternalSyntheticLambda1> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        float fIAuthTabCallback = ((VirtualCameraControlExternalSyntheticLambda1) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).IAuthTabCallback();
        int i4 = onExtraCallback + 87;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return fIAuthTabCallback;
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor<VirtualCameraControlExternalSyntheticLambda1> getsupportedhighspeedresolutionsfor, float f) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(f));
        int i4 = onExtraCallback + 15;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final tryToStringObjectMap asInterface(getSupportedHighSpeedResolutionsFor<tryToStringObjectMap> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tryToStringObjectMap trytostringobjectmap = (tryToStringObjectMap) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            int i4 = 77 / 0;
        }
        return trytostringobjectmap;
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor<tryToStringObjectMap> getsupportedhighspeedresolutionsfor, tryToStringObjectMap trytostringobjectmap) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(trytostringobjectmap);
        int i4 = onExtraCallbackWithResult + 21;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final tryToStringObjectMap IAuthTabCallbackStub(getSupportedHighSpeedResolutionsFor<tryToStringObjectMap> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tryToStringObjectMap trytostringobjectmap = (tryToStringObjectMap) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
        int i5 = onExtraCallback + 25;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return trytostringobjectmap;
        }
        throw null;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<tryToStringObjectMap> getsupportedhighspeedresolutionsfor, tryToStringObjectMap trytostringobjectmap) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(trytostringobjectmap);
        int i4 = onExtraCallback + 57;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = onExtraCallback + 99;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    private static final void asInterface(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 != 0) {
            int i4 = 56 / 0;
        }
    }

    private static final AndroidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0 IAuthTabCallback(Context context, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, onMenuItemClick onmenuitemclick) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onmenuitemclick, "");
        AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenKt$$ExternalSyntheticLambda14
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 33;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                emptyIfNull.onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, z);
                int i5 = onExtraCallback + 121;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
        };
        AccessibilityManager accessibilityManager = (AccessibilityManager) ContextCompat.getSystemService(context, AccessibilityManager.class);
        boolean z = false;
        if (accessibilityManager != null) {
            int i2 = onExtraCallbackWithResult + 19;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (accessibilityManager.isTouchExplorationEnabled()) {
                z = true;
            }
        }
        Object[] objArr = {getsupportedhighspeedresolutionsfor2, Boolean.valueOf(z)};
        onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1064759320, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), objArr, -1064759313);
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(accessibilityStateChangeListener);
            int i4 = onExtraCallbackWithResult + 19;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        return new onWarmupCompleted(onmenuitemclick, accessibilityManager, accessibilityStateChangeListener);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            return Boolean.valueOf(bool.booleanValue());
        }
        bool.booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(zBooleanValue));
        int i4 = onExtraCallbackWithResult + 83;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final boolean IAuthTabCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            return bool.booleanValue();
        }
        bool.booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(zBooleanValue));
        if (i3 == 0) {
            int i4 = 12 / 0;
        }
        int i5 = onExtraCallback + 71;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, ExtensionsManager1 extensionsManager1) {
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        return (Unit) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback2, 2088066611, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, new Object[]{getsupportedhighspeedresolutionsfor, extensionsManager1}, -2088066601);
    }

    public static /* synthetic */ Unit onNavigationEvent(isQueryRefinementEnabled isqueryrefinementenabled, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, isQueryRefinementEnabled isqueryrefinementenabled2, flipHorizontally fliphorizontally) {
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        return (Unit) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback2, 3271863, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, new Object[]{isqueryrefinementenabled, r8lambdanm9dm2eewl4vrptnjmesfjqky4, isqueryrefinementenabled2, fliphorizontally}, -3271859);
    }

    public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, long j, encodeUriString encodeuristring, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, boolean z, addLinks.IAuthTabCallback iAuthTabCallback, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Long.valueOf(j), encodeuristring, getsupportedhighspeedresolutionsfor2, Boolean.valueOf(z), iAuthTabCallback, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4, getsupportedhighspeedresolutionsfor5, getsupportedhighspeedresolutionsfor6, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        return (Unit) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -921891622, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, objArr, 921891631);
    }

    private static final boolean onExtraCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        return ((Boolean) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback2, 1548833066, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, new Object[]{getsupportedhighspeedresolutionsfor}, -1548833063)).booleanValue();
    }

    private static final void onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 41188712, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, objArr, -41188707);
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1064759320, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, objArr, -1064759313);
    }

    private static final Unit onNavigationEvent(putDoubleIfValid putdoubleifvalid, float f, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1, Function2 function2, Function2 function22, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {putdoubleifvalid, Float.valueOf(f), quirksExternalSyntheticBackport0, virtualCameraControlExternalSyntheticLambda1, function2, function22, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        return (Unit) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -475243839, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, objArr, 475243850);
    }

    private static final boolean onTransact(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        return ((Boolean) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback2, -1107538970, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, new Object[]{getsupportedhighspeedresolutionsfor}, 1107538978)).booleanValue();
    }

    private static final Unit onExtraCallbackWithResult(putDoubleIfValid putdoubleifvalid, boolean z, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, long j, addLinks.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {putdoubleifvalid, Boolean.valueOf(z), getsupportedhighspeedresolutionsfor, r8lambdanm9dm2eewl4vrptnjmesfjqky4, Long.valueOf(j), iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        return (Unit) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -435582498, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, objArr, 435582499);
    }

    private static final Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, defaultIfEmpty defaultifempty, encodeUriString encodeuristring, putDoubleIfValid putdoubleifvalid, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {quirksExternalSyntheticBackport0, defaultifempty, encodeuristring, putdoubleifvalid, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        return (Unit) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1266358655, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, objArr, 1266358655);
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<Object> getsupportedhighspeedresolutionsfor, Object obj) {
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback2, 1087189983, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, new Object[]{getsupportedhighspeedresolutionsfor, obj}, -1087189977);
    }

    private static final appendQueryParameters IAuthTabCallback_Parcel(getSupportedHighSpeedResolutionsFor<appendQueryParameters> getsupportedhighspeedresolutionsfor) {
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        return (appendQueryParameters) onWarmupCompleted(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback2, 1269760032, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, new Object[]{getsupportedhighspeedresolutionsfor}, -1269760030);
    }
}
