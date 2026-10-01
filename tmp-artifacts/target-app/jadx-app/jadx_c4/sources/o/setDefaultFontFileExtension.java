package o;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.tmoney.LiveCheckConstants;
import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0;
import im.toss.compose.v3.textfield.TextFieldsKt$;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda4;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraState;
import o.CameraUnavailableException;
import o.QuirksExternalSyntheticBackport0;
import o.SpannedDataExternalSyntheticLambda0;
import o.SurfaceProcessorNodeOut;
import o.UseCaseAttachState;
import o.getBacktraceNote;
import o.getMergedResolutions;
import o.getStreamSharingChildren;
import o.initSDK;
import o.selectParentResolutions;
import o.setAnimationFromUrl;
import o.setCacheComposition;
import o.setDefaultFontFileExtension;
import o.setOrientationDegrees;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setDefaultFontFileExtension {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int onTransact = 1;
    private static final int onExtraCallback = createCameraCaptureCallback.Companion.onTransact();
    private static final CameraUnavailableException onExtraCallbackWithResult = CameraUnavailableException.Companion.onExtraCallbackWithResult();
    private static final CameraState IAuthTabCallback = CameraState.Companion.IAuthTabCallback();
    private static final setCacheComposition.onExtraCallbackWithResult onNavigationEvent = setCacheComposition.onExtraCallbackWithResult.APPEAR;
    private static final setCacheComposition.onWarmupCompleted onWarmupCompleted = setCacheComposition.onWarmupCompleted.APPEAR;

    public static /* synthetic */ Unit IAuthTabCallback(float f, Function0 function0, Function0 function02, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 59;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(f, function0, function02, setorientationdegrees);
        int i4 = IAuthTabCallbackDefault + 97;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 47;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallbackStub + 37;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(String str, Function1 function1, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, setCacheComposition.onExtraCallback onextracallback, Function0 function0, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, boolean z, getBacktraceNote getbacktracenote3, getBacktraceNote getbacktracenote4, getBacktraceNote getbacktracenote5, getBacktraceNote getbacktracenote6, setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault, getMergedResolutions getmergedresolutions, setCacheComposition.onWarmupCompleted onwarmupcompleted, setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult, CameraUnavailableException cameraUnavailableException, CameraState cameraState, boolean z2, boolean z3, boolean z4, int i, int i2, setCacheComposition.IAuthTabCallback iAuthTabCallback, Function1 function12, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, int i3, int i4, int i5, int i6, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i7) {
        int i8 = 2 % 2;
        int i9 = IAuthTabCallbackDefault + 25;
        IAuthTabCallbackStub = i9 % 128;
        int i10 = i9 % 2;
        onWarmupCompleted(str, (Function1<? super String, Unit>) function1, iAuthTabCallbackStub, quirksExternalSyntheticBackport0, onextracallback, (Function0<Unit>) function0, (getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote, (getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote2, z, (getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote3, (getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote4, (getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote5, (getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote6, iAuthTabCallbackDefault, getmergedresolutions, onwarmupcompleted, onextracallbackwithresult, cameraUnavailableException, cameraState, z2, z3, z4, i, i2, iAuthTabCallback, (Function1<? super SurfaceProcessorNodeOut, Unit>) function12, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i3 | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i4), RecomposeScopeImplKt.onExtraCallbackWithResult(i5), i6);
        Unit unit = Unit.INSTANCE;
        int i11 = IAuthTabCallbackDefault + 121;
        IAuthTabCallbackStub = i11 % 128;
        int i12 = i11 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(selectParentResolutions selectparentresolutions, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 55;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        Unit unit = (Unit) onWarmupCompleted(-630215645, 630215655, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, new Object[]{selectparentresolutions, getsupportedhighspeedresolutionsfor});
        int i4 = IAuthTabCallbackDefault + 111;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        float fFloatValue = ((Number) objArr[0]).floatValue();
        long jLongValue = ((Number) objArr[1]).longValue();
        setOrientationDegrees setorientationdegrees = (setOrientationDegrees) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 53;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(fFloatValue, jLongValue, setorientationdegrees);
        }
        onNavigationEvent(fFloatValue, jLongValue, setorientationdegrees);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        selectParentResolutions selectparentresolutions = (selectParentResolutions) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub = (setCacheComposition.IAuthTabCallbackStub) objArr[2];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[3];
        setCacheComposition.onExtraCallback onextracallback = (setCacheComposition.onExtraCallback) objArr[4];
        Function0 function0 = (Function0) objArr[5];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[6];
        getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[7];
        boolean zBooleanValue = ((Boolean) objArr[8]).booleanValue();
        getBacktraceNote getbacktracenote3 = (getBacktraceNote) objArr[9];
        getBacktraceNote getbacktracenote4 = (getBacktraceNote) objArr[10];
        getBacktraceNote getbacktracenote5 = (getBacktraceNote) objArr[11];
        getBacktraceNote getbacktracenote6 = (getBacktraceNote) objArr[12];
        setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault = (setCacheComposition.IAuthTabCallbackDefault) objArr[13];
        getMergedResolutions getmergedresolutions = (getMergedResolutions) objArr[14];
        setCacheComposition.onWarmupCompleted onwarmupcompleted = (setCacheComposition.onWarmupCompleted) objArr[15];
        setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult = (setCacheComposition.onExtraCallbackWithResult) objArr[16];
        CameraUnavailableException cameraUnavailableException = (CameraUnavailableException) objArr[17];
        CameraState cameraState = (CameraState) objArr[18];
        boolean zBooleanValue2 = ((Boolean) objArr[19]).booleanValue();
        boolean zBooleanValue3 = ((Boolean) objArr[20]).booleanValue();
        boolean zBooleanValue4 = ((Boolean) objArr[21]).booleanValue();
        int iIntValue = ((Number) objArr[22]).intValue();
        int iIntValue2 = ((Number) objArr[23]).intValue();
        setCacheComposition.IAuthTabCallback iAuthTabCallback = (setCacheComposition.IAuthTabCallback) objArr[24];
        Function1 function12 = (Function1) objArr[25];
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objArr[26];
        int iIntValue3 = ((Number) objArr[27]).intValue();
        int iIntValue4 = ((Number) objArr[28]).intValue();
        int iIntValue5 = ((Number) objArr[29]).intValue();
        int iIntValue6 = ((Number) objArr[30]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[31];
        int iIntValue7 = ((Number) objArr[32]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(selectparentresolutions, function1, iAuthTabCallbackStub, quirksExternalSyntheticBackport0, onextracallback, function0, getbacktracenote, getbacktracenote2, zBooleanValue, getbacktracenote3, getbacktracenote4, getbacktracenote5, getbacktracenote6, iAuthTabCallbackDefault, getmergedresolutions, onwarmupcompleted, onextracallbackwithresult, cameraUnavailableException, cameraState, zBooleanValue2, zBooleanValue3, zBooleanValue4, iIntValue, iIntValue2, iAuthTabCallback, function12, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, cameraCaptureResultEmptyCameraCaptureResult, iIntValue7);
        int i4 = IAuthTabCallbackDefault + 111;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        setCacheComposition.onTransact ontransact = (setCacheComposition.onTransact) onWarmupCompleted(-325134750, 325134756, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, new Object[0]);
        int i4 = IAuthTabCallbackDefault + 117;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return ontransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 25;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return onExtraCallbackWithResult(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onExtraCallbackWithResult(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, getMergedResolutions getmergedresolutions, boolean z, setCacheComposition.onWarmupCompleted onwarmupcompleted, boolean z2, setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault, selectParentResolutions selectparentresolutions, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, setAnimationFromUrl setanimationfromurl, int i, Function0 function0, setCacheComposition.IAuthTabCallback iAuthTabCallback, Function1 function1, int i2, Function1 function12, CameraUnavailableException cameraUnavailableException, CameraState cameraState, setCacheComposition.onExtraCallback onextracallback, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, getBacktraceNote getbacktracenote4, getBacktraceNote getbacktracenote5, getBacktraceNote getbacktracenote6, setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult, initSDK initsdk, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 67;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {camera2CapturePipelineTorchTaskExternalSyntheticLambda2, iAuthTabCallbackStub, getmergedresolutions, Boolean.valueOf(z), onwarmupcompleted, Boolean.valueOf(z2), iAuthTabCallbackDefault, selectparentresolutions, quirksExternalSyntheticBackport0, setanimationfromurl, Integer.valueOf(i), function0, iAuthTabCallback, function1, Integer.valueOf(i2), function12, cameraUnavailableException, cameraState, onextracallback, getbacktracenote, getbacktracenote2, getbacktracenote3, getbacktracenote4, getbacktracenote5, getbacktracenote6, onextracallbackwithresult, initsdk, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        Unit unit = (Unit) onWarmupCompleted(-134574893, 134574895, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, objArr);
        int i7 = IAuthTabCallbackDefault + 7;
        IAuthTabCallbackStub = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 35;
        IAuthTabCallbackStub = i5 % 128;
        IAuthTabCallback(quirksExternalSyntheticBackport0, function2, cameraCaptureResultEmptyCameraCaptureResult, i5 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallback(selectParentResolutions selectparentresolutions, Function1 function1, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, setCacheComposition.onExtraCallback onextracallback, Function0 function0, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, boolean z, getBacktraceNote getbacktracenote3, getBacktraceNote getbacktracenote4, getBacktraceNote getbacktracenote5, getBacktraceNote getbacktracenote6, setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault, setCacheComposition.onWarmupCompleted onwarmupcompleted, setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult, int i, setAnimationFromUrl setanimationfromurl, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 55;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(selectparentresolutions, function1, iAuthTabCallbackStub, onextracallback, function0, getbacktracenote, getbacktracenote2, z, getbacktracenote3, getbacktracenote4, getbacktracenote5, getbacktracenote6, iAuthTabCallbackDefault, onwarmupcompleted, onextracallbackwithresult, i, setanimationfromurl, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, function2, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallbackStub + 31;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 41 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(setCacheComposition.onTransact ontransact, selectParentResolutions selectparentresolutions, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, setAnimationFromUrl setanimationfromurl, setCacheComposition.onNavigationEvent onnavigationevent, int i, Function0 function0, setCacheComposition.IAuthTabCallback iAuthTabCallback, Function1 function1, int i2, Function1 function12, CameraUnavailableException cameraUnavailableException, CameraState cameraState, getMergedResolutions getmergedresolutions, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, setCacheComposition.onExtraCallback onextracallback, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, boolean z, getBacktraceNote getbacktracenote3, getBacktraceNote getbacktracenote4, getBacktraceNote getbacktracenote5, getBacktraceNote getbacktracenote6, setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault, setCacheComposition.onWarmupCompleted onwarmupcompleted, setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 109;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {ontransact, selectparentresolutions, quirksExternalSyntheticBackport0, quirksExternalSyntheticBackport02, setanimationfromurl, onnavigationevent, Integer.valueOf(i), function0, iAuthTabCallback, function1, Integer.valueOf(i2), function12, cameraUnavailableException, cameraState, getmergedresolutions, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, iAuthTabCallbackStub, onextracallback, getbacktracenote, getbacktracenote2, Boolean.valueOf(z), getbacktracenote3, getbacktracenote4, getbacktracenote5, getbacktracenote6, iAuthTabCallbackDefault, onwarmupcompleted, onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        Unit unit = (Unit) onWarmupCompleted(1219836966, -1219836966, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, objArr);
        int i7 = IAuthTabCallbackStub + 93;
        IAuthTabCallbackDefault = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i, Function1 function1, selectParentResolutions selectparentresolutions) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 107;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return onNavigationEvent(i, function1, selectparentresolutions);
        }
        onNavigationEvent(i, function1, selectparentresolutions);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 25;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallbackStub + 95;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, selectParentResolutions selectparentresolutions) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(function1, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, selectparentresolutions);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(function1, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, selectparentresolutions);
        int i3 = IAuthTabCallbackStub + 117;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, setAnimationFromUrl setanimationfromurl, setCacheComposition.onNavigationEvent onnavigationevent, int i, Function0 function0, setCacheComposition.IAuthTabCallback iAuthTabCallback, Function1 function1, selectParentResolutions selectparentresolutions, int i2, Function1 function12, CameraUnavailableException cameraUnavailableException, CameraState cameraState, getMergedResolutions getmergedresolutions, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, setCacheComposition.onExtraCallback onextracallback, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, boolean z, getBacktraceNote getbacktracenote3, getBacktraceNote getbacktracenote4, getBacktraceNote getbacktracenote5, getBacktraceNote getbacktracenote6, setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault, setCacheComposition.onWarmupCompleted onwarmupcompleted, setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStub + 71;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport0, quirksExternalSyntheticBackport02, setanimationfromurl, onnavigationevent, i, function0, iAuthTabCallback, function1, selectparentresolutions, i2, function12, cameraUnavailableException, cameraState, getmergedresolutions, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, cameraPresenceProviderExternalSyntheticLambda6, iAuthTabCallbackStub, onextracallback, getbacktracenote, getbacktracenote2, z, getbacktracenote3, getbacktracenote4, getbacktracenote5, getbacktracenote6, iAuthTabCallbackDefault, onwarmupcompleted, onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = IAuthTabCallbackDefault + 67;
        IAuthTabCallbackStub = i7 % 128;
        if (i7 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(selectParentResolutions selectparentresolutions, Function1 function1, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, setCacheComposition.onExtraCallback onextracallback, Function0 function0, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, boolean z, getBacktraceNote getbacktracenote3, getBacktraceNote getbacktracenote4, getBacktraceNote getbacktracenote5, getBacktraceNote getbacktracenote6, setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault, getMergedResolutions getmergedresolutions, setCacheComposition.onWarmupCompleted onwarmupcompleted, setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult, CameraUnavailableException cameraUnavailableException, CameraState cameraState, boolean z2, setAnimationFromUrl setanimationfromurl, int i, int i2, setCacheComposition.IAuthTabCallback iAuthTabCallback, Function1 function12, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, int i3, int i4, int i5, int i6, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i7) {
        int i8 = 2 % 2;
        int i9 = IAuthTabCallbackDefault + 103;
        IAuthTabCallbackStub = i9 % 128;
        int i10 = i9 % 2;
        onExtraCallbackWithResult(selectparentresolutions, function1, iAuthTabCallbackStub, quirksExternalSyntheticBackport0, onextracallback, function0, getbacktracenote, getbacktracenote2, z, getbacktracenote3, getbacktracenote4, getbacktracenote5, getbacktracenote6, iAuthTabCallbackDefault, getmergedresolutions, onwarmupcompleted, onextracallbackwithresult, cameraUnavailableException, cameraState, z2, setanimationfromurl, i, i2, iAuthTabCallback, function12, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i3 | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i4), RecomposeScopeImplKt.onExtraCallbackWithResult(i5), i6);
        Unit unit = Unit.INSTANCE;
        int i11 = IAuthTabCallbackDefault + 15;
        IAuthTabCallbackStub = i11 % 128;
        int i12 = i11 % 2;
        return unit;
    }

    public static final /* synthetic */ setCacheComposition.onTransact onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 89;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[0];
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback4 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        if (i3 == 0) {
            throw null;
        }
        setCacheComposition.onTransact ontransact = (setCacheComposition.onTransact) onWarmupCompleted(1452002419, -1452002411, iIAuthTabCallback4, iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, objArr);
        int i4 = IAuthTabCallbackDefault + 99;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return ontransact;
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 7;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 == 0) {
            int i6 = 9 / 0;
        }
        int i7 = IAuthTabCallbackDefault + 23;
        IAuthTabCallbackStub = i7 % 128;
        int i8 = i7 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, Function1 function1, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, setCacheComposition.onExtraCallback onextracallback, Function0 function0, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, boolean z, getBacktraceNote getbacktracenote3, getBacktraceNote getbacktracenote4, getBacktraceNote getbacktracenote5, getBacktraceNote getbacktracenote6, setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault, getMergedResolutions getmergedresolutions, setCacheComposition.onWarmupCompleted onwarmupcompleted, setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult, CameraUnavailableException cameraUnavailableException, CameraState cameraState, boolean z2, boolean z3, boolean z4, int i, int i2, setCacheComposition.IAuthTabCallback iAuthTabCallback, Function1 function12, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, int i3, int i4, int i5, int i6, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i7) {
        int i8 = 2 % 2;
        int i9 = IAuthTabCallbackStub + 117;
        IAuthTabCallbackDefault = i9 % 128;
        int i10 = i9 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, function1, iAuthTabCallbackStub, quirksExternalSyntheticBackport0, onextracallback, function0, getbacktracenote, getbacktracenote2, z, getbacktracenote3, getbacktracenote4, getbacktracenote5, getbacktracenote6, iAuthTabCallbackDefault, getmergedresolutions, onwarmupcompleted, onextracallbackwithresult, cameraUnavailableException, cameraState, z2, z3, z4, i, i2, iAuthTabCallback, function12, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, i3, i4, i5, i6, cameraCaptureResultEmptyCameraCaptureResult, i7);
        int i11 = IAuthTabCallbackStub + 119;
        IAuthTabCallbackDefault = i11 % 128;
        int i12 = i11 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 109;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, function2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = IAuthTabCallbackStub + 51;
        IAuthTabCallbackDefault = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        Unit unit = (Unit) onWarmupCompleted(1609865471, -1609865460, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, new Object[]{surfaceProcessorNodeOut});
        int i4 = IAuthTabCallbackStub + 87;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(setCacheComposition.onTransact ontransact, selectParentResolutions selectparentresolutions, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, setAnimationFromUrl setanimationfromurl, setCacheComposition.onNavigationEvent onnavigationevent, int i, Function0 function0, setCacheComposition.IAuthTabCallback iAuthTabCallback, Function1 function1, int i2, Function1 function12, CameraUnavailableException cameraUnavailableException, CameraState cameraState, getMergedResolutions getmergedresolutions, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, setCacheComposition.onExtraCallback onextracallback, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, boolean z, getBacktraceNote getbacktracenote3, getBacktraceNote getbacktracenote4, getBacktraceNote getbacktracenote5, getBacktraceNote getbacktracenote6, setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault, setCacheComposition.onWarmupCompleted onwarmupcompleted, setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStub + 43;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(ontransact, selectparentresolutions, quirksExternalSyntheticBackport0, quirksExternalSyntheticBackport02, setanimationfromurl, onnavigationevent, i, function0, iAuthTabCallback, function1, i2, function12, cameraUnavailableException, cameraState, getmergedresolutions, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, iAuthTabCallbackStub, onextracallback, getbacktracenote, getbacktracenote2, z, getbacktracenote3, getbacktracenote4, getbacktracenote5, getbacktracenote6, iAuthTabCallbackDefault, onwarmupcompleted, onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = IAuthTabCallbackDefault + 89;
        IAuthTabCallbackStub = i7 % 128;
        if (i7 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ getMergedResolutions onNavigationEvent(setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault, getMergedResolutions getmergedresolutions) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 29;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(iAuthTabCallbackDefault, getmergedresolutions);
            obj.hashCode();
            throw null;
        }
        getMergedResolutions getmergedresolutionsOnExtraCallbackWithResult = onExtraCallbackWithResult(iAuthTabCallbackDefault, getmergedresolutions);
        int i3 = IAuthTabCallbackStub + 109;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return getmergedresolutionsOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static final /* synthetic */ setCacheComposition.onTransact onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setCacheComposition.onTransact onTransact2 = onTransact();
        int i4 = IAuthTabCallbackDefault + 83;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
        return onTransact2;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = (~(i7 | i8)) | i;
        int i10 = i5 | i7;
        int i11 = (~(i5 | i)) | (~(i7 | (~i) | i8)) | (~(i | i2));
        int i12 = i + i2 + i6 + (764943627 * i4) + (189947931 * i3);
        int i13 = i12 * i12;
        int i14 = (i * 1860537600) + 224780607 + (i2 * 1860537600) + (i9 * 1034) + (i10 * (-517)) + (i11 * 517) + (1860538117 * i6) + ((-1861700041) * i4) + ((-831392377) * i3) + (i13 * 995229696);
        switch (((i * (-973936384)) - 801505280) + ((-973936384) * i2) + (1838296578 * i9) + (1228335359 * i10) + ((-1228335359) * i11) + (2092695552 * i6) + ((-1475084288) * i4) + ((-1479278592) * i3) + ((-626393088) * i13) + (i14 * i14 * 1053163520)) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return onTransact(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            case 8:
                int i15 = 2 % 2;
                isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
                GraphicDeviceInfo graphicDeviceInfoIAuthTabCallbackStub = isrepeatingenabled.IAuthTabCallbackStub();
                accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = accessgetTlsVersionsAsStringp.Typography3;
                GraphicDeviceInfo graphicDeviceInfoAsBinder = isrepeatingenabled.asBinder();
                accessgetTlsVersionsAsStringp accessgettlsversionsasstringp2 = accessgetTlsVersionsAsStringp.Typography7;
                setComposition setcomposition = new setComposition(graphicDeviceInfoIAuthTabCallbackStub, accessgettlsversionsasstringp, graphicDeviceInfoAsBinder, accessgettlsversionsasstringp2, null, null, null, null, null, accessgettlsversionsasstringp2, 496, null);
                int i16 = IAuthTabCallbackDefault + 65;
                IAuthTabCallbackStub = i16 % 128;
                int i17 = i16 % 2;
                return setcomposition;
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return asInterface(objArr);
            case 10:
                return IAuthTabCallbackStub(objArr);
            case 11:
                return access100(objArr);
            case LiveCheckConstants.SVC_U1 /* 12 */:
                return access000(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(selectParentResolutions selectparentresolutions, Function1 function1, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, setCacheComposition.onExtraCallback onextracallback, Function0 function0, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, boolean z, getBacktraceNote getbacktracenote3, getBacktraceNote getbacktracenote4, getBacktraceNote getbacktracenote5, getBacktraceNote getbacktracenote6, setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault, getMergedResolutions getmergedresolutions, setCacheComposition.onWarmupCompleted onwarmupcompleted, setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult, CameraUnavailableException cameraUnavailableException, CameraState cameraState, boolean z2, setAnimationFromUrl setanimationfromurl, int i, int i2, setCacheComposition.IAuthTabCallback iAuthTabCallback, Function1 function12, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, int i3, int i4, int i5, int i6, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i7) {
        int i8 = 2 % 2;
        int i9 = IAuthTabCallbackDefault + 19;
        IAuthTabCallbackStub = i9 % 128;
        int i10 = i9 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(selectparentresolutions, function1, iAuthTabCallbackStub, quirksExternalSyntheticBackport0, onextracallback, function0, getbacktracenote, getbacktracenote2, z, getbacktracenote3, getbacktracenote4, getbacktracenote5, getbacktracenote6, iAuthTabCallbackDefault, getmergedresolutions, onwarmupcompleted, onextracallbackwithresult, cameraUnavailableException, cameraState, z2, setanimationfromurl, i, i2, iAuthTabCallback, function12, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, i3, i4, i5, i6, cameraCaptureResultEmptyCameraCaptureResult, i7);
        int i11 = IAuthTabCallbackStub + 29;
        IAuthTabCallbackDefault = i11 % 128;
        int i12 = i11 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit onWarmupCompleted(selectParentResolutions selectparentresolutions, Function1 function1, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, setCacheComposition.onExtraCallback onextracallback, Function0 function0, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, boolean z, getBacktraceNote getbacktracenote3, getBacktraceNote getbacktracenote4, getBacktraceNote getbacktracenote5, getBacktraceNote getbacktracenote6, setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault, getMergedResolutions getmergedresolutions, setCacheComposition.onWarmupCompleted onwarmupcompleted, setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult, CameraUnavailableException cameraUnavailableException, CameraState cameraState, boolean z2, boolean z3, boolean z4, int i, int i2, setCacheComposition.IAuthTabCallback iAuthTabCallback, Function1 function12, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, int i3, int i4, int i5, int i6, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i7) {
        int i8 = 2 % 2;
        int i9 = IAuthTabCallbackDefault + 95;
        IAuthTabCallbackStub = i9 % 128;
        int i10 = i9 % 2;
        onNavigationEvent(selectparentresolutions, function1, iAuthTabCallbackStub, quirksExternalSyntheticBackport0, onextracallback, function0, getbacktracenote, getbacktracenote2, z, getbacktracenote3, getbacktracenote4, getbacktracenote5, getbacktracenote6, iAuthTabCallbackDefault, getmergedresolutions, onwarmupcompleted, onextracallbackwithresult, cameraUnavailableException, cameraState, z2, z3, z4, i, i2, iAuthTabCallback, function12, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i3 | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i4), RecomposeScopeImplKt.onExtraCallbackWithResult(i5), i6);
        Unit unit = Unit.INSTANCE;
        int i11 = IAuthTabCallbackStub + 21;
        IAuthTabCallbackDefault = i11 % 128;
        if (i11 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(setAnimationFromUrl setanimationfromurl, UseCaseAttachState useCaseAttachState) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(setanimationfromurl, useCaseAttachState);
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        int i5 = IAuthTabCallbackStub + 1;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static final /* synthetic */ setCacheComposition.onTransact onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 99;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setCacheComposition.onTransact interfaceDescriptor = getInterfaceDescriptor();
        int i4 = IAuthTabCallbackStub + 75;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return interfaceDescriptor;
    }

    public static final /* synthetic */ void onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 3;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(quirksExternalSyntheticBackport0, function2, cameraCaptureResultEmptyCameraCaptureResult, i, i2);
        if (i5 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 $interactionSource;
        final /* synthetic */ initSDK $this_AutoLogNode;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, initSDK initsdk, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$interactionSource = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
            this.$this_AutoLogNode = initsdk;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$interactionSource, this.$this_AutoLogNode, access13800Var);
            onwarmupcompleted.L$0 = obj;
            int i2 = onExtraCallback + 57;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 / 0;
            }
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 125;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 107;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final class onExtraCallback implements IAnimation<Object> {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;
            final /* synthetic */ IAnimation onExtraCallback;

            /* renamed from: o.setDefaultFontFileExtension$onWarmupCompleted$onExtraCallback$1, reason: invalid class name */
            public static final class AnonymousClass1<T> implements setRipple {
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;
                final /* synthetic */ setRipple onNavigationEvent;

                /* renamed from: o.setDefaultFontFileExtension$onWarmupCompleted$onExtraCallback$1$3, reason: invalid class name */
                public static final class AnonymousClass3 extends ContinuationImpl {
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass3(access13800 access13800Var) {
                        super(access13800Var);
                    }

                    public final Object invokeSuspend(Object obj) {
                        int i = 2 % 2;
                        int i2 = onNavigationEvent + 103;
                        onExtraCallback = i2 % 128;
                        int i3 = i2 % 2;
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        Object objEmit = AnonymousClass1.this.emit(null, this);
                        int i4 = onNavigationEvent + 123;
                        onExtraCallback = i4 % 128;
                        int i5 = i4 % 2;
                        return objEmit;
                    }
                }

                public AnonymousClass1(setRipple setripple) {
                    this.onNavigationEvent = setripple;
                }

                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, access13800 access13800Var) {
                    AnonymousClass3 anonymousClass3;
                    int i = 2 % 2;
                    if (!(access13800Var instanceof AnonymousClass3)) {
                        anonymousClass3 = new AnonymousClass3(access13800Var);
                    } else {
                        int i2 = IAuthTabCallback + 123;
                        onExtraCallbackWithResult = i2 % 128;
                        int i3 = i2 % 2;
                        anonymousClass3 = (AnonymousClass3) access13800Var;
                        int i4 = anonymousClass3.label;
                        if ((i4 & Integer.MIN_VALUE) != 0) {
                            anonymousClass3.label = i4 - 2147483648;
                        }
                    }
                    Object obj2 = anonymousClass3.result;
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i5 = anonymousClass3.label;
                    if (i5 != 0) {
                        int i6 = IAuthTabCallback + 123;
                        onExtraCallbackWithResult = i6 % 128;
                        int i7 = i6 % 2;
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj2);
                    } else {
                        ResultKt.onNavigationEvent(obj2);
                        setRipple setripple = this.onNavigationEvent;
                        if (obj instanceof Camera2CapturePipelineTorchTaskExternalSyntheticLambda4.onExtraCallback) {
                            anonymousClass3.L$0 = access15400.onNavigationEvent(obj);
                            anonymousClass3.L$1 = access15400.onNavigationEvent(anonymousClass3);
                            anonymousClass3.L$2 = access15400.onNavigationEvent(obj);
                            anonymousClass3.L$3 = access15400.onNavigationEvent(setripple);
                            anonymousClass3.I$0 = 0;
                            anonymousClass3.label = 1;
                            if (setripple.emit(obj, anonymousClass3) == objOnWarmupCompleted) {
                                int i8 = IAuthTabCallback + 103;
                                onExtraCallbackWithResult = i8 % 128;
                                if (i8 % 2 == 0) {
                                    return objOnWarmupCompleted;
                                }
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            public onExtraCallback(IAnimation iAnimation) {
                this.onExtraCallback = iAnimation;
            }

            public Object collect(setRipple setripple, access13800 access13800Var) {
                int i = 2 % 2;
                Object objCollect = this.onExtraCallback.collect(new AnonymousClass1(setripple), access13800Var);
                Object obj = null;
                if (objCollect == access14300.onWarmupCompleted()) {
                    int i2 = IAuthTabCallback + 121;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 == 0) {
                        return objCollect;
                    }
                    obj.hashCode();
                    throw null;
                }
                Unit unit = Unit.INSTANCE;
                int i3 = onExtraCallbackWithResult + 25;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return unit;
                }
                obj.hashCode();
                throw null;
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 115;
            onExtraCallback = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            ycxycx.onWarmupCompleted(ycxycx.IAuthTabCallback(new onExtraCallback(this.$interactionSource.onExtraCallbackWithResult()), new AnonymousClass4(this.$this_AutoLogNode, null)), findresandmsg);
            Unit unit = Unit.INSTANCE;
            int i3 = onExtraCallback + 109;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }

        /* renamed from: o.setDefaultFontFileExtension$onWarmupCompleted$4, reason: invalid class name */
        static final class AnonymousClass4 extends SuspendLambda implements Function2<Camera2CapturePipelineTorchTaskExternalSyntheticLambda4.onExtraCallback, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;
            final /* synthetic */ initSDK $this_AutoLogNode;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(initSDK initsdk, access13800<? super AnonymousClass4> access13800Var) {
                super(2, access13800Var);
                this.$this_AutoLogNode = initsdk;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$this_AutoLogNode, access13800Var);
                int i2 = IAuthTabCallback + 41;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass4;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 95;
                IAuthTabCallback = i2 % 128;
                Camera2CapturePipelineTorchTaskExternalSyntheticLambda4.onExtraCallback onextracallback = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda4.onExtraCallback) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    onNavigationEvent(onextracallback, access13800Var);
                    throw null;
                }
                Object objOnNavigationEvent = onNavigationEvent(onextracallback, access13800Var);
                int i3 = onExtraCallbackWithResult + 1;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return objOnNavigationEvent;
            }

            public final Object onNavigationEvent(Camera2CapturePipelineTorchTaskExternalSyntheticLambda4.onExtraCallback onextracallback, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 7;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass4 anonymousClass4Create = create(onextracallback, access13800Var);
                Unit unit = Unit.INSTANCE;
                if (i3 != 0) {
                    return anonymousClass4Create.invokeSuspend(unit);
                }
                anonymousClass4Create.invokeSuspend(unit);
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 79;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                onInstallReferrerSetupFinished.onExtraCallbackWithResult(onInstallReferrerSetupFinished.onWarmupCompleted, this.$this_AutoLogNode, (initMiniApp) null, 2, (Object) null);
                Unit unit = Unit.INSTANCE;
                int i4 = IAuthTabCallback + 117;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit;
                }
                throw null;
            }
        }
    }

    static {
        int i = onTransact + 25;
        asBinder = i % 128;
        if (i % 2 != 0) {
            int i2 = 27 / 0;
        }
    }

    public static final int asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 103;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback;
        }
        throw null;
    }

    public static final CameraUnavailableException asBinder() {
        CameraUnavailableException cameraUnavailableException;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 105;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 == 0) {
            cameraUnavailableException = onExtraCallbackWithResult;
            int i4 = 73 / 0;
        } else {
            cameraUnavailableException = onExtraCallbackWithResult;
        }
        int i5 = i3 + 49;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return cameraUnavailableException;
    }

    public static final CameraState onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 33;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        CameraState cameraState = IAuthTabCallback;
        int i4 = i2 + 59;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
        return cameraState;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 107;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult = onNavigationEvent;
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
        return onextracallbackwithresult;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        setCacheComposition.onWarmupCompleted onwarmupcompleted = onWarmupCompleted;
        int i5 = i3 + 97;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return onwarmupcompleted;
        }
        throw null;
    }

    private static final setCacheComposition.onTransact onTransact() {
        int i = 2 % 2;
        isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
        GraphicDeviceInfo graphicDeviceInfoOnTransact = isrepeatingenabled.onTransact();
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = accessgetTlsVersionsAsStringp.Typography5;
        GraphicDeviceInfo graphicDeviceInfoAsBinder = isrepeatingenabled.asBinder();
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp2 = accessgetTlsVersionsAsStringp.Typography7;
        setComposition setcomposition = new setComposition(graphicDeviceInfoOnTransact, accessgettlsversionsasstringp, graphicDeviceInfoAsBinder, accessgettlsversionsasstringp2, null, null, null, null, null, accessgettlsversionsasstringp2, 496, null);
        int i2 = IAuthTabCallbackDefault + 119;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return setcomposition;
        }
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        int i = 2 % 2;
        isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
        GraphicDeviceInfo graphicDeviceInfoIAuthTabCallbackStub = isrepeatingenabled.IAuthTabCallbackStub();
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = accessgetTlsVersionsAsStringp.Typography1;
        GraphicDeviceInfo graphicDeviceInfoAsBinder = isrepeatingenabled.asBinder();
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp2 = accessgetTlsVersionsAsStringp.Typography7;
        setComposition setcomposition = new setComposition(graphicDeviceInfoIAuthTabCallbackStub, accessgettlsversionsasstringp, graphicDeviceInfoAsBinder, accessgettlsversionsasstringp2, null, null, null, null, null, accessgettlsversionsasstringp2, 496, null);
        int i2 = IAuthTabCallbackStub + 95;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return setcomposition;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final setCacheComposition.onTransact getInterfaceDescriptor() {
        int i = 2 % 2;
        isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
        GraphicDeviceInfo graphicDeviceInfoIAuthTabCallbackStub = isrepeatingenabled.IAuthTabCallbackStub();
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = accessgetTlsVersionsAsStringp.Typography1;
        GraphicDeviceInfo graphicDeviceInfoAsBinder = isrepeatingenabled.asBinder();
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp2 = accessgetTlsVersionsAsStringp.Typography7;
        setComposition setcomposition = new setComposition(graphicDeviceInfoIAuthTabCallbackStub, accessgettlsversionsasstringp, graphicDeviceInfoAsBinder, accessgettlsversionsasstringp2, null, null, null, null, null, accessgettlsversionsasstringp2, 496, null);
        int i2 = IAuthTabCallbackStub + 37;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return setcomposition;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:414:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013a  */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@NotNull final selectParentResolutions selectparentresolutions, @NotNull final Function1<? super selectParentResolutions, Unit> function1, @NotNull final setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable setCacheComposition.onExtraCallback onextracallback, @Nullable Function0<Unit> function0, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, boolean z, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote5, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote6, @Nullable setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault, @Nullable getMergedResolutions getmergedresolutions, @Nullable setCacheComposition.onWarmupCompleted onwarmupcompleted, @Nullable setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult, @Nullable CameraUnavailableException cameraUnavailableException, @Nullable CameraState cameraState, boolean z2, boolean z3, boolean z4, int i, int i2, @Nullable setCacheComposition.IAuthTabCallback iAuthTabCallback, @Nullable Function1<? super SurfaceProcessorNodeOut, Unit> function12, @Nullable Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i3, final int i4, final int i5, final int i6) {
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
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final setCacheComposition.onExtraCallback onextracallback2;
        final Function0<Unit> function02;
        final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote7;
        final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote8;
        final boolean z5;
        final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote9;
        final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote10;
        final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote11;
        final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote12;
        final setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault2;
        final getMergedResolutions getmergedresolutions2;
        final setCacheComposition.onWarmupCompleted onwarmupcompleted2;
        final setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult2;
        final CameraUnavailableException cameraUnavailableException2;
        final CameraState cameraState2;
        final boolean z6;
        final boolean z7;
        final boolean z8;
        final int i42;
        final int i43;
        final setCacheComposition.IAuthTabCallback iAuthTabCallback2;
        final Function1<? super SurfaceProcessorNodeOut, Unit> function13;
        final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote13;
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote14;
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote15;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        CameraState cameraState3;
        CameraState cameraState4;
        boolean z9;
        int i44;
        setCacheComposition.IAuthTabCallback IAuthTabCallback2;
        int i45;
        int i46;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote16;
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote17;
        CameraState cameraState5;
        boolean z10;
        int i47;
        int i48;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
        boolean z11;
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote18;
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote19;
        setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault3;
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote20;
        CameraUnavailableException cameraUnavailableException3;
        Function0<Unit> function03;
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote21;
        getMergedResolutions getmergedresolutions3;
        setCacheComposition.IAuthTabCallback iAuthTabCallback3;
        setCacheComposition.onWarmupCompleted onwarmupcompleted3;
        setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        boolean z12;
        boolean z13;
        Function1<? super SurfaceProcessorNodeOut, Unit> function14;
        setCacheComposition.onExtraCallback onextracallback3;
        int i49 = 2 % 2;
        Intrinsics.checkNotNullParameter(selectparentresolutions, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1291595930);
        if ((i3 & 6) == 0) {
            i7 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(selectparentresolutions) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackStub) ? 256 : 128;
        }
        int i50 = i6 & 8;
        if (i50 != 0) {
            i7 |= 3072;
        } else {
            if ((i3 & 3072) == 0) {
                i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 2048 : 1024;
            }
            i8 = i6 & 16;
            if (i8 == 0) {
                i7 |= 24576;
            } else {
                if ((i3 & 24576) == 0) {
                    i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback) ? 16384 : 8192;
                }
                i9 = i6 & 32;
                if (i9 != 0) {
                    i7 |= 196608;
                } else if ((i3 & 196608) == 0) {
                    i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 131072 : 65536;
                }
                i10 = i6 & 64;
                if (i10 != 0) {
                    i7 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 1048576 : 524288;
                }
                i11 = i6 & 128;
                if (i11 != 0) {
                    int i51 = IAuthTabCallbackStub + 33;
                    IAuthTabCallbackDefault = i51 % 128;
                    int i52 = i51 % 2;
                    i7 |= 12582912;
                } else {
                    if ((i3 & 12582912) == 0) {
                        i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote2) ? 8388608 : 4194304;
                    }
                    i12 = i6 & 256;
                    if (i12 == 0) {
                        i7 |= 100663296;
                    } else {
                        if ((i3 & 100663296) == 0) {
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
                                int i53 = IAuthTabCallbackStub + 25;
                                IAuthTabCallbackDefault = i53 % 128;
                                if (i53 % 2 != 0) {
                                    function1.hashCode();
                                    throw null;
                                }
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i14 = i13 | i7;
                        }
                        i15 = i6 & 512;
                        if (i15 != 0) {
                            i14 |= 805306368;
                        } else {
                            if ((805306368 & i3) == 0) {
                                i14 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote3) ? 536870912 : 268435456;
                            }
                            i16 = i6 & 1024;
                            if (i16 == 0) {
                                i17 = i4 | 6;
                            } else if ((i4 & 6) == 0) {
                                i17 = i4 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote4) ? 4 : 2);
                            } else {
                                i17 = i4;
                            }
                            i18 = i6 & 2048;
                            if (i18 == 0) {
                                i17 |= 48;
                            } else {
                                if ((i4 & 48) == 0) {
                                    int i54 = IAuthTabCallbackDefault + 57;
                                    IAuthTabCallbackStub = i54 % 128;
                                    int i55 = i54 % 2;
                                    i17 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote5) ? 32 : 16;
                                }
                                i19 = i17;
                                i20 = i6 & 4096;
                                if (i20 != 0) {
                                    i19 |= 384;
                                } else {
                                    if ((i4 & 384) == 0) {
                                        i19 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote6) ? 256 : 128;
                                    }
                                    i21 = i6 & 8192;
                                    if (i21 == 0) {
                                        i19 |= 3072;
                                    } else {
                                        if ((i4 & 3072) == 0) {
                                            i19 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackDefault) ? 2048 : 1024;
                                        }
                                        i22 = i6 & 16384;
                                        if (i22 != 0) {
                                            i19 |= 24576;
                                            i23 = i22;
                                        } else {
                                            i23 = i22;
                                            if ((i4 & 24576) == 0) {
                                                i19 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getmergedresolutions) ? 16384 : 8192;
                                            }
                                            i24 = i6 & 32768;
                                            if (i24 == 0) {
                                                int i56 = IAuthTabCallbackStub + 93;
                                                i25 = i21;
                                                IAuthTabCallbackDefault = i56 % 128;
                                                if (i56 % 2 != 0) {
                                                    i19 |= 196608;
                                                    int i57 = 81 / 0;
                                                } else {
                                                    i19 |= 196608;
                                                }
                                            } else {
                                                i25 = i21;
                                                if ((i4 & 196608) == 0) {
                                                    i19 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted == null ? -1 : onwarmupcompleted.ordinal()) ? 131072 : 65536;
                                                }
                                            }
                                            i26 = i6 & 65536;
                                            if (i26 == 0) {
                                                i19 |= 1572864;
                                            } else {
                                                if ((i4 & 1572864) == 0) {
                                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallbackwithresult == null ? -1 : onextracallbackwithresult.ordinal())) {
                                                        int i58 = IAuthTabCallbackStub + 101;
                                                        i27 = i26;
                                                        IAuthTabCallbackDefault = i58 % 128;
                                                        if (i58 % 2 != 0) {
                                                            throw null;
                                                        }
                                                        i28 = 1048576;
                                                    } else {
                                                        i27 = i26;
                                                        i28 = 524288;
                                                    }
                                                    i19 |= i28;
                                                }
                                                i29 = i6 & 131072;
                                                if (i29 != 0) {
                                                    i19 |= 12582912;
                                                } else {
                                                    if ((i4 & 12582912) == 0) {
                                                        i19 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraUnavailableException) ? 8388608 : 4194304;
                                                    }
                                                    i30 = i6 & 262144;
                                                    if (i30 == 0) {
                                                        i19 |= 100663296;
                                                    } else if ((i4 & 100663296) == 0) {
                                                        i19 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraState) ? 67108864 : 33554432;
                                                    }
                                                    i31 = i6 & 524288;
                                                    int i59 = 805306368;
                                                    if (i31 == 0) {
                                                        if ((i4 & 805306368) != 0) {
                                                            i32 = i6 & 1048576;
                                                            if (i32 != 0) {
                                                                i33 = i5 | 6;
                                                            } else if ((i5 & 6) == 0) {
                                                                i33 = i5 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 4 : 2);
                                                            } else {
                                                                i33 = i5;
                                                            }
                                                            i34 = i6 & 2097152;
                                                            if (i34 != 0) {
                                                                i33 |= 48;
                                                            } else {
                                                                if ((i5 & 48) == 0) {
                                                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z4)) {
                                                                        int i60 = IAuthTabCallbackStub + 65;
                                                                        IAuthTabCallbackDefault = i60 % 128;
                                                                        i35 = i60 % 2 != 0 ? 14 : 32;
                                                                    } else {
                                                                        i35 = 16;
                                                                    }
                                                                    i36 = i33 | i35;
                                                                }
                                                                i37 = 4194304 & i6;
                                                                if (i37 == 0) {
                                                                    i36 |= 384;
                                                                    i38 = i37;
                                                                } else {
                                                                    i38 = i37;
                                                                    if ((i5 & 384) == 0) {
                                                                        i36 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 256 : 128;
                                                                    }
                                                                    i39 = i6 & 8388608;
                                                                    if (i39 != 0) {
                                                                        i36 |= 3072;
                                                                    } else {
                                                                        if ((i5 & 3072) == 0) {
                                                                            i36 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i2) ? 2048 : 1024;
                                                                        }
                                                                        if ((i5 & 24576) == 0) {
                                                                            i36 |= ((16777216 & i6) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback)) ? 16384 : 8192;
                                                                        }
                                                                        i40 = i6 & 33554432;
                                                                        if (i40 != 0) {
                                                                            if ((i5 & 196608) == 0) {
                                                                                i36 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 131072 : 65536;
                                                                            }
                                                                            i41 = i6 & 67108864;
                                                                            if (i41 != 0) {
                                                                                i36 |= 1572864;
                                                                            } else if ((i5 & 1572864) == 0) {
                                                                                i36 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda2) ? 1048576 : 524288;
                                                                            }
                                                                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i14 & 306783379) == 306783378 && (306783379 & i19) == 306783378 && (599187 & i36) == 599186) ? false : true, i14 & 1)) {
                                                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                                                                if ((i3 & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                                                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = i50 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                                                                    setCacheComposition.onExtraCallback onextracallback4 = i8 != 0 ? setCacheComposition.onExtraCallback.onExtraCallbackWithResult.IAuthTabCallback : onextracallback;
                                                                                    Function0<Unit> function04 = i9 != 0 ? null : function0;
                                                                                    getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote22 = i10 != 0 ? null : getbacktracenote;
                                                                                    getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote23 = i11 != 0 ? null : getbacktracenote2;
                                                                                    boolean z14 = i12 != 0 ? false : z;
                                                                                    getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote24 = i15 != 0 ? null : getbacktracenote3;
                                                                                    if (i16 != 0) {
                                                                                        int i61 = IAuthTabCallbackStub + 61;
                                                                                        getbacktracenote13 = getbacktracenote24;
                                                                                        IAuthTabCallbackDefault = i61 % 128;
                                                                                        int i62 = i61 % 2;
                                                                                        getbacktracenote14 = null;
                                                                                    } else {
                                                                                        getbacktracenote13 = getbacktracenote24;
                                                                                        getbacktracenote14 = getbacktracenote4;
                                                                                    }
                                                                                    getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote25 = i18 != 0 ? null : getbacktracenote5;
                                                                                    getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote26 = i20 != 0 ? null : getbacktracenote6;
                                                                                    setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault4 = i25 != 0 ? null : iAuthTabCallbackDefault;
                                                                                    getMergedResolutions getmergedresolutions4 = i23 != 0 ? null : getmergedresolutions;
                                                                                    setCacheComposition.onWarmupCompleted onwarmupcompleted4 = i24 != 0 ? onWarmupCompleted : onwarmupcompleted;
                                                                                    setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult4 = i27 != 0 ? onNavigationEvent : onextracallbackwithresult;
                                                                                    CameraUnavailableException cameraUnavailableException4 = i29 != 0 ? onExtraCallbackWithResult : cameraUnavailableException;
                                                                                    if (i30 != 0) {
                                                                                        getbacktracenote15 = getbacktracenote14;
                                                                                        int i63 = IAuthTabCallbackDefault + 17;
                                                                                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                                                                                        IAuthTabCallbackStub = i63 % 128;
                                                                                        if (i63 % 2 == 0) {
                                                                                            cameraState3 = IAuthTabCallback;
                                                                                            int i64 = 97 / 0;
                                                                                        } else {
                                                                                            cameraState3 = IAuthTabCallback;
                                                                                        }
                                                                                    } else {
                                                                                        getbacktracenote15 = getbacktracenote14;
                                                                                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                                                                                        cameraState3 = cameraState;
                                                                                    }
                                                                                    boolean z15 = i31 != 0 ? true : z2;
                                                                                    boolean z16 = i32 != 0 ? false : z3;
                                                                                    boolean z17 = i34 != 0 ? false : z4;
                                                                                    if (i38 != 0) {
                                                                                        cameraState4 = cameraState3;
                                                                                        int i65 = IAuthTabCallbackStub + 99;
                                                                                        z9 = z15;
                                                                                        IAuthTabCallbackDefault = i65 % 128;
                                                                                        if (i65 % 2 != 0) {
                                                                                            i44 = onExtraCallback;
                                                                                            int i66 = 76 / 0;
                                                                                        } else {
                                                                                            i44 = onExtraCallback;
                                                                                        }
                                                                                    } else {
                                                                                        cameraState4 = cameraState3;
                                                                                        z9 = z15;
                                                                                        i44 = i;
                                                                                    }
                                                                                    int i67 = i39 != 0 ? Integer.MAX_VALUE : i2;
                                                                                    if ((i6 & 16777216) != 0) {
                                                                                        IAuthTabCallback2 = iAuthTabCallbackStub.IAuthTabCallback();
                                                                                        i36 &= -57345;
                                                                                    } else {
                                                                                        IAuthTabCallback2 = iAuthTabCallback;
                                                                                    }
                                                                                    function1 = i40 == 0 ? function12 : null;
                                                                                    if (i41 != 0) {
                                                                                        i45 = i44;
                                                                                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                                                        i46 = i67;
                                                                                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                                                            int i68 = IAuthTabCallbackDefault + 27;
                                                                                            IAuthTabCallbackStub = i68 % 128;
                                                                                            int i69 = i68 % 2;
                                                                                            objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                                                                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                                                                        }
                                                                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized;
                                                                                    } else {
                                                                                        i45 = i44;
                                                                                        i46 = i67;
                                                                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                                                                    }
                                                                                    getbacktracenote16 = getbacktracenote13;
                                                                                    getbacktracenote17 = getbacktracenote15;
                                                                                    cameraState5 = cameraState4;
                                                                                    z10 = z9;
                                                                                    i47 = i45;
                                                                                    i48 = i46;
                                                                                    camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
                                                                                    z11 = z14;
                                                                                    getbacktracenote18 = getbacktracenote25;
                                                                                    getbacktracenote19 = getbacktracenote26;
                                                                                    iAuthTabCallbackDefault3 = iAuthTabCallbackDefault4;
                                                                                    getbacktracenote20 = getbacktracenote23;
                                                                                    cameraUnavailableException3 = cameraUnavailableException4;
                                                                                    function03 = function04;
                                                                                    getbacktracenote21 = getbacktracenote22;
                                                                                    getmergedresolutions3 = getmergedresolutions4;
                                                                                    iAuthTabCallback3 = IAuthTabCallback2;
                                                                                    onwarmupcompleted3 = onwarmupcompleted4;
                                                                                    onextracallbackwithresult3 = onextracallbackwithresult4;
                                                                                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                                                                    z12 = z16;
                                                                                    z13 = z17;
                                                                                    function14 = function1;
                                                                                    onextracallback3 = onextracallback4;
                                                                                } else {
                                                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                                                                    if ((16777216 & i6) != 0) {
                                                                                        i36 &= -57345;
                                                                                    }
                                                                                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport0;
                                                                                    onextracallback3 = onextracallback;
                                                                                    function03 = function0;
                                                                                    getbacktracenote21 = getbacktracenote;
                                                                                    getbacktracenote20 = getbacktracenote2;
                                                                                    z11 = z;
                                                                                    getbacktracenote16 = getbacktracenote3;
                                                                                    getbacktracenote17 = getbacktracenote4;
                                                                                    getbacktracenote18 = getbacktracenote5;
                                                                                    getbacktracenote19 = getbacktracenote6;
                                                                                    iAuthTabCallbackDefault3 = iAuthTabCallbackDefault;
                                                                                    getmergedresolutions3 = getmergedresolutions;
                                                                                    onwarmupcompleted3 = onwarmupcompleted;
                                                                                    onextracallbackwithresult3 = onextracallbackwithresult;
                                                                                    cameraUnavailableException3 = cameraUnavailableException;
                                                                                    cameraState5 = cameraState;
                                                                                    z10 = z2;
                                                                                    z12 = z3;
                                                                                    z13 = z4;
                                                                                    i47 = i;
                                                                                    i48 = i2;
                                                                                    iAuthTabCallback3 = iAuthTabCallback;
                                                                                    function14 = function12;
                                                                                    camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                                                                }
                                                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                                                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1291595930, i14, i19, "im.toss.compose.v3.textfield.TdsTextFieldV3 (TextFields.kt:572)");
                                                                                }
                                                                                setAnimationFromUrl setanimationfromurlOnWarmupCompleted = onWarmupCompleted(z12, z13, new Object[0], cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i36 & 126, 0);
                                                                                setanimationfromurlOnWarmupCompleted.onNavigationEvent(z12);
                                                                                setanimationfromurlOnWarmupCompleted.onExtraCallbackWithResult(z13);
                                                                                Unit unit = Unit.INSTANCE;
                                                                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                                                                boolean z18 = z13;
                                                                                boolean z19 = z12;
                                                                                onExtraCallbackWithResult(selectparentresolutions, function1, iAuthTabCallbackStub, quirksExternalSyntheticBackport04, onextracallback3, function03, getbacktracenote21, getbacktracenote20, z11, getbacktracenote16, getbacktracenote17, getbacktracenote18, getbacktracenote19, iAuthTabCallbackDefault3, getmergedresolutions3, onwarmupcompleted3, onextracallbackwithresult3, cameraUnavailableException3, cameraState5, z10, setanimationfromurlOnWarmupCompleted, i47, i48, iAuthTabCallback3, function14, camera2CapturePipelineTorchTaskExternalSyntheticLambda24, cameraCaptureResultEmptyCameraCaptureResult2, i14 & 2147483646, i19 & 2147483646, (i36 >> 3) & 524272, 0);
                                                                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                                                                }
                                                                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                                                                                onextracallback2 = onextracallback3;
                                                                                function02 = function03;
                                                                                getbacktracenote7 = getbacktracenote21;
                                                                                getbacktracenote8 = getbacktracenote20;
                                                                                z5 = z11;
                                                                                getbacktracenote9 = getbacktracenote16;
                                                                                getbacktracenote10 = getbacktracenote17;
                                                                                getbacktracenote11 = getbacktracenote18;
                                                                                getbacktracenote12 = getbacktracenote19;
                                                                                iAuthTabCallbackDefault2 = iAuthTabCallbackDefault3;
                                                                                getmergedresolutions2 = getmergedresolutions3;
                                                                                onwarmupcompleted2 = onwarmupcompleted3;
                                                                                onextracallbackwithresult2 = onextracallbackwithresult3;
                                                                                cameraUnavailableException2 = cameraUnavailableException3;
                                                                                cameraState2 = cameraState5;
                                                                                z6 = z10;
                                                                                i42 = i47;
                                                                                i43 = i48;
                                                                                iAuthTabCallback2 = iAuthTabCallback3;
                                                                                function13 = function14;
                                                                                camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
                                                                                z8 = z18;
                                                                                z7 = z19;
                                                                            } else {
                                                                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                                                                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                                                                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                                                                onextracallback2 = onextracallback;
                                                                                function02 = function0;
                                                                                getbacktracenote7 = getbacktracenote;
                                                                                getbacktracenote8 = getbacktracenote2;
                                                                                z5 = z;
                                                                                getbacktracenote9 = getbacktracenote3;
                                                                                getbacktracenote10 = getbacktracenote4;
                                                                                getbacktracenote11 = getbacktracenote5;
                                                                                getbacktracenote12 = getbacktracenote6;
                                                                                iAuthTabCallbackDefault2 = iAuthTabCallbackDefault;
                                                                                getmergedresolutions2 = getmergedresolutions;
                                                                                onwarmupcompleted2 = onwarmupcompleted;
                                                                                onextracallbackwithresult2 = onextracallbackwithresult;
                                                                                cameraUnavailableException2 = cameraUnavailableException;
                                                                                cameraState2 = cameraState;
                                                                                z6 = z2;
                                                                                z7 = z3;
                                                                                z8 = z4;
                                                                                i42 = i;
                                                                                i43 = i2;
                                                                                iAuthTabCallback2 = iAuthTabCallback;
                                                                                function13 = function12;
                                                                                camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                                                            }
                                                                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                                                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                                                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v3.textfield.TextFieldsKt$$ExternalSyntheticLambda18
                                                                                    private static int IAuthTabCallback = 1;
                                                                                    private static int onExtraCallback;

                                                                                    public final Object invoke(Object obj, Object obj2) {
                                                                                        int i70 = 2 % 2;
                                                                                        int i71 = IAuthTabCallback + 63;
                                                                                        onExtraCallback = i71 % 128;
                                                                                        int i72 = i71 % 2;
                                                                                        selectParentResolutions selectparentresolutions2 = selectparentresolutions;
                                                                                        Function1 function15 = function1;
                                                                                        setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub2 = iAuthTabCallbackStub;
                                                                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport02;
                                                                                        setCacheComposition.onExtraCallback onextracallback5 = onextracallback2;
                                                                                        Function0 function05 = function02;
                                                                                        getBacktraceNote getbacktracenote27 = getbacktracenote7;
                                                                                        getBacktraceNote getbacktracenote28 = getbacktracenote8;
                                                                                        boolean z20 = z5;
                                                                                        getBacktraceNote getbacktracenote29 = getbacktracenote9;
                                                                                        getBacktraceNote getbacktracenote30 = getbacktracenote10;
                                                                                        getBacktraceNote getbacktracenote31 = getbacktracenote11;
                                                                                        getBacktraceNote getbacktracenote32 = getbacktracenote12;
                                                                                        setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault5 = iAuthTabCallbackDefault2;
                                                                                        getMergedResolutions getmergedresolutions5 = getmergedresolutions2;
                                                                                        setCacheComposition.onWarmupCompleted onwarmupcompleted5 = onwarmupcompleted2;
                                                                                        setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult5 = onextracallbackwithresult2;
                                                                                        CameraUnavailableException cameraUnavailableException5 = cameraUnavailableException2;
                                                                                        CameraState cameraState6 = cameraState2;
                                                                                        boolean z21 = z6;
                                                                                        boolean z22 = z7;
                                                                                        boolean z23 = z8;
                                                                                        int i73 = i42;
                                                                                        int i74 = i43;
                                                                                        setCacheComposition.IAuthTabCallback iAuthTabCallback4 = iAuthTabCallback2;
                                                                                        Function1 function16 = function13;
                                                                                        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda25 = camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
                                                                                        int i75 = i3;
                                                                                        int i76 = i4;
                                                                                        int i77 = i5;
                                                                                        int i78 = i6;
                                                                                        int iIntValue = ((Integer) obj2).intValue();
                                                                                        Object[] objArr = {selectparentresolutions2, function15, iAuthTabCallbackStub2, quirksExternalSyntheticBackport06, onextracallback5, function05, getbacktracenote27, getbacktracenote28, Boolean.valueOf(z20), getbacktracenote29, getbacktracenote30, getbacktracenote31, getbacktracenote32, iAuthTabCallbackDefault5, getmergedresolutions5, onwarmupcompleted5, onextracallbackwithresult5, cameraUnavailableException5, cameraState6, Boolean.valueOf(z21), Boolean.valueOf(z22), Boolean.valueOf(z23), Integer.valueOf(i73), Integer.valueOf(i74), iAuthTabCallback4, function16, camera2CapturePipelineTorchTaskExternalSyntheticLambda25, Integer.valueOf(i75), Integer.valueOf(i76), Integer.valueOf(i77), Integer.valueOf(i78), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
                                                                                        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
                                                                                        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
                                                                                        Unit unit2 = (Unit) setDefaultFontFileExtension.onWarmupCompleted(-2021328229, 2021328241, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, objArr);
                                                                                        int i79 = onExtraCallback + 115;
                                                                                        IAuthTabCallback = i79 % 128;
                                                                                        if (i79 % 2 != 0) {
                                                                                            return unit2;
                                                                                        }
                                                                                        throw null;
                                                                                    }
                                                                                });
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        i36 |= 196608;
                                                                        i41 = i6 & 67108864;
                                                                        if (i41 != 0) {
                                                                        }
                                                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i14 & 306783379) == 306783378 && (306783379 & i19) == 306783378 && (599187 & i36) == 599186) ? false : true, i14 & 1)) {
                                                                        }
                                                                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                                                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                                                        }
                                                                    }
                                                                    if ((i5 & 24576) == 0) {
                                                                    }
                                                                    i40 = i6 & 33554432;
                                                                    if (i40 != 0) {
                                                                    }
                                                                    i41 = i6 & 67108864;
                                                                    if (i41 != 0) {
                                                                    }
                                                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i14 & 306783379) == 306783378 && (306783379 & i19) == 306783378 && (599187 & i36) == 599186) ? false : true, i14 & 1)) {
                                                                    }
                                                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                                                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                                                    }
                                                                }
                                                                i39 = i6 & 8388608;
                                                                if (i39 != 0) {
                                                                }
                                                                if ((i5 & 24576) == 0) {
                                                                }
                                                                i40 = i6 & 33554432;
                                                                if (i40 != 0) {
                                                                }
                                                                i41 = i6 & 67108864;
                                                                if (i41 != 0) {
                                                                }
                                                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i14 & 306783379) == 306783378 && (306783379 & i19) == 306783378 && (599187 & i36) == 599186) ? false : true, i14 & 1)) {
                                                                }
                                                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                                                }
                                                            }
                                                            i36 = i33;
                                                            i37 = 4194304 & i6;
                                                            if (i37 == 0) {
                                                            }
                                                            i39 = i6 & 8388608;
                                                            if (i39 != 0) {
                                                            }
                                                            if ((i5 & 24576) == 0) {
                                                            }
                                                            i40 = i6 & 33554432;
                                                            if (i40 != 0) {
                                                            }
                                                            i41 = i6 & 67108864;
                                                            if (i41 != 0) {
                                                            }
                                                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i14 & 306783379) == 306783378 && (306783379 & i19) == 306783378 && (599187 & i36) == 599186) ? false : true, i14 & 1)) {
                                                            }
                                                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                                            }
                                                        } else {
                                                            i59 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 536870912 : 268435456;
                                                        }
                                                    }
                                                    i19 |= i59;
                                                    i32 = i6 & 1048576;
                                                    if (i32 != 0) {
                                                    }
                                                    i34 = i6 & 2097152;
                                                    if (i34 != 0) {
                                                    }
                                                    i36 = i33;
                                                    i37 = 4194304 & i6;
                                                    if (i37 == 0) {
                                                    }
                                                    i39 = i6 & 8388608;
                                                    if (i39 != 0) {
                                                    }
                                                    if ((i5 & 24576) == 0) {
                                                    }
                                                    i40 = i6 & 33554432;
                                                    if (i40 != 0) {
                                                    }
                                                    i41 = i6 & 67108864;
                                                    if (i41 != 0) {
                                                    }
                                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i14 & 306783379) == 306783378 && (306783379 & i19) == 306783378 && (599187 & i36) == 599186) ? false : true, i14 & 1)) {
                                                    }
                                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                                    }
                                                }
                                                i30 = i6 & 262144;
                                                if (i30 == 0) {
                                                }
                                                i31 = i6 & 524288;
                                                int i592 = 805306368;
                                                if (i31 == 0) {
                                                }
                                                i19 |= i592;
                                                i32 = i6 & 1048576;
                                                if (i32 != 0) {
                                                }
                                                i34 = i6 & 2097152;
                                                if (i34 != 0) {
                                                }
                                                i36 = i33;
                                                i37 = 4194304 & i6;
                                                if (i37 == 0) {
                                                }
                                                i39 = i6 & 8388608;
                                                if (i39 != 0) {
                                                }
                                                if ((i5 & 24576) == 0) {
                                                }
                                                i40 = i6 & 33554432;
                                                if (i40 != 0) {
                                                }
                                                i41 = i6 & 67108864;
                                                if (i41 != 0) {
                                                }
                                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i14 & 306783379) == 306783378 && (306783379 & i19) == 306783378 && (599187 & i36) == 599186) ? false : true, i14 & 1)) {
                                                }
                                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                                }
                                            }
                                            i27 = i26;
                                            i29 = i6 & 131072;
                                            if (i29 != 0) {
                                            }
                                            i30 = i6 & 262144;
                                            if (i30 == 0) {
                                            }
                                            i31 = i6 & 524288;
                                            int i5922 = 805306368;
                                            if (i31 == 0) {
                                            }
                                            i19 |= i5922;
                                            i32 = i6 & 1048576;
                                            if (i32 != 0) {
                                            }
                                            i34 = i6 & 2097152;
                                            if (i34 != 0) {
                                            }
                                            i36 = i33;
                                            i37 = 4194304 & i6;
                                            if (i37 == 0) {
                                            }
                                            i39 = i6 & 8388608;
                                            if (i39 != 0) {
                                            }
                                            if ((i5 & 24576) == 0) {
                                            }
                                            i40 = i6 & 33554432;
                                            if (i40 != 0) {
                                            }
                                            i41 = i6 & 67108864;
                                            if (i41 != 0) {
                                            }
                                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i14 & 306783379) == 306783378 && (306783379 & i19) == 306783378 && (599187 & i36) == 599186) ? false : true, i14 & 1)) {
                                            }
                                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                            }
                                        }
                                        i24 = i6 & 32768;
                                        if (i24 == 0) {
                                        }
                                        i26 = i6 & 65536;
                                        if (i26 == 0) {
                                        }
                                        i27 = i26;
                                        i29 = i6 & 131072;
                                        if (i29 != 0) {
                                        }
                                        i30 = i6 & 262144;
                                        if (i30 == 0) {
                                        }
                                        i31 = i6 & 524288;
                                        int i59222 = 805306368;
                                        if (i31 == 0) {
                                        }
                                        i19 |= i59222;
                                        i32 = i6 & 1048576;
                                        if (i32 != 0) {
                                        }
                                        i34 = i6 & 2097152;
                                        if (i34 != 0) {
                                        }
                                        i36 = i33;
                                        i37 = 4194304 & i6;
                                        if (i37 == 0) {
                                        }
                                        i39 = i6 & 8388608;
                                        if (i39 != 0) {
                                        }
                                        if ((i5 & 24576) == 0) {
                                        }
                                        i40 = i6 & 33554432;
                                        if (i40 != 0) {
                                        }
                                        i41 = i6 & 67108864;
                                        if (i41 != 0) {
                                        }
                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i14 & 306783379) == 306783378 && (306783379 & i19) == 306783378 && (599187 & i36) == 599186) ? false : true, i14 & 1)) {
                                        }
                                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                        }
                                    }
                                    i22 = i6 & 16384;
                                    if (i22 != 0) {
                                    }
                                    i24 = i6 & 32768;
                                    if (i24 == 0) {
                                    }
                                    i26 = i6 & 65536;
                                    if (i26 == 0) {
                                    }
                                    i27 = i26;
                                    i29 = i6 & 131072;
                                    if (i29 != 0) {
                                    }
                                    i30 = i6 & 262144;
                                    if (i30 == 0) {
                                    }
                                    i31 = i6 & 524288;
                                    int i592222 = 805306368;
                                    if (i31 == 0) {
                                    }
                                    i19 |= i592222;
                                    i32 = i6 & 1048576;
                                    if (i32 != 0) {
                                    }
                                    i34 = i6 & 2097152;
                                    if (i34 != 0) {
                                    }
                                    i36 = i33;
                                    i37 = 4194304 & i6;
                                    if (i37 == 0) {
                                    }
                                    i39 = i6 & 8388608;
                                    if (i39 != 0) {
                                    }
                                    if ((i5 & 24576) == 0) {
                                    }
                                    i40 = i6 & 33554432;
                                    if (i40 != 0) {
                                    }
                                    i41 = i6 & 67108864;
                                    if (i41 != 0) {
                                    }
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i14 & 306783379) == 306783378 && (306783379 & i19) == 306783378 && (599187 & i36) == 599186) ? false : true, i14 & 1)) {
                                    }
                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                    }
                                }
                                i21 = i6 & 8192;
                                if (i21 == 0) {
                                }
                                i22 = i6 & 16384;
                                if (i22 != 0) {
                                }
                                i24 = i6 & 32768;
                                if (i24 == 0) {
                                }
                                i26 = i6 & 65536;
                                if (i26 == 0) {
                                }
                                i27 = i26;
                                i29 = i6 & 131072;
                                if (i29 != 0) {
                                }
                                i30 = i6 & 262144;
                                if (i30 == 0) {
                                }
                                i31 = i6 & 524288;
                                int i5922222 = 805306368;
                                if (i31 == 0) {
                                }
                                i19 |= i5922222;
                                i32 = i6 & 1048576;
                                if (i32 != 0) {
                                }
                                i34 = i6 & 2097152;
                                if (i34 != 0) {
                                }
                                i36 = i33;
                                i37 = 4194304 & i6;
                                if (i37 == 0) {
                                }
                                i39 = i6 & 8388608;
                                if (i39 != 0) {
                                }
                                if ((i5 & 24576) == 0) {
                                }
                                i40 = i6 & 33554432;
                                if (i40 != 0) {
                                }
                                i41 = i6 & 67108864;
                                if (i41 != 0) {
                                }
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i14 & 306783379) == 306783378 && (306783379 & i19) == 306783378 && (599187 & i36) == 599186) ? false : true, i14 & 1)) {
                                }
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                }
                            }
                            i19 = i17;
                            i20 = i6 & 4096;
                            if (i20 != 0) {
                            }
                            i21 = i6 & 8192;
                            if (i21 == 0) {
                            }
                            i22 = i6 & 16384;
                            if (i22 != 0) {
                            }
                            i24 = i6 & 32768;
                            if (i24 == 0) {
                            }
                            i26 = i6 & 65536;
                            if (i26 == 0) {
                            }
                            i27 = i26;
                            i29 = i6 & 131072;
                            if (i29 != 0) {
                            }
                            i30 = i6 & 262144;
                            if (i30 == 0) {
                            }
                            i31 = i6 & 524288;
                            int i59222222 = 805306368;
                            if (i31 == 0) {
                            }
                            i19 |= i59222222;
                            i32 = i6 & 1048576;
                            if (i32 != 0) {
                            }
                            i34 = i6 & 2097152;
                            if (i34 != 0) {
                            }
                            i36 = i33;
                            i37 = 4194304 & i6;
                            if (i37 == 0) {
                            }
                            i39 = i6 & 8388608;
                            if (i39 != 0) {
                            }
                            if ((i5 & 24576) == 0) {
                            }
                            i40 = i6 & 33554432;
                            if (i40 != 0) {
                            }
                            i41 = i6 & 67108864;
                            if (i41 != 0) {
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i14 & 306783379) == 306783378 && (306783379 & i19) == 306783378 && (599187 & i36) == 599186) ? false : true, i14 & 1)) {
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            }
                        }
                        i16 = i6 & 1024;
                        if (i16 == 0) {
                        }
                        i18 = i6 & 2048;
                        if (i18 == 0) {
                        }
                        i19 = i17;
                        i20 = i6 & 4096;
                        if (i20 != 0) {
                        }
                        i21 = i6 & 8192;
                        if (i21 == 0) {
                        }
                        i22 = i6 & 16384;
                        if (i22 != 0) {
                        }
                        i24 = i6 & 32768;
                        if (i24 == 0) {
                        }
                        i26 = i6 & 65536;
                        if (i26 == 0) {
                        }
                        i27 = i26;
                        i29 = i6 & 131072;
                        if (i29 != 0) {
                        }
                        i30 = i6 & 262144;
                        if (i30 == 0) {
                        }
                        i31 = i6 & 524288;
                        int i592222222 = 805306368;
                        if (i31 == 0) {
                        }
                        i19 |= i592222222;
                        i32 = i6 & 1048576;
                        if (i32 != 0) {
                        }
                        i34 = i6 & 2097152;
                        if (i34 != 0) {
                        }
                        i36 = i33;
                        i37 = 4194304 & i6;
                        if (i37 == 0) {
                        }
                        i39 = i6 & 8388608;
                        if (i39 != 0) {
                        }
                        if ((i5 & 24576) == 0) {
                        }
                        i40 = i6 & 33554432;
                        if (i40 != 0) {
                        }
                        i41 = i6 & 67108864;
                        if (i41 != 0) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i14 & 306783379) == 306783378 && (306783379 & i19) == 306783378 && (599187 & i36) == 599186) ? false : true, i14 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        }
                    }
                    i14 = i7;
                    i15 = i6 & 512;
                    if (i15 != 0) {
                    }
                    i16 = i6 & 1024;
                    if (i16 == 0) {
                    }
                    i18 = i6 & 2048;
                    if (i18 == 0) {
                    }
                    i19 = i17;
                    i20 = i6 & 4096;
                    if (i20 != 0) {
                    }
                    i21 = i6 & 8192;
                    if (i21 == 0) {
                    }
                    i22 = i6 & 16384;
                    if (i22 != 0) {
                    }
                    i24 = i6 & 32768;
                    if (i24 == 0) {
                    }
                    i26 = i6 & 65536;
                    if (i26 == 0) {
                    }
                    i27 = i26;
                    i29 = i6 & 131072;
                    if (i29 != 0) {
                    }
                    i30 = i6 & 262144;
                    if (i30 == 0) {
                    }
                    i31 = i6 & 524288;
                    int i5922222222 = 805306368;
                    if (i31 == 0) {
                    }
                    i19 |= i5922222222;
                    i32 = i6 & 1048576;
                    if (i32 != 0) {
                    }
                    i34 = i6 & 2097152;
                    if (i34 != 0) {
                    }
                    i36 = i33;
                    i37 = 4194304 & i6;
                    if (i37 == 0) {
                    }
                    i39 = i6 & 8388608;
                    if (i39 != 0) {
                    }
                    if ((i5 & 24576) == 0) {
                    }
                    i40 = i6 & 33554432;
                    if (i40 != 0) {
                    }
                    i41 = i6 & 67108864;
                    if (i41 != 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i14 & 306783379) == 306783378 && (306783379 & i19) == 306783378 && (599187 & i36) == 599186) ? false : true, i14 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                i12 = i6 & 256;
                if (i12 == 0) {
                }
                i14 = i7;
                i15 = i6 & 512;
                if (i15 != 0) {
                }
                i16 = i6 & 1024;
                if (i16 == 0) {
                }
                i18 = i6 & 2048;
                if (i18 == 0) {
                }
                i19 = i17;
                i20 = i6 & 4096;
                if (i20 != 0) {
                }
                i21 = i6 & 8192;
                if (i21 == 0) {
                }
                i22 = i6 & 16384;
                if (i22 != 0) {
                }
                i24 = i6 & 32768;
                if (i24 == 0) {
                }
                i26 = i6 & 65536;
                if (i26 == 0) {
                }
                i27 = i26;
                i29 = i6 & 131072;
                if (i29 != 0) {
                }
                i30 = i6 & 262144;
                if (i30 == 0) {
                }
                i31 = i6 & 524288;
                int i59222222222 = 805306368;
                if (i31 == 0) {
                }
                i19 |= i59222222222;
                i32 = i6 & 1048576;
                if (i32 != 0) {
                }
                i34 = i6 & 2097152;
                if (i34 != 0) {
                }
                i36 = i33;
                i37 = 4194304 & i6;
                if (i37 == 0) {
                }
                i39 = i6 & 8388608;
                if (i39 != 0) {
                }
                if ((i5 & 24576) == 0) {
                }
                i40 = i6 & 33554432;
                if (i40 != 0) {
                }
                i41 = i6 & 67108864;
                if (i41 != 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i14 & 306783379) == 306783378 && (306783379 & i19) == 306783378 && (599187 & i36) == 599186) ? false : true, i14 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            i9 = i6 & 32;
            if (i9 != 0) {
            }
            i10 = i6 & 64;
            if (i10 != 0) {
            }
            i11 = i6 & 128;
            if (i11 != 0) {
            }
            i12 = i6 & 256;
            if (i12 == 0) {
            }
            i14 = i7;
            i15 = i6 & 512;
            if (i15 != 0) {
            }
            i16 = i6 & 1024;
            if (i16 == 0) {
            }
            i18 = i6 & 2048;
            if (i18 == 0) {
            }
            i19 = i17;
            i20 = i6 & 4096;
            if (i20 != 0) {
            }
            i21 = i6 & 8192;
            if (i21 == 0) {
            }
            i22 = i6 & 16384;
            if (i22 != 0) {
            }
            i24 = i6 & 32768;
            if (i24 == 0) {
            }
            i26 = i6 & 65536;
            if (i26 == 0) {
            }
            i27 = i26;
            i29 = i6 & 131072;
            if (i29 != 0) {
            }
            i30 = i6 & 262144;
            if (i30 == 0) {
            }
            i31 = i6 & 524288;
            int i592222222222 = 805306368;
            if (i31 == 0) {
            }
            i19 |= i592222222222;
            i32 = i6 & 1048576;
            if (i32 != 0) {
            }
            i34 = i6 & 2097152;
            if (i34 != 0) {
            }
            i36 = i33;
            i37 = 4194304 & i6;
            if (i37 == 0) {
            }
            i39 = i6 & 8388608;
            if (i39 != 0) {
            }
            if ((i5 & 24576) == 0) {
            }
            i40 = i6 & 33554432;
            if (i40 != 0) {
            }
            i41 = i6 & 67108864;
            if (i41 != 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i14 & 306783379) == 306783378 && (306783379 & i19) == 306783378 && (599187 & i36) == 599186) ? false : true, i14 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        i8 = i6 & 16;
        if (i8 == 0) {
        }
        i9 = i6 & 32;
        if (i9 != 0) {
        }
        i10 = i6 & 64;
        if (i10 != 0) {
        }
        i11 = i6 & 128;
        if (i11 != 0) {
        }
        i12 = i6 & 256;
        if (i12 == 0) {
        }
        i14 = i7;
        i15 = i6 & 512;
        if (i15 != 0) {
        }
        i16 = i6 & 1024;
        if (i16 == 0) {
        }
        i18 = i6 & 2048;
        if (i18 == 0) {
        }
        i19 = i17;
        i20 = i6 & 4096;
        if (i20 != 0) {
        }
        i21 = i6 & 8192;
        if (i21 == 0) {
        }
        i22 = i6 & 16384;
        if (i22 != 0) {
        }
        i24 = i6 & 32768;
        if (i24 == 0) {
        }
        i26 = i6 & 65536;
        if (i26 == 0) {
        }
        i27 = i26;
        i29 = i6 & 131072;
        if (i29 != 0) {
        }
        i30 = i6 & 262144;
        if (i30 == 0) {
        }
        i31 = i6 & 524288;
        int i5922222222222 = 805306368;
        if (i31 == 0) {
        }
        i19 |= i5922222222222;
        i32 = i6 & 1048576;
        if (i32 != 0) {
        }
        i34 = i6 & 2097152;
        if (i34 != 0) {
        }
        i36 = i33;
        i37 = 4194304 & i6;
        if (i37 == 0) {
        }
        i39 = i6 & 8388608;
        if (i39 != 0) {
        }
        if ((i5 & 24576) == 0) {
        }
        i40 = i6 & 33554432;
        if (i40 != 0) {
        }
        i41 = i6 & 67108864;
        if (i41 != 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i14 & 306783379) == 306783378 && (306783379 & i19) == 306783378 && (599187 & i36) == 599186) ? false : true, i14 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final getMergedResolutions onExtraCallbackWithResult(setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault, getMergedResolutions getmergedresolutions) {
        int i = 2 % 2;
        if (!(iAuthTabCallbackDefault instanceof setCacheComposition.IAuthTabCallbackDefault.onExtraCallback)) {
            if (getmergedresolutions != null) {
                int i2 = IAuthTabCallbackDefault + 59;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                return getmergedresolutions;
            }
            return getMergedResolutions.Companion.onNavigationEvent();
        }
        int i4 = IAuthTabCallbackStub + 85;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            setCacheComposition.IAuthTabCallbackDefault.onExtraCallback onextracallback = (setCacheComposition.IAuthTabCallbackDefault.onExtraCallback) iAuthTabCallbackDefault;
            getMergedResolutions getmergedresolutions2 = onextracallback.onNavigationEvent().get((Boolean) onextracallback.onExtraCallback().onExtraCallbackWithResult());
            Intrinsics.checkNotNull(getmergedresolutions2);
            int i5 = 18 / 0;
            return getmergedresolutions2;
        }
        setCacheComposition.IAuthTabCallbackDefault.onExtraCallback onextracallback2 = (setCacheComposition.IAuthTabCallbackDefault.onExtraCallback) iAuthTabCallbackDefault;
        getMergedResolutions getmergedresolutions3 = onextracallback2.onNavigationEvent().get((Boolean) onextracallback2.onExtraCallback().onExtraCallbackWithResult());
        Intrinsics.checkNotNull(getmergedresolutions3);
        return getmergedresolutions3;
    }

    static final class onExtraCallbackWithResult implements yuvImageToJpegByteArray {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ boolean IAuthTabCallback;

        static final class onExtraCallback extends ContinuationImpl {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
                super(access13800Var);
            }

            public final Object invokeSuspend(Object obj) throws setWrite {
                int i = 2 % 2;
                int i2 = onExtraCallback + 109;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                Object objIAuthTabCallback = onExtraCallbackWithResult.this.IAuthTabCallback(null, null, this);
                if (i3 == 0) {
                    int i4 = 74 / 0;
                }
                int i5 = IAuthTabCallback + 29;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return objIAuthTabCallback;
            }
        }

        onExtraCallbackWithResult(boolean z) {
            this.IAuthTabCallback = z;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: o.setWrite */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
        
            if (r7.onExtraCallbackWithResult(r6, r1) == r2) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
        
            if (o.formatMsgs.onExtraCallbackWithResult(r1) == r2) goto L31;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object IAuthTabCallback(sizeToVertexes sizetovertexes, rotateBitmap rotatebitmap, access13800<?> access13800Var) throws setWrite {
            onExtraCallback onextracallback;
            int i = 2 % 2;
            if (access13800Var instanceof onExtraCallback) {
                onextracallback = (onExtraCallback) access13800Var;
                int i2 = onextracallback.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    onextracallback.label = i2 - 2147483648;
                } else {
                    onextracallback = new onExtraCallback(access13800Var);
                    int i3 = onNavigationEvent + 3;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
            Object obj = onextracallback.result;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i5 = onextracallback.label;
            if (i5 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (this.IAuthTabCallback) {
                    onextracallback.L$0 = access15400.onNavigationEvent(sizetovertexes);
                    onextracallback.L$1 = access15400.onNavigationEvent(rotatebitmap);
                    onextracallback.label = 1;
                } else {
                    onextracallback.L$0 = access15400.onNavigationEvent(sizetovertexes);
                    onextracallback.L$1 = access15400.onNavigationEvent(rotatebitmap);
                    onextracallback.label = 2;
                }
                return objOnWarmupCompleted;
            }
            int i6 = onWarmupCompleted;
            int i7 = i6 + 105;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            if (i5 == 1) {
                ResultKt.onNavigationEvent(obj);
                throw new setWrite();
            }
            int i9 = i6 + 31;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 == 0 ? i5 != 2 : i5 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            throw new setWrite();
        }
    }

    private static final Unit onNavigationEvent(setAnimationFromUrl setanimationfromurl, UseCaseAttachState useCaseAttachState) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 67;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useCaseAttachState, "");
        setanimationfromurl.onWarmupCompleted(useCaseAttachState.getHasFocus());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 97;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(int i, Function1 function1, selectParentResolutions selectparentresolutions) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 111;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(selectparentresolutions, "");
            selectparentresolutions.onNavigationEvent().length();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(selectparentresolutions, "");
        if (selectparentresolutions.onNavigationEvent().length() <= i) {
            function1.invoke(selectparentresolutions);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 17;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        SurfaceProcessorNodeOut surfaceProcessorNodeOut = (SurfaceProcessorNodeOut) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStub + 63;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(selectParentResolutions selectparentresolutions, Function1 function1, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, setCacheComposition.onExtraCallback onextracallback, Function0 function0, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, boolean z, getBacktraceNote getbacktracenote3, getBacktraceNote getbacktracenote4, getBacktraceNote getbacktracenote5, getBacktraceNote getbacktracenote6, setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault, setCacheComposition.onWarmupCompleted onwarmupcompleted, setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult, int i, setAnimationFromUrl setanimationfromurl, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = IAuthTabCallbackStub + 123;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function2, "");
            if ((i2 & 110) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(function2)) {
                    int i7 = IAuthTabCallbackDefault + 63;
                    IAuthTabCallbackStub = i7 % 128;
                    int i8 = i7 % 2;
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i2 | i3;
            } else {
                i4 = i2;
            }
        } else {
            Intrinsics.checkNotNullParameter(function2, "");
            if ((i2 & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i4 & 19) != 18, i4 & 1)) {
            int i9 = IAuthTabCallbackStub + 105;
            IAuthTabCallbackDefault = i9 % 128;
            int i10 = i9 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1870821112, i4, -1, "im.toss.compose.v3.textfield.TdsTextFieldV3.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TextFields.kt:715)");
            }
            setClipToCompositionBounds.onWarmupCompleted.onNavigationEvent(selectparentresolutions, function1, iAuthTabCallbackStub, onextracallback, function0, getbacktracenote, getbacktracenote2, z, getbacktracenote3, getbacktracenote4, getbacktracenote5, getbacktracenote6, iAuthTabCallbackDefault, onwarmupcompleted, onextracallbackwithresult, i, setanimationfromurl, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, function2, cameraCaptureResultEmptyCameraCaptureResult, 0, ((i4 << 24) & 234881024) | 805306368);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, final setAnimationFromUrl setanimationfromurl, setCacheComposition.onNavigationEvent onnavigationevent, final int i, final Function0 function0, setCacheComposition.IAuthTabCallback iAuthTabCallback, Function1 function1, final selectParentResolutions selectparentresolutions, final int i2, final Function1 function12, CameraUnavailableException cameraUnavailableException, CameraState cameraState, getMergedResolutions getmergedresolutions, final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, final setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, final setCacheComposition.onExtraCallback onextracallback, final getBacktraceNote getbacktracenote, final getBacktraceNote getbacktracenote2, final boolean z, final getBacktraceNote getbacktracenote3, final getBacktraceNote getbacktracenote4, final getBacktraceNote getbacktracenote5, final getBacktraceNote getbacktracenote6, final setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault, final setCacheComposition.onWarmupCompleted onwarmupcompleted, final setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        boolean z2;
        boolean zOnNavigationEvent;
        Object objOnMinimized;
        setCacheComposition.IAuthTabCallback iAuthTabCallback2;
        boolean z3;
        Function1 function13;
        boolean zOnExtraCallback;
        boolean zOnNavigationEvent2;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStub;
        int i6 = i5 + 7;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        if ((i3 & 3) != 2) {
            int i8 = i5 + 99;
            int i9 = i8 % 128;
            IAuthTabCallbackDefault = i9;
            int i10 = i8 % 2;
            int i11 = i9 + 5;
            IAuthTabCallbackStub = i11 % 128;
            int i12 = i11 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i3 & 1)) {
            int i13 = IAuthTabCallbackDefault + 75;
            IAuthTabCallbackStub = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 49 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2137270987, i3, -1, "im.toss.compose.v3.textfield.TdsTextFieldV3.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TextFields.kt:687)");
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(quirksExternalSyntheticBackport02);
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(setanimationfromurl);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new Function1() { // from class: im.toss.compose.v3.textfield.TextFieldsKt$$ExternalSyntheticLambda13
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallback = 1;

                        public final Object invoke(Object obj) {
                            int i15 = 2 % 2;
                            int i16 = onExtraCallback + 25;
                            IAuthTabCallback = i16 % 128;
                            int i17 = i16 % 2;
                            setAnimationFromUrl setanimationfromurl2 = setanimationfromurl;
                            UseCaseAttachState useCaseAttachState = (UseCaseAttachState) obj;
                            if (i17 == 0) {
                                return setDefaultFontFileExtension.onWarmupCompleted(setanimationfromurl2, useCaseAttachState);
                            }
                            setDefaultFontFileExtension.onWarmupCompleted(setanimationfromurl2, useCaseAttachState);
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = SurfaceConfig.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized);
                getHumanReadableName gethumanreadablenameOnNavigationEvent = getHumanReadableName.onNavigationEvent(onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName>) cameraPresenceProviderExternalSyntheticLambda6), ((setByteOrder) onnavigationevent.onNavigationEvent(setanimationfromurl.onWarmupCompleted(), cameraCaptureResultEmptyCameraCaptureResult, 0).onExtraCallbackWithResult()).access100(), 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, setMaxPreloadedAdCount.Companion.onExtraCallbackWithResult(), (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, i, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16744414, (Object) null);
                boolean z4 = !(setanimationfromurl.onWarmupCompleted() ^ true) && function0 == null;
                createString createstring = new createString(((setByteOrder) onnavigationevent.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 0).onExtraCallbackWithResult()).access100(), (DefaultConstructorMarker) null);
                if (function0 == null) {
                    int i15 = IAuthTabCallbackDefault + 93;
                    IAuthTabCallbackStub = i15 % 128;
                    int i16 = i15 % 2;
                    iAuthTabCallback2 = iAuthTabCallback;
                    z3 = true;
                } else {
                    iAuthTabCallback2 = iAuthTabCallback;
                    z3 = false;
                }
                boolean z5 = iAuthTabCallback2 instanceof setCacheComposition.IAuthTabCallback.onExtraCallbackWithResult;
                int iOnWarmupCompleted = iAuthTabCallback.onWarmupCompleted();
                if (function1 != null) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1448698443);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized2 = new Function1() { // from class: im.toss.compose.v3.textfield.TextFieldsKt$$ExternalSyntheticLambda14
                            private static int onExtraCallback = 1;
                            private static int onExtraCallbackWithResult;

                            public final Object invoke(Object obj) {
                                int i17 = 2 % 2;
                                int i18 = onExtraCallbackWithResult + 37;
                                onExtraCallback = i18 % 128;
                                int i19 = i18 % 2;
                                Unit unitOnNavigationEvent = setDefaultFontFileExtension.onNavigationEvent((SurfaceProcessorNodeOut) obj);
                                int i20 = onExtraCallback + 81;
                                onExtraCallbackWithResult = i20 % 128;
                                if (i20 % 2 == 0) {
                                    return unitOnNavigationEvent;
                                }
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    function13 = (Function1) objOnMinimized2;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(923098621);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    function13 = function1;
                }
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i2);
                zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function12);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback | zOnNavigationEvent2) {
                    Object obj = objOnMinimized3;
                    if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Function1 function14 = new Function1() { // from class: im.toss.compose.v3.textfield.TextFieldsKt$$ExternalSyntheticLambda15
                            private static int onExtraCallback = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke(Object obj2) {
                                Unit unitOnExtraCallbackWithResult;
                                int i17 = 2 % 2;
                                int i18 = onExtraCallback + 93;
                                onWarmupCompleted = i18 % 128;
                                if (i18 % 2 != 0) {
                                    unitOnExtraCallbackWithResult = setDefaultFontFileExtension.onExtraCallbackWithResult(i2, function12, (selectParentResolutions) obj2);
                                    int i19 = 98 / 0;
                                } else {
                                    unitOnExtraCallbackWithResult = setDefaultFontFileExtension.onExtraCallbackWithResult(i2, function12, (selectParentResolutions) obj2);
                                }
                                int i20 = onWarmupCompleted + 53;
                                onExtraCallback = i20 % 128;
                                int i21 = i20 % 2;
                                return unitOnExtraCallbackWithResult;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function14);
                        obj = function14;
                    }
                    onCamerasRemoved.onNavigationEvent(selectparentresolutions, (Function1) obj, quirksExternalSyntheticBackport0OnWarmupCompleted, z4, z3, gethumanreadablenameOnNavigationEvent, cameraUnavailableException, cameraState, z5, iOnWarmupCompleted, 0, getmergedresolutions, function13, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, createstring, ForwardingCameraControl.onExtraCallback(-1870821112, true, new getBacktraceNote() { // from class: im.toss.compose.v3.textfield.TextFieldsKt$$ExternalSyntheticLambda16
                        private static int IAuthTabCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i17 = 2 % 2;
                            int i18 = IAuthTabCallback + 109;
                            onNavigationEvent = i18 % 128;
                            int i19 = i18 % 2;
                            Unit unitOnExtraCallback = setDefaultFontFileExtension.onExtraCallback(selectparentresolutions, function12, iAuthTabCallbackStub, onextracallback, function0, getbacktracenote, getbacktracenote2, z, getbacktracenote3, getbacktracenote4, getbacktracenote5, getbacktracenote6, iAuthTabCallbackDefault, onwarmupcompleted, onextracallbackwithresult, i, setanimationfromurl, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, (Function2) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i20 = IAuthTabCallback + 87;
                            onNavigationEvent = i20 % 128;
                            if (i20 % 2 == 0) {
                                return unitOnExtraCallback;
                            }
                            throw null;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 0, 196608, 1024);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i17 = IAuthTabCallbackDefault + 121;
                        IAuthTabCallbackStub = i17 % 128;
                        int i18 = i17 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = quirksExternalSyntheticBackport0.onExtraCallback(quirksExternalSyntheticBackport02);
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(setanimationfromurl);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnNavigationEvent) {
                    objOnMinimized = new Function1() { // from class: im.toss.compose.v3.textfield.TextFieldsKt$$ExternalSyntheticLambda13
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallback = 1;

                        public final Object invoke(Object obj2) {
                            int i152 = 2 % 2;
                            int i162 = onExtraCallback + 25;
                            IAuthTabCallback = i162 % 128;
                            int i172 = i162 % 2;
                            setAnimationFromUrl setanimationfromurl2 = setanimationfromurl;
                            UseCaseAttachState useCaseAttachState = (UseCaseAttachState) obj2;
                            if (i172 == 0) {
                                return setDefaultFontFileExtension.onWarmupCompleted(setanimationfromurl2, useCaseAttachState);
                            }
                            setDefaultFontFileExtension.onWarmupCompleted(setanimationfromurl2, useCaseAttachState);
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = SurfaceConfig.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback2, (Function1) objOnMinimized);
                    getHumanReadableName gethumanreadablenameOnNavigationEvent2 = getHumanReadableName.onNavigationEvent(onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName>) cameraPresenceProviderExternalSyntheticLambda6), ((setByteOrder) onnavigationevent.onNavigationEvent(setanimationfromurl.onWarmupCompleted(), cameraCaptureResultEmptyCameraCaptureResult, 0).onExtraCallbackWithResult()).access100(), 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, setMaxPreloadedAdCount.Companion.onExtraCallbackWithResult(), (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, i, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16744414, (Object) null);
                    if (setanimationfromurl.onWarmupCompleted() ^ true) {
                        createString createstring2 = new createString(((setByteOrder) onnavigationevent.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 0).onExtraCallbackWithResult()).access100(), (DefaultConstructorMarker) null);
                        if (function0 == null) {
                        }
                        boolean z52 = iAuthTabCallback2 instanceof setCacheComposition.IAuthTabCallback.onExtraCallbackWithResult;
                        int iOnWarmupCompleted2 = iAuthTabCallback.onWarmupCompleted();
                        if (function1 != null) {
                        }
                        zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i2);
                        zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function12);
                        Object objOnMinimized32 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (zOnExtraCallback | zOnNavigationEvent2) {
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(setCacheComposition.onTransact ontransact, final selectParentResolutions selectparentresolutions, final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, final setAnimationFromUrl setanimationfromurl, final setCacheComposition.onNavigationEvent onnavigationevent, final int i, final Function0 function0, final setCacheComposition.IAuthTabCallback iAuthTabCallback, final Function1 function1, final int i2, final Function1 function12, final CameraUnavailableException cameraUnavailableException, final CameraState cameraState, final getMergedResolutions getmergedresolutions, final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, final setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, final setCacheComposition.onExtraCallback onextracallback, final getBacktraceNote getbacktracenote, final getBacktraceNote getbacktracenote2, final boolean z, final getBacktraceNote getbacktracenote3, final getBacktraceNote getbacktracenote4, final getBacktraceNote getbacktracenote5, final getBacktraceNote getbacktracenote6, final setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault, final setCacheComposition.onWarmupCompleted onwarmupcompleted, final setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        boolean z2;
        int i4 = 2 % 2;
        if ((i3 & 3) != 2) {
            int i5 = IAuthTabCallbackDefault + 19;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i3 & 1)) {
            int i7 = IAuthTabCallbackStub + 65;
            IAuthTabCallbackDefault = i7 % 128;
            Object obj = null;
            if (i7 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = IAuthTabCallbackDefault + 17;
                IAuthTabCallbackStub = i8 % 128;
                if (i8 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1743989494, i3, -1, "im.toss.compose.v3.textfield.TdsTextFieldV3.<anonymous>.<anonymous>.<anonymous> (TextFields.kt:684)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1743989494, i3, -1, "im.toss.compose.v3.textfield.TdsTextFieldV3.<anonymous>.<anonymous>.<anonymous> (TextFields.kt:684)");
            }
            final CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted = ontransact.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, 0);
            setThreadList.IAuthTabCallback(selectparentresolutions.onNavigationEvent(), ForwardingCameraControl.onExtraCallback(2137270987, true, new Function2() { // from class: im.toss.compose.v3.textfield.TextFieldsKt$$ExternalSyntheticLambda17
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj2, Object obj3) {
                    int i9 = 2 % 2;
                    int i10 = IAuthTabCallback + 91;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    Unit unitOnExtraCallbackWithResult = setDefaultFontFileExtension.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, quirksExternalSyntheticBackport02, setanimationfromurl, onnavigationevent, i, function0, iAuthTabCallback, function1, selectparentresolutions, i2, function12, cameraUnavailableException, cameraState, getmergedresolutions, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted, iAuthTabCallbackStub, onextracallback, getbacktracenote, getbacktracenote2, z, getbacktracenote3, getbacktracenote4, getbacktracenote5, getbacktracenote6, iAuthTabCallbackDefault, onwarmupcompleted, onextracallbackwithresult, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i12 = IAuthTabCallback + 29;
                    onExtraCallbackWithResult = i12 % 128;
                    int i13 = i12 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        final setCacheComposition.onTransact ontransact = (setCacheComposition.onTransact) objArr[0];
        final selectParentResolutions selectparentresolutions = (selectParentResolutions) objArr[1];
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[2];
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (QuirksExternalSyntheticBackport0) objArr[3];
        final setAnimationFromUrl setanimationfromurl = (setAnimationFromUrl) objArr[4];
        final setCacheComposition.onNavigationEvent onnavigationevent = (setCacheComposition.onNavigationEvent) objArr[5];
        final int iIntValue = ((Number) objArr[6]).intValue();
        final Function0 function0 = (Function0) objArr[7];
        final setCacheComposition.IAuthTabCallback iAuthTabCallback = (setCacheComposition.IAuthTabCallback) objArr[8];
        final Function1 function1 = (Function1) objArr[9];
        final int iIntValue2 = ((Number) objArr[10]).intValue();
        final Function1 function12 = (Function1) objArr[11];
        final CameraUnavailableException cameraUnavailableException = (CameraUnavailableException) objArr[12];
        final CameraState cameraState = (CameraState) objArr[13];
        final getMergedResolutions getmergedresolutions = (getMergedResolutions) objArr[14];
        final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objArr[15];
        final setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub = (setCacheComposition.IAuthTabCallbackStub) objArr[16];
        final setCacheComposition.onExtraCallback onextracallback = (setCacheComposition.onExtraCallback) objArr[17];
        final getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[18];
        final getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[19];
        final boolean zBooleanValue = ((Boolean) objArr[20]).booleanValue();
        final getBacktraceNote getbacktracenote3 = (getBacktraceNote) objArr[21];
        final getBacktraceNote getbacktracenote4 = (getBacktraceNote) objArr[22];
        final getBacktraceNote getbacktracenote5 = (getBacktraceNote) objArr[23];
        final getBacktraceNote getbacktracenote6 = (getBacktraceNote) objArr[24];
        final setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault = (setCacheComposition.IAuthTabCallbackDefault) objArr[25];
        final setCacheComposition.onWarmupCompleted onwarmupcompleted = (setCacheComposition.onWarmupCompleted) objArr[26];
        final setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult = (setCacheComposition.onExtraCallbackWithResult) objArr[27];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[28];
        int iIntValue3 = ((Number) objArr[29]).intValue();
        int i = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1139683402, iIntValue3, -1, "im.toss.compose.v3.textfield.TdsTextFieldV3.<anonymous>.<anonymous> (TextFields.kt:678)");
                int i2 = IAuthTabCallbackStub + 93;
                IAuthTabCallbackDefault = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 5 / 2;
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult2;
            }
            accessisMonitoringp accessismonitoringpOnExtraCallback = getLocation.onExtraCallback();
            MaxAdPlacerExternalSyntheticLambda2 maxAdPlacerExternalSyntheticLambda2 = MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult;
            setPostviewFormatSelector.onNavigationEvent(accessismonitoringpOnExtraCallback.onExtraCallback(new ImageCaptureImageCaptureError(maxAdPlacerExternalSyntheticLambda2.onExtraCallbackWithResult().IAuthTabCallbackStub(), setByteOrder.onExtraCallbackWithResult(maxAdPlacerExternalSyntheticLambda2.onExtraCallbackWithResult().onExtraCallbackWithResult(), 0.4f, 0.0f, 0.0f, 0.0f, 14, (Object) null), (DefaultConstructorMarker) null)), ForwardingCameraControl.onExtraCallback(-1743989494, true, new Function2() { // from class: im.toss.compose.v3.textfield.TextFieldsKt$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2) {
                    int i4 = 2 % 2;
                    int i5 = onNavigationEvent + 105;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    Unit unitOnNavigationEvent = setDefaultFontFileExtension.onNavigationEvent(ontransact, selectparentresolutions, quirksExternalSyntheticBackport0, quirksExternalSyntheticBackport02, setanimationfromurl, onnavigationevent, iIntValue, function0, iAuthTabCallback, function1, iIntValue2, function12, cameraUnavailableException, cameraState, getmergedresolutions, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, iAuthTabCallbackStub, onextracallback, getbacktracenote, getbacktracenote2, zBooleanValue, getbacktracenote3, getbacktracenote4, getbacktracenote5, getbacktracenote6, iAuthTabCallbackDefault, onwarmupcompleted, onextracallbackwithresult, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i7 = onNavigationEvent + 39;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    return unitOnNavigationEvent;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult3, 54), cameraCaptureResultEmptyCameraCaptureResult3, accessgetCameraFactoryp.onNavigationEvent | 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = IAuthTabCallbackStub + 21;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i;
        int i2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        setAnimationFromUrl setanimationfromurl;
        final boolean z;
        final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objArr[0];
        final setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub = (setCacheComposition.IAuthTabCallbackStub) objArr[1];
        final getMergedResolutions getmergedresolutions = (getMergedResolutions) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        final setCacheComposition.onWarmupCompleted onwarmupcompleted = (setCacheComposition.onWarmupCompleted) objArr[4];
        boolean zBooleanValue2 = ((Boolean) objArr[5]).booleanValue();
        final setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault = (setCacheComposition.IAuthTabCallbackDefault) objArr[6];
        final selectParentResolutions selectparentresolutions = (selectParentResolutions) objArr[7];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (QuirksExternalSyntheticBackport0) objArr[8];
        setAnimationFromUrl setanimationfromurl2 = (setAnimationFromUrl) objArr[9];
        int iIntValue = ((Number) objArr[10]).intValue();
        final Function0 function0 = (Function0) objArr[11];
        final setCacheComposition.IAuthTabCallback iAuthTabCallback = (setCacheComposition.IAuthTabCallback) objArr[12];
        final Function1 function1 = (Function1) objArr[13];
        final int iIntValue2 = ((Number) objArr[14]).intValue();
        final Function1 function12 = (Function1) objArr[15];
        int i3 = 16;
        final CameraUnavailableException cameraUnavailableException = (CameraUnavailableException) objArr[16];
        final CameraState cameraState = (CameraState) objArr[17];
        final setCacheComposition.onExtraCallback onextracallback = (setCacheComposition.onExtraCallback) objArr[18];
        final getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[19];
        final getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[20];
        final getBacktraceNote getbacktracenote3 = (getBacktraceNote) objArr[21];
        final getBacktraceNote getbacktracenote4 = (getBacktraceNote) objArr[22];
        final getBacktraceNote getbacktracenote5 = (getBacktraceNote) objArr[23];
        final getBacktraceNote getbacktracenote6 = (getBacktraceNote) objArr[24];
        final setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult = (setCacheComposition.onExtraCallbackWithResult) objArr[25];
        initSDK initsdk = (initSDK) objArr[26];
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = (QuirksExternalSyntheticBackport0) objArr[27];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[28];
        int iIntValue3 = ((Number) objArr[29]).intValue();
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport03, "");
        if ((iIntValue3 & 6) == 0) {
            i = iIntValue3 | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(initsdk) ? 4 : 2);
        } else {
            i = iIntValue3;
        }
        if ((iIntValue3 & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(quirksExternalSyntheticBackport03)) {
                int i5 = IAuthTabCallbackStub + 81;
                i2 = iIntValue;
                IAuthTabCallbackDefault = i5 % 128;
                i3 = i5 % 2 != 0 ? 82 : 32;
            } else {
                i2 = iIntValue;
            }
            i |= i3;
        } else {
            i2 = iIntValue;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 147) != 146, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = IAuthTabCallbackDefault + 103;
                IAuthTabCallbackStub = i6 % 128;
                setanimationfromurl = setanimationfromurl2;
                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1785412108, i, -1, "im.toss.compose.v3.textfield.TdsTextFieldV3.<anonymous> (TextFields.kt:643)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1785412108, i, -1, "im.toss.compose.v3.textfield.TdsTextFieldV3.<anonymous> (TextFields.kt:643)");
            } else {
                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                setanimationfromurl = setanimationfromurl2;
            }
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda2);
            if ((i & 14) == 4) {
                int i7 = IAuthTabCallbackStub + 121;
                IAuthTabCallbackDefault = i7 % 128;
                boolean z2 = i7 % 2 == 0;
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnNavigationEvent | z2)) {
                    int i8 = IAuthTabCallbackStub + 105;
                    IAuthTabCallbackDefault = i8 % 128;
                    int i9 = i8 % 2;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new onWarmupCompleted(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, initsdk, null);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    final setCacheComposition.onTransact ontransactOnExtraCallbackWithResult = iAuthTabCallbackStub.onExtraCallbackWithResult();
                    final setCacheComposition.onNavigationEvent onNavigationEvent2 = iAuthTabCallbackStub.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 0);
                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getmergedresolutions);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!zOnNavigationEvent2) {
                        int i10 = IAuthTabCallbackStub + 11;
                        IAuthTabCallbackDefault = i10 % 128;
                        int i11 = i10 % 2;
                        if (objOnMinimized2 != CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            int i12 = IAuthTabCallbackDefault + 29;
                            IAuthTabCallbackStub = i12 % 128;
                            if (i12 % 2 == 0) {
                                throw null;
                            }
                        } else {
                            objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.compose.v3.textfield.TextFieldsKt$$ExternalSyntheticLambda1
                                private static int onNavigationEvent = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke() {
                                    int i13 = 2 % 2;
                                    int i14 = onWarmupCompleted + 33;
                                    onNavigationEvent = i14 % 128;
                                    int i15 = i14 % 2;
                                    setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault2 = iAuthTabCallbackDefault;
                                    if (i15 != 0) {
                                        return setDefaultFontFileExtension.onNavigationEvent(iAuthTabCallbackDefault2, getmergedresolutions);
                                    }
                                    int i16 = 23 / 0;
                                    return setDefaultFontFileExtension.onNavigationEvent(iAuthTabCallbackDefault2, getmergedresolutions);
                                }
                            });
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                        }
                        final getMergedResolutions getmergedresolutionsOnExtraCallback = AppLovinVastMediaViewfExternalSyntheticLambda0.onExtraCallback((getMergedResolutions) onWarmupCompleted(100144392, -100144387, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{(CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized2}), cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
                        if ((!zBooleanValue) || onwarmupcompleted != setCacheComposition.onWarmupCompleted.APPEAR) {
                            z = false;
                        } else {
                            int i13 = IAuthTabCallbackDefault + 5;
                            IAuthTabCallbackStub = i13 % 128;
                            int i14 = i13 % 2;
                            z = true;
                        }
                        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(zBooleanValue2);
                        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (zOnExtraCallback || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized3 = new onExtraCallbackWithResult(zBooleanValue2);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                        }
                        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport0;
                        final setAnimationFromUrl setanimationfromurl3 = setanimationfromurl;
                        final int i15 = i2;
                        yuv_420_888toNv21.onNavigationEvent((yuvImageToJpegByteArray) objOnMinimized3, ForwardingCameraControl.onExtraCallback(1139683402, true, new Function2() { // from class: im.toss.compose.v3.textfield.TextFieldsKt$$ExternalSyntheticLambda2
                            private static int onExtraCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj, Object obj2) {
                                int i16 = 2 % 2;
                                int i17 = onNavigationEvent + 113;
                                onExtraCallback = i17 % 128;
                                int i18 = i17 % 2;
                                Unit unitOnExtraCallback = setDefaultFontFileExtension.onExtraCallback(ontransactOnExtraCallbackWithResult, selectparentresolutions, quirksExternalSyntheticBackport03, quirksExternalSyntheticBackport04, setanimationfromurl3, onNavigationEvent2, i15, function0, iAuthTabCallback, function1, iIntValue2, function12, cameraUnavailableException, cameraState, getmergedresolutionsOnExtraCallback, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, iAuthTabCallbackStub, onextracallback, getbacktracenote, getbacktracenote2, z, getbacktracenote3, getbacktracenote4, getbacktracenote5, getbacktracenote6, iAuthTabCallbackDefault, onwarmupcompleted, onextracallbackwithresult, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                int i19 = onNavigationEvent + 101;
                                onExtraCallback = i19 % 128;
                                int i20 = i19 % 2;
                                return unitOnExtraCallback;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 48);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i16 = IAuthTabCallbackStub + 101;
            IAuthTabCallbackDefault = i16 % 128;
            int i17 = i16 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:388:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@NotNull final selectParentResolutions selectparentresolutions, @NotNull final Function1<? super selectParentResolutions, Unit> function1, @NotNull final setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable setCacheComposition.onExtraCallback onextracallback, @Nullable Function0<Unit> function0, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, boolean z, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote5, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote6, @Nullable setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault, @Nullable getMergedResolutions getmergedresolutions, @Nullable setCacheComposition.onWarmupCompleted onwarmupcompleted, @Nullable setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult, @Nullable CameraUnavailableException cameraUnavailableException, @Nullable CameraState cameraState, boolean z2, @Nullable setAnimationFromUrl setanimationfromurl, int i, int i2, @Nullable setCacheComposition.IAuthTabCallback iAuthTabCallback, @Nullable Function1<? super SurfaceProcessorNodeOut, Unit> function12, @Nullable Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i3, final int i4, final int i5, final int i6) {
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
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        boolean z3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final setCacheComposition.onExtraCallback onextracallback2;
        Function0<Unit> function02;
        final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote7;
        final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote8;
        final boolean z4;
        final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote9;
        final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote10;
        final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote11;
        final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote12;
        final setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault2;
        final getMergedResolutions getmergedresolutions2;
        final setCacheComposition.onWarmupCompleted onwarmupcompleted2;
        final setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult2;
        final CameraUnavailableException cameraUnavailableException2;
        final CameraState cameraState2;
        final boolean z5;
        final setAnimationFromUrl setanimationfromurl2;
        final int i38;
        final int i39;
        final setCacheComposition.IAuthTabCallback iAuthTabCallback2;
        final Function1<? super SurfaceProcessorNodeOut, Unit> function13;
        final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        boolean z6;
        boolean z7;
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote13;
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote14;
        setAnimationFromUrl setanimationfromurl3;
        setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault3;
        setCacheComposition.IAuthTabCallback IAuthTabCallback2;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
        setAnimationFromUrl setanimationfromurl4;
        setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault4;
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote15;
        setCacheComposition.IAuthTabCallback iAuthTabCallback3;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
        setCacheComposition.onExtraCallback onextracallback3;
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote16;
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote17;
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote18;
        getMergedResolutions getmergedresolutions3;
        setCacheComposition.onWarmupCompleted onwarmupcompleted3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote19;
        boolean z8;
        setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult3;
        CameraUnavailableException cameraUnavailableException3;
        int i40;
        CameraState cameraState3;
        boolean z9;
        int i41;
        Function1<? super SurfaceProcessorNodeOut, Unit> function14;
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote20;
        int i42;
        int i43 = 2 % 2;
        Intrinsics.checkNotNullParameter(selectparentresolutions, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1071740457);
        if ((i3 & 6) == 0) {
            i7 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(selectparentresolutions) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackStub) ? 256 : 128;
        }
        int i44 = i6 & 8;
        if (i44 != 0) {
            i7 |= 3072;
        } else {
            if ((i3 & 3072) == 0) {
                i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 2048 : 1024;
            }
            i8 = i6 & 16;
            if (i8 == 0) {
                i7 |= 24576;
            } else {
                if ((i3 & 24576) == 0) {
                    i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback) ? 16384 : 8192;
                }
                i9 = i6 & 32;
                int i45 = 131072;
                if (i9 != 0) {
                    i7 |= 196608;
                } else if ((i3 & 196608) == 0) {
                    i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 131072 : 65536;
                }
                i10 = i6 & 64;
                if (i10 != 0) {
                    i7 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 1048576 : 524288;
                }
                i11 = i6 & 128;
                if (i11 != 0) {
                    i7 |= 12582912;
                } else if ((i3 & 12582912) == 0) {
                    i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote2) ? 8388608 : 4194304;
                }
                i12 = i6 & 256;
                if (i12 != 0) {
                    i7 |= 100663296;
                } else if ((i3 & 100663296) == 0) {
                    i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 67108864 : 33554432;
                }
                i13 = i6 & 512;
                if (i13 != 0) {
                    i7 |= 805306368;
                } else if ((i3 & 805306368) == 0) {
                    i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote3) ? 536870912 : 268435456;
                }
                i14 = i6 & 1024;
                if (i14 != 0) {
                    i15 = i4 | 6;
                } else if ((i4 & 6) == 0) {
                    i15 = i4 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote4) ? 4 : 2);
                } else {
                    i15 = i4;
                }
                i16 = i6 & 2048;
                if (i16 != 0) {
                    i15 |= 48;
                } else if ((i4 & 48) == 0) {
                    i15 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote5) ? 32 : 16;
                }
                int i46 = i15;
                i17 = i6 & 4096;
                if (i17 != 0) {
                    i46 |= 384;
                    i18 = i17;
                } else {
                    i18 = i17;
                    if ((i4 & 384) == 0) {
                        i46 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote6) ? 256 : 128;
                    }
                    i19 = i6 & 8192;
                    if (i19 == 0) {
                        i46 |= 3072;
                        i21 = i16;
                        i20 = i19;
                    } else {
                        i20 = i19;
                        if ((i4 & 3072) == 0) {
                            int i47 = IAuthTabCallbackDefault + 99;
                            i21 = i16;
                            IAuthTabCallbackStub = i47 % 128;
                            if (i47 % 2 == 0) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackDefault);
                                throw null;
                            }
                            i46 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackDefault) ? 2048 : 1024;
                        } else {
                            i21 = i16;
                        }
                    }
                    i22 = i6 & 16384;
                    if (i22 == 0) {
                        i46 |= 24576;
                    } else {
                        if ((i4 & 24576) == 0) {
                            int i48 = IAuthTabCallbackStub + 17;
                            IAuthTabCallbackDefault = i48 % 128;
                            if (i48 % 2 != 0) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getmergedresolutions);
                                function1.hashCode();
                                throw null;
                            }
                            i23 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getmergedresolutions) ? 16384 : 8192) | i46;
                        }
                        i24 = 32768 & i6;
                        if (i24 != 0) {
                            i23 |= 196608;
                        } else {
                            if ((i4 & 196608) == 0) {
                                i23 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted == null ? -1 : onwarmupcompleted.ordinal()) ^ true) ? 131072 : 65536;
                            }
                            i25 = i6 & 65536;
                            if (i25 == 0) {
                                i23 |= 1572864;
                            } else if ((i4 & 1572864) == 0) {
                                i23 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallbackwithresult == null ? -1 : onextracallbackwithresult.ordinal()) ? 1048576 : 524288;
                            }
                            i26 = i6 & 131072;
                            if (i26 == 0) {
                                i23 |= 12582912;
                            } else {
                                if ((i4 & 12582912) == 0) {
                                    i27 = i26;
                                    i23 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraUnavailableException) ? 8388608 : 4194304;
                                }
                                i28 = i6 & 262144;
                                if (i28 != 0) {
                                    i23 |= 100663296;
                                } else {
                                    if ((i4 & 100663296) == 0) {
                                        int i49 = IAuthTabCallbackDefault + 113;
                                        i29 = i25;
                                        IAuthTabCallbackStub = i49 % 128;
                                        int i50 = i49 % 2;
                                        i23 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraState) ? 67108864 : 33554432;
                                    }
                                    i30 = 524288 & i6;
                                    if (i30 == 0) {
                                        i42 = (i4 & 805306368) == 0 ? cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 536870912 : 268435456 : 805306368;
                                        if ((i5 & 6) == 0) {
                                            i31 = i5 | (((i6 & 1048576) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setanimationfromurl)) ? 4 : 2);
                                        } else {
                                            i31 = i5;
                                        }
                                        i32 = i6 & 2097152;
                                        if (i32 != 0) {
                                            int i51 = IAuthTabCallbackDefault + 73;
                                            IAuthTabCallbackStub = i51 % 128;
                                            int i52 = i51 % 2;
                                            i31 |= 48;
                                        } else {
                                            if ((i5 & 48) == 0) {
                                                i33 = i31 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 32 : 16);
                                            }
                                            i34 = i6 & 4194304;
                                            if (i34 == 0) {
                                                i33 |= 384;
                                            } else {
                                                if ((i5 & 384) == 0) {
                                                    i33 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i2) ? 256 : 128;
                                                }
                                                if ((i5 & 3072) == 0) {
                                                    int i53 = IAuthTabCallbackStub + 17;
                                                    i35 = i30;
                                                    IAuthTabCallbackDefault = i53 % 128;
                                                    int i54 = i53 % 2;
                                                    i33 |= ((8388608 & i6) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback)) ? 2048 : 1024;
                                                } else {
                                                    i35 = i30;
                                                }
                                                i36 = 16777216 & i6;
                                                if (i36 == 0) {
                                                    if ((i5 & 24576) == 0) {
                                                        i33 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 16384 : 8192;
                                                    }
                                                    i37 = i6 & 33554432;
                                                    if (i37 == 0) {
                                                        i33 |= 196608;
                                                    } else if ((i5 & 196608) == 0) {
                                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda2)) {
                                                            int i55 = IAuthTabCallbackStub + 11;
                                                            IAuthTabCallbackDefault = i55 % 128;
                                                            int i56 = i55 % 2;
                                                        } else {
                                                            i45 = 65536;
                                                        }
                                                        i33 |= i45;
                                                    }
                                                    if ((306783379 & i7) != 306783378 && (306783379 & i23) == 306783378 && (74899 & i33) == 74898) {
                                                        int i57 = IAuthTabCallbackDefault + 31;
                                                        IAuthTabCallbackStub = i57 % 128;
                                                        int i58 = i57 % 2;
                                                        z3 = false;
                                                    } else {
                                                        z3 = true;
                                                    }
                                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i7 & 1)) {
                                                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                                        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                                                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                                        onextracallback2 = onextracallback;
                                                        function02 = function0;
                                                        getbacktracenote7 = getbacktracenote;
                                                        getbacktracenote8 = getbacktracenote2;
                                                        z4 = z;
                                                        getbacktracenote9 = getbacktracenote3;
                                                        getbacktracenote10 = getbacktracenote4;
                                                        getbacktracenote11 = getbacktracenote5;
                                                        getbacktracenote12 = getbacktracenote6;
                                                        iAuthTabCallbackDefault2 = iAuthTabCallbackDefault;
                                                        getmergedresolutions2 = getmergedresolutions;
                                                        onwarmupcompleted2 = onwarmupcompleted;
                                                        onextracallbackwithresult2 = onextracallbackwithresult;
                                                        cameraUnavailableException2 = cameraUnavailableException;
                                                        cameraState2 = cameraState;
                                                        z5 = z2;
                                                        setanimationfromurl2 = setanimationfromurl;
                                                        i38 = i;
                                                        i39 = i2;
                                                        iAuthTabCallback2 = iAuthTabCallback;
                                                        function13 = function12;
                                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                                    } else {
                                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                                        if ((i3 & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = i44 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                                            setCacheComposition.onExtraCallback onextracallback4 = i8 != 0 ? setCacheComposition.onExtraCallback.onExtraCallbackWithResult.IAuthTabCallback : onextracallback;
                                                            Function0<Unit> function03 = i9 != 0 ? null : function0;
                                                            getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote21 = i10 != 0 ? null : getbacktracenote;
                                                            getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote22 = i11 != 0 ? null : getbacktracenote2;
                                                            if (i12 != 0) {
                                                                int i59 = IAuthTabCallbackStub + 113;
                                                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                                                                IAuthTabCallbackDefault = i59 % 128;
                                                                int i60 = i59 % 2;
                                                                z6 = false;
                                                            } else {
                                                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                                                                z6 = z;
                                                            }
                                                            getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote23 = i13 != 0 ? null : getbacktracenote3;
                                                            getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote24 = i14 != 0 ? null : getbacktracenote4;
                                                            getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote25 = i21 != 0 ? null : getbacktracenote5;
                                                            if (i18 != 0) {
                                                                z7 = z6;
                                                                int i61 = IAuthTabCallbackDefault + 101;
                                                                getbacktracenote13 = getbacktracenote22;
                                                                IAuthTabCallbackStub = i61 % 128;
                                                                int i62 = i61 % 2;
                                                                getbacktracenote14 = null;
                                                            } else {
                                                                z7 = z6;
                                                                getbacktracenote13 = getbacktracenote22;
                                                                getbacktracenote14 = getbacktracenote6;
                                                            }
                                                            setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault5 = i20 != 0 ? null : iAuthTabCallbackDefault;
                                                            getMergedResolutions getmergedresolutions4 = i22 != 0 ? null : getmergedresolutions;
                                                            setCacheComposition.onWarmupCompleted onwarmupcompleted4 = i24 != 0 ? onWarmupCompleted : onwarmupcompleted;
                                                            setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult4 = i29 != 0 ? onNavigationEvent : onextracallbackwithresult;
                                                            CameraUnavailableException cameraUnavailableException4 = i27 != 0 ? onExtraCallbackWithResult : cameraUnavailableException;
                                                            CameraState cameraState4 = i28 != 0 ? IAuthTabCallback : cameraState;
                                                            boolean z10 = i35 != 0 ? true : z2;
                                                            getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote26 = getbacktracenote14;
                                                            setAnimationFromUrl setanimationfromurlOnWarmupCompleted = (i6 & 1048576) != 0 ? onWarmupCompleted(false, false, new Object[0], cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54, 0) : setanimationfromurl;
                                                            int i63 = i32 != 0 ? onExtraCallback : i;
                                                            int i64 = i34 != 0 ? Integer.MAX_VALUE : i2;
                                                            if ((i6 & 8388608) != 0) {
                                                                setanimationfromurl3 = setanimationfromurlOnWarmupCompleted;
                                                                int i65 = IAuthTabCallbackStub + 95;
                                                                iAuthTabCallbackDefault3 = iAuthTabCallbackDefault5;
                                                                IAuthTabCallbackDefault = i65 % 128;
                                                                if (i65 % 2 != 0) {
                                                                    iAuthTabCallbackStub.IAuthTabCallback();
                                                                    throw null;
                                                                }
                                                                IAuthTabCallback2 = iAuthTabCallbackStub.IAuthTabCallback();
                                                            } else {
                                                                setanimationfromurl3 = setanimationfromurlOnWarmupCompleted;
                                                                iAuthTabCallbackDefault3 = iAuthTabCallbackDefault5;
                                                                IAuthTabCallback2 = iAuthTabCallback;
                                                            }
                                                            function1 = i36 == 0 ? function12 : null;
                                                            if (i37 != 0) {
                                                                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                                    objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                                                }
                                                                camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized;
                                                            } else {
                                                                camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                                            }
                                                            setanimationfromurl4 = setanimationfromurl3;
                                                            iAuthTabCallbackDefault4 = iAuthTabCallbackDefault3;
                                                            getbacktracenote15 = getbacktracenote26;
                                                            iAuthTabCallback3 = IAuthTabCallback2;
                                                            camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
                                                            onextracallback3 = onextracallback4;
                                                            getbacktracenote16 = getbacktracenote23;
                                                            getbacktracenote17 = getbacktracenote25;
                                                            function02 = function03;
                                                            getbacktracenote18 = getbacktracenote21;
                                                            getmergedresolutions3 = getmergedresolutions4;
                                                            onwarmupcompleted3 = onwarmupcompleted4;
                                                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                                            getbacktracenote19 = getbacktracenote13;
                                                            z8 = z7;
                                                            onextracallbackwithresult3 = onextracallbackwithresult4;
                                                            cameraUnavailableException3 = cameraUnavailableException4;
                                                            i40 = i64;
                                                            cameraState3 = cameraState4;
                                                            z9 = z10;
                                                            i41 = i63;
                                                            function14 = function1;
                                                            getbacktracenote20 = getbacktracenote24;
                                                        } else {
                                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport0;
                                                            onextracallback3 = onextracallback;
                                                            function02 = function0;
                                                            getbacktracenote18 = getbacktracenote;
                                                            getbacktracenote19 = getbacktracenote2;
                                                            z8 = z;
                                                            getbacktracenote16 = getbacktracenote3;
                                                            getbacktracenote20 = getbacktracenote4;
                                                            getbacktracenote17 = getbacktracenote5;
                                                            getbacktracenote15 = getbacktracenote6;
                                                            iAuthTabCallbackDefault4 = iAuthTabCallbackDefault;
                                                            getmergedresolutions3 = getmergedresolutions;
                                                            onwarmupcompleted3 = onwarmupcompleted;
                                                            onextracallbackwithresult3 = onextracallbackwithresult;
                                                            cameraUnavailableException3 = cameraUnavailableException;
                                                            cameraState3 = cameraState;
                                                            z9 = z2;
                                                            setanimationfromurl4 = setanimationfromurl;
                                                            i41 = i;
                                                            i40 = i2;
                                                            iAuthTabCallback3 = iAuthTabCallback;
                                                            function14 = function12;
                                                            camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                                        }
                                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1071740457, i7, i23, "im.toss.compose.v3.textfield.TdsTextFieldV3 (TextFields.kt:641)");
                                                        }
                                                        IOOMCallback iOOMCallback = IOOMCallback.TextField;
                                                        final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda25 = camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
                                                        final getMergedResolutions getmergedresolutions5 = getmergedresolutions3;
                                                        final boolean z11 = z8;
                                                        final setCacheComposition.onWarmupCompleted onwarmupcompleted5 = onwarmupcompleted3;
                                                        final boolean z12 = z9;
                                                        final setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault6 = iAuthTabCallbackDefault4;
                                                        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport04;
                                                        final setAnimationFromUrl setanimationfromurl5 = setanimationfromurl4;
                                                        final int i66 = i41;
                                                        final Function0<Unit> function04 = function02;
                                                        final setCacheComposition.IAuthTabCallback iAuthTabCallback4 = iAuthTabCallback3;
                                                        final Function1<? super SurfaceProcessorNodeOut, Unit> function15 = function14;
                                                        final int i67 = i40;
                                                        final CameraUnavailableException cameraUnavailableException5 = cameraUnavailableException3;
                                                        final CameraState cameraState5 = cameraState3;
                                                        final setCacheComposition.onExtraCallback onextracallback5 = onextracallback3;
                                                        final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote27 = getbacktracenote18;
                                                        final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote28 = getbacktracenote19;
                                                        final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote29 = getbacktracenote16;
                                                        final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote30 = getbacktracenote20;
                                                        final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote31 = getbacktracenote17;
                                                        final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote32 = getbacktracenote15;
                                                        final setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult5 = onextracallbackwithresult3;
                                                        setTaggedAddrCtrl settaggedaddrctrl = new setTaggedAddrCtrl() { // from class: im.toss.compose.v3.textfield.TextFieldsKt$$ExternalSyntheticLambda9
                                                            private static int onExtraCallback = 0;
                                                            private static int onWarmupCompleted = 1;

                                                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                                                int i68 = 2 % 2;
                                                                int i69 = onWarmupCompleted + 83;
                                                                onExtraCallback = i69 % 128;
                                                                int i70 = i69 % 2;
                                                                Unit unitOnExtraCallback = setDefaultFontFileExtension.onExtraCallback(camera2CapturePipelineTorchTaskExternalSyntheticLambda25, iAuthTabCallbackStub, getmergedresolutions5, z11, onwarmupcompleted5, z12, iAuthTabCallbackDefault6, selectparentresolutions, quirksExternalSyntheticBackport06, setanimationfromurl5, i66, function04, iAuthTabCallback4, function15, i67, function1, cameraUnavailableException5, cameraState5, onextracallback5, getbacktracenote27, getbacktracenote28, getbacktracenote29, getbacktracenote30, getbacktracenote31, getbacktracenote32, onextracallbackwithresult5, (initSDK) obj, (QuirksExternalSyntheticBackport0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                                                int i71 = onExtraCallback + 75;
                                                                onWarmupCompleted = i71 % 128;
                                                                if (i71 % 2 != 0) {
                                                                    return unitOnExtraCallback;
                                                                }
                                                                throw null;
                                                            }
                                                        };
                                                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                                        setThreadList.IAuthTabCallback(iOOMCallback, (initMiniApp) null, (initSDK) null, (Function2) null, (Set) null, ForwardingCameraControl.onExtraCallback(-1785412108, true, settaggedaddrctrl, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 196614, 30);
                                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                            CameraConfigExternalSyntheticLambda0.onTransact();
                                                        }
                                                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                                                        onextracallback2 = onextracallback3;
                                                        getbacktracenote7 = getbacktracenote18;
                                                        getbacktracenote8 = getbacktracenote19;
                                                        z4 = z8;
                                                        getbacktracenote9 = getbacktracenote16;
                                                        getbacktracenote10 = getbacktracenote20;
                                                        getbacktracenote11 = getbacktracenote17;
                                                        getbacktracenote12 = getbacktracenote15;
                                                        iAuthTabCallbackDefault2 = iAuthTabCallbackDefault4;
                                                        getmergedresolutions2 = getmergedresolutions3;
                                                        onwarmupcompleted2 = onwarmupcompleted3;
                                                        onextracallbackwithresult2 = onextracallbackwithresult3;
                                                        cameraUnavailableException2 = cameraUnavailableException3;
                                                        cameraState2 = cameraState3;
                                                        z5 = z9;
                                                        setanimationfromurl2 = setanimationfromurl4;
                                                        i38 = i41;
                                                        i39 = i40;
                                                        iAuthTabCallback2 = iAuthTabCallback3;
                                                        function13 = function14;
                                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
                                                    }
                                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                                        final Function0<Unit> function05 = function02;
                                                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v3.textfield.TextFieldsKt$$ExternalSyntheticLambda10
                                                            private static int IAuthTabCallback = 1;
                                                            private static int onExtraCallbackWithResult;

                                                            public final Object invoke(Object obj, Object obj2) {
                                                                int i68 = 2 % 2;
                                                                int i69 = IAuthTabCallback + 117;
                                                                onExtraCallbackWithResult = i69 % 128;
                                                                int i70 = i69 % 2;
                                                                Unit unitOnWarmupCompleted = setDefaultFontFileExtension.onWarmupCompleted(selectparentresolutions, function1, iAuthTabCallbackStub, quirksExternalSyntheticBackport02, onextracallback2, function05, getbacktracenote7, getbacktracenote8, z4, getbacktracenote9, getbacktracenote10, getbacktracenote11, getbacktracenote12, iAuthTabCallbackDefault2, getmergedresolutions2, onwarmupcompleted2, onextracallbackwithresult2, cameraUnavailableException2, cameraState2, z5, setanimationfromurl2, i38, i39, iAuthTabCallback2, function13, camera2CapturePipelineTorchTaskExternalSyntheticLambda22, i3, i4, i5, i6, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                                                int i71 = onExtraCallbackWithResult + 43;
                                                                IAuthTabCallback = i71 % 128;
                                                                int i72 = i71 % 2;
                                                                return unitOnWarmupCompleted;
                                                            }
                                                        });
                                                        return;
                                                    }
                                                    return;
                                                }
                                                i33 |= 24576;
                                                i37 = i6 & 33554432;
                                                if (i37 == 0) {
                                                }
                                                if ((306783379 & i7) != 306783378) {
                                                    z3 = true;
                                                }
                                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i7 & 1)) {
                                                }
                                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                                }
                                            }
                                            if ((i5 & 3072) == 0) {
                                            }
                                            i36 = 16777216 & i6;
                                            if (i36 == 0) {
                                            }
                                            i37 = i6 & 33554432;
                                            if (i37 == 0) {
                                            }
                                            if ((306783379 & i7) != 306783378) {
                                            }
                                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i7 & 1)) {
                                            }
                                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                            }
                                        }
                                        i33 = i31;
                                        i34 = i6 & 4194304;
                                        if (i34 == 0) {
                                        }
                                        if ((i5 & 3072) == 0) {
                                        }
                                        i36 = 16777216 & i6;
                                        if (i36 == 0) {
                                        }
                                        i37 = i6 & 33554432;
                                        if (i37 == 0) {
                                        }
                                        if ((306783379 & i7) != 306783378) {
                                        }
                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i7 & 1)) {
                                        }
                                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                        }
                                    }
                                    i23 |= i42;
                                    if ((i5 & 6) == 0) {
                                    }
                                    i32 = i6 & 2097152;
                                    if (i32 != 0) {
                                    }
                                    i33 = i31;
                                    i34 = i6 & 4194304;
                                    if (i34 == 0) {
                                    }
                                    if ((i5 & 3072) == 0) {
                                    }
                                    i36 = 16777216 & i6;
                                    if (i36 == 0) {
                                    }
                                    i37 = i6 & 33554432;
                                    if (i37 == 0) {
                                    }
                                    if ((306783379 & i7) != 306783378) {
                                    }
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i7 & 1)) {
                                    }
                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                    }
                                }
                                i29 = i25;
                                i30 = 524288 & i6;
                                if (i30 == 0) {
                                }
                                i23 |= i42;
                                if ((i5 & 6) == 0) {
                                }
                                i32 = i6 & 2097152;
                                if (i32 != 0) {
                                }
                                i33 = i31;
                                i34 = i6 & 4194304;
                                if (i34 == 0) {
                                }
                                if ((i5 & 3072) == 0) {
                                }
                                i36 = 16777216 & i6;
                                if (i36 == 0) {
                                }
                                i37 = i6 & 33554432;
                                if (i37 == 0) {
                                }
                                if ((306783379 & i7) != 306783378) {
                                }
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i7 & 1)) {
                                }
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                }
                            }
                            i27 = i26;
                            i28 = i6 & 262144;
                            if (i28 != 0) {
                            }
                            i29 = i25;
                            i30 = 524288 & i6;
                            if (i30 == 0) {
                            }
                            i23 |= i42;
                            if ((i5 & 6) == 0) {
                            }
                            i32 = i6 & 2097152;
                            if (i32 != 0) {
                            }
                            i33 = i31;
                            i34 = i6 & 4194304;
                            if (i34 == 0) {
                            }
                            if ((i5 & 3072) == 0) {
                            }
                            i36 = 16777216 & i6;
                            if (i36 == 0) {
                            }
                            i37 = i6 & 33554432;
                            if (i37 == 0) {
                            }
                            if ((306783379 & i7) != 306783378) {
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i7 & 1)) {
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                            }
                        }
                        i25 = i6 & 65536;
                        if (i25 == 0) {
                        }
                        i26 = i6 & 131072;
                        if (i26 == 0) {
                        }
                        i27 = i26;
                        i28 = i6 & 262144;
                        if (i28 != 0) {
                        }
                        i29 = i25;
                        i30 = 524288 & i6;
                        if (i30 == 0) {
                        }
                        i23 |= i42;
                        if ((i5 & 6) == 0) {
                        }
                        i32 = i6 & 2097152;
                        if (i32 != 0) {
                        }
                        i33 = i31;
                        i34 = i6 & 4194304;
                        if (i34 == 0) {
                        }
                        if ((i5 & 3072) == 0) {
                        }
                        i36 = 16777216 & i6;
                        if (i36 == 0) {
                        }
                        i37 = i6 & 33554432;
                        if (i37 == 0) {
                        }
                        if ((306783379 & i7) != 306783378) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i7 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        }
                    }
                    i23 = i46;
                    i24 = 32768 & i6;
                    if (i24 != 0) {
                    }
                    i25 = i6 & 65536;
                    if (i25 == 0) {
                    }
                    i26 = i6 & 131072;
                    if (i26 == 0) {
                    }
                    i27 = i26;
                    i28 = i6 & 262144;
                    if (i28 != 0) {
                    }
                    i29 = i25;
                    i30 = 524288 & i6;
                    if (i30 == 0) {
                    }
                    i23 |= i42;
                    if ((i5 & 6) == 0) {
                    }
                    i32 = i6 & 2097152;
                    if (i32 != 0) {
                    }
                    i33 = i31;
                    i34 = i6 & 4194304;
                    if (i34 == 0) {
                    }
                    if ((i5 & 3072) == 0) {
                    }
                    i36 = 16777216 & i6;
                    if (i36 == 0) {
                    }
                    i37 = i6 & 33554432;
                    if (i37 == 0) {
                    }
                    if ((306783379 & i7) != 306783378) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i7 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                i19 = i6 & 8192;
                if (i19 == 0) {
                }
                i22 = i6 & 16384;
                if (i22 == 0) {
                }
                i23 = i46;
                i24 = 32768 & i6;
                if (i24 != 0) {
                }
                i25 = i6 & 65536;
                if (i25 == 0) {
                }
                i26 = i6 & 131072;
                if (i26 == 0) {
                }
                i27 = i26;
                i28 = i6 & 262144;
                if (i28 != 0) {
                }
                i29 = i25;
                i30 = 524288 & i6;
                if (i30 == 0) {
                }
                i23 |= i42;
                if ((i5 & 6) == 0) {
                }
                i32 = i6 & 2097152;
                if (i32 != 0) {
                }
                i33 = i31;
                i34 = i6 & 4194304;
                if (i34 == 0) {
                }
                if ((i5 & 3072) == 0) {
                }
                i36 = 16777216 & i6;
                if (i36 == 0) {
                }
                i37 = i6 & 33554432;
                if (i37 == 0) {
                }
                if ((306783379 & i7) != 306783378) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i7 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            i9 = i6 & 32;
            int i452 = 131072;
            if (i9 != 0) {
            }
            i10 = i6 & 64;
            if (i10 != 0) {
            }
            i11 = i6 & 128;
            if (i11 != 0) {
            }
            i12 = i6 & 256;
            if (i12 != 0) {
            }
            i13 = i6 & 512;
            if (i13 != 0) {
            }
            i14 = i6 & 1024;
            if (i14 != 0) {
            }
            i16 = i6 & 2048;
            if (i16 != 0) {
            }
            int i462 = i15;
            i17 = i6 & 4096;
            if (i17 != 0) {
            }
            i19 = i6 & 8192;
            if (i19 == 0) {
            }
            i22 = i6 & 16384;
            if (i22 == 0) {
            }
            i23 = i462;
            i24 = 32768 & i6;
            if (i24 != 0) {
            }
            i25 = i6 & 65536;
            if (i25 == 0) {
            }
            i26 = i6 & 131072;
            if (i26 == 0) {
            }
            i27 = i26;
            i28 = i6 & 262144;
            if (i28 != 0) {
            }
            i29 = i25;
            i30 = 524288 & i6;
            if (i30 == 0) {
            }
            i23 |= i42;
            if ((i5 & 6) == 0) {
            }
            i32 = i6 & 2097152;
            if (i32 != 0) {
            }
            i33 = i31;
            i34 = i6 & 4194304;
            if (i34 == 0) {
            }
            if ((i5 & 3072) == 0) {
            }
            i36 = 16777216 & i6;
            if (i36 == 0) {
            }
            i37 = i6 & 33554432;
            if (i37 == 0) {
            }
            if ((306783379 & i7) != 306783378) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i7 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        i8 = i6 & 16;
        if (i8 == 0) {
        }
        i9 = i6 & 32;
        int i4522 = 131072;
        if (i9 != 0) {
        }
        i10 = i6 & 64;
        if (i10 != 0) {
        }
        i11 = i6 & 128;
        if (i11 != 0) {
        }
        i12 = i6 & 256;
        if (i12 != 0) {
        }
        i13 = i6 & 512;
        if (i13 != 0) {
        }
        i14 = i6 & 1024;
        if (i14 != 0) {
        }
        i16 = i6 & 2048;
        if (i16 != 0) {
        }
        int i4622 = i15;
        i17 = i6 & 4096;
        if (i17 != 0) {
        }
        i19 = i6 & 8192;
        if (i19 == 0) {
        }
        i22 = i6 & 16384;
        if (i22 == 0) {
        }
        i23 = i4622;
        i24 = 32768 & i6;
        if (i24 != 0) {
        }
        i25 = i6 & 65536;
        if (i25 == 0) {
        }
        i26 = i6 & 131072;
        if (i26 == 0) {
        }
        i27 = i26;
        i28 = i6 & 262144;
        if (i28 != 0) {
        }
        i29 = i25;
        i30 = 524288 & i6;
        if (i30 == 0) {
        }
        i23 |= i42;
        if ((i5 & 6) == 0) {
        }
        i32 = i6 & 2097152;
        if (i32 != 0) {
        }
        i33 = i31;
        i34 = i6 & 4194304;
        if (i34 == 0) {
        }
        if ((i5 & 3072) == 0) {
        }
        i36 = 16777216 & i6;
        if (i36 == 0) {
        }
        i37 = i6 & 33554432;
        if (i37 == 0) {
        }
        if ((306783379 & i7) != 306783378) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i7 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        selectParentResolutions selectparentresolutions = (selectParentResolutions) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 119;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            if (getNumberOfTargets.onExtraCallback(selectparentresolutions.onExtraCallbackWithResult(), onExtraCallback((getSupportedHighSpeedResolutionsFor<selectParentResolutions>) getsupportedhighspeedresolutionsfor).onExtraCallbackWithResult())) {
                int i3 = IAuthTabCallbackStub + 27;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                if (!Intrinsics.areEqual(selectparentresolutions.onExtraCallback(), onExtraCallback((getSupportedHighSpeedResolutionsFor<selectParentResolutions>) getsupportedhighspeedresolutionsfor).onExtraCallback())) {
                    int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
                    onWarmupCompleted(-800368528, 800368532, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, new Object[]{getsupportedhighspeedresolutionsfor, selectparentresolutions});
                }
            }
            return Unit.INSTANCE;
        }
        getNumberOfTargets.onExtraCallback(selectparentresolutions.onExtraCallbackWithResult(), onExtraCallback((getSupportedHighSpeedResolutionsFor<selectParentResolutions>) getsupportedhighspeedresolutionsfor).onExtraCallbackWithResult());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, selectParentResolutions selectparentresolutions) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 117;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(selectparentresolutions, "");
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        onWarmupCompleted(-800368528, 800368532, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, new Object[]{getsupportedhighspeedresolutionsfor, selectparentresolutions});
        boolean zAreEqual = Intrinsics.areEqual(onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor2), selectparentresolutions.onNavigationEvent());
        onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor2, selectparentresolutions.onNavigationEvent());
        if (!zAreEqual) {
            int i4 = IAuthTabCallbackStub + 3;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                function1.invoke(selectparentresolutions.onNavigationEvent());
                int i5 = 95 / 0;
            } else {
                function1.invoke(selectparentresolutions.onNavigationEvent());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:446:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@NotNull final String str, @NotNull final Function1<? super String, Unit> function1, @NotNull final setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable setCacheComposition.onExtraCallback onextracallback, @Nullable Function0<Unit> function0, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, boolean z, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote5, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote6, @Nullable setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault, @Nullable getMergedResolutions getmergedresolutions, @Nullable setCacheComposition.onWarmupCompleted onwarmupcompleted, @Nullable setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult, @Nullable CameraUnavailableException cameraUnavailableException, @Nullable CameraState cameraState, boolean z2, boolean z3, boolean z4, int i, int i2, @Nullable setCacheComposition.IAuthTabCallback iAuthTabCallback, @Nullable Function1<? super SurfaceProcessorNodeOut, Unit> function12, @Nullable Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i3, final int i4, final int i5, final int i6) {
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
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        boolean z5;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final setCacheComposition.onExtraCallback onextracallback2;
        final Function0<Unit> function02;
        final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote7;
        final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote8;
        final boolean z6;
        final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote9;
        final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote10;
        final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote11;
        final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote12;
        final setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault2;
        final getMergedResolutions getmergedresolutions2;
        final setCacheComposition.onWarmupCompleted onwarmupcompleted2;
        final setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult2;
        final CameraUnavailableException cameraUnavailableException2;
        final CameraState cameraState2;
        final boolean z7;
        final boolean z8;
        final boolean z9;
        final int i40;
        final int i41;
        final setCacheComposition.IAuthTabCallback iAuthTabCallback2;
        final Function1<? super SurfaceProcessorNodeOut, Unit> function13;
        final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        Function0<Unit> function03;
        boolean z10;
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote13;
        setCacheComposition.IAuthTabCallback IAuthTabCallback2;
        setCacheComposition.IAuthTabCallback iAuthTabCallback3;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
        boolean z11;
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote14;
        setCacheComposition.IAuthTabCallback iAuthTabCallback4;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
        Function1<? super SurfaceProcessorNodeOut, Unit> function14;
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote15;
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote16;
        Function0<Unit> function04;
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote17;
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote18;
        setCacheComposition.onExtraCallback onextracallback3;
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote19;
        setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault3;
        getMergedResolutions getmergedresolutions3;
        setCacheComposition.onWarmupCompleted onwarmupcompleted3;
        setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult3;
        CameraUnavailableException cameraUnavailableException3;
        CameraState cameraState3;
        boolean z12;
        boolean z13;
        boolean z14;
        int i42;
        int i43;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05;
        Object obj;
        int i44;
        int i45 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1096693945);
        if ((i3 & 6) == 0) {
            int i46 = IAuthTabCallbackStub + 73;
            IAuthTabCallbackDefault = i46 % 128;
            if (i46 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str);
                throw null;
            }
            i7 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackStub) ? 256 : 128;
        }
        int i47 = i6 & 8;
        if (i47 != 0) {
            i7 |= 3072;
        } else {
            if ((i3 & 3072) == 0) {
                i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 2048 : 1024;
            }
            i8 = i6 & 16;
            if (i8 == 0) {
                i7 |= 24576;
            } else {
                if ((i3 & 24576) == 0) {
                    i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback) ? 16384 : 8192;
                }
                i9 = i6 & 32;
                int i48 = 131072;
                if (i9 != 0) {
                    i7 |= 196608;
                } else if ((i3 & 196608) == 0) {
                    i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 131072 : 65536;
                }
                i10 = i6 & 64;
                if (i10 != 0) {
                    i7 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 1048576 : 524288;
                }
                i11 = i6 & 128;
                if (i11 != 0) {
                    i7 |= 12582912;
                } else {
                    if ((i3 & 12582912) == 0) {
                        i7 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote2) ^ true) ? 8388608 : 4194304;
                    }
                    i12 = i6 & 256;
                    if (i12 == 0) {
                        i7 |= 100663296;
                    } else {
                        if ((i3 & 100663296) == 0) {
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
                                int i49 = IAuthTabCallbackStub + 23;
                                IAuthTabCallbackDefault = i49 % 128;
                                if (i49 % 2 != 0) {
                                    int i50 = 5 / 0;
                                }
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i14 = i13 | i7;
                        }
                        i15 = i6 & 512;
                        if (i15 != 0) {
                            i14 |= 805306368;
                        } else {
                            if ((805306368 & i3) == 0) {
                                i14 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote3) ? 536870912 : 268435456;
                            }
                            i16 = i6 & 1024;
                            if (i16 == 0) {
                                i17 = i4 | 6;
                            } else if ((i4 & 6) == 0) {
                                i17 = i4 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote4) ? 4 : 2);
                            } else {
                                i17 = i4;
                            }
                            i18 = i6 & 2048;
                            if (i18 == 0) {
                                int i51 = IAuthTabCallbackDefault + 27;
                                IAuthTabCallbackStub = i51 % 128;
                                i17 = i51 % 2 == 0 ? i17 | 15 : i17 | 48;
                            } else {
                                if ((i4 & 48) == 0) {
                                    i17 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote5) ? 32 : 16;
                                }
                                int i52 = i17;
                                i19 = i6 & 4096;
                                if (i19 != 0) {
                                    i52 |= 384;
                                } else {
                                    if ((i4 & 384) == 0) {
                                        i52 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote6) ? 256 : 128;
                                    }
                                    i20 = i6 & 8192;
                                    if (i20 == 0) {
                                        i52 |= 3072;
                                    } else {
                                        if ((i4 & 3072) == 0) {
                                            i52 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackDefault) ? 2048 : 1024;
                                        }
                                        i21 = i6 & 16384;
                                        if (i21 != 0) {
                                            i52 |= 24576;
                                            i22 = i21;
                                        } else {
                                            i22 = i21;
                                            if ((i4 & 24576) == 0) {
                                                i52 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getmergedresolutions) ? 16384 : 8192;
                                            }
                                            i23 = i6 & 32768;
                                            if (i23 == 0) {
                                                i52 |= 196608;
                                            } else if ((i4 & 196608) == 0) {
                                                i52 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted == null ? -1 : onwarmupcompleted.ordinal()) ? 131072 : 65536;
                                            }
                                            i24 = i6 & 65536;
                                            if (i24 == 0) {
                                                i52 |= 1572864;
                                            } else {
                                                if ((i4 & 1572864) == 0) {
                                                    i25 = i24;
                                                    i26 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallbackwithresult == null ? -1 : onextracallbackwithresult.ordinal()) ? 1048576 : 524288) | i52;
                                                }
                                                i27 = i6 & 131072;
                                                if (i27 != 0) {
                                                    i26 |= 12582912;
                                                } else {
                                                    if ((i4 & 12582912) == 0) {
                                                        i28 = i27;
                                                        i26 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraUnavailableException) ? 8388608 : 4194304;
                                                    }
                                                    i29 = i6 & 262144;
                                                    if (i29 == 0) {
                                                        i26 |= 100663296;
                                                    } else if ((i4 & 100663296) == 0) {
                                                        i26 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraState) ? 67108864 : 33554432;
                                                    }
                                                    i30 = i6 & 524288;
                                                    if (i30 == 0) {
                                                        i44 = (i4 & 805306368) == 0 ? cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 536870912 : 268435456 : 805306368;
                                                        i31 = i6 & 1048576;
                                                        if (i31 != 0) {
                                                            i32 = i5 | 6;
                                                        } else if ((i5 & 6) == 0) {
                                                            i32 = i5 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 4 : 2);
                                                        } else {
                                                            i32 = i5;
                                                        }
                                                        i33 = i6 & 2097152;
                                                        if (i33 != 0) {
                                                            i32 |= 48;
                                                        } else if ((i5 & 48) == 0) {
                                                            i32 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z4) ? 32 : 16;
                                                        }
                                                        int i53 = i32;
                                                        i34 = i6 & 4194304;
                                                        if (i34 != 0) {
                                                            i53 |= 384;
                                                        } else {
                                                            if ((i5 & 384) == 0) {
                                                                int i54 = IAuthTabCallbackStub + 15;
                                                                i35 = i20;
                                                                IAuthTabCallbackDefault = i54 % 128;
                                                                int i55 = i54 % 2;
                                                                i53 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 256 : 128;
                                                            }
                                                            i36 = 8388608 & i6;
                                                            if (i36 == 0) {
                                                                i53 |= 3072;
                                                            } else {
                                                                if ((i5 & 3072) == 0) {
                                                                    int i56 = IAuthTabCallbackDefault + 23;
                                                                    i37 = i36;
                                                                    IAuthTabCallbackStub = i56 % 128;
                                                                    int i57 = i56 % 2;
                                                                    i53 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i2) ? 2048 : 1024;
                                                                }
                                                                if ((i5 & 24576) == 0) {
                                                                    i53 |= ((16777216 & i6) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback)) ? 16384 : 8192;
                                                                }
                                                                i38 = i6 & 33554432;
                                                                if (i38 != 0) {
                                                                    i53 |= 196608;
                                                                } else if ((i5 & 196608) == 0) {
                                                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12)) {
                                                                        int i58 = IAuthTabCallbackDefault + 9;
                                                                        IAuthTabCallbackStub = i58 % 128;
                                                                        int i59 = i58 % 2;
                                                                    } else {
                                                                        i48 = 65536;
                                                                    }
                                                                    i53 |= i48;
                                                                }
                                                                i39 = 67108864 & i6;
                                                                if (i39 == 0) {
                                                                    if ((i5 & 1572864) == 0) {
                                                                        i53 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda2) ? 1048576 : 524288;
                                                                    }
                                                                    if ((i14 & 306783379) == 306783378 || (306783379 & i26) != 306783378) {
                                                                        z5 = true;
                                                                    } else {
                                                                        int i60 = IAuthTabCallbackDefault + 107;
                                                                        IAuthTabCallbackStub = i60 % 128;
                                                                        if (i60 % 2 == 0) {
                                                                            int i61 = 90 / 0;
                                                                            if ((599187 & i53) == 599186) {
                                                                                z5 = false;
                                                                            }
                                                                        } else if ((599187 & i53) == 599186) {
                                                                        }
                                                                    }
                                                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z5, i14 & 1)) {
                                                                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                                                        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                                                                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                                                        onextracallback2 = onextracallback;
                                                                        function02 = function0;
                                                                        getbacktracenote7 = getbacktracenote;
                                                                        getbacktracenote8 = getbacktracenote2;
                                                                        z6 = z;
                                                                        getbacktracenote9 = getbacktracenote3;
                                                                        getbacktracenote10 = getbacktracenote4;
                                                                        getbacktracenote11 = getbacktracenote5;
                                                                        getbacktracenote12 = getbacktracenote6;
                                                                        iAuthTabCallbackDefault2 = iAuthTabCallbackDefault;
                                                                        getmergedresolutions2 = getmergedresolutions;
                                                                        onwarmupcompleted2 = onwarmupcompleted;
                                                                        onextracallbackwithresult2 = onextracallbackwithresult;
                                                                        cameraUnavailableException2 = cameraUnavailableException;
                                                                        cameraState2 = cameraState;
                                                                        z7 = z2;
                                                                        z8 = z3;
                                                                        z9 = z4;
                                                                        i40 = i;
                                                                        i41 = i2;
                                                                        iAuthTabCallback2 = iAuthTabCallback;
                                                                        function13 = function12;
                                                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                                                    } else {
                                                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                                                        if ((i3 & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                                                            if (i47 != 0) {
                                                                                int i62 = IAuthTabCallbackDefault + 21;
                                                                                IAuthTabCallbackStub = i62 % 128;
                                                                                if (i62 % 2 == 0) {
                                                                                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback4 = QuirksExternalSyntheticBackport0.Companion;
                                                                                    Object obj2 = null;
                                                                                    obj2.hashCode();
                                                                                    throw null;
                                                                                }
                                                                                quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                                                                            } else {
                                                                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                                                                            }
                                                                            setCacheComposition.onExtraCallback onextracallback5 = i8 != 0 ? setCacheComposition.onExtraCallback.onExtraCallbackWithResult.IAuthTabCallback : onextracallback;
                                                                            if (i9 != 0) {
                                                                                int i63 = IAuthTabCallbackDefault + 53;
                                                                                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                                                                IAuthTabCallbackStub = i63 % 128;
                                                                                if (i63 % 2 == 0) {
                                                                                    int i64 = 85 / 0;
                                                                                }
                                                                                function03 = null;
                                                                            } else {
                                                                                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                                                                function03 = function0;
                                                                            }
                                                                            getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote20 = i10 != 0 ? null : getbacktracenote;
                                                                            getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote21 = i11 != 0 ? null : getbacktracenote2;
                                                                            boolean z15 = i12 != 0 ? false : z;
                                                                            getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote22 = i15 != 0 ? null : getbacktracenote3;
                                                                            getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote23 = i16 != 0 ? null : getbacktracenote4;
                                                                            getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote24 = i18 != 0 ? null : getbacktracenote5;
                                                                            getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote25 = i19 != 0 ? null : getbacktracenote6;
                                                                            setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault4 = i35 != 0 ? null : iAuthTabCallbackDefault;
                                                                            getMergedResolutions getmergedresolutions4 = i22 != 0 ? null : getmergedresolutions;
                                                                            setCacheComposition.onWarmupCompleted onwarmupcompleted4 = i23 != 0 ? onWarmupCompleted : onwarmupcompleted;
                                                                            setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult4 = i25 != 0 ? onNavigationEvent : onextracallbackwithresult;
                                                                            CameraUnavailableException cameraUnavailableException4 = i28 != 0 ? onExtraCallbackWithResult : cameraUnavailableException;
                                                                            CameraState cameraState4 = i29 != 0 ? IAuthTabCallback : cameraState;
                                                                            boolean z16 = i30 != 0 ? true : z2;
                                                                            boolean z17 = i31 != 0 ? false : z3;
                                                                            boolean z18 = i33 != 0 ? false : z4;
                                                                            int i65 = i34 != 0 ? onExtraCallback : i;
                                                                            int i66 = i37 != 0 ? Integer.MAX_VALUE : i2;
                                                                            if ((i6 & 16777216) != 0) {
                                                                                z10 = z15;
                                                                                int i67 = IAuthTabCallbackStub + 21;
                                                                                getbacktracenote13 = getbacktracenote22;
                                                                                IAuthTabCallbackDefault = i67 % 128;
                                                                                int i68 = i67 % 2;
                                                                                IAuthTabCallback2 = iAuthTabCallbackStub.IAuthTabCallback();
                                                                                i53 &= -57345;
                                                                            } else {
                                                                                z10 = z15;
                                                                                getbacktracenote13 = getbacktracenote22;
                                                                                IAuthTabCallback2 = iAuthTabCallback;
                                                                            }
                                                                            Function1<? super SurfaceProcessorNodeOut, Unit> function15 = i38 != 0 ? null : function12;
                                                                            if (i39 != 0) {
                                                                                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                                                iAuthTabCallback3 = IAuthTabCallback2;
                                                                                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                                                    objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                                                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                                                                }
                                                                                camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized;
                                                                            } else {
                                                                                iAuthTabCallback3 = IAuthTabCallback2;
                                                                                camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                                                            }
                                                                            z11 = z10;
                                                                            getbacktracenote14 = getbacktracenote13;
                                                                            iAuthTabCallback4 = iAuthTabCallback3;
                                                                            camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
                                                                            function14 = function15;
                                                                            getbacktracenote15 = getbacktracenote23;
                                                                            getbacktracenote16 = getbacktracenote21;
                                                                            function04 = function03;
                                                                            getbacktracenote17 = getbacktracenote24;
                                                                            getbacktracenote18 = getbacktracenote25;
                                                                            onextracallback3 = onextracallback5;
                                                                            getbacktracenote19 = getbacktracenote20;
                                                                            iAuthTabCallbackDefault3 = iAuthTabCallbackDefault4;
                                                                            getmergedresolutions3 = getmergedresolutions4;
                                                                            onwarmupcompleted3 = onwarmupcompleted4;
                                                                            onextracallbackwithresult3 = onextracallbackwithresult4;
                                                                            cameraUnavailableException3 = cameraUnavailableException4;
                                                                            cameraState3 = cameraState4;
                                                                            z12 = z16;
                                                                            z13 = z17;
                                                                            z14 = z18;
                                                                            i42 = i65;
                                                                            i43 = i66;
                                                                            quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                                                                        } else {
                                                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                                                            if ((16777216 & i6) != 0) {
                                                                                i53 &= -57345;
                                                                            }
                                                                            quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport0;
                                                                            onextracallback3 = onextracallback;
                                                                            function04 = function0;
                                                                            getbacktracenote19 = getbacktracenote;
                                                                            getbacktracenote16 = getbacktracenote2;
                                                                            z11 = z;
                                                                            getbacktracenote14 = getbacktracenote3;
                                                                            getbacktracenote15 = getbacktracenote4;
                                                                            getbacktracenote17 = getbacktracenote5;
                                                                            getbacktracenote18 = getbacktracenote6;
                                                                            iAuthTabCallbackDefault3 = iAuthTabCallbackDefault;
                                                                            getmergedresolutions3 = getmergedresolutions;
                                                                            onwarmupcompleted3 = onwarmupcompleted;
                                                                            onextracallbackwithresult3 = onextracallbackwithresult;
                                                                            cameraUnavailableException3 = cameraUnavailableException;
                                                                            cameraState3 = cameraState;
                                                                            z12 = z2;
                                                                            z13 = z3;
                                                                            z14 = z4;
                                                                            i42 = i;
                                                                            i43 = i2;
                                                                            iAuthTabCallback4 = iAuthTabCallback;
                                                                            function14 = function12;
                                                                            camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                                                        }
                                                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1096693945, i14, i26, "im.toss.compose.v3.textfield.TdsTextFieldV3 (TextFields.kt:773)");
                                                                        }
                                                                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                                        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted5 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                                                                        if (objOnMinimized2 == onwarmupcompleted5.onExtraCallback()) {
                                                                            objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new selectParentResolutions(str, 0L, (getNumberOfTargets) null, 6, (DefaultConstructorMarker) null), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                                                                        }
                                                                        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
                                                                        final selectParentResolutions selectparentresolutionsOnExtraCallback = selectParentResolutions.onExtraCallback(onExtraCallback((getSupportedHighSpeedResolutionsFor<selectParentResolutions>) getsupportedhighspeedresolutionsfor), str, 0L, (getNumberOfTargets) null, 6, (Object) null);
                                                                        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(selectparentresolutionsOnExtraCallback);
                                                                        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                                        if (zOnNavigationEvent || objOnMinimized3 == onwarmupcompleted5.onExtraCallback()) {
                                                                            objOnMinimized3 = new Function0() { // from class: im.toss.compose.v3.textfield.TextFieldsKt$$ExternalSyntheticLambda5
                                                                                private static int onExtraCallback = 1;
                                                                                private static int onWarmupCompleted;

                                                                                public final Object invoke() {
                                                                                    int i69 = 2 % 2;
                                                                                    int i70 = onWarmupCompleted + 101;
                                                                                    onExtraCallback = i70 % 128;
                                                                                    int i71 = i70 % 2;
                                                                                    selectParentResolutions selectparentresolutions = selectparentresolutionsOnExtraCallback;
                                                                                    if (i71 != 0) {
                                                                                        return setDefaultFontFileExtension.IAuthTabCallback(selectparentresolutions, getsupportedhighspeedresolutionsfor);
                                                                                    }
                                                                                    setDefaultFontFileExtension.IAuthTabCallback(selectparentresolutions, getsupportedhighspeedresolutionsfor);
                                                                                    Object obj3 = null;
                                                                                    obj3.hashCode();
                                                                                    throw null;
                                                                                }
                                                                            };
                                                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                                                                        }
                                                                        isZslDisabledByByUserCaseConfig.onNavigationEvent((Function0) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                                                        boolean z19 = (i14 & 14) == 4;
                                                                        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                                        if (z19 || objOnMinimized4 == onwarmupcompleted5.onExtraCallback()) {
                                                                            objOnMinimized4 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(str, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                                                                        }
                                                                        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized4;
                                                                        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor2);
                                                                        boolean z20 = (i14 & 112) == 32;
                                                                        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                                        if ((zOnNavigationEvent2 || z20) || objOnMinimized5 == onwarmupcompleted5.onExtraCallback()) {
                                                                            Function1 function16 = new Function1() { // from class: im.toss.compose.v3.textfield.TextFieldsKt$$ExternalSyntheticLambda6
                                                                                private static int onNavigationEvent = 1;
                                                                                private static int onWarmupCompleted;

                                                                                public final Object invoke(Object obj3) {
                                                                                    int i69 = 2 % 2;
                                                                                    int i70 = onNavigationEvent + 123;
                                                                                    onWarmupCompleted = i70 % 128;
                                                                                    int i71 = i70 % 2;
                                                                                    Unit unitOnExtraCallbackWithResult = setDefaultFontFileExtension.onExtraCallbackWithResult(function1, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, (selectParentResolutions) obj3);
                                                                                    int i72 = onNavigationEvent + 27;
                                                                                    onWarmupCompleted = i72 % 128;
                                                                                    int i73 = i72 % 2;
                                                                                    return unitOnExtraCallbackWithResult;
                                                                                }
                                                                            };
                                                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function16);
                                                                            obj = function16;
                                                                        } else {
                                                                            obj = objOnMinimized5;
                                                                        }
                                                                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                                                        onNavigationEvent(selectparentresolutionsOnExtraCallback, (Function1) obj, iAuthTabCallbackStub, quirksExternalSyntheticBackport05, onextracallback3, function04, getbacktracenote19, getbacktracenote16, z11, getbacktracenote14, getbacktracenote15, getbacktracenote17, getbacktracenote18, iAuthTabCallbackDefault3, getmergedresolutions3, onwarmupcompleted3, onextracallbackwithresult3, cameraUnavailableException3, cameraState3, z12, z13, z14, i42, i43, iAuthTabCallback4, function14, camera2CapturePipelineTorchTaskExternalSyntheticLambda24, cameraCaptureResultEmptyCameraCaptureResult2, i14 & 2147483520, i26 & 2147483646, i53 & 4194302, 0);
                                                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                                            CameraConfigExternalSyntheticLambda0.onTransact();
                                                                        }
                                                                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport05;
                                                                        onextracallback2 = onextracallback3;
                                                                        function02 = function04;
                                                                        getbacktracenote7 = getbacktracenote19;
                                                                        getbacktracenote8 = getbacktracenote16;
                                                                        z6 = z11;
                                                                        getbacktracenote9 = getbacktracenote14;
                                                                        getbacktracenote10 = getbacktracenote15;
                                                                        getbacktracenote11 = getbacktracenote17;
                                                                        getbacktracenote12 = getbacktracenote18;
                                                                        iAuthTabCallbackDefault2 = iAuthTabCallbackDefault3;
                                                                        getmergedresolutions2 = getmergedresolutions3;
                                                                        onwarmupcompleted2 = onwarmupcompleted3;
                                                                        onextracallbackwithresult2 = onextracallbackwithresult3;
                                                                        cameraUnavailableException2 = cameraUnavailableException3;
                                                                        cameraState2 = cameraState3;
                                                                        z7 = z12;
                                                                        z8 = z13;
                                                                        z9 = z14;
                                                                        i40 = i42;
                                                                        i41 = i43;
                                                                        iAuthTabCallback2 = iAuthTabCallback4;
                                                                        function13 = function14;
                                                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
                                                                    }
                                                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                                                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                                                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v3.textfield.TextFieldsKt$$ExternalSyntheticLambda7
                                                                            private static int IAuthTabCallback = 1;
                                                                            private static int onWarmupCompleted;

                                                                            public final Object invoke(Object obj3, Object obj4) {
                                                                                int i69 = 2 % 2;
                                                                                int i70 = onWarmupCompleted + 107;
                                                                                IAuthTabCallback = i70 % 128;
                                                                                int i71 = i70 % 2;
                                                                                Unit unitOnNavigationEvent = setDefaultFontFileExtension.onNavigationEvent(str, function1, iAuthTabCallbackStub, quirksExternalSyntheticBackport02, onextracallback2, function02, getbacktracenote7, getbacktracenote8, z6, getbacktracenote9, getbacktracenote10, getbacktracenote11, getbacktracenote12, iAuthTabCallbackDefault2, getmergedresolutions2, onwarmupcompleted2, onextracallbackwithresult2, cameraUnavailableException2, cameraState2, z7, z8, z9, i40, i41, iAuthTabCallback2, function13, camera2CapturePipelineTorchTaskExternalSyntheticLambda22, i3, i4, i5, i6, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                                                                int i72 = onWarmupCompleted + 63;
                                                                                IAuthTabCallback = i72 % 128;
                                                                                if (i72 % 2 != 0) {
                                                                                    return unitOnNavigationEvent;
                                                                                }
                                                                                throw null;
                                                                            }
                                                                        });
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                i53 |= 1572864;
                                                                if ((i14 & 306783379) == 306783378) {
                                                                    z5 = true;
                                                                }
                                                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z5, i14 & 1)) {
                                                                }
                                                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                                                }
                                                            }
                                                            i37 = i36;
                                                            if ((i5 & 24576) == 0) {
                                                            }
                                                            i38 = i6 & 33554432;
                                                            if (i38 != 0) {
                                                            }
                                                            i39 = 67108864 & i6;
                                                            if (i39 == 0) {
                                                            }
                                                            if ((i14 & 306783379) == 306783378) {
                                                            }
                                                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z5, i14 & 1)) {
                                                            }
                                                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                                            }
                                                        }
                                                        i35 = i20;
                                                        i36 = 8388608 & i6;
                                                        if (i36 == 0) {
                                                        }
                                                        i37 = i36;
                                                        if ((i5 & 24576) == 0) {
                                                        }
                                                        i38 = i6 & 33554432;
                                                        if (i38 != 0) {
                                                        }
                                                        i39 = 67108864 & i6;
                                                        if (i39 == 0) {
                                                        }
                                                        if ((i14 & 306783379) == 306783378) {
                                                        }
                                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z5, i14 & 1)) {
                                                        }
                                                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                                        }
                                                    }
                                                    i26 |= i44;
                                                    i31 = i6 & 1048576;
                                                    if (i31 != 0) {
                                                    }
                                                    i33 = i6 & 2097152;
                                                    if (i33 != 0) {
                                                    }
                                                    int i532 = i32;
                                                    i34 = i6 & 4194304;
                                                    if (i34 != 0) {
                                                    }
                                                    i35 = i20;
                                                    i36 = 8388608 & i6;
                                                    if (i36 == 0) {
                                                    }
                                                    i37 = i36;
                                                    if ((i5 & 24576) == 0) {
                                                    }
                                                    i38 = i6 & 33554432;
                                                    if (i38 != 0) {
                                                    }
                                                    i39 = 67108864 & i6;
                                                    if (i39 == 0) {
                                                    }
                                                    if ((i14 & 306783379) == 306783378) {
                                                    }
                                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z5, i14 & 1)) {
                                                    }
                                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                                    }
                                                }
                                                i28 = i27;
                                                i29 = i6 & 262144;
                                                if (i29 == 0) {
                                                }
                                                i30 = i6 & 524288;
                                                if (i30 == 0) {
                                                }
                                                i26 |= i44;
                                                i31 = i6 & 1048576;
                                                if (i31 != 0) {
                                                }
                                                i33 = i6 & 2097152;
                                                if (i33 != 0) {
                                                }
                                                int i5322 = i32;
                                                i34 = i6 & 4194304;
                                                if (i34 != 0) {
                                                }
                                                i35 = i20;
                                                i36 = 8388608 & i6;
                                                if (i36 == 0) {
                                                }
                                                i37 = i36;
                                                if ((i5 & 24576) == 0) {
                                                }
                                                i38 = i6 & 33554432;
                                                if (i38 != 0) {
                                                }
                                                i39 = 67108864 & i6;
                                                if (i39 == 0) {
                                                }
                                                if ((i14 & 306783379) == 306783378) {
                                                }
                                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z5, i14 & 1)) {
                                                }
                                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                                }
                                            }
                                            i25 = i24;
                                            i26 = i52;
                                            i27 = i6 & 131072;
                                            if (i27 != 0) {
                                            }
                                            i28 = i27;
                                            i29 = i6 & 262144;
                                            if (i29 == 0) {
                                            }
                                            i30 = i6 & 524288;
                                            if (i30 == 0) {
                                            }
                                            i26 |= i44;
                                            i31 = i6 & 1048576;
                                            if (i31 != 0) {
                                            }
                                            i33 = i6 & 2097152;
                                            if (i33 != 0) {
                                            }
                                            int i53222 = i32;
                                            i34 = i6 & 4194304;
                                            if (i34 != 0) {
                                            }
                                            i35 = i20;
                                            i36 = 8388608 & i6;
                                            if (i36 == 0) {
                                            }
                                            i37 = i36;
                                            if ((i5 & 24576) == 0) {
                                            }
                                            i38 = i6 & 33554432;
                                            if (i38 != 0) {
                                            }
                                            i39 = 67108864 & i6;
                                            if (i39 == 0) {
                                            }
                                            if ((i14 & 306783379) == 306783378) {
                                            }
                                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z5, i14 & 1)) {
                                            }
                                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                            }
                                        }
                                        i23 = i6 & 32768;
                                        if (i23 == 0) {
                                        }
                                        i24 = i6 & 65536;
                                        if (i24 == 0) {
                                        }
                                        i25 = i24;
                                        i26 = i52;
                                        i27 = i6 & 131072;
                                        if (i27 != 0) {
                                        }
                                        i28 = i27;
                                        i29 = i6 & 262144;
                                        if (i29 == 0) {
                                        }
                                        i30 = i6 & 524288;
                                        if (i30 == 0) {
                                        }
                                        i26 |= i44;
                                        i31 = i6 & 1048576;
                                        if (i31 != 0) {
                                        }
                                        i33 = i6 & 2097152;
                                        if (i33 != 0) {
                                        }
                                        int i532222 = i32;
                                        i34 = i6 & 4194304;
                                        if (i34 != 0) {
                                        }
                                        i35 = i20;
                                        i36 = 8388608 & i6;
                                        if (i36 == 0) {
                                        }
                                        i37 = i36;
                                        if ((i5 & 24576) == 0) {
                                        }
                                        i38 = i6 & 33554432;
                                        if (i38 != 0) {
                                        }
                                        i39 = 67108864 & i6;
                                        if (i39 == 0) {
                                        }
                                        if ((i14 & 306783379) == 306783378) {
                                        }
                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z5, i14 & 1)) {
                                        }
                                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                        }
                                    }
                                    i21 = i6 & 16384;
                                    if (i21 != 0) {
                                    }
                                    i23 = i6 & 32768;
                                    if (i23 == 0) {
                                    }
                                    i24 = i6 & 65536;
                                    if (i24 == 0) {
                                    }
                                    i25 = i24;
                                    i26 = i52;
                                    i27 = i6 & 131072;
                                    if (i27 != 0) {
                                    }
                                    i28 = i27;
                                    i29 = i6 & 262144;
                                    if (i29 == 0) {
                                    }
                                    i30 = i6 & 524288;
                                    if (i30 == 0) {
                                    }
                                    i26 |= i44;
                                    i31 = i6 & 1048576;
                                    if (i31 != 0) {
                                    }
                                    i33 = i6 & 2097152;
                                    if (i33 != 0) {
                                    }
                                    int i5322222 = i32;
                                    i34 = i6 & 4194304;
                                    if (i34 != 0) {
                                    }
                                    i35 = i20;
                                    i36 = 8388608 & i6;
                                    if (i36 == 0) {
                                    }
                                    i37 = i36;
                                    if ((i5 & 24576) == 0) {
                                    }
                                    i38 = i6 & 33554432;
                                    if (i38 != 0) {
                                    }
                                    i39 = 67108864 & i6;
                                    if (i39 == 0) {
                                    }
                                    if ((i14 & 306783379) == 306783378) {
                                    }
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z5, i14 & 1)) {
                                    }
                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                    }
                                }
                                i20 = i6 & 8192;
                                if (i20 == 0) {
                                }
                                i21 = i6 & 16384;
                                if (i21 != 0) {
                                }
                                i23 = i6 & 32768;
                                if (i23 == 0) {
                                }
                                i24 = i6 & 65536;
                                if (i24 == 0) {
                                }
                                i25 = i24;
                                i26 = i52;
                                i27 = i6 & 131072;
                                if (i27 != 0) {
                                }
                                i28 = i27;
                                i29 = i6 & 262144;
                                if (i29 == 0) {
                                }
                                i30 = i6 & 524288;
                                if (i30 == 0) {
                                }
                                i26 |= i44;
                                i31 = i6 & 1048576;
                                if (i31 != 0) {
                                }
                                i33 = i6 & 2097152;
                                if (i33 != 0) {
                                }
                                int i53222222 = i32;
                                i34 = i6 & 4194304;
                                if (i34 != 0) {
                                }
                                i35 = i20;
                                i36 = 8388608 & i6;
                                if (i36 == 0) {
                                }
                                i37 = i36;
                                if ((i5 & 24576) == 0) {
                                }
                                i38 = i6 & 33554432;
                                if (i38 != 0) {
                                }
                                i39 = 67108864 & i6;
                                if (i39 == 0) {
                                }
                                if ((i14 & 306783379) == 306783378) {
                                }
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z5, i14 & 1)) {
                                }
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                }
                            }
                            int i522 = i17;
                            i19 = i6 & 4096;
                            if (i19 != 0) {
                            }
                            i20 = i6 & 8192;
                            if (i20 == 0) {
                            }
                            i21 = i6 & 16384;
                            if (i21 != 0) {
                            }
                            i23 = i6 & 32768;
                            if (i23 == 0) {
                            }
                            i24 = i6 & 65536;
                            if (i24 == 0) {
                            }
                            i25 = i24;
                            i26 = i522;
                            i27 = i6 & 131072;
                            if (i27 != 0) {
                            }
                            i28 = i27;
                            i29 = i6 & 262144;
                            if (i29 == 0) {
                            }
                            i30 = i6 & 524288;
                            if (i30 == 0) {
                            }
                            i26 |= i44;
                            i31 = i6 & 1048576;
                            if (i31 != 0) {
                            }
                            i33 = i6 & 2097152;
                            if (i33 != 0) {
                            }
                            int i532222222 = i32;
                            i34 = i6 & 4194304;
                            if (i34 != 0) {
                            }
                            i35 = i20;
                            i36 = 8388608 & i6;
                            if (i36 == 0) {
                            }
                            i37 = i36;
                            if ((i5 & 24576) == 0) {
                            }
                            i38 = i6 & 33554432;
                            if (i38 != 0) {
                            }
                            i39 = 67108864 & i6;
                            if (i39 == 0) {
                            }
                            if ((i14 & 306783379) == 306783378) {
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z5, i14 & 1)) {
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                            }
                        }
                        i16 = i6 & 1024;
                        if (i16 == 0) {
                        }
                        i18 = i6 & 2048;
                        if (i18 == 0) {
                        }
                        int i5222 = i17;
                        i19 = i6 & 4096;
                        if (i19 != 0) {
                        }
                        i20 = i6 & 8192;
                        if (i20 == 0) {
                        }
                        i21 = i6 & 16384;
                        if (i21 != 0) {
                        }
                        i23 = i6 & 32768;
                        if (i23 == 0) {
                        }
                        i24 = i6 & 65536;
                        if (i24 == 0) {
                        }
                        i25 = i24;
                        i26 = i5222;
                        i27 = i6 & 131072;
                        if (i27 != 0) {
                        }
                        i28 = i27;
                        i29 = i6 & 262144;
                        if (i29 == 0) {
                        }
                        i30 = i6 & 524288;
                        if (i30 == 0) {
                        }
                        i26 |= i44;
                        i31 = i6 & 1048576;
                        if (i31 != 0) {
                        }
                        i33 = i6 & 2097152;
                        if (i33 != 0) {
                        }
                        int i5322222222 = i32;
                        i34 = i6 & 4194304;
                        if (i34 != 0) {
                        }
                        i35 = i20;
                        i36 = 8388608 & i6;
                        if (i36 == 0) {
                        }
                        i37 = i36;
                        if ((i5 & 24576) == 0) {
                        }
                        i38 = i6 & 33554432;
                        if (i38 != 0) {
                        }
                        i39 = 67108864 & i6;
                        if (i39 == 0) {
                        }
                        if ((i14 & 306783379) == 306783378) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z5, i14 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        }
                    }
                    i14 = i7;
                    i15 = i6 & 512;
                    if (i15 != 0) {
                    }
                    i16 = i6 & 1024;
                    if (i16 == 0) {
                    }
                    i18 = i6 & 2048;
                    if (i18 == 0) {
                    }
                    int i52222 = i17;
                    i19 = i6 & 4096;
                    if (i19 != 0) {
                    }
                    i20 = i6 & 8192;
                    if (i20 == 0) {
                    }
                    i21 = i6 & 16384;
                    if (i21 != 0) {
                    }
                    i23 = i6 & 32768;
                    if (i23 == 0) {
                    }
                    i24 = i6 & 65536;
                    if (i24 == 0) {
                    }
                    i25 = i24;
                    i26 = i52222;
                    i27 = i6 & 131072;
                    if (i27 != 0) {
                    }
                    i28 = i27;
                    i29 = i6 & 262144;
                    if (i29 == 0) {
                    }
                    i30 = i6 & 524288;
                    if (i30 == 0) {
                    }
                    i26 |= i44;
                    i31 = i6 & 1048576;
                    if (i31 != 0) {
                    }
                    i33 = i6 & 2097152;
                    if (i33 != 0) {
                    }
                    int i53222222222 = i32;
                    i34 = i6 & 4194304;
                    if (i34 != 0) {
                    }
                    i35 = i20;
                    i36 = 8388608 & i6;
                    if (i36 == 0) {
                    }
                    i37 = i36;
                    if ((i5 & 24576) == 0) {
                    }
                    i38 = i6 & 33554432;
                    if (i38 != 0) {
                    }
                    i39 = 67108864 & i6;
                    if (i39 == 0) {
                    }
                    if ((i14 & 306783379) == 306783378) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z5, i14 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                i12 = i6 & 256;
                if (i12 == 0) {
                }
                i14 = i7;
                i15 = i6 & 512;
                if (i15 != 0) {
                }
                i16 = i6 & 1024;
                if (i16 == 0) {
                }
                i18 = i6 & 2048;
                if (i18 == 0) {
                }
                int i522222 = i17;
                i19 = i6 & 4096;
                if (i19 != 0) {
                }
                i20 = i6 & 8192;
                if (i20 == 0) {
                }
                i21 = i6 & 16384;
                if (i21 != 0) {
                }
                i23 = i6 & 32768;
                if (i23 == 0) {
                }
                i24 = i6 & 65536;
                if (i24 == 0) {
                }
                i25 = i24;
                i26 = i522222;
                i27 = i6 & 131072;
                if (i27 != 0) {
                }
                i28 = i27;
                i29 = i6 & 262144;
                if (i29 == 0) {
                }
                i30 = i6 & 524288;
                if (i30 == 0) {
                }
                i26 |= i44;
                i31 = i6 & 1048576;
                if (i31 != 0) {
                }
                i33 = i6 & 2097152;
                if (i33 != 0) {
                }
                int i532222222222 = i32;
                i34 = i6 & 4194304;
                if (i34 != 0) {
                }
                i35 = i20;
                i36 = 8388608 & i6;
                if (i36 == 0) {
                }
                i37 = i36;
                if ((i5 & 24576) == 0) {
                }
                i38 = i6 & 33554432;
                if (i38 != 0) {
                }
                i39 = 67108864 & i6;
                if (i39 == 0) {
                }
                if ((i14 & 306783379) == 306783378) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z5, i14 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            i9 = i6 & 32;
            int i482 = 131072;
            if (i9 != 0) {
            }
            i10 = i6 & 64;
            if (i10 != 0) {
            }
            i11 = i6 & 128;
            if (i11 != 0) {
            }
            i12 = i6 & 256;
            if (i12 == 0) {
            }
            i14 = i7;
            i15 = i6 & 512;
            if (i15 != 0) {
            }
            i16 = i6 & 1024;
            if (i16 == 0) {
            }
            i18 = i6 & 2048;
            if (i18 == 0) {
            }
            int i5222222 = i17;
            i19 = i6 & 4096;
            if (i19 != 0) {
            }
            i20 = i6 & 8192;
            if (i20 == 0) {
            }
            i21 = i6 & 16384;
            if (i21 != 0) {
            }
            i23 = i6 & 32768;
            if (i23 == 0) {
            }
            i24 = i6 & 65536;
            if (i24 == 0) {
            }
            i25 = i24;
            i26 = i5222222;
            i27 = i6 & 131072;
            if (i27 != 0) {
            }
            i28 = i27;
            i29 = i6 & 262144;
            if (i29 == 0) {
            }
            i30 = i6 & 524288;
            if (i30 == 0) {
            }
            i26 |= i44;
            i31 = i6 & 1048576;
            if (i31 != 0) {
            }
            i33 = i6 & 2097152;
            if (i33 != 0) {
            }
            int i5322222222222 = i32;
            i34 = i6 & 4194304;
            if (i34 != 0) {
            }
            i35 = i20;
            i36 = 8388608 & i6;
            if (i36 == 0) {
            }
            i37 = i36;
            if ((i5 & 24576) == 0) {
            }
            i38 = i6 & 33554432;
            if (i38 != 0) {
            }
            i39 = 67108864 & i6;
            if (i39 == 0) {
            }
            if ((i14 & 306783379) == 306783378) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z5, i14 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        i8 = i6 & 16;
        if (i8 == 0) {
        }
        i9 = i6 & 32;
        int i4822 = 131072;
        if (i9 != 0) {
        }
        i10 = i6 & 64;
        if (i10 != 0) {
        }
        i11 = i6 & 128;
        if (i11 != 0) {
        }
        i12 = i6 & 256;
        if (i12 == 0) {
        }
        i14 = i7;
        i15 = i6 & 512;
        if (i15 != 0) {
        }
        i16 = i6 & 1024;
        if (i16 == 0) {
        }
        i18 = i6 & 2048;
        if (i18 == 0) {
        }
        int i52222222 = i17;
        i19 = i6 & 4096;
        if (i19 != 0) {
        }
        i20 = i6 & 8192;
        if (i20 == 0) {
        }
        i21 = i6 & 16384;
        if (i21 != 0) {
        }
        i23 = i6 & 32768;
        if (i23 == 0) {
        }
        i24 = i6 & 65536;
        if (i24 == 0) {
        }
        i25 = i24;
        i26 = i52222222;
        i27 = i6 & 131072;
        if (i27 != 0) {
        }
        i28 = i27;
        i29 = i6 & 262144;
        if (i29 == 0) {
        }
        i30 = i6 & 524288;
        if (i30 == 0) {
        }
        i26 |= i44;
        i31 = i6 & 1048576;
        if (i31 != 0) {
        }
        i33 = i6 & 2097152;
        if (i33 != 0) {
        }
        int i53222222222222 = i32;
        i34 = i6 & 4194304;
        if (i34 != 0) {
        }
        i35 = i20;
        i36 = 8388608 & i6;
        if (i36 == 0) {
        }
        i37 = i36;
        if ((i5 & 24576) == 0) {
        }
        i38 = i6 & 33554432;
        if (i38 != 0) {
        }
        i39 = 67108864 & i6;
        if (i39 == 0) {
        }
        if ((i14 & 306783379) == 306783378) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z5, i14 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    public static final class onExtraCallback implements component5 {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        public static final onExtraCallback onWarmupCompleted = new onExtraCallback();

        static {
            int i = onExtraCallback + 81;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        onExtraCallback() {
        }

        public static /* synthetic */ Unit onNavigationEvent(List list, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 97;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onWarmupCompleted(list, onextracallbackwithresult);
            }
            onWarmupCompleted(list, onextracallbackwithresult);
            throw null;
        }

        public /* bridge */ int IAuthTabCallback(FuturesExternalSyntheticLambda3 futuresExternalSyntheticLambda3, List<? extends FuturesExternalSyntheticLambda2> list, int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 123;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int iIAuthTabCallback = super.IAuthTabCallback(futuresExternalSyntheticLambda3, list, i);
            if (i4 != 0) {
                int i5 = 8 / 0;
            }
            int i6 = onNavigationEvent + 85;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return iIAuthTabCallback;
        }

        public /* bridge */ int onExtraCallback(FuturesExternalSyntheticLambda3 futuresExternalSyntheticLambda3, List<? extends FuturesExternalSyntheticLambda2> list, int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 19;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int iOnExtraCallback = super.onExtraCallback(futuresExternalSyntheticLambda3, list, i);
            int i5 = IAuthTabCallback + 73;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return iOnExtraCallback;
            }
            throw null;
        }

        public /* bridge */ int onNavigationEvent(FuturesExternalSyntheticLambda3 futuresExternalSyntheticLambda3, List<? extends FuturesExternalSyntheticLambda2> list, int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 37;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int iOnNavigationEvent = super.onNavigationEvent(futuresExternalSyntheticLambda3, list, i);
            if (i4 != 0) {
                int i5 = 13 / 0;
            }
            return iOnNavigationEvent;
        }

        public /* bridge */ int onWarmupCompleted(FuturesExternalSyntheticLambda3 futuresExternalSyntheticLambda3, List<? extends FuturesExternalSyntheticLambda2> list, int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 15;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return super.onWarmupCompleted(futuresExternalSyntheticLambda3, list, i);
            }
            super.onWarmupCompleted(futuresExternalSyntheticLambda3, list, i);
            throw null;
        }

        public final component8 onExtraCallbackWithResult(component4 component4Var, List<? extends component7> list, long j) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(component4Var, "");
            Intrinsics.checkNotNullParameter(list, "");
            final ArrayList arrayList = new ArrayList(list.size());
            int i2 = 0;
            Integer numValueOf = 0;
            int size = list.size();
            int i3 = IAuthTabCallback + 37;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            for (int i5 = 0; i5 < size; i5++) {
                arrayList.add(list.get(i5).onExtraCallback(j));
            }
            int size2 = arrayList.size();
            int i6 = onNavigationEvent + 95;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 4 % 3;
            }
            Integer numValueOf2 = numValueOf;
            for (int i8 = 0; i8 < size2; i8++) {
                numValueOf2 = Integer.valueOf(Math.max(numValueOf2.intValue(), ((getStreamSharingChildren) arrayList.get(i8)).getInterfaceDescriptor()));
            }
            int iIntValue = numValueOf2.intValue();
            int size3 = arrayList.size();
            while (i2 < size3) {
                int i9 = IAuthTabCallback + 33;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 == 0) {
                    numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((getStreamSharingChildren) arrayList.get(i2)).T_()));
                    i2 += 95;
                } else {
                    numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((getStreamSharingChildren) arrayList.get(i2)).T_()));
                    i2++;
                }
            }
            return component4.IAuthTabCallback(component4Var, iIntValue, numValueOf.intValue(), (Map) null, new Function1() { // from class: im.toss.compose.v3.textfield.TextFieldsKt$SimpleLayout$1$1$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj) {
                    int i10 = 2 % 2;
                    int i11 = onWarmupCompleted + 1;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                    Unit unitOnNavigationEvent = setDefaultFontFileExtension.onExtraCallback.onNavigationEvent(arrayList, (getStreamSharingChildren.onExtraCallbackWithResult) obj);
                    int i13 = onExtraCallbackWithResult + 79;
                    onWarmupCompleted = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i14 = 33 / 0;
                    }
                    return unitOnNavigationEvent;
                }
            }, 4, (Object) null);
        }

        private static final Unit onWarmupCompleted(List list, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            int size = list.size();
            int i4 = onNavigationEvent + 95;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 0;
            while (i6 < size) {
                int i7 = onNavigationEvent + 57;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, (getStreamSharingChildren) list.get(i6), 1, 1, 2.0f, 5, (Object) null);
                    i6 += 47;
                } else {
                    getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, (getStreamSharingChildren) list.get(i6), 0, 0, 0.0f, 4, (Object) null);
                    i6++;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IAuthTabCallback(final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        int i4;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i5;
        int i6 = 2 % 2;
        int i7 = IAuthTabCallbackDefault + 9;
        IAuthTabCallbackStub = i7 % 128;
        if (i7 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1293144311);
            i3 = i2 & 1;
            if (i3 != 0) {
                i4 = i | 6;
            }
            if ((i & 48) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2)) {
                    int i8 = IAuthTabCallbackStub + 125;
                    IAuthTabCallbackDefault = i8 % 128;
                    i5 = i8 % 2 != 0 ? 89 : 32;
                } else {
                    i5 = 16;
                }
                i4 |= i5;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 19) == 18, i4 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            } else {
                if (i3 != 0) {
                    int i9 = IAuthTabCallbackStub + 45;
                    IAuthTabCallbackDefault = i9 % 128;
                    int i10 = i9 % 2;
                    quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i11 = IAuthTabCallbackDefault + 67;
                    IAuthTabCallbackStub = i11 % 128;
                    if (i11 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1293144311, i4, -1, "im.toss.compose.v3.textfield.SimpleLayout (TextFields.kt:1570)");
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1293144311, i4, -1, "im.toss.compose.v3.textfield.SimpleLayout (TextFields.kt:1570)");
                }
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = onExtraCallback.onWarmupCompleted;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                component5 component5Var = (component5) objOnMinimized;
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
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
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5Var, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                function2.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(((((((((i4 >> 3) & 14) | 384) | ((i4 << 3) & 112)) << 6) & 896) | 6) >> 6) & 14));
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v3.textfield.TextFieldsKt$$ExternalSyntheticLambda4
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i12 = 2 % 2;
                        int i13 = onExtraCallback + 9;
                        onWarmupCompleted = i13 % 128;
                        if (i13 % 2 == 0) {
                            setDefaultFontFileExtension.onNavigationEvent(quirksExternalSyntheticBackport0, function2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        Unit unitOnNavigationEvent = setDefaultFontFileExtension.onNavigationEvent(quirksExternalSyntheticBackport0, function2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i14 = onExtraCallback + 73;
                        onWarmupCompleted = i14 % 128;
                        int i15 = i14 % 2;
                        return unitOnNavigationEvent;
                    }
                });
                return;
            }
            return;
        }
        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1293144311);
        i3 = 0;
        if ((i & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 19) == 18, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final setAnimationFromUrl onWarmupCompleted(boolean z, boolean z2, @NotNull Object[] objArr, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object obj;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 53;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(objArr, "");
        if ((i2 & 1) != 0) {
            int i6 = IAuthTabCallbackStub + 1;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-697841341, i, -1, "im.toss.compose.v3.textfield.rememberInputState (TextFields.kt:1868)");
        }
        boolean zOnNavigationEvent = false;
        for (Object obj2 : Arrays.copyOf(objArr, objArr.length)) {
            zOnNavigationEvent |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(obj2);
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnNavigationEvent) {
            obj = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                setAnimationFromUrl setanimationfromurl = new setAnimationFromUrl();
                setanimationfromurl.onNavigationEvent(z);
                setanimationfromurl.onExtraCallbackWithResult(z2);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(setanimationfromurl);
                obj = setanimationfromurl;
            }
        }
        setAnimationFromUrl setanimationfromurl2 = (setAnimationFromUrl) obj;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i8 = IAuthTabCallbackDefault + 109;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
        }
        return setanimationfromurl2;
    }

    public static final QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final float f, final long j) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = SessionProcessorSurface.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, new Function1() { // from class: im.toss.compose.v3.textfield.TextFieldsKt$$ExternalSyntheticLambda3
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 79;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {Float.valueOf(f), Long.valueOf(j), (setOrientationDegrees) obj};
                Unit unit = (Unit) setDefaultFontFileExtension.onWarmupCompleted(-706705406, 706705413, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), objArr);
                int i5 = onNavigationEvent + 125;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 98 / 0;
                }
                return unit;
            }
        });
        int i2 = IAuthTabCallbackStub + 49;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
    }

    private static final Unit onNavigationEvent(float f, long j, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 43;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        float fIAuthTabCallback = f * setorientationdegrees.IAuthTabCallback();
        float fIntBitsToFloat = Float.intBitsToFloat((int) setorientationdegrees.onTransact()) - (fIAuthTabCallback / 2.0f);
        setOrientationDegrees.onExtraCallback(setorientationdegrees, j, setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L)), setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(Float.intBitsToFloat((int) (setorientationdegrees.onTransact() >> 32))) << 32) | (4294967295L & Float.floatToRawIntBits(fIntBitsToFloat))), fIAuthTabCallback, 0, (fromKilometersPerHour) null, 0.0f, (seek) null, 0, 496, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 53;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final float f, @NotNull final Function0<setByteOrder> function0, @NotNull final Function0<Float> function02) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = SessionProcessorSurface.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, new Function1() { // from class: im.toss.compose.v3.textfield.TextFieldsKt$$ExternalSyntheticLambda11
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 119;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitIAuthTabCallback = setDefaultFontFileExtension.IAuthTabCallback(f, function0, function02, (setOrientationDegrees) obj);
                int i5 = onExtraCallback + 63;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return unitIAuthTabCallback;
            }
        });
        int i2 = IAuthTabCallbackDefault + 77;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
    }

    private static final Unit onWarmupCompleted(float f, Function0 function0, Function0 function02, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 121;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        float fIAuthTabCallback = f * setorientationdegrees.IAuthTabCallback();
        float fIntBitsToFloat = Float.intBitsToFloat((int) setorientationdegrees.onTransact()) - (fIAuthTabCallback / 2.0f);
        setOrientationDegrees.onExtraCallback(setorientationdegrees, ((setByteOrder) function0.invoke()).access100(), setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L)), setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(Float.intBitsToFloat((int) (setorientationdegrees.onTransact() >> 32)) * ((Number) function02.invoke()).floatValue()) << 32) | (4294967295L & Float.floatToRawIntBits(fIntBitsToFloat))), fIAuthTabCallback, 0, (fromKilometersPerHour) null, 0.0f, (seek) null, 0, 496, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 43;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final void onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 37;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-981330467);
            throw null;
        }
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-981330467);
        if (i != 0) {
            int i4 = IAuthTabCallbackDefault + 25;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-981330467, i, -1, "im.toss.compose.v3.textfield.Preview (TextFields.kt:2018)");
            }
            Object[] objArr = {setAnimationFromJson.onWarmupCompleted};
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2) setAnimationFromJson.onWarmupCompleted(ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), objArr, 60145915, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -60145904, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback()), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (!(true ^ CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TextFieldsKt$.ExternalSyntheticLambda8(i));
        }
        int i6 = IAuthTabCallbackDefault + 25;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r4
      0x0022: PHI (r4v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r4v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r4v5 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0020, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 93;
        IAuthTabCallbackStub = i3 % 128;
        boolean z = false;
        if (i3 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1822966501);
            int i4 = 80 / 0;
            if (i != 0) {
                z = true;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1822966501);
            if (i != 0) {
            }
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1822966501, i, -1, "im.toss.compose.v3.textfield.Preview2 (TextFields.kt:2151)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(setAnimationFromJson.onWarmupCompleted.onWarmupCompleted(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallbackStub + 53;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TextFieldsKt$.ExternalSyntheticLambda12(i));
        }
    }

    private static final getHumanReadableName onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 27;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        getHumanReadableName gethumanreadablename = (getHumanReadableName) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            return gethumanreadablename;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 55;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        getMergedResolutions getmergedresolutions = (getMergedResolutions) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 89;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return getmergedresolutions;
        }
        obj.hashCode();
        throw null;
    }

    private static final selectParentResolutions onExtraCallback(getSupportedHighSpeedResolutionsFor<selectParentResolutions> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 45;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        selectParentResolutions selectparentresolutions = (selectParentResolutions) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            return selectparentresolutions;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        selectParentResolutions selectparentresolutions = (selectParentResolutions) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 5;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(selectparentresolutions);
        int i4 = IAuthTabCallbackDefault + 105;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static final String onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 21;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackDefault + 83;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static final void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(str);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(selectParentResolutions selectparentresolutions, Function1 function1, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, setCacheComposition.onExtraCallback onextracallback, Function0 function0, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, boolean z, getBacktraceNote getbacktracenote3, getBacktraceNote getbacktracenote4, getBacktraceNote getbacktracenote5, getBacktraceNote getbacktracenote6, setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault, getMergedResolutions getmergedresolutions, setCacheComposition.onWarmupCompleted onwarmupcompleted, setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult, CameraUnavailableException cameraUnavailableException, CameraState cameraState, boolean z2, boolean z3, boolean z4, int i, int i2, setCacheComposition.IAuthTabCallback iAuthTabCallback, Function1 function12, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, int i3, int i4, int i5, int i6, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i7) {
        Object[] objArr = {selectparentresolutions, function1, iAuthTabCallbackStub, quirksExternalSyntheticBackport0, onextracallback, function0, getbacktracenote, getbacktracenote2, Boolean.valueOf(z), getbacktracenote3, getbacktracenote4, getbacktracenote5, getbacktracenote6, iAuthTabCallbackDefault, getmergedresolutions, onwarmupcompleted, onextracallbackwithresult, cameraUnavailableException, cameraState, Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), Integer.valueOf(i), Integer.valueOf(i2), iAuthTabCallback, function12, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i7)};
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onWarmupCompleted(-2021328229, 2021328241, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, objArr);
    }

    public static /* synthetic */ Unit onWarmupCompleted(float f, long j, setOrientationDegrees setorientationdegrees) {
        Object[] objArr = {Float.valueOf(f), Long.valueOf(j), setorientationdegrees};
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onWarmupCompleted(-706705406, 706705413, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, objArr);
    }

    private static final Unit onExtraCallbackWithResult(Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, getMergedResolutions getmergedresolutions, boolean z, setCacheComposition.onWarmupCompleted onwarmupcompleted, boolean z2, setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault, selectParentResolutions selectparentresolutions, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, setAnimationFromUrl setanimationfromurl, int i, Function0 function0, setCacheComposition.IAuthTabCallback iAuthTabCallback, Function1 function1, int i2, Function1 function12, CameraUnavailableException cameraUnavailableException, CameraState cameraState, setCacheComposition.onExtraCallback onextracallback, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, getBacktraceNote getbacktracenote4, getBacktraceNote getbacktracenote5, getBacktraceNote getbacktracenote6, setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult, initSDK initsdk, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {camera2CapturePipelineTorchTaskExternalSyntheticLambda2, iAuthTabCallbackStub, getmergedresolutions, Boolean.valueOf(z), onwarmupcompleted, Boolean.valueOf(z2), iAuthTabCallbackDefault, selectparentresolutions, quirksExternalSyntheticBackport0, setanimationfromurl, Integer.valueOf(i), function0, iAuthTabCallback, function1, Integer.valueOf(i2), function12, cameraUnavailableException, cameraState, onextracallback, getbacktracenote, getbacktracenote2, getbacktracenote3, getbacktracenote4, getbacktracenote5, getbacktracenote6, onextracallbackwithresult, initsdk, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onWarmupCompleted(-134574893, 134574895, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, objArr);
    }

    private static final getMergedResolutions IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<? extends getMergedResolutions> cameraPresenceProviderExternalSyntheticLambda6) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (getMergedResolutions) onWarmupCompleted(100144392, -100144387, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, new Object[]{cameraPresenceProviderExternalSyntheticLambda6});
    }

    private static final Unit IAuthTabCallback(setCacheComposition.onTransact ontransact, selectParentResolutions selectparentresolutions, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, setAnimationFromUrl setanimationfromurl, setCacheComposition.onNavigationEvent onnavigationevent, int i, Function0 function0, setCacheComposition.IAuthTabCallback iAuthTabCallback, Function1 function1, int i2, Function1 function12, CameraUnavailableException cameraUnavailableException, CameraState cameraState, getMergedResolutions getmergedresolutions, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, setCacheComposition.onExtraCallback onextracallback, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, boolean z, getBacktraceNote getbacktracenote3, getBacktraceNote getbacktracenote4, getBacktraceNote getbacktracenote5, getBacktraceNote getbacktracenote6, setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault, setCacheComposition.onWarmupCompleted onwarmupcompleted, setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {ontransact, selectparentresolutions, quirksExternalSyntheticBackport0, quirksExternalSyntheticBackport02, setanimationfromurl, onnavigationevent, Integer.valueOf(i), function0, iAuthTabCallback, function1, Integer.valueOf(i2), function12, cameraUnavailableException, cameraState, getmergedresolutions, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, iAuthTabCallbackStub, onextracallback, getbacktracenote, getbacktracenote2, Boolean.valueOf(z), getbacktracenote3, getbacktracenote4, getbacktracenote5, getbacktracenote6, iAuthTabCallbackDefault, onwarmupcompleted, onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onWarmupCompleted(1219836966, -1219836966, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, objArr);
    }

    private static final Unit IAuthTabCallback(SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onWarmupCompleted(1609865471, -1609865460, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, new Object[]{surfaceProcessorNodeOut});
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor<selectParentResolutions> getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        onWarmupCompleted(-800368528, 800368532, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, new Object[]{getsupportedhighspeedresolutionsfor, selectparentresolutions});
    }

    private static final Unit onWarmupCompleted(selectParentResolutions selectparentresolutions, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onWarmupCompleted(-630215645, 630215655, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, new Object[]{selectparentresolutions, getsupportedhighspeedresolutionsfor});
    }

    public static final /* synthetic */ setCacheComposition.onTransact IAuthTabCallback() {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (setCacheComposition.onTransact) onWarmupCompleted(1874735448, -1874735439, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, new Object[0]);
    }

    private static final setCacheComposition.onTransact access000() {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (setCacheComposition.onTransact) onWarmupCompleted(-325134750, 325134756, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, new Object[0]);
    }

    private static final setCacheComposition.onTransact IAuthTabCallback_Parcel() {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (setCacheComposition.onTransact) onWarmupCompleted(1452002419, -1452002411, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, new Object[0]);
    }

    public static final setCacheComposition.onWarmupCompleted IAuthTabCallbackStub() {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (setCacheComposition.onWarmupCompleted) onWarmupCompleted(-248910434, 248910435, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, new Object[0]);
    }

    public static final setCacheComposition.onExtraCallbackWithResult IAuthTabCallbackDefault() {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (setCacheComposition.onExtraCallbackWithResult) onWarmupCompleted(-1526083409, 1526083412, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, new Object[0]);
    }
}
