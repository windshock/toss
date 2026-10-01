package o;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class setCornerRadius<T> {
    public final CoroutineContext onExtraCallback;
    public final IAnimation<T> onExtraCallbackWithResult;
    public final CloseableUtils onNavigationEvent;
    public final int onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public setCornerRadius(@NotNull IAnimation<? extends T> iAnimation, int i, @NotNull CloseableUtils closeableUtils, @NotNull CoroutineContext coroutineContext) {
        this.onExtraCallbackWithResult = iAnimation;
        this.onWarmupCompleted = i;
        this.onNavigationEvent = closeableUtils;
        this.onExtraCallback = coroutineContext;
    }
}
