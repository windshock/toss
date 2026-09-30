package o;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ensureTopGlow extends exceptionLabel {
    private static final addFocusables onWarmupCompleted = addFocusables.onExtraCallback(ensureTopGlow.class.getSimpleName());

    @Override // o.exceptionLabel
    protected boolean onTransact(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
        for (int i2 : (int[]) onNavigationEvent(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES, new int[0])) {
            if (i2 == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // o.exceptionLabel
    protected boolean IAuthTabCallbackStub(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
        TotalCaptureResult totalCaptureResultOnWarmupCompleted = dispatchonscrollstatechanged.onWarmupCompleted(this);
        boolean z = false;
        if (totalCaptureResultOnWarmupCompleted != null) {
            Integer num = (Integer) totalCaptureResultOnWarmupCompleted.get(CaptureResult.CONTROL_AF_STATE);
            boolean z2 = num != null && (num.intValue() == 4 || num.intValue() == 5 || num.intValue() == 0 || num.intValue() == 2 || num.intValue() == 6);
            Integer num2 = (Integer) totalCaptureResultOnWarmupCompleted.get(CaptureResult.CONTROL_AF_MODE);
            boolean z3 = num2 != null && num2.intValue() == 1;
            if (z2 && z3) {
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
        dispatchonscrollstatechanged.onExtraCallbackWithResult(this).set(CaptureRequest.CONTROL_AF_MODE, 1);
        dispatchonscrollstatechanged.onExtraCallbackWithResult(this).set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        dispatchonscrollstatechanged.onNavigationEvent(this);
    }

    @Override // o.ensureRightGlow, o.dispatchNestedFling
    public void IAuthTabCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
        super.IAuthTabCallback(dispatchonscrollstatechanged, captureRequest, totalCaptureResult);
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE);
        onWarmupCompleted.onExtraCallbackWithResult(new Object[]{"onCapture:", "afState:", num, "afMode:", num2});
        if (num == null || num2 == null || num2.intValue() != 1) {
            return;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0 || iIntValue == 2 || iIntValue == 4 || iIntValue == 5 || iIntValue == 6) {
            onNavigationEvent(Integer.MAX_VALUE);
        }
    }
}
