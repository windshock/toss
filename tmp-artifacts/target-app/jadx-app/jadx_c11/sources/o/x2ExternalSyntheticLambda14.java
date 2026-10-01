package o;

import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1Kt$;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.InterfaceC0083handshake;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SessionProcessorCaptureCallback;
import o.getBacktraceNote;
import o.readFully;
import o.removeObserverLocked;
import o.selectParentResolutions;
import o.setIso;
import o.toPreviewOnlyRange;
import o.x2ExternalSyntheticLambda14;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class x2ExternalSyntheticLambda14 {
    private static int asInterface = 1;
    private static int onNavigationEvent = 1;
    private static int onTransact;
    private static int onWarmupCompleted;
    private static final DeviceQuirksExternalSyntheticLambda0 onExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f));
    private static final DeviceQuirksExternalSyntheticLambda0 IAuthTabCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f));
    private static final float onExtraCallbackWithResult = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f);

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        long jLongValue = ((Number) objArr[0]).longValue();
        float fFloatValue = ((Number) objArr[1]).floatValue();
        SessionProcessorCaptureCallback sessionProcessorCaptureCallback = (SessionProcessorCaptureCallback) objArr[2];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        removeObserverLocked removeobserverlockedIAuthTabCallback = IAuthTabCallback(jLongValue, fFloatValue, sessionProcessorCaptureCallback);
        int i4 = onNavigationEvent + 39;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return removeobserverlockedIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, selectParentResolutions selectparentresolutions) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(function1, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, selectparentresolutions);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(function1, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, selectparentresolutions);
        int i3 = onWarmupCompleted + 31;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, getBacktraceNote getbacktracenote, selectParentResolutions selectparentresolutions, Function2 function2, Function2 function22, Function2 function23, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 107;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(deviceQuirksExternalSyntheticLambda0, getbacktracenote, selectparentresolutions, function2, function22, function23, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 47;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(selectParentResolutions selectparentresolutions, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(selectparentresolutions, getsupportedhighspeedresolutionsfor);
        int i4 = onNavigationEvent + 113;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = ~(i7 | i8 | i5);
        int i10 = ~i5;
        int i11 = (~(i7 | i10)) | (~(i8 | i3 | i5));
        int i12 = (~(i5 | i7)) | (~(i8 | i10));
        int i13 = i3 + i2 + i4 + ((-1255669517) * i) + (533247121 * i6);
        int i14 = i13 * i13;
        int i15 = ((i3 * (-122328301)) - 2132886715) + (i2 * (-122328301)) + (i9 * 272) + (i11 * 272) + (i12 * 272) + ((-122328029) * i4) + ((-1196579527) * i) + (656595923 * i6) + (i14 * 138215424);
        int i16 = ((i3 * (-1895547823)) - 858849280) + ((-1895547823) * i2) + (i9 * (-204618832)) + (i11 * (-204618832)) + ((-204618832) * i12) + ((-2100166656) * i4) + (760610816 * i) + ((-1057882112) * i6) + (1344208896 * i14) + (i15 * i15 * (-833028096));
        if (i16 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i16 == 2) {
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
            int i17 = 2 % 2;
            int i18 = onNavigationEvent + 101;
            onWarmupCompleted = i18 % 128;
            int i19 = i18 % 2;
            selectParentResolutions selectparentresolutions = (selectParentResolutions) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
            int i20 = onNavigationEvent + 31;
            onWarmupCompleted = i20 % 128;
            int i21 = i20 % 2;
            return selectparentresolutions;
        }
        if (i16 == 3) {
            return IAuthTabCallback(objArr);
        }
        if (i16 == 4) {
            return onWarmupCompleted(objArr);
        }
        if (i16 == 5) {
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
            long jLongValue = ((Number) objArr[1]).longValue();
            float fFloatValue = ((Number) objArr[2]).floatValue();
            QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted = (QuirkSettingsLoader.onWarmupCompleted) objArr[3];
            getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[4];
            DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[5];
            selectParentResolutions selectparentresolutions2 = (selectParentResolutions) objArr[6];
            Function1 function1 = (Function1) objArr[7];
            boolean zBooleanValue = ((Boolean) objArr[8]).booleanValue();
            CameraUnavailableException cameraUnavailableException = (CameraUnavailableException) objArr[9];
            CameraState cameraState = (CameraState) objArr[10];
            getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[11];
            DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02 = (DeviceQuirksExternalSyntheticLambda0) objArr[12];
            getBacktraceNote getbacktracenote3 = (getBacktraceNote) objArr[13];
            Function2 function2 = (Function2) objArr[14];
            Function2 function22 = (Function2) objArr[15];
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[16];
            int iIntValue = ((Number) objArr[17]).intValue();
            int i22 = 2 % 2;
            int i23 = onWarmupCompleted + 51;
            onNavigationEvent = i23 % 128;
            int i24 = i23 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(quirksExternalSyntheticBackport0, jLongValue, fFloatValue, onwarmupcompleted, getbacktracenote, deviceQuirksExternalSyntheticLambda0, selectparentresolutions2, function1, zBooleanValue, cameraUnavailableException, cameraState, getbacktracenote2, deviceQuirksExternalSyntheticLambda02, getbacktracenote3, function2, function22, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            int i25 = onWarmupCompleted + 105;
            onNavigationEvent = i25 % 128;
            int i26 = i25 % 2;
            return unitIAuthTabCallback;
        }
        String str = (String) objArr[0];
        Function1 function12 = (Function1) objArr[1];
        Function0 function0 = (Function0) objArr[2];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (QuirksExternalSyntheticBackport0) objArr[3];
        boolean zBooleanValue2 = ((Boolean) objArr[4]).booleanValue();
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda03 = (DeviceQuirksExternalSyntheticLambda0) objArr[5];
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda04 = (DeviceQuirksExternalSyntheticLambda0) objArr[6];
        long jLongValue2 = ((Number) objArr[7]).longValue();
        getBacktraceNote getbacktracenote4 = (getBacktraceNote) objArr[8];
        getBacktraceNote getbacktracenote5 = (getBacktraceNote) objArr[9];
        Function2 function23 = (Function2) objArr[10];
        Function2 function24 = (Function2) objArr[11];
        getBacktraceNote getbacktracenote6 = (getBacktraceNote) objArr[12];
        CameraUnavailableException cameraUnavailableException2 = (CameraUnavailableException) objArr[13];
        CameraState cameraState2 = (CameraState) objArr[14];
        float fFloatValue2 = ((Number) objArr[15]).floatValue();
        int iIntValue2 = ((Number) objArr[16]).intValue();
        int iIntValue3 = ((Number) objArr[17]).intValue();
        int iIntValue4 = ((Number) objArr[18]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[19];
        ((Number) objArr[20]).intValue();
        int i27 = 2 % 2;
        int i28 = onWarmupCompleted + 37;
        onNavigationEvent = i28 % 128;
        int i29 = i28 % 2;
        IAuthTabCallback(str, function12, function0, quirksExternalSyntheticBackport02, zBooleanValue2, deviceQuirksExternalSyntheticLambda03, deviceQuirksExternalSyntheticLambda04, jLongValue2, getbacktracenote4, getbacktracenote5, function23, function24, getbacktracenote6, cameraUnavailableException2, cameraState2, fFloatValue2, cameraCaptureResultEmptyCameraCaptureResult2, RecomposeScopeImplKt.onExtraCallbackWithResult(1 | iIntValue2), RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue3), iIntValue4);
        Unit unit = Unit.INSTANCE;
        int i30 = onWarmupCompleted + 111;
        onNavigationEvent = i30 % 128;
        int i31 = i30 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 3;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 111;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 59;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6, function2, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6, function2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onNavigationEvent + 123;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static final Unit onExtraCallback(selectParentResolutions selectparentresolutions, Function1 function1, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02, long j, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, Function2 function2, Function2 function22, getBacktraceNote getbacktracenote3, CameraUnavailableException cameraUnavailableException, CameraState cameraState, QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, float f, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 89;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        onNavigationEvent(selectparentresolutions, function1, function0, quirksExternalSyntheticBackport0, z, deviceQuirksExternalSyntheticLambda0, deviceQuirksExternalSyntheticLambda02, j, getbacktracenote, getbacktracenote2, function2, function22, getbacktracenote3, cameraUnavailableException, cameraState, onwarmupcompleted, f, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = onNavigationEvent + 63;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(boolean z, Function0 function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 3;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            IAuthTabCallback(z, function0, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(z, function0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onNavigationEvent + 95;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(long j, readFully readfully, long j2, long j3, setIso setiso) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {Long.valueOf(j), readfully, Long.valueOf(j2), Long.valueOf(j3), setiso};
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1694179069, 1694179070, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, TTVideoLandingPageActivity.onExtraCallbackWithResult());
        int i4 = onNavigationEvent + 73;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, Function1 function1, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02, long j, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, Function2 function2, Function2 function22, getBacktraceNote getbacktracenote3, CameraUnavailableException cameraUnavailableException, CameraState cameraState, float f, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 13;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            Object[] objArr = {str, function1, function0, quirksExternalSyntheticBackport0, Boolean.valueOf(z), deviceQuirksExternalSyntheticLambda0, deviceQuirksExternalSyntheticLambda02, Long.valueOf(j), getbacktracenote, getbacktracenote2, function2, function22, getbacktracenote3, cameraUnavailableException, cameraState, Float.valueOf(f), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
            throw null;
        }
        Object[] objArr2 = {str, function1, function0, quirksExternalSyntheticBackport0, Boolean.valueOf(z), deviceQuirksExternalSyntheticLambda0, deviceQuirksExternalSyntheticLambda02, Long.valueOf(j), getbacktracenote, getbacktracenote2, function2, function22, getbacktracenote3, cameraUnavailableException, cameraState, Float.valueOf(f), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
        Unit unit = (Unit) onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1884446177, 1884446177, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), objArr2, TTVideoLandingPageActivity.onExtraCallbackWithResult());
        int i7 = onNavigationEvent + 43;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 71;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            onExtraCallback(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onWarmupCompleted + 63;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, float f, QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, getBacktraceNote getbacktracenote, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, selectParentResolutions selectparentresolutions, Function1 function1, boolean z, CameraUnavailableException cameraUnavailableException, CameraState cameraState, getBacktraceNote getbacktracenote2, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02, getBacktraceNote getbacktracenote3, Function2 function2, Function2 function22, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 31;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {quirksExternalSyntheticBackport0, Long.valueOf(j), Float.valueOf(f), onwarmupcompleted, getbacktracenote, deviceQuirksExternalSyntheticLambda0, selectparentresolutions, function1, Boolean.valueOf(z), cameraUnavailableException, cameraState, getbacktracenote2, deviceQuirksExternalSyntheticLambda02, getbacktracenote3, function2, function22, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1183341718, 1183341722, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, TTVideoLandingPageActivity.onExtraCallbackWithResult());
        int i5 = onWarmupCompleted + 35;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(selectParentResolutions selectparentresolutions, Function1 function1, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02, long j, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, Function2 function2, Function2 function22, getBacktraceNote getbacktracenote3, CameraUnavailableException cameraUnavailableException, CameraState cameraState, QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, float f, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        Unit unitOnExtraCallback;
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 45;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            unitOnExtraCallback = onExtraCallback(selectparentresolutions, function1, function0, quirksExternalSyntheticBackport0, z, deviceQuirksExternalSyntheticLambda0, deviceQuirksExternalSyntheticLambda02, j, getbacktracenote, getbacktracenote2, function2, function22, getbacktracenote3, cameraUnavailableException, cameraState, onwarmupcompleted, f, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
            int i7 = 59 / 0;
        } else {
            unitOnExtraCallback = onExtraCallback(selectparentresolutions, function1, function0, quirksExternalSyntheticBackport0, z, deviceQuirksExternalSyntheticLambda0, deviceQuirksExternalSyntheticLambda02, j, getbacktracenote, getbacktracenote2, function2, function22, getbacktracenote3, cameraUnavailableException, cameraState, onwarmupcompleted, f, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        }
        int i8 = onNavigationEvent + 91;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(boolean z, Function0 function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 45;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(z, function0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 9;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(boolean z, Function0 function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z2;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onWarmupCompleted + 45;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(255820412, i, -1, "im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1.<anonymous> (TdsSearchFieldV1.kt:73)");
            }
            x2ExternalSyntheticLambda12.onExtraCallbackWithResult.onExtraCallback(null, z, function0, cameraCaptureResultEmptyCameraCaptureResult, 3072, 1);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onWarmupCompleted + 47;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
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

    /* JADX WARN: Removed duplicated region for block: B:6:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(selectParentResolutions selectparentresolutions, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        long jOnExtraCallbackWithResult = selectparentresolutions.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        if (getNumberOfTargets.onExtraCallback(jOnExtraCallbackWithResult, ((selectParentResolutions) onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1662001050, -1662001048, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{getsupportedhighspeedresolutionsfor}, TTVideoLandingPageActivity.onExtraCallbackWithResult())).onExtraCallbackWithResult())) {
            int i4 = onWarmupCompleted + 71;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            getNumberOfTargets getnumberoftargetsOnExtraCallback = selectparentresolutions.onExtraCallback();
            int iOnExtraCallbackWithResult3 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            if (!Intrinsics.areEqual(getnumberoftargetsOnExtraCallback, ((selectParentResolutions) onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1662001050, -1662001048, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3, new Object[]{getsupportedhighspeedresolutionsfor}, TTVideoLandingPageActivity.onExtraCallbackWithResult())).onExtraCallback())) {
                onNavigationEvent(getsupportedhighspeedresolutionsfor, selectparentresolutions);
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, selectParentResolutions selectparentresolutions) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(selectparentresolutions, "");
        onNavigationEvent(getsupportedhighspeedresolutionsfor, selectparentresolutions);
        boolean zAreEqual = Intrinsics.areEqual(onExtraCallback(getsupportedhighspeedresolutionsfor2), selectparentresolutions.onNavigationEvent());
        onExtraCallback(getsupportedhighspeedresolutionsfor2, selectparentresolutions.onNavigationEvent());
        if (!zAreEqual) {
            function1.invoke(selectparentresolutions.onNavigationEvent());
            int i4 = onNavigationEvent + 59;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x040f A[PHI: r14
      0x040f: PHI (r14v22 boolean) = (r14v21 boolean), (r14v23 boolean) binds: [B:250:0x040c, B:247:0x0404] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:279:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@NotNull final String str, @NotNull final Function1<? super String, Unit> function1, @NotNull final Function0<Unit> function0, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02, long j, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function22, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3, @Nullable CameraUnavailableException cameraUnavailableException, @Nullable CameraState cameraState, float f, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2, final int i3) {
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
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final boolean z2;
        final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda03;
        final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda04;
        final long j2;
        final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4;
        final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote5;
        final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function23;
        final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function24;
        final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote6;
        final CameraUnavailableException cameraUnavailableException2;
        final CameraState cameraState2;
        final float f2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        long jOnExtraCallback;
        boolean z3;
        Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2OnExtraCallback;
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote7;
        CameraUnavailableException cameraUnavailableExceptionOnExtraCallback;
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote8;
        Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function25;
        boolean z4;
        Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function26;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda05;
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote9;
        CameraState cameraStateOnNavigationEvent;
        float f3;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda06;
        long j3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        boolean z5;
        boolean z6;
        boolean zOnNavigationEvent;
        boolean z7;
        Object obj;
        int i22;
        int i23 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1913512803);
        if ((i & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 256 : 128;
        }
        int i24 = i3 & 8;
        if (i24 != 0) {
            i4 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
                        int i25 = onWarmupCompleted + 119;
                        onNavigationEvent = i25 % 128;
                        i6 = i25 % 2 == 0 ? 2947 : 16384;
                    } else {
                        i6 = 8192;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= 196608;
                } else if ((i & 196608) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 131072 : 65536;
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                    i4 |= 1572864;
                } else {
                    if ((i & 1572864) == 0) {
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda02) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        if ((i3 & 128) == 0) {
                            int i26 = onNavigationEvent + 15;
                            onWarmupCompleted = i26 % 128;
                            int i27 = i26 % 2;
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j)) {
                                int i28 = onWarmupCompleted + 91;
                                onNavigationEvent = i28 % 128;
                                if (i28 % 2 == 0) {
                                    int i29 = 50 / 0;
                                }
                                i22 = 8388608;
                            } else {
                                i22 = 4194304;
                            }
                            i4 |= i22;
                        }
                    }
                    i9 = i3 & 256;
                    if (i9 == 0) {
                        int i30 = onWarmupCompleted + 63;
                        onNavigationEvent = i30 % 128;
                        int i31 = i30 % 2;
                        i10 = 100663296;
                    } else {
                        if ((100663296 & i) == 0) {
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote)) {
                                int i32 = onWarmupCompleted + 99;
                                onNavigationEvent = i32 % 128;
                                int i33 = i32 % 2;
                                i10 = 67108864;
                            } else {
                                i10 = 33554432;
                            }
                        }
                        i11 = i3 & 512;
                        if (i11 != 0) {
                            i4 |= 805306368;
                        } else {
                            if ((i & 805306368) == 0) {
                                int i34 = onWarmupCompleted + 25;
                                onNavigationEvent = i34 % 128;
                                int i35 = i34 % 2;
                                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote2) ? 536870912 : 268435456;
                            }
                            i12 = i3 & 1024;
                            if (i12 == 0) {
                                i13 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2)) {
                                    int i36 = onNavigationEvent + 95;
                                    onWarmupCompleted = i36 % 128;
                                    int i37 = i36 % 2;
                                    i14 = 4;
                                } else {
                                    i14 = 2;
                                }
                                i13 = i2 | i14;
                            } else {
                                i13 = i2;
                            }
                            i15 = i3 & 2048;
                            if (i15 == 0) {
                                i13 |= 48;
                            } else if ((i2 & 48) == 0) {
                                i13 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function22) ? 32 : 16;
                            }
                            i16 = i13;
                            i17 = i3 & 4096;
                            if (i17 == 0) {
                                i16 |= 384;
                            } else {
                                if ((i2 & 384) == 0) {
                                    i16 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote3) ? 256 : 128;
                                }
                                i18 = i3 & 8192;
                                if (i18 != 0) {
                                    i16 |= 3072;
                                } else {
                                    if ((i2 & 3072) == 0) {
                                        i16 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraUnavailableException) ^ true ? 1024 : 2048;
                                    }
                                    i19 = i3 & 16384;
                                    if (i19 != 0) {
                                        i20 = i19;
                                        if ((i2 & 24576) == 0) {
                                            i16 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraState) ? 16384 : 8192;
                                        }
                                        i21 = i3 & 32768;
                                        if (i21 != 0) {
                                            i16 |= 196608;
                                        } else if ((i2 & 196608) == 0) {
                                            i16 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 131072 : 65536;
                                        }
                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i4 & 306783379) == 306783378 && (74899 & i16) == 74898) ? false : true, i4 & 1)) {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                            if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = i24 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                                final boolean z8 = i5 != 0 ? true : z;
                                                DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda07 = i7 != 0 ? onExtraCallback : deviceQuirksExternalSyntheticLambda0;
                                                DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda08 = i8 != 0 ? IAuthTabCallback : deviceQuirksExternalSyntheticLambda02;
                                                if ((i3 & 128) != 0) {
                                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                                                    jOnExtraCallback = x2ExternalSyntheticLambda12.onExtraCallbackWithResult.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                                    i4 &= -29360129;
                                                } else {
                                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                                                    jOnExtraCallback = j;
                                                }
                                                getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote10 = i9 != 0 ? null : getbacktracenote;
                                                getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote11 = i11 != 0 ? (getBacktraceNote) x2ExternalSyntheticLambda16.IAuthTabCallback(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), new Object[]{x2ExternalSyntheticLambda16.IAuthTabCallback}, -1773629667, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), 1773629668) : getbacktracenote2;
                                                Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function27 = i12 != 0 ? null : function2;
                                                if (i15 != 0) {
                                                    z3 = true;
                                                    function2OnExtraCallback = ForwardingCameraControl.onExtraCallback(255820412, true, new Function2() { // from class: im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1Kt$$ExternalSyntheticLambda9
                                                        private static int IAuthTabCallback = 0;
                                                        private static int onWarmupCompleted = 1;

                                                        public final Object invoke(Object obj2, Object obj3) {
                                                            int i38 = 2 % 2;
                                                            int i39 = IAuthTabCallback + 125;
                                                            onWarmupCompleted = i39 % 128;
                                                            int i40 = i39 % 2;
                                                            boolean z9 = z8;
                                                            if (i40 != 0) {
                                                                return x2ExternalSyntheticLambda14.onWarmupCompleted(z9, function0, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                                            }
                                                            Unit unitOnWarmupCompleted = x2ExternalSyntheticLambda14.onWarmupCompleted(z9, function0, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                                            int i41 = 68 / 0;
                                                            return unitOnWarmupCompleted;
                                                        }
                                                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                                                } else {
                                                    z3 = true;
                                                    function2OnExtraCallback = function22;
                                                }
                                                getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote12 = i17 != 0 ? null : getbacktracenote3;
                                                getbacktracenote7 = getbacktracenote10;
                                                cameraUnavailableExceptionOnExtraCallback = i18 != 0 ? x2ExternalSyntheticLambda12.onExtraCallbackWithResult.onExtraCallback() : cameraUnavailableException;
                                                getbacktracenote8 = getbacktracenote11;
                                                function25 = function27;
                                                z4 = z8;
                                                function26 = function2OnExtraCallback;
                                                deviceQuirksExternalSyntheticLambda05 = deviceQuirksExternalSyntheticLambda07;
                                                getbacktracenote9 = getbacktracenote12;
                                                cameraStateOnNavigationEvent = i20 != 0 ? x2ExternalSyntheticLambda12.onExtraCallbackWithResult.onNavigationEvent() : cameraState;
                                                f3 = i21 != 0 ? onExtraCallbackWithResult : f;
                                                deviceQuirksExternalSyntheticLambda06 = deviceQuirksExternalSyntheticLambda08;
                                                j3 = jOnExtraCallback;
                                                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                            } else {
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                                if ((i3 & 128) != 0) {
                                                    i4 &= -29360129;
                                                }
                                                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport0;
                                                z4 = z;
                                                deviceQuirksExternalSyntheticLambda05 = deviceQuirksExternalSyntheticLambda0;
                                                deviceQuirksExternalSyntheticLambda06 = deviceQuirksExternalSyntheticLambda02;
                                                j3 = j;
                                                getbacktracenote7 = getbacktracenote;
                                                getbacktracenote8 = getbacktracenote2;
                                                function25 = function2;
                                                function26 = function22;
                                                getbacktracenote9 = getbacktracenote3;
                                                cameraUnavailableExceptionOnExtraCallback = cameraUnavailableException;
                                                cameraStateOnNavigationEvent = cameraState;
                                                f3 = f;
                                                z3 = true;
                                            }
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1913512803, i4, i16, "im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1 (TdsSearchFieldV1.kt:82)");
                                            }
                                            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                                            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                                                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new selectParentResolutions(str, 0L, (getNumberOfTargets) null, 6, (DefaultConstructorMarker) null), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                            }
                                            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                                            final selectParentResolutions selectparentresolutionsOnExtraCallback = selectParentResolutions.onExtraCallback((selectParentResolutions) onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1662001050, -1662001048, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{getsupportedhighspeedresolutionsfor}, TTVideoLandingPageActivity.onExtraCallbackWithResult()), str, 0L, (getNumberOfTargets) null, 6, (Object) null);
                                            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(selectparentresolutionsOnExtraCallback);
                                            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            if (zOnNavigationEvent2 || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                                                objOnMinimized2 = new Function0() { // from class: im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1Kt$$ExternalSyntheticLambda10
                                                    private static int onExtraCallbackWithResult = 1;
                                                    private static int onNavigationEvent;

                                                    public final Object invoke() {
                                                        int i38 = 2 % 2;
                                                        int i39 = onNavigationEvent + 81;
                                                        onExtraCallbackWithResult = i39 % 128;
                                                        if (i39 % 2 == 0) {
                                                            x2ExternalSyntheticLambda14.IAuthTabCallback(selectparentresolutionsOnExtraCallback, getsupportedhighspeedresolutionsfor);
                                                            Object obj2 = null;
                                                            obj2.hashCode();
                                                            throw null;
                                                        }
                                                        Unit unitIAuthTabCallback = x2ExternalSyntheticLambda14.IAuthTabCallback(selectparentresolutionsOnExtraCallback, getsupportedhighspeedresolutionsfor);
                                                        int i40 = onNavigationEvent + 67;
                                                        onExtraCallbackWithResult = i40 % 128;
                                                        if (i40 % 2 == 0) {
                                                            int i41 = 32 / 0;
                                                        }
                                                        return unitIAuthTabCallback;
                                                    }
                                                };
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                                            }
                                            isZslDisabledByByUserCaseConfig.onNavigationEvent((Function0) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                            if ((i4 & 14) == 4) {
                                                int i38 = onWarmupCompleted + 73;
                                                onNavigationEvent = i38 % 128;
                                                if (i38 % 2 == 0) {
                                                    int i39 = 3 / 2;
                                                }
                                                z5 = z3;
                                            } else {
                                                z5 = false;
                                            }
                                            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            if (z5) {
                                                z6 = false;
                                            } else {
                                                int i40 = onNavigationEvent + 67;
                                                onWarmupCompleted = i40 % 128;
                                                if (i40 % 2 != 0) {
                                                    z6 = false;
                                                    int i41 = 9 / 0;
                                                    if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                                                    }
                                                } else {
                                                    z6 = false;
                                                    if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                                                    }
                                                }
                                                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized3;
                                                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor2);
                                                z7 = (i4 & 112) != 32 ? true : z6;
                                                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                if (zOnNavigationEvent | z7) {
                                                    int i42 = onNavigationEvent + 121;
                                                    onWarmupCompleted = i42 % 128;
                                                    if (i42 % 2 != 0) {
                                                        onwarmupcompleted.onExtraCallback();
                                                        Object obj2 = null;
                                                        obj2.hashCode();
                                                        throw null;
                                                    }
                                                    if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                                                        Function1 function12 = new Function1() { // from class: im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1Kt$$ExternalSyntheticLambda11
                                                            private static int onNavigationEvent = 1;
                                                            private static int onWarmupCompleted;

                                                            public final Object invoke(Object obj3) {
                                                                int i43 = 2 % 2;
                                                                int i44 = onWarmupCompleted + 79;
                                                                onNavigationEvent = i44 % 128;
                                                                int i45 = i44 % 2;
                                                                Function1 function13 = function1;
                                                                if (i45 != 0) {
                                                                    return x2ExternalSyntheticLambda14.IAuthTabCallback(function13, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, (selectParentResolutions) obj3);
                                                                }
                                                                x2ExternalSyntheticLambda14.IAuthTabCallback(function13, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, (selectParentResolutions) obj3);
                                                                throw null;
                                                            }
                                                        };
                                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function12);
                                                        obj = function12;
                                                    } else {
                                                        obj = objOnMinimized4;
                                                    }
                                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                                    onNavigationEvent(selectparentresolutionsOnExtraCallback, (Function1) obj, function0, quirksExternalSyntheticBackport04, z4, deviceQuirksExternalSyntheticLambda05, deviceQuirksExternalSyntheticLambda06, j3, getbacktracenote7, getbacktracenote8, function25, function26, getbacktracenote9, cameraUnavailableExceptionOnExtraCallback, cameraStateOnNavigationEvent, null, f3, cameraCaptureResultEmptyCameraCaptureResult2, i4 & 2147483520, (65534 & i16) | ((i16 << 3) & 3670016), 32768);
                                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                                    }
                                                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                                                    z2 = z4;
                                                    deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda05;
                                                    deviceQuirksExternalSyntheticLambda04 = deviceQuirksExternalSyntheticLambda06;
                                                    getbacktracenote4 = getbacktracenote7;
                                                    j2 = j3;
                                                    getbacktracenote5 = getbacktracenote8;
                                                    function23 = function25;
                                                    function24 = function26;
                                                    getbacktracenote6 = getbacktracenote9;
                                                    cameraUnavailableException2 = cameraUnavailableExceptionOnExtraCallback;
                                                    cameraState2 = cameraStateOnNavigationEvent;
                                                    f2 = f3;
                                                }
                                            }
                                            objOnMinimized3 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(str, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                                            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor22 = (getSupportedHighSpeedResolutionsFor) objOnMinimized3;
                                            zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor22);
                                            if ((i4 & 112) != 32) {
                                            }
                                            Object objOnMinimized42 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            if (zOnNavigationEvent | z7) {
                                            }
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                            z2 = z;
                                            deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda0;
                                            deviceQuirksExternalSyntheticLambda04 = deviceQuirksExternalSyntheticLambda02;
                                            j2 = j;
                                            getbacktracenote4 = getbacktracenote;
                                            getbacktracenote5 = getbacktracenote2;
                                            function23 = function2;
                                            function24 = function22;
                                            getbacktracenote6 = getbacktracenote3;
                                            cameraUnavailableException2 = cameraUnavailableException;
                                            cameraState2 = cameraState;
                                            f2 = f;
                                        }
                                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1Kt$$ExternalSyntheticLambda12
                                                private static int onExtraCallbackWithResult = 1;
                                                private static int onWarmupCompleted;

                                                public final Object invoke(Object obj3, Object obj4) {
                                                    int i43 = 2 % 2;
                                                    int i44 = onWarmupCompleted + 37;
                                                    onExtraCallbackWithResult = i44 % 128;
                                                    int i45 = i44 % 2;
                                                    Unit unitOnExtraCallbackWithResult = x2ExternalSyntheticLambda14.onExtraCallbackWithResult(str, function1, function0, quirksExternalSyntheticBackport02, z2, deviceQuirksExternalSyntheticLambda03, deviceQuirksExternalSyntheticLambda04, j2, getbacktracenote4, getbacktracenote5, function23, function24, getbacktracenote6, cameraUnavailableException2, cameraState2, f2, i, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                                    int i46 = onWarmupCompleted + 25;
                                                    onExtraCallbackWithResult = i46 % 128;
                                                    if (i46 % 2 != 0) {
                                                        return unitOnExtraCallbackWithResult;
                                                    }
                                                    throw null;
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    i16 |= 24576;
                                    i20 = i19;
                                    i21 = i3 & 32768;
                                    if (i21 != 0) {
                                    }
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i4 & 306783379) == 306783378 && (74899 & i16) == 74898) ? false : true, i4 & 1)) {
                                    }
                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                    }
                                }
                                i19 = i3 & 16384;
                                if (i19 != 0) {
                                }
                                i21 = i3 & 32768;
                                if (i21 != 0) {
                                }
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i4 & 306783379) == 306783378 && (74899 & i16) == 74898) ? false : true, i4 & 1)) {
                                }
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                }
                            }
                            i18 = i3 & 8192;
                            if (i18 != 0) {
                            }
                            i19 = i3 & 16384;
                            if (i19 != 0) {
                            }
                            i21 = i3 & 32768;
                            if (i21 != 0) {
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i4 & 306783379) == 306783378 && (74899 & i16) == 74898) ? false : true, i4 & 1)) {
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            }
                        }
                        i12 = i3 & 1024;
                        if (i12 == 0) {
                        }
                        i15 = i3 & 2048;
                        if (i15 == 0) {
                        }
                        i16 = i13;
                        i17 = i3 & 4096;
                        if (i17 == 0) {
                        }
                        i18 = i3 & 8192;
                        if (i18 != 0) {
                        }
                        i19 = i3 & 16384;
                        if (i19 != 0) {
                        }
                        i21 = i3 & 32768;
                        if (i21 != 0) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i4 & 306783379) == 306783378 && (74899 & i16) == 74898) ? false : true, i4 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        }
                    }
                    i4 |= i10;
                    i11 = i3 & 512;
                    if (i11 != 0) {
                    }
                    i12 = i3 & 1024;
                    if (i12 == 0) {
                    }
                    i15 = i3 & 2048;
                    if (i15 == 0) {
                    }
                    i16 = i13;
                    i17 = i3 & 4096;
                    if (i17 == 0) {
                    }
                    i18 = i3 & 8192;
                    if (i18 != 0) {
                    }
                    i19 = i3 & 16384;
                    if (i19 != 0) {
                    }
                    i21 = i3 & 32768;
                    if (i21 != 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i4 & 306783379) == 306783378 && (74899 & i16) == 74898) ? false : true, i4 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                if ((i & 12582912) == 0) {
                }
                i9 = i3 & 256;
                if (i9 == 0) {
                }
                i4 |= i10;
                i11 = i3 & 512;
                if (i11 != 0) {
                }
                i12 = i3 & 1024;
                if (i12 == 0) {
                }
                i15 = i3 & 2048;
                if (i15 == 0) {
                }
                i16 = i13;
                i17 = i3 & 4096;
                if (i17 == 0) {
                }
                i18 = i3 & 8192;
                if (i18 != 0) {
                }
                i19 = i3 & 16384;
                if (i19 != 0) {
                }
                i21 = i3 & 32768;
                if (i21 != 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i4 & 306783379) == 306783378 && (74899 & i16) == 74898) ? false : true, i4 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            i7 = i3 & 32;
            if (i7 != 0) {
            }
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i9 = i3 & 256;
            if (i9 == 0) {
            }
            i4 |= i10;
            i11 = i3 & 512;
            if (i11 != 0) {
            }
            i12 = i3 & 1024;
            if (i12 == 0) {
            }
            i15 = i3 & 2048;
            if (i15 == 0) {
            }
            i16 = i13;
            i17 = i3 & 4096;
            if (i17 == 0) {
            }
            i18 = i3 & 8192;
            if (i18 != 0) {
            }
            i19 = i3 & 16384;
            if (i19 != 0) {
            }
            i21 = i3 & 32768;
            if (i21 != 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i4 & 306783379) == 306783378 && (74899 & i16) == 74898) ? false : true, i4 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i9 = i3 & 256;
        if (i9 == 0) {
        }
        i4 |= i10;
        i11 = i3 & 512;
        if (i11 != 0) {
        }
        i12 = i3 & 1024;
        if (i12 == 0) {
        }
        i15 = i3 & 2048;
        if (i15 == 0) {
        }
        i16 = i13;
        i17 = i3 & 4096;
        if (i17 == 0) {
        }
        i18 = i3 & 8192;
        if (i18 != 0) {
        }
        i19 = i3 & 16384;
        if (i19 != 0) {
        }
        i21 = i3 & 32768;
        if (i21 != 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i4 & 306783379) == 306783378 && (74899 & i16) == 74898) ? false : true, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final Unit IAuthTabCallback(boolean z, Function0 function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 9;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            int i6 = i3 + 43;
            int i7 = i6 % 128;
            onNavigationEvent = i7;
            z = i6 % 2 != 0;
            int i8 = i7 + 43;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onWarmupCompleted + 103;
                onNavigationEvent = i10 % 128;
                if (i10 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1451221287, i, -1, "im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1.<anonymous> (TdsSearchFieldV1.kt:137)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1451221287, i, -1, "im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1.<anonymous> (TdsSearchFieldV1.kt:137)");
            }
            x2ExternalSyntheticLambda12.onExtraCallbackWithResult.onExtraCallback(null, z, function0, cameraCaptureResultEmptyCameraCaptureResult, 3072, 1);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i11 = onNavigationEvent + 125;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i12 != 0) {
                    obj.hashCode();
                    throw null;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final removeObserverLocked IAuthTabCallback(final long j, float f, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        final readFully readfullyOnWarmupCompleted = readFully.onExtraCallback.onWarmupCompleted(readFully.Companion, CollectionsKt.listOf(new setByteOrder[]{setByteOrder.onNavigationEvent(j), setByteOrder.onNavigationEvent(getMaxAdCount.onNavigationEvent(j, 0.0f))}), Float.intBitsToFloat((int) sessionProcessorCaptureCallback.onWarmupCompleted()), sessionProcessorCaptureCallback.onExtraCallback(f) + Float.intBitsToFloat((int) sessionProcessorCaptureCallback.onWarmupCompleted()), 0, 8, (Object) null);
        final long jIAuthTabCallback = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) sessionProcessorCaptureCallback.onWarmupCompleted())) & 4294967295L));
        final long jOnWarmupCompleted = setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(Float.intBitsToFloat((int) sessionProcessorCaptureCallback.onWarmupCompleted()) + sessionProcessorCaptureCallback.onExtraCallback(f)) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (sessionProcessorCaptureCallback.onWarmupCompleted() >> 32))) << 32));
        removeObserverLocked removeobserverlockedIAuthTabCallback = sessionProcessorCaptureCallback.IAuthTabCallback(new Function1() { // from class: im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1Kt$$ExternalSyntheticLambda5
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 117;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = x2ExternalSyntheticLambda14.onExtraCallbackWithResult(j, readfullyOnWarmupCompleted, jIAuthTabCallback, jOnWarmupCompleted, (setIso) obj);
                int i5 = onNavigationEvent + 9;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallbackWithResult;
            }
        });
        int i2 = onWarmupCompleted + 29;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return removeobserverlockedIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        long jLongValue = ((Number) objArr[0]).longValue();
        readFully readfully = (readFully) objArr[1];
        long jLongValue2 = ((Number) objArr[2]).longValue();
        long jLongValue3 = ((Number) objArr[3]).longValue();
        setIso setiso = (setIso) objArr[4];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setiso, "");
        setOrientationDegrees.onWarmupCompleted(setiso, jLongValue, 0L, 0L, 0.0f, (hasMoreElements) null, (seek) null, 0, 126, (Object) null);
        setiso.onWarmupCompleted();
        setOrientationDegrees.onExtraCallback(setiso, readfully, jLongValue2, jLongValue3, 0.0f, (hasMoreElements) null, (seek) null, 0, 120, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 89;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 5;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            int i6 = i3 + 19;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1905544411, i, -1, "im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsSearchFieldV1.kt:229)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = onCaptureSessionStart.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6) ? 1.0f : 0.0f);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i8 = onNavigationEvent + 45;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 != 0) {
                    getAwbState.onExtraCallback();
                    throw null;
                }
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                int i9 = onWarmupCompleted + 15;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            function2.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, getBacktraceNote getbacktracenote, selectParentResolutions selectparentresolutions, Function2 function2, final Function2 function22, Function2 function23, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(function23, "");
        if ((i & 6) == 0) {
            int i5 = onWarmupCompleted + 39;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 81 / 0;
                if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(function23)) {
                    i3 = 4;
                } else {
                    int i7 = onNavigationEvent + 69;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    i3 = 2;
                }
            } else if (!cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(function23)) {
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i9 = onWarmupCompleted + 49;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 23 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1119519012, i2, -1, "im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsSearchFieldV1.kt:207)");
                }
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedIAuthTabCallbackDefault = onextracallbackwithresult.IAuthTabCallbackDefault();
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                Object obj = null;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, AppLovinAdType.onExtraCallbackWithResult.onNavigationEvent(), 1, (Object) null);
                AppLovinAdClickListener appLovinAdClickListener = new AppLovinAdClickListener(AppLovinAdSize.onWarmupCompleted.onWarmupCompleted(), null);
                x2ExternalSyntheticLambda12 x2externalsyntheticlambda12 = x2ExternalSyntheticLambda12.onExtraCallbackWithResult;
                int i11 = i2;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(verifyDrawable.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnNavigationEvent, x2externalsyntheticlambda12.onTransact(cameraCaptureResultEmptyCameraCaptureResult, 6), appLovinAdClickListener), deviceQuirksExternalSyntheticLambda0);
                component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), onwarmupcompletedIAuthTabCallbackDefault, cameraCaptureResultEmptyCameraCaptureResult, 48);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                } else {
                    int i12 = onWarmupCompleted + 103;
                    onNavigationEvent = i12 % 128;
                    if (i12 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                        obj.hashCode();
                        throw null;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                if (getbacktracenote != null) {
                    int i13 = onWarmupCompleted + 95;
                    onNavigationEvent = i13 % 128;
                    int i14 = i13 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-946295955);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-30525676);
                    getbacktracenote.invoke(rowScopeInstance, cameraCaptureResultEmptyCameraCaptureResult, 6);
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i15 = onNavigationEvent + 87;
                onWarmupCompleted = i15 % 128;
                int i16 = i15 % 2;
                cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(Boolean.valueOf(StringsKt.isBlank(selectparentresolutions.onNavigationEvent())), cameraCaptureResultEmptyCameraCaptureResult, 0);
                QuirkSettingsLoader quirkSettingsLoaderAsInterface = onextracallbackwithresult.asInterface();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = RowScope.onNavigationEvent(rowScopeInstance, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null), 1.0f, false, 2, (Object) null);
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderAsInterface, false);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent2);
                Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                } else {
                    int i17 = onWarmupCompleted + 105;
                    onNavigationEvent = i17 % 128;
                    int i18 = i17 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                if (function22 != null) {
                    int i19 = onWarmupCompleted + 3;
                    onNavigationEvent = i19 % 128;
                    if (i19 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1095899821);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        throw null;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1095899821);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    z = true;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1095899820);
                    z = true;
                    PreviewExternalSyntheticLambda3.IAuthTabCallback(new getHumanReadableName(x2externalsyntheticlambda12.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6), 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777214, (DefaultConstructorMarker) null), ForwardingCameraControl.onExtraCallback(-1905544411, true, new Function2() { // from class: im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1Kt$$ExternalSyntheticLambda0
                        private static int IAuthTabCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj2, Object obj3) {
                            int i20 = 2 % 2;
                            int i21 = IAuthTabCallback + 15;
                            onWarmupCompleted = i21 % 128;
                            int i22 = i21 % 2;
                            Unit unitOnExtraCallback = x2ExternalSyntheticLambda14.onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, function22, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i23 = onWarmupCompleted + 57;
                            IAuthTabCallback = i23 % 128;
                            int i24 = i23 % 2;
                            return unitOnExtraCallback;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 48);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                function23.invoke(cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i11 & 14));
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback) == z) {
                    int i20 = onNavigationEvent + 57;
                    onWarmupCompleted = i20 % 128;
                    if (i20 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-30486000);
                        throw null;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-30486000);
                    if (function2 == null) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-945065999);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-30486000);
                        function2.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-945028550);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult3 = QuirkSettingsLoader.Companion;
                QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedIAuthTabCallbackDefault2 = onextracallbackwithresult3.IAuthTabCallbackDefault();
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                Object obj2 = null;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent3 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback2, 0.0f, AppLovinAdType.onExtraCallbackWithResult.onNavigationEvent(), 1, (Object) null);
                AppLovinAdClickListener appLovinAdClickListener2 = new AppLovinAdClickListener(AppLovinAdSize.onWarmupCompleted.onWarmupCompleted(), null);
                x2ExternalSyntheticLambda12 x2externalsyntheticlambda122 = x2ExternalSyntheticLambda12.onExtraCallbackWithResult;
                int i112 = i2;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(verifyDrawable.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnNavigationEvent3, x2externalsyntheticlambda122.onTransact(cameraCaptureResultEmptyCameraCaptureResult, 6), appLovinAdClickListener2), deviceQuirksExternalSyntheticLambda0);
                component5 component5VarOnExtraCallback2 = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), onwarmupcompletedIAuthTabCallbackDefault2, cameraCaptureResultEmptyCameraCaptureResult, 48);
                int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback2);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult22 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback3 = onextracallbackwithresult22.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnExtraCallback2, onextracallbackwithresult22.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult22.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult22.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult22.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult22.onTransact());
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.onNavigationEvent;
                if (getbacktracenote != null) {
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i152 = onNavigationEvent + 87;
                onWarmupCompleted = i152 % 128;
                int i162 = i152 % 2;
                cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(Boolean.valueOf(StringsKt.isBlank(selectparentresolutions.onNavigationEvent())), cameraCaptureResultEmptyCameraCaptureResult, 0);
                QuirkSettingsLoader quirkSettingsLoaderAsInterface2 = onextracallbackwithresult3.asInterface();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent22 = RowScope.onNavigationEvent(rowScopeInstance2, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback2, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null), 1.0f, false, 2, (Object) null);
                component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderAsInterface2, false);
                int iHashCode22 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject22 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted22 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent22);
                Function0 function0IAuthTabCallback22 = onextracallbackwithresult22.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, component5VarOnWarmupCompleted2, onextracallbackwithresult22.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject22, onextracallbackwithresult22.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, Integer.valueOf(iHashCode22), onextracallbackwithresult22.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, onextracallbackwithresult22.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, quirksExternalSyntheticBackport0OnWarmupCompleted22, onextracallbackwithresult22.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda12 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                if (function22 != null) {
                }
                function23.invoke(cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i112 & 14));
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback) == z) {
                }
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a6 A[PHI: r0
      0x00a6: PHI (r0v12 java.lang.Integer) = (r0v3 int), (r0v14 int) binds: [B:8:0x00a2, B:5:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a4 A[PHI: r0
      0x00a4: PHI (r0v4 java.lang.Integer) = (r0v3 int), (r0v14 int) binds: [B:8:0x00a2, B:5:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i;
        boolean z;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        final long jLongValue = ((Number) objArr[1]).longValue();
        final float fFloatValue = ((Number) objArr[2]).floatValue();
        QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted = (QuirkSettingsLoader.onWarmupCompleted) objArr[3];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[4];
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[5];
        final selectParentResolutions selectparentresolutions = (selectParentResolutions) objArr[6];
        Function1 function1 = (Function1) objArr[7];
        boolean zBooleanValue = ((Boolean) objArr[8]).booleanValue();
        CameraUnavailableException cameraUnavailableException = (CameraUnavailableException) objArr[9];
        CameraState cameraState = (CameraState) objArr[10];
        getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[11];
        final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02 = (DeviceQuirksExternalSyntheticLambda0) objArr[12];
        final getBacktraceNote getbacktracenote3 = (getBacktraceNote) objArr[13];
        final Function2 function2 = (Function2) objArr[14];
        final Function2 function22 = (Function2) objArr[15];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[16];
        int iIntValue = ((Number) objArr[17]).intValue();
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 33;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            i = 73;
            z = (iIntValue & 4) != 3;
        } else {
            i = 6;
            if ((iIntValue & 3) != 2) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1993029379, iIntValue, -1, "im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1.<anonymous>.<anonymous> (TdsSearchFieldV1.kt:161)");
            }
            boolean zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(jLongValue);
            boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(fFloatValue);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((zOnWarmupCompleted | zIAuthTabCallback) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1Kt$$ExternalSyntheticLambda3
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        int i4 = 2 % 2;
                        int i5 = onNavigationEvent + 77;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        long j = jLongValue;
                        float f = fFloatValue;
                        Long lValueOf = Long.valueOf(j);
                        Float fValueOf = Float.valueOf(f);
                        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
                        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
                        removeObserverLocked removeobserverlocked = (removeObserverLocked) x2ExternalSyntheticLambda14.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1743694746, -1743694743, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{lValueOf, fValueOf, (SessionProcessorCaptureCallback) obj}, TTVideoLandingPageActivity.onExtraCallbackWithResult());
                        int i7 = onNavigationEvent + 63;
                        IAuthTabCallback = i7 % 128;
                        int i8 = i7 % 2;
                        return removeobserverlocked;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = submit.onExtraCallbackWithResult(SessionProcessorSurface.IAuthTabCallback(quirksExternalSyntheticBackport0, (Function1) objOnMinimized), 1.0f);
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
            Object obj = null;
            if (getbacktracenote == null) {
                int i4 = onWarmupCompleted + 7;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1049696850);
                if (i5 == 0) {
                    obj.hashCode();
                    throw null;
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-310955853);
                getbacktracenote.invoke(rowScopeInstance, cameraCaptureResultEmptyCameraCaptureResult, i);
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            onCamerasRemoved.onNavigationEvent(selectparentresolutions, function1, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(RowScope.onNavigationEvent(rowScopeInstance, rowScopeInstance.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), QuirkSettingsLoader.Companion.IAuthTabCallbackDefault()), 1.0f, false, 2, (Object) null), deviceQuirksExternalSyntheticLambda0), zBooleanValue, false, (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted()), cameraUnavailableException, cameraState, true, 1, 0, AppLovinVastMediaViewfExternalSyntheticLambda0.onExtraCallback(null, cameraCaptureResultEmptyCameraCaptureResult, 0, 1), (Function1) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, new createString(x2ExternalSyntheticLambda12.onExtraCallbackWithResult.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, 6), (DefaultConstructorMarker) null), ForwardingCameraControl.onExtraCallback(1119519012, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1Kt$$ExternalSyntheticLambda4
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i6 = 2 % 2;
                    int i7 = IAuthTabCallback + 121;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    Object obj5 = null;
                    DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda02;
                    getBacktraceNote getbacktracenote4 = getbacktracenote3;
                    selectParentResolutions selectparentresolutions2 = selectparentresolutions;
                    Function2 function23 = function2;
                    Function2 function24 = function22;
                    Function2 function25 = (Function2) obj2;
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj3;
                    int iIntValue2 = ((Integer) obj4).intValue();
                    if (i8 != 0) {
                        x2ExternalSyntheticLambda14.IAuthTabCallback(deviceQuirksExternalSyntheticLambda03, getbacktracenote4, selectparentresolutions2, function23, function24, function25, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue2);
                        throw null;
                    }
                    Unit unitIAuthTabCallback = x2ExternalSyntheticLambda14.IAuthTabCallback(deviceQuirksExternalSyntheticLambda03, getbacktracenote4, selectparentresolutions2, function23, function24, function25, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue2);
                    int i9 = IAuthTabCallback + 73;
                    onNavigationEvent = i9 % 128;
                    if (i9 % 2 == 0) {
                        return unitIAuthTabCallback;
                    }
                    obj5.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 905969664, 196608, 13328);
            if (getbacktracenote2 == null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1046762514);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-310861197);
                getbacktracenote2.invoke(rowScopeInstance, cameraCaptureResultEmptyCameraCaptureResult, i);
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            int i6 = onWarmupCompleted + 79;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final long j, final float f, final QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, final getBacktraceNote getbacktracenote, final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, final selectParentResolutions selectparentresolutions, final Function1 function1, final boolean z, final CameraUnavailableException cameraUnavailableException, final CameraState cameraState, final getBacktraceNote getbacktracenote2, final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02, final getBacktraceNote getbacktracenote3, final Function2 function2, final Function2 function22, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z2;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onWarmupCompleted + 5;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1)) {
            int i5 = onWarmupCompleted + 115;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 34 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1172148803, i, -1, "im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1.<anonymous> (TdsSearchFieldV1.kt:151)");
                }
                accessisMonitoringp accessismonitoringpOnExtraCallback = getLocation.onExtraCallback();
                x2ExternalSyntheticLambda12 x2externalsyntheticlambda12 = x2ExternalSyntheticLambda12.onExtraCallbackWithResult;
                setPostviewFormatSelector.onExtraCallback(new accessgetCameraFactoryp[]{accessismonitoringpOnExtraCallback.onExtraCallback(new ImageCaptureImageCaptureError(x2externalsyntheticlambda12.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, 6), setByteOrder.onExtraCallbackWithResult(x2externalsyntheticlambda12.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, (Object) null), (DefaultConstructorMarker) null)), PreviewExternalSyntheticLambda3.onWarmupCompleted().onExtraCallback(getHumanReadableName.onNavigationEvent(AppLovinPostbackService.onExtraCallbackWithResult.getInterfaceDescriptor(), x2externalsyntheticlambda12.asBinder(cameraCaptureResultEmptyCameraCaptureResult, 6), 0L, GraphicDeviceInfo.Companion.onNavigationEvent(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (Object) null))}, ForwardingCameraControl.onExtraCallback(1993029379, true, new Function2() { // from class: im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1Kt$$ExternalSyntheticLambda1
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i7 = 2 % 2;
                        int i8 = onExtraCallbackWithResult + 85;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                        Unit unitOnNavigationEvent = x2ExternalSyntheticLambda14.onNavigationEvent(quirksExternalSyntheticBackport0, j, f, onwarmupcompleted, getbacktracenote, deviceQuirksExternalSyntheticLambda0, selectparentresolutions, function1, z, cameraUnavailableException, cameraState, getbacktracenote2, deviceQuirksExternalSyntheticLambda02, getbacktracenote3, function2, function22, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i10 = onNavigationEvent + 81;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % 2;
                        return unitOnNavigationEvent;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i7 = onNavigationEvent + 33;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i9 = onWarmupCompleted + 67;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                accessisMonitoringp accessismonitoringpOnExtraCallback2 = getLocation.onExtraCallback();
                x2ExternalSyntheticLambda12 x2externalsyntheticlambda122 = x2ExternalSyntheticLambda12.onExtraCallbackWithResult;
                setPostviewFormatSelector.onExtraCallback(new accessgetCameraFactoryp[]{accessismonitoringpOnExtraCallback2.onExtraCallback(new ImageCaptureImageCaptureError(x2externalsyntheticlambda122.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, 6), setByteOrder.onExtraCallbackWithResult(x2externalsyntheticlambda122.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, (Object) null), (DefaultConstructorMarker) null)), PreviewExternalSyntheticLambda3.onWarmupCompleted().onExtraCallback(getHumanReadableName.onNavigationEvent(AppLovinPostbackService.onExtraCallbackWithResult.getInterfaceDescriptor(), x2externalsyntheticlambda122.asBinder(cameraCaptureResultEmptyCameraCaptureResult, 6), 0L, GraphicDeviceInfo.Companion.onNavigationEvent(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (Object) null))}, ForwardingCameraControl.onExtraCallback(1993029379, true, new Function2() { // from class: im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1Kt$$ExternalSyntheticLambda1
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i72 = 2 % 2;
                        int i82 = onExtraCallbackWithResult + 85;
                        onNavigationEvent = i82 % 128;
                        int i92 = i82 % 2;
                        Unit unitOnNavigationEvent = x2ExternalSyntheticLambda14.onNavigationEvent(quirksExternalSyntheticBackport0, j, f, onwarmupcompleted, getbacktracenote, deviceQuirksExternalSyntheticLambda0, selectparentresolutions, function1, z, cameraUnavailableException, cameraState, getbacktracenote2, deviceQuirksExternalSyntheticLambda02, getbacktracenote3, function2, function22, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i102 = onNavigationEvent + 81;
                        onExtraCallbackWithResult = i102 % 128;
                        int i11 = i102 % 2;
                        return unitOnNavigationEvent;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:263:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@NotNull final selectParentResolutions selectparentresolutions, @NotNull final Function1<? super selectParentResolutions, Unit> function1, @NotNull final Function0<Unit> function0, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02, long j, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function22, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3, @Nullable CameraUnavailableException cameraUnavailableException, @Nullable CameraState cameraState, @Nullable QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, float f, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2, final int i3) {
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
        boolean z2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final boolean z3;
        final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda03;
        final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda04;
        final long j2;
        final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4;
        final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote5;
        final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function23;
        final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function24;
        final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote6;
        final CameraUnavailableException cameraUnavailableException2;
        final CameraState cameraState2;
        final QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted2;
        final float f2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda05;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        long jOnExtraCallback;
        QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedIAuthTabCallbackDefault;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote7;
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote8;
        Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function25;
        boolean z4;
        Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function26;
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote9;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda06;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda07;
        QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted3;
        float f3;
        CameraUnavailableException cameraUnavailableException3;
        CameraState cameraState3;
        int i21;
        int i22 = 2 % 2;
        Intrinsics.checkNotNullParameter(selectparentresolutions, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1038281432);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(selectparentresolutions)) {
                int i23 = onWarmupCompleted + 43;
                onNavigationEvent = i23 % 128;
                int i24 = i23 % 2;
                i21 = 4;
            } else {
                i21 = 2;
            }
            i4 = i21 | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 256 : 128;
        }
        int i25 = i3 & 8;
        if (i25 != 0) {
            i4 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            int i26 = 16384;
            if (i5 == 0) {
                i4 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    int i27 = onNavigationEvent + 119;
                    onWarmupCompleted = i27 % 128;
                    int i28 = i27 % 2;
                    i4 |= 196608;
                } else {
                    if ((i & 196608) == 0) {
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 131072 : 65536;
                    }
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda02) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        i4 |= ((i3 & 128) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j)) ? 8388608 : 4194304;
                    }
                    i8 = i3 & 256;
                    if (i8 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 67108864 : 33554432;
                    }
                    i9 = i3 & 512;
                    Object obj = null;
                    if (i9 == 0) {
                        int i29 = onWarmupCompleted + 55;
                        onNavigationEvent = i29 % 128;
                        if (i29 % 2 == 0) {
                            throw null;
                        }
                        i4 |= 805306368;
                    } else {
                        if ((805306368 & i) == 0) {
                            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote2) ? 536870912 : 268435456;
                        }
                        i10 = i3 & 1024;
                        if (i10 != 0) {
                            int i30 = onNavigationEvent + 71;
                            onWarmupCompleted = i30 % 128;
                            int i31 = i30 % 2;
                            i11 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i11 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 4 : 2) | i2;
                        } else {
                            i11 = i2;
                        }
                        i12 = i3 & 2048;
                        if (i12 != 0) {
                            i11 |= 48;
                        } else if ((i2 & 48) == 0) {
                            i11 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function22) ? 32 : 16;
                        }
                        i13 = i3 & 4096;
                        if (i13 != 0) {
                            i11 |= 384;
                        } else {
                            if ((i2 & 384) == 0) {
                                i11 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote3) ? 256 : 128;
                            }
                            i14 = i3 & 8192;
                            if (i14 == 0) {
                                i11 |= 3072;
                                i15 = i14;
                            } else {
                                i15 = i14;
                                if ((i2 & 3072) == 0) {
                                    i11 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraUnavailableException) ? 2048 : 1024;
                                }
                                i16 = i3 & 16384;
                                if (i16 != 0) {
                                    i11 |= 24576;
                                    i18 = i13;
                                    i17 = i16;
                                } else {
                                    i17 = i16;
                                    if ((i2 & 24576) == 0) {
                                        int i32 = onNavigationEvent + 115;
                                        i18 = i13;
                                        onWarmupCompleted = i32 % 128;
                                        if (i32 % 2 != 0) {
                                            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraState)) {
                                                i26 = 22906;
                                            }
                                        } else if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraState)) {
                                            i26 = 8192;
                                        }
                                        i11 |= i26;
                                    } else {
                                        i18 = i13;
                                    }
                                }
                                i19 = 32768 & i3;
                                if (i19 != 0) {
                                    i11 |= 196608;
                                } else {
                                    if ((i2 & 196608) == 0) {
                                        i11 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onwarmupcompleted) ? 131072 : 65536;
                                    }
                                    i20 = i3 & 65536;
                                    if (i20 != 0) {
                                        if ((i2 & 1572864) == 0) {
                                            i11 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 1048576 : 524288;
                                        }
                                        if ((i4 & 306783379) == 306783378 && (599187 & i11) == 599186) {
                                            int i33 = onNavigationEvent + 81;
                                            onWarmupCompleted = i33 % 128;
                                            int i34 = i33 % 2;
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i4 & 1)) {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                            if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = i25 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                                final boolean z5 = i5 != 0 ? true : z;
                                                if (i6 != 0) {
                                                    int i35 = onNavigationEvent + 111;
                                                    onWarmupCompleted = i35 % 128;
                                                    int i36 = i35 % 2;
                                                    deviceQuirksExternalSyntheticLambda05 = onExtraCallback;
                                                } else {
                                                    deviceQuirksExternalSyntheticLambda05 = deviceQuirksExternalSyntheticLambda0;
                                                }
                                                DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda08 = i7 != 0 ? IAuthTabCallback : deviceQuirksExternalSyntheticLambda02;
                                                if ((i3 & 128) != 0) {
                                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                                                    jOnExtraCallback = x2ExternalSyntheticLambda12.onExtraCallbackWithResult.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                                    i4 &= -29360129;
                                                } else {
                                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                                                    jOnExtraCallback = j;
                                                }
                                                getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote10 = i8 != 0 ? null : getbacktracenote;
                                                getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenoteOnExtraCallback = i9 != 0 ? x2ExternalSyntheticLambda16.IAuthTabCallback.onExtraCallback() : getbacktracenote2;
                                                Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function27 = i10 != 0 ? null : function2;
                                                Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2OnExtraCallback = i12 != 0 ? ForwardingCameraControl.onExtraCallback(-1451221287, true, new Function2() { // from class: im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1Kt$$ExternalSyntheticLambda6
                                                    private static int onExtraCallbackWithResult = 0;
                                                    private static int onWarmupCompleted = 1;

                                                    public final Object invoke(Object obj2, Object obj3) {
                                                        Unit unitOnExtraCallback;
                                                        int i37 = 2 % 2;
                                                        int i38 = onWarmupCompleted + 119;
                                                        onExtraCallbackWithResult = i38 % 128;
                                                        if (i38 % 2 != 0) {
                                                            unitOnExtraCallback = x2ExternalSyntheticLambda14.onExtraCallback(z5, function0, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                                            int i39 = 32 / 0;
                                                        } else {
                                                            unitOnExtraCallback = x2ExternalSyntheticLambda14.onExtraCallback(z5, function0, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                                        }
                                                        int i40 = onExtraCallbackWithResult + 103;
                                                        onWarmupCompleted = i40 % 128;
                                                        int i41 = i40 % 2;
                                                        return unitOnExtraCallback;
                                                    }
                                                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54) : function22;
                                                getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote11 = i18 != 0 ? null : getbacktracenote3;
                                                CameraUnavailableException cameraUnavailableExceptionOnExtraCallback = i15 != 0 ? x2ExternalSyntheticLambda12.onExtraCallbackWithResult.onExtraCallback() : cameraUnavailableException;
                                                CameraState cameraStateOnNavigationEvent = i17 != 0 ? x2ExternalSyntheticLambda12.onExtraCallbackWithResult.onNavigationEvent() : cameraState;
                                                if (i19 != 0) {
                                                    int i37 = onWarmupCompleted + 83;
                                                    onNavigationEvent = i37 % 128;
                                                    if (i37 % 2 == 0) {
                                                        QuirkSettingsLoader.Companion.IAuthTabCallbackDefault();
                                                        throw null;
                                                    }
                                                    onwarmupcompletedIAuthTabCallbackDefault = QuirkSettingsLoader.Companion.IAuthTabCallbackDefault();
                                                } else {
                                                    onwarmupcompletedIAuthTabCallbackDefault = onwarmupcompleted;
                                                }
                                                float f4 = i20 != 0 ? onExtraCallbackWithResult : f;
                                                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                                getbacktracenote7 = getbacktracenote10;
                                                getbacktracenote8 = getbacktracenoteOnExtraCallback;
                                                function25 = function27;
                                                z4 = z5;
                                                function26 = function2OnExtraCallback;
                                                getbacktracenote9 = getbacktracenote11;
                                                deviceQuirksExternalSyntheticLambda06 = deviceQuirksExternalSyntheticLambda08;
                                                deviceQuirksExternalSyntheticLambda07 = deviceQuirksExternalSyntheticLambda05;
                                                onwarmupcompleted3 = onwarmupcompletedIAuthTabCallbackDefault;
                                                f3 = f4;
                                                cameraUnavailableException3 = cameraUnavailableExceptionOnExtraCallback;
                                                cameraState3 = cameraStateOnNavigationEvent;
                                            } else {
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                                if ((i3 & 128) != 0) {
                                                    i4 &= -29360129;
                                                }
                                                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport0;
                                                z4 = z;
                                                deviceQuirksExternalSyntheticLambda07 = deviceQuirksExternalSyntheticLambda0;
                                                deviceQuirksExternalSyntheticLambda06 = deviceQuirksExternalSyntheticLambda02;
                                                jOnExtraCallback = j;
                                                getbacktracenote7 = getbacktracenote;
                                                getbacktracenote8 = getbacktracenote2;
                                                function25 = function2;
                                                function26 = function22;
                                                getbacktracenote9 = getbacktracenote3;
                                                cameraUnavailableException3 = cameraUnavailableException;
                                                cameraState3 = cameraState;
                                                onwarmupcompleted3 = onwarmupcompleted;
                                                f3 = f;
                                            }
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                int i38 = onWarmupCompleted + 25;
                                                onNavigationEvent = i38 % 128;
                                                int i39 = i38 % 2;
                                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1038281432, i4, i11, "im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1 (TdsSearchFieldV1.kt:147)");
                                            }
                                            InterfaceC0083handshake.onNavigationEvent onnavigationeventOnWarmupCompleted = ConnectionPool.onWarmupCompleted.onWarmupCompleted();
                                            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport04;
                                            final long j3 = jOnExtraCallback;
                                            final float f5 = f3;
                                            final QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted4 = onwarmupcompleted3;
                                            final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote12 = getbacktracenote7;
                                            final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda09 = deviceQuirksExternalSyntheticLambda07;
                                            final boolean z6 = z4;
                                            final CameraUnavailableException cameraUnavailableException4 = cameraUnavailableException3;
                                            final CameraState cameraState4 = cameraState3;
                                            final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote13 = getbacktracenote9;
                                            final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda010 = deviceQuirksExternalSyntheticLambda06;
                                            final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote14 = getbacktracenote8;
                                            final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function28 = function26;
                                            final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function29 = function25;
                                            Function2 function210 = new Function2() { // from class: im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1Kt$$ExternalSyntheticLambda7
                                                private static int onExtraCallbackWithResult = 0;
                                                private static int onNavigationEvent = 1;

                                                public final Object invoke(Object obj2, Object obj3) {
                                                    int i40 = 2 % 2;
                                                    int i41 = onExtraCallbackWithResult + 83;
                                                    onNavigationEvent = i41 % 128;
                                                    int i42 = i41 % 2;
                                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport07 = quirksExternalSyntheticBackport06;
                                                    long j4 = j3;
                                                    float f6 = f5;
                                                    QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted5 = onwarmupcompleted4;
                                                    getBacktraceNote getbacktracenote15 = getbacktracenote12;
                                                    DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda011 = deviceQuirksExternalSyntheticLambda09;
                                                    selectParentResolutions selectparentresolutions2 = selectparentresolutions;
                                                    Function1 function12 = function1;
                                                    boolean z7 = z6;
                                                    int iIntValue = ((Integer) obj3).intValue();
                                                    Object[] objArr = {quirksExternalSyntheticBackport07, Long.valueOf(j4), Float.valueOf(f6), onwarmupcompleted5, getbacktracenote15, deviceQuirksExternalSyntheticLambda011, selectparentresolutions2, function12, Boolean.valueOf(z7), cameraUnavailableException4, cameraState4, getbacktracenote13, deviceQuirksExternalSyntheticLambda010, getbacktracenote14, function28, function29, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)};
                                                    int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
                                                    Unit unit = (Unit) x2ExternalSyntheticLambda14.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1148254401, 1148254406, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, TTVideoLandingPageActivity.onExtraCallbackWithResult());
                                                    int i43 = onNavigationEvent + 59;
                                                    onExtraCallbackWithResult = i43 % 128;
                                                    if (i43 % 2 == 0) {
                                                        return unit;
                                                    }
                                                    Object obj4 = null;
                                                    obj4.hashCode();
                                                    throw null;
                                                }
                                            };
                                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                            dispatchPostbackRequest.onNavigationEvent(0.0f, null, 0, onnavigationeventOnWarmupCompleted, null, ForwardingCameraControl.onExtraCallback(1172148803, true, function210, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 196608, 23);
                                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                int i40 = onWarmupCompleted + 77;
                                                onNavigationEvent = i40 % 128;
                                                if (i40 % 2 == 0) {
                                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                                    obj.hashCode();
                                                    throw null;
                                                }
                                                CameraConfigExternalSyntheticLambda0.onTransact();
                                            }
                                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                                            z3 = z4;
                                            deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda07;
                                            deviceQuirksExternalSyntheticLambda04 = deviceQuirksExternalSyntheticLambda06;
                                            j2 = jOnExtraCallback;
                                            getbacktracenote4 = getbacktracenote7;
                                            getbacktracenote5 = getbacktracenote8;
                                            function23 = function25;
                                            function24 = function26;
                                            getbacktracenote6 = getbacktracenote9;
                                            cameraUnavailableException2 = cameraUnavailableException3;
                                            cameraState2 = cameraState3;
                                            onwarmupcompleted2 = onwarmupcompleted3;
                                            f2 = f3;
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                            z3 = z;
                                            deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda0;
                                            deviceQuirksExternalSyntheticLambda04 = deviceQuirksExternalSyntheticLambda02;
                                            j2 = j;
                                            getbacktracenote4 = getbacktracenote;
                                            getbacktracenote5 = getbacktracenote2;
                                            function23 = function2;
                                            function24 = function22;
                                            getbacktracenote6 = getbacktracenote3;
                                            cameraUnavailableException2 = cameraUnavailableException;
                                            cameraState2 = cameraState;
                                            onwarmupcompleted2 = onwarmupcompleted;
                                            f2 = f;
                                        }
                                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1Kt$$ExternalSyntheticLambda8
                                                private static int IAuthTabCallback = 0;
                                                private static int onWarmupCompleted = 1;

                                                public final Object invoke(Object obj2, Object obj3) {
                                                    int i41 = 2 % 2;
                                                    int i42 = IAuthTabCallback + 121;
                                                    onWarmupCompleted = i42 % 128;
                                                    int i43 = i42 % 2;
                                                    Unit unitOnWarmupCompleted = x2ExternalSyntheticLambda14.onWarmupCompleted(selectparentresolutions, function1, function0, quirksExternalSyntheticBackport02, z3, deviceQuirksExternalSyntheticLambda03, deviceQuirksExternalSyntheticLambda04, j2, getbacktracenote4, getbacktracenote5, function23, function24, getbacktracenote6, cameraUnavailableException2, cameraState2, onwarmupcompleted2, f2, i, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                                    int i44 = onWarmupCompleted + 15;
                                                    IAuthTabCallback = i44 % 128;
                                                    if (i44 % 2 == 0) {
                                                        return unitOnWarmupCompleted;
                                                    }
                                                    throw null;
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    i11 |= 1572864;
                                    if ((i4 & 306783379) == 306783378) {
                                        z2 = true;
                                    }
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i4 & 1)) {
                                    }
                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                    }
                                }
                                i20 = i3 & 65536;
                                if (i20 != 0) {
                                }
                                if ((i4 & 306783379) == 306783378) {
                                }
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i4 & 1)) {
                                }
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                }
                            }
                            i16 = i3 & 16384;
                            if (i16 != 0) {
                            }
                            i19 = 32768 & i3;
                            if (i19 != 0) {
                            }
                            i20 = i3 & 65536;
                            if (i20 != 0) {
                            }
                            if ((i4 & 306783379) == 306783378) {
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i4 & 1)) {
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            }
                        }
                        i14 = i3 & 8192;
                        if (i14 == 0) {
                        }
                        i16 = i3 & 16384;
                        if (i16 != 0) {
                        }
                        i19 = 32768 & i3;
                        if (i19 != 0) {
                        }
                        i20 = i3 & 65536;
                        if (i20 != 0) {
                        }
                        if ((i4 & 306783379) == 306783378) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i4 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        }
                    }
                    i10 = i3 & 1024;
                    if (i10 != 0) {
                    }
                    i12 = i3 & 2048;
                    if (i12 != 0) {
                    }
                    i13 = i3 & 4096;
                    if (i13 != 0) {
                    }
                    i14 = i3 & 8192;
                    if (i14 == 0) {
                    }
                    i16 = i3 & 16384;
                    if (i16 != 0) {
                    }
                    i19 = 32768 & i3;
                    if (i19 != 0) {
                    }
                    i20 = i3 & 65536;
                    if (i20 != 0) {
                    }
                    if ((i4 & 306783379) == 306783378) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i4 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i8 = i3 & 256;
                if (i8 == 0) {
                }
                i9 = i3 & 512;
                Object obj2 = null;
                if (i9 == 0) {
                }
                i10 = i3 & 1024;
                if (i10 != 0) {
                }
                i12 = i3 & 2048;
                if (i12 != 0) {
                }
                i13 = i3 & 4096;
                if (i13 != 0) {
                }
                i14 = i3 & 8192;
                if (i14 == 0) {
                }
                i16 = i3 & 16384;
                if (i16 != 0) {
                }
                i19 = 32768 & i3;
                if (i19 != 0) {
                }
                i20 = i3 & 65536;
                if (i20 != 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i4 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i8 = i3 & 256;
            if (i8 == 0) {
            }
            i9 = i3 & 512;
            Object obj22 = null;
            if (i9 == 0) {
            }
            i10 = i3 & 1024;
            if (i10 != 0) {
            }
            i12 = i3 & 2048;
            if (i12 != 0) {
            }
            i13 = i3 & 4096;
            if (i13 != 0) {
            }
            i14 = i3 & 8192;
            if (i14 == 0) {
            }
            i16 = i3 & 16384;
            if (i16 != 0) {
            }
            i19 = 32768 & i3;
            if (i19 != 0) {
            }
            i20 = i3 & 65536;
            if (i20 != 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i4 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        i5 = i3 & 16;
        int i262 = 16384;
        if (i5 == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i3 & 512;
        Object obj222 = null;
        if (i9 == 0) {
        }
        i10 = i3 & 1024;
        if (i10 != 0) {
        }
        i12 = i3 & 2048;
        if (i12 != 0) {
        }
        i13 = i3 & 4096;
        if (i13 != 0) {
        }
        i14 = i3 & 8192;
        if (i14 == 0) {
        }
        i16 = i3 & 16384;
        if (i16 != 0) {
        }
        i19 = 32768 & i3;
        if (i19 != 0) {
        }
        i20 = i3 & 65536;
        if (i20 != 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final void IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-75313270);
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            int i3 = onNavigationEvent + 101;
            onWarmupCompleted = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onWarmupCompleted + 69;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-75313270, i, -1, "im.toss.tds.compose.component.compound.searchfield.Preview (TdsSearchFieldV1.kt:261)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-75313270, i, -1, "im.toss.tds.compose.component.compound.searchfield.Preview (TdsSearchFieldV1.kt:261)");
                int i5 = onWarmupCompleted + 23;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) x2ExternalSyntheticLambda16.IAuthTabCallback.onNavigationEvent(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsSearchFieldV1Kt$.ExternalSyntheticLambda2(i));
        }
    }

    private static final void onNavigationEvent(getSupportedHighSpeedResolutionsFor<selectParentResolutions> getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(selectparentresolutions);
        int i4 = onWarmupCompleted + 91;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
    }

    private static final String onExtraCallback(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(str);
        if (i3 == 0) {
            int i4 = 52 / 0;
        }
        int i5 = onWarmupCompleted + 115;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static final boolean onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).booleanValue();
        int i4 = onNavigationEvent + 101;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return zBooleanValue;
    }

    static {
        int i = onTransact + 35;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, float f, QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, getBacktraceNote getbacktracenote, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, selectParentResolutions selectparentresolutions, Function1 function1, boolean z, CameraUnavailableException cameraUnavailableException, CameraState cameraState, getBacktraceNote getbacktracenote2, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02, getBacktraceNote getbacktracenote3, Function2 function2, Function2 function22, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {quirksExternalSyntheticBackport0, Long.valueOf(j), Float.valueOf(f), onwarmupcompleted, getbacktracenote, deviceQuirksExternalSyntheticLambda0, selectparentresolutions, function1, Boolean.valueOf(z), cameraUnavailableException, cameraState, getbacktracenote2, deviceQuirksExternalSyntheticLambda02, getbacktracenote3, function2, function22, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1148254401, 1148254406, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, TTVideoLandingPageActivity.onExtraCallbackWithResult());
    }

    public static /* synthetic */ removeObserverLocked onExtraCallbackWithResult(long j, float f, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        Object[] objArr = {Long.valueOf(j), Float.valueOf(f), sessionProcessorCaptureCallback};
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (removeObserverLocked) onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1743694746, -1743694743, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, TTVideoLandingPageActivity.onExtraCallbackWithResult());
    }

    private static final selectParentResolutions IAuthTabCallback(getSupportedHighSpeedResolutionsFor<selectParentResolutions> getsupportedhighspeedresolutionsfor) {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (selectParentResolutions) onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1662001050, -1662001048, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{getsupportedhighspeedresolutionsfor}, TTVideoLandingPageActivity.onExtraCallbackWithResult());
    }

    private static final Unit onWarmupCompleted(String str, Function1 function1, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02, long j, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, Function2 function2, Function2 function22, getBacktraceNote getbacktracenote3, CameraUnavailableException cameraUnavailableException, CameraState cameraState, float f, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        Object[] objArr = {str, function1, function0, quirksExternalSyntheticBackport0, Boolean.valueOf(z), deviceQuirksExternalSyntheticLambda0, deviceQuirksExternalSyntheticLambda02, Long.valueOf(j), getbacktracenote, getbacktracenote2, function2, function22, getbacktracenote3, cameraUnavailableException, cameraState, Float.valueOf(f), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1884446177, 1884446177, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, TTVideoLandingPageActivity.onExtraCallbackWithResult());
    }

    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, float f, QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, getBacktraceNote getbacktracenote, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, selectParentResolutions selectparentresolutions, Function1 function1, boolean z, CameraUnavailableException cameraUnavailableException, CameraState cameraState, getBacktraceNote getbacktracenote2, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02, getBacktraceNote getbacktracenote3, Function2 function2, Function2 function22, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {quirksExternalSyntheticBackport0, Long.valueOf(j), Float.valueOf(f), onwarmupcompleted, getbacktracenote, deviceQuirksExternalSyntheticLambda0, selectparentresolutions, function1, Boolean.valueOf(z), cameraUnavailableException, cameraState, getbacktracenote2, deviceQuirksExternalSyntheticLambda02, getbacktracenote3, function2, function22, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1183341718, 1183341722, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, TTVideoLandingPageActivity.onExtraCallbackWithResult());
    }

    private static final Unit onNavigationEvent(long j, readFully readfully, long j2, long j3, setIso setiso) {
        Object[] objArr = {Long.valueOf(j), readfully, Long.valueOf(j2), Long.valueOf(j3), setiso};
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1694179069, 1694179070, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, TTVideoLandingPageActivity.onExtraCallbackWithResult());
    }
}
