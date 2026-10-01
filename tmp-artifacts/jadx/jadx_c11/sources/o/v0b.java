package o;

import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.semantics.Role;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import im.toss.features.usshome.UssHomeItemAdapter$;
import im.toss.global.features.kyc.eu.main.cdd.ui.identity_confirm.GlobalKycEuIdentityConfirmViewModel;
import im.toss.tds.compose.component.compound.chip.v1.RightAccessoryPreset;
import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SessionProcessorCaptureCallback;
import o.getBacktraceNote;
import o.getSubtitle;
import o.noStore;
import o.readFully;
import o.removeObserverLocked;
import o.setIso;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import o.v0a;
import o.v0b;
import o.v2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class v0b implements RowScope {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final RowScope onWarmupCompleted;

    public static final /* synthetic */ class IAuthTabCallback {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        public static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[v2.onWarmupCompleted.values().length];
            try {
                iArr[v2.onWarmupCompleted.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v2.onWarmupCompleted.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            IAuthTabCallback = iArr;
            int[] iArr2 = new int[v2.onExtraCallback.values().length];
            try {
                iArr2[v2.onExtraCallback.Pill.ordinal()] = 1;
                int i = onExtraCallbackWithResult + 45;
                onExtraCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[v2.onExtraCallback.Square.ordinal()] = 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            onNavigationEvent = iArr2;
            int i5 = onExtraCallbackWithResult + 33;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(v0b v0bVar, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, boolean z, boolean z2, boolean z3, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getSubtitle getsubtitle, v0a v0aVar, getBacktraceNote getbacktracenote3, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws NoWhenBranchMatchedException {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return onNavigationEvent(v0bVar, function0, quirksExternalSyntheticBackport0, getbacktracenote, getbacktracenote2, z, z2, z3, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, v0aVar, getbacktracenote3, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        }
        onNavigationEvent(v0bVar, function0, quirksExternalSyntheticBackport0, getbacktracenote, getbacktracenote2, z, z2, z3, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, v0aVar, getbacktracenote3, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i6 | i4;
        int i8 = ~i4;
        int i9 = ~i3;
        int i10 = ~(i8 | i9);
        int i11 = ~i6;
        int i12 = i10 | (~(i11 | i3));
        int i13 = ~(i9 | i6);
        int i14 = i12 | i13;
        int i15 = (~(i3 | i11 | i4)) | i13;
        int i16 = i6 + i4 + i + (1881146393 * i2) + ((-1035018111) * i5);
        int i17 = i16 * i16;
        int i18 = ((i6 * (-1924067824)) - 304087040) + ((-1924067824) * i4) + (i7 * (-674303503)) + ((-674303503) * i14) + (674303503 * i15) + (1696595968 * i) + (1612709888 * i2) + ((-182452224) * i5) + ((-1611137024) * i17);
        int i19 = (i6 * (-928100048)) + 945860906 + (i4 * (-928100048)) + (i7 * (-189)) + (i14 * (-189)) + (i15 * 189) + (i * (-928100237)) + (i2 * (-1331189957)) + (i5 * 1329932787) + (i17 * 1550319616);
        int i20 = i18 + (i19 * i19 * 1690828800);
        return i20 != 1 ? i20 != 2 ? i20 != 3 ? i20 != 4 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, v0a v0aVar, boolean z, boolean z2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z3, getSubtitle getsubtitle, toMetersPerSecond tometerspersecond, Function0 function0, v2.onWarmupCompleted onwarmupcompleted, v2.onExtraCallback onextracallback, v2.IAuthTabCallback iAuthTabCallback, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, v0aVar, z, z2, quirksExternalSyntheticBackport0, z3, getsubtitle, tometerspersecond, function0, onwarmupcompleted, onextracallback, iAuthTabCallback, getbacktracenote, getbacktracenote2, getbacktracenote3, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 125;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return onNavigationEvent(getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onNavigationEvent(getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(v0b v0bVar, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, boolean z, boolean z2, boolean z3, v0a v0aVar, Function0 function0, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getSubtitle getsubtitle, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int iOnExtraCallbackWithResult;
        int iOnExtraCallbackWithResult2;
        int i5 = 2 % 2;
        int i6 = IAuthTabCallback + 9;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            iOnExtraCallbackWithResult = RecomposeScopeImplKt.onExtraCallbackWithResult(i);
            iOnExtraCallbackWithResult2 = RecomposeScopeImplKt.onExtraCallbackWithResult(i2);
        } else {
            iOnExtraCallbackWithResult = RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1);
            iOnExtraCallbackWithResult2 = RecomposeScopeImplKt.onExtraCallbackWithResult(i2);
        }
        v0bVar.onExtraCallbackWithResult(str, quirksExternalSyntheticBackport0, (getBacktraceNote<? super v2c, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote, (getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote2, z, z2, z3, v0aVar, (Function0<Unit>) function0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, cameraCaptureResultEmptyCameraCaptureResult, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, i3);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 115;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ removeObserverLocked onExtraCallbackWithResult(toMetersPerSecond tometerspersecond, long j, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda63, boolean z, boolean z2, v2.onWarmupCompleted onwarmupcompleted, v2.onExtraCallback onextracallback, v0a v0aVar, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda64, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(tometerspersecond, j, cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, cameraPresenceProviderExternalSyntheticLambda63, z, z2, onwarmupcompleted, onextracallback, v0aVar, cameraPresenceProviderExternalSyntheticLambda64, sessionProcessorCaptureCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        removeObserverLocked removeobserverlockedOnNavigationEvent = onNavigationEvent(tometerspersecond, j, cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, cameraPresenceProviderExternalSyntheticLambda63, z, z2, onwarmupcompleted, onextracallback, v0aVar, cameraPresenceProviderExternalSyntheticLambda64, sessionProcessorCaptureCallback);
        int i3 = IAuthTabCallback + 35;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return removeobserverlockedOnNavigationEvent;
    }

    public static /* synthetic */ Unit onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = IAuthTabCallback + 27;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return (Unit) onExtraCallback(new Object[]{str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -448867527, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 448867531);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(v0b v0bVar, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, boolean z, boolean z2, boolean z3, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getSubtitle getsubtitle, v0a v0aVar, getBacktraceNote getbacktracenote3, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws NoWhenBranchMatchedException {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        v0bVar.IAuthTabCallback(function0, quirksExternalSyntheticBackport0, getbacktracenote, getbacktracenote2, z, z2, z3, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, v0aVar, getbacktracenote3, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        v0b v0bVar = (v0b) objArr[0];
        String str = (String) objArr[1];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[2];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[3];
        getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[4];
        boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[6]).booleanValue();
        boolean zBooleanValue3 = ((Boolean) objArr[7]).booleanValue();
        v0a v0aVar = (v0a) objArr[8];
        Function0 function0 = (Function0) objArr[9];
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objArr[10];
        getSubtitle getsubtitle = (getSubtitle) objArr[11];
        int iIntValue = ((Number) objArr[12]).intValue();
        int iIntValue2 = ((Number) objArr[13]).intValue();
        int iIntValue3 = ((Number) objArr[14]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[15];
        int iIntValue4 = ((Number) objArr[16]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(v0bVar, str, quirksExternalSyntheticBackport0, getbacktracenote, getbacktracenote2, zBooleanValue, zBooleanValue2, zBooleanValue3, v0aVar, function0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, iIntValue, iIntValue2, iIntValue3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue4);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(v0bVar, str, quirksExternalSyntheticBackport0, getbacktracenote, getbacktracenote2, zBooleanValue, zBooleanValue2, zBooleanValue3, v0aVar, function0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, iIntValue, iIntValue2, iIntValue3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue4);
        int i3 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 28 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(v2.IAuthTabCallback iAuthTabCallback, boolean z, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(iAuthTabCallback, z, useandconfigureprogramwithtexture);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(iAuthTabCallback, z, useandconfigureprogramwithtexture);
        int i3 = onExtraCallbackWithResult + 59;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 47 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(v2.onExtraCallback onextracallback, v2.onWarmupCompleted onwarmupcompleted, v0a v0aVar, boolean z, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, boolean z2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z3, getSubtitle getsubtitle, Function0 function0, v2.IAuthTabCallback iAuthTabCallback, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        Unit unitIAuthTabCallback;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 3;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            unitIAuthTabCallback = IAuthTabCallback(onextracallback, onwarmupcompleted, v0aVar, z, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, z2, quirksExternalSyntheticBackport0, z3, getsubtitle, function0, iAuthTabCallback, getbacktracenote, getbacktracenote2, getbacktracenote3, cameraCaptureResultEmptyCameraCaptureResult, i);
            int i4 = 10 / 0;
        } else {
            unitIAuthTabCallback = IAuthTabCallback(onextracallback, onwarmupcompleted, v0aVar, z, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, z2, quirksExternalSyntheticBackport0, z3, getsubtitle, function0, iAuthTabCallback, getbacktracenote, getbacktracenote2, getbacktracenote3, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        int i5 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(v2.onWarmupCompleted onwarmupcompleted, v0a v0aVar, boolean z, v2.onExtraCallback onextracallback, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, boolean z2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z3, getSubtitle getsubtitle, Function0 function0, v2.IAuthTabCallback iAuthTabCallback, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 93;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(onwarmupcompleted, v0aVar, z, onextracallback, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, z2, quirksExternalSyntheticBackport0, z3, getsubtitle, function0, iAuthTabCallback, getbacktracenote, getbacktracenote2, getbacktracenote3, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(boolean z, removeTimestamp removetimestamp, readFully readfully, boolean z2, v2.onWarmupCompleted onwarmupcompleted, v2.onExtraCallback onextracallback, float f, float f2, v0a v0aVar, long j, float f3, readFully readfully2, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, setIso setiso) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallback(new Object[]{Boolean.valueOf(z), removetimestamp, readfully, Boolean.valueOf(z2), onwarmupcompleted, onextracallback, Float.valueOf(f), Float.valueOf(f2), v0aVar, Long.valueOf(j), Float.valueOf(f3), readfully2, cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, setiso}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -389147990, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 389147991);
        int i4 = onExtraCallbackWithResult + 117;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 33;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof v0b) || !Intrinsics.areEqual(this.onWarmupCompleted, ((v0b) obj).onWarmupCompleted)) {
            return false;
        }
        int i7 = IAuthTabCallback + 19;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onWarmupCompleted.hashCode();
        int i4 = onExtraCallbackWithResult + 105;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public QuirksExternalSyntheticBackport0 onExtraCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = this.onWarmupCompleted.onExtraCallback(quirksExternalSyntheticBackport0);
        int i4 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return quirksExternalSyntheticBackport0OnExtraCallback;
        }
        throw null;
    }

    public QuirksExternalSyntheticBackport0 onExtraCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        RowScope rowScope = this.onWarmupCompleted;
        if (i3 == 0) {
            return rowScope.onExtraCallback(quirksExternalSyntheticBackport0, onwarmupcompleted);
        }
        rowScope.onExtraCallback(quirksExternalSyntheticBackport0, onwarmupcompleted);
        throw null;
    }

    public QuirksExternalSyntheticBackport0 onNavigationEvent(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        if (i3 == 0) {
            this.onWarmupCompleted.onNavigationEvent(quirksExternalSyntheticBackport0, f, z);
            throw null;
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = this.onWarmupCompleted.onNavigationEvent(quirksExternalSyntheticBackport0, f, z);
        int i4 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
        return quirksExternalSyntheticBackport0OnNavigationEvent;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ItemPreset(containerScope=" + this.onWarmupCompleted + ")";
        int i2 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public v0b(@NotNull RowScope rowScope) {
        Intrinsics.checkNotNullParameter(rowScope, "");
        this.onWarmupCompleted = rowScope;
    }

    private static final removeObserverLocked onNavigationEvent(toMetersPerSecond tometerspersecond, long j, final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda63, final boolean z, final boolean z2, final v2.onWarmupCompleted onwarmupcompleted, final v2.onExtraCallback onextracallback, final v0a v0aVar, final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda64, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        long jOnWarmupCompleted = sessionProcessorCaptureCallback.onWarmupCompleted();
        final float fIntBitsToFloat = Float.intBitsToFloat((int) (jOnWarmupCompleted >> 32));
        final float fIntBitsToFloat2 = Float.intBitsToFloat((int) jOnWarmupCompleted);
        rotate rotateVarIAuthTabCallback = tometerspersecond.IAuthTabCallback(sessionProcessorCaptureCallback.onWarmupCompleted(), sessionProcessorCaptureCallback.onExtraCallback(), sessionProcessorCaptureCallback);
        final removeTimestamp removetimestampOnWarmupCompleted = getMappingAreaSize.onWarmupCompleted();
        setDescription.onWarmupCompleted(removetimestampOnWarmupCompleted, rotateVarIAuthTabCallback);
        readFully.onExtraCallback onextracallback2 = readFully.Companion;
        final readFully readfullyOnExtraCallback = readFully.onExtraCallback.onExtraCallback(onextracallback2, CollectionsKt.listOf(new setByteOrder[]{setByteOrder.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(j, ((Float) onExtraCallback(new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1867993608, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1867993610)).floatValue())), setByteOrder.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(j, ((Float) onExtraCallback(new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1867993608, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1867993610)).floatValue() * 0.6f))}), 0L, 0L, 0, 14, (Object) null);
        float fOnExtraCallback = sessionProcessorCaptureCallback.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f));
        float fOnExtraCallback2 = sessionProcessorCaptureCallback.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f));
        float fOnExtraCallback3 = sessionProcessorCaptureCallback.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f));
        float fOnExtraCallback4 = sessionProcessorCaptureCallback.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(28.0f));
        final long jOnWarmupCompleted2 = setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(fIntBitsToFloat2 + fOnExtraCallback2 + fOnExtraCallback4) & 4294967295L) | (Float.floatToRawIntBits((fIntBitsToFloat + fOnExtraCallback) + fOnExtraCallback3) << 32));
        long jIAuthTabCallback = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits((((fOnExtraCallback3 + fOnExtraCallback) / 2.0f) - fOnExtraCallback) / 2.0f) << 32) | (Float.floatToRawIntBits((((fOnExtraCallback4 + fOnExtraCallback2) / 2.0f) - fOnExtraCallback2) / 2.0f) & 4294967295L));
        final float fMin = Math.min(fIntBitsToFloat, fIntBitsToFloat2) / 2.0f;
        final readFully readfullyOnWarmupCompleted = readFully.onExtraCallback.onWarmupCompleted(onextracallback2, CollectionsKt.listOf(new setByteOrder[]{setByteOrder.onNavigationEvent(onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<setByteOrder>) cameraPresenceProviderExternalSyntheticLambda62)), setByteOrder.onNavigationEvent(((Long) onExtraCallback(new Object[]{cameraPresenceProviderExternalSyntheticLambda63}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -2136556302, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 2136556302)).longValue())}), setUseCaseAttached.onNavigationEvent(UseCaseAttachStateExternalSyntheticLambda2.onExtraCallbackWithResult(sessionProcessorCaptureCallback.onWarmupCompleted()), jIAuthTabCallback), fMin, 0, 8, (Object) null);
        removeObserverLocked removeobserverlockedIAuthTabCallback = sessionProcessorCaptureCallback.IAuthTabCallback(new Function1() { // from class: im.toss.tds.compose.component.compound.chip.v1.ItemPreset$$ExternalSyntheticLambda10
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 85;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = v0b.onWarmupCompleted(z, removetimestampOnWarmupCompleted, readfullyOnExtraCallback, z2, onwarmupcompleted, onextracallback, fIntBitsToFloat2, fIntBitsToFloat, v0aVar, jOnWarmupCompleted2, fMin, readfullyOnWarmupCompleted, cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda64, (setIso) obj);
                int i5 = IAuthTabCallback + 25;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return unitOnWarmupCompleted;
            }
        });
        int i2 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return removeobserverlockedIAuthTabCallback;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        setOrientationDegrees setorientationdegrees;
        v2.onExtraCallback onextracallback;
        Throwable th;
        setOrientationDegrees setorientationdegrees2;
        float f;
        float fSin;
        float fOnExtraCallback;
        float f2;
        float f3;
        hasMoreElements hasmoreelements;
        seek seekVar;
        int i;
        int i2;
        Object obj;
        setOrientationDegrees setorientationdegrees3;
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        removeTimestamp removetimestamp = (removeTimestamp) objArr[1];
        readFully readfully = (readFully) objArr[2];
        boolean zBooleanValue2 = ((Boolean) objArr[3]).booleanValue();
        v2.onWarmupCompleted onwarmupcompleted = (v2.onWarmupCompleted) objArr[4];
        v2.onExtraCallback onextracallback2 = (v2.onExtraCallback) objArr[5];
        float fFloatValue = ((Number) objArr[6]).floatValue();
        float fFloatValue2 = ((Number) objArr[7]).floatValue();
        v0a v0aVar = (v0a) objArr[8];
        long jLongValue = ((Number) objArr[9]).longValue();
        float fFloatValue3 = ((Number) objArr[10]).floatValue();
        readFully readfully2 = (readFully) objArr[11];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[12];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[13];
        setOrientationDegrees setorientationdegrees4 = (setIso) objArr[14];
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees4, "");
        if (zBooleanValue) {
            int i4 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            setFlashState setflashstateOnExtraCallback = setorientationdegrees4.onExtraCallback();
            long jOnExtraCallback = setflashstateOnExtraCallback.onExtraCallback();
            setflashstateOnExtraCallback.onNavigationEvent().onNavigationEvent();
            try {
                ExifDataBuilder1 exifDataBuilder1OnTransact = setflashstateOnExtraCallback.onTransact();
                onextracallback = onextracallback2;
                ExifDataBuilder1.onNavigationEvent(exifDataBuilder1OnTransact, removetimestamp, 0, 2, (Object) null);
                setorientationdegrees = setorientationdegrees4;
                float f4 = fFloatValue3 * 2.0f;
                ExifDataBuilder1.onExtraCallbackWithResult(exifDataBuilder1OnTransact, Float.intBitsToFloat((int) (jLongValue >> 32)) / f4, Float.intBitsToFloat((int) jLongValue) / f4, 0L, 4, (Object) null);
                setOrientationDegrees.onExtraCallback(setorientationdegrees, readfully2, 0L, 0L, 0.0f, (hasMoreElements) null, (seek) null, 0, 126, (Object) null);
            } finally {
                setflashstateOnExtraCallback.onNavigationEvent().IAuthTabCallback();
                setflashstateOnExtraCallback.onExtraCallbackWithResult(jOnExtraCallback);
            }
        } else {
            setorientationdegrees = setorientationdegrees4;
            onextracallback = onextracallback2;
        }
        setorientationdegrees.onWarmupCompleted();
        if (((Float) onExtraCallback(new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1867993608, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1867993610)).floatValue() > 0.0f) {
            int i6 = onExtraCallbackWithResult + 1;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                f3 = 2.0f;
                hasmoreelements = null;
                seekVar = null;
                i = 1;
                i2 = 1;
                obj = null;
                setorientationdegrees3 = setorientationdegrees;
                th = null;
                setorientationdegrees2 = setorientationdegrees;
            } else {
                th = null;
                setorientationdegrees2 = setorientationdegrees;
                f3 = 0.0f;
                hasmoreelements = null;
                seekVar = null;
                i = 0;
                i2 = 60;
                obj = null;
                setorientationdegrees3 = setorientationdegrees2;
            }
            setOrientationDegrees.onExtraCallback(setorientationdegrees3, removetimestamp, readfully, f3, hasmoreelements, seekVar, i, i2, obj);
            int i7 = onExtraCallbackWithResult + 103;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        } else {
            th = null;
            setorientationdegrees2 = setorientationdegrees;
        }
        if (zBooleanValue2 && !setByteOrder.onExtraCallbackWithResult(IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<setByteOrder>) cameraPresenceProviderExternalSyntheticLambda62), setByteOrder.Companion.IAuthTabCallbackDefault())) {
            int[] iArr = IAuthTabCallback.IAuthTabCallback;
            int i9 = iArr[onwarmupcompleted.ordinal()];
            if (i9 == 1) {
                f = 2.0f;
            } else {
                if (i9 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i10 = IAuthTabCallback + 121;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 == 0) {
                    throw th;
                }
                f = 2.5f;
            }
            float fOnExtraCallback2 = setorientationdegrees2.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f));
            int i11 = IAuthTabCallback.onNavigationEvent[onextracallback.ordinal()];
            if (i11 == 1) {
                float f5 = fFloatValue / 2.0f;
                float fCos = (float) Math.cos(0.7853981852531433d);
                fSin = (f5 - (((float) Math.sin(0.7853981852531433d)) * f5)) - fOnExtraCallback2;
                fOnExtraCallback = (fFloatValue2 - (f5 - (fCos * f5))) + fOnExtraCallback2;
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                fOnExtraCallback = fFloatValue2 - setorientationdegrees2.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f));
                fSin = setorientationdegrees2.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f));
            }
            long jIAuthTabCallback = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fOnExtraCallback) << 32) | (Float.floatToRawIntBits(fSin) & 4294967295L));
            if (onextracallback == v2.onExtraCallback.Pill) {
                long jOnExtraCallbackWithResult = getMaxAdCount.onExtraCallbackWithResult(v0aVar.onExtraCallback(), setByteOrder.onWarmupCompleted(IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<setByteOrder>) cameraPresenceProviderExternalSyntheticLambda62)));
                int i12 = iArr[onwarmupcompleted.ordinal()];
                if (i12 == 1) {
                    f2 = 1.0f;
                } else {
                    if (i12 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f2 = 1.5f;
                }
                setOrientationDegrees setorientationdegrees5 = setorientationdegrees2;
                setOrientationDegrees.IAuthTabCallback(setorientationdegrees5, jOnExtraCallbackWithResult, setorientationdegrees2.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f2)) + fOnExtraCallback2, setUseCaseAttached.onNavigationEvent(jIAuthTabCallback, setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(-fOnExtraCallback2) << 32) | (Float.floatToRawIntBits(fOnExtraCallback2) & 4294967295L))), 0.0f, (hasMoreElements) null, (seek) null, 0, 120, (Object) null);
            }
            setOrientationDegrees.IAuthTabCallback(setorientationdegrees2, IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<setByteOrder>) cameraPresenceProviderExternalSyntheticLambda62), fOnExtraCallback2, setUseCaseAttached.onNavigationEvent(jIAuthTabCallback, setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(-fOnExtraCallback2) << 32) | (Float.floatToRawIntBits(fOnExtraCallback2) & 4294967295L))), 0.0f, (hasMoreElements) null, (seek) null, 0, 120, (Object) null);
            int i13 = onExtraCallbackWithResult + 87;
            IAuthTabCallback = i13 % 128;
            int i14 = i13 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(v2.IAuthTabCallback iAuthTabCallback, boolean z, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            v2.IAuthTabCallback iAuthTabCallback2 = v2.IAuthTabCallback.Select;
            throw null;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        if (iAuthTabCallback == v2.IAuthTabCallback.Select) {
            unregisterOutputSurface.onNavigationEvent(useandconfigureprogramwithtexture, z);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 55;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0 ? (i & 3) == 2 : (i & 2) == 5) {
            z = false;
        } else {
            int i5 = i3 + 117;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = onExtraCallbackWithResult + 59;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = IAuthTabCallback + 7;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1016642622, i, -1, "im.toss.tds.compose.component.compound.chip.v1.ItemPreset.Item.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ItemPreset.kt:304)");
            }
            getbacktracenote.invoke(RightAccessoryPreset.onWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final Unit onNavigationEvent(Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, final v0a v0aVar, final boolean z, boolean z2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final boolean z3, getSubtitle getsubtitle, final toMetersPerSecond tometerspersecond, Function0 function0, final v2.onWarmupCompleted onwarmupcompleted, final v2.onExtraCallback onextracallback, final v2.IAuthTabCallback iAuthTabCallback, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, final getBacktraceNote getbacktracenote3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3;
        float f;
        setTitleMarginStart settitlemarginstart;
        getSubtitle getsubtitleOnExtraCallback;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        Integer num;
        getBacktraceNote getbacktracenote4;
        float fIAuthTabCallback;
        int i4;
        float fIAuthTabCallback2;
        int i5 = 2 % 2;
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-10754573, i, -1, "im.toss.tds.compose.component.compound.chip.v1.ItemPreset.Item.<anonymous>.<anonymous>.<anonymous> (ItemPreset.kt:116)");
            }
            boolean zBooleanValue = ((Boolean) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(v2.onExtraCallback.IAuthTabCallbackStub())).booleanValue();
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult = CaptureSessionExternalSyntheticLambda3.onExtraCallbackWithResult(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, 0);
            float f2 = 1.0f;
            if (onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult)) {
                int i6 = IAuthTabCallback + 67;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = isSubmitButtonEnabled.IAuthTabCallback(f, onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult) ? getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.asBinder(), 0, 2, (Object) null) : onQueryRefine.onExtraCallbackWithResult(50, 0, getCallToActionButton.onExtraCallback.onTransact(), 2, (Object) null), 0.0f, (String) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 28);
            final long jOnNavigationEvent = v0aVar.onNavigationEvent(z);
            final CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = v0aVar.onExtraCallback(z, cameraCaptureResultEmptyCameraCaptureResult, 0);
            final CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult2 = v0aVar.onExtraCallbackWithResult(z, cameraCaptureResultEmptyCameraCaptureResult, 0);
            final CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6AsInterface = v0aVar.asInterface(z2, cameraCaptureResultEmptyCameraCaptureResult, 0);
            QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedIAuthTabCallbackDefault = QuirkSettingsLoader.Companion.IAuthTabCallbackDefault();
            FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnNavigationEvent = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onNavigationEvent();
            if (zBooleanValue && !z3) {
                f2 = 0.3f;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = onCaptureSessionStart.onExtraCallback(quirksExternalSyntheticBackport0, f2);
            setTitleMarginStart settitlemarginstart2 = new setTitleMarginStart(false, (noStore) noStore.onExtraCallback.onWarmupCompleted(new Object[]{noStore.Companion}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted()), 1, (DefaultConstructorMarker) null);
            if (getsubtitle == null) {
                settitlemarginstart = settitlemarginstart2;
                getsubtitleOnExtraCallback = getSharedInstance.onExtraCallback(false, false, 0L, tometerspersecond, null, null, null, null, 247, null);
            } else {
                settitlemarginstart = settitlemarginstart2;
                getsubtitleOnExtraCallback = getsubtitle;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = setTitleTextColor.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitleOnExtraCallback, settitlemarginstart, z3, (String) null, (Role) null, function0, 48, (Object) null);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(tometerspersecond);
            boolean zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(jOnNavigationEvent);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback);
            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult2);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z3);
            boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6AsInterface);
            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(onwarmupcompleted.ordinal());
            boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(onextracallback.ordinal());
            boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(v0aVar);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(!(zOnNavigationEvent | zOnWarmupCompleted | zOnNavigationEvent2 | zOnNavigationEvent3 | zOnNavigationEvent4 | zOnExtraCallback | zOnExtraCallback2 | zOnNavigationEvent5 | zOnExtraCallback3 | zOnExtraCallback4 | zOnNavigationEvent6)) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0OnWarmupCompleted;
                Function1 function1 = new Function1() { // from class: im.toss.tds.compose.component.compound.chip.v1.ItemPreset$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj) {
                        int i8 = 2 % 2;
                        int i9 = onExtraCallbackWithResult + 49;
                        onExtraCallback = i9 % 128;
                        int i10 = i9 % 2;
                        removeObserverLocked removeobserverlockedOnExtraCallbackWithResult = v0b.onExtraCallbackWithResult(tometerspersecond, jOnNavigationEvent, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback, cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult2, z, z3, onwarmupcompleted, onextracallback, v0aVar, cameraPresenceProviderExternalSyntheticLambda6AsInterface, (SessionProcessorCaptureCallback) obj);
                        int i11 = onExtraCallback + 61;
                        onExtraCallbackWithResult = i11 % 128;
                        int i12 = i11 % 2;
                        return removeobserverlockedOnExtraCallbackWithResult;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function1);
                objOnMinimized = function1;
            } else {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0OnWarmupCompleted;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = SessionProcessorSurface.IAuthTabCallback(quirksExternalSyntheticBackport02, (Function1) objOnMinimized);
            i2 = 0;
            long jAccess100 = ((setByteOrder) v0aVar.onWarmupCompleted(z, cameraCaptureResultEmptyCameraCaptureResult2, 0).onExtraCallbackWithResult()).access100();
            v2a v2aVar = v2a.onNavigationEvent;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(verifyDrawable.onExtraCallbackWithResult(ensureNavButtonView.onExtraCallback(quirksExternalSyntheticBackport0IAuthTabCallback, v2aVar.onNavigationEvent(), jAccess100, tometerspersecond), ((setByteOrder) v0aVar.onNavigationEvent(z, cameraCaptureResultEmptyCameraCaptureResult2, 0).onExtraCallbackWithResult()).access100(), tometerspersecond), v2aVar.onExtraCallback(onwarmupcompleted), v2aVar.IAuthTabCallback(onwarmupcompleted)), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f), 1, (Object) null);
            boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(iAuthTabCallback.ordinal());
            boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(z);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((zOnExtraCallback5 | zOnExtraCallback6) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = new Function1() { // from class: im.toss.tds.compose.component.compound.chip.v1.ItemPreset$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj) {
                        int i8 = 2 % 2;
                        int i9 = IAuthTabCallback + 113;
                        onExtraCallbackWithResult = i9 % 128;
                        int i10 = i9 % 2;
                        Unit unitOnWarmupCompleted = v0b.onWarmupCompleted(iAuthTabCallback, z, (useAndConfigureProgramWithTexture) obj);
                        int i11 = IAuthTabCallback + 125;
                        onExtraCallbackWithResult = i11 % 128;
                        int i12 = i11 % 2;
                        return unitOnWarmupCompleted;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, false, (Function1) objOnMinimized2, 1, (Object) null);
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(asbinderOnNavigationEvent, onwarmupcompletedIAuthTabCallbackDefault, cameraCaptureResultEmptyCameraCaptureResult2, 54);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnExtraCallbackWithResult2);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
                int i8 = IAuthTabCallback + 7;
                onExtraCallbackWithResult = i8 % 128;
                i3 = 2;
                int i9 = i8 % 2;
            } else {
                i3 = 2;
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult.onTransact());
            RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
            if (getbacktracenote == null) {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(971245691);
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                int i10 = IAuthTabCallback.onNavigationEvent[onextracallback.ordinal()];
                if (i10 == 1) {
                    int i11 = IAuthTabCallback.IAuthTabCallback[onwarmupcompleted.ordinal()];
                    if (i11 == 1) {
                        fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(11.0f);
                    } else {
                        if (i11 != i3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i12 = IAuthTabCallback + 107;
                        onExtraCallbackWithResult = i12 % 128;
                        if (i12 % i3 == 0) {
                            VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(13.0f);
                            throw null;
                        }
                        fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(13.0f);
                    }
                } else {
                    if (i10 != i3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i13 = IAuthTabCallback.IAuthTabCallback[onwarmupcompleted.ordinal()];
                    if (i13 == 1) {
                        fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f);
                    } else {
                        if (i13 != i3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i14 = onExtraCallbackWithResult + 7;
                        IAuthTabCallback = i14 % 128;
                        if (i14 % i3 != 0) {
                            VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f);
                            throw null;
                        }
                        fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f);
                    }
                }
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(onextracallback2, fIAuthTabCallback2), cameraCaptureResultEmptyCameraCaptureResult2, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                getbacktracenote4 = getbacktracenote2;
                num = 6;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(972038609);
                num = 6;
                getbacktracenote.invoke(v2c.onExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResult2, (Object) 6);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                getbacktracenote4 = getbacktracenote2;
            }
            getbacktracenote4.invoke(rowScopeInstance, cameraCaptureResultEmptyCameraCaptureResult2, num);
            if (getbacktracenote3 == null) {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(972236699);
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback3 = QuirksExternalSyntheticBackport0.Companion;
                int i15 = IAuthTabCallback.onNavigationEvent[onextracallback.ordinal()];
                if (i15 == 1) {
                    int i16 = IAuthTabCallback.IAuthTabCallback[onwarmupcompleted.ordinal()];
                    if (i16 == 1) {
                        fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(11.0f);
                    } else {
                        if (i16 != i3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(13.0f);
                    }
                } else {
                    if (i15 != i3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i17 = IAuthTabCallback + 67;
                    onExtraCallbackWithResult = i17 % 128;
                    if (i17 % i3 != 0 ? (i4 = IAuthTabCallback.IAuthTabCallback[onwarmupcompleted.ordinal()]) == 1 : (i4 = IAuthTabCallback.IAuthTabCallback[onwarmupcompleted.ordinal()]) == 1) {
                        fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f);
                    } else {
                        if (i4 != i3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f);
                    }
                }
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(onextracallback3, fIAuthTabCallback), cameraCaptureResultEmptyCameraCaptureResult2, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(973041645);
                putCharSequence.onExtraCallback(getHumanReadableName.onNavigationEvent((getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted()), ((setByteOrder) ((CameraPresenceProviderExternalSyntheticLambda6) v0a.onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1955358163, new Object[]{v0aVar, Boolean.valueOf(z), cameraCaptureResultEmptyCameraCaptureResult2, 0}, 1955358164, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback())).onExtraCallbackWithResult()).access100(), 0L, isRepeatingEnabled.onExtraCallback.onTransact(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (Object) null), null, null, null, null, false, ForwardingCameraControl.onExtraCallback(1016642622, true, new Function2() { // from class: im.toss.tds.compose.component.compound.chip.v1.ItemPreset$$ExternalSyntheticLambda2
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj, Object obj2) {
                        int i18 = 2 % 2;
                        int i19 = onExtraCallbackWithResult + 1;
                        onNavigationEvent = i19 % 128;
                        int i20 = i19 % 2;
                        getBacktraceNote getbacktracenote5 = getbacktracenote3;
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) obj;
                        if (i20 == 0) {
                            return v0b.onExtraCallbackWithResult(getbacktracenote5, cameraCaptureResultEmptyCameraCaptureResult3, ((Integer) obj2).intValue());
                        }
                        Unit unitOnExtraCallbackWithResult = v0b.onExtraCallbackWithResult(getbacktracenote5, cameraCaptureResultEmptyCameraCaptureResult3, ((Integer) obj2).intValue());
                        int i21 = 9 / 0;
                        return unitOnExtraCallbackWithResult;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult, 1572864, 62);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            i2 = 0;
            i3 = 2;
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i18 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i18 % 128;
        if (i18 % i3 == 0) {
            int i19 = 52 / i2;
        }
        return unit;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final Unit IAuthTabCallback(final v2.onExtraCallback onextracallback, final v2.onWarmupCompleted onwarmupcompleted, final v0a v0aVar, final boolean z, final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, final boolean z2, final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final boolean z3, final getSubtitle getsubtitle, final Function0 function0, final v2.IAuthTabCallback iAuthTabCallback, final getBacktraceNote getbacktracenote, final getBacktraceNote getbacktracenote2, final getBacktraceNote getbacktracenote3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        RoundedCornerShape roundedCornerShapeOnWarmupCompleted;
        int i2;
        float fAsBinder;
        int i3 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i4 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1513906483, i, -1, "im.toss.tds.compose.component.compound.chip.v1.ItemPreset.Item.<anonymous>.<anonymous> (ItemPreset.kt:104)");
            }
            int i5 = IAuthTabCallback.onNavigationEvent[onextracallback.ordinal()];
            if (i5 == 1) {
                roundedCornerShapeOnWarmupCompleted = RoundedCornerShapeKt.onWarmupCompleted();
                i2 = onExtraCallbackWithResult + 125;
                IAuthTabCallback = i2 % 128;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i6 = IAuthTabCallback + 85;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                int i8 = IAuthTabCallback.IAuthTabCallback[onwarmupcompleted.ordinal()];
                if (i8 == 1) {
                    fAsBinder = AppLovinAdSize.onWarmupCompleted.asBinder();
                } else {
                    if (i8 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fAsBinder = AppLovinAdSize.onWarmupCompleted.IAuthTabCallbackStub();
                }
                roundedCornerShapeOnWarmupCompleted = RoundedCornerShapeKt.onNavigationEvent(fAsBinder);
                i2 = IAuthTabCallback + 77;
                onExtraCallbackWithResult = i2 % 128;
            }
            int i9 = i2 % 2;
            final RoundedCornerShape roundedCornerShape = roundedCornerShapeOnWarmupCompleted;
            accessisMonitoringp<setByteOrder> accessismonitoringpIAuthTabCallback_Parcel = v2.onExtraCallback.IAuthTabCallback_Parcel();
            Object[] objArr = {v0aVar, Boolean.valueOf(z), cameraCaptureResultEmptyCameraCaptureResult, 0};
            int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
            setPostviewFormatSelector.onNavigationEvent(accessismonitoringpIAuthTabCallback_Parcel.onExtraCallback(((CameraPresenceProviderExternalSyntheticLambda6) v0a.onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 688507408, objArr, -688507408, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback)).onExtraCallbackWithResult()), ForwardingCameraControl.onExtraCallback(-10754573, true, new Function2() { // from class: im.toss.tds.compose.component.compound.chip.v1.ItemPreset$$ExternalSyntheticLambda3
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                    int i10 = 2 % 2;
                    int i11 = onWarmupCompleted + 43;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                    Unit unitOnExtraCallbackWithResult = v0b.onExtraCallbackWithResult(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, v0aVar, z, z2, quirksExternalSyntheticBackport0, z3, getsubtitle, roundedCornerShape, function0, onwarmupcompleted, onextracallback, iAuthTabCallback, getbacktracenote, getbacktracenote2, getbacktracenote3, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i13 = onWarmupCompleted + 113;
                    onExtraCallbackWithResult = i13 % 128;
                    if (i13 % 2 != 0) {
                        return unitOnExtraCallbackWithResult;
                    }
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i10 = onExtraCallbackWithResult + 67;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(final v2.onWarmupCompleted onwarmupcompleted, final v0a v0aVar, final boolean z, final v2.onExtraCallback onextracallback, final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, final boolean z2, final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final boolean z3, final getSubtitle getsubtitle, final Function0 function0, final v2.IAuthTabCallback iAuthTabCallback, final getBacktraceNote getbacktracenote, final getBacktraceNote getbacktracenote2, final getBacktraceNote getbacktracenote3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 != 0 ? (i & 3) != 2 : (i & 5) != 3, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = IAuthTabCallback + 101;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1159097089, i, -1, "im.toss.tds.compose.component.compound.chip.v1.ItemPreset.Item.<anonymous> (ItemPreset.kt:95)");
            }
            v2a v2aVar = v2a.onNavigationEvent;
            getHumanReadableName gethumanreadablenameOnNavigationEvent = getHumanReadableName.onNavigationEvent(v2aVar.onExtraCallbackWithResult(onwarmupcompleted), ((setByteOrder) v0aVar.IAuthTabCallbackStub(z, cameraCaptureResultEmptyCameraCaptureResult, 0).onExtraCallbackWithResult()).access100(), 0L, isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (Object) null);
            dispatchPostbackAsync dispatchpostbackasync = (dispatchPostbackAsync) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(dispatchPostbackRequest.onWarmupCompleted());
            int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
            int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
            putCharSequence.onExtraCallback(gethumanreadablenameOnNavigationEvent, null, dispatchPostbackAsync.onWarmupCompleted(dispatchpostbackasync, 0.0f, 0, 0, (InterfaceC0083handshake) v2a.onWarmupCompleted(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{v2aVar}, 514123437, iOnWarmupCompleted2, -514123436), null, 23, null), null, null, false, ForwardingCameraControl.onExtraCallback(1513906483, true, new Function2() { // from class: im.toss.tds.compose.component.compound.chip.v1.ItemPreset$$ExternalSyntheticLambda4
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallback + 99;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    Unit unitOnWarmupCompleted = v0b.onWarmupCompleted(onextracallback, onwarmupcompleted, v0aVar, z, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, z2, quirksExternalSyntheticBackport0, z3, getsubtitle, function0, iAuthTabCallback, getbacktracenote, getbacktracenote2, getbacktracenote3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i9 = IAuthTabCallback + 47;
                    onExtraCallback = i9 % 128;
                    if (i9 % 2 == 0) {
                        return unitOnWarmupCompleted;
                    }
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 1572864, 58);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i6 = onExtraCallbackWithResult + 29;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback(@NotNull final Function0<Unit> function0, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable getBacktraceNote<? super v2c, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, boolean z, boolean z2, boolean z3, @Nullable Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, @Nullable getSubtitle getsubtitle, @Nullable v0a v0aVar, @NotNull final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2, final int i3) throws NoWhenBranchMatchedException {
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
        boolean z4;
        int i16;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final getBacktraceNote<? super v2c, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4;
        final getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote5;
        final boolean z5;
        final boolean z6;
        final boolean z7;
        final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
        final getSubtitle getsubtitle2;
        final v0a v0aVar2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        boolean z8;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
        boolean z9;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
        v0a v0aVarOnWarmupCompleted;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        getBacktraceNote<? super v2c, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote6;
        getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote7;
        boolean z10;
        boolean z11;
        getSubtitle getsubtitle3;
        boolean z12;
        int i17 = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(getbacktracenote3, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-519983619);
        if ((i & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i18 = i3 & 2;
        if (i18 != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i & 384) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote)) {
                        int i19 = IAuthTabCallback + 1;
                        onExtraCallbackWithResult = i19 % 128;
                        i6 = i19 % 2 == 0 ? 24357 : 256;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 8;
                if (i7 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote2)) {
                            int i20 = IAuthTabCallback + 37;
                            onExtraCallbackWithResult = i20 % 128;
                            i8 = i20 % 2 == 0 ? 32644 : 2048;
                        } else {
                            i8 = 1024;
                        }
                        i9 = i8 | i4;
                    }
                    i10 = i3 & 16;
                    if (i10 == 0) {
                        i9 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            int i21 = IAuthTabCallback + 81;
                            onExtraCallbackWithResult = i21 % 128;
                            int i22 = i21 % 2;
                            i9 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 16384 : 8192;
                        }
                        i11 = i3 & 32;
                        if (i11 != 0) {
                            i9 |= 196608;
                        } else if ((i & 196608) == 0) {
                            i9 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 131072 : 65536;
                        }
                        i12 = i3 & 64;
                        if (i12 == 0) {
                            if ((i & 1572864) == 0) {
                                i9 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 1048576 : 524288;
                            }
                            i13 = i3 & 128;
                            if (i13 == 0) {
                                i9 |= 12582912;
                            } else if ((i & 12582912) == 0) {
                                i9 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda2) ? 8388608 : 4194304;
                            }
                            i14 = i3 & 256;
                            if (i14 == 0) {
                                i9 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsubtitle)) {
                                    int i23 = IAuthTabCallback + 45;
                                    onExtraCallbackWithResult = i23 % 128;
                                    i15 = 67108864;
                                    if (i23 % 2 == 0) {
                                        int i24 = 88 / 0;
                                    }
                                } else {
                                    i15 = 33554432;
                                }
                                i9 |= i15;
                            }
                            if ((805306368 & i) != 0) {
                                if ((i3 & 512) == 0) {
                                    z4 = true;
                                    int i25 = IAuthTabCallback + 1;
                                    onExtraCallbackWithResult = i25 % 128;
                                    int i26 = i25 % 2;
                                    int i27 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(v0aVar) ? 536870912 : 268435456;
                                    i9 |= i27;
                                } else {
                                    z4 = true;
                                }
                                i9 |= i27;
                            } else {
                                z4 = true;
                            }
                            if ((i2 & 6) != 0) {
                                i16 = i2 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote3) ? 4 : 2);
                            } else {
                                i16 = i2;
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i9 & 306783379) == 306783378 || (i16 & 3) != 2) ? z4 : false, i9 & 1)) {
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                getbacktracenote4 = getbacktracenote;
                                getbacktracenote5 = getbacktracenote2;
                                z5 = z;
                                z6 = z2;
                                z7 = z3;
                                camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                getsubtitle2 = getsubtitle;
                                v0aVar2 = v0aVar;
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                    if (i18 != 0) {
                                        int i28 = IAuthTabCallback + 39;
                                        onExtraCallbackWithResult = i28 % 128;
                                        if (i28 % 2 == 0) {
                                            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                                            throw null;
                                        }
                                        quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                                    } else {
                                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                                    }
                                    getBacktraceNote<? super v2c, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote8 = i5 != 0 ? null : getbacktracenote;
                                    getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote9 = i7 != 0 ? null : getbacktracenote2;
                                    if (i10 != 0) {
                                        int i29 = IAuthTabCallback + 67;
                                        onExtraCallbackWithResult = i29 % 128;
                                        int i30 = i29 % 2;
                                        z8 = false;
                                    } else {
                                        z8 = z;
                                    }
                                    boolean z13 = i11 != 0 ? z4 : z2;
                                    boolean z14 = i12 != 0 ? false : z3;
                                    if (i13 != 0) {
                                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            int i31 = onExtraCallbackWithResult + 71;
                                            IAuthTabCallback = i31 % 128;
                                            int i32 = i31 % 2;
                                            objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                        }
                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized;
                                    } else {
                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                    }
                                    getsubtitle = i14 == 0 ? getsubtitle : null;
                                    if ((i3 & 512) != 0) {
                                        v2a v2aVar = v2a.onNavigationEvent;
                                        v2 v2Var = v2.onExtraCallback;
                                        z9 = z8;
                                        i9 &= -1879048193;
                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
                                        v0aVarOnWarmupCompleted = v2aVar.onWarmupCompleted((v2.IAuthTabCallbackDefault) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(v2Var.getInterfaceDescriptor()), ((Boolean) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback((accessisMonitoringp) v2.onWarmupCompleted(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -667399241, new Object[]{v2Var}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 667399243))).booleanValue(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 384);
                                    } else {
                                        z9 = z8;
                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
                                        v0aVarOnWarmupCompleted = v0aVar;
                                    }
                                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                    getbacktracenote6 = getbacktracenote8;
                                    getbacktracenote7 = getbacktracenote9;
                                    z10 = z13;
                                    z11 = z14;
                                    getsubtitle3 = getsubtitle;
                                    z12 = z9;
                                } else {
                                    int i33 = IAuthTabCallback + 115;
                                    onExtraCallbackWithResult = i33 % 128;
                                    if (i33 % 2 == 0) {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                        if ((i3 & 17378) != 0) {
                                            i9 &= -1879048193;
                                        }
                                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport0;
                                        getbacktracenote6 = getbacktracenote;
                                        getbacktracenote7 = getbacktracenote2;
                                        z12 = z;
                                        z10 = z2;
                                        z11 = z3;
                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                        getsubtitle3 = getsubtitle;
                                        v0aVarOnWarmupCompleted = v0aVar;
                                    } else {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                        if ((i3 & 512) != 0) {
                                        }
                                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport0;
                                        getbacktracenote6 = getbacktracenote;
                                        getbacktracenote7 = getbacktracenote2;
                                        z12 = z;
                                        z10 = z2;
                                        z11 = z3;
                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                        getsubtitle3 = getsubtitle;
                                        v0aVarOnWarmupCompleted = v0aVar;
                                    }
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-519983619, i9, i16, "im.toss.tds.compose.component.compound.chip.v1.ItemPreset.Item (ItemPreset.kt:83)");
                                }
                                v2 v2Var2 = v2.onExtraCallback;
                                final v2.onWarmupCompleted onwarmupcompleted = (v2.onWarmupCompleted) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(v2Var2.IAuthTabCallbackStubProxy());
                                final v2.IAuthTabCallback iAuthTabCallback = (v2.IAuthTabCallback) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(v2Var2.onTransact());
                                final v2.onExtraCallback onextracallback2 = (v2.onExtraCallback) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(v2Var2.asInterface());
                                final boolean z15 = iAuthTabCallback == v2.IAuthTabCallback.Select ? z12 : false;
                                v2a v2aVar2 = v2a.onNavigationEvent;
                                long jOnNavigationEvent = VirtualCameraControlExternalSyntheticLambda2.onNavigationEvent(v2aVar2.IAuthTabCallback(), ((Float) v2a.onWarmupCompleted(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{v2aVar2}, 1152146518, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1152146518)).floatValue());
                                final v0a v0aVar3 = v0aVarOnWarmupCompleted;
                                final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda25 = camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
                                final boolean z16 = z11;
                                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                                final boolean z17 = z10;
                                final getSubtitle getsubtitle4 = getsubtitle3;
                                final getBacktraceNote<? super v2c, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote10 = getbacktracenote6;
                                final getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote11 = getbacktracenote7;
                                Function2 function2 = new Function2() { // from class: im.toss.tds.compose.component.compound.chip.v1.ItemPreset$$ExternalSyntheticLambda5
                                    private static int IAuthTabCallback = 1;
                                    private static int onNavigationEvent;

                                    public final Object invoke(Object obj, Object obj2) {
                                        int i34 = 2 % 2;
                                        int i35 = IAuthTabCallback + 69;
                                        onNavigationEvent = i35 % 128;
                                        int i36 = i35 % 2;
                                        Unit unitOnWarmupCompleted = v0b.onWarmupCompleted(onwarmupcompleted, v0aVar3, z15, onextracallback2, camera2CapturePipelineTorchTaskExternalSyntheticLambda25, z16, quirksExternalSyntheticBackport05, z17, getsubtitle4, function0, iAuthTabCallback, getbacktracenote10, getbacktracenote3, getbacktracenote11, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                        int i37 = onNavigationEvent + 37;
                                        IAuthTabCallback = i37 % 128;
                                        if (i37 % 2 == 0) {
                                            int i38 = 41 / 0;
                                        }
                                        return unitOnWarmupCompleted;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                configureReward.IAuthTabCallback(jOnNavigationEvent, true, ForwardingCameraControl.onExtraCallback(-1159097089, true, function2, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 438, 0);
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                                getbacktracenote4 = getbacktracenote6;
                                getbacktracenote5 = getbacktracenote7;
                                z5 = z12;
                                z6 = z10;
                                z7 = z11;
                                camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
                                getsubtitle2 = getsubtitle3;
                                v0aVar2 = v0aVarOnWarmupCompleted;
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.chip.v1.ItemPreset$$ExternalSyntheticLambda6
                                    private static int onExtraCallbackWithResult = 0;
                                    private static int onWarmupCompleted = 1;

                                    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                                        int i34 = 2 % 2;
                                        int i35 = onExtraCallbackWithResult + 59;
                                        onWarmupCompleted = i35 % 128;
                                        int i36 = i35 % 2;
                                        Unit unitIAuthTabCallback = v0b.IAuthTabCallback(this.f$0, function0, quirksExternalSyntheticBackport02, getbacktracenote4, getbacktracenote5, z5, z6, z7, camera2CapturePipelineTorchTaskExternalSyntheticLambda22, getsubtitle2, v0aVar2, getbacktracenote3, i, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                        int i37 = onExtraCallbackWithResult + 85;
                                        onWarmupCompleted = i37 % 128;
                                        int i38 = i37 % 2;
                                        return unitIAuthTabCallback;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        int i34 = IAuthTabCallback + 7;
                        onExtraCallbackWithResult = i34 % 128;
                        if (i34 % 2 == 0) {
                            getsubtitle.hashCode();
                            throw null;
                        }
                        i9 |= 1572864;
                        i13 = i3 & 128;
                        if (i13 == 0) {
                        }
                        i14 = i3 & 256;
                        if (i14 == 0) {
                        }
                        if ((805306368 & i) != 0) {
                        }
                        if ((i2 & 6) != 0) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i9 & 306783379) == 306783378 || (i16 & 3) != 2) ? z4 : false, i9 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        }
                    }
                    i11 = i3 & 32;
                    if (i11 != 0) {
                    }
                    i12 = i3 & 64;
                    if (i12 == 0) {
                    }
                    i13 = i3 & 128;
                    if (i13 == 0) {
                    }
                    i14 = i3 & 256;
                    if (i14 == 0) {
                    }
                    if ((805306368 & i) != 0) {
                    }
                    if ((i2 & 6) != 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i9 & 306783379) == 306783378 || (i16 & 3) != 2) ? z4 : false, i9 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                i9 = i4;
                i10 = i3 & 16;
                if (i10 == 0) {
                }
                i11 = i3 & 32;
                if (i11 != 0) {
                }
                i12 = i3 & 64;
                if (i12 == 0) {
                }
                i13 = i3 & 128;
                if (i13 == 0) {
                }
                i14 = i3 & 256;
                if (i14 == 0) {
                }
                if ((805306368 & i) != 0) {
                }
                if ((i2 & 6) != 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i9 & 306783379) == 306783378 || (i16 & 3) != 2) ? z4 : false, i9 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            i7 = i3 & 8;
            if (i7 != 0) {
            }
            i9 = i4;
            i10 = i3 & 16;
            if (i10 == 0) {
            }
            i11 = i3 & 32;
            if (i11 != 0) {
            }
            i12 = i3 & 64;
            if (i12 == 0) {
            }
            i13 = i3 & 128;
            if (i13 == 0) {
            }
            i14 = i3 & 256;
            if (i14 == 0) {
            }
            if ((805306368 & i) != 0) {
            }
            if ((i2 & 6) != 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i9 & 306783379) == 306783378 || (i16 & 3) != 2) ? z4 : false, i9 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        i7 = i3 & 8;
        if (i7 != 0) {
        }
        i9 = i4;
        i10 = i3 & 16;
        if (i10 == 0) {
        }
        i11 = i3 & 32;
        if (i11 != 0) {
        }
        i12 = i3 & 64;
        if (i12 == 0) {
        }
        i13 = i3 & 128;
        if (i13 == 0) {
        }
        i14 = i3 & 256;
        if (i14 == 0) {
        }
        if ((805306368 & i) != 0) {
        }
        if ((i2 & 6) != 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i9 & 306783379) == 306783378 || (i16 & 3) != 2) ? z4 : false, i9 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final Unit onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        String str = (String) objArr[0];
        boolean z = true;
        RowScope rowScope = (RowScope) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((iIntValue & 17) == 22) {
                z = false;
            }
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((iIntValue & 17) == 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i3 = IAuthTabCallback + 101;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1380658797, iIntValue, -1, "im.toss.tds.compose.component.compound.chip.v1.ItemPreset.Item.<anonymous> (ItemPreset.kt:342)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = IAuthTabCallback + 81;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallbackWithResult(@NotNull final String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable getBacktraceNote<? super v2c, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, boolean z, boolean z2, boolean z3, @Nullable v0a v0aVar, @Nullable Function0<Unit> function0, @Nullable Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, @Nullable getSubtitle getsubtitle, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2, final int i3) {
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
        boolean z4;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        getBacktraceNote<? super v2c, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3;
        getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4;
        final boolean z5;
        final boolean z6;
        final boolean z7;
        final v0a v0aVar2;
        final Function0<Unit> function02;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
        getSubtitle getsubtitle2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        boolean z8;
        boolean z9;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        getBacktraceNote<? super v2c, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote5;
        v0a v0aVarOnWarmupCompleted;
        Function0<Unit> function03;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
        boolean z10;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
        Function0<Unit> function04;
        int i15;
        getSubtitle getsubtitle3;
        boolean z11;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        getBacktraceNote<? super v2c, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote6;
        int i16 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(245779970);
        if ((i & 6) != 0) {
            i4 = i;
        } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
            int i17 = onExtraCallbackWithResult + 75;
            IAuthTabCallback = i17 % 128;
            int i18 = i17 % 2 != 0 ? 2 : 4;
            i4 = i18 | i;
        }
        int i19 = i3 & 2;
        if (i19 != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0)) {
                    int i20 = onExtraCallbackWithResult + 123;
                    IAuthTabCallback = i20 % 128;
                    int i21 = i20 % 2;
                    i5 = 32;
                } else {
                    i5 = 16;
                }
                i4 |= i5;
            }
            i6 = i3 & 4;
            if (i6 == 0) {
                int i22 = onExtraCallbackWithResult + 95;
                IAuthTabCallback = i22 % 128;
                int i23 = i22 % 2;
                i4 |= 384;
            } else {
                if ((i & 384) == 0) {
                    int i24 = onExtraCallbackWithResult + 15;
                    IAuthTabCallback = i24 % 128;
                    int i25 = i24 % 2;
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 256 : 128;
                }
                i7 = i3 & 8;
                if (i7 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    int i26 = IAuthTabCallback + 57;
                    onExtraCallbackWithResult = i26 % 128;
                    if (i26 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote2);
                        throw null;
                    }
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote2) ? 2048 : 1024;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    i4 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 16384 : 8192;
                    }
                    i9 = i3 & 32;
                    if (i9 == 0) {
                        i4 |= 196608;
                    } else if ((i & 196608) == 0) {
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 131072 : 65536;
                    }
                    i10 = i3 & 64;
                    if (i10 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) != 0) {
                        int i27 = onExtraCallbackWithResult + 113;
                        IAuthTabCallback = i27 % 128;
                        int i28 = i27 % 2;
                        i4 |= ((i3 & 128) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(v0aVar)) ? 8388608 : 4194304;
                    }
                    i11 = i3 & 256;
                    if (i11 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 67108864 : 33554432;
                    }
                    i12 = i3 & 512;
                    if (i12 != 0) {
                        if ((i & 805306368) == 0) {
                            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda2) ^ true ? 268435456 : 536870912;
                        }
                        i13 = i3 & 1024;
                        if (i13 != 0) {
                            i14 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i14 = i2 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsubtitle) ? 4 : 2);
                        } else {
                            i14 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i14 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 32 : 16;
                        }
                        int i29 = i14;
                        if ((i4 & 306783379) == 306783378) {
                            int i30 = onExtraCallbackWithResult + 97;
                            IAuthTabCallback = i30 % 128;
                            int i31 = i30 % 2;
                            z4 = (i29 & 19) != 18;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z4, i4 & 1)) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                            if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = i19 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                getBacktraceNote<? super v2c, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote7 = i6 != 0 ? null : getbacktracenote;
                                if (i7 != 0) {
                                    int i32 = IAuthTabCallback + 57;
                                    onExtraCallbackWithResult = i32 % 128;
                                    int i33 = i32 % 2;
                                    getbacktracenote4 = null;
                                } else {
                                    getbacktracenote4 = getbacktracenote2;
                                }
                                boolean z12 = i8 != 0 ? false : z;
                                z8 = i9 != 0 ? true : z2;
                                boolean z13 = i10 == 0 ? z3 : false;
                                if ((i3 & 128) != 0) {
                                    int i34 = IAuthTabCallback + 5;
                                    z9 = z12;
                                    onExtraCallbackWithResult = i34 % 128;
                                    int i35 = i34 % 2;
                                    v2a v2aVar = v2a.onNavigationEvent;
                                    v2 v2Var = v2.onExtraCallback;
                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                                    getbacktracenote5 = getbacktracenote7;
                                    v0aVarOnWarmupCompleted = v2aVar.onWarmupCompleted((v2.IAuthTabCallbackDefault) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(v2Var.getInterfaceDescriptor()), ((Boolean) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback((accessisMonitoringp) v2.onWarmupCompleted(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -667399241, new Object[]{v2Var}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 667399243))).booleanValue(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 384);
                                    i4 &= -29360129;
                                } else {
                                    z9 = z12;
                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                                    getbacktracenote5 = getbacktracenote7;
                                    v0aVarOnWarmupCompleted = v0aVar;
                                }
                                if (i11 != 0) {
                                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.chip.v1.ItemPreset$$ExternalSyntheticLambda7
                                            private static int onExtraCallback = 0;
                                            private static int onNavigationEvent = 1;

                                            public final Object invoke() {
                                                int i36 = 2 % 2;
                                                int i37 = onNavigationEvent + 125;
                                                onExtraCallback = i37 % 128;
                                                if (i37 % 2 == 0) {
                                                    return v0b.onNavigationEvent();
                                                }
                                                v0b.onNavigationEvent();
                                                Object obj = null;
                                                obj.hashCode();
                                                throw null;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                    }
                                    function03 = (Function0) objOnMinimized;
                                } else {
                                    function03 = function0;
                                }
                                if (i12 != 0) {
                                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        int i36 = IAuthTabCallback + 69;
                                        onExtraCallbackWithResult = i36 % 128;
                                        int i37 = i36 % 2;
                                        objOnMinimized2 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                                    }
                                    camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized2;
                                } else {
                                    camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                }
                                getSubtitle getsubtitle4 = i13 == 0 ? getsubtitle : null;
                                z10 = z9;
                                camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
                                function04 = function03;
                                i15 = i4;
                                getsubtitle3 = getsubtitle4;
                                z11 = z13;
                                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                getbacktracenote6 = getbacktracenote5;
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                if ((i3 & 128) != 0) {
                                    i4 &= -29360129;
                                }
                                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport0;
                                getbacktracenote6 = getbacktracenote;
                                getbacktracenote4 = getbacktracenote2;
                                z10 = z;
                                z8 = z2;
                                v0aVarOnWarmupCompleted = v0aVar;
                                function04 = function0;
                                camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                getsubtitle3 = getsubtitle;
                                i15 = i4;
                                z11 = z3;
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(245779970, i15, i29, "im.toss.tds.compose.component.compound.chip.v1.ItemPreset.Item (ItemPreset.kt:329)");
                            }
                            v0a v0aVar3 = v0aVarOnWarmupCompleted;
                            IAuthTabCallback(function04, quirksExternalSyntheticBackport04, getbacktracenote6, getbacktracenote4, z10, z8, z11, camera2CapturePipelineTorchTaskExternalSyntheticLambda24, getsubtitle3, v0aVar3, ForwardingCameraControl.onExtraCallback(-1380658797, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.chip.v1.ItemPreset$$ExternalSyntheticLambda8
                                private static int onExtraCallbackWithResult = 0;
                                private static int onWarmupCompleted = 1;

                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i38 = 2 % 2;
                                    int i39 = onWarmupCompleted + 53;
                                    onExtraCallbackWithResult = i39 % 128;
                                    int i40 = i39 % 2;
                                    Unit unitOnNavigationEvent = v0b.onNavigationEvent(str, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                    int i41 = onExtraCallbackWithResult + 87;
                                    onWarmupCompleted = i41 % 128;
                                    if (i41 % 2 == 0) {
                                        int i42 = 49 / 0;
                                    }
                                    return unitOnNavigationEvent;
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i15 >> 24) & 14) | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | (3670016 & i15) | ((i15 >> 6) & 29360128) | ((i29 << 24) & 234881024) | ((i15 << 6) & 1879048192), (i29 & 112) | 6, 0);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            z5 = z10;
                            z7 = z11;
                            camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
                            getsubtitle2 = getsubtitle3;
                            v0aVar2 = v0aVar3;
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                            getbacktracenote3 = getbacktracenote6;
                            function02 = function04;
                            z6 = z8;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                            getbacktracenote3 = getbacktracenote;
                            getbacktracenote4 = getbacktracenote2;
                            z5 = z;
                            z6 = z2;
                            z7 = z3;
                            v0aVar2 = v0aVar;
                            function02 = function0;
                            camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                            getsubtitle2 = getsubtitle;
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            final getBacktraceNote<? super v2c, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote8 = getbacktracenote3;
                            final getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote9 = getbacktracenote4;
                            final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda25 = camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
                            final getSubtitle getsubtitle5 = getsubtitle2;
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.chip.v1.ItemPreset$$ExternalSyntheticLambda9
                                private static int IAuthTabCallback = 0;
                                private static int onExtraCallbackWithResult = 1;

                                public final Object invoke(Object obj, Object obj2) {
                                    int i38 = 2 % 2;
                                    int i39 = IAuthTabCallback + 59;
                                    onExtraCallbackWithResult = i39 % 128;
                                    int i40 = i39 % 2;
                                    v0b v0bVar = this.f$0;
                                    String str2 = str;
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport02;
                                    getBacktraceNote getbacktracenote10 = getbacktracenote8;
                                    getBacktraceNote getbacktracenote11 = getbacktracenote9;
                                    boolean z14 = z5;
                                    boolean z15 = z6;
                                    boolean z16 = z7;
                                    v0a v0aVar4 = v0aVar2;
                                    Function0 function05 = function02;
                                    Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda26 = camera2CapturePipelineTorchTaskExternalSyntheticLambda25;
                                    getSubtitle getsubtitle6 = getsubtitle5;
                                    int i41 = i;
                                    int i42 = i2;
                                    int i43 = i3;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    Unit unit = (Unit) v0b.onExtraCallback(new Object[]{v0bVar, str2, quirksExternalSyntheticBackport06, getbacktracenote10, getbacktracenote11, Boolean.valueOf(z14), Boolean.valueOf(z15), Boolean.valueOf(z16), v0aVar4, function05, camera2CapturePipelineTorchTaskExternalSyntheticLambda26, getsubtitle6, Integer.valueOf(i41), Integer.valueOf(i42), Integer.valueOf(i43), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1172892603, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1172892606);
                                    int i44 = onExtraCallbackWithResult + 47;
                                    IAuthTabCallback = i44 % 128;
                                    if (i44 % 2 == 0) {
                                        return unit;
                                    }
                                    throw null;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 805306368;
                    i13 = i3 & 1024;
                    if (i13 != 0) {
                    }
                    if ((i2 & 48) == 0) {
                    }
                    int i292 = i14;
                    if ((i4 & 306783379) == 306783378) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z4, i4 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                i9 = i3 & 32;
                if (i9 == 0) {
                }
                i10 = i3 & 64;
                if (i10 == 0) {
                }
                if ((i & 12582912) != 0) {
                }
                i11 = i3 & 256;
                if (i11 == 0) {
                }
                i12 = i3 & 512;
                if (i12 != 0) {
                }
                i13 = i3 & 1024;
                if (i13 != 0) {
                }
                if ((i2 & 48) == 0) {
                }
                int i2922 = i14;
                if ((i4 & 306783379) == 306783378) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z4, i4 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            i7 = i3 & 8;
            if (i7 != 0) {
            }
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            i9 = i3 & 32;
            if (i9 == 0) {
            }
            i10 = i3 & 64;
            if (i10 == 0) {
            }
            if ((i & 12582912) != 0) {
            }
            i11 = i3 & 256;
            if (i11 == 0) {
            }
            i12 = i3 & 512;
            if (i12 != 0) {
            }
            i13 = i3 & 1024;
            if (i13 != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            int i29222 = i14;
            if ((i4 & 306783379) == 306783378) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z4, i4 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        i6 = i3 & 4;
        if (i6 == 0) {
        }
        i7 = i3 & 8;
        if (i7 != 0) {
        }
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        i9 = i3 & 32;
        if (i9 == 0) {
        }
        i10 = i3 & 64;
        if (i10 == 0) {
        }
        if ((i & 12582912) != 0) {
        }
        i11 = i3 & 256;
        if (i11 == 0) {
        }
        i12 = i3 & 512;
        if (i12 != 0) {
        }
        i13 = i3 & 1024;
        if (i13 != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        int i292222 = i14;
        if ((i4 & 306783379) == 306783378) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z4, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final boolean onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6) {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            zBooleanValue = bool.booleanValue();
            int i4 = 92 / 0;
        } else {
            zBooleanValue = bool.booleanValue();
        }
        int i5 = onExtraCallbackWithResult + 119;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            return Float.valueOf(number.floatValue());
        }
        number.floatValue();
        throw null;
    }

    private static final long onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        long jAccess100 = ((setByteOrder) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).access100();
        int i4 = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return jAccess100;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setByteOrder setbyteorder = (setByteOrder) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            return Long.valueOf(setbyteorder.access100());
        }
        setbyteorder.access100();
        throw null;
    }

    private static final long IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        long jAccess100 = ((setByteOrder) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).access100();
        int i4 = onExtraCallbackWithResult + 125;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
        return jAccess100;
    }

    public static /* synthetic */ Unit IAuthTabCallback(v0b v0bVar, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, boolean z, boolean z2, boolean z3, v0a v0aVar, Function0 function0, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getSubtitle getsubtitle, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        return (Unit) onExtraCallback(new Object[]{v0bVar, str, quirksExternalSyntheticBackport0, getbacktracenote, getbacktracenote2, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), v0aVar, function0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1172892603, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1172892606);
    }

    private static final float onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
        return ((Float) onExtraCallback(new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1867993608, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1867993610)).floatValue();
    }

    private static final long onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6) {
        return ((Long) onExtraCallback(new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -2136556302, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 2136556302)).longValue();
    }

    private static final Unit onExtraCallbackWithResult(boolean z, removeTimestamp removetimestamp, readFully readfully, boolean z2, v2.onWarmupCompleted onwarmupcompleted, v2.onExtraCallback onextracallback, float f, float f2, v0a v0aVar, long j, float f3, readFully readfully2, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, setIso setiso) {
        return (Unit) onExtraCallback(new Object[]{Boolean.valueOf(z), removetimestamp, readfully, Boolean.valueOf(z2), onwarmupcompleted, onextracallback, Float.valueOf(f), Float.valueOf(f2), v0aVar, Long.valueOf(j), Float.valueOf(f3), readfully2, cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, setiso}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -389147990, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 389147991);
    }

    private static final Unit IAuthTabCallback(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(new Object[]{str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -448867527, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 448867531);
    }
}
