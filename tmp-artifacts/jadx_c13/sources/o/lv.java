package o;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class lv extends GeckoHubImp implements BufferOutputStream {
    private final /* synthetic */ BufferOutputStream IAuthTabCallback;
    private final GeckoHubImp onExtraCallback;
    private final String onNavigationEvent;

    @Override // o.BufferOutputStream
    public setDeployments onWarmupCompleted(long j, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return this.IAuthTabCallback.onWarmupCompleted(j, runnable, coroutineContext);
    }

    @Override // o.BufferOutputStream
    public void onWarmupCompleted(long j, @NotNull maybeRemoveAttachStateListener<? super Unit> mayberemoveattachstatelistener) {
        this.IAuthTabCallback.onWarmupCompleted(j, mayberemoveattachstatelistener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lv(@NotNull GeckoHubImp geckoHubImp, @NotNull String str) {
        BufferOutputStream bufferOutputStream = geckoHubImp instanceof BufferOutputStream ? (BufferOutputStream) geckoHubImp : null;
        this.IAuthTabCallback = bufferOutputStream == null ? releaseGeckoResLoader.onExtraCallback() : bufferOutputStream;
        this.onExtraCallback = geckoHubImp;
        this.onNavigationEvent = str;
    }

    @Override // o.GeckoHubImp
    public boolean onExtraCallbackWithResult(@NotNull CoroutineContext coroutineContext) {
        return this.onExtraCallback.onExtraCallbackWithResult(coroutineContext);
    }

    @Override // o.GeckoHubImp
    public void onWarmupCompleted(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        this.onExtraCallback.onWarmupCompleted(coroutineContext, runnable);
    }

    @Override // o.GeckoHubImp
    public void onExtraCallback(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        this.onExtraCallback.onExtraCallback(coroutineContext, runnable);
    }

    @Override // o.GeckoHubImp
    public String toString() {
        return this.onNavigationEvent;
    }
}
