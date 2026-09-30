package o;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class ensureRightGlow implements dispatchNestedFling {
    private boolean IAuthTabCallback;
    private final List<dispatchNestedPreScroll> onExtraCallback = new ArrayList();
    private dispatchOnScrollStateChanged onExtraCallbackWithResult;
    private int onWarmupCompleted;

    @Override // o.dispatchNestedFling
    public void IAuthTabCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
    }

    public void onExtraCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
    }

    @Override // o.dispatchNestedFling
    public void onExtraCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
    }

    protected void onNavigationEvent(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
    }

    public final int onExtraCallback() {
        return this.onWarmupCompleted;
    }

    @Override // o.dispatchNestedFling
    public final void onExtraCallbackWithResult(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
        this.onExtraCallbackWithResult = dispatchonscrollstatechanged;
        dispatchonscrollstatechanged.IAuthTabCallback(this);
        if (dispatchonscrollstatechanged.onWarmupCompleted(this) != null) {
            IAuthTabCallback(dispatchonscrollstatechanged);
        } else {
            this.IAuthTabCallback = true;
        }
    }

    @Override // o.dispatchNestedFling
    public final void onWarmupCompleted(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
        dispatchonscrollstatechanged.IAuthTabCallbackStub(this);
        if (!IAuthTabCallback()) {
            onNavigationEvent(dispatchonscrollstatechanged);
            onNavigationEvent(Integer.MAX_VALUE);
        }
        this.IAuthTabCallback = false;
    }

    public void IAuthTabCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
        this.onExtraCallbackWithResult = dispatchonscrollstatechanged;
    }

    @Override // o.dispatchNestedFling
    public void onWarmupCompleted(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @NonNull CaptureRequest captureRequest) {
        if (this.IAuthTabCallback) {
            IAuthTabCallback(dispatchonscrollstatechanged);
            this.IAuthTabCallback = false;
        }
    }

    public final void onNavigationEvent(int i2) {
        if (i2 != this.onWarmupCompleted) {
            this.onWarmupCompleted = i2;
            Iterator<dispatchNestedPreScroll> it = this.onExtraCallback.iterator();
            while (it.hasNext()) {
                it.next().onNavigationEvent(this, this.onWarmupCompleted);
            }
            if (this.onWarmupCompleted == Integer.MAX_VALUE) {
                this.onExtraCallbackWithResult.IAuthTabCallbackStub(this);
                onExtraCallback(this.onExtraCallbackWithResult);
            }
        }
    }

    public boolean IAuthTabCallback() {
        return this.onWarmupCompleted == Integer.MAX_VALUE;
    }

    protected dispatchOnScrollStateChanged onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    public <T> T onNavigationEvent(@NonNull CameraCharacteristics.Key<T> key, @NonNull T t) {
        T t2 = (T) this.onExtraCallbackWithResult.onExtraCallback(this).get(key);
        return t2 == null ? t : t2;
    }

    @Override // o.dispatchNestedFling
    public void onWarmupCompleted(@NonNull dispatchNestedPreScroll dispatchnestedprescroll) {
        if (this.onExtraCallback.contains(dispatchnestedprescroll)) {
            return;
        }
        this.onExtraCallback.add(dispatchnestedprescroll);
        dispatchnestedprescroll.onNavigationEvent(this, onExtraCallback());
    }

    @Override // o.dispatchNestedFling
    public void IAuthTabCallback(@NonNull dispatchNestedPreScroll dispatchnestedprescroll) {
        this.onExtraCallback.remove(dispatchnestedprescroll);
    }
}
