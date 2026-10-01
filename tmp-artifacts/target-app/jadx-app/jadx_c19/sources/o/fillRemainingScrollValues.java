package o;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class fillRemainingScrollValues extends ensureRightGlow {
    private final List<ensureRightGlow> onNavigationEvent;
    private final List<ensureRightGlow> onWarmupCompleted;

    fillRemainingScrollValues(@NonNull List<ensureRightGlow> list) {
        this.onNavigationEvent = new ArrayList(list);
        this.onWarmupCompleted = new ArrayList(list);
        Iterator<ensureRightGlow> it = list.iterator();
        while (it.hasNext()) {
            it.next().onWarmupCompleted(new dispatchNestedPreScroll() { // from class: o.fillRemainingScrollValues.3
                @Override // o.dispatchNestedPreScroll
                public void onNavigationEvent(@NonNull dispatchNestedFling dispatchnestedfling, int i2) {
                    if (i2 == Integer.MAX_VALUE) {
                        fillRemainingScrollValues.this.onWarmupCompleted.remove(dispatchnestedfling);
                    }
                    if (fillRemainingScrollValues.this.onWarmupCompleted.isEmpty()) {
                        fillRemainingScrollValues.this.onNavigationEvent(Integer.MAX_VALUE);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.ensureRightGlow
    public void IAuthTabCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
        super.IAuthTabCallback(dispatchonscrollstatechanged);
        for (ensureRightGlow ensurerightglow : this.onNavigationEvent) {
            if (!ensurerightglow.IAuthTabCallback()) {
                ensurerightglow.IAuthTabCallback(dispatchonscrollstatechanged);
            }
        }
    }

    @Override // o.ensureRightGlow
    protected void onNavigationEvent(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
        super.onNavigationEvent(dispatchonscrollstatechanged);
        for (ensureRightGlow ensurerightglow : this.onNavigationEvent) {
            if (!ensurerightglow.IAuthTabCallback()) {
                ensurerightglow.onNavigationEvent(dispatchonscrollstatechanged);
            }
        }
    }

    @Override // o.ensureRightGlow, o.dispatchNestedFling
    public void onWarmupCompleted(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @NonNull CaptureRequest captureRequest) {
        super.onWarmupCompleted(dispatchonscrollstatechanged, captureRequest);
        for (ensureRightGlow ensurerightglow : this.onNavigationEvent) {
            if (!ensurerightglow.IAuthTabCallback()) {
                ensurerightglow.onWarmupCompleted(dispatchonscrollstatechanged, captureRequest);
            }
        }
    }

    @Override // o.ensureRightGlow, o.dispatchNestedFling
    public void onExtraCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
        super.onExtraCallback(dispatchonscrollstatechanged, captureRequest, captureResult);
        for (ensureRightGlow ensurerightglow : this.onNavigationEvent) {
            if (!ensurerightglow.IAuthTabCallback()) {
                ensurerightglow.onExtraCallback(dispatchonscrollstatechanged, captureRequest, captureResult);
            }
        }
    }

    @Override // o.ensureRightGlow, o.dispatchNestedFling
    public void IAuthTabCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
        super.IAuthTabCallback(dispatchonscrollstatechanged, captureRequest, totalCaptureResult);
        for (ensureRightGlow ensurerightglow : this.onNavigationEvent) {
            if (!ensurerightglow.IAuthTabCallback()) {
                ensurerightglow.IAuthTabCallback(dispatchonscrollstatechanged, captureRequest, totalCaptureResult);
            }
        }
    }
}
