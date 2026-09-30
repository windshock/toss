package o;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class focusSearch extends findViewHolderForPosition {
    private static final addFocusables onWarmupCompleted = addFocusables.onExtraCallback(focusSearch.class.getSimpleName());

    public focusSearch() {
        super(true);
    }

    @Override // o.findViewHolderForPosition
    protected void onExtraCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @Nullable MeteringRectangle meteringRectangle) {
        int iIntValue = ((Integer) onNavigationEvent(CameraCharacteristics.CONTROL_MAX_REGIONS_AE, 0)).intValue();
        if (meteringRectangle != null && iIntValue > 0) {
            dispatchonscrollstatechanged.onExtraCallbackWithResult(this).set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{meteringRectangle});
        }
        TotalCaptureResult totalCaptureResultOnWarmupCompleted = dispatchonscrollstatechanged.onWarmupCompleted(this);
        Integer num = totalCaptureResultOnWarmupCompleted == null ? null : (Integer) totalCaptureResultOnWarmupCompleted.get(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER);
        addFocusables addfocusables = onWarmupCompleted;
        addfocusables.onExtraCallbackWithResult(new Object[]{"onStarted:", "last precapture trigger is", num});
        if (num != null && num.intValue() == 1) {
            addfocusables.onExtraCallbackWithResult(new Object[]{"onStarted:", "canceling precapture."});
            dispatchonscrollstatechanged.onExtraCallbackWithResult(this).set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
        }
        dispatchonscrollstatechanged.onExtraCallbackWithResult(this).set(CaptureRequest.CONTROL_AE_LOCK, Boolean.TRUE);
        dispatchonscrollstatechanged.onNavigationEvent(this);
        onNavigationEvent(0);
    }

    @Override // o.ensureRightGlow, o.dispatchNestedFling
    public void IAuthTabCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
        super.IAuthTabCallback(dispatchonscrollstatechanged, captureRequest, totalCaptureResult);
        if (onExtraCallback() == 0) {
            dispatchonscrollstatechanged.onExtraCallbackWithResult(this).set(CaptureRequest.CONTROL_AE_LOCK, Boolean.FALSE);
            dispatchonscrollstatechanged.onNavigationEvent(this);
            onNavigationEvent(Integer.MAX_VALUE);
        }
    }
}
