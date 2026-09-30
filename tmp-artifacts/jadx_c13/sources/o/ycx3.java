package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class ycx3<E> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater onExtraCallbackWithResult = AtomicReferenceFieldUpdater.newUpdater(ycx3.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public ycx3(boolean z) {
        this._cur$volatile = new lud2(8, z);
    }

    public final int onExtraCallbackWithResult() {
        return ((lud2) onExtraCallbackWithResult.get(this)).onNavigationEvent();
    }

    public final void IAuthTabCallback() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = onExtraCallbackWithResult;
        while (true) {
            lud2 lud2Var = (lud2) atomicReferenceFieldUpdater.get(this);
            if (lud2Var.onExtraCallback()) {
                return;
            } else {
                RequestBuilder.onWarmupCompleted(onExtraCallbackWithResult, this, lud2Var, lud2Var.onExtraCallbackWithResult());
            }
        }
    }

    public final boolean onNavigationEvent(@NotNull E e) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = onExtraCallbackWithResult;
        while (true) {
            lud2 lud2Var = (lud2) atomicReferenceFieldUpdater.get(this);
            int iOnExtraCallbackWithResult = lud2Var.onExtraCallbackWithResult(e);
            if (iOnExtraCallbackWithResult == 0) {
                return true;
            }
            if (iOnExtraCallbackWithResult == 1) {
                RequestBuilder.onWarmupCompleted(onExtraCallbackWithResult, this, lud2Var, lud2Var.onExtraCallbackWithResult());
            } else if (iOnExtraCallbackWithResult == 2) {
                return false;
            }
        }
    }

    public final E onNavigationEvent() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = onExtraCallbackWithResult;
        while (true) {
            lud2 lud2Var = (lud2) atomicReferenceFieldUpdater.get(this);
            E e = (E) lud2Var.onWarmupCompleted();
            if (e != lud2.onNavigationEvent) {
                return e;
            }
            RequestBuilder.onWarmupCompleted(onExtraCallbackWithResult, this, lud2Var, lud2Var.onExtraCallbackWithResult());
        }
    }
}
