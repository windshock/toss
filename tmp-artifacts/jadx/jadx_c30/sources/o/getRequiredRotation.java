package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getRequiredRotation;
import o.setCallToAction;
import o.u4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getRequiredRotation {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(v1 v1Var, Function0 function0, setContentInsetsRelative setcontentinsetsrelative, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        onExtraCallback(v1Var, function0, setcontentinsetsrelative, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@NotNull final v1 v1Var, @NotNull final Function0<Unit> function0, @Nullable setContentInsetsRelative setcontentinsetsrelative, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        setContentInsetsRelative setcontentinsetsrelativeIAuthTabCallback;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final setContentInsetsRelative setcontentinsetsrelative2;
        Intrinsics.checkNotNullParameter(v1Var, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(function0, BuildConfig.FLAVOR);
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-607566865);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(v1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                setcontentinsetsrelativeIAuthTabCallback = setcontentinsetsrelative;
                int i4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setcontentinsetsrelativeIAuthTabCallback) ? 256 : 128;
                i3 |= i4;
            } else {
                setcontentinsetsrelativeIAuthTabCallback = setcontentinsetsrelative;
            }
            i3 |= i4;
        } else {
            setcontentinsetsrelativeIAuthTabCallback = setcontentinsetsrelative;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 147) != 146, i3 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                if ((i2 & 4) != 0) {
                    setcontentinsetsrelativeIAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1);
                    i3 &= -897;
                }
                int i5 = i3;
                setContentInsetsRelative setcontentinsetsrelative3 = setcontentinsetsrelativeIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-607566865, i5, -1, "viva.republica.toss.guest.certify.component.OverseasKoreanNfcBlockBottomSheet (OverseasKoreanNfcBlockBottomSheet.kt:21)");
                }
                getExifOrientation getexiforientation = getExifOrientation.IAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                u6a.IAuthTabCallback(v1Var, setcontentinsetsrelative3, 0L, 0L, (Function2) null, getexiforientation.onNavigationEvent(), ForwardingCameraControl.onExtraCallback(92008430, true, new getBacktraceNote() { // from class: viva.republica.toss.guest.certify.component.OverseasKoreanNfcBlockBottomSheetKt$$ExternalSyntheticLambda0
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return getRequiredRotation.onWarmupCompleted(function0, (u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, 0L, (String) null, (Function1) null, getexiforientation.onExtraCallback(), cameraCaptureResultEmptyCameraCaptureResult2, (i5 & 14) | 1769472 | ((i5 >> 3) & 112), 3072, 8092);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                setcontentinsetsrelative2 = setcontentinsetsrelative3;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                int i52 = i3;
                setContentInsetsRelative setcontentinsetsrelative32 = setcontentinsetsrelativeIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                getExifOrientation getexiforientation2 = getExifOrientation.IAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                u6a.IAuthTabCallback(v1Var, setcontentinsetsrelative32, 0L, 0L, (Function2) null, getexiforientation2.onNavigationEvent(), ForwardingCameraControl.onExtraCallback(92008430, true, new getBacktraceNote() { // from class: viva.republica.toss.guest.certify.component.OverseasKoreanNfcBlockBottomSheetKt$$ExternalSyntheticLambda0
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return getRequiredRotation.onWarmupCompleted(function0, (u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, 0L, (String) null, (Function1) null, getexiforientation2.onExtraCallback(), cameraCaptureResultEmptyCameraCaptureResult2, (i52 & 14) | 1769472 | ((i52 >> 3) & 112), 3072, 8092);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                setcontentinsetsrelative2 = setcontentinsetsrelative32;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            setcontentinsetsrelative2 = setcontentinsetsrelativeIAuthTabCallback;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: viva.republica.toss.guest.certify.component.OverseasKoreanNfcBlockBottomSheetKt$$ExternalSyntheticLambda1
                public final Object invoke(Object obj, Object obj2) {
                    return getRequiredRotation.onExtraCallbackWithResult(v1Var, function0, setcontentinsetsrelative2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(u4Var, BuildConfig.FLAVOR);
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(92008430, i2, -1, "viva.republica.toss.guest.certify.component.OverseasKoreanNfcBlockBottomSheet.<anonymous> (OverseasKoreanNfcBlockBottomSheet.kt:32)");
            }
            u4Var.onNavigationEvent(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.onboarding_overseas_korean_nfc_block_sheet_cta_text, cameraCaptureResultEmptyCameraCaptureResult, 0), (QuirksExternalSyntheticBackport0) null, (Function0) null, function0, setCallToAction.onExtraCallback.Fill, setCallToAction.onWarmupCompleted.Primary, setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult(), setCallToAction.onNavigationEvent.Inline, false, false, cameraCaptureResultEmptyCameraCaptureResult, 14376960, i2 & 14, 774);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }
}
