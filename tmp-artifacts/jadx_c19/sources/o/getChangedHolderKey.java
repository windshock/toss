package o;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class getChangedHolderKey extends findViewHolderForPosition {
    private static final addFocusables IAuthTabCallback = addFocusables.onExtraCallback(getChangedHolderKey.class.getSimpleName());

    public getChangedHolderKey() {
        super(true);
    }

    @Override // o.findViewHolderForPosition
    protected void onExtraCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @Nullable MeteringRectangle meteringRectangle) {
        IAuthTabCallback.onWarmupCompleted(new Object[]{"onStarted:", "with area:", meteringRectangle});
        int iIntValue = ((Integer) onNavigationEvent(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB, 0)).intValue();
        if (meteringRectangle != null && iIntValue > 0) {
            dispatchonscrollstatechanged.onExtraCallbackWithResult(this).set(CaptureRequest.CONTROL_AWB_REGIONS, new MeteringRectangle[]{meteringRectangle});
            dispatchonscrollstatechanged.onNavigationEvent(this);
        }
        onNavigationEvent(Integer.MAX_VALUE);
    }
}
