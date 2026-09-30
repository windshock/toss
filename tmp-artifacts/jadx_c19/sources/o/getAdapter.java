package o;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class getAdapter extends findViewHolderForItemId {
    private static final addFocusables onExtraCallback = addFocusables.onExtraCallback(getAdapter.class.getSimpleName());
    private boolean IAuthTabCallback;
    private boolean onWarmupCompleted;

    public getAdapter(@NonNull List<MeteringRectangle> list, boolean z) {
        super(list, z);
        this.IAuthTabCallback = false;
        this.onWarmupCompleted = false;
    }

    @Override // o.findViewHolderForItemId
    protected boolean IAuthTabCallbackDefault(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
        boolean z = true;
        boolean z2 = ((Integer) onNavigationEvent((CameraCharacteristics.Key<CameraCharacteristics.Key>) CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL, (CameraCharacteristics.Key) (-1))).intValue() == 2;
        Integer num = (Integer) dispatchonscrollstatechanged.onExtraCallbackWithResult(this).get(CaptureRequest.CONTROL_AE_MODE);
        boolean z3 = num != null && (num.intValue() == 1 || num.intValue() == 3 || num.intValue() == 2 || num.intValue() == 4 || num.intValue() == 5);
        this.onWarmupCompleted = !z2;
        boolean z4 = ((Integer) onNavigationEvent((CameraCharacteristics.Key<CameraCharacteristics.Key>) CameraCharacteristics.CONTROL_MAX_REGIONS_AE, (CameraCharacteristics.Key) 0)).intValue() > 0;
        this.IAuthTabCallback = z4;
        if (!z3 || (!this.onWarmupCompleted && !z4)) {
            z = false;
        }
        onExtraCallback.onExtraCallbackWithResult(new Object[]{"checkIsSupported:", Boolean.valueOf(z), "trigger:", Boolean.valueOf(this.onWarmupCompleted), "areas:", Boolean.valueOf(z4)});
        return z;
    }

    @Override // o.findViewHolderForItemId
    protected boolean onTransact(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
        TotalCaptureResult totalCaptureResultOnWarmupCompleted = dispatchonscrollstatechanged.onWarmupCompleted(this);
        boolean z = false;
        if (totalCaptureResultOnWarmupCompleted != null) {
            Integer num = (Integer) totalCaptureResultOnWarmupCompleted.get(CaptureResult.CONTROL_AE_STATE);
            if (num != null && num.intValue() == 2) {
                z = true;
            }
            onExtraCallback.onExtraCallbackWithResult(new Object[]{"checkShouldSkip:", Boolean.valueOf(z)});
            return z;
        }
        onExtraCallback.onExtraCallbackWithResult(new Object[]{"checkShouldSkip: false - lastResult is null."});
        return false;
    }

    @Override // o.findViewHolderForItemId
    protected void onNavigationEvent(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @NonNull List<MeteringRectangle> list) {
        onExtraCallback.onExtraCallbackWithResult(new Object[]{"onStarted:", "with areas:", list});
        if (this.IAuthTabCallback && !list.isEmpty()) {
            dispatchonscrollstatechanged.onExtraCallbackWithResult(this).set(CaptureRequest.CONTROL_AE_REGIONS, (MeteringRectangle[]) list.subList(0, Math.min(((Integer) onNavigationEvent((CameraCharacteristics.Key<CameraCharacteristics.Key>) CameraCharacteristics.CONTROL_MAX_REGIONS_AE, (CameraCharacteristics.Key) 0)).intValue(), list.size())).toArray(new MeteringRectangle[0]));
        }
        if (this.onWarmupCompleted) {
            dispatchonscrollstatechanged.onExtraCallbackWithResult(this).set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        }
        dispatchonscrollstatechanged.onNavigationEvent(this);
        if (this.onWarmupCompleted) {
            onNavigationEvent(0);
        } else {
            onNavigationEvent(1);
        }
    }

    @Override // o.ensureRightGlow
    public void onExtraCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
        super.onExtraCallback(dispatchonscrollstatechanged);
        dispatchonscrollstatechanged.onExtraCallbackWithResult(this).set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    @Override // o.ensureRightGlow, o.dispatchNestedFling
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void IAuthTabCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
        super.IAuthTabCallback(dispatchonscrollstatechanged, captureRequest, totalCaptureResult);
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
        Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER);
        onExtraCallback.onExtraCallbackWithResult(new Object[]{"onCaptureCompleted:", "aeState:", num, "aeTriggerState:", num2});
        if (num != null) {
            if (onExtraCallback() == 0) {
                int iIntValue = num.intValue();
                if (iIntValue == 2) {
                    if (num2 != null && num2.intValue() == 1) {
                        onExtraCallback(true);
                        onNavigationEvent(Integer.MAX_VALUE);
                    }
                } else if (iIntValue == 3) {
                    onExtraCallback(false);
                    onNavigationEvent(Integer.MAX_VALUE);
                } else if (iIntValue != 4) {
                    if (iIntValue == 5) {
                        onNavigationEvent(1);
                    }
                }
            }
            if (onExtraCallback() == 1) {
                int iIntValue2 = num.intValue();
                if (iIntValue2 != 2) {
                    if (iIntValue2 == 3) {
                        onExtraCallback(false);
                        onNavigationEvent(Integer.MAX_VALUE);
                        return;
                    } else if (iIntValue2 != 4) {
                        return;
                    }
                }
                onExtraCallback(true);
                onNavigationEvent(Integer.MAX_VALUE);
            }
        }
    }
}
