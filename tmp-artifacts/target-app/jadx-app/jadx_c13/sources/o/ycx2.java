package o;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class ycx2 implements access13800<Object> {
    public static final ycx2 onWarmupCompleted = new ycx2();
    private static final CoroutineContext onNavigationEvent = access13600.IAuthTabCallback;

    @Override // o.access13800
    public void resumeWith(@NotNull Object obj) {
    }

    private ycx2() {
    }

    @Override // o.access13800
    public CoroutineContext getContext() {
        return onNavigationEvent;
    }
}
