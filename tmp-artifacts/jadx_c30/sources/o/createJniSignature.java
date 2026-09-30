package o;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.areCachedAdResourcesMissing;
import o.createJniSignature;
import o.roundUpToNearestHalfInt;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class createJniSignature {
    public static final createJniSignature onExtraCallbackWithResult = new createJniSignature();
    private static getBacktraceNote<areCachedAdResourcesMissing, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(-2080212662, false, new getBacktraceNote() { // from class: viva.republica.toss.verify.unblock.manualselfie.ComposableSingletons$FdsManualSelfieVerifyRetryDescriptionViewKt$$ExternalSyntheticLambda0
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return createJniSignature.onExtraCallback((areCachedAdResourcesMissing) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
    });
    private static getBacktraceNote<roundUpToNearestHalfInt, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(-1261206425, false, new getBacktraceNote() { // from class: viva.republica.toss.verify.unblock.manualselfie.ComposableSingletons$FdsManualSelfieVerifyRetryDescriptionViewKt$$ExternalSyntheticLambda1
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return createJniSignature.onExtraCallback((roundUpToNearestHalfInt) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
    });

    public final getBacktraceNote<roundUpToNearestHalfInt, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        return onNavigationEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(roundUpToNearestHalfInt rounduptonearesthalfint, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(rounduptonearesthalfint, BuildConfig.FLAVOR);
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rounduptonearesthalfint) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1261206425, i2, -1, "viva.republica.toss.verify.unblock.manualselfie.ComposableSingletons$FdsManualSelfieVerifyRetryDescriptionViewKt.lambda$-1261206425.<anonymous> (FdsManualSelfieVerifyRetryDescriptionView.kt:20)");
            }
            rounduptonearesthalfint.onExtraCallbackWithResult((QuirksExternalSyntheticBackport0) null, 0, 0.0f, 0L, (GraphicDeviceInfo) null, getCombinedPathForAllStarsWithSide.IAuthTabCallbackDefault(getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult, 0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 7, (Object) null), onWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult, 1769472 | ((i2 << 21) & 29360128), 31);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(areCachedAdResourcesMissing arecachedadresourcesmissing, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(arecachedadresourcesmissing, BuildConfig.FLAVOR);
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(arecachedadresourcesmissing) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2080212662, i2, -1, "viva.republica.toss.verify.unblock.manualselfie.ComposableSingletons$FdsManualSelfieVerifyRetryDescriptionViewKt.lambda$-2080212662.<anonymous> (FdsManualSelfieVerifyRetryDescriptionView.kt:23)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.app_fds_manual_selfie_verify_retry_description_1, cameraCaptureResultEmptyCameraCaptureResult, 0);
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            int i3 = i2 & 14;
            arecachedadresourcesmissing.IAuthTabCallback(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService(), (GraphicDeviceInfo) null, 0L, (GraphicDeviceInfo) null, (handshake) null, (Integer) null, 0, 0.0f, cameraCaptureResultEmptyCameraCaptureResult, 0, i3, 1018);
            arecachedadresourcesmissing.IAuthTabCallback(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.app_fds_manual_selfie_verify_retry_description_2, cameraCaptureResultEmptyCameraCaptureResult, 0), (QuirksExternalSyntheticBackport0) null, y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService(), (GraphicDeviceInfo) null, 0L, (GraphicDeviceInfo) null, (handshake) null, (Integer) null, 0, 0.0f, cameraCaptureResultEmptyCameraCaptureResult, 0, i3, 1018);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }
}
