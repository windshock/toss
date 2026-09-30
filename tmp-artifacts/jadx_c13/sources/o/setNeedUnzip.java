package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class setNeedUnzip extends isPatchUpdate {
    private static final /* synthetic */ AtomicIntegerFieldUpdater onExtraCallbackWithResult = AtomicIntegerFieldUpdater.newUpdater(setNeedUnzip.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;
    private setDeployments onExtraCallback;
    private final Thread onNavigationEvent = Thread.currentThread();

    @Override // o.isPatchUpdate
    public boolean onExtraCallback() {
        return true;
    }

    public final void IAuthTabCallback(@NotNull getPackageType getpackagetype) {
        int i;
        this.onExtraCallback = isFullUpdate.onExtraCallback(getpackagetype, false, this, 1, null);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = onExtraCallbackWithResult;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 2 || i == 3) {
                    return;
                }
                onExtraCallbackWithResult(i);
                throw new setWrite();
            }
        } while (!onExtraCallbackWithResult.compareAndSet(this, i, 0));
    }

    public final void onExtraCallbackWithResult() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = onExtraCallbackWithResult;
        while (true) {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        onExtraCallbackWithResult(i);
                        throw new setWrite();
                    }
                }
            } else if (onExtraCallbackWithResult.compareAndSet(this, i, 1)) {
                setDeployments setdeployments = this.onExtraCallback;
                if (setdeployments != null) {
                    setdeployments.dispose();
                    return;
                }
                return;
            }
        }
    }

    @Override // o.isPatchUpdate
    public void onWarmupCompleted(@Nullable Throwable th) {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = onExtraCallbackWithResult;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                onExtraCallbackWithResult(i);
                throw new setWrite();
            }
        } while (!onExtraCallbackWithResult.compareAndSet(this, i, 2));
        this.onNavigationEvent.interrupt();
        onExtraCallbackWithResult.set(this, 3);
    }

    private final Void onExtraCallbackWithResult(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }
}
