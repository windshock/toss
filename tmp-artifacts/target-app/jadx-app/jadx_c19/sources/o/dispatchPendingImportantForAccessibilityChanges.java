package o;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class dispatchPendingImportantForAccessibilityChanges extends ensureRightGlow {
    private int IAuthTabCallback = -1;
    private final List<ensureRightGlow> onExtraCallback;

    dispatchPendingImportantForAccessibilityChanges(@NonNull List<ensureRightGlow> list) {
        this.onExtraCallback = list;
        onWarmupCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onWarmupCompleted() {
        int i2 = this.IAuthTabCallback;
        boolean z = i2 == -1;
        if (i2 == this.onExtraCallback.size() - 1) {
            onNavigationEvent(Integer.MAX_VALUE);
            return;
        }
        int i3 = this.IAuthTabCallback + 1;
        this.IAuthTabCallback = i3;
        this.onExtraCallback.get(i3).onWarmupCompleted(new dispatchNestedPreScroll() { // from class: o.dispatchPendingImportantForAccessibilityChanges.2
            @Override // o.dispatchNestedPreScroll
            public void onNavigationEvent(@NonNull dispatchNestedFling dispatchnestedfling, int i4) {
                if (i4 == Integer.MAX_VALUE) {
                    dispatchnestedfling.IAuthTabCallback(this);
                    dispatchPendingImportantForAccessibilityChanges.this.onWarmupCompleted();
                }
            }
        });
        if (z) {
            return;
        }
        this.onExtraCallback.get(this.IAuthTabCallback).IAuthTabCallback(onExtraCallbackWithResult());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.ensureRightGlow
    public void IAuthTabCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
        super.IAuthTabCallback(dispatchonscrollstatechanged);
        int i2 = this.IAuthTabCallback;
        if (i2 >= 0) {
            this.onExtraCallback.get(i2).IAuthTabCallback(dispatchonscrollstatechanged);
        }
    }

    @Override // o.ensureRightGlow
    protected void onNavigationEvent(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
        super.onNavigationEvent(dispatchonscrollstatechanged);
        int i2 = this.IAuthTabCallback;
        if (i2 >= 0) {
            this.onExtraCallback.get(i2).onNavigationEvent(dispatchonscrollstatechanged);
        }
    }

    @Override // o.ensureRightGlow, o.dispatchNestedFling
    public void onWarmupCompleted(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @NonNull CaptureRequest captureRequest) {
        super.onWarmupCompleted(dispatchonscrollstatechanged, captureRequest);
        int i2 = this.IAuthTabCallback;
        if (i2 >= 0) {
            this.onExtraCallback.get(i2).onWarmupCompleted(dispatchonscrollstatechanged, captureRequest);
        }
    }

    @Override // o.ensureRightGlow, o.dispatchNestedFling
    public void onExtraCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
        super.onExtraCallback(dispatchonscrollstatechanged, captureRequest, captureResult);
        int i2 = this.IAuthTabCallback;
        if (i2 >= 0) {
            this.onExtraCallback.get(i2).onExtraCallback(dispatchonscrollstatechanged, captureRequest, captureResult);
        }
    }

    @Override // o.ensureRightGlow, o.dispatchNestedFling
    public void IAuthTabCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
        super.IAuthTabCallback(dispatchonscrollstatechanged, captureRequest, totalCaptureResult);
        int i2 = this.IAuthTabCallback;
        if (i2 >= 0) {
            this.onExtraCallback.get(i2).IAuthTabCallback(dispatchonscrollstatechanged, captureRequest, totalCaptureResult);
        }
    }
}
