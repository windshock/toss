package o;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class dispatchNestedPreFling extends ensureRightGlow {
    public abstract ensureRightGlow onNavigationEvent();

    @Override // o.ensureRightGlow
    public void IAuthTabCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
        super.IAuthTabCallback(dispatchonscrollstatechanged);
        onNavigationEvent().onWarmupCompleted(new dispatchNestedPreScroll() { // from class: o.dispatchNestedPreFling.1
            @Override // o.dispatchNestedPreScroll
            public void onNavigationEvent(@NonNull dispatchNestedFling dispatchnestedfling, int i2) {
                dispatchNestedPreFling.this.onNavigationEvent(i2);
                if (i2 == Integer.MAX_VALUE) {
                    dispatchnestedfling.IAuthTabCallback(this);
                }
            }
        });
        onNavigationEvent().IAuthTabCallback(dispatchonscrollstatechanged);
    }

    @Override // o.ensureRightGlow
    protected void onNavigationEvent(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
        super.onNavigationEvent(dispatchonscrollstatechanged);
        onNavigationEvent().onNavigationEvent(dispatchonscrollstatechanged);
    }

    @Override // o.ensureRightGlow, o.dispatchNestedFling
    public void onWarmupCompleted(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @NonNull CaptureRequest captureRequest) {
        super.onWarmupCompleted(dispatchonscrollstatechanged, captureRequest);
        onNavigationEvent().onWarmupCompleted(dispatchonscrollstatechanged, captureRequest);
    }

    @Override // o.ensureRightGlow, o.dispatchNestedFling
    public void onExtraCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
        super.onExtraCallback(dispatchonscrollstatechanged, captureRequest, captureResult);
        onNavigationEvent().onExtraCallback(dispatchonscrollstatechanged, captureRequest, captureResult);
    }

    @Override // o.ensureRightGlow, o.dispatchNestedFling
    public void IAuthTabCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
        super.IAuthTabCallback(dispatchonscrollstatechanged, captureRequest, totalCaptureResult);
        onNavigationEvent().IAuthTabCallback(dispatchonscrollstatechanged, captureRequest, totalCaptureResult);
    }
}
