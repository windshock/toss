package o;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class findViewHolderForPosition extends ensureRightGlow {
    private boolean onNavigationEvent;

    protected abstract void onExtraCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @Nullable MeteringRectangle meteringRectangle);

    protected findViewHolderForPosition(boolean z) {
        this.onNavigationEvent = z;
    }

    @Override // o.ensureRightGlow
    public final void IAuthTabCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
        super.IAuthTabCallback(dispatchonscrollstatechanged);
        onExtraCallback(dispatchonscrollstatechanged, this.onNavigationEvent ? new MeteringRectangle((Rect) onNavigationEvent(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE, new Rect()), 0) : null);
    }
}
