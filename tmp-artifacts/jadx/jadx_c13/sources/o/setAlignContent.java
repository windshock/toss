package o;

import java.util.Collection;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setAlignContent {
    private static final Collection<CoroutineExceptionHandler> IAuthTabCallback = ensureCausesIsMutable.onRelationshipValidationResult(clearSelinuxLabel.onExtraCallbackWithResult(ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator()));

    public static final Collection<CoroutineExceptionHandler> onWarmupCompleted() {
        return IAuthTabCallback;
    }

    public static final void onWarmupCompleted(@NotNull Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
