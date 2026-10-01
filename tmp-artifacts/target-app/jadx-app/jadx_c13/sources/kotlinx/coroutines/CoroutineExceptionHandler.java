package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface CoroutineExceptionHandler extends CoroutineContext.Element {
    public static final onWarmupCompleted extraCallbackWithResult = onWarmupCompleted.onWarmupCompleted;

    void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th);

    public static final class onExtraCallbackWithResult {
        public static <R> R onExtraCallback(@NotNull CoroutineExceptionHandler coroutineExceptionHandler, R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.onNavigationEvent.onExtraCallback(coroutineExceptionHandler, r, function2);
        }

        public static CoroutineContext onExtraCallbackWithResult(@NotNull CoroutineExceptionHandler coroutineExceptionHandler, @NotNull CoroutineContext.onExtraCallback<?> onextracallback) {
            return CoroutineContext.Element.onNavigationEvent.onNavigationEvent(coroutineExceptionHandler, onextracallback);
        }

        public static <E extends CoroutineContext.Element> E onNavigationEvent(@NotNull CoroutineExceptionHandler coroutineExceptionHandler, @NotNull CoroutineContext.onExtraCallback<E> onextracallback) {
            return (E) CoroutineContext.Element.onNavigationEvent.onExtraCallback(coroutineExceptionHandler, onextracallback);
        }

        public static CoroutineContext onNavigationEvent(@NotNull CoroutineExceptionHandler coroutineExceptionHandler, @NotNull CoroutineContext coroutineContext) {
            return CoroutineContext.Element.onNavigationEvent.onExtraCallbackWithResult(coroutineExceptionHandler, coroutineContext);
        }
    }

    public static final class onWarmupCompleted implements CoroutineContext.onExtraCallback<CoroutineExceptionHandler> {
        static final /* synthetic */ onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();

        private onWarmupCompleted() {
        }
    }
}
