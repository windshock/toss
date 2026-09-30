package o;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface BufferOutputStream {
    setDeployments onWarmupCompleted(long j, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext);

    void onWarmupCompleted(long j, @NotNull maybeRemoveAttachStateListener<? super Unit> mayberemoveattachstatelistener);

    public static final class onNavigationEvent {
        public static setDeployments onWarmupCompleted(@NotNull BufferOutputStream bufferOutputStream, long j, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
            return releaseGeckoResLoader.onExtraCallback().onWarmupCompleted(j, runnable, coroutineContext);
        }
    }
}
