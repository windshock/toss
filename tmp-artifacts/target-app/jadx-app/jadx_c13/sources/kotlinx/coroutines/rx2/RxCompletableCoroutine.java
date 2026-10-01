package kotlinx.coroutines.rx2;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import o.JsonReaderEmptyEOFException;
import o.RequestCoordinator;
import o.setExecute;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class RxCompletableCoroutine extends RequestCoordinator<Unit> {
    private final JsonReaderEmptyEOFException IAuthTabCallback;

    public RxCompletableCoroutine(@NotNull CoroutineContext coroutineContext, @NotNull JsonReaderEmptyEOFException jsonReaderEmptyEOFException) {
        super(coroutineContext, false, true);
        this.IAuthTabCallback = jsonReaderEmptyEOFException;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.RequestCoordinator
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public void onWarmupCompleted(@NotNull Unit unit) {
        try {
            this.IAuthTabCallback.onWarmupCompleted();
        } catch (Throwable th) {
            RxCancellableKt.onNavigationEvent(th, getContext());
        }
    }

    @Override // o.RequestCoordinator
    public void onExtraCallback(@NotNull Throwable th, boolean z) {
        try {
            if (this.IAuthTabCallback.onExtraCallbackWithResult(th)) {
                return;
            }
        } catch (Throwable th2) {
            setExecute.onNavigationEvent(th, th2);
        }
        RxCancellableKt.onNavigationEvent(th, getContext());
    }
}
