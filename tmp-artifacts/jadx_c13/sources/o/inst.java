package o;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class inst {
    public static final void onNavigationEvent(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th) {
        if (th instanceof DefaultLogger) {
            th = ((DefaultLogger) th).getCause();
        }
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) coroutineContext.get(CoroutineExceptionHandler.extraCallbackWithResult);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(coroutineContext, th);
            } else {
                setAlignItems.onWarmupCompleted(coroutineContext, th);
            }
        } catch (Throwable th2) {
            setAlignItems.onWarmupCompleted(coroutineContext, onExtraCallback(th, th2));
        }
    }

    public static final Throwable onExtraCallback(@NotNull Throwable th, @NotNull Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        setExecute.onNavigationEvent(runtimeException, th);
        return runtimeException;
    }
}
