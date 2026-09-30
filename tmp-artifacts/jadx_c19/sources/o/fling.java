package o;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class fling extends findViewHolderForItemId {
    private static final addFocusables onExtraCallbackWithResult = addFocusables.onExtraCallback(fling.class.getSimpleName());

    public fling(@NonNull List<MeteringRectangle> list, boolean z) {
        super(list, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    @Override // o.findViewHolderForItemId
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected boolean IAuthTabCallbackDefault(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
        boolean z;
        Integer num = (Integer) dispatchonscrollstatechanged.onExtraCallbackWithResult(this).get(CaptureRequest.CONTROL_AF_MODE);
        if (num != null) {
            z = true;
            if (num.intValue() != 1 && num.intValue() != 4 && num.intValue() != 3 && num.intValue() != 2) {
                z = false;
            }
        }
        onExtraCallbackWithResult.onExtraCallbackWithResult(new Object[]{"checkIsSupported:", Boolean.valueOf(z)});
        return z;
    }

    @Override // o.findViewHolderForItemId
    protected boolean onTransact(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
        TotalCaptureResult totalCaptureResultOnWarmupCompleted = dispatchonscrollstatechanged.onWarmupCompleted(this);
        boolean z = false;
        if (totalCaptureResultOnWarmupCompleted != null) {
            Integer num = (Integer) totalCaptureResultOnWarmupCompleted.get(CaptureResult.CONTROL_AF_STATE);
            if (num != null && (num.intValue() == 4 || num.intValue() == 2)) {
                z = true;
            }
            onExtraCallbackWithResult.onExtraCallbackWithResult(new Object[]{"checkShouldSkip:", Boolean.valueOf(z)});
            return z;
        }
        onExtraCallbackWithResult.onExtraCallbackWithResult(new Object[]{"checkShouldSkip: false - lastResult is null."});
        return false;
    }

    @Override // o.findViewHolderForItemId
    protected void onNavigationEvent(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @NonNull List<MeteringRectangle> list) {
        onExtraCallbackWithResult.onExtraCallbackWithResult(new Object[]{"onStarted:", "with areas:", list});
        dispatchonscrollstatechanged.onExtraCallbackWithResult(this).set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        int iIntValue = ((Integer) onNavigationEvent((CameraCharacteristics.Key<CameraCharacteristics.Key>) CameraCharacteristics.CONTROL_MAX_REGIONS_AF, (CameraCharacteristics.Key) 0)).intValue();
        if (!list.isEmpty() && iIntValue > 0) {
            dispatchonscrollstatechanged.onExtraCallbackWithResult(this).set(CaptureRequest.CONTROL_AF_REGIONS, (MeteringRectangle[]) list.subList(0, Math.min(iIntValue, list.size())).toArray(new MeteringRectangle[0]));
        }
        dispatchonscrollstatechanged.onNavigationEvent(this);
    }

    @Override // o.ensureRightGlow
    public void onExtraCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
        super.onExtraCallback(dispatchonscrollstatechanged);
        dispatchonscrollstatechanged.onExtraCallbackWithResult(this).set(CaptureRequest.CONTROL_AF_TRIGGER, null);
    }

    @Override // o.ensureRightGlow, o.dispatchNestedFling
    public void IAuthTabCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
        super.IAuthTabCallback(dispatchonscrollstatechanged, captureRequest, totalCaptureResult);
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        onExtraCallbackWithResult.onExtraCallbackWithResult(new Object[]{"onCaptureCompleted:", "afState:", num});
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue == 4) {
                onExtraCallback(true);
                onNavigationEvent(Integer.MAX_VALUE);
            } else {
                if (iIntValue != 5) {
                    return;
                }
                onExtraCallback(false);
                onNavigationEvent(Integer.MAX_VALUE);
            }
        }
    }
}
