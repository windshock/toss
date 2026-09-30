package o;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class findContainingItemView extends exceptionLabel {
    private static final addFocusables IAuthTabCallback = addFocusables.onExtraCallback(findContainingItemView.class.getSimpleName());

    @Override // o.exceptionLabel
    protected boolean onTransact(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
        boolean z = ((Integer) onNavigationEvent(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL, -1)).intValue() != 2;
        Integer num = (Integer) dispatchonscrollstatechanged.onExtraCallbackWithResult(this).get(CaptureRequest.CONTROL_AE_MODE);
        boolean z2 = z && (num != null && (num.intValue() == 1 || num.intValue() == 3 || num.intValue() == 2 || num.intValue() == 4 || num.intValue() == 5));
        IAuthTabCallback.onExtraCallbackWithResult(new Object[]{"checkIsSupported:", Boolean.valueOf(z2)});
        return z2;
    }

    @Override // o.exceptionLabel
    protected boolean IAuthTabCallbackStub(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
        TotalCaptureResult totalCaptureResultOnWarmupCompleted = dispatchonscrollstatechanged.onWarmupCompleted(this);
        boolean z = false;
        if (totalCaptureResultOnWarmupCompleted != null) {
            Integer num = (Integer) totalCaptureResultOnWarmupCompleted.get(CaptureResult.CONTROL_AE_STATE);
            if (num != null && num.intValue() == 3) {
                z = true;
            }
            IAuthTabCallback.onExtraCallbackWithResult(new Object[]{"checkShouldSkip:", Boolean.valueOf(z)});
            return z;
        }
        IAuthTabCallback.onExtraCallbackWithResult(new Object[]{"checkShouldSkip: false - lastResult is null."});
        return false;
    }

    @Override // o.exceptionLabel
    protected void IAuthTabCallbackDefault(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
        dispatchonscrollstatechanged.onExtraCallbackWithResult(this).set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
        dispatchonscrollstatechanged.onExtraCallbackWithResult(this).set(CaptureRequest.CONTROL_AE_LOCK, Boolean.TRUE);
        dispatchonscrollstatechanged.onNavigationEvent(this);
    }

    @Override // o.ensureRightGlow, o.dispatchNestedFling
    public void IAuthTabCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
        super.IAuthTabCallback(dispatchonscrollstatechanged, captureRequest, totalCaptureResult);
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
        IAuthTabCallback.onExtraCallbackWithResult(new Object[]{"processCapture:", "aeState:", num});
        if (num == null || num.intValue() != 3) {
            return;
        }
        onNavigationEvent(Integer.MAX_VALUE);
    }
}
