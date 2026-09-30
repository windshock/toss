package o;

import android.hardware.camera2.params.MeteringRectangle;
import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class findViewHolderForItemId extends ensureRightGlow {
    private static final addFocusables onWarmupCompleted = addFocusables.onExtraCallback(findViewHolderForItemId.class.getSimpleName());
    private boolean IAuthTabCallback;
    private boolean onExtraCallback;
    private final List<MeteringRectangle> onExtraCallbackWithResult;

    protected abstract boolean IAuthTabCallbackDefault(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged);

    protected abstract void onNavigationEvent(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @NonNull List<MeteringRectangle> list);

    protected abstract boolean onTransact(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged);

    protected findViewHolderForItemId(@NonNull List<MeteringRectangle> list, boolean z) {
        this.onExtraCallbackWithResult = list;
        this.IAuthTabCallback = z;
    }

    @Override // o.ensureRightGlow
    public final void IAuthTabCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
        super.IAuthTabCallback(dispatchonscrollstatechanged);
        boolean z = this.IAuthTabCallback && onTransact(dispatchonscrollstatechanged);
        if (!IAuthTabCallbackDefault(dispatchonscrollstatechanged) || z) {
            onWarmupCompleted.onExtraCallbackWithResult(new Object[]{"onStart:", "not supported or skipped. Dispatching COMPLETED state."});
            onExtraCallback(true);
            onNavigationEvent(Integer.MAX_VALUE);
        } else {
            onWarmupCompleted.onExtraCallbackWithResult(new Object[]{"onStart:", "supported and not skipped. Dispatching onStarted."});
            onNavigationEvent(dispatchonscrollstatechanged, this.onExtraCallbackWithResult);
        }
    }

    protected void onExtraCallback(boolean z) {
        this.onExtraCallback = z;
    }

    public boolean onNavigationEvent() {
        return this.onExtraCallback;
    }
}
