package o;

import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getVastAd {
    private static int IAuthTabCallback = 1;
    public static final getVastAd onExtraCallback = new getVastAd();
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    static {
        int i = IAuthTabCallback + 1;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 14 / 0;
        }
    }

    private getVastAd() {
    }

    public final long onWarmupCompleted(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onWarmupCompleted + 19;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(908062222, i, -1, "im.toss.tds.compose.component.atom.asset.TdsAssetV1Defaults.<get-backgroundColor> (TdsAssetV1Defaults.kt:12)");
            if (i4 == 0) {
                int i5 = 93 / 0;
            }
            int i6 = onWarmupCompleted + 119;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
        long jOnActivityLayout = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onActivityLayout();
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = onExtraCallbackWithResult + 47;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return jOnActivityLayout;
    }

    public final long IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-714862836, i, -1, "im.toss.tds.compose.component.atom.asset.TdsAssetV1Defaults.<get-textColor> (TdsAssetV1Defaults.kt:14)");
        }
        long jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue();
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i5 = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return jLongValue;
        }
        throw null;
    }
}
