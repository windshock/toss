package o;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class getChildLayoutPosition extends findViewHolderForItemId {
    private static final addFocusables onExtraCallback = addFocusables.onExtraCallback(getChildLayoutPosition.class.getSimpleName());

    public getChildLayoutPosition(@NonNull List<MeteringRectangle> list, boolean z) {
        super(list, z);
    }

    @Override // o.findViewHolderForItemId
    protected boolean IAuthTabCallbackDefault(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
        boolean z = ((Integer) onNavigationEvent((CameraCharacteristics.Key<CameraCharacteristics.Key>) CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL, (CameraCharacteristics.Key) (-1))).intValue() != 2;
        Integer num = (Integer) dispatchonscrollstatechanged.onExtraCallbackWithResult(this).get(CaptureRequest.CONTROL_AWB_MODE);
        boolean z2 = z && num != null && num.intValue() == 1;
        onExtraCallback.onExtraCallbackWithResult(new Object[]{"checkIsSupported:", Boolean.valueOf(z2)});
        return z2;
    }

    @Override // o.findViewHolderForItemId
    protected boolean onTransact(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
        TotalCaptureResult totalCaptureResultOnWarmupCompleted = dispatchonscrollstatechanged.onWarmupCompleted(this);
        boolean z = false;
        if (totalCaptureResultOnWarmupCompleted != null) {
            Integer num = (Integer) totalCaptureResultOnWarmupCompleted.get(CaptureResult.CONTROL_AWB_STATE);
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
        int iIntValue = ((Integer) onNavigationEvent((CameraCharacteristics.Key<CameraCharacteristics.Key>) CameraCharacteristics.CONTROL_MAX_REGIONS_AWB, (CameraCharacteristics.Key) 0)).intValue();
        if (list.isEmpty() || iIntValue <= 0) {
            return;
        }
        dispatchonscrollstatechanged.onExtraCallbackWithResult(this).set(CaptureRequest.CONTROL_AWB_REGIONS, (MeteringRectangle[]) list.subList(0, Math.min(iIntValue, list.size())).toArray(new MeteringRectangle[0]));
        dispatchonscrollstatechanged.onNavigationEvent(this);
    }

    @Override // o.ensureRightGlow, o.dispatchNestedFling
    public void IAuthTabCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
        super.IAuthTabCallback(dispatchonscrollstatechanged, captureRequest, totalCaptureResult);
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AWB_STATE);
        onExtraCallback.onExtraCallbackWithResult(new Object[]{"onCaptureCompleted:", "awbState:", num});
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue == 2) {
                onExtraCallback(true);
                onNavigationEvent(Integer.MAX_VALUE);
            } else {
                if (iIntValue != 3) {
                    return;
                }
                onExtraCallback(false);
                onNavigationEvent(Integer.MAX_VALUE);
            }
        }
    }
}
