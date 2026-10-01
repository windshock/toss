package kotlinx.coroutines.rx2;

import kotlin.coroutines.CoroutineContext;
import o.JsonWriterWriteObject;
import o.RequestCoordinator;
import o.setExecute;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class RxSingleCoroutine<T> extends RequestCoordinator<T> {
    private final JsonWriterWriteObject<T> onExtraCallbackWithResult;

    public RxSingleCoroutine(@NotNull CoroutineContext coroutineContext, @NotNull JsonWriterWriteObject<T> jsonWriterWriteObject) {
        super(coroutineContext, false, true);
        this.onExtraCallbackWithResult = jsonWriterWriteObject;
    }

    @Override // o.RequestCoordinator
    public void onWarmupCompleted(@NotNull T t) {
        try {
            this.onExtraCallbackWithResult.onNavigationEvent((JsonWriterWriteObject<T>) t);
        } catch (Throwable th) {
            RxCancellableKt.onNavigationEvent(th, getContext());
        }
    }

    @Override // o.RequestCoordinator
    public void onExtraCallback(@NotNull Throwable th, boolean z) {
        try {
            if (this.onExtraCallbackWithResult.IAuthTabCallback(th)) {
                return;
            }
        } catch (Throwable th2) {
            setExecute.onNavigationEvent(th, th2);
        }
        RxCancellableKt.onNavigationEvent(th, getContext());
    }
}
