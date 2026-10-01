package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface putDoubleArray {
    default void onExtraCallback(@Nullable Object obj, @Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1015428512);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1015428512, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.TdsAgreementV4Preset.Custom (TdsAgreementV4Preset.kt:13)");
        }
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(869226705, obj);
        if (function2 == null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1176253561);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(869227656);
            function2.invoke(cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i >> 3) & 14));
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            Unit unit = Unit.INSTANCE;
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackStub();
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
    }
}
