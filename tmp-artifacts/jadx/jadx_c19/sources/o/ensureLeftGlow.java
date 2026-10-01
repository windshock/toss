package o;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ensureLeftGlow extends dispatchNestedPreFling {
    private ensureRightGlow IAuthTabCallback;
    private long onExtraCallback;
    private long onNavigationEvent;

    ensureLeftGlow(long j, @NonNull ensureRightGlow ensurerightglow) {
        this.onNavigationEvent = j;
        this.IAuthTabCallback = ensurerightglow;
    }

    @Override // o.dispatchNestedPreFling
    public ensureRightGlow onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dispatchNestedPreFling, o.ensureRightGlow
    public void IAuthTabCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
        this.onExtraCallback = System.currentTimeMillis();
        super.IAuthTabCallback(dispatchonscrollstatechanged);
    }

    @Override // o.dispatchNestedPreFling, o.ensureRightGlow, o.dispatchNestedFling
    public void IAuthTabCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
        super.IAuthTabCallback(dispatchonscrollstatechanged, captureRequest, totalCaptureResult);
        if (IAuthTabCallback() || System.currentTimeMillis() <= this.onExtraCallback + this.onNavigationEvent) {
            return;
        }
        onNavigationEvent().onWarmupCompleted(dispatchonscrollstatechanged);
    }
}
