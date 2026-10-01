package o;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class getAdapterPositionInRecyclerView extends findViewHolderForPosition {
    private static final addFocusables onNavigationEvent = addFocusables.onExtraCallback(getAdapterPositionInRecyclerView.class.getSimpleName());

    public getAdapterPositionInRecyclerView() {
        super(true);
    }

    @Override // o.findViewHolderForPosition
    protected void onExtraCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @Nullable MeteringRectangle meteringRectangle) {
        boolean z = false;
        int iIntValue = ((Integer) onNavigationEvent(CameraCharacteristics.CONTROL_MAX_REGIONS_AF, 0)).intValue();
        if (meteringRectangle != null && iIntValue > 0) {
            dispatchonscrollstatechanged.onExtraCallbackWithResult(this).set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{meteringRectangle});
            z = true;
        }
        TotalCaptureResult totalCaptureResultOnWarmupCompleted = dispatchonscrollstatechanged.onWarmupCompleted(this);
        Integer num = totalCaptureResultOnWarmupCompleted == null ? null : (Integer) totalCaptureResultOnWarmupCompleted.get(CaptureResult.CONTROL_AF_TRIGGER);
        onNavigationEvent.onWarmupCompleted(new Object[]{"onStarted:", "last focus trigger is", num});
        if (num != null && num.intValue() == 1) {
            dispatchonscrollstatechanged.onExtraCallbackWithResult(this).set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        } else {
            if (z) {
            }
            onNavigationEvent(Integer.MAX_VALUE);
        }
        dispatchonscrollstatechanged.onNavigationEvent(this);
        onNavigationEvent(Integer.MAX_VALUE);
    }
}
