package o;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class dispatchOnScrolled extends ensureRightGlow {
    private static final addFocusables onExtraCallback = addFocusables.onExtraCallback(dispatchChildDetached.class.getSimpleName());
    private String onWarmupCompleted;

    @Override // o.ensureRightGlow, o.dispatchNestedFling
    public void IAuthTabCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
        super.IAuthTabCallback(dispatchonscrollstatechanged, captureRequest, totalCaptureResult);
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE);
        Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
        Integer num3 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        String str = "aeMode: " + num + " aeLock: " + ((Boolean) totalCaptureResult.get(CaptureResult.CONTROL_AE_LOCK)) + " aeState: " + num2 + " aeTriggerState: " + ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER)) + " afState: " + num3 + " afTriggerState: " + ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_TRIGGER));
        if (str.equals(this.onWarmupCompleted)) {
            return;
        }
        this.onWarmupCompleted = str;
        onExtraCallback.onExtraCallbackWithResult(new Object[]{str});
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.ensureRightGlow
    public void onExtraCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
        super.onExtraCallback(dispatchonscrollstatechanged);
        onNavigationEvent(0);
        onExtraCallbackWithResult(dispatchonscrollstatechanged);
    }
}
