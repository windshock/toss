package o;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.compose.v1.stepper.TdsStepperRowV1RightScope$;
import im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinNativeAdImplExternalSyntheticLambda2;
import o.QuirksExternalSyntheticBackport0;
import o.getPrivacyDestinationUri;
import o.setCallToAction;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class resumeAnimation {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public static final resumeAnimation onExtraCallbackWithResult = new resumeAnimation();
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallback + 23;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        resumeAnimation resumeanimation = (resumeAnimation) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        resumeanimation.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 101;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(resumeAnimation resumeanimation, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, setCallToAction.IAuthTabCallback iAuthTabCallback, setClickDestinationBackupUri setclickdestinationbackupuri, setCallToAction.onNavigationEvent onnavigationevent, boolean z, Function0 function0, boolean z2, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 51;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        resumeanimation.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, iAuthTabCallback, setclickdestinationbackupuri, onnavigationevent, z, function0, z2, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 55;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i4;
        int i9 = i | i7 | i8;
        int i10 = ~(i4 | i7);
        int i11 = (~(i7 | i8)) | (~i);
        int i12 = i + i5 + i3 + ((-1537480081) * i6) + ((-1176924877) * i2);
        int i13 = i12 * i12;
        int i14 = (((-324914750) * i) - 1179058176) + ((-1443770816) * i5) + (1588055615 * i9) + (i10 * (-1588055615)) + ((-1588055615) * i11) + (1263140864 * i3) + (1226178560 * i6) + ((-1044512768) * i2) + (1201733632 * i13);
        int i15 = (i * 1018573086) + 1206756779 + (i5 * 1018572224) + (i9 * (-431)) + (i10 * 431) + (i11 * 431) + (i3 * 1018572655) + (i6 * (-758184159)) + (i2 * (-595421667)) + (i13 * (-1647378432));
        return i14 + ((i15 * i15) * 1518272512) != 1 ? onWarmupCompleted(objArr) : IAuthTabCallback(objArr);
    }

    private static final Unit onExtraCallback(resumeAnimation resumeanimation, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent onnavigationevent, AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 59;
        onNavigationEvent = i5 % 128;
        resumeanimation.IAuthTabCallback(str, quirksExternalSyntheticBackport0, onnavigationevent, appLovinNativeAdImplExternalSyntheticLambda11, cameraCaptureResultEmptyCameraCaptureResult, i5 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 75;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(resumeAnimation resumeanimation, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent onnavigationevent, AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted onwarmupcompleted, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 19;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        resumeanimation.onExtraCallback(str, quirksExternalSyntheticBackport0, onnavigationevent, onextracallbackwithresult, onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 9;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(resumeAnimation resumeanimation, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, setCallToAction.IAuthTabCallback iAuthTabCallback, setClickDestinationBackupUri setclickdestinationbackupuri, setCallToAction.onNavigationEvent onnavigationevent, boolean z, Function0 function0, boolean z2, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Unit unitIAuthTabCallback;
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 77;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            unitIAuthTabCallback = IAuthTabCallback(resumeanimation, quirksExternalSyntheticBackport0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, iAuthTabCallback, setclickdestinationbackupuri, onnavigationevent, z, function0, z2, getbacktracenote, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            int i6 = 28 / 0;
        } else {
            unitIAuthTabCallback = IAuthTabCallback(resumeanimation, quirksExternalSyntheticBackport0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, iAuthTabCallback, setclickdestinationbackupuri, onnavigationevent, z, function0, z2, getbacktracenote, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        int i7 = onNavigationEvent + 65;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 36 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback();
        int i3 = onNavigationEvent + 53;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(resumeAnimation resumeanimation, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent onnavigationevent, AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 113;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(resumeanimation, str, quirksExternalSyntheticBackport0, onnavigationevent, appLovinNativeAdImplExternalSyntheticLambda11, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 == 0) {
            int i7 = 98 / 0;
        }
        int i8 = onNavigationEvent + 121;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(resumeAnimation resumeanimation, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent onnavigationevent, AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted onwarmupcompleted, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 99;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(resumeanimation, str, quirksExternalSyntheticBackport0, onnavigationevent, onextracallbackwithresult, onwarmupcompleted, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onNavigationEvent + 41;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        resumeAnimation resumeanimation = (resumeAnimation) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {resumeanimation, Integer.valueOf(iIntValue), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue2)};
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallback(-1546793956, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), objArr2, iIAuthTabCallback, 1546793957, SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
        int i4 = IAuthTabCallback + 61;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private resumeAnimation() {
    }

    public final void onNavigationEvent(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        float fIAuthTabCallback;
        getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallbackWithResult onextracallbackwithresultOnTransact;
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(269580877);
        int i3 = i & 1;
        if (i3 != 0) {
            int i4 = IAuthTabCallback + 59;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3)) {
            int i6 = onNavigationEvent + 13;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(269580877, i, -1, "im.toss.compose.v1.stepper.TdsStepperRowV1RightScope.ArrowType (StepperRows.kt:464)");
            }
            getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult = (getPrivacyDestinationUri.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(reverseAnimationSpeed.onExtraCallbackWithResult());
            if (VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(Float.isNaN(onextracallbackwithresult.onExtraCallbackWithResult()) ? onextracallbackwithresult.IAuthTabCallback() : onextracallbackwithresult.onExtraCallbackWithResult(), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f))) {
                int i8 = onNavigationEvent + 3;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);
            } else {
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f);
            }
            float f = fIAuthTabCallback;
            if (((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onNavigationEvent() >= 1.6f) {
                onextracallbackwithresultOnTransact = (getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallbackWithResult) getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallbackWithResult.onExtraCallback.onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1911429714, new Object[]{getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallbackWithResult.Companion}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 1911429715);
            } else {
                onextracallbackwithresultOnTransact = getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallbackWithResult.Companion.onTransact();
            }
            setIconUri.IAuthTabCallback(onextracallbackwithresultOnTransact, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 9, (Object) null), (getBacktraceNote) null, setByteOrder.Companion.IAuthTabCallbackDefault(), 0.0f, (Function0) null, (String) null, removeLottieOnCompositionLoadedListener.onExtraCallbackWithResult.onWarmupCompleted(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 12585984, 116);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsStepperRowV1RightScope$.ExternalSyntheticLambda3(this, i));
        }
        int i10 = IAuthTabCallback + 13;
        onNavigationEvent = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 48 / 0;
        }
    }

    private static final Unit onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 113;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallbackWithResult(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, @Nullable setCallToAction.IAuthTabCallback iAuthTabCallback, @Nullable setClickDestinationBackupUri setclickdestinationbackupuri, @Nullable setCallToAction.onNavigationEvent onnavigationevent, boolean z, @Nullable Function0<Unit> function0, boolean z2, @NotNull getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2OnWarmupCompleted;
        setCallToAction.IAuthTabCallback iAuthTabCallbackOnNavigationEvent;
        int i4;
        setClickDestinationBackupUri setclickdestinationbackupuriOnExtraCallbackWithResult;
        int i5;
        int i6;
        boolean z3;
        int i7;
        int i8;
        boolean z4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        setCallToAction.onNavigationEvent onnavigationevent2;
        boolean z5;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
        setCallToAction.IAuthTabCallback iAuthTabCallback2;
        setClickDestinationBackupUri setclickdestinationbackupuri2;
        Function0<Unit> function02;
        boolean z6;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Function0<Unit> function03;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        setCallToAction.onNavigationEvent onnavigationevent3;
        boolean z7;
        Function0<Unit> function04;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
        boolean z8;
        float fIAuthTabCallback;
        float fOnExtraCallbackWithResult;
        int i9;
        int i10 = 2 % 2;
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1187420953);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            int i12 = IAuthTabCallback + 117;
            onNavigationEvent = i12 % 128;
            if (i12 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0);
                throw null;
            }
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                camera2CapturePipelineTorchTaskExternalSyntheticLambda2OnWarmupCompleted = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                int i13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda2OnWarmupCompleted) ? 32 : 16;
                i3 |= i13;
            } else {
                camera2CapturePipelineTorchTaskExternalSyntheticLambda2OnWarmupCompleted = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
            }
            i3 |= i13;
        } else {
            camera2CapturePipelineTorchTaskExternalSyntheticLambda2OnWarmupCompleted = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
        }
        int i14 = i2 & 4;
        if (i14 != 0) {
            int i15 = IAuthTabCallback + 105;
            onNavigationEvent = i15 % 128;
            i3 = i15 % 2 == 0 ? i3 | 23749 : i3 | 384;
        } else {
            if ((i & 384) == 0) {
                iAuthTabCallbackOnNavigationEvent = iAuthTabCallback;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackOnNavigationEvent)) {
                    int i16 = onNavigationEvent + 5;
                    IAuthTabCallback = i16 % 128;
                    int i17 = i16 % 2;
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    setclickdestinationbackupuriOnExtraCallbackWithResult = setclickdestinationbackupuri;
                    int i18 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setclickdestinationbackupuriOnExtraCallbackWithResult) ? 2048 : 1024;
                    i3 |= i18;
                } else {
                    setclickdestinationbackupuriOnExtraCallbackWithResult = setclickdestinationbackupuri;
                }
                i3 |= i18;
            } else {
                setclickdestinationbackupuriOnExtraCallbackWithResult = setclickdestinationbackupuri;
            }
            i5 = i2 & 16;
            if (i5 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onnavigationevent == null ? -1 : onnavigationevent.ordinal()) ? 16384 : 8192;
            }
            i6 = i2 & 32;
            if (i6 == 0) {
                i3 |= 196608;
            } else {
                if ((i & 196608) == 0) {
                    z3 = z;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 131072 : 65536;
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                    if ((i & 1572864) == 0) {
                        int i19 = IAuthTabCallback + 29;
                        onNavigationEvent = i19 % 128;
                        int i20 = i19 % 2;
                        i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 1048576 : 524288;
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 4194304 : 8388608;
                    }
                    if ((100663296 & i) != 0) {
                        z4 = true;
                        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote)) {
                            i9 = 33554432;
                        } else {
                            int i21 = IAuthTabCallback + 59;
                            onNavigationEvent = i21 % 128;
                            if (i21 % 2 == 0) {
                                int i22 = 43 / 0;
                            }
                            i9 = 67108864;
                        }
                        i3 |= i9;
                    } else {
                        z4 = true;
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i3) == 38347922 ? z4 : false, i3 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                        onnavigationevent2 = onnavigationevent;
                        z5 = z2;
                        camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2OnWarmupCompleted;
                        iAuthTabCallback2 = iAuthTabCallbackOnNavigationEvent;
                        setclickdestinationbackupuri2 = setclickdestinationbackupuriOnExtraCallbackWithResult;
                        function02 = function0;
                        z6 = z3;
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                        if ((i & 1) != 0) {
                            int i23 = onNavigationEvent + 15;
                            IAuthTabCallback = i23 % 128;
                            int i24 = i23 % 2;
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i11 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                if ((i2 & 2) != 0) {
                                    i3 &= -113;
                                    camera2CapturePipelineTorchTaskExternalSyntheticLambda2OnWarmupCompleted = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                                }
                                if (i14 != 0) {
                                    iAuthTabCallbackOnNavigationEvent = setCallToAction.IAuthTabCallback.Companion.onNavigationEvent();
                                }
                                if ((i2 & 8) != 0) {
                                    setclickdestinationbackupuriOnExtraCallbackWithResult = setBody.onExtraCallback.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                    i3 &= -7169;
                                }
                                setCallToAction.onNavigationEvent onnavigationevent4 = i5 != 0 ? setCallToAction.onNavigationEvent.Inline : onnavigationevent;
                                if (i6 != 0) {
                                    z3 = z4;
                                }
                                if (i7 != 0) {
                                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        objOnMinimized = new TdsStepperRowV1RightScope$.ExternalSyntheticLambda1();
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                    }
                                    function03 = (Function0) objOnMinimized;
                                } else {
                                    function03 = function0;
                                }
                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                                onnavigationevent3 = onnavigationevent4;
                                z7 = z3;
                                function04 = function03;
                                camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2OnWarmupCompleted;
                                z8 = i8 != 0 ? false : z2;
                            } else {
                                int i25 = onNavigationEvent + 39;
                                IAuthTabCallback = i25 % 128;
                                if (i25 % 2 != 0) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                    if ((i2 & 3) != 0) {
                                        i3 &= -113;
                                    }
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                    }
                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                                    onnavigationevent3 = onnavigationevent;
                                    function04 = function0;
                                    z8 = z2;
                                    z7 = z3;
                                    camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2OnWarmupCompleted;
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                    if ((i2 & 2) != 0) {
                                    }
                                    if ((i2 & 8) != 0) {
                                    }
                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                                    onnavigationevent3 = onnavigationevent;
                                    function04 = function0;
                                    z8 = z2;
                                    z7 = z3;
                                    camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2OnWarmupCompleted;
                                }
                            }
                            setCallToAction.IAuthTabCallback iAuthTabCallback3 = iAuthTabCallbackOnNavigationEvent;
                            setClickDestinationBackupUri setclickdestinationbackupuri3 = setclickdestinationbackupuriOnExtraCallbackWithResult;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1187420953, i3, -1, "im.toss.compose.v1.stepper.TdsStepperRowV1RightScope.ButtonType (StepperRows.kt:501)");
                            }
                            boolean zBooleanValue = ((Boolean) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(reverseAnimationSpeed.onExtraCallback())).booleanValue();
                            float f = 0.0f;
                            if (((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onNavigationEvent() < 1.2f) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1106275772);
                                if (Float.isNaN(((getPrivacyDestinationUri.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(reverseAnimationSpeed.onExtraCallbackWithResult())).onExtraCallbackWithResult())) {
                                    int i26 = onNavigationEvent + 69;
                                    IAuthTabCallback = i26 % 128;
                                    int i27 = i26 % 2;
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1349789740);
                                    fOnExtraCallbackWithResult = ((getPrivacyDestinationUri.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(reverseAnimationSpeed.onExtraCallbackWithResult())).IAuthTabCallback();
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1349791053);
                                    fOnExtraCallbackWithResult = ((getPrivacyDestinationUri.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(reverseAnimationSpeed.onExtraCallbackWithResult())).onExtraCallbackWithResult();
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fOnExtraCallbackWithResult, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f)) ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f) : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1106052417);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
                            }
                            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                            if (zBooleanValue) {
                                int i28 = IAuthTabCallback + 73;
                                onNavigationEvent = i28 % 128;
                                if (i28 % 2 == 0) {
                                    f = 1.0f;
                                }
                            } else {
                                f = 24.0f;
                            }
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, fIAuthTabCallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f), 0.0f, 9, (Object) null);
                            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
                            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                int i29 = onNavigationEvent + 39;
                                IAuthTabCallback = i29 % 128;
                                if (i29 % 2 != 0) {
                                    getAwbState.onExtraCallback();
                                    int i30 = 77 / 0;
                                } else {
                                    getAwbState.onExtraCallback();
                                }
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
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
                            int i31 = i3 >> 3;
                            int i32 = i3 << 3;
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            setAdvertiser.onExtraCallbackWithResult(quirksExternalSyntheticBackport03, iAuthTabCallback3, setclickdestinationbackupuri3, onnavigationevent3, (Function0) null, function04, camera2CapturePipelineTorchTaskExternalSyntheticLambda23, z7, z8, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i31 & 458752) | (i3 & 14) | (i31 & 112) | (i31 & 896) | (i31 & 7168) | ((i3 << 15) & 3670016) | ((i3 << 6) & 29360128) | (234881024 & i32) | (i32 & 1879048192), 16);
                            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                            camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
                            iAuthTabCallback2 = iAuthTabCallback3;
                            setclickdestinationbackupuri2 = setclickdestinationbackupuri3;
                            onnavigationevent2 = onnavigationevent3;
                            z6 = z7;
                            function02 = function04;
                            z5 = z8;
                        }
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsStepperRowV1RightScope$.ExternalSyntheticLambda2(this, quirksExternalSyntheticBackport02, camera2CapturePipelineTorchTaskExternalSyntheticLambda22, iAuthTabCallback2, setclickdestinationbackupuri2, onnavigationevent2, z6, function02, z5, getbacktracenote, i, i2));
                        return;
                    }
                    return;
                }
                i3 |= 1572864;
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                if ((100663296 & i) != 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i3) == 38347922 ? z4 : false, i3 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            z3 = z;
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            if ((100663296 & i) != 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i3) == 38347922 ? z4 : false, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        iAuthTabCallbackOnNavigationEvent = iAuthTabCallback;
        if ((i & 3072) != 0) {
        }
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        z3 = z;
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        if ((100663296 & i) != 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i3) == 38347922 ? z4 : false, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent onnavigationevent, @Nullable AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent onnavigationevent2;
        AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda112;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        int i5;
        float f;
        int i6;
        AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11OnWarmupCompleted = appLovinNativeAdImplExternalSyntheticLambda11;
        int i7 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(551916317);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                int i9 = IAuthTabCallback + 19;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onnavigationevent == null ? -1 : onnavigationevent.ordinal()) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                int i11 = IAuthTabCallback + 95;
                int i12 = i11 % 128;
                onNavigationEvent = i12;
                if (i11 % 2 != 0 ? (i2 & 8) != 0 : (i2 & 72) != 0) {
                    i6 = 1024;
                    i3 |= i6;
                } else {
                    int i13 = i12 + 115;
                    IAuthTabCallback = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i14 = 85 / 0;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda11OnWarmupCompleted)) {
                            i6 = 2048;
                        }
                    } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda11OnWarmupCompleted)) {
                    }
                    i3 |= i6;
                }
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 1171) == 1170, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                onnavigationevent2 = onnavigationevent;
                appLovinNativeAdImplExternalSyntheticLambda112 = appLovinNativeAdImplExternalSyntheticLambda11OnWarmupCompleted;
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                    if (i8 != 0) {
                        int i15 = onNavigationEvent + 93;
                        IAuthTabCallback = i15 % 128;
                        int i16 = i15 % 2;
                        quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
                    }
                    AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent onnavigationevent3 = i4 != 0 ? AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent.Medium : onnavigationevent;
                    if ((i2 & 8) != 0) {
                        appLovinNativeAdImplExternalSyntheticLambda11OnWarmupCompleted = AppLovinNativeAdImplExternalSyntheticLambda4.IAuthTabCallback.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                        i3 &= -7169;
                    }
                    appLovinNativeAdImplExternalSyntheticLambda112 = appLovinNativeAdImplExternalSyntheticLambda11OnWarmupCompleted;
                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                    AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent onnavigationevent4 = onnavigationevent3;
                    i5 = i3;
                    onnavigationevent2 = onnavigationevent4;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    appLovinNativeAdImplExternalSyntheticLambda112 = appLovinNativeAdImplExternalSyntheticLambda11OnWarmupCompleted;
                    i5 = i3;
                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                    onnavigationevent2 = onnavigationevent;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(551916317, i5, -1, "im.toss.compose.v1.stepper.TdsStepperRowV1RightScope.BadgeType (StepperRows.kt:535)");
                }
                boolean zBooleanValue = ((Boolean) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(reverseAnimationSpeed.onExtraCallback())).booleanValue();
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                if (zBooleanValue) {
                    f = 0.0f;
                } else {
                    int i17 = onNavigationEvent + 109;
                    IAuthTabCallback = i17 % 128;
                    int i18 = i17 % 2;
                    f = 24.0f;
                }
                float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f);
                int i19 = onNavigationEvent + 13;
                IAuthTabCallback = i19 % 128;
                if (i19 % 2 != 0) {
                    throw null;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(zBooleanValue ? 0.0f : 4.0f), fIAuthTabCallback, 0.0f, 9, (Object) null).onExtraCallback(quirksExternalSyntheticBackport04);
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    int i20 = IAuthTabCallback + 73;
                    onNavigationEvent = i20 % 128;
                    int i21 = i20 % 2;
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                    int i22 = onNavigationEvent + 79;
                    IAuthTabCallback = i22 % 128;
                    int i23 = i22 % 2;
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                AppLovinNativeAdImplExternalSyntheticLambda10.IAuthTabCallback(new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null), quirksExternalSyntheticBackport04, AppLovinNativeAdImplExternalSyntheticLambda4.IAuthTabCallback.onWarmupCompleted(onnavigationevent2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i5 >> 6) & 14) | 48), appLovinNativeAdImplExternalSyntheticLambda112, (GraphicDeviceInfo) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i5 & 7280, 16);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i24 = IAuthTabCallback + 77;
                    onNavigationEvent = i24 % 128;
                    int i25 = i24 % 2;
                }
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsStepperRowV1RightScope$.ExternalSyntheticLambda0(this, str, quirksExternalSyntheticBackport03, onnavigationevent2, appLovinNativeAdImplExternalSyntheticLambda112, i, i2));
                return;
            }
            return;
        }
        int i26 = onNavigationEvent + 93;
        IAuthTabCallback = i26 % 128;
        i3 = i26 % 2 != 0 ? i3 | 20 : i3 | 48;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        if ((i & 3072) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 1171) == 1170, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent onnavigationevent, @Nullable AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, @Nullable AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted onwarmupcompleted, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        int i5;
        int iOrdinal;
        int i6;
        AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent onnavigationevent2;
        AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult2;
        AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted onwarmupcompleted2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted;
        AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted onwarmupcompletedIAuthTabCallback;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent onnavigationevent3;
        AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(838587505);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                int i12 = onNavigationEvent + 105;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                i10 = 4;
            } else {
                i10 = 2;
            }
            i3 = i10 | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 == 0) {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                    int i15 = onNavigationEvent + 81;
                    IAuthTabCallback = i15 % 128;
                    int i16 = i15 % 2;
                    i4 = 32;
                } else {
                    i4 = 16;
                }
                i3 |= i4;
            }
            i5 = i2 & 4;
            Object obj = null;
            if (i5 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                if (onnavigationevent == null) {
                    int i17 = IAuthTabCallback + 119;
                    onNavigationEvent = i17 % 128;
                    if (i17 % 2 == 0) {
                        throw null;
                    }
                    iOrdinal = -1;
                } else {
                    iOrdinal = onnavigationevent.ordinal();
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOrdinal)) {
                    int i18 = IAuthTabCallback + 25;
                    onNavigationEvent = i18 % 128;
                    i6 = i18 % 2 == 0 ? 416 : 256;
                } else {
                    i6 = 128;
                }
                i3 |= i6;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) != 0) {
                    i9 = 1024;
                    i3 |= i9;
                } else {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallbackwithresult == null ? -1 : onextracallbackwithresult.ordinal())) {
                        int i19 = onNavigationEvent + 95;
                        IAuthTabCallback = i19 % 128;
                        int i20 = i19 % 2;
                        i9 = 2048;
                    }
                    i3 |= i9;
                }
            }
            if ((i & 24576) == 0) {
                int i21 = onNavigationEvent + 65;
                IAuthTabCallback = i21 % 128;
                int i22 = i21 % 2;
                if ((i2 & 16) != 0) {
                    i8 = 8192;
                    i3 |= i8;
                } else {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted == null ? -1 : onwarmupcompleted.ordinal())) {
                        i8 = 16384;
                    }
                    i3 |= i8;
                }
            }
            if ((196608 & i) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this)) {
                    int i23 = onNavigationEvent + 57;
                    IAuthTabCallback = i23 % 128;
                    i7 = 131072;
                    if (i23 % 2 != 0) {
                        int i24 = 87 / 0;
                    }
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i3) == 74898, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                onnavigationevent2 = onnavigationevent;
                onextracallbackwithresult2 = onextracallbackwithresult;
                onwarmupcompleted2 = onwarmupcompleted;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i14 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                    AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent onnavigationevent4 = i5 != 0 ? AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent.Medium : onnavigationevent;
                    if ((i2 & 8) != 0) {
                        onextracallbackwithresultOnWarmupCompleted = ((AppLovinNativeAdImplExternalSyntheticLambda2.IAuthTabCallback) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AppLovinNativeAdImplExternalSyntheticLambda10.onExtraCallback())).onWarmupCompleted();
                        i3 &= -7169;
                    } else {
                        onextracallbackwithresultOnWarmupCompleted = onextracallbackwithresult;
                    }
                    if ((i2 & 16) != 0) {
                        int i25 = onNavigationEvent + 23;
                        IAuthTabCallback = i25 % 128;
                        if (i25 % 2 != 0) {
                            onwarmupcompletedIAuthTabCallback = ((AppLovinNativeAdImplExternalSyntheticLambda2.IAuthTabCallback) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AppLovinNativeAdImplExternalSyntheticLambda10.onExtraCallback())).IAuthTabCallback();
                            i3 &= -57345;
                            int i26 = 35 / 0;
                        } else {
                            onwarmupcompletedIAuthTabCallback = ((AppLovinNativeAdImplExternalSyntheticLambda2.IAuthTabCallback) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AppLovinNativeAdImplExternalSyntheticLambda10.onExtraCallback())).IAuthTabCallback();
                            i3 &= -57345;
                        }
                    } else {
                        onwarmupcompletedIAuthTabCallback = onwarmupcompleted;
                    }
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                    onnavigationevent3 = onnavigationevent4;
                    onextracallbackwithresult3 = onextracallbackwithresultOnWarmupCompleted;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    onnavigationevent3 = onnavigationevent;
                    onextracallbackwithresult3 = onextracallbackwithresult;
                    onwarmupcompletedIAuthTabCallback = onwarmupcompleted;
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i27 = IAuthTabCallback + 25;
                    onNavigationEvent = i27 % 128;
                    if (i27 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(838587505, i3, -1, "im.toss.compose.v1.stepper.TdsStepperRowV1RightScope.BadgeType (StepperRows.kt:563)");
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(838587505, i3, -1, "im.toss.compose.v1.stepper.TdsStepperRowV1RightScope.BadgeType (StepperRows.kt:563)");
                }
                int i28 = i3 >> 9;
                AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted onwarmupcompleted3 = onwarmupcompletedIAuthTabCallback;
                AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult4 = onextracallbackwithresult3;
                IAuthTabCallback(str, quirksExternalSyntheticBackport03, onnavigationevent3, AppLovinNativeAdImplExternalSyntheticLambda4.IAuthTabCallback.onWarmupCompleted(onextracallbackwithresult3, onwarmupcompletedIAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i28 & 14) | 384 | (i28 & 112)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 & 1022) | ((i3 >> 3) & 57344), 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i29 = onNavigationEvent + 89;
                    IAuthTabCallback = i29 % 128;
                    if (i29 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        obj.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                onnavigationevent2 = onnavigationevent3;
                onextracallbackwithresult2 = onextracallbackwithresult4;
                onwarmupcompleted2 = onwarmupcompleted3;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsStepperRowV1RightScope$.ExternalSyntheticLambda4(this, str, quirksExternalSyntheticBackport02, onnavigationevent2, onextracallbackwithresult2, onwarmupcompleted2, i, i2));
                return;
            }
            return;
        }
        i3 |= 48;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i5 = i2 & 4;
        Object obj2 = null;
        if (i5 == 0) {
        }
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i3) == 74898, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(resumeAnimation resumeanimation, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {resumeanimation, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onExtraCallback(-1397945531, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), objArr, iIAuthTabCallback, 1397945531, SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
    }

    private static final Unit onWarmupCompleted(resumeAnimation resumeanimation, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {resumeanimation, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onExtraCallback(-1546793956, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), objArr, iIAuthTabCallback, 1546793957, SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
    }
}
