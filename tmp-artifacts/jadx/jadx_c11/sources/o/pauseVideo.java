package o;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.pauseVideo;
import o.populateMuteImage;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class pauseVideo {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static /* synthetic */ Unit IAuthTabCallback(float f, float f2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, populateMuteImage.onExtraCallbackWithResult onextracallbackwithresult, long j, long j2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(f, f2, quirksExternalSyntheticBackport0, onextracallbackwithresult, j, j2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = IAuthTabCallback + 25;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit onExtraCallbackWithResult(float f, float f2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, populateMuteImage.onExtraCallbackWithResult onextracallbackwithresult, long j, long j2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 53;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        IAuthTabCallback(f, f2, quirksExternalSyntheticBackport0, onextracallbackwithresult, j, j2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 95;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(populateMuteImage.onExtraCallbackWithResult onextracallbackwithresult, float f, float f2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, long j2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(onextracallbackwithresult, f, f2, quirksExternalSyntheticBackport0, j, j2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    private static final Unit IAuthTabCallback(populateMuteImage.onExtraCallbackWithResult onextracallbackwithresult, float f, float f2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, long j2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onExtraCallbackWithResult + 95;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i5 = onExtraCallbackWithResult + 47;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-270817210, i, -1, "im.toss.tds.compose.component.atom.progressbar.TdsProgressBarV1.<anonymous> (TdsProgressBarV1.kt:56)");
            }
            LowLightBoostStateState.onExtraCallback(onWarmupCompleted(isSubmitButtonEnabled.IAuthTabCallback(f / f2, onQueryRefine.onExtraCallbackWithResult(50, 0, setSubmitButtonEnabled.onWarmupCompleted(), 2, (Object) null), 0.0f, "progress", (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 3072, 20)), setExtensionStrength.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null), onextracallbackwithresult.m95getHeightD9Ej5fM()), RoundedCornerShapeKt.onNavigationEvent(onextracallbackwithresult.m96getRadiusD9Ej5fM())), j, j2, 0, cameraCaptureResultEmptyCameraCaptureResult, 0, 16);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IAuthTabCallback + 87;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i9 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i9 % 128;
        if (i9 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(final float f, final float f2, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable populateMuteImage.onExtraCallbackWithResult onextracallbackwithresult, long j, long j2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws NoWhenBranchMatchedException {
        int i3;
        int i4;
        long j3;
        populateMuteImage.onExtraCallbackWithResult onextracallbackwithresult2;
        long j4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        long j5;
        long jOnExtraCallbackWithResult;
        long jIAuthTabCallback;
        int i5;
        int i6;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
        int i7 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1171959639);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f)) {
                int i8 = onExtraCallbackWithResult + 63;
                IAuthTabCallback = i8 % 128;
                i6 = i8 % 2 != 0 ? 5 : 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f2) ? 32 : 16;
        }
        int i9 = i2 & 4;
        Object obj = null;
        if (i9 != 0) {
            int i10 = onExtraCallbackWithResult + 77;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            i3 |= 384;
        } else if ((i & 384) == 0) {
            int i12 = IAuthTabCallback + 69;
            onExtraCallbackWithResult = i12 % 128;
            if (i12 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport03);
                obj.hashCode();
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport03) ? 256 : 128;
        }
        int i13 = i2 & 8;
        if (i13 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallbackwithresult == null ? -1 : onextracallbackwithresult.ordinal())) {
                int i14 = onExtraCallbackWithResult + 39;
                IAuthTabCallback = i14 % 128;
                i4 = i14 % 2 != 0 ? 7119 : 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i & 24576) == 0) {
            i3 |= ((i2 & 16) != 0 || (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ^ true)) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            j3 = j2;
            if ((i2 & 32) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j3)) {
                int i15 = IAuthTabCallback + 77;
                onExtraCallbackWithResult = i15 % 128;
                int i16 = i15 % 2;
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i3 |= i5;
        } else {
            j3 = j2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i3) != 74898, i3 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((i & 1) != 0) {
                int i17 = IAuthTabCallback + 21;
                onExtraCallbackWithResult = i17 % 128;
                int i18 = i17 % 2;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                    if (i9 != 0) {
                        int i19 = IAuthTabCallback + 47;
                        onExtraCallbackWithResult = i19 % 128;
                        if (i19 % 2 == 0) {
                            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                            obj.hashCode();
                            throw null;
                        }
                        quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                    }
                    onextracallbackwithresult2 = i13 != 0 ? populateMuteImage.onExtraCallbackWithResult.Normal : onextracallbackwithresult;
                    if ((i2 & 16) != 0) {
                        jOnExtraCallbackWithResult = maybeHandlePause.IAuthTabCallback.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                        i3 &= -57345;
                    } else {
                        jOnExtraCallbackWithResult = j;
                    }
                    if ((i2 & 32) != 0) {
                        int i20 = onExtraCallbackWithResult + 81;
                        IAuthTabCallback = i20 % 128;
                        int i21 = i20 % 2;
                        jIAuthTabCallback = maybeHandlePause.IAuthTabCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                        i3 &= -458753;
                    } else {
                        jIAuthTabCallback = j3;
                    }
                    j5 = jIAuthTabCallback;
                    j4 = jOnExtraCallbackWithResult;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    onextracallbackwithresult2 = onextracallbackwithresult;
                    j4 = j;
                    j5 = j3;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1171959639, i3, -1, "im.toss.tds.compose.component.atom.progressbar.TdsProgressBarV1 (TdsProgressBarV1.kt:54)");
                }
                final populateMuteImage.onExtraCallbackWithResult onextracallbackwithresult3 = onextracallbackwithresult2;
                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                final long j6 = j4;
                final long j7 = j5;
                putBooleanArray.onExtraCallbackWithResult(putCharArray.Companion.extraCallback(), null, null, ForwardingCameraControl.onExtraCallback(-270817210, true, new Function2() { // from class: im.toss.tds.compose.component.atom.progressbar.TdsProgressBarV1Kt$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i22 = 2 % 2;
                        int i23 = onExtraCallbackWithResult + 87;
                        IAuthTabCallback = i23 % 128;
                        if (i23 % 2 == 0) {
                            pauseVideo.onWarmupCompleted(onextracallbackwithresult3, f2, f, quirksExternalSyntheticBackport04, j6, j7, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            throw null;
                        }
                        Unit unitOnWarmupCompleted = pauseVideo.onWarmupCompleted(onextracallbackwithresult3, f2, f, quirksExternalSyntheticBackport04, j6, j7, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i24 = onExtraCallbackWithResult + 81;
                        IAuthTabCallback = i24 % 128;
                        if (i24 % 2 == 0) {
                            int i25 = 61 / 0;
                        }
                        return unitOnWarmupCompleted;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3078, 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                int i22 = IAuthTabCallback + 9;
                onExtraCallbackWithResult = i22 % 128;
                int i23 = i22 % 2;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            onextracallbackwithresult2 = onextracallbackwithresult;
            j4 = j;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
            j5 = j3;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport02;
            final populateMuteImage.onExtraCallbackWithResult onextracallbackwithresult4 = onextracallbackwithresult2;
            final long j8 = j4;
            final long j9 = j5;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.progressbar.TdsProgressBarV1Kt$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                    int i24 = 2 % 2;
                    int i25 = IAuthTabCallback + 111;
                    onExtraCallbackWithResult = i25 % 128;
                    if (i25 % 2 != 0) {
                        return pauseVideo.IAuthTabCallback(f, f2, quirksExternalSyntheticBackport05, onextracallbackwithresult4, j8, j9, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    pauseVideo.IAuthTabCallback(f, f2, quirksExternalSyntheticBackport05, onextracallbackwithresult4, j8, j9, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    throw null;
                }
            });
        }
    }

    private static final float onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).floatValue();
        int i4 = onExtraCallbackWithResult + 3;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return fFloatValue;
    }
}
