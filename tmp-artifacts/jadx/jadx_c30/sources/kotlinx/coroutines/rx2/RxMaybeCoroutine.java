package kotlinx.coroutines.rx2;

import kotlin.coroutines.CoroutineContext;
import o.RequestCoordinator;
import o.flushed;
import o.setRead;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class RxMaybeCoroutine<T> extends RequestCoordinator<T> {
    private final flushed<T> IAuthTabCallback;

    public RxMaybeCoroutine(@NotNull CoroutineContext coroutineContext, @NotNull flushed<T> flushedVar) {
        super(coroutineContext, false, true);
        this.IAuthTabCallback = flushedVar;
    }

    public void onWarmupCompleted(T t) {
        try {
            if (t == null) {
                this.IAuthTabCallback.onExtraCallback();
            } else {
                this.IAuthTabCallback.onExtraCallbackWithResult(t);
            }
        } catch (Throwable th) {
            RxCancellableKt.onNavigationEvent(th, getContext());
        }
    }

    public void onExtraCallback(@NotNull Throwable th, boolean z) {
        try {
            if (this.IAuthTabCallback.onExtraCallback(th)) {
                return;
            }
        } catch (Throwable th2) {
            setRead.onWarmupCompleted(th, th2);
        }
        RxCancellableKt.onNavigationEvent(th, getContext());
    }
}
