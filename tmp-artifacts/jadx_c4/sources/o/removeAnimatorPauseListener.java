package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.removeAnimatorPauseListener;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class removeAnimatorPauseListener {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    private static final Unit onNavigationEvent(getBacktraceNote getbacktracenote, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 39;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        onWarmupCompleted(getbacktracenote, quirksExternalSyntheticBackport0, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallbackWithResult + 31;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getBacktraceNote getbacktracenote, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 77;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(getbacktracenote, quirksExternalSyntheticBackport0, getbacktracenote2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallbackWithResult + 109;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unitOnNavigationEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@NotNull final getBacktraceNote<? super removeAnimatorListener, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable getBacktraceNote<? super removeAnimatorListener, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        int i5;
        boolean z;
        final getBacktraceNote<? super removeAnimatorListener, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        getBacktraceNote<? super removeAnimatorListener, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenoteOnNavigationEvent = getbacktracenote2;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1813783234);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                int i8 = onExtraCallbackWithResult + 65;
                onExtraCallback = i8 % 128;
                i3 = i8 % 2 == 0 ? i3 | 10403 : i3 | 384;
            } else if ((i & 384) == 0) {
                int i9 = onExtraCallbackWithResult + 75;
                onExtraCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 84 / 0;
                    i5 = !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenoteOnNavigationEvent) ? 128 : 256;
                } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenoteOnNavigationEvent)) {
                }
                i3 |= i5;
            }
            if ((i3 & 147) == 146) {
                int i11 = onExtraCallback + 1;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                z = true;
            } else {
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                getbacktracenote3 = getbacktracenoteOnNavigationEvent;
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            } else {
                int i13 = onExtraCallbackWithResult;
                int i14 = i13 + 55;
                onExtraCallback = i14 % 128;
                int i15 = i14 % 2;
                if (i7 != 0) {
                    int i16 = i13 + 53;
                    onExtraCallback = i16 % 128;
                    int i17 = i16 % 2;
                    quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                } else {
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                }
                if (i4 != 0) {
                    getbacktracenoteOnNavigationEvent = getMinFrame.IAuthTabCallback.onNavigationEvent();
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1813783234, i3, -1, "im.toss.compose.v0.TdsTopV1 (TdsTopV1.kt:20)");
                }
                float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport03, 0.0f, 1, (Object) null), fIAuthTabCallback, fIAuthTabCallback, fIAuthTabCallback, 0.0f, 8, (Object) null);
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
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
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                removeAnimatorListener removeanimatorlistener = removeAnimatorListener.onWarmupCompleted;
                getbacktracenote.invoke(removeanimatorlistener, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(((i3 << 3) & 112) | 6));
                getbacktracenoteOnNavigationEvent.invoke(removeanimatorlistener, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(((i3 >> 3) & 112) | 6));
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                getbacktracenote3 = getbacktracenoteOnNavigationEvent;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v0.TdsTopV1Kt$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj, Object obj2) {
                        int i18 = 2 % 2;
                        int i19 = onExtraCallback + 1;
                        onExtraCallbackWithResult = i19 % 128;
                        if (i19 % 2 != 0) {
                            removeAnimatorPauseListener.onWarmupCompleted(getbacktracenote, quirksExternalSyntheticBackport03, getbacktracenote3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        Unit unitOnWarmupCompleted = removeAnimatorPauseListener.onWarmupCompleted(getbacktracenote, quirksExternalSyntheticBackport03, getbacktracenote3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i20 = onExtraCallback + 59;
                        onExtraCallbackWithResult = i20 % 128;
                        int i21 = i20 % 2;
                        return unitOnWarmupCompleted;
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        if ((i3 & 147) == 146) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }
}
