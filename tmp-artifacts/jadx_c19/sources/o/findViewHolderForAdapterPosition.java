package o;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class findViewHolderForAdapterPosition extends exceptionLabel {
    private static final addFocusables onWarmupCompleted = addFocusables.onExtraCallback(findViewHolderForAdapterPosition.class.getSimpleName());

    @Override // o.exceptionLabel
    protected boolean onTransact(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
        boolean z = ((Integer) onNavigationEvent(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL, -1)).intValue() != 2;
        Integer num = (Integer) dispatchonscrollstatechanged.onExtraCallbackWithResult(this).get(CaptureRequest.CONTROL_AWB_MODE);
        boolean z2 = z && num != null && num.intValue() == 1;
        onWarmupCompleted.onExtraCallbackWithResult(new Object[]{"checkIsSupported:", Boolean.valueOf(z2)});
        return z2;
    }

    @Override // o.exceptionLabel
    protected boolean IAuthTabCallbackStub(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
        TotalCaptureResult totalCaptureResultOnWarmupCompleted = dispatchonscrollstatechanged.onWarmupCompleted(this);
        boolean z = false;
        if (totalCaptureResultOnWarmupCompleted != null) {
            Integer num = (Integer) totalCaptureResultOnWarmupCompleted.get(CaptureResult.CONTROL_AWB_STATE);
            if (num != null && num.intValue() == 3) {
                z = true;
            }
            onWarmupCompleted.onExtraCallbackWithResult(new Object[]{"checkShouldSkip:", Boolean.valueOf(z)});
            return z;
        }
        onWarmupCompleted.onExtraCallbackWithResult(new Object[]{"checkShouldSkip: false - lastResult is null."});
        return false;
    }

    @Override // o.exceptionLabel
    protected void IAuthTabCallbackDefault(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
        dispatchonscrollstatechanged.onExtraCallbackWithResult(this).set(CaptureRequest.CONTROL_AWB_LOCK, Boolean.TRUE);
        dispatchonscrollstatechanged.onNavigationEvent(this);
    }

    @Override // o.ensureRightGlow, o.dispatchNestedFling
    public void IAuthTabCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
        super.IAuthTabCallback(dispatchonscrollstatechanged, captureRequest, totalCaptureResult);
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AWB_STATE);
        onWarmupCompleted.onExtraCallbackWithResult(new Object[]{"processCapture:", "awbState:", num});
        if (num == null || num.intValue() != 3) {
            return;
        }
        onNavigationEvent(Integer.MAX_VALUE);
    }
}
